package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.mapdetail.PoiMapDetailPreload;
import com.ss.android.ugc.aweme.poi.mapdetail.api.PoiMapDetailPoiListApi;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ghU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.PoiMapDetailPreload$preload$1", f = "PoiMapDetailPreload.kt", l = {30}, m = "invokeSuspend")
public final class C1175700ghU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiMapDetailResponse>, Object> {
    public int LL;
    public final /* synthetic */ PoiMapDetailPreload LLILLJJLI;
    public final /* synthetic */ Function1<Class<PoiMapDetailPoiListApi>, PoiMapDetailPoiListApi> LLILLL;
    public final /* synthetic */ Bundle LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1175700ghU(PoiMapDetailPreload poiMapDetailPreload, Function1<? super Class<PoiMapDetailPoiListApi>, ? extends PoiMapDetailPoiListApi> function1, Bundle bundle, InterfaceC1364105Vn<? super C1175700ghU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiMapDetailPreload;
        this.LLILLL = function1;
        this.LLILZ = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1175700ghU(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Serializable serializable;
        EnumC1175760gha enumC1175760gha;
        Integer numLJ;
        Serializable serializable2;
        C1175680ghS c1175680ghS;
        C1C7U.LIZ("PoiMapDetailPreload@cbc3.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                PoiMapDetailPreload poiMapDetailPreload = this.LLILLJJLI;
                Function1<Class<PoiMapDetailPoiListApi>, PoiMapDetailPoiListApi> function1 = this.LLILLL;
                Bundle bundle = this.LLILZ;
                if (bundle == null) {
                    serializable = null;
                } else {
                    serializable = bundle.getSerializable("map_mode_scene");
                }
                if (serializable instanceof EnumC1175760gha) {
                    enumC1175760gha = (EnumC1175760gha) serializable;
                } else {
                    enumC1175760gha = null;
                }
                if (enumC1175760gha != null) {
                    numLJ = C2286608xc.LJ(enumC1175760gha.getScene());
                } else {
                    numLJ = null;
                }
                if (bundle == null) {
                    serializable2 = null;
                } else {
                    serializable2 = bundle.getSerializable("map_mode_data_params");
                }
                if (serializable2 instanceof C1175680ghS) {
                    c1175680ghS = (C1175680ghS) serializable2;
                } else {
                    c1175680ghS = null;
                }
                this.LL = 1;
                obj = poiMapDetailPreload.callMapDetailInitial(function1, numLJ, c1175680ghS, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiMapDetailPreload@cbc3.preload$1");
                    return objLJFF;
                }
            }
            c098200Yq = (PoiMapDetailResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("PoiMapDetailPreload@cbc3.preload$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiMapDetailResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
