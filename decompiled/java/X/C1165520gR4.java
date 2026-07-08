package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.content.poicampaign.PoiListRequest;
import com.ss.android.ugc.aweme.poi.content.poicampaign.PoiListResponse;
import com.ss.android.ugc.aweme.poi.content.poicampaign.PoiVideoSummary;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.PoiCampaignMapVM;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gR4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.PoiCampaignMapVM$fetchPoiList$1", f = "PoiCampaignMapVM.kt", l = {54}, m = "invokeSuspend")
public final class C1165520gR4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiCampaignMapVM LLILLJJLI;
    public final /* synthetic */ C1176580giu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165520gR4(PoiCampaignMapVM poiCampaignMapVM, C1176580giu c1176580giu, InterfaceC1364105Vn<? super C1165520gR4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiCampaignMapVM;
        this.LLILLL = c1176580giu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165520gR4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        double d;
        double d2;
        double d3;
        C1177960gl8 c1177960gl8;
        C1177960gl8 c1177960gl82;
        C1177960gl8 c1177960gl83;
        C1177960gl8 c1177960gl84;
        List<PoiVideoSummary> list;
        boolean z;
        boolean z2;
        boolean z3;
        Object objLLIIL = obj;
        C1C7U.LIZ("PoiCampaignMapVM@2f90.fetchPoiList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z4 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLLIIL);
            } else {
                C155000ia.LIZIZ(objLLIIL);
                InterfaceC1198450hIB interfaceC1198450hIB = (InterfaceC1198450hIB) this.LLILLJJLI.LLILLL.getValue().getOperator();
                C1176580giu c1176580giu = this.LLILLL;
                double d4 = 0.0d;
                if (c1176580giu != null && (c1177960gl84 = c1176580giu.southwest) != null) {
                    d = c1177960gl84.lat;
                } else {
                    d = 0.0d;
                }
                if (c1176580giu != null && (c1177960gl83 = c1176580giu.northeast) != null) {
                    d2 = c1177960gl83.lat;
                } else {
                    d2 = 0.0d;
                }
                if (c1176580giu != null && (c1177960gl82 = c1176580giu.southwest) != null) {
                    d3 = c1177960gl82.lon;
                } else {
                    d3 = 0.0d;
                }
                if (c1176580giu != null && (c1177960gl8 = c1176580giu.northeast) != null) {
                    d4 = c1177960gl8.lon;
                }
                PoiListRequest poiListRequest = new PoiListRequest(C2286608xc.LJ(10000), C2286608xc.LIZJ(d), C2286608xc.LIZJ(d3), C2286608xc.LIZJ(d2), C2286608xc.LIZJ(d4));
                this.LL = 1;
                objLLIIL = interfaceC1198450hIB.LLIIL(poiListRequest, this);
                if (objLLIIL == objLJFF) {
                    C1C7U.LIZIZ("PoiCampaignMapVM@2f90.fetchPoiList$1");
                    return objLJFF;
                }
            }
            PoiListResponse poiListResponse = (PoiListResponse) objLLIIL;
            PoiCampaignMapVM poiCampaignMapVM = this.LLILLJJLI;
            Object obj2 = null;
            if (poiListResponse != null) {
                list = poiListResponse.poiListSummary;
            } else {
                list = null;
            }
            poiCampaignMapVM.getClass();
            Pair pairWQ2 = PoiCampaignMapVM.wQ2(list);
            Set<String> set = this.LLILLJJLI.getState().LLILLJJLI;
            if (set == null || set.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List list2 = (List) pairWQ2.getSecond();
                if (list2 != null) {
                    PoiCampaignMapVM poiCampaignMapVM2 = this.LLILLJJLI;
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        C1178080glK c1178080glK = (C1178080glK) next;
                        Set<String> set2 = poiCampaignMapVM2.getState().LLILLJJLI;
                        if (set2 == null || set2.contains(c1178080glK.LIZ)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            obj2 = next;
                            break;
                        }
                    }
                    obj2 = (C1178080glK) obj2;
                }
                if (obj2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z4 = false;
                }
            }
            if (z4) {
                this.LLILLJJLI.setState(new AwS597S0100000_18(pairWQ2, (Pair<? extends Set<String>, ? extends List<C1178080glK>>) 276));
            } else {
                this.LLILLJJLI.setState(AFwS256S0000000_18.get$arr$(324));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(AFwS256S0000000_18.get$arr$(325));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiCampaignMapVM@2f90.fetchPoiList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
