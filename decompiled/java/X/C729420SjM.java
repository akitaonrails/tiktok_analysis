package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0SjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C729420SjM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC729410SjL.values().length];
        try {
            iArr[EnumC729410SjL.PUBLISH_START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
