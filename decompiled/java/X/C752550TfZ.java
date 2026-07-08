package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C752550TfZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC752540TfY.values().length];
        try {
            iArr[EnumC752540TfY.MODERATOR_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
