package X;

import android.graphics.Typeface;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX INFO: renamed from: X.0kzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340540kzM {
    public static final /* synthetic */ int LIZ = 0;

    public static Typeface LIZ(boolean z, float f, int i, int i2) {
        float f2;
        int i3;
        int i4 = i;
        if ((i2 & 4) != 0) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            i4 = 100;
        }
        if (z) {
            i3 = OppoPermissionPopupMaskDelayExp.DEFAULT;
        } else {
            i3 = 500;
        }
        return C1697580uHE.LIZIZ(0.0f, i3, f2, 0.0f, Float.valueOf(f), 0.0f, i4, null, 136);
    }
}
