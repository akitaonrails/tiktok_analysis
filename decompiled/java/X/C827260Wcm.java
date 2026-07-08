package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C827260Wcm {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC827250Wcl.values().length];
        try {
            iArr[EnumC827250Wcl.BUNDLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
