package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0f7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1115150f7p extends View {
    public Activity LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    public C1115150f7p(Context context) {
        super(context);
        this.LLILZIL = true;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLIZ) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.LLILZLL) {
            return false;
        }
        if (this.LL != null) {
            if (this.LLILZIL && (this.LLILLL || this.LLILLJJLI)) {
                motionEvent.offsetLocation(0.0f, this.LLILZ);
            }
            if (!this.LLILZLL) {
                return this.LL.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setActivity(Activity activity) {
        this.LL = activity;
        this.LLILLJJLI = C2075608Be.LIZJ(activity);
        this.LLILZ = C497740JfY.LJIJ();
    }

    public void setForceDispatchTouchEvent(boolean z) {
        this.LLIZ = z;
    }

    public void setShowStatusBar(boolean z) {
        this.LLILLL = z;
    }

    public C1115150f7p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
    }
}
