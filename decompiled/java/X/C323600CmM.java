package X;

import Y.AgS285S0100000_4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.viewholder.VerticalShareListViewHolder$bind$4", f = "VerticalShareListViewHolder.kt", l = {312}, m = "invokeSuspend")
public final class C323600CmM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YD<EnumC328260Cts> LLILLJJLI;
    public final /* synthetic */ C1363960lb8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C323600CmM(C05YD<? extends EnumC328260Cts> c05yd, C1363960lb8 c1363960lb8, InterfaceC1364105Vn<? super C323600CmM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yd;
        this.LLILLL = c1363960lb8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323600CmM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerticalShareListViewHolder@2072.bind$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<EnumC328260Cts> c05yd = this.LLILLJJLI;
            if (c05yd != null) {
                AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLL, 71);
                this.LL = 1;
                if (c05yd.collect(agS285S0100000_4, this) == objLJFF) {
                    C1C7U.LIZIZ("VerticalShareListViewHolder@2072.bind$4");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VerticalShareListViewHolder@2072.bind$4");
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
