package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: renamed from: X.0ZF3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZF3 implements InterfaceC19330810jy {
    public InterfaceC539120LCk LL;

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return C0ZF5.LIZ;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return C1866720yg2.LIZ();
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return C1866720yg2.LIZ();
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        InnerPushUITemplate uiTemplate2;
        if (innerPushMessage == null || i != 3 || !C1336205Ku.LIZ(false).getImNudgeAndStreakService().LIZ(innerPushMessage.getType()) || (uiTemplate = innerPushMessage.getUiTemplate()) == null || uiTemplate.rightType != 8) {
            return false;
        }
        InterfaceC892560Yzu interfaceC892560YzuLIZJ = ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LIZJ();
        C19331210k2.LIZ.getClass();
        interfaceC892560YzuLIZJ.LJ(C19331210k2.LIZLLL(), "inner_push", null, C19331210k2.LJI(innerPushMessage), null, "nudge");
        boolean zLJJIIJZLJL = C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJIIJZLJL(innerPushMessage, new AwS415S0200000_14(this, innerPushMessage, 71));
        if (zLJJIIJZLJL && (uiTemplate2 = innerPushMessage.getUiTemplate()) != null) {
            uiTemplate2.setNeedDoubleClickCheck(false);
        }
        return zLJJIIJZLJL;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        if (innerPushMessage != null) {
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null && uiTemplate.rightType == 8) {
                InterfaceC1357410lQZ interfaceC1357410lQZLJIIZILJ = ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJIIZILJ("tag_inner_push");
                String strValueOf = String.valueOf(innerPushMessage.getId());
                C19331210k2.LIZ.getClass();
                interfaceC1357410lQZLJIIZILJ.LIZIZ(strValueOf, C19331210k2.LIZLLL(), "inner_push", null, C19331210k2.LJI(innerPushMessage), null, "nudge");
                return null;
            }
            InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
            if (uiTemplate2 == null || uiTemplate2.rightType != 7) {
                return null;
            }
            InterfaceC892560Yzu interfaceC892560YzuLIZJ = ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LIZJ();
            String strValueOf2 = String.valueOf(innerPushMessage.getId());
            C19331210k2.LIZ.getClass();
            interfaceC892560YzuLIZJ.LIZIZ(strValueOf2, C19331210k2.LIZLLL(), "inner_push", null, C19331210k2.LJI(innerPushMessage), null, "send_a_hi");
            return null;
        }
        return null;
    }
}
