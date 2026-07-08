package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049210dPT extends FrameLayout {
    public int LL;
    public View LLILLJJLI;
    public View LLILLL;
    public int LLILZ;
    public final C01GW LLILZIL;
    public Function0<Unit> LLILZLL;
    public boolean LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public AbstractC1049230dPV LLJI;

    private final View getPassthroughTouchView() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        AbstractC1049230dPV abstractC1049230dPV = this.LLJI;
        View view2 = abstractC1049230dPV instanceof C1049240dPW ? ((C1049240dPW) abstractC1049230dPV).LIZ : null;
        this.LLILLJJLI = view2;
        return view2;
    }

    private final int getTouchSlop() {
        return ((Number) this.LLILZIL.getValue()).intValue();
    }

    private final View getVerticalTouchView() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        AbstractC1049230dPV abstractC1049230dPV = this.LLJI;
        View view2 = abstractC1049230dPV instanceof C1049220dPU ? ((C1049220dPU) abstractC1049230dPV).LIZ : null;
        this.LLILLL = view2;
        return view2;
    }

    public final boolean getHasMoved() {
        return this.LLIZ;
    }

    public final Function0<Unit> getOnVisibilityChange$commercialize_feed_impl_release() {
        return this.LLILZLL;
    }

    public final AbstractC1049230dPV getTouchEventViewType$commercialize_feed_impl_release() {
        return this.LLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1049210dPT.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setHasMoved(boolean z) {
        this.LLIZ = z;
    }

    public final void setOnVisibilityChange$commercialize_feed_impl_release(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    public final void setTouchEventViewType$commercialize_feed_impl_release(AbstractC1049230dPV abstractC1049230dPV) {
        this.LLJI = abstractC1049230dPV;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C1049210dPT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = -1;
        this.LLILZIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 974));
    }
}
