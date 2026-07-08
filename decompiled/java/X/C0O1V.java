package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0O1V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1V {
    public static PopupInstanceConfig LIZ(UnifiedAuthPopupConfig unifiedAuthPopupConfig) {
        List<PopupInstanceConfig> list = unifiedAuthPopupConfig.popupInstances;
        if (list == null || !(!list.isEmpty()) || unifiedAuthPopupConfig.currentIndex >= list.size()) {
            return null;
        }
        return (PopupInstanceConfig) ListProtector.get(list, unifiedAuthPopupConfig.currentIndex);
    }
}
