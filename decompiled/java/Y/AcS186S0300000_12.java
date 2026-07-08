package Y;

import X.AbstractC1136060ffY;
import X.C0IJT;
import X.C1161920gLG;
import X.C189200o6;
import X.C474500IjA;
import X.C500840JkY;
import X.C750580TcO;
import X.C758060ToS;
import X.C758880Tpm;
import X.C758920Tpq;
import X.C759550Tqr;
import X.EnumC758830Tph;
import X.InterfaceC1364105Vn;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AcS186S0300000_12 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS186S0300000_12 acS186S0300000_12, LiveDialog liveDialog) {
        C759550Tqr.LIZLLL(((C500840JkY) acS186S0300000_12.l1).LIZIZ, "go_to_settings");
        liveDialog.dismiss();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) acS186S0300000_12.l2;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void LIZ$1(AcS186S0300000_12 acS186S0300000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) acS186S0300000_12.l0;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        ((C758920Tpq) acS186S0300000_12.l1).LJII.invoke(EnumC758830Tph.DIALOG_CLICK_POSITIVE);
        C758060ToS.LIZIZ(((C500840JkY) acS186S0300000_12.l2).LIZIZ, "click_go_live");
    }

    public static final void LIZ$2(AcS186S0300000_12 acS186S0300000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) acS186S0300000_12.l0;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        ((C758920Tpq) acS186S0300000_12.l1).LJ.invoke();
        ((C758920Tpq) acS186S0300000_12.l1).LJII.invoke(EnumC758830Tph.DIALOG_CLICK_NEGATIVE);
        C758060ToS.LIZIZ(((C500840JkY) acS186S0300000_12.l2).LIZIZ, "click_remove");
    }

    public static final void LIZ$3(AcS186S0300000_12 acS186S0300000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C758880Tpm) acS186S0300000_12.l0).getClass();
        C758880Tpm.LIZLLL("agree");
        C758060ToS.LIZIZ(((C500840JkY) acS186S0300000_12.l1).LIZIZ, "click_go_live");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) acS186S0300000_12.l2;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void LIZ$4(AcS186S0300000_12 acS186S0300000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C759550Tqr.LIZLLL(((C500840JkY) acS186S0300000_12.l1).LIZIZ, "go_live");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) acS186S0300000_12.l2;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void LIZ$5(AcS186S0300000_12 acS186S0300000_12, LiveDialog liveDialog) {
        long id;
        String str;
        Long lValueOf;
        liveDialog.dismiss();
        ((Map) acS186S0300000_12.l0).put("action_type", "yes");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_blocklist_cancel_toast_click");
        c474500IjALIZ.LJJIIZI((Map) acS186S0300000_12.l0);
        c474500IjALIZ.LIZ();
        IUserManageService iUserManageService = (IUserManageService) C1161920gLG.LIZJ(IUserManageService.class);
        C750580TcO c750580TcO = (C750580TcO) acS186S0300000_12.l1;
        Room room = c750580TcO.LLILZ.LIZLLL;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        long id2 = ((User) acS186S0300000_12.l2).getId();
        if (Intrinsics.LJFF(((C750580TcO) acS186S0300000_12.l1).LLILZ.LJIIIIZZ, "user_profile")) {
            str = "KickOutDialog";
        } else {
            str = "UnKickOutViewHolder";
        }
        AbstractC1136060ffY abstractC1136060ffY = ((C750580TcO) acS186S0300000_12.l1).LLILZ.LJFF;
        if (abstractC1136060ffY != null) {
            lValueOf = Long.valueOf(abstractC1136060ffY.getMessageId());
        } else {
            lValueOf = null;
        }
        iUserManageService.S70(c750580TcO, false, id, id2, str, lValueOf);
        ((C750580TcO) acS186S0300000_12.l1).LJIIJ("unblock");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcS186S0300000_12(Object obj, Map<String, String> map, C750580TcO c750580TcO, User user) {
        this.$t = user;
        this.l0 = obj;
        this.l1 = map;
        this.l2 = c750580TcO;
    }
}
