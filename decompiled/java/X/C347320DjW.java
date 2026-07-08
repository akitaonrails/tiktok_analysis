package X;

import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C347320DjW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[NLETrackType.values().length];
        try {
            iArr[NLETrackType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[NLETrackType.STICKER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
