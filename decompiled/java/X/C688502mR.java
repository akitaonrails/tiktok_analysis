package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.LogisticIcon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: renamed from: X.02mR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C688502mR {
    public static final Image LIZ(Context context, LogisticIcon logisticIcon) {
        if (C1744700vVE.LJ(context, null)) {
            if (logisticIcon == null) {
                return null;
            }
            return logisticIcon.iconDark;
        }
        if (logisticIcon == null) {
            return null;
        }
        return logisticIcon.icon;
    }
}
