package X;

import Y.AgS287S0100000_6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.InternalShareEmojiButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.InternalShareEmojiButtonAssem$onViewCreated$1", f = "InternalShareEmojiButtonAssem.kt", l = {74}, m = "invokeSuspend")
public final class C0H2Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InternalShareEmojiButtonAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2Q(InternalShareEmojiButtonAssem internalShareEmojiButtonAssem, InterfaceC1364105Vn<? super C0H2Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = internalShareEmojiButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H2Q(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalShareEmojiButtonAssem@92e3.onViewCreated$1");
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
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InternalShareEmojiButtonAssem.LLJJJ;
            AnonymousClass0951 anonymousClass0951 = ((PanelStateViewModel) assemVMLazy.getValue()).LLIZ;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 83);
            this.LL = 1;
            if (anonymousClass0951.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("InternalShareEmojiButtonAssem@92e3.onViewCreated$1");
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
