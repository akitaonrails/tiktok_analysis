package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.19fV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21596319fV extends AbstractC480470Isn {
    public final PagerAdapter LLIZ;
    public final /* synthetic */ C21599719g3 LLIZLLLIL;

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJJIIJ() {
        return this.LLIZ.LJJIIJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.getCount();
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) {
        this.LLIZ.LJIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        int iLJIJJ = this.LLIZ.LJIJJ(obj);
        if (this.LLIZLLLIL.LJJJ()) {
            if (iLJIJJ != -1 && iLJIJJ != -2) {
                return (getCount() - iLJIJJ) - 1;
            }
            return -2;
        }
        return iLJIJJ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        return this.LLIZ.LJIJJLI(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIL(int i) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        return this.LLIZ.LJIL(i);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
        this.LLIZ.LJJIJIIJI(viewGroup);
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        return ((AbstractC480470Isn) this.LLIZ).LJJIJIL(i);
    }

    @Override // X.AbstractC480470Isn
    public final long LJJIJL(int i) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21596319fV(C21599719g3 c21599719g3, PagerAdapter pagerAdapter) {
        super(null, 0);
        this.LLIZLLLIL = c21599719g3;
        this.LLIZ = pagerAdapter;
        pagerAdapter.LJJII(new DataSetObserver(this) { // from class: X.19fX
            public final C21596319fV LIZ;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                C21596319fV c21596319fV = this.LIZ;
                if (c21596319fV != null) {
                    c21596319fV.notifyDataSetChanged();
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
    public final Object LJJ(int i, View view) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        return this.LLIZ.LJJ(i, view);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        return this.LLIZ.LJJI(i, viewGroup);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return this.LLIZ.LJJIFFI(view, obj);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
        this.LLIZ.LJJIII(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIILLIIL(int i, View view, Object obj) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        this.LLIZ.LJIILLIIL(i, view, obj);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        if (i < 0) {
            i = 0;
        }
        this.LLIZ.LJIIZILJ(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIJZLJL(int i, View view, Object obj) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        this.LLIZ.LJJIIJZLJL(i, view, obj);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        if (this.LLIZLLLIL.LJJJ()) {
            i = (getCount() - i) - 1;
        }
        this.LLIZ.LJJIIZ(viewGroup, i, obj);
    }
}
