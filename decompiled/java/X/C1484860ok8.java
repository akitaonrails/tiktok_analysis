package X;

import android.app.Application;
import android.content.res.Resources;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: renamed from: X.0ok8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484860ok8 {
    public RateSettingsResponse LIZ;
    public RateSettingsResponse LIZIZ;

    public final synchronized RateSettingsResponse LIZ() {
        if (this.LIZ == null) {
            RateSettingsResponse rateSettingsResponse = C582130MsN.LIZ().getConfig().getCommonConfig().getRateSettingsResponse();
            if (rateSettingsResponse == null) {
                return LIZIZ();
            }
            this.LIZ = rateSettingsResponse;
        }
        return this.LIZ;
    }

    public final RateSettingsResponse LIZIZ() {
        String str;
        if (this.LIZIZ == null) {
            RateSettingsResponse defaultRateSettingsResponse = C582130MsN.LIZ().getConfig().getCommonConfig().getDefaultRateSettingsResponse();
            this.LIZIZ = defaultRateSettingsResponse;
            if (defaultRateSettingsResponse == null) {
                Application application = C1475000oUE.LIZ;
                Locale locale = Resources.getSystem().getConfiguration().locale;
                LruCache<Integer, String> lruCache = C0SRQ.LIZ;
                String strLIZIZ = C837920Wty.LIZIZ(locale);
                String lowerCase = C2280621EOm.LIZIZ.contains(strLIZIZ) ? "ng" : C2280621EOm.LIZ.contains(strLIZIZ) ? strLIZIZ.toLowerCase() : C2280621EOm.LIZJ.contains(strLIZIZ) ? "pe" : "other";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("simkit_rate_settings/");
                sbLIZ.append(lowerCase);
                sbLIZ.append(".json");
                try {
                    InputStream inputStreamOpen = application.getAssets().open(C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        str = new String(bArr, "UTF-8");
                        inputStreamOpen.close();
                    } finally {
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    str = null;
                }
                this.LIZIZ = (RateSettingsResponse) GsonProtectorUtils.fromJson(new Gson(), str, new TypeToken<RateSettingsResponse>() { // from class: X.0ok9
                }.getType());
            }
        }
        return this.LIZIZ;
    }
}
