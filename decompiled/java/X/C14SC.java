package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.EventItem;

/* JADX INFO: renamed from: X.14SC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14SC implements View.OnAttachStateChangeListener {
    public boolean LL;
    public C14SB LLILLJJLI;
    public final /* synthetic */ EventItem LLILLL;
    public final /* synthetic */ CommonLogParams LLILZ;
    public final /* synthetic */ C01BK LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.14SB] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(final View view) {
        Integer num = this.LLILLL.once;
        if ((num != null && num.intValue() == 1 && this.LL) || this.LLILLJJLI != null) {
            return;
        }
        final EventItem eventItem = this.LLILLL;
        final CommonLogParams commonLogParams = this.LLILZ;
        final C01BK c01bk = this.LLILZIL;
        this.LLILLJJLI = new ViewTreeObserver.OnPreDrawListener() { // from class: X.14SB
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (!view.isAttachedToWindow()) {
                    C786410Ut5.D3(view.getViewTreeObserver(), this);
                    this.LLILLJJLI = null;
                    return true;
                }
                Rect rect = new Rect();
                if (view.isShown() && view.getGlobalVisibleRect(rect) && rect.width() > 0 && rect.height() > 0) {
                    this.LL = true;
                    C786410Ut5.D3(view.getViewTreeObserver(), this);
                    this.LLILLJJLI = null;
                    view.removeOnAttachStateChangeListener(this);
                    C14S9.LIZIZ(view, eventItem, commonLogParams, c01bk);
                }
                return true;
            }
        };
        C786410Ut5.y3(view.getViewTreeObserver(), this.LLILLJJLI);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C14SB c14sb = this.LLILLJJLI;
        if (c14sb != null) {
            C786410Ut5.D3(view.getViewTreeObserver(), c14sb);
            this.LLILLJJLI = null;
        }
    }

    public C14SC(EventItem eventItem, CommonLogParams commonLogParams, C01BK c01bk) {
        this.LLILLL = eventItem;
        this.LLILZ = commonLogParams;
        this.LLILZIL = c01bk;
    }
}
