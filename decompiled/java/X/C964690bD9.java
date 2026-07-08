package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.core.linkmic.timer.Timer$start$jobId$1$1$1", f = "Timer.kt", l = {}, m = "invokeSuspend")
public final class C964690bD9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C964680bD8 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964690bD9(long j, C964680bD8 c964680bD8, InterfaceC1364105Vn<? super C964690bD9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = c964680bD8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C964690bD9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.Boolean] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Timer@6c79.start$jobId$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LL / 1000;
        if (j > 0) {
            InterfaceC954310awP interfaceC954310awP = this.LLILLJJLI.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Dispatch countdown event. timeLeft=");
            sbLIZ.append(j);
            sbLIZ.append(". listener=");
            sbLIZ.append(this.LLILLJJLI.LIZJ);
            interfaceC954310awP.d("Timer", C2188811AlT.LIZIZ(sbLIZ));
            C964680bD8 c964680bD8 = this.LLILLJJLI;
            if (C964710bDB.LIZ[c964680bD8.LIZ.ordinal()] == 1) {
                c964680bD8.LJFF.LIZ = Boolean.TRUE;
                c964680bD8.LIZJ.LLILII(c964680bD8.LIZIZ, j);
            } else {
                throw new C1954807lC();
            }
        } else {
            InterfaceC954310awP interfaceC954310awP2 = this.LLILLJJLI.LJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Dispatch timeout event. listener=");
            sbLIZ2.append(this.LLILLJJLI.LIZJ);
            interfaceC954310awP2.d("Timer", C2188811AlT.LIZIZ(sbLIZ2));
            C964680bD8 c964680bD82 = this.LLILLJJLI;
            if (C964710bDB.LIZ[c964680bD82.LIZ.ordinal()] == 1) {
                c964680bD82.LJFF.LIZ = Boolean.TRUE;
                c964680bD82.LIZJ.LLIZ(c964680bD82.LIZIZ);
            } else {
                throw new C1954807lC();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Timer@6c79.start$jobId$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
