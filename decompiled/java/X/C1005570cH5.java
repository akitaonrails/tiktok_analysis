package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheck$init$2$1", f = "SmartCheck.kt", l = {44}, m = "invokeSuspend")
public final class C1005570cH5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public ISmartCheckService LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ ISmartCheckService LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005570cH5(ISmartCheckService iSmartCheckService, InterfaceC1364105Vn<? super C1005570cH5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = iSmartCheckService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005570cH5(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        ISmartCheckService iSmartCheckService;
        boolean zBooleanValue;
        C1C7U.LIZ("SmartCheck@835f.init$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean zBooleanValue2 = false;
        if (i != 0) {
            if (i == 1) {
                iSmartCheckService = this.LLILLJJLI;
                map = (Map) this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C20162213um c20162213um = C20162213um.LIZ;
                    String str = this.LLILZ.getServiceInfo().LIZ;
                    String value = EnumC1005690cHH.UNKNOWN.getValue();
                    EnumC1005660cHE enumC1005660cHE = EnumC1005660cHE.INIT;
                    String message = e.getMessage();
                    c20162213um.getClass();
                    C20162213um.LIZ(str, value, enumC1005660cHE, message);
                    zBooleanValue = false;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1005620cHA.LIZ.getClass();
            map = (ConcurrentHashMap) C1005620cHA.LIZJ.getValue();
            iSmartCheckService = this.LLILZ;
            try {
                this.LL = map;
                this.LLILLJJLI = iSmartCheckService;
                this.LLILLL = 1;
                obj = iSmartCheckService.LIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SmartCheck@835f.init$2$1");
                    return objLJFF;
                }
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C20162213um c20162213um2 = C20162213um.LIZ;
                String str2 = this.LLILZ.getServiceInfo().LIZ;
                String value2 = EnumC1005690cHH.UNKNOWN.getValue();
                EnumC1005660cHE enumC1005660cHE2 = EnumC1005660cHE.INIT;
                String message2 = e.getMessage();
                c20162213um2.getClass();
                C20162213um.LIZ(str2, value2, enumC1005660cHE2, message2);
                zBooleanValue = false;
            }
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        map.put(iSmartCheckService, Boolean.valueOf(zBooleanValue));
        C1005620cHA.LIZ.getClass();
        Boolean bool = (Boolean) ((ConcurrentHashMap) C1005620cHA.LIZJ.getValue()).get(this.LLILZ);
        if (bool != null) {
            zBooleanValue2 = bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue2);
        C1C7U.LIZIZ("SmartCheck@835f.init$2$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
