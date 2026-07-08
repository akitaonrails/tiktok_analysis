package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.LiveMatchManager$updateVictoryLapEffect$1$1", f = "LiveMatchManager.kt", l = {678}, m = "invokeSuspend")
public final class C1316905Dj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ C0UEA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1316905Dj(String str, Long l, C0UEA c0uea, InterfaceC1364105Vn<? super C1316905Dj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = l;
        this.LLILZ = c0uea;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1316905Dj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMatchManager@3ccf.updateVictoryLapEffect$1$1");
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
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("victoryLapEffect, Setting effect for loser, name: ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", resId: ");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ("LiveMatchManager", C2188811AlT.LIZIZ(sbLIZ));
            C0UEA c0uea = this.LLILZ;
            String strValueOf = String.valueOf(this.LLILLL);
            this.LL = 1;
            if (c0uea.LIZ(strValueOf, this) == objLJFF) {
                C1C7U.LIZIZ("LiveMatchManager@3ccf.updateVictoryLapEffect$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMatchManager@3ccf.updateVictoryLapEffect$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
