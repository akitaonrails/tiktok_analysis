package X;

import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBKYCInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;

/* JADX INFO: renamed from: X.0Jdq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496680Jdq {
    public static final boolean LIZ(SMBVerificationInfo sMBVerificationInfo) {
        SMBKYBInfo sMBKYBInfo = sMBVerificationInfo.kybInfo;
        if (sMBKYBInfo == null || sMBKYBInfo.status != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(SMBVerificationInfo sMBVerificationInfo) {
        SMBKYCInfo sMBKYCInfo = sMBVerificationInfo.kycInfo;
        if (sMBKYCInfo == null || sMBKYCInfo.status != 2) {
            return false;
        }
        return true;
    }
}
