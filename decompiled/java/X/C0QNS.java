package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;

/* JADX INFO: renamed from: X.0QNS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0QNS extends AppCompatImageView {
    public int LL;
    public C0QN6 LLILLJJLI;

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
                    SearchIntermediateViewModelNew searchIntermediateViewModelNew = ((C669210QMt) this.LLILLJJLI).LIZ.LLIZ;
                    if (searchIntermediateViewModelNew != null) {
                        ((LiveData) searchIntermediateViewModelNew.LLILZIL.getValue()).setValue(Boolean.TRUE);
                    }
                } else {
                    float f = this.LL;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (getRight() - getLeft()) + f || y >= (getBottom() - getTop()) + f) {
                        C669210QMt c669210QMt = (C669210QMt) this.LLILLJJLI;
                        InterfaceC668720QKw interfaceC668720QKw = c669210QMt.LIZ.LLIZLLLIL;
                        if (interfaceC668720QKw != null && interfaceC668720QKw.LIZLLL() != null) {
                            c669210QMt.LIZ.LLIZLLLIL.LIZLLL().LIZ();
                        }
                    }
                }
            } else {
                SearchIntermediateViewModelNew searchIntermediateViewModelNew2 = ((C669210QMt) this.LLILLJJLI).LIZ.LLIZ;
                if (searchIntermediateViewModelNew2 != null) {
                    ((LiveData) searchIntermediateViewModelNew2.LLILZIL.getValue()).setValue(Boolean.FALSE);
                }
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

    public void setKeyboardDismissHandler(C0QN6 c0qn6) {
        this.LLILLJJLI = c0qn6;
    }

    public C0QNS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0QNS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
