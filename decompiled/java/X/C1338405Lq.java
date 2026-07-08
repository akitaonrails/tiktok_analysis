package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.05Lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$deleteByAids$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C1338405Lq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ C1338705Lt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338405Lq(List<String> list, C1338705Lt c1338705Lt, InterfaceC1364105Vn<? super C1338405Lq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1338705Lt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1338405Lq(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.deleteByAids$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.deleteByAids$2");
            return unit;
        }
        Keva kevaLJIILIIL = this.LLILLJJLI.LJIILIIL();
        List<String> list = this.LL;
        C1338705Lt c1338705Lt = this.LLILLJJLI;
        for (String str : list) {
            c1338705Lt.getClass();
            kevaLJIILIIL.erase(C1338705Lt.LJIILJJIL(str));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("iq_");
            sbLIZ.append(str);
            sbLIZ.append(':');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Pair<String, ConcurrentHashMap<String, C05M1>> pair = c1338705Lt.LIZIZ.get();
            ConcurrentHashMap<String, C05M1> second = null;
            if (pair != null && Intrinsics.LJFF(pair.getFirst(), C1338705Lt.LJIIIZ())) {
                second = pair.getSecond();
            }
            Set<String> setKeySet = kevaLJIILIIL.getAll().keySet();
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj2 : setKeySet) {
                if (u.LJJIIJZLJL((String) obj2, strLIZIZ, false)) {
                    arrayList.add(obj2);
                }
            }
            for (String str2 : arrayList) {
                kevaLJIILIIL.erase(str2);
                String strLJJJJZ = a0.LJJJJZ("iq_", str2);
                if (second != null) {
                    second.remove(strLJJJJZ);
                }
                c1338705Lt.LIZLLL.remove(strLJJJJZ);
            }
        }
        this.LLILLJJLI.getClass();
        ArrayList arrayList2 = new ArrayList(C1338705Lt.LJIIJJI(kevaLJIILIIL));
        arrayList2.removeAll(C13LP.LLIIJI(this.LL));
        this.LLILLJJLI.getClass();
        kevaLJIILIIL.storeString("aid_index", GsonProtectorUtils.toJson(C1338705Lt.LJ, arrayList2));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.deleteByAids$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
