package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem$subscribeToKeyboardShowing$1", f = "BaseChatInputAssem.kt", l = {69, 69}, m = "invokeSuspend")
public final class C457610Hx1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaseChatInputAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457610Hx1(BaseChatInputAssem baseChatInputAssem, InterfaceC1364105Vn<? super C457610Hx1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseChatInputAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C457610Hx1 c457610Hx1 = new C457610Hx1(this.LLILLL, interfaceC1364105Vn);
        c457610Hx1.LLILLJJLI = obj;
        return c457610Hx1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseChatInputAssem@9839.subscribeToKeyboardShowing$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AssemVMLazy assemVMLazy = this.LLILLL.LLJLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BaseChatInputAssem.LLJZ;
            C463000IDq c463000IDq = new C463000IDq(((PanelStateViewModel) assemVMLazy.getValue()).LLIZ, 0);
            this.LL = 1;
            obj = C09IC.LJJIJIIJIL(c463000IDq, interfaceC497601wk, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseChatInputAssem@9839.subscribeToKeyboardShowing$1");
                return objLJFF;
            }
        }
        Object obj2 = new InterfaceC346701Wf() { // from class: X.0Hxc
            @Override // X.InterfaceC346701Wf
            public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                if (((Boolean) obj3).booleanValue()) {
                    IIMChatPerfLogger.LIZ.getClass();
                    IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
                    if (iIMChatPerfLoggerLIZ != null) {
                        iIMChatPerfLoggerLIZ.LJIIL();
                    }
                } else {
                    IIMChatPerfLogger.LIZ.getClass();
                    IIMChatPerfLogger iIMChatPerfLoggerLIZ2 = C907170ZiN.LIZ();
                    if (iIMChatPerfLoggerLIZ2 != null) {
                        iIMChatPerfLoggerLIZ2.LJFF();
                    }
                }
                return Unit.LIZ;
            }
        };
        this.LL = 2;
        if (((C01S9) obj).collect(obj2, this) == objLJFF) {
            C1C7U.LIZIZ("BaseChatInputAssem@9839.subscribeToKeyboardShowing$1");
            return objLJFF;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
