package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.RemoteImageDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantAvailabilityDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantOptionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332780D2u {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    public static String LIZJ(UniversalProductDto universalProductDto, Map map) {
        ?? arrayList;
        String strLJ;
        Boolean bool;
        List list = universalProductDto.variants;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            boolean zBooleanValue = false;
            if (it2.hasNext()) {
                VariantDto variantDto = (VariantDto) it2.next();
                String str = variantDto.id;
                if (str == null) {
                    str = "";
                }
                String str2 = variantDto.title;
                List<VariantOptionDto> list2 = variantDto.options;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (VariantOptionDto variantOptionDto : list2) {
                    String str3 = variantOptionDto.name;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = variantOptionDto.label;
                    if (str4 == null) {
                        str4 = "";
                    }
                    Pair pair = new Pair(str3, str4);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                VariantAvailabilityDto variantAvailabilityDto = variantDto.availability;
                if (variantAvailabilityDto != null && (bool = variantAvailabilityDto.available) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                List<RemoteImageDto> list3 = variantDto.media;
                if (list3 != null) {
                    arrayList = new ArrayList();
                    Iterator<RemoteImageDto> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        String str5 = it3.next().url;
                        if (str5 != null && (strLJ = C0D4H.LJ(str5)) != null) {
                            arrayList.add(strLJ);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                arrayList2.add(new C332820D2y(str, str2, linkedHashMap, zBooleanValue, arrayList, false, 32, null));
            } else {
                return (String) C13LP.LJJJLL(LIZLLL(false, C13BV.INSTANCE, arrayList2, map));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ad, code lost:
    
        r11.add(r12.copy(r13, r12.availableForSale, r12.exists));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[PHI: r8
      0x009d: PHI (r8v8 boolean) = (r8v6 boolean), (r8v11 boolean) binds: [B:34:0x0081, B:39:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r24v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0D3V LIZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r25, com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332780D2u.LIZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto, com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData, boolean):X.0D3V");
    }

    public static final void LIZIZ(LinkedHashSet<String> linkedHashSet, List<String> list, List<String> list2) {
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            String strLJ = C0D4H.LJ(it2.next());
            if (strLJ != null && !a0.LJJJIL(strLJ) && !a0.LJJJIL(strLJ)) {
                String strLIZJ = C0D4H.LIZJ(strLJ);
                if (strLIZJ == null) {
                    strLIZJ = strLJ;
                }
                if (linkedHashSet.add(strLIZJ)) {
                    ((ArrayList) list).add(strLJ);
                }
            }
        }
    }

    public static List LIZLLL(boolean z, C13BV c13bv, List list, Map map) {
        Object next;
        List list2;
        Iterator it2 = list.iterator();
        loop0: while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C332820D2y c332820D2y = (C332820D2y) next;
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        Map<String, String> map2 = c332820D2y.options;
                        if (!map2.isEmpty()) {
                            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                                String key = entry2.getKey();
                                String value = entry2.getValue();
                                if (!u.LJIJI(key, str, true) || !u.LJIJI(value, str2, true)) {
                                }
                            }
                        }
                    }
                    break loop0;
                }
                break;
            }
            next = null;
            break;
        }
        C332820D2y c332820D2y2 = (C332820D2y) next;
        if (c332820D2y2 == null || (list2 = c332820D2y2.imageUrls) == null) {
            list2 = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZIZ(linkedHashSet, arrayList, list2);
        LIZIZ(linkedHashSet, arrayList, c13bv);
        return arrayList;
    }
}
