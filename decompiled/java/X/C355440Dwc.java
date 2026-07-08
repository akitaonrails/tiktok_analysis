package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Dwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355440Dwc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC355460Dwe LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355440Dwc(InterfaceC355460Dwe interfaceC355460Dwe, long j, boolean z) {
        super(0);
        this.LL = interfaceC355460Dwe;
        this.LLILLJJLI = j;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC355460Dwe interfaceC355460Dwe = this.LL;
        if (interfaceC355460Dwe != null) {
            interfaceC355460Dwe.LIZ(-10003, "detect_null_bitmap", new C355480Dwg(this.LLILLJJLI, this.LLILLL));
        }
        return Unit.LIZ;
    }
}
