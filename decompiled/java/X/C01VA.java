package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01VA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.net.monitor.StatusViewMonitor$Companion$monitor$1", f = "StatusViewMonitor.kt", l = {}, m = "invokeSuspend")
public final class C01VA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01VA(JSONObject jSONObject, int i, String str, String str2, Context context, InterfaceC1364105Vn<? super C01VA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = jSONObject;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01VA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StatusViewMonitor$Companion@69b3.monitor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.put("network_status", this.LLILLJJLI).put(Scene.SCENE_SERVICE, this.LLILLL);
            if (Intrinsics.LJFF(this.LLILZ, "prf_network_error_page_retry") || Intrinsics.LJFF(this.LLILZ, "prf_enter_network_error_page")) {
                Context context = this.LLILZIL;
                if (context != null) {
                    this.LL.put("error_tag", C20626015nO.LIZ(C786410Ut5.N3(context)));
                } else {
                    this.LL.put("error_tag", -1);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AppLogNewUtils.onEventV3(this.LLILZ, this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StatusViewMonitor$Companion@69b3.monitor$1");
        return unit;
    }
}
