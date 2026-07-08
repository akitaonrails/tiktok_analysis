package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;

/* JADX INFO: renamed from: X.0Prl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658190Prl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Fragment fragment, View view, Lifecycle.State state) {
        C19EG c19egLIZIZ;
        Fragment fragmentLJJJJZI;
        Context context = view.getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            SAFHelper.LIZ.getClass();
            FragmentManager fragmentManagerLJIILJJIL = SAFHelper.LJIILJJIL(fragment, c19egLIZIZ);
            if (fragmentManagerLJIILJJIL != null && (fragmentLJJJJZI = fragmentManagerLJIILJJIL.LJJJJZI("container")) != null) {
                C19EH c19ehLJIIJ = fragmentManagerLJIILJJIL.LJIIJ();
                c19ehLJIIJ.LJIL(fragmentLJJJJZI, state);
                c19ehLJIIJ.LJIIJ();
            }
        }
    }
}
