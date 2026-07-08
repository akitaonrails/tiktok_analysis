package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$startBotCreateTracking$1", f = "IMSmartReplyAnalysis.kt", l = {216}, m = "invokeSuspend")
public final class C1497705tf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1497705tf(InterfaceC1364105Vn<? super C1497705tf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1497705tf(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.startBotCreateTracking$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(600000L, this) == objLJFF) {
                C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.startBotCreateTracking$1");
                return objLJFF;
            }
        }
        if (C1508705vR.LLJILJILJ > 0) {
            C1508705vR.LL.getClass();
            C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1497605te(null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.startBotCreateTracking$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1497705tf(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
