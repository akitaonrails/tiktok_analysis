package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.w2;

/* JADX INFO: renamed from: X.0ChC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C320400ChC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[w2.a.values().length];
        try {
            iArr[w2.a.HISTORY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
