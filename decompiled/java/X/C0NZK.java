package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListTabInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.AddMemberHelper$openAddMemberPanelForPublicGroup$1$cachedTabs$1", f = "AddMemberHelper.kt", l = {}, m = "invokeSuspend")
public final class C0NZK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends InvitationListTabInfo>>, Object> {
    public final /* synthetic */ C0Y8T LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZK(C0Y8T c0y8t, InterfaceC1364105Vn<? super C0NZK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NZK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddMemberHelper@47bc.openAddMemberPanelForPublicGroup$1$cachedTabs$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NZN c0nzn = C0NZN.LIZ;
        String conversationId = this.LL.getConversationId();
        c0nzn.getClass();
        List listLIZIZ = C0NZN.LIZIZ(conversationId);
        C1C7U.LIZIZ("AddMemberHelper@47bc.openAddMemberPanelForPublicGroup$1$cachedTabs$1");
        return listLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends InvitationListTabInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
