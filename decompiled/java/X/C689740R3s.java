package X;

import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceContainerFragment;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.poitab.fragment.SearchPlaceSubTabFragment;

/* JADX INFO: renamed from: X.0R3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689740R3s extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        if (1 - this.$t != 0) {
            super.onPageScrollStateChanged(i);
        } else {
            onPageScrollStateChanged$0(this, i);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        if (1 - this.$t != 0) {
            super.onPageScrolled(i, f, i2);
        } else {
            onPageScrolled$0(this, i, f, i2);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) throws Throwable {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C689740R3s(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C689740R3s c689740R3s, int i) {
        C674320Qcg c674320Qcg;
        EnumC674310Qcf enumC674310Qcf;
        if (i != 0) {
            if (i == 1) {
                C674320Qcg c674320Qcg2 = (C674320Qcg) c689740R3s.l0;
                c674320Qcg2.LJ = c674320Qcg2.LIZ.getCurrentItem();
                C674320Qcg c674320Qcg3 = (C674320Qcg) c689740R3s.l0;
                if (c674320Qcg3.LJFF == null) {
                    c674320Qcg3.LJFF = EnumC674310Qcf.SLIDE;
                    return;
                }
                return;
            }
            return;
        }
        C674320Qcg c674320Qcg4 = (C674320Qcg) c689740R3s.l0;
        if (c674320Qcg4.LJ == c674320Qcg4.LIZ.getCurrentItem()) {
            boolean[] zArr = ((C674320Qcg) c689740R3s.l0).LJII;
            int length = zArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (zArr[i2]) {
                    if (i2 != -1 && (enumC674310Qcf = (c674320Qcg = (C674320Qcg) c689740R3s.l0).LJFF) != null) {
                        c674320Qcg.LIZJ.LIZIZ(i2, enumC674310Qcf);
                    }
                } else {
                    i2++;
                }
            }
        }
        C674320Qcg c674320Qcg5 = (C674320Qcg) c689740R3s.l0;
        c674320Qcg5.LJ = c674320Qcg5.LIZ.getCurrentItem();
        C674320Qcg c674320Qcg6 = (C674320Qcg) c689740R3s.l0;
        c674320Qcg6.LJFF = null;
        c674320Qcg6.LIZJ(false);
        C674320Qcg c674320Qcg7 = (C674320Qcg) c689740R3s.l0;
        int length2 = c674320Qcg7.LJII.length;
        boolean[] zArr2 = new boolean[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            zArr2[i3] = false;
        }
        c674320Qcg7.LJII = zArr2;
    }

    public static final void onPageSelected$0(C689740R3s c689740R3s, int i) throws Throwable {
        String str;
        SearchPlaceContainerFragment searchPlaceContainerFragment;
        C1826520xdC c1826520xdC;
        SearchPlaceContainerFragment searchPlaceContainerFragment2 = (SearchPlaceContainerFragment) c689740R3s.l0;
        SearchPlaceSubTabFragment searchPlaceSubTabFragmentCS = searchPlaceContainerFragment2.cS(searchPlaceContainerFragment2.LLJJJ);
        if (searchPlaceSubTabFragmentCS != ((SearchPlaceContainerFragment) c689740R3s.l0).cS(i) && searchPlaceSubTabFragmentCS != null) {
            searchPlaceSubTabFragmentCS.setUserVisibleHint(false);
        }
        SearchPlaceSubTabFragment searchPlaceSubTabFragmentCS2 = ((SearchPlaceContainerFragment) c689740R3s.l0).cS(i);
        if (searchPlaceSubTabFragmentCS2 != null) {
            searchPlaceSubTabFragmentCS2.setUserVisibleHint(((SearchPlaceContainerFragment) c689740R3s.l0).getUserVisibleHint());
        }
        SearchPlaceContainerFragment searchPlaceContainerFragment3 = (SearchPlaceContainerFragment) c689740R3s.l0;
        searchPlaceContainerFragment3.LLJJJ = i;
        if (searchPlaceContainerFragment3.LLJILJIL && i >= 0 && i < searchPlaceContainerFragment3.LLJIJIL.size() && ((SearchPlaceContainerFragment) c689740R3s.l0).LLJIJIL.size() > 1 && (c1826520xdC = (searchPlaceContainerFragment = (SearchPlaceContainerFragment) c689740R3s.l0).LLJJIII) != null) {
            searchPlaceContainerFragment.LLJJJJ = true;
            c1826520xdC.setSelectedAt(i);
            searchPlaceContainerFragment.LLJJJJ = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sub-tab selected: ");
        C649670Pe1 c649670Pe1 = (C649670Pe1) C13LP.LJJJLZIJ(i, ((SearchPlaceContainerFragment) c689740R3s.l0).LLJIJIL);
        if (c649670Pe1 != null) {
            str = c649670Pe1.tabKey;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onPageSelected$1(C689740R3s c689740R3s, int i) {
        EnumC674310Qcf enumC674310Qcf;
        C674320Qcg c674320Qcg = (C674320Qcg) c689740R3s.l0;
        boolean z = c674320Qcg.LIZLLL;
        if (z || i != c674320Qcg.LJ) {
            c674320Qcg.LIZJ.LIZJ(i, z, c674320Qcg.LJFF);
        }
        C674320Qcg c674320Qcg2 = (C674320Qcg) c689740R3s.l0;
        c674320Qcg2.LIZLLL = false;
        int i2 = c674320Qcg2.LJ;
        if (i2 != -1 && i2 != i && (enumC674310Qcf = c674320Qcg2.LJFF) != null) {
            c674320Qcg2.LIZJ.LIZIZ(i2, enumC674310Qcf);
        }
    }

    public static final void onPageScrolled$0(C689740R3s c689740R3s, int i, float f, int i2) {
        if (f == 0.0f) {
            return;
        }
        int i3 = i + 1;
        C674320Qcg c674320Qcg = (C674320Qcg) c689740R3s.l0;
        int i4 = c674320Qcg.LJ;
        if (i4 == i) {
            i = i3;
        } else if (i4 != i3) {
            return;
        }
        c674320Qcg.LIZIZ(i, c674320Qcg.LJFF);
    }
}
