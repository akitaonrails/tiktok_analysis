package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596330rdv {
    public static final C1596330rdv LIZ = new C1596330rdv();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(512));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(513));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(511));

    public static void LIZ(int i) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String strValueOf = String.valueOf(i);
        C01GW c01gw = LIZIZ;
        if (Intrinsics.LJFF(strValueOf, ((Keva) c01gw.getValue()).getString(curUserId, ""))) {
            return;
        }
        ((Keva) c01gw.getValue()).storeString(curUserId, String.valueOf(i));
        ((Keva) LIZJ.getValue()).storeLong(curUserId, System.currentTimeMillis());
    }
}
