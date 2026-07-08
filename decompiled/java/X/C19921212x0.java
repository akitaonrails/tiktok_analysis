package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.12x0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19921212x0 {
    public static final InterfaceC19931012ya LIZ;
    public static final C19921112wz LIZIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.12wz] */
    static {
        InterfaceC19931012ya interfaceC19931012ya;
        Class<?> cls = C19915512w5.LIZ;
        try {
            interfaceC19931012ya = (InterfaceC19931012ya) Class.forName("com.google.protobuf.z0").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC19931012ya = null;
        }
        LIZ = interfaceC19931012ya;
        LIZIZ = new InterfaceC19931012ya() { // from class: X.12wz
            @Override // X.InterfaceC19931012ya
            public final List LIZ(long j, Object obj) {
                int i;
                InterfaceC19921012wy interfaceC19921012wy = (InterfaceC19921012wy) C19917512wP.LJIILL(j, obj);
                if (!interfaceC19921012wy.LJJLIL()) {
                    int size = interfaceC19921012wy.size();
                    if (size == 0) {
                        i = 10;
                    } else {
                        i = size * 2;
                    }
                    InterfaceC19921012wy interfaceC19921012wyLJIILL = interfaceC19921012wy.LJIILL(i);
                    C19917512wP.LJJI(j, obj, interfaceC19921012wyLJIILL);
                    return interfaceC19921012wyLJIILL;
                }
                return interfaceC19921012wy;
            }

            @Override // X.InterfaceC19931012ya
            public final void LIZIZ(long j, Object obj) {
                ((InterfaceC19921012wy) C19917512wP.LJIILL(j, obj)).LJJLIIIJL();
            }

            @Override // X.InterfaceC19931012ya
            public final void LIZJ(long j, Object obj, Object obj2) {
                InterfaceC19921012wy interfaceC19921012wyLJIILL = (InterfaceC19921012wy) C19917512wP.LJIILL(j, obj);
                List list = (List) C19917512wP.LJIILL(j, obj2);
                int size = interfaceC19921012wyLJIILL.size();
                int size2 = list.size();
                if (size > 0) {
                    if (size2 > 0) {
                        if (!interfaceC19921012wyLJIILL.LJJLIL()) {
                            interfaceC19921012wyLJIILL = interfaceC19921012wyLJIILL.LJIILL(size2 + size);
                        }
                        interfaceC19921012wyLJIILL.addAll(list);
                    }
                    list = interfaceC19921012wyLJIILL;
                }
                C19917512wP.LJJI(j, obj, list);
            }
        };
    }
}
