package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$initSuggestedQuestion$3", f = "BaMessageSettingActivity.kt", l = {263, 265}, m = "invokeSuspend")
public final class C483700Iy0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaMessageSettingActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483700Iy0(BaMessageSettingActivity baMessageSettingActivity, InterfaceC1364105Vn<? super C483700Iy0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baMessageSettingActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C483700Iy0 c483700Iy0 = new C483700Iy0(this.LLILLL, interfaceC1364105Vn);
        c483700Iy0.LLILLJJLI = obj;
        return c483700Iy0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        BaMessageSettingActivity baMessageSettingActivity;
        C1C7U.LIZ("BaMessageSettingActivity@5e22.initSuggestedQuestion$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    baMessageSettingActivity = (BaMessageSettingActivity) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    baMessageSettingActivity.getClass();
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(baMessageSettingActivity, C2107308Nj.LIZ, null, new C483770Iy7(baMessageSettingActivity, zBooleanValue, null), 2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaMessageSettingActivity@5e22.initSuggestedQuestion$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            IBaAutoMessageService iBaAutoMessageService = this.LLILLL.LLILZLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = iBaAutoMessageService.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaMessageSettingActivity@5e22.initSuggestedQuestion$3");
                return objLJFF;
            }
        }
        C483830IyD c483830IyD = (C483830IyD) obj;
        if (c483830IyD == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BaMessageSettingActivity@5e22.initSuggestedQuestion$3");
            return unit2;
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C483710Iy1(this.LLILLL, c483830IyD, null), 2);
        baMessageSettingActivity = this.LLILLL;
        IBaAutoMessageService iBaAutoMessageService2 = baMessageSettingActivity.LLILZLL;
        this.LLILLJJLI = baMessageSettingActivity;
        this.LL = 2;
        obj = iBaAutoMessageService2.LIZLLL(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("BaMessageSettingActivity@5e22.initSuggestedQuestion$3");
            return objLJFF;
        }
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        baMessageSettingActivity.getClass();
        C1DFH c1dfh3 = C0PEM.LIZ;
        C23250099c.LIZLLL(baMessageSettingActivity, C2107308Nj.LIZ, null, new C483770Iy7(baMessageSettingActivity, zBooleanValue2, null), 2);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.initSuggestedQuestion$3");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
