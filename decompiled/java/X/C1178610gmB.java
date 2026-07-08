package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionApi;
import com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionViewModel;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0gmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionViewModel$getLocationDetailInfo$1$2", f = "PositionSelectionViewModel.kt", l = {64}, m = "invokeSuspend")
public final class C1178610gmB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ double LLILLJJLI;
    public final /* synthetic */ double LLILLL;
    public final /* synthetic */ PositionSelectionViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178610gmB(double d, double d2, PositionSelectionViewModel positionSelectionViewModel, InterfaceC1364105Vn<? super C1178610gmB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = d;
        this.LLILLL = d2;
        this.LLILZ = positionSelectionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1178610gmB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Double dLIZJ;
        Object c098200Yq;
        Object objCreate;
        C1C7U.LIZ("PositionSelectionViewModel@dd5d.getLocationDetailInfo$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        Double dLIZJ2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(Api.LIZ);
                if (interfaceC2661011fLIZ != null) {
                    objCreate = interfaceC2661011fLIZ.create(PositionSelectionApi.class);
                } else {
                    objCreate = null;
                }
                String strValueOf = String.valueOf(this.LLILLJJLI);
                String strValueOf2 = String.valueOf(this.LLILLL);
                this.LL = 1;
                obj = ((PositionSelectionApi) objCreate).locationDetailInfo(strValueOf, strValueOf2, 2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PositionSelectionViewModel@dd5d.getLocationDetailInfo$1$2");
                    return objLJFF;
                }
            }
            str = (String) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.FETCH_LOCATION_ERROR, e);
            str = null;
        }
        C1177960gl8 c1177960gl8 = this.LLILZ.LLILZ;
        if (c1177960gl8 != null) {
            dLIZJ = C2286608xc.LIZJ(c1177960gl8.lat);
        } else {
            dLIZJ = null;
        }
        if (!Intrinsics.LIZIZ(dLIZJ, this.LLILLJJLI)) {
            C1177960gl8 c1177960gl82 = this.LLILZ.LLILZ;
            if (c1177960gl82 != null) {
                dLIZJ2 = C2286608xc.LIZJ(c1177960gl82.lon);
            }
            if (!Intrinsics.LIZIZ(dLIZJ2, this.LLILLL)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PositionSelectionViewModel@dd5d.getLocationDetailInfo$1$2");
                return unit;
            }
        }
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            this.LLILZ.setState(AFwS256S0000000_18.get$arr$(460));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PositionSelectionViewModel@dd5d.getLocationDetailInfo$1$2");
            return unit2;
        }
        double d = this.LLILLJJLI;
        double d2 = this.LLILLL;
        PositionSelectionViewModel positionSelectionViewModel = this.LLILZ;
        try {
            PositionSelectionApi.LocationDetailInfoResponse locationDetailInfoResponse = (PositionSelectionApi.LocationDetailInfoResponse) JsonParseUtils.LIZLLL(PositionSelectionApi.LocationDetailInfoResponse.class, str);
            new C1177960gl8(d, d2);
            positionSelectionViewModel.setState(new AwS597S0100000_18(new C1178590gm9(str, locationDetailInfoResponse), 393));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            this.LLILZ.setState(AFwS256S0000000_18.get$arr$(461));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PositionSelectionViewModel@dd5d.getLocationDetailInfo$1$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
