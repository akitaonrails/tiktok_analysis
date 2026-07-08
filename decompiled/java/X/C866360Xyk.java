package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager$countConversations$$inlined$scopedIO$1", f = "DefaultConversationManager.kt", l = {}, m = "invokeSuspend")
public final class C866360Xyk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C866930Xzf>>, Object> {
    public final /* synthetic */ C866340Xyi LL;
    public final /* synthetic */ C869710Y9x LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866360Xyk(InterfaceC1364105Vn interfaceC1364105Vn, C866340Xyi c866340Xyi, C869710Y9x c869710Y9x) {
        super(2, interfaceC1364105Vn);
        this.LL = c866340Xyi;
        this.LLILLJJLI = c869710Y9x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866360Xyk(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C866930Xzf>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q<C866930Xzf> c0y6qLIZ;
        C1C7U.LIZ("DefaultConversationManager@5d7d.countConversations$$inlined$scopedIO$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            c0y6qLIZ = this.LL.LIZ.LJJLJ(this.LLILLJJLI);
            if (c0y6qLIZ.LIZIZ()) {
                C866930Xzf c866930Xzf = c0y6qLIZ.LIZ;
                if (c866930Xzf == null) {
                    c866930Xzf = new C866930Xzf(this.LLILLJJLI, 0L);
                }
                c0y6qLIZ = C865670Xxd.LIZJ(c866930Xzf);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "Count failed";
            }
            c0y6qLIZ = C865670Xxd.LIZ(-1, message);
        }
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.countConversations$$inlined$scopedIO$1");
        return c0y6qLIZ;
    }
}
