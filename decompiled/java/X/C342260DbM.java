package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342260DbM extends C09AY implements InterfaceC1631620sYq<Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit>, InterfaceC1680500tpg, Integer, Unit> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C342260DbM();
    }

    public C342260DbM() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Function2<? super InterfaceC1680500tpg, ? super Integer, ? extends Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        boolean z;
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
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(iIntValue & 1, z)) {
            function22.invoke(interfaceC1680500tpg2, Integer.valueOf(iIntValue & 14));
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
