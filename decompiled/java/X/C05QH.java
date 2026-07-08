package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.capsule.MusicCapsuleProcessTracker$reportEvent$1", f = "MusicCapsuleProcessTracker.kt", l = {}, m = "invokeSuspend")
public final class C05QH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C0LAB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QH(String str, C0LAB c0lab, InterfaceC1364105Vn<? super C05QH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c0lab;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicCapsuleProcessTracker@fb91.reportEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1458390o3R.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventName:");
        sbLIZ.append(this.LL);
        sbLIZ.append(" , threadId:");
        sbLIZ.append(C786410Ut5.u3().getId());
        sbLIZ.append(",params:");
        sbLIZ.append(this.LLILLJJLI);
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL(this.LL, this.LLILLJJLI.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicCapsuleProcessTracker@fb91.reportEvent$1");
        return unit;
    }
}
