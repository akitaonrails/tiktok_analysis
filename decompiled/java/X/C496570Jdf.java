package X;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Jdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496570Jdf extends C21578619ce {
    public final C01GW LL;

    public C496570Jdf(Context context) {
        this(context, null, 6, 0);
    }

    public C496570Jdf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void setOnScrollListener(InterfaceC496590Jdh interfaceC496590Jdh) {
    }

    private final Handler getEndHandler() {
        return (Handler) this.LL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public C496570Jdf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(169));
    }

    public /* synthetic */ C496570Jdf(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // X.C21578619ce, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
