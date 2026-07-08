package X;

import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01oN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask$execute$2$1", f = "OpenLivePreparationTask.kt", l = {137}, m = "invokeSuspend")
public final class C445701oN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C445701oN(InterfaceC1364105Vn<? super C445701oN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C445701oN c445701oN = new C445701oN(interfaceC1364105Vn);
        c445701oN.LLILLJJLI = obj;
        return c445701oN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenLivePreparationTask@f498.execute$2$1");
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
            List<Function1<InterfaceC1364105Vn<? super Pair<String, String>>, Object>> list = OpenLivePreparationTask.LIZLLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZ, null, new C445801oO((Function1) it2.next(), null), 2));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OpenLivePreparationTask@f498.execute$2$1");
                return objLJFF;
            }
        }
        List listLJJJJLI = C13LP.LJJJJLI((Iterable) obj);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJJJJLI, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Pair pair : (ArrayList) listLJJJJLI) {
            Pair pair2 = new Pair(pair.getFirst(), pair.getSecond());
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        Map<String, String> map = OpenLivePreparationTask.LJ;
        ((LinkedHashMap) map).clear();
        map.putAll(linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OpenLivePreparationTask@f498.execute$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
