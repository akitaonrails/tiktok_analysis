package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0rUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590400rUM extends AbstractC1590410rUN<CommonPageFragment> {
    public List<C1590430rUP> LLIZ;
    public HashMap<String, C1590430rUP> LLIZLLLIL;
    public List<C1590430rUP> LLJ;
    public final FragmentManager LLJI;
    public int LLJIJIL;
    public InterfaceC1590450rUR LLJILJIL;
    public C2115308Ql LLJILJILJ;

    @Override // X.C0IOK, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // X.C0IOK, androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) {
        super.LJIJI(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return LJJIL(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIL(int i) {
        C1590430rUP c1590430rUP;
        if (i >= 0 && i < this.LLJ.size() && (c1590430rUP = (C1590430rUP) ListProtector.get(this.LLJ, i)) != null) {
            float f = c1590430rUP.LIZLLL;
            if (f > 0.0f) {
                return f;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    @Override // X.C0IOK
    public final long LJJIJL(int i) {
        List<C1590430rUP> list;
        if (this.LLJ != null && (list = this.LLIZ) != null) {
            return list.indexOf(ListProtector.get(r0, i));
        }
        return i;
    }

    public final CommonPageFragment LJJIJLIJ(String str) {
        Fragment fragment;
        List<C1590430rUP> list = this.LLJ;
        int i = 0;
        if (list != null) {
            int size = ((ArrayList) list).size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (TextUtils.equals(str, ((C1590430rUP) ListProtector.get(this.LLJ, i2)).LIZIZ)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        HashMap<Integer, T> map = this.LLILZLL;
        if (map != 0 && !map.isEmpty()) {
            fragment = (Fragment) this.LLILZLL.get(Integer.valueOf(i));
        } else {
            fragment = null;
        }
        return (CommonPageFragment) fragment;
    }

    public final String LJJIL(int i) {
        if (i >= 0 && i < ((ArrayList) this.LLJ).size()) {
            return ((C1590430rUP) ListProtector.get(this.LLJ, i)).LIZIZ;
        }
        return "";
    }

    public C1590400rUM(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        this.LLJI = fragmentManager;
    }

    public static String LJJIZ(int i, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(i);
        sbLIZ.append(":");
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1590410rUN, X.C0IOK, androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        this.LLJIJIL = viewGroup.getId();
        return super.LJJI(i, viewGroup);
    }
}
