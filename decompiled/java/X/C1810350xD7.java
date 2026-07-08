package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0xD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810350xD7 extends AbstractC480450Isl implements InterfaceC1811210xEV {
    public final List<VisibilityFragment> LLJ;
    public final List<SubRankTabInfo> LLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLJ).size();
    }

    public C1810350xD7(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLJ = new ArrayList();
        this.LLJI = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (C13LP.LJJJJ(obj, this.LLJ)) {
            return ((ArrayList) this.LLJ).indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return C1133830fbx.LJIILIIL(((SubRankTabInfo) ListProtector.get(this.LLJI, i)).title, "").toString();
    }

    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        return (Fragment) ListProtector.get(this.LLJ, i);
    }
}
