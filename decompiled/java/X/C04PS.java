package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.util.IPublicGroupPreviewUtil;

/* JADX INFO: renamed from: X.04PS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04PS implements IPublicGroupPreviewUtil {
    public static final C04PS LIZ = new C04PS();

    @Override // com.ss.android.ugc.aweme.util.IPublicGroupPreviewUtil
    public final boolean LIZ(String str) {
        IPublicGroupPreviewUtil iPublicGroupPreviewUtil = (IPublicGroupPreviewUtil) PluggableExtentionKt.pluggableSpiForReal(IPublicGroupPreviewUtil.class);
        if (iPublicGroupPreviewUtil == null || !iPublicGroupPreviewUtil.LIZ(str)) {
            return false;
        }
        return true;
    }
}
