package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZME, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0ZME {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC909380Zlw.values().length];
        try {
            iArr[EnumC909380Zlw.COMMON_LIGHT_INTERACTION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
