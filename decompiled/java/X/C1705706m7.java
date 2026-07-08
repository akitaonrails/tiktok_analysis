package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.06m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1705706m7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1705606m6.values().length];
        try {
            iArr[EnumC1705606m6.INTERACTION_TYPE_INSIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1705606m6.INTERACTION_TYPE_FEEDBACK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
