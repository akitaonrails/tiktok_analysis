package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WXU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.popup.manager.EcUgShopTabPopupManager$awaitPopupThenLoad$2$lifecycleObserver$1$onResume$1", f = "EcUgShopTabPopupManager.kt", l = {600}, m = "invokeSuspend")
public final class C0WXU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLIZLLLIL;
    public final /* synthetic */ InterfaceC824510WWb LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0WXU(Fragment fragment, String str, boolean z, int i, Function2<? super Boolean, ? super String, Unit> function2, boolean z2, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, InterfaceC824510WWb interfaceC824510WWb, InterfaceC1364105Vn<? super C0WXU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = function2;
        this.LLIZ = z2;
        this.LLIZLLLIL = interfaceC20236714Gf;
        this.LLJ = interfaceC824510WWb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WXU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r23
            java.lang.String r7 = "EcUgShopTabPopupManager@ada3.awaitPopupThenLoad$2$lifecycleObserver$1$onResume$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            r4 = r22
            int r0 = r4.LL
            r6 = 1
            if (r0 == 0) goto L37
            if (r0 != r6) goto La8
            X.C155000ia.LIZIZ(r1)
        L17:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            X.14Gf<java.lang.Boolean> r0 = r4.LLIZLLLIL
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L31
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.14Gf<java.lang.Boolean> r0 = r4.LLIZLLLIL
            X.C189200o6.m2constructorimpl(r1)
            r0.resumeWith(r1)
        L31:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L37:
            X.C155000ia.LIZIZ(r1)
            X.0vO8 r8 = X.C1740300vO8.LIZ
            androidx.fragment.app.Fragment r1 = r4.LLILLJJLI
            java.lang.String r0 = r4.LLILLL
            com.bytedance.router.SmartRoute r9 = com.bytedance.router.SmartRouter.buildFragmentRoute(r1, r0)
            androidx.fragment.app.Fragment r0 = r4.LLILLJJLI
            android.content.Context r10 = r0.getContext()
            java.lang.String r11 = r4.LLILLL
            boolean r13 = r4.LLILZ
            int r15 = r4.LLILZIL
            kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit> r2 = r4.LLILZLL
            if (r2 == 0) goto La5
            androidx.fragment.app.Fragment r1 = r4.LLILLJJLI
            X.0WWb r0 = r4.LLJ
            kotlin.jvm.internal.AwS95S1300000_13 r16 = new kotlin.jvm.internal.AwS95S1300000_13
            r21 = 0
            r18 = r11
            r19 = r0
            r20 = r2
            r17 = r1
            r16.<init>(r17, r18, r19, r20, r21)
        L67:
            com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgRemoveShopTabOverlayExpendConfig r0 = X.C1740280vO6.LIZ
            boolean r0 = r0.fixBtm
            if (r0 == 0) goto L99
            X.1BhA r0 = X.C2211621BhA.LIZ
            r0.getClass()
            X.1BhC r0 = X.C2211621BhA.LJ
            if (r0 == 0) goto L99
            X.0WXV r5 = new X.0WXV
            X.0WWb r2 = r4.LLJ
            java.lang.String r1 = r4.LLILLL
            androidx.fragment.app.Fragment r0 = r4.LLILLJJLI
            r5.<init>(r2, r1, r0)
        L81:
            boolean r0 = r4.LLIZ
            r4.LL = r6
            r14 = -1
            r12 = 1
            r18 = r0
            r19 = r12
            r20 = r4
            r17 = r5
            java.lang.Object r1 = r8.LIZIZ(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r1 != r3) goto L17
            X.C1C7U.LIZIZ(r7)
            return r3
        L99:
            X.0WXT r5 = new X.0WXT
            X.0WWb r2 = r4.LLJ
            java.lang.String r1 = r4.LLILLL
            androidx.fragment.app.Fragment r0 = r4.LLILLJJLI
            r5.<init>()
            goto L81
        La5:
            r16 = 0
            goto L67
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WXU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
