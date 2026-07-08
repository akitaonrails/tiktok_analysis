package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.net.QuotaStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAIGCQuotaService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditI2VServerTask$stepRequestServer$3", f = "EditI2VServerTask.kt", l = {163, 171}, m = "invokeSuspend")
public final class C543940LUy extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ CreateTaskResponse LLILLL;
    public final /* synthetic */ C0LVQ LLILZ;
    public final /* synthetic */ C09JG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543940LUy(CreateTaskResponse createTaskResponse, C0LVQ c0lvq, C09JG c09jg, InterfaceC1364105Vn<? super C543940LUy> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = createTaskResponse;
        this.LLILZ = c0lvq;
        this.LLILZIL = c09jg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C543940LUy(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        QuotaStruct quotaStruct;
        IAIGCQuotaService aIGCQuotaService;
        String source;
        String str2;
        C1C7U.LIZ("EditI2VServerTask@cf5c.stepRequestServer$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    str = (String) this.LL;
                    C155000ia.LIZIZ(obj);
                    Keva keva = C0M54.LIZ;
                    str2 = ((I2VServerTaskInput) this.LLILZIL).aiCreationId;
                    if (str.length() != 0 && str2.length() != 0) {
                        C0M54.LIZ.storeString(str, str2);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditI2VServerTask@cf5c.stepRequestServer$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("EditI2VServerTask@cf5c.stepRequestServer$3");
            return null;
        }
        C155000ia.LIZIZ(obj);
        CreateTaskResponse createTaskResponse = this.LLILLL;
        str = createTaskResponse.taskId;
        if (str == null) {
            C0LVQ c0lvq = this.LLILZ;
            this.LLILLJJLI = 1;
            if (C539400LDm.LIZ(c0lvq, -47373, "generate server task id null", null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("EditI2VServerTask@cf5c.stepRequestServer$3");
                return objLJFF;
            }
            C1C7U.LIZIZ("EditI2VServerTask@cf5c.stepRequestServer$3");
            return null;
        }
        List<QuotaStruct> list = createTaskResponse.remainQuotas;
        if (list != null && (quotaStruct = (QuotaStruct) C13LP.LJJJLL(list)) != null) {
            C0LVQ c0lvq2 = this.LLILZ;
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null && (aIGCQuotaService = iExternalService.getAIGCQuotaService()) != null) {
                Source source2 = c0lvq2.LIZLLL.LJIIL;
                if (source2 == null || (source = source2.getSource()) == null) {
                    source = "";
                }
                aIGCQuotaService.cacheQuota(source, quotaStruct.quota, quotaStruct.quotaRemain);
            }
        }
        C0LVQ c0lvq3 = this.LLILZ;
        C0LSZ c0lszLIZ = C0LSZ.LIZ(c0lvq3.LIZLLL, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, str, 0L, null, ((I2VServerTaskInput) this.LLILZIL).aiCreationId, null, 0, null, 249560959);
        this.LL = str;
        this.LLILLJJLI = 2;
        if (C0LTN.LJJJI(c0lvq3, c0lszLIZ, this) == objLJFF) {
            C1C7U.LIZIZ("EditI2VServerTask@cf5c.stepRequestServer$3");
            return objLJFF;
        }
        Keva keva2 = C0M54.LIZ;
        str2 = ((I2VServerTaskInput) this.LLILZIL).aiCreationId;
        if (str.length() != 0) {
            C0M54.LIZ.storeString(str, str2);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditI2VServerTask@cf5c.stepRequestServer$3");
        return unit2;
    }
}
