package X;

import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment$handleDelete$1$1$1$1", f = "IMQuickReplyManageFragment.kt", l = {295}, m = "invokeSuspend")
public final class C1784080wWk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public IMQuickReplyManageFragment LL;
    public int LLILLJJLI;
    public final /* synthetic */ IMQuickReplyManageFragment LLILLL;
    public final /* synthetic */ IMQuickReply LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784080wWk(IMQuickReplyManageFragment iMQuickReplyManageFragment, IMQuickReply iMQuickReply, InterfaceC1364105Vn<? super C1784080wWk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iMQuickReplyManageFragment;
        this.LLILZ = iMQuickReply;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784080wWk(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "IMQuickReplyManageFragment@b31d.handleDelete$1$1$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LLILLJJLI
            r12 = 0
            r4 = 1
            if (r0 == 0) goto L56
            if (r0 != r4) goto L7c
            com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment r3 = r13.LL
            X.C155000ia.LIZIZ(r14)
        L16:
            java.util.List r14 = (java.util.List) r14
            androidx.lifecycle.LifecycleCoroutineScope r4 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r3)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0wWi r1 = new X.0wWi
            r1.<init>(r3, r14, r12)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r2, r12, r1, r0)
        L29:
            com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment r1 = r13.LLILLL
            com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig r0 = r1.LLJJIJIL
            if (r0 == 0) goto L33
            java.lang.String r8 = r0.toUserId
            if (r8 != 0) goto L35
        L33:
            java.lang.String r8 = ""
        L35:
            java.lang.String r9 = r1.getEnterFrom()
            com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment r0 = r13.LLILLL
            java.lang.String r10 = r0.getEnterMethod()
            java.lang.String r11 = "click_confirm"
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0S4X r7 = new X.0S4X
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r12, r12, r7, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L56:
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment r3 = r13.LLILLL
            com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig r1 = r3.LLJJIJIL
            if (r1 == 0) goto L29
            com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply r0 = r13.LLILZ
            r3.LJ()
            com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM r2 = r3.VR()
            java.lang.String r1 = r1.uid
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r13.LL = r3
            r13.LLILLJJLI = r4
            java.lang.Object r14 = r2.vQ2(r1, r0, r13)
            if (r14 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1784080wWk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
