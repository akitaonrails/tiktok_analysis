package X;

import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel$loadMore$1", f = "AIPortraitTabViewModel.kt", l = {450}, m = "invokeSuspend")
public final class C316330Cad extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AIPortraitTabViewModel LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316330Cad(AIPortraitTabViewModel aIPortraitTabViewModel, int i, InterfaceC1364105Vn<? super C316330Cad> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIPortraitTabViewModel;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316330Cad(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        boolean zBooleanValue;
        Boolean bool;
        C1C7U.LIZ("AIPortraitTabViewModel@fa0d.loadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                list = (List) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            list = ((C569820MWm) this.LLILLL.LLJIJIL.getValue()).LIZIZ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            C1687000u0A c1687000u0A = this.LLILLL.LL;
            int i2 = this.LLILZ;
            this.LL = list;
            this.LLILLJJLI = 1;
            obj = c1687000u0A.LIZLLL(i2, 20, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.loadMore$1");
                return objLJFF;
            }
        }
        PortraitStylesResponse portraitStylesResponse = (PortraitStylesResponse) obj;
        HashSet hashSet = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((PortraitStyleItem) it2.next()).styleId;
            if (str != null) {
                hashSet.add(str);
            }
        }
        Integer num = null;
        if (portraitStylesResponse == null || (list2 = portraitStylesResponse.styles) == null) {
            list2 = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = list2.iterator();
        while (true) {
            zBooleanValue = false;
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            String str2 = ((PortraitStyleItem) next).styleId;
            if (str2 == null || hashSet.add(str2)) {
                arrayList.add(next);
            }
        }
        AIPortraitTabViewModel aIPortraitTabViewModel = this.LLILLL;
        C2252321DDq c2252321DDq = aIPortraitTabViewModel.LLJI;
        C569820MWm c569820MWm = (C569820MWm) aIPortraitTabViewModel.LLJIJIL.getValue();
        List listLJLIL = C13LP.LJLIL(arrayList, list);
        if (portraitStylesResponse != null && (bool = portraitStylesResponse.hasMore) != null) {
            zBooleanValue = bool.booleanValue();
        }
        if (portraitStylesResponse != null) {
            num = portraitStylesResponse.cursor;
        }
        c2252321DDq.setValue(C569820MWm.LIZ(c569820MWm, null, listLJLIL, false, zBooleanValue, num, 141));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.loadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
