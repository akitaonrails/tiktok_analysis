package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.RemoteImageDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0D2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332790D2v {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZJ(UniversalProductDto universalProductDto) {
        String strLJ;
        List<RemoteImageDto> list = universalProductDto.media;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<RemoteImageDto> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().url;
                if (str != null && (strLJ = C0D4H.LJ(str)) != null) {
                    arrayList.add(strLJ);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2 A[PHI: r6
      0x00c2: PHI (r6v2 com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto) = 
      (r6v1 com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto)
      (r6v5 com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto)
     binds: [B:49:0x00c0, B:45:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332790D2v.LIZLLL(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto):java.lang.String");
    }

    public static List LJ(List list, Map map) {
        if (map.isEmpty()) {
            return C13BV.INSTANCE;
        }
        return C332780D2u.LIZLLL(true, C13BV.INSTANCE, list, map);
    }

    public static Pair LIZ(List list, List list2, List list3) {
        if (!((ArrayList) list2).isEmpty()) {
            return new Pair(list2, EnumC332810D2x.ENTRY_ENRICHED);
        }
        if (!list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C332780D2u.LIZIZ(linkedHashSet, arrayList, list);
            C332780D2u.LIZIZ(linkedHashSet, arrayList, list3);
            return new Pair(arrayList, EnumC332810D2x.CATALOG_ENRICHED);
        }
        return new Pair(list, EnumC332810D2x.STOREFRONT);
    }

    public static Pair LIZIZ(List list, List list2, List list3) {
        if (!list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C332780D2u.LIZIZ(linkedHashSet, arrayList, list);
            C332780D2u.LIZIZ(linkedHashSet, arrayList, list2);
            return new Pair(arrayList, EnumC332810D2x.CATALOG_ENRICHED);
        }
        if (!list3.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            C332780D2u.LIZIZ(linkedHashSet2, arrayList2, list);
            C332780D2u.LIZIZ(linkedHashSet2, arrayList2, list3);
            return new Pair(arrayList2, EnumC332810D2x.ENTRY_FALLBACK);
        }
        return new Pair(list, EnumC332810D2x.STOREFRONT);
    }
}
