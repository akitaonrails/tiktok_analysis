package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DTO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DTO extends RecyclerView {
    public int LL;

    public final int getDownx() {
        return this.LL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LL = (int) motionEvent.getRawX();
        } else if (motionEvent.getAction() == 2) {
            Math.abs(this.LL - ((int) motionEvent.getRawX()));
            return false;
        }
        return false;
    }

    public final void setDownx(int i) {
        this.LL = i;
    }

    public C0DTO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDescendantFocusability(262144);
    }
}
