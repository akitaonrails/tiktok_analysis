package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ypp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886310Ypp implements InterfaceC889950Yvh {
    public static volatile boolean LIZJ;
    public static AnonymousClass0956 LIZLLL;
    public static final C886310Ypp LIZ = new C886310Ypp();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C886350Ypt());
    public static volatile C2252321DDq LJ = C1BNE.LIZ(null);

    public static Keva LJ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0 || Intrinsics.LJFF(curUserId, CardStruct.IStatusCode.DEFAULT)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dm_unread_count_");
        sbLIZ.append(curUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC889950Yvh
    public final void LIZLLL() {
        Pair pair;
        Object first;
        if (((Number) C0ALA.LIZ.getValue()).intValue() <= 0 || C1336205Ku.LIZJ().LIZJ()) {
            return;
        }
        Pair pair2 = (Pair) LJ.getValue();
        if (pair2 == null || (first = pair2.getFirst()) == null) {
            C886330Ypr c886330YprLJI = LJI();
            if (c886330YprLJI == null) {
                return;
            } else {
                pair = new Pair(c886330YprLJI, Boolean.TRUE);
            }
        } else {
            pair = new Pair(first, pair2.getSecond());
        }
        C886330Ypr c886330Ypr = (C886330Ypr) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reinjectCachedUnreadToNotice, info=");
        sbLIZ.append(c886330Ypr);
        sbLIZ.append(", isFromCache=");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        LJFF(this, c886330Ypr, false, zBooleanValue, 2);
    }

    public static C886330Ypr LJI() {
        Keva kevaLJ;
        String string;
        if ((((C287760BPq.LIZ() & 16) == 0 && (C287760BPq.LIZ() & 2) == 0) ? false : true) && !C1336205Ku.LIZJ().LIZJ() && (kevaLJ = LJ()) != null && (string = kevaLJ.getString("dm_unread_info", null)) != null && string.length() > 0) {
            try {
                C886330Ypr c886330Ypr = (C886330Ypr) C09EF.LIZ.LJII(string, C886330Ypr.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryLoadCache: info=");
                sbLIZ.append(c886330Ypr);
                C2188811AlT.LIZIZ(sbLIZ);
                return c886330Ypr;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tryLoadCache: failed to convert from json, cacheStr=");
                sbLIZ2.append(string);
                sbLIZ2.append(", e=");
                sbLIZ2.append(e);
                C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("DMInboxUnreadHelper tryLoadCache: failed to convert from json, cacheStr=");
                sbLIZ3.append(string);
                sbLIZ3.append(", e=");
                sbLIZ3.append(e);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return null;
    }

    @Override // X.InterfaceC889950Yvh
    public final void LIZIZ() {
        if ((C287760BPq.LIZ() & 2) == 0 || LIZJ) {
            return;
        }
        LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C886320Ypq(null), 3);
    }

    @Override // X.InterfaceC889950Yvh
    public final C886330Ypr LIZJ() {
        return LJI();
    }

    @Override // X.InterfaceC889950Yvh
    public final C2252321DDq LIZ() {
        return LJ;
    }

    public static void LJFF(C886310Ypp c886310Ypp, C886330Ypr c886330Ypr, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c886310Ypp.getClass();
        if (!C1336205Ku.LIZJ().LIZJ()) {
            C1903780zdo.LJII().LJIILJJIL(99, c886330Ypr.LIZ);
            C1903780zdo.LJII().LJIIIZ(C1904270zeb.LJIIIIZZ, c886330Ypr.LIZIZ);
            if (c886330Ypr.LJI) {
                C1903780zdo.LJII().LJIILJJIL(101, c886330Ypr.LJII);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("postUnreadCount, info=");
            sbLIZ.append(c886330Ypr);
            sbLIZ.append(", isDataReady=");
            sbLIZ.append(z);
            sbLIZ.append(", isFromCache=");
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
            C885830Yp3 c885830Yp3 = C885830Yp3.LL;
            int i2 = c886330Ypr.LIZ;
            if (c886330Ypr.LJII > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z && !z2) {
                z4 = false;
            } else {
                z4 = true;
            }
            synchronized (c885830Yp3) {
                if (i2 > 0 || z3 || z4) {
                    z5 = true;
                }
                C885830Yp3.LLJJIII = i2;
                C885830Yp3.LJ(c885830Yp3, "post_dm_unread", new C1502305uP(z5, i2, z3), 2);
                if (z5) {
                    C885830Yp3.LJ(c885830Yp3, "post_valid_dm_unread", new C886060YpQ(i2, z3), 2);
                }
            }
            LJ.setValue(new Pair(c886330Ypr, Boolean.valueOf(z2)));
        }
    }
}
