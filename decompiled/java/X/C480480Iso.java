package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480480Iso extends AbstractC480470Isn {
    public final C19311810gu LLIZ;
    public final Map<Long, Fragment> LLIZLLLIL;
    public List<String> LLJ;
    public final Fragment LLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (!(obj instanceof Fragment)) {
            obj = null;
        }
        int count = getCount();
        for (int i = 0; i < count; i++) {
            if (Intrinsics.LJFF(LJJIJIL(i), obj)) {
                return i;
            }
        }
        return -2;
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        Fragment fragment = this.LLIZLLLIL.get(Long.valueOf(LJJIJL(i)));
        if (fragment != null) {
            return fragment;
        }
        return this.LLJI;
    }

    @Override // X.AbstractC480470Isn
    public final long LJJIJL(int i) {
        return ((String) ListProtector.get(this.LLJ, i)).hashCode();
    }

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        super.LJJIIZ(viewGroup, i, obj);
        this.LLIZ.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C480480Iso(FragmentManager fragmentManager, C19311810gu c19311810gu, Map<Long, ? extends Fragment> map, List<String> list, Fragment fragment) {
        super(fragmentManager, 1);
        this.LLIZ = c19311810gu;
        this.LLIZLLLIL = map;
        this.LLJ = list;
        this.LLJI = fragment;
    }
}
