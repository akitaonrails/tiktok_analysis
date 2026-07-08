package X;

import com.bytedance.ies.nle.editor_jni.NLELokiResourceType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Dxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C356290Dxz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[NLELokiResourceType.values().length];
        try {
            iArr[NLELokiResourceType.EFFECT_ID.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[NLELokiResourceType.PANEL_RESOURCE_ID.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
