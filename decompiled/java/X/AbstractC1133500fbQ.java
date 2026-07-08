package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.AbstractCollection;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0fbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1133500fbQ {
    public abstract AbstractCollection<GiftMessage> LIZIZ();

    public abstract void LIZJ(GiftMessage giftMessage);

    public abstract GiftMessage LIZLLL(boolean z);

    public final String toString() {
        StringBuilder sb = new StringBuilder(e3.e);
        for (GiftMessage giftMessage : LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" Coin:");
            sbLIZ.append(giftMessage.mGift.diamondCount);
            sbLIZ.append(" Combo:");
            sbLIZ.append(giftMessage.comboCount);
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return sb.toString();
    }

    public void LIZ() {
        LIZIZ().clear();
    }
}
