package X;

import com.bytedance.android.livesdk.livesetting.level.FansClubAbnormalEventEnableSetting;

/* JADX INFO: renamed from: X.0f75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114690f75 {
    public static final boolean LIZ(long j, long j2) {
        if (FansClubAbnormalEventEnableSetting.INSTANCE.getValue() && Math.abs(j2 - j) > 1) {
            return true;
        }
        return false;
    }
}
