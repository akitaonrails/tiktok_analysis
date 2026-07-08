package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import defpackage.g;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684470Qt3 extends g {
    public final void LIZJ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op_args", str);
            jSONObject.put("alert_id", str2);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                interfaceC634840OvC.sendEvent("onAlertButtonClickAction", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZIZ;
        C19EG c19eg;
        Activity activityLIZIZ2;
        g.b bVar = (g.b) xBaseParamModel;
        try {
            String title = bVar.getTitle();
            String content = bVar.getContent();
            g.c buttons = bVar.getButtons();
            String id = bVar.getId();
            String text = buttons.getCancel().getText();
            String text2 = buttons.getConfirm().getText();
            SAFHelper.LIZ.getClass();
            Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
            Context context = activityLJIIIIZZ;
            if (activityLJIIIIZZ == null) {
                if (C1205604ne.LIZ()) {
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ != null && (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) != null) {
                        activityLIZIZ = C737910Sx3.LIZIZ(activityLIZIZ2);
                    } else {
                        activityLIZIZ = null;
                    }
                    if (activityLIZIZ instanceof C19EG) {
                        c19eg = (C19EG) activityLIZIZ;
                    } else {
                        c19eg = null;
                    }
                    if (((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLIIIJJI(c19eg)) {
                        context = c19eg;
                        if (c19eg == null) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            if (!TextUtils.isEmpty(title)) {
                c1397580mTM.LJI(title);
            }
            if (!TextUtils.isEmpty(content)) {
                c1397580mTM.LIZIZ(content);
            }
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new C684490Qt5(text2, text, this, id));
            new C1397510mTF(c1397580mTM).LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C798270VTd.LIZ("GetSearchHistoryMethod", e);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
