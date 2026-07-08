package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.09FC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09FC<T> implements InterfaceC300801Eo {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    public C09FC(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<C443120HZe<String, CloudDraftItemManager.CloudDraftConfig, String>> interfaceC2329309At) throws Throwable {
        C0VSJ c0vsj = new C0VSJ(this.LL);
        StringBuilder sb = new StringBuilder();
        try {
            C0VSP c0vsp = new C0VSP(c0vsj);
            String str = this.LL;
            String str2 = this.LLILLJJLI;
            Throwable th = null;
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(c0vsp);
                while (true) {
                    try {
                        int i = inputStreamReader.read();
                        if (i != -1) {
                            sb.append((char) i);
                        } else {
                            interfaceC2329309At.onSuccess(new C443120HZe<>(str, (CloudDraftItemManager.CloudDraftConfig) C19748512Ol.LIZIZ.LJII(sb.toString(), CloudDraftItemManager.CloudDraftConfig.class), str2));
                            C2107108Nh.LIZ(inputStreamReader, null);
                            C2107108Nh.LIZ(c0vsp, null);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            C2107108Nh.LIZ(inputStreamReader, th);
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                            try {
                                                throw th;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                th = th;
                                                while (true) {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        try {
                                                            C2107108Nh.LIZ(c0vsp, th);
                                                            throw th;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            TryCatchGuardChecker.doCheck(e);
                                                            final String str3 = this.LL;
                                                            final String message = e.getMessage();
                                                            throw new C294201Ca(str3, message) { // from class: X.09FD
                                                                public static final int $stable = 8;

                                                                /* JADX WARN: Illegal instructions before constructor call */
                                                                {
                                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                    sbLIZ.append("File reading exception sourceFilePath=");
                                                                    sbLIZ.append(str3);
                                                                    sbLIZ.append(" desc: ");
                                                                    sbLIZ.append(message);
                                                                    super(C2188811AlT.LIZIZ(sbLIZ));
                                                                }
                                                            };
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            th = null;
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
