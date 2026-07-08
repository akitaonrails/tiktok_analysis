package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.account.share.data.model.AccountShareInfo;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import realtimefeedback.IRealtimeFeedbackService;

/* JADX INFO: renamed from: X.0XGN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XGN {
    public boolean LIZ;
    public final IForceBindingAccountService LIZIZ = (IForceBindingAccountService) ServiceManager.get().getService(IForceBindingAccountService.class);

    public static void LIZ() {
        try {
            C820820WHw c820820WHw = C820820WHw.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            C844470XAv.LIZ().getPackageName();
            c820820WHw.getClass();
            C820820WHw.LIZIZ(contextLIZ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZLLL() {
        if (!((Boolean) C0ACY.LIZ.getValue()).booleanValue()) {
            return false;
        }
        final boolean zLIZ = ((AccountUserService) C0XQ7.LJFF()).LIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(zLIZ), "is_child_mode");
        C20684815ws.LJIILLIIL("device_need_reset_did", c2344009Gk.LIZ);
        C844470XAv.LIZ.getClass();
        AppLog.resetDidWhenSwitchChildMode(C844470XAv.LIZ(), zLIZ, Mp4ScreenVideoLoadTimeout.CONTROL, new InterfaceC2211211BgV() { // from class: X.0XGK
            @Override // X.InterfaceC2211211BgV
            public final void LIZ() {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJ(Boolean.FALSE, "is_success");
                c2344009Gk2.LJ(Boolean.valueOf(zLIZ), "is_child_mode");
                C20684815ws.LJIILLIIL("device_need_reset_did_result", c2344009Gk2.LIZ);
            }

            @Override // X.InterfaceC2211211BgV
            public final void LIZIZ(String str, String str2) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJ(Boolean.TRUE, "is_success");
                c2344009Gk2.LJ(Boolean.valueOf(zLIZ), "is_child_mode");
                C20684815ws.LJIILLIIL("device_need_reset_did_result", c2344009Gk2.LIZ);
            }
        });
        return true;
    }

    public static void LJ() {
        List<String> urlList;
        try {
            C844470XAv.LIZ.getClass();
            C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(C844470XAv.LIZ());
            String str = "";
            if (!c0xo0LIZLLL.LLJZIJLIL) {
                C820820WHw c820820WHw = C820820WHw.LIZ;
                Context contextLIZ = C844470XAv.LIZ();
                C844470XAv.LIZ().getPackageName();
                c820820WHw.getClass();
                C820820WHw.LIZIZ(contextLIZ, "");
                return;
            }
            AccountShareInfo accountShareInfo = new AccountShareInfo();
            HashMap map = new HashMap();
            accountShareInfo.secUserId = c0xo0LIZLLL.LLJJLIIIJLLLLLLLZ;
            accountShareInfo.fromInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
            boolean z = true;
            accountShareInfo.isLogin = 1;
            accountShareInfo.appid = C844470XAv.LJIIJ;
            User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
            accountShareInfo.userName = curUser.getNickname();
            UrlModel urlModelLIZ = C848410XPz.LIZ(curUser);
            if (urlModelLIZ != null && (urlList = urlModelLIZ.getUrlList()) != null && !urlList.isEmpty()) {
                str = urlList.get(0);
            }
            accountShareInfo.userAvatar = str;
            accountShareInfo.accountType = curUser.getAccountType();
            String str2 = c0xo0LIZLLL.LLJLL;
            if (!TextUtils.isEmpty(str2)) {
                Charset charset = Charsets.UTF_8;
                accountShareInfo.userSession = Base64.encodeToString(EncryptorUtil.LIZ(str2.getBytes(charset).length, str2.getBytes(charset)), 2);
            }
            if (!c0xo0LIZLLL.LLLIIIL.LJIILL && curUser.getUserMode() != 2) {
                z = false;
            }
            accountShareInfo.isKidMode = Boolean.valueOf(z);
            map.put("region_code", C0X2A.LIZJ);
            LJFF(accountShareInfo, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C0XGN() {
        if (C848230XPh.LL.LJI()) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C15O7.LIZIZ(new Callable() { // from class: X.0XGO
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("UserModuleContext@ac18.<init>$1");
                        C848230XPh.LL.getClass();
                        C848230XPh.LJ();
                        C1C7U.LIZIZ("UserModuleContext@ac18.<init>$1");
                        return null;
                    }
                }, C823050WQl.LIZLLL(), null);
            } else {
                C848230XPh.LJ();
            }
        }
    }

    public static boolean LIZIZ(long j) {
        if ((System.currentTimeMillis() - (j * ((long) LSPassThroughRecordSizeConfig.DEFAULT))) / ((long) 3600000) <= ((IRealtimeFeedbackService) ServiceManager.get().getService(IRealtimeFeedbackService.class)).LJ() * 24) {
            return true;
        }
        return false;
    }

    public final void LIZJ(C0XO2 c0xo2) {
        String strOptString = c0xo2.LJJII.optString("bind_prompt");
        if (strOptString != null && strOptString.length() != 0) {
            Activity topActivity = ActivityStack.getTopActivity();
            try {
                IForceBindingAccountService.BindPromptConfig bindPromptConfig = (IForceBindingAccountService.BindPromptConfig) C7740030o.LIZ().getGson().LJII(strOptString, IForceBindingAccountService.BindPromptConfig.class);
                if (bindPromptConfig != null) {
                    if (topActivity instanceof C19EG) {
                        this.LIZIZ.showDialogAsColdStartPopupTask((C19EG) topActivity, bindPromptConfig);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZIZ.clearCurrentCacheConfig();
            return;
        }
        this.LIZIZ.clearCurrentCacheConfig();
    }

    public static void LJFF(AccountShareInfo accountShareInfo, Map map) {
        accountShareInfo.accountExtra = C786410Ut5.J3(new JSONObject(map));
        C820820WHw c820820WHw = C820820WHw.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        c820820WHw.getClass();
        C820820WHw.LIZIZ(contextLIZ, GsonProtectorUtils.toJson((Gson) C820820WHw.LJ.getValue(), accountShareInfo));
    }
}
