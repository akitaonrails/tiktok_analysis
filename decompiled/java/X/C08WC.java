package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentGroupChatLinkHandler$checkGroupChatLink$1$1", f = "CommentGroupChatLinkHandler.kt", l = {70}, m = "invokeSuspend")
public final class C08WC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC2030507xP>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WC(String str, String str2, InterfaceC1364105Vn<? super C08WC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentGroupChatLinkHandler@bde9.checkGroupChatLink$1$1");
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
            C08YY c08yy = C08YY.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            this.LL = 1;
            obj = c08yy.LIZ(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentGroupChatLinkHandler@bde9.checkGroupChatLink$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentGroupChatLinkHandler@bde9.checkGroupChatLink$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC2030507xP> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
