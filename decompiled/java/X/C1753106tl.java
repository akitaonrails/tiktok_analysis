package X;

import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM$storeCacheOfBusinessActionBar$1", f = "BusinessChatActionBarVM.kt", l = {}, m = "invokeSuspend")
public final class C1753106tl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BusinessChatActionBarVM LL;
    public final /* synthetic */ List<ActionBarButtonConfBusiness> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1753106tl(BusinessChatActionBarVM businessChatActionBarVM, List<ActionBarButtonConfBusiness> list, InterfaceC1364105Vn<? super C1753106tl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = businessChatActionBarVM;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1753106tl(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        String strLJ;
        C1C7U.LIZ("BusinessChatActionBarVM@a852.storeCacheOfBusinessActionBar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SessionInfo sessionInfoXQ2 = this.LL.xQ2();
        if (sessionInfoXQ2 != null && (conversationId = sessionInfoXQ2.getConversationId()) != null) {
            List<ActionBarButtonConfBusiness> list = this.LLILLJJLI;
            if (list != null && (!list.isEmpty())) {
                strLJ = C051M.LJ(list, false);
            } else {
                strLJ = "";
            }
            C0YNP.LJIIIIZZ(conversationId, "business_chat_action_bar_btn_conf_cache", strLJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BusinessChatActionBarVM@a852.storeCacheOfBusinessActionBar$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
