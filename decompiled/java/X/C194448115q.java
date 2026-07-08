package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.discover.adapter.AbstractLoadingLayout$SavedState;

/* JADX INFO: renamed from: X.115q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C194448115q extends FrameLayout {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public int LLILZIL;

    public View LIZ(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    public View LIZIZ(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    public View LIZJ(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    public void LIZLLL(int i) {
    }

    public final void setListener(InterfaceC19414310xR interfaceC19414310xR) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        AbstractLoadingLayout$SavedState abstractLoadingLayout$SavedState = new AbstractLoadingLayout$SavedState(super.onSaveInstanceState());
        abstractLoadingLayout$SavedState.state = this.LLILZIL;
        return abstractLoadingLayout$SavedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AbstractLoadingLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AbstractLoadingLayout$SavedState abstractLoadingLayout$SavedState = (AbstractLoadingLayout$SavedState) parcelable;
        setState(abstractLoadingLayout$SavedState.state);
        super.onRestoreInstanceState(abstractLoadingLayout$SavedState.getSuperState());
    }

    public final void setState(int i) {
        if (i != 0 && i != 1 && i != 3 && i != 2) {
            "state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.".toString();
            throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
        }
        if (this.LLILZIL != i) {
            this.LLILZIL = i;
            LIZLLL(i);
        }
    }

    public C194448115q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = LIZJ(context, attributeSet, i);
        this.LLILLL = LIZ(context, attributeSet, i);
        this.LLILZ = LIZIZ(context, attributeSet, i);
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
            } else {
                "LoadingLayout can only contain one direct custom child.".toString();
                throw new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
            }
        }
        super.addView(view, i, layoutParams);
    }
}
