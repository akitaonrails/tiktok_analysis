package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcomGylSchemaMapModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcomGylSchemaModel;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.18Np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21275118Np {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        EcomGylSchemaModel ecomGylSchemaModel;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcomGylSchemaMapModel ecomGylSchemaMapModel = C18OV.LIZ;
            EcomGylSchemaMapModel ecomGylSchemaMapModel2 = (EcomGylSchemaMapModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_gyl_schema_map", EcomGylSchemaMapModel.class, ecomGylSchemaMapModel);
            if (ecomGylSchemaMapModel2 != null) {
                ecomGylSchemaMapModel = ecomGylSchemaMapModel2;
            }
            if (ecomGylSchemaMapModel == null || (ecomGylSchemaModel = ecomGylSchemaMapModel.videoAnchorGuessYouLike) == null) {
                return null;
            }
            return ecomGylSchemaModel.schema;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
