package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS2S1100200_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702230Rgb extends C09AY implements InterfaceC1631620sYq<InterfaceC1449905lx<C701270Rf3>, Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, InterfaceC1445905lJ, InterfaceC1445905lJ> {
    public C702230Rgb(C700170RdH c700170RdH) {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final InterfaceC1445905lJ invoke(InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx, Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ> function1, InterfaceC1445905lJ interfaceC1445905lJ) {
        C702430Rgv c702430Rgv;
        InterfaceC1449905lx<C701270Rf3> interfaceC1449905lx2 = interfaceC1449905lx;
        Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ> function12 = function1;
        InterfaceC1445905lJ interfaceC1445905lJ2 = interfaceC1445905lJ;
        String str = null;
        if ((interfaceC1445905lJ2 instanceof C702430Rgv) && (c702430Rgv = (C702430Rgv) interfaceC1445905lJ2) != null) {
            str = c702430Rgv.LIZ;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!Intrinsics.LJFF(str, "fcp_modify_node_action")) {
            new AwS13S1100100_11(jCurrentTimeMillis, (long) interfaceC1449905lx2, (InterfaceC1449905lx<C701270Rf3>) str, (String) 2);
            C0T6L.LIZLLL();
        }
        InterfaceC1445905lJ interfaceC1445905lJInvoke = function12.invoke(interfaceC1445905lJ2);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (!Intrinsics.LJFF(str, "fcp_modify_node_action")) {
            new AwS2S1100200_11(jCurrentTimeMillis2, (long) interfaceC1449905lx2, (InterfaceC1449905lx<C701270Rf3>) str, (String) jCurrentTimeMillis, 1L);
            C0T6L.LIZLLL();
        }
        return interfaceC1445905lJInvoke;
    }
}
