package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zKG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C1891660zKG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1913550ztZ.values().length];
        try {
            iArr[EnumC1913550ztZ.VIDEO_SIZE_CHANGED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1913550ztZ.BUFFERING_START.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1913550ztZ.BUFFERING_END.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
