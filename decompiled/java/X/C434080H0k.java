package X;

import Y.AgS197S0200000_6;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMImageBtnViewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMImageBtnViewAssem$onActualViewCreated$1$1", f = "IMImageBtnViewAssem.kt", l = {44}, m = "invokeSuspend")
public final class C434080H0k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMImageBtnViewAssem LLILLJJLI;
    public final /* synthetic */ SmartImageView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434080H0k(IMImageBtnViewAssem iMImageBtnViewAssem, SmartImageView smartImageView, InterfaceC1364105Vn<? super C434080H0k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMImageBtnViewAssem;
        this.LLILLL = smartImageView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434080H0k(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMImageBtnViewAssem@ca02.onActualViewCreated$1$1");
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
            IMImageBtnViewAssem iMImageBtnViewAssem = this.LLILLJJLI;
            iMImageBtnViewAssem.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(iMImageBtnViewAssem), 45));
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLJJLI, this.LLILLL, 22);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("IMImageBtnViewAssem@ca02.onActualViewCreated$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMImageBtnViewAssem@ca02.onActualViewCreated$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
