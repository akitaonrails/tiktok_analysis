package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0HI8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HI8 extends AbstractC480470Isn {
    public final List<Fragment> LLIZ;
    public final List<String> LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        if (this.LLIZ.size() > i) {
            return (CharSequence) ListProtector.get(this.LLIZLLLIL, i);
        }
        return null;
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        if (this.LLIZ.size() > i) {
            return (Fragment) ListProtector.get(this.LLIZ, i);
        }
        return new Fragment();
    }

    public C0HI8(FragmentManager fragmentManager, List<Fragment> list, List<String> list2) {
        super(fragmentManager, 1);
        this.LLIZ = list;
        this.LLIZLLLIL = list2;
    }
}
