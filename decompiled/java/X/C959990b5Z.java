package X;

import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import com.bytedance.android.livesdk.chatroom.interact.model.RandomLinkMicExtra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0b5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959990b5Z {
    public static final void LIZ(AutoMatchResp.ResponseData responseData) {
        RandomLinkMicExtra randomLinkMicExtra = (RandomLinkMicExtra) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, responseData.settings, RandomLinkMicExtra.class);
        if (randomLinkMicExtra != null && randomLinkMicExtra.expectMatchTime > 0 && randomLinkMicExtra.timeoutTime > 0 && randomLinkMicExtra.roundTime > 0) {
            return;
        }
        new RandomLinkMicExtra();
    }
}
