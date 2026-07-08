package X;

import Y.AgS203S0200000_14;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Znn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2$subscribeToIsMessageListRendered$2$1", f = "UnreadIndicatorAssemV2.kt", l = {277}, m = "invokeSuspend")
public final class C910530Znn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UnreadIndicatorAssemV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910530Znn(UnreadIndicatorAssemV2 unreadIndicatorAssemV2, InterfaceC1364105Vn<? super C910530Znn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = unreadIndicatorAssemV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910530Znn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerViewLLII;
        C1C7U.LIZ("UnreadIndicatorAssemV2@be68.subscribeToIsMessageListRendered$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) this.LLILLJJLI.LLJJJ.getValue();
            if (messagePowerListAbility != null) {
                recyclerViewLLII = messagePowerListAbility.LLII();
            } else {
                recyclerViewLLII = null;
            }
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UnreadIndicatorAssemV2.LLJL;
            AnonymousClass0951 anonymousClass0951 = ((MessageListViewModel) ((IIMessageListViewModel) assemVMLazy.getValue())).LLIZ;
            AgS203S0200000_14 agS203S0200000_14 = new AgS203S0200000_14(this.LLILLJJLI, recyclerViewLLII, 9);
            this.LL = 1;
            if (anonymousClass0951.collect(agS203S0200000_14, this) == objLJFF) {
                C1C7U.LIZIZ("UnreadIndicatorAssemV2@be68.subscribeToIsMessageListRendered$2$1");
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
