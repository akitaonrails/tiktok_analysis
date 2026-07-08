package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.header.CampaignHeaderAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0990, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.header.CampaignHeaderAssem$startCountDown$3", f = "CampaignHeaderAssem.kt", l = {149}, m = "invokeSuspend")
public final class AnonymousClass0990 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ CampaignHeaderAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0990(long j, CampaignHeaderAssem campaignHeaderAssem, InterfaceC1364105Vn<? super AnonymousClass0990> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = campaignHeaderAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0990(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampaignHeaderAssem@88f1.startCountDown$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jLJIIIZ = C19990113Jj.LJIIIZ(this.LLILLJJLI);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLJIIIZ, this) == objLJFF) {
                C1C7U.LIZIZ("CampaignHeaderAssem@88f1.startCountDown$3");
                return objLJFF;
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new AnonymousClass0991(null), 3);
        this.LLILLL.Ho().closePanel();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CampaignHeaderAssem@88f1.startCountDown$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
