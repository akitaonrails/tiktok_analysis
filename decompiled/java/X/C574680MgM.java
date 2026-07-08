package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0MgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C574680MgM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VEEditor.SEEK_MODE.values().length];
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateIn.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateOut.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
