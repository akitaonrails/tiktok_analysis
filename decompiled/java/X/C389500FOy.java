package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389500FOy extends LinearLayout {
    public LinearLayout LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;

    public final LinearLayout getLlCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nbq);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getShowView() {
        return (TuxTextView) findViewById(R.id.q8r);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawX = (this.LLILLJJLI + motionEvent.getRawX()) - this.LLILZ;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setX(rawX);
                    float rawY = (this.LLILLL + motionEvent.getRawY()) - this.LLILZIL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setY(rawY);
                }
                return true;
            }
            int width = ((View) getParent()).getWidth();
            ((View) getParent()).getHeight();
            int width2 = getWidth();
            getHeight();
            if (getX() + (width2 / 2) < width / 2) {
                f = 0.0f;
            } else {
                f = width - width2;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(f);
            return true;
        }
        this.LLILLJJLI = getX();
        this.LLILLL = getY();
        this.LLILZ = motionEvent.getRawX();
        this.LLILZIL = motionEvent.getRawY();
        return true;
    }

    public final void setLlCloseFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public C389500FOy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f28, this, true);
        C786410Ut5.R7(getLlCloseFromXml(), new ACListenerS140S0100000_5(this, 145));
    }
}
