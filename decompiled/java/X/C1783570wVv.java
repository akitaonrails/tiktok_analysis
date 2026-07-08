package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageChunkProxy$onTextTypewritingComplete$2", f = "MessageChunkProxy.kt", l = {}, m = "invokeSuspend")
public final class C1783570wVv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1785070wYL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783570wVv(C1785070wYL c1785070wYL, InterfaceC1364105Vn<? super C1783570wVv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1785070wYL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783570wVv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageChunkProxy@dc87.onTextTypewritingComplete$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1785070wYL c1785070wYL = this.LL;
        synchronized (c1785070wYL.LIZIZ) {
            try {
                if (!c1785070wYL.LIZJ.isEmpty()) {
                    int i = C1782640wUQ.LIZ[c1785070wYL.LJII.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            c1785070wYL.LJIIJJI();
                        } else {
                            throw new C1954807lC();
                        }
                    }
                } else {
                    c1785070wYL.LJII();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageChunkProxy@dc87.onTextTypewritingComplete$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
