package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.19fW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21596419fW extends PagerAdapter {
    public final PagerAdapter LLILLJJLI;
    public boolean LLILLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLJJLI.getCount();
    }

    public C21596419fW(PagerAdapter pagerAdapter) {
        this.LLILLJJLI = pagerAdapter;
        pagerAdapter.LJJII(new DataSetObserver(this) { // from class: X.19fZ
            public final C21596419fW LIZ;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                C21596419fW c21596419fW = this.LIZ;
                if (c21596419fW != null) {
                    c21596419fW.notifyDataSetChanged();
                }
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                onChanged();
            }

            {
                this.LIZ = this;
            }
        });
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        int iLJIJJ = this.LLILLJJLI.LJIJJ(obj);
        if (this.LLILLL) {
            if (iLJIJJ == -2 || iLJIJJ == -1) {
                return -2;
            }
            return (getCount() - iLJIJJ) - 1;
        }
        return iLJIJJ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        if (this.LLILLL) {
            i = (getCount() - i) - 1;
        }
        return this.LLILLJJLI.LJIJJLI(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIL(int i) {
        if (this.LLILLL) {
            i = (getCount() - i) - 1;
        }
        return this.LLILLJJLI.LJIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @InterfaceC1294060jmO
    public final Object LJJ(int i, View view) {
        if (this.LLILLL) {
            i = (getCount() - i) - 1;
        }
        return this.LLILLJJLI.LJJ(i, view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        if (this.LLILLL) {
            i = (getCount() - i) - 1;
        }
        return this.LLILLJJLI.LJJI(i, viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return this.LLILLJJLI.LJJIFFI(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @InterfaceC1294060jmO
    public final void LJIILLIIL(int i, View view, Object obj) {
        if (this.LLILLL) {
            i = (getCount() - i) - 1;
        }
        this.LLILLJJLI.LJIILLIIL(i, view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (this.LLILLL) {
            i = (getCount() - i) - 1;
        }
        this.LLILLJJLI.LJIIZILJ(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @InterfaceC1294060jmO
    public final void LJJIIJZLJL(int i, View view, Object obj) {
        if (this.LLILLL) {
            i = (getCount() - i) - 1;
        }
        this.LLILLJJLI.LJJIIJZLJL(i, view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        if (this.LLILLL) {
            i = (getCount() - i) - 1;
        }
        this.LLILLJJLI.LJJIIZ(viewGroup, i, obj);
    }
}
