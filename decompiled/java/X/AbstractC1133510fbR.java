package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0fbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1133510fbR extends AbstractC1133500fbQ {
    public final Map<Long, Map<String, GiftMessage>> LIZ = new LinkedHashMap();

    public abstract void LJ(GiftMessage giftMessage);

    public abstract GiftMessage LJFF(boolean z);

    @Override // X.AbstractC1133500fbQ
    public final void LIZ() {
        super.LIZ();
        ((LinkedHashMap) this.LIZ).clear();
    }

    @Override // X.AbstractC1133500fbQ
    public final void LIZJ(GiftMessage giftMessage) {
        Boolean boolValueOf;
        if (giftMessage.matchInfo == null && giftMessage.groupId > 0) {
            C1133690fbj.LIZ.getClass();
            if (!C1133690fbj.LJIIIZ(giftMessage) && !C1133690fbj.LJI(giftMessage.mGift) && !C1133690fbj.LJII(giftMessage.mGift)) {
                Gift gift = giftMessage.mGift;
                if (gift != null) {
                    boolValueOf = Boolean.valueOf(gift.combo);
                } else {
                    boolValueOf = null;
                }
                if (!C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    Map<String, GiftMessage> linkedHashMap = (Map) ((LinkedHashMap) this.LIZ).get(Long.valueOf(giftMessage.groupId));
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap<>();
                        this.LIZ.put(Long.valueOf(giftMessage.groupId), linkedHashMap);
                    }
                    C1133690fbj.LIZ.getClass();
                    String strLIZIZ = C1133690fbj.LIZIZ(giftMessage);
                    GiftMessage giftMessage2 = linkedHashMap.get(strLIZIZ);
                    if (giftMessage2 == null) {
                        linkedHashMap.put(strLIZIZ, giftMessage);
                        LJ(giftMessage);
                        return;
                    }
                    int i = giftMessage.comboCount;
                    int i2 = giftMessage2.comboCount;
                    if (i < i2) {
                        i = i2;
                    }
                    giftMessage2.comboCount = i;
                    giftMessage2.sponsorshipInfo = giftMessage.sponsorshipInfo;
                    return;
                }
            }
        }
        this.LIZ.remove(Long.valueOf(giftMessage.groupId));
        LJ(giftMessage);
    }

    @Override // X.AbstractC1133500fbQ
    public final GiftMessage LIZLLL(boolean z) {
        GiftMessage giftMessageLJFF = LJFF(z);
        if (giftMessageLJFF != null) {
            Map map = (Map) ((LinkedHashMap) this.LIZ).get(Long.valueOf(giftMessageLJFF.groupId));
            if (map != null) {
                C1133690fbj.LIZ.getClass();
                map.remove(C1133690fbj.LIZIZ(giftMessageLJFF));
                if (map.isEmpty()) {
                    this.LIZ.remove(Long.valueOf(giftMessageLJFF.groupId));
                }
            }
        }
        return giftMessageLJFF;
    }
}
