package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.1A4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173571A4t extends HorizontalScrollView {
    public boolean LL;
    public int LLILLJJLI;
    public final BPEAHandler LLILLL;

    public final InterfaceC2173631A4z getOnScrollListener() {
        return null;
    }

    public final void setOnScrollListener(InterfaceC2173631A4z interfaceC2173631A4z) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LL = true;
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.LL = false;
            this.LLILLL.removeMessages(1);
            C786410Ut5.LJLJJI(1, 80L, this.LLILLL);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.LL = false;
            this.LLILLL.removeMessages(1);
            C786410Ut5.LJLJJI(1, 80L, this.LLILLL);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setScrollState(int i) {
        if (this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
        }
    }

    public C2173571A4t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.1A4v
            public int LL = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                int scrollY = this.LLILLJJLI.getScrollY();
                C2173571A4t c2173571A4t = this.LLILLJJLI;
                if (!c2173571A4t.LL && this.LL == scrollY) {
                    this.LL = Integer.MIN_VALUE;
                    c2173571A4t.setScrollState(0);
                    return true;
                }
                this.LL = scrollY;
                c2173571A4t.LLILLL.removeMessages(1);
                C786410Ut5.LJLJJI(1, 80L, c2173571A4t.LLILLL);
                return true;
            }
        });
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LL) {
            setScrollState(1);
            return;
        }
        setScrollState(2);
        this.LLILLL.removeMessages(1);
        C786410Ut5.LJLJJI(1, 80L, this.LLILLL);
    }
}
