package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369630lkH {
    @InterfaceC1294060jmO
    public static final int LIZ(int i, Context context) {
        Integer numLIZJ;
        Integer numLIZJ2 = C1308910kAL.LIZJ(i, context);
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            interfaceC1370110ll3.LIZIZ();
            Integer numValueOf = Integer.valueOf(R.style.xm);
            if (numValueOf != null && (numLIZJ = C1308910kAL.LIZJ(i, new C1361400lX0(context, numValueOf.intValue()))) != null) {
                return numLIZJ.intValue();
            }
            return -1;
        }
        return -1;
    }
}
