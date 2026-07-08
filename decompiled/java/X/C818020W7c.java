package X;

import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818020W7c {
    public static final String LIZ;
    public static final C01GW LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append("/aweme/v2/feed/");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(178));
    }

    public static String LIZ() {
        C590420NDs.LIZ.getClass();
        if (Intrinsics.LJFF(C590420NDs.LJI().getString("key_cookie_feed_url", ""), LIZIZ())) {
            return C590420NDs.LJI().getString("key_cookie_feed", "");
        }
        return null;
    }

    public static String LIZIZ() {
        return (String) LIZIZ.getValue();
    }

    public static void LIZJ(String str, String str2) {
        C590420NDs.LIZ.getClass();
        C590420NDs.LJI().storeString("key_cookie_feed_url", str);
        C590420NDs.LJI().storeString("key_cookie_feed", str2);
    }
}
