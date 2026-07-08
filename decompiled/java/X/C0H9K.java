package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot;
import com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard;
import com.ss.android.ugc.tools.chat.data.TaskInfo;
import com.ss.android.ugc.tools.chat.data.TaskProgress;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H9K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot$initView$3", f = "AITheaterSocialGeneratingMessageListProtocol.kt", l = {390}, m = "invokeSuspend")
public final class C0H9K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AITheaterSocialGeneratingReusedUISlot LLILLJJLI;
    public final /* synthetic */ IcAigcCommonMessageCard LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H9K(AITheaterSocialGeneratingReusedUISlot aITheaterSocialGeneratingReusedUISlot, IcAigcCommonMessageCard icAigcCommonMessageCard, InterfaceC1364105Vn<? super C0H9K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aITheaterSocialGeneratingReusedUISlot;
        this.LLILLL = icAigcCommonMessageCard;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H9K(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TaskProgress taskProgress;
        TaskInfo taskInfo;
        C1C7U.LIZ("AITheaterSocialGeneratingReusedUISlot@aa9e.initView$3");
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
            AITheaterSocialGeneratingReusedUISlot aITheaterSocialGeneratingReusedUISlot = this.LLILLJJLI;
            IcAigcCommonMessageCard icAigcCommonMessageCard = this.LLILLL;
            if (icAigcCommonMessageCard != null && (taskInfo = icAigcCommonMessageCard.taskInfo) != null) {
                taskProgress = taskInfo.progress;
            } else {
                taskProgress = null;
            }
            aITheaterSocialGeneratingReusedUISlot.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIL = C09IC.LJIL(new C095D(new C382101e7(taskProgress, null)), C0PEM.LIZJ);
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 169);
            this.LL = 1;
            if (interfaceC346201WaLJIL.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("AITheaterSocialGeneratingReusedUISlot@aa9e.initView$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterSocialGeneratingReusedUISlot@aa9e.initView$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
