package androidx.appcompat.widget;

import X.C1602160rnK;
import X.C786410Ut5;
import X.InterfaceC726260SeG;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ViewStubCompat extends View {
    public int LL;
    public int LLILLJJLI;
    public WeakReference<View> LLILLL;
    public LayoutInflater LLILZ;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(InterfaceC726260SeG interfaceC726260SeG) {
    }

    public final View LIZ() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.LL == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterNe = this.LLILZ;
        if (layoutInflaterNe == null) {
            layoutInflaterNe = C786410Ut5.ne(getContext());
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, this.LL, viewGroup, false);
        int i = this.LLILLJJLI;
        if (i != -1) {
            viewTd.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        C786410Ut5.LJJLJLI(this, viewGroup);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewTd, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewTd, iIndexOfChild);
        }
        this.LLILLL = new WeakReference<>(viewTd);
        return viewTd;
    }

    public int getInflatedId() {
        return this.LLILLJJLI;
    }

    public LayoutInflater getLayoutInflater() {
        return this.LLILZ;
    }

    public int getLayoutResource() {
        return this.LL;
    }

    public void setInflatedId(int i) {
        this.LLILLJJLI = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.LLILZ = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.LL = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.LLILLL;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                C786410Ut5.LJLLLLLL(i, view);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        LIZ();
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewStubCompat, 0, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_inflatedId, -1);
        this.LL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
