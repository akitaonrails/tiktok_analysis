package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ixz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$setWelcomeMessageUI$1", f = "BaMessageSettingActivity.kt", l = {396}, m = "invokeSuspend")
public final class C483690Ixz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaMessageSettingActivity LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483690Ixz(BaMessageSettingActivity baMessageSettingActivity, boolean z, InterfaceC1364105Vn<? super C483690Ixz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baMessageSettingActivity;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C483690Ixz c483690Ixz = new C483690Ixz(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c483690Ixz.LLILLJJLI = obj;
        return c483690Ixz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C484210Iyp c484210Iyp;
        String string;
        Object objLJIIL = obj;
        C1C7U.LIZ("BaMessageSettingActivity@5e22.setWelcomeMessageUI$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(objLJIIL);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJIIL);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                IBaAutoMessageService iBaAutoMessageService = this.LLILLL.LLILZLL;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                objLJIIL = iBaAutoMessageService.LJIIL(this);
                if (objLJIIL == objLJFF) {
                    C1C7U.LIZIZ("BaMessageSettingActivity@5e22.setWelcomeMessageUI$1");
                    return objLJFF;
                }
            }
            c484210Iyp = (C484210Iyp) objLJIIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c484210Iyp == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaMessageSettingActivity@5e22.setWelcomeMessageUI$1");
            return unit;
        }
        int i3 = c484210Iyp.LIZIZ;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3 || i3 != 4) {
                    string = "";
                } else {
                    string = this.LLILLL.getString(2131846637);
                }
            } else {
                string = this.LLILLL.getString(2131857726);
            }
        } else {
            string = this.LLILLL.getString(2131821574);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C483720Iy2(this.LLILLL, this.LLILZ, c484210Iyp, string, null), 2);
        BaMessageSettingActivity baMessageSettingActivity = this.LLILLL;
        int i4 = c484210Iyp.LIZIZ;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        }
        baMessageSettingActivity.LLJJ = i2;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.setWelcomeMessageUI$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
