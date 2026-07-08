package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0gXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1169590gXd {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1169600gXe.values().length];
        try {
            iArr[EnumC1169600gXe.ONLY_AVATAR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
