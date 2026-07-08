package Y;

import X.C09JN;
import X.C1022820ciu;
import X.C11GO;
import X.C1233040iBy;
import X.C1252060ige;
import X.C1440005kM;
import X.C19244810Qs;
import X.C19246110Rf;
import X.C19249910Sr;
import X.C1C7U;
import X.C2184171Adz;
import X.C2344009Gk;
import X.C259800zU;
import X.C785410UrT;
import X.C844470XAv;
import X.DialogC1239500iMO;
import X.InterfaceC420801kM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.notification.repository.NotificationGameStatus;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* JADX INFO: loaded from: classes29.dex */
public class AfS9S1110000_28 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS9S1110000_28 afS9S1110000_28, Object obj) {
        C1C7U.LIZ("NotificationLiveBottomDialog@685.requestGameOptionState$1");
        if (((NotificationGameStatus) obj).statusCode == 0) {
            ((C11GO) ((NotificationLiveBottomDialog) afS9S1110000_28.l1).dS().getAccessory()).LJIILJJIL(afS9S1110000_28.z2);
            NotificationLiveBottomDialog notificationLiveBottomDialog = (NotificationLiveBottomDialog) afS9S1110000_28.l1;
            boolean z = afS9S1110000_28.z2;
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "otherclick", notificationLiveBottomDialog.LLIZLLLIL);
            c1022820ciuLIZLLL.LIZJ("manage_page", "refer");
            c1022820ciuLIZLLL.LIZIZ(notificationLiveBottomDialog.LLIZ, "enter_from");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(!z ? 1 : 0), "notification_choose_type");
            c1022820ciuLIZLLL.LJII();
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131835041);
            c1233040iBy.LIZLLL();
            C1440005kM.LIZ(new C1252060ige(afS9S1110000_28.s0, afS9S1110000_28.z2));
        } else {
            ((NotificationLiveBottomDialog) afS9S1110000_28.l1).NR();
        }
        DialogC1239500iMO dialogC1239500iMO = ((NotificationLiveBottomDialog) afS9S1110000_28.l1).LLL;
        if (dialogC1239500iMO != null) {
            dialogC1239500iMO.dismiss();
            C785410UrT.LIZ(dialogC1239500iMO);
        }
        C1C7U.LIZIZ("NotificationLiveBottomDialog@685.requestGameOptionState$1");
    }

    public static final void accept$1(AfS9S1110000_28 afS9S1110000_28, Object obj) {
        C1C7U.LIZ("ISCompensateHelper@12dd.tryReUpload$2");
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS9S1110000_28.l1).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        if (afS9S1110000_28.z2) {
            C19244810Qs.LIZ.getClass();
            ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observerNetworkChange(new C19246110Rf());
        }
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, "request_status");
        c2344009Gk.LJIIIIZZ("source_method", afS9S1110000_28.s0);
        c2344009Gk.LJ(obj, "error_code");
        c19249910Sr.LIZIZ(c2344009Gk, "interest_post_backup");
        C1C7U.LIZIZ("ISCompensateHelper@12dd.tryReUpload$2");
    }

    public AfS9S1110000_28(Object obj, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.z2 = z;
        this.s0 = str;
    }
}
