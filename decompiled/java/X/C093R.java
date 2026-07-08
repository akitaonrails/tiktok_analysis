package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentImpl$prefetchEffectsInternal$1", f = "EffectPrefetcherComponent.kt", l = {298}, m = "invokeSuspend")
public final class C093R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public C093Q LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C093Q LLILZIL;
    public final /* synthetic */ List<Effect> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C093R(C093Q c093q, List<? extends Effect> list, InterfaceC1364105Vn<? super C093R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c093q;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C093R(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "EffectPrefetcherComponentImpl@551d.prefetchEffectsInternal$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L25
            if (r0 != r6) goto L1d
            java.lang.Object r1 = r11.LLILLL
            java.util.List r1 = (java.util.List) r1
            X.093Q r8 = r11.LLILLJJLI
            X.01eN r4 = r11.LL
            X.C155000ia.LIZIZ(r12)
            goto L40
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L25:
            X.C155000ia.LIZIZ(r12)
            X.093Q r8 = r11.LLILZIL
            X.01eN r4 = r8.LLILZIL
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r11.LLILZLL
            r11.LL = r4
            r11.LLILLJJLI = r8
            r11.LLILLL = r1
            r11.LLILZ = r6
            java.lang.Object r0 = r4.LIZLLL(r5, r11)
            if (r0 != r2) goto L40
            X.C1C7U.LIZIZ(r10)
            return r2
        L40:
            boolean r0 = r8.X1()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L50
            java.util.TreeSet<X.093T> r0 = r8.LLIZLLLIL     // Catch: java.lang.Throwable -> La6
            r0.clear()     // Catch: java.lang.Throwable -> La6
            java.util.Set<java.lang.String> r0 = r8.LLIZ     // Catch: java.lang.Throwable -> La6
            r0.clear()     // Catch: java.lang.Throwable -> La6
        L50:
            java.util.Iterator r9 = r1.iterator()     // Catch: java.lang.Throwable -> La6
        L54:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L7b
            java.lang.Object r7 = r9.next()     // Catch: java.lang.Throwable -> La6
            com.ss.android.ugc.effectmanager.effect.model.Effect r7 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r7     // Catch: java.lang.Throwable -> La6
            java.util.Set<java.lang.String> r1 = r8.LLIZ     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r7.getEffectId()     // Catch: java.lang.Throwable -> La6
            boolean r0 = r1.add(r0)     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L54
            java.util.TreeSet<X.093T> r3 = r8.LLIZLLLIL     // Catch: java.lang.Throwable -> La6
            X.093T r2 = new X.093T     // Catch: java.lang.Throwable -> La6
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La6
            r2.<init>(r7, r0)     // Catch: java.lang.Throwable -> La6
            r3.add(r2)     // Catch: java.lang.Throwable -> La6
            goto L54
        L7b:
            java.util.TreeSet<X.093T> r0 = r8.LLIZLLLIL     // Catch: java.lang.Throwable -> La6
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La6
            r0 = r0 ^ 1
            if (r0 == 0) goto L91
            X.09AE r0 = r8.LLILZLL     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto L93
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> La6
            if (r0 != r6) goto L93
            r0 = 1
            goto L94
        L91:
            r6 = 0
            goto L96
        L93:
            r0 = 0
        L94:
            if (r0 != 0) goto L91
        L96:
            r4.LIZIZ(r5)
            if (r6 == 0) goto La0
            X.093Q r0 = r11.LLILZIL
            r0.w2()
        La0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        La6:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La6
            r4.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C093R.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
