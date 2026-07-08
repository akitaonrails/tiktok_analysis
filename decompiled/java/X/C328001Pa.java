package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$fetchAndDownload$1$1", f = "PCSBoardEffectService.kt", l = {}, m = "invokeSuspend")
public final class C328001Pa extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C387101ev>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function2<Integer, LiveEffect, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328001Pa(Function2<? super Integer, ? super LiveEffect, Unit> function2, InterfaceC1364105Vn<? super C328001Pa> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.fetchAndDownload$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download fails: ");
        sbLIZ.append(th.getMessage());
        C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Function2<Integer, LiveEffect, Unit> function2 = this.LLILLJJLI;
        if (function2 != null) {
            function2.invoke(C2286608xc.LJ(-1), null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.fetchAndDownload$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C387101ev> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C328001Pa c328001Pa = new C328001Pa(this.LLILLJJLI, interfaceC1364105Vn);
        c328001Pa.LL = th;
        return c328001Pa.invokeSuspend(Unit.LIZ);
    }
}
