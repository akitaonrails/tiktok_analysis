package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.ecommerce.bubble.EcSearchBubbleVM;

/* JADX INFO: renamed from: X.0P5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639150P5d {
    public static EcSearchBubbleVM LIZ(Fragment fragment) {
        C19EG activity;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return null;
        }
        return (EcSearchBubbleVM) C679340Qkm.LIZIZ(fragment, activity).get(EcSearchBubbleVM.class);
    }
}
