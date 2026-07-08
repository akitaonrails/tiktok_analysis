package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0eU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090550eU9 extends View {
    public final int LL;
    public final int LLILLJJLI;
    public WeakReference<View> LLILLL;

    public final void setOnInflateListener(InterfaceC1090560eUA interfaceC1090560eUA) {
    }

    public final void LIZ() {
        ViewGroup viewGroup;
        WeakReference<View> weakReference = this.LLILLL;
        if (weakReference == null || weakReference.get() == null) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null || this.LL == 0) {
                return;
            }
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), this.LL, viewGroup, false);
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
        }
    }

    public final View getInflatedView() {
        WeakReference<View> weakReference = this.LLILLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C0BTX.LIZ()) {
            return;
        }
        LIZ();
    }

    public C1090550eU9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CommentLazyViewStub);
        this.LL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CommentLazyViewStub_lazyLayout, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CommentLazyViewStub_lazyInflatedId, -1);
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
