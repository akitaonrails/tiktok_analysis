package X;

import com.bytedance.tts.pigeon.GECPigeon;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YI3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.utils.ConversationKt$fetchConversation$2", f = "Conversation.kt", l = {165}, m = "invokeSuspend")
public final class C0YI3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y8T>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ GECPigeon LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YI3(GECPigeon gECPigeon, String str, InterfaceC1364105Vn<? super C0YI3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = gECPigeon;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YI3(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationKt@b2c2.fetchConversation$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            GECPigeon gECPigeon = this.LLILLL;
            String str = this.LLILZ;
            this.LL = str;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            gECPigeon.getPigeonIMClient().LIZIZ.LJ().LJJLIL(str, new C1769306wN(c2252611DEt, 5));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ConversationKt@b2c2.fetchConversation$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ConversationKt@b2c2.fetchConversation$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y8T> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
