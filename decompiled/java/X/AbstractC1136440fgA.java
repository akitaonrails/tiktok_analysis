package X;

import Y.ARunnableS23S0201000_17;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueMockFailSettings;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS27S0401000_17;

/* JADX INFO: renamed from: X.0fgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1136440fgA extends AbstractC1135610fep {
    public final void LJIILL(GiftMessage giftMessage) {
        int iHashCode;
        Boolean bool;
        InterfaceC1135600feo interfaceC1135600feo = this.LJ;
        if (interfaceC1135600feo != null) {
            iHashCode = interfaceC1135600feo.hashCode();
        } else {
            iHashCode = 0;
        }
        if (LJIIIIZZ(iHashCode)) {
            LJIILIIL(iHashCode, giftMessage);
            return;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
            LJII(giftMessage);
            return;
        }
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockCreateEffectFail()) {
            LJIILJJIL(iHashCode, giftMessage, null, "mock create effect fail", null);
            return;
        }
        ARunnableS23S0201000_17 aRunnableS23S0201000_17 = new ARunnableS23S0201000_17(iHashCode, giftMessage, this, 1);
        if (!giftMessage.LLILLL) {
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            } else {
                bool = null;
            }
            if (!C176600m4.LIZIZ(bool) && C1133680fbi.LIZIZ(giftMessage) != UserService.getInstance().user().getCurrentUserId()) {
                C786410Ut5.LJJZZIII(this.LIZ, aRunnableS23S0201000_17);
                return;
            }
        }
        aRunnableS23S0201000_17.run();
    }

    public final void LJIILIIL(int i, GiftMessage giftMessage) {
        if (LJFF(i)) {
            C20441214yg.LJFF(LIZLLL(), "drop msg due to invalid room", null);
        } else {
            C20441214yg.LJIIIZ(LIZLLL(), "drop msg due to clear screen mode");
        }
        InterfaceC1135600feo interfaceC1135600feo = this.LJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LJ(giftMessage);
        }
        this.LIZJ = false;
        LJIIIZ();
    }

    public final void LJIIL(int i, GiftMessage giftMessage, C1135280feI c1135280feI) {
        long id;
        boolean z;
        if (LJIIIIZZ(i)) {
            LJIILIIL(i, giftMessage);
            return;
        }
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(c1135280feI.LJFF);
        if (assetsModelLIZLLL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadFromGeckoForLynxGift fail, assetsModel is null, effectId:");
            sbLIZ.append(c1135280feI.LJFF);
            LJIILJJIL(i, giftMessage, c1135280feI, C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        User user = giftMessage.toUser;
        if (user != null) {
            id = user.getId();
        } else {
            GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
            if (giftMonitorInfo != null) {
                id = giftMonitorInfo.to_user_id;
            } else {
                id = 0;
            }
        }
        boolean z2 = giftMessage.LLILLL;
        if (id == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        C1138500fjU c1138500fjU = new C1138500fjU(assetsModelLIZLLL, z2, z, giftMessage.mLogId, Long.valueOf(giftMessage.getMessageId()), C1137020fh6.LIZ(giftMessage));
        c1138500fjU.LIZJ(false);
        if (assetsModelLIZLLL.resourceType == AssetsModel.RESOURCE_TYPE_LYNX) {
            C1137480fhq c1137480fhq = C1137480fhq.LIZ;
            AwS27S0401000_17 awS27S0401000_17 = new AwS27S0401000_17(this, i, giftMessage, c1135280feI, c1138500fjU, 0);
            c1137480fhq.getClass();
            C1137480fhq.LIZLLL(assetsModelLIZLLL, null, giftMessage, c1135280feI, awS27S0401000_17);
            return;
        }
        LJIIJ(i, giftMessage, c1135280feI, c1138500fjU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashSet, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.08CX] */
    public final void LJIIJ(final int i, final GiftMessage giftMessage, final C1135280feI c1135280feI, final C1138500fjU c1138500fjU) {
        ?? linkedHashSet;
        long jLongValue;
        if (LJIIIIZZ(i)) {
            LJIILIIL(i, giftMessage);
            return;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Set setLIZLLL = C1136430fg9.LIZLLL(giftMessage, c1135280feI);
        if (setLIZLLL.isEmpty()) {
            linkedHashSet = C08CX.INSTANCE;
        } else {
            linkedHashSet = new LinkedHashSet();
            Iterator it2 = setLIZLLL.iterator();
            while (it2.hasNext()) {
                long jLongValue2 = ((Number) it2.next()).longValue();
                C1140890fnL.LIZLLL().getClass();
                if (!C1138630fjh.LJI().LIZIZ(C1138640fji.LIZLLL(jLongValue2), null)) {
                    linkedHashSet.add(Long.valueOf(jLongValue2));
                }
            }
        }
        linkedHashSet2.addAll((Collection) linkedHashSet);
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(c1135280feI.LJFF);
        if (assetsModelLIZLLL != null && assetsModelLIZLLL.resourceType == AssetsModel.RESOURCE_TYPE_LYNX) {
            Long lValueOf = Long.valueOf(C1135270feH.LIZJ(giftMessage));
            if (lValueOf.longValue() > 0) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = c1135280feI.LJFF;
            }
            linkedHashSet2.remove(Long.valueOf(jLongValue));
        }
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockDownloadEffectFail()) {
            c1138500fjU.LIZ(false, new C1141050fnb(-13, "mock download effect fail", null), false);
            LJIILJJIL(i, giftMessage, c1135280feI, "mock download effect fail", c1138500fjU.LJFF);
            return;
        }
        final InterfaceC1137580fi0 interfaceC1137580fi0LIZ = C1131950fYv.LIZ(c1135280feI.LJFF);
        if (interfaceC1137580fi0LIZ.LIZIZ()) {
            c1138500fjU.LIZ(false, new C1141050fnb(-14, "cancelByTimeout", null), false);
            LJIILIIL(i, giftMessage);
            return;
        }
        if (linkedHashSet2.isEmpty()) {
            interfaceC1137580fi0LIZ.LIZ();
            c1138500fjU.LJII = true;
            ConcurrentHashMap<String, String> concurrentHashMap = c1138500fjU.LJFF;
            if (concurrentHashMap != null) {
                concurrentHashMap.put("effect_load_status", CardStruct.IStatusCode.DEFAULT);
            }
            LJIIJJI(i, giftMessage, c1135280feI, c1138500fjU);
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = c1138500fjU.LJFF;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.put("effect_load_status", "1");
        }
        C1136430fg9.LIZ(linkedHashSet2, new InterfaceC1138480fjS() { // from class: X.0fgP
            @Override // X.InterfaceC1138480fjS
            public final void LIZ() {
                if (interfaceC1137580fi0LIZ.LIZIZ()) {
                    c1138500fjU.LIZ(true, null, false);
                    this.LJIILIIL(i, giftMessage);
                } else {
                    interfaceC1137580fi0LIZ.LIZ();
                    this.getClass();
                    this.LJIIJJI(i, giftMessage, c1135280feI, c1138500fjU);
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
                    this.LJIILIIL(i, giftMessage);
                    return;
                }
                interfaceC1137580fi0LIZ.LIZ();
                AbstractC1136440fgA abstractC1136440fgA = this;
                int i2 = i;
                GiftMessage giftMessage2 = giftMessage;
                C1135280feI c1135280feI2 = c1135280feI;
                if (th == null || (strLIZIZ = th.getMessage()) == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("downloadAssetsFail by ");
                    sbLIZ.append(message);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                abstractC1136440fgA.LJIILJJIL(i2, giftMessage2, c1135280feI2, strLIZIZ, c1138500fjU.LJFF);
            }
        });
    }

    public final void LJIIJJI(int i, GiftMessage giftMessage, C1135280feI c1135280feI, C1138500fjU c1138500fjU) {
        if (LJIIIIZZ(i)) {
            LJIILIIL(i, giftMessage);
            return;
        }
        c1138500fjU.LIZ(true, null, false);
        ConcurrentHashMap<String, String> concurrentHashMap = c1138500fjU.LJFF;
        if (LJIIIIZZ(i)) {
            LJIILIIL(i, giftMessage);
            return;
        }
        c1135280feI.LJIJ = 1002;
        c1135280feI.LJIJI = "";
        InterfaceC1135600feo interfaceC1135600feo = this.LJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LIZLLL(giftMessage, c1135280feI, concurrentHashMap);
        }
        this.LIZJ = false;
        LJIIIZ();
    }

    public final void LJIILJJIL(int i, GiftMessage giftMessage, C1135280feI c1135280feI, String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        if (LJIIIIZZ(i)) {
            LJIILIIL(i, giftMessage);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrepareFail, giftId:");
        sbLIZ.append(giftMessage.giftId);
        sbLIZ.append(", messageId:");
        sbLIZ.append(giftMessage.getMessageId());
        sbLIZ.append(", failMsg:");
        sbLIZ.append(str);
        C20441214yg.LJFF(LIZLLL(), C2188811AlT.LIZIZ(sbLIZ), null);
        if (c1135280feI != null) {
            c1135280feI.LJIJ = 1003;
            c1135280feI.LJIJI = str;
        }
        InterfaceC1135600feo interfaceC1135600feo = this.LJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LIZLLL(giftMessage, c1135280feI, concurrentHashMap);
        }
        this.LIZJ = false;
        LJIIIZ();
    }
}
