package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.FollowRealTimeReadHelper$storeUnreadAids$1", f = "FollowRealTimeReadHelper.kt", l = {}, m = "invokeSuspend")
public final class C2350309Iv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<FollowFeed> LL;
    public final /* synthetic */ EnumC607570NsJ[] LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2350309Iv(List<? extends FollowFeed> list, EnumC607570NsJ[] enumC607570NsJArr, InterfaceC1364105Vn<? super C2350309Iv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = enumC607570NsJArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2350309Iv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        String aid;
        C1C7U.LIZ("FollowRealTimeReadHelper@467a.storeUnreadAids$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<FollowFeed> list = this.LL;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (FollowFeed followFeed : list) {
                if (followFeed != null && (aweme = followFeed.getAweme()) != null && (aid = aweme.getAid()) != null) {
                    arrayList.add(aid);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (TextUtils.isDigitsOnly((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            EnumC607570NsJ[] enumC607570NsJArr = this.LLILLJJLI;
            if (enumC607570NsJArr.length == 0) {
                C607520NsE.LIZ.getClass();
                Iterator it2 = C607520NsE.LIZIZ().entrySet().iterator();
                while (it2.hasNext()) {
                    ((Set) ((Map.Entry) it2.next()).getValue()).addAll(arrayList2);
                }
            } else {
                for (EnumC607570NsJ enumC607570NsJ : enumC607570NsJArr) {
                    C607520NsE.LIZ.getClass();
                    Set set = (Set) C607520NsE.LIZIZ().get(enumC607570NsJ);
                    if (set != null) {
                        Boolean.valueOf(set.addAll(arrayList2));
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowRealTimeReadHelper@467a.storeUnreadAids$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FollowRealTimeReadHelper@467a.storeUnreadAids$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
