package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0ipb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257610ipb<T extends AmeBaseFragment> extends FragmentStateAdapter {
    public final List<? extends T> LLJI;
    public final List<Integer> LLJIJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<? extends T> list = this.LLJI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createFragment, position = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        AmeBaseFragment ameBaseFragmentLLLILZLLLI = LLLILZLLLI(i);
        if (ameBaseFragmentLLLILZLLLI == null) {
            return new Fragment();
        }
        return ameBaseFragmentLLLILZLLLI;
    }

    public final T LLLILZLLLI(int i) {
        List<? extends T> list;
        List<? extends T> list2;
        if (i < 0 || (list = this.LLJI) == null || i >= list.size() || (list2 = this.LLJI) == null) {
            return null;
        }
        return (T) ListProtector.get(list2, i);
    }

    public final int LLLJ(int i) {
        List<Integer> list;
        List<Integer> list2;
        if (i < 0 || (list = this.LLJIJIL) == null || i >= list.size() || (list2 = this.LLJIJIL) == null) {
            return -1;
        }
        return ((Number) ListProtector.get(list2, i)).intValue();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC21673619ry
    public final long getItemId(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemId, position = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        AmeBaseFragment ameBaseFragmentLLLILZLLLI = LLLILZLLLI(i);
        if (ameBaseFragmentLLLILZLLLI != null) {
            i = ameBaseFragmentLLLILZLLLI.hashCode();
        }
        return i;
    }

    public C1257610ipb(Fragment fragment, List<? extends T> list, List<Integer> list2) {
        super(fragment);
        this.LLJI = list;
        this.LLJIJIL = list2;
    }
}
