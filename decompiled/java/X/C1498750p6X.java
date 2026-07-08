package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498750p6X {
    public final Set<Integer> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final Set<Integer> LIZLLL;
    public final List<Long> LJ;
    public final List<Long> LJFF;
    public final Set<Integer> LJI;
    public int LJII;
    public final List<String> LJIIIIZZ;
    public final Set<Integer> LJIIIZ;
    public int LJIIJ;
    public final List<InterfaceC1498780p6a> LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;

    public C1498750p6X(DownloadInfo downloadInfo) throws Throwable {
        StringBuilder sbLIZ;
        HashSet hashSet = new HashSet();
        this.LIZ = hashSet;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        HashSet hashSet2 = new HashSet();
        this.LIZLLL = hashSet2;
        ArrayList arrayList = new ArrayList();
        this.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJFF = arrayList2;
        HashSet hashSet3 = new HashSet();
        this.LJI = hashSet3;
        this.LJII = 0;
        ArrayList arrayList3 = new ArrayList();
        this.LJIIIIZZ = arrayList3;
        HashSet hashSet4 = new HashSet();
        this.LJIIIZ = hashSet4;
        this.LJIIJ = 0;
        this.LJIIJJI = new ArrayList();
        this.LJIIL = 0;
        try {
            LIZIZ(downloadInfo);
            if (C1490830otl.LIZ()) {
                int i = this.LJIIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Init ttnetIsolationCount:");
                sbLIZ2.append(this.LIZIZ);
                sbLIZ2.append(" mIsolationErrorCodeSet:");
                sbLIZ2.append(hashSet.toString());
                sbLIZ2.append(" mIsolationHttpProtoType:");
                sbLIZ2.append(this.LIZJ);
                sbLIZ2.append(" ttnetTimeoutErrorCodes:");
                sbLIZ2.append(hashSet2.toString());
                sbLIZ2.append(" ttnetConnectTimeout:");
                sbLIZ2.append(arrayList.toString());
                sbLIZ2.append(" ttnetIoTimeout:");
                sbLIZ2.append(arrayList2.toString());
                sbLIZ2.append(" ipChangeCountLimit:");
                sbLIZ2.append(this.LJII);
                sbLIZ2.append(" ipChangeErrorCodeSet:");
                sbLIZ2.append(hashSet3);
                sbLIZ2.append(" host:");
                sbLIZ2.append(this.LJIILIIL);
                sbLIZ2.append(" backHostList:");
                sbLIZ2.append(arrayList3.toString());
                sbLIZ2.append(" backHostCountLimit:");
                sbLIZ2.append(this.LJIIJ);
                sbLIZ2.append(" backHostErrorCodeSet:");
                sbLIZ2.append(hashSet4);
                C1490830otl.LIZLLL(i, "NetworkFailoverStrategy", "NetworkFailoverStrategy", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                int i2 = this.LJIIL;
                try {
                    sbLIZ = C2188811AlT.LIZ();
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    sbLIZ.append("Init Error");
                    sbLIZ.append(th.toString());
                    C1490830otl.LJ(i2, "NetworkFailoverStrategy", "NetworkFailoverStrategy", C2188811AlT.LIZIZ(sbLIZ));
                    if (C1490830otl.LIZ()) {
                        int i3 = this.LJIIL;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Init ttnetIsolationCount:");
                        sbLIZ3.append(this.LIZIZ);
                        sbLIZ3.append(" mIsolationErrorCodeSet:");
                        sbLIZ3.append(this.LIZ.toString());
                        sbLIZ3.append(" mIsolationHttpProtoType:");
                        sbLIZ3.append(this.LIZJ);
                        sbLIZ3.append(" ttnetTimeoutErrorCodes:");
                        sbLIZ3.append(this.LIZLLL.toString());
                        sbLIZ3.append(" ttnetConnectTimeout:");
                        sbLIZ3.append(this.LJ.toString());
                        sbLIZ3.append(" ttnetIoTimeout:");
                        sbLIZ3.append(this.LJFF.toString());
                        sbLIZ3.append(" ipChangeCountLimit:");
                        sbLIZ3.append(this.LJII);
                        sbLIZ3.append(" ipChangeErrorCodeSet:");
                        sbLIZ3.append(this.LJI);
                        sbLIZ3.append(" host:");
                        sbLIZ3.append(this.LJIILIIL);
                        sbLIZ3.append(" backHostList:");
                        sbLIZ3.append(this.LJIIIIZZ.toString());
                        sbLIZ3.append(" backHostCountLimit:");
                        sbLIZ3.append(this.LJIIJ);
                        sbLIZ3.append(" backHostErrorCodeSet:");
                        sbLIZ3.append(this.LJIIIZ);
                        C1490830otl.LIZLLL(i3, "NetworkFailoverStrategy", "NetworkFailoverStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    TryCatchGuardChecker.doCheck(th);
                    if (C1490830otl.LIZ()) {
                        int i4 = this.LJIIL;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Init ttnetIsolationCount:");
                        sbLIZ4.append(this.LIZIZ);
                        sbLIZ4.append(" mIsolationErrorCodeSet:");
                        sbLIZ4.append(this.LIZ.toString());
                        sbLIZ4.append(" mIsolationHttpProtoType:");
                        sbLIZ4.append(this.LIZJ);
                        sbLIZ4.append(" ttnetTimeoutErrorCodes:");
                        sbLIZ4.append(this.LIZLLL.toString());
                        sbLIZ4.append(" ttnetConnectTimeout:");
                        sbLIZ4.append(this.LJ.toString());
                        sbLIZ4.append(" ttnetIoTimeout:");
                        sbLIZ4.append(this.LJFF.toString());
                        sbLIZ4.append(" ipChangeCountLimit:");
                        sbLIZ4.append(this.LJII);
                        sbLIZ4.append(" ipChangeErrorCodeSet:");
                        sbLIZ4.append(this.LJI);
                        sbLIZ4.append(" host:");
                        sbLIZ4.append(this.LJIILIIL);
                        sbLIZ4.append(" backHostList:");
                        sbLIZ4.append(this.LJIIIIZZ.toString());
                        sbLIZ4.append(" backHostCountLimit:");
                        sbLIZ4.append(this.LJIIJ);
                        sbLIZ4.append(" backHostErrorCodeSet:");
                        sbLIZ4.append(this.LJIIIZ);
                        C1490830otl.LIZLLL(i4, "NetworkFailoverStrategy", "NetworkFailoverStrategy", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        this.LJIIJJI.add(new InterfaceC1498780p6a() { // from class: X.0p6W
            public final boolean LIZ;
            public int LIZIZ = -1;

            @Override // X.InterfaceC1498780p6a
            public final boolean LIZIZ() {
                return false;
            }

            {
                if (!this.LIZJ.LIZLLL.isEmpty()) {
                    if (!this.LIZJ.LJFF.isEmpty() || !this.LIZJ.LJ.isEmpty()) {
                        this.LIZ = true;
                    }
                }
            }

            @Override // X.InterfaceC1498780p6a
            public final void LIZ(List<HttpHeader> list) {
                int size;
                int size2;
                if (this.LIZ && this.LIZIZ >= 0) {
                    if (!((ArrayList) this.LIZJ.LJ).isEmpty()) {
                        if (this.LIZIZ < ((ArrayList) this.LIZJ.LJ).size()) {
                            size2 = this.LIZIZ;
                        } else {
                            size2 = ((ArrayList) this.LIZJ.LJ).size() - 1;
                        }
                        String strValueOf = String.valueOf(ListProtector.get(this.LIZJ.LJ, size2));
                        if (C1490830otl.LIZ()) {
                            int i5 = this.LIZJ.LJIIL;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("Add ConnectTimeout:");
                            sbLIZ5.append(strValueOf);
                            C1490830otl.LIZLLL(i5, "NetworkFailoverStrategy", "handleTimeoutHeader", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                        ((ArrayList) list).add(new HttpHeader("extra_ttnet_connect_timeout", strValueOf));
                    }
                    if (!((ArrayList) this.LIZJ.LJFF).isEmpty()) {
                        if (this.LIZIZ < ((ArrayList) this.LIZJ.LJFF).size()) {
                            size = this.LIZIZ;
                        } else {
                            size = ((ArrayList) this.LIZJ.LJFF).size() - 1;
                        }
                        String strValueOf2 = String.valueOf(ListProtector.get(this.LIZJ.LJFF, size));
                        if (C1490830otl.LIZ()) {
                            int i6 = this.LIZJ.LJIIL;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("Add IoTimeout:");
                            sbLIZ6.append(strValueOf2);
                            C1490830otl.LIZLLL(i6, "NetworkFailoverStrategy", "handleTimeoutHeader", C2188811AlT.LIZIZ(sbLIZ6));
                        }
                        ((ArrayList) list).add(new HttpHeader("extra_ttnet_io_timeout", strValueOf2));
                    }
                }
            }

            @Override // X.InterfaceC1498780p6a
            public final boolean LIZJ(BaseException baseException) {
                if (this.LIZ) {
                    boolean zContains = ((HashSet) this.LIZJ.LIZLLL).contains(Integer.valueOf(baseException.getErrorCode()));
                    if (zContains) {
                        this.LIZIZ++;
                        return true;
                    }
                    if (C1490830otl.LIZ()) {
                        int i5 = this.LIZJ.LJIIL;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("IsMatch:");
                        sbLIZ5.append(zContains);
                        sbLIZ5.append(" ttnetTimeoutIndex:");
                        sbLIZ5.append(this.LIZIZ);
                        sbLIZ5.append(" errorCode:");
                        sbLIZ5.append(baseException.getErrorCode());
                        C1490830otl.LIZLLL(i5, "NetworkFailoverStrategy", "handleTimeoutError", C2188811AlT.LIZIZ(sbLIZ5));
                        return false;
                    }
                    return false;
                }
                return false;
            }
        });
        this.LJIIJJI.add(new C1498730p6V(this));
        this.LJIIJJI.add(new C1498730p6V() { // from class: X.0p6Z
            public final boolean LJFF;
            public boolean LJI;
            public int LJII;

            {
                super(this.LJIIIIZZ);
                this.LJII = -1;
                if (this.LJIIIIZZ.LIZIZ > 0 && !this.LJIIIIZZ.LIZ.isEmpty()) {
                    this.LJFF = true;
                }
            }

            @Override // X.C1498730p6V, X.InterfaceC1498780p6a
            public final void LIZ(List<HttpHeader> list) {
                int i5;
                if (this.LJFF && this.LJI && (i5 = this.LJII) >= 0 && i5 < this.LJIIIIZZ.LIZIZ) {
                    this.LJI = false;
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LIZLLL(this.LJIIIIZZ.LJIIL, "NetworkFailoverStrategy", "handleIsolationHeader", "Add handleIsolationHeader: https://dl");
                    }
                    ArrayList arrayList4 = (ArrayList) list;
                    arrayList4.add(new HttpHeader("x-ttnet-isolation-info", "https://dl"));
                    if (this.LJIIIIZZ.LIZJ > 0) {
                        if (C1490830otl.LIZ()) {
                            int i6 = this.LJIIIIZZ.LJIIL;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("Add x-ttnet-http-proto-type: ");
                            sbLIZ5.append(this.LJIIIIZZ.LIZJ);
                            C1490830otl.LIZLLL(i6, "NetworkFailoverStrategy", "handleIsolationHeader", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                        arrayList4.add(new HttpHeader("x-ttnet-http-proto-type", String.valueOf(this.LJIIIIZZ.LIZJ)));
                    }
                    super.LIZ(list);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
            @Override // X.C1498730p6V, X.InterfaceC1498780p6a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZJ(com.ss.android.socialbase.downloader.exception.BaseException r9) {
                /*
                    r8 = this;
                    boolean r0 = r8.LJFF
                    if (r0 == 0) goto L66
                    int r2 = r8.LJII
                    X.0p6X r1 = r8.LJIIIIZZ
                    int r0 = r1.LIZIZ
                    if (r2 >= r0) goto L66
                    java.util.Set<java.lang.Integer> r1 = r1.LIZ
                    int r0 = r9.getErrorCode()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.util.HashSet r1 = (java.util.HashSet) r1
                    boolean r7 = r1.contains(r0)
                    java.lang.String r5 = " errorCode:"
                    java.lang.String r6 = " ttnetIsolationIndex:"
                    java.lang.String r4 = "handleIsolationError"
                    java.lang.String r3 = "NetworkFailoverStrategy"
                    if (r7 == 0) goto L71
                    int r0 = r8.LJII
                    r2 = 1
                    int r1 = r0 + 1
                    r8.LJII = r1
                    X.0p6X r0 = r8.LJIIIIZZ
                    int r0 = r0.LIZIZ
                    if (r1 != r0) goto L67
                    boolean r0 = X.C1490830otl.LIZ()
                    if (r0 == 0) goto L66
                    X.0p6X r0 = r8.LJIIIIZZ
                    int r2 = r0.LJIIL
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "IsolationCount"
                    r1.append(r0)
                    X.0p6X r0 = r8.LJIIIIZZ
                    int r0 = r0.LIZIZ
                    r1.append(r0)
                    r1.append(r6)
                    int r0 = r8.LJII
                    r1.append(r0)
                    r1.append(r5)
                    int r0 = r9.getErrorCode()
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C1490830otl.LIZLLL(r2, r3, r4, r0)
                L66:
                    r2 = 0
                L67:
                    r8.LJI = r2
                    if (r2 == 0) goto L6e
                    super.LIZJ(r9)
                L6e:
                    boolean r0 = r8.LJI
                    return r0
                L71:
                    boolean r0 = X.C1490830otl.LIZ()
                    if (r0 == 0) goto L66
                    X.0p6X r0 = r8.LJIIIIZZ
                    int r2 = r0.LJIIL
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "IsMatch"
                    r1.append(r0)
                    r1.append(r7)
                    r1.append(r6)
                    int r0 = r8.LJII
                    r1.append(r0)
                    r1.append(r5)
                    int r0 = r9.getErrorCode()
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C1490830otl.LIZLLL(r2, r3, r4, r0)
                    goto L66
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1498770p6Z.LIZJ(com.ss.android.socialbase.downloader.exception.BaseException):boolean");
            }
        });
        this.LJIIJJI.add(new InterfaceC1498780p6a() { // from class: X.0p6Y
            public final boolean LIZ;
            public boolean LIZIZ;
            public int LIZJ = -1;

            @Override // X.InterfaceC1498780p6a
            public final boolean LIZIZ() {
                return true;
            }

            {
                if (this.LIZLLL.LJIIJ > 0 && !this.LIZLLL.LJIIIIZZ.isEmpty()) {
                    this.LIZ = true;
                }
            }

            @Override // X.InterfaceC1498780p6a
            public final void LIZ(List<HttpHeader> list) {
                int i5;
                if (this.LIZ && this.LIZIZ && (i5 = this.LIZJ) >= 0) {
                    C1498750p6X c1498750p6X = this.LIZLLL;
                    if (i5 < c1498750p6X.LJIIJ) {
                        this.LIZIZ = false;
                        List<String> list2 = c1498750p6X.LJIIIIZZ;
                        String str = (String) ListProtector.get(list2, i5 % ((ArrayList) list2).size());
                        if (C1490830otl.LIZ()) {
                            int i6 = this.LIZLLL.LJIIL;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("Add BackHost Header: ");
                            sbLIZ5.append(str);
                            C1490830otl.LIZLLL(i6, "NetworkFailoverStrategy", "handleBackHostHeader", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                        ((ArrayList) list).add(new HttpHeader("extra_ttnet_back_host", str));
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
            @Override // X.InterfaceC1498780p6a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZJ(com.ss.android.socialbase.downloader.exception.BaseException r9) {
                /*
                    r8 = this;
                    boolean r0 = r8.LIZ
                    r5 = 0
                    if (r0 == 0) goto L75
                    int r2 = r8.LIZJ
                    X.0p6X r1 = r8.LIZLLL
                    int r0 = r1.LJIIJ
                    if (r2 >= r0) goto L75
                    java.util.Set<java.lang.Integer> r0 = r1.LJIIIZ
                    java.util.HashSet r0 = (java.util.HashSet) r0
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto Lae
                    X.0p6X r0 = r8.LIZLLL
                    java.util.Set<java.lang.Integer> r1 = r0.LJIIIZ
                    int r0 = r9.getErrorCode()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.util.HashSet r1 = (java.util.HashSet) r1
                    boolean r0 = r1.contains(r0)
                    if (r0 != 0) goto Lae
                    r7 = 0
                L2c:
                    java.lang.String r6 = " errorCode:"
                    java.lang.String r4 = "handleBackHostError"
                    java.lang.String r3 = "NetworkFailoverStrategy"
                    if (r7 == 0) goto L7a
                    int r0 = r8.LIZJ
                    int r1 = r0 + 1
                    r8.LIZJ = r1
                    X.0p6X r0 = r8.LIZLLL
                    int r0 = r0.LJIIJ
                    if (r1 != r0) goto L78
                    boolean r0 = X.C1490830otl.LIZ()
                    if (r0 == 0) goto L75
                    X.0p6X r0 = r8.LIZLLL
                    int r2 = r0.LJIIL
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "BackHostCountLimit"
                    r1.append(r0)
                    X.0p6X r0 = r8.LIZLLL
                    int r0 = r0.LJIIJ
                    r1.append(r0)
                    java.lang.String r0 = " currentBackHostCount:"
                    r1.append(r0)
                    int r0 = r8.LIZJ
                    r1.append(r0)
                    r1.append(r6)
                    int r0 = r9.getErrorCode()
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C1490830otl.LIZLLL(r2, r3, r4, r0)
                L75:
                    r8.LIZIZ = r5
                    return r5
                L78:
                    r5 = 1
                    goto L75
                L7a:
                    boolean r0 = X.C1490830otl.LIZ()
                    if (r0 == 0) goto L75
                    X.0p6X r0 = r8.LIZLLL
                    int r2 = r0.LJIIL
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "IsMatch"
                    r1.append(r0)
                    r1.append(r7)
                    java.lang.String r0 = " BackHostCountLimit:"
                    r1.append(r0)
                    X.0p6X r0 = r8.LIZLLL
                    int r0 = r0.LJIIJ
                    r1.append(r0)
                    r1.append(r6)
                    int r0 = r9.getErrorCode()
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C1490830otl.LIZLLL(r2, r3, r4, r0)
                    goto L75
                Lae:
                    r7 = 1
                    goto L2c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1498760p6Y.LIZJ(com.ss.android.socialbase.downloader.exception.BaseException):boolean");
            }
        });
        this.LJIIJJI.add(new InterfaceC1498780p6a() { // from class: X.0p6W
            public final boolean LIZ;
            public int LIZIZ = -1;

            @Override // X.InterfaceC1498780p6a
            public final boolean LIZIZ() {
                return false;
            }

            {
                if (!this.LIZJ.LIZLLL.isEmpty()) {
                    if (!this.LIZJ.LJFF.isEmpty() || !this.LIZJ.LJ.isEmpty()) {
                        this.LIZ = true;
                    }
                }
            }

            @Override // X.InterfaceC1498780p6a
            public final void LIZ(List<HttpHeader> list) {
                int size;
                int size2;
                if (this.LIZ && this.LIZIZ >= 0) {
                    if (!((ArrayList) this.LIZJ.LJ).isEmpty()) {
                        if (this.LIZIZ < ((ArrayList) this.LIZJ.LJ).size()) {
                            size2 = this.LIZIZ;
                        } else {
                            size2 = ((ArrayList) this.LIZJ.LJ).size() - 1;
                        }
                        String strValueOf = String.valueOf(ListProtector.get(this.LIZJ.LJ, size2));
                        if (C1490830otl.LIZ()) {
                            int i5 = this.LIZJ.LJIIL;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("Add ConnectTimeout:");
                            sbLIZ5.append(strValueOf);
                            C1490830otl.LIZLLL(i5, "NetworkFailoverStrategy", "handleTimeoutHeader", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                        ((ArrayList) list).add(new HttpHeader("extra_ttnet_connect_timeout", strValueOf));
                    }
                    if (!((ArrayList) this.LIZJ.LJFF).isEmpty()) {
                        if (this.LIZIZ < ((ArrayList) this.LIZJ.LJFF).size()) {
                            size = this.LIZIZ;
                        } else {
                            size = ((ArrayList) this.LIZJ.LJFF).size() - 1;
                        }
                        String strValueOf2 = String.valueOf(ListProtector.get(this.LIZJ.LJFF, size));
                        if (C1490830otl.LIZ()) {
                            int i6 = this.LIZJ.LJIIL;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("Add IoTimeout:");
                            sbLIZ6.append(strValueOf2);
                            C1490830otl.LIZLLL(i6, "NetworkFailoverStrategy", "handleTimeoutHeader", C2188811AlT.LIZIZ(sbLIZ6));
                        }
                        ((ArrayList) list).add(new HttpHeader("extra_ttnet_io_timeout", strValueOf2));
                    }
                }
            }

            @Override // X.InterfaceC1498780p6a
            public final boolean LIZJ(BaseException baseException) {
                if (this.LIZ) {
                    boolean zContains = ((HashSet) this.LIZJ.LIZLLL).contains(Integer.valueOf(baseException.getErrorCode()));
                    if (zContains) {
                        this.LIZIZ++;
                        return true;
                    }
                    if (C1490830otl.LIZ()) {
                        int i5 = this.LIZJ.LJIIL;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("IsMatch:");
                        sbLIZ5.append(zContains);
                        sbLIZ5.append(" ttnetTimeoutIndex:");
                        sbLIZ5.append(this.LIZIZ);
                        sbLIZ5.append(" errorCode:");
                        sbLIZ5.append(baseException.getErrorCode());
                        C1490830otl.LIZLLL(i5, "NetworkFailoverStrategy", "handleTimeoutError", C2188811AlT.LIZIZ(sbLIZ5));
                        return false;
                    }
                    return false;
                }
                return false;
            }
        });
    }

    public final void LIZ(BaseException baseException) {
        for (InterfaceC1498780p6a interfaceC1498780p6a : (ArrayList) this.LJIIJJI) {
            boolean zLIZJ = interfaceC1498780p6a.LIZJ(baseException);
            if (interfaceC1498780p6a.LIZIZ() && zLIZJ) {
                return;
            }
        }
    }

    public final void LIZIZ(DownloadInfo downloadInfo) {
        JSONObject jSONObjectLJIIIZ;
        String[] strArrSplit;
        if (downloadInfo != null) {
            this.LJIIL = downloadInfo.getId();
            this.LJIILIIL = new URL(downloadInfo.getUrl()).getHost();
            jSONObjectLJIIIZ = C2199751B7l.LJFF(this.LJIIL, null).LJIIIZ("network_failover_strategy");
        } else {
            jSONObjectLJIIIZ = C2199751B7l.LJFF.LJIIIZ("network_failover_strategy");
        }
        if (jSONObjectLJIIIZ == null) {
            return;
        }
        int iOptInt = jSONObjectLJIIIZ.optInt("ttnet_back_host_count_limit");
        if (iOptInt > 0) {
            this.LJIIJ = iOptInt;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectLJIIIZ.optJSONArray("ttnet_back_host");
        if (!TextUtils.isEmpty(this.LJIILIIL) && jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            int i = 0;
            while (true) {
                if (i >= jSONArrayOptJSONArray.length()) {
                    break;
                }
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString) && (strArrSplit = strOptString.split(":")) != null && strArrSplit.length == 2 && this.LJIILIIL.equals(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
                    String[] strArrSplit2 = strArrSplit[1].split(",");
                    if (strArrSplit2 != null && strArrSplit2.length > 0) {
                        for (String str : strArrSplit2) {
                            if (!TextUtils.isEmpty(str)) {
                                this.LJIIIIZZ.add(str);
                            }
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectLJIIIZ.optJSONArray("ttnet_back_host_error_code");
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                int iOptInt2 = jSONArrayOptJSONArray2.optInt(i2);
                if (iOptInt2 > 0) {
                    this.LJIIIZ.add(Integer.valueOf(iOptInt2));
                }
            }
        }
        int iOptInt3 = jSONObjectLJIIIZ.optInt("ttnet_isolation_count");
        if (iOptInt3 > 0) {
            this.LIZIZ = iOptInt3;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObjectLJIIIZ.optJSONArray("ttnet_isolation_error_code");
        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                int iOptInt4 = jSONArrayOptJSONArray3.optInt(i3);
                if (iOptInt4 > 0) {
                    this.LIZ.add(Integer.valueOf(iOptInt4));
                }
            }
        }
        int iOptInt5 = jSONObjectLJIIIZ.optInt("ttnet_isolation_http_proto_type");
        if (1 == iOptInt5 || 2 == iOptInt5) {
            this.LIZJ = iOptInt5;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObjectLJIIIZ.optJSONArray("ttnet_timeout_error_code");
        if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                int iOptInt6 = jSONArrayOptJSONArray4.optInt(i4);
                if (iOptInt6 > 0) {
                    this.LIZLLL.add(Integer.valueOf(iOptInt6));
                }
            }
        }
        JSONArray jSONArrayOptJSONArray5 = jSONObjectLJIIIZ.optJSONArray("ttnet_timeout_connect");
        if (jSONArrayOptJSONArray5 != null && jSONArrayOptJSONArray5.length() > 0) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray5.length(); i5++) {
                long jOptLong = jSONArrayOptJSONArray5.optLong(i5);
                if (jOptLong > 0) {
                    this.LJ.add(Long.valueOf(jOptLong));
                }
            }
        }
        JSONArray jSONArrayOptJSONArray6 = jSONObjectLJIIIZ.optJSONArray("ttnet_timeout_io");
        if (jSONArrayOptJSONArray6 != null && jSONArrayOptJSONArray6.length() > 0) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray6.length(); i6++) {
                long jOptLong2 = jSONArrayOptJSONArray6.optLong(i6);
                if (jOptLong2 > 0) {
                    this.LJFF.add(Long.valueOf(jOptLong2));
                }
            }
        }
        JSONArray jSONArrayOptJSONArray7 = jSONObjectLJIIIZ.optJSONArray("ttnet_ip_change_error_code");
        if (jSONArrayOptJSONArray7 != null && jSONArrayOptJSONArray7.length() > 0) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray7.length(); i7++) {
                int iOptInt7 = jSONArrayOptJSONArray7.optInt(i7);
                if (iOptInt7 > 0) {
                    this.LJI.add(Integer.valueOf(iOptInt7));
                }
            }
        }
        int iOptInt8 = jSONObjectLJIIIZ.optInt("ttnet_ip_change_count_limit");
        if (iOptInt8 > 0) {
            this.LJII = iOptInt8;
        }
    }
}
