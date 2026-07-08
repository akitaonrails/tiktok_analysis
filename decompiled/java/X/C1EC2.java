package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1EC2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EC2 extends C09AY implements Function1<InterfaceC2277241EBm, Unit> {
    public final /* synthetic */ Object[] LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1EC2(Object[] objArr) {
        super(1);
        this.LL = objArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2277241EBm interfaceC2277241EBm) {
        InterfaceC2277241EBm interfaceC2277241EBm2 = interfaceC2277241EBm;
        String str = (String) this.LL[0];
        if (str == null) {
            str = "";
        }
        interfaceC2277241EBm2.LJJIIJZLJL(str);
        return Unit.LIZ;
    }
}
