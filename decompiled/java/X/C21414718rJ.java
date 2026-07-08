package X;

import android.app.SearchableInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView$SavedState;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18rJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21414718rJ extends LinearLayoutCompat implements InterfaceC21550519Vn {
    public static final C21414418rG LLJJJJLIIL;
    public View.OnClickListener LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public AbstractC21672619ro LLJJIJIIJIL;
    public CharSequence LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public SearchableInfo LLJJJJJIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.LLJJJ = true;
        super.clearFocus();
        throw null;
    }

    public int getSuggestionCommitIconResId() {
        return 0;
    }

    public int getSuggestionRowLayout() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        post(null);
        super.onDetachedFromWindow();
    }

    public void setAppSearchData(Bundle bundle) {
    }

    public void setOnCloseListener(InterfaceC21414618rI interfaceC21414618rI) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnQueryTextListener(InterfaceC21414818rK interfaceC21414818rK) {
    }

    public void setOnSuggestionListener(InterfaceC21414918rL interfaceC21414918rL) {
    }

    static {
        LLJJJJLIIL = Build.VERSION.SDK_INT < 29 ? new C21414418rG() : null;
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.LLJJIJIL;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.LLJJJJJIL;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return null;
        }
        return getContext().getText(this.LLJJJJJIL.getHintId());
    }

    @Override // X.InterfaceC21550519Vn
    public final void onActionViewExpanded() {
        if (this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = true;
        throw null;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.dg);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.dh);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(super.onSaveInstanceState());
        searchView$SavedState.LL = this.LLJJIJI;
        return searchView$SavedState;
    }

    public int getImeOptions() {
        throw null;
    }

    public int getInputType() {
        throw null;
    }

    public int getMaxWidth() {
        return this.LLJJJIL;
    }

    public CharSequence getQuery() {
        throw null;
    }

    public AbstractC21672619ro getSuggestionsAdapter() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC21550519Vn
    public final void onActionViewCollapsed() {
        throw null;
    }

    private void setQuery(CharSequence charSequence) {
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SearchView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SearchView$SavedState searchView$SavedState = (SearchView$SavedState) parcelable;
        super.onRestoreInstanceState(searchView$SavedState.mSuperState);
        this.LLJJIJI = searchView$SavedState.LL;
        throw null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(null);
    }

    public void setIconified(boolean z) {
        if (z) {
            throw null;
        }
        this.LLJJIJI = false;
        throw null;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.LLJJIII == z) {
            return;
        }
        this.LLJJIII = z;
        this.LLJJIJI = z;
        throw null;
    }

    public void setImeOptions(int i) {
        throw null;
    }

    public void setInputType(int i) {
        throw null;
    }

    public void setMaxWidth(int i) {
        this.LLJJJIL = i;
        requestLayout();
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.LLJJI = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.LLJJIJIL = charSequence;
        getQueryHint();
        throw null;
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        AbstractC21672619ro abstractC21672619ro = this.LLJJIJIIJIL;
        if (abstractC21672619ro instanceof ViewOnClickListenerC21672519rn) {
            ViewOnClickListenerC21672519rn viewOnClickListenerC21672519rn = (ViewOnClickListenerC21672519rn) abstractC21672619ro;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            viewOnClickListenerC21672519rn.LLILZIL = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.LLJJJJJIL = searchableInfo;
        if (searchableInfo == null) {
            this.LLJJIJI = this.LLJJIJI;
            throw null;
        }
        searchableInfo.getSuggestThreshold();
        throw null;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.LLJJIJI = this.LLJJIJI;
        throw null;
    }

    public void setSuggestionsAdapter(AbstractC21672619ro abstractC21672619ro) {
        this.LLJJIJIIJIL = abstractC21672619ro;
        throw null;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.LLJJIJI) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.LLJJJIL) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.LLJJJIL;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.LLJJJIL;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.LLJJJ || !isFocusable()) {
            return false;
        }
        if (this.LLJJIJI) {
            return super.requestFocus(i, rect);
        }
        throw null;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z) {
        } else {
            throw null;
        }
    }
}
