package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067010dsB extends AbstractC1066890drz {
    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067010dsB();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.GO_LIVE_INCENTIVE_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        super.p1(c2344009Gk);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        LJJIJIIJI(c2344009Gk2, c2344009Gk);
        C20684815ws.LJIILLIIL("livesdk_glip_golive_button_show", c2344009Gk2.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(X.C2344009Gk r8, X.C2344009Gk r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r7.LJIIZILJ()
            java.lang.String r1 = X.C0OAL.LIZ(r6)
            if (r1 == 0) goto Lf
            java.lang.String r0 = "anchor_infos"
            r9.LJFF(r0, r1)
        Lf:
            java.util.List r0 = r6.getAnchors()
            java.lang.String r4 = "text_type"
            r3 = 0
            if (r0 == 0) goto Lbc
            java.util.Iterator r5 = r0.iterator()
        L1c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r2 = r5.next()
            r0 = r2
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r0
            int r1 = r0.getType()
            X.0nKG r0 = X.EnumC1430380nKG.GO_LIVE_INCENTIVE_ANCHOR
            int r0 = r0.getTYPE()
            if (r1 != r0) goto L1c
        L35:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r2 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r2
            if (r2 == 0) goto Lbc
            java.lang.String r2 = r2.getDataFromLogExtra(r4)
            if (r2 == 0) goto Lbc
        L3f:
            java.lang.String r1 = r7.LJIJJLI()
            java.lang.String r0 = "enter_from"
            r8.LJIIIIZZ(r0, r1)
            java.lang.String r1 = "button_type"
            java.lang.String r0 = "glip"
            r8.LJIIIIZZ(r1, r0)
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r6)
            java.lang.String r0 = "anchor_id"
            r8.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r6.getAid()
            java.lang.String r0 = "item_id"
            r8.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "user_id"
            r8.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r6.getRequestId()
            java.lang.String r0 = "request_id"
            r8.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "is_ad"
            r8.LIZJ(r3, r0)
            r8.LJIIIIZZ(r4, r2)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            java.lang.String r1 = r0.D5()
            java.lang.String r0 = "is_new_anchor"
            r8.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            java.lang.String r1 = r0.LJ()
            java.lang.String r0 = "is_permission_host"
            r8.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.getAuthor()
            java.lang.String r1 = X.C735370Ssx.LJIJJLI(r0)
            java.lang.String r0 = "follow_type"
            r8.LJFF(r0, r1)
            return
        Lb9:
            r2 = 0
            goto L35
        Lbc:
            java.lang.String r2 = ""
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1067010dsB.LJJIJIIJI(X.09Gk, X.09Gk):void");
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) throws JSONException {
        String schema;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null && schema.length() > 0 && 1 != 0) {
            JSONObject jSONObject = new JSONObject();
            Aweme awemeLJIIZILJ = LJIIZILJ();
            jSONObject.put("is_ad", 0);
            jSONObject.put("request_id", awemeLJIIZILJ.getRequestId());
            jSONObject.put("item_id", awemeLJIIZILJ.getAid());
            jSONObject.put("request_from", "golive_anchor");
            String strJ3 = C786410Ut5.J3(jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(schema);
            sbLIZ.append("&source_params=");
            sbLIZ.append(strJ3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().handleSchema(interfaceC1392640mLO.LIZIZ(), strLIZIZ, null);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            LJJIJIIJI(c2344009Gk2, c2344009Gk);
            C20684815ws.LJIILLIIL("livesdk_glip_golive_button_click", c2344009Gk2.LIZ);
        }
    }
}
