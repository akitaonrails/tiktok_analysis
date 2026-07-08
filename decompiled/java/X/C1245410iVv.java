package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245410iVv extends AbstractC480450Isl {
    public final C01GW LLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((List) this.LLJ.getValue()).size();
    }

    public C1245410iVv(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(47));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return ((C1245440iVy) ListProtector.get((List) this.LLJ.getValue(), i)).LIZIZ;
    }

    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        return ((C1245440iVy) ListProtector.get((List) this.LLJ.getValue(), i)).LIZ;
    }

    public final void LJJIJL(C1245440iVy c1245440iVy) {
        if (!((List) this.LLJ.getValue()).contains(c1245440iVy)) {
            ((List) this.LLJ.getValue()).add(c1245440iVy);
        }
    }
}
