package X;

import java.util.List;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;
import webcast.data.SuperFanPackage;

/* JADX INFO: renamed from: X.0KST, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KST {
    public final C0KSK<GetSuperFansTreasureBoxDataResponse.Data> LIZ;
    public final C0KSR LIZIZ = new C0KSR(this);

    public C0KST(C0KSK<GetSuperFansTreasureBoxDataResponse.Data> c0ksk) {
        this.LIZ = c0ksk;
    }

    public static C516120KLy LIZ(C0KST c0kst, long j, List list, Throwable th, int i) {
        int size;
        String str;
        SuperFanPackage superFanPackage;
        Throwable th2 = null;
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) == 0) {
            th2 = th;
        }
        c0kst.getClass();
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        String str2 = c0kst.LIZ.LJFF;
        if (list == null || (superFanPackage = (SuperFanPackage) C13LP.LJJJLL(list)) == null || (str = superFanPackage.currency) == null) {
            str = "";
        }
        return new C516120KLy(j, size, str2, str, false, null, null, th2, 112);
    }
}
