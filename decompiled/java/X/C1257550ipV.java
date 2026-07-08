package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ipV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1257550ipV extends AbstractC1257680ipi {
    public TuxIconView LLILLL;

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.jxe);
        this.LLILLL = tuxIconView;
        if (tuxIconView != null) {
            getAnimatingViews().add(tuxIconView);
        }
        C1257690ipj animationDelegate = getAnimationDelegate();
        List<View> animatingViews = getAnimatingViews();
        animationDelegate.getClass();
        Iterator<View> it2 = animatingViews.iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4(it2.next(), C268330AfP.LJII() ? 0.17f : 0.5f);
        }
        getAnimationDelegate().LIZLLL = new C1215250hjH(this);
        if (C268330AfP.LJII()) {
            TuxIconView tuxIconView2 = this.LLILLL;
            if (tuxIconView2 != null) {
                C1744700vVE.LJIIL(tuxIconView2, C0H9H.LIZIZ(20));
            }
            TuxIconView tuxIconView3 = this.LLILLL;
            if (tuxIconView3 != null) {
                C1744700vVE.LJIIIIZZ(C0H9H.LIZIZ(20), tuxIconView3);
                return;
            }
            return;
        }
        TuxIconView tuxIconView4 = this.LLILLL;
        if (tuxIconView4 != null) {
            C1744700vVE.LJIIL(tuxIconView4, C0H9H.LIZIZ(22));
        }
        TuxIconView tuxIconView5 = this.LLILLL;
        if (tuxIconView5 != null) {
            C1744700vVE.LJIIIIZZ(C0H9H.LIZIZ(22), tuxIconView5);
        }
    }

    public final void setColor(int i) {
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            tuxIconView.setTintColor(i);
        }
    }

    public final void setImageResource(int i) {
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        }
    }

    public C1257550ipV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
