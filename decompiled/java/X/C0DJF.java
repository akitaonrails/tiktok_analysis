package X;

import java.util.List;

/* JADX INFO: renamed from: X.0DJF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJF {
    public static final List<String> LIZ(String str) {
        boolean z;
        C0Y8T c0y8tLIZ;
        C0Y8Y coreInfo;
        List<String> memberRegions;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "imsdk_enable_set_media_vod_region", true) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || str == null || str.length() == 0 || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) == null || (coreInfo = c0y8tLIZ.getCoreInfo()) == null || (memberRegions = coreInfo.getMemberRegions()) == null || memberRegions.isEmpty()) {
            return null;
        }
        return memberRegions;
    }
}
