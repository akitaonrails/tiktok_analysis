package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import lth.o;

/* JADX INFO: renamed from: X.0TS9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TS9 {
    public static final C0TS9 LIZ = new C0TS9();

    public static final void LIZ(Context context, String str) {
        try {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_method", str);
            C20684815ws.LJIILLIIL("enter_music_usage_confimation", c0lab.LIZ);
            AdFeSettings adFeSettings = C0CLW.LIZIZ.LIZ.getAdFeSettings();
            if (adFeSettings == null) {
                return;
            }
            String musicLegalPage = adFeSettings.getMusicLegalPage();
            String string = context.getResources().getString(2131844981);
            if (!TextUtils.isEmpty(musicLegalPage)) {
                ((C1465270oEX) o.LJIIIZ).getClass();
                ((ICommercializeFromMainOutService) PluggableExtentionKt.pluggableSpi(ICommercializeFromMainOutService.class)).openAdWebUrl(context, musicLegalPage, string);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
