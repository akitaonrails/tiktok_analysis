package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem$initMessageListComponent$1$3", f = "IMMessagePowerListAssem.kt", l = {508}, m = "invokeSuspend")
public final class C903540ZcW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C904680ZeM LLILLJJLI;
    public final /* synthetic */ IMMessagePowerListAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C903540ZcW(C904680ZeM c904680ZeM, IMMessagePowerListAssem iMMessagePowerListAssem, InterfaceC1364105Vn<? super C903540ZcW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c904680ZeM;
        this.LLILLL = iMMessagePowerListAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C903540ZcW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessagePowerListAssem@bf3d.initMessageListComponent$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<Boolean> c05ydDX = this.LLILLJJLI.LIZ().dX();
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLL, 40);
            this.LL = 1;
            if (c05ydDX.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("IMMessagePowerListAssem@bf3d.initMessageListComponent$1$3");
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
