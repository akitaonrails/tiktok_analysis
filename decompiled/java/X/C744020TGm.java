package X;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWiredWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.GameCastRefactorEnableSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS42S0102000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744020TGm {
    public static 1JLc LIZ;
    public static InterfaceC744130TGx LIZIZ;
    public static C0THL LIZJ;
    public static boolean LIZLLL;
    public static final AtomicBoolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static C11LS LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static boolean LJIIJ;
    public static InterfaceC420801kM LJIIJJI;
    public static C11JF LJIIL;

    static {
        Map<String, Object> map = C1338270kvh.LIZ;
        LJ = new AtomicBoolean(false);
        LJI = true;
        LJIIIZ = System.currentTimeMillis();
    }

    public static void LIZIZ() {
        C0THL c0thl = LIZJ;
        if (c0thl != null) {
            c0thl.LIZIZ();
        }
        1JLc r0 = LIZ;
        if (r0 != null) {
            r0.LIZIZ();
        }
        LIZIZ = null;
        LIZ = null;
        LIZLLL = false;
        C11LS c11ls = LJII;
        if (c11ls != null) {
            c11ls.dispose();
        }
        LJII = null;
    }

    public static void LJFF() {
        1JLP r0;
        MirrorInfo mirrorInfo = new MirrorInfo();
        mirrorInfo.enableEncodeSizeToScreen(true);
        mirrorInfo.setFps(30);
        if (Build.VERSION.SDK_INT >= 29) {
            mirrorInfo.setAudioEnable(true);
            mirrorInfo.setAudioSource(3);
        } else {
            mirrorInfo.setAudioEnable(false);
            1JLc r2 = LIZ;
            if (r2 != null) {
                r2.LJIIIZ(10017, new Object[]{Boolean.FALSE});
            }
        }
        C0THL c0thl = LIZJ;
        mirrorInfo.setEncodeWidth(c0thl != null ? c0thl.LIZIZ : 1920);
        C0THL c0thl2 = LIZJ;
        mirrorInfo.setEncodeHeight(c0thl2 != null ? c0thl2.LIZJ : 1080);
        C0THL c0thl3 = LIZJ;
        mirrorInfo.setVirtualDisplayWidth(c0thl3 != null ? c0thl3.LIZIZ : 1920);
        C0THL c0thl4 = LIZJ;
        mirrorInfo.setVirtualDisplayHeight(c0thl4 != null ? c0thl4.LIZJ : 1080);
        mirrorInfo.setAutoBitrate(false);
        mirrorInfo.setBitRateLevel(4);
        mirrorInfo.setVideoSrc(2);
        mirrorInfo.setCameraId(0);
        mirrorInfo.setServerMode(1);
        mirrorInfo.setResolutionLevel(3);
        1JLc r02 = LIZ;
        if (r02 == null || (r0 = r02.LIZLLL()) == null) {
            return;
        }
        r0.LJI(mirrorInfo);
    }

    public static final void LJII() {
        1JLP r1;
        1JLP r12;
        if (!LJFF) {
            C20441214yg.LIZIZ("GameWiredCastManager", "startMirrorV2, not init --wiredManager");
            return;
        }
        C20441214yg.LIZIZ("GameWiredCastManager", "startMirrorV2, start --wiredManager");
        C743540TEq.LJJ(false);
        LJFF();
        1JLc r0 = LIZ;
        if (r0 != null && (r12 = r0.LIZLLL()) != null) {
            r12.LJ(new ISurfaceListener() { // from class: X.0TGr
                public final void surfaceAvailable(Surface surface, int i, int i2) {
                    MediaProjection mediaProjection;
                    1JLc r02;
                    1JLP r03;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ISurfaceListenerV2, surface:  ");
                    sbLIZ.append(surface);
                    C20441214yg.LIZIZ("GameWiredCastManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (surface == null) {
                        C743540TEq.LJJIIJ(false, 10089, 0, "");
                        return;
                    }
                    C743540TEq.LJIL(false);
                    try {
                        C0THL c0thl = C744020TGm.LIZJ;
                        if (c0thl != null && (mediaProjection = c0thl.LIZLLL) != null && (r02 = C744020TGm.LIZ) != null && (r03 = r02.LIZLLL()) != null) {
                            r03.LJFF(mediaProjection);
                        }
                        C0THL c0thl2 = C744020TGm.LIZJ;
                        if (c0thl2 != null) {
                            c0thl2.LIZLLL(i, i2);
                        }
                        C0THL c0thl3 = C744020TGm.LIZJ;
                        if (c0thl3 != null) {
                            c0thl3.LJ(surface);
                        }
                        C0THL c0thl4 = C744020TGm.LIZJ;
                        if (c0thl4 != null) {
                            c0thl4.LIZ();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
                        if (interfaceC744130TGx != null) {
                            interfaceC744130TGx.LJFF(10092);
                        }
                        C743540TEq.LJJIIJ(false, 10092, 0, e.toString());
                    }
                }
            });
        }
        1JLc r02 = LIZ;
        if (r02 == null || (r1 = r02.LIZLLL()) == null) {
            return;
        }
        r1.LJIIIIZZ("UsbSource");
    }

    public static void LIZJ(GameCastWiredFragmentV2 gameCastWiredFragmentV2) {
        Object c098200Yq;
        if (gameCastWiredFragmentV2 == null) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = LJ;
            if (!atomicBoolean.get()) {
                C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(gameCastWiredFragmentV2, 280));
                atomicBoolean.set(true);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C743540TEq.LJJIIJ(false, 10091, 0, "");
            LJ.set(false);
            C20441214yg.LJI("GameWiredCastManager", thM5exceptionOrNullimpl);
        }
    }

    public static void LIZLLL(Context context) {
        if (LIZ != null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hasInit", LJFF);
        jSONObject.put("isWireless", false);
        C1CC2.LJIIIIZZ("ttlive_game_cast_init_sdk", -1, jSONObject);
        1JLc r2 = new 1JLc();
        C0TFE.LIZ.getClass();
        C0TFE.LJIIIIZZ(r2);
        C0TFE.LJIIIZ(r2);
        r2.LJFF(context, C0TFE.LJ("ByteCast", false), new IInitListener() { // from class: X.0TGl
            public final /* synthetic */ void onError(int i, String str) {
                1JMs.LIZ(this, i, str);
            }

            public final void onSuccess() throws JSONException {
                C20441214yg.LIZIZ("GameWiredCastManager", "onSuccess, init --wiredManager");
                C744020TGm.LJFF = true;
                InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
                if (interfaceC744130TGx != null) {
                    interfaceC744130TGx.LIZ();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isWireless", false);
                C1CC2.LJIIIIZZ("ttlive_game_cast_init_sdk", 1, jSONObject2);
                C743540TEq.LJJI(1, 0, "", "", false, false);
            }

            public final void onFail(int i, String str, Exception exc) throws JSONException {
                String string;
                C744020TGm.LJFF = false;
                C20441214yg.LIZIZ("GameWiredCastManager", "onFail, init --wiredManager");
                InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
                if (interfaceC744130TGx != null) {
                    interfaceC744130TGx.LJFF(i);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isWireless", false);
                jSONObject2.put("errCode", i);
                jSONObject2.put("errMsg", str);
                jSONObject2.put("e", exc);
                C1CC2.LJIIIIZZ("ttlive_game_cast_init_sdk", 0, jSONObject2);
                if (exc != null) {
                    string = exc.toString();
                } else {
                    string = null;
                }
                C743540TEq.LJJI(-1, i, str, string, false, false);
            }
        });
        1JLP r1 = r2.LIZLLL();
        if (r1 != null) {
            r1.LJII(new IMirrorListener() { // from class: X.0TGn
                public final /* synthetic */ void onConnectFailed(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LIZIZ(this, serviceInfo, i, str);
                }

                public final /* synthetic */ void onConnected(ServiceInfo serviceInfo) {
                    1JMD.LIZJ(this, serviceInfo);
                }

                public final /* synthetic */ void onConnecting(ServiceInfo serviceInfo) {
                    1JMD.LIZLLL(this, serviceInfo);
                }

                public final /* synthetic */ void onDisconnected(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LJFF(this, serviceInfo, i, str);
                }

                public final /* synthetic */ void onDisconnecting(ServiceInfo serviceInfo) {
                    1JMD.LJI(this, serviceInfo);
                }

                public final /* synthetic */ void onError(ServiceInfo serviceInfo, int i, String str) {
                    1JFt.LIZIZ(this, serviceInfo, i, str);
                }

                public final void onInfo(int i, int i2, int i3, String str) {
                }

                public final /* synthetic */ void onInfo(ServiceInfo serviceInfo, int i, String str) {
                    1JMD.LJIIIIZZ(this, serviceInfo, i, str);
                }

                public final boolean onInvite(String str, int i) {
                    return false;
                }

                public final /* synthetic */ boolean onInvite(String str, int i, String str2) {
                    return 1JFt.LJ(this, str, i, str2);
                }

                public final void onMirrorModeChange(int i) {
                }

                public final boolean onStartMirrorAuthorization() {
                    return true;
                }

                public final void onStatistics(Statistics statistics) {
                }

                public final void onStart(int i) throws JSONException {
                    long currentUserId;
                    if (i != 10) {
                        return;
                    }
                    1JLc r0 = C744020TGm.LIZ;
                    C744020TGm.LJIIIZ = System.currentTimeMillis();
                    C744020TGm.LJIIJ = false;
                    C743540TEq.LJIJJ(false);
                    C20441214yg.LIZIZ("GameWiredCastManager", "onStart,  --wiredManager");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isWireless", false);
                    jSONObject2.put("serviceId", i);
                    C1CC2.LJIIIIZZ("ttlive_game_cast_onStart", 1, jSONObject2);
                    if (GameCastRefactorEnableSetting.INSTANCE.enable()) {
                        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                        if (interfaceC500940JkiUser != null) {
                            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
                        } else {
                            currentUserId = 0;
                        }
                        C744020TGm.LJIIIIZZ = currentUserId;
                        C744020TGm.LJII = (C11LS) UserService.getInstance().user().LJII().LJIIL(C744110TGv.LL);
                    }
                    InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
                    if (interfaceC744130TGx != null) {
                        interfaceC744130TGx.LIZIZ();
                    }
                    C0THC.LIZLLL(GameCastWiredWidget.class, true);
                }

                public final void onStop(int i) throws JSONException {
                    if (i != 10) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - C744020TGm.LJIIIZ;
                    if (jCurrentTimeMillis > 0 && !C744020TGm.LJIIJ) {
                        C744020TGm.LJIIJ = true;
                        C743540TEq.LJIJJLI(jCurrentTimeMillis, false);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isWireless", false);
                    jSONObject2.put("serviceId", i);
                    C1CC2.LJIIIIZZ("ttlive_game_cast_onStop", 1, jSONObject2);
                    C20441214yg.LIZIZ("GameWiredCastManager", "onStop,  --wiredManager");
                    InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
                    if (interfaceC744130TGx != null) {
                        interfaceC744130TGx.LIZLLL();
                    }
                    C0THC.LIZLLL(GameCastWiredWidget.class, false);
                    C744020TGm.LJIIJJI(C744020TGm.LJI);
                }

                public final void onConnect(ServiceInfo serviceInfo, int i) throws JSONException {
                    String str;
                    if (serviceInfo != null) {
                        str = serviceInfo.protocols;
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.LJFF(str, "UsbSource")) {
                        return;
                    }
                    C20441214yg.LIZIZ("GameWiredCastManager", "onConnect,  --wiredManager");
                    C743540TEq.LJIJI(i, serviceInfo.toString(), false);
                    InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
                    if (interfaceC744130TGx != null) {
                        interfaceC744130TGx.LJ();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("extra", i);
                    jSONObject2.put("serviceInfo", serviceInfo.toString());
                    jSONObject2.put("isWireless", false);
                    C1CC2.LJIIIIZZ("ttlive_game_cast_connect_succeed", 1, jSONObject2);
                }

                public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) throws JSONException {
                    String str;
                    String str2;
                    if (serviceInfo != null) {
                        str = serviceInfo.protocols;
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.LJFF(str, "UsbSource")) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - C744020TGm.LJIIIZ;
                    if (jCurrentTimeMillis > 0 && !C744020TGm.LJIIJ) {
                        C744020TGm.LJIIJ = true;
                        C743540TEq.LJIJJLI(jCurrentTimeMillis, false);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onDisconnect,  --wiredManager, what: ");
                    sbLIZ.append(i);
                    C20441214yg.LIZIZ("GameWiredCastManager", C2188811AlT.LIZIZ(sbLIZ));
                    C0TFE.LIZ.getClass();
                    if (i == 406) {
                        str2 = "LS_disconnect";
                    } else {
                        str2 = "error";
                    }
                    C743540TEq.LJJII(str2, false);
                    InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
                    if (interfaceC744130TGx != null) {
                        interfaceC744130TGx.LIZJ(i);
                    }
                    C0THC.LIZLLL(GameCastWiredWidget.class, false);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isWireless", false);
                    jSONObject2.put("extra", i2);
                    jSONObject2.put("serviceInfo", serviceInfo.toString());
                    jSONObject2.put("what", i);
                    C1CC2.LJIIIIZZ("ttlive_game_cast_disConnect", 0, jSONObject2);
                }

                public final void onError(int i, int i2, int i3, String str) throws JSONException {
                    boolean z;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wired_cast_error");
                    c474500IjALIZ.LJJII(Integer.valueOf(i3), "error_code");
                    c474500IjALIZ.LJJII(str, "error_msg");
                    c474500IjALIZ.LJJII(Integer.valueOf(i2), "what");
                    c474500IjALIZ.LJJII(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_UID);
                    c474500IjALIZ.LIZ();
                    if (i != 10) {
                        return;
                    }
                    C743540TEq.LJJIIJ(false, Integer.valueOf(i2), Integer.valueOf(i3), str);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onError,  --wiredManager what: ");
                    sbLIZ.append(i2);
                    sbLIZ.append(" code: ");
                    sbLIZ.append(i3);
                    sbLIZ.append(" msg: ");
                    sbLIZ.append(str);
                    C20441214yg.LJ("GameWiredCastManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (i2 != 4001 && i2 != 14004001) {
                        z = true;
                    } else {
                        z = false;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isWireless", false);
                    jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, i);
                    jSONObject2.put("what", i2);
                    jSONObject2.put("errorCode", i3);
                    C1CC2.LJIIIIZZ("ttlive_game_cast_onError", 1, jSONObject2);
                    C744020TGm.LJIIIZ(z);
                    InterfaceC744130TGx interfaceC744130TGx = C744020TGm.LIZIZ;
                    if (interfaceC744130TGx != null) {
                        interfaceC744130TGx.LJFF(i2);
                    }
                    C0THC.LIZLLL(GameCastWiredWidget.class, false);
                }
            });
        }
        LIZ = r2;
    }

    public static void LJ(final Fragment fragment) {
        1JLP r1;
        1JLc r0 = LIZ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            r1.LJ(new ISurfaceListener() { // from class: X.0TGq
                public final void surfaceAvailable(Surface surface, int i, int i2) throws JSONException {
                    Object c098200Yq;
                    if (surface == null) {
                        C743540TEq.LJJIIJ(false, 10089, 0, "");
                        return;
                    }
                    C743540TEq.LJIL(false);
                    C0THL c0thl = C744020TGm.LIZJ;
                    if (c0thl != null) {
                        c0thl.LIZLLL(i, i2);
                    }
                    C0THL c0thl2 = C744020TGm.LIZJ;
                    if (c0thl2 != null) {
                        c0thl2.LJ(surface);
                    }
                    Fragment fragment2 = fragment;
                    if (fragment2 != null) {
                        try {
                            AtomicBoolean atomicBoolean = C744020TGm.LJ;
                            if (!atomicBoolean.get()) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("isWireless", false);
                                C1CC2.LJIIIIZZ("ttlive_game_cast_start_request", 1, jSONObject);
                                C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(fragment2, 276));
                                atomicBoolean.set(true);
                            }
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("isWireless", false);
                            C1CC2.LJIIIIZZ("ttlive_game_cast_start_service", 0, jSONObject2);
                            C743540TEq.LJJIIJ(false, 10091, 0, "");
                            C744020TGm.LJ.set(false);
                            C20441214yg.LJI("GameWiredCastManager", thM5exceptionOrNullimpl);
                        }
                    }
                }
            });
        }
    }

    public static final void LJI(Fragment fragment) throws JSONException {
        1JLP r1;
        if (fragment == null) {
            return;
        }
        if (!LJFF) {
            C20441214yg.LIZIZ("GameWiredCastManager", "startMirror, not init --wiredManager");
            return;
        }
        C20441214yg.LIZIZ("GameWiredCastManager", "startMirror, start --wiredManager");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        C1CC2.LJIIIIZZ("ttlive_game_cast_start_mirror", 1, jSONObject);
        C743540TEq.LJJ(false);
        LJFF();
        LJ(fragment);
        1JLc r0 = LIZ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            r1.LJIIIIZZ("UsbSource");
        }
    }

    public static final void LJIIIIZZ(Context context) {
        if (LIZLLL) {
            C20441214yg.LIZIZ("GameWiredCastManager", "start fail hasStartService true");
            return;
        }
        C0TFE.LIZ.getClass();
        C0TFE.LJIILIIL(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        C1CC2.LJIIIIZZ("ttlive_game_cast_start_service", 1, jSONObject);
        LIZLLL = true;
    }

    public static final void LJIIIZ(boolean z) {
        Context context;
        C11LS c11ls;
        1JLP r1;
        if (!LJFF) {
            C20441214yg.LIZIZ("GameWiredCastManager", "not stopMirror, hasInit is false");
            return;
        }
        C20441214yg.LIZIZ("GameWiredCastManager", "stopMirror, stop --wiredManager");
        LJI = z;
        1JLc r0 = LIZ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            r1.LJIIJ("UsbSource");
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            context = iHostAppContext.context();
        } else {
            context = null;
        }
        LJIIJ(context);
        try {
            C11LS c11ls2 = LJII;
            if ((c11ls2 == null || !c11ls2.isDisposed()) && (c11ls = LJII) != null) {
                c11ls.dispose();
            }
            LJIIIIZZ = 0L;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        jSONObject.put("needRelease", z);
        C1CC2.LJIIIIZZ("ttlive_game_cast_stop_mirror", 1, jSONObject);
    }

    public static final void LJIIJ(Context context) {
        if (context == null) {
            return;
        }
        C0TFE.LIZ.getClass();
        C0TFE.LJIILJJIL(context);
        if (!LIZLLL) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        C1CC2.LJIIIIZZ("ttlive_game_cast_stop_service", 1, jSONObject);
        LIZLLL = false;
    }

    public static final void LJIIJJI(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needRelease: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("GameWiredCastManager", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            LIZIZ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isWireless", false);
            C1CC2.LJIIIIZZ("ttlive_game_cast_release_sdk", 1, jSONObject);
        }
    }

    public static final void LIZ(int i, int i2, Intent intent, Fragment fragment) throws JSONException {
        1JLP r1;
        if (i != 20001) {
            return;
        }
        LJ.set(false);
        if (i2 == -1 && intent != null) {
            C11JF c11jf = LJIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LJIIL = C433901mT.LIZ(fragment, new AwS556S0100000_12(fragment, 275));
            InterfaceC420801kM interfaceC420801kM = LJIIJJI;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            LJIIJJI = C433901mT.LIZIZ(fragment, new AwS42S0102000_12(i2, i, intent, 1));
            return;
        }
        1JLc r0 = LIZ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            r1.LJFF((MediaProjection) null);
        }
        1JLc r02 = LIZ;
        if (r02 != null) {
            r02.LJII();
        }
        LJIIIZ(false);
        InterfaceC744130TGx interfaceC744130TGx = LIZIZ;
        if (interfaceC744130TGx != null) {
            interfaceC744130TGx.LJFF(14004001);
        }
        C0THC.LIZLLL(GameCastWiredWidget.class, false);
        C743540TEq.LJJIIZI(i2, -1, i, String.valueOf(intent), false);
        C743540TEq.LJJIIJ(false, 10090, 0, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", false);
        jSONObject.put("requestCode", i);
        jSONObject.put("resultCode", i2);
        jSONObject.put("data", String.valueOf(intent));
        C1CC2.LJIIIIZZ("ttlive_game_cast_result", 0, jSONObject);
    }
}
