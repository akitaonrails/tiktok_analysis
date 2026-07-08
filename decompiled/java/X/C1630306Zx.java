package X;

import Y.AgS283S0100000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputVM;
import com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem$subscribeToTextState$1", f = "QuickEmojiPanelAssem.kt", l = {240}, m = "invokeSuspend")
public final class C1630306Zx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ QuickEmojiPanelAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630306Zx(QuickEmojiPanelAssem quickEmojiPanelAssem, InterfaceC1364105Vn<? super C1630306Zx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = quickEmojiPanelAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1630306Zx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa interfaceC346201WaLIZ;
        C0I0H c0i0h;
        C2252321DDq c2252321DDqMe;
        C1C7U.LIZ("QuickEmojiPanelAssem@177a.subscribeToTextState$1");
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
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = QuickEmojiPanelAssem.LLLF;
            C1768806wI c1768806wI = new C1768806wI(((InputFieldVM) assemVMLazy.getValue()).LLILLJJLI, 3);
            C128Y c128yLJI = C724240Sb0.LJI(this.LLILLJJLI);
            if ((c128yLJI instanceof C0I0H) && (c0i0h = (C0I0H) c128yLJI) != null && (c2252321DDqMe = c0i0h.me()) != null) {
                interfaceC346201WaLIZ = new C1768806wI(c2252321DDqMe, 4);
            } else {
                interfaceC346201WaLIZ = C1BNE.LIZ(true);
            }
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C09IC.LJIIIIZZ(c1768806wI, interfaceC346201WaLIZ, new C1768806wI(((IMQuickMessageInputVM) this.LLILLJJLI.LLJJIJIIJIL.getValue()).vQ2().LJIILLIIL(), 5), new C1350805Qk(null)));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 23);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("QuickEmojiPanelAssem@177a.subscribeToTextState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickEmojiPanelAssem@177a.subscribeToTextState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
