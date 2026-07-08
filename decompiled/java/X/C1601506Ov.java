package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem$resetHideComponents$1", f = "CommonChatNoticeAssem.kt", l = {398}, m = "invokeSuspend")
public final class C1601506Ov extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommonChatNoticeAssem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601506Ov(CommonChatNoticeAssem commonChatNoticeAssem, boolean z, InterfaceC1364105Vn<? super C1601506Ov> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commonChatNoticeAssem;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1601506Ov(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r5 = "CommonChatNoticeAssem@3038.resetHideComponents$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r12.LL
            r2 = 1
            if (r0 == 0) goto L74
            if (r0 != r2) goto L85
            X.C155000ia.LIZIZ(r13)
        L13:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r4 = r13.booleanValue()
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem r6 = r12.LLILLJJLI
            r7 = 0
            boolean r10 = r12.LLILLL
            X.0HxI r0 = r6.So()
            r3 = 0
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LL
            if (r0 == 0) goto L4c
            java.lang.String r1 = r0.getConversationId()
            if (r1 == 0) goto L4c
            X.068s r0 = com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository r0 = X.C15596068s.LIZ()
            if (r0 == 0) goto L4c
            X.0693 r0 = (X.AnonymousClass0693) r0
            boolean r0 = r0.LIZ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L4c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
        L4c:
            boolean r0 = r12.LLILLL
            if (r0 == 0) goto L72
            if (r4 != 0) goto L72
        L52:
            r11 = 1
        L53:
            r8 = r7
            r9 = r7
            r6.yp(r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem r0 = r12.LLILLJJLI
            com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatNoticeStateVM r1 = r0.Zo()
            boolean r0 = r12.LLILLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatNoticeStateVM.vQ2(r1, r3, r0, r2)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem r0 = r12.LLILLJJLI
            r0.Go()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L72:
            r11 = 0
            goto L53
        L74:
            X.C155000ia.LIZIZ(r13)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem r0 = r12.LLILLJJLI
            r12.LL = r2
            java.lang.Object r13 = r0.op(r12)
            if (r13 != r1) goto L13
            X.C1C7U.LIZIZ(r5)
            return r1
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601506Ov.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
