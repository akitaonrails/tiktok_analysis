package X;

import Y.AfS171S0100000_2;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.0vUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$createTopSearchBoxListener$searchListener$1$onSearch$1", f = "DistrictFragment.kt", l = {2297}, m = "invokeSuspend")
public final class C1744280vUY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchDistrictRequest LLILLJJLI;
    public final /* synthetic */ DistrictFragment LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744280vUY(SearchDistrictRequest searchDistrictRequest, DistrictFragment districtFragment, String str, InterfaceC1364105Vn<? super C1744280vUY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchDistrictRequest;
        this.LLILLL = districtFragment;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1744280vUY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIJ = obj;
        C1C7U.LIZ("DistrictFragment@520d.createTopSearchBoxListener$searchListener$1$onSearch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Throwable th = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJIJ);
            } else {
                C155000ia.LIZIZ(objLJIJ);
                C1744340vUe c1744340vUe = InterfaceC1744330vUd.LIZ;
                SearchDistrictRequest searchDistrictRequest = this.LLILLJJLI;
                c1744340vUe.getClass();
                C11NZ c11nzLIZ = C1744340vUe.LIZ(searchDistrictRequest);
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c2252611DEt.LJJII(new AwS581S0100000_2(c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(c2252611DEt, 65), new AfS171S0100000_2(c2252611DEt, 66)), 607));
                objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("DistrictFragment@520d.createTopSearchBoxListener$searchListener$1$onSearch$1");
                    return objLJFF;
                }
            }
            SearchDistrictsData searchDistrictsData = (SearchDistrictsData) objLJIJ;
            if (searchDistrictsData != null) {
                DistrictFragment districtFragment = this.LLILLL;
                String str = this.LLILZ;
                ArrayList arrayList = new ArrayList();
                List<District> list = searchDistrictsData.districts;
                if (list != null) {
                    C19719612Di.LJJIIJ(list, AFwS268S0000000_26.get$arr$(668), true);
                    for (District district : list) {
                        String str2 = district.name;
                        if (str2 != null) {
                            StringBuilder sb = new StringBuilder();
                            List<District> list2 = district.parRegions;
                            if (list2 != null) {
                                int i2 = 0;
                                for (District district2 : list2) {
                                    int i3 = i2 + 1;
                                    if (i2 >= 0) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(district2.name);
                                        sbLIZ.append(", ");
                                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                                        i2 = i3;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw th;
                                    }
                                }
                            }
                            sb.append(str2);
                            arrayList.add(new C1744320vUc(district, sb.toString(), null, str, true, null, 224));
                        }
                        th = null;
                    }
                }
                C1744460vUq<District> c1744460vUq = districtFragment.LLJJIJIL;
                if (c1744460vUq != null) {
                    c1744460vUq.LIZLLL(false, arrayList, districtFragment.LLJJL, true, false);
                }
                if (arrayList.size() > 0 && !districtFragment.LLLIIII) {
                    districtFragment.LLLIIII = true;
                    districtFragment.LLLIIIIL = SystemClock.elapsedRealtime();
                    View view = districtFragment.getView();
                    if (view != null) {
                        C1748720vbi.LIZLLL(view, new C1747740va8(), new AwS392S0200000_26((List) arrayList, (List<C1744320vUc<District>>) districtFragment, (DistrictFragment) 185));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR70, e, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DistrictFragment@520d.createTopSearchBoxListener$searchListener$1$onSearch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
