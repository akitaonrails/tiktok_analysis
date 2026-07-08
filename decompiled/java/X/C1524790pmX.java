package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.network.NetWorkDownloadJSWrap$downloadFile$1$2", f = "NetWorkModule.kt", l = {}, m = "invokeSuspend")
public final class C1524790pmX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1525160pn8 LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524790pmX(C1525160pn8 c1525160pn8, JSONObject jSONObject, InterfaceC1364105Vn<? super C1524790pmX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1525160pn8;
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1524790pmX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1525090pn1 interfaceC1525090pn1;
        C1C7U.LIZ("NetWorkDownloadJSWrap@eab6.downloadFile$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1525040pmw c1525040pmw = this.LL.LIZ;
        if (c1525040pmw != null && (interfaceC1525090pn1 = c1525040pmw.LIZIZ) != null) {
            interfaceC1525090pn1.emitJSAPIEvent("innerDownloadTaskStateChange", this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetWorkDownloadJSWrap@eab6.downloadFile$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
