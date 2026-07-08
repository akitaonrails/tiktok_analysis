package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1461405no {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1461205nm.values().length];
        try {
            iArr[EnumC1461205nm.UPDATE_MEMBER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
