package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600650rkt extends AppCompatImageView {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final C1617830sCb getRefreshAnimator() {
        return (C1617830sCb) this.LL.getValue();
    }

    public final long getAnimationDuration() {
        return ((Number) this.LLILLJJLI.getValue()).longValue();
    }

    public final Bitmap getLiveAvatarBitmap() {
        return getRefreshAnimator().LJIIJ;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZLLL(Bitmap bitmap) {
        getRefreshAnimator().LIZLLL(this, bitmap, getAnimationDuration());
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            getRefreshAnimator().LIZ(this, canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setStoryAvatarBitmap(Bitmap bitmap) {
        getRefreshAnimator().LJIIIZ = bitmap;
        invalidate();
    }

    public final void LIZ(Bitmap bitmap, Bitmap bitmap2) {
        C1617830sCb refreshAnimator = getRefreshAnimator();
        refreshAnimator.LJIIJ = bitmap;
        refreshAnimator.LJIIIZ = bitmap2;
        invalidate();
    }

    public final void LIZJ(InterfaceC1600660rku interfaceC1600660rku, int i) {
        C1617830sCb refreshAnimator = getRefreshAnimator();
        refreshAnimator.LIZJ();
        if (interfaceC1600660rku != null) {
            if (interfaceC1600660rku.LIZIZ() != null) {
                refreshAnimator.LJIIIIZZ.setShader(interfaceC1600660rku.LIZIZ());
            } else {
                refreshAnimator.LJIIIIZZ.setShader(null);
                Integer numLIZ = interfaceC1600660rku.LIZ();
                if (numLIZ != null) {
                    refreshAnimator.LJIIIIZZ.setColor(numLIZ.intValue());
                }
            }
        }
        if (getRefreshAnimator().LJIILJJIL != i) {
            getRefreshAnimator().LJIILJJIL = i;
            requestLayout();
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        float f2 = getRefreshAnimator().LJIIJJI;
        if (getRefreshAnimator().LJIILJJIL < 2) {
            f = f2;
        } else {
            f = (getRefreshAnimator().LJIILIIL * (r2 - 1)) + f2;
        }
        setMeasuredDimension(ImageView.resolveSize((int) Math.ceil(f), i), ImageView.resolveSize((int) Math.ceil(f2), i2));
    }

    public C1600650rkt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(695));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(694));
    }
}
