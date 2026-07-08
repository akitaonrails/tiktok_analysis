package X;

import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Yjz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882690Yjz implements C0YUF {
    public static final C882690Yjz LIZ = new C882690Yjz();

    public static final void LJI() {
        Intrinsics.LJFF("TaskBuilder", "imsdk");
    }

    public static final void LJII() {
        if (Intrinsics.LJFF("SDKNetworkBridge", "imsdk")) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SDKNetworkBridge");
        sbLIZ.append(": ");
        sbLIZ.append("sendHttp empty body");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJ(String str) {
        Intrinsics.LJFF(str, "imsdk");
    }

    public static final void LJIIIIZZ(String str) {
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
        if (iAwemeImManager != null && iAwemeImManager.getProxy() != null && str.length() != 0) {
            ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).event("message_send_fail", str);
        }
    }

    @Override // X.C0YUF
    public final void LIZIZ(Throwable th) throws Throwable {
        C0I0B.LJFF.LIZJ();
        if (C894660Z7w.LIZJ() && th != null) {
            throw th;
        }
    }

    public static final void LJFF(String str, String str2) {
        if (!Intrinsics.LJFF(str, "imsdk")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJIIIZ(String str, String str2) {
        if (!Intrinsics.LJFF(str, "imsdk")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.C0YUF
    public final void LIZ(Throwable th, Map map) {
        Npth.reportBizException("social_imsdk", th, "imsdk: msg", map);
    }

    @Override // X.C0YUF
    public final void LIZJ(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            C0I0B.LJFF.LIZIZ().LIZ(str, jSONObject);
        }
    }

    @Override // X.C0YUF
    public final void LIZLLL(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            C0I0B.LJFF.LIZIZ().LIZ(str, jSONObject);
        }
    }
}
