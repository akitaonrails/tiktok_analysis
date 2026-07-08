package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;

/* JADX INFO: renamed from: X.10IP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C10IP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AwemeStatus.MappedMuteStripStatus.values().length];
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_WAIT_FOR_TRIGGER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_ADD_SONGS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_FOR_CONFIRM.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
