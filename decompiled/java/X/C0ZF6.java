package X;

import Y.ACallableS66S1100000_14;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZF6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZF6 implements InterfaceC20663415tQ {
    public static final C0ZF6 LIZ = new C0ZF6();
    public static final int[] LIZIZ = {8, 7};
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0ZF7());
    public static InterfaceC539120LCk LIZLLL;
    public static boolean LJ;

    @Override // X.InterfaceC20663415tQ
    public final void LIZJ() {
    }

    @Override // X.InterfaceC20663415tQ
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        User user;
        String uid;
        InnerPushUITemplate uiTemplate2;
        if (i != 7) {
            if (i == 8) {
                C19331210k2.LIZ.getClass();
                C19331210k2.LJIILJJIL(3, innerPushMessage, "click");
                IIMNudgeAndStreakService imNudgeAndStreakService = C1336205Ku.LIZ(false).getImNudgeAndStreakService();
                if (imNudgeAndStreakService.LIZ(innerPushMessage.getType())) {
                    ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LIZJ().LJ(C19331210k2.LIZLLL(), "inner_push", null, C19331210k2.LJI(innerPushMessage), null, "nudge");
                    boolean zLJJIIJZLJL = imNudgeAndStreakService.LJJIIJZLJL(innerPushMessage, new AwS558S0100000_14(innerPushMessage, 1290));
                    if (zLJJIIJZLJL && (uiTemplate2 = innerPushMessage.getUiTemplate()) != null) {
                        uiTemplate2.setNeedDoubleClickCheck(false);
                    }
                    return zLJJIIJZLJL;
                }
            }
        } else {
            C19331210k2.LIZ.getClass();
            C19331210k2.LJIILJJIL(3, innerPushMessage, "click");
            if (!LJ && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
                uiTemplate.setRightType(1);
                uiTemplate.setRightImageUrl(null);
                uiTemplate.setRightImageResId(0);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
                c419910GdJ.LJ = Integer.valueOf(R.attr.c9n);
                C844470XAv.LIZ.getClass();
                uiTemplate.setRightImageDrawable(c419910GdJ.LIZ(C844470XAv.LIZ()));
                uiTemplate.setRightImageHeight(16);
                uiTemplate.setRightImageWidth(16);
                uiTemplate.setRightImageRadius(0);
                uiTemplate.setGlobalSchemaUrl(uiTemplate.rightSchemaUrl);
                uiTemplate.setContent(C844470XAv.LIZ().getString(2131831923));
                List<User> list = uiTemplate.fromUsers;
                if (list != null && (user = (User) ListProtector.get(list, 0)) != null && (uid = user.getUid()) != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1522805xi(innerPushMessage, uid, null), 3);
                    LIZ.getClass();
                    C15O7.LIZ(new ACallableS66S1100000_14(innerPushMessage, "click", 0));
                }
                InterfaceC539120LCk interfaceC539120LCk = LIZLLL;
                if (interfaceC539120LCk != null) {
                    C539110LCj.LIZIZ(interfaceC539120LCk, innerPushMessage, new int[]{3, 2}, false, 12);
                }
                InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
                if (uiTemplate3 != null) {
                    uiTemplate3.setNeedDoubleClickCheck(false);
                }
                LJ = true;
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC20663415tQ
    public final void LIZIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        Integer numValueOf;
        if (innerPushMessage != null && (uiTemplate = innerPushMessage.getUiTemplate()) != null && (numValueOf = Integer.valueOf(uiTemplate.rightType)) != null) {
            if (numValueOf.intValue() == 7) {
                C15O7.LIZ(new ACallableS66S1100000_14(innerPushMessage, "show", 0));
            } else if (numValueOf.intValue() == 8) {
                InterfaceC1357410lQZ interfaceC1357410lQZLJIIZILJ = ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJIIZILJ("tag_inner_push");
                String strValueOf = String.valueOf(innerPushMessage.getId());
                C19331210k2.LIZ.getClass();
                interfaceC1357410lQZLJIIZILJ.LIZIZ(strValueOf, C19331210k2.LIZLLL(), "inner_push", null, C19331210k2.LJI(innerPushMessage), null, "nudge");
            }
        }
        LJ = false;
        LIZLLL = c20663515tR;
    }
}
