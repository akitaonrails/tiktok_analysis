package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: renamed from: X.15i6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20593215i6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Bundle bundle, Context context, Configuration configuration) {
        int i;
        bundle.putInt("screen_width_dp", C1389340mG4.LJ());
        bundle.putInt("screen_height_dp", C1389340mG4.LIZLLL());
        if (C1389340mG4.LIZJ(context, configuration).LJFF) {
            i = 3;
        } else {
            i = 1;
        }
        bundle.putInt("pad_interface_orientation", i);
        C20593115i5.LIZ.getClass();
        bundle.putInt("pad_fold_state", C20593115i5.LIZIZ(context));
    }
}
