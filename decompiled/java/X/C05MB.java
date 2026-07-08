package X;

import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter$2", f = "SocialThoughtDataCenter.kt", l = {163, 165}, m = "invokeSuspend")
public final class C05MB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SocialThoughtDataCenter LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MB(SocialThoughtDataCenter socialThoughtDataCenter, InterfaceC1364105Vn<? super C05MB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = socialThoughtDataCenter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05MB c05mb = new C05MB(this.LLILZ, interfaceC1364105Vn);
        c05mb.LLILLL = obj;
        return c05mb;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0079
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "SocialThoughtDataCenter@2a15.<init>$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 == r4) goto L4f
            if (r0 != r5) goto L1b
            X.0WWy r3 = r8.LL
            java.lang.Object r2 = r8.LLILLL
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L33
            goto L73
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L23:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r2 = r8.LLILLL
            X.1DEK r0 = com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter.LJIIIZ
            r0.getClass()
            X.1DEL r3 = new X.1DEL
            r3.<init>(r0)
            goto L3f
        L33:
            r0 = move-exception
        L34:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L3f:
            r8.LLILLL = r2
            r8.LL = r3
            r8.LLILLJJLI = r4
            java.lang.Object r9 = r3.LIZ(r8)
            if (r9 != r6) goto L56
            X.C1C7U.LIZIZ(r7)
            return r6
        L4f:
            X.0WWy r3 = r8.LL
            java.lang.Object r2 = r8.LLILLL
            X.C155000ia.LIZIZ(r9)
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L81
            java.lang.Object r1 = r3.next()
            X.05Gw r1 = (X.C1326005Gw) r1
            com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter r0 = r8.LLILZ
            r8.LLILLL = r2     // Catch: java.lang.Throwable -> L7b
            r8.LL = r3     // Catch: java.lang.Throwable -> L7b
            r8.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.LJIILJJIL(r1, r8)     // Catch: java.lang.Throwable -> L7b
            if (r0 != r6) goto L73
            goto L7d
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L79
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L79
            goto L3f
        L79:
            r0 = move-exception
            goto L34
        L7b:
            r0 = move-exception
            goto L34
        L7d:
            X.C1C7U.LIZIZ(r7)
            return r6
        L81:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05MB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
