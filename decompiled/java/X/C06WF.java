package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06WF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel$onPrepared$1", f = "BotDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C06WF extends C09AX implements Function2<IMAIBotInfo, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BotDetailViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06WF(BotDetailViewModel botDetailViewModel, InterfaceC1364105Vn<? super C06WF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = botDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06WF c06wf = new C06WF(this.LLILLJJLI, interfaceC1364105Vn);
        c06wf.LL = obj;
        return c06wf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BotDetailViewModel@6175.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMAIBotInfo iMAIBotInfo = (IMAIBotInfo) this.LL;
        if (iMAIBotInfo == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BotDetailViewModel@6175.onPrepared$1");
            return unit;
        }
        BotDetailViewModel botDetailViewModel = this.LLILLJJLI;
        if (!botDetailViewModel.LLILZIL) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BotDetailViewModel@6175.onPrepared$1");
            return unit2;
        }
        botDetailViewModel.setState(new AwS581S0100000_2(iMAIBotInfo, 228));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BotDetailViewModel@6175.onPrepared$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IMAIBotInfo iMAIBotInfo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(iMAIBotInfo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
