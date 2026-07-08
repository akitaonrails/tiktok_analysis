package X;

import Y.ACListenerS117S0200000_14;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.activestatus.api.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS292S0300000_14;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ZEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896420ZEq implements InterfaceC19330810jy, C0NY2 {
    public final PrivacySettingsFeature LL;
    public final C05YC<List<C0NXK>> LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final InterfaceC497601wk LLILZIL;
    public final int[] LLILZLL;
    public int LLIZ;
    public InterfaceC539120LCk LLIZLLLIL;
    public Long LLJ;
    public final C01GW LLJI;

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.C0NY2
    public final boolean LIZIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LLILZLL;
    }

    @Override // X.C0NY2
    public final C05YC LJ() {
        return this.LLILLJJLI;
    }

    @Override // X.C0NY2
    public final String getName() {
        return this.LLILLL;
    }

    public C896420ZEq(int i) {
        PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        String value = EnumC15513065n.ONLINE_PUSH.getValue();
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        this.LL = imPrivacySettings;
        this.LLILLJJLI = c2252331DDrLIZIZ;
        this.LLILLL = value;
        this.LLILZ = false;
        this.LLILZIL = c054gLIZ;
        this.LLILZLL = new int[]{27, 31, 32};
        this.LLJI = C452501pT.LIZIZ(new C1103304Tf());
    }

    public static final String LJIIJ(InnerPushMessage innerPushMessage) {
        String bizExtraJsonStr;
        String string = "";
        try {
            if (innerPushMessage == null || (bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr()) == null) {
                bizExtraJsonStr = "";
            }
            string = JSONObjectProtectorUtils.getString(new JSONObject(bizExtraJsonStr), "user_id");
            return string;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return string;
        }
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return LJII(innerPushMessage, EnumC1990307qv.INTERCEPT_SHOW);
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        ActivityStatus activityStatus;
        boolean zLJII = LJII(innerPushMessage, EnumC1990307qv.INTERCEPT_ENQUEUE);
        if ((innerPushMessage.getType() != 27 && innerPushMessage.getType() != 31) || (activityStatus = (ActivityStatus) C051M.LIZIZ(ActivityStatus.class, innerPushMessage.getBizExtraJsonStr())) == null) {
            return zLJII;
        }
        C23250099c.LIZLLL(this.LLILZIL, null, null, new C15515065p(this, activityStatus, null), 3);
        return zLJII;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        int i2;
        if (innerPushMessage == null) {
            return false;
        }
        long id = innerPushMessage.getId();
        Long l = this.LLJ;
        if (l == null || id != l.longValue()) {
            return false;
        }
        ((IIMChatRoomService) this.LLJI.getValue()).LIZLLL();
        if (i != 1 && i != 2) {
            if (i == 3) {
                C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
                if (!Intrinsics.LJFF(c1908480zlO.LJIJI(innerPushMessage).get("enter_chat_page"), "true") && (i2 = this.LLIZ) != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            LJIIIIZZ(innerPushMessage, "chat_room");
                            C896440ZEs.LIZ().LIZ();
                            return false;
                        }
                    } else {
                        this.LLIZ = 2;
                        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                        if (uiTemplate != null) {
                            C0I0B c0i0b = C0I0B.LJFF;
                            c0i0b.LIZJ();
                            uiTemplate.setContent(C894660Z7w.LIZ().getString(2131835475, uiTemplate.title));
                            uiTemplate.setRightType(1);
                            uiTemplate.setRightImageUrl(null);
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            c0i0b.LIZJ();
                            uiTemplate.setRightImageDrawable(c419910GdJ.LIZ(C894660Z7w.LIZ()));
                            uiTemplate.setRightImageResId(0);
                            uiTemplate.setRightImageRadius(0);
                        }
                        InterfaceC539120LCk interfaceC539120LCk = this.LLIZLLLIL;
                        if (interfaceC539120LCk != null) {
                            C539110LCj.LIZIZ(interfaceC539120LCk, innerPushMessage, new int[]{3, 2}, false, 12);
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1522905xj(innerPushMessage, null), 3);
                        ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LIZJ().LJ(((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI(), "inner_push", null, innerPushMessage.getLabel(), "1", "send_a_hi");
                        LJIIIIZZ(innerPushMessage, "inner_push");
                        c1908480zlO.LJII(C18JY.CLICK, innerPushMessage, "click", 3);
                        C896440ZEs.LIZ().LIZ();
                        return true;
                    }
                }
            }
        } else {
            C896440ZEs.LIZ().LIZ();
            LJIIIIZZ(innerPushMessage, "chat_room");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r12, X.EnumC1990307qv r13) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C896420ZEq.LJII(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage, X.07qv):boolean");
    }

    public final void LJIIIIZZ(InnerPushMessage innerPushMessage, String str) {
        C0ZE7 c0ze7 = new C0ZE7(null);
        c0ze7.LJII = Boolean.TRUE;
        c0ze7.LIZIZ(EnumC1910440zoY.INNER_PUSH);
        c0ze7.LIZJ = LJIIJ(innerPushMessage);
        c0ze7.LJFF = str;
        c0ze7.LIZLLL = "inner_push";
        C897490ZIt.LIZIZ(c0ze7);
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        Long lValueOf;
        InnerPushUITemplate uiTemplate;
        String str;
        String strLJJJJZI;
        String strLJIIJ = LJIIJ(innerPushMessage);
        if (!C1336205Ku.LIZ(false).getLightInteractService().LIZ(strLJIIJ)) {
            this.LLIZ = 0;
        } else {
            this.LLIZ = 1;
        }
        String str2 = null;
        if (innerPushMessage != null) {
            lValueOf = Long.valueOf(innerPushMessage.getId());
        } else {
            lValueOf = null;
        }
        this.LLJ = lValueOf;
        this.LLIZLLLIL = c20663515tR;
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE7 c0ze7 = new C0ZE7(null);
        c0ze7.LJII = Boolean.TRUE;
        c0ze7.LIZJ = LJIIJ(innerPushMessage);
        c0ze7.LIZIZ(EnumC1910440zoY.INNER_PUSH);
        c0ze7.LIZLLL = "inner_push";
        C0ZE8.LJIIIZ(c0ze7);
        C0ZFD c0zfdLIZIZ = C896440ZEs.LIZ().LIZIZ();
        if (c0zfdLIZIZ != null) {
            C23250099c.LIZLLL(c0zfdLIZIZ.LIZLLL, null, null, new C0ZFB(c0zfdLIZIZ, null), 3);
        }
        if (innerPushMessage == null) {
            return null;
        }
        if (!((C0Z9Y) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJI().LJIJJ(innerPushMessage)) {
            if (C1336205Ku.LIZ(false).getLightInteractService().LIZ(strLJIIJ)) {
                ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LIZJ().LIZIZ(String.valueOf(innerPushMessage.getId()), ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI(), EnumC1908380zlE.INNER_PUSH.getValue(), null, innerPushMessage.getLabel(), "1", "send_a_hi");
            }
            return null;
        }
        String str3 = "";
        if (innerPushMessage.getType() == 32) {
            strLJJJJZI = "dm_permissions_receiver_open";
        } else {
            C0Z9K c0z9kLJJI = ((C0Z9Y) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJI();
            InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
            if ((uiTemplate2 == null || (str = uiTemplate2.rightSchemaUrl) == null) && ((uiTemplate = innerPushMessage.getUiTemplate()) == null || (str = uiTemplate.globalSchemaUrl) == null)) {
                str = "";
            }
            strLJJJJZI = c0z9kLJJI.LJJJJZI(str);
            if (strLJJJJZI == null) {
                strLJJJJZI = "";
            }
        }
        C0Z9K c0z9kLJJI2 = ((C0Z9Y) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJI();
        try {
            ActivityStatus activityStatus = (ActivityStatus) C051M.LIZIZ(ActivityStatus.class, innerPushMessage.getBizExtraJsonStr());
            if (activityStatus != null) {
                str2 = activityStatus.userID;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "inner_push");
        pairArr[1] = new Pair("enter_method", strLJJJJZI);
        String label = innerPushMessage.getLabel();
        if (label != null) {
            str3 = label;
        }
        pairArr[2] = new Pair("push_label", str3);
        pairArr[3] = new Pair("light_interaction_enter_from", ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI());
        pairArr[4] = new Pair("light_interaction_enter_method", EnumC1908380zlE.INNER_PUSH.getValue());
        return c0z9kLJJI2.LJIIJJI(innerPushMessage, str2, false, C2097608Jq.LJIIIIZZ(pairArr), new ACListenerS117S0200000_14(c20663515tR, innerPushMessage, 33), new AwS292S0300000_14(innerPushMessage, c20663515tR, this, 4));
    }
}
