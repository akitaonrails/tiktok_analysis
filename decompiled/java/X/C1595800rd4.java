package X;

import android.view.View;
import android.view.animation.Animation;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595800rd4 implements InterfaceC1575770r6l {
    public final InterfaceC1595810rd5 LIZ;
    public boolean LIZIZ;

    @Override // X.InterfaceC1575770r6l
    public final void cancel() {
        Animation animation;
        this.LIZIZ = true;
        View view = this.LIZ.getView();
        if (view == null || (animation = view.getAnimation()) == null) {
            return;
        }
        animation.cancel();
    }

    public C1595800rd4(StoryToolBarIconAssem storyToolBarIconAssem) {
        this.LIZ = storyToolBarIconAssem;
    }

    public final Pair<Float, Float> LIZ(View view) {
        Pair<Float, Float> pairVb = this.LIZ.Vb();
        if (pairVb == null) {
            return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        view.getLocationOnScreen(new int[2]);
        return new Pair<>(Float.valueOf(pairVb.getFirst().floatValue() - (r2[0] + (view.getWidth() / 2))), Float.valueOf(pairVb.getSecond().floatValue() - (r2[1] + (view.getHeight() / 2))));
    }
}
