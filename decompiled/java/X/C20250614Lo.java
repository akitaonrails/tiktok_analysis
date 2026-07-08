package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: renamed from: X.14Lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20250614Lo {
    public static void LIZIZ(Context context, String str, Locale locale) {
        Context contextN3;
        if (context == null) {
            return;
        }
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, null);
        if (!(context instanceof Application) && (contextN3 = C786410Ut5.N3(context)) != null) {
            Resources resources2 = contextN3.getResources();
            Configuration configuration2 = resources2.getConfiguration();
            configuration2.setLocale(locale);
            resources2.updateConfiguration(configuration2, null);
        }
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        String strLIZIZ = C837920Wty.LIZIZ(locale);
        if (TextUtils.isEmpty(strLIZIZ)) {
            strLIZIZ = C837920Wty.LIZIZ(Resources.getSystem().getConfiguration().locale);
        }
        C20251014Ls.LIZIZ(context, "key_current_region", strLIZIZ);
        C20251014Ls.LIZIZ(context, "pref_language_key", C786410Ut5.t2(locale));
        if (!TextUtils.isEmpty(str)) {
            C20251014Ls.LIZIZ(context, "key_current_locale", str);
        }
    }

    public static void LIZ(final Context context, Locale locale, String str, boolean z, final C20250814Lq c20250814Lq) {
        if (locale.equals(context.getResources().getConfiguration().locale)) {
            if (c20250814Lq != null) {
                c20250814Lq.A();
                return;
            }
            return;
        }
        if (z && C20250914Lr.LIZJ) {
            C20250914Lr.LIZIZ.getClass();
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService != null) {
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LJFF = new Locale(C786410Ut5.t2(locale));
                c844020X9c.LIZIZ = false;
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.14Lp
                    public final WeakReference<Context> LIZ;

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str2, boolean z2) {
                    }

                    {
                        this.LIZ = new WeakReference<>(context);
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str2, boolean z2) {
                        InterfaceC20251114Lt interfaceC20251114Lt;
                        if (this.LIZ.get() != null && !z2 && (interfaceC20251114Lt = c20250814Lq) != null) {
                            interfaceC20251114Lt.A();
                        }
                    }
                };
                iPluginService.LJJI(new C202068144s(c844020X9c));
                return;
            }
            return;
        }
        LIZIZ(context, str, locale);
        if (c20250814Lq != null) {
            c20250814Lq.A();
        }
    }
}
