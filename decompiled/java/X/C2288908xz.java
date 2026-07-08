package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.08xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2288908xz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ() {
        String str;
        String str2;
        if (C2291808yS.LIZ()) {
            C2288608xw.LIZ.getClass();
            C2288608xw.LIZLLL();
            return;
        }
        C2288808xy.LIZ.getClass();
        boolean z = true;
        if (C2288808xy.LIZ() && C2288808xy.LIZJ != null && C2288808xy.LIZLLL != null && (str = C2288808xy.LJ) != null && str.length() != 0 && (str2 = C2288808xy.LJFF) != null && str2.length() != 0) {
            z = false;
        }
        if (!z || System.currentTimeMillis() - C2288808xy.LJII <= 1000) {
            C201955140j.LJIILIIL("AIMusicConfigHelper", "initAuthConfigASyncWithCheck noop------");
            return;
        }
        C2288808xy.LJII = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initAuthConfigASync isGetConfigOpt:");
        sbLIZ.append(C2290508yF.LIZ());
        sbLIZ.append(", longSide:");
        sbLIZ.append(C2264908u7.LIZ());
        sbLIZ.append(" ,uploadResOpt:");
        sbLIZ.append(C2290708yH.LIZ());
        sbLIZ.append(" , musicInCapsule:");
        sbLIZ.append(C2296708zF.LIZ());
        sbLIZ.append(",  cache_time:");
        sbLIZ.append(C2290608yG.LIZ());
        C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (C2290508yF.LIZ()) {
            if (!C297690Blf.LIZ() || C0CHQ.LIZ().getAccountService().isLogin()) {
                AnonymousClass0956 anonymousClass0956 = C2288808xy.LJIIJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C2288808xy.LJIIJ = C23250099c.LIZLLL(C2288808xy.LJIIIZ, null, null, new C2272808vO(null), 3);
            }
        }
    }

    public static String LIZ(C2290408yE c2290408yE) {
        if (C2291808yS.LIZ()) {
            if (c2290408yE == null) {
                return null;
            }
            return c2290408yE.LIZ;
        }
        C2288808xy.LIZ.getClass();
        if (!C2290708yH.LIZ()) {
            return null;
        }
        return C2288808xy.LJ;
    }

    public static void LIZJ(Boolean bool) {
        if (C2291808yS.LIZ()) {
            if (!((Boolean) C2291108yL.LIZ.getValue()).booleanValue()) {
                C2288608xw.LIZ.getClass();
                C2288608xw.LJFF(bool);
                return;
            }
            return;
        }
        C2288808xy.LIZ.getClass();
        C2288808xy.LIZIZ = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetAuthKey isFail:");
        sbLIZ.append(bool);
        C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL(C2289308y3 c2289308y3) {
        WeakReference<InterfaceC2273608vW> weakReference = null;
        if (C2291808yS.LIZ()) {
            C2288608xw.LIZ.getClass();
            if (c2289308y3 != null) {
                weakReference = new WeakReference<>(c2289308y3);
            }
            C2288608xw.LJIIJ = weakReference;
            return;
        }
        C2288808xy.LIZ.getClass();
        if (c2289308y3 != null) {
            weakReference = new WeakReference<>(c2289308y3);
        }
        C2288808xy.LJIIJJI = weakReference;
    }
}
