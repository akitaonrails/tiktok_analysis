package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.19fO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21595619fO extends AbstractC480470Isn {
    public final PagerAdapter LLIZ;

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJJIIJ() {
        return this.LLIZ.LJJIIJ();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.LLIZ.notifyDataSetChanged();
    }

    public final void LJJIJLIJ() {
        super.notifyDataSetChanged();
    }

    public C21595619fO(PagerAdapter pagerAdapter) {
        super(null, 0);
        this.LLIZ = pagerAdapter;
        pagerAdapter.LJJII(new DataSetObserver(this) { // from class: X.19fT
            public final C21595619fO LIZ;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                C21595619fO c21595619fO = this.LIZ;
                if (c21595619fO == null) {
                    return;
                }
                c21595619fO.LJJIJLIJ();
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
        this.LLIZ.LJIJ(view);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) {
        this.LLIZ.LJIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJII(DataSetObserver dataSetObserver) {
        this.LLIZ.LJJII(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJ(View view) {
        this.LLIZ.LJJIJ(view);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
        this.LLIZ.LJJIJIIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJIL(DataSetObserver dataSetObserver) {
        this.LLIZ.LJJIJIIJIL(dataSetObserver);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return this.LLIZ.LJJIFFI(view, obj);
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
        this.LLIZ.LJJIII(parcelable, classLoader);
    }
}
