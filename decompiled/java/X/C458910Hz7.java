package X;

import Y.AgS197S0200000_6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldAssem;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldAssem$onViewCreated$7", f = "InputFieldAssem.kt", l = {142}, m = "invokeSuspend")
public final class C458910Hz7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InputFieldAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458910Hz7(InputFieldAssem inputFieldAssem, InterfaceC1364105Vn<? super C458910Hz7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inputFieldAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458910Hz7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputFieldAssem@6c95.onViewCreated$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C013C c013c = new C013C();
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InputFieldAssem.LLJJIJIL;
            c013c.element = ((PanelStateViewModel) assemVMLazy.getValue()).LLIZ.getValue() instanceof C447810HhD;
            AnonymousClass0951 anonymousClass0951 = ((PanelStateViewModel) this.LLILLJJLI.LLJJIII.getValue()).LLIZ;
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(c013c, this.LLILLJJLI, 3);
            this.LL = 1;
            if (anonymousClass0951.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("InputFieldAssem@6c95.onViewCreated$7");
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
