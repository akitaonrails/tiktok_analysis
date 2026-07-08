package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i4N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.inviteguest.LiveInviteGuestContentTabDataSourceProtocol$realRefresh$1", f = "LiveInviteGuestContentTabDataSourceProtocol.kt", l = {112}, m = "invokeSuspend")
public final class C1228330i4N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AbstractC1223800hx4>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1228370i4R LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228330i4N(C1228370i4R c1228370i4R, InterfaceC1364105Vn<? super C1228330i4N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1228370i4R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1228330i4N c1228330i4N = new C1228330i4N(this.LLILLL, interfaceC1364105Vn);
        c1228330i4N.LLILLJJLI = obj;
        return c1228330i4N;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.realRefresh$1");
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
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1228340i4O(this.LLILLL, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1228350i4P(this.LLILLL, null), 3)};
            this.LL = 1;
            obj = C1D9F.LIZIZ(anonymousClass0957Arr, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.realRefresh$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        List list2 = (List) ListProtector.get(list, 0);
        List list3 = (List) ListProtector.get(list, 1);
        C1228370i4R c1228370i4R = this.LLILLL;
        c1228370i4R.getClass();
        ArrayList arrayList = new ArrayList();
        if (!list2.isEmpty()) {
            arrayList.add(new C1223790hx3(c1228370i4R.LLILLL.LJFF, (C1223780hx2) null, 6));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(c1228370i4R.LJJJJIZL((IMUser) it2.next(), true));
            }
            arrayList.addAll(arrayList2);
        }
        if (!list3.isEmpty()) {
            arrayList.add(new C1223790hx3(c1228370i4R.LLILLL.LJI, (C1223780hx2) null, 6));
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(c1228370i4R.LJJJJIZL((IMUser) it3.next(), false));
            }
            arrayList.addAll(arrayList3);
        }
        c1228370i4R.LLILZIL = arrayList;
        C1C7U.LIZIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.realRefresh$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AbstractC1223800hx4>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
