package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341360DZu {
    public static final C19719212De LIZ = new C19719212De(1911239161, new InterfaceC1631620sYq<Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit>, InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0DZt
        @Override // X.InterfaceC1631620sYq
        public final Unit invoke(Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
            int i;
            Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit> function22 = function2;
            InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                if (interfaceC1680500tpg2.LJII(function22)) {
                    i = 4;
                } else {
                    i = 2;
                }
                iIntValue |= i;
            }
            if ((iIntValue & 19) == 18 && interfaceC1680500tpg2.LIZ()) {
                interfaceC1680500tpg2.LIZJ();
            } else {
                function22.invoke(interfaceC1680500tpg2, Integer.valueOf(iIntValue & 14));
            }
            return Unit.LIZ;
        }
    }, false);
    public static final C19719212De LIZIZ = new C19719212De(39179916, new InterfaceC1631620sYq<Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit>, InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0DZv
        @Override // X.InterfaceC1631620sYq
        public final Unit invoke(Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
            int i;
            Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit> function22 = function2;
            InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                if (interfaceC1680500tpg2.LJII(function22)) {
                    i = 4;
                } else {
                    i = 2;
                }
                iIntValue |= i;
            }
            if ((iIntValue & 19) == 18 && interfaceC1680500tpg2.LIZ()) {
                interfaceC1680500tpg2.LIZJ();
            } else {
                function22.invoke(interfaceC1680500tpg2, Integer.valueOf(iIntValue & 14));
            }
            return Unit.LIZ;
        }
    }, false);
}
