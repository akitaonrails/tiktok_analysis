package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import webcast.data.oec_msg.AtomAction;
import webcast.data.oec_msg.EcomLiveElementActions;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;

/* JADX INFO: renamed from: X.17uY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21180017uY extends AbstractC21181017ui {
    public final AbstractC21196217xA LIZIZ;
    public final C21179117uP LIZJ;
    public final int LIZLLL;
    public final Map<String, String> LJ;
    public final Function0<Unit> LJFF;
    public final Function1<String, Unit> LJI;
    public final Function0<Unit> LJII;
    public final InterfaceC1685430txd<PopProductResp, String, Boolean, Boolean, ECommerceMessage, Boolean, Unit> LJIIIIZZ;
    public final Function1<Boolean, Unit> LJIIIZ;
    public final Function0<Boolean> LJIIJ;

    @Override // X.AbstractC21181017ui
    public final List<Integer> LIZJ() {
        return C1697810uHb.LJIIJJI(1001, 1002);
    }

    @Override // X.AbstractC21181017ui
    public final long LIZLLL() {
        return 1L;
    }

    @Override // X.InterfaceC21183017v2
    public final void message() {
    }

    @Override // X.AbstractC21181017ui
    public final boolean LJ(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2) {
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
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.LIZIZ.LIZ.LLJILJILJ.LJII(System.currentTimeMillis(), "client_received_time");
                    C013C c013c = new C013C();
                    if (this.LJIIJ.invoke().booleanValue()) {
                        c013c.element = true;
                    }
                    this.LJII.invoke();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C21180117uZ(c013c, this, oecLiveShoppingMessageV2, jCurrentTimeMillis, null), 3);
                    return true;
                }
            }
        }
        return false;
    }

    public C21180017uY(AbstractC21196217xA abstractC21196217xA, C21179117uP c21179117uP, int i, Map map, AwS576S0100000_32 awS576S0100000_32, AwS611S0100000_32 awS611S0100000_32, AwS576S0100000_32 awS576S0100000_322, C1776210wK3 c1776210wK3, AwS611S0100000_32 awS611S0100000_322, AwS576S0100000_32 awS576S0100000_323) {
        this.LIZIZ = abstractC21196217xA;
        this.LIZJ = c21179117uP;
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
