package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0i6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1229440i6A {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC913760Zt0.values().length];
        try {
            iArr[EnumC913760Zt0.AI_SHOT_GROUP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
