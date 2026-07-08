package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QUX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QUX {
    public static EcSearchSugResponse LIZIZ;
    public static boolean LIZLLL;
    public static final C0QUX LIZ = new C0QUX();
    public static C0QUZ LIZJ = new C0QUZ();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(464));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(465));

    public static boolean LIZJ() {
        long j = ((Keva) LJ.getValue()).getLong("ec_cache_time", -1L);
        if (j == -1) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C671110QUb.LIZ.getClass();
        return jCurrentTimeMillis > ((long) ((C671110QUb.LIZ().sugCacheExpireTime * 60) * LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public static EcSearchSugResponse LIZ(String str) {
        boolean z;
        SortedMap sortedMapSynchronizedSortedMap;
        List<SearchSugEntity> list;
        List<SearchSugEntity> list2;
        List<SearchSugEntity> list3;
        int size = 0;
        if (LIZLLL && !LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        System.currentTimeMillis();
        C0QUZ c0quz = LIZJ;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C671100QUa c671100QUa = c0quz.LIZ;
        int length = lowerCase.length();
        int i = 0;
        while (true) {
            if (i < length) {
                c671100QUa = c671100QUa.LIZ.get(Character.valueOf(lowerCase.charAt(i)));
                if (c671100QUa == null) {
                    break;
                }
                i++;
            } else if (c671100QUa != null) {
                sortedMapSynchronizedSortedMap = Collections.synchronizedSortedMap(new TreeMap(new Comparator() { // from class: X.00te
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Intrinsics.LJI(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                }));
                C0QUZ.LIZ(c671100QUa, lowerCase, sortedMapSynchronizedSortedMap);
            }
        }
        sortedMapSynchronizedSortedMap = Collections.synchronizedSortedMap(new TreeMap());
        EcSearchSugResponse ecSearchSugResponse = LIZIZ;
        if (ecSearchSugResponse != null && (list3 = ecSearchSugResponse.sugList) != null) {
            list3.clear();
        }
        int i2 = 0;
        for (Map.Entry entry : sortedMapSynchronizedSortedMap.entrySet()) {
            if (i2 > 9) {
                break;
            }
            SearchSugEntity searchSugEntity = ((C671100QUa) entry.getValue()).LIZLLL;
            if (searchSugEntity != null) {
                int length2 = str.length();
                int length3 = searchSugEntity.content.length() - 1;
                if (length2 >= 0 && length2 <= length3) {
                    Position position = new Position();
                    position.setBegin(length2);
                    position.setEnd(length3);
                    searchSugEntity.highLightPositions = C1697810uHb.LJIILJJIL(position);
                }
                if (searchSugEntity.sugExtraInfo == null) {
                    searchSugEntity.sugExtraInfo = new SugExtraInfo();
                }
                EcSearchSugResponse ecSearchSugResponse2 = LIZIZ;
                if (ecSearchSugResponse2 != null && (list2 = ecSearchSugResponse2.sugList) != null) {
                    list2.add(searchSugEntity);
                }
                i2++;
            }
        }
        EcSearchSugResponse ecSearchSugResponse3 = LIZIZ;
        if (ecSearchSugResponse3 != null && (list = ecSearchSugResponse3.sugList) != null) {
            size = list.size();
        }
        C671110QUb.LIZ.getClass();
        if (size < C671110QUb.LIZ().showCacheMinSize) {
            return null;
        }
        EcSearchSugResponse ecSearchSugResponse4 = LIZIZ;
        if (ecSearchSugResponse4 != null) {
            ecSearchSugResponse4.LLILLJJLI = str;
        }
        return ecSearchSugResponse4;
    }

    public static void LIZIZ(EcSearchSugResponse ecSearchSugResponse) {
        Integer numValueOf;
        C671100QUa c671100QUaPutIfAbsent;
        if (ecSearchSugResponse == null) {
            return;
        }
        LIZIZ = ecSearchSugResponse;
        System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertTire count:");
        List<SearchSugEntity> list = ecSearchSugResponse.sugList;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = new C0QUZ();
        int i = 0;
        for (SearchSugEntity searchSugEntity : ecSearchSugResponse.sugList) {
            C0QUZ c0quz = LIZJ;
            int i2 = i + 1;
            c0quz.getClass();
            String str = searchSugEntity.content;
            C671100QUa c671100QUa = c0quz.LIZ;
            int length = str.length();
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                ConcurrentSkipListMap<Character, C671100QUa> concurrentSkipListMap = c671100QUa.LIZ;
                Character chValueOf = Character.valueOf(cCharAt);
                C671100QUa c671100QUa2 = concurrentSkipListMap.get(chValueOf);
                if (c671100QUa2 == null && (c671100QUaPutIfAbsent = concurrentSkipListMap.putIfAbsent(chValueOf, (c671100QUa2 = new C671100QUa()))) != null) {
                    c671100QUa2 = c671100QUaPutIfAbsent;
                }
                c671100QUa = c671100QUa2;
            }
            c671100QUa.LIZIZ = true;
            c671100QUa.LIZJ = i;
            c671100QUa.LIZLLL = searchSugEntity;
            i = i2;
        }
        LIZLLL = true;
    }
}
