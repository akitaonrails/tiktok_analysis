package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import org.json.JSONObject;
import webcast.data.oec_msg.AtomAction;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.EcomLiveElementActions;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;
import webcast.data.oec_msg.PopCardInfo;

/* JADX INFO: renamed from: X.17ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21180317ub extends AbstractC21180917uh {
    public final AbstractC21196817xG LIZIZ;
    public final C21180517ud LIZJ;
    public final int LIZLLL;
    public final Map<String, String> LJ;
    public final Function0<Unit> LJFF;
    public final Function1<String, Unit> LJI;
    public final Function0<Unit> LJII;
    public final InterfaceC1685430txd<PopProductResp, Boolean, Boolean, ECommerceMessage, Boolean, JSONObject, Unit> LJIIIIZZ;
    public final Function1<Boolean, Unit> LJIIIZ;
    public final Function0<Boolean> LJIIJ;

    @Override // X.AbstractC21180917uh
    public final List<Integer> LIZJ() {
        return C1697810uHb.LJIIJJI(1001, 1002);
    }

    @Override // X.AbstractC21180917uh
    public final long LJ() {
        return 1L;
    }

    @Override // X.InterfaceC21182817v0
    public final void message() {
    }

    @Override // X.AbstractC21180917uh
    public final Map<String, Object> LIZLLL(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2) {
        String string;
        PopCardInfo popCardInfo;
        Pair[] pairArr = new Pair[7];
        Room room = this.LIZIZ.LIZ.LLJILLL;
        Integer numValueOf = null;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        } else {
            string = null;
        }
        pairArr[0] = new Pair("room_id", string);
        pairArr[1] = new Pair("role", this.LIZIZ.LIZ.LJJIJIIJIL());
        CommerceInfo commerceInfo = oecLiveShoppingMessageV2.commerceInfo;
        if (commerceInfo != null && (popCardInfo = commerceInfo.popCardInfo) != null) {
            numValueOf = Integer.valueOf(popCardInfo.popCardType);
        }
        pairArr[2] = new Pair("card_type", numValueOf);
        pairArr[3] = new Pair("is_page_visible", Boolean.valueOf(this.LIZIZ.LIZ.LLJJI));
        pairArr[4] = new Pair("is_keyboard_showing", Boolean.valueOf(this.LIZIZ.LIZ.LLLI));
        pairArr[5] = new Pair("has_ec_perm", Boolean.valueOf(this.LIZIZ.LIZ.LLLFFI));
        pairArr[6] = new Pair("has_pop_card_container", this.LJIIJ.invoke());
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.AbstractC21180917uh
    public final boolean LJFF(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2, C1563990qnl c1563990qnl) {
        List<AtomAction> list;
        List<AtomAction> list2;
        EcomLiveElementActions ecomLiveElementActions = oecLiveShoppingMessageV2.actions.get(1L);
        if (ecomLiveElementActions != null && (list2 = ecomLiveElementActions.atomActions) != null) {
            Iterator<AtomAction> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next().type == 1002) {
                    this.LJFF.invoke();
                    return true;
                }
            }
        }
        EcomLiveElementActions ecomLiveElementActions2 = oecLiveShoppingMessageV2.actions.get(1L);
        if (ecomLiveElementActions2 != null && (list = ecomLiveElementActions2.atomActions) != null) {
            Iterator<AtomAction> it3 = list.iterator();
            while (it3.hasNext()) {
                if (it3.next().type == 1001) {
                    C110400bO.LIZ.getClass();
                    long jLJ = C110400bO.LJ();
                    this.LIZIZ.LIZ.LLJILJILJ.LJII(jLJ, "client_received_time");
                    C013C c013c = new C013C();
                    if (this.LJIIJ.invoke().booleanValue()) {
                        c013c.element = true;
                    }
                    this.LJII.invoke();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C21180217ua(c013c, this, oecLiveShoppingMessageV2, jLJ, c1563990qnl, null), 3);
                    return true;
                }
            }
        }
        return false;
    }

    public C21180317ub(AbstractC21196817xG abstractC21196817xG, C21180517ud c21180517ud, int i, Map map, AwS576S0100000_32 awS576S0100000_32, AwS611S0100000_32 awS611S0100000_32, AwS576S0100000_32 awS576S0100000_322, C1776210wK3 c1776210wK3, AwS611S0100000_32 awS611S0100000_322, AwS576S0100000_32 awS576S0100000_323) {
        this.LIZIZ = abstractC21196817xG;
        this.LIZJ = c21180517ud;
        this.LIZLLL = i;
        this.LJ = map;
        this.LJFF = awS576S0100000_32;
        this.LJI = awS611S0100000_32;
        this.LJII = awS576S0100000_322;
        this.LJIIIIZZ = c1776210wK3;
        this.LJIIIZ = awS611S0100000_322;
        this.LJIIJ = awS576S0100000_323;
    }
}
