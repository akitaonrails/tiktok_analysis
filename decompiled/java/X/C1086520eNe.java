package X;

import Y.ARunnableS50S0300000_17;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086520eNe extends ViewOnAttachStateChangeListenerC20604515jv implements InterfaceC1086570eNj {
    public final Rect LLILZ;
    public final C1085670eMH LLILZIL;
    public C560150Ly1 LLILZLL;

    public C1086520eNe(Context context) {
        this(context, null, 6, 0);
    }

    public C1086520eNe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void LJJI() {
        C1085670eMH c1085670eMH = this.LLILZIL;
        for (View view : c1085670eMH.LIZ) {
            HandlerHook.viewPost(view, new ARunnableS50S0300000_17(this, view, c1085670eMH, 1));
        }
    }

    public C560150Ly1 getLoadPauseScrollListener() {
        return this.LLILZLL;
    }

    public final Rect getOriginalPowerListRect() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1086570eNj
    public final void LIZ(int i) {
        if (i > 0 && getLoadPauseScrollListener() == null && getScrollState() == 0) {
            C560150Ly1 c560150Ly1 = new C560150Ly1(i);
            addOnScrollListener(c560150Ly1);
            setLoadPauseScrollListener(c560150Ly1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onChildAttachedToWindow(final View view) {
        final float fFloatValue;
        Float f;
        super.onChildAttachedToWindow(view);
        final C1085670eMH c1085670eMH = this.LLILZIL;
        final RecyclerView.ViewHolder childViewHolder = getChildViewHolder(view);
        c1085670eMH.getClass();
        if (childViewHolder != 0 && (childViewHolder instanceof InterfaceC1086510eNd)) {
            c1085670eMH.LIZ.add(view);
            Object tag = view.getTag(R.id.hh2);
            if ((tag instanceof Float) && (f = (Float) tag) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = -1.0f;
            }
            if (fFloatValue < ((InterfaceC1086510eNd) childViewHolder).z4()) {
                HandlerHook.viewPost(view, new Runnable() { // from class: X.0eNc
                    public final void LIZ() {
                        if (view.getParent() != null) {
                            C1085670eMH c1085670eMH2 = c1085670eMH;
                            View view2 = view;
                            childViewHolder.getLayoutPosition();
                            c1085670eMH2.getClass();
                            float fLIZ = C1085670eMH.LIZ(view2);
                            if (fLIZ >= ((InterfaceC1086510eNd) childViewHolder).z4()) {
                                C1085670eMH c1085670eMH3 = c1085670eMH;
                                View view3 = view;
                                float fMax = Math.max(fFloatValue, fLIZ);
                                c1085670eMH3.getClass();
                                C1085670eMH.LIZIZ(view3, fMax);
                                ((InterfaceC1086510eNd) childViewHolder).b1();
                                c1085670eMH.LIZ.remove(view);
                                C1085670eMH c1085670eMH4 = c1085670eMH;
                                View view4 = view;
                                c1085670eMH4.getClass();
                                C1085670eMH.LIZIZ(view4, -1.0f);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ExploreCellDispatchExposure@4c21.onChildAttachedToWindow$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ExploreCellDispatchExposure@4c21.onChildAttachedToWindow$1");
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onChildDetachedFromWindow(View view) {
        super.onChildDetachedFromWindow(view);
        C1085670eMH c1085670eMH = this.LLILZIL;
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(view);
        if (childViewHolder == null) {
            c1085670eMH.getClass();
        } else {
            if (!c1085670eMH.LIZ.contains(view) || !(childViewHolder instanceof InterfaceC1086510eNd)) {
                return;
            }
            C1085670eMH.LIZIZ(view, -1.0f);
        }
    }

    public void setLoadPauseScrollListener(C560150Ly1 c560150Ly1) {
        this.LLILZLL = c560150Ly1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i, int i2) {
        super.onScrolled(i, i2);
        LJJI();
    }

    public C1086520eNe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = new Rect();
        this.LLILZIL = new C1085670eMH();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public /* synthetic */ C1086520eNe(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
