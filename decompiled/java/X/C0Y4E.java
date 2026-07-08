package X;

import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y4E, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase$sendCreateRequestOverNetwork$saveConversationIntoDBResult$1", f = "CreateConversationUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0Y4E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C867500Y1k>, Object> {
    public final /* synthetic */ C0Y4D LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0Y4J LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y4E(C0Y4D c0y4d, int i, C0Y4J c0y4j, InterfaceC1364105Vn<? super C0Y4E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y4d;
        this.LLILLJJLI = i;
        this.LLILLL = c0y4j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y4E(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateConversationUseCase@7f7c.sendCreateRequestOverNetwork$saveConversationIntoDBResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C867480Y1i c867480Y1i = this.LL.LIZJ;
        int i = this.LLILLJJLI;
        C0Y4J c0y4j = this.LLILLL;
        CreateConversationV2ResponseBody createConversationV2ResponseBody = c0y4j.LIZ;
        ConversationInfoV2 conversationInfoV2 = createConversationV2ResponseBody.conversation;
        Boolean bool = createConversationV2ResponseBody.is_existed;
        String str = c0y4j.LIZJ;
        if (str == null) {
            str = "null_log_id";
        }
        C867500Y1k c867500Y1kLIZ = C867480Y1i.LIZ(c867480Y1i, i, conversationInfoV2, bool, str, false, 48);
        C1C7U.LIZIZ("CreateConversationUseCase@7f7c.sendCreateRequestOverNetwork$saveConversationIntoDBResult$1");
        return c867500Y1kLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C867500Y1k> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
