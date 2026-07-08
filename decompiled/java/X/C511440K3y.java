package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;

/* JADX INFO: renamed from: X.0K3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511440K3y {
    public static void LIZ(FragmentManager fragmentManager, int i, String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        bundle.putBoolean("hide_header", true);
        bundle.putBoolean("disable_swipe_refresh", z3);
        bundle.putBoolean("hide_indicator", true);
        bundle.putBoolean("hide_title", true);
        bundle.putBoolean("hide_bottom_post", true);
        bundle.putBoolean("preview_mode", z);
        bundle.putBoolean("is_full_screen", z2);
        SubSpaceFeedFragment subSpaceFeedFragment = new SubSpaceFeedFragment();
        subSpaceFeedFragment.LLILLL = str;
        subSpaceFeedFragment.LLILZ = i;
        subSpaceFeedFragment.setArguments(bundle);
        subSpaceFeedFragment.LLILZIL = fragmentManager;
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LIZJ(i, subSpaceFeedFragment, "SubOnlySpaceFeedFragment");
        c19ehLJIIJ.LJII("SubOnlySpaceFeedFragment");
        c19ehLJIIJ.LJIIJ();
    }
}
