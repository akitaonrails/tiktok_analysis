package X;

import Y.AfS171S0100000_2;
import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.0vUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$handleSearch$1", f = "DistrictFragment.kt", l = {2297}, m = "invokeSuspend")
public final class C1744290vUZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchDistrictRequest LLILLJJLI;
    public final /* synthetic */ DistrictFragment LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744290vUZ(SearchDistrictRequest searchDistrictRequest, DistrictFragment districtFragment, String str, InterfaceC1364105Vn<? super C1744290vUZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchDistrictRequest;
        this.LLILLL = districtFragment;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1744290vUZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        Integer numLIZJ;
        Object objLJIJ = obj;
        C1C7U.LIZ("DistrictFragment@520d.handleSearch$1");
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
                c2252611DEt.LJJII(new AwS581S0100000_2(c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(c2252611DEt, 67), new AfS171S0100000_2(c2252611DEt, 68)), 608));
                objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("DistrictFragment@520d.handleSearch$1");
                    return objLJFF;
                }
            }
            SearchDistrictsData searchDistrictsData = (SearchDistrictsData) objLJIJ;
            if (searchDistrictsData != null) {
                DistrictFragment districtFragment = this.LLILLL;
                String str = this.LLILZ;
                ArrayList<C1744320vUc> arrayList = new ArrayList();
                Editable editableLLLLJI = C2204961BRm.LLLLJI(districtFragment.cS().getEditTextView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LQRh/Q5yecw1sHAjas4jycaZEkmdbR+2P13KWXNf7OtwsnEeOV4JY7vDPY2SQ==", null));
                int i2 = 0;
                if (editableLLLLJI == null || editableLLLLJI.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DistrictFragment@520d.handleSearch$1");
                    return unit;
                }
                List<District> list = searchDistrictsData.districts;
                if (list != null) {
                    C19719612Di.LJJIIJ(list, AFwS268S0000000_26.get$arr$(669), true);
                    for (District district : list) {
                        String str2 = district.name;
                        if (str2 != null) {
                            StringBuilder sb = new StringBuilder();
                            List<District> list2 = district.parRegions;
                            if (list2 != null) {
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
                            String string = sb.toString();
                            Context context = districtFragment.getContext();
                            if (context != null) {
                                numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                            } else {
                                numLIZJ = th;
                            }
                            Context context2 = districtFragment.getContext();
                            Object objLIZJ = th;
                            if (context2 != null) {
                                objLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context2);
                            }
                            arrayList.add(new C1744320vUc(district, string, null, str, true, numLIZJ, null, objLIZJ));
                        }
                        th = null;
                        i2 = 0;
                    }
                }
                districtFragment.LLJL = arrayList;
                ArrayList arrayList2 = new ArrayList();
                for (C1744320vUc c1744320vUc : arrayList) {
                    arrayList2.add(new SearchResultAdapter.SearchResultItemVO(c1744320vUc.LIZLLL, c1744320vUc.LIZIZ, c1744320vUc.LIZJ, c1744320vUc.LJFF, c1744320vUc.LJI, c1744320vUc.LJII));
                }
                C1744270vUX c1744270vUX = districtFragment.LLJLIL;
                if (c1744270vUX != null) {
                    c1744270vUX.LLILLJJLI = arrayList2;
                }
                if (c1744270vUX != null) {
                    c1744270vUX.notifyDataSetChanged();
                }
                if (arrayList.size() > 0) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                districtFragment.qS(z2, z3);
                districtFragment.oS(false);
                if (arrayList.size() > 0 && !districtFragment.LLLIIII) {
                    districtFragment.LLLIIII = true;
                    districtFragment.LLLIIIIL = SystemClock.elapsedRealtime();
                    View view = districtFragment.getView();
                    if (view != null) {
                        C1748720vbi.LIZLLL(view, new C1747740va8(), new AwS392S0200000_26((List) arrayList, (List<C1744320vUc<District>>) districtFragment, (DistrictFragment) 186));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR70, e, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DistrictFragment@520d.handleSearch$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
