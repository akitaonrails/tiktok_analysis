package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0gjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.map.landmark.LandMarkerRender$tryClusterLandMarks$1", f = "LandMarkerRender.kt", l = {114}, m = "invokeSuspend")
public final class C1177010gjb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C1176730gj9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177010gjb(float f, C1176730gj9 c1176730gj9, InterfaceC1364105Vn<? super C1177010gjb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = f;
        this.LLILLL = c1176730gj9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1177010gjb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        C1C7U.LIZ("LandMarkerRender@cdec.tryClusterLandMarks$1");
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
            InterfaceC1177070gjh interfaceC1177070gjhLIZJ = ((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LIZJ(this.LLILLJJLI);
            C1176730gj9 c1176730gj9 = this.LLILLL;
            List<Pair<PoiLandmark, InterfaceC1177040gje>> list = c1176730gj9.LJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Pair pair : (ArrayList) list) {
                InterfaceC1177040gje interfaceC1177040gje = (InterfaceC1177040gje) pair.getSecond();
                Iterator it2 = ((ArrayList) c1176730gj9.LJFF).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((PoiLandmark) it2.next()).getPoiId(), ((PoiLandmark) pair.getFirst()).getPoiId())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                arrayList.add(new C1177060gjg(interfaceC1177040gje, z2));
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C1177060gjg) ListProtector.get(arrayList, i2)).LIZIZ) {
                    C1177080gji c1177080gjiLIZ = interfaceC1177070gjhLIZJ.LIZ(((C1177060gjg) ListProtector.get(arrayList, i2)).LIZ.getPosition());
                    int size2 = arrayList.size();
                    for (int i3 = i2 + 1; i3 < size2; i3++) {
                        if (!((C1177060gjg) ListProtector.get(arrayList, i3)).LIZJ && ((C1177060gjg) ListProtector.get(arrayList, i3)).LIZIZ) {
                            C1177080gji c1177080gjiLIZ2 = interfaceC1177070gjhLIZJ.LIZ(((C1177060gjg) ListProtector.get(arrayList, i3)).LIZ.getPosition());
                            double d = c1177080gjiLIZ.LIZ - c1177080gjiLIZ2.LIZ;
                            double d2 = c1177080gjiLIZ.LIZIZ - c1177080gjiLIZ2.LIZIZ;
                            double d3 = (d * d) + (d2 * d2);
                            C1177060gjg c1177060gjg = (C1177060gjg) ListProtector.get(arrayList, i3);
                            int i4 = this.LLILLL.LIZLLL;
                            if (d3 >= i4 * i4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c1177060gjg.LIZIZ = z;
                        }
                    }
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1177020gjc c1177020gjc = new C1177020gjc(arrayList, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1177020gjc) == objLJFF) {
                C1C7U.LIZIZ("LandMarkerRender@cdec.tryClusterLandMarks$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LandMarkerRender@cdec.tryClusterLandMarks$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
