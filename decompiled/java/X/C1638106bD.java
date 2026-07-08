package X;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06bD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1638106bD extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C1671006gW LLILZIL;
    public final C01GW LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final Set<C067L> LLIZLLLIL;

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZLL.getValue();
    }

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return C1635006ai.LIZ();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZLLLIL;
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        this.LLILZIL.LIZIZ();
    }

    public C1638106bD(C1600706On c1600706On, C1671006gW c1671006gW) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = c1671006gW;
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1172));
        this.LLIZ = Collections.singleton(EnumC1596306Mv.BUSINESS_MESSAGE_REQUEST_STRAIGHT_TO_INBOX);
        this.LLIZLLLIL = Collections.singleton(C067L.BUSINESS);
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        return C06OI.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1638306bF
            if (r0 == 0) goto L41
            r4 = r8
            X.06bF r4 = (X.C1638306bF) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto La2
            X.06OO r7 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            boolean r0 = r7 instanceof X.C06AH
            if (r0 == 0) goto L9f
            X.06AH r7 = (X.C06AH) r7
            if (r7 == 0) goto L9f
            X.06On r0 = r6.LLILZ
            android.content.Context r5 = r0.LIZJ
            if (r5 != 0) goto L47
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r7
            r4.LLILZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L24
            return r2
        L41:
            X.06bF r4 = new X.06bF
            r4.<init>(r6, r8)
            goto L12
        L47:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131827471(0x7f111b0f, float:1.9287856E38)
            java.lang.String r4 = r1.getString(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131827472(0x7f111b10, float:1.9287858E38)
            java.lang.String r3 = r1.getString(r0)
            X.06gW r2 = r6.LLILZIL
            kotlin.jvm.internal.AwS546S0100000_2 r1 = new kotlin.jvm.internal.AwS546S0100000_2
            r0 = 1173(0x495, float:1.644E-42)
            r1.<init>(r5, r0)
            r0 = 873(0x369, float:1.223E-42)
            kotlin.jvm.internal.AFwS229S0000000_2 r0 = kotlin.jvm.internal.AFwS229S0000000_2.get$arr$(r0)
            r2.LJ(r4, r3, r1, r0)
            X.06gf r0 = com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics r1 = X.C1671906gf.LIZ()
            if (r1 == 0) goto L83
            X.0I0B r0 = X.C0I0B.LJFF
            X.05sz r0 = r0.LIZIZ()
            r1.LIZIZ(r0)
        L83:
            com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct r0 = r7.LIZJ
            java.lang.String r1 = r0.noticeCode
            if (r1 == 0) goto L9c
            X.06On r0 = r6.LLILZ
            X.06ae r0 = r0.LJIIJJI
            X.01GW r0 = r0.LJ()
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel r0 = (com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel) r0
            if (r0 == 0) goto L9c
            r0.MQ2(r1)
        L9c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1638106bD.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }
}
