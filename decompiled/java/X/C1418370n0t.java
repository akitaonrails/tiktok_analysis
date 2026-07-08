package X;

import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0n0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1418370n0t {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[MusicRequestCallbackInfoType.values().length];
        try {
            iArr[MusicRequestCallbackInfoType.REQUEST_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[MusicRequestCallbackInfoType.RESPONSE_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
