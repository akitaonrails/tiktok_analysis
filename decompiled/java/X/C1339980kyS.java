package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0kyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339980kyS {
    public static C1294720jnS LIZ;
    public static C1294720jnS LIZIZ;

    public static void LIZ(Context context) {
        if (context == null) {
            return;
        }
        if (LIZ == null) {
            C1294250jmh.LJIIIIZZ(R.raw.tux_lottie_common_phototext_heart_cracked_light, context).LIZIZ(new InterfaceC1292040jj8() { // from class: X.0kyT
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    if (c1294720jnS != null) {
                        C1339980kyS.LIZ = c1294720jnS;
                    }
                }
            });
        }
        if (LIZIZ == null) {
            C1294250jmh.LJIIIIZZ(R.raw.tux_lottie_common_phototext_heart_cracked_dark, context).LIZIZ(new InterfaceC1292040jj8() { // from class: X.0kyU
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    if (c1294720jnS != null) {
                        C1339980kyS.LIZIZ = c1294720jnS;
                    }
                }
            });
        }
    }
}
