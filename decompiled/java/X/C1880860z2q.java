package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880860z2q extends C09AY implements Function0<JSONObject> {
    public final /* synthetic */ MixCardModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880860z2q(MixCardModel mixCardModel) {
        super(0);
        this.LL = mixCardModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() {
        ?? r1;
        String strLJ;
        try {
            k kVar = this.LL.extraCardConfig;
            JSONObject jSONObject = (kVar == null || (strLJ = C476770Imp.LJ(kVar)) == null) ? null : new JSONObject(strLJ);
            C189200o6.m2constructorimpl(jSONObject);
            r1 = jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            r1 = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(r1)) {
            return null;
        }
        return r1;
    }
}
