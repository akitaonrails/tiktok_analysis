package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Dld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C348630Dld {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[NLEResType.values().length];
        try {
            iArr[NLEResType.ANIMATION_VIDEO_IN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[NLEResType.ANIMATION_VIDEO_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[NLEResType.ANIMATION_VIDEO_COMBO.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
