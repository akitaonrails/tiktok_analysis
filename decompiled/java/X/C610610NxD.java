package X;

import com.ss.android.ugc.aweme.dc.core.PORef;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dc.core.LayeredDiskCache$openPagedRead$2$readChunk$result$1$2", f = "LayeredDiskCache.kt", l = {330}, m = "invokeSuspend")
public final class C610610NxD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LinkedHashMap<InterfaceC610630NxF<?>, List<PORef>> LLILLL;
    public final /* synthetic */ HashMap<String, C610660NxI<? extends Object>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610610NxD(LinkedHashMap<InterfaceC610630NxF<?>, List<PORef>> linkedHashMap, HashMap<String, C610660NxI<? extends Object>> map, InterfaceC1364105Vn<? super C610610NxD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = linkedHashMap;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C610610NxD c610610NxD = new C610610NxD(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c610610NxD.LLILLJJLI = obj;
        return c610610NxD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LayeredDiskCache@f330.openPagedRead$2$readChunk$result$1$2");
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
            Set<Map.Entry<InterfaceC610630NxF<?>, List<PORef>>> setEntrySet = this.LLILLL.entrySet();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C610620NxE((InterfaceC610630NxF) entry.getKey(), (List) entry.getValue(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LayeredDiskCache@f330.openPagedRead$2$readChunk$result$1$2");
                return objLJFF;
            }
        }
        for (List<C610660NxI<? extends Object>> list : (List) obj) {
            if (list != null) {
                HashMap<String, C610660NxI<? extends Object>> map = this.LLILZ;
                for (C610660NxI<? extends Object> c610660NxI : list) {
                    PORef pORef = c610660NxI.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(pORef.type);
                    sbLIZ.append('-');
                    sbLIZ.append(pORef.id);
                    map.put(C2188811AlT.LIZIZ(sbLIZ), c610660NxI);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LayeredDiskCache@f330.openPagedRead$2$readChunk$result$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
