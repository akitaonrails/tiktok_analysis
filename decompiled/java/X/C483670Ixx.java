package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ixx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$onResume$4", f = "BaMessageSettingActivity.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "invokeSuspend")
public final class C483670Ixx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BaMessageSettingActivity LL;
    public int LLILLJJLI;
    public final /* synthetic */ BaMessageSettingActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483670Ixx(BaMessageSettingActivity baMessageSettingActivity, InterfaceC1364105Vn<? super C483670Ixx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baMessageSettingActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483670Ixx(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaMessageSettingActivity baMessageSettingActivity;
        C1C7U.LIZ("BaMessageSettingActivity@5e22.onResume$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                baMessageSettingActivity = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            baMessageSettingActivity = this.LLILLL;
            IBaAutoMessageService iBaAutoMessageService = baMessageSettingActivity.LLILZLL;
            this.LL = baMessageSettingActivity;
            this.LLILLJJLI = 1;
            obj = iBaAutoMessageService.LJIIJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaMessageSettingActivity@5e22.onResume$4");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        baMessageSettingActivity.getClass();
        C23250099c.LIZLLL(baMessageSettingActivity, null, null, new C483660Ixw(baMessageSettingActivity, zBooleanValue, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.onResume$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
