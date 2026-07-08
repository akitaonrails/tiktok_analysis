package X;

import com.bytedance.android.livesdk.model.message.DelayParam;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.OecLiveCreatorAction;
import com.bytedance.android.livesdk.model.message.OecLiveCreatorMessage;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.data.oec_msg.AtomAction;
import webcast.data.oec_msg.AuctionInfo;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.DispersionParam;
import webcast.data.oec_msg.EcomLiveElementActions;
import webcast.data.oec_msg.MsgMeta;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;
import webcast.data.oec_msg.PopCardInfo;
import webcast.data.oec_msg.ProductItem;
import webcast.data.oec_msg.ReqItem;

/* JADX INFO: renamed from: X.17un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21181517un extends AbstractC21180917uh implements InterfaceC21182117ut {
    public final AbstractC21198517xX<?> LIZIZ;
    public final C598730Ne3 LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final boolean LJI;
    public final Function0<String> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Boolean> LJIIIZ;

    @Override // X.AbstractC21180917uh
    public final List<Integer> LIZJ() {
        return C1697810uHb.LJIIJJI(1003, 1004, 1005);
    }

    @Override // X.AbstractC21180917uh
    public final long LJ() {
        return 1L;
    }

    @Override // X.InterfaceC21182817v0
    public final void message() {
    }

    @Override // X.InterfaceC21182117ut
    public final boolean LIZIZ(IMessage iMessage) {
        int i;
        C110400bO.LIZ.getClass();
        long jLJ = C110400bO.LJ();
        if (!(iMessage instanceof OecLiveCreatorMessage)) {
            return false;
        }
        OecLiveCreatorMessage oecLiveCreatorMessage = (OecLiveCreatorMessage) iMessage;
        Map<Integer, OecLiveCreatorAction> map = oecLiveCreatorMessage.actionMap;
        int i2 = (int) 1;
        if (i2 == 1) {
            i = 2;
        } else if (i2 == 3) {
            i = 1;
        } else {
            i = 0;
        }
        OecLiveCreatorAction oecLiveCreatorAction = map.get(Integer.valueOf(i));
        if (oecLiveCreatorAction == null) {
            return false;
        }
        int i3 = oecLiveCreatorAction.action;
        if (i3 == 201) {
            AtomAction atomAction = new AtomAction();
            atomAction.type = C21181917ur.LIZ(Integer.valueOf(oecLiveCreatorAction.action));
            ReqItem reqItem = new ReqItem();
            reqItem.scene = 1001;
            atomAction.requestItem = reqItem;
            LJII(atomAction, null, null, C110400bO.LIZIZ(oecLiveCreatorMessage, Long.valueOf(jLJ), Integer.valueOf(oecLiveCreatorAction.action)), null);
            return true;
        }
        if (i3 != 202) {
            return false;
        }
        AtomAction atomAction2 = new AtomAction();
        atomAction2.type = C21181917ur.LIZ(Integer.valueOf(oecLiveCreatorAction.action));
        ReqItem reqItem2 = new ReqItem();
        reqItem2.scene = 1001;
        atomAction2.requestItem = reqItem2;
        LJI(atomAction2, null, null, C110400bO.LIZIZ(oecLiveCreatorMessage, Long.valueOf(jLJ), Integer.valueOf(oecLiveCreatorAction.action)), null);
        return true;
    }

    @Override // X.AbstractC21180917uh
    public final Map<String, Object> LIZLLL(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2) {
        String string;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("room_id", this.LJFF);
        pairArr[1] = new Pair("role", this.LJII.invoke());
        UsPopupCardVO usPopupCardVO = this.LIZIZ.LL;
        Integer numValueOf = null;
        if (usPopupCardVO != null) {
            string = Long.valueOf(usPopupCardVO.productId).toString();
        } else {
            string = null;
        }
        pairArr[2] = new Pair("product_id", string);
        UsPopupCardVO usPopupCardVO2 = this.LIZIZ.LL;
        if (usPopupCardVO2 != null) {
            numValueOf = Integer.valueOf(usPopupCardVO2.cardType);
        }
        pairArr[3] = new Pair("card_type", numValueOf);
        pairArr[4] = new Pair("is_page_visible", this.LJIIIZ.invoke());
        pairArr[5] = new Pair("has_pop_card_container", this.LJIIIZ.invoke());
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final void LJIIIIZZ(ReqItem reqItem) {
        int i;
        DispersionParam dispersionParam = reqItem.dispersionParam;
        if (dispersionParam != null) {
            String str = this.LJFF;
            if (str == null) {
                str = "";
            }
            DispersionInfo dispersionInfo = new DispersionInfo();
            switch (reqItem.scene) {
                case 1001:
                    i = 1;
                    break;
                case 1002:
                    i = 3;
                    break;
                case 1003:
                    i = 6;
                    break;
                default:
                    i = 0;
                    break;
            }
            dispersionInfo.dispersionPath = i;
            DelayParam delayParam = new DelayParam();
            delayParam.minDelayMs = dispersionParam.minDelayMs;
            delayParam.maxDelayMs = dispersionParam.maxDelayMs;
            dispersionInfo.delayParam = delayParam;
            C598410NdX.LJI(str, Collections.singletonList(dispersionInfo));
        }
    }

    @Override // X.AbstractC21180917uh
    public final boolean LJFF(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2, C1563990qnl c1563990qnl) {
        Long lValueOf;
        Long lValueOf2;
        boolean z;
        List<String> list;
        List<String> list2;
        AuctionInfo auctionInfo;
        Map<Long, ProductItem> map;
        Long lValueOf3;
        PopCardInfo popCardInfo;
        C110400bO.LIZ.getClass();
        long jLJ = C110400bO.LJ();
        EcomLiveElementActions ecomLiveElementActions = oecLiveShoppingMessageV2.actions.get(1L);
        boolean z2 = false;
        if (ecomLiveElementActions == null) {
            return false;
        }
        CommerceInfo commerceInfo = oecLiveShoppingMessageV2.commerceInfo;
        String str = null;
        Long lValueOf4 = null;
        str = null;
        String str2 = null;
        str = null;
        if (commerceInfo != null && (popCardInfo = commerceInfo.popCardInfo) != null) {
            lValueOf = Long.valueOf(popCardInfo.popCardId);
        } else {
            lValueOf = null;
        }
        UsPopupCardVO usPopupCardVO = this.LIZIZ.LL;
        if (usPopupCardVO != null) {
            lValueOf2 = Long.valueOf(usPopupCardVO.popCardId);
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onHandle: product id not same");
            C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, c1563990qnl, C2097908Jt.LIZJ(new Pair("reason", "mismatch=card_id")));
            return false;
        }
        Iterator<AtomAction> it2 = ecomLiveElementActions.atomActions.iterator();
        while (it2.hasNext()) {
            if (it2.next().type == 1004) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refreshPart: ");
                sbLIZ.append(oecLiveShoppingMessageV2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                CommerceInfo commerceInfo2 = oecLiveShoppingMessageV2.commerceInfo;
                if (commerceInfo2 != null && (map = commerceInfo2.productInfo) != null) {
                    UsPopupCardVO usPopupCardVO2 = this.LIZIZ.LL;
                    if (usPopupCardVO2 != null) {
                        lValueOf3 = Long.valueOf(usPopupCardVO2.productId);
                    } else {
                        lValueOf3 = null;
                    }
                    ProductItem productItem = map.get(lValueOf3);
                    if (productItem != null) {
                        this.LIZIZ.U(productItem, c1563990qnl);
                        z2 = true;
                    }
                }
                CommerceInfo commerceInfo3 = oecLiveShoppingMessageV2.commerceInfo;
                if (commerceInfo3 != null && (auctionInfo = commerceInfo3.auctionInfo) != null) {
                    this.LIZIZ.LJJIIJZLJL(auctionInfo, c1563990qnl);
                } else {
                    if (z2) {
                    }
                    return true;
                }
                UsPopupCardVO usPopupCardVO3 = this.LIZIZ.LL;
                if (usPopupCardVO3 != null) {
                    lValueOf4 = Long.valueOf(usPopupCardVO3.productId);
                }
                C21198317xV.LJFF(String.valueOf(lValueOf4), this.LJFF, "refresh_by_msg", null, this.LJI, false);
                return true;
            }
        }
        Iterator<AtomAction> it3 = ecomLiveElementActions.atomActions.iterator();
        while (true) {
            if (it3.hasNext()) {
                if (it3.next().type == 1003) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            for (AtomAction atomAction : ecomLiveElementActions.atomActions) {
                if (atomAction.type == 1003) {
                    CommerceInfo commerceInfo4 = oecLiveShoppingMessageV2.commerceInfo;
                    MsgMeta msgMeta = oecLiveShoppingMessageV2.msgMeta;
                    if (msgMeta != null && (list2 = msgMeta.reasons) != null) {
                        str2 = (String) C13LP.LJJJLL(list2);
                    }
                    C110400bO c110400bO = C110400bO.LIZ;
                    Long lValueOf5 = Long.valueOf(jLJ);
                    C319201Lq.LIZ.getClass();
                    Long lLIZ = C319201Lq.LIZ();
                    c110400bO.getClass();
                    LJII(atomAction, commerceInfo4, str2, C110400bO.LIZJ(oecLiveShoppingMessageV2, lValueOf5, 1003, lLIZ), c1563990qnl);
                    return true;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Iterator<AtomAction> it4 = ecomLiveElementActions.atomActions.iterator();
        while (it4.hasNext()) {
            if (it4.next().type == 1005) {
                for (AtomAction atomAction2 : ecomLiveElementActions.atomActions) {
                    if (atomAction2.type == 1005) {
                        CommerceInfo commerceInfo5 = oecLiveShoppingMessageV2.commerceInfo;
                        MsgMeta msgMeta2 = oecLiveShoppingMessageV2.msgMeta;
                        if (msgMeta2 != null && (list = msgMeta2.reasons) != null) {
                            str = (String) C13LP.LJJJLL(list);
                        }
                        C110400bO c110400bO2 = C110400bO.LIZ;
                        Long lValueOf6 = Long.valueOf(jLJ);
                        C319201Lq.LIZ.getClass();
                        Long lLIZ2 = C319201Lq.LIZ();
                        c110400bO2.getClass();
                        LJI(atomAction2, commerceInfo5, str, C110400bO.LIZJ(oecLiveShoppingMessageV2, lValueOf6, 1005, lLIZ2), c1563990qnl);
                        return true;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return false;
    }

    public final void LJIIIZ(UsPopupCardVO usPopupCardVO, boolean z) {
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        FlashSaleAtmosphere flashSaleAtmosphere2;
        if (this.LJIIIZ.invoke().booleanValue()) {
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = usPopupCardVO.flashSaleAtmosphereInfo;
            Integer numValueOf = null;
            if (flashSaleAtmosphereInfo != null && flashSaleAtmosphereInfo.flashSaleAtmosphere != null) {
                if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null) {
                    this.LIZIZ.LJIILL(flashSaleAtmosphere2);
                }
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = usPopupCardVO.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo2 != null && (flashSaleAtmosphereStock = flashSaleAtmosphereInfo2.flashSaleAtmosphereStock) != null) {
                    this.LIZIZ.LJIIL(flashSaleAtmosphereStock);
                }
            } else {
                this.LIZIZ.LJIILL(null);
                this.LIZJ.LJFF();
            }
            this.LIZIZ.LIZIZ(usPopupCardVO.buyButtonType);
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo3 = usPopupCardVO.flashSaleAtmosphereInfo;
            if (flashSaleAtmosphereInfo3 != null && (flashSaleAtmosphere = flashSaleAtmosphereInfo3.flashSaleAtmosphere) != null) {
                numValueOf = Integer.valueOf(flashSaleAtmosphere.status);
            }
            boolean z2 = true;
            if (numValueOf != null && 4 != numValueOf.intValue() && 5 != numValueOf.intValue()) {
                z2 = false;
            }
            this.LIZIZ.LJFF(z2);
            return;
        }
        if (!z) {
            return;
        }
        this.LJIIIIZZ.invoke();
    }

    public final void LJI(AtomAction atomAction, CommerceInfo commerceInfo, String str, JSONObject jSONObject, C1563990qnl c1563990qnl) {
        String currentUserID;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceRefreshAll: ");
        sbLIZ.append(atomAction);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUserID = iUserService.getCurrentUserID();
        } else {
            currentUserID = null;
        }
        ReqItem reqItem = atomAction.requestItem;
        if (reqItem != null) {
            LJIIIIZZ(reqItem);
        }
        C598730Ne3 c598730Ne3 = this.LIZJ;
        AbstractC21198517xX<?> abstractC21198517xX = this.LIZIZ;
        String str2 = this.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        ReqItem reqItem2 = atomAction.requestItem;
        String str3 = this.LIZLLL;
        int i = this.LJ;
        boolean z = this.LJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!this.LJIIIZ.invoke().booleanValue()) {
            linkedHashMap.put("request_start_time", Long.valueOf(System.currentTimeMillis()));
        }
        if (C07J3.LIZ()) {
            linkedHashMap.put("is_repin", Boolean.valueOf(!this.LJIIIZ.invoke().booleanValue()));
        }
        C598730Ne3.LJI(c598730Ne3, abstractC21198517xX, str2, currentUserID, commerceInfo, reqItem2, str3, i, z, "force_pop_refresh_by_req", linkedHashMap, null, str, null, jSONObject, c1563990qnl, new AwS611S0100000_32(this, 235), 5120);
    }

    public final void LJII(AtomAction atomAction, CommerceInfo commerceInfo, String str, JSONObject jSONObject, C1563990qnl c1563990qnl) {
        String currentUserID;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshAll: ");
        sbLIZ.append(atomAction);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUserID = iUserService.getCurrentUserID();
        } else {
            currentUserID = null;
        }
        ReqItem reqItem = atomAction.requestItem;
        if (reqItem != null) {
            LJIIIIZZ(reqItem);
        }
        C598730Ne3 c598730Ne3 = this.LIZJ;
        AbstractC21198517xX<?> abstractC21198517xX = this.LIZIZ;
        String str2 = this.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        C598730Ne3.LJI(c598730Ne3, abstractC21198517xX, str2, currentUserID, commerceInfo, atomAction.requestItem, this.LIZLLL, this.LJ, this.LJI, "refresh_by_req", new LinkedHashMap(), null, str, null, jSONObject, c1563990qnl, new AwS611S0100000_32(this, 236), 5120);
    }

    public C21181517un(AbstractC21198517xX abstractC21198517xX, C598730Ne3 c598730Ne3, String str, int i, String str2, boolean z, AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, AwS576S0100000_32 awS576S0100000_323) {
        this.LIZIZ = abstractC21198517xX;
        this.LIZJ = c598730Ne3;
        this.LIZLLL = str;
        this.LJ = i;
        this.LJFF = str2;
        this.LJI = z;
        this.LJII = awS576S0100000_32;
        this.LJIIIIZZ = awS576S0100000_322;
        this.LJIIIZ = awS576S0100000_323;
    }
}
