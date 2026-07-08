package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09UD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UD<R, T> implements C09SJ<R, T> {
    public static final Map<String, C09UC> LIZLLL = new ConcurrentHashMap();
    public static final C01GW<JSONObject> LJ = C452501pT.LIZIZ(new C09UE());
    public final C09SJ<R, T> LIZ;
    public final EnumC1846380y9E LIZIZ;
    public final String LIZJ;

    @Override // X.C09SJ
    public final Type LIZ() {
        return this.LIZ.LIZ();
    }

    public static final boolean LIZJ(Request request) {
        String path = request.getPath();
        boolean booleanValue = false;
        if (!LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("disable pb for path(");
            sbLIZ.append(path);
            sbLIZ.append("), because of main switch is disabled.");
            C20441214yg.LIZIZ("ttlivesdk", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("path(");
            sbLIZ2.append(path);
            sbLIZ2.append("), requestConfigs[path] : ");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL;
            sbLIZ2.append(concurrentHashMap.get(path));
            sbLIZ2.append(", SWITCHES:");
            C01GW<JSONObject> c01gw = LJ;
            sbLIZ2.append(c01gw.getValue());
            C20441214yg.LIZIZ("ttlivesdk", C2188811AlT.LIZIZ(sbLIZ2));
            C09UC c09uc = (C09UC) concurrentHashMap.get(path);
            if (c09uc != null) {
                if (!c01gw.getValue().optBoolean(c09uc.LIZ, false)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("disable pb for path(");
                    sbLIZ3.append(path);
                    sbLIZ3.append("), because of module switch is disabled.");
                    C20441214yg.LIZIZ("ttlivesdk", C2188811AlT.LIZIZ(sbLIZ3));
                    return false;
                }
                if (c09uc.LIZIZ.length() > 0) {
                    booleanValue = SettingsManager.INSTANCE.getBooleanValue(c09uc.LIZIZ, false);
                    if (!booleanValue) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("disable pb for path(");
                        sbLIZ4.append(path);
                        sbLIZ4.append("), because of ab setting for(");
                        sbLIZ4.append(c09uc.LIZIZ);
                        sbLIZ4.append(") is disabled.");
                        C20441214yg.LIZIZ("ttlivesdk", C2188811AlT.LIZIZ(sbLIZ4));
                        return booleanValue;
                    }
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("path(");
                    sbLIZ5.append(path);
                    sbLIZ5.append("), isPbEnable: true");
                    C20441214yg.LIZIZ("ttlivesdk", C2188811AlT.LIZIZ(sbLIZ5));
                    return true;
                }
            }
        }
        return booleanValue;
    }

    @Override // X.C09SJ
    public final T LIZIZ(C0X9S<R> c0x9s) {
        try {
            C09UB.LIZ(c0x9s.request(), this.LIZIZ, this.LIZJ);
            return this.LIZ.LIZIZ(c0x9s);
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            String strLIZ = C09UH.LIZ(c0x9s);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("converters is: ");
            sbLIZ.append(strLIZ);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public C09UD(C09SJ<R, T> c09sj, EnumC1846380y9E enumC1846380y9E, String str) {
        this.LIZ = c09sj;
        this.LIZIZ = enumC1846380y9E;
        this.LIZJ = str;
    }
}
