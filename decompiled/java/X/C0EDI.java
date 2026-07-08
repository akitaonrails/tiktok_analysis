package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EDI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.components.base.resourceview.ResourceListView$fetchResourceList$1$onSuccess$1$2", f = "ResourceListView.kt", l = {350}, m = "invokeSuspend")
public final class C0EDI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0EDF LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ List<ResourceItem> LLILZIL;
    public final /* synthetic */ C0ED8 LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0EDI(C0EDF c0edf, long j, boolean z, List<? extends ResourceItem> list, C0ED8 c0ed8, boolean z2, InterfaceC1364105Vn<? super C0EDI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0edf;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = list;
        this.LLILZLL = c0ed8;
        this.LLIZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EDI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<ResourceItem> listLIZJ;
        C1C7U.LIZ("ResourceListView@eb87.fetchResourceList$1$onSuccess$1$2");
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
            C0EDT c0edt = this.LLILLJJLI.LLJIJIL;
            if (c0edt != null) {
                c0edt.LIZIZ(true, System.currentTimeMillis() - this.LLILLL, this.LLILZ, null, null, false);
            }
            C0EDS c0eds = this.LLILLJJLI.LLJ;
            if (c0eds == null || (listLIZJ = c0eds.LIZJ(this.LLILZIL)) == null) {
                listLIZJ = this.LLILZIL;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0EDH c0edh = new C0EDH(listLIZJ, this.LLILLJJLI, this.LLILZLL, this.LLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0edh) == objLJFF) {
                C1C7U.LIZIZ("ResourceListView@eb87.fetchResourceList$1$onSuccess$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResourceListView@eb87.fetchResourceList$1$onSuccess$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
