package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1EBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277341EBw extends C09AY implements Function1<InterfaceC2277241EBm, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1268870j7l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277341EBw(String str, InterfaceC1268870j7l interfaceC1268870j7l) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = interfaceC1268870j7l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2277241EBm interfaceC2277241EBm) {
        interfaceC2277241EBm.LJJIJIIJI(this.LL);
        return Unit.LIZ;
    }
}
