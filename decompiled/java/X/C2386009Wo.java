package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09Wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.sharedar.viewmodel.SessionShareViewModel$searchFriends$1", f = "SessionShareViewModel.kt", l = {132}, m = "invokeSuspend")
public final class C2386009Wo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2385709Wl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2386009Wo(C2385709Wl c2385709Wl, String str, boolean z, InterfaceC1364105Vn<? super C2386009Wo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2385709Wl;
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2386009Wo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        Object objLJI = obj;
        C1C7U.LIZ("SessionShareViewModel@57ac.searchFriends$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C2385709Wl c2385709Wl = this.LLILLJJLI;
            String str = this.LLILLL;
            long j = c2385709Wl.LJII;
            this.LL = 1;
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C2386109Wp(c2385709Wl, 50L, j, str, "at_user", null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("SessionShareViewModel@57ac.searchFriends$1");
                return objLJFF;
            }
        }
        SummonFriendList summonFriendList = (SummonFriendList) objLJI;
        if (!Intrinsics.LJFF(summonFriendList.keyword, this.LLILLJJLI.LIZLLL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SessionShareViewModel@57ac.searchFriends$1");
            return unit;
        }
        C2385709Wl c2385709Wl2 = this.LLILLJJLI;
        c2385709Wl2.LJI = summonFriendList.hasMore;
        c2385709Wl2.LJII = summonFriendList.cursor;
        MutableLiveData<List<C2386409Ws>> mutableLiveData = c2385709Wl2.LIZJ;
        if (this.LLILZ) {
            arrayList = new ArrayList();
            Collection value = this.LLILLJJLI.LIZJ.getValue();
            if (value == null) {
                value = C13BV.INSTANCE;
            }
            arrayList.addAll(value);
            List<SummonFriendItem> list = summonFriendList.items;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<SummonFriendItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C2386409Ws(it2.next().mUser));
            }
            arrayList.addAll(arrayList2);
        } else {
            List<SummonFriendItem> list2 = summonFriendList.items;
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<SummonFriendItem> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C2386409Ws(it3.next().mUser));
            }
        }
        mutableLiveData.setValue(arrayList);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SessionShareViewModel@57ac.searchFriends$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
