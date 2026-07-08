package X;

import com.bytedance.ies.nle.editor_jni.NLELokiResourceType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Dy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C356300Dy0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[NLELokiResourceType.values().length];
        try {
            iArr[NLELokiResourceType.EFFECT_ID.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
