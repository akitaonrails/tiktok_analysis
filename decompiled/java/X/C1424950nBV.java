package X;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nBV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemv.TemplateItemAdapter$onBindViewHolder$4$1$1", f = "TemplateItemAdapter.kt", l = {}, m = "invokeSuspend")
public final class C1424950nBV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1424920nBS LL;
    public final /* synthetic */ C1419590n2r LLILLJJLI;
    public final /* synthetic */ RecyclerView.ViewHolder LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Bitmap LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424950nBV(C1424920nBS c1424920nBS, C1419590n2r c1419590n2r, RecyclerView.ViewHolder viewHolder, int i, Bitmap bitmap, InterfaceC1364105Vn<? super C1424950nBV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1424920nBS;
        this.LLILLJJLI = c1419590n2r;
        this.LLILLL = viewHolder;
        this.LLILZ = i;
        this.LLILZIL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1424950nBV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateItemAdapter@7302.onBindViewHolder$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1424890nBP interfaceC1424890nBP = this.LL.LLILZLL;
        C1419590n2r c1419590n2r = this.LLILLJJLI;
        C1425080nBi c1425080nBi = (C1425080nBi) this.LLILLL;
        interfaceC1424890nBP.LJI(c1419590n2r, c1425080nBi.LLILZIL, this.LLILZ, c1425080nBi.R5(), this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateItemAdapter@7302.onBindViewHolder$4$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
