package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0hhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214110hhR extends C1771930wD9 {
    public final long LLILLJJLI;
    public long LLILLL;
    public View.OnClickListener LLILZ;

    public C1214110hhR(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = 500L;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        View.OnClickListener onClickListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInterceptTouchEvent");
        Integer numValueOf2 = null;
        if (motionEvent != null) {
            numValueOf2 = Integer.valueOf(motionEvent.getAction());
        }
        sbLIZ.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLILLL = System.currentTimeMillis();
            } else if (numValueOf.intValue() == 1 && System.currentTimeMillis() - this.LLILLL < this.LLILLJJLI && (onClickListener = this.LLILZ) != null) {
                onClickListener.onClick(this);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setLynxViewClickListener(View.OnClickListener onClickListener) {
        this.LLILZ = onClickListener;
    }
}
