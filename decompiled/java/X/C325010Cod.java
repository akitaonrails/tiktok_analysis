package X;

import com.ss.android.ugc.aweme.tako.network.TakoRecoveryContext;
import com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.network.RecoveryRegistry$dispatch$3", f = "RecoveryRegistry.kt", l = {56}, m = "invokeSuspend")
public final class C325010Cod extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C325020Coe LL;
    public TakoRecoveryContext LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ List<TakoRecoveryTask> LLILZLL;
    public final /* synthetic */ C325020Coe LLIZ;
    public final /* synthetic */ TakoRecoveryContext LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C325010Cod(List<? extends TakoRecoveryTask> list, C325020Coe c325020Coe, TakoRecoveryContext takoRecoveryContext, InterfaceC1364105Vn<? super C325010Cod> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = c325020Coe;
        this.LLIZLLLIL = takoRecoveryContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C325010Cod c325010Cod = new C325010Cod(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c325010Cod.LLILZIL = obj;
        return c325010Cod;
    }

    /* JADX WARN: Path cross not found for [B:24:0x0061, B:29:0x0070], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:13:0x0038, B:15:0x003e, B:17:0x004a, B:19:0x0053, B:21:0x0059, B:22:0x005d, B:24:0x0061, B:26:0x0069), top: B:55:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[LOOP:0: B:55:0x0038->B:32:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0086 -> B:59:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:48:0x00b4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "RecoveryRegistry@8396.dispatch$3"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L29
            if (r0 != r7) goto L21
            java.lang.Object r6 = r11.LLILLL
            java.util.Iterator r6 = (java.util.Iterator) r6
            com.ss.android.ugc.aweme.tako.network.TakoRecoveryContext r2 = r11.LLILLJJLI
            X.0Coe r5 = r11.LL
            java.lang.Object r4 = r11.LLILZIL
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L1f
            goto L89
        L1f:
            r1 = move-exception
            goto L90
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L29:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r4 = r11.LLILZIL
            java.util.List<com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask> r0 = r11.LLILZLL     // Catch: java.lang.Throwable -> Laf
            X.0Coe r5 = r11.LLIZ     // Catch: java.lang.Throwable -> Laf
            com.ss.android.ugc.aweme.tako.network.TakoRecoveryContext r2 = r11.LLIZLLLIL     // Catch: java.lang.Throwable -> Laf
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> Laf
        L38:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto La0
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> Lad
            com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask r9 = (com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask) r9     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r9.onlyWhenVisible()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L78
            r5.getClass()     // Catch: java.lang.Throwable -> Lad
            X.0mCc r0 = X.C1906580ziK.LJ()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L76
            android.app.Activity r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L76
            android.app.Activity r1 = X.C1388190mED.LIZ(r0)     // Catch: java.lang.Throwable -> Lad
        L5d:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.tako.ui.TakoChatActivity     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.tako.ui.TakoChatActivity r1 = (com.ss.android.ugc.aweme.tako.ui.TakoChatActivity) r1     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r1.isFinishing()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L70
            boolean r0 = r1.isDestroyed()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L70
            goto L72
        L70:
            r0 = 0
            goto L73
        L72:
            r0 = 1
        L73:
            if (r0 != 0) goto L78
            goto L38
        L76:
            r1 = 0
            goto L5d
        L78:
            r11.LLILZIL = r4     // Catch: java.lang.Throwable -> L8f
            r11.LL = r5     // Catch: java.lang.Throwable -> L8f
            r11.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L8f
            r11.LLILLL = r6     // Catch: java.lang.Throwable -> L8f
            r11.LLILZ = r7     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r9.onNetworkRecovered(r2, r11)     // Catch: java.lang.Throwable -> L8f
            if (r0 != r8) goto L89
            goto L9c
        L89:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8f
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L8f
            goto L38
        L8f:
            r1 = move-exception
        L90:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> Lb4
            X.00Yq r0 = new X.00Yq     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> Lb4
            goto L38
        L9c:
            X.C1C7U.LIZIZ(r10)
            return r8
        La0:
            X.0Coe r0 = r11.LLIZ
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZJ
            r0.set(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        Lad:
            r1 = move-exception
            goto Lb0
        Laf:
            r1 = move-exception
        Lb0:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> Lb4
            goto Lb6
        Lb4:
            r1 = move-exception
            goto Lb0
        Lb6:
            X.0Coe r0 = r11.LLIZ
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LIZJ
            r0.set(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C325010Cod.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
