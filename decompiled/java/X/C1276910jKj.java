package X;

import android.os.Looper;
import android.util.LruCache;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AsyncAuxStreamCreateTask;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ResolutionConfig;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHEnableDynamicGLVersionSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostAnchorPFSSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostFloatResOptSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostMinCapSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LInkMicSdkCallMixStreamFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicDynamicLayoutMediaSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicEffectFpsAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicEffectFpsGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkDisposeAfterRtcEndSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSetLiveSeiSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkMicFovRtcParamsMappingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicEnableFovOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFloatResOptSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRtcAbSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3AnchorMinCapSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMinCapSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveLinkMicSeiUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.CoHostChangeCapResSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizeFullCanvasConfigId;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeCapResGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeCapResSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3RtcParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3VideoSeiEndSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.RtcParams;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.bytertc.engine.type.LinkMicType;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276910jKj implements InterfaceC2228581CKi, InterfaceC2182071Aab {
    public static final C968480bJG LLL = new Object() { // from class: X.0bJG
    };
    public final Room LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final C966020bFI LLILZ;
    public final String LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public EnumC952680atm LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile Pair<Integer, Integer> LLJI;
    public volatile Pair<Integer, Integer> LLJIJIL;
    public volatile Pair<Integer, Integer> LLJILJIL;
    public volatile Pair<Integer, Integer> LLJILJILJ;
    public volatile Pair<Integer, Integer> LLJILLL;
    public volatile int LLJJ;
    public volatile boolean LLJJI;
    public volatile boolean LLJJIII;
    public volatile C1276960jKo LLJJIJI;
    public volatile EnumC1276080jJO LLJJIJIIJIL;
    public volatile boolean LLJJIJIL;
    public InterfaceC1279800jPO LLJJJ;
    public InterfaceC754220TiG LLJJJIL;
    public InterfaceC1276380jJs LLJJJJ;
    public String LLJJJJJIL;
    public final Map<String, Integer> LLJJJJLIIL;
    public String LLJJL;
    public LinkMicRtcDispatcher LLJJLIIIJLLLLLLLZ;
    public InterfaceC1277100jL2 LLJL;
    public AsyncAuxStreamCreateTask LLJLIL;
    public final List<InterfaceC1277190jLB> LLJLILLLLZIIL;
    public InterfaceC1280020jPk LLJLL;
    public InterfaceC965150bDt LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;

    @Override // X.InterfaceC2228581CKi
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIILJJIL(String str, C1283640jVa c1283640jVa) {
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIILL() {
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIJ(String str, C1283640jVa c1283640jVa) {
    }

    @Override // X.InterfaceC2228581CKi
    public final boolean LJJIII() {
        return false;
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJJ(EnumC2228601CKk enumC2228601CKk) {
    }

    @Override // X.InterfaceC2228581CKi
    public final void LIZ() {
        InterfaceC754220TiG interfaceC754220TiG;
        InterfaceC1273910jFt liveCore;
        C965350bED c965350bED = this.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("_236");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[startPushData] client:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        sbLIZ2.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        C1AZW.LJIIIZ(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        if (MultiGuestV3VideoSeiEndSetting.INSTANCE.enableVideoSei() && (interfaceC754220TiG = this.LLJJJIL) != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null) {
            liveCore.LJJIZ("ttls_live_scene", true, false, "1610665997", -1, null);
        }
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.LIZ();
        }
        LJJLIIJ(new C1277120jL4(this));
    }

    @Override // X.InterfaceC2228581CKi
    public final List<String> LJII() {
        List<C1276580jKC> arrayList;
        ArrayList arrayList2 = new ArrayList();
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs == null || (arrayList = interfaceC1276380jJs.LJIILL()) == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<C1276580jKC> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = it2.next().LIZIZ;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIIIIZZ() {
        C965350bED c965350bED = this.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("_465");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[stopInteractStreaming]");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        sbLIZ2.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        C1AZW.LJIIIZ(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        LJJJJZI(!LinkMicSdkDisposeAfterRtcEndSetting.getValue() && this.LLILLJJLI, false, "stopInteractStreaming", null);
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIIJJI() {
        C1AZW.LIZIZ(this.LLILZ.LJJ, this.LLILZIL, "[startInteract]", null, null);
        LIZ();
        LJJIIJ();
    }

    @Override // X.InterfaceC2228581CKi
    public final long LJIJI() {
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        InterfaceC754220TiG interfaceC754220TiG;
        boolean zIsEnable = false;
        if (this.LLILLJJLI) {
            int i = this.LLILLL;
            if (i == 2) {
                zIsEnable = CoHostFloatResOptSettings.INSTANCE.isEnable();
            } else if (i == 4) {
                zIsEnable = MultiGuestFloatResOptSettings.INSTANCE.isEnable();
            }
        }
        if (!zIsEnable) {
            return 0L;
        }
        InterfaceC754220TiG interfaceC754220TiG2 = this.LLJJJIL;
        InterfaceC1273910jFt liveCore = null;
        if (interfaceC754220TiG2 == null) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LIVE_VIDEO_CLIENT_FACTORY");
            if ((objLJIIIZ instanceof InterfaceC754220TiG) && (interfaceC754220TiG = (InterfaceC754220TiG) objLJIIIZ) != null) {
                liveCore = interfaceC754220TiG.getLiveCore();
            }
            if (!(liveCore instanceof AbstractC1273900jFs)) {
                return 0L;
            }
            abstractC1273900jFs = (AbstractC1273900jFs) liveCore;
        } else {
            InterfaceC1273910jFt liveCore2 = interfaceC754220TiG2.getLiveCore();
            if (!(liveCore2 instanceof AbstractC1273900jFs)) {
                return 0L;
            }
            abstractC1273900jFs = (AbstractC1273900jFs) liveCore2;
        }
        if (abstractC1273900jFs == null || (c1269340j8WLLD = abstractC1273900jFs.LLD()) == null) {
            return 0L;
        }
        return c1269340j8WLLD.LJJIL(1);
    }

    @Override // X.InterfaceC2228581CKi
    public final boolean LJIL() {
        if (this.LLJJJJ == null || !C968320bJ0.LIZ.get()) {
            return false;
        }
        boolean z = this.LLILZLL;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[isInteractRunning] ");
        sbLIZ.append(z);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        return z;
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJIFFI() {
        C965350bED c965350bED = this.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("_222");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[startJoinChannel]");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        sbLIZ2.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        C1AZW.LJIIIZ(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.joinChannel();
        }
        LJJLIIJ(new C1277110jL3(this));
        if (LInkMicSdkCallMixStreamFixSetting.INSTANCE.enable() || !this.LLILLJJLI) {
            return;
        }
        LJIIJJI();
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJIIJ() {
        C965350bED c965350bED = this.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("_284");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[startMixInteractStream] client:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        sbLIZ2.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        sbLIZ2.append(", hasInteract:");
        sbLIZ2.append(this.LLJ);
        C1AZW.LJIIIZ(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        if (this.LLJ) {
            C1AZW.LIZIZ(this.LLILZ.LJJ, this.LLILZIL, "already startInteract", null, null);
            return;
        }
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            this.LLJ = true;
            interfaceC1276380jJs2.LJJLIIIJJI(CertProviderManagerKt.findCert("bpea-start-push-stream-when-available-for-rtcmanager", 1476788233));
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJIJ() {
        AbstractC1273900jFs abstractC1273900jFs;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[resetMediaConfig]");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        sbLIZ.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        InterfaceC1273910jFt liveCore = interfaceC754220TiG != null ? interfaceC754220TiG.getLiveCore() : null;
        if (!(liveCore instanceof AbstractC1273900jFs) || (abstractC1273900jFs = (AbstractC1273900jFs) liveCore) == null) {
            return;
        }
        LJJLIIIJLLLLLLLZ(abstractC1273900jFs);
    }

    @Override // X.InterfaceC2228581CKi
    public final C1276990jKr LJJIJIIJIL() {
        Resolution resolution;
        String mappedParamsKey;
        C1276990jKr c1276990jKr;
        String str;
        Resolution resolution2;
        Map<String, Resolution> map;
        ResolutionConfig resolutionConfigInvoke = this.LLILZ.LJJIIJZLJL().lazyGet.invoke();
        Layout layout = resolutionConfigInvoke.layout;
        if (layout == null || (map = layout.resolutionMap) == null) {
            resolution = null;
        } else {
            LayoutArray layoutArray = resolutionConfigInvoke.layoutArray;
            resolution = map.get(layoutArray != null ? layoutArray.reso_id : null);
        }
        LayoutArray layoutArray2 = resolutionConfigInvoke.layoutArray;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("split on rtc, getResolutionV2 config_id: ");
        sbLIZ.append(layoutArray2 != null ? layoutArray2.configId : null);
        sbLIZ.append(", reolution: ");
        sbLIZ.append(resolution);
        C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (LivesdkLinkmicEnableFovOptimizeSetting.INSTANCE.isEnable(this.LLILLJJLI)) {
            mappedParamsKey = LivesdkLinkMicFovRtcParamsMappingSetting.INSTANCE.getMappedParamsKey(layoutArray2 != null ? layoutArray2.configId : null);
        } else {
            mappedParamsKey = layoutArray2 != null ? layoutArray2.configId : null;
        }
        RtcParams rtcParams = MultiGuestV3RtcParamsSetting.INSTANCE.getRtcParams(mappedParamsKey, 0, new C920560a3y(LLL));
        if (rtcParams != null) {
            if (resolution != null) {
                String str3 = layoutArray2 != null ? layoutArray2.businessId : null;
                if (C497740JfY.LJIL()) {
                    int i = resolution._width;
                    int i2 = resolution._height;
                    int i3 = resolution._fps;
                    int i4 = resolution._bitrate_kbps;
                    if (str3 == null) {
                        str3 = resolution.businessId;
                    }
                    int i5 = resolution._effectWidth;
                    int i6 = resolution._effectHeight;
                    if (mappedParamsKey == null) {
                        mappedParamsKey = resolution.configId;
                    }
                    resolution2 = new Resolution(i, i2, i3, i4, str3, i5, i6, mappedParamsKey, rtcParams);
                } else {
                    int i7 = resolution._height;
                    int i8 = resolution._width;
                    int i9 = resolution._fps;
                    int i10 = resolution._bitrate_kbps;
                    if (str3 == null) {
                        str3 = resolution.businessId;
                    }
                    int i11 = resolution._effectHeight;
                    int i12 = resolution._effectWidth;
                    if (mappedParamsKey == null) {
                        mappedParamsKey = resolution.configId;
                    }
                    resolution2 = new Resolution(i7, i8, i9, i10, str3, i11, i12, mappedParamsKey, rtcParams);
                }
                resolution = resolution2;
            } else {
                if (layoutArray2 == null || (str = layoutArray2.businessId) == null) {
                    str = "unknown";
                }
                resolution = new Resolution(0, 0, 0, 0, str, 0, 0, "layout_default", rtcParams);
            }
            String str4 = this.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("split on rtc, getResolutionV2, read from config, w:");
            sbLIZ2.append(resolution.getWidth());
            sbLIZ2.append(", h:");
            sbLIZ2.append(resolution.getHeight());
            sbLIZ2.append(", fps:");
            sbLIZ2.append(resolution.getFps());
            sbLIZ2.append(", all: ");
            sbLIZ2.append(resolution);
            C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            if (resolution == null) {
                c1276990jKr = new C1276990jKr(720L, 1280L, 720L, 1280L, 15L, 1200L, 1200L, "null");
                C965350bED c965350bED = this.LLILZ.LJJ;
                String str5 = this.LLILZIL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[resolutionModelWithLayoutId] ");
                sbLIZ3.append(c1276990jKr);
                C1AZW.LIZIZ(c965350bED, str5, C2188811AlT.LIZIZ(sbLIZ3), null, null);
                return c1276990jKr;
            }
            String str6 = this.LLILZIL;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("split on rtc, getResolutionV2, fall back, w:");
            sbLIZ4.append(resolution.getWidth());
            sbLIZ4.append(", h:");
            sbLIZ4.append(resolution.getHeight());
            sbLIZ4.append(", fps:");
            sbLIZ4.append(resolution.getFps());
            sbLIZ4.append(", all: ");
            sbLIZ4.append(resolution);
            C20441214yg.LJIIIZ(str6, C2188811AlT.LIZIZ(sbLIZ4));
        }
        c1276990jKr = new C1276990jKr(resolution.getEffectWidth(), resolution.getEffectHeight(), resolution.getWidth(), resolution.getHeight(), resolution.getFps(), resolution.getBitrateKbps(), resolution.getBitrateKbps(), resolution.businessId);
        C965350bED c965350bED2 = this.LLILZ.LJJ;
        String str52 = this.LLILZIL;
        StringBuilder sbLIZ32 = C2188811AlT.LIZ();
        sbLIZ32.append("[resolutionModelWithLayoutId] ");
        sbLIZ32.append(c1276990jKr);
        C1AZW.LIZIZ(c965350bED2, str52, C2188811AlT.LIZIZ(sbLIZ32), null, null);
        return c1276990jKr;
    }

    @Override // X.InterfaceC2228581CKi
    public final C1277030jKv LJJIZ() {
        String mappedParamsKey;
        C1277030jKv c1277030jKv;
        String str;
        ResolutionConfig resolutionConfigInvoke = this.LLILZ.LJJIIJZLJL().lazyGet.invoke();
        if (resolutionConfigInvoke.layout == null && resolutionConfigInvoke.layoutArray == null) {
            c1277030jKv = new C1277030jKv("null", "null");
        } else {
            if (LivesdkLinkmicEnableFovOptimizeSetting.INSTANCE.isEnable(this.LLILLJJLI)) {
                LivesdkLinkMicFovRtcParamsMappingSetting livesdkLinkMicFovRtcParamsMappingSetting = LivesdkLinkMicFovRtcParamsMappingSetting.INSTANCE;
                LayoutArray layoutArray = resolutionConfigInvoke.layoutArray;
                mappedParamsKey = livesdkLinkMicFovRtcParamsMappingSetting.getMappedParamsKey(layoutArray != null ? layoutArray.configId : null);
            } else {
                LayoutArray layoutArray2 = resolutionConfigInvoke.layoutArray;
                mappedParamsKey = layoutArray2 != null ? layoutArray2.configId : null;
            }
            LayoutArray layoutArray3 = resolutionConfigInvoke.layoutArray;
            if (layoutArray3 == null || (str = layoutArray3.businessId) == null) {
                str = "null";
            }
            if (mappedParamsKey == null) {
                mappedParamsKey = "null";
            }
            c1277030jKv = new C1277030jKv(str, mappedParamsKey);
        }
        if (Intrinsics.LJFF(c1277030jKv.LIZIZ, "null") && LinkMicRustMonitorConfigSetting.INSTANCE.canReport()) {
            C1304660k3U.LIZ.LIZIZ(100001, "getCurrentMediaConfig: businessId=" + c1277030jKv + ".configId, configId=null", new Throwable(), null);
        }
        C1AZW.LIZIZ(this.LLILZ.LJJ, this.LLILZIL, "[mediaConfigWithLayoutId] " + c1277030jKv, null, null);
        return c1277030jKv;
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJJI() {
        if (this.LLJJJJ == null) {
            C1AZW.LIZIZ(this.LLILZ.LJJ, this.LLILZIL, "[compositingLayoutOfPublisher] abort because rtcClient is null, no trigger_mix_stream_signal", null, null);
            return;
        }
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[compositingLayoutOfPublisher] trigger_mix_stream_signal ");
        sbLIZ.append(this.LLJJJJ);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1277100jL2 interfaceC1277100jL2 = this.LLJL;
        if (interfaceC1277100jL2 != null) {
            interfaceC1277100jL2.LIZIZ();
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJJJ() {
        C1AZW.LIZIZ(this.LLILZ.LJJ, this.LLILZIL, "[turnOffEffectDowngradingStrategy]", null, null);
    }

    @Override // X.InterfaceC2228581CKi
    public final String LJJJJL() {
        if (TTLHEnableDynamicGLVersionSettings.INSTANCE.value()) {
            float detailedGLVersion = GLThreadManager.getDetailedGLVersion();
            if (detailedGLVersion > 2.0f) {
                return String.valueOf(detailedGLVersion);
            }
        }
        return C1274420jGi.LIZ(C176600m4.LIZ());
    }

    public final C1277170jL9 LJJJLL() {
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        C1277170jL9 c1277170jL9 = new C1277170jL9();
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        InterfaceC1273910jFt liveCore = interfaceC754220TiG != null ? interfaceC754220TiG.getLiveCore() : null;
        if ((liveCore instanceof AbstractC1273900jFs) && (abstractC1273900jFs = (AbstractC1273900jFs) liveCore) != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null) {
            c1277170jL9.LIZ = c1269340j8WLLD.LJJIL(1);
            c1277170jL9.LIZIZ = c1269340j8WLLD.LJJIJIIJIL(1);
        }
        return c1277170jL9;
    }

    public final boolean LJJL() {
        int i = this.LLILLL;
        if (i == 0 || i == 2) {
            return CoHostChangeCapResSetting.INSTANCE.isEnable() && this.LLILLJJLI;
        }
        if (i == 4) {
            return (MultiGuestV3ChangeCapResSetting.INSTANCE.isEnable() && this.LLILLJJLI) || (MultiGuestV3ChangeCapResGuestSetting.INSTANCE.isEnable() && !this.LLILLJJLI);
        }
        return false;
    }

    public final boolean LJJLI() {
        int i = this.LLILLL;
        if (i == 0 || i == 2) {
            return LinkMicEffectFpsAnchorSetting.INSTANCE.isEnable();
        }
        if (i == 4) {
            return (LinkMicEffectFpsGuestSetting.INSTANCE.isEnable() && !this.LLILLJJLI) || (LinkMicEffectFpsAnchorSetting.INSTANCE.isEnable() && this.LLILLJJLI);
        }
        return false;
    }

    public final boolean LJJLIIIIJ() {
        int i = this.LLILLL;
        if (i == 0 || i == 2) {
            return CoHostAnchorPFSSetting.INSTANCE.isEnable();
        }
        if (i == 4) {
            return (MultiGuestV3ChangeFpsGuestSetting.INSTANCE.isEnable() && !this.LLILLJJLI) || (MultiGuestV3ChangeFpsAnchorSetting.INSTANCE.isEnable() && this.LLILLJJLI);
        }
        return false;
    }

    public final boolean LJJLIIIJJI() {
        boolean zLJJLIL = this.LLILZ.LJ().LJJLIL();
        C1AZW c1azw = C1AZW.LIZ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("simulcastEnableAll = ");
        sbLIZ.append(zLJJLIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(str, strLIZIZ, null, null);
        return zLJJLIL;
    }

    @Override // X.InterfaceC2228581CKi
    public final void disableDownlinkAudioSelection() {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[disableDownlinkAudioSelection]");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        sbLIZ.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.disableDownlinkAudioSelection();
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void setLinkmicStateForAnchorNet() {
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.setLinkmicStateForAnchorNet();
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void stopForwardStreamToRooms() {
        C965350bED c965350bED = this.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("_310");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[stopForwardStreamToRooms], client:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        sbLIZ2.append(interfaceC1276380jJs != null ? Integer.valueOf(interfaceC1276380jJs.hashCode()) : null);
        C1AZW.LJIIIZ(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.stopForwardStreamToRooms();
        }
    }

    public final boolean LJJLIIIJILLIZJL() {
        if (!LJJLIIIIJ()) {
            return false;
        }
        int i = this.LLILLL;
        if (i == 0 || i == 2) {
            return CoHostMinCapSetting.INSTANCE.isEnable();
        }
        if (i == 4) {
            return (MultiGuestV3GuestMinCapSetting.INSTANCE.isEnable() && !this.LLILLJJLI) || (MultiGuestV3AnchorMinCapSetting.INSTANCE.isEnable() && this.LLILLJJLI);
        }
        return false;
    }

    public static boolean LJJLIIIJ(String str) {
        if (!Intrinsics.LJFF(str, "grid_aux_2_hosts_landscape_host") && !Intrinsics.LJFF(str, "grid_aux_3_hosts_landscape_host") && !Intrinsics.LJFF(str, "grid_aux_4_hosts_landscape_host") && !Intrinsics.LJFF(str, "grid_aux_2_hosts_portrait_host") && !Intrinsics.LJFF(str, "grid_aux_3_hosts_portrait_host") && !Intrinsics.LJFF(str, "grid_aux_4_hosts_portrait_host")) {
            return false;
        }
        return true;
    }

    public static final void LJJLIIJ(final Function0<Unit> function0) {
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0GUn
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RustLiveStreamer@4533.sam$java_lang_Runnable$0");
                try {
                    function0.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RustLiveStreamer@4533.sam$java_lang_Runnable$0");
            }
        });
    }

    @Override // X.InterfaceC2182071Aab
    public final void LIZIZ(String str) {
        InterfaceC1273910jFt liveCore;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[releaseMediaPlayer] streamerID:");
        sbLIZ.append(str);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        if (interfaceC754220TiG != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null) {
            liveCore.LIZIZ(str);
        }
    }

    @Override // X.InterfaceC2182071Aab
    public final void LIZLLL(String str) {
        InterfaceC1273910jFt liveCore;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[stopMediaPlayer] streamerID:");
        sbLIZ.append(str);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        if (interfaceC754220TiG != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null) {
            liveCore.LIZLLL(str);
        }
    }

    @Override // X.InterfaceC2182071Aab
    public final void LJIIIZ(C969430bKn c969430bKn) {
        int iHashCode;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[stopRemoteEffect] param:");
        sbLIZ.append(c969430bKn);
        sbLIZ.append(" , rtcClient:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            iHashCode = interfaceC1276380jJs.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.LJIIIZ(c969430bKn);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jLC] */
    @Override // X.InterfaceC2228581CKi
    public final C1277200jLC LJIIJ(String str) {
        return new Object() { // from class: X.0jLC
        };
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIIL(String str) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendRtcRoomMessage] msg=");
        sbLIZ.append(str);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.sendRoomMessage(str);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIILLIIL(long j) {
        Integer numValueOf;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[enableDownlinkAudioSelection ");
        sbLIZ.append(j);
        sbLIZ.append(']');
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.enableDownlinkAudioSelection((int) j);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIIZILJ(C1277060jKy c1277060jKy) {
        InterfaceC1273910jFt liveCore;
        C1267140j4y c1267140j4y = new C1267140j4y();
        c1267140j4y.LIZ = (int) c1277060jKy.LIZ;
        c1267140j4y.LIZIZ = (int) c1277060jKy.LIZIZ;
        c1267140j4y.LIZJ = (float) c1277060jKy.LIZJ;
        c1267140j4y.LIZLLL = (float) c1277060jKy.LIZLLL;
        c1267140j4y.LJ = c1277060jKy.LJ;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateAdaptiveRtcMediaInfo] ");
        sbLIZ.append(c1267140j4y);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        if (interfaceC754220TiG != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null) {
            liveCore.LJJJJLL(c1267140j4y);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJ(long j) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setDownlinkAudioSelectionPriority ");
        sbLIZ.append(j);
        sbLIZ.append(']');
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.LJJLIIIJLJLI(EnumC1276480jK2.fromId((int) j));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r1 != 4) goto L24;
     */
    @Override // X.InterfaceC2228581CKi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(X.C1277240jLG r15) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276910jKj.LJJII(X.0jLG):void");
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJIIJZLJL(boolean z) {
        Integer numValueOf;
        InterfaceC1273910jFt liveCore;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setEnableAdaptiveRtcMediaInfo] enable=");
        sbLIZ.append(z);
        sbLIZ.append(" client = ");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        if (interfaceC754220TiG != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null) {
            liveCore.LJJIJL(z);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final C966980bGq LJJIIZI(C1276970jKp c1276970jKp) {
        InterfaceC1277100jL2 c207250168a;
        C966980bGq c966980bGqLJJJZ = null;
        try {
            C965350bED c965350bED = this.LLILZ.LJJ;
            String str = this.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[setupInteractStreamConfig] config: ");
            sbLIZ.append(c1276970jKp);
            C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
            c966980bGqLJJJZ = LJJJZ(c1276970jKp);
            C1277160jL8 c1277160jL8 = InterfaceC1277100jL2.LIZ;
            C1277020jKu c1277020jKu = new C1277020jKu(this);
            c1277160jL8.getClass();
            if (LiveLinkMicSeiUpdateSetting.INSTANCE.optimize()) {
                c207250168a = new C168Z(c1277020jKu);
            } else {
                c207250168a = new C207250168a(c1277020jKu);
            }
            this.LLJL = c207250168a;
            String str2 = this.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setupInteractStreamConfig: result: ");
            sbLIZ2.append(c966980bGqLJJJZ);
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            return c966980bGqLJJJZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str3 = this.LLILZIL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setupInteractStreamConfig: result: ");
            sbLIZ3.append(c966980bGqLJJJZ);
            C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
            throw th;
        }
    }

    @Override // X.InterfaceC2182071Aab
    public final void LJJIJIIJI(C969430bKn c969430bKn) {
        int iHashCode;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[startRemoteEffect] param:");
        sbLIZ.append(c969430bKn);
        sbLIZ.append(" , rtcClient:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            iHashCode = interfaceC1276380jJs.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.LJJIJIIJI(c969430bKn);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJIJLIJ(boolean z) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call on changeToFullInteractOnlySelf: ");
        sbLIZ.append(z);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJ(C789140UxU c789140UxU) {
        int iHashCode;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateMediaParamsWithBizInfo] client:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        boolean zLJJJJLI = false;
        if (interfaceC1276380jJs != null) {
            iHashCode = interfaceC1276380jJs.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append(", ");
        sbLIZ.append(c789140UxU);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        String str2 = LJJIZ().LIZ;
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.setBusinessId(str2);
        }
        InterfaceC1276380jJs interfaceC1276380jJs3 = this.LLJJJJ;
        if (interfaceC1276380jJs3 != null) {
            C1274190jGL c1274190jGL = new C1274190jGL();
            c1274190jGL.LIZ = c789140UxU.LIZ;
            zLJJJJLI = interfaceC1276380jJs3.LJJJJLI(c1274190jGL);
        }
        this.LLJJIII = zLJJJJLI;
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJI(long j) {
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.setRemoteRoomAudioPlaybackVolume((int) j);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJJIZL(EnumC1277350jLR enumC1277350jLR) {
        LinkMicType linkMicType;
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            int i = C1277300jLM.LIZJ[enumC1277350jLR.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        linkMicType = LinkMicType.LINK_MIC_TYPE_NONE;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    linkMicType = LinkMicType.LINK_MIC_TYPE_GUEST;
                }
            } else {
                linkMicType = LinkMicType.LINK_MIC_TYPE_ANCHOR;
            }
            interfaceC1276380jJs.setLinkMicType(linkMicType);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJJLI(long j) {
        String string;
        Integer num;
        Long lValueOf;
        Object obj;
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null && MultiGuestRtcAbSwitcherSetting.INSTANCE.isEnable()) {
            LruCache<String, Map<String, Object>> lruCache = C1913007eS.LIZ;
            C966020bFI c966020bFI = this.LLILZ;
            if (c966020bFI != null) {
                string = Long.valueOf(c966020bFI.LIZLLL).toString();
            } else {
                string = null;
            }
            try {
                Map<String, Object> map = C1913007eS.LIZ.get(string);
                if (map != null) {
                    obj = map.get("linkmic_sdk_enable_b_frame");
                } else {
                    obj = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getIntValue error ");
                sbLIZ.append("linkmic_sdk_enable_b_frame");
                sbLIZ.append(':');
                C20441214yg.LJFF("RtcAbUtil", C2188811AlT.LIZIZ(sbLIZ), th);
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            C965350bED c965350bED = this.LLILZ.LJJ;
            String str = this.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enableBFrameOnMixStream, sInteractSeq: ");
            C966020bFI c966020bFI2 = this.LLILZ;
            if (c966020bFI2 != null) {
                lValueOf = Long.valueOf(c966020bFI2.LIZLLL);
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(", enableBFrame: ");
            sbLIZ2.append(num);
            C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            if (num != null && num.intValue() != 0) {
                if (num.intValue() == 1) {
                    interfaceC1276380jJs.LJJJJJ(true);
                } else if (num.intValue() == 2) {
                    interfaceC1276380jJs.LJJJJJ(false);
                }
            }
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final long LJJJJLL(double d) {
        Integer numValueOf;
        C1275030jHh config;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reportAudioVolumeIndication]");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" duration=");
        sbLIZ.append(d);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null && (config = interfaceC1276380jJs2.getConfig()) != null) {
            config.LJIJJLI = (int) d;
            return 0L;
        }
        return 0L;
    }

    public final boolean LJJJJZ(Layout layout) {
        int size;
        Map<String, ? extends Map<String, LayoutArray>> map;
        String strLIZIZ;
        Map<String, LayoutArray> map2;
        boolean z;
        LayoutArray layoutArray;
        List<Float> list;
        LayoutArray layoutArray2;
        C967370bHT c967370bHT = this.LLILZ.LJJII;
        if (c967370bHT != null) {
            size = c967370bHT.LJI.LIZ(false).size() + c967370bHT.LJII.LIZ(false).size();
        } else {
            size = 0;
        }
        String str = null;
        if (size > 0) {
            if (layout != null && (map = layout.layoutData) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('c');
                sbLIZ.append(size);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                map2 = map.get(strLIZIZ);
            }
            map2 = null;
        } else {
            if (layout != null && (map = layout.layoutData) != null) {
                strLIZIZ = "c1";
                map2 = map.get(strLIZIZ);
            }
            map2 = null;
        }
        if (LinkmicRtcRatioOptimizeFullCanvasConfigId.getValue().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (map2 != null && (layoutArray2 = map2.get("1")) != null) {
                str = layoutArray2.configId;
            }
            return C13LQ.LJIILLIIL(str, LinkmicRtcRatioOptimizeFullCanvasConfigId.getValue());
        }
        if (map2 == null || (layoutArray = map2.get("1")) == null || (list = layoutArray.pos) == null || list.size() < 4 || ((Number) ListProtector.get(list, 0)).floatValue() != 0.0f || ((Number) ListProtector.get(list, 1)).floatValue() != 0.0f || ((Number) ListProtector.get(list, 2)).floatValue() != 1.0f || ((Number) ListProtector.get(list, 3)).floatValue() != 1.0f) {
            return false;
        }
        return true;
    }

    public final C1275750jIr LJJJLIIL(C01IN c01in) {
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs == null) {
            return null;
        }
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createAuxStream streamId=");
        sbLIZ.append(c01in.LIZ);
        sbLIZ.append(" streamId=");
        sbLIZ.append((String) null);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        return interfaceC1276380jJs.LJJIJ(c01in);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float LJJJLZIJ(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r9) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276910jKj.LJJJLZIJ(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0340  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C966980bGq LJJJZ(X.C1276970jKp r14) {
        /*
            Method dump skipped, instruction units count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276910jKj.LJJJZ(X.0jKp):X.0bGq");
    }

    public final void LJJLIIIJJIZ(boolean z) {
        InterfaceC1273910jFt liveCore;
        InterfaceC1273910jFt liveCore2;
        if (!z) {
            InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
            if (interfaceC754220TiG != null && (liveCore2 = interfaceC754220TiG.getLiveCore()) != null) {
                liveCore2.LIZ();
            }
        } else {
            InterfaceC754220TiG interfaceC754220TiG2 = this.LLJJJIL;
            if (interfaceC754220TiG2 != null && (liveCore = interfaceC754220TiG2.getLiveCore()) != null) {
                liveCore.LJIILL();
            }
        }
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.LJJLI(z);
        }
    }

    public final void LJJLIIIJLJLI(LinkCoreError linkCoreError) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("_1392");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[onInitError] error=");
        sbLIZ2.append(linkCoreError);
        C1AZW.LJI(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        LJJLIIJ(new C1277090jL1(this, linkCoreError));
    }

    public final void LJJLIIIJLLLLLLLZ(AbstractC1273900jFs abstractC1273900jFs) {
        boolean z;
        final C1274180jGK c1274180jGK = new C1274180jGK(this);
        C969040bKA c969040bKA = C969040bKA.LIZJ;
        if (C786410Ut5.W2(c969040bKA.LIZIZ) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && Intrinsics.LJFF(C786410Ut5.W2(c969040bKA.LIZIZ), Looper.myLooper())) {
            C20441214yg.LIZIZ("BackgroundHolderUtil", "runOnFire, run immediately");
            c1274180jGK.invoke();
        } else {
            C20441214yg.LIZIZ("BackgroundHolderUtil", "runOnFire, post to background thread");
            Runnable runnable = new Runnable() { // from class: X.0bsE
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BackgroundHolderUtil@7c0d.sam$java_lang_Runnable$0");
                    try {
                        c1274180jGK.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BackgroundHolderUtil@7c0d.sam$java_lang_Runnable$0");
                }
            };
            if (!c969040bKA.LIZIZ.isAlive()) {
                C1CC2.LIZ("thread not alive", new Throwable());
            }
            C786410Ut5.LJJZZIII(c969040bKA.LIZ, runnable);
        }
        if (!this.LLILLJJLI) {
            return;
        }
        LJJLIIJ(new C1276930jKl(this, abstractC1273900jFs));
    }

    public final void LJJLJLI(AbstractC1273900jFs abstractC1273900jFs) {
        final float fIntValue;
        if (!this.LLILLJJLI) {
            return;
        }
        ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setGaussBlurForMuteBg] avatarThumb=");
        sbLIZ.append(avatarThumb);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (avatarThumb == null) {
            return;
        }
        Pair<Integer, Integer> pair = this.LLJI;
        final float fIntValue2 = 0.0f;
        if (pair != null) {
            fIntValue = pair.getFirst().intValue();
        } else {
            fIntValue = 0.0f;
        }
        Pair<Integer, Integer> pair2 = this.LLJI;
        if (pair2 != null) {
            fIntValue2 = pair2.getSecond().intValue();
        }
        final C2476509n9 c2476509n9 = new C2476509n9(new C1277000jKs(abstractC1273900jFs));
        ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(avatarThumb, new InterfaceC177000m8() { // from class: X.09Ip
            /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:10:0x0015, B:12:0x001c, B:14:0x0022, B:17:0x0031, B:19:0x0037, B:15:0x0028), top: B:25:0x0015 }] */
            @Override // X.InterfaceC177000m8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.graphics.Bitmap r5) {
                /*
                    r4 = this;
                    if (r5 != 0) goto L3
                    return
                L3:
                    boolean r0 = r5.isRecycled()
                    if (r0 != 0) goto L42
                    int r0 = r5.getWidth()
                    if (r0 <= 0) goto L42
                    int r0 = r5.getHeight()
                    if (r0 <= 0) goto L42
                    float r3 = r1     // Catch: java.lang.Exception -> L3e
                    r2 = 0
                    int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L28
                    float r1 = r2     // Catch: java.lang.Exception -> L3e
                    int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L28
                    float r3 = r3 / r1
                    android.graphics.Bitmap r1 = X.C2349609Io.LIZ(r3, r5)     // Catch: java.lang.Exception -> L3e
                    goto L2f
                L28:
                    r0 = 1061108378(0x3f3f3a9a, float:0.74698794)
                    android.graphics.Bitmap r1 = X.C2349609Io.LIZ(r0, r5)     // Catch: java.lang.Exception -> L3e
                L2f:
                    if (r1 == 0) goto L3d
                    boolean r0 = r1.isRecycled()     // Catch: java.lang.Exception -> L3e
                    if (r0 != 0) goto L3d
                    kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> r0 = r3     // Catch: java.lang.Exception -> L3e
                    r0.invoke(r1)     // Catch: java.lang.Exception -> L3e
                    return
                L3d:
                    return
                L3e:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L42:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2349709Ip.LIZ(android.graphics.Bitmap):void");
            }
        });
    }

    @Override // X.InterfaceC2228581CKi
    public final void muteAllRemoteAudioStreams(boolean z) {
        Integer numValueOf;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[muteAllRemoteAudioStreams]");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" mute=");
        sbLIZ.append(z);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void muteAllRemoteVideoStreams(boolean z) {
        Integer numValueOf;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[muteAllRemoteVideoStreams]");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" mute=");
        sbLIZ.append(z);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            interfaceC1276380jJs2.muteAllRemoteVideoStreams(z);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void muteLocalAudioStream(boolean z) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[muteLocalAudioStream] mute=");
        sbLIZ.append(z);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.LJJJLIIL(z);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void muteLocalVideoStream(boolean z) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[muteLocalVideoStream] mute=");
        sbLIZ.append(z);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C966020bFI c966020bFI = this.LLILZ;
        C967770bI7 c967770bI7 = c966020bFI.LJJIFFI;
        Long l = (Long) ((ConcurrentHashMap) c967770bI7.LJIL).get(c966020bFI.LJJIJIIJI());
        if (l != null && l.longValue() > 0) {
            LJJLIIIJJIZ(false);
        } else {
            LJJLIIIJJIZ(z);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void setBizSessionId(String str) {
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.setBizSessionId(str);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void setGroupChannelId(String str) {
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.setGroupChannelId(str);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void setRemoteSessionNeedRender(boolean z) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call on setRemoteSessionNeedRender: ");
        sbLIZ.append(z);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2228581CKi
    public final void startForwardStreamToRooms(List<C1277180jLA> list) throws JSONException {
        Integer numValueOf;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sb = new StringBuilder("[startForwardStreamToRooms], client:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        sb.append(", config: ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        ArrayList<C1277180jLA> arrayList2 = (ArrayList) list;
        for (C1277180jLA c1277180jLA : arrayList2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("roomId", c1277180jLA.LIZ);
            jSONObject.put("rtcExtInfo", c1277180jLA.LIZIZ);
            arrayList.add(jSONObject);
        }
        sb.append(arrayList);
        C1AZW.LIZIZ(c965350bED, str, sb.toString(), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1277180jLA c1277180jLA2 : arrayList2) {
                arrayList3.add(new C1275450jIN(c1277180jLA2.LIZ, c1277180jLA2.LIZIZ));
            }
            interfaceC1276380jJs2.startForwardStreamToRooms(arrayList3);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void stopAuxStream(String str) {
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopAuxStream streamId=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str3 = this.LLILZIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stopAuxStream streamId=");
        sbLIZ2.append(str);
        C1AZW.LIZIZ(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.stopAuxStream(str);
        }
        C965900bF6.LIZ(new C966970bGp(this, str));
    }

    @Override // X.InterfaceC2228581CKi
    public final void unsubscribeAuxStream(final String str) {
        boolean z;
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsubscribeAuxStream: streamId:");
        sbLIZ.append(str);
        sbLIZ.append(", rtc_client: ");
        if (interfaceC1276380jJs != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJLILLLLZIIL.isEmpty()) {
            ((CopyOnWriteArrayList) this.LLJLILLLLZIIL).removeIf(new Predicate() { // from class: X.0jKw
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    InterfaceC1277190jLB interfaceC1277190jLB = (InterfaceC1277190jLB) obj;
                    if ((interfaceC1277190jLB instanceof C1277050jKx) && Intrinsics.LJFF(((C1277050jKx) interfaceC1277190jLB).LIZ, str)) {
                        return true;
                    }
                    return false;
                }
            });
        }
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.LJFF(str);
        }
        if (Intrinsics.LJFF(str, this.LLJJJJJIL)) {
            this.LLJJJJJIL = null;
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void updateForwardStreamToRooms(List<C1277180jLA> list) throws JSONException {
        Integer numValueOf;
        Integer numValueOf2;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sb = new StringBuilder("[updateForwardStreamToRooms], client:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        sb.append(", config: ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        ArrayList<C1277180jLA> arrayList2 = (ArrayList) list;
        for (C1277180jLA c1277180jLA : arrayList2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("roomId", c1277180jLA.LIZ);
            jSONObject.put("rtcExtInfo", c1277180jLA.LIZIZ);
            arrayList.add(jSONObject);
        }
        sb.append(arrayList);
        C1AZW.LIZIZ(c965350bED, str, sb.toString(), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1277180jLA c1277180jLA2 : arrayList2) {
                arrayList3.add(new C1275450jIN(c1277180jLA2.LIZ, c1277180jLA2.LIZIZ));
            }
            interfaceC1276380jJs2.updateForwardStreamToRooms(arrayList3);
        }
        C965350bED c965350bED2 = this.LLILZ.LJJ;
        String str2 = this.LLILZIL + "_324";
        StringBuilder sb2 = new StringBuilder("[updateForwardStreamToRooms], client=");
        InterfaceC1276380jJs interfaceC1276380jJs3 = this.LLJJJJ;
        if (interfaceC1276380jJs3 != null) {
            numValueOf2 = Integer.valueOf(interfaceC1276380jJs3.hashCode());
        } else {
            numValueOf2 = null;
        }
        sb2.append(numValueOf2);
        C1AZW.LJIIIZ(c965350bED2, str2, sb2.toString(), null, null);
    }

    public static C966980bGq LJJLIIIJL(int i, String str) {
        return new C966980bGq(i, str, "", "", "");
    }

    @Override // X.InterfaceC2182071Aab
    public final void LIZJ(long j, String str) {
        InterfaceC1273910jFt liveCore;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[startMediaPlayer] streamerID:");
        sbLIZ.append(str);
        sbLIZ.append(", offset=");
        sbLIZ.append(j);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        if (interfaceC754220TiG != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null) {
            liveCore.LIZJ(j, str);
        }
    }

    @Override // X.InterfaceC2182071Aab
    public final void LJ(String str, String str2) {
        InterfaceC1273910jFt liveCore;
        InterfaceC1273910jFt liveCore2;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str3 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setMediaDataSource] liveClient:");
        sbLIZ.append(this.LLJJJIL);
        sbLIZ.append(", liveCore:");
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        if (interfaceC754220TiG != null) {
            liveCore = interfaceC754220TiG.getLiveCore();
        } else {
            liveCore = null;
        }
        sbLIZ.append(liveCore);
        sbLIZ.append(", streamerID:");
        sbLIZ.append(str);
        sbLIZ.append(", dataSource:");
        sbLIZ.append(str2);
        C1AZW.LIZIZ(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG2 = this.LLJJJIL;
        if (interfaceC754220TiG2 != null && (liveCore2 = interfaceC754220TiG2.getLiveCore()) != null) {
            liveCore2.LJJJI(str, str2);
        }
    }

    @Override // X.InterfaceC2182071Aab
    public final void LJFF(String str, C947150akr c947150akr) {
        InterfaceC1273910jFt liveCore;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[createMediaPlayer] streamerID:");
        sbLIZ.append(str);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        if (interfaceC754220TiG != null && (liveCore = interfaceC754220TiG.getLiveCore()) != null) {
            liveCore.LJJZZIII(str, EnumC1269640j90.LOCAL_RENDER_AND_REMOTE_MIX, c947150akr);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJI(C1276950jKn c1276950jKn, double d) {
        boolean zLJJJJLL;
        InterfaceC1273910jFt liveCore;
        AbstractC1273900jFs abstractC1273900jFs;
        InterfaceC1273910jFt liveCore2;
        AbstractC1273900jFs abstractC1273900jFs2;
        Pair<Integer, Integer> pair;
        InterfaceC1276380jJs interfaceC1276380jJs;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateMediaConfig] ");
        sbLIZ.append(c1276950jKn);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if ((!a0.LJJJIL(c1276950jKn.LJIIJ)) && (interfaceC1276380jJs = this.LLJJJJ) != null) {
            interfaceC1276380jJs.setBusinessId(c1276950jKn.LJIIJ);
        }
        Resolution resolution = new Resolution(0, 0, 0, 0, "linkmic_grid_float_1", 0, 0, "layout_default", new RtcParams((int) c1276950jKn.LIZJ, (int) c1276950jKn.LIZLLL, (int) c1276950jKn.LIZ, (int) c1276950jKn.LIZIZ, (int) c1276950jKn.LJFF, (int) c1276950jKn.LJI, (int) c1276950jKn.LJ, C2097608Jq.LJIIIIZZ(new Pair("width", Integer.valueOf((int) c1276950jKn.LJIIIIZZ)), new Pair("height", Integer.valueOf((int) c1276950jKn.LJIIIZ)), new Pair("fps", Integer.valueOf((int) c1276950jKn.LJII)))));
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            zLJJJJLL = interfaceC1276380jJs2.LJJJJLL();
        } else {
            zLJJJJLL = false;
        }
        if (!LJJLIIIJJI() || !zLJJJJLL) {
            InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
            if (interfaceC754220TiG != null) {
                liveCore = interfaceC754220TiG.getLiveCore();
            } else {
                liveCore = null;
            }
            if ((liveCore instanceof AbstractC1273900jFs) && (abstractC1273900jFs = (AbstractC1273900jFs) liveCore) != null) {
                LJJLIIJ(new C1276920jKk(true, this, abstractC1273900jFs, resolution, d));
            }
        }
        Pair<Integer, Integer> pair2 = this.LLJI;
        if (pair2 == null || pair2.getFirst().intValue() != resolution.getWidth() || (pair = this.LLJI) == null || pair.getSecond().intValue() != resolution.getHeight()) {
            this.LLJI = new Pair<>(Integer.valueOf(resolution.getWidth()), Integer.valueOf(resolution.getHeight()));
            C966020bFI c966020bFI = this.LLILZ;
            if (c966020bFI.LJ().LJI(c966020bFI.LJJIJIIJI())) {
                InterfaceC754220TiG interfaceC754220TiG2 = this.LLJJJIL;
                if (interfaceC754220TiG2 != null) {
                    liveCore2 = interfaceC754220TiG2.getLiveCore();
                } else {
                    liveCore2 = null;
                }
                if ((liveCore2 instanceof AbstractC1273900jFs) && (abstractC1273900jFs2 = (AbstractC1273900jFs) liveCore2) != null) {
                    LJJLJLI(abstractC1273900jFs2);
                }
            }
        }
        InterfaceC1279800jPO interfaceC1279800jPO = this.LLJJJ;
        if (interfaceC1279800jPO != null) {
            interfaceC1279800jPO.LJJIFFI(resolution.getWidth(), resolution.getHeight(), resolution.getFps());
        }
        C1AZW.LIZIZ(this.LLILZ.LJJ, this.LLILZIL, "rust_updateMediaConfig , simulcast = " + zLJJJJLL + " resolution = " + resolution.getWidth() + 'x' + resolution.getHeight(), null, null);
        this.LLJJIII = false;
    }

    @Override // X.InterfaceC2182071Aab
    public final void LJIJJ(String str, boolean z) {
        boolean z2;
        InterfaceC1273910jFt liveCore;
        InterfaceC1273910jFt liveCore2;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableDoubleDisplay enable=");
        sbLIZ.append(z);
        sbLIZ.append(" streamId=");
        sbLIZ.append(str);
        sbLIZ.append(" rtcClient ?: ");
        if (this.LLJJJJ == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (z) {
            InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
            if (interfaceC754220TiG != null && (liveCore2 = interfaceC754220TiG.getLiveCore()) != null) {
                if (str == null) {
                    str = this.LLILZ.LJJIJIIJI();
                }
                liveCore2.LJJLIIIJLLLLLLLZ(str, EnumC1269700j96.CameraView_And_SingleViewRender);
                return;
            }
            return;
        }
        InterfaceC754220TiG interfaceC754220TiG2 = this.LLJJJIL;
        if (interfaceC754220TiG2 == null || (liveCore = interfaceC754220TiG2.getLiveCore()) == null) {
            return;
        }
        if (str == null) {
            str = this.LLILZ.LJJIJIIJI();
        }
        liveCore.LJJLIIIJLLLLLLLZ(str, EnumC1269700j96.SingleView_Render);
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJIJJLI(long j, String str) {
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.setRemoteAudioPlaybackVolume(str, (int) j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x019c A[Catch: Exception -> 0x01eb, TryCatch #0 {Exception -> 0x01eb, blocks: (B:29:0x00a1, B:31:0x00b6, B:32:0x00ba, B:34:0x00c2, B:36:0x00c8, B:40:0x00d0, B:42:0x00d8, B:44:0x00de, B:46:0x00f4, B:60:0x012c, B:64:0x013b, B:66:0x0144, B:72:0x0154, B:68:0x0148, B:70:0x0151, B:73:0x019c, B:77:0x01da, B:78:0x01dc, B:47:0x00fe, B:50:0x0109, B:52:0x010f), top: B:138:0x00a1 }] */
    @Override // X.InterfaceC2228581CKi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(double r20, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276910jKj.LJJIIZ(double, java.lang.String):void");
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJIJL(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (this.LLJJJJ == null) {
                this.LLJJIJI = new C1276960jKo(this, str, str2, jSONObject);
                return;
            }
            String str3 = this.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateTTLHAbChannelParams, cdid=");
            sbLIZ.append(str);
            sbLIZ.append(", config=");
            sbLIZ.append(str2);
            C1AZW.LJIIJ(12, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
            LJJLIL(str, str2);
            InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.LJJJJ(str, jSONObject);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C965350bED c965350bED = this.LLILZ.LJJ;
            String str4 = this.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Invalid JSON string, e = ");
            sbLIZ2.append(th);
            C1AZW.LJI(c965350bED, str4, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJIL(String str, String str2) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str3 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendRtcUserMessage] linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(", msg=");
        sbLIZ.append(str2);
        C1AZW.LIZIZ(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.sendUserMessage(str, str2);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJJJJL(String str, EnumC1277330jLP enumC1277330jLP) {
        boolean z;
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeAuxStream: streamId:");
        sbLIZ.append(str);
        sbLIZ.append(", type:");
        sbLIZ.append(enumC1277330jLP);
        sbLIZ.append(", rtc_client: ");
        if (interfaceC1276380jJs != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1276380jJs == null) {
            ((CopyOnWriteArrayList) this.LLJLILLLLZIIL).add(new C1277050jKx(str, enumC1277330jLP, new C1276980jKq(this)));
            return;
        }
        int i = C1277300jLM.LIZ[enumC1277330jLP.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LLJJJJLIIL.put(str, 2);
                    interfaceC1276380jJs.LJJJLL(str, true, false);
                    return;
                }
                throw new C1954807lC();
            }
            this.LLJJJJLIIL.put(str, 1);
            interfaceC1276380jJs.LJJJLL(str, false, true);
            return;
        }
        this.LLJJJJLIIL.put(str, 0);
        interfaceC1276380jJs.LJJLJ(str);
    }

    public final void LJJLIL(String str, String str2) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("updateTTLHAbChannelParams");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ.LIZJ), "secne");
            c474500IjALIZ.LJJII(str, "cdid");
            c474500IjALIZ.LJJII(str2, "config");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJJLJ(String str, List list) {
        InterfaceC1276380jJs interfaceC1276380jJs;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            C965350bED c965350bED = this.LLILZ.LJJ;
            String str2 = this.LLILZIL;
            StringBuilder sb = new StringBuilder("mode:");
            sb.append(this.LLIZLLLIL);
            sb.append(", source: ");
            sb.append(str);
            sb.append(", setCompositeLayout: ");
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1276780jKW c1276780jKW = (C1276780jKW) it2.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stream_id", c1276780jKW.LIZ);
                jSONObject.put("window_id", c1276780jKW.LJI);
                jSONObject.put("x", Float.valueOf(c1276780jKW.LIZIZ));
                jSONObject.put("y", Float.valueOf(c1276780jKW.LIZJ));
                jSONObject.put("w", Float.valueOf(c1276780jKW.LIZLLL));
                jSONObject.put("h", Float.valueOf(c1276780jKW.LJ));
                jSONObject.put("z", c1276780jKW.LJFF);
                arrayList.add(jSONObject);
            }
            sb.append(arrayList);
            C1AZW.LIZIZ(c965350bED, str2, sb.toString(), null, null);
        }
        EnumC952680atm enumC952680atm = this.LLIZLLLIL;
        if ((enumC952680atm == EnumC952680atm.SINGLE_VIEWMODE_V2 || enumC952680atm == EnumC952680atm.SINGLE_VIEWMODE) && (interfaceC1276380jJs = this.LLJJJJ) != null) {
            interfaceC1276380jJs.LJJLIIIJL(list);
        }
    }

    public final View LJJLL(EnumC952680atm enumC952680atm, C2182171Aal c2182171Aal) {
        int iHashCode;
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        SurfaceHolder holder;
        String extra;
        ArrayList arrayList;
        boolean z;
        LiveEffect liveEffectLIZLLL;
        JSONObject jSONObject;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[switchRenderViewModeV2], call ttlh setInteractViewMode, mode:");
        sbLIZ.append(enumC952680atm);
        sbLIZ.append(", rtcClient:");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            iHashCode = interfaceC1276380jJs.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append(", renderResult:");
        sbLIZ.append(c2182171Aal);
        C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 == null) {
            return null;
        }
        if (this.LLIZLLLIL != enumC952680atm) {
            int i = C1277300jLM.LIZIZ[enumC952680atm.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (this.LLIZLLLIL == EnumC952680atm.SINGLE_VIEWMODE) {
                        interfaceC1276380jJs2.LJJLIIIJJIZ(EnumC1277210jLD.MULTI_VIEW);
                    } else {
                        interfaceC1276380jJs2.LJJJJIZL(EnumC1277210jLD.MULTI_VIEW, null);
                    }
                } else {
                    interfaceC1276380jJs2.LJJLIIIJJIZ(EnumC1277210jLD.SINGLE_VIEW);
                }
            } else {
                InterfaceC965150bDt interfaceC965150bDt = this.LLJLLIL;
                String str2 = "";
                if (interfaceC965150bDt != null && (liveEffectLIZLLL = interfaceC965150bDt.LIZLLL()) != null) {
                    String filePath = liveEffectLIZLLL.getFilePath();
                    String panel = liveEffectLIZLLL.getPanel();
                    extra = liveEffectLIZLLL.getExtra();
                    if (extra == null) {
                        extra = "";
                    }
                    try {
                        if (!Intrinsics.LJFF(extra, "")) {
                            jSONObject = new JSONObject(extra);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        jSONObject.put("sticker_panel", panel);
                        jSONObject.put("effect_id", String.valueOf(liveEffectLIZLLL.getEffectId()));
                        extra = C786410Ut5.J3(jSONObject);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    str2 = filePath;
                } else {
                    extra = "{}";
                }
                if (c2182171Aal != null) {
                    C2181961AaQ c2181961AaQ = c2182171Aal.LIZ;
                    C1283980jW8 c1283980jW8 = c2181961AaQ.LIZJ.LIZIZ;
                    double d = c1283980jW8.LIZJ - c1283980jW8.LIZ;
                    double d2 = c1283980jW8.LIZLLL - c1283980jW8.LIZIZ;
                    List<C2181741Aa4> list = c2181961AaQ.LIZLLL;
                    ArrayList<C2181741Aa4> arrayList2 = new ArrayList();
                    for (C2181741Aa4 c2181741Aa4 : list) {
                        EnumC1283210jUt enumC1283210jUt = c2181741Aa4.LJIIIIZZ.LIZ;
                        if (enumC1283210jUt != EnumC1283210jUt.RtcUserId && enumC1283210jUt != EnumC1283210jUt.RtcStreamId) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            arrayList2.add(c2181741Aa4);
                        }
                    }
                    arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    for (C2181741Aa4 c2181741Aa42 : arrayList2) {
                        String str3 = c2181741Aa42.LJIIIIZZ.LIZIZ;
                        int i2 = (int) c2181741Aa42.LIZIZ;
                        C1283980jW8 c1283980jW82 = c2181741Aa42.LIZLLL.LIZIZ;
                        double d3 = c1283980jW82.LIZ;
                        double d4 = c1283980jW82.LIZIZ;
                        arrayList.add(new C1276780jKW(str3, (float) (d3 / d), (float) (d4 / d2), (float) ((c1283980jW82.LIZJ - d3) / d), (float) ((c1283980jW82.LIZLLL - d4) / d2), (int) c2181741Aa42.LJII, i2));
                    }
                } else {
                    arrayList = null;
                }
                C1273200jEk c1273200jEk = new C1273200jEk(null, arrayList, "", str2, null);
                c1273200jEk.LJ = extra;
                c1273200jEk.LJI = EnumC1273220jEm.EFFECT_MIX;
                interfaceC1276380jJs2.LJJJJIZL(EnumC1277210jLD.SINGLE_VIEW, c1273200jEk);
            }
            this.LLIZLLLIL = enumC952680atm;
        } else {
            C965350bED c965350bED2 = this.LLILZ.LJJ;
            String str4 = this.LLILZIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[switchRenderViewModeV2], skip setInteractViewMode, currentMode :");
            sbLIZ2.append(this.LLIZLLLIL);
            sbLIZ2.append(" , targetMode :");
            sbLIZ2.append(enumC952680atm);
            C1AZW.LJIILLIIL(c965350bED2, str4, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        }
        if (enumC952680atm != EnumC952680atm.SINGLE_VIEWMODE_V2 && enumC952680atm != EnumC952680atm.SINGLE_VIEWMODE) {
            return null;
        }
        View viewLJJIJLIJ = interfaceC1276380jJs2.LJJIJLIJ();
        viewLJJIJLIJ.setTag("linkmic_single_view");
        viewLJJIJLIJ.setBackgroundColor(0);
        boolean z2 = viewLJJIJLIJ instanceof SurfaceView;
        if (z2) {
            surfaceView = (SurfaceView) viewLJJIJLIJ;
        } else {
            surfaceView = null;
        }
        if (surfaceView != null) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        if (z2) {
            surfaceView2 = (SurfaceView) viewLJJIJLIJ;
        } else {
            surfaceView2 = null;
        }
        if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
            holder.setFormat(-3);
        }
        return viewLJJIJLIJ;
    }

    @Override // X.InterfaceC2228581CKi
    public final void muteAuxStreamAudio(String str, boolean z) {
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.LJJJJZI(str, z);
        }
    }

    @Override // X.InterfaceC2228581CKi
    public final void muteRemoteAudioStream(String str, boolean z) {
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[muteRemoteAudioStream] linkmicId=");
        sbLIZ.append(str);
        sbLIZ.append(", mute=");
        sbLIZ.append(z);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.muteRemoteAudioStream(str, z);
        }
    }

    @Override // X.InterfaceC2182071Aab
    public final void LJJIJIL(String str, float f, boolean z) {
        boolean z2;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str2 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCornerRadius linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" radius=");
        sbLIZ.append(f);
        sbLIZ.append(" isAuxStream=");
        sbLIZ.append(z);
        sbLIZ.append(" rtcClient ?: ");
        if (this.LLJJJJ == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C1AZW.LIZIZ(c965350bED, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (z) {
            InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
            if (interfaceC1276380jJs != null) {
                interfaceC1276380jJs.LJJLIIIIJ(f, str);
                return;
            }
            return;
        }
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 == null) {
            return;
        }
        interfaceC1276380jJs2.LJJLJLI(f, str);
    }

    public C1276910jKj(Room room, boolean z, int i, C966020bFI c966020bFI) {
        String str;
        this.LL = room;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = c966020bFI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        int i2 = c966020bFI.LIZJ;
        if (i2 == 0) {
            str = "Union";
        } else if (i2 == 4) {
            str = " Multi";
        } else {
            str = "Cross";
        }
        sbLIZ.append(str);
        sbLIZ.append("LiveStreamer[Biz]");
        this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = EnumC952680atm.DEFAULT;
        this.LLJJJJLIIL = new LinkedHashMap();
        this.LLJJL = "";
        this.LLJLILLLLZIIL = new CopyOnWriteArrayList();
        this.LLJLLL = C452501pT.LIZIZ(new C973000bQY(this));
        this.LLJZ = C452501pT.LIZIZ(new C972990bQX(this));
        this.LLJZIJLIL = C452501pT.LIZIZ(new C1277080jL0(this));
    }

    @Override // X.InterfaceC2228581CKi
    public final void LJJI(final long j, final String str, final String str2, final String str3) {
        Integer numValueOf;
        InterfaceC1273910jFt liveCore;
        InterfaceC1273910jFt liveCore2;
        C965350bED c965350bED = this.LLILZ.LJJ;
        String str4 = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendSei] key=");
        sbLIZ.append(str);
        sbLIZ.append(", value=");
        sbLIZ.append(str2);
        sbLIZ.append(", repeatTimes=");
        sbLIZ.append(j);
        sbLIZ.append(", dataFlowId=");
        sbLIZ.append(str3);
        sbLIZ.append(" client = ");
        InterfaceC754220TiG interfaceC754220TiG = this.LLJJJIL;
        if (interfaceC754220TiG != null && (liveCore2 = interfaceC754220TiG.getLiveCore()) != null) {
            numValueOf = Integer.valueOf(liveCore2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1AZW.LIZIZ(c965350bED, str4, C2188811AlT.LIZIZ(sbLIZ), null, null);
        InterfaceC754220TiG interfaceC754220TiG2 = this.LLJJJIL;
        if (interfaceC754220TiG2 != null && (liveCore = interfaceC754220TiG2.getLiveCore()) != null) {
            liveCore.LJJJJZI(str, true, false, str3, (int) j, str2);
        }
        if (Intrinsics.LJFF(str3, "1610666042")) {
            new PthreadTimer("RustLiveStreamer").schedule(new C0W9W() { // from class: X.0bKS
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    InterfaceC1273910jFt liveCore3;
                    C1C7U.LIZ("RustLiveStreamer@4533.sendSei$1");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        InterfaceC754220TiG interfaceC754220TiG3 = this.LL.LLJJJIL;
                        if (interfaceC754220TiG3 != null && (liveCore3 = interfaceC754220TiG3.getLiveCore()) != null) {
                            liveCore3.LJJJJZI(str, true, false, str3, (int) j, str2);
                        }
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("RustLiveStreamer@4533.sendSei$1");
                }
            }, 3000L);
        }
    }

    public final void LJJJJZI(boolean z, boolean z2, String str, Cert cert) {
        Integer numValueOf;
        InterfaceC1273910jFt liveCore;
        AbstractC1273900jFs abstractC1273900jFs;
        InterfaceC754220TiG interfaceC754220TiG;
        InterfaceC1273910jFt liveCore2;
        InterfaceC1273910jFt liveCore3;
        InterfaceC1277100jL2 interfaceC1277100jL2;
        C965350bED c965350bED = this.LLILZ.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append("_1138");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[commonOff], client=");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            numValueOf = Integer.valueOf(interfaceC1276380jJs.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(", offRtcClient:");
        sbLIZ2.append(z);
        sbLIZ2.append(", offLiveClient:");
        sbLIZ2.append(z2);
        sbLIZ2.append(", source:");
        sbLIZ2.append(str);
        C1AZW.LJI(c965350bED, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        if (LinkMicSDKOptimizeUpdateSeiFrequencyConfigSetting.INSTANCE.getValue().enable && (interfaceC1277100jL2 = this.LLJL) != null) {
            interfaceC1277100jL2.dispose();
        }
        if (this.LLILZLL) {
            C968320bJ0.LIZ.compareAndSet(true, false);
            this.LLILZLL = false;
        }
        ((CopyOnWriteArrayList) this.LLJLILLLLZIIL).clear();
        InterfaceC1276380jJs interfaceC1276380jJs2 = this.LLJJJJ;
        if (interfaceC1276380jJs2 != null) {
            LJJLL(EnumC952680atm.DEFAULT, null);
            if (cert != null) {
                interfaceC1276380jJs2.stop(cert);
            } else {
                interfaceC1276380jJs2.stop();
            }
            interfaceC1276380jJs2.dispose();
            if (z) {
                interfaceC1276380jJs2.LJJZ(null);
                LJJIJIL(this.LLILZ.LJFF().linkMicId, 0.0f, false);
                InterfaceC754220TiG interfaceC754220TiG2 = this.LLJJJIL;
                if (interfaceC754220TiG2 != null && (liveCore3 = interfaceC754220TiG2.getLiveCore()) != null) {
                    liveCore3.LJJZZI();
                }
                this.LLJJJJ = null;
            }
        }
        if (LinkMicSetLiveSeiSetting.getValue() && (interfaceC754220TiG = this.LLJJJIL) != null && (liveCore2 = interfaceC754220TiG.getLiveCore()) != null) {
            liveCore2.LJJIZ("ttls_live_scene", true, false, "1610665997", -1, "video");
        }
        if (!LinkMicSdkDisposeAfterRtcEndSetting.getValue() && this.LLILLJJLI) {
            this.LLJJIJIL = true;
        }
        if (z2) {
            if (!LinkMicDynamicLayoutMediaSetting.INSTANCE.enable()) {
                InterfaceC754220TiG interfaceC754220TiG3 = this.LLJJJIL;
                if (interfaceC754220TiG3 != null) {
                    liveCore = interfaceC754220TiG3.getLiveCore();
                } else {
                    liveCore = null;
                }
                if ((liveCore instanceof AbstractC1273900jFs) && (abstractC1273900jFs = (AbstractC1273900jFs) liveCore) != null) {
                    LJJLIIIJLLLLLLLZ(abstractC1273900jFs);
                }
            }
            this.LLJJJIL = null;
        }
        this.LLJL = null;
        this.LLJ = false;
        this.LLJJIJIIJIL = null;
    }
}
