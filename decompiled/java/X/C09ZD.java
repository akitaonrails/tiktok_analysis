package X;

import com.bytedance.geckox.model.UpdatePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09ZD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.i18n.xbridge.idlruntime.BridgeGeckoUpdateListener$sendUpdateResultEvent$1", f = "BDXHostOpenDependImpl.kt", l = {}, m = "invokeSuspend")
public final class C09ZD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09ZI LL;
    public final /* synthetic */ UpdatePackage LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Throwable LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09ZD(C09ZI c09zi, UpdatePackage updatePackage, boolean z, Throwable th, InterfaceC1364105Vn<? super C09ZD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09zi;
        this.LLILLJJLI = updatePackage;
        this.LLILLL = z;
        this.LLILZ = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09ZD(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String channel;
        String message;
        C1C7U.LIZ("BridgeGeckoUpdateListener@3dbe.sendUpdateResultEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        UpdatePackage updatePackage = this.LLILLJJLI;
        C09ZI c09zi = this.LL;
        boolean z = this.LLILLL;
        Throwable th = this.LLILZ;
        if (updatePackage == null || (channel = updatePackage.getChannel()) == null) {
            channel = c09zi.LIZIZ;
        }
        jSONObject.put("channel", channel);
        jSONObject.put("failed", z);
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        jSONObject.put("failedMsg", message);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append("_getGeckoUpdateResult");
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), C2188811AlT.LIZIZ(sbLIZ)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BridgeGeckoUpdateListener@3dbe.sendUpdateResultEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
