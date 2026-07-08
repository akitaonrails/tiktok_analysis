package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1EBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277351EBx extends C09AY implements Function1<InterfaceC2277241EBm, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1268870j7l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277351EBx(String str, InterfaceC1268870j7l interfaceC1268870j7l) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = interfaceC1268870j7l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2277241EBm interfaceC2277241EBm) {
        interfaceC2277241EBm.LJJIII(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
