package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.helper.FriendsTabEnterMobHelper$updatePostViewedStatus$1$1", f = "FriendsTabEnterMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C0O0Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O0R LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O0Q(C0O0R c0o0r, List<String> list, InterfaceC1364105Vn<? super C0O0Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o0r;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O0Q(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsTabEnterMobHelper@b27e.updatePostViewedStatus$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O0R c0o0r = this.LL;
        List<C0VNS> listLJI = C1593830rZt.LIZIZ.LJI();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
        Iterator<C0VNS> it2 = listLJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        c0o0r.getClass();
        boolean zContainsAll = C0O0R.LIZ(arrayList).containsAll(this.LLILLJJLI);
        C0O0R c0o0r2 = this.LL;
        int i = !zContainsAll ? 1 : 0;
        c0o0r2.getClass();
        C0O0R.LIZJ = i;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTabEnterMobHelper@b27e.updatePostViewedStatus$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
