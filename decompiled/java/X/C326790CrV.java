package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C326790CrV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC323450Cm7.values().length];
        try {
            iArr[EnumC323450Cm7.Next.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
