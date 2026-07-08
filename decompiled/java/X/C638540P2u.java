package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.components.tabs.TabChildParams;
import com.ss.android.ugc.aweme.components.tabs.TabFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0P2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638540P2u extends AbstractC480450Isl {
    public final List<TabChildParams> LLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return ((TabChildParams) ListProtector.get(this.LLJ, i)).tabTitle;
    }

    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        TabChildParams tabChildParams = (TabChildParams) ListProtector.get(this.LLJ, i);
        TabFragment tabFragment = new TabFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "tab_child_params", tabChildParams);
        tabFragment.setArguments(bundle);
        return tabFragment;
    }

    public C638540P2u(FragmentManager fragmentManager, List<TabChildParams> list) {
        super(fragmentManager, 1);
        this.LLJ = list;
    }
}
