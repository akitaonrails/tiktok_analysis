package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCachePool$onAllCacheLoadDone$1", f = "GHouseCachePool.kt", l = {90}, m = "invokeSuspend")
public final class C0NGT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NGO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NGT(C0NGO c0ngo, InterfaceC1364105Vn<? super C0NGT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ngo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:(1:5)(2:63|64))(12:28|(1:30)(1:36)|(2:32|(2:34|35))|9|(2:12|10)|67|37|65|38|(5:40|(4:42|(4:44|(1:46)(1:47)|(2:52|69)(1:71)|53)|68|54)|55|58|(1:60))|61|62)|6|(1:(5:13|(2:18|14)|76|19|(2:20|(3:78|22|73)(2:25|(3:79|27|74)(1:80)))))|8|9|(1:10)|67|37|65|38|(0)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0114, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r3 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[LOOP:0: B:10:0x0053->B:12:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3 A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:38:0x00db, B:40:0x00e3, B:42:0x00f0, B:44:0x00f3, B:46:0x00f7, B:49:0x00ff, B:53:0x010a, B:52:0x0107, B:54:0x010d, B:55:0x010f), top: B:65:0x00db }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NGT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
