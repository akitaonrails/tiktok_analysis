package X;

import com.ss.android.ugc.aweme.search.appdiff.ISearchMobAppDiff;

/* JADX INFO: renamed from: X.0QJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668460QJw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Integer num) {
        if (!C301310BrV.LIZ() && !C07IV.LIZ) {
            ISearchMobAppDiff.LIZ.getClass();
            C0QKA.LIZIZ.getValue().LIZ("");
            return "";
        }
        if (C301310BrV.LIZ()) {
            int value = EnumC644330PPb.USER.getValue();
            if (num != null && num.intValue() == value) {
                return "Person";
            }
            int value2 = EnumC644330PPb.POI.getValue();
            if (num != null && num.intValue() == value2) {
                return "Local_service";
            }
            int value3 = EnumC644330PPb.ECOM.getValue();
            if (num != null && num.intValue() == value3) {
                return "Ecom";
            }
        }
        if (C07IV.LIZ) {
            int value4 = EnumC644330PPb.LIVE.getValue();
            if (num != null && num.intValue() == value4) {
                return "Live";
            }
        }
        ISearchMobAppDiff.LIZ.getClass();
        C0QKA.LIZIZ.getValue().LIZ(null);
        return null;
    }
}
