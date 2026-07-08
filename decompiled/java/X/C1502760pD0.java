package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502760pD0 {
    public static final <T extends Comparable<? super T>> void LIZ(C1502720pCw c1502720pCw, Function1<? super C1502810pD5<T>, Unit> function1) {
        List<InterfaceC1502750pCz> list = c1502720pCw.LIZ;
        final C1502810pD5 c1502810pD5 = new C1502810pD5();
        function1.invoke(c1502810pD5);
        ((ArrayList) list).add(new InterfaceC1502750pCz() { // from class: X.0pD2
            @Override // X.InterfaceC1502750pCz
            public final boolean check() {
                Comparable comparable;
                C1502810pD5<Comparable<Object>> c1502810pD52;
                T t;
                EnumC1502800pD4 enumC1502800pD4;
                InterfaceC1502770pD1<T> interfaceC1502770pD1 = c1502810pD5.LIZ;
                if (interfaceC1502770pD1 != 0 && (comparable = (Comparable) interfaceC1502770pD1.LJFF()) != null && (t = (c1502810pD52 = c1502810pD5).LIZIZ) != 0 && (enumC1502800pD4 = c1502810pD52.LIZJ) != null) {
                    int i = C1502790pD3.LIZ[enumC1502800pD4.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5 && comparable.compareTo(t) >= 0) {
                                        return true;
                                    }
                                } else if (comparable.compareTo(t) <= 0) {
                                    return true;
                                }
                            } else if (comparable.compareTo(t) > 0) {
                                return true;
                            }
                        } else if (comparable.compareTo(t) < 0) {
                            return true;
                        }
                    } else if (comparable.compareTo(t) == 0) {
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
