package X;

import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthRequest;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.manager.ComplianceDialogManager$refreshAuthData$1", f = "ComplianceDialogManager.kt", l = {234}, m = "invokeSuspend")
public final class C1735160vFq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735160vFq(String str, InterfaceC1364105Vn<? super C1735160vFq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735160vFq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ApplyAuthData applyAuthData;
        C1C7U.LIZ("ComplianceDialogManager@906c.refreshAuthData$1");
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
            C1735330vG7 c1735330vG7 = InterfaceC1735340vG8.LIZ;
            ApplyAuthRequest applyAuthRequest = new ApplyAuthRequest(C2286608xc.LJ(1));
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = c1735330vG7.LIZIZ(applyAuthRequest, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ComplianceDialogManager@906c.refreshAuthData$1");
                return objLJFF;
            }
        }
        ApplyAuthResponse applyAuthResponse = (ApplyAuthResponse) obj;
        C1735240vFy.LIZ.getClass();
        String strLJ = C1735240vFy.LJ();
        if (strLJ != null) {
            Map<String, ApplyAuthData> map = C1735240vFy.LIZIZ;
            if (applyAuthResponse != null) {
                applyAuthData = applyAuthResponse.data;
            } else {
                applyAuthData = null;
            }
            map.put(strLJ, applyAuthData);
        }
        C1257480ipO.LIZ.storeString("auth_data_disk_cache", C1741890vQh.LJIIIIZZ(C1735240vFy.LIZIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceDialogManager@906c.refreshAuthData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
