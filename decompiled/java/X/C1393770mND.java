package X;

import android.app.Dialog;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;

/* JADX INFO: renamed from: X.0mND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393770mND {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Dialog dialog) {
        Boolean bool = Boolean.FALSE;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        btmSDK.getPageLifecycle().LIZIZ(dialog, BtmPageLifecycle.State.DESTROYED);
        btmSDK.getPageLifecycle().LJFF(dialog, bool, null);
        btmSDK.getPageLifecycle().LIZJ(dialog);
    }
}
