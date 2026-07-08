package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;

/* JADX INFO: renamed from: X.0P6C, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P6C {
    public static int LIZIZ(Fragment fragment) {
        Integer value;
        int iIntValue;
        C19EG activity = fragment.getActivity();
        if (activity == null || (value = ((SearchHubVM) C679340Qkm.LIZIZ(fragment, activity).get(SearchHubVM.class)).LLJ.getValue()) == null || (iIntValue = value.intValue()) == 0) {
            return 0;
        }
        C641860PFo.LIZ.getClass();
        return iIntValue - C641860PFo.LIZIZ;
    }

    public static void LIZ(Fragment fragment, RecyclerView recyclerView, EntityCardTitle entityCardTitle) {
        String rawData;
        EntityCardTitle entityCardTitleVQ2;
        int iLIZIZ;
        Integer numValueOf;
        int iIZ1;
        C19EG activity = fragment.getActivity();
        if (activity != null && recyclerView != null) {
            SearchHubVM searchHubVM = (SearchHubVM) C679340Qkm.LIZIZ(fragment, activity).get(SearchHubVM.class);
            searchHubVM.getClass();
            if (entityCardTitle != null) {
                DynamicPatch dynamicPatch = entityCardTitle.dynamicPatch;
                if (dynamicPatch != null && (rawData = dynamicPatch.getRawData()) != null && (entityCardTitleVQ2 = SearchHubVM.vQ2(rawData)) != null) {
                    C641860PFo.LIZ.getClass();
                    int i = C641860PFo.LIZJ;
                    if (i >= 0 && i > 0) {
                        if (i < 0) {
                            i = 0;
                        }
                        numValueOf = Integer.valueOf(i);
                    } else {
                        int i2 = C641860PFo.LIZIZ;
                        Integer num = entityCardTitleVQ2.selectedTabIndex;
                        if (num != null && num.intValue() == 0) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C18145078t.LIZ.getValue()).intValue())));
                        } else {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C18144078s.LIZ.getValue()).intValue())));
                        }
                        numValueOf = Integer.valueOf(iLIZIZ - i2);
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        SearchTopFragmentAbility searchTopFragmentAbility = (SearchTopFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), SearchTopFragmentAbility.class, null);
                        if (searchTopFragmentAbility != null) {
                            iIZ1 = searchTopFragmentAbility.IZ1();
                        } else {
                            iIZ1 = 0;
                        }
                        C0HXV.LJFF(iIntValue + iIZ1, recyclerView);
                        recyclerView.scrollToPosition(0);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("set padding top for reversed : ");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(", extraPadding = ");
                        sbLIZ.append(iIZ1);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (entityCardTitle != null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            searchHubVM.wQ2(0);
        }
    }

    public static void LIZJ(Fragment fragment, boolean z, C19EG c19eg) {
        if (c19eg == null) {
            return;
        }
        ((SearchHubVM) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchHubVM.class)).LLJI.postValue(Boolean.valueOf(z));
    }
}
