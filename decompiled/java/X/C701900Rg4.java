package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701900Rg4 extends C09AY implements InterfaceC1631620sYq<InterfaceC703670Riv<C701270Rf3>, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, InterfaceC700750ReD, InterfaceC700750ReD> {
    public C701900Rg4(C700170RdH c700170RdH) {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final InterfaceC700750ReD invoke(InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> function1, InterfaceC700750ReD interfaceC700750ReD) {
        InterfaceC703670Riv<C701270Rf3> interfaceC703670Riv2 = interfaceC703670Riv;
        Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> function12 = function1;
        InterfaceC700750ReD interfaceC700750ReD2 = interfaceC700750ReD;
        String type = interfaceC700750ReD2.getType();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!Intrinsics.LJFF(type, "fcp_modify_node_action")) {
            new C701910Rg5(jCurrentTimeMillis, interfaceC703670Riv2, type);
            C0T6L.LIZLLL();
        }
        InterfaceC700750ReD interfaceC700750ReDInvoke = function12.invoke(interfaceC700750ReD2);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (!Intrinsics.LJFF(type, "fcp_modify_node_action")) {
            new C701920Rg6(jCurrentTimeMillis2, interfaceC703670Riv2, type, jCurrentTimeMillis);
            C0T6L.LIZLLL();
        }
        return interfaceC700750ReDInvoke;
    }
}
