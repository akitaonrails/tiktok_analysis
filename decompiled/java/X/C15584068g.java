package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$onSendMessageEvent$1$1", f = "BaseSingleChatNoticeViewModel.kt", l = {289, 292, 294}, m = "invokeSuspend")
public final class C15584068g extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaseSingleChatNoticeViewModel LLILLL;
    public final /* synthetic */ C06SA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15584068g(BaseSingleChatNoticeViewModel baseSingleChatNoticeViewModel, C06SA c06sa, InterfaceC1364105Vn<? super C15584068g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseSingleChatNoticeViewModel;
        this.LLILZ = c06sa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15584068g c15584068g = new C15584068g(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c15584068g.LLILLJJLI = obj;
        return c15584068g;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 3
            r1 = 1
            r2 = 2
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L4a
            if (r0 == r2) goto L75
            if (r0 != r5) goto L8f
            X.C155000ia.LIZIZ(r8)
        L19:
            X.13BV r0 = X.C13BV.INSTANCE
            X.C1C7U.LIZIZ(r6)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r3 = r7.LLILLJJLI
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel r0 = r7.LLILLL
            boolean r0 = r0.LLJI
            if (r0 == 0) goto L51
            X.06SA r0 = r7.LLILZ
            X.0Y9l r0 = r0.LIZJ
            int r0 = r0.getMsgStatus()
            if (r0 != r2) goto L51
            X.06Mv r0 = X.EnumC1596306Mv.STREAK_REMIND_PERMISSION
            X.06OO r0 = r0.toTask()
            r7.LLILLJJLI = r3
            r7.LL = r1
            java.lang.Object r0 = r3.invoke(r0, r7)
            if (r0 != r4) goto L51
            X.C1C7U.LIZIZ(r6)
            return r4
        L4a:
            java.lang.Object r3 = r7.LLILLJJLI
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            X.C155000ia.LIZIZ(r8)
        L51:
            com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel r0 = r7.LLILLL
            X.002o r0 = r0.getState()
            X.0694 r0 = (X.AnonymousClass0694) r0
            boolean r0 = r0.LLILLL
            if (r0 != 0) goto L7c
            com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel r0 = r7.LLILLL
            com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine r1 = r0.LL
            X.06Mv r0 = X.EnumC1596306Mv.MATCHED_FRIEND
            X.06OO r0 = r0.toTask()
            r7.LLILLJJLI = r3
            r7.LL = r2
            java.lang.Object r0 = r1.LJIILJJIL(r0, r7)
            if (r0 != r4) goto L7c
            X.C1C7U.LIZIZ(r6)
            return r4
        L75:
            java.lang.Object r3 = r7.LLILLJJLI
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            X.C155000ia.LIZIZ(r8)
        L7c:
            com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel r2 = r7.LLILLL
            X.06SA r1 = r7.LLILZ
            r0 = 0
            r7.LLILLJJLI = r0
            r7.LL = r5
            java.lang.Object r0 = r2.DQ2(r1, r3, r7)
            if (r0 != r4) goto L19
            X.C1C7U.LIZIZ(r6)
            return r4
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15584068g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
