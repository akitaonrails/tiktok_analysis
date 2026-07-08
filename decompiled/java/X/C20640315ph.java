package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20640315ph extends C1619110sEf implements InterfaceC19330810jy {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final C01GW LL = C452501pT.LIZIZ(new C1576500r7w());

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return new int[]{22};
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        return null;
    }

    public C20640315ph() {
        C20642815q6.LJI(this, new int[]{22});
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        String str;
        long jOptLong;
        String str2;
        if (innerPushMessage == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInnerPushShow message:");
        sbLIZ.append(innerPushMessage);
        C19290510dT.LIZ("LiveHandler", C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC1602300rnY) this.LL.getValue()).LJIIZILJ(true);
        C20640215pg.LIZ.getClass();
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (str = uiTemplate.globalSchemaUrl) != null) {
            boolean zBooleanValue = false;
            Boolean boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(str, "sslocal://live", false));
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            }
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            String strLJ = C20640215pg.LJ(str);
            String strLIZIZ = C20640215pg.LIZIZ(str);
            String strLIZLLL = C20640215pg.LIZLLL(str);
            String strLIZJ = C20640215pg.LIZJ(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "is_subscribe");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", "inner_push");
            c2344009Gk.LJIIIIZZ("enter_from_merge", "inner_push");
            c2344009Gk.LJIIIIZZ("room_id", strLJ);
            c2344009Gk.LJIIIIZZ("inner_push_type", strLIZLLL);
            c2344009Gk.LJIIIIZZ("anchor_id", strLIZIZ);
            c2344009Gk.LJIIIIZZ("gd_label", strLIZJ);
            c2344009Gk.LJIIIIZZ("is_subscribe", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            c2344009Gk.LJIIIIZZ("action_type", "click");
            C2080208Cy.LIZIZ(c2344009Gk, "");
            if (zBooleanValue) {
                C486660J6q.LJIIJ(c2344009Gk.LIZ);
            } else {
                C20684815ws.LJIILLIIL("livesdk_anchor_push_show", c2344009Gk.LIZ);
            }
            InterfaceC849010XSh interfaceC849010XSh = C20640215pg.LIZIZ;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            Long lValueOf2 = Long.valueOf(innerPushMessage.getId());
            String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
            if (bizExtraJsonStr == null) {
                jOptLong = 0;
            } else {
                jOptLong = new JSONObject(bizExtraJsonStr).optLong("group_id");
            }
            Long lValueOf3 = Long.valueOf(jOptLong);
            String strLIZJ2 = C20640215pg.LIZJ(str);
            if (innerPushMessage.getFrom() == EnumC19331110k1.FROM_FRONTIER) {
                str2 = "frontier";
            } else {
                str2 = "gcm";
            }
            interfaceC849010XSh.LIZ(lValueOf, lValueOf2, lValueOf3, strLIZJ2, str, str2);
        }
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && !iUserService.isLogin()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        String strLIZIZ;
        String str;
        if (C10EU.LJIIIIZZ()) {
            return false;
        }
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (str = uiTemplate.globalSchemaUrl) != null) {
            C20640215pg.LIZ.getClass();
            strLIZIZ = C20640215pg.LIZIZ(str);
        } else {
            strLIZIZ = "";
        }
        if (innerPushMessage.getType() == 22 && ((InterfaceC1602300rnY) this.LL.getValue()).LJIIL(strLIZIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        String str;
        String str2;
        if (innerPushMessage == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInnerPushClick message:");
        sbLIZ.append(innerPushMessage);
        C19290510dT.LIZ("LiveHandler", C2188811AlT.LIZIZ(sbLIZ));
        C20640215pg.LIZ.getClass();
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (str = uiTemplate.globalSchemaUrl) != null) {
            boolean zBooleanValue = false;
            Boolean boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(str, "sslocal://live", false));
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            }
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            String strLJ = C20640215pg.LJ(str);
            String strLIZIZ = C20640215pg.LIZIZ(str);
            String strLIZLLL = C20640215pg.LIZLLL(str);
            String strLIZJ = C20640215pg.LIZJ(str);
            if (!zBooleanValue) {
                str2 = "livesdk_anchor_push_click";
            } else {
                str2 = "livesdk_click_push";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("inner_push_type", strLIZLLL);
            c2344009Gk.LJIIIIZZ("enter_method", "inner_push");
            c2344009Gk.LJIIIIZZ("enter_from_merge", "inner_push");
            c2344009Gk.LJIIIIZZ("room_id", strLJ);
            c2344009Gk.LJIIIIZZ("anchor_id", strLIZIZ);
            c2344009Gk.LJIIIIZZ("gd_label", strLIZJ);
            C2080208Cy.LIZIZ(c2344009Gk, "");
            C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
            C20640215pg.LJFF(C20640215pg.LJ(str), C20640215pg.LIZIZ(str), "others", C20640215pg.LIZLLL(str), zBooleanValue, C20640215pg.LIZJ(str));
        }
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        String str2;
        String str3 = str;
        if (innerPushMessage == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInnerPushDismiss message:");
        sbLIZ.append(innerPushMessage);
        C19290510dT.LIZ("LiveHandler", C2188811AlT.LIZIZ(sbLIZ));
        boolean zBooleanValue = false;
        ((InterfaceC1602300rnY) this.LL.getValue()).LJIIZILJ(false);
        C20640215pg.LIZ.getClass();
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (str2 = uiTemplate.globalSchemaUrl) != null) {
            Boolean boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(str2, "sslocal://live", false));
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            }
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (str3 == null) {
                if (z) {
                    str3 = "draw";
                } else {
                    str3 = "others";
                }
            }
            C20640215pg.LJFF(C20640215pg.LJ(str2), C20640215pg.LIZIZ(str2), str3, C20640215pg.LIZLLL(str2), zBooleanValue, C20640215pg.LIZJ(str2));
        }
    }
}
