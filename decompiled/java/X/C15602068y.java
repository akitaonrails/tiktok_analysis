package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel$triggerLocalTasks$1", f = "SingleChatNoticeViewModel.kt", l = {67}, m = "invokeSuspend")
public final class C15602068y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SingleChatNoticeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15602068y(SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC1364105Vn<? super C15602068y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singleChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15602068y(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "SingleChatNoticeViewModel@3e8d.triggerLocalTasks$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 1
            if (r0 == 0) goto L19
            if (r0 != r6) goto L58
            X.C155000ia.LIZIZ(r10)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L19:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel r0 = r9.LLILLJJLI
            X.0Zln r5 = r0.zQ2()
            if (r5 != 0) goto L2a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L2a:
            boolean r0 = r5.hasChatHistory()
            if (r0 != 0) goto L41
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel r0 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository r1 = r0.LLILLL
            r4 = 0
            if (r1 == 0) goto L42
            java.lang.String r0 = r5.getConversationId()
            boolean r0 = r1.LIZIZ(r0)
            if (r0 != r6) goto L42
        L41:
            r4 = 1
        L42:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel r3 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine r2 = r3.LL
            X.069F r1 = new X.069F
            r0 = 0
            r1.<init>(r5, r3, r0)
            r9.LL = r6
            java.lang.Object r0 = r2.LIZLLL(r9, r1, r6, r4)
            if (r0 != r7) goto L13
            X.C1C7U.LIZIZ(r8)
            return r7
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15602068y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
