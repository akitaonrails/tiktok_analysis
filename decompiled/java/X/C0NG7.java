package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NG7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$getAllCacheIds$1", f = "GoldenHouse.kt", l = {820}, m = "invokeSuspend")
public final class C0NG7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C0NH6 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NG7(C0NH6 c0nh6, InterfaceC1364105Vn<? super C0NG7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nh6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NG7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String groupId;
        C1C7U.LIZ("GoldenHouse@3441.getAllCacheIds$1");
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
            C0NGO c0ngo = this.LLILLJJLI.LIZJ;
            this.LL = 1;
            obj = C13LP.LLIIII(c0ngo.LIZLLL.get().LIZIZ);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GoldenHouse@3441.getAllCacheIds$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            String aid = null;
            if (!it2.hasNext()) {
                break;
            }
            Aweme aweme = ((CacheEntry) it2.next()).value;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            arrayList.add(aid);
        }
        List listLJJJJLI = C13LP.LJJJJLI(arrayList);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Aweme aweme2 = ((CacheEntry) it3.next()).value;
            if (aweme2 != null) {
                groupId = aweme2.getGroupId();
            } else {
                groupId = null;
            }
            arrayList2.add(groupId);
        }
        List listLJJJJLI2 = C13LP.LJJJJLI(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(listLJJJJLI);
        arrayList3.addAll(listLJJJJLI2);
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
        C1C7U.LIZIZ("GoldenHouse@3441.getAllCacheIds$1");
        return strLJJLIIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
