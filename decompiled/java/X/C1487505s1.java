package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.abretrieve.AbRetrieveTask$run$1$1", f = "AbRetrieveTask.kt", l = {39, 47}, m = "invokeSuspend")
public final class C1487505s1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;

    public C1487505s1(InterfaceC1364105Vn<? super C1487505s1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1487505s1(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        C1C7U.LIZ("AbRetrieveTask@a2e.run$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJFF("abretrieve", "onDataUpdate error: " + e.getMessage());
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AbRetrieveTask@a2e.run$1$1");
                return unit;
            }
            j = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            j = CastLongProtector.parseLong(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
            C1DFH c1dfh = C0PEM.LIZ;
            C1487605s2 c1487605s2 = new C1487605s2(null);
            this.LL = j;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c1dfh, c1487605s2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AbRetrieveTask@a2e.run$1$1");
                return objLJFF;
            }
        }
        String str = (String) obj;
        InterfaceC1484505rX interfaceC1484505rX = (InterfaceC1484505rX) C0CHQ.LIZ().getNetworkService().createRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ(), true, InterfaceC1484505rX.class);
        if (str != null) {
            this.LLILLJJLI = 2;
            obj = interfaceC1484505rX.LIZ(j, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AbRetrieveTask@a2e.run$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AbRetrieveTask@a2e.run$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1487505s1(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
