package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0uGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1697390uGv extends C2217421BqW implements Function2<InterfaceC1679420tnw, InterfaceC1679420tnw, Unit> {
    public C1697390uGv(Object obj) {
        super(2, obj, C1697400uGw.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1679420tnw interfaceC1679420tnw, InterfaceC1679420tnw interfaceC1679420tnw2) {
        boolean zIsFocused;
        C1697350uGr c1697350uGrLIZJ;
        C1697500uH6 c1697500uH6LLJJIJIIJIL;
        InterfaceC1679420tnw interfaceC1679420tnw3 = interfaceC1679420tnw;
        InterfaceC1679420tnw interfaceC1679420tnw4 = interfaceC1679420tnw2;
        C1697400uGw c1697400uGw = (C1697400uGw) this.receiver;
        if (c1697400uGw.LLJILLL && (zIsFocused = interfaceC1679420tnw4.isFocused()) != interfaceC1679420tnw3.isFocused()) {
            Function1<Boolean, Unit> function1 = c1697400uGw.LLJJIJI;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zIsFocused));
            }
            if (zIsFocused) {
                C23250099c.LIZLLL(c1697400uGw.LLILLIZIL(), null, null, new C0NWA(c1697400uGw, null), 3);
                C259800zU c259800zU = new C259800zU();
                C20060813eQ.LIZ(c1697400uGw, new AwS426S0200000_25(c259800zU, (C259800zU<InterfaceC1697360uGs>) c1697400uGw, (C1697400uGw) 131));
                InterfaceC1697360uGs interfaceC1697360uGs = (InterfaceC1697360uGs) c259800zU.element;
                if (interfaceC1697360uGs != null) {
                    c1697350uGrLIZJ = interfaceC1697360uGs.LIZJ();
                } else {
                    c1697350uGrLIZJ = null;
                }
                c1697400uGw.LLJJIJIL = c1697350uGrLIZJ;
                InterfaceC1692950u9l interfaceC1692950u9l = c1697400uGw.LLJJJ;
                if (interfaceC1692950u9l != null && interfaceC1692950u9l.LIZLLL() && (c1697500uH6LLJJIJIIJIL = c1697400uGw.LLJJIJIIJIL()) != null) {
                    c1697500uH6LLJJIJIIJIL.LLJJ(c1697400uGw.LLJJJ);
                }
            } else {
                InterfaceC1697370uGt interfaceC1697370uGt = c1697400uGw.LLJJIJIL;
                if (interfaceC1697370uGt != null) {
                    interfaceC1697370uGt.release();
                }
                c1697400uGw.LLJJIJIL = null;
                C1697500uH6 c1697500uH6LLJJIJIIJIL2 = c1697400uGw.LLJJIJIIJIL();
                if (c1697500uH6LLJJIJIIJIL2 != null) {
                    c1697500uH6LLJJIJIIJIL2.LLJJ(null);
                }
            }
            C20052513d5.LJFF(c1697400uGw).LJJJJIZL();
            InterfaceC595010NVj interfaceC595010NVj = c1697400uGw.LLJJIII;
            if (interfaceC595010NVj != null) {
                if (zIsFocused) {
                    C1678760tms c1678760tms = c1697400uGw.LLJJIJIIJIL;
                    if (c1678760tms != null) {
                        c1697400uGw.LLJJIJI(interfaceC595010NVj, new C0NVY(c1678760tms));
                        c1697400uGw.LLJJIJIIJIL = null;
                    }
                    C1678760tms c1678760tms2 = new C1678760tms();
                    c1697400uGw.LLJJIJI(interfaceC595010NVj, c1678760tms2);
                    c1697400uGw.LLJJIJIIJIL = c1678760tms2;
                } else {
                    C1678760tms c1678760tms3 = c1697400uGw.LLJJIJIIJIL;
                    if (c1678760tms3 != null) {
                        c1697400uGw.LLJJIJI(interfaceC595010NVj, new C0NVY(c1678760tms3));
                        c1697400uGw.LLJJIJIIJIL = null;
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
