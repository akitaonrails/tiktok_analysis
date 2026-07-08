package X;

import android.graphics.RectF;
import com.ss.android.vesdk.VESize;
import java.util.List;

/* JADX INFO: renamed from: X.0ngS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444140ngS {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(InterfaceC1452170ntP interfaceC1452170ntP, InterfaceC1444130ngR interfaceC1444130ngR, List<? extends InterfaceC1444160ngU> list, boolean z) {
        boolean zVe1 = false;
        if (interfaceC1444130ngR.LJFF() == interfaceC1444130ngR.LIZIZ(true) && interfaceC1444130ngR.LIZJ() == interfaceC1444130ngR.LIZ(true)) {
            return false;
        }
        VESize initSize = interfaceC1452170ntP.getInitSize();
        int iLIZIZ = interfaceC1444130ngR.LIZIZ(true);
        int iLIZ = interfaceC1444130ngR.LIZ(true);
        interfaceC1444130ngR.LJFF();
        interfaceC1444130ngR.LIZJ();
        RectF rectF = new RectF();
        if (z) {
            float f = initSize.height;
            float f2 = initSize.width;
            float f3 = (f2 - (iLIZIZ * ((1.0f * f) / iLIZ))) / 2;
            rectF.set(f3, 0.0f, f2 - f3, f);
        } else {
            float f4 = initSize.width;
            float f5 = initSize.height;
            float f6 = (f5 - (iLIZ * ((1.0f * f4) / iLIZIZ))) / 2.0f;
            rectF.set(0.0f, f6, f4, f5 - f6);
        }
        for (InterfaceC1444160ngU interfaceC1444160ngU : list) {
            if (interfaceC1444160ngU != null) {
                zVe1 |= interfaceC1444160ngU.ve1(rectF);
            }
        }
        return zVe1;
    }
}
