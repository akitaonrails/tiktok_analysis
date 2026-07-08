package X;

import com.bytedance.android.livesdk.model.message.DelayParam;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.OecLiveCreatorAction;
import com.bytedance.android.livesdk.model.message.OecLiveCreatorMessage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.data.oec_msg.AtomAction;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.DispersionParam;
import webcast.data.oec_msg.EcomLiveElementActions;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;
import webcast.data.oec_msg.PopCardInfo;
import webcast.data.oec_msg.ProductItem;
import webcast.data.oec_msg.ReqItem;

/* JADX INFO: renamed from: X.17uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21181617uo extends AbstractC21181017ui implements InterfaceC21182217uu {
    public final AbstractC21198617xY<?> LIZIZ;
    public final C598800NeA LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final boolean LJI;
    public final Function0<Unit> LJII;
    public final Function0<Boolean> LJIIIIZZ;

    @Override // X.AbstractC21181017ui
    public final List<Integer> LIZJ() {
        return C1697810uHb.LJIIJJI(1003, 1004, 1005);
    }

    @Override // X.AbstractC21181017ui
    public final long LIZLLL() {
        return 1L;
    }

    @Override // X.InterfaceC21183017v2
    public final void message() {
    }

    @Override // X.InterfaceC21182217uu
    public final boolean LIZIZ(IMessage iMessage) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
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
            atomAction.type = C21182017us.LIZ(Integer.valueOf(oecLiveCreatorAction.action));
            ReqItem reqItem = new ReqItem();
            reqItem.scene = 1001;
            atomAction.requestItem = reqItem;
            C110600bQ c110600bQ = C110600bQ.LIZ;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            Integer numValueOf = Integer.valueOf(oecLiveCreatorAction.action);
            c110600bQ.getClass();
            LJII(atomAction, C110600bQ.LIZIZ(oecLiveCreatorMessage, lValueOf, numValueOf));
            return true;
        }
        if (i3 != 202) {
            return false;
        }
        AtomAction atomAction2 = new AtomAction();
        atomAction2.type = C21182017us.LIZ(Integer.valueOf(oecLiveCreatorAction.action));
        ReqItem reqItem2 = new ReqItem();
        reqItem2.scene = 1001;
        atomAction2.requestItem = reqItem2;
        C110600bQ c110600bQ2 = C110600bQ.LIZ;
        Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
        Integer numValueOf2 = Integer.valueOf(oecLiveCreatorAction.action);
        c110600bQ2.getClass();
        LJI(atomAction2, C110600bQ.LIZIZ(oecLiveCreatorMessage, lValueOf2, numValueOf2));
        return true;
    }

    @Override // X.AbstractC21181017ui
    public final boolean LJ(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2) {
        boolean z;
        Long lValueOf;
        Long lValueOf2;
        PopCardInfo popCardInfo;
        boolean z2;
        boolean z3;
        boolean z4;
        Map<Long, ProductItem> map;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        PopCardInfo popCardInfo2;
        PopCardInfo popCardInfo3;
        EcomLiveElementActions ecomLiveElementActions = oecLiveShoppingMessageV2.actions.get(1L);
        if (ecomLiveElementActions == null) {
            return false;
        }
        CommerceInfo commerceInfo = oecLiveShoppingMessageV2.commerceInfo;
        if (commerceInfo != null && (popCardInfo3 = commerceInfo.popCardInfo) != null && popCardInfo3.popCardType == 99) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf6 = null;
        if (z) {
            if (commerceInfo != null && (popCardInfo2 = commerceInfo.popCardInfo) != null) {
                lValueOf4 = Long.valueOf(popCardInfo2.popCardId);
            } else {
                lValueOf4 = null;
            }
            PopupCardVO popupCardVO = this.LIZIZ.LL;
            if (popupCardVO != null) {
                lValueOf5 = Long.valueOf(popupCardVO.popCardId);
            } else {
                lValueOf5 = null;
            }
            if (!Intrinsics.LJFF(lValueOf4, lValueOf5)) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("onHandle: popCardId id not same");
                return false;
            }
        } else {
            if (commerceInfo != null && (popCardInfo = commerceInfo.popCardInfo) != null) {
                lValueOf = Long.valueOf(popCardInfo.popProductId);
            } else {
                lValueOf = null;
            }
            PopupCardVO popupCardVO2 = this.LIZIZ.LL;
            if (popupCardVO2 != null) {
                lValueOf2 = Long.valueOf(popupCardVO2.productId);
            } else {
                lValueOf2 = null;
            }
            if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJ("onHandle: product id not same");
                return false;
            }
        }
        Iterator<AtomAction> it2 = ecomLiveElementActions.atomActions.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().type == 1004) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        Iterator<AtomAction> it3 = ecomLiveElementActions.atomActions.iterator();
        while (true) {
            if (it3.hasNext()) {
                if (it3.next().type == 1003) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        Iterator<AtomAction> it4 = ecomLiveElementActions.atomActions.iterator();
        while (true) {
            if (it4.hasNext()) {
                if (it4.next().type == 1005) {
                    z4 = true;
                    break;
                }
            } else {
                z4 = false;
                break;
            }
        }
        if (z2) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshPart: ");
            sbLIZ.append(oecLiveShoppingMessageV2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            CommerceInfo commerceInfo2 = oecLiveShoppingMessageV2.commerceInfo;
            if (commerceInfo2 != null && (map = commerceInfo2.productInfo) != null) {
                PopupCardVO popupCardVO3 = this.LIZIZ.LL;
                if (popupCardVO3 != null) {
                    lValueOf3 = Long.valueOf(popupCardVO3.productId);
                } else {
                    lValueOf3 = null;
                }
                ProductItem productItem = map.get(lValueOf3);
                if (productItem != null) {
                    this.LIZIZ.b0(productItem);
                    PopupCardVO popupCardVO4 = this.LIZIZ.LL;
                    if (popupCardVO4 != null) {
                        lValueOf6 = Long.valueOf(popupCardVO4.productId);
                    }
                    C21198417xW.LJFF(String.valueOf(lValueOf6), this.LJFF, "refresh_by_msg", null, this.LJI, false);
                }
            }
            return true;
        }
        if (z3) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onHandle route: refreshAll by req");
            for (AtomAction atomAction : ecomLiveElementActions.atomActions) {
                if (atomAction.type == 1003) {
                    LJII(atomAction, LJFF(oecLiveShoppingMessageV2, 1003));
                    return true;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (z4) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("onHandle route: forceRefreshAll by forceReq");
            for (AtomAction atomAction2 : ecomLiveElementActions.atomActions) {
                if (atomAction2.type == 1005) {
                    LJI(atomAction2, LJFF(oecLiveShoppingMessageV2, 1005));
                    return true;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("onHandle blocked: no matched atom action");
        return false;
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

    public final JSONObject LJFF(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2, int i) {
        C21193917wn c21193917wn = C21193917wn.LIZ;
        PopupCardVO popupCardVO = this.LIZIZ.LL;
        c21193917wn.getClass();
        if (!C21193917wn.LJFF(popupCardVO)) {
            return null;
        }
        C110600bQ c110600bQ = C110600bQ.LIZ;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Integer numValueOf = Integer.valueOf(i);
        c110600bQ.getClass();
        return C110600bQ.LIZJ(oecLiveShoppingMessageV2, lValueOf, numValueOf, C110600bQ.LJ());
    }

    public final void LJI(AtomAction atomAction, JSONObject jSONObject) {
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
        C598800NeA c598800NeA = this.LIZJ;
        AbstractC21198617xY<?> abstractC21198617xY = this.LIZIZ;
        String str = this.LJFF;
        if (str == null) {
            str = "";
        }
        c598800NeA.LJFF(abstractC21198617xY, str, currentUserID, atomAction.requestItem, this.LIZLLL, this.LJ, this.LJI, "force_pop_refresh_by_req", jSONObject, new AwS611S0100000_32(this, 384));
    }

    public final void LJII(AtomAction atomAction, JSONObject jSONObject) {
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
        C598800NeA c598800NeA = this.LIZJ;
        AbstractC21198617xY<?> abstractC21198617xY = this.LIZIZ;
        String str = this.LJFF;
        if (str == null) {
            str = "";
        }
        c598800NeA.LJFF(abstractC21198617xY, str, currentUserID, atomAction.requestItem, this.LIZLLL, this.LJ, this.LJI, "refresh_by_req", jSONObject, new AwS611S0100000_32(this, 385));
    }

    public final void LJIIIZ(PopupCardVO popupCardVO, boolean z) {
        FlashSaleAtmosphere flashSaleAtmosphere;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock;
        FlashSaleAtmosphere flashSaleAtmosphere2;
        if (this.LJIIIIZZ.invoke().booleanValue()) {
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = popupCardVO.flashSaleAtmosphereInfo;
            Integer numValueOf = null;
            if (flashSaleAtmosphereInfo != null && flashSaleAtmosphereInfo.flashSaleAtmosphere != null) {
                if (flashSaleAtmosphereInfo != null && (flashSaleAtmosphere2 = flashSaleAtmosphereInfo.flashSaleAtmosphere) != null) {
                    this.LIZIZ.LJIILL(flashSaleAtmosphere2);
                }
                FlashSaleAtmosphereInfo flashSaleAtmosphereInfo2 = popupCardVO.flashSaleAtmosphereInfo;
                if (flashSaleAtmosphereInfo2 != null && (flashSaleAtmosphereStock = flashSaleAtmosphereInfo2.flashSaleAtmosphereStock) != null) {
                    this.LIZIZ.LJIIL(flashSaleAtmosphereStock);
                }
            } else {
                this.LIZIZ.LJIILL(null);
                this.LIZJ.LJ();
            }
            this.LIZIZ.LIZIZ(popupCardVO.buyButtonType);
            FlashSaleAtmosphereInfo flashSaleAtmosphereInfo3 = popupCardVO.flashSaleAtmosphereInfo;
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
        this.LJII.invoke();
    }

    public C21181617uo(AbstractC21198617xY abstractC21198617xY, C598800NeA c598800NeA, String str, int i, String str2, boolean z, AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322) {
        this.LIZIZ = abstractC21198617xY;
        this.LIZJ = c598800NeA;
        this.LIZLLL = str;
        this.LJ = i;
        this.LJFF = str2;
        this.LJI = z;
        this.LJII = awS576S0100000_32;
        this.LJIIIIZZ = awS576S0100000_322;
    }
}
