package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;

/* JADX INFO: renamed from: X.0nfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1443730nfn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[StoryUploadPageEntranceType.values().length];
        LIZ = iArr;
        try {
            iArr[StoryUploadPageEntranceType.CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[StoryUploadPageEntranceType.REVEAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[StoryUploadPageEntranceType.REVEAL_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[StoryUploadPageEntranceType.THOUGHT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
