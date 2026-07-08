package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0939, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentImplV2$startReceiver$1", f = "EffectPrefetcherComponentImplV2.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class AnonymousClass0939 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public final /* synthetic */ C093F LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0939(C093F c093f, InterfaceC1364105Vn<? super AnonymousClass0939> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c093f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0939(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:14:0x0034, B:16:0x003c), top: B:25:0x0034 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:25:0x0034). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "EffectPrefetcherComponentImplV2@7766.startReceiver$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L1e
            if (r0 != r5) goto L16
            X.0WWy r4 = r8.LL
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L5c
            goto L34
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r9)
            X.093F r0 = r8.LLILLL     // Catch: java.lang.Exception -> L5c
            X.095E<kotlin.Pair<com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Long>> r0 = r0.LLILZLL     // Catch: java.lang.Exception -> L5c
            X.0WWy r4 = r0.iterator()     // Catch: java.lang.Exception -> L5c
        L29:
            r8.LL = r4     // Catch: java.lang.Exception -> L5c
            r8.LLILLJJLI = r5     // Catch: java.lang.Exception -> L5c
            java.lang.Object r9 = r4.LIZ(r8)     // Catch: java.lang.Exception -> L5c
            if (r9 != r6) goto L34
            goto L58
        L34:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L5e
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Exception -> L5e
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: java.lang.Exception -> L5e
            java.lang.Object r3 = r0.getFirst()     // Catch: java.lang.Exception -> L5e
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r3     // Catch: java.lang.Exception -> L5e
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Exception -> L5e
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L5e
            long r1 = r0.longValue()     // Catch: java.lang.Exception -> L5e
            X.093F r0 = r8.LLILLL     // Catch: java.lang.Exception -> L5e
            r0.w2(r3, r1)     // Catch: java.lang.Exception -> L5e
            goto L29
        L58:
            X.C1C7U.LIZIZ(r7)
            return r6
        L5c:
            r3 = move-exception
            goto L5f
        L5e:
            r3 = move-exception
        L5f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0saD r2 = X.C1632470saD.LIZIZ
            java.lang.String r1 = "EffectPrefetcherComponentV2"
            java.lang.String r0 = "Receiver coroutine exception"
            X.C201955140j.LJIIIZ(r2, r1, r0, r3)
        L6b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0939.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
