package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399730mWp {
    public static final SAFTikTokFragment LIZIZ(Fragment fragment) {
        while (fragment != null) {
            if (fragment instanceof SAFTikTokFragment) {
                SAFTikTokFragment sAFTikTokFragment = (SAFTikTokFragment) fragment;
                if (sAFTikTokFragment.ib() != null) {
                    return sAFTikTokFragment;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return null;
    }

    public static final void LIZ(SAFTikTokFragment sAFTikTokFragment, Intent intent) {
        Scene scene;
        SAFFragmentRootScene sAFFragmentRootSceneIb = sAFTikTokFragment.ib();
        if (sAFFragmentRootSceneIb != null && (scene = sAFFragmentRootSceneIb.mParentScene) != null && scene.mParentScene != null) {
            try {
                C20630415o6.LIZIZ(sAFFragmentRootSceneIb, -1, intent);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
