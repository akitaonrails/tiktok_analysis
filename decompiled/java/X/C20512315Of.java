package X;

import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.15Of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20512315Of extends RecyclerView {
    public final C20512415Og LL;
    public AbstractC21673619ry<?> LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public final ARunnableS131S0100000_31 LLILZIL;

    public final void LJ() {
        if (this.LLILZ || !isAttachedToWindow()) {
            return;
        }
        this.LLILZ = true;
        HandlerHook.viewPost(this, this.LLILZIL);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        HandlerHook.viewRemoveCallbacks(this, this.LLILZIL);
        this.LLILZ = false;
        super.onDetachedFromWindow();
    }

    public final void LIZLLL() {
        if (LJFF() && getMeasuredHeight() == 0) {
            LJ();
        } else if (this.LLILLL != 0) {
            this.LLILLL = 0;
            requestLayout();
        }
    }

    public final boolean LJFF() {
        AbstractC21673619ry adapter;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams != null && layoutParams.height == -2 && (adapter = getAdapter()) != null && adapter.getItemCount() > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZLLL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC21673619ry<?> abstractC21673619ry) {
        AbstractC21673619ry<?> abstractC21673619ry2 = this.LLILLJJLI;
        if (abstractC21673619ry2 == abstractC21673619ry) {
            super.setAdapter(abstractC21673619ry);
            return;
        }
        if (abstractC21673619ry2 != null) {
            abstractC21673619ry2.unregisterAdapterDataObserver(this.LL);
        }
        this.LLILLJJLI = abstractC21673619ry;
        super.setAdapter(abstractC21673619ry);
        AbstractC21673619ry<?> abstractC21673619ry3 = this.LLILLJJLI;
        if (abstractC21673619ry3 != null) {
            abstractC21673619ry3.registerAdapterDataObserver(this.LL);
        }
        LIZLLL();
    }

    public C20512315Of(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.height);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == -2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            if (this.LLILLL > 0 && getMeasuredHeight() < this.LLILLL) {
                setMeasuredDimension(getMeasuredWidth(), this.LLILLL);
            }
            if (LJFF()) {
                if (getMeasuredHeight() == 0 || View.MeasureSpec.getSize(i) == 0) {
                    LJ();
                    return;
                }
                return;
            }
            return;
        }
        this.LLILLL = 0;
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15Og] */
    public C20512315Of(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new AbstractC471570IeR() { // from class: X.15Og
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ.LIZLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i2, int i3) {
                this.LIZ.LIZLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i2, int i3) {
                this.LIZ.LIZLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i2, int i3) {
                this.LIZ.LIZLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i2, int i3) {
                this.LIZ.LIZLLL();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i2, int i3, Object obj) {
                this.LIZ.LIZLLL();
            }
        };
        this.LLILZIL = new ARunnableS131S0100000_31(this, 51);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
