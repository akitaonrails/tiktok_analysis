package X;

import Y.AgS295S0100000_14;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveMessageProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveMessageProtocol$onParentSet$1", f = "ShareLiveMessageProtocol.kt", l = {162}, m = "invokeSuspend")
public final class C901700ZYy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShareLiveMessageProtocol LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901700ZYy(ShareLiveMessageProtocol shareLiveMessageProtocol, InterfaceC1364105Vn<? super C901700ZYy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shareLiveMessageProtocol;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C901700ZYy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareLiveMessageProtocol@f7c3.onParentSet$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ShareLiveMessageProtocol.LLJIJIL;
            C2252331DDr c2252331DDr = ((LiveCardViewModel) assemVMLazy.getValue()).LLJI;
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 11);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("ShareLiveMessageProtocol@f7c3.onParentSet$1");
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
