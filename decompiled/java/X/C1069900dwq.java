package X;

import com.ss.android.ugc.aweme.relation.ffp.FfpSearchApiImpl;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendListVM;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendListVM$searchFromApi$1", f = "SearchFriendListVM.kt", l = {56}, m = "invokeSuspend")
public final class C1069900dwq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchFriendListVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069900dwq(SearchFriendListVM searchFriendListVM, String str, InterfaceC1364105Vn<? super C1069900dwq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchFriendListVM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1069900dwq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("SearchFriendListVM@ca8b.searchFromApi$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            SearchFriendListVM searchFriendListVM = this.LLILLJJLI;
            FfpSearchApiImpl ffpSearchApiImpl = searchFriendListVM.LL;
            String str = this.LLILLL;
            Map<String, String> map = searchFriendListVM.LLILLL;
            this.LL = 1;
            objLIZ = ffpSearchApiImpl.LIZ(str, map, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("SearchFriendListVM@ca8b.searchFromApi$1");
                return objLJFF;
            }
        }
        String str2 = this.LLILLL;
        SearchFriendListVM searchFriendListVM2 = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(objLIZ)) {
            List list = (List) objLIZ;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("search: ");
            sbLIZ.append(str2);
            sbLIZ.append(" result size: ");
            sbLIZ.append(list.size());
            C1720106oR.LJI("[ffp]_Search", C2188811AlT.LIZIZ(sbLIZ));
            searchFriendListVM2.setState(new AwS595S0100000_16(list, (List<? extends InterfaceC1891350zJl>) 464));
        }
        String str3 = this.LLILLL;
        SearchFriendListVM searchFriendListVM3 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZ);
        if (thM5exceptionOrNullimpl != null) {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("search: ");
            sbLIZ2.append(str3);
            sbLIZ2.append(" error");
            C1720106oR.LIZIZ("[ffp]_Search", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
            if (!(thM5exceptionOrNullimpl instanceof CancellationException)) {
                searchFriendListVM3.setState(new AwS595S0100000_16(thM5exceptionOrNullimpl, 465));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchFriendListVM@ca8b.searchFromApi$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
