package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.filter.ActivityOptionStruct;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui.SearchBottomSheetFragment;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Q94, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q94 {
    public final String LIZ;
    public final InterfaceC214902198i LIZIZ;
    public final C19EG LIZJ;
    public final C0Q91 LIZLLL;
    public final C01GW LJ = C1935507i5.LIZ(new AwS554S0100000_10(this, 983));

    public final OptionConfigParams LIZ() {
        return (OptionConfigParams) this.LJ.getValue();
    }

    public final void LIZJ() {
        FilterOptionStruct filterOptionStruct;
        FilterOptionStruct filterOptionStruct2;
        FilterOptionStruct filterOptionStruct3;
        ActivityOptionStruct activityOptionStruct;
        FilterOptionStruct filterOptionStruct4;
        FilterOptionStruct filterOptionStruct5;
        FilterOptionStruct filterOptionStruct6;
        OptionConfigParams optionConfigParamsLIZ = LIZ();
        if (optionConfigParamsLIZ != null && (filterOptionStruct6 = optionConfigParamsLIZ.filterOptionStruct) != null) {
            filterOptionStruct6.reset();
        }
        OptionConfigParams optionConfigParamsLIZ2 = LIZ();
        if (optionConfigParamsLIZ2 != null && (filterOptionStruct5 = optionConfigParamsLIZ2.categoryOptionStruct) != null) {
            filterOptionStruct5.reset();
        }
        OptionConfigParams optionConfigParamsLIZ3 = LIZ();
        if (optionConfigParamsLIZ3 != null && (filterOptionStruct4 = optionConfigParamsLIZ3.sortTypeOptionStruct) != null) {
            filterOptionStruct4.reset();
        }
        OptionConfigParams optionConfigParamsLIZ4 = LIZ();
        if (optionConfigParamsLIZ4 != null && (activityOptionStruct = optionConfigParamsLIZ4.activityTypeOptionStruct) != null) {
            activityOptionStruct.reset();
        }
        OptionConfigParams optionConfigParamsLIZ5 = LIZ();
        if (optionConfigParamsLIZ5 != null && (filterOptionStruct3 = optionConfigParamsLIZ5.followerNumberOptionStruct) != null) {
            filterOptionStruct3.reset();
        }
        OptionConfigParams optionConfigParamsLIZ6 = LIZ();
        if (optionConfigParamsLIZ6 != null && (filterOptionStruct2 = optionConfigParamsLIZ6.profilesTypesOptionStruct) != null) {
            filterOptionStruct2.reset();
        }
        OptionConfigParams optionConfigParamsLIZ7 = LIZ();
        if (optionConfigParamsLIZ7 == null || (filterOptionStruct = optionConfigParamsLIZ7.otherPreferencesOption) == null) {
            return;
        }
        filterOptionStruct.reset();
    }

    public static void LIZIZ(String str, Map map) {
        if (map != null && !map.isEmpty()) {
            C650070Pef c650070Pef = new C650070Pef();
            c650070Pef.LJIILLIIL.putAll(map);
            c650070Pef.LJIIZILJ("filter_type", "by_all");
            c650070Pef.LJFF("button_type", str, InterfaceC1210900hcG.LIZ);
            c650070Pef.LJIILJJIL();
        }
    }

    public final void LIZLLL(Fragment fragment, Map map) {
        if (this.LIZJ == null) {
            return;
        }
        SearchBottomSheetFragment searchBottomSheetFragment = new SearchBottomSheetFragment();
        searchBottomSheetFragment.LLILZLL = this.LIZLLL;
        searchBottomSheetFragment.LLIZ = this;
        searchBottomSheetFragment.LLILZIL = this.LIZ;
        searchBottomSheetFragment.LLILZ = map;
        C19EG c19eg = this.LIZJ;
        if (c19eg != null) {
            SearchStateViewModel searchStateViewModel = (SearchStateViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchStateViewModel.class);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = searchBottomSheetFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new C0R4A(searchStateViewModel, 6);
            tuxSheet.LL = new C0R43(this, map, 2);
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG c19eg2 = this.LIZJ;
            sAFHelper.getClass();
            FragmentManager fragmentManagerLJIILJJIL = SAFHelper.LJIILJJIL(fragment, c19eg2);
            if (fragmentManagerLJIILJJIL != null) {
                tuxSheet.show(fragmentManagerLJIILJJIL, "searchBottomSheetFragmentV2");
            }
            searchStateViewModel.setShowingFilters(true);
            LIZIZ("open_filter", map);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C0Q94(String str, InterfaceC214902198i interfaceC214902198i, C19EG c19eg, C0Q91 c0q91) {
        this.LIZ = str;
        this.LIZIZ = interfaceC214902198i;
        this.LIZJ = c19eg;
        this.LIZLLL = c0q91;
    }
}
