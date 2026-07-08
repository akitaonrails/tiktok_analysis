package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.io.FileWalkDirection;

/* JADX INFO: renamed from: X.08QF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C08QF {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[FileWalkDirection.values().length];
        try {
            iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
