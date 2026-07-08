package X;

import Y.AgS197S0200000_6;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.InputIconBtn;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.misc.InputIconBtn$onActualViewCreated$1$3", f = "InputIconBtn.kt", l = {64}, m = "invokeSuspend")
public final class C432380GxQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InputIconBtn LLILLJJLI;
    public final /* synthetic */ TuxIconView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432380GxQ(InputIconBtn inputIconBtn, TuxIconView tuxIconView, InterfaceC1364105Vn<? super C432380GxQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inputIconBtn;
        this.LLILLL = tuxIconView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432380GxQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputIconBtn@ba56.onActualViewCreated$1$3");
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
            InputIconBtn inputIconBtn = this.LLILLJJLI;
            inputIconBtn.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(inputIconBtn), 48));
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLL, this.LLILLJJLI, 24);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("InputIconBtn@ba56.onActualViewCreated$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InputIconBtn@ba56.onActualViewCreated$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
