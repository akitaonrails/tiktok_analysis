package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.scene.group.UserVisibleHintGroupScene;

/* JADX INFO: renamed from: X.0MR0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0MR0<T> extends PagerAdapter {
    public final SparseArray<T> LLILLJJLI = new SparseArray<>();
    public T LLILLL;

    public abstract UserVisibleHintGroupScene LJJIJIL(int i, ViewGroup viewGroup);

    public abstract Object LJJIJL(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        this.LLILLL = (T) LJJIJIL(i, viewGroup);
    }
}
