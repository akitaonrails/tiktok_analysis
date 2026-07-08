package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.receiving.model.GiftQueueMessageModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LiveTrayMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fdl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134950fdl {
    public final InterfaceC1136220ffo LIZ;

    public final void LIZ(Function1<? super InterfaceC1136020ffU, Boolean> function1) {
        InterfaceC1136220ffo interfaceC1136220ffo = this.LIZ;
        if (interfaceC1136220ffo != null) {
            interfaceC1136220ffo.LIZ(function1);
        }
    }

    public final void LIZIZ(AssetMessage assetMessage) {
        if (assetMessage == null || assetMessage.assets == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveAssetMessage. asset id = ");
        sbLIZ.append(assetMessage.assetId);
        C1133910fc5.LIZLLL("GiftTrayMessageQueueManager", C2188811AlT.LIZIZ(sbLIZ));
        C1138360fjG c1138360fjGLIZLLL = C1140890fnL.LIZLLL();
        AssetsModel assetsModel = assetMessage.assets;
        c1138360fjGLIZLLL.getClass();
        C1138630fjh.LIZ.LIZ(assetsModel, false);
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.giftId = assetMessage.assetId;
        giftMessage.comboCount = 0;
        giftMessage.fromUser = assetMessage.fromUser;
        giftMessage.toUser = assetMessage.toUser;
        giftMessage.LL = true;
        GiftQueueMessageModel giftQueueMessageModelLIZJ = C1135860ffE.LIZJ(giftMessage, null);
        giftQueueMessageModelLIZJ.LJJI().LIZJ = EnumC743790TFp.VIDEO_ONLY;
        giftQueueMessageModelLIZJ.LJJI().getClass();
        C1134970fdn.LIZJ(giftQueueMessageModelLIZJ);
        InterfaceC1136220ffo interfaceC1136220ffo = this.LIZ;
        if (interfaceC1136220ffo != null) {
            interfaceC1136220ffo.LJFF(giftQueueMessageModelLIZJ, false);
        }
    }

    public final void LIZLLL(LiveTrayMessage liveTrayMessage) {
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.giftId = -999L;
        giftMessage.comboCount = liveTrayMessage.comboCount;
        giftMessage.fromUser = liveTrayMessage.user;
        giftMessage.LLILLL = true;
        GiftQueueMessageModel giftQueueMessageModelLIZJ = C1135860ffE.LIZJ(giftMessage, null);
        giftQueueMessageModelLIZJ.LJJI().LIZJ = EnumC743790TFp.TRAY_ONLY;
        giftQueueMessageModelLIZJ.LJJIZ(true);
        C1134970fdn.LIZJ(giftQueueMessageModelLIZJ);
        InterfaceC1136220ffo interfaceC1136220ffo = this.LIZ;
        if (interfaceC1136220ffo != null) {
            interfaceC1136220ffo.LJFF(giftQueueMessageModelLIZJ, false);
        }
    }

    public C1134950fdl(InterfaceC1132530fZr interfaceC1132530fZr, InterfaceC1136220ffo interfaceC1136220ffo) {
        this.LIZ = interfaceC1136220ffo;
        if (interfaceC1132530fZr != null) {
            interfaceC1132530fZr.o3();
        }
    }

    public final void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, ConcurrentHashMap<String, String> concurrentHashMap) {
        Integer numValueOf;
        if (interfaceC1136020ffU != null) {
            if (LiveGiftCrossScreenSetting.INSTANCE.shouldIgnoreExtraTrays()) {
                List listLJIIJJI = C1697810uHb.LJIIJJI(1, 3);
                GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII();
                if (interactiveGiftInfoLJJIII != null) {
                    numValueOf = Integer.valueOf(interactiveGiftInfoLJJIII.ignoreConfig);
                } else {
                    numValueOf = null;
                }
                if (C13LP.LJJJJ(numValueOf, listLJIIJJI)) {
                    C1136370fg3.LIZ.getClass();
                    try {
                        JSONObject jSONObject = new JSONObject(C1136370fg3.LIZ(interfaceC1136020ffU, null));
                        try {
                            C1135800ff8.LIZIZ(interfaceC1136020ffU, jSONObject, jSONObject);
                            jSONObject.put("ignore_type", "component");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        InterfaceC1136800fgk interfaceC1136800fgkLJIILL = interfaceC1136020ffU.LJIILL();
                        if (interfaceC1136800fgkLJIILL != null && interfaceC1136800fgkLJIILL.getId() == UserService.getInstance().user().getCurrentUserId()) {
                            C1136370fg3.LJ("gift_tray_ignore_self", jSONObject);
                        }
                        C1136370fg3.LJ("gift_tray_ignore".concat(C1136370fg3.LIZLLL()), jSONObject);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
            }
            interfaceC1136020ffU.LJJI().LJIIZILJ = c1135280feI;
            interfaceC1136020ffU.LJJI().LJIJ = concurrentHashMap;
            interfaceC1136020ffU.LJJI().LJIJI = true;
            InterfaceC1136220ffo interfaceC1136220ffo = this.LIZ;
            if (interfaceC1136220ffo != null) {
                interfaceC1136220ffo.LJFF(interfaceC1136020ffU, false);
            }
        }
    }
}
