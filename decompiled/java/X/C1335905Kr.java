package X;

import android.util.Log;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mixsearch.MixSearchServiceImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mixsearch.MixSearchServiceImpl$updateMutualFriendAndAffinityMap$1$1", f = "MixSearchServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1335905Kr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ MixSearchServiceImpl LL;
    public final /* synthetic */ List<IMUser> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1335905Kr(MixSearchServiceImpl mixSearchServiceImpl, List<? extends IMUser> list, InterfaceC1364105Vn<? super C1335905Kr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mixSearchServiceImpl;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1335905Kr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<IMUser> list = this.LL.LIZ;
        List<IMUser> list2 = this.LLILLJJLI;
        ArrayList arrayList = (ArrayList) list;
        arrayList.clear();
        arrayList.addAll(list2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((BaseContact) obj2).getUid())) {
                arrayList2.add(obj2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("local friend list(");
        sbLIZ.append(((ArrayList) this.LL.LIZ).size());
        sbLIZ.append(')');
        Integer numLJ = C2286608xc.LJ(Log.i("MixSearchServiceImpl", C2188811AlT.LIZIZ(sbLIZ)));
        C1C7U.LIZIZ("MixSearchServiceImpl@ff6.updateMutualFriendAndAffinityMap$1$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
