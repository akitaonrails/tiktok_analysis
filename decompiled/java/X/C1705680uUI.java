package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uUI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.batch.BoardBatchRenderCoordinator$awaitInOrder$2", f = "BoardBatchRenderCoordinator.kt", l = {35}, m = "invokeSuspend")
public final class C1705680uUI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C07XT>>, Object> {
    public int LL;
    public final /* synthetic */ List<C1705720uUM> LLILLJJLI;
    public final /* synthetic */ C1705700uUK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705680uUI(List<C1705720uUM> list, C1705700uUK c1705700uUK, InterfaceC1364105Vn<? super C1705680uUI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1705700uUK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705680uUI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1705660uUG c1705660uUG = new C1705660uUG(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C2296908zH.LIZIZ(c1705660uUG, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C07XT>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
