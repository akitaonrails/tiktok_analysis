package X;

import Y.ARunnableS125S0100000_25;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS604S0100000_25;
import nv7.c0;

/* JADX INFO: renamed from: X.0tMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662230tMD extends AbstractC1664490tPr<C1662190tM9, C1662210tMB> {
    public FrameLayout LLJJJIL;
    public FrameLayout LLJJJJ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FrameLayout frameLayout = this.LLJJJIL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        if (frameLayout.getParent() != null) {
            FrameLayout frameLayout3 = this.LLJJJIL;
            if (frameLayout3 != null) {
                frameLayout2 = frameLayout3;
            }
            HandlerHook.viewPost(frameLayout2, new ARunnableS125S0100000_25(this, 14));
        }
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0tME
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662190tM9) obj).LIZ);
            }
        }), new AwS604S0100000_25(this, 100));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0tMG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662190tM9) obj).LIZIZ;
            }
        }), new AwS604S0100000_25(this, 101));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0tMF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662190tM9) obj).LIZJ);
            }
        }), new AwS604S0100000_25(this, 102));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireSceneContext = requireSceneContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireSceneContext);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        c0 c0Var = c0.LIZ;
        c0Var.t2(LLLLIL().LIZIZ.invoke().cameraComponentModel.mVideoWidth, LLLLIL().LIZIZ.invoke().cameraComponentModel.mVideoHeight);
        FrameLayout frameLayout2 = new FrameLayout(contextRequireSceneContext);
        C786410Ut5.a6(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setId(R.id.klz);
        C426750GoL.LJIIIZ(frameLayout2, 0, Integer.valueOf(c0Var.n2()), 0, Integer.valueOf(c0Var.LLJJJJLIIL() - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(contextRequireSceneContext)), false, 16);
        C1447470nlp.LIZIZ(frameLayout2, C11VU.LIZ(20.0f));
        this.LLJJJIL = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(contextRequireSceneContext);
        C786410Ut5.a6(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
        this.LLJJJJ = frameLayout3;
        FrameLayout frameLayout4 = this.LLJJJIL;
        FrameLayout frameLayout5 = null;
        if (frameLayout4 == null) {
            frameLayout4 = null;
        }
        frameLayout.addView(frameLayout4);
        FrameLayout frameLayout6 = this.LLJJJJ;
        if (frameLayout6 != null) {
            frameLayout5 = frameLayout6;
        }
        frameLayout.addView(frameLayout5);
        return frameLayout;
    }
}
