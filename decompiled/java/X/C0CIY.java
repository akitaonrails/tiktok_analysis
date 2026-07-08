package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.internal.s;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CIY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIY extends C09AY implements Function0<SearchSecurityControlValue> {
    public C0CIY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchSecurityControlValue invoke() {
        SearchSecurityControlConfig.LIZ.getClass();
        try {
            HashMap map = (HashMap) SettingsManager.LIZLLL().LJIIIIZZ("tiktok_search", HashMap.class, SearchSecurityControlConfig.LIZIZ);
            if (map == null || !map.containsKey("tiktok_search_security_control")) {
                return new SearchSecurityControlValue(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            }
            s sVar = (s) map.get("tiktok_search_security_control");
            Gson gson = SearchSecurityControlConfig.LIZJ;
            SearchSecurityControlValue searchSecurityControlValue = (SearchSecurityControlValue) gson.LJIIIIZZ(gson.LJIILL(sVar), new TypeToken<SearchSecurityControlValue>() { // from class: X.0CIb
            }.getType());
            return searchSecurityControlValue == null ? new SearchSecurityControlValue(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false) : searchSecurityControlValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new SearchSecurityControlValue(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        }
    }
}
