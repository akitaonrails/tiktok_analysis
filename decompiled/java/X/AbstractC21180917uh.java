package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import webcast.data.oec_msg.AtomAction;
import webcast.data.oec_msg.EcomLiveElementActions;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;

/* JADX INFO: renamed from: X.17uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21180917uh implements InterfaceC21182817v0 {
    public ECommerceMessage LIZ;

    public abstract List<Integer> LIZJ();

    public abstract long LJ();

    public boolean LJFF(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2, C1563990qnl c1563990qnl) {
        return false;
    }

    @Override // X.InterfaceC21182817v0
    public final boolean LIZ(IMessage iMessage) {
        ECommerceMessage eCommerceMessage;
        OecLiveShoppingMessageV2 oecLiveShoppingMessageV2;
        EcomLiveElementActions ecomLiveElementActions;
        AtomAction next;
        EnumC21180817ug enumC21180817ugLIZLLL;
        C1563990qnl c1563990qnlLIZIZ = null;
        if (iMessage instanceof ECommerceMessage) {
            eCommerceMessage = (ECommerceMessage) iMessage;
        } else {
            eCommerceMessage = null;
        }
        if (eCommerceMessage == null || (oecLiveShoppingMessageV2 = eCommerceMessage.oecLiveShoppingMessageV2) == null || (ecomLiveElementActions = oecLiveShoppingMessageV2.actions.get(Long.valueOf(LJ()))) == null) {
            return false;
        }
        this.LIZ = (ECommerceMessage) iMessage;
        Iterator<AtomAction> it2 = ecomLiveElementActions.atomActions.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C21183117v3.LIZLLL(next.type) != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AtomAction atomAction = next;
        if (atomAction != null && (enumC21180817ugLIZLLL = C21183117v3.LIZLLL(atomAction.type)) != null) {
            c1563990qnlLIZIZ = C21183117v3.LIZIZ(this.LIZ, enumC21180817ugLIZLLL, C2097608Jq.LJIILIIL(LIZLLL(oecLiveShoppingMessageV2), new Pair("message_type", Integer.valueOf(atomAction.type))));
            C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_START, c1563990qnlLIZIZ, C2097608Jq.LJ());
        }
        if (ecomLiveElementActions.version <= 0) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onHandle: version is old");
            C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, c1563990qnlLIZIZ, C2097908Jt.LIZJ(new Pair("reason", "version_old")));
            return false;
        }
        return LJFF(oecLiveShoppingMessageV2, c1563990qnlLIZIZ);
    }

    public Map<String, Object> LIZLLL(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2) {
        return C2097608Jq.LJ();
    }
}
