package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.p2;

/* JADX INFO: renamed from: X.0CoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C324730CoB {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[p2.b.values().length];
        try {
            iArr[p2.b.QUEUE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[p2.b.BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[p2.b.IMMEDIATE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
