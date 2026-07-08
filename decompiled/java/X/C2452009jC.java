package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import com.ss.android.ugc.aweme.relation.auth.model.EmailUploadResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09jC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.email.EmailUploadHandler$upload$2", f = "EmailUploadHandler.kt", l = {66}, m = "invokeSuspend")
public final class C2452009jC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ IAuthApi.IdentityBody LLILLJJLI;
    public final /* synthetic */ C2451609j8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2452009jC(IAuthApi.IdentityBody identityBody, C2451609j8 c2451609j8, InterfaceC1364105Vn<? super C2452009jC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = identityBody;
        this.LLILLL = c2451609j8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2452009jC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmailUploadHandler@2dee.upload$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        boolean z2 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                AbstractC19484711Kz<EmailUploadResponse> abstractC19484711KzUploadHashIdentityInfo = AuthApiService.LIZIZ.uploadHashIdentityInfo(this.LLILLJJLI, TwoStepAuthApi.LJ("/passport/identity/set_identity_info/"), this.LLILLL.LIZ);
                this.LL = 1;
                obj = C11UD.LIZIZ(abstractC19484711KzUploadHashIdentityInfo, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EmailUploadHandler@2dee.upload$2");
                    return objLJFF;
                }
            }
            EmailUploadResponse emailUploadResponse = (EmailUploadResponse) obj;
            emailUploadResponse.checkValid();
            if (emailUploadResponse.status_code != 0) {
                z2 = false;
            }
            if (z2) {
                C2452109jD.LIZ.getClass();
                C2452109jD.LIZLLL.storeLong("last_email_upload_time", System.currentTimeMillis());
            }
            z = z2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("EmailUploadHandler@2dee.upload$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
