package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS28S0200100_12;

/* JADX INFO: renamed from: X.0U3N, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U3N extends C09AY implements Function1<C0U3O, Unit> {
    public final /* synthetic */ C0U33 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<Boolean> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U3N(long j, C0U33 c0u33, C23260099m c23260099m, boolean z, boolean z2) {
        super(1);
        this.LL = c0u33;
        this.LLILLJJLI = j;
        this.LLILLL = c23260099m;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0U3O c0u3o) {
        C0U3O c0u3o2 = c0u3o;
        C118300cf c118300cf = new C118300cf();
        c0u3o2.LIZLLL(AFwS245S0000000_12.get$arr$(195));
        c0u3o2.LJFF(new C0U35(c118300cf, this.LL, this.LLILLJJLI, this.LLILLL));
        boolean z = this.LLILZ;
        C0U33 c0u33 = this.LL;
        c0u3o2.LIZIZ(new C0U39(this.LLILLJJLI, c0u33, this.LLILLL, z, this.LLILZIL));
        c0u3o2.LIZJ(new AwS28S0200100_12(c118300cf, this.LL, this.LLILLJJLI, 3));
        c0u3o2.LJ(AFwS245S0000000_12.get$arr$(196));
        c0u3o2.LIZ(AFwS245S0000000_12.get$arr$(197));
        return Unit.LIZ;
    }
}
