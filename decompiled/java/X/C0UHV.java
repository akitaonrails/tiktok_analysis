package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UHV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UHV extends AbstractC480450Isl {
    public final C01GW LLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((List) this.LLJ.getValue()).size();
    }

    public C0UHV(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(340));
    }

    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        return ((C0UHQ) ListProtector.get((List) this.LLJ.getValue(), i)).LIZLLL.invoke();
    }
}
