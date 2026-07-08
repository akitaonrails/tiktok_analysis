package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerView$initRecommendCategoryListView$1$bindHeaderViewHolder$1$1$1", f = "InfoStickerView.kt", l = {}, m = "invokeSuspend")
public final class C433650GzT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RecyclerView.ViewHolder LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433650GzT(RecyclerView.ViewHolder viewHolder, int i, InterfaceC1364105Vn<? super C433650GzT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewHolder;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433650GzT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("InfoStickerView@d31b.initRecommendCategoryListView$1$bindHeaderViewHolder$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TuxTextView tuxTextView = ((C1640690snT) this.LL).LLILLJJLI;
        if (tuxTextView != null) {
            if (this.LLILLJJLI > 3) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InfoStickerView@d31b.initRecommendCategoryListView$1$bindHeaderViewHolder$1$1$1");
        return unit;
    }
}
