package X;

import Y.ARunnableS23S0201000_17;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueMockFailSettings;
import com.bytedance.android.livesdk.livesetting.gift.LynxUrlStorage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS27S0401000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1136420fg8 extends AbstractC1135650fet {
    public final void LJIJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        Boolean bool;
        int iLJ = LJ();
        if (LJIIIZ(iLJ)) {
            LJIILL(iLJ, interfaceC1136020ffU);
            return;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
            LJIIIIZZ(new AwS418S0200000_17(this, interfaceC1136020ffU, 111));
            return;
        }
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockCreateEffectFail()) {
            LJIILLIIL(iLJ, interfaceC1136020ffU, null, "mock create effect fail", null);
            return;
        }
        ARunnableS23S0201000_17 aRunnableS23S0201000_17 = new ARunnableS23S0201000_17(iLJ, interfaceC1136020ffU, this, 8);
        if (!interfaceC1136020ffU.LJ()) {
            DataChannel dataChannel = this.LJ;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            } else {
                bool = null;
            }
            if (!C176600m4.LIZIZ(bool) && C1135870ffF.LJIJI(interfaceC1136020ffU) != UserService.getInstance().user().getCurrentUserId()) {
                C786410Ut5.LJJZZIII(this.LIZ, aRunnableS23S0201000_17);
                return;
            }
        }
        aRunnableS23S0201000_17.run();
    }

    public final void LJIILL(int i, InterfaceC1136020ffU interfaceC1136020ffU) {
        if (LJI(i)) {
            AbstractC1135650fet.LJII(this, "drop msg due to invalid room");
        } else {
            C1133910fc5.LIZIZ(LIZLLL(), "drop msg due to clear screen mode");
        }
        InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZLLL(interfaceC1136020ffU);
        }
        this.LIZLLL = false;
        LJIIJ();
    }

    public final void LJIILJJIL(int i, InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI) {
        long id;
        boolean z;
        String str;
        if (LJIIIZ(i)) {
            LJIILL(i, interfaceC1136020ffU);
            return;
        }
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(c1135280feI.LJFF);
        if (assetsModelLIZLLL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadFromGeckoForLynxGift fail, assetsModel is null, effectId:");
            sbLIZ.append(c1135280feI.LJFF);
            LJIILLIIL(i, interfaceC1136020ffU, c1135280feI, C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
        if (interfaceC1136800fgkLIZJ != null) {
            id = interfaceC1136800fgkLIZJ.getId();
        } else {
            GiftMonitorInfo giftMonitorInfoLJIIL = interfaceC1136020ffU.LJIIL();
            if (giftMonitorInfoLJIIL != null) {
                id = giftMonitorInfoLJIIL.to_user_id;
            } else {
                id = 0;
            }
        }
        boolean zLJ = interfaceC1136020ffU.LJ();
        if (id == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        String logId = interfaceC1136020ffU.getLogId();
        Long lValueOf = Long.valueOf(interfaceC1136020ffU.getMessageId());
        Map mapLJIIIZ = C1135800ff8.LJIIIZ(interfaceC1136020ffU);
        C1135800ff8.LJIJJLI(mapLJIIIZ);
        mapLJIIIZ.putAll(C1136080ffa.LIZIZ());
        C1137020fh6.LIZ.getClass();
        mapLJIIIZ.put(Scene.SCENE_SERVICE, String.valueOf(C1137020fh6.LIZIZ()));
        if (interfaceC1136020ffU.LJIJJLI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIIIZ.put("disable_gift_tracking", str);
        mapLJIIIZ.put("revenue_unified_overload_score", ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL());
        interfaceC1136020ffU.LJIIIIZZ();
        mapLJIIIZ.put("is_interactive_gift", String.valueOf(C1135870ffF.LJIILJJIL(Integer.valueOf(C1135870ffF.LJII(interfaceC1136020ffU))) ? 1 : 0));
        mapLJIIIZ.put("is_background", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() ? 1 : 0));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(64);
        concurrentHashMap.putAll(mapLJIIIZ);
        C1138500fjU c1138500fjU = new C1138500fjU(assetsModelLIZLLL, zLJ, z, logId, lValueOf, concurrentHashMap);
        c1138500fjU.LIZJ(false);
        int i2 = assetsModelLIZLLL.resourceType;
        int i3 = AssetsModel.RESOURCE_TYPE_LYNX;
        if (i2 == i3) {
            C1137480fhq c1137480fhq = C1137480fhq.LIZ;
            AwS27S0401000_17 awS27S0401000_17 = new AwS27S0401000_17(this, i, interfaceC1136020ffU, c1135280feI, c1138500fjU, 1);
            c1137480fhq.getClass();
            String str2 = "";
            if (assetsModelLIZLLL.resourceType != i3) {
                awS27S0401000_17.invoke(Boolean.TRUE, "");
                return;
            }
            String str3 = assetsModelLIZLLL.lynxUrlSettingsKey;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = LynxUrlStorage.INSTANCE.getValue().get(str3);
            if (str4 == null) {
                str4 = "";
            }
            C1136940fgy.LIZ.getClass();
            C1136140ffg.LIZJ(interfaceC1136020ffU, c1135280feI, 2, 2);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str4), "channel");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
            if (!a0.LJJJIL(str2)) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1136480fgE(str2, assetsModelLIZLLL, interfaceC1136020ffU, c1135280feI, 0, awS27S0401000_17, 1, null), 3);
                return;
            } else {
                C1136140ffg.LIZJ(interfaceC1136020ffU, c1135280feI, 3, 1);
                awS27S0401000_17.invoke(Boolean.FALSE, "channel is empty");
                return;
            }
        }
        LJIIL(i, interfaceC1136020ffU, c1135280feI, c1138500fjU);
    }

    public final void LJIIL(final int i, final InterfaceC1136020ffU interfaceC1136020ffU, final C1135280feI c1135280feI, final C1138500fjU c1138500fjU) {
        boolean z;
        long jLongValue;
        if (LJIIIZ(i)) {
            LJIILL(i, interfaceC1136020ffU);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(C1136050ffX.LIZ(interfaceC1136020ffU, c1135280feI));
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(c1135280feI.LJFF);
        if (assetsModelLIZLLL != null && assetsModelLIZLLL.resourceType == AssetsModel.RESOURCE_TYPE_LYNX) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Long lValueOf = Long.valueOf(C1135270feH.LIZIZ(interfaceC1136020ffU));
            if (lValueOf.longValue() > 0) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = c1135280feI.LJFF;
            }
            linkedHashSet.remove(Long.valueOf(jLongValue));
        }
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockDownloadEffectFail()) {
            c1138500fjU.LIZ(false, new C1141050fnb(-13, "mock download effect fail", null), false);
            LJIILLIIL(i, interfaceC1136020ffU, c1135280feI, "mock download effect fail", c1138500fjU.LJFF);
            return;
        }
        final InterfaceC1137580fi0 interfaceC1137580fi0LIZ = C1131950fYv.LIZ(c1135280feI.LJFF);
        if (interfaceC1137580fi0LIZ.LIZIZ()) {
            c1138500fjU.LIZ(false, new C1141050fnb(-14, "cancelByTimeout", null), false);
            LJIILL(i, interfaceC1136020ffU);
            return;
        }
        if (linkedHashSet.isEmpty()) {
            interfaceC1137580fi0LIZ.LIZ();
            c1138500fjU.LJII = true;
            ConcurrentHashMap<String, String> concurrentHashMap = c1138500fjU.LJFF;
            if (concurrentHashMap != null) {
                concurrentHashMap.put("effect_load_status", CardStruct.IStatusCode.DEFAULT);
            }
            LJIILIIL(i, interfaceC1136020ffU, c1135280feI, c1138500fjU);
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = c1138500fjU.LJFF;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.put("effect_load_status", "1");
        }
        C1136430fg9.LIZ(linkedHashSet, new InterfaceC1138480fjS() { // from class: X.0fgQ
            @Override // X.InterfaceC1138480fjS
            public final void LIZ() {
                if (interfaceC1137580fi0LIZ.LIZIZ()) {
                    c1138500fjU.LIZ(true, null, false);
                    this.LJIILL(i, interfaceC1136020ffU);
                } else {
                    interfaceC1137580fi0LIZ.LIZ();
                    this.getClass();
                    this.LJIILIIL(i, interfaceC1136020ffU, c1135280feI, c1138500fjU);
                }
            }

            @Override // X.InterfaceC1138480fjS
            public final void onFailed(Throwable th) {
                String message;
                String strLIZIZ;
                if (th == null || (message = th.getMessage()) == null) {
                    message = "";
                }
                c1138500fjU.LIZ(false, new C1141050fnb(-13, message, th), false);
                if (interfaceC1137580fi0LIZ.LIZIZ()) {
                    this.LJIILL(i, interfaceC1136020ffU);
                    return;
                }
                interfaceC1137580fi0LIZ.LIZ();
                AbstractC1136420fg8 abstractC1136420fg8 = this;
                int i2 = i;
                InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
                C1135280feI c1135280feI2 = c1135280feI;
                if (th == null || (strLIZIZ = th.getMessage()) == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("downloadAssetsFail by ");
                    sbLIZ.append(message);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                abstractC1136420fg8.LJIILLIIL(i2, interfaceC1136020ffU2, c1135280feI2, strLIZIZ, c1138500fjU.LJFF);
            }
        });
    }

    public final void LJIILIIL(int i, InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, C1138500fjU c1138500fjU) {
        if (LJIIIZ(i)) {
            LJIILL(i, interfaceC1136020ffU);
        } else {
            c1138500fjU.LIZ(true, null, false);
            LJIIZILJ(i, interfaceC1136020ffU, c1135280feI, "dequeue_download", c1138500fjU.LJFF);
        }
    }

    public final void LJIILLIIL(int i, InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        if (LJIIIZ(i)) {
            LJIILL(i, interfaceC1136020ffU);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrepareFail, giftId:");
        sbLIZ.append(interfaceC1136020ffU.getGiftId());
        sbLIZ.append(", messageId:");
        sbLIZ.append(interfaceC1136020ffU.getMessageId());
        sbLIZ.append(", failMsg:");
        sbLIZ.append(str);
        AbstractC1135650fet.LJII(this, C2188811AlT.LIZIZ(sbLIZ));
        if (c1135280feI != null) {
            c1135280feI.LJIJ = 1003;
            c1135280feI.LJIJI = str;
        }
        InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZIZ(interfaceC1136020ffU, c1135280feI, concurrentHashMap);
        }
        this.LIZLLL = false;
        LJIIJ();
    }

    public final void LJIIZILJ(int i, InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, String str, ConcurrentHashMap concurrentHashMap) {
        if (LJIIIZ(i)) {
            LJIILL(i, interfaceC1136020ffU);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrepareSuccess, source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c1135280feI.LJIJ = 1002;
        c1135280feI.LJIJI = "";
        InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZIZ(interfaceC1136020ffU, c1135280feI, concurrentHashMap);
        }
        this.LIZLLL = false;
        LJIIJ();
    }
}
