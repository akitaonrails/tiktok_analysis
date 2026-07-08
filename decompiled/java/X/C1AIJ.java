package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AIJ extends C1AIL {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        C1AIK c1aik = (C1AIK) xBaseParamModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle JSB!, PARAMS = ");
        sbLIZ.append(c1aik.getSaveType());
        sbLIZ.append(" ENTRANCE = ");
        sbLIZ.append(c1aik.getEntrance());
        sbLIZ.append(" WISH ITEMS = ");
        sbLIZ.append(c1aik.getWishItems());
        C20441214yg.LIZIZ("SaveViewerWishItemsMethod", C2188811AlT.LIZIZ(sbLIZ));
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(C1AIT.class, null);
        C1AII c1aii = new C1AII();
        Iterator<Map<String, Object>> it2 = c1aik.getWishItems().iterator();
        while (true) {
            jLongValue = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map<String, Object> next = it2.next();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("wishItems: ");
            sbLIZ2.append(next);
            C20441214yg.LIZIZ("SaveViewerWishItemsMethod", C2188811AlT.LIZIZ(sbLIZ2));
            C1AIM c1aim = new C1AIM();
            if (next.containsKey("oldGiftId")) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(String.valueOf(next.get("oldGiftId")));
                if (lLJIILIIL != null) {
                    jLongValue3 = lLJIILIIL.longValue();
                } else {
                    jLongValue3 = 0;
                }
                c1aim.LIZ = jLongValue3;
            }
            if (next.containsKey("giftPickId")) {
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(String.valueOf(next.get("giftPickId")));
                if (lLJIILIIL2 != null) {
                    jLongValue2 = lLJIILIIL2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                c1aim.LIZIZ = jLongValue2;
            }
            if (next.containsKey("giftId")) {
                Long lLJIILIIL3 = C2095008Iq.LJIILIIL(String.valueOf(next.get("giftId")));
                if (lLJIILIIL3 != null) {
                    jLongValue = lLJIILIIL3.longValue();
                }
                c1aim.LIZJ = jLongValue;
            }
            if (next.containsKey("description")) {
                c1aim.LIZLLL = String.valueOf(next.get("description"));
            }
            if (next.containsKey("contentSource")) {
                c1aim.LJ = String.valueOf(next.get("contentSource"));
            }
            if (next.containsKey("isPriority")) {
                c1aim.LJFF = Intrinsics.LJFF(String.valueOf(next.get("isPriority")), "1");
            }
            if (next.containsKey("isTemplateContent")) {
                c1aim.LJI = Intrinsics.LJFF(String.valueOf(next.get("isTemplateContent")), "1");
            }
            C20441214yg.LIZIZ("SaveViewerWishItemsMethod", c1aim.toString());
            ((ArrayList) c1aii.LIZJ).add(c1aim);
        }
        c1aii.LIZIZ = c1aik.getEntrance();
        c1aii.LIZ = c1aik.getSaveType();
        Number templateId = c1aik.getTemplateId();
        if (templateId != null) {
            jLongValue = templateId.longValue();
        }
        c1aii.LIZLLL = jLongValue;
        String templateName = c1aik.getTemplateName();
        if (templateName == null) {
            templateName = "";
        }
        c1aii.LJ = templateName;
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).saveViewerWishesItems(c1aii);
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
