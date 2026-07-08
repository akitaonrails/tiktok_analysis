package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;

/* JADX INFO: renamed from: X.10IQ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C10IQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AwemeStatus.MappedMuteStripStatus.values().length];
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_WAIT_FOR_TRIGGER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_REMOVING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_FOR_CONFIRM.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_ADD_SONGS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
