package X;

import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchRootAssem;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642150PGr {
    public static final void LIZIZ(SearchRootAssem searchRootAssem, C0PGJ c0pgj, int i, Function0 function0) {
        C19EG c19egLIZ = C724240Sb0.LIZ(searchRootAssem);
        if (c19egLIZ == null) {
            return;
        }
        C0PH1 c0ph1 = new C0PH1(i, "SearchCLASubtitleCommonAssem", !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()), c0pgj, function0);
        if (Intrinsics.LJFF(((ConcurrentHashMap) c0pgj.getCache$search_release().LIZIZ.getValue()).get(c19egLIZ.getLocalClassName()), Boolean.TRUE)) {
            C0PH2.LIZ();
            C0PH2.LIZLLL(c0ph1);
        } else {
            c0pgj.getCache$search_release().LIZ(c19egLIZ, searchRootAssem, c0ph1);
        }
    }

    public static final void LIZ(Fragment fragment, C0PGJ c0pgj, int i, String str, Function0 function0) {
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        C0PH1 c0ph1 = new C0PH1(i, str, !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()), c0pgj, function0);
        if (Intrinsics.LJFF(((ConcurrentHashMap) c0pgj.getCache$search_release().LIZIZ.getValue()).get(activity.getLocalClassName()), Boolean.TRUE)) {
            C0PH2.LIZ();
            C0PH2.LIZLLL(c0ph1);
        } else {
            c0pgj.getCache$search_release().LIZ(activity, fragment, c0ph1);
        }
    }
}
