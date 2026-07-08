package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS103S0110000_16;
import kotlin.jvm.internal.AwS225S0300000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070860dyO extends C09AY implements Function1<C1071110dyn, Unit> {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ C1073410e2V LLILLJJLI;
    public final /* synthetic */ EnumC1070340dxY LLILLL;
    public final /* synthetic */ C1073040e1u LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070860dyO(InterfaceC497601wk interfaceC497601wk, C1073410e2V c1073410e2V, EnumC1070340dxY enumC1070340dxY, C1073040e1u c1073040e1u, boolean z) {
        super(1);
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = c1073410e2V;
        this.LLILLL = enumC1070340dxY;
        this.LLILZ = c1073040e1u;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1071110dyn c1071110dyn) {
        C1071110dyn c1071110dyn2 = c1071110dyn;
        c1071110dyn2.LIZJ = this.LL;
        c1071110dyn2.LIZJ(new AwS225S0300000_16(this.LLILLL, this.LLILZ, this.LLILLJJLI, 1));
        new AwS595S0100000_16(this.LLILLJJLI, 39).invoke(c1071110dyn2.LJ);
        C1073410e2V c1073410e2V = this.LLILLJJLI;
        c1071110dyn2.LJFF = c1073410e2V.LIZ.LIZLLL;
        c1071110dyn2.LIZIZ(new AwS103S0110000_16(c1073410e2V, this.LLILZIL, 1));
        return Unit.LIZ;
    }
}
