package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0egc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1098280egc {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;

    static {
        int[] iArr = new int[EnumC1098320egg.values().length];
        try {
            iArr[EnumC1098320egg.HYBRID.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1098320egg.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1098300ege.values().length];
        try {
            iArr2[EnumC1098300ege.HYBRID.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC1098300ege.NATIVE_DROP_DYNAMIC.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC1098300ege.NATIVE_WHEN_ALL_STATIC.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC1098300ege.NATIVE_WHEN_HIGH_LOAD.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[EnumC1098300ege.NATIVE.ordinal()] = 5;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC1098310egf.values().length];
        try {
            iArr3[EnumC1098310egf.AUTO_SCROLL.ordinal()] = 1;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr3[EnumC1098310egf.DRAG.ordinal()] = 2;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr3[EnumC1098310egf.PANEL_ITEM_SCROLL.ordinal()] = 3;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        LIZJ = iArr3;
        int[] iArr4 = new int[EnumC1098600eh8.values().length];
        try {
            iArr4[EnumC1098600eh8.EXPAND.ordinal()] = 1;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr4[EnumC1098600eh8.COLLAPSE.ordinal()] = 2;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr4[EnumC1098600eh8.EXPANDING.ordinal()] = 3;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr4[EnumC1098600eh8.COLLAPSING.ordinal()] = 4;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        LIZLLL = iArr4;
    }
}
