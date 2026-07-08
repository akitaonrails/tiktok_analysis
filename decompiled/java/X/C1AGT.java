package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.SearchLynxImageMonitorStruct;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AGT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AGT {
    public static final C1AGT LIZ = new C1AGT();
    public static final SearchLynxImageMonitorStruct LIZIZ = new SearchLynxImageMonitorStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(444));

    public static SearchLynxImageMonitorStruct LIZ() {
        return (SearchLynxImageMonitorStruct) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().enable;
    }

    public static boolean LIZJ(String str) {
        if (!LIZ().enable || str == null) {
            return false;
        }
        if (Intrinsics.LJFF(str, "general_search")) {
            if (LIZ().generalSearchSamplingRule == 0 || System.currentTimeMillis() % ((long) LIZ().generalSearchSamplingRule) != 0) {
                return false;
            }
            return true;
        }
        if (Intrinsics.LJFF(str, "middle_page")) {
            if (LIZ().guessSearchSamplingRule == 0 || System.currentTimeMillis() % ((long) LIZ().guessSearchSamplingRule) != 0) {
                return false;
            }
            return true;
        }
        if (Intrinsics.LJFF(str, "vertical_search")) {
            if (LIZ().verticalSearchSamplingRule == 0 || System.currentTimeMillis() % ((long) LIZ().verticalSearchSamplingRule) != 0) {
                return false;
            }
            return true;
        }
        if (Intrinsics.LJFF(str, "search_full_page")) {
            if (LIZ().searchFullPageSamplingRule == 0 || System.currentTimeMillis() % ((long) LIZ().searchFullPageSamplingRule) != 0) {
                return false;
            }
            return true;
        }
        if (!Intrinsics.LJFF(str, "fe_search_fyp_cards") || LIZ().searchFypSamplingRule == 0 || System.currentTimeMillis() % ((long) LIZ().searchFypSamplingRule) != 0) {
            return false;
        }
        return true;
    }
}
