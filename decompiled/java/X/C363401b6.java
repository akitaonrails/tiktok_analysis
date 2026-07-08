package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01b6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinImageGeckoManagerV2$getGeckoResPathWithFetch$3", f = "BulletinImageGeckoManagerV2.kt", l = {229, 232}, m = "invokeSuspend")
public final class C363401b6 extends C09AX implements InterfaceC1631620sYq<Boolean, C1533790q13, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ C1533790q13 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, String, InterfaceC1364105Vn<? super Unit>, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C363401b6(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC1631620sYq;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "BulletinImageGeckoManagerV2@3246.getGeckoResPathWithFetch$3"
            X.C1C7U.LIZ(r10)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r11.LL
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L1b
            if (r0 == r8) goto L96
            if (r0 == r3) goto L96
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r12)
            boolean r7 = r11.LLILLJJLI
            X.0q13 r0 = r11.LLILLL
            java.lang.String r6 = r0.LIZLLL()
            r9 = 0
            if (r6 == 0) goto L80
            if (r7 == 0) goto L3e
            boolean r0 = X.C1533950q1J.LJ(r6)
            if (r0 == 0) goto L3e
            r0 = 1
        L32:
            if (r0 != 0) goto L35
            r6 = 0
        L35:
            if (r6 == 0) goto L80
            java.lang.String r1 = r11.LLILZ
            java.lang.String r5 = r11.LLILZIL
            X.0sYq<java.lang.Boolean, java.lang.String, X.05Vn<? super kotlin.Unit>, java.lang.Object> r3 = r11.LLILZLL
            goto L40
        L3e:
            r0 = 0
            goto L32
        L40:
            int r0 = r1.length()     // Catch: java.lang.Exception -> L50
            if (r0 <= 0) goto L48
            r0 = 1
            goto L49
        L48:
            r0 = 0
        L49:
            if (r0 == 0) goto L54
            java.lang.String r2 = kotlin.text.a0.LJL(r6, r1, r6)     // Catch: java.lang.Exception -> L50
            goto L56
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L54:
            java.lang.String r2 = ""
        L56:
            java.util.Map<java.lang.String, java.lang.String> r1 = X.C363301b5.LIZIZ
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L68
            int r0 = r0.length()
            if (r0 != 0) goto L69
        L68:
            r9 = 1
        L69:
            if (r9 == 0) goto L6e
            r1.put(r5, r2)
        L6e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r11.LLILLJJLI = r7
            r11.LL = r8
            java.lang.Object r0 = r3.invoke(r0, r6, r11)
            if (r0 != r4) goto L99
            X.C1C7U.LIZIZ(r10)
            return r4
        L80:
            X.0sYq<java.lang.Boolean, java.lang.String, X.05Vn<? super kotlin.Unit>, java.lang.Object> r2 = r11.LLILZLL
            if (r7 == 0) goto L99
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r11.LL = r3
            java.lang.String r0 = "File path is null or empty"
            java.lang.Object r0 = r2.invoke(r1, r0, r11)
            if (r0 != r4) goto L99
            X.C1C7U.LIZIZ(r10)
            return r4
        L96:
            X.C155000ia.LIZIZ(r12)
        L99:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363401b6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, C1533790q13 c1533790q13, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C363401b6 c363401b6 = new C363401b6(this.LLILZ, this.LLILZIL, interfaceC1364105Vn, this.LLILZLL);
        c363401b6.LLILLJJLI = zBooleanValue;
        c363401b6.LLILLL = c1533790q13;
        return c363401b6.invokeSuspend(Unit.LIZ);
    }
}
