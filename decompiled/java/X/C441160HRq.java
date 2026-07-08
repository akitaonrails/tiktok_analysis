package X;

import Y.AgS197S0200000_6;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.IdPowerCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.IdPowerCell$onBindItemView$3", f = "IdPowerCell.kt", l = {114}, m = "invokeSuspend")
public final class C441160HRq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C441150HRp LLILLJJLI;
    public final /* synthetic */ IdPowerCell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441160HRq(C441150HRp c441150HRp, IdPowerCell idPowerCell, InterfaceC1364105Vn<? super C441160HRq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c441150HRp;
        this.LLILLL = idPowerCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441160HRq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IdPowerCell@86e3.onBindItemView$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C441150HRp c441150HRp = this.LLILLJJLI;
            C05YD<C0HOM<? extends C440440HOw>> c05yd = c441150HRp.LLILLL;
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLL, c441150HRp, 17);
            this.LL = 1;
            if (c05yd.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("IdPowerCell@86e3.onBindItemView$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
