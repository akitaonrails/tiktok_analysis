package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.filter.ActivityOptionStruct;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui.SearchBottomSheetFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.viewmodel.SearchFilterViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665630Q8z extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SearchBottomSheetFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665630Q8z(SearchBottomSheetFragment searchBottomSheetFragment) {
        super(0);
        this.LL = searchBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OptionConfigParams optionConfigParams;
        SubFilterOptionStruct categoryOption;
        SubFilterOptionStruct followerNumberOption;
        SubFilterOptionStruct profilesTypesOption;
        SubFilterOptionStruct otherPreferencesOption;
        ActivityOptionStruct activityOptionStruct;
        Map<String, String> map;
        Map<String, String> linkedHashMap;
        Map<String, String> linkedHashMap2;
        Map<String, String> linkedHashMap3;
        Map<String, String> linkedHashMap4;
        Map<String, String> linkedHashMap5;
        Map<String, String> linkedHashMap6;
        Map<String, String> requestInfo;
        Map<String, String> requestInfo2;
        FilterOptionStruct filterOptionStruct;
        FilterOptionStruct filterOptionStruct2;
        FilterOptionStruct filterOptionStruct3;
        FilterOptionStruct filterOptionStruct4;
        ActivityOptionStruct activityOptionStruct2;
        FilterOptionStruct filterOptionStruct5;
        FilterOptionStruct filterOptionStruct6;
        FilterOptionStruct filterOptionStruct7;
        FilterOptionStruct filterOptionStruct8;
        FilterOptionStruct filterOptionStruct9;
        FilterOptionStruct filterOptionStruct10;
        ActivityOptionStruct activityOptionStruct3;
        FilterOptionStruct filterOptionStruct11;
        FilterOptionStruct filterOptionStruct12;
        SearchBottomSheetFragment searchBottomSheetFragment = this.LL;
        SearchFilterViewModel searchFilterViewModelMR = searchBottomSheetFragment.MR();
        C0Q93 c0q93 = (C0Q93) searchFilterViewModelMR.vmDispatcher.getState();
        OptionConfigParams optionConfigParams2 = searchFilterViewModelMR.LLIZ;
        if (optionConfigParams2 != null && (filterOptionStruct12 = optionConfigParams2.filterOptionStruct) != null) {
            filterOptionStruct12.selectOption(c0q93.LLILLL);
        }
        OptionConfigParams optionConfigParams3 = searchFilterViewModelMR.LLIZ;
        if (optionConfigParams3 != null && (filterOptionStruct11 = optionConfigParams3.sortTypeOptionStruct) != null) {
            filterOptionStruct11.selectOption(c0q93.LLILLJJLI);
        }
        Map<SubSwitchStruct, Boolean> map2 = searchFilterViewModelMR.LLJ;
        if (map2 != null) {
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                SubSwitchStruct subSwitchStruct = (SubSwitchStruct) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                OptionConfigParams optionConfigParams4 = searchFilterViewModelMR.LLIZ;
                if (optionConfigParams4 != null && (activityOptionStruct3 = optionConfigParams4.activityTypeOptionStruct) != null) {
                    activityOptionStruct3.selectOption(subSwitchStruct, zBooleanValue);
                }
            }
        }
        OptionConfigParams optionConfigParams5 = searchFilterViewModelMR.LLIZ;
        if (optionConfigParams5 != null && (filterOptionStruct10 = optionConfigParams5.categoryOptionStruct) != null) {
            filterOptionStruct10.selectOption(c0q93.LL);
        }
        OptionConfigParams optionConfigParams6 = searchFilterViewModelMR.LLIZ;
        if (optionConfigParams6 != null && (filterOptionStruct9 = optionConfigParams6.followerNumberOptionStruct) != null) {
            filterOptionStruct9.selectOption(c0q93.LLILZ);
        }
        OptionConfigParams optionConfigParams7 = searchFilterViewModelMR.LLIZ;
        if (optionConfigParams7 != null && (filterOptionStruct8 = optionConfigParams7.profilesTypesOptionStruct) != null) {
            filterOptionStruct8.selectOption(c0q93.LLILZIL);
        }
        OptionConfigParams optionConfigParams8 = searchFilterViewModelMR.LLIZ;
        if (optionConfigParams8 != null && (filterOptionStruct7 = optionConfigParams8.otherPreferencesOption) != null) {
            filterOptionStruct7.selectOption(c0q93.LLILZLL);
        }
        SearchFilterViewModel searchFilterViewModelMR2 = searchBottomSheetFragment.MR();
        C0PSG c0psg = new C0PSG();
        OptionConfigParams optionConfigParams9 = searchFilterViewModelMR2.LLIZ;
        SubFilterOptionStruct selectOption = null;
        SubFilterOptionStruct selectOption2 = (optionConfigParams9 == null || (filterOptionStruct6 = optionConfigParams9.filterOptionStruct) == null) ? null : filterOptionStruct6.getSelectOption();
        OptionConfigParams optionConfigParams10 = searchFilterViewModelMR2.LLIZ;
        SubFilterOptionStruct selectOption3 = (optionConfigParams10 == null || (filterOptionStruct5 = optionConfigParams10.sortTypeOptionStruct) == null) ? null : filterOptionStruct5.getSelectOption();
        OptionConfigParams optionConfigParams11 = searchFilterViewModelMR2.LLIZ;
        List<SubSwitchStruct> activitySelectOption = (optionConfigParams11 == null || (activityOptionStruct2 = optionConfigParams11.activityTypeOptionStruct) == null) ? null : activityOptionStruct2.getActivitySelectOption();
        OptionConfigParams optionConfigParams12 = searchFilterViewModelMR2.LLIZ;
        c0psg.setCategoryOption((optionConfigParams12 == null || (filterOptionStruct4 = optionConfigParams12.categoryOptionStruct) == null) ? null : filterOptionStruct4.getSelectOption());
        OptionConfigParams optionConfigParams13 = searchFilterViewModelMR2.LLIZ;
        c0psg.setFollowerNumberOption((optionConfigParams13 == null || (filterOptionStruct3 = optionConfigParams13.followerNumberOptionStruct) == null) ? null : filterOptionStruct3.getSelectOption());
        OptionConfigParams optionConfigParams14 = searchFilterViewModelMR2.LLIZ;
        c0psg.setProfilesTypesOption((optionConfigParams14 == null || (filterOptionStruct2 = optionConfigParams14.profilesTypesOptionStruct) == null) ? null : filterOptionStruct2.getSelectOption());
        OptionConfigParams optionConfigParams15 = searchFilterViewModelMR2.LLIZ;
        if (optionConfigParams15 != null && (filterOptionStruct = optionConfigParams15.otherPreferencesOption) != null) {
            selectOption = filterOptionStruct.getSelectOption();
        }
        c0psg.setOtherPreferencesOption(selectOption);
        c0psg.setFromSchema(false);
        if (selectOption3 != null && (requestInfo2 = selectOption3.getRequestInfo()) != null) {
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            for (Map.Entry<String, String> entry2 : requestInfo2.entrySet()) {
                if (Intrinsics.LJFF(entry2.getKey(), "sort_type")) {
                    linkedHashMap7.put(entry2.getKey(), entry2.getValue());
                }
            }
            Collection collectionValues = linkedHashMap7.values();
            if (collectionValues != null) {
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    c0psg.setSortType(CastIntegerProtector.parseInt((String) it2.next()));
                }
            }
        }
        if (selectOption2 != null && (requestInfo = selectOption2.getRequestInfo()) != null) {
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            for (Map.Entry<String, String> entry3 : requestInfo.entrySet()) {
                if (Intrinsics.LJFF(entry3.getKey(), "publish_time") || Intrinsics.LJFF(entry3.getKey(), "filter_by")) {
                    linkedHashMap8.put(entry3.getKey(), entry3.getValue());
                }
            }
            Collection collectionValues2 = linkedHashMap8.values();
            if (collectionValues2 != null) {
                Iterator it3 = collectionValues2.iterator();
                while (it3.hasNext()) {
                    c0psg.setFilterBy(CastIntegerProtector.parseInt((String) it3.next()));
                }
            }
        }
        c0psg.setSortTypeStruct(selectOption3);
        c0psg.setFilterByStruct(selectOption2);
        c0psg.setActivitySwitchOption(activitySelectOption);
        c0psg.setDefaultOption((selectOption3 == null || selectOption3.isDefaultOption()) && (selectOption2 == null || selectOption2.isDefaultOption()) && (((optionConfigParams = searchFilterViewModelMR2.LLIZ) == null || (activityOptionStruct = optionConfigParams.activityTypeOptionStruct) == null || activityOptionStruct.isDefault()) && (((categoryOption = c0psg.getCategoryOption()) == null || categoryOption.isDefaultOption()) && (((followerNumberOption = c0psg.getFollowerNumberOption()) == null || followerNumberOption.isDefaultOption()) && (((profilesTypesOption = c0psg.getProfilesTypesOption()) == null || profilesTypesOption.isDefaultOption()) && ((otherPreferencesOption = c0psg.getOtherPreferencesOption()) == null || otherPreferencesOption.isDefaultOption()))))));
        C0Q91 c0q91 = searchBottomSheetFragment.LLILZLL;
        if (c0q91 != null) {
            c0q91.LIZIZ(c0psg);
        }
        C0Q91 c0q912 = searchBottomSheetFragment.LLILZLL;
        if (c0q912 != null) {
            c0q912.LIZ(c0psg);
        }
        if (searchBottomSheetFragment.LLIZ != null && (map = searchBottomSheetFragment.LLILZ) != null && !map.isEmpty()) {
            C650460PfI<C0Q90> c650460PfI = new C650460PfI<C0Q90>() { // from class: X.0Q90
            };
            c650460PfI.LJIILLIIL.putAll(map);
            SubFilterOptionStruct filterByStruct = c0psg.getFilterByStruct();
            if (filterByStruct == null || (linkedHashMap = filterByStruct.getLogInfo()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            c650460PfI.LJIILLIIL.putAll(linkedHashMap);
            SubFilterOptionStruct categoryOption2 = c0psg.getCategoryOption();
            if (categoryOption2 == null || (linkedHashMap2 = categoryOption2.getLogInfo()) == null) {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            c650460PfI.LJIILLIIL.putAll(linkedHashMap2);
            SubFilterOptionStruct sortTypeStruct = c0psg.getSortTypeStruct();
            if (sortTypeStruct == null || (linkedHashMap3 = sortTypeStruct.getLogInfo()) == null) {
                linkedHashMap3 = new LinkedHashMap<>();
            }
            c650460PfI.LJIILLIIL.putAll(linkedHashMap3);
            SubFilterOptionStruct followerNumberOption2 = c0psg.getFollowerNumberOption();
            if (followerNumberOption2 == null || (linkedHashMap4 = followerNumberOption2.getLogInfo()) == null) {
                linkedHashMap4 = new LinkedHashMap<>();
            }
            c650460PfI.LJIILLIIL.putAll(linkedHashMap4);
            SubFilterOptionStruct profilesTypesOption2 = c0psg.getProfilesTypesOption();
            if (profilesTypesOption2 == null || (linkedHashMap5 = profilesTypesOption2.getLogInfo()) == null) {
                linkedHashMap5 = new LinkedHashMap<>();
            }
            c650460PfI.LJIILLIIL.putAll(linkedHashMap5);
            SubFilterOptionStruct otherPreferencesOption2 = c0psg.getOtherPreferencesOption();
            if (otherPreferencesOption2 == null || (linkedHashMap6 = otherPreferencesOption2.getLogInfo()) == null) {
                linkedHashMap6 = new LinkedHashMap<>();
            }
            c650460PfI.LJIILLIIL.putAll(linkedHashMap6);
            List<SubSwitchStruct> activitySwitchOption = c0psg.getActivitySwitchOption();
            if (activitySwitchOption != null) {
                for (SubSwitchStruct subSwitchStruct2 : activitySwitchOption) {
                    c650460PfI.LJ(subSwitchStruct2.getLogInfo(), subSwitchStruct2.isSelected() ? "1" : CardStruct.IStatusCode.DEFAULT);
                }
            }
            c650460PfI.LJIILJJIL();
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this.LL, C343970De7.LIZ);
        return Unit.LIZ;
    }
}
