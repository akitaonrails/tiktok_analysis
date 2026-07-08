package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;

/* JADX INFO: renamed from: X.0SAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C717080SAw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PostModeEntranceMechanism.values().length];
        try {
            iArr[PostModeEntranceMechanism.TAP_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[PostModeEntranceMechanism.PINCH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[PostModeEntranceMechanism.SWIPE_LEFT_LAST_IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[PostModeEntranceMechanism.SLIDE_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
