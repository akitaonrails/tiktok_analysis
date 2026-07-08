package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.155h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204631155h extends C09AY implements Function1<InterfaceC204626155c, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204631155h(String str, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC204626155c interfaceC204626155c) {
        interfaceC204626155c.LLZIL(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
