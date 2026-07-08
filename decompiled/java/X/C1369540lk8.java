package X;

import android.content.Context;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369540lk8 {
    public static final C1361400lX0 LIZIZ(Context context) {
        int iIntValue;
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            interfaceC1370110ll3.LJIIIIZZ();
            C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.nj);
            Integer numLIZ = C1308910kAL.LIZ(R.attr.pc, c1361400lX0);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = 0;
            }
            return new C1361400lX0(c1361400lX0, iIntValue);
        }
        return null;
    }

    public static final Integer LIZ(int i, C1361400lX0 c1361400lX0) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        if (!c1361400lX0.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }
}
