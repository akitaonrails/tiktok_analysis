package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0N5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C588200N5e {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC588190N5d.values().length];
        try {
            iArr[EnumC588190N5d.ICY_CLASH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
