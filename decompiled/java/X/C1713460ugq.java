package X;

import com.bytedance.pipo.verify.base.model.SchemaComposer;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.request.FallbackGetVerifyRequest;
import com.bytedance.pipo.verify.base.model.response.FallbackGetVerifyResponseData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ugq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.PIPOVerifyContext$useHybridComposeSolution$2", f = "PIPOVerifyContext.kt", l = {242}, m = "invokeSuspend")
public final class C1713460ugq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1713570uh1 LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713460ugq(C1713570uh1 c1713570uh1, C19EG c19eg, InterfaceC1364105Vn<? super C1713460ugq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1713570uh1;
        this.LLILLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1713460ugq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        Map<String, String> mapLJ;
        SchemaComposer schemaComposer;
        FallbackGetVerifyResponseData fallbackGetVerifyResponseData;
        C1C7U.LIZ("PIPOVerifyContext@e046.useHybridComposeSolution$2");
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
            String str3 = this.LLILLJJLI.LJIIIZ().verifyId;
            String str4 = this.LLILLJJLI.LJIIIZ().verifyType;
            VerifyDetail verifyDetail = this.LLILLJJLI.LJIIIZ().verifyDetail;
            if (verifyDetail != null) {
                str = verifyDetail.merchantUserId;
            } else {
                str = null;
            }
            VerifyDetail verifyDetail2 = this.LLILLJJLI.LJIIIZ().verifyDetail;
            if (verifyDetail2 != null) {
                str2 = verifyDetail2.merchantId;
            } else {
                str2 = null;
            }
            FallbackGetVerifyRequest fallbackGetVerifyRequest = new FallbackGetVerifyRequest(str4, str3, null, str, str2);
            C1713570uh1 c1713570uh1 = this.LLILLJJLI;
            InterfaceC1713470ugr interfaceC1713470ugr = C1713600uh4.LJFF;
            if (interfaceC1713470ugr == null || (mapLJ = interfaceC1713470ugr.getParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            this.LL = 1;
            C1713530ugx c1713530ugxLJ = c1713570uh1.LJ();
            c1713530ugxLJ.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1706920uWI(c1713530ugxLJ, fallbackGetVerifyRequest, mapLJ, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PIPOVerifyContext@e046.useHybridComposeSolution$2");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (fallbackGetVerifyResponseData = (FallbackGetVerifyResponseData) baseResponse.data) != null) {
            schemaComposer = fallbackGetVerifyResponseData.schemaList;
        } else {
            schemaComposer = null;
        }
        this.LLILLJJLI.getClass();
        if (!C1713570uh1.LIZ(schemaComposer)) {
            try {
                C1713570uh1 c1713570uh12 = this.LLILLJJLI;
                C19EG c19eg = this.LLILLL;
                c1713570uh12.getClass();
                InterfaceC1713480ugs interfaceC1713480ugs = C1713600uh4.LJ;
                if (interfaceC1713480ugs != null) {
                    interfaceC1713480ugs.LIZ(c19eg, c1713570uh12);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILLJJLI.LJIILIIL.LIZ(C1713490ugt.LIZ("Failed to get verify schema list", null, 6));
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PIPOVerifyContext@e046.useHybridComposeSolution$2");
            return unit;
        }
        if (schemaComposer != null) {
            C1713570uh1 c1713570uh13 = this.LLILLJJLI;
            C19EG c19eg2 = this.LLILLL;
            VerifyDetail verifyDetail3 = c1713570uh13.LJIIIZ().verifyDetail;
            if (verifyDetail3 != null) {
                verifyDetail3.schemaList = schemaComposer;
            }
            InterfaceC1713480ugs interfaceC1713480ugs2 = C1713600uh4.LJ;
            if (interfaceC1713480ugs2 != null) {
                interfaceC1713480ugs2.LIZIZ(c19eg2, c1713570uh13);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PIPOVerifyContext@e046.useHybridComposeSolution$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
