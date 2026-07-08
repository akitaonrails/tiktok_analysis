package X;

import com.ss.android.ugc.aweme.ecommerce.image.resource.EcResourceItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0kbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.image.resource.ImagePreloaderImpl$preloadImages$2", f = "EcImagePreloader.kt", l = {77}, m = "invokeSuspend")
public final class C1325920kbm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<EcResourceItem> LLILLL;
    public final /* synthetic */ C1325890kbj LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325920kbm(List<EcResourceItem> list, C1325890kbj c1325890kbj, int i, InterfaceC1364105Vn<? super C1325920kbm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1325890kbj;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1325920kbm c1325920kbm = new C1325920kbm(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1325920kbm.LLILLJJLI = obj;
        return c1325920kbm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("ImagePreloaderImpl@3d3d.preloadImages$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<EcResourceItem> list = this.LLILLL;
            ArrayList<Pair> arrayList = new ArrayList();
            for (EcResourceItem ecResourceItem : list) {
                String str = ecResourceItem.url;
                if (str != null && (!a0.LJJJIL(str))) {
                    arrayList.add(new Pair(str, ecResourceItem.ecBizScene));
                }
            }
            this.LLILZ.LIZ.LJ();
            C1DEU c1deuLIZ = C2252461DEe.LIZ(this.LLILZIL);
            C1325890kbj c1325890kbj = this.LLILZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (Pair pair : arrayList) {
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1325940kbo(c1deuLIZ, c1325890kbj, (String) pair.getFirst(), (String) pair.getSecond(), null), 3));
                z = true;
            }
            this.LL = z ? 1 : 0;
            objLIZ = C1D9F.LIZ(arrayList2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("ImagePreloaderImpl@3d3d.preloadImages$2");
                return objLJFF;
            }
        }
        List list2 = (List) objLIZ;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((Boolean) it2.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("ImagePreloaderImpl@3d3d.preloadImages$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
