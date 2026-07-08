package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C376400EpK extends AppCompatImageView {
    public Drawable LL;
    public TuxIconDrawable LLILLJJLI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
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

    public final void setStateDrawable(Drawable drawable) {
        this.LL = drawable;
        setImageDrawable(drawable);
    }

    public C376400EpK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C376400EpK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_play_fill;
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJ = numValueOf;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_pause_fill1;
        c419910GdJ2.LJ = numValueOf;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(getContext());
        this.LL = tuxIconDrawableLIZ;
        this.LLILLJJLI = tuxIconDrawableLIZ2;
        setImageDrawable(tuxIconDrawableLIZ);
    }
}
