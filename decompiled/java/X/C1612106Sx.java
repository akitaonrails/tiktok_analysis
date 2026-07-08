package X;

import Y.AgS283S0100000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatroom.GroupChatPageLiveAssem;
import com.ss.android.ugc.aweme.im.messagelist.api.dynamic.DynamicCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatroom.GroupChatPageLiveAssem$onCreate$1", f = "GroupChatPageLiveAssem.kt", l = {46}, m = "invokeSuspend")
public final class C1612106Sx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupChatPageLiveAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612106Sx(GroupChatPageLiveAssem groupChatPageLiveAssem, InterfaceC1364105Vn<? super C1612106Sx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupChatPageLiveAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1612106Sx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatPageLiveAssem@67d8.onCreate$1");
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
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatPageLiveAssem.LLILZLL;
            C2252331DDr c2252331DDr = ((DynamicCardViewModel) assemVMLazy.getValue()).LL;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 10);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("GroupChatPageLiveAssem@67d8.onCreate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatPageLiveAssem@67d8.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
