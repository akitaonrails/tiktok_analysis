package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager$getConversations$$inlined$scopedIO$1", f = "DefaultConversationManager.kt", l = {}, m = "invokeSuspend")
public final class C866350Xyj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends C0Y8T>>>, Object> {
    public final /* synthetic */ C866340Xyi LL;
    public final /* synthetic */ List LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866350Xyj(InterfaceC1364105Vn interfaceC1364105Vn, C866340Xyi c866340Xyi, List list) {
        super(2, interfaceC1364105Vn);
        this.LL = c866340Xyi;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866350Xyj(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<List<? extends C0Y8T>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YPQ c0ypy;
        C0Y6Q c0y6qLIZIZ;
        C1C7U.LIZ("DefaultConversationManager@5d7d.getConversations$$inlined$scopedIO$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            List<C0Y8T> listLJIJJ = this.LL.LIZ.LJIJJ(this.LLILLJJLI);
            if (listLJIJJ == null) {
                listLJIJJ = C13BV.INSTANCE;
            }
            c0y6qLIZIZ = C865670Xxd.LIZJ(listLJIJJ);
        } catch (C872730YLn e) {
            TryCatchGuardChecker.doCheck(e);
            C0YMW error = e.getError();
            if (error != null) {
                C0YPQ.Companion.getClass();
                c0ypy = C0YPP.LIZIZ(error);
            } else {
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                c0ypy = new C0YPY(-1, message, null, null);
            }
            c0y6qLIZIZ = C865670Xxd.LIZIZ(c0ypy);
        }
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.getConversations$$inlined$scopedIO$1");
        return c0y6qLIZIZ;
    }
}
