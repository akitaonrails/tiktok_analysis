package X;

import com.bytedance.ies.nle.editor_jni.NLERenderAction;
import com.bytedance.ies.nle.editor_jni.NLEVEOperationResType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1778540wNo {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[NLEVEOperationResType.values().length];
        try {
            iArr[NLEVEOperationResType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[NLEVEOperationResType.EFFECT_AMAZING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[NLEVEOperationResType.EFFECT_NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[NLEVEOperationResType.EFFECT_COMPOSER.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[NLEVEOperationResType.EFFECT_TIME.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
        int[] iArr2 = new int[NLERenderAction.values().length];
        try {
            iArr2[NLERenderAction.ACTION_INSERT.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[NLERenderAction.ACTION_DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[NLERenderAction.ACTION_UPDATE.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LIZIZ = iArr2;
    }
}
