package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS396S0200000_30;

/* JADX INFO: renamed from: X.13jH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20090913jH extends C09AY implements Function1<C1677830tlN<Float, C1677280tkU>, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ C817403Hg LLILLJJLI;
    public final /* synthetic */ InterfaceC1392705cj LLILLL;
    public final /* synthetic */ Function1<Float, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20090913jH(float f, C817403Hg c817403Hg, InterfaceC1392705cj interfaceC1392705cj, AwS396S0200000_30 awS396S0200000_30) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = c817403Hg;
        this.LLILLL = interfaceC1392705cj;
        this.LLILZ = awS396S0200000_30;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1677830tlN<Float, C1677280tkU> c1677830tlN) {
        C1677830tlN<Float, C1677280tkU> c1677830tlN2 = c1677830tlN;
        if (Math.abs(c1677830tlN2.LIZIZ().floatValue()) >= Math.abs(this.LL)) {
            float fLIZLLL = C20091013jI.LIZLLL(c1677830tlN2.LIZIZ().floatValue(), this.LL);
            C20091013jI.LIZIZ(c1677830tlN2, this.LLILLL, this.LLILZ, fLIZLLL - this.LLILLJJLI.element);
            c1677830tlN2.LIZ();
            this.LLILLJJLI.element = fLIZLLL;
        } else {
            C20091013jI.LIZIZ(c1677830tlN2, this.LLILLL, this.LLILZ, c1677830tlN2.LIZIZ().floatValue() - this.LLILLJJLI.element);
            this.LLILLJJLI.element = c1677830tlN2.LIZIZ().floatValue();
        }
        return Unit.LIZ;
    }
}
