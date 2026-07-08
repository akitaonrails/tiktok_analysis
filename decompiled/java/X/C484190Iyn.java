package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity$onCreate$3", f = "BaWelcomeMessageEditActivity.kt", l = {85}, m = "invokeSuspend")
public final class C484190Iyn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaWelcomeMessageEditActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484190Iyn(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, InterfaceC1364105Vn<? super C484190Iyn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baWelcomeMessageEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C484190Iyn c484190Iyn = new C484190Iyn(this.LLILLL, interfaceC1364105Vn);
        c484190Iyn.LLILLJJLI = obj;
        return c484190Iyn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("BaWelcomeMessageEditActivity@83d7.onCreate$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            IBaAutoMessageService iBaAutoMessageService = this.LLILLL.LLJIJIL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = iBaAutoMessageService.LJIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaWelcomeMessageEditActivity@83d7.onCreate$3");
                return objLJFF;
            }
        }
        C484210Iyp c484210Iyp = (C484210Iyp) obj;
        if (c484210Iyp == null) {
            this.LLILLL.finish();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaWelcomeMessageEditActivity@83d7.onCreate$3");
            return unit;
        }
        BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.LLILLL;
        baWelcomeMessageEditActivity.LLJI = c484210Iyp;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C484170Iyl(baWelcomeMessageEditActivity, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaWelcomeMessageEditActivity@83d7.onCreate$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
