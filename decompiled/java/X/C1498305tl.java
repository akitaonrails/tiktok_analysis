package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$reportAIAsstMessageBtnClick$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1498305tl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1498305tl(String str, InterfaceC1364105Vn<? super C1498305tl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1498305tl(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstMessageBtnClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set<String> set = C1508705vR.LLJ;
        String str = this.LL;
        synchronized (set) {
            if (str == null) {
                str = "";
            }
            try {
                if (!set.add(str)) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstMessageBtnClick$1");
                    return unit;
                }
                C1508705vR c1508705vR = C1508705vR.LL;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("message_id", this.LL));
                c1508705vR.getClass();
                C1508705vR.LIZLLL("ttsocial_aiasst_message_btn_click", mapLJIIIIZZ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.reportAIAsstMessageBtnClick$1");
                return unit2;
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
