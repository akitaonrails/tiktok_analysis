package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.api.pages.creation.input.AICreationInputLogicComponent$initObserve$1$1", f = "AICreationInputLogicComponent.kt", l = {270}, m = "invokeSuspend")
public final class C549990Lhd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC549270LgT LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C551270Ljh LLILZ;
    public final /* synthetic */ InterfaceC549270LgT LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C549990Lhd(C551270Ljh c551270Ljh, InterfaceC549270LgT interfaceC549270LgT, InterfaceC1364105Vn<? super C549990Lhd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c551270Ljh;
        this.LLILZIL = interfaceC549270LgT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C549990Lhd(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r19
            java.lang.String r10 = "AICreationInputLogicComponent@741f.initObserve$1$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            r5 = r18
            int r0 = r5.LLILLL
            r9 = 1
            r6 = 0
            if (r0 == 0) goto L79
            if (r0 != r9) goto Lbb
            long r2 = r5.LLILLJJLI
            X.0LgT r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L1c:
            java.util.List r1 = (java.util.List) r1
        L1e:
            boolean r0 = r7 instanceof X.C549300LgW
            if (r0 == 0) goto L76
            X.0LgW r7 = (X.C549300LgW) r7
            int r0 = r7.LIZ
            java.lang.Integer r16 = X.C2286608xc.LJ(r0)
        L2a:
            if (r1 == 0) goto L58
            java.util.Iterator r4 = r1.iterator()
        L30:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r11 = r4.next()
            r0 = r11
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r0
            java.lang.String r1 = r0.uid
            java.lang.String r0 = java.lang.String.valueOf(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L30
        L49:
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r11 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r11
            if (r11 == 0) goto L58
            r12 = 0
            java.lang.String r13 = "MySelf"
            r17 = 7615(0x1dbf, float:1.0671E-41)
            r14 = r12
            r15 = r12
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r6 = com.ss.android.ugc.aweme.creative.model.common.MentionDataItem.LIZ(r11, r12, r13, r14, r15, r16, r17)
        L58:
            X.0Ljh r0 = r5.LLILZ
            X.0Ljl r1 = r0.w2()
            X.0LgT r0 = r5.LLILZIL
            r1.Qo(r0, r6)
            X.0Ljh r0 = r5.LLILZ
            X.0Lji r1 = r0.G2()
            X.0LgT r0 = r5.LLILZIL
            r1.Y1(r0, r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L74:
            r11 = r6
            goto L49
        L76:
            r16 = r6
            goto L2a
        L79:
            X.C155000ia.LIZIZ(r1)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            java.lang.String r0 = r0.getCurrentUserID()
            java.lang.Long r1 = X.C2095008Iq.LJIILIIL(r0)
            if (r1 == 0) goto L58
            X.0Ljh r0 = r5.LLILZ
            X.0LgT r7 = r5.LLILZIL
            long r2 = r1.longValue()
            X.0Lgo r0 = r0.LL
            com.ss.android.ugc.aweme.aikit.api.create.MentionService r4 = r0.getMentionService$tools_ai_uikit_df_release()
            if (r4 == 0) goto Lb8
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r5.LL = r7
            r5.LLILLJJLI = r2
            r5.LLILLL = r9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r4.LJII(r6, r1, r0, r5)
            if (r1 != r8) goto L1c
            X.C1C7U.LIZIZ(r10)
            return r8
        Lb8:
            r1 = r6
            goto L1e
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C549990Lhd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
