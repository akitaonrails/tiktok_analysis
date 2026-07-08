package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.main.MainRootFragmentBase;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0raK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594100raK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MainRootFragmentBase LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594100raK(MainRootFragmentBase mainRootFragmentBase, int i) {
        super(0);
        this.LL = mainRootFragmentBase;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainRootFragmentBase mainRootFragmentBase = this.LL;
        int i = this.LLILLJJLI;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_recreate", 2);
            InterfaceC214902198i interfaceC214902198iLIZJ = C20629915o1.LIZJ(mainRootFragmentBase.nS());
            jSONObject.put("top_page", interfaceC214902198iLIZJ != null ? interfaceC214902198iLIZJ.getClass().getSimpleName() : null);
            jSONObject.put("lifecycle", i);
            SAFHelper.LIZ.getClass();
            jSONObject.put("enable_saf", SAFHelper.LJIIJ());
            AppLogNewUtils.onEventV3("main_activity_saf_recreate_monitor", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
