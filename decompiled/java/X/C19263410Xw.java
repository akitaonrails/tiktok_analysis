package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.story.widget.IStoryWidgetService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.10Xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19263410Xw implements InterfaceC0274007k {
    @Override // X.InterfaceC0274007k
    public void onEvent(Map<String, String> map) {
        map.putAll(((IStoryWidgetService) ServiceManager.get().getService(IStoryWidgetService.class)).LIZJ());
        try {
            if (((Boolean) C259770AFz.LIZ.getValue()).booleanValue()) {
                StringBuilder sb = new StringBuilder();
                I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
                if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
                    I18nManagerServiceApi i18nManagerServiceApiLIZ = i18nServiceApi.LIZ();
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ();
                    List listLJIILL = i18nManagerServiceApiLIZ.LJIILL();
                    map.put("app_locale", i18nServiceApi.LIZ().LJIILJJIL(C844470XAv.LIZ()));
                    if (listLJIILL != null) {
                        Locale locale = (Locale) listLJIILL.get(0);
                        sb.append(C786410Ut5.t2(locale));
                        if (!TextUtils.isEmpty(locale.getScript())) {
                            sb.append("-");
                            sb.append(locale.getScript());
                        }
                        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
                        String strLIZIZ = C837920Wty.LIZIZ(locale);
                        if (!TextUtils.isEmpty(strLIZIZ)) {
                            sb.append("-");
                            sb.append(strLIZIZ);
                        }
                    }
                }
                map.put("system_locale", sb.toString());
            }
            int i = C2273351DyX.LIZ;
            String str = "default";
            if (i == 1) {
                str = "toast";
            } else if (i == 3) {
                str = "silent";
            } else if (i == 2) {
                str = "push";
            }
            map.put("lang_update_user_type", str);
            map.put("is_auto_updated", String.valueOf(C2273351DyX.LJ.getInt("language_is_auto_change", 0)));
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);
            if (iUnKnownOwnershipBusinessOuterService != null) {
                map.put("previous_lang", iUnKnownOwnershipBusinessOuterService.LJIILJJIL());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C20684915wt.LJFF("launch_log", map);
    }
}
