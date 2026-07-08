package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleComponentCallback;
import com.ss.android.ugc.aweme.feed.flexible.api.FlexibleSupportAbility;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0raT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594190raT {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static C19BN LIZ(Fragment fragment, C19EG c19eg) {
        InterfaceC20622815ms interfaceC20622815ms;
        NavigationScene navigationScene;
        SAFTikTokFragment sAFTikTokFragment;
        Scene scene;
        if (!(c19eg instanceof InterfaceC214897198d) || (interfaceC20622815ms = (InterfaceC20622815ms) c19eg) == null || (navigationScene = interfaceC20622815ms.getNavigationScene()) == null || !(fragment instanceof SAFTikTokFragment) || (sAFTikTokFragment = (SAFTikTokFragment) fragment) == null) {
            return null;
        }
        SAFFragmentRootScene sAFFragmentRootSceneIb = sAFTikTokFragment.ib();
        if (sAFFragmentRootSceneIb != null) {
            scene = sAFFragmentRootSceneIb.mParentScene;
        } else {
            scene = null;
        }
        if (!Intrinsics.LJFF(scene, navigationScene.LLLLIIIILLL())) {
            return null;
        }
        return new C19BN(navigationScene, sAFTikTokFragment);
    }

    public static C1594210raV LIZIZ(Fragment fragment, C19EG c19eg) {
        FlexibleComponentCallback flexibleComponentCallback;
        FlexibleSupportAbility flexibleSupportAbility;
        try {
            flexibleComponentCallback = (FlexibleComponentCallback) C09RB.LJIIL(C09RB.LJIJI(C09R4.LJ(AFwS264S0000000_24.get$arr$(573), fragment), AFwS264S0000000_24.get$arr$(574)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            flexibleComponentCallback = null;
        }
        try {
            flexibleSupportAbility = (FlexibleSupportAbility) C09RB.LJIIL(C09RB.LJIJI(C09R4.LJ(AFwS264S0000000_24.get$arr$(575), fragment), AFwS264S0000000_24.get$arr$(576)));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            flexibleSupportAbility = null;
        }
        AwS268S0300000_24 awS268S0300000_24 = new AwS268S0300000_24(c19eg, fragment, flexibleComponentCallback, 8);
        if (flexibleComponentCallback == null && flexibleSupportAbility == null) {
            return null;
        }
        return new C1594210raV(flexibleComponentCallback, awS268S0300000_24, new C1594220raW(flexibleSupportAbility));
    }
}
