package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0oC4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1463740oC4 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[VEEditor.SEEK_MODE.values().length];
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateIn.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateOut.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
        int[] iArr2 = new int[VEEditor.SET_RANGE_MODE.values().length];
        try {
            iArr2[VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZIZ = iArr2;
    }
}
