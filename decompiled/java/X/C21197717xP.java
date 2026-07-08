package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.message.Img;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BFFUIConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17xP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21197717xP extends AbstractC21200217xo {
    public Long LLJILJIL;
    public String LLJILJILJ;
    public Long LLJILLL;

    public C21197717xP() {
        throw null;
    }

    @Override // X.AbstractC21200217xo
    public final void B0() {
    }

    @Override // X.AbstractC21200217xo
    public final void C0() {
    }

    @Override // X.InterfaceC21184117vD
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJIIZI(String str, Img img) {
    }

    @Override // X.InterfaceC21197317xL
    public final void LJJIL() {
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJLIIIJILLIZJL(boolean z) {
    }

    @Override // X.InterfaceC21197317xL
    public final void LLJJ(int i, AtmosphereTag atmosphereTag) {
    }

    @Override // X.InterfaceC21147917pN
    public final Map<String, String> LLJJLIIIJLLLLLLLZ(int i) {
        return null;
    }

    @Override // X.InterfaceC21184117vD
    public final void b0(ProductItem productItem) {
    }

    @Override // X.AbstractC21200217xo
    public int getCardDefaultHeight() {
        return 94;
    }

    @Override // X.AbstractC21202217y8
    public final boolean h0() {
        return false;
    }

    @Override // X.AbstractC21200217xo, X.AbstractC21202217y8
    public void setAtmosphereTags(List<AtmosphereTag> list) {
    }

    @Override // X.AbstractC21200217xo
    public final void z0() {
        if (this.LL) {
            return;
        }
        Long lValueOf = this.LLJILLL;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.LLJILLL = lValueOf;
    }

    private final String getStateRoomId() {
        InterfaceC599740Nfg interfaceC599740NfgSU1;
        ISeaLiveContextAbility liveContextAbility = getLiveContextAbility();
        Object objLIZIZ = (liveContextAbility == null || (interfaceC599740NfgSU1 = liveContextAbility.SU1()) == null) ? null : interfaceC599740NfgSU1.LIZIZ("room_id", EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        if (objLIZIZ instanceof String) {
            return (String) objLIZIZ;
        }
        return null;
    }

    @Override // X.AbstractC21200217xo, X.AbstractC21202217y8
    public Map<String, String> getCommonShowParams() {
        return C2097608Jq.LJ();
    }

    @Override // X.AbstractC21202217y8
    public Map<String, String> getPromotionLogoDaInfo() {
        return C2097608Jq.LJ();
    }

    @Override // X.AbstractC21200217xo, X.AbstractC21202217y8, X.InterfaceC21184117vD
    public List<String> getProductShowIds() {
        return C13BV.INSTANCE;
    }

    public C21197717xP(Context context) {
        super(context, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    @Override // X.AbstractC21200217xo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String F0(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L2b
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo r0 = r3.lynxCardInfo
            if (r0 == 0) goto L13
            java.lang.String r1 = r0.lynxCardSchema
            if (r1 == 0) goto L13
            int r0 = r1.length()
            if (r0 <= 0) goto L13
        L10:
            r2.LLJILJILJ = r1
        L12:
            return r1
        L13:
            X.17wn r0 = X.C21193917wn.LIZ
            r0.getClass()
            kotlin.Pair r0 = X.C21193917wn.LIZJ(r3)
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L2b
            int r0 = r1.length()
            if (r0 <= 0) goto L2b
            goto L10
        L2b:
            java.lang.String r1 = r2.LLJILJILJ
            if (r1 != 0) goto L12
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21197717xP.F0(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO):java.lang.String");
    }

    @Override // X.AbstractC21200217xo
    public final String I0(PopupCardVO popupCardVO) {
        C21193917wn.LIZ.getClass();
        return C21193917wn.LIZIZ(popupCardVO);
    }

    @Override // X.AbstractC21200217xo
    public final JSONObject M0(PopupCardVO popupCardVO) {
        JSONObject jSONObject = popupCardVO.latencyInfo;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    @Override // X.AbstractC21200217xo
    public final Map l0(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!z && this.LLJILLL == null) {
            this.LLJILLL = Long.valueOf(System.currentTimeMillis());
        }
        Long l = this.LLJILLL;
        if (l != null) {
            linkedHashMap.put("data_ready_time", Long.valueOf(l.longValue()));
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC21200217xo
    public final Long L0(PopupCardVO popupCardVO, boolean z) {
        Long lValueOf = popupCardVO.requestTime;
        if (lValueOf != null || (!z && (lValueOf = Long.valueOf(popupCardVO.createTime)) != null)) {
            this.LLJILJIL = Long.valueOf(lValueOf.longValue());
            return lValueOf;
        }
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC21184117vD
    public final void LJJLIIIJLJLI(PopupCardVO popupCardVO, String str) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getStateRoomId());
        sbLIZ.append(" refresh auction pop_card_id:");
        sbLIZ.append(popupCardVO);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        E0(popupCardVO, null, true, false, EnumC1781750wSz.UPDATE);
    }

    @Override // X.AbstractC21200217xo
    public final C1781690wSt j0(PopupCardVO popupCardVO, C1781700wSu c1781700wSu) {
        Integer numValueOf;
        BFFUIConfig bFFUIConfig;
        Float f;
        String stateRoomId = getStateRoomId();
        int i = popupCardVO.cardType;
        Long lValueOf = Long.valueOf(popupCardVO.popCardId);
        String str = c1781700wSu.LJ;
        PopupCardBffData popupCardBffData = popupCardVO.bffData;
        if (popupCardBffData != null && (bFFUIConfig = popupCardBffData.cardUiConfig) != null && (f = bFFUIConfig.height) != null) {
            numValueOf = Integer.valueOf((int) f.floatValue());
        } else {
            numValueOf = null;
        }
        return new C1781690wSt(stateRoomId, i, lValueOf, str, numValueOf, AbstractC21200217xo.s0(c1781700wSu), c1781700wSu.LIZIZ, c1781700wSu.LIZJ);
    }

    @Override // X.AbstractC21202217y8
    public final void i0(PopupCardVO popupCardVO, C1743900vTw c1743900vTw, Function0<Unit> function0, boolean z, boolean z2, int i) {
        E0(popupCardVO, function0, false, z, EnumC1781750wSz.UPDATE);
    }
}
