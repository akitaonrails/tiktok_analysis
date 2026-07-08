package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;

/* JADX INFO: renamed from: X.0deU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058520deU {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment LIZ(Fragment fragment) {
        FeedFragment feedFragmentUx;
        if (fragment == 0) {
            return null;
        }
        if (!(fragment instanceof InterfaceC1593630rZZ) || (feedFragmentUx = ((InterfaceC1593630rZZ) fragment).ux()) == null) {
            return fragment;
        }
        return feedFragmentUx;
    }
}
