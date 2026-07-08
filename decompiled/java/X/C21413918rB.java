package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21413918rB extends SeekBar {
    public final C21414018rC LL;

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C21414018rC c21414018rC = this.LL;
        Drawable drawable = c21414018rC.LJ;
        if (drawable != null && drawable.isStateful() && drawable.setState(c21414018rC.LIZLLL.getDrawableState())) {
            c21414018rC.LIZLLL.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LL.LJ;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LL.LIZLLL(canvas);
    }

    public C21413918rB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.fhp);
    }

    public C21413918rB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.t3(getContext());
        C21414018rC c21414018rC = new C21414018rC(this);
        this.LL = c21414018rC;
        c21414018rC.LIZ(attributeSet, i);
    }
}
