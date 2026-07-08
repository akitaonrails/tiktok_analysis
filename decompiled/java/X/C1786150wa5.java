package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingFirstTabPageFragment;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0wa5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786150wa5 extends FragmentStateAdapter {
    public final List<C1779500wPM> LLJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemCount size=");
        sbLIZ.append(((ArrayList) this.LLJI).size());
        C20441214yg.LIZIZ("CreatorRankingFirstTabPagerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return ((ArrayList) this.LLJI).size();
    }

    public C1786150wa5(CreatorRankingPageDialogFragment creatorRankingPageDialogFragment) {
        super(creatorRankingPageDialogFragment);
        this.LLJI = new ArrayList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean LLLI(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("containsItem itemId=");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("CreatorRankingFirstTabPagerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        List<C1779500wPM> list = this.LLJI;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C1779500wPM> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ == j) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        int i2;
        C1779500wPM c1779500wPM = (C1779500wPM) C13LP.LJJJLZIJ(i, this.LLJI);
        if (c1779500wPM != null) {
            i2 = c1779500wPM.LIZ;
        } else {
            i2 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createFragment position=");
        sbLIZ.append(i);
        sbLIZ.append(" firstRankType=");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("CreatorRankingFirstTabPagerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("newInstance enter firstRankType=");
        sbLIZ2.append(i2);
        C20441214yg.LIZIZ("CreatorRankingFirstTabPageFragment", C2188811AlT.LIZIZ(sbLIZ2));
        CreatorRankingFirstTabPageFragment creatorRankingFirstTabPageFragment = new CreatorRankingFirstTabPageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_first_rank_type", i2);
        creatorRankingFirstTabPageFragment.setArguments(bundle);
        return creatorRankingFirstTabPageFragment;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC21673619ry
    public final long getItemId(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getItemId position=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CreatorRankingFirstTabPagerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        C1779500wPM c1779500wPM = (C1779500wPM) C13LP.LJJJLZIJ(i, this.LLJI);
        if (c1779500wPM != null) {
            i = c1779500wPM.LIZ;
        }
        return i;
    }
}
