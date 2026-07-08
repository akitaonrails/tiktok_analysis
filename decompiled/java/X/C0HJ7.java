package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0HJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HJ7 extends AbstractC480470Isn {
    public final List<Fragment> LLIZ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLIZ).size();
    }

    public C0HJ7(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLIZ = new ArrayList();
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        return (Fragment) ListProtector.get(this.LLIZ, i);
    }
}
