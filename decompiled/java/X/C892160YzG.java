package X;

import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.perf.MessageListFPSMonitor$initMonitor$2", f = "MessageListFPSMonitor.kt", l = {87}, m = "invokeSuspend")
public final class C892160YzG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2183681AdC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C892160YzG(C2183681AdC c2183681AdC, InterfaceC1364105Vn<? super C892160YzG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2183681AdC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C892160YzG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageListFPSMonitor@16f6.initMonitor$2");
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
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            if (iIMChatAnalyticsLIZ != null) {
                C2183681AdC c2183681AdC = this.LLILLJJLI;
                Map<String, String> map = c2183681AdC.LLJ;
                String strValueOf = String.valueOf(C0YNP.LJII(c2183681AdC.LL.getConversationId()));
                this.LL = 1;
                if (iIMChatAnalyticsLIZ.LJI(strValueOf, map, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageListFPSMonitor@16f6.initMonitor$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageListFPSMonitor@16f6.initMonitor$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
