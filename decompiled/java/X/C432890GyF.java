package X;

import Y.AgS197S0200000_6;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordFieldAssem;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordFieldAssem$onViewCreated$18", f = "RecordFieldAssem.kt", l = {256}, m = "invokeSuspend")
public final class C432890GyF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecordFieldAssem LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432890GyF(RecordFieldAssem recordFieldAssem, View view, InterfaceC1364105Vn<? super C432890GyF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recordFieldAssem;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432890GyF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordFieldAssem@a8d7.onViewCreated$18");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RecordFieldAssem.LLJLLL;
            C2252321DDq c2252321DDq = ((InputPanelSizeViewModel) assemVMLazy.getValue()).LL.LL;
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLL, this.LLILLJJLI, 8);
            this.LL = 1;
            if (c2252321DDq.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("RecordFieldAssem@a8d7.onViewCreated$18");
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
