package X;

import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1B2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B2Y extends C1B2V {
    public final WebView LIZ;
    public String LIZIZ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public InterfaceC2198421B2i LJI;
    public boolean LIZJ = true;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public final C2198411B2h LJIIIIZZ = new C2198411B2h(this);

    public final void LJII() {
        this.LIZJ = true;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    @Override // X.C1B2O
    public final boolean LIZJ() {
        if (!C1B2V.LIZLLL(this.LIZ, false)) {
            return false;
        }
        this.LIZ.goBackOrForward(-2);
        this.LJFF = null;
        return true;
    }

    @Override // X.C1B2O
    public final boolean canGoBack() {
        return C1B2V.LIZLLL(this.LIZ, true);
    }

    @Override // X.C1B2O
    public final void LIZ(String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleOverrideUrlLoading :");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            LJIIIIZZ(str);
            if (!C1B2T.LIZJ(this.LJFF, str)) {
                if (C1B2T.LIZJ(this.LIZLLL, str)) {
                    i = 1;
                } else if (this.LIZJ) {
                    this.LIZJ = false;
                    i = 2;
                } else {
                    i = 3;
                }
                LJFF(i, str, false);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C1B2O
    public final boolean LIZIZ(String str) {
        int i;
        try {
            LJIIIIZZ(str);
            if (!C1B2T.LIZJ(this.LJFF, str)) {
                if (C1B2T.LIZJ(this.LIZLLL, str)) {
                    i = 1;
                } else if (this.LIZJ) {
                    this.LIZJ = false;
                    i = 2;
                } else {
                    i = 3;
                }
                return LJFF(i, str, true);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public final String LJI(String str) {
        this.LIZLLL = str;
        this.LJFF = str;
        if (C1B2V.LJ(str)) {
            str = C1B2T.LIZIZ(-1, str, this.LIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleLoadUrl : first force check :");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZJ = true;
        return str;
    }

    public final void LJIIIIZZ(String str) {
        if (C1B2T.LIZJ(this.LJFF, str) && C1B2T.LIZJ(this.LIZLLL, str)) {
            C1B2U c1b2u = new C1B2U();
            c1b2u.LIZJ = false;
            c1b2u.LIZIZ = 0;
            ((ConcurrentHashMap) C1B2W.LIZ().LIZ).put(str, new C1B2X(c1b2u));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleLoadUrl save first check in cache :");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C1B2T.LJ(str)) {
            this.LJ = str;
        }
    }

    public C1B2Y(WebView webView, String str) {
        this.LIZ = webView;
        this.LIZIZ = str;
    }

    public final boolean LJFF(final int i, final String str, boolean z) {
        C1B2U c1b2uLIZIZ = C1B2W.LIZ().LIZIZ(str);
        if (c1b2uLIZIZ == null) {
            if (C1B2V.LJ(str)) {
                if (z) {
                    String str2 = this.LIZIZ;
                    C2198341B2a c2198341B2a = new C2198341B2a();
                    c2198341B2a.LIZ = C1B2S.LIZIZ.LIZ;
                    c2198341B2a.LIZJ = str;
                    c2198341B2a.LIZIZ = str2;
                    c2198341B2a.LJFF = i;
                    c2198341B2a.LIZLLL = true;
                    C2198401B2g c2198401B2gLIZ = c2198341B2a.LIZ();
                    C2198391B2f.LIZ().getClass();
                    if (C2198391B2f.LJ == null) {
                        C2198391B2f.LJ = C807400Vlq.LIZ();
                    }
                    try {
                        C1B2U c1b2u = (C1B2U) C2198391B2f.LJ.submit(new CallableC2198361B2c(c2198401B2gLIZ)).get(C1B2S.LIZIZ.LJ, TimeUnit.MILLISECONDS);
                        InterfaceC2198421B2i interfaceC2198421B2i = this.LJI;
                        if (interfaceC2198421B2i != null && c1b2u != null) {
                            c1b2u.LJ = str;
                            interfaceC2198421B2i.LIZ(c1b2u);
                        }
                        if (c1b2u.LIZ && c1b2u.LIZJ) {
                            C786410Ut5.ue(this.LIZ, C1B2T.LIZIZ(c1b2u.LIZIZ, str, this.LIZIZ));
                            this.LJFF = str;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onSuccess url : ");
                            sbLIZ.append(str);
                            sbLIZ.append(", response : ");
                            sbLIZ.append(c1b2u);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return true;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onFail url : ");
                        sbLIZ2.append(str);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return false;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
                C786410Ut5.LJLIIL(100L, this.LJII, new Runnable() { // from class: X.1B2Z
                    public final void LIZ() {
                        String str3 = str;
                        if (str3 != null) {
                            C1B2Y c1b2y = this.LLILLL;
                            if (c1b2y.LIZ != null && str3.equals(c1b2y.LJ)) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("checkUrlSafely : send seclink request :");
                                sbLIZ3.append(str);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                String str4 = str;
                                C1B2Y c1b2y2 = this.LLILLL;
                                String str5 = c1b2y2.LIZIZ;
                                int i2 = i;
                                C2198411B2h c2198411B2h = c1b2y2.LJIIIIZZ;
                                C2198341B2a c2198341B2a2 = new C2198341B2a();
                                c2198341B2a2.LIZ = C1B2S.LIZIZ.LIZ;
                                c2198341B2a2.LIZJ = str4;
                                c2198341B2a2.LIZIZ = str5;
                                c2198341B2a2.LJ = c2198411B2h;
                                c2198341B2a2.LJFF = i2;
                                C2198401B2g c2198401B2gLIZ2 = c2198341B2a2.LIZ();
                                C2198391B2f.LIZ().getClass();
                                String str6 = c2198401B2gLIZ2.LIZJ;
                                if (TextUtils.isEmpty(str6) || C1B2T.LJFF(str6) || C1B2W.LIZ().LIZJ(c2198401B2gLIZ2.LIZJ)) {
                                    return;
                                }
                                if (C2198391B2f.LJ == null) {
                                    C2198391B2f.LJ = C807400Vlq.LIZ();
                                }
                                C2198391B2f.LJ.execute(new RunnableC2198371B2d(c2198401B2gLIZ2));
                                return;
                            }
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("checkUrlSafely url is not same with current task: ");
                        sbLIZ4.append(str);
                        sbLIZ4.append("  urlFromOverride : ");
                        sbLIZ4.append(this.LLILLL.LJ);
                        C2188811AlT.LIZIZ(sbLIZ4);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AsyncSecStrategy@144a.asyncCheck$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AsyncSecStrategy@144a.asyncCheck$1");
                    }
                });
                return false;
            }
        } else {
            InterfaceC2198421B2i interfaceC2198421B2i2 = this.LJI;
            if (interfaceC2198421B2i2 != null) {
                c1b2uLIZIZ.LJ = str;
                interfaceC2198421B2i2.LIZ(c1b2uLIZIZ);
            }
            if (c1b2uLIZIZ.LIZJ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkUrlSafely : jump seclink page directly : ");
                sbLIZ3.append(str);
                C2188811AlT.LIZIZ(sbLIZ3);
                C786410Ut5.ue(this.LIZ, C1B2T.LIZIZ(-1, str, this.LIZIZ));
                return true;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("checkUrlSafely : safe url : ");
            sbLIZ4.append(str);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        return false;
    }
}
