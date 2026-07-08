package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.Map;
import webcast.api.sub.ExclusiveContent;
import webcast.api.sub.ExclusiveContentIconInfos;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499110Jhl extends C499090Jhj {
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final ImageModel LIZ() {
        Map<String, ExclusiveContentIconInfos> map;
        ExclusiveContent exclusiveContent = this.LIZIZ.exclusiveContent;
        ExclusiveContentIconInfos exclusiveContentIconInfos = (exclusiveContent == null || (map = exclusiveContent.exclusiveContentIcons) == null) ? null : map.get(this.LJIIIIZZ);
        if (this.LJFF) {
            if (exclusiveContentIconInfos != null) {
                return exclusiveContentIconInfos.iconDark;
            }
            return null;
        }
        if (exclusiveContentIconInfos != null) {
            return exclusiveContentIconInfos.iconLight;
        }
        return null;
    }

    public C499110Jhl(String str, int i, GetSubPrivilegeDetailResponse.Data data, String str2, String str3, String str4, String str5) {
        super(str, data, str2, str3);
        this.LJI = i;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
    }
}
