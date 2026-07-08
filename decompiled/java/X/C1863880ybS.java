package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS431S0200000_30;
import njp.a;

/* JADX INFO: renamed from: X.0ybS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$enterAIBot$1", f = "TakoEnterUtil.kt", l = {1006, 1016}, m = "invokeSuspend")
public final class C1863880ybS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863880ybS(TakoEnterParams takoEnterParams, Context context, InterfaceC1364105Vn<? super C1863880ybS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoEnterParams;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863880ybS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoEnterUtil@4341.enterAIBot$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoEnterUtil@4341.enterAIBot$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C14TF c14tf = C14TF.LIZIZ;
            AIBotInfo aIBotInfo = this.LLILLJJLI.botInfo;
            long j = aIBotInfo.botId;
            int i2 = aIBotInfo.botSource;
            this.LL = 1;
            obj = c14tf.LJJIZ(i2, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoEnterUtil@4341.enterAIBot$1");
                return objLJFF;
            }
        }
        if (C123100dR.LIZ((String) obj)) {
            if (C1863380yae.LJJII.LJII(C2286608xc.LJ(this.LLILLJJLI.botInfo.botSource), C2286608xc.LJFF(this.LLILLJJLI.botInfo.botId), null)) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLL, "//tako/ai_bot");
                smartRouteBuildRoute.withParam("tako_enter_param", this.LLILLJJLI);
                smartRouteBuildRoute.open();
            } else {
                C1863710ybB c1863710ybB = C1863710ybB.LIZ;
                TakoEnterParams takoEnterParams = this.LLILLJJLI;
                AIBotInfo aIBotInfo2 = takoEnterParams.botInfo;
                long j2 = aIBotInfo2.botId;
                int i3 = aIBotInfo2.botSource;
                AwS431S0200000_30 awS431S0200000_30 = new AwS431S0200000_30(this.LLILLL, takoEnterParams, 38);
                this.LL = 2;
                if (c1863710ybB.LIZJ(i3, j2, null, this, awS431S0200000_30) == objLJFF) {
                    C1C7U.LIZIZ("TakoEnterUtil@4341.enterAIBot$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoEnterUtil@4341.enterAIBot$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
