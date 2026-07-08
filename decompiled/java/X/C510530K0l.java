package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.common.SubscribeNoticeDialog;

/* JADX INFO: renamed from: X.0K0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510530K0l {
    public static void LIZ(FragmentManager fragmentManager, String str) {
        SubscribeNoticeDialog subscribeNoticeDialog = new SubscribeNoticeDialog();
        subscribeNoticeDialog.LLJLIL = str;
        subscribeNoticeDialog.show(fragmentManager, "SubscribeNoticeDialog");
    }
}
