package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.experiment.ImageMonitorByAppLogConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330550kjF {
    public static void LIZ() {
        int i = C1332140klo.LIZ;
        C1328520kfy.LJII = false;
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (!c2213981Bky.isOffline() && C2222891BzL.LIZ.LJIILIIL()) {
            C1320840kTa.LIZJ = false;
        }
        C1328570kg3.LIZ = new InterfaceC1328930kgd() { // from class: X.0W1Z
            public int LIZ = 5;

            public static boolean LJ(CharSequence charSequence) {
                if (charSequence != null && charSequence.length() != 0) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1328930kgd
            public final boolean LIZIZ(int i2) {
                if (this.LIZ <= i2) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1328930kgd
            public final void LIZJ(int i2) {
                this.LIZ = i2;
            }

            @Override // X.InterfaceC1328930kgd
            public final void i(String str) {
                LJFF("BMFSR", str);
                LJII(4, "BMFSR", str);
            }

            public static final void LJFF(String str, String str2) {
                if (!LJ(str)) {
                    LJ(str2);
                }
            }

            @Override // X.InterfaceC1328930kgd
            public final void LIZ(String str, Throwable th) {
                LJI(str, "unhandled exception", th);
                LJII(6, str, "unhandled exception");
            }

            @Override // X.InterfaceC1328930kgd
            public final void LIZLLL(String str, String str2) {
                LJFF(str, str2);
                LJII(6, str, str2);
            }

            @Override // X.InterfaceC1328930kgd
            public final void d(String str, String str2) {
                LJFF(str, str2);
                LJII(3, str, str2);
            }

            @Override // X.InterfaceC1328930kgd
            public final void e(String str, String str2) {
                if (str2 != null) {
                    if (str2.contains("init FrescoTTNetFetcher")) {
                        if (!C2213981Bky.LIZIZ.LIZLLL()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("init FrescoTTNetFetcher ");
                            sbLIZ.append(Log.getStackTraceString(new Throwable()));
                            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            throw new RuntimeException("Fresco init error, @liujian.android");
                        }
                    }
                    if (str2.contains("Fresco has already been initialized!")) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Fresco has already been initialized! ");
                        sbLIZ2.append(Log.getStackTraceString(new Throwable()));
                        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                LJFF(str, str2);
                LJII(6, str, str2);
            }

            @Override // X.InterfaceC1328930kgd
            public final void v(String str, String str2) {
                LJFF(str, str2);
                LJII(2, str, str2);
            }

            @Override // X.InterfaceC1328930kgd
            public final void w(String str, String str2) {
                LJFF(str, str2);
                LJII(5, str, str2);
            }

            public static final void LJI(String str, String str2, Throwable th) {
                if (!LJ(str) && !LJ(str2) && th != null && th.getMessage() != null) {
                    th.getMessage().getClass();
                }
            }

            public static void LJII(int i2, String str, String str2) {
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2344809Gs.LIZLLL(i2, "[Lighten]", C786410Ut5.j4("[[FRESCO::%s]]: %s", new Object[]{str, str2}));
                }
            }

            @Override // X.InterfaceC1328930kgd
            public final void d(String str, String str2, Throwable th) {
                LJI(str, str2, th);
                LJII(3, str, str2);
            }

            @Override // X.InterfaceC1328930kgd
            public final void e(String str, String str2, Throwable th) {
                LJI(str, str2, th);
                LJII(6, str, str2);
                if (str2 != null && str2.contains("Malformed escape pair")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ImageEncryptUtils failed:");
                    sbLIZ.append(str2);
                    C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.InterfaceC1328930kgd
            public final void w(String str, String str2, Throwable th) {
                LJI(str, str2, th);
                LJII(5, str, str2);
                if (th instanceof IllegalStateException) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (!LJ(str2)) {
                            jSONObject.put("errorField", str2);
                        }
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            String string = stringWriter.toString();
                            printWriter.close();
                            jSONObject.put("errorDesc", string);
                            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
                            C2222891BzL.LIZ.monitorCommonLog("aweme_image_error_log", jSONObject);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            printWriter.close();
                            throw th2;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        };
        C1328570kg3.LIZ.LIZJ(C1332140klo.LIZIZ);
        C1330590kjJ.LIZ = c2213981Bky.isOffline();
        if (!c2213981Bky.isOffline() && C2222891BzL.LIZ.LJIIJJI()) {
            C1330590kjJ.LIZIZ = true;
            FrescoImageLoaderImpl.setIsRemoveLog(true);
            SmartImageView.setIsRemoveLog(true);
        }
        FrescoImageLoaderImpl.setLayerDrawableFixEnabled(((Boolean) C0AKN.LIZ.getValue()).booleanValue());
        C1330590kjJ.LIZJ = new C1330660kjQ();
        C2222891BzL c2222891BzL = C2222891BzL.LIZ;
        if (!c2222891BzL.LJIIIZ()) {
            Context applicationContext = c2213981Bky.getApplicationContext();
            InterfaceC1329940kiG interfaceC1329940kiGLIZJ = c2222891BzL.LIZJ();
            if (!C1331660kl2.LIZLLL) {
                C1331660kl2.LIZLLL = true;
                C1331660kl2.LIZJ = interfaceC1329940kiGLIZJ;
                C1331660kl2.LJ = applicationContext.getPackageName();
                C1331660kl2.LIZ.init(interfaceC1329940kiGLIZJ);
            }
        }
        C1322200kVm.LJ = false;
        if (C1332160klq.LJIIIZ().LIZ()) {
            C1328500kfw.LIZLLL = new InterfaceC1330390kiz() { // from class: X.0kjZ
                @Override // X.InterfaceC1330390kiz
                public final boolean LIZ(Uri uri) {
                    return !C1332270km1.LIZIZ(uri);
                }
            };
        }
        if (C1332160klq.LJIIIZ().LIZIZ()) {
            C1329310khF.LLIZLLLIL = true;
        }
        List<InterfaceC1330770kjb> list = C1330620kjM.LIZ;
        C1331410kkd.LIZLLL = true;
        if (C1330720kjW.LIZ()) {
            ImageMonitorByAppLogConfig imageMonitorByAppLogConfig = C1330720kjW.LIZLLL;
            C1330670kjR c1330670kjR = new C1330670kjR();
            c1330670kjR.LIZ = imageMonitorByAppLogConfig.imageMonitorErrorAppLog;
            c1330670kjR.LIZLLL = imageMonitorByAppLogConfig.imageMonitorErrorSampleRate;
            c1330670kjR.LIZIZ = imageMonitorByAppLogConfig.imageMonitorExceedLimitAppLog;
            c1330670kjR.LJ = imageMonitorByAppLogConfig.imageMonitorExceedLimitAppLogSampleRate;
            c1330670kjR.LIZJ = imageMonitorByAppLogConfig.imageSensibleMonitorApplog;
            c1330670kjR.LJFF = imageMonitorByAppLogConfig.imageSensibleMonitorApplogSampleRate;
            C1330620kjM.LJIIIIZZ = new C1330610kjL(c1330670kjR);
            ((Boolean) C0AKU.LIZ.getValue()).booleanValue();
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("tt_lighten_enable_auto_biz_tag", true)) {
            C1330620kjM.LIZ(new InterfaceC589610NAp() { // from class: X.0kcc
                @Override // X.InterfaceC589610NAp
                public final Pair LIZ(C1325710kbR c1325710kbR, Object obj, JSONObject jSONObject, boolean z, boolean z2) {
                    HashMap map = new HashMap();
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.contains("@@")) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1325710kbR.LIZIZ, "biz_tag");
                            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(c1325710kbR.LIZIZ, "from");
                            }
                            if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = c1325710kbR.LJJJJ;
                            }
                            String[] strArrSplit = str.split("@@");
                            if (strArrSplit.length >= 2) {
                                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                    map.put("biz_tag", strArrSplit[1]);
                                }
                                map.put("btm", strArrSplit[1]);
                                map.put("scene_tag", strArrSplit[0]);
                            }
                        }
                    }
                    return new Pair(Boolean.FALSE, map);
                }
            });
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("tt_lighten_oom_tag_enable", false)) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(defaultUncaughtExceptionHandler) { // from class: X.0kT6
                public final Thread.UncaughtExceptionHandler LIZ;

                {
                    this.LIZ = defaultUncaughtExceptionHandler;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v2 */
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    Uri uri;
                    String str;
                    Uri uri2;
                    String string;
                    if (th instanceof C1303660k1s) {
                        Object obj = ((C1303660k1s) th).context;
                        String strLJII = null;
                        try {
                            str = "ANIMATING";
                            try {
                                if (obj instanceof Map) {
                                    uri = (Uri) ((Map) obj).get("uri");
                                } else if (obj instanceof C1325710kbR) {
                                    str = "DECODING";
                                    uri = ((C1325710kbR) obj).LIZIZ;
                                } else if (obj instanceof String) {
                                    uri = UriProtector.parse((String) obj);
                                } else {
                                    uri = 0;
                                    str = null;
                                }
                                try {
                                    strLJII = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "biz_tag");
                                    uri2 = uri;
                                    if (TextUtils.isEmpty(strLJII)) {
                                        strLJII = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from");
                                        uri2 = uri;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    TryCatchGuardChecker.doCheck(th);
                                    uri2 = uri;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                uri = strLJII;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            uri = 0;
                            str = null;
                        }
                        if (TextUtils.isEmpty(strLJII)) {
                            strLJII = C2211631BhB.LJII();
                        }
                        Npth.addTag("image_oom_biz_tag", strLJII);
                        if (uri2 == 0) {
                            string = "";
                        } else {
                            string = uri2.toString();
                        }
                        Npth.addTag("image_oom_uri", string);
                        Npth.addTag("image_oom_error_type", str);
                    }
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.LIZ;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
            C1328730kgJ.LJII = true;
        }
        if (((Boolean) C260860AKe.LIZ.getValue()).booleanValue()) {
            C1330560kjG.LJ = true;
        }
        if (((Boolean) C0AKP.LIZ.getValue()).booleanValue()) {
            C1328540kg0.LJII = true;
        }
        if (((Boolean) C0AK4.LIZ.getValue()).booleanValue()) {
            C1328480kfu.LLJLIL = true;
            C1328730kgJ.LJIIJJI = true;
            C1328730kgJ.LJIILJJIL = true;
        }
        if (((Boolean) C0AKR.LIZ.getValue()).booleanValue()) {
            C1328730kgJ.LJIILIIL = true;
        }
        if (((Boolean) C0AK8.LIZ.getValue()).booleanValue()) {
            C1328730kgJ.LJIIL = true;
            C1333860koa.LIZ = true;
        }
        if (((Boolean) C278940AwW.LIZ.getValue()).booleanValue()) {
            C1321280kUI.LIZ = true;
        }
        if (((Boolean) C0AKI.LIZ.getValue()).booleanValue()) {
            AbstractC1330530kjD.LIZ = new AbstractC1330530kjD() { // from class: X.0kjE
                @Override // X.AbstractC1330530kjD
                public final C1324630kZh LIZ(int i2, int i3, int i4, int i5) {
                    if (i5 > 100 && i4 > 100 && i2 > 0 && i3 > 0 && i4 > i2 && i5 > i3) {
                        return new C1324630kZh(i2, i3);
                    }
                    return null;
                }
            };
        }
        if (((Boolean) C0AKT.LIZ.getValue()).booleanValue()) {
            C1328730kgJ.LJIIZILJ = true;
        }
        if (((Boolean) C260820AKa.LIZ.getValue()).booleanValue()) {
            C1328730kgJ.LJIIJ = true;
        }
        if (((Boolean) C260880AKg.LIZ.getValue()).booleanValue()) {
            C1328730kgJ.LJIIIZ = true;
        }
        if (((Boolean) C0AKG.LIZ.getValue()).booleanValue()) {
            C1328730kgJ.LJIILL = true;
            C1328730kgJ.LJIILLIIL = ((Number) C260890AKh.LIZ.getValue()).intValue();
        }
        if (((Number) C04V4.LIZ.getValue()).intValue() != 0) {
            C1325700kbQ.LJJIL = new InterfaceC1325740kbU() { // from class: X.0kjm
            };
        }
        if (((Boolean) C0AKX.LIZ.getValue()).booleanValue()) {
            C1328730kgJ.LJIL = true;
            AbstractC1326410kcZ.LIZJ = AbstractC1326410kcZ.LIZIZ;
        } else if (C2188561Al4.LJIIJ(c2213981Bky.getApplicationContext()) && ((Boolean) C0AKV.LIZ.getValue()).booleanValue()) {
            C1328730kgJ.LJIL = true;
            AbstractC1326410kcZ.LIZJ = AbstractC1326410kcZ.LIZIZ;
        }
        if (((Boolean) C286590BLd.LIZ.getValue()).booleanValue()) {
            C1325700kbQ.LJJIZ = true;
        }
    }
}
