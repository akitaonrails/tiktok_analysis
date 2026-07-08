package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0HFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437940HFg extends AbstractC480470Isn {
    public final List<Fragment> LLIZ;
    public final List<String> LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return (CharSequence) ListProtector.get(this.LLIZLLLIL, i);
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        return (Fragment) ListProtector.get(this.LLIZ, i);
    }

    public C437940HFg(FragmentManager fragmentManager, List<Fragment> list, List<String> list2) {
        super(fragmentManager, 1);
        this.LLIZ = list;
        this.LLIZLLLIL = list2;
    }
}
