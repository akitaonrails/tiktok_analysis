package X;

import com.bytedance.sdui.render.bridge.ReadableType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1297900jsa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ReadableType.values().length];
        LIZ = iArr;
        try {
            iArr[ReadableType.Boolean.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[ReadableType.String.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
