package X;

import com.ss.android.ugc.aweme.experiment.PhotoModeProfileAreaSwipeModel;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07TO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TO {
    public static final PhotoModeProfileAreaSwipeModel LIZ = new PhotoModeProfileAreaSwipeModel(false, false, false, null, 15, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(400));

    public static boolean LIZ(String str) {
        C01GW c01gw = LIZIZ;
        if (!((PhotoModeProfileAreaSwipeModel) c01gw.getValue()).enable) {
            return true;
        }
        boolean z = false;
        if (str == null || str.length() == 0) {
            return true;
        }
        List<String> list = ((PhotoModeProfileAreaSwipeModel) c01gw.getValue()).scene;
        if (list != null && list.contains(str)) {
            z = true;
        }
        return !z;
    }

    public static final boolean LIZIZ(String str) {
        if (((PhotoModeProfileAreaSwipeModel) LIZIZ.getValue()).enable2Ios && !LIZ(str)) {
            return true;
        }
        return false;
    }
}
