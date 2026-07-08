package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.ui.BaseDiscoverTabFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.116v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194479116v extends AbstractC480450Isl {
    public final Context LLJ;
    public final List<BaseDiscoverTabFragment> LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLJI).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        if (LJJIJL(i).NR() != 0) {
            return this.LLJ.getString(LJJIJL(i).NR());
        }
        LJJIJL(i);
        return "null";
    }

    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        return LJJIJL(i);
    }

    public final BaseDiscoverTabFragment LJJIJL(int i) {
        return (BaseDiscoverTabFragment) ListProtector.get(this.LLJI, i);
    }

    public C194479116v(Context context, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.LLJ = context;
        this.LLJI = new ArrayList();
        this.LLJIJIL = -1;
        this.LLJILJIL = -1;
        this.LLJILJILJ = -1;
    }

    public final void LJJIJLIJ(BaseDiscoverTabFragment baseDiscoverTabFragment, boolean z) {
        String str;
        String strMR = baseDiscoverTabFragment.MR();
        if (z) {
            C0N1U.LIZ.getClass();
            C0N1U.LIZ(strMR, "default_landing_page", "default_landing_page");
            return;
        }
        BaseDiscoverTabFragment baseDiscoverTabFragmentLJJIJL = LJJIJL(this.LLJIJIL);
        if (baseDiscoverTabFragmentLJJIJL == null) {
            return;
        }
        String strMR2 = baseDiscoverTabFragmentLJJIJL.MR();
        if (this.LLJILJIL == this.LLJILJILJ) {
            str = "click";
        } else {
            this.LLJILJILJ = -1;
            str = "slide";
        }
        C0N1U.LIZ.getClass();
        C0N1U.LIZ(strMR, strMR2, str);
    }

    @Override // X.AbstractC480450Isl, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        super.LJIIZILJ(viewGroup, i, obj);
        ListProtector.remove(this.LLJI, i);
        notifyDataSetChanged();
    }
}
