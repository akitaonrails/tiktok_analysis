package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0T8F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8F implements C0TFW {
    public final WeakReference<VerticalViewPager> LIZ;
    public final WeakReference<View> LIZIZ;
    public final WeakReference<TuxTextView> LIZJ;

    @Override // X.C0TFW
    public final View LIZIZ() {
        return this.LIZIZ.get();
    }

    @Override // X.C0TFW
    public final void LIZJ() {
        VerticalViewPager verticalViewPager = this.LIZ.get();
        if (verticalViewPager != null) {
            verticalViewPager.setIsTriggerByAutoPlay(true);
            verticalViewPager.setCurrentItem(verticalViewPager.getCurrentItem() + 1);
            verticalViewPager.setIsTriggerByAutoPlay(false);
        }
    }

    @Override // X.C0TFW
    public final boolean LJFF() {
        Context context;
        VerticalViewPager verticalViewPager = this.LIZ.get();
        if (verticalViewPager == null || (context = verticalViewPager.getContext()) == null) {
            return false;
        }
        return C1386360mBG.LJIIIIZZ(context, false);
    }

    public final View LJI() {
        View view = this.LIZIZ.get();
        if (view != null) {
            return view.findViewById(R.id.wsl);
        }
        return null;
    }

    public final View LJII() {
        View view = this.LIZIZ.get();
        if (view != null) {
            return view.findViewById(R.id.wsm);
        }
        return null;
    }

    @Override // X.C0TFW
    public final void LIZ(C0TFU c0tfu) {
        VerticalViewPager verticalViewPager = this.LIZ.get();
        if (verticalViewPager != null) {
            verticalViewPager.LIZJ(c0tfu);
        }
    }

    @Override // X.C0TFW
    public final void LIZLLL(float f) {
        VerticalViewPager verticalViewPager = this.LIZ.get();
        if (verticalViewPager != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(verticalViewPager);
            verticalViewPager.setTranslationY(f);
        }
    }

    @Override // X.C0TFW
    public final void LJ(String str) {
        TuxTextView tuxTextView = this.LIZJ.get();
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public C0T8F(VerticalViewPager verticalViewPager, C259800zU<View> c259800zU, C259800zU<TuxTextView> c259800zU2) {
        this.LIZ = new WeakReference<>(verticalViewPager);
        this.LIZIZ = new WeakReference<>(c259800zU.element);
        this.LIZJ = new WeakReference<>(c259800zU2.element);
    }
}
