package X;

import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200260hL6 implements InterfaceC111300bX, InterfaceC2753014t {
    public final Map<String, String> LL;
    public final ExtensionMisc LLILLJJLI;
    public final PoiData LLILLL;
    public final List<MediaLocationMetaDataModel> LLILZ;
    public final EnumC1198680hIY LLILZIL;
    public final IAVPublishExtension.Callback LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200260hL6)) {
            return false;
        }
        C1200260hL6 c1200260hL6 = (C1200260hL6) obj;
        return Intrinsics.LJFF(this.LL, c1200260hL6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1200260hL6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1200260hL6.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1200260hL6.LLILZ) && this.LLILZIL == c1200260hL6.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1200260hL6.LLILZLL);
    }

    public final int hashCode() {
        Map<String, String> map = this.LL;
        int iHashCode = (((map == null ? 0 : map.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        PoiData poiData = this.LLILLL;
        int iHashCode2 = (iHashCode + (poiData == null ? 0 : poiData.hashCode())) * 31;
        List<MediaLocationMetaDataModel> list = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        IAVPublishExtension.Callback callback = this.LLILZLL;
        return iHashCode3 + (callback != null ? callback.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiPublishExtensionData(creationExtraData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extensionMisc=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiItem=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mediaLocationMetaDataList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", pageScene=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1200260hL6 LIZ(C1200260hL6 c1200260hL6, Map map, PoiData poiData, int i) {
        ExtensionMisc extensionMisc;
        List<MediaLocationMetaDataModel> list;
        EnumC1198680hIY enumC1198680hIY;
        PoiData poiData2 = poiData;
        Map map2 = map;
        if ((i & 1) != 0) {
            map2 = c1200260hL6.LL;
        }
        IAVPublishExtension.Callback callback = null;
        if ((i & 2) != 0) {
            extensionMisc = c1200260hL6.LLILLJJLI;
        } else {
            extensionMisc = null;
        }
        if ((i & 4) != 0) {
            poiData2 = c1200260hL6.LLILLL;
        }
        if ((i & 8) != 0) {
            list = c1200260hL6.LLILZ;
        } else {
            list = null;
        }
        if ((i & 16) != 0) {
            enumC1198680hIY = c1200260hL6.LLILZIL;
        } else {
            enumC1198680hIY = null;
        }
        if ((i & 32) != 0) {
            callback = c1200260hL6.LLILZLL;
        }
        c1200260hL6.getClass();
        return new C1200260hL6(map2, extensionMisc, poiData2, list, enumC1198680hIY, callback);
    }

    public C1200260hL6(Map<String, String> map, ExtensionMisc extensionMisc, PoiData poiData, List<MediaLocationMetaDataModel> list, EnumC1198680hIY enumC1198680hIY, IAVPublishExtension.Callback callback) {
        this.LL = map;
        this.LLILLJJLI = extensionMisc;
        this.LLILLL = poiData;
        this.LLILZ = list;
        this.LLILZIL = enumC1198680hIY;
        this.LLILZLL = callback;
    }
}
