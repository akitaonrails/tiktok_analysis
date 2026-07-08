package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.19fP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21595719fP extends PagerAdapter {
    public final PagerAdapter LLILLJJLI;

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

    public final void LJJIJIL() {
        super.notifyDataSetChanged();
    }

    public C21595719fP(PagerAdapter pagerAdapter) {
        this.LLILLJJLI = pagerAdapter;
        pagerAdapter.LJJII(new DataSetObserver(this) { // from class: X.19fR
            public final C21595719fP LIZ;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                C21595719fP c21595719fP = this.LIZ;
                if (c21595719fP != null) {
                    c21595719fP.LJJIJIL();
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
    public final void LJIJ(View view) {
        this.LLILLJJLI.LJIJ(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) {
        this.LLILLJJLI.LJIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJII(DataSetObserver dataSetObserver) {
        this.LLILLJJLI.LJJII(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJ(View view) {
        this.LLILLJJLI.LJJIJ(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
        this.LLILLJJLI.LJJIJIIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJIL(DataSetObserver dataSetObserver) {
        this.LLILLJJLI.LJJIJIIJIL(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return this.LLILLJJLI.LJJIFFI(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
        this.LLILLJJLI.LJJIII(parcelable, classLoader);
    }
}
