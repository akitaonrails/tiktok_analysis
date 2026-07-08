package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerView$initRecommendCategoryListView$1$bindHeaderViewHolder$1$1", f = "InfoStickerView.kt", l = {1212}, m = "invokeSuspend")
public final class C433660GzU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecyclerView.ViewHolder LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433660GzU(RecyclerView.ViewHolder viewHolder, InterfaceC1364105Vn<? super C433660GzU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433660GzU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        List<C1635170seZ> listLIZIZ;
        C1C7U.LIZ("InfoStickerView@d31b.initRecommendCategoryListView$1$bindHeaderViewHolder$1$1");
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
            C1634780sdw c1634780sdw = C1634780sdw.LJII;
            if (c1634780sdw != null && (listLIZIZ = c1634780sdw.LIZIZ()) != null) {
                size = listLIZIZ.size();
            } else {
                size = 0;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C433650GzT c433650GzT = new C433650GzT(this.LLILLJJLI, size, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c433650GzT) == objLJFF) {
                C1C7U.LIZIZ("InfoStickerView@d31b.initRecommendCategoryListView$1$bindHeaderViewHolder$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerView@d31b.initRecommendCategoryListView$1$bindHeaderViewHolder$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
