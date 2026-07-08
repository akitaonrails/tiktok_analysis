package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Xzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupSearchContentUpdateEngine$fullUpdate$overallCost$1$1", f = "GroupSearchContentUpdateEngine.kt", l = {}, m = "invokeSuspend")
public final class C866980Xzk extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends C0Y8T>>, Object> {
    public final /* synthetic */ C907490Zit LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C866980Xzk(C907490Zit c907490Zit, InterfaceC1364105Vn<? super C866980Xzk> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c907490Zit;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C866980Xzk(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("GroupSearchContentUpdateEngine@13e9.fullUpdate$overallCost$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y6Q<C867240Y0k> c0y6qLJIIJJI = this.LL.LJI.LJIIJJI(C869770YAd.LIZ(new C869690Y9v(null, null, null, C0YBC.LIZ(), new C0YAN(C0Y98.NOT_DELETED), null, 831), 0, 0L, false, 62));
        if (c0y6qLJIIJJI.LIZIZ == null) {
            obj2 = c0y6qLJIIJJI.LIZ.LIZIZ;
        } else {
            obj2 = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9.fullUpdate$overallCost$1$1");
        return obj2;
    }
}
