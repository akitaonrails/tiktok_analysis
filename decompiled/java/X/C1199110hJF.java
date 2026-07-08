package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199110hJF {
    public final LruCache<String, PoiSearchApi.PoiSearchResultWrapper> LIZ = new LruCache<>(16);

    public static String LIZ(double d, double d2, String str, boolean z) {
        if (C297510BlN.LIZIZ()) {
            if (str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('(');
                sbLIZ.append(str);
                sbLIZ.append(")-(");
                sbLIZ.append(d);
                sbLIZ.append(")-(");
                sbLIZ.append(d2);
                sbLIZ.append(")-(");
                sbLIZ.append(z);
                sbLIZ.append(")-(");
                sbLIZ.append(C297500BlM.LIZ());
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('(');
            sbLIZ2.append(d);
            sbLIZ2.append(")-(");
            sbLIZ2.append(d2);
            sbLIZ2.append(")-(");
            sbLIZ2.append(z);
            sbLIZ2.append(")-(");
            sbLIZ2.append(C297500BlM.LIZ());
            sbLIZ2.append(')');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (str != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('(');
            sbLIZ3.append(str);
            sbLIZ3.append(")-(");
            sbLIZ3.append(d);
            sbLIZ3.append(")-(");
            sbLIZ3.append(d2);
            sbLIZ3.append(")-(");
            sbLIZ3.append(z);
            sbLIZ3.append(')');
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append('(');
        sbLIZ4.append(d);
        sbLIZ4.append(")-(");
        sbLIZ4.append(d2);
        sbLIZ4.append(")-(");
        sbLIZ4.append(z);
        sbLIZ4.append(')');
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public final PoiSearchApi.PoiSearchResultWrapper LIZIZ(double d, double d2, String str, boolean z) {
        boolean z2;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            poiSearchResultWrapper = this.LIZ.get(LIZ(d, d2, str, z));
            if (poiSearchResultWrapper == null) {
                return null;
            }
            if (poiSearchResultWrapper.poiSearchResult != null && !(!Intrinsics.LJFF(r0.isCacheForSearch(), Boolean.FALSE))) {
                return null;
            }
        } else {
            poiSearchResultWrapper = this.LIZ.get(LIZ(d, d2, str, z));
            if (poiSearchResultWrapper == null) {
                return null;
            }
        }
        return PoiSearchApi.PoiSearchResultWrapper.LJ(poiSearchResultWrapper, 1, 0, 1999);
    }

    public final void LIZJ(String str, double d, double d2, boolean z, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper) {
        this.LIZ.put(LIZ(d, d2, str, z), poiSearchResultWrapper);
    }
}
