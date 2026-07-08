package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.newhandlers.SingleChatBlockBannerHandler$getOtherUser$2", f = "SingleChatBlockBannerHandler.kt", l = {46}, m = "invokeSuspend")
public final class C15611069h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IMUser>, Object> {
    public int LL;
    public final /* synthetic */ C06O3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15611069h(C06O3 c06o3, InterfaceC1364105Vn<? super C15611069h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c06o3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15611069h(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleChatBlockBannerHandler@778c.getOtherUser$2");
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
            InterfaceC15608069e value = this.LLILLJJLI.LLILZIL.LIZJ().getValue();
            SessionInfo sessionInfo = this.LLILLJJLI.LLILZ.LJI;
            this.LL = 1;
            obj = value.LIZ(sessionInfo);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SingleChatBlockBannerHandler@778c.getOtherUser$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SingleChatBlockBannerHandler@778c.getOtherUser$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
