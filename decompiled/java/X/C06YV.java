package X;

import Y.AgS283S0100000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06YV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem$initCollect$1", f = "InputEmojiButtonUIAssem.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C06YV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InputEmojiButtonUIAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06YV(InputEmojiButtonUIAssem inputEmojiButtonUIAssem, InterfaceC1364105Vn<? super C06YV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inputEmojiButtonUIAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06YV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputEmojiButtonUIAssem@a977.initCollect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InputEmojiButtonUIAssem.LLJJIJIL;
            AnonymousClass0951 anonymousClass0951 = ((PanelStateViewModel) assemVMLazy.getValue()).LLIZ;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 19);
            this.LL = 1;
            if (anonymousClass0951.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("InputEmojiButtonUIAssem@a977.initCollect$1");
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
