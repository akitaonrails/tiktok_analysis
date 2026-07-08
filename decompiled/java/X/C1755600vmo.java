package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpInflaterOptExperiment;

/* JADX INFO: renamed from: X.0vmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755600vmo {
    public static final C1755600vmo LIZ = new C1755600vmo();

    public static void LIZJ(Activity activity, boolean z, boolean z2) {
        if (EcSeaPdpInflaterOptExperiment.LIZJ) {
            if (EcSeaPdpInflaterOptExperiment.LIZLLL) {
                if (!z2) {
                    C10489048h.LIZ(activity, z, true);
                    return;
                }
                return;
            } else if (!z) {
                C10489048h.LIZ(activity, false, false);
                return;
            } else {
                if (!z2) {
                    return;
                }
                C10489048h.LIZ(activity, true, false);
                return;
            }
        }
        if (!z) {
            C01R7.LIZ.getClass();
            C01R7.LIZ(activity);
        } else {
            if (!z2) {
                return;
            }
            C01R7.LIZ.getClass();
            C01R7.LIZ(activity);
        }
    }

    public static View LIZ(int i, Context context, ViewGroup viewGroup, boolean z, boolean z2) {
        if (EcSeaPdpInflaterOptExperiment.LIZJ) {
            return ((InterfaceC10490048i) C10489048h.LIZ.getValue()).inflate(context, i, viewGroup, z);
        }
        if (z2) {
            C01R7.LIZ.getClass();
            return C1701430uNR.LIZ(context, i, viewGroup, z);
        }
        return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
    }
}
