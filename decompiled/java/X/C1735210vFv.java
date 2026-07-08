package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthData;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthRequest;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthResponse;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.manager.ComplianceDialogManager$agreeAuth$1", f = "ComplianceDialogManager.kt", l = {349}, m = "invokeSuspend")
public final class C1735210vFv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735210vFv(String str, String str2, InterfaceC1364105Vn<? super C1735210vFv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735210vFv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        Boolean bool;
        String strLJ;
        AgreeAuthData agreeAuthData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        AgreeAuthData agreeAuthData2;
        Boolean bool2;
        C1C7U.LIZ("ComplianceDialogManager@906c.agreeAuth$1");
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
            AgreeAuthRequest agreeAuthRequest = new AgreeAuthRequest(C2286608xc.LJ(1));
            this.LL = 1;
            obj = c1735330vG7.LIZ(agreeAuthRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ComplianceDialogManager@906c.agreeAuth$1");
                return objLJFF;
            }
        }
        AgreeAuthResponse agreeAuthResponse = (AgreeAuthResponse) obj;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Pair[] pairArr = new Pair[3];
        if (agreeAuthResponse != null && (agreeAuthData2 = agreeAuthResponse.data) != null && (bool2 = agreeAuthData2.isSuccess) != null) {
            strLIZ = C893803eS.LIZ(bool2.booleanValue());
        } else {
            strLIZ = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("success", strLIZ);
        String str = this.LLILLJJLI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("page_name", str);
        String str3 = this.LLILLL;
        if (str3 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str3), "previous_page")) != null) {
            str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        pairArr[2] = new Pair("previous_page", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_agree_auth_request", mapLJIIIIZZ);
        C1735240vFy c1735240vFy = C1735240vFy.LIZ;
        if (agreeAuthResponse != null && (agreeAuthData = agreeAuthResponse.data) != null) {
            bool = agreeAuthData.isSuccess;
        } else {
            bool = null;
        }
        c1735240vFy.getClass();
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && (strLJ = C1735240vFy.LJ()) != null) {
            C1735240vFy.LIZIZ.put(strLJ, new ApplyAuthData(2, null));
            C1257480ipO.LIZ.storeString("auth_data_disk_cache", C1741890vQh.LJIIIIZZ(C1735240vFy.LIZIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceDialogManager@906c.agreeAuth$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
