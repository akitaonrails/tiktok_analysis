package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Oxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636350Oxd extends FrameLayout {
    public boolean LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public Function0<Unit> LLILZ;
    public boolean LLILZIL;

    public final boolean getCanScrollVertically$mention_video_release() {
        return this.LLILZIL;
    }

    public final Function0<Unit> getLoadMoreListener$mention_video_release() {
        return this.LLILZ;
    }

    public final boolean getWaitingToLoadMore$mention_video_release() {
        return this.LL;
    }

    public C636350Oxd(Context context) {
        super(context, null, 0);
        this.LLILZIL = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LLILLL = motionEvent.getY();
            this.LLILLJJLI = true;
        }
        if (this.LL && this.LLILLJJLI && !this.LLILZIL && this.LLILLL - motionEvent.getY() > 0) {
            Function0<Unit> function0 = this.LLILZ;
            if (function0 != null) {
                function0.invoke();
            }
            this.LL = false;
            this.LLILLJJLI = false;
        }
        return false;
    }

    public final void setCanScrollVertically$mention_video_release(boolean z) {
        this.LLILZIL = z;
    }

    public final void setLoadMoreListener$mention_video_release(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setWaitingToLoadMore$mention_video_release(boolean z) {
        this.LL = z;
    }
}
