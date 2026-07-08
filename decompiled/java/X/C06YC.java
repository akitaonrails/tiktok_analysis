package X;

import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.datasource.StreakInlineMsgModel$checkFrequencyControl$1$1", f = "StreakInlineMsgModel.kt", l = {94}, m = "invokeSuspend")
public final class C06YC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06YD LLILLL;
    public final /* synthetic */ FakeMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YC(C06YD c06yd, FakeMessage fakeMessage, InterfaceC1364105Vn<? super C06YC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c06yd;
        this.LLILZ = fakeMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06YC c06yc = new C06YC(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c06yc.LLILLJJLI = obj;
        return c06yc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("StreakInlineMsgModel@79c4.checkFrequencyControl$1$1");
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
            EnumC1641806bo enumC1641806bo = EnumC1641806bo.STREAK_COUNTDOWN;
            Long lLJFF = C2286608xc.LJFF(-1L);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = iPromptUnifiedFrequencyController.LJII(str, enumC1641806bo, lLJFF, Long.MAX_VALUE, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreakInlineMsgModel@79c4.checkFrequencyControl$1$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C06YF(this.LLILLL, this.LLILZ, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInlineMsgModel@79c4.checkFrequencyControl$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
