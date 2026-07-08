package X;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.psp.action.DownloadImageToDiskAction$executeAction$1", f = "DownloadImageToDiskAction.kt", l = {}, m = "invokeSuspend")
public final class C1702760uPa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1749630vdB LL;
    public final /* synthetic */ C207256168g LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702760uPa(AbstractC1749630vdB abstractC1749630vdB, C207256168g c207256168g, InterfaceC1364105Vn<? super C1702760uPa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1749630vdB;
        this.LLILLJJLI = c207256168g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702760uPa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadImageToDiskAction@3fc5.executeAction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZIZ() == 0) {
            this.LLILLJJLI.LJ(this.LL, 0L);
        } else {
            Queue<AbstractC1749630vdB> queue = C207256168g.LJ;
            Queue<AbstractC1749630vdB> queue2 = C207256168g.LJ;
            if (((PriorityBlockingQueue) queue2).size() > 20) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DownloadImageToDiskAction@3fc5.executeAction$1");
                return unit;
            }
            AbstractC1749630vdB abstractC1749630vdB = this.LL;
            for (AbstractC1749630vdB abstractC1749630vdB2 : queue2) {
                if (abstractC1749630vdB2.getClass() == abstractC1749630vdB.getClass() && Intrinsics.LJFF(abstractC1749630vdB2.LIZJ(), abstractC1749630vdB.LIZJ())) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("DownloadImageToDiskAction@3fc5.executeAction$1");
                    return unit2;
                }
            }
            Queue<AbstractC1749630vdB> queue3 = C207256168g.LJ;
            Boolean.valueOf(((PriorityBlockingQueue) C207256168g.LJ).add(this.LL));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("DownloadImageToDiskAction@3fc5.executeAction$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
