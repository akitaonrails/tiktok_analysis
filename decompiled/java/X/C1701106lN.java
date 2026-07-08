package X;

import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06lN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.aimoji.AiMojiEntranceMessageModel$isFrequencyControlAllow$1", f = "AiMojiEntranceMessageModel.kt", l = {258}, m = "invokeSuspend")
public final class C1701106lN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1754506tz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1701106lN(C1754506tz c1754506tz, InterfaceC1364105Vn<? super C1701106lN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1754506tz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1701106lN c1701106lN = new C1701106lN(this.LLILLL, interfaceC1364105Vn);
        c1701106lN.LLILLJJLI = obj;
        return c1701106lN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("AiMojiEntranceMessageModel@29ac.isFrequencyControlAllow$1");
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
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyController = (IPromptUnifiedFrequencyController) this.LLILLL.LJIIJJI.getValue();
            C1754506tz c1754506tz = this.LLILLL;
            String str = c1754506tz.LIZIZ.LJFF;
            EnumC1674506h5 enumC1674506h5 = EnumC1674506h5.SA_INTRO_CARD;
            Long lLJFF = C2286608xc.LJFF(c1754506tz.LJIILL().getMsgId());
            long createdAt = this.LLILLL.LJIILL().getCreatedAt();
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = iPromptUnifiedFrequencyController.LJII(str, enumC1674506h5, lLJFF, createdAt, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AiMojiEntranceMessageModel@29ac.isFrequencyControlAllow$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1701206lO(this.LLILLL, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiMojiEntranceMessageModel@29ac.isFrequencyControlAllow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
