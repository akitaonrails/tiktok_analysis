package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365390EUf {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(387));

    public static boolean LIZ() {
        C01GW c01gw = LIZ;
        int i = ((Keva) c01gw.getValue()).getInt("beauty_composer_ab_group", 0);
        int iLIZ = C290910Baj.LIZ();
        if (i == iLIZ) {
            return false;
        }
        ((Keva) c01gw.getValue()).storeInt("beauty_composer_ab_group", iLIZ);
        return true;
    }

    public static boolean LIZIZ() {
        C01GW c01gw = LIZ;
        String string = ((Keva) c01gw.getValue()).getString("app_language", "");
        String appLanguage = C0CHQ.LIZ().getAppLanguage();
        if (Intrinsics.LJFF(string, appLanguage)) {
            return false;
        }
        ((Keva) c01gw.getValue()).storeString("app_language", appLanguage);
        return true;
    }
}
