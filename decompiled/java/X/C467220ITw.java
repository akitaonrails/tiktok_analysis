package X;

import Y.ACallableS414S0100000_7;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUltraLiteModeSetting;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.ultralitemode.LiveAdaptiveLiteModeDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0ITw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467220ITw {
    public static boolean LIZIZ;
    public static WeakReference<InterfaceC466710IRx> LIZJ;
    public static int LIZLLL;
    public static C0IS1<InterfaceC466570IRj> LJ;
    public static boolean LJFF;
    public static C1389910mGz LJI;
    public static C1389910mGz LJII;
    public static C1389910mGz LJIIIIZZ;
    public static C11JL LJIIJ;
    public static boolean LJIIJJI;
    public static int LJIIL;
    public static int LJIILIIL;
    public static int LJIILJJIL;
    public static final C467220ITw LIZ = new C467220ITw();
    public static final Keva LJIIIZ = Keva.getRepo("live_ultra_lite_mode");
    public static final C01GW LJIILL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(91));
    public static final C467250ITz LJIILLIIL = new InterfaceC482090IvP() { // from class: X.0ITz
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC482090IvP
        public final void LIZ(C0IS4 c0is4) {
            int iLIZIZ;
            if (C467220ITw.LJIIJJI) {
                return;
            }
            C467220ITw.LIZ.getClass();
            Activity activityLIZ = C467220ITw.LIZ();
            if (activityLIZ == null) {
                return;
            }
            try {
                iLIZIZ = C1476920oXK.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
            if (((Number) c0is4.LIZ).intValue() > 0) {
                LiveInnerDowngradeAdaptExp liveInnerDowngradeAdaptExp = LiveInnerDowngradeAdaptExp.INSTANCE;
                if (iLIZIZ > liveInnerDowngradeAdaptExp.getExpValue().getBrightnessDowngradeUpper()) {
                    float brightnessDowngradeTarget = liveInnerDowngradeAdaptExp.getExpValue().getBrightnessDowngradeTarget();
                    WindowManager.LayoutParams attributes = activityLIZ.getWindow().getAttributes();
                    if (attributes.screenBrightness != brightnessDowngradeTarget) {
                        attributes.screenBrightness = brightnessDowngradeTarget;
                        activityLIZ.getWindow().setAttributes(attributes);
                    }
                    try {
                        activityLIZ.getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, (C467230ITx) C467220ITw.LJIILL.getValue());
                        return;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return;
                    }
                }
                TryCatchGuardChecker.doCheck(e);
                return;
            }
            C467220ITw.LIZJ(activityLIZ);
            try {
                activityLIZ.getContentResolver().unregisterContentObserver((C467230ITx) C467220ITw.LJIILL.getValue());
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    };
    public static final C469670IbN LJIIZILJ = new InterfaceC482090IvP() { // from class: X.0IbN
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC482090IvP
        public final void LIZ(C0IS4 c0is4) {
            int i;
            Activity activityLIZ;
            String strLJI;
            int i2;
            int i3;
            Activity activityLIZ2;
            String strLJI2;
            int i4;
            if (((Number) c0is4.LIZ).intValue() >= 3 && c0is4.LIZLLL == 0) {
                C467220ITw c467220ITw = C467220ITw.LIZ;
                int iIntValue = ((Number) c0is4.LIZ).intValue();
                c467220ITw.getClass();
                LiveUltraLiteModeSetting.LiveUltraLiteModeConfig value = LiveUltraLiteModeSetting.INSTANCE.getValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Keva keva = C467220ITw.LJIIIZ;
                if (jCurrentTimeMillis - keva.getLong("guide_last_show_time", 0L) >= value.getGuideToastInterval() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    if (jCurrentTimeMillis / ((long) 86400000) == keva.getLong("guide_last_show_day", 0L)) {
                        i3 = keva.getInt("guide_show_count_today", 0);
                    } else {
                        i3 = 0;
                    }
                    if (i3 < value.getGuideToastCount() && (activityLIZ2 = C467220ITw.LIZ()) != null) {
                        if (iIntValue == 3) {
                            strLJI2 = C20642515q3.LJI(2131855026);
                        } else {
                            strLJI2 = C20642515q3.LJI(2131855032);
                        }
                        C1389910mGz c1389910mGz = C467220ITw.LJII;
                        if (c1389910mGz != null) {
                            c1389910mGz.LIZJ();
                        }
                        C1389910mGz c1389910mGz2 = new C1389910mGz(activityLIZ2);
                        C467220ITw.LJII = c1389910mGz2;
                        C467220ITw.LJIILIIL = 1;
                        c1389910mGz2.LJIIJ(strLJI2);
                        c1389910mGz2.LJII(false);
                        C1360890lWB c1360890lWB = c1389910mGz2.LIZ;
                        c1360890lWB.LIZIZ = 3;
                        c1360890lWB.LIZLLL = 3;
                        c1389910mGz2.LIZ.LJ = new AwS586S0100000_7(c1389910mGz2, 327);
                        c1389910mGz2.LJ(10000L);
                        c1389910mGz2.LJI(R.style.y0);
                        c1389910mGz2.LIZLLL(AFwS193S0000000_7.get$arr$(213));
                        c1389910mGz2.LJIIJJI();
                        C469660IbM.LIZ("sug_toast");
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j = jCurrentTimeMillis2 / ((long) 86400000);
                        if (j == keva.getLong("guide_last_show_day", 0L)) {
                            i4 = keva.getInt("guide_show_count_today", 0) + 1;
                        } else {
                            i4 = 1;
                        }
                        keva.storeLong("guide_last_show_time", jCurrentTimeMillis2);
                        keva.storeLong("guide_last_show_day", j);
                        keva.storeInt("guide_show_count_today", i4);
                        return;
                    }
                    return;
                }
                return;
            }
            if (((Number) c0is4.LIZ).intValue() < 1 || c0is4.LIZLLL != 0) {
                return;
            }
            C467220ITw c467220ITw2 = C467220ITw.LIZ;
            int iIntValue2 = ((Number) c0is4.LIZ).intValue();
            c467220ITw2.getClass();
            LiveUltraLiteModeSetting.LiveUltraLiteModeConfig value2 = LiveUltraLiteModeSetting.INSTANCE.getValue();
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            Keva keva2 = C467220ITw.LJIIIZ;
            if (jCurrentTimeMillis3 - keva2.getLong("last_show_time", 0L) < value2.getAutoToastInterval() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                return;
            }
            if (jCurrentTimeMillis3 / ((long) 86400000) == keva2.getLong("last_show_day", 0L)) {
                i = keva2.getInt("show_count_today", 0);
            } else {
                i = 0;
            }
            if (i >= value2.getAutoToastCount() || (activityLIZ = C467220ITw.LIZ()) == null) {
                return;
            }
            if (iIntValue2 == 1) {
                strLJI = C20642515q3.LJI(2131855025);
            } else {
                strLJI = C20642515q3.LJI(2131855031);
            }
            C467220ITw.LJIIL = 1;
            C1389910mGz c1389910mGz3 = C467220ITw.LJI;
            if (c1389910mGz3 != null) {
                c1389910mGz3.LIZJ();
            }
            C1389910mGz c1389910mGz4 = new C1389910mGz(activityLIZ);
            c1389910mGz4.LJIIJ(strLJI);
            C1360890lWB c1360890lWB2 = c1389910mGz4.LIZ;
            c1360890lWB2.LIZIZ = 3;
            c1360890lWB2.LIZLLL = 0;
            c1389910mGz4.LJ(Mp4ScreenVideoLoadTimeout.CONTROL);
            c1389910mGz4.LJII(false);
            c1389910mGz4.LJI(R.style.y0);
            c1389910mGz4.LIZ.LJIIIIZZ = new View.OnClickListener() { // from class: X.0Ieo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataChannel dataChannelProvideDataChannel;
                    InterfaceC466710IRx interfaceC466710IRx;
                    C467220ITw.LJIIL = 3;
                    C467220ITw.LIZ.getClass();
                    Keva keva3 = C467220ITw.LJIIIZ;
                    if (keva3.getBoolean("has_guide_to_share_panel", false)) {
                        C467220ITw.LIZLLL("notification_toast");
                        return;
                    }
                    C467220ITw.LJFF = true;
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    WeakReference<InterfaceC466710IRx> weakReference = C467220ITw.LIZJ;
                    String str = null;
                    if (weakReference != null && (interfaceC466710IRx = weakReference.get()) != null) {
                        dataChannelProvideDataChannel = interfaceC466710IRx.provideDataChannel();
                    } else {
                        dataChannelProvideDataChannel = null;
                    }
                    if (room == null || dataChannelProvideDataChannel == null) {
                        return;
                    }
                    C1106200etO c1106200etOLJII = C481180Itw.LJII(room, dataChannelProvideDataChannel, C481180Itw.LIZIZ(room.getOwner()), "live_room_share_button", new HashMap());
                    AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII = C0IXW.LJII(dataChannelProvideDataChannel);
                    if (adLiveEnterRoomConfigLJII != null) {
                        str = adLiveEnterRoomConfigLJII.aid;
                    }
                    c1106200etOLJII.LJJIJL = str;
                    c1106200etOLJII.LJJIZ = C0IXW.LIZLLL(dataChannelProvideDataChannel);
                    c1106200etOLJII.LJJJ = C0IXW.LJII(dataChannelProvideDataChannel);
                    c1106200etOLJII.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
                    c1106200etOLJII.LIZ(Boolean.TRUE, "show_cancel");
                    c1106200etOLJII.LJJLIIJ = "live_ultra_lite_perf_mode";
                    C1106210etP c1106210etP = new C1106210etP(c1106200etOLJII);
                    Activity activityLIZ3 = C467220ITw.LIZ();
                    if (activityLIZ3 != null) {
                        ((IShareService) C1161920gLG.LIZJ(IShareService.class)).jR0(activityLIZ3, c1106210etP, new InterfaceC1372610lp5() { // from class: X.0Iep
                            @Override // X.InterfaceC1372610lp5
                            public final void LIZ(Throwable th) {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final /* synthetic */ void LIZIZ(HashMap map) {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final void LIZJ(String str2, String str3, Bundle bundle) {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final /* synthetic */ void LIZLLL(HashMap map) {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final /* synthetic */ void LJ(HashMap map) {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final /* synthetic */ void LJFF(Dialog dialog) {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final /* synthetic */ void LJI(Dialog dialog) {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final /* synthetic */ void LJII() {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final /* synthetic */ void onDismiss() {
                            }

                            @Override // X.InterfaceC1372610lp5
                            public final /* synthetic */ void onShow(int i5) {
                            }
                        });
                    }
                    keva3.storeBoolean("has_guide_to_share_panel", true);
                }
            };
            c1389910mGz4.LIZLLL(AFwS193S0000000_7.get$arr$(214));
            C467220ITw.LJI = c1389910mGz4;
            c1389910mGz4.LJIIJJI();
            C469660IbM.LIZ("notification_toast");
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis4 / ((long) 86400000);
            if (j2 == keva2.getLong("last_show_day", 0L)) {
                i2 = keva2.getInt("show_count_today", 0) + 1;
            } else {
                i2 = 1;
            }
            keva2.storeLong("last_show_time", jCurrentTimeMillis4);
            keva2.storeLong("last_show_day", j2);
            keva2.storeInt("show_count_today", i2);
        }
    };
    public static final C466720IRy LJIJ = new InterfaceC482090IvP() { // from class: X.0IRy
        @Override // X.InterfaceC482090IvP
        public final void LIZ(C0IS4 c0is4) {
            if (c0is4.LJ) {
                return;
            }
            AbstractC19484711Kz.LJIJI(new ACallableS414S0100000_7(c0is4, 6)).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.0IRz
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveUltraLiteModeManager@c4c7.playerDowngradeAction$1$onDowngradeStatusChanged$2");
                    C1C7U.LIZIZ("LiveUltraLiteModeManager@c4c7.playerDowngradeAction$1$onDowngradeStatusChanged$2");
                }
            }, new C09JN() { // from class: X.0IS0
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveUltraLiteModeManager@c4c7.playerDowngradeAction$1$onDowngradeStatusChanged$3");
                    C1C7U.LIZIZ("LiveUltraLiteModeManager@c4c7.playerDowngradeAction$1$onDowngradeStatusChanged$3");
                }
            });
        }
    };
    public static final C467170ITr LJIJI = new InterfaceC482090IvP() { // from class: X.0ITr
        @Override // X.InterfaceC482090IvP
        public final void LIZ(C0IS4 c0is4) {
            int defaultAutoSwitch;
            String str;
            ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
            if (iLiveFeatureCenterService == null) {
                return;
            }
            C0J0Q c0j0q = C0J0Q.APP;
            iLiveFeatureCenterService.bg(c0j0q, "live_perf_health_status", c0is4.LIZ, "epi", false);
            C467220ITw.LIZ.getClass();
            C1090000eTG c1090000eTGO3 = ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).O3(EnumC1094630eaj.DEFAULT, "live_mode_setting", "ultra_lite_mode");
            if (c1090000eTGO3 != null) {
                try {
                    Object obj = c1090000eTGO3.LIZJ;
                    if ((obj instanceof String) && (str = (String) obj) != null) {
                        defaultAutoSwitch = CastIntegerProtector.parseInt(str);
                    } else {
                        defaultAutoSwitch = LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    defaultAutoSwitch = LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch();
                }
            } else {
                defaultAutoSwitch = LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch();
            }
            iLiveFeatureCenterService.bg(c0j0q, "live_adaptive_lite_mode_status", Integer.valueOf(defaultAutoSwitch), "epi", false);
        }
    };

    public static Activity LIZ() {
        AbstractC1387200mCc topPage = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopPage();
        Activity activityLIZIZ = topPage != null ? topPage.LIZIZ() : null;
        if (activityLIZIZ instanceof Activity) {
            return activityLIZIZ;
        }
        return null;
    }

    public static void LIZIZ(boolean z) {
        if (LJIIL == 1) {
            LJIIL = 2;
            C469660IbM.LIZIZ("notification_toast");
        }
        if (LJIILIIL == 1) {
            LJIILIIL = 2;
            C469660IbM.LIZIZ("sug_toast");
        }
        if (LJIILJJIL == 1) {
            LJIILJJIL = 2;
            C469660IbM.LIZIZ("confirm_toast");
        }
        if (z) {
            C1389910mGz c1389910mGz = LJI;
            if (c1389910mGz != null) {
                c1389910mGz.LIZJ();
            }
            C1389910mGz c1389910mGz2 = LJII;
            if (c1389910mGz2 != null) {
                c1389910mGz2.LIZJ();
            }
            C1389910mGz c1389910mGz3 = LJIIIIZZ;
            if (c1389910mGz3 != null) {
                c1389910mGz3.LIZJ();
            }
            LJI = null;
            LJII = null;
            LJIIIIZZ = null;
        }
    }

    public static void LIZJ(Activity activity) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            if (attributes.screenBrightness != -1.0f) {
                attributes.screenBrightness = -1.0f;
                activity.getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(String str) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Activity activityLIZ = LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            LiveAdaptiveLiteModeDialog liveAdaptiveLiteModeDialog = new LiveAdaptiveLiteModeDialog();
            liveAdaptiveLiteModeDialog.LLILLJJLI = str;
            liveAdaptiveLiteModeDialog.show(supportFragmentManager, "LiveAdaptiveLiteModeDialog");
        }
    }
}
