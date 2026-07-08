package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInteractiveEnlargedPreviewSettings;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fQN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126650fQN {
    public static final void LIZ(C1324720kZq c1324720kZq) {
        int iLJIIIZ;
        if (c1324720kZq == null) {
            return;
        }
        if (C1130100fVw.LIZ.LJFF == 17 && LiveGiftInteractiveEnlargedPreviewSettings.INSTANCE.getEnabled()) {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.apx);
        } else {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.apn);
        }
        C500260Jjc.LJLL(iLJIIIZ, iLJIIIZ, c1324720kZq);
    }
}
