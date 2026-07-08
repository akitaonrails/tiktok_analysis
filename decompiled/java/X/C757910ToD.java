package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ToD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage.ScrollHandleConfiguration$queryThumbnails$2", f = "ScrollHandleConfiguration.kt", l = {}, m = "invokeSuspend")
public final class C757910ToD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1836150xsj LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757910ToD(C1836150xsj c1836150xsj, int i, int i2, InterfaceC1364105Vn<? super C757910ToD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1836150xsj;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C757910ToD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScrollHandleConfiguration@13e2.queryThumbnails$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int size = this.LL.LJIL.LIZIZ.size();
        if (size <= 0) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ScrollHandleConfiguration@13e2.queryThumbnails$2");
            return unit;
        }
        int iLJ = C13LZ.LJ(this.LLILLJJLI, 0, size - 1);
        String strValueOf = String.valueOf(this.LLILLL);
        if (!Intrinsics.LJFF(ListProtector.get(this.LL.LJIL.LIZIZ, iLJ), strValueOf)) {
            ListProtector.set(this.LL.LJIL.LIZIZ, iLJ, strValueOf);
            RecyclerView recyclerView = this.LL.LJJII;
            if (recyclerView == null) {
                recyclerView = null;
            }
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(iLJ);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ScrollHandleConfiguration@13e2.queryThumbnails$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
