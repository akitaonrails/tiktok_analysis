package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS442S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.common.ChatroomBlockHelperKt$setupBlockNonInputComponent$1$2", f = "ChatroomBlockHelper.kt", l = {}, m = "invokeSuspend")
public final class C459120HzS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UIAssem LL;
    public final /* synthetic */ AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C01GW<View> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C459120HzS(UIAssem uIAssem, AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> assemVMLazy, C013C c013c, C01GW<? extends View> c01gw, InterfaceC1364105Vn<? super C459120HzS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uIAssem;
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = c013c;
        this.LLILZ = c01gw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C459120HzS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomBlockHelperKt@4418.setupBlockNonInputComponent$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        UIAssem uIAssem = this.LL;
        AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C459110HzR.LLILZIL;
        C736680Sv4.LJIIIIZZ(uIAssem, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0HzT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C457640Hx4) obj2).LL);
            }
        }, null, new AwS442S0200000_6(this.LLILLL, (C013C) this.LLILZ, (C01GW<? extends View>) 24), 6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatroomBlockHelperKt@4418.setupBlockNonInputComponent$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
