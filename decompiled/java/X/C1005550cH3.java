package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl$check$2", f = "SmartCheckIntegrateImpl.kt", l = {92}, m = "invokeSuspend")
public final class C1005550cH3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005550cH3(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super C1005550cH3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005550cH3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartCheckIntegrateImpl@2b4b.check$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                Uri.Builder builderScheme = new Uri.Builder().scheme("event");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(this.LLILLJJLI);
                Uri.Builder builderEncodedAuthority = builderScheme.encodedAuthority(C2188811AlT.LIZIZ(sbLIZ));
                Map<String, Object> map = this.LLILLL;
                Map<String, Object> map2 = this.LLILZ;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    builderEncodedAuthority.appendQueryParameter(entry.getKey(), C1741890vQh.LJIIIIZZ(entry.getValue()));
                }
                if (map2 != null) {
                    for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                        builderEncodedAuthority.appendQueryParameter(entry2.getKey(), C1741890vQh.LJIIIIZZ(entry2.getValue()));
                    }
                }
                String string = builderEncodedAuthority.build().toString();
                C1005620cHA c1005620cHA = C1005620cHA.LIZ;
                String value = EnumC1005690cHH.EVENT.getValue();
                this.LL = 1;
                if (c1005620cHA.LIZ(string, false, value, null, null, null, null, this) == objLJFF) {
                    C1C7U.LIZIZ("SmartCheckIntegrateImpl@2b4b.check$2");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20162213um c20162213um = C20162213um.LIZ;
            String value2 = EnumC1005690cHH.EVENT.getValue();
            EnumC1005660cHE enumC1005660cHE = EnumC1005660cHE.CHECK;
            String message = e.getMessage();
            c20162213um.getClass();
            C20162213um.LIZ("SmartCheck", value2, enumC1005660cHE, message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartCheckIntegrateImpl@2b4b.check$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
