package X;

import Y.AcS495S0100000_12;
import Y.AfS181S0100000_12;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.media.AudioRecord;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.byted.cast.common.api.IAudioRecordAdapter;
import com.byted.cast.common.api.ICameraAdapter;
import com.byted.cast.common.api.IHostAddressAdapter;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.IMonitor;
import com.byted.cast.common.api.IWifiAdapter;
import com.byted.cast.common.config.Config;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDualDevicePowerCameraChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.TTHttpNetImpl;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualDeviceMessageJsonPassThroughModel;
import com.bytedance.android.livesdk.game.broadcast.service.ForegroundMirrorCastService;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS245S0000000_12;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TFE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TFE {
    public static final C0TFE LIZ = new C0TFE();
    public static long LIZIZ;
    public static C11JF LIZJ;

    public static List LJI() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        arrayList.add(C746250TPb.LIZ((Inet4Address) inetAddressNextElement, CertProviderManagerKt.findCert("bpea-game_dual_device_get_host_ip", 1476427779)));
                    }
                }
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("CastUtil", e);
            return arrayList;
        } catch (SocketException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return arrayList;
    }

    public static String LIZ(C0TER c0ter) {
        try {
            String methodName = c0ter.getMethodName();
            Gson gson = C19748512Ol.LIZIZ;
            return gson.LJIILL(new DualDeviceMessageJsonPassThroughModel(methodName, gson.LJIJJLI(c0ter).LJIILIIL()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("CastUtil", Log.getStackTraceString(e));
            return null;
        }
    }

    public static Intent LIZJ(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForegroundMirrorCastService.class));
        return intent;
    }

    public static int LIZLLL(DataChannel dataChannel) {
        if (dataChannel == null) {
            return 4;
        }
        Boolean bool = (Boolean) dataChannel.gg0(LiveDualDevicePowerCameraChannel.class);
        Boolean bool2 = (Boolean) dataChannel.gg0(LiveDualDeviceFlipCameraChannel.class);
        if (C500260Jjc.LJJIFFI(bool) && C500260Jjc.LJJJI(bool2)) {
            return 1;
        }
        if (C500260Jjc.LJJIFFI(bool) && C500260Jjc.LJJIFFI(bool2)) {
            return 2;
        }
        C500260Jjc.LJJJI(bool);
        return 4;
    }

    public static C0TER LJII(String str) {
        String str2;
        n nVar;
        String string;
        if (str == null) {
            return null;
        }
        try {
            C20441214yg.LIZIZ("CastUtil", str);
            DualDeviceMessageJsonPassThroughModel dualDeviceMessageJsonPassThroughModel = (DualDeviceMessageJsonPassThroughModel) C19748512Ol.LIZIZ.LJII(str, DualDeviceMessageJsonPassThroughModel.class);
            if (dualDeviceMessageJsonPassThroughModel != null && (str2 = dualDeviceMessageJsonPassThroughModel.name) != null && !TextUtils.isEmpty(str2) && dualDeviceMessageJsonPassThroughModel.param != null) {
                C0TE7.Companion.getClass();
                if (C0TE7.map.isEmpty()) {
                    for (C0TE7 c0te7 : C0TE7.values()) {
                        C0TE7.map.put(c0te7.getMethod(), c0te7.getMessageClass());
                    }
                }
                Class<? extends C0TER> cls = C0TE7.map.get(str2);
                if (cls != null && (nVar = dualDeviceMessageJsonPassThroughModel.param) != null && (string = nVar.toString()) != null) {
                    return (C0TER) C19748512Ol.LIZIZ.LJII(string, cls);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("CastUtil", Log.getStackTraceString(e));
        }
        return null;
    }

    public static void LJIIIIZZ(1JLc r3) {
        r3.LJIIIZ(100041, new Object[]{new ILibraryLoader() { // from class: X.0TFL
            public final /* synthetic */ String LIZ = "cast-loadFromLibrary";

            public final boolean loadLibrary(String str) {
                if (str == null || str.length() <= 0) {
                    return false;
                }
                return LiveAppBundleUtils.loadSOByLoader(str, this.LIZ, true);
            }
        }});
    }

    public static void LJIIIZ(1JLc r3) {
        r3.LJIIIZ(100042, new Object[]{new ILogger() { // from class: X.0TFI
            public final void onDebug(String str, String str2) {
                C20441214yg.LIZIZ(str, str2);
            }

            public final void onError(String str, String str2) {
                C20441214yg.LJ(str, str2);
            }

            public final void onInfo(String str, String str2) {
                C20441214yg.LJIIIZ(str, str2);
            }

            public final void onVerbose(String str, String str2) {
                C20441214yg.LJIIJJI(str, str2);
            }

            public final void onWarn(String str, String str2) {
                C20441214yg.LJIIL(str, str2);
            }

            public final void onError(String str, String str2, Throwable th) {
                C20441214yg.LJFF(str, str2, th);
            }
        }});
    }

    public static void LJIILIIL(Context context) throws Throwable {
        boolean z;
        C20441214yg.LIZIZ("CastUtil", "startService");
        LIZIZ = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 26) {
            C11JF c11jf = LIZJ;
            if (c11jf != null && !c11jf.isDisposed()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C11JF c11jf2 = LIZJ;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                LIZJ = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_stamp", jCurrentTimeMillis);
            LIZ.getClass();
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, LIZIZ);
            C1CC2.LJIIIIZZ("ttlive_game_cast_foreground_start", 0, jSONObject);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cast_service_start");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "time_stamp");
            c474500IjALIZ.LJJII(Long.valueOf(LIZIZ), FollowStatusChangeMethod.PARAM_UID);
            c474500IjALIZ.LIZ();
            C2204961BRm.LJJJJL(context, LIZJ(context), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5JdF18j+J2t8w783DsD1h", null));
            return;
        }
        C786410Ut5.s3(context, LIZJ(context));
    }

    public static void LJIILJJIL(Context context) {
        C20441214yg.LIZIZ("CastUtil", "stopService");
        try {
            if (Build.VERSION.SDK_INT > 26 && !ForegroundMirrorCastService.isCreate()) {
                C11JF c11jf = LIZJ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                LIZJ = (C11JF) ForegroundMirrorCastService.statusNow.LJJIL(new InterfaceC19483011Ki() { // from class: X.0TFG
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Object obj) {
                        return ForegroundMirrorCastService.isCreate();
                    }
                }).LJLIIL(1L).LJLJI(5L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(context, 96), new C09JN() { // from class: X.0T7d
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("CastUtil@30d6.stopService$3");
                        C20441214yg.LJII((Throwable) obj);
                        C1C7U.LIZIZ("CastUtil@30d6.stopService$3");
                    }
                });
                return;
            }
            context.stopService(LIZJ(context));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LIZLLL(th.getMessage());
        }
    }

    public static final void LJIILL(Pair<String, String> pair) {
        C465520INi.LIZ.LF(pair);
    }

    public static Config LJ(String str, boolean z) {
        String serverDeviceId;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            serverDeviceId = iHostAppContext.getServerDeviceId();
        } else {
            serverDeviceId = null;
        }
        Config.Builder builder = new Config.Builder();
        builder.setLocalProtocols("ByteLink");
        builder.setProjectId("HHNOvjZV0QGBX8P6ihhB");
        builder.setAppId("RNQSVNmaOrgygQd8");
        builder.setDeviceId(serverDeviceId);
        builder.setLelinkAppId("16454");
        builder.setLelinkAppSecret("e32f4c64cbe76ca46cbb7f96aab93b4b");
        builder.enableDebug(z);
        builder.enableFileLog(true);
        builder.setServiceName(str);
        builder.setNetAdapter(new TTHttpNetImpl());
        builder.setAudioRecordAdapter(new IAudioRecordAdapter() { // from class: X.0TFN
            public final void releaseAudioRecord(AudioRecord audioRecord) {
                if (audioRecord != null) {
                    try {
                        C1300970jxX.LIZIZ(audioRecord, CertProviderManagerKt.findCert("bpea-wired_cast_stop_audio", 1476788483));
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("CastUtil", e);
                    }
                }
            }

            public final void startAudioRecord(AudioRecord audioRecord) {
                if (audioRecord != null) {
                    try {
                        C1300970jxX.LIZJ(audioRecord, CertProviderManagerKt.findCert("bpea-game_start_audio", 1476788233));
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("CastUtil", e);
                    }
                }
            }

            public final void stopAudioRecord(AudioRecord audioRecord) {
                if (audioRecord != null) {
                    try {
                        C1300970jxX.LIZLLL(audioRecord, CertProviderManagerKt.findCert("bpea-wireless_cast_stop_audio", 1476788483));
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("CastUtil", e);
                    }
                }
            }
        });
        builder.setCameraAdapter(new ICameraAdapter() { // from class: X.0TQx
            public final Camera openCamera() {
                try {
                    C825940Wae c825940WaeLIZ = C746720TQw.LIZ(100100, "camera_open1", CertProviderManagerKt.findCert("bpea-game_live_dual_device_start_camera", 1476788233));
                    C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/Camera", "open()Landroid/hardware/Camera;", null);
                    return (Camera) C838080WuE.LIZ(c825940WaeLIZ, AFwS245S0000000_12.get$arr$(178));
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("CastUtil", e);
                    return null;
                }
            }

            public final Camera openCamera(int i) {
                try {
                    return C746740TQy.LIZ(i, CertProviderManagerKt.findCert("bpea-game_live_dual_device_start_camera", 1476788233));
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("CastUtil", e);
                    return null;
                }
            }

            public final void releaseCamera(Camera camera) {
                if (camera != null) {
                    try {
                        C746740TQy.LIZIZ(camera, CertProviderManagerKt.findCert("bpea-game_live_dual_device_stop_camera", 1476788483));
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("CastUtil", e);
                    }
                }
            }
        });
        builder.setHostAddressAdapter(new IHostAddressAdapter() { // from class: X.0TFF
            public final String getHostAddress(InetAddress inetAddress) {
                try {
                    if (inetAddress instanceof Inet4Address) {
                        return C746250TPb.LIZ((Inet4Address) inetAddress, CertProviderManagerKt.findCert("bpea-bytecast_ip", 1476427777));
                    }
                    if (inetAddress instanceof Inet6Address) {
                        return C746250TPb.LIZIZ((Inet6Address) inetAddress, CertProviderManagerKt.findCert("bpea-bytecast_ip", 1476427777));
                    }
                    return null;
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("CastUtil", e);
                    return null;
                }
            }
        });
        builder.setMonitor(new IMonitor() { // from class: X.0TFH
            public final void onAppLogEvent(String str2, JSONObject jSONObject) {
                if (str2 == null || jSONObject == null) {
                    return;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
                c474500IjALIZ.LJJIIJZLJL(jSONObject);
                c474500IjALIZ.LIZ();
            }
        });
        builder.setWifiAdapter(new IWifiAdapter() { // from class: X.0TFM
            public final int getLinkSpeed(WifiManager wifiManager) {
                Integer numValueOf;
                int iIntValue = 0;
                try {
                    WifiInfo wifiInfoLIZ = C786600UtO.LIZ(wifiManager);
                    if (wifiInfoLIZ != null && (numValueOf = Integer.valueOf(wifiInfoLIZ.getLinkSpeed())) != null) {
                        iIntValue = numValueOf.intValue();
                        return iIntValue;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("CastUtil", e);
                }
                return iIntValue;
            }
        });
        return builder.build();
    }

    public static String LJFF(int i, Context context) {
        if (context == null) {
            return C497740JfY.LJIJI(2131841754);
        }
        if (i != 4001) {
            if (i != 10092) {
                if (i != 14004001) {
                    switch (i) {
                    }
                    return C497740JfY.LJIJI(2131841754);
                }
            }
            return C497740JfY.LJIJI(2131841751);
        }
        return C497740JfY.LJIJI(2131841753);
    }

    public static void LJIIJ(Context context, Function0 function0) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(2131841795);
        c782110Um9.LJII(2131841793);
        c782110Um9.LJIIJ(2131851524, new InterfaceC743640TFa() { // from class: X.0TFJ
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILIIL(2131841794, new AcS495S0100000_12(function0, 19));
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static void LJIIJJI(Context context, Function0 function0) {
        if (context == null) {
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(2131841745);
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131841758), new AcS495S0100000_12(function0, 20));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131841757), new InterfaceC743640TFa() { // from class: X.0TFK
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131841759);
        c782110Um9.LJIIIZ(strLJIJI);
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILLIIL = true;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static void LJIIL(int i, Context context, Function0 function0) {
        String strLJIJI;
        String strLJIJI2;
        if (context == null) {
            return;
        }
        if (i != 401) {
            if (i != 406) {
                strLJIJI = C497740JfY.LJIJI(2131841749);
                strLJIJI2 = C497740JfY.LJIJI(2131841748);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131841744);
                strLJIJI2 = C497740JfY.LJIJI(2131841743);
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131841747);
            strLJIJI2 = C497740JfY.LJIJI(2131841746);
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = strLJIJI;
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131841739), new AcS495S0100000_12(function0, 22));
        c782110Um9.LJIIIZ(strLJIJI2);
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static String LIZIZ(String str, String str2, int i, long j, int i2, int i3, Integer num, Float f, String str3, Map map, String str4) {
        if (TextUtils.isEmpty(str)) {
            str = "snssdk1180://dual_device?";
        }
        C495520Jby c495520Jby = new C495520Jby(str);
        c495520Jby.LIZJ("source_ip", str2);
        c495520Jby.LIZ(i, "source_port");
        c495520Jby.LIZIZ(j, "room_id");
        c495520Jby.LIZ(i2, "video_w");
        c495520Jby.LIZ(i3, "video_h");
        if (f != null) {
            float fFloatValue = f.floatValue();
            ((ArrayList) c495520Jby.LIZ).add(new C495540Jc0("bit_rate_scale", String.valueOf(fFloatValue)));
        }
        if (num != null) {
            c495520Jby.LIZ(num.intValue(), "fps");
        }
        if (str3 != null) {
            c495520Jby.LIZJ("anchor_id", str3);
        }
        c495520Jby.LIZJ("sink_platform", "android");
        c495520Jby.LIZJ("settings", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, map));
        c495520Jby.LIZ(4, "ver");
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            c495520Jby.LIZJ("connect_type", "qrcode");
        }
        if (str4 != null) {
            c495520Jby.LIZ(1, "is_rtc");
            c495520Jby.LIZJ("did_sink", str4);
        } else {
            c495520Jby.LIZ(0, "is_rtc");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("qrCodeUrl = ");
        sbLIZ.append(c495520Jby);
        C20441214yg.LJIIIZ("CastUtil", C2188811AlT.LIZIZ(sbLIZ));
        return c495520Jby.LIZLLL();
    }
}
