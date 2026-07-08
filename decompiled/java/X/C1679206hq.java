package X;

import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.datasource.GroupChatInlineMessageModel$getMessageList$1", f = "GroupChatInlineMessageModel.kt", l = {82}, m = "invokeSuspend")
public final class C1679206hq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1754606u0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679206hq(C1754606u0 c1754606u0, InterfaceC1364105Vn<? super C1679206hq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1754606u0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1679206hq c1679206hq = new C1679206hq(this.LLILLL, interfaceC1364105Vn);
        c1679206hq.LLILLJJLI = obj;
        return c1679206hq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("GroupChatInlineMessageModel@6cd5.getMessageList$1");
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
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyController = (IPromptUnifiedFrequencyController) this.LLILLL.LJI.getValue();
            String str = this.LLILLL.LIZJ;
            EnumC1674506h5 enumC1674506h5 = EnumC1674506h5.UPDATE_GROUP_NAME;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = iPromptUnifiedFrequencyController.LJII(str, enumC1674506h5, null, System.currentTimeMillis(), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupChatInlineMessageModel@6cd5.getMessageList$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLL.LJFF = true;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1679306hr(this.LLILLL, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatInlineMessageModel@6cd5.getMessageList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
