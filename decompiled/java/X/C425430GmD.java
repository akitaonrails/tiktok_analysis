package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C425430GmD extends AppCompatImageView {
    public int LL;
    public InterfaceC425440GmE LLILLJJLI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLILLJJLI != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 2) {
                    this.LLILLJJLI.LIZ(true);
                } else {
                    float f = this.LL;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (getRight() - getLeft()) + f || y >= (getBottom() - getTop()) + f) {
                        this.LLILLJJLI.LJJIL();
                    }
                }
            } else {
                this.LLILLJJLI.LIZ(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
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

    public void setKeyboardDismissHandler(InterfaceC425440GmE interfaceC425440GmE) {
        this.LLILLJJLI = interfaceC425440GmE;
    }

    public C425430GmD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C425430GmD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
