package X;

import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZ4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.util.MentionNetworkRequestHelperKt$getMentionCheckResponseWithCache$2$batchResponses$1$1", f = "MentionNetworkRequestHelper.kt", l = {394, 268}, m = "invokeSuspend")
public final class C0CZ4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MentionGeneralCheckResponse>, Object> {
    public InterfaceC1337805Lk LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ InterfaceC1337805Lk LLILZLL;
    public final /* synthetic */ List<String> LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZ4(InterfaceC1337805Lk interfaceC1337805Lk, List<String> list, long j, InterfaceC1364105Vn<? super C0CZ4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = interfaceC1337805Lk;
        this.LLIZ = list;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CZ4 c0cz4 = new C0CZ4(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0cz4.LLILZIL = obj;
        return c0cz4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x009a
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "MentionNetworkRequestHelperKt@c7aa.getMentionCheckResponseWithCache$2$batchResponses$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r7 = 2
            r2 = 1
            r6 = 0
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L21
            if (r0 != r7) goto L19
            java.lang.Object r5 = r10.LLILZIL
            X.05Lk r5 = (X.InterfaceC1337805Lk) r5
            goto L71
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L21:
            long r3 = r10.LLILLL
            java.lang.Object r1 = r10.LLILLJJLI
            X.05Lk r5 = r10.LL
            X.C155000ia.LIZIZ(r11)
            goto L4a
        L2b:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r0 = r10.LLILZIL
            X.05Lk r5 = r10.LLILZLL
            java.util.List<java.lang.String> r1 = r10.LLIZ
            long r3 = r10.LLIZLLLIL
            r10.LLILZIL = r0
            r10.LL = r5
            r10.LLILLJJLI = r1
            r10.LLILLL = r3
            r10.LLILZ = r2
            java.lang.Object r0 = r5.LIZ(r10)
            if (r0 != r8) goto L4a
            X.C1C7U.LIZIZ(r9)
            return r8
        L4a:
            X.0Cal r2 = X.C316410Cal.LIZ     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            java.lang.Long r0 = X.C2286608xc.LJFF(r3)     // Catch: java.lang.Throwable -> L7c
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            r10.LLILZIL = r5     // Catch: java.lang.Throwable -> L7c
            r10.LL = r6     // Catch: java.lang.Throwable -> L7c
            r10.LLILLJJLI = r6     // Catch: java.lang.Throwable -> L7c
            r10.LLILZ = r7     // Catch: java.lang.Throwable -> L7c
            r2.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r11 = X.C316410Cal.LIZ(r1, r0, r10)     // Catch: java.lang.Throwable -> L7c
            if (r11 != r8) goto L74
            X.C1C7U.LIZIZ(r9)
            return r8
        L71:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L7a
        L74:
            com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse r11 = (com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse) r11     // Catch: java.lang.Throwable -> L7a
            X.C189200o6.m2constructorimpl(r11)     // Catch: java.lang.Throwable -> L7a
            goto L88
        L7a:
            r0 = move-exception
            goto L7d
        L7c:
            r0 = move-exception
        L7d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9a
            X.00Yq r11 = new X.00Yq     // Catch: java.lang.Throwable -> L9a
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L9a
            X.C189200o6.m2constructorimpl(r11)     // Catch: java.lang.Throwable -> L9a
        L88:
            boolean r0 = X.C189200o6.m7isFailureimpl(r11)     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L8f
            r6 = r11
        L8f:
            com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse r6 = (com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse) r6     // Catch: java.lang.Throwable -> L98
            r5.release()
            X.C1C7U.LIZIZ(r9)
            return r6
        L98:
            r0 = move-exception
            goto L9b
        L9a:
            r0 = move-exception
        L9b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9a
            r5.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CZ4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MentionGeneralCheckResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
