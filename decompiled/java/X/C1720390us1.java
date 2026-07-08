package X;

import com.bytedance.pipo.stellar.base.adapter.internal.StellarNavBarAdapter;
import com.bytedance.pipo.stellar.base.model.ActionSheetDO;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.NavBarDO;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0us1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720390us1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C1720160ure LIZ(ActionSheetDO actionSheetDO) {
        boolean z;
        boolean z2;
        boolean z3;
        C1720570usJ c1720570usJ;
        String type;
        CardDO header = actionSheetDO.getHeader();
        if (header != null && (type = header.getType()) != null && u.LJIJI(type, EnumC1720960usw.CARD_NAV.getValue(), true)) {
            z = true;
        } else {
            z = false;
        }
        NavBarDO navBarDO = null;
        if (actionSheetDO.getHeader() != null && z) {
            C1721300utU c1721300utU = C1721300utU.LIZ;
            StellarNavBarAdapter stellarNavBarAdapter = new StellarNavBarAdapter();
            CardDO header2 = actionSheetDO.getHeader();
            c1721300utU.getClass();
            InterfaceC1720550usH interfaceC1720550usHLJII = C1721300utU.LJII(stellarNavBarAdapter, header2);
            if ((interfaceC1720550usHLJII instanceof C1720570usJ) && (c1720570usJ = (C1720570usJ) interfaceC1720550usHLJII) != null) {
                navBarDO = (NavBarDO) c1720570usJ.LLJJ;
            }
        }
        String objId = actionSheetDO.getObjId();
        if (objId == null) {
            objId = "";
        }
        Map<String, Object> trackingParams = actionSheetDO.getTrackingParams();
        List<CardDO> cardList = actionSheetDO.getCardList();
        if (cardList == null) {
            cardList = C13BV.INSTANCE;
        }
        BackgroundDO background = actionSheetDO.getBackground();
        actionSheetDO.getHeight();
        Integer dismissible = actionSheetDO.getDismissible();
        if (dismissible != null && dismissible.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Integer hasOverlay = actionSheetDO.getHasOverlay();
        if (hasOverlay != null && hasOverlay.intValue() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new C1720160ure(objId, trackingParams, cardList, background, navBarDO, z2, z3);
    }
}
