package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.HomePageElementRowPowerCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HPR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.HomePageElementRowPowerCell$onBindItemView$4", f = "MixStudioHomeRowsContainer.kt", l = {466}, m = "invokeSuspend")
public final class C0HPR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HomePageElementRowPowerCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HPR(HomePageElementRowPowerCell homePageElementRowPowerCell, InterfaceC1364105Vn<? super C0HPR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = homePageElementRowPowerCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HPR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951KH;
        C1C7U.LIZ("HomePageElementRowPowerCell@95c8.onBindItemView$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0HPQ c0hpqL5 = this.LLILLJJLI.L5();
            if (c0hpqL5 != null && (anonymousClass0951KH = c0hpqL5.kH()) != null) {
                AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 112);
                this.LL = 1;
                if (anonymousClass0951KH.collect(agS287S0100000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("HomePageElementRowPowerCell@95c8.onBindItemView$4");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("HomePageElementRowPowerCell@95c8.onBindItemView$4");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
