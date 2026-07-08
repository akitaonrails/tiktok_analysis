package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0C4F, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C4F {
    public static final int[] LIZ = {7, 3};

    public static int[] LIZ() {
        int[] iArr = (int[]) SettingsManager.LIZLLL().LJIIIIZZ("active_praise_dialog_config", int[].class, LIZ);
        return (iArr == null || iArr.length != 2) ? new int[]{7, 3} : iArr;
    }
}
