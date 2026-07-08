package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.repository.VibeFeedDetailOperator$batchPreloadRedDot$2$jobs$1$1", f = "VibeFeedDetailOperator.kt", l = {277, 87}, m = "invokeSuspend")
public final class C897850ZKd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1337805Lk LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public EnumC912680ZrG LLILZLL;
    public int LLIZ;
    public final /* synthetic */ InterfaceC1337805Lk LLIZLLLIL;
    public final /* synthetic */ C0P32 LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ EnumC912680ZrG LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897850ZKd(InterfaceC1337805Lk interfaceC1337805Lk, C0P32 c0p32, String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super C897850ZKd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = interfaceC1337805Lk;
        this.LLJ = c0p32;
        this.LLJI = str;
        this.LLJIJIL = str2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = enumC912680ZrG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897850ZKd(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r5 = "VibeFeedDetailOperator@bd0.batchPreloadRedDot$2$jobs$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LLIZ
            r1 = 2
            r4 = 1
            if (r0 == 0) goto L3a
            if (r0 == r4) goto L22
            if (r0 != r1) goto L1a
            java.lang.Object r9 = r12.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            X.05Lk r3 = r12.LL
            goto L7c
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L22:
            X.0ZrG r11 = r12.LLILZLL
            java.lang.Object r9 = r12.LLILZIL
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r12.LLILZ
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r12.LLILLL
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r12.LLILLJJLI
            X.0P32 r6 = (X.C0P32) r6
            X.05Lk r3 = r12.LL
            X.C155000ia.LIZIZ(r13)
            goto L61
        L3a:
            X.C155000ia.LIZIZ(r13)
            X.05Lk r3 = r12.LLIZLLLIL
            X.0P32 r6 = r12.LLJ
            java.lang.String r7 = r12.LLJI
            java.lang.String r8 = r12.LLJIJIL
            java.lang.String r9 = r12.LLJILJIL
            X.0ZrG r11 = r12.LLJILJILJ
            r12.LL = r3
            r12.LLILLJJLI = r6
            r12.LLILLL = r7
            r12.LLILZ = r8
            r12.LLILZIL = r9
            r12.LLILZLL = r11
            r12.LLIZ = r4
            java.lang.Object r0 = r3.LIZ(r12)
            if (r0 != r2) goto L61
            X.C1C7U.LIZIZ(r5)
            return r2
        L61:
            X.0OmL r10 = X.EnumC629350OmL.SCENE_PRELOAD     // Catch: java.lang.Throwable -> L98
            r12.LL = r3     // Catch: java.lang.Throwable -> L98
            r12.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L98
            r0 = 0
            r12.LLILLL = r0     // Catch: java.lang.Throwable -> L98
            r12.LLILZ = r0     // Catch: java.lang.Throwable -> L98
            r12.LLILZIL = r0     // Catch: java.lang.Throwable -> L98
            r12.LLILZLL = r0     // Catch: java.lang.Throwable -> L98
            r12.LLIZ = r1     // Catch: java.lang.Throwable -> L98
            java.lang.Object r13 = r6.LJJLIIIJILLIZJL(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L98
            if (r13 != r2) goto L7f
            X.C1C7U.LIZIZ(r5)
            return r2
        L7c:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Throwable -> L9d
        L7f:
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> L9d
            int r2 = r13.intValue()     // Catch: java.lang.Throwable -> L9d
            X.0r5r r1 = X.C1575210r5r.LLILLJJLI     // Catch: java.lang.Throwable -> L9d
            X.0ZKe r0 = X.EnumC897860ZKe.INBOX_PRELOAD     // Catch: java.lang.Throwable -> L9d
            if (r2 == r4) goto L8c
            r4 = 0
        L8c:
            r1.LJI(r0, r9, r4)     // Catch: java.lang.Throwable -> L9d
            r3.release()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L98:
            r0 = move-exception
        L99:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9d
            goto L9f
        L9d:
            r0 = move-exception
            goto L99
        L9f:
            r3.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897850ZKd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
