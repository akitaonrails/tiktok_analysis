package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0flL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139650flL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(LiveEffect liveEffect, JSONArray jSONArray) {
        Long lValueOf;
        InterfaceC1268640j7O interfaceC1268640j7OLJ = C1137660fi8.LJ();
        if (interfaceC1268640j7OLJ != null && liveEffect != null) {
            try {
                int iSendEffectMsg = interfaceC1268640j7OLJ.sendEffectMsg(57, 104, 0, jSONArray.toString());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendMinuteGiftRankResult, result=");
                sbLIZ.append(iSendEffectMsg);
                sbLIZ.append(", effectId=");
                sbLIZ.append(liveEffect.getEffectId());
                sbLIZ.append(", rankCount=");
                sbLIZ.append(jSONArray.length());
                sbLIZ.append(", payload=");
                sbLIZ.append(jSONArray);
                C20441214yg.LJIIIZ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ));
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sendMinuteGiftRankResult fail, filterManager=");
        sbLIZ2.append(interfaceC1268640j7OLJ);
        sbLIZ2.append(", effectId=");
        String filePath = null;
        if (liveEffect != null) {
            lValueOf = Long.valueOf(liveEffect.getEffectId());
        } else {
            lValueOf = null;
        }
        sbLIZ2.append(lValueOf);
        sbLIZ2.append(", filePath=");
        if (liveEffect != null) {
            filePath = liveEffect.getFilePath();
        }
        sbLIZ2.append(filePath);
        C20441214yg.LJ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
