package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZ5 {
    public static final C01GW LIZ;

    static {
        new LinkedHashMap();
        LIZ = C452501pT.LIZIZ(new C0RZ6());
    }

    public static final boolean LJI() {
        C844470XAv.LIZ.getClass();
        return Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
    }

    public static final String LIZ(String str, String str2) {
        String str3 = C700080Rd8.LIZIZ.get(str);
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append(':');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Set LIZJ(String str, String str2, FeedComponentPriorityData feedComponentPriorityData) {
        Map<String, ComponentContainerData> map;
        ComponentContainerData componentContainerData;
        List<String> listLIZLLL;
        Set setLLIIIZ;
        if (feedComponentPriorityData == null || (map = feedComponentPriorityData.containerMap) == null || (componentContainerData = map.get("bottom_button")) == null || (listLIZLLL = LIZLLL(componentContainerData, str, str2)) == null || (setLLIIIZ = C13LP.LLIIIZ(C13LP.LJJJJLI(listLIZLLL))) == null || setLLIIIZ.isEmpty()) {
            Iterable iterable = C695970RRr.LIZIZ;
            if (iterable == null) {
                iterable = C08CX.INSTANCE;
            }
            return C13LP.LLIIIZ(iterable);
        }
        return setLLIIIZ;
    }

    public static final List<String> LIZLLL(ComponentContainerData componentContainerData, String str, String str2) {
        String strLIZ = LIZ(str, str2);
        String str3 = C700080Rd8.LIZIZ.get(str);
        List<String> childrenKey = componentContainerData.getChildrenKey(strLIZ);
        if (childrenKey == null) {
            return componentContainerData.getChildrenKey(str3);
        }
        return childrenKey;
    }

    public static final Set<String> LIZIZ(String str, String str2, FeedComponentPriorityData feedComponentPriorityData, Function1<? super Set<String>, ? extends Set<String>> function1) {
        Set<String> setLLIIIZ;
        Map<String, ComponentContainerData> map;
        ComponentContainerData componentContainerData;
        List<String> listLIZLLL;
        if (feedComponentPriorityData == null || (map = feedComponentPriorityData.containerMap) == null || (componentContainerData = map.get("bottom_banner")) == null || (listLIZLLL = LIZLLL(componentContainerData, str, str2)) == null || (setLLIIIZ = C13LP.LLIIIZ(C13LP.LJJJJLI(listLIZLLL))) == null || setLLIIIZ.isEmpty()) {
            Iterable iterable = C0RZ4.LIZIZ;
            if (iterable == null) {
                iterable = C08CX.INSTANCE;
            }
            setLLIIIZ = C13LP.LLIIIZ(iterable);
        }
        if (function1 != null) {
            return function1.invoke(setLLIIIZ);
        }
        return setLLIIIZ;
    }

    public static final Set<String> LJ(String str, String str2, FeedComponentPriorityData feedComponentPriorityData, Function1<? super Set<String>, ? extends Set<String>> function1) {
        Set<String> setLLIIIZ;
        Map<String, ComponentContainerData> map;
        ComponentContainerData componentContainerData;
        List<String> listLIZLLL;
        if (feedComponentPriorityData == null || (map = feedComponentPriorityData.containerMap) == null || (componentContainerData = map.get("genre_tag")) == null || (listLIZLLL = LIZLLL(componentContainerData, str, str2)) == null || (setLLIIIZ = C13LP.LLIIIZ(C13LP.LJJJJLI(listLIZLLL))) == null || setLLIIIZ.isEmpty()) {
            Set<String> set = C697090RVz.LIZ().get("genre_tag");
            if (set == null) {
                set = C08CX.INSTANCE;
            }
            setLLIIIZ = C13LP.LLIIIZ(set);
        }
        if (function1 != null) {
            return function1.invoke(setLLIIIZ);
        }
        return setLLIIIZ;
    }

    public static final Map<String, Set<String>> LJFF(String str, String str2, FeedComponentPriorityData feedComponentPriorityData, Function1<? super Map<String, ? extends Set<String>>, ? extends Map<String, ? extends Set<String>>> function1) {
        Collection linkedHashSet;
        Collection linkedHashSet2;
        Collection linkedHashSet3;
        Collection linkedHashSet4;
        Map<String, ComponentContainerData> map;
        ComponentContainerData componentContainerData;
        List<String> listLIZLLL;
        Map<String, ComponentContainerData> map2;
        ComponentContainerData componentContainerData2;
        List<String> listLIZLLL2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (feedComponentPriorityData != null && (map2 = feedComponentPriorityData.containerMap) != null && (componentContainerData2 = map2.get("low_tag")) != null && (listLIZLLL2 = LIZLLL(componentContainerData2, str, str2)) != null) {
            linkedHashSet = C13LP.LLIIIZ(C13LP.LJJJJLI(listLIZLLL2));
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        linkedHashMap.put("low_tag", linkedHashSet);
        Collection collection = (Collection) linkedHashMap.get("low_tag");
        if (collection == null || collection.isEmpty()) {
            Set<String> set = C697090RVz.LIZ().get("low_tag");
            if (set != null) {
                linkedHashSet2 = C13LP.LLIIIZ(set);
            } else {
                linkedHashSet2 = new LinkedHashSet();
            }
            linkedHashMap.put("low_tag", linkedHashSet2);
        }
        if (feedComponentPriorityData != null && (map = feedComponentPriorityData.containerMap) != null && (componentContainerData = map.get("high_tag")) != null && (listLIZLLL = LIZLLL(componentContainerData, str, str2)) != null) {
            linkedHashSet3 = C13LP.LLIIIZ(C13LP.LJJJJLI(listLIZLLL));
        } else {
            linkedHashSet3 = new LinkedHashSet();
        }
        linkedHashMap.put("high_tag", linkedHashSet3);
        Collection collection2 = (Collection) linkedHashMap.get("high_tag");
        if (collection2 == null || collection2.isEmpty()) {
            Set<String> set2 = C697090RVz.LIZ().get("high_tag");
            if (set2 != null) {
                linkedHashSet4 = C13LP.LLIIIZ(set2);
            } else {
                linkedHashSet4 = new LinkedHashSet();
            }
            linkedHashMap.put("high_tag", linkedHashSet4);
        }
        if (function1 != null) {
            return (Map) function1.invoke(linkedHashMap);
        }
        return linkedHashMap;
    }
}
