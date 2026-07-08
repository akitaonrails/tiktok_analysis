package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0n7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422370n7L extends C09AY implements Function2<InterfaceC1422390n7N, C1422410n7P, Unit> {
    public final /* synthetic */ C1419590n2r LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422370n7L(C1419590n2r c1419590n2r, boolean z) {
        super(2);
        this.LL = c1419590n2r;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1422390n7N interfaceC1422390n7N, C1422410n7P c1422410n7P) {
        interfaceC1422390n7N.LIZ(this.LL.LIZ.getResource_id(), this.LLILLJJLI);
        return Unit.LIZ;
    }
}
