package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.SchemaDiffConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Bwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C304540Bwi {
    public static final SchemaDiffConfig LIZ = new SchemaDiffConfig(false, new ArrayList(), new ArrayList());

    public static SchemaDiffConfig LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            SchemaDiffConfig schemaDiffConfig = LIZ;
            SchemaDiffConfig schemaDiffConfig2 = (SchemaDiffConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_schema_diff_setting", SchemaDiffConfig.class, schemaDiffConfig);
            return schemaDiffConfig2 != null ? schemaDiffConfig2 : schemaDiffConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
