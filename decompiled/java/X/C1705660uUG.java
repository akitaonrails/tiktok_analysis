package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.batch.BoardBatchRenderCoordinator$awaitInOrder$2$1", f = "BoardBatchRenderCoordinator.kt", l = {51}, m = "invokeSuspend")
public final class C1705660uUG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C07XT>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C1705720uUM> LLILLL;
    public final /* synthetic */ C1705700uUK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705660uUG(List<C1705720uUM> list, C1705700uUK c1705700uUK, InterfaceC1364105Vn<? super C1705660uUG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1705700uUK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1705660uUG c1705660uUG = new C1705660uUG(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1705660uUG.LLILLJJLI = obj;
        return c1705660uUG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<C1705720uUM> list = this.LLILLL;
            C1705700uUK c1705700uUK = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1705720uUM> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1705670uUH(it2.next(), c1705700uUK, null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C07XT>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
