package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EDH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.components.base.resourceview.ResourceListView$fetchResourceList$1$onSuccess$1$2$1", f = "ResourceListView.kt", l = {}, m = "invokeSuspend")
public final class C0EDH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<ResourceItem> LL;
    public final /* synthetic */ C0EDF LLILLJJLI;
    public final /* synthetic */ C0ED8 LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0EDH(List<? extends ResourceItem> list, C0EDF c0edf, C0ED8 c0ed8, boolean z, InterfaceC1364105Vn<? super C0EDH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c0edf;
        this.LLILLL = c0ed8;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EDH(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean zValueOf;
        C1C7U.LIZ("ResourceListView@eb87.fetchResourceList$1$onSuccess$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<ResourceItem> list = this.LL;
        C0EDF c0edf = this.LLILLJJLI;
        C0ED8 c0ed8 = this.LLILLL;
        for (ResourceItem resourceItem : list) {
            if (c0edf.LLJJ != null && (str = c0ed8.LIZJ) != null && str.length() != 0) {
                InterfaceC361290EEl interfaceC361290EEl = c0edf.LLJJ;
                if (interfaceC361290EEl != null) {
                    zValueOf = Boolean.valueOf(interfaceC361290EEl.Ar1(c0ed8.LIZJ, Collections.singletonList(resourceItem.getResourceId())));
                } else {
                    zValueOf = false;
                }
                resourceItem.setFavorite(zValueOf);
            }
        }
        List<ResourceItem> list2 = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<ResourceItem> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0EDQ(it2.next(), 62));
        }
        C0EDF c0edf2 = this.LLILLJJLI;
        c0edf2.LJ();
        c0edf2.setupList(arrayList);
        C0EDS c0eds = this.LLILLJJLI.LLJ;
        if (c0eds != null) {
            c0eds.LIZIZ(true, this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResourceListView@eb87.fetchResourceList$1$onSuccess$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
