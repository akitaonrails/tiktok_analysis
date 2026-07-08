package X;

import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.datasource.StreakInlineMsgModel$checkFrequencyControl$2$1", f = "StreakInlineMsgModel.kt", l = {118}, m = "invokeSuspend")
public final class C06YE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06YD LLILLL;
    public final /* synthetic */ FakeMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YE(C06YD c06yd, FakeMessage fakeMessage, InterfaceC1364105Vn<? super C06YE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c06yd;
        this.LLILZ = fakeMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06YE c06ye = new C06YE(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c06ye.LLILLJJLI = obj;
        return c06ye;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("StreakInlineMsgModel@79c4.checkFrequencyControl$2$1");
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
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyController = (IPromptUnifiedFrequencyController) this.LLILLL.LIZLLL.getValue();
            String str = this.LLILLL.LIZIZ;
            EnumC1670906gV enumC1670906gV = EnumC1670906gV.STREAKS_PROGRESS;
            Long lLJFF = C2286608xc.LJFF(-2L);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = iPromptUnifiedFrequencyController.LJII(str, enumC1670906gV, lLJFF, Long.MAX_VALUE, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreakInlineMsgModel@79c4.checkFrequencyControl$2$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C06YG(this.LLILLL, this.LLILZ, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgModel@79c4.checkFrequencyControl$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
