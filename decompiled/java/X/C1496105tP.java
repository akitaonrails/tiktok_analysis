package X;

import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem$subscribeToJumpAvatarWhenTyping$1", f = "SingleTitleBarCenterAssem.kt", l = {728, 729}, m = "invokeSuspend")
public final class C1496105tP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05YD LL;
    public C01GW LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ SingleTitleBarCenterAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496105tP(SingleTitleBarCenterAssem singleTitleBarCenterAssem, InterfaceC1364105Vn<? super C1496105tP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = singleTitleBarCenterAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1496105tP(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:7:0x001d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r8 = "SingleTitleBarCenterAssem@32f.subscribeToJumpAvatarWhenTyping$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            java.lang.String r7 = ""
            r4 = 2
            r10 = 1
            r3 = 0
            if (r0 == 0) goto L7f
            if (r0 == r10) goto L5f
            if (r0 != r4) goto Lae
            X.01GW r2 = r15.LLILLJJLI
            X.05YD r6 = r15.LL
            X.C155000ia.LIZIZ(r16)
        L1d:
            int r1 = X.C1661506ez.LIZ()
            r0 = 3
            if (r1 != r0) goto L4a
            X.05x7 r0 = com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusAnalytics.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusAnalytics r9 = X.C1519105x7.LIZ()
            if (r9 == 0) goto L4a
            com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem r0 = r15.LLILZ
            X.0Zln r0 = r0.lp()
            if (r0 == 0) goto L3d
            java.lang.String r12 = r0.getConversationId()
            if (r12 != 0) goto L3e
        L3d:
            r12 = r7
        L3e:
            java.lang.String r11 = "private"
            r13 = -1
            X.0I0B r0 = X.C0I0B.LJFF
            X.05sz r14 = r0.LIZIZ()
            r9.reportOnTypingIndicatorShown(r10, r11, r12, r13, r14)
        L4a:
            X.059f r0 = new X.059f
            r0.<init>(r3)
            r15.LL = r6
            r15.LLILLJJLI = r2
            r15.LLILLL = r10
            java.lang.Object r0 = X.C09IC.LJIJ(r6, r15, r0)
            if (r0 != r5) goto L66
            X.C1C7U.LIZIZ(r8)
            return r5
        L5f:
            X.01GW r2 = r15.LLILLJJLI
            X.05YD r6 = r15.LL
            X.C155000ia.LIZIZ(r16)
        L66:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05Hp r0 = new X.05Hp
            r0.<init>(r2, r6, r3)
            r15.LL = r6
            r15.LLILLJJLI = r2
            r15.LLILLL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r15, r1, r0)
            if (r0 != r5) goto L1d
            X.C1C7U.LIZIZ(r8)
            return r5
        L7f:
            X.C155000ia.LIZIZ(r16)
            X.05ug r2 = X.C1504005ug.LL
            com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem r0 = r15.LLILZ
            X.0Zln r0 = r0.lp()
            if (r0 == 0) goto L92
            java.lang.String r1 = r0.getConversationId()
            if (r1 != 0) goto L93
        L92:
            r1 = r7
        L93:
            X.05ui r0 = X.EnumC1504205ui.SINGLE
            r2.getClass()
            X.05uT r0 = X.C1504005ug.LIZIZ(r1, r0)
            X.05YD r6 = r0.LIZJ()
            kotlin.jvm.internal.AwS546S0100000_2 r2 = new kotlin.jvm.internal.AwS546S0100000_2
            com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem r1 = r15.LLILZ
            r0 = 341(0x155, float:4.78E-43)
            r2.<init>(r1, r0)
            X.01GW r2 = X.C452501pT.LIZIZ(r2)
            goto L4a
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496105tP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
