package X;

import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.networkctrl.LiveNetworkCtrlSetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;

/* JADX INFO: renamed from: X.0KY5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KY5 implements InterfaceC519030KXd {
    public static final C0KY5 LIZ = new C0KY5();
    public static final C13M7<String> LIZIZ = new C13M7<>();
    public static final C13M7<Integer> LIZJ = new C13M7<>();
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;

    static {
        IPullStreamService iPullStreamService;
        InterfaceC465170ILz interfaceC465170ILz = new InterfaceC465170ILz() { // from class: X.0KY4
            @Override // X.InterfaceC465170ILz
            public final void LIZ(String str, boolean z, boolean z2, boolean z3) {
                if (!z3 && !z2) {
                    if (z) {
                        C0KY5.LIZIZ.add(str);
                    } else {
                        C0KY5.LIZIZ.remove(str);
                    }
                    C0KY5 c0ky5 = C0KY5.LIZ;
                    boolean z4 = !C0KY5.LIZIZ.isEmpty();
                    if (z4 != C0KY5.LIZLLL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onPullStreamStatusChanged curIsPullStream = ");
                        sbLIZ.append(z4);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (z4) {
                            C0KY5.LIZ(1);
                        } else {
                            C0KY5.LIZIZ(1);
                        }
                        C0KY5.LIZLLL = z4;
                    }
                }
            }
        };
        if (!LiveNetworkCtrlSetting.INSTANCE.value().getEnable() || (iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)) == null) {
            return;
        }
        iPullStreamService.sW1(interfaceC465170ILz);
    }

    @Override // X.InterfaceC519030KXd
    public final boolean enable() {
        return LiveNetworkCtrlSetting.INSTANCE.value().getEnable();
    }

    public static void LIZ(int i) {
        C1281010jRL c1281010jRL;
        int i2;
        C13M7<Integer> c13m7 = LIZJ;
        c13m7.add(Integer.valueOf(i));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addBlockScene blockScene = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c13m7.size() > 0 && !LJ) {
            int networkState = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getNetworkState();
            Object objLIZ = ((C0KY6) C1161920gLG.LIZJ(ILiveDecisionService.class)).LIZ("live_network_state", "default", "default");
            if (objLIZ instanceof C1281010jRL) {
                c1281010jRL = (C1281010jRL) objLIZ;
            } else {
                c1281010jRL = null;
            }
            if (c1281010jRL != null) {
                i2 = c1281010jRL.LIZJ;
            } else {
                i2 = 0;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkWeakNetwork effectiveConnectionType = ");
            sbLIZ2.append(networkState);
            sbLIZ2.append(" liveNetworkQuality = ");
            sbLIZ2.append(i2);
            C2188811AlT.LIZIZ(sbLIZ2);
            LiveNetworkCtrlSetting liveNetworkCtrlSetting = LiveNetworkCtrlSetting.INSTANCE;
            if (networkState <= liveNetworkCtrlSetting.value().getThresholdTtnetNetworkType() && i2 <= liveNetworkCtrlSetting.value().getThresholdLiveNetworkStateV2()) {
                IHostNetwork iHostNetwork = (IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class);
                if (iHostNetwork != null) {
                    iHostNetwork.registerNetworkControl("biz_live_inner_feed_pull_stream", liveNetworkCtrlSetting.value().getNetworkCtrlConfig());
                }
                LJ = true;
            }
        }
    }

    public static void LIZIZ(int i) {
        C13M7<Integer> c13m7 = LIZJ;
        c13m7.remove(Integer.valueOf(i));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeBlockScene blockScene = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c13m7.size() == 0 && LJ) {
            IHostNetwork iHostNetwork = (IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class);
            if (iHostNetwork != null) {
                iHostNetwork.unRegisterNetworkControl("biz_live_inner_feed_pull_stream");
            }
            LJ = false;
        }
    }

    @Override // X.InterfaceC519030KXd
    public final void S5(EnumC480200IsM enumC480200IsM) {
        int i = C480230IsP.LIZ[enumC480200IsM.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZIZ(2);
                return;
            }
            return;
        }
        LIZ(2);
    }
}
