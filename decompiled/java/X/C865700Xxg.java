package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager$getConversationStatistic$$inlined$scopedIO$1", f = "DefaultConversationManager.kt", l = {}, m = "invokeSuspend")
public final class C865700Xxg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C878750Ydd>>, Object> {
    public final /* synthetic */ C866340Xyi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865700Xxg(InterfaceC1364105Vn interfaceC1364105Vn, C866340Xyi c866340Xyi) {
        super(2, interfaceC1364105Vn);
        this.LL = c866340Xyi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865700Xxg(interfaceC1364105Vn, this.LL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C878750Ydd>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q c0y6qLIZ;
        C1C7U.LIZ("DefaultConversationManager@5d7d.getConversationStatistic$$inlined$scopedIO$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C878750Ydd c878750YddLJIILJJIL = this.LL.LIZ.LJIILJJIL();
            if (c878750YddLJIILJJIL == null) {
                c0y6qLIZ = C865670Xxd.LIZ(-1, "No active session");
            } else {
                c0y6qLIZ = C865670Xxd.LIZJ(c878750YddLJIILJJIL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "Statistic failed";
            }
            c0y6qLIZ = C865670Xxd.LIZ(-1, message);
        }
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.getConversationStatistic$$inlined$scopedIO$1");
        return c0y6qLIZ;
    }
}
