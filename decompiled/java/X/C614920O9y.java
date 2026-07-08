package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel$checkAndRenderLandMarker$2$deferredList$1$1", f = "PoiRevisitViewModel.kt", l = {418}, m = "invokeSuspend")
public final class C614920O9y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends PoiRevisitApi.PoiRevisitCardModel>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ PoiRevisitApi.PoiRevisitCardModel LLILZ;
    public final /* synthetic */ PoiRevisitViewModel LLILZIL;
    public final /* synthetic */ C1175060ggS LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614920O9y(int i, PoiRevisitApi.PoiRevisitCardModel poiRevisitCardModel, PoiRevisitViewModel poiRevisitViewModel, C1175060ggS c1175060ggS, InterfaceC1364105Vn<? super C614920O9y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = poiRevisitCardModel;
        this.LLILZIL = poiRevisitViewModel;
        this.LLILZLL = c1175060ggS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C614920O9y c614920O9y = new C614920O9y(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c614920O9y.LLILLJJLI = obj;
        return c614920O9y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List listLL;
        List<PoiDiscoveryCard> poiList;
        C1C7U.LIZ("PoiRevisitViewModel@2086.checkAndRenderLandMarker$2$deferredList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                PoiRevisitViewModel poiRevisitViewModel = this.LLILZIL;
                C1175060ggS c1175060ggS = this.LLILZLL;
                InterfaceC614930O9z interfaceC614930O9z = (InterfaceC614930O9z) poiRevisitViewModel.LLILZLL.getValue().getOperator();
                this.LL = 1;
                obj = interfaceC614930O9z.LJJJLIIL(c1175060ggS, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiRevisitViewModel@2086.checkAndRenderLandMarker$2$deferredList$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (PoiMapModeResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        PoiMapModeResponse poiMapModeResponse = (PoiMapModeResponse) c098200Yq;
        Integer numLJ = C2286608xc.LJ(this.LLILLL);
        PoiRevisitApi.PoiRevisitCardModel poiRevisitCardModel = this.LLILZ;
        if (poiMapModeResponse != null && (poiList = poiMapModeResponse.getPoiList()) != null) {
            ArrayList arrayList = new ArrayList();
            for (PoiDiscoveryCard poiDiscoveryCard : poiList) {
                if (!Intrinsics.LJFF(poiDiscoveryCard.keyCategory, "Others")) {
                    arrayList.add(poiDiscoveryCard);
                }
            }
            listLL = C13LP.LL(C1697820uHc.LIZLLL(arrayList), 15);
        } else {
            listLL = null;
        }
        Pair pair = new Pair(numLJ, PoiRevisitApi.PoiRevisitCardModel.LIZ(poiRevisitCardModel, null, true, listLL, 33554431));
        C1C7U.LIZIZ("PoiRevisitViewModel@2086.checkAndRenderLandMarker$2$deferredList$1$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends PoiRevisitApi.PoiRevisitCardModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
