package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.SearchSevenSplitScreenFragment;

/* JADX INFO: renamed from: X.0QDN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDN {
    public static C19EG LIZ(Context context) {
        if (context == null) {
            return null;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            return c19egLIZIZ;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SearchSevenSplitScreenFragment LIZIZ(Context context) {
        Object objLIZ;
        Fragment fragment;
        FragmentManager fragmentManagerLJIIJJI;
        C19EG c19egLIZ = LIZ(context);
        if (c19egLIZ == 0) {
            return null;
        }
        Fragment fragmentLJJJJZI = c19egLIZ.getSupportFragmentManager().LJJJJZI("SearchSevenScreen");
        if (fragmentLJJJJZI == null) {
            if ((c19egLIZ instanceof C199Y) && (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) c19egLIZ)) != null && (objLIZ instanceof C0J5E) && (fragment = (Fragment) objLIZ) != null && (fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI(fragment)) != null) {
                fragmentLJJJJZI = fragmentManagerLJIIJJI.LJJJJZI("SearchSevenScreen");
            } else {
                fragmentLJJJJZI = null;
            }
        }
        if (!(fragmentLJJJJZI instanceof SearchSevenSplitScreenFragment)) {
            return null;
        }
        return (SearchSevenSplitScreenFragment) fragmentLJJJJZI;
    }

    public static boolean LIZJ(Context context) {
        RadiusLayout radiusLayout;
        SearchSevenSplitScreenFragment searchSevenSplitScreenFragmentLIZIZ = LIZIZ(context);
        if (searchSevenSplitScreenFragmentLIZIZ == null || !searchSevenSplitScreenFragmentLIZIZ.isVisible() || (radiusLayout = searchSevenSplitScreenFragmentLIZIZ.LLILLJJLI) == null || radiusLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }
}
