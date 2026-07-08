package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.19fQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21595819fQ extends PagerAdapter {
    public static final Field LLILZ;
    public final PagerAdapter LLILLJJLI;
    public final int LLILLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            LLILZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJJIIJ() {
        return this.LLILLJJLI.LJJIIJ();
    }

    public final void LJJIJIL() {
        try {
            Field field = LLILZ;
            Object obj = field.get(this);
            Object obj2 = field.get(this.LLILLJJLI);
            if (obj != null || obj2 == null) {
                return;
            }
            field.set(this.LLILLJJLI, null);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        try {
            Field field = LLILZ;
            field.set(this.LLILLJJLI, field.get(this));
            return this.LLILLJJLI.getCount() == 1 ? this.LLILLJJLI.getCount() : this.LLILLL;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.LLILLJJLI.notifyDataSetChanged();
    }

    public C21595819fQ(AbstractC1762740vyK abstractC1762740vyK) {
        this(abstractC1762740vyK, Integer.MAX_VALUE);
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
    public final CharSequence LJIJJLI(int i) {
        return this.LLILLJJLI.LJIJJLI(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIL(int i) {
        return this.LLILLJJLI.LJIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJII(DataSetObserver dataSetObserver) {
        this.LLILLJJLI.LJJII(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJ(View view) {
        LJJIJIL();
        this.LLILLJJLI.LJJIJ(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
        LJJIJIL();
        this.LLILLJJLI.LJJIJIIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJIL(DataSetObserver dataSetObserver) {
        this.LLILLJJLI.LJJIJIIJIL(dataSetObserver);
    }

    public C21595819fQ(AbstractC1762740vyK abstractC1762740vyK, int i) {
        abstractC1762740vyK.getClass();
        this.LLILLJJLI = abstractC1762740vyK;
        this.LLILLL = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJ(int i, View view) {
        int count = this.LLILLJJLI.getCount();
        if (count == 0) {
            return null;
        }
        return this.LLILLJJLI.LJJ(i % count, view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        int count = this.LLILLJJLI.getCount();
        if (count == 0) {
            return null;
        }
        return this.LLILLJJLI.LJJI(i % count, viewGroup);
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
    public final void LJIILLIIL(int i, View view, Object obj) {
        int count = this.LLILLJJLI.getCount();
        if (count == 0) {
            return;
        }
        this.LLILLJJLI.LJIILLIIL(i / count, view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        int count = this.LLILLJJLI.getCount();
        if (count == 0) {
            return;
        }
        this.LLILLJJLI.LJIIZILJ(viewGroup, i / count, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIJZLJL(int i, View view, Object obj) {
        this.LLILLJJLI.LJJIIJZLJL(i, view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        this.LLILLJJLI.LJJIIZ(viewGroup, i, obj);
    }
}
