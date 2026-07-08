package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;

/* JADX INFO: renamed from: X.0JqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504520JqU {
    public static void LIZ(FragmentManager fragmentManager, int i, String str, Bundle bundle, boolean z, boolean z2, boolean z3, boolean z4) {
        bundle.putBoolean("hide_header", true);
        bundle.putBoolean("disable_swipe_refresh", z3);
        bundle.putBoolean("hide_indicator", true);
        bundle.putBoolean("hide_title", !z4);
        bundle.putBoolean("hide_bottom_post", true);
        bundle.putBoolean("preview_mode", z);
        bundle.putBoolean("is_full_screen", z2);
        bundle.putBoolean("force_show_native_title_bar", z4);
        SubSpaceFeedFragment subSpaceFeedFragment = new SubSpaceFeedFragment();
        subSpaceFeedFragment.LLILLJJLI = str;
        subSpaceFeedFragment.LLILLL = i;
        subSpaceFeedFragment.setArguments(bundle);
        subSpaceFeedFragment.LLILZIL = fragmentManager;
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LIZJ(i, subSpaceFeedFragment, "SubOnlySpaceFeedFragment");
        c19ehLJIIJ.LJII("SubOnlySpaceFeedFragment");
        c19ehLJIIJ.LJIIJ();
    }
}
