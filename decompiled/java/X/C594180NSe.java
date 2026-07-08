package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SurpriseVoucherExt;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594180NSe implements InterfaceC594230NSj {
    public final boolean LIZ;
    public final AbstractC21198617xY<AbstractC21202217y8> LIZIZ;

    @Override // X.InterfaceC594230NSj
    public final int id() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherAction] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Status] */
    /* JADX WARN: Type inference failed for: r0v52, types: [T extends android.view.View, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.0NSe] */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0NSh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594180NSe.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [X.0NSe] */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.05Vn, com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594180NSe.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594180NSe.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594180NSe.LJIIIZ(X.05Vn):java.lang.Object");
    }

    public C594180NSe(boolean z, AbstractC21197117xJ abstractC21197117xJ) {
        this.LIZ = z;
        this.LIZIZ = abstractC21197117xJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZLLL(boolean r18, java.lang.Integer r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594180NSe.LIZLLL(boolean, java.lang.Integer):org.json.JSONObject");
    }

    public final void LJ(int i, boolean z) {
        String strLIZJ;
        LiveVoucher liveVoucher;
        String str;
        C1743900vTw c1743900vTw = this.LIZIZ.LLIZLLLIL;
        if (c1743900vTw != null) {
            strLIZJ = c1743900vTw.LIZJ("room_id");
        } else {
            strLIZJ = null;
        }
        if (i == 1) {
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            C1440005kM.LIZ(new C037D(strLIZJ, null, "live_coupon_card", C2097608Jq.LJ()));
            return;
        }
        PopupCardVO popupCardVO = this.LIZIZ.LL;
        if (popupCardVO != null) {
            liveVoucher = popupCardVO.popVoucher;
        } else {
            liveVoucher = null;
        }
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("render_type", 1);
        map2.put("is_filter", Boolean.TRUE);
        map2.put("disable_top_render", Boolean.FALSE);
        HashMap map3 = new HashMap();
        if (liveVoucher != null && (str = liveVoucher.voucherTypeId) != null) {
            map3.put("voucher_type_id", str);
        }
        map2.put("render_params", map3);
        map2.put("hide_navbar_back", "1");
        if (liveVoucher != null && liveVoucher.LIZIZ() && z) {
            map2.put("show_seller_follow_coupon_toast", 1);
        }
        map.put("content_params", map2);
        C1440005kM.LIZ(new C037D(strLIZJ, null, "live_coupon_card", map));
    }

    public final void LJI(int i, String str) throws JSONException {
        JSONObject jSONObjectLIZLLL = LIZLLL(false, 4);
        jSONObjectLIZLLL.put("is_success", i);
        jSONObjectLIZLLL.put("fail_reason", str);
        jSONObjectLIZLLL.put("coupon_zone", "live_popup_card");
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL("livesdk_tiktokec_coupon_result", jSONObjectLIZLLL);
    }

    public final void LJII(Integer num, String str) throws JSONException {
        if (this.LIZ) {
            JSONObject jSONObjectLIZLLL = LIZLLL(true, num);
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            jSONObjectLIZLLL.put("click_for", str);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("livesdk_tiktokec_module_click", jSONObjectLIZLLL);
            return;
        }
        JSONObject jSONObjectLIZLLL2 = LIZLLL(false, num);
        C1507790pL7 c1507790pL72 = C1507790pL7.LIZ;
        jSONObjectLIZLLL2.put("click_for", str);
        c1507790pL72.getClass();
        C1507790pL7.LIZLLL("livesdk_tiktokec_live_coupon_pin_card_click_user", jSONObjectLIZLLL2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC594230NSj
    public final void LIZ(String str, Product product, Integer num) throws JSONException {
        boolean zLIZJ;
        AbstractC21198617xY<AbstractC21202217y8> abstractC21198617xY;
        PopupCardVO popupCardVO;
        LiveVoucher liveVoucher;
        SurpriseVoucherExt surpriseVoucherExt;
        String str2;
        LiveVoucher liveVoucher2;
        PopupCardVO popupCardVO2 = this.LIZIZ.LL;
        int iLJIJ = 0;
        if (popupCardVO2 != null && (liveVoucher2 = popupCardVO2.popVoucher) != null) {
            zLIZJ = liveVoucher2.LIZJ();
        } else {
            zLIZJ = false;
        }
        Context context = null;
        if (zLIZJ) {
            switch (str.hashCode()) {
                case -1572441828:
                    if (str.equals("pin_button")) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C592750NMr(this, null), 3);
                    }
                    break;
                case -1377687758:
                    if (str.equals("button")) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NS5(this, null), 3);
                    }
                    break;
                case 3556460:
                    if (str.equals("term") && (popupCardVO = (abstractC21198617xY = this.LIZIZ).LL) != null && (liveVoucher = popupCardVO.popVoucher) != null && (surpriseVoucherExt = liveVoucher.surpriseVoucherExt) != null && (str2 = surpriseVoucherExt.termSchema) != null) {
                        T t = abstractC21198617xY.LLILZIL;
                        if (t != 0) {
                            context = t.getContext();
                        }
                        SmartRouter.buildRoute(context, str2).open();
                        break;
                    }
                    break;
                case 94756344:
                    if (str.equals("close")) {
                        LJII(null, "close");
                    }
                    break;
                case 888569682:
                    if (str.equals("after_scrolling")) {
                        try {
                            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ttec_live_surprise_coupon_manual_claim_type", true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        LJ(iLJIJ, true);
                    }
                    break;
            }
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1572441828) {
            if (iHashCode != -1377687758) {
                if (iHashCode != 94756344 || !str.equals("close")) {
                    return;
                }
                LJII(null, "close");
                return;
            }
            if (!str.equals("button")) {
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NS4(this, null), 3);
            return;
        }
        if (!str.equals("pin_button")) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C592740NMq(this, null), 3);
    }

    public final Object LJIIIIZZ(Integer num, String str, AbstractC23140094w abstractC23140094w) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LJI(abstractC23140094w, C2107308Nj.LIZ, new C594050NRr(this, str, num, null));
    }
}
