package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21596819fa extends PagerAdapter {
    public final PagerAdapter LLILLJJLI;
    public final C21596919fb LLILLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJJIIJ() {
        return this.LLILLJJLI.LJJIIJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLJJLI.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.LLILLJJLI.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.19fb, android.database.DataSetObserver] */
    public C21596819fa(PagerAdapter pagerAdapter) {
        this.LLILLJJLI = pagerAdapter;
        ?? r0 = new DataSetObserver() { // from class: X.19fb
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super/*androidx.viewpager.widget.PagerAdapter*/.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                onChanged();
            }
        };
        this.LLILLL = r0;
        pagerAdapter.LJJII(r0);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) {
        this.LLILLJJLI.LJIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        int iLJIJJ = this.LLILLJJLI.LJIJJ(obj);
        if (iLJIJJ != -1 && iLJIJJ != -2) {
            return LJJIJL(iLJIJJ);
        }
        return iLJIJJ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return this.LLILLJJLI.LJIJJLI(LJJIJL(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIL(int i) {
        return this.LLILLJJLI.LJIL(LJJIJL(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJII(DataSetObserver dataSetObserver) {
        try {
            this.LLILLJJLI.LJJII(dataSetObserver);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
        this.LLILLJJLI.LJJIJIIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJIL(DataSetObserver dataSetObserver) {
        try {
            this.LLILLJJLI.LJJIJIIJIL(dataSetObserver);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final int LJJIJL(int i) {
        return (getCount() - i) - 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        return this.LLILLJJLI.LJJI(LJJIJL(i), viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return this.LLILLJJLI.LJJIFFI(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
        this.LLILLJJLI.LJJIII(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        this.LLILLJJLI.LJIIZILJ(viewGroup, LJJIJL(i), obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        this.LLILLJJLI.LJJIIZ(viewGroup, LJJIJL(i), obj);
    }
}
