package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.Map;
import webcast.api.pgc_sub.PGCExclusiveContent;
import webcast.api.pgc_sub.PGCExclusiveContentIconInfos;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510560K0o extends C510630K0v {
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final ImageModel LIZ() {
        Map<String, PGCExclusiveContentIconInfos> map;
        PGCExclusiveContent pGCExclusiveContent = this.LIZIZ.exclusiveContent;
        PGCExclusiveContentIconInfos pGCExclusiveContentIconInfos = (pGCExclusiveContent == null || (map = pGCExclusiveContent.exclusiveContentIcons) == null) ? null : map.get(this.LJIIIIZZ);
        if (this.LJFF) {
            if (pGCExclusiveContentIconInfos != null) {
                return pGCExclusiveContentIconInfos.iconDark;
            }
            return null;
        }
        if (pGCExclusiveContentIconInfos != null) {
            return pGCExclusiveContentIconInfos.iconLight;
        }
        return null;
    }

    public /* synthetic */ C510560K0o(String str, int i, PGCGetSubPrivilegeDetailResponse.Data data, String str2, String str3, String str4) {
        this(str, i, data, str2, str3, "", str4);
    }

    public C510560K0o(String str, int i, PGCGetSubPrivilegeDetailResponse.Data data, String str2, String str3, String str4, String str5) {
        super(str, data, str2, str3);
        this.LJI = i;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
    }
}
