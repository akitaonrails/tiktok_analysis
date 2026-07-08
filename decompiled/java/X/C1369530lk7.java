package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369530lk7 {
    public static final /* synthetic */ int LIZ = 0;

    public static C1361400lX0 LIZ(Context context) {
        C1361400lX0 c1361400lX0;
        int iIntValue;
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            interfaceC1370110ll3.LJIIIIZZ();
            c1361400lX0 = new C1361400lX0(context, R.style.nj);
            Integer numLIZ = C1308910kAL.LIZ(R.attr.pc, c1361400lX0);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            }
            return new C1361400lX0(c1361400lX0, iIntValue);
        }
        c1361400lX0 = null;
        iIntValue = 0;
        return new C1361400lX0(c1361400lX0, iIntValue);
    }

    public static String LIZIZ(int i) {
        Context applicationContext;
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null && (applicationContext = interfaceC1370110ll3.getApplicationContext()) != null) {
            return applicationContext.getString(i);
        }
        return null;
    }
}
