package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702220Rga extends C09AY implements InterfaceC1631620sYq<InterfaceC703670Riv<C701270Rf3>, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, InterfaceC700750ReD, InterfaceC700750ReD> {
    public C702220Rga() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final InterfaceC700750ReD invoke(InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> function1, InterfaceC700750ReD interfaceC700750ReD) {
        String str;
        Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> function12 = function1;
        InterfaceC700750ReD interfaceC700750ReD2 = interfaceC700750ReD;
        String type = interfaceC700750ReD2.getType();
        C700170RdH c700170RdH = interfaceC703670Riv.getState().LIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.LJFF(type, "fcp_execute_exchange_action")) {
            new C702240Rgc(jCurrentTimeMillis, c700170RdH, type);
            C0T6L.LIZLLL();
        }
        InterfaceC700750ReD interfaceC700750ReDInvoke = function12.invoke(interfaceC700750ReD2);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (Intrinsics.LJFF(type, "fcp_execute_exchange_action")) {
            C688420QzQ c688420QzQ = C688420QzQ.LIZIZ;
            if (c700170RdH != null) {
                str = c700170RdH.LIZLLL;
            } else {
                str = null;
            }
            c688420QzQ.LJIIIIZZ(str, jCurrentTimeMillis2 - jCurrentTimeMillis);
            new C702250Rgd(jCurrentTimeMillis2, c700170RdH, type, jCurrentTimeMillis);
            C0T6L.LIZLLL();
        }
        return interfaceC700750ReDInvoke;
    }
}
