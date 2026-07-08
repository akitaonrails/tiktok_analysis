package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
public final class C1681180tqm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1681150tqj LLILLJJLI;
    public final /* synthetic */ C09AE LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C1681200tqo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681180tqm(EnumC1681150tqj enumC1681150tqj, C09AE c09ae, int i, int i2, C1681200tqo c1681200tqo, InterfaceC1364105Vn<? super C1681180tqm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1681150tqj;
        this.LLILLL = c09ae;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = c1681200tqo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1681180tqm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "LottieAnimatableImpl@d59c.animate$2$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            if (r0 == 0) goto L21
            if (r0 != r4) goto L69
            X.C155000ia.LIZIZ(r8)
        L13:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto L24
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L21:
            X.C155000ia.LIZIZ(r8)
        L24:
            X.0tqj r0 = r7.LLILLJJLI
            int[] r1 = X.C1681170tql.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 != r4) goto L66
            X.09AE r0 = r7.LLILLL
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L63
            int r3 = r7.LLILZ
        L3a:
            X.0tqo r2 = r7.LLILZLL
            r7.LL = r4
            r2.getClass()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r0) goto L57
            kotlin.jvm.internal.AwS131S0101000_25 r1 = new kotlin.jvm.internal.AwS131S0101000_25
            r0 = 12
            r1.<init>(r2, r3, r0)
            java.lang.Object r8 = X.C1680620tps.LIZ(r7, r1)
        L51:
            if (r8 != r5) goto L13
            X.C1C7U.LIZIZ(r6)
            return r5
        L57:
            kotlin.jvm.internal.AwS131S0101000_25 r1 = new kotlin.jvm.internal.AwS131S0101000_25
            r0 = 13
            r1.<init>(r2, r3, r0)
            java.lang.Object r8 = X.C1838620xwi.LIZIZ(r7, r1)
            goto L51
        L63:
            int r3 = r7.LLILZIL
            goto L3a
        L66:
            int r3 = r7.LLILZ
            goto L3a
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1681180tqm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
