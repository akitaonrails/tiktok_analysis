package X;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nBU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemv.TemplateItemAdapter$onBindViewHolder$4$1", f = "TemplateItemAdapter.kt", l = {211}, m = "invokeSuspend")
public final class C1424940nBU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecyclerView.ViewHolder LLILLJJLI;
    public final /* synthetic */ C1424920nBS LLILLL;
    public final /* synthetic */ C1419590n2r LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424940nBU(RecyclerView.ViewHolder viewHolder, C1424920nBS c1424920nBS, C1419590n2r c1419590n2r, int i, InterfaceC1364105Vn<? super C1424940nBU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewHolder;
        this.LLILLL = c1424920nBS;
        this.LLILZ = c1419590n2r;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1424940nBU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DRG c1drg;
        InterfaceC1422770n7z interfaceC1422770n7z;
        Pair<Integer, Integer> pairIF2;
        InterfaceC1425150nBp interfaceC1425150nBpP5;
        C1C7U.LIZ("TemplateItemAdapter@7302.onBindViewHolder$4$1");
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
            C1425080nBi c1425080nBi = (C1425080nBi) this.LLILLJJLI;
            c1425080nBi.getClass();
            Bitmap bitmapLJIIJ = null;
            if (C299160Bo2.LIZ() && (c1drg = c1425080nBi.LLJJIII) != null && (interfaceC1422770n7z = (InterfaceC1422770n7z) c1drg.LJIIL(null, InterfaceC1422770n7z.class)) != null && (pairIF2 = interfaceC1422770n7z.IF2()) != null && (interfaceC1425150nBpP5 = c1425080nBi.P5()) != null) {
                bitmapLJIIJ = interfaceC1425150nBpP5.LJIIJ(c1425080nBi.LLIZ, pairIF2);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1424950nBV c1424950nBV = new C1424950nBV(this.LLILLL, this.LLILZ, this.LLILLJJLI, this.LLILZIL, bitmapLJIIJ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1424950nBV) == objLJFF) {
                C1C7U.LIZIZ("TemplateItemAdapter@7302.onBindViewHolder$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateItemAdapter@7302.onBindViewHolder$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
