package X;

import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl$realScheduleBatchFetchGroupStatus$1", f = "InboxGroupChatSocialStatusViewModelImpl.kt", l = {313, 319}, m = "invokeSuspend")
public final class C08WK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxGroupChatSocialStatusViewModelImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WK(InboxGroupChatSocialStatusViewModelImpl inboxGroupChatSocialStatusViewModelImpl, InterfaceC1364105Vn<? super C08WK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxGroupChatSocialStatusViewModelImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0016, code lost:
    
        if (r1 != r6) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if ((!r10.LLILLJJLI.LLILZIL.isEmpty()) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r9 = "InboxGroupChatSocialStatusViewModelImpl@9cd5.realScheduleBatchFetchGroupStatus$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 == r4) goto L43
            if (r0 != r5) goto L9e
            X.C155000ia.LIZIZ(r11)
        L16:
            com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl r0 = r10.LLILLJJLI
            java.util.LinkedList<java.lang.String> r0 = r0.LLILZIL
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L2b
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L28:
            X.C155000ia.LIZIZ(r11)
        L2b:
            X.01GW r0 = X.C18038074q.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r10.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r6) goto L46
            X.C1C7U.LIZIZ(r9)
            return r6
        L43:
            X.C155000ia.LIZIZ(r11)
        L46:
            com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl r2 = r10.LLILLJJLI
            r8 = 0
            r2.LLJI = r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.01GW r0 = X.C18006073k.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
        L5c:
            int r0 = r7.size()
            if (r0 > r1) goto L76
            java.util.LinkedList<java.lang.String> r0 = r2.LLILZIL
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L76
            java.util.LinkedList<java.lang.String> r0 = r2.LLILZIL
            java.lang.Object r0 = r0.removeFirst()
            r7.add(r0)
            goto L5c
        L76:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L22
            com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl r3 = r10.LLILLJJLI
            r10.LL = r5
            r3.getClass()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.08Yd r1 = new X.08Yd
            java.lang.String r0 = "dm_inbox_group"
            r1.<init>(r3, r7, r0, r8)
            java.lang.Object r1 = X.C23250099c.LJI(r10, r2, r1)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L98
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L98:
            if (r1 != r6) goto L16
            X.C1C7U.LIZIZ(r9)
            return r6
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08WK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
