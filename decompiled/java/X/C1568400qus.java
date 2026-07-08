package X;

import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreMainTopicChunkProcessRequest$observeState$2$2", f = "ExploreMainTopicChunkProcessRequest.kt", l = {154, 158, 162, 171, 175, 183}, m = "invokeSuspend")
public final class C1568400qus extends C09AX implements Function2<ExploreAwemeList, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<ExploreAwemeList, Unit> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568400qus(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1568400qus c1568400qus = new C1568400qus(interfaceC1364105Vn, this.LLILLL, this.LLILZ);
        c1568400qus.LLILLJJLI = obj;
        return c1568400qus;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1568400qus.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ExploreAwemeList exploreAwemeList, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(exploreAwemeList, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
