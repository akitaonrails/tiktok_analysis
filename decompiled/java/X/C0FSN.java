package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0FSN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FSN extends Scene {
    public final FrameLayout.LayoutParams LLJI;
    public FrameLayout LLJIJIL;
    public FrameLayout LLJILJIL;

    public C0FSN(FrameLayout.LayoutParams layoutParams) {
        this.LLJI = layoutParams;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireSceneContext = requireSceneContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireSceneContext);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireSceneContext);
        C786410Ut5.a6(frameLayout2, this.LLJI);
        this.LLJIJIL = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(contextRequireSceneContext);
        C786410Ut5.a6(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
        this.LLJILJIL = frameLayout3;
        FrameLayout frameLayout4 = this.LLJIJIL;
        FrameLayout frameLayout5 = null;
        if (frameLayout4 == null) {
            frameLayout4 = null;
        }
        frameLayout.addView(frameLayout4);
        FrameLayout frameLayout6 = this.LLJILJIL;
        if (frameLayout6 != null) {
            frameLayout5 = frameLayout6;
        }
        frameLayout.addView(frameLayout5);
        return frameLayout;
    }
}
