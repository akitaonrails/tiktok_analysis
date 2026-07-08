package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotMonitor$addNewLifeCycleCallbacks$1", f = "ScreenShotMonitor.kt", l = {73}, m = "invokeSuspend")
public final class C593490NPn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2174091A6t LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593490NPn(C2174091A6t c2174091A6t, Context context, InterfaceC1364105Vn<? super C593490NPn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2174091A6t;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593490NPn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r2
      0x001c: PHI (r2v3 android.content.Context) = (r2v2 android.content.Context), (r2v1 android.content.Context) binds: [B:16:0x003b, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "ScreenShotMonitor@2fa1.addNewLifeCycleCallbacks$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L3e
            if (r0 != r1) goto L62
            X.C155000ia.LIZIZ(r8)
        L14:
            android.content.Context r2 = r7.LLILLL
            if (r2 == 0) goto L30
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L30
        L1c:
            android.app.Application r2 = (android.app.Application) r2
            if (r2 == 0) goto L2a
            X.1A6t r1 = r7.LLILLJJLI
            X.0NPm r0 = new X.0NPm
            r0.<init>()
            r2.registerActivityLifecycleCallbacks(r0)
        L2a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L30:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r2 = X.C844470XAv.LIZ()
            boolean r0 = r2 instanceof android.app.Application
            if (r0 == 0) goto L2a
            goto L1c
        L3e:
            X.C155000ia.LIZIZ(r8)
            android.app.Activity r0 = X.C2214201BlK.LJFF()
            X.1A6t r3 = r7.LLILLJJLI
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            r7.LL = r1
            r3.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.1A6r r0 = new X.1A6r
            r0.<init>(r2, r3, r4)
            java.lang.Object r0 = X.C23250099c.LJI(r7, r1, r0)
            if (r0 != r5) goto L14
            X.C1C7U.LIZIZ(r6)
            return r5
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C593490NPn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
