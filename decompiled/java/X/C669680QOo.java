package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C669680QOo {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC669690QOp.values().length];
        try {
            iArr[EnumC669690QOp.RENDER_FINISH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
