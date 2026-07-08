package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0MV5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MV5 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0MV7());

    public static void LIZ(boolean z) {
        ((Keva) LIZ.getValue()).storeBoolean("IS_SHOWING_RESTORE_PUSH", z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsShowingRestorePush = ");
        sbLIZ.append(z);
        C201955140j.LIZIZ("CheckpointRestorePushShowFrequencyHelper", C2188811AlT.LIZIZ(sbLIZ));
    }
}
