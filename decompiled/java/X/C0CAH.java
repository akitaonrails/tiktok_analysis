package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi;
import kotlin.jvm.internal.AwS121S1200000_4;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CAH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAH implements InterfaceC846530XIt {
    public final IAwemeConfigCenterApi LIZ = (IAwemeConfigCenterApi) ServiceManager.get().getService(IAwemeConfigCenterApi.class);

    @Override // X.InterfaceC846530XIt
    public final void LIZ(JSONObject jSONObject) {
        C1326370kcV.LIZ(new AwS121S1200000_4(jSONObject, this, 0));
    }
}
