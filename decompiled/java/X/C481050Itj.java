package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Itj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481050Itj extends C16FB {
    public Function0<? extends RecyclerView> LLLFZ;
    public final Rect LLLI;

    public final Function0<RecyclerView> getGetInnerRecyclerview() {
        return this.LLLFZ;
    }

    @Override // X.C16FB, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RecyclerView recyclerViewInvoke;
        if (motionEvent.getAction() == 0) {
            return false;
        }
        Function0<? extends RecyclerView> function0 = this.LLLFZ;
        if (function0 != null && (recyclerViewInvoke = function0.invoke()) != null) {
            recyclerViewInvoke.getGlobalVisibleRect(this.LLLI);
        }
        if (this.LLLI.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setGetInnerRecyclerview(Function0<? extends RecyclerView> function0) {
        this.LLLFZ = function0;
    }

    public C481050Itj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setScrollMode(EnumC481060Itk.REFRESH);
        setNestedHeader(new C446160HeY(context));
        this.LLLI = new Rect();
    }
}
