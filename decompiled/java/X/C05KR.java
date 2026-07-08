package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05KR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$getAllAids$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C05KR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public final /* synthetic */ C1338705Lt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05KR(C1338705Lt c1338705Lt, InterfaceC1364105Vn<? super C05KR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1338705Lt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.getAllAids$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJIIJJI = C1338705Lt.LJIIJJI(this.LL.LJIILIIL());
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.getAllAids$2");
        return listLJIIJJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
