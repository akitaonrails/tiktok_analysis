package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C599520NfK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC599500NfI.values().length];
        try {
            iArr[EnumC599500NfI.ACTION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC599500NfI.EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
