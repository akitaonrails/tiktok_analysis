package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportAIMessageShow$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1502805uU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502805uU(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C1502805uU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1502805uU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportAIMessageShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C15390060u.LL.LJIL(this.LL.getConversationId())) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIMessageShow$1");
            return unit;
        }
        Set<Long> set = C1508705vR.LLILZIL;
        C869590Y9l c869590Y9l = this.LL;
        synchronized (set) {
            try {
                if (!set.add(C2286608xc.LJFF(c869590Y9l.getMsgId()))) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIMessageShow$1");
                    return unit2;
                }
                C1508705vR c1508705vR = C1508705vR.LL;
                String uuid = this.LL.getUuid();
                uuid.toString();
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("message_id", uuid));
                c1508705vR.getClass();
                C1508705vR.LIZLLL("ttsocial_aiasst_message_show", mapLJIIIIZZ);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIMessageShow$1");
                return unit3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
