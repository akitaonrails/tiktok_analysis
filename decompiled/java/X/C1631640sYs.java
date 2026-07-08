package X;

import Y.AgS305S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lnn.q;
import njp.a;

/* JADX INFO: renamed from: X.0sYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.greenscreen.RecordGreenScreenLogicComponent$onCreate$6", f = "RecordGreenScreenLogicComponent.kt", l = {135}, m = "invokeSuspend")
public final class C1631640sYs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1632310sZx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631640sYs(C1632310sZx c1632310sZx, InterfaceC1364105Vn<? super C1631640sYs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1632310sZx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1631640sYs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        C095D c095dLJJ;
        C1C7U.LIZ("RecordGreenScreenLogicComponent@a591.onCreate$6");
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
            q stickerApi = this.LLILLJJLI.getStickerApi();
            if (stickerApi != null && (interfaceC1624480sNKC0 = stickerApi.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (c095dLJJ = interfaceC1625470sOvLJII.LJJ()) != null) {
                AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLJJLI, 18);
                this.LL = 1;
                if (c095dLJJ.collect(agS305S0100000_25, this) == objLJFF) {
                    C1C7U.LIZIZ("RecordGreenScreenLogicComponent@a591.onCreate$6");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordGreenScreenLogicComponent@a591.onCreate$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
