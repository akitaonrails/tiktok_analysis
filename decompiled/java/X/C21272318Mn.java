package X;

import android.view.View;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS600S0100000_21;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Mn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@InterfaceC1294060jmO
public final class C21272318Mn extends AbstractC1066890drz {
    public String LLJ;
    public C2344009Gk LLJI;
    public final List<AnchorProductInfoModel> LLJIJIL = new ArrayList();

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "webview";
    }

    @Override // X.AbstractC1066890drz
    public final boolean LJIL() {
        return true;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C21272318Mn();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C2344009Gk r7) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272318Mn.LJFF(X.09Gk):void");
    }

    @Override // X.AbstractC1066890drz
    public final void LJJIFFI(AnchorCommonStruct anchorCommonStruct) {
        AnchorProductInfo anchorProductInfo;
        Type type;
        LJJIJ(new AwS600S0100000_21(this, 152));
        boolean z = true;
        if (!((ArrayList) this.LLJIJIL).isEmpty()) {
            return;
        }
        String extra = anchorCommonStruct.getExtra();
        try {
            JSONArray jSONArray = new JSONArray(extra);
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                String strOptString = jSONObject.optString("extra");
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII == z) {
                        type = C2371409Qy.LIZJ(C13LE.LJ(AnchorProductInfo.class));
                    } else {
                        type = new TypeToken<AnchorProductInfo>() { // from class: X.18OD
                        }.getType();
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strOptString, type);
                    if (!(objLJIIIIZZ instanceof AnchorProductInfo)) {
                        objLJIIIIZZ = null;
                    }
                    anchorProductInfo = (AnchorProductInfo) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (anchorProductInfo == null) {
                    anchorProductInfo = new AnchorProductInfo(null, null, null, null, 0, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    ((ArrayList) this.LLJIJIL).add(new AnchorProductInfoModel(strOptString, anchorProductInfo, jSONObject.optString("keyword"), jSONObject.optString(FollowStatusChangeMethod.PARAM_UID), Integer.valueOf(jSONObject.optInt("type")), Integer.valueOf(jSONObject.optInt("platform")), jSONObject.optString("log_extra"), jSONObject.optString("schema")));
                    i++;
                    z = true;
                } else {
                    ((ArrayList) this.LLJIJIL).add(new AnchorProductInfoModel(strOptString, anchorProductInfo, jSONObject.optString("keyword"), jSONObject.optString(FollowStatusChangeMethod.PARAM_UID), Integer.valueOf(jSONObject.optInt("type")), Integer.valueOf(jSONObject.optInt("platform")), jSONObject.optString("log_extra"), jSONObject.optString("schema")));
                    i++;
                    z = true;
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("e_stack_trace", C08KI.LIZ(e2));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("anchor.extra : ");
            sbLIZ.append(extra);
            c2344009Gk.LJIIIIZZ("extra_data", C2188811AlT.LIZIZ(sbLIZ));
            c2344009Gk.LJIIIIZZ("where", "ShopLinkAnchorMaker");
            C20684815ws.LJIILLIIL("rd_tiktokec_shop_anchor_exception", c2344009Gk.LIZ);
            C2276411E8h.LIZIZ.LIZIZ("anchor_business", e2);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (AwemeExtKt.isPhotoMode(LJIIZILJ()) && !((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIII(LJIIZILJ())) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                list.remove(it2.next());
            }
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct2);
        LJJIFFI(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @C14EU
    public final void onEvent(C1051880dTm c1051880dTm) {
        String str;
        ICommerceService iCommerceServiceLIZ = C18OR.LIZ();
        C18N0 c18n0 = new C18N0();
        String strLJIJJLI = LJIJJLI();
        if (strLJIJJLI == null) {
            strLJIJJLI = "";
        }
        c18n0.LIZIZ = strLJIJJLI;
        c18n0.LIZLLL = AwemeExtKt.getAuthorUid(LJIIZILJ());
        c18n0.LIZJ = LJIIZILJ().getAid();
        c18n0.LJII = this.LLJ;
        c18n0.LJIIIIZZ = String.valueOf(c1051880dTm.LIZ);
        c18n0.LJIIJ = "video";
        c18n0.LJIIJJI = "video_cart_tag";
        C1065340dpU c1065340dpU = C1065340dpU.LIZ;
        Aweme awemeLJIIZILJ = LJIIZILJ();
        c1065340dpU.getClass();
        c18n0.LJJII = C1065340dpU.LIZ(awemeLJIIZILJ);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        if (interfaceC1392640mLO.LJII()) {
            str = "video_single_anchor";
        } else {
            str = "video_multi_anchor";
        }
        c18n0.LJJI = str;
        c18n0.LJJIFFI = "video";
        iCommerceServiceLIZ.logCommerceEvents("product_stay_time", c18n0);
        C2344009Gk c2344009Gk = this.LLJI;
        if (c2344009Gk != null) {
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(LJIIZILJ()));
            c2344009Gk.LJIIIIZZ("duration", String.valueOf(c1051880dTm.LIZ));
            c2344009Gk.LJIIIIZZ("group_id", LJIIZILJ().getAid());
            c2344009Gk.LIZLLL(C735370Ssx.LJIIL(LJIIZILJ()).longValue(), "music_id");
            c2344009Gk.LJIIIIZZ("enter_from", LJIJJLI());
            C20684815ws.LJIILLIIL("anchor_stay_time", c2344009Gk.LIZ);
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String str;
        super.p1(c2344009Gk);
        ICommerceService iCommerceServiceLIZ = C18OR.LIZ();
        C18N0 c18n0 = new C18N0();
        String strLJIJJLI = LJIJJLI();
        if (strLJIJJLI == null) {
            strLJIJJLI = "";
        }
        c18n0.LIZIZ = strLJIJJLI;
        c18n0.LIZLLL = AwemeExtKt.getAuthorUid(LJIIZILJ());
        c18n0.LIZJ = LJIIZILJ().getAid();
        c18n0.LJII = this.LLJ;
        c18n0.LJIIJ = "video";
        c18n0.LJIIJJI = "video_cart_tag";
        C1065340dpU c1065340dpU = C1065340dpU.LIZ;
        Aweme awemeLJIIZILJ = LJIIZILJ();
        c1065340dpU.getClass();
        c18n0.LJJII = C1065340dpU.LIZ(awemeLJIIZILJ);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO != null && interfaceC1392640mLO.LJII()) {
            str = "video_single_anchor";
        } else {
            str = "video_multi_anchor";
        }
        c18n0.LJJI = str;
        c18n0.LJJIFFI = "video";
        iCommerceServiceLIZ.logCommerceEvents("product_anchor_show", c18n0);
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("shop_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        this.LLJI = c2344009Gk;
        LJJII(c2344009Gk, true, true);
        LJJIJ(new AwS600S0100000_21(this, 153));
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ac  */
    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ(X.C2344009Gk r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272318Mn.LJJJLZIJ(X.09Gk, boolean):void");
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJLIIIJ(C712520RxC c712520RxC, String str, boolean z) {
        boolean z2;
        String string;
        String str2;
        String str3;
        String str4;
        List<AnchorProductInfoModel> list = this.LLJIJIL;
        ICommerceService iCommerceServiceLIZ = C18OR.LIZ();
        C18N0 c18n0 = new C18N0();
        c18n0.LJIJI = "TEMAI";
        c18n0.LJJIFFI = "video";
        c18n0.LIZIZ = LJIJJLI();
        c18n0.LIZLLL = AwemeExtKt.getAuthorUid(LJIIZILJ());
        c18n0.LIZJ = LJIIZILJ().getAid();
        if (list != null && !((ArrayList) list).isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        String string2 = null;
        if (z2) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = (ArrayList) list;
            int size = arrayList.size() - 1;
            for (int i = 0; i < size; i++) {
                sb.append(((AnchorProductInfoModel) ListProtector.get(arrayList, i)).type);
                sb.append(",");
            }
            sb.append(((AnchorProductInfoModel) C13LP.LJJLIIIJJI(arrayList)).type);
            string = sb.toString();
        }
        c18n0.LJJIJIIJIL = string;
        ArrayList arrayList2 = (ArrayList) list;
        c18n0.LJJIJIL = Integer.valueOf(arrayList2.size());
        c18n0.LJ = LJIIZILJ().getRequestId();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        if (interfaceC1392640mLO.LJII()) {
            str2 = "video_single_anchor";
        } else {
            str2 = "video_multi_anchor";
        }
        c18n0.LJJI = str2;
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        if (interfaceC1392640mLO2.LJII()) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        c18n0.LJIJ = str3;
        if (z) {
            str4 = "custom-link";
        } else {
            str4 = "maker-link";
        }
        c18n0.LJJZZI = str4;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(String.valueOf(((AnchorProductInfoModel) it2.next()).extraData.productId));
        }
        if (!arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            int size2 = arrayList3.size() - 1;
            for (int i2 = 0; i2 < size2; i2++) {
                sb2.append((String) ListProtector.get(arrayList3, i2));
                sb2.append(",");
            }
            sb2.append((String) C13LP.LJJLIIIJJI(arrayList3));
            string2 = sb2.toString();
        }
        c18n0.LJJIJLIJ = string2;
        iCommerceServiceLIZ.logCommerceEvents("rd_tiktokec_video_anchor_data_get", c18n0);
    }
}
