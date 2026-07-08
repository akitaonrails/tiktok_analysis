package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0xD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810330xD5 extends AbstractC480470Isn {
    public final List<Fragment> LLIZ;
    public final List<RankTabInfo> LLIZLLLIL;

    @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLIZ).size();
    }

    public C1810330xD5(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return C1133830fbx.LJIILIIL(((RankTabInfo) ListProtector.get(this.LLIZLLLIL, i)).title, ((RankTabInfo) ListProtector.get(this.LLIZLLLIL, i)).LIZ).toString();
    }

    @Override // X.AbstractC480470Isn
    public final Fragment LJJIJIL(int i) {
        return (Fragment) ListProtector.get(this.LLIZ, i);
    }

    public final void LJJIJLIJ(List<? extends Fragment> list, List<RankTabInfo> list2) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() != list2.size()) {
            return;
        }
        ((ArrayList) this.LLIZ).clear();
        ((ArrayList) this.LLIZLLLIL).clear();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                ((ArrayList) this.LLIZ).add(obj);
                ((ArrayList) this.LLIZLLLIL).add(ListProtector.get(list2, i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        notifyDataSetChanged();
    }
}
