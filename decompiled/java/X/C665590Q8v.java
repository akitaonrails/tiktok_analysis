package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665590Q8v {
    public static List<OptionConfigParams> LIZIZ;
    public static final C665590Q8v LIZ = new C665590Q8v();
    public static final Map<Integer, List<OptionConfigParams>> LIZJ = new LinkedHashMap();

    public final synchronized List<OptionConfigParams> LIZLLL() {
        try {
            SettingsManager.LIZLLL().getClass();
            String strLJI = SettingsManager.LJI("search_filter_options_config", "");
            e eVar = new e();
            eVar.LJIIJ = true;
            eVar.LJIILIIL = true;
            LIZIZ = (List) eVar.LIZ().LJIIIIZZ(strLJI, new TypeToken<List<? extends OptionConfigParams>>() { // from class: X.0Q8w
            }.getType());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LIZIZ;
    }

    public static boolean LIZ(OptionConfigParams optionConfigParams) {
        List<SubFilterOptionStruct> optionStructList;
        FilterOptionStruct filterOptionStruct;
        List<SubFilterOptionStruct> optionStructList2;
        FilterOptionStruct filterOptionStruct2;
        List<SubFilterOptionStruct> optionStructList3;
        List<SubFilterOptionStruct> optionStructList4;
        FilterOptionStruct filterOptionStruct3;
        List<SubFilterOptionStruct> optionStructList5;
        if (optionConfigParams != null) {
            FilterOptionStruct filterOptionStruct4 = optionConfigParams.filterOptionStruct;
            if (filterOptionStruct4 != null && filterOptionStruct4.getOptionStructList() != null && (optionStructList4 = optionConfigParams.filterOptionStruct.getOptionStructList()) != null && !optionStructList4.isEmpty() && (filterOptionStruct3 = optionConfigParams.sortTypeOptionStruct) != null && filterOptionStruct3.getOptionStructList() != null && (optionStructList5 = optionConfigParams.sortTypeOptionStruct.getOptionStructList()) != null && !optionStructList5.isEmpty()) {
                return true;
            }
            FilterOptionStruct filterOptionStruct5 = optionConfigParams.followerNumberOptionStruct;
            if (filterOptionStruct5 != null && (optionStructList = filterOptionStruct5.getOptionStructList()) != null && !optionStructList.isEmpty() && (filterOptionStruct = optionConfigParams.profilesTypesOptionStruct) != null && (optionStructList2 = filterOptionStruct.getOptionStructList()) != null && !optionStructList2.isEmpty() && (filterOptionStruct2 = optionConfigParams.otherPreferencesOption) != null && (optionStructList3 = filterOptionStruct2.getOptionStructList()) != null && !optionStructList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final OptionConfigParams LIZJ(String str) {
        String string;
        if (LIZIZ == null) {
            LIZLLL();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config: ");
        List<OptionConfigParams> list = LIZIZ;
        if (list != null) {
            string = list.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        List<OptionConfigParams> list2 = LIZIZ;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (OptionConfigParams optionConfigParams : list2) {
            if (TextUtils.equals(optionConfigParams.searchType, str)) {
                arrayList.add(optionConfigParams);
            }
        }
        return (OptionConfigParams) C13LP.LJJJLL(arrayList);
    }

    public final OptionConfigParams LIZIZ(int i, String str) {
        String string;
        OptionConfigParams optionConfigParams;
        FilterOptionStruct filterOptionStruct;
        List<SubFilterOptionStruct> optionStructList;
        String str2;
        OptionConfigParams next;
        String str3;
        Map<Integer, List<OptionConfigParams>> map = LIZJ;
        List<OptionConfigParams> listLIZLLL = (List) ((LinkedHashMap) map).get(Integer.valueOf(i));
        if (listLIZLLL == null) {
            listLIZLLL = LIZLLL();
            map.put(Integer.valueOf(i), listLIZLLL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config: ");
        if (listLIZLLL != null) {
            string = listLIZLLL.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        if (listLIZLLL != null) {
            Iterator<OptionConfigParams> it2 = listLIZLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    OptionConfigParams optionConfigParams2 = next;
                    if (optionConfigParams2 != null) {
                        str3 = optionConfigParams2.searchType;
                    } else {
                        str3 = null;
                    }
                    if (TextUtils.equals(str3, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            optionConfigParams = next;
        } else {
            optionConfigParams = null;
        }
        C665580Q8u.LIZIZ.LJIILJJIL(optionConfigParams);
        if (C0PNV.LIZ() && optionConfigParams != null && Intrinsics.LJFF(str, "general") && (filterOptionStruct = optionConfigParams.sortTypeOptionStruct) != null && (optionStructList = filterOptionStruct.getOptionStructList()) != null) {
            for (SubFilterOptionStruct subFilterOptionStruct : optionStructList) {
                Map<String, String> requestInfo = subFilterOptionStruct.getRequestInfo();
                if (requestInfo != null) {
                    str2 = requestInfo.get("sort_type");
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, "3")) {
                    C844470XAv.LIZ.getClass();
                    subFilterOptionStruct.setName(C844470XAv.LIZ().getString(2131846639));
                }
            }
        }
        return optionConfigParams;
    }
}
