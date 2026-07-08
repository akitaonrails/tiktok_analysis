package X;

import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel$onGetMessageEvent$1", f = "GroupChatNoticeViewModel.kt", l = {152, 161}, m = "invokeSuspend")
public final class C068I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1509705vb LLILLJJLI;
    public final /* synthetic */ GroupChatNoticeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068I(C1509705vb c1509705vb, GroupChatNoticeViewModel groupChatNoticeViewModel, InterfaceC1364105Vn<? super C068I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1509705vb;
        this.LLILLL = groupChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C068I(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "GroupChatNoticeViewModel@b908.onGetMessageEvent$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            java.lang.String r7 = "Get message"
            r5 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L47
            if (r0 == r3) goto L96
            if (r0 != r5) goto Lb0
            X.C155000ia.LIZIZ(r10)
        L19:
            X.05h3 r0 = X.C1419505h3.LIZ
            r0.getClass()
            boolean r0 = X.C1419505h3.LIZLLL
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel r0 = r9.LLILLL
            X.01GW r0 = r0.LLILZIL
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController r2 = (com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController) r2
            com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel r0 = r9.LLILLL
            X.0Zs0 r0 = r0.wQ2()
            if (r0 == 0) goto L3a
            java.lang.String r1 = r0.getUuid()
            if (r1 != 0) goto L3c
        L3a:
            java.lang.String r1 = ""
        L3c:
            X.068v r0 = X.EnumC15599068v.GROUP_CHAT_NOTICE_GET_MESSAGE_EVENT
            r2.LJI(r1, r0)
        L41:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L47:
            X.C155000ia.LIZIZ(r10)
            boolean r0 = X.C06NJ.LIZJ()
            if (r0 != 0) goto L41
            X.05vb r0 = r9.LLILLJJLI
            java.util.List<X.0Y9l> r1 = r0.LIZ
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L5f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5f
            goto L99
        L5f:
            java.util.Iterator r2 = r1.iterator()
        L63:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r1 = r2.next()
            X.0Y9l r1 = (X.C869590Y9l) r1
            boolean r0 = X.C0ZDX.LJJIJIL(r1)
            if (r0 != 0) goto L63
            boolean r0 = X.C068M.LIZ(r1)
            if (r0 != 0) goto L63
            boolean r0 = X.C0ZDX.LJJJJL(r1)
            if (r0 != 0) goto L63
            com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel r0 = r9.LLILLL
            com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine r1 = r0.LL
            X.068J r0 = new X.068J
            r0.<init>(r4)
            r9.LL = r3
            java.lang.Object r0 = r1.LIZ(r3, r7, r0, r9)
            if (r0 != r6) goto L99
            X.C1C7U.LIZIZ(r8)
            return r6
        L96:
            X.C155000ia.LIZIZ(r10)
        L99:
            com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel r0 = r9.LLILLL
            com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine r2 = r0.LL
            X.068H r1 = new X.068H
            X.05vb r0 = r9.LLILLJJLI
            r1.<init>(r0, r4)
            r9.LL = r5
            java.lang.Object r0 = r2.LIZ(r3, r7, r1, r9)
            if (r0 != r6) goto L19
            X.C1C7U.LIZIZ(r8)
            return r6
        Lb0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C068I.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
