package X;

import android.app.Activity;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.utils.permission.PermissionViewModel;

/* JADX INFO: renamed from: X.0zCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886700zCG {
    public static void LIZ(Activity activity, int i, int[] iArr) {
        int i2;
        C1886690zCF c1886690zCF = ((PermissionViewModel) ViewModelProviders.of((C19EG) activity).get(PermissionViewModel.class)).LL;
        if (c1886690zCF != null && (i2 = c1886690zCF.LIZIZ) != -1 && i == i2 && c1886690zCF.LIZ != null) {
            for (int i3 : iArr) {
                if (i3 != 0) {
                    c1886690zCF.LIZ.LIZ();
                    return;
                }
            }
            c1886690zCF.LIZ.LIZIZ();
        }
    }
}
