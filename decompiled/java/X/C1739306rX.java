package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06rX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.spark.IMMessageLinkAnalytics$reportLinkClick$1", f = "IMMessageLinkAnalytics.kt", l = {27, 28}, m = "invokeSuspend")
public final class C1739306rX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C869590Y9l LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ InterfaceC1493105sv LLIZ;
    public final /* synthetic */ C869590Y9l LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739306rX(C869590Y9l c869590Y9l, InterfaceC1493105sv interfaceC1493105sv, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1493105sv;
        this.LLIZLLLIL = c869590Y9l;
        this.LLJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739306rX(this.LLIZLLLIL, this.LLIZ, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "IMMessageLinkAnalytics@1dc5.reportLinkClick$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILZLL
            r8 = 0
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L57
            if (r0 == r2) goto L43
            if (r0 != r6) goto Lbc
            java.lang.Object r1 = r10.LLILZ
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r10.LLILLL
            X.0Y9l r4 = r10.LLILLJJLI
            java.lang.Object r2 = r10.LL
            java.util.Map r2 = (java.util.Map) r2
            X.C155000ia.LIZIZ(r11)
        L23:
            X.0Z3l r0 = com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics r0 = X.C893510Z3l.LIZ()
            if (r0 == 0) goto L31
            r0.LIZJ(r4, r1)
        L31:
            java.lang.String r0 = "link_address"
            r1.put(r0, r5)
            X.05sv r1 = r10.LLIZ
            java.lang.String r0 = "chat_link_click"
            r1.sendEvent(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L43:
            java.lang.Object r0 = r10.LLILZIL
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r10.LLILZ
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r5 = r10.LLILLL
            X.0Y9l r4 = r10.LLILLJJLI
            java.lang.Object r2 = r10.LL
            java.util.Map r2 = (java.util.Map) r2
            X.C155000ia.LIZIZ(r11)
            goto L94
        L57:
            X.C155000ia.LIZIZ(r11)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            X.0Y9l r4 = r10.LLIZLLLIL
            java.lang.String r5 = r10.LLJ
            X.0Z3l r1 = com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics.LIZ
            r1.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics r3 = X.C893510Z3l.LIZ()
            if (r3 == 0) goto L8a
            r10.LL = r0
            r10.LLILLJJLI = r4
            r10.LLILLL = r5
            r10.LLILZ = r0
            r10.LLILZIL = r0
            r10.LLILZLL = r2
            X.0YyA r2 = new X.0YyA
            r2.<init>()
            r1 = 0
            java.lang.Object r11 = r3.LJII(r4, r2, r1, r10)
            if (r11 != r7) goto L92
            X.C1C7U.LIZIZ(r9)
            return r7
        L8a:
            r1 = r0
            r2 = r0
        L8c:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            goto L98
        L92:
            r1 = r0
            r2 = r0
        L94:
            java.util.Map r11 = (java.util.Map) r11
            if (r11 == 0) goto L8c
        L98:
            r0.putAll(r11)
            X.0Z3l r0 = com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics r0 = X.C893510Z3l.LIZ()
            if (r0 == 0) goto L23
            r10.LL = r2
            r10.LLILLJJLI = r4
            r10.LLILLL = r5
            r10.LLILZ = r1
            r10.LLILZIL = r8
            r10.LLILZLL = r6
            java.lang.Object r0 = r0.LJI(r4, r1, r10)
            if (r0 != r7) goto L23
            X.C1C7U.LIZIZ(r9)
            return r7
        Lbc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1739306rX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
