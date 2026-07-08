package X;

import android.content.Context;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.MessageRequestPromptViewModel;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06h4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.MessageRequestPromptViewModel$checkUFCEnabled$1", f = "MessageRequestPromptViewModel.kt", l = {32}, m = "invokeSuspend")
public final class C1674406h4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C909290Zln LLILLL;
    public final /* synthetic */ MessageRequestPromptViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674406h4(Context context, C909290Zln c909290Zln, MessageRequestPromptViewModel messageRequestPromptViewModel, InterfaceC1364105Vn<? super C1674406h4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c909290Zln;
        this.LLILZ = messageRequestPromptViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1674406h4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestPromptViewModel@4cfc.checkUFCEnabled$1");
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
            IMChatListApi.LJJIII.getClass();
            if (!C890330YwJ.LIZ().LJJIJIIJIL(this.LLILLJJLI)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageRequestPromptViewModel@4cfc.checkUFCEnabled$1");
                return unit;
            }
            IPromptUnifiedFrequencyController.LIZ.getClass();
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyControllerLIZ = C06R9.LIZ();
            String uuid = this.LLILLL.getUuid();
            EnumC1674506h5 enumC1674506h5 = EnumC1674506h5.MESSAGE_REQUEST_PUSH_GUIDE;
            this.LL = 1;
            obj = iPromptUnifiedFrequencyControllerLIZ.LJII(uuid, enumC1674506h5, null, System.currentTimeMillis(), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageRequestPromptViewModel@4cfc.checkUFCEnabled$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkUFCEnabled, checkResult=");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ.LL = zBooleanValue;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestPromptViewModel@4cfc.checkUFCEnabled$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
