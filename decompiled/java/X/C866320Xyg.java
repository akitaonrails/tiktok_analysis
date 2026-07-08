package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager$queryConversationIds$$inlined$scopedIO$1", f = "DefaultConversationManager.kt", l = {}, m = "invokeSuspend")
public final class C866320Xyg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C867250Y0l>>, Object> {
    public final /* synthetic */ C866340Xyi LL;
    public final /* synthetic */ C869710Y9x LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866320Xyg(InterfaceC1364105Vn interfaceC1364105Vn, C866340Xyi c866340Xyi, C869710Y9x c869710Y9x) {
        super(2, interfaceC1364105Vn);
        this.LL = c866340Xyi;
        this.LLILLJJLI = c869710Y9x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866320Xyg(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C867250Y0l>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q<C867250Y0l> c0y6qLIZ;
        C1C7U.LIZ("DefaultConversationManager@5d7d.queryConversationIds$$inlined$scopedIO$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            c0y6qLIZ = this.LL.LIZ.LJJIZ(this.LLILLJJLI);
            if (c0y6qLIZ.LIZIZ()) {
                C867250Y0l c867250Y0l = c0y6qLIZ.LIZ;
                if (c867250Y0l == null) {
                    c867250Y0l = new C867250Y0l(this.LLILLJJLI, C13BV.INSTANCE, false, Long.MAX_VALUE);
                }
                c0y6qLIZ = C865670Xxd.LIZJ(c867250Y0l);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "Query failed";
            }
            c0y6qLIZ = C865670Xxd.LIZ(-1, message);
        }
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.queryConversationIds$$inlined$scopedIO$1");
        return c0y6qLIZ;
    }
}
