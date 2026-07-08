package X;

import com.bytedance.aigc.proto.Level;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0LUS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0LUS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Level.values().length];
        try {
            iArr[Level.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
