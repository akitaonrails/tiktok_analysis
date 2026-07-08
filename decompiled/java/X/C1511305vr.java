package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementData;
import com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse;
import com.ss.android.ugc.aweme.compliance.api.services.edm.HighlightInfo;
import java.util.Collection;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.utils.EmailAuthorizationTextUtils$openEmailConsentOptOut$1$url$1$1", f = "EmailAuthorizationTextUtils.kt", l = {100}, m = "invokeSuspend")
public final class C1511305vr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511305vr(String str, String str2, InterfaceC1364105Vn<? super C1511305vr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1511305vr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Map<String, HighlightInfo> map;
        Collection<HighlightInfo> collectionValues;
        HighlightInfo highlightInfo;
        C1C7U.LIZ("EmailAuthorizationTextUtils@dc15.openEmailConsentOptOut$1$url$1$1");
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
            String str2 = this.LLILLJJLI;
            String str3 = this.LLILLL;
            this.LL = 1;
            obj = ComplianceServiceProvider.LJIJ().getEmailConsentAgreementInfo(str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EmailAuthorizationTextUtils@dc15.openEmailConsentOptOut$1$url$1$1");
                return objLJFF;
            }
        }
        EdmConsentAgreementData data = ((EdmConsentAgreementResponse) obj).getData();
        if (data != null && (map = data.highlightInfo) != null && (collectionValues = map.values()) != null && (highlightInfo = (HighlightInfo) C13LP.LJJJLIIL(collectionValues)) != null) {
            str = highlightInfo.url;
        } else {
            str = null;
        }
        C1C7U.LIZIZ("EmailAuthorizationTextUtils@dc15.openEmailConsentOptOut$1$url$1$1");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
