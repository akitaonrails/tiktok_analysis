package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0F4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C384060F4a {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC1429610nJ1.values().length];
        try {
            iArr[EnumC1429610nJ1.EDIT_EFFECT_SERVER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1429610nJ1.EDIT_EFFECT_CLIENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[NLEResType.values().length];
        try {
            iArr2[NLEResType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[NLEResType.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZIZ = iArr2;
    }
}
