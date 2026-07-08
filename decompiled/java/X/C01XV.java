package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01XV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.service.StarshipSdkService$trackEvent$1", f = "StarshipSdkService.kt", l = {}, m = "invokeSuspend")
public final class C01XV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XV(String str, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C01XV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StarshipSdkService@2648.trackEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AppLogNewUtils.onEventV3(this.LL, new JSONObject(this.LLILLJJLI));
        C1306430k6L.LIZ(new C020Q(this.LL, (String) this.LLILLJJLI, (Map<String, ? extends Object>) 3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StarshipSdkService@2648.trackEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
