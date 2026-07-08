package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout$SavedState;

/* JADX INFO: renamed from: X.115r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C194449115r extends FrameLayout {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public int LLILZIL;

    public View LIZ(Context context) {
        return null;
    }

    public View LIZIZ(Context context) {
        return null;
    }

    public View LIZJ(Context context, AttributeSet attributeSet) {
        return null;
    }

    public void LIZLLL(int i) {
    }

    public final void setListener(InterfaceC194450115s interfaceC194450115s) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        AbstractLoadingLayout$SavedState abstractLoadingLayout$SavedState = new AbstractLoadingLayout$SavedState(super.onSaveInstanceState());
        abstractLoadingLayout$SavedState.LL = this.LLILZIL;
        return abstractLoadingLayout$SavedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AbstractLoadingLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AbstractLoadingLayout$SavedState abstractLoadingLayout$SavedState = (AbstractLoadingLayout$SavedState) parcelable;
        setState(abstractLoadingLayout$SavedState.LL);
        super.onRestoreInstanceState(abstractLoadingLayout$SavedState.getSuperState());
    }

    public final void setState(int i) {
        if (i != 0 && i != 1 && i != 3 && i != 2) {
            throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
        }
        if (this.LLILZIL != i) {
            this.LLILZIL = i;
            LIZLLL(i);
        }
    }

    public C194449115r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = LIZJ(context, attributeSet);
        this.LLILLL = LIZ(context);
        this.LLILZ = LIZIZ(context);
        View view = this.LLILLJJLI;
        if (view != null) {
            addView(view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            addView(view2);
        }
        View view3 = this.LLILZ;
        if (view3 != null) {
            addView(view3);
        }
        setState(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != this.LLILLJJLI && view != this.LLILLL && view != this.LLILZ) {
            if (getChildCount() <= 4) {
                super.addView(view, i, layoutParams);
                this.LL = view;
                return;
            }
            throw new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
        }
        super.addView(view, i, layoutParams);
    }
}
