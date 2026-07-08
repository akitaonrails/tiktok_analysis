package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public abstract class PagerAdapter {
    public final DataSetObservable LL = new DataSetObservable();
    public DataSetObserver mViewPagerObserver;

    public void LJIJ(View view) {
    }

    public int LJIJJ(Object obj) {
        return -1;
    }

    public CharSequence LJIJJLI(int i) {
        return null;
    }

    public float LJIL(int i) {
        return 1.0f;
    }

    public abstract boolean LJJIFFI(View view, Object obj);

    public void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable LJJIIJ() {
        return null;
    }

    public void LJJIIJZLJL(int i, View view, Object obj) {
    }

    public void LJJIJ(View view) {
    }

    public abstract int getCount();

    public void notifyDataSetChanged() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.mViewPagerObserver;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LL.notifyChanged();
    }

    public void LJIJI(ViewGroup viewGroup) {
        LJIJ(viewGroup);
    }

    public void LJJII(DataSetObserver dataSetObserver) {
        this.LL.registerObserver(dataSetObserver);
    }

    public void LJJIIZI(DataSetObserver dataSetObserver) {
        synchronized (this) {
            try {
                this.mViewPagerObserver = dataSetObserver;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void LJJIJIIJI(ViewGroup viewGroup) {
        LJJIJ(viewGroup);
    }

    public void LJJIJIIJIL(DataSetObserver dataSetObserver) {
        this.LL.unregisterObserver(dataSetObserver);
    }

    public Object LJJ(int i, View view) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object LJJI(int i, ViewGroup viewGroup) {
        return LJJ(i, viewGroup);
    }

    public void LJIILLIIL(int i, View view, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        LJIILLIIL(i, viewGroup, obj);
    }

    public void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        LJJIIJZLJL(i, viewGroup, obj);
    }
}
