package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: X.0HU7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HU7 {
    public static final C0HU7 LIZ = new C0HU7();
    public static final C0HU6 LIZIZ = new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f));

    public static C21647019ng LIZ(C0HU7 c0hu7, Context context, View view, List list, float f, String str, InterfaceC442640HXi interfaceC442640HXi, InterfaceC442640HXi interfaceC442640HXi2, int i) {
        C0HU6 c0hu6;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            interfaceC442640HXi = null;
        }
        if ((i & 128) != 0) {
            interfaceC442640HXi2 = null;
        }
        c0hu7.getClass();
        if (f == 1.0f) {
            c0hu6 = LIZIZ;
        } else {
            c0hu6 = new C0HU6(new C1342130l1v(1289.09f), new C1342130l1v(64.63f));
        }
        C21647019ng c21647019ng = new C21647019ng(context, view, new C19746312Np(EnumC19746112Nn.SPRING, c0hu6, list), false);
        c21647019ng.LIZLLL(0L);
        if (str != null) {
            c21647019ng.LIZJ(str, new C462940IDk(interfaceC442640HXi2, interfaceC442640HXi, 2));
        }
        return c21647019ng;
    }
}
