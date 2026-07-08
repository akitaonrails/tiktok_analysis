package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1103030eoH {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1102990eoD.values().length];
        try {
            iArr[EnumC1102990eoD.HIGHLIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
