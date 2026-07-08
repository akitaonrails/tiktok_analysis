package X;

import Y.ARunnableS111S0100000_11;
import android.R;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.LogoSpotlightInfo;
import com.ss.android.ugc.aweme.commercialize.model.LogoSpotlightVideoModel;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel;
import com.ss.android.ugc.aweme.model.AnoleMultiContentModel;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0cva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030680cva {
    public static String LIZIZ;
    public static boolean LIZLLL;
    public static volatile boolean LJFF;
    public static String LJI;
    public static Long LJII;
    public static String LJIIIIZZ;
    public static volatile boolean LJIIJ;
    public static String LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static boolean LJIILJJIL;
    public static long LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static boolean LJIJ;
    public static volatile boolean LJIJI;
    public static volatile String LJIJJ;
    public static volatile boolean LJIJJLI;
    public static final C1030680cva LIZ = new C1030680cva();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1030700cvc());
    public static volatile boolean LJ = true;
    public static volatile boolean LJIIIZ = true;

    public static final boolean LJIIJ(int i) {
        return i == 5 || i == 6 || i == 7;
    }

    public static final String LJ() {
        if (((Boolean) C0A3P.LIZ.getValue()).booleanValue()) {
            try {
                if (LIZIZ == null) {
                    C844470XAv.LIZ.getClass();
                    String absolutePath = LIZ(C844470XAv.LIZ()).getAbsolutePath();
                    if (absolutePath == null) {
                        absolutePath = "";
                    }
                    LIZIZ = absolutePath;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(LIZIZ);
                    sbLIZ.append("/commercialize/topview/");
                    LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (C123100dR.LIZ(LIZIZ)) {
                    return LIZIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(new C2215208m6("y+6T0e/qfIqkZDbYHfFiN/8XI5L6pbEB5d+bZ2FLxi1E6LD99U2nNfzcaGWObA==").getAbsolutePath());
        sbLIZ2.append(File.separator);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final boolean LJIIIZ() {
        if (!TextUtils.isEmpty(LJIIJJI)) {
            return true;
        }
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("no TopView id", null);
        return false;
    }

    public static final ISplashAdService LIZLLL() {
        return (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static final boolean LJFF(Aweme aweme) {
        Video video;
        VideoUrlModel playAddr;
        String aKVar = null;
        if (aweme != null && (video = aweme.getVideo()) != null && (playAddr = video.getPlayAddr()) != null) {
            aKVar = playAddr.getaK();
        }
        return C123100dR.LIZ(aKVar);
    }

    public static final boolean LJIIJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null) {
            return false;
        }
        return C123100dR.LIZ(splashInfo.getAwesomeSplashId());
    }

    public static final boolean LJIIL(AwemeRawAd awemeRawAd) {
        AwemeSplashInfo splashInfo;
        if (awemeRawAd != null && (splashInfo = awemeRawAd.getSplashInfo()) != null) {
            return C123100dR.LIZ(splashInfo.getAwesomeSplashId());
        }
        return false;
    }

    public static final boolean LJIILIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || !C123100dR.LIZ(splashInfo.getAwesomeSplashId()) || splashInfo.isShown() || LJIJ(aweme)) {
            return false;
        }
        return true;
    }

    public static final void LJIIZILJ(Intent intent) {
        boolean z = false;
        if (intent != null) {
            LIZ.getClass();
            if (TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER")) {
                z = true;
            }
        }
        LJFF = z;
    }

    public static final boolean LJIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (!LJ || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || !splashInfo.isSkipOpenScreen()) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(Aweme aweme, String str) {
        boolean z;
        VideoUrlModel playAddr;
        Video video;
        VideoUrlModel playAddr3DFallback;
        AdStyleActionModel adStyleActionModel;
        LogoSpotlightInfo logoSpotlightInfo;
        LogoSpotlightVideoModel spotlightVideoModel;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AnoleComponentModel anoleComponentModel;
        List<AnoleMultiContentItemModel> contentList;
        String vid;
        boolean z2;
        if (200 == aweme.getAwemeType()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && !map.isEmpty() && (anoleComponentModel = map.get(EnumC1008920cMU.MULTI_CONTENT.getType())) != null) {
                C1227904rF.LIZ.getClass();
                AnoleMultiContentModel anoleMultiContentModel = (AnoleMultiContentModel) anoleComponentModel.parseDataToStructure(C1227904rF.LIZLLL(), AnoleMultiContentModel.class, null);
                if (anoleMultiContentModel != null && (contentList = anoleMultiContentModel.getContentList()) != null && !contentList.isEmpty()) {
                    for (AnoleMultiContentItemModel anoleMultiContentItemModel : contentList) {
                        if (anoleMultiContentItemModel != null && (vid = anoleMultiContentItemModel.getVid()) != null && vid.length() != 0) {
                            String playerAccessKey = anoleMultiContentItemModel.getPlayerAccessKey();
                            if (playerAccessKey != null && playerAccessKey.length() != 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            boolean z3 = !z2;
                            String strLJIIIIZZ = LJIIIIZZ(anoleMultiContentItemModel.getVid(), null, z3, false);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(strLJIIIIZZ);
                            LJIILL(C2188811AlT.LIZIZ(sbLIZ), null, z3);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (adStyleActionModel = awemeRawAd2.getAdStyleActionModel()) != null && (logoSpotlightInfo = adStyleActionModel.logoSpotlightInfo) != null && (spotlightVideoModel = logoSpotlightInfo.getSpotlightVideoModel()) != null) {
            LIZ.getClass();
            C1046940dLo.LIZ.getClass();
            VideoUrlModel videoUrlModelLIZ = C1046940dLo.LIZ(spotlightVideoModel);
            if (videoUrlModelLIZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("delete spotlight video: ");
                sbLIZ2.append(videoUrlModelLIZ);
                sbLIZ2.append(".urlKey");
                C2188811AlT.LIZIZ(sbLIZ2);
                LIZJ(videoUrlModelLIZ, str);
            }
        }
        Video video2 = aweme.getVideo();
        if (video2 != null && (playAddr = video2.getPlayAddr()) != null) {
            LIZJ(playAddr, str);
            Video video3 = aweme.getVideo();
            if (video3 != null && video3.is3DVideo() && (video = aweme.getVideo()) != null && (playAddr3DFallback = video.getPlayAddr3DFallback()) != null) {
                LIZJ(playAddr3DFallback, str);
            }
            ISplashAdService iSplashAdService = (ISplashAdService) PluggableExtentionKt.pluggableSpi$default(ISplashAdService.class, false, false, false, 14, null);
            if (iSplashAdService != null) {
                iSplashAdService.LJJIIZ(aweme);
            }
        }
    }

    public static final void LIZJ(VideoUrlModel videoUrlModel, String str) {
        String urlKey = videoUrlModel.getUrlKey();
        boolean zLIZ = C123100dR.LIZ(videoUrlModel.getaK());
        if (!TextUtils.isEmpty(urlKey) && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(urlKey);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (zLIZ) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("topview_video_encrypt_check", false)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("_encrypt");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (c0vsj.exists() && c0vsj.isFile()) {
                boolean zDelete = c0vsj.delete();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("delete video name=");
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(", result=");
                sbLIZ3.append(zDelete);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (zDelete && !zLIZ) {
                    return;
                }
            }
            String fileHash = videoUrlModel.getFileHash();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append('_');
            sbLIZ4.append(fileHash);
            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4));
            if (c0vsj2.exists() && c0vsj2.isFile()) {
                boolean zDelete2 = c0vsj2.delete();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("delete video name=");
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append('_');
                sbLIZ5.append(fileHash);
                sbLIZ5.append(", result=");
                sbLIZ5.append(zDelete2);
                C2188811AlT.LIZIZ(sbLIZ5);
            }
        }
    }

    public static final void LJIILLIIL(C19EG c19eg, boolean z) {
        if (c19eg == null) {
            return;
        }
        if (z) {
            if (LJIIZILJ) {
                return;
            } else {
                LJIIZILJ = true;
            }
        }
        ViewGroup viewGroup = (ViewGroup) c19eg.findViewById(R.id.content);
        if (viewGroup != null) {
            C786410Ut5.R4(1.0f, viewGroup);
        }
        c19eg.getWindow().addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT < 35) {
            c19eg.getWindow().getDecorView().setBackgroundResource(com.zhiliaoapp.musically.R.drawable.al5);
        }
        c19eg.getWindow().clearFlags(1024);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("awesome_splash", "recoveryTheme");
    }

    public static final String LJI(String str, String str2, boolean z) {
        boolean zLJI = MethodIDManager.LJI(202292);
        String strLJII = LJII(str, str2, z, true);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return strLJII;
    }

    public static final void LJIILJJIL(Aweme aweme, int i, View... viewArr) {
        int i2 = 0;
        if (viewArr.length == 0) {
            return;
        }
        if (LJIJ(aweme)) {
            for (View view : viewArr) {
                if (view != null && view.getVisibility() != 8) {
                    C786410Ut5.LJLLLLLL(0, view);
                    C786410Ut5.T4(view, 1.0f);
                }
            }
            return;
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    for (View view2 : viewArr) {
                        if (view2 != null && view2.getVisibility() != 8) {
                            C786410Ut5.LJLLLLLL(0, view2);
                            C786410Ut5.T4(view2, 1.0f);
                        }
                    }
                    return;
                }
                return;
            }
            int length = viewArr.length;
            while (i2 < length) {
                View view3 = viewArr[i2];
                if (view3 != null && view3.getVisibility() != 8) {
                    LIZ.getClass();
                    HandlerHook.viewPostDelay(view3, new ARunnableS111S0100000_11(view3, 111), 260L);
                }
                i2++;
            }
            return;
        }
        int length2 = viewArr.length;
        while (i2 < length2) {
            View view4 = viewArr[i2];
            if (view4 != null && view4.getVisibility() != 8) {
                C2180521AVm.LIZLLL(view4, 4, C1AV3.LIZ(2, "AD", null, "topviewhelper"));
            }
            i2++;
        }
    }

    public static final void LJIILL(String str, String str2, boolean z) {
        if (str != null && str.length() != 0) {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                if (c0vsj.exists() && c0vsj.isFile()) {
                    c0vsj.delete();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("delete video name=");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                if (!z) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('_');
                sbLIZ2.append(str2);
                C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
                if (c0vsj2.exists() && c0vsj2.isFile()) {
                    c0vsj2.delete();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("delete video name=");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" _");
                    sbLIZ3.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final String LJII(String str, String str2, boolean z, boolean z2) {
        boolean z3;
        String strLIZIZ;
        String strLIZIZ2;
        String str3;
        boolean zLJI = MethodIDManager.LJI(202292);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTopViewPath_");
        sbLIZ.append("urlKey=");
        sbLIZ.append(str);
        sbLIZ.append(", needCheck=");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null && str.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        String str4 = null;
        if (z3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getTopViewPath_");
            sbLIZ2.append("urlKey isEmpty return null");
            C2188811AlT.LIZIZ(sbLIZ2);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return null;
        }
        LIZ.getClass();
        C01GW c01gw = LIZJ;
        c01gw.getValue().getClass();
        C01GW c01gw2 = C0A3G.LIZ;
        if (((Boolean) c01gw2.getValue()).booleanValue()) {
            if (z2 && !((C1030690cvb) c01gw.getValue()).LIZ(str)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getTopViewPath_");
                sbLIZ3.append("no topview return null");
                C2188811AlT.LIZIZ(sbLIZ3);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return null;
            }
            C1030690cvb c1030690cvb = (C1030690cvb) c01gw.getValue();
            c1030690cvb.getClass();
            if (((Boolean) c01gw2.getValue()).booleanValue() && !c1030690cvb.LIZ.isEmpty() && c1030690cvb.LIZ.contains(str)) {
                C1030690cvb c1030690cvb2 = (C1030690cvb) c01gw.getValue();
                if (c1030690cvb2.LIZ(str) && !c1030690cvb2.LIZIZ.isEmpty()) {
                    str4 = c1030690cvb2.LIZIZ.get(str);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("getTopViewPath_");
                sbLIZ4.append("return cached path=");
                sbLIZ4.append(str4);
                C2188811AlT.LIZIZ(sbLIZ4);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return str4;
            }
        }
        String strLJ = LJ();
        if (TextUtils.isEmpty(strLJ)) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("get topview path videoId=");
            sbLIZ5.append(strLJ);
            sbLIZ5.append(", saved path is empty");
            C2188811AlT.LIZIZ(sbLIZ5);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return null;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLJ);
        sbLIZ6.append(str);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
        if (z) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("topview_video_encrypt_check", false)) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(strLIZIZ3);
                sbLIZ7.append("_encrypt");
                strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
            }
        }
        if (((Boolean) C0A3I.LIZ.getValue()).booleanValue()) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("localPath_");
            sbLIZ8.append("opt_");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(strLIZIZ3);
            sbLIZ9.append('_');
            sbLIZ9.append(str2);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ9);
            if (new C0VSJ(strLIZIZ2).exists()) {
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append(strLIZIZ);
                sbLIZ10.append(strLIZIZ2);
                C2188811AlT.LIZIZ(sbLIZ10);
                str4 = strLIZIZ2;
            } else {
                if (new C0VSJ(strLIZIZ3).exists()) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(strLIZIZ);
                    sbLIZ11.append(strLIZIZ3);
                    C2188811AlT.LIZIZ(sbLIZ11);
                    str4 = strLIZIZ3;
                }
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append(strLIZIZ);
                sbLIZ12.append("path=null");
                C2188811AlT.LIZIZ(sbLIZ12);
            }
        } else {
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("localPath_");
            sbLIZ13.append("normal_");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ13);
            if (new C0VSJ(strLIZIZ3).exists()) {
                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                sbLIZ14.append(strLIZIZ);
                sbLIZ14.append(strLIZIZ3);
                C2188811AlT.LIZIZ(sbLIZ14);
                str4 = strLIZIZ3;
            } else {
                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                sbLIZ15.append(strLIZIZ3);
                sbLIZ15.append('_');
                sbLIZ15.append(str2);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ15);
                if (new C0VSJ(strLIZIZ2).exists()) {
                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                    sbLIZ16.append(strLIZIZ);
                    sbLIZ16.append(strLIZIZ2);
                    C2188811AlT.LIZIZ(sbLIZ16);
                    str4 = strLIZIZ2;
                }
                StringBuilder sbLIZ122 = C2188811AlT.LIZ();
                sbLIZ122.append(strLIZIZ);
                sbLIZ122.append("path=null");
                C2188811AlT.LIZIZ(sbLIZ122);
            }
        }
        C1030690cvb c1030690cvb3 = (C1030690cvb) c01gw.getValue();
        c1030690cvb3.getClass();
        if (((Boolean) c01gw2.getValue()).booleanValue()) {
            c1030690cvb3.LIZ.add(str);
            ConcurrentHashMap<String, String> concurrentHashMap = c1030690cvb3.LIZIZ;
            if (str4 == null) {
                str3 = "";
            } else {
                str3 = str4;
            }
            concurrentHashMap.put(str, str3);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return str4;
    }

    public static final String LJIIIIZZ(String str, String str2, boolean z, boolean z2) {
        if (str != null && str.length() != 0) {
            if (z) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("topview_video_encrypt_check", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("_encrypt");
                    str = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            if (z2 && ((Boolean) C0A3I.LIZ.getValue()).booleanValue()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('_');
                sbLIZ2.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            return str;
        }
        return null;
    }
}
