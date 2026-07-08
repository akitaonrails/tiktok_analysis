package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS444S0200000_8;

/* JADX INFO: renamed from: X.0MIN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MIN extends C19A3 {
    public final C05P0<EnumC1668730tWh> LLJILLL = C20028913Yh.LJI(EnumC1668730tWh.DEFAULT_EMPTY_PREVIEW);
    public final C05P0<Integer> LLJJ = C20028913Yh.LJI(0);
    public Function0<Unit> LLJJI;
    public Function0<Unit> LLJJIII;
    public Function0<Unit> LLJJIJI;
    public String LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public boolean LLJJJ;

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this, new C581250Mqx(this, 2));
        }
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        try {
            C384070F4b.LIZ(ScreenUtils.getStatusBarHeight(requireSceneContext()) + frameLayout.getResources().getDimensionPixelSize(R.dimen.adk), frameLayout);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ComposeView composeView = new ComposeView(requireSceneContext(), null, 6);
        composeView.setContent(new C19719212De(-342648852, new AwS444S0200000_8(this, composeView, 2), true));
        frameLayout.addView(composeView);
        return frameLayout;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
