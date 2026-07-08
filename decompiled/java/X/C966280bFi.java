package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966280bFi extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ C954600aws LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966280bFi(C966020bFI c966020bFI, C954600aws c954600aws) {
        super(1);
        this.LL = c954600aws;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        List<InterfaceC965500bES> listLJLJL = interfaceC965990bFF.LJLJL();
        if (listLJLJL != null) {
            C954600aws c954600aws = this.LL;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIJ(c954600aws);
                }
            }
        }
        return Unit.LIZ;
    }
}
