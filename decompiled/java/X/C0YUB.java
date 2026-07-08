package X;

import com.ss.android.ugc.aweme.network.model.ConversationAudit;
import com.ss.android.ugc.aweme.network.model.ConversationAuditUnreadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YUB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupAuditListUtil$updateConversationTime$1", f = "GroupAuditListUtil.kt", l = {}, m = "invokeSuspend")
public final class C0YUB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ConversationAuditUnreadInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YUB(ConversationAuditUnreadInfo conversationAuditUnreadInfo, InterfaceC1364105Vn<? super C0YUB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = conversationAuditUnreadInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YUB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("GroupAuditListUtil@4954.updateConversationTime$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strValueOf = String.valueOf(this.LL.conversationShortId);
        ConversationAudit conversationAudit = this.LL.latestAudit;
        long j = 0;
        if (conversationAudit != null && conversationAudit.createTimeInMs > 0) {
            if (conversationAudit != null) {
                j = conversationAudit.createTimeInMs;
            }
            C0YNP.LJIIIIZZ(strValueOf, "receive_group_join_request", String.valueOf(j));
            C0YNP.LIZIZ(strValueOf).LJIJI().LLJLLL(strValueOf);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateConversationTime: ");
            ConversationAudit conversationAudit2 = this.LL.latestAudit;
            if (conversationAudit2 != null) {
                lLJFF = C2286608xc.LJFF(conversationAudit2.createTimeInMs);
            } else {
                lLJFF = null;
            }
            sbLIZ.append(lLJFF);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupAuditListUtil@4954.updateConversationTime$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
