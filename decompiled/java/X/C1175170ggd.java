package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.mapmode.PoiMapModePreload;
import com.ss.android.ugc.aweme.poi.mapmode.api.PoiMapModePoiListApi;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ggd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.PoiMapModePreload$preload$2", f = "PoiMapModePreload.kt", l = {BaseNotice.CREATOR, 64}, m = "invokeSuspend")
public final class C1175170ggd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PoiMapModeResponse>, Object> {
    public int LL;
    public final /* synthetic */ PoiMapModeDataParams LLILLJJLI;
    public final /* synthetic */ PoiMapModePreload LLILLL;
    public final /* synthetic */ Function1<Class<PoiMapModePoiListApi>, PoiMapModePoiListApi> LLILZ;
    public final /* synthetic */ EnumC1175380ggy LLILZIL;
    public final /* synthetic */ PoiMapModeMobParams LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1175170ggd(PoiMapModeDataParams poiMapModeDataParams, PoiMapModePreload poiMapModePreload, Function1<? super Class<PoiMapModePoiListApi>, ? extends PoiMapModePoiListApi> function1, EnumC1175380ggy enumC1175380ggy, PoiMapModeMobParams poiMapModeMobParams, InterfaceC1364105Vn<? super C1175170ggd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiMapModeDataParams;
        this.LLILLL = poiMapModePreload;
        this.LLILZ = function1;
        this.LLILZIL = enumC1175380ggy;
        this.LLILZLL = poiMapModeMobParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1175170ggd(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PoiMapModePreload@1037.preload$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    c098200Yq = (PoiMapModeResponse) obj;
                } else {
                    C155000ia.LIZIZ(obj);
                    c098200Yq = (PoiMapModeResponse) obj;
                }
            } else {
                C155000ia.LIZIZ(obj);
                PoiMapModeDataParams poiMapModeDataParams = this.LLILLJJLI;
                PoiMapModePreload poiMapModePreload = this.LLILLL;
                Function1<Class<PoiMapModePoiListApi>, PoiMapModePoiListApi> function1 = this.LLILZ;
                EnumC1175380ggy enumC1175380ggy = this.LLILZIL;
                PoiMapModeMobParams poiMapModeMobParams = this.LLILZLL;
                boolean z = false;
                if (poiMapModeDataParams != null && poiMapModeDataParams.isTargetPoiValid$poi_release()) {
                    z = true;
                }
                if (z) {
                    this.LL = 1;
                    obj = poiMapModePreload.callYMAL(function1, enumC1175380ggy, poiMapModeDataParams, poiMapModeMobParams, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("PoiMapModePreload@1037.preload$2");
                        return objLJFF;
                    }
                    c098200Yq = (PoiMapModeResponse) obj;
                } else {
                    this.LL = 2;
                    obj = poiMapModePreload.callCityInitial(function1, enumC1175380ggy, poiMapModeDataParams, poiMapModeMobParams, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("PoiMapModePreload@1037.preload$2");
                        return objLJFF;
                    }
                    c098200Yq = (PoiMapModeResponse) obj;
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("PoiMapModePreload@1037.preload$2");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PoiMapModeResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
