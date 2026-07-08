package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import webcast.data.oec_msg.EcomLiveElementActions;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;

/* JADX INFO: renamed from: X.17ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21181017ui implements InterfaceC21183017v2 {
    public ECommerceMessage LIZ;

    public abstract List<Integer> LIZJ();

    public abstract long LIZLLL();

    public boolean LJ(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2) {
        return false;
    }

    @Override // X.InterfaceC21183017v2
    public final boolean LIZ(IMessage iMessage) {
        ECommerceMessage eCommerceMessage;
        OecLiveShoppingMessageV2 oecLiveShoppingMessageV2;
        EcomLiveElementActions ecomLiveElementActions;
        if (iMessage instanceof ECommerceMessage) {
            eCommerceMessage = (ECommerceMessage) iMessage;
        } else {
            eCommerceMessage = null;
        }
        if (eCommerceMessage == null || (oecLiveShoppingMessageV2 = eCommerceMessage.oecLiveShoppingMessageV2) == null || (ecomLiveElementActions = oecLiveShoppingMessageV2.actions.get(Long.valueOf(LIZLLL()))) == null) {
            return false;
        }
        if (ecomLiveElementActions.version <= 0) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onHandle: version is old");
            return false;
        }
        this.LIZ = (ECommerceMessage) iMessage;
        return LJ(oecLiveShoppingMessageV2);
    }
}
