package X;

import Y.AComparatorS21S0000000_2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$loadPendingInteractions$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C1338905Lv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C05M1>>, Object> {
    public final /* synthetic */ C1338705Lt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338905Lv(C1338705Lt c1338705Lt, InterfaceC1364105Vn<? super C1338905Lv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1338705Lt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1338905Lv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.loadPendingInteractions$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS21S0000000_2(16), this.LL.LJIIJ().values());
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.loadPendingInteractions$2");
        return listLJLLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C05M1>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
