package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0PSG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSG implements Serializable {
    public int LL;
    public SubFilterOptionStruct LLILLJJLI;
    public int LLILLL;
    public SubFilterOptionStruct LLILZ;
    public boolean LLILZLL;
    public boolean LLIZ;
    public List<SubSwitchStruct> LLIZLLLIL;
    public SubFilterOptionStruct LLJ;
    public SubFilterOptionStruct LLJI;
    public SubFilterOptionStruct LLJIJIL;
    public SubFilterOptionStruct LLJILJIL;
    public ResearchFilterStruct LLJJ;
    public boolean LLILZIL = true;
    public LinkedHashMap<String, SubFilterOptionStruct> LLJILJILJ = new LinkedHashMap<>();
    public LinkedHashMap<String, List<SubFilterOptionStruct>> LLJILLL = new LinkedHashMap<>();
    public boolean LLJJI = true;

    public final LinkedHashMap<String, Integer> activityToFieldMap() {
        Map<String, String> requestInfo;
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        List<SubSwitchStruct> list = this.LLIZLLLIL;
        if (list != null) {
            for (SubSwitchStruct subSwitchStruct : list) {
                String requestKey = subSwitchStruct.getRequestKey();
                if (requestKey == null) {
                    requestKey = "";
                }
                linkedHashMap.put(requestKey, Integer.valueOf(subSwitchStruct.isSelected() ? 1 : 0));
            }
        }
        SubFilterOptionStruct subFilterOptionStruct = this.LLJ;
        if (subFilterOptionStruct != null && (requestInfo = subFilterOptionStruct.getRequestInfo()) != null) {
            for (Map.Entry<String, String> entry : requestInfo.entrySet()) {
                linkedHashMap.put(entry.getKey(), Integer.valueOf(CastIntegerProtector.parseInt(entry.getValue())));
            }
        }
        return linkedHashMap;
    }

    public final Map<String, String> studioToFieldMap() {
        Map<String, String> requestInfo;
        if (!C665580Q8u.LIZIZ.LJIILL()) {
            LinkedHashMap<String, SubFilterOptionStruct> linkedHashMap = this.LLJILJILJ;
            if (linkedHashMap == null || linkedHashMap.size() == 0) {
                return new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap<String, SubFilterOptionStruct> linkedHashMap3 = this.LLJILJILJ;
            if (linkedHashMap3 != null) {
                Iterator<Map.Entry<String, SubFilterOptionStruct>> it2 = linkedHashMap3.entrySet().iterator();
                while (it2.hasNext()) {
                    SubFilterOptionStruct value = it2.next().getValue();
                    if (value != null && (requestInfo = value.getRequestInfo()) != null) {
                        linkedHashMap2.putAll(requestInfo);
                    }
                }
            }
            return linkedHashMap2;
        }
        if (this.LLJILLL.isEmpty()) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        Iterator<Map.Entry<String, List<SubFilterOptionStruct>>> it3 = this.LLJILLL.entrySet().iterator();
        while (it3.hasNext()) {
            List<SubFilterOptionStruct> value2 = it3.next().getValue();
            if (value2 != null) {
                Iterator<SubFilterOptionStruct> it4 = value2.iterator();
                while (it4.hasNext()) {
                    Map<String, String> requestInfo2 = it4.next().getRequestInfo();
                    if (requestInfo2 != null) {
                        for (Map.Entry<String, String> entry : requestInfo2.entrySet()) {
                            String key = entry.getKey();
                            String value3 = entry.getValue();
                            if (linkedHashMap4.containsKey(key)) {
                                List list = (List) linkedHashMap4.get(key);
                                if (list != null) {
                                    list.add(value3);
                                }
                            } else {
                                linkedHashMap4.put(key, C1697810uHb.LJIILJJIL(value3));
                            }
                        }
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
            linkedHashMap5.put(entry2.getKey(), C13LP.LJJLIIIJ((Iterable) entry2.getValue(), ",", null, null, 0, null, null, 62));
        }
        return linkedHashMap5;
    }

    public final LinkedHashMap<String, String> userToFieldRequestMap() {
        Map<String, String> requestInfo;
        Map<String, String> requestInfo2;
        Map<String, String> requestInfo3;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        SubFilterOptionStruct subFilterOptionStruct = this.LLJI;
        if (subFilterOptionStruct != null && (requestInfo3 = subFilterOptionStruct.getRequestInfo()) != null) {
            linkedHashMap.putAll(requestInfo3);
        }
        SubFilterOptionStruct subFilterOptionStruct2 = this.LLJIJIL;
        if (subFilterOptionStruct2 != null && (requestInfo2 = subFilterOptionStruct2.getRequestInfo()) != null) {
            linkedHashMap.putAll(requestInfo2);
        }
        SubFilterOptionStruct subFilterOptionStruct3 = this.LLJILJIL;
        if (subFilterOptionStruct3 != null && (requestInfo = subFilterOptionStruct3.getRequestInfo()) != null) {
            linkedHashMap.putAll(requestInfo);
        }
        return linkedHashMap;
    }

    public final List<SubSwitchStruct> getActivitySwitchOption() {
        return this.LLIZLLLIL;
    }

    public final SubFilterOptionStruct getCategoryOption() {
        return this.LLJ;
    }

    public final int getFilterBy() {
        return this.LLILLL;
    }

    public final SubFilterOptionStruct getFilterByStruct() {
        return this.LLILZ;
    }

    public final LinkedHashMap<String, List<SubFilterOptionStruct>> getFilterOptionListMap() {
        return this.LLJILLL;
    }

    public final LinkedHashMap<String, SubFilterOptionStruct> getFilterOptionMap() {
        return this.LLJILJILJ;
    }

    public final SubFilterOptionStruct getFollowerNumberOption() {
        return this.LLJI;
    }

    public final SubFilterOptionStruct getOtherPreferencesOption() {
        return this.LLJILJIL;
    }

    public final SubFilterOptionStruct getProfilesTypesOption() {
        return this.LLJIJIL;
    }

    public final ResearchFilterStruct getResearchFilterOption() {
        return this.LLJJ;
    }

    public final int getSortType() {
        return this.LL;
    }

    public final SubFilterOptionStruct getSortTypeStruct() {
        return this.LLILLJJLI;
    }

    public final boolean isDefaultOption() {
        return this.LLILZIL;
    }

    public final boolean isDefaultResearchOption() {
        return this.LLJJI;
    }

    public final boolean isFromRefineSort() {
        return this.LLIZ;
    }

    public final boolean isFromSchema() {
        return this.LLILZLL;
    }

    public final void setActivitySwitchOption(List<SubSwitchStruct> list) {
        this.LLIZLLLIL = list;
    }

    public final void setCategoryOption(SubFilterOptionStruct subFilterOptionStruct) {
        this.LLJ = subFilterOptionStruct;
    }

    public final void setDefaultOption(boolean z) {
        this.LLILZIL = z;
    }

    public final void setDefaultResearchOption(boolean z) {
        this.LLJJI = z;
    }

    public final void setFilterBy(int i) {
        this.LLILLL = i;
    }

    public final void setFilterByStruct(SubFilterOptionStruct subFilterOptionStruct) {
        this.LLILZ = subFilterOptionStruct;
    }

    public final void setFilterOptionListMap(LinkedHashMap<String, List<SubFilterOptionStruct>> linkedHashMap) {
        this.LLJILLL = linkedHashMap;
    }

    public final void setFilterOptionMap(LinkedHashMap<String, SubFilterOptionStruct> linkedHashMap) {
        this.LLJILJILJ = linkedHashMap;
    }

    public final void setFollowerNumberOption(SubFilterOptionStruct subFilterOptionStruct) {
        this.LLJI = subFilterOptionStruct;
    }

    public final void setFromRefineSort(boolean z) {
        this.LLIZ = z;
    }

    public final void setFromSchema(boolean z) {
        this.LLILZLL = z;
    }

    public final void setOtherPreferencesOption(SubFilterOptionStruct subFilterOptionStruct) {
        this.LLJILJIL = subFilterOptionStruct;
    }

    public final void setProfilesTypesOption(SubFilterOptionStruct subFilterOptionStruct) {
        this.LLJIJIL = subFilterOptionStruct;
    }

    public final void setResearchFilterOption(ResearchFilterStruct researchFilterStruct) {
        this.LLJJ = researchFilterStruct;
    }

    public final void setSortType(int i) {
        this.LL = i;
    }

    public final void setSortTypeStruct(SubFilterOptionStruct subFilterOptionStruct) {
        this.LLILLJJLI = subFilterOptionStruct;
    }
}
