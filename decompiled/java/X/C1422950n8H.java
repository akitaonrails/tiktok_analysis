package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateTrendingCacheManager$maybeStartCarouselLoop$1", f = "TemplateTrendingCacheManager.kt", l = {208, 232}, m = "invokeSuspend")
public final class C1422950n8H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1422960n8I LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422950n8H(C1422960n8I c1422960n8I, InterfaceC1364105Vn<? super C1422950n8H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1422960n8I;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1422950n8H(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:8:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a3 -> B:7:0x0022). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            java.lang.String r5 = "TemplateTrendingCacheManager@2c89.maybeStartCarouselLoop$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            r3 = r20
            int r1 = r3.LLILZ
            r0 = 2
            r4 = 1
            if (r1 == 0) goto La9
            if (r1 == r4) goto L4e
            if (r1 != r0) goto Lad
            int r7 = r3.LLILLL
            java.lang.Object r8 = r3.LLILLJJLI
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r12 = r3.LL
            java.util.List r12 = (java.util.List) r12
            X.C155000ia.LIZIZ(r21)
        L22:
            X.0n8I r0 = r3.LLILZIL
            r0.LJIIIIZZ = r7
            com.bytedance.als.h0<X.0n8J> r1 = r0.LIZLLL
            java.lang.Object r0 = r1.LIZJ()
            r9 = 0
            r11 = 0
            r0.getClass()
            X.0n8J r6 = new X.0n8J
            r10 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.LJII(r6)
            r4 = 1
        L3b:
            r0 = 0
            r3.LL = r0
            r3.LLILLJJLI = r0
            r3.LLILZ = r4
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r3)
            if (r0 != r2) goto L51
            X.C1C7U.LIZIZ(r5)
            return r2
        L4e:
            X.C155000ia.LIZIZ(r21)
        L51:
            X.0n8I r0 = r3.LLILZIL
            java.util.List<java.lang.String> r12 = r0.LJIIJ
            int r0 = r12.size()
            if (r0 <= r4) goto L3b
            X.0n8I r0 = r3.LLILZIL
            int r14 = r0.LJIIIIZZ
            int r0 = r12.size()
            int r14 = r14 % r0
            int r7 = r14 + 1
            int r0 = r12.size()
            int r7 = r7 % r0
            java.lang.Object r15 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r12, r14)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r12, r7)
            java.lang.String r8 = (java.lang.String) r8
            X.0n8I r0 = r3.LLILZIL
            r0.LJIIIZ = r15
            com.bytedance.als.h0<X.0n8J> r1 = r0.LIZLLL
            java.lang.Object r0 = r1.LIZJ()
            r18 = 1
            r0.getClass()
            X.0n8J r13 = new X.0n8J
            r16 = r8
            r17 = r15
            r19 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.LJII(r13)
            r3.LL = r12
            r3.LLILLJJLI = r8
            r3.LLILLL = r7
            r0 = 2
            r3.LLILZ = r0
            r0 = 800(0x320, double:3.953E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r3)
            if (r0 != r2) goto L22
            X.C1C7U.LIZIZ(r5)
            return r2
        La9:
            X.C155000ia.LIZIZ(r21)
            goto L3b
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422950n8H.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
