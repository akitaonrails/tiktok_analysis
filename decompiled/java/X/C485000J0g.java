package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.paging.MaterialPageKeyedDataSource$loadInitial$job$1", f = "MaterialPageKeyedDataSource.kt", l = {60}, m = "invokeSuspend")
public final class C485000J0g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C485050J0l LL;
    public AbstractC470800IdC LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C484980J0e LLILZLL;
    public final /* synthetic */ C485050J0l<Integer> LLIZ;
    public final /* synthetic */ AbstractC470800IdC<Integer, Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C485000J0g(C484980J0e c484980J0e, C485050J0l<Integer> c485050J0l, AbstractC470800IdC<Integer, Object> abstractC470800IdC, InterfaceC1364105Vn<? super C485000J0g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c484980J0e;
        this.LLIZ = c485050J0l;
        this.LLIZLLLIL = abstractC470800IdC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C485000J0g c485000J0g = new C485000J0g(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c485000J0g.LLILZIL = obj;
        return c485000J0g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:14:0x004d, B:16:0x0063, B:11:0x0037, B:18:0x0069, B:20:0x0070, B:21:0x0074), top: B:35:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:14:0x004d, B:16:0x0063, B:11:0x0037, B:18:0x0069, B:20:0x0070, B:21:0x0074), top: B:35:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004a -> B:35:0x004d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "MaterialPageKeyedDataSource@e4d1.loadInitial$job$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r8 = 1
            if (r0 == 0) goto L28
            if (r0 != r8) goto L20
            java.lang.Object r2 = r11.LLILLL
            java.util.List r2 = (java.util.List) r2
            X.0IdC r6 = r11.LLILLJJLI
            X.0J0l r7 = r11.LL
            java.lang.Object r5 = r11.LLILZIL
            X.0J0e r5 = (X.C484980J0e) r5
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L8c
            goto L4d
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L28:
            X.C155000ia.LIZIZ(r12)
            X.0J0e r5 = r11.LLILZLL
            X.0J0l<java.lang.Integer> r7 = r11.LLIZ
            X.0IdC<java.lang.Integer, java.lang.Object> r6 = r11.LLIZLLLIL
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c
            r2.<init>()     // Catch: java.lang.Throwable -> L8c
            r4 = 0
        L37:
            X.0MGq r3 = r5.LJFF     // Catch: java.lang.Throwable -> L8e
            int r1 = r7.LIZ     // Catch: java.lang.Throwable -> L8e
            r11.LLILZIL = r5     // Catch: java.lang.Throwable -> L8e
            r11.LL = r7     // Catch: java.lang.Throwable -> L8e
            r11.LLILLJJLI = r6     // Catch: java.lang.Throwable -> L8e
            r11.LLILLL = r2     // Catch: java.lang.Throwable -> L8e
            r11.LLILZ = r8     // Catch: java.lang.Throwable -> L8e
            r0 = 2
            java.lang.Object r12 = r3.LIZ(r4, r1, r0, r11)     // Catch: java.lang.Throwable -> L8e
            if (r12 != r9) goto L4d
            goto L88
        L4d:
            X.0J0k r12 = (X.C485040J0k) r12     // Catch: java.lang.Throwable -> L8e
            kotlin.jvm.functions.Function1<java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel>, java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel>> r1 = r5.LJIIIIZZ     // Catch: java.lang.Throwable -> L8e
            java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel> r0 = r12.LIZ     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r1.invoke(r0)     // Catch: java.lang.Throwable -> L8e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L8e
            r2.addAll(r0)     // Catch: java.lang.Throwable -> L8e
            long r0 = r12.LIZIZ     // Catch: java.lang.Throwable -> L8e
            int r4 = (int) r0     // Catch: java.lang.Throwable -> L8e
            boolean r3 = r12.LIZJ     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L69
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r0 != 0) goto L37
        L69:
            java.util.List r2 = r5.LJIILJJIL(r2)     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            if (r3 == 0) goto L86
            java.lang.Integer r0 = X.C2286608xc.LJ(r4)     // Catch: java.lang.Throwable -> L8e
        L74:
            r5.LJIIJJI = r1     // Catch: java.lang.Throwable -> L8e
            r6.LIZ(r0, r2)     // Catch: java.lang.Throwable -> L8e
            kotlin.jvm.functions.Function1<X.0J0h, kotlin.Unit> r1 = r5.LJII     // Catch: java.lang.Throwable -> L8e
            X.0J0h r0 = X.EnumC485010J0h.SUCCESS     // Catch: java.lang.Throwable -> L8e
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L8e
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8e
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L8e
            goto L9a
        L86:
            r0 = r1
            goto L74
        L88:
            X.C1C7U.LIZIZ(r10)
            return r9
        L8c:
            r1 = move-exception
            goto L8f
        L8e:
            r1 = move-exception
        L8f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L9a:
            X.0J0e r4 = r11.LLILZLL
            X.0J0l<java.lang.Integer> r3 = r11.LLIZ
            X.0IdC<java.lang.Integer, java.lang.Object> r2 = r11.LLIZLLLIL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto Lb6
            kotlin.jvm.functions.Function1<X.0J0h, kotlin.Unit> r1 = r4.LJII
            X.0J0h r0 = X.EnumC485010J0h.FAILED
            r1.invoke(r0)
            kotlin.jvm.internal.AwS251S0300000_7 r1 = new kotlin.jvm.internal.AwS251S0300000_7
            r0 = 19
            r1.<init>(r4, r3, r2, r0)
            r4.LJIIJJI = r1
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C485000J0g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
