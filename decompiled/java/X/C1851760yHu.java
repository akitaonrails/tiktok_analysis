package X;

import Y.ALAdapterS22S0100000_27;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851760yHu extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final long LLILZIL;
    public final long LLILZLL;
    public final long LLIZ;
    public final InterpolatorC1088720eRC LLIZLLLIL;

    public final void e0() {
        C500260Jjc.LJLJLJ(this, true);
        animate().cancel();
        getViewTipBg().animate().cancel();
        getViewTipTop().animate().cancel();
        getViewTipBottom().animate().cancel();
        getViewTipText().animate().cancel();
        C786410Ut5.T4(getViewTipBg(), 0.0f);
        C786410Ut5.a5(getViewTipTop(), 0.0f);
        C786410Ut5.a5(getViewTipBottom(), 0.0f);
        C786410Ut5.k5(getViewTipText(), 0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
        AppCompatImageView viewTipTop = getViewTipTop();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewTipTop);
        viewTipTop.setTranslationY(-getViewTipTop().getHeight());
        AppCompatImageView viewTipBottom = getViewTipBottom();
        float height = getViewTipBottom().getHeight();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewTipBottom);
        viewTipBottom.setTranslationY(height);
        getViewTipBg().animate().setDuration(this.LLILZIL).setInterpolator(this.LLIZLLLIL).alpha(0.2f).start();
        getViewTipTop().animate().setDuration(this.LLILZIL).setInterpolator(this.LLIZLLLIL).translationY(0.0f).alpha(1.0f).start();
        getViewTipBottom().animate().setDuration(this.LLILZIL).setInterpolator(this.LLIZLLLIL).translationY(0.0f).alpha(1.0f).start();
        getViewTipText().animate().setDuration(this.LLILZIL).setInterpolator(this.LLIZLLLIL).alpha(1.0f).start();
        animate().setDuration(this.LLIZ).setInterpolator(this.LLIZLLLIL).alpha(0.0f).setStartDelay(this.LLILZLL + this.LLILZIL).setListener(new ALAdapterS22S0100000_27(this, 0)).start();
    }

    private final View getViewTipBg() {
        return (View) this.LL.getValue();
    }

    private final AppCompatImageView getViewTipBottom() {
        return (AppCompatImageView) this.LLILLL.getValue();
    }

    private final C16F5 getViewTipText() {
        return (C16F5) this.LLILZ.getValue();
    }

    private final AppCompatImageView getViewTipTop() {
        return (AppCompatImageView) this.LLILLJJLI.getValue();
    }

    public C1851760yHu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C1935407i4.LIZ(new AwS571S0100000_27(this, 72));
        this.LLILLJJLI = C1935407i4.LIZ(new AwS571S0100000_27(this, 75));
        this.LLILLL = C1935407i4.LIZ(new AwS571S0100000_27(this, 73));
        this.LLILZ = C1935407i4.LIZ(new AwS571S0100000_27(this, 74));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h9g, this, true);
        this.LLILZIL = 300L;
        this.LLILZLL = 3000L;
        this.LLIZ = 200L;
        this.LLIZLLLIL = new InterpolatorC1088720eRC(0.65f, 0.35f);
    }
}
