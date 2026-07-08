package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jo4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295100jo4 {
    public static final PointF LIZ = new PointF();

    public static PointF LIZ(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int LIZJ(float f, float f2) {
        boolean z;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static float LIZIZ(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void LIZLLL(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32, InterfaceC1295880jpK interfaceC1295880jpK) {
        if (c1295090jo3.LIZ(i, interfaceC1295880jpK.getName())) {
            String name = interfaceC1295880jpK.getName();
            c1295090jo32.getClass();
            C1295090jo3 c1295090jo33 = new C1295090jo3(c1295090jo32);
            c1295090jo33.LIZ.add(name);
            C1295090jo3 c1295090jo34 = new C1295090jo3(c1295090jo33);
            c1295090jo34.LIZIZ = interfaceC1295880jpK;
            ((ArrayList) list).add(c1295090jo34);
        }
    }
}
