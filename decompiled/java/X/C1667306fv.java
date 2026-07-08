package X;

import Y.AgS283S0100000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.freqcontrol.PromptUnifiedFrequencyControlAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06fv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.freqcontrol.PromptUnifiedFrequencyControlAssem$listenToRoomLoad$1", f = "PromptUnifiedFrequencyControlAssem.kt", l = {87}, m = "invokeSuspend")
public final class C1667306fv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PromptUnifiedFrequencyControlAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667306fv(PromptUnifiedFrequencyControlAssem promptUnifiedFrequencyControlAssem, InterfaceC1364105Vn<? super C1667306fv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = promptUnifiedFrequencyControlAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1667306fv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PromptUnifiedFrequencyControlAssem@7d09.listenToRoomLoad$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PromptUnifiedFrequencyControlAssem.LLIZLLLIL;
            AnonymousClass0951 anonymousClass0951 = ((MessageListViewModel) ((IIMessageListViewModel) assemVMLazy.getValue())).LLIZ;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 85);
            this.LL = 1;
            if (anonymousClass0951.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("PromptUnifiedFrequencyControlAssem@7d09.listenToRoomLoad$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
