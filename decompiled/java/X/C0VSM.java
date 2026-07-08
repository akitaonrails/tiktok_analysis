package X;

import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.security.android.aopcheck.settings.PathTraversalProtectionSettings;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VSM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSM {
    public static final C0VSM LIZ = new C0VSM();
    public static final JSONObject LIZIZ = new JSONObject();

    static {
        ((ArrayList) C0VSK.LIZ).add(new C0VSL() { // from class: X.0VSN
            public C0VCC LIZ;

            @Override // X.C0VSL
            public final void LIZ(C0VSO c0vso) throws JSONException {
                if (c0vso instanceof C0VSO) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("actionType", c0vso.LIZ);
                    jSONObject.put("content", c0vso.LIZJ);
                    jSONObject.put("backtrace", c0vso.LIZLLL);
                    if (this.LIZ == null) {
                        this.LIZ = SDKMonitorUtils.getInstance("333807");
                    }
                    C0VCC c0vcc = this.LIZ;
                    if (c0vcc != null) {
                        c0vcc.LJIIJ("path_traversal_call", jSONObject, null, null);
                    }
                }
            }

            @Override // X.C0VSL
            public final void LIZIZ(long j) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j);
                if (this.LIZ == null) {
                    this.LIZ = SDKMonitorUtils.getInstance("333807");
                }
                C0VCC c0vcc = this.LIZ;
                if (c0vcc != null) {
                    c0vcc.LJIIJ("aop_report_init_duration", null, jSONObject, null);
                }
            }
        });
    }

    public static void LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PathTraversalProtectionSettings.PathTraversalProtectionModel pathTraversalProtectionModel = PathTraversalProtectionSettings.LIZ;
        PathTraversalProtectionSettings.PathTraversalProtectionModel pathTraversalProtectionModel2 = (PathTraversalProtectionSettings.PathTraversalProtectionModel) settingsManagerLIZLLL.LJIIIIZZ("path_traversal_protection", PathTraversalProtectionSettings.PathTraversalProtectionModel.class, pathTraversalProtectionModel);
        if (pathTraversalProtectionModel2 != null) {
            pathTraversalProtectionModel = pathTraversalProtectionModel2;
        }
        C0VSE.LJIIIIZZ = pathTraversalProtectionModel.pathTraversalEnabled.booleanValue();
        C0VSE.LIZ = pathTraversalProtectionModel.pathTraversalInterceptEnabled.booleanValue();
        C0VSE.LIZIZ = pathTraversalProtectionModel.enableFileIntercept.booleanValue();
        C0VSE.LJII = pathTraversalProtectionModel.enableContentResolverIntercept.booleanValue();
        C0VSE.LJ = pathTraversalProtectionModel.enableFileReaderIntercept.booleanValue();
        C0VSE.LJFF = pathTraversalProtectionModel.enableFileWriterIntercept.booleanValue();
        C0VSE.LIZJ = pathTraversalProtectionModel.enableFileInputStreamIntercept.booleanValue();
        C0VSE.LIZLLL = pathTraversalProtectionModel.enableFileOutputStreamIntercept.booleanValue();
        C0VSE.LJI = pathTraversalProtectionModel.enableZipFileIntercept.booleanValue();
    }
}
