package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0fnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141160fnm {
    public final InterfaceC1141210fnr<String> LIZ;
    public final InterfaceC1141210fnr<List<C1141870fov>> LIZIZ;

    public C1141160fnm(InterfaceC1141210fnr<String> interfaceC1141210fnr, InterfaceC1141210fnr<List<C1141870fov>> interfaceC1141210fnr2) {
        this.LIZ = interfaceC1141210fnr;
        this.LIZIZ = interfaceC1141210fnr2;
    }

    public final void LIZ(C1141100fng c1141100fng, Function1<? super C1141100fng, Unit> function1) {
        if (c1141100fng.LJFF != null && (!r0.isEmpty())) {
            function1.invoke(c1141100fng);
            return;
        }
        InterfaceC1141210fnr<List<C1141870fov>> interfaceC1141210fnr = this.LIZIZ;
        if (interfaceC1141210fnr == null) {
            function1.invoke(c1141100fng);
        } else {
            interfaceC1141210fnr.LIZ(new AwS383S0200000_17(c1141100fng, (C1141100fng) function1, (Function1<? super C1141100fng, Unit>) 69), new AwS383S0200000_17(c1141100fng, (C1141100fng) function1, (Function1<? super C1141100fng, Unit>) 70));
        }
    }
}
