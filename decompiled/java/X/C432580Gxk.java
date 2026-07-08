package X;

import Y.AgS287S0100000_6;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.InputIconBtn;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.misc.InputIconBtn$onActualViewCreated$1$4", f = "InputIconBtn.kt", l = {88}, m = "invokeSuspend")
public final class C432580Gxk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InputIconBtn LLILLJJLI;
    public final /* synthetic */ TuxIconView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432580Gxk(InputIconBtn inputIconBtn, TuxIconView tuxIconView, InterfaceC1364105Vn<? super C432580Gxk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inputIconBtn;
        this.LLILLL = tuxIconView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432580Gxk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputIconBtn@ba56.onActualViewCreated$1$4");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(inputIconBtn), 49));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 155);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("InputIconBtn@ba56.onActualViewCreated$1$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InputIconBtn@ba56.onActualViewCreated$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
