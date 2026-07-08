package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0H4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435250H4x extends C418740GbQ {
    public int LL;
    public InterfaceC435260H4y LLILLJJLI;

    public float getLeftX() {
        return getX();
    }

    public float getStartX() {
        return getLayoutDirection() == 1 ? (this.LL - getX()) - getMeasuredWidth() : getX();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435250H4x(Context context) {
        super(context, null);
        Context context2 = null;
        Context context3 = getContext();
        while (true) {
            if (context3 != null) {
                if (context3 instanceof Activity) {
                    context2 = context3;
                    break;
                } else if (!(context3 instanceof ContextWrapper)) {
                    break;
                } else {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            } else {
                break;
            }
        }
        this.LL = ScreenUtils.getScreenWidth(context2);
    }

    @Override // X.C418740GbQ, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setLeftX(float f) {
        setX(f);
    }

    public void setStartX(float f) {
        if (getLayoutDirection() == 1) {
            f = (this.LL - f) - getMeasuredWidth();
        }
        setX(f);
        InterfaceC435260H4y interfaceC435260H4y = this.LLILLJJLI;
        if (interfaceC435260H4y != null) {
            interfaceC435260H4y.LIZ(f);
        }
    }

    public void setStartXChangeListener(InterfaceC435260H4y interfaceC435260H4y) {
        this.LLILLJJLI = interfaceC435260H4y;
    }
}
