package X;

import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06eO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM$fetchGroupLiveData$1", f = "GroupChatVM.kt", l = {}, m = "invokeSuspend")
public final class C1657806eO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GroupChatVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657806eO(GroupChatVM groupChatVM, InterfaceC1364105Vn<? super C1657806eO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = groupChatVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1657806eO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        Long lLJIILIIL;
        C1C7U.LIZ("GroupChatVM@cd92.fetchGroupLiveData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C913140Zs0 c913140Zs0XQ2 = this.LL.xQ2();
        if (c913140Zs0XQ2 != null && (conversationId = c913140Zs0XQ2.getConversationId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(conversationId)) != null) {
            GroupChatVM groupChatVM = this.LL;
            long jLongValue = lLJIILIIL.longValue();
            IMLiveService.LIZ.getClass();
            IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
            if (iMLiveServiceLIZ != null) {
                iMLiveServiceLIZ.i3(jLongValue, AFwS187S0000000_2.get$arr$(1200), new AwS581S0100000_2(groupChatVM, 589));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatVM@cd92.fetchGroupLiveData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
