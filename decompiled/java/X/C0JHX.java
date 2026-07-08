package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0JHX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0JHX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC489360JHa.values().length];
        try {
            iArr[EnumC489360JHa.RE_EDIT_SCENE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
