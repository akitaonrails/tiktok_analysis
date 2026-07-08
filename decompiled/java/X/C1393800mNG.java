package X;

import com.bytedance.android.btm.api.BtmSDK;

/* JADX INFO: renamed from: X.0mNG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393800mNG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Object obj, C0PSL c0psl) {
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        if (btmSDK.getPageLifecycle().LJ(obj, true, c0psl)) {
            return;
        }
        btmSDK.getPageLifecycle().LIZ(obj, true);
    }
}
