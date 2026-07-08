package X;

import Y.AObjectS57S0000000_4;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.setting.IShareSettingApi;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;

/* JADX INFO: renamed from: X.0CPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313130CPf implements WeakHandler.IHandler {
    public static C313130CPf LLILZ;
    public final C01GW<IShareSettingApi> LL;
    public final WeakHandler LLILLJJLI;
    public ShareSettings LLILLL;

    public static C313130CPf LIZIZ() {
        if (LLILZ == null) {
            synchronized (C313130CPf.class) {
                try {
                    if (LLILZ == null) {
                        LLILZ = new C313130CPf();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILZ;
    }

    public final Boolean LIZJ() {
        String string = C0CPW.LIZ.getString("share_setting_key", "");
        if (TextUtils.isEmpty(string)) {
            return Boolean.FALSE;
        }
        try {
            ShareSettings shareSettings = (ShareSettings) new Gson().LJII(string, ShareSettings.class);
            C621180OYa.LIZIZ.LJJZZI();
            C1374890lsl.LJI(shareSettings.sharePlatforms);
            C1374890lsl.LIZ(shareSettings.sharePlatformsMeta);
            C1374890lsl.LJFF(shareSettings.shareGifPlatforms);
            C1374890lsl.LIZLLL(shareSettings.shareActionOrderList);
            C1374890lsl.LIZIZ(shareSettings.pressActionOrderList);
            C313140CPg.LIZ = shareSettings.mutedSharePlatforms;
            C1374890lsl.LIZJ(shareSettings.quickExternalShareBtnConfig);
            C1374890lsl.LJ(shareSettings.shareEntryPlatformLists);
            this.LLILLL = shareSettings;
            C621180OYa.LIZIZ.LJJJJZI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Boolean.TRUE;
    }

    public C313130CPf() {
        C01GW<IShareSettingApi> c01gwLIZIZ = C452501pT.LIZIZ(new AObjectS57S0000000_4(0));
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = new WeakHandler(Looper.getMainLooper(), this);
        if (!((Boolean) C1852707Nl.LJFF.getValue()).booleanValue()) {
            c01gwLIZIZ.getValue();
        }
        if (((Boolean) C1852707Nl.LJ.getValue()).booleanValue()) {
            C15O7.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL).LJ(new C346480DiA(this, 0), C15O7.LJI, null);
        } else if (((Boolean) C1852707Nl.LIZLLL.getValue()).booleanValue()) {
            C15O7.LJIIIIZZ(2000L).LJ(new C346480DiA(this, 0), C15O7.LJI, null);
        } else {
            C15O7.LIZJ(new C0CPY(this));
        }
    }

    public final void LIZ(Object obj) {
        final ShareSettings shareSettings;
        if (obj instanceof Exception) {
            C15O7.LIZJ(new C0CPY(this));
            ((Throwable) obj).getMessage();
        } else if ((obj instanceof ShareSettings) && (shareSettings = (ShareSettings) obj) != null) {
            C086I.LIZIZ(shareSettings.sharePlatforms);
            C810560Vqw.LJ(new Runnable() { // from class: X.0CPX
                public final void LIZ() {
                    String json = GsonProtectorUtils.toJson(new Gson(), shareSettings);
                    SharedPreferences sharedPreferences = C0CPW.LIZ;
                    sharedPreferences.edit().putString("share_setting_key", json).commit();
                    sharedPreferences.edit().putBoolean("key_has_setting", !TextUtils.isEmpty(json)).commit();
                    C313130CPf c313130CPf = this.LLILLJJLI;
                    c313130CPf.getClass();
                    C15O7.LIZJ(new C0CPY(c313130CPf));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ShareSettingManager@f74f.setServerSetting$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ShareSettingManager@f74f.setServerSetting$1");
                }
            });
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        LIZ(HandlerHook.getMessageObj(message.obj));
    }
}
