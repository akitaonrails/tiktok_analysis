package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager$saveDraft$$inlined$scopedIO$1", f = "DefaultConversationManager.kt", l = {}, m = "invokeSuspend")
public final class C865660Xxc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Unit>>, Object> {
    public final /* synthetic */ C866340Xyi LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865660Xxc(InterfaceC1364105Vn interfaceC1364105Vn, C866340Xyi c866340Xyi, String str, String str2) {
        super(2, interfaceC1364105Vn);
        this.LL = c866340Xyi;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865660Xxc(interfaceC1364105Vn, this.LL, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y6Q c0y6qLIZ;
        C1C7U.LIZ("DefaultConversationManager@5d7d.saveDraft$$inlined$scopedIO$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.LJJ(this.LLILLJJLI).LJJLIL(this.LLILLL);
            c0y6qLIZ = C865670Xxd.LIZJ(Unit.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to save draft";
            }
            c0y6qLIZ = C865670Xxd.LIZ(-1, message);
        }
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.saveDraft$$inlined$scopedIO$1");
        return c0y6qLIZ;
    }
}
