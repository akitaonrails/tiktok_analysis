package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21514319Hp extends AppCompatImageView implements InterfaceC21550219Vk {
    public final /* synthetic */ ActionMenuPresenter LL;

    @Override // X.InterfaceC21550219Vk
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC21550219Vk
    public final boolean LJIILJJIL() {
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.LL.LJIILIIL();
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21514319Hp(ActionMenuPresenter actionMenuPresenter, Context context) {
        super(context, null, R.attr.b8s);
        this.LL = actionMenuPresenter;
        setClickable(true);
        setFocusable(true);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        setEnabled(true);
        C1697050uGN.LIZ(this, getContentDescription());
        setOnTouchListener(new AbstractViewOnTouchListenerC21551119Vt(this) { // from class: X.19VO
            @Override // X.AbstractViewOnTouchListenerC21551119Vt
            public final InterfaceC21551219Vu LIZIZ() {
                C19VJ c19vj = this.LLJI.LL.LLJJIJIL;
                if (c19vj == null) {
                    return null;
                }
                return c19vj.LIZ();
            }

            @Override // X.AbstractViewOnTouchListenerC21551119Vt
            public final boolean LIZJ() {
                this.LLJI.LL.LJIILIIL();
                return true;
            }

            @Override // X.AbstractViewOnTouchListenerC21551119Vt
            public final boolean LIZLLL() {
                ActionMenuPresenter actionMenuPresenter2 = this.LLJI.LL;
                if (actionMenuPresenter2.LLJJJIL != null) {
                    return false;
                }
                actionMenuPresenter2.LJIIJJI();
                return true;
            }
        });
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C16GF.LJFF(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
