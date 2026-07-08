package X;

import Y.AgS287S0100000_6;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldAssem$onViewCreated$8", f = "InputFieldAssem.kt", l = {162}, m = "invokeSuspend")
public final class C458920Hz8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InputFieldAssem LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458920Hz8(InputFieldAssem inputFieldAssem, View view, InterfaceC1364105Vn<? super C458920Hz8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inputFieldAssem;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458920Hz8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputFieldAssem@6c95.onViewCreated$8");
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
            InputFieldAssem inputFieldAssem = this.LLILLJJLI;
            inputFieldAssem.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(inputFieldAssem), 5));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 11);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("InputFieldAssem@6c95.onViewCreated$8");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InputFieldAssem@6c95.onViewCreated$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
