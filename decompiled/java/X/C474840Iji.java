package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.common.SubscribeNoticeDialog;

/* JADX INFO: renamed from: X.0Iji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474840Iji {
    public static void LIZ(FragmentManager fragmentManager, String str) {
        SubscribeNoticeDialog subscribeNoticeDialog = new SubscribeNoticeDialog();
        subscribeNoticeDialog.LLILLL = str;
        subscribeNoticeDialog.show(fragmentManager, "SubscribeNoticeDialog");
    }
}
