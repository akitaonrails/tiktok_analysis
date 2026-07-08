package X;

import Y.AgS283S0100000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.impl.GroupChatTypingIndicatorBubbleVM;
import com.ss.android.ugc.aweme.im.messagelist.protocols.GroupTypingIndicatorPowerCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05x5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.GroupTypingIndicatorPowerCell$bindAvatarRv$1", f = "GroupTypingIndicatorProtocol.kt", l = {131}, m = "invokeSuspend")
public final class C1518905x5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupTypingIndicatorPowerCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518905x5(GroupTypingIndicatorPowerCell groupTypingIndicatorPowerCell, InterfaceC1364105Vn<? super C1518905x5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupTypingIndicatorPowerCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1518905x5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupTypingIndicatorPowerCell@d803.bindAvatarRv$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupTypingIndicatorPowerCell.LLIZLLLIL;
            C2252321DDq c2252321DDq = ((GroupChatTypingIndicatorBubbleVM) assemVMLazy.getValue()).LLILZLL;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 56);
            this.LL = 1;
            if (c2252321DDq.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("GroupTypingIndicatorPowerCell@d803.bindAvatarRv$1");
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
