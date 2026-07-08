package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291750jif {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new ThreadLocal<PointF>() { // from class: X.0jig
            @Override // java.lang.ThreadLocal
            public final PointF initialValue() {
                return new PointF();
            }
        };
    }

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

    public static void LIZLLL(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2, InterfaceC1291770jih interfaceC1291770jih) {
        if (c1291740jie.LIZ(i, interfaceC1291770jih.getName())) {
            String name = interfaceC1291770jih.getName();
            c1291740jie2.getClass();
            C1291740jie c1291740jie3 = new C1291740jie(c1291740jie2);
            c1291740jie3.LIZ.add(name);
            C1291740jie c1291740jie4 = new C1291740jie(c1291740jie3);
            c1291740jie4.LIZIZ = interfaceC1291770jih;
            ((ArrayList) list).add(c1291740jie4);
        }
    }
}
