package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import webcast.api.smb.GetSMBCourseOrderStatusResponse;

/* JADX INFO: renamed from: X.0xuz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.payment.course.PcsCourseCheckOrderTask$requestPollingApi$2", f = "PcsCourseCheckOrderTask.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1837550xuz extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<GetSMBCourseOrderStatusResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ C1837600xv4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837550xuz(C1837600xv4 c1837600xv4, InterfaceC1364105Vn<? super C1837550xuz> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1837600xv4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1837550xuz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<GetSMBCourseOrderStatusResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        String str;
        C1C7U.LIZ("PcsCourseCheckOrderTask@d086.requestPollingApi$2");
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
            C480460Ism.LIZ().getClass();
            PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
            C1837600xv4 c1837600xv4 = this.LLILLJJLI;
            DATA_GLOBAL data_global = c1837600xv4.LLILZLL;
            if (data_global != 0) {
                j = data_global.LIZJ;
            } else {
                j = 0;
            }
            C1837340xue c1837340xue = c1837600xv4.LLILZIL;
            if (c1837340xue == null || (str = c1837340xue.LL) == null) {
                str = "";
            }
            this.LL = 1;
            obj = pcsApi.getSMBOrderStatusSuspend(j, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PcsCourseCheckOrderTask@d086.requestPollingApi$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PcsCourseCheckOrderTask@d086.requestPollingApi$2");
        return obj;
    }
}
