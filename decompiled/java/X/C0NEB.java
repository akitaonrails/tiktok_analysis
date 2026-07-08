package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NEB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEB {
    public static final C0NEB LIZ = new C0NEB();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();
    public static final ConcurrentHashMap<String, C0NEE> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C0NED> LIZLLL = new ConcurrentHashMap<>();
    public static final int LJ = -10086;
    public static final int LJFF = -10087;
    public static final int LJI = -10088;
    public static final int LJII = -10089;
    public static final C0NEC LJIIIIZZ = new InterfaceC1475300oUi() { // from class: X.0NEC
        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void LLLLZLLIL(String str) {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void Sm() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void Z9() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void ck() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void qc(long j, long j2, String str) {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void t8(String str, long j, long j2, String str2) {
        }

        @Override // X.InterfaceC1475300oUi
        public final void T8(List<SimVideoUrlModel> list) {
            Integer numValueOf;
            C0NED c0ned;
            C0NEB.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDownloadCancelV2, cancelList: ");
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (SimVideoUrlModel simVideoUrlModel : list) {
                    String sourceId = simVideoUrlModel.getSourceId();
                    if (sourceId != null && sourceId.length() != 0) {
                        ConcurrentHashMap<String, C0NED> concurrentHashMap = C0NEB.LIZLLL;
                        if (concurrentHashMap.containsKey(simVideoUrlModel.getSourceId()) && (c0ned = concurrentHashMap.get(simVideoUrlModel.getSourceId())) != null && !c0ned.LJII) {
                            C0NEB c0neb = C0NEB.LIZ;
                            int i = C0NEB.LJI;
                            String sourceId2 = simVideoUrlModel.getSourceId();
                            c0neb.getClass();
                            C0NEB.LIZJ(0, i, sourceId2);
                            c0ned.LJIIIIZZ = true;
                            C0NEE c0nee = C0NEB.LIZJ.get(simVideoUrlModel.getSourceId());
                            if (c0nee != null) {
                                C1483340ohg.LJJIFFI(c0ned.LIZ, Integer.MAX_VALUE, C0NFP.LIZLLL(), C0NEB.LJIIIIZZ, c0nee);
                            }
                            c0ned.LJII = true;
                            c0ned.LIZLLL = i;
                            concurrentHashMap.put(simVideoUrlModel.getSourceId(), c0ned);
                        }
                    }
                    arrayList.add(Unit.LIZ);
                }
            }
        }

        @Override // X.InterfaceC1475300oUi
        public final void Dd(int i, String str, String str2, String str3) {
            C0NEB.LIZ.getClass();
            ConcurrentHashMap<String, C0NED> concurrentHashMap = C0NEB.LIZLLL;
            C0NED c0ned = concurrentHashMap.get(str);
            if (c0ned != null && !c0ned.LJI) {
                c0ned.LJI = true;
                c0ned.LIZLLL = i;
                C0NEB.LIZJ(0, i, str);
                c0ned.LJIIIIZZ = true;
                C0NEE c0nee = C0NEB.LIZJ.get(str);
                if (c0nee != null && Intrinsics.LJFF(c0nee.getKey(), str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mdl getVideo error, aid:");
                    sbLIZ.append(str);
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    c0nee.LIZJ();
                    C1483340ohg.LJJIFFI(c0ned.LIZ, Integer.MAX_VALUE, C0NFP.LIZLLL(), C0NEB.LJIIIIZZ, c0nee);
                }
                concurrentHashMap.put(str, c0ned);
            }
        }

        @Override // X.InterfaceC1475300oUi
        public final void Xi(String str, String str2, long j, long j2) {
            ConcurrentHashMap<String, C0NED> concurrentHashMap;
            C0NED c0ned;
            double d;
            C0NEE c0nee;
            C0NEB c0neb = C0NEB.LIZ;
            synchronized (c0neb) {
                if (j2 > 0 && j >= j2) {
                    if (j == j2) {
                        c0neb.LIZIZ(j, j2, str, str2, null);
                        concurrentHashMap = C0NEB.LIZLLL;
                        c0ned = concurrentHashMap.get(str);
                        if (c0ned != null && !c0ned.LJ) {
                            d = c0ned.LIZJ;
                            double d2 = j2 / j;
                            c0ned.LIZJ = d2;
                            if ((d != 0.0d || d2 - d >= 0.1d) && C0NEB.LIZLLL(str, str2)) {
                                C0NEB.LIZJ(2, 0, str);
                                c0nee = C0NEB.LIZJ.get(str);
                                if (c0nee != null && Intrinsics.LJFF(c0nee.getKey(), str)) {
                                    c0nee.LIZ(str, str2);
                                }
                                c0ned.LJ = true;
                            }
                            concurrentHashMap.put(str, c0ned);
                        }
                        return;
                    }
                    concurrentHashMap = C0NEB.LIZLLL;
                    c0ned = concurrentHashMap.get(str);
                    if (c0ned != null) {
                        d = c0ned.LIZJ;
                        double d22 = j2 / j;
                        c0ned.LIZJ = d22;
                        if (d != 0.0d) {
                        }
                        C0NEB.LIZJ(2, 0, str);
                        c0nee = C0NEB.LIZJ.get(str);
                        if (c0nee != null) {
                            c0nee.LIZ(str, str2);
                        }
                        c0ned.LJ = true;
                        concurrentHashMap.put(str, c0ned);
                    }
                    return;
                }
            }
        }

        @Override // X.InterfaceC1475300oUi
        public final void tf(long j, long j2, String str, String str2) {
            C0NEB.LIZ.LIZIZ(j, j2, str, "", str2);
        }
    };

    public static boolean LIZLLL(String str, String str2) {
        C01GW c01gw = C257660A7w.LIZ;
        if (((Number) c01gw.getValue()).intValue() <= 0) {
            return true;
        }
        int iIntValue = ((Number) c01gw.getValue()).intValue() * 1024;
        if (str != null) {
            try {
                String strLIZJ = C0NFP.LIZJ(str);
                if (!TextUtils.isEmpty(strLIZJ)) {
                    C0VSJ c0vsj = new C0VSJ(strLIZJ);
                    long length = c0vsj.length();
                    if (c0vsj.exists() && length > iIntValue) {
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        if (str2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C0NFP.LIZJ(str2));
            sbLIZ.append(".mdl");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!TextUtils.isEmpty(strLIZIZ)) {
                C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
                long length2 = c0vsj2.length();
                if (c0vsj2.exists()) {
                    if (length2 > iIntValue) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C0NEE r5, com.ss.android.ugc.aweme.feed.model.Aweme r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NEB.LIZ(X.0NEE, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r11, int r12, java.lang.String r13) {
        /*
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = X.C0NEB.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r5 = r13
            java.lang.Object r1 = r0.get(r5)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0NED> r0 = X.C0NEB.LIZLLL
            java.lang.Object r0 = r0.get(r5)
            X.0NED r0 = (X.C0NED) r0
            r3 = 0
            if (r0 == 0) goto L33
            long r1 = r0.LIZIZ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L33
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r1
        L26:
            X.0NDE r0 = X.C0NDE.LIZ
            java.lang.String r6 = ""
            r0.getClass()
            r7 = r12
            r4 = r11
            X.C0NDE.LIZIZ(r4, r5, r6, r7, r8, r10)
            return
        L33:
            r8 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NEB.LIZJ(int, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed A[Catch: all -> 0x00fb, TryCatch #0 {, blocks: (B:5:0x0005, B:9:0x0015, B:11:0x001f, B:13:0x0023, B:18:0x002c, B:19:0x0040, B:21:0x004a, B:24:0x0052, B:26:0x0058, B:28:0x0063, B:30:0x0073, B:33:0x007b, B:36:0x0083, B:38:0x0089, B:40:0x0096, B:42:0x00a0, B:44:0x00b1, B:45:0x00ba, B:46:0x00d0, B:56:0x00f2, B:47:0x00d7, B:53:0x00e9, B:55:0x00ed, B:48:0x00da, B:49:0x00dd, B:50:0x00e0, B:52:0x00e4), top: B:62:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZIZ(long r8, long r10, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NEB.LIZIZ(long, long, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
