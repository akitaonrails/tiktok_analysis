package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardBgModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882610z5f extends C09AY implements Function0<MixCardBgModel> {
    public final /* synthetic */ C1155600gB4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882610z5f(C1155600gB4 c1155600gB4) {
        super(0);
        this.LL = c1155600gB4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ MixCardBgModel invoke() {
        MixCardBgModel mixCardBgModel;
        MixCardBgModel mixCardBgModel2;
        JSONObject jSONObjectOptJSONObject;
        String strJ3;
        try {
            JSONObject jSONObjectLIZ = this.LL.LLILLL.LIZ();
            if (jSONObjectLIZ == null || (jSONObjectOptJSONObject = jSONObjectLIZ.optJSONObject("secondary_background")) == null || (strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject)) == null) {
                mixCardBgModel2 = null;
            } else {
                mixCardBgModel2 = (MixCardBgModel) (strJ3.length() == 0 ? null : C293501Bt.LIZ().LJIIIIZZ(strJ3, new TypeToken<MixCardBgModel>() { // from class: X.0z5g
                }.getType()));
            }
            C189200o6.m2constructorimpl(mixCardBgModel2);
            mixCardBgModel = mixCardBgModel2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            mixCardBgModel = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(mixCardBgModel)) {
            return null;
        }
        return mixCardBgModel;
    }
}
