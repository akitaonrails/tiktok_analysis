package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.archive2.model.ArchivedStoryIdList;
import com.ss.android.ugc.aweme.story.archive2.model.GetArchivedStoryIDsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0geE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173680geE {
    public final List<String> LIZ;
    public final Map<String, List<String>> LIZIZ;
    public final Map<String, Aweme> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C01GW LJFF;

    public C1173680geE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1173680geE)) {
            return false;
        }
        C1173680geE c1173680geE = (C1173680geE) obj;
        return Intrinsics.LJFF(this.LIZ, c1173680geE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1173680geE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1173680geE.LIZJ) && this.LIZLLL == c1173680geE.LIZLLL && this.LJ == c1173680geE.LJ;
    }

    public C1173680geE(int i) {
        this(C2097608Jq.LJ(), C2097608Jq.LJ(), C13BV.INSTANCE, true, false);
    }

    public final C1173680geE LIZIZ(String str) {
        ArrayList arrayList = new ArrayList(this.LIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZIZ);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.LIZJ);
        for (Map.Entry<String, List<String>> entry : this.LIZIZ.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value.contains(str)) {
                if (value.size() == 1) {
                    arrayList.remove(key);
                    linkedHashMap.remove(key);
                    linkedHashMap2.remove(key);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : value) {
                        if (!Intrinsics.LJFF(str2, str)) {
                            arrayList2.add(str2);
                        }
                    }
                    linkedHashMap.put(key, arrayList2);
                }
            }
        }
        return LIZ(this, arrayList, linkedHashMap, linkedHashMap2, false, false, 24);
    }

    public final C1173680geE LIZJ(GetArchivedStoryIDsResponse getArchivedStoryIDsResponse) {
        Long lLJIILIIL;
        long totalCount;
        ArrayList arrayList = new ArrayList(this.LIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZIZ);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.LIZJ);
        List<Aweme> awemes = getArchivedStoryIDsResponse.getAwemes();
        if (awemes != null) {
            Iterator it2 = new C13EO(awemes).iterator();
            while (true) {
                C13EN c13en = (C13EN) it2;
                if (!c13en.hasNext()) {
                    break;
                }
                Aweme aweme = (Aweme) c13en.next();
                String aid = aweme.getAid();
                if (aid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(aid)) != null) {
                    lLJIILIIL.longValue();
                    Map<String, ArchivedStoryIdList> dateToStoryIds = getArchivedStoryIDsResponse.getDateToStoryIds();
                    if (dateToStoryIds != null && dateToStoryIds.containsKey(aid)) {
                        List<String> list = ((ArchivedStoryIdList) C2097608Jq.LJFF(aid, getArchivedStoryIDsResponse.getDateToStoryIds())).storyIds;
                        if (!list.isEmpty()) {
                            UserStory userStory = aweme.getUserStory();
                            if (userStory != null) {
                                userStory.setStories(new ArrayList());
                            }
                            UserStory userStory2 = aweme.getUserStory();
                            if (userStory2 != null) {
                                totalCount = userStory2.getTotalCount();
                            } else {
                                totalCount = 0;
                            }
                            if (totalCount == list.size()) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        if (Intrinsics.LJFF(it3.next(), aid)) {
                                            break;
                                        }
                                    }
                                }
                                ListProtector.add(arrayList, 0, aid);
                                linkedHashMap.put(aid, list);
                                linkedHashMap2.put(aid, aweme);
                            }
                        }
                    }
                }
            }
        }
        return LIZ(this, arrayList, linkedHashMap, linkedHashMap2, Intrinsics.LJFF(getArchivedStoryIDsResponse.getHasMore(), Boolean.TRUE), false, 16);
    }

    public C1173680geE(Map map, Map map2, List list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2279));
    }

    public static C1173680geE LIZ(C1173680geE c1173680geE, List list, Map map, Map map2, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        boolean z4 = z;
        Map map3 = map2;
        Map map4 = map;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c1173680geE.LIZ;
        }
        if ((i & 2) != 0) {
            map4 = c1173680geE.LIZIZ;
        }
        if ((i & 4) != 0) {
            map3 = c1173680geE.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c1173680geE.LIZLLL;
        }
        if ((i & 16) != 0) {
            z3 = c1173680geE.LJ;
        }
        c1173680geE.getClass();
        return new C1173680geE(map4, map3, list2, z4, z3);
    }
}
