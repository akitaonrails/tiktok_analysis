package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.15GJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15GJ extends AbstractC650170Pep {
    public final ArrayList<MusicClassDetailFragment> LLILZLL;
    public final ArrayList<MusicCollectionItem> LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final int LLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.size();
    }

    @Override // X.AbstractC650180Peq
    public final Object LJJIJIL(int i) {
        return ListProtector.get(this.LLILZLL, i);
    }

    public C15GJ(final FragmentManager fragmentManager, String str, int i, String str2) {
        new AbstractC650180Peq<Fragment>(fragmentManager) { // from class: X.0Pep
            public final FragmentManager LLILZ;
            public C19EH LLILZIL;

            @Override // androidx.viewpager.widget.PagerAdapter
            public final void LJJIJIIJI(ViewGroup viewGroup) {
            }

            {
                this.LLILZ = fragmentManager;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final void LJIJI(ViewGroup viewGroup) {
                C19EH c19eh = this.LLILZIL;
                if (c19eh == null) {
                    return;
                }
                c19eh.LJIIJ();
                this.LLILZIL = null;
                this.LLILZ.LJJJJL();
            }

            public static String LJJIJL(int i2, long j) {
                return "android:switcher:" + i2 + ':' + j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // androidx.viewpager.widget.PagerAdapter
            public final Object LJJI(int i2, ViewGroup viewGroup) throws Throwable {
                Fragment fragment;
                if (this.LLILZIL == null) {
                    this.LLILZIL = this.LLILZ.LJIIJ();
                }
                String strLJJIJL = LJJIJL(viewGroup.getId(), i2);
                Fragment fragmentLJJJJZI = this.LLILZ.LJJJJZI(strLJJIJL);
                if (fragmentLJJJJZI == null) {
                    Fragment fragment2 = (Fragment) LJJIJIL(i2);
                    if (fragment2 instanceof InterfaceC650190Per) {
                        this.LLILLJJLI.put(i2, (T) fragment2);
                        fragment = fragment2;
                    } else {
                        this.LLILZIL.LIZJ(viewGroup.getId(), fragment2, strLJJIJL);
                        fragment = fragment2;
                    }
                } else {
                    this.LLILZIL.LJIIIIZZ(fragmentLJJJJZI);
                    fragment = fragmentLJJJJZI;
                }
                if (this.LLILLL != fragment) {
                    fragment.setUserVisibleHint(false);
                    fragment.setMenuVisibility(false);
                }
                return fragment;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final boolean LJJIFFI(View view, Object obj) {
                if (((Fragment) obj).getView() == view) {
                    return true;
                }
                return false;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final void LJIIZILJ(ViewGroup viewGroup, int i2, Object obj) {
                if (this.LLILZIL == null) {
                    this.LLILZIL = this.LLILZ.LJIIJ();
                }
                if (this.LLILZ.LJJJJZI(LJJIJL(viewGroup.getId(), i2)) != null) {
                    this.LLILLJJLI.remove(i2);
                } else {
                    this.LLILZIL.LJIILIIL((Fragment) obj);
                }
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final void LJJIIZ(ViewGroup viewGroup, int i2, Object obj) throws Throwable {
                if (this.LLILLJJLI.get(i2) != null) {
                    Fragment fragment = (Fragment) this.LLILLJJLI.get(i2);
                    if (fragment != null) {
                        String strLJJIJL = LJJIJL(viewGroup.getId(), i2);
                        if (this.LLILZ.LJJJJZI(strLJJIJL) == null) {
                            if (this.LLILZIL == null) {
                                this.LLILZIL = this.LLILZ.LJIIJ();
                            }
                            this.LLILZIL.LIZJ(viewGroup.getId(), fragment, strLJJIJL);
                            this.LLILLJJLI.remove(i2);
                        }
                    }
                    LJIJI(viewGroup);
                }
                Fragment fragment2 = (Fragment) obj;
                Fragment fragment3 = this.LLILLL;
                if (fragment2 == fragment3) {
                    return;
                }
                if (fragment3 != null) {
                    fragment3.setUserVisibleHint(false);
                    this.LLILLL.setMenuVisibility(false);
                }
                if (fragment2 != null) {
                    fragment2.setUserVisibleHint(true);
                    fragment2.setMenuVisibility(true);
                }
                this.LLILLL = fragment2;
            }
        };
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = new ArrayList<>();
        this.LLIZLLLIL = str;
        this.LLJI = i;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
    }

    public final void LJJIJLIJ(String str, String str2, boolean z, C20449014zw c20449014zw, int i, long j, long j2, int i2) {
        this.LLILZLL.add(MusicClassDetailFragment.VR(str, str2, this.LLIZLLLIL, this.LLJI, z, this.LLJ, 2, c20449014zw, i, null, false, j, j2, null, i2, "", "", false));
    }
}
