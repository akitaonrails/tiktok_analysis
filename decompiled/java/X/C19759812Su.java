package X;

import Y.AsS55S0100000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.12Su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19759812Su extends FrameLayout {
    public int LL;
    public RecyclerView LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public C12T8 LLILZIL;
    public boolean LLILZLL;

    public final AbstractC21673619ry<?> getAdapter() {
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView == null) {
            recyclerView = null;
        }
        return recyclerView.getAdapter();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0FPE c0fpe;
        C11JF c11jf;
        super.onDetachedFromWindow();
        AbstractC21673619ry<?> adapter = getAdapter();
        if (!(adapter instanceof C0FPE) || (c0fpe = (C0FPE) adapter) == null || (c11jf = c0fpe.LLILZLL) == null) {
            return;
        }
        c11jf.dispose();
    }

    public final int getCoverSize() {
        return this.LL;
    }

    public final int getFrameHeight() {
        return this.LLILZ;
    }

    public final int getFrameWidth() {
        return this.LLILLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        RecyclerView recyclerView = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 2) {
                RecyclerView recyclerView2 = this.LLILLJJLI;
                if (recyclerView2 != null) {
                    recyclerView = recyclerView2;
                }
                if (recyclerView.getScrollState() == 1) {
                    this.LLILZLL = true;
                }
            } else if (numValueOf != null) {
                if (numValueOf.intValue() == 1) {
                    RecyclerView recyclerView3 = this.LLILLJJLI;
                    if (recyclerView3 != null) {
                        recyclerView = recyclerView3;
                    }
                    if (recyclerView.getScrollState() == 1) {
                        this.LLILZLL = true;
                    } else {
                        this.LLILZLL = false;
                    }
                } else if (numValueOf.intValue() == 3) {
                    this.LLILZLL = false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setAdapter(AbstractC21673619ry<?> abstractC21673619ry) {
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(abstractC21673619ry);
    }

    public final void setCoverSize(int i) {
        this.LL = i;
    }

    public final void setFrameHeight(int i) {
        this.LLILZ = i;
    }

    public final void setFrameWidth(int i) {
        this.LLILLL = i;
    }

    public final void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(layoutManager);
    }

    public final void setOnScrollListener(C12T8 c12t8) {
        this.LLILZIL = c12t8;
    }

    public C19759812Su(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 7;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            this.LLILLL = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_frameWidth, 0.0f));
            this.LLILZ = Math.round(typedArrayObtainStyledAttributes.getDimension(R$styleable.VideoEditView_frameHeight, 0.0f));
        }
        RecyclerView recyclerView = new RecyclerView(context);
        this.LLILLJJLI = recyclerView;
        recyclerView.setOverScrollMode(2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        RecyclerView recyclerView2 = this.LLILLJJLI;
        addView(recyclerView2 == null ? null : recyclerView2, layoutParams);
        RecyclerView recyclerView3 = this.LLILLJJLI;
        (recyclerView3 != null ? recyclerView3 : null).addOnScrollListener(new AsS55S0100000_29(this, 4));
    }
}
