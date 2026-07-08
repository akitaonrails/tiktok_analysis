package X;

import com.ss.android.ugc.aweme.minis.model.CheckEligibilityResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0m6H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.share.ShareCheckEligibilityManager$fetchUserFlag$4", f = "ShareCheckEligibilityManager.kt", l = {66}, m = "invokeSuspend")
public final class C1383270m6H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1383270m6H(InterfaceC1364105Vn<? super C1383270m6H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1383270m6H(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareCheckEligibilityManager@2acc.fetchUserFlag$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C11NZ<CheckEligibilityResponse> c11nz = C1383240m6E.LIZJ;
            if (c11nz != null) {
                this.LL = 1;
                obj = C11UD.LIZJ(c11nz, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShareCheckEligibilityManager@2acc.fetchUserFlag$4");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ShareCheckEligibilityManager@2acc.fetchUserFlag$4");
            return unit;
        }
        CheckEligibilityResponse checkEligibilityResponse = (CheckEligibilityResponse) obj;
        if (checkEligibilityResponse != null) {
            C1383240m6E.LIZIZ = checkEligibilityResponse;
            C1383280m6I.LIZ.getClass();
            Map<String, Boolean> map = checkEligibilityResponse.uidRegionEligibility;
            if (map != null) {
                C1383280m6I.LIZ().storeString(C1383280m6I.LIZIZ("uid_region_eligibility"), map.toString());
            }
            Map<String, Boolean> map2 = checkEligibilityResponse.uidAgeEligibility;
            if (map2 != null) {
                C1383280m6I.LIZ().storeString(C1383280m6I.LIZIZ("uid_age_eligibility"), map2.toString());
            }
            Map<String, Boolean> map3 = checkEligibilityResponse.gidRegionEligibility;
            if (map3 != null) {
                C1383280m6I.LIZ().storeString(C1383280m6I.LIZIZ("gid_region_eligibility"), map3.toString());
            }
            Map<String, Boolean> map4 = checkEligibilityResponse.gidAgeEligibility;
            if (map4 != null) {
                C1383280m6I.LIZ().storeString(C1383280m6I.LIZIZ("gid_age_eligibility"), map4.toString());
            }
            C1383280m6I.LIZ().storeLong(C1383280m6I.LIZIZ("store_time"), System.currentTimeMillis());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShareCheckEligibilityManager@2acc.fetchUserFlag$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1383270m6H(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
