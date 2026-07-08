package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.048h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10489048h {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(483));

    public static void LIZ(Activity activity, boolean z, boolean z2) {
        List<C03XI> list;
        int i;
        if (z) {
            if (z2) {
                list = C10488048g.LIZLLL;
            } else {
                list = C10488048g.LIZJ;
            }
        } else {
            list = C10488048g.LIZIZ;
        }
        if (!list.isEmpty()) {
            if (z) {
                InterfaceC10490048i interfaceC10490048i = (InterfaceC10490048i) LIZ.getValue();
                if (C960203pA.LIZIZ(activity)) {
                    i = R.style.y0;
                } else {
                    i = R.style.xx;
                }
                interfaceC10490048i.LIZIZ(Integer.valueOf(i), list);
                return;
            }
            ((InterfaceC10490048i) LIZ.getValue()).LIZ(activity, list, null);
        }
    }
}
