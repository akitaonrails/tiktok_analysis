package X;

import Y.AgS75S1200000_6;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.HomePageElementRowPowerCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HPP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.HomePageElementRowPowerCell$onBindItemView$3", f = "MixStudioHomeRowsContainer.kt", l = {414}, m = "invokeSuspend")
public final class C0HPP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HomePageElementRowPowerCell LLILLJJLI;
    public final /* synthetic */ C0HPT LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HPP(HomePageElementRowPowerCell homePageElementRowPowerCell, C0HPT c0hpt, String str, InterfaceC1364105Vn<? super C0HPP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = homePageElementRowPowerCell;
        this.LLILLL = c0hpt;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HPP(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951V11;
        C1C7U.LIZ("HomePageElementRowPowerCell@95c8.onBindItemView$3");
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
            if (c0hpqL5 != null && (anonymousClass0951V11 = c0hpqL5.v11()) != null) {
                AgS75S1200000_6 agS75S1200000_6 = new AgS75S1200000_6(this.LLILLJJLI, this.LLILLL, this.LLILZ, 1);
                this.LL = 1;
                if (anonymousClass0951V11.collect(agS75S1200000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("HomePageElementRowPowerCell@95c8.onBindItemView$3");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("HomePageElementRowPowerCell@95c8.onBindItemView$3");
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
