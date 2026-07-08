package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05QN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.preload.AdPreloadManifestFileParser$readJsonFile$2", f = "AdPreloadManifestFileParser.kt", l = {}, m = "invokeSuspend")
public final class C05QN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super JSONObject>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QN(String str, String str2, InterfaceC1364105Vn<? super C05QN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strLIZIZ;
        boolean z;
        C1C7U.LIZ("AdPreloadManifestFileParser@6d15.readJsonFile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = null;
        try {
            strLIZIZ = C2139408Zs.LIZIZ(this.LL, this.LLILLJJLI);
            if (strLIZIZ == null || a0.LJJJIL(strLIZIZ)) {
                z = true;
            } else {
                z = false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C2344809Gs.LJ("parse preload manifest file failed");
        }
        if (z) {
            C1C7U.LIZIZ("AdPreloadManifestFileParser@6d15.readJsonFile$2");
            return null;
        }
        jSONObject = new JSONObject(strLIZIZ);
        C1C7U.LIZIZ("AdPreloadManifestFileParser@6d15.readJsonFile$2");
        return jSONObject;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super JSONObject> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
