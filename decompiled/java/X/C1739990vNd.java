package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.prefetch.manager.NativePerfetchManager$startPrefetch$job$1$1", f = "NativePerfetchManager.kt", l = {}, m = "invokeSuspend")
public final class C1739990vNd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1739860vNQ LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<C1739860vNQ, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739990vNd(C1739860vNQ c1739860vNQ, String str, String str2, String str3, Map map, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1739860vNQ;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1739990vNd c1739990vNd = new C1739990vNd(this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLILLL, interfaceC1364105Vn, this.LLIZ);
        c1739990vNd.LL = obj;
        return c1739990vNd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029a  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.099V, java.lang.Throwable, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1739990vNd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
