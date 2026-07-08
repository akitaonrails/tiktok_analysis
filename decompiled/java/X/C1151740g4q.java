package X;

import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* JADX INFO: renamed from: X.0g4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151740g4q implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public static final void run$0(C1151740g4q c1151740g4q) {
        C1143920fsE c1143920fsE = ((C1136980fh2) c1151740g4q.l0).LJIIZILJ;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C1143920fsE c1143920fsE2 = ((C1136980fh2) c1151740g4q.l0).LJIJ;
        if (c1143920fsE2 != null) {
            c1143920fsE2.LIZ();
        }
        C1143920fsE c1143920fsE3 = ((C1136980fh2) c1151740g4q.l0).LJIJI;
        if (c1143920fsE3 != null) {
            c1143920fsE3.LIZ();
        }
    }

    public static final void run$1(C1151740g4q c1151740g4q) {
        ((ExchangeFirstStageVM) c1151740g4q.l0).LLIZLLLIL.LJIIL();
    }

    public static final void run$2(C1151740g4q c1151740g4q) {
        ((I18nUpdateManager) c1151740g4q.l0).LJ = false;
    }

    public static final void run$3(C1151740g4q c1151740g4q) {
        ((I18nUpdateManager) c1151740g4q.l0).LJ = false;
    }

    public static final void run$4(C1151740g4q c1151740g4q) {
        BottomMessage bottomMessage;
        PunishEventInfo punishEventInfo;
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) c1151740g4q.l0;
        C1111930f2d c1111930f2d = publicScreenWidget.LLJILJILJ;
        String str = null;
        if (c1111930f2d != null) {
            bottomMessage = c1111930f2d.LLIZ;
            publicScreenWidget.LLJILJILJ.LLILZLL = "";
        } else {
            bottomMessage = null;
        }
        publicScreenWidget.eQ0();
        C1111930f2d c1111930f2d2 = publicScreenWidget.LLJILJILJ;
        if (c1111930f2d2 != null) {
            if (bottomMessage != null && (punishEventInfo = bottomMessage.punishInfo) != null) {
                str = punishEventInfo.punishId;
            }
            c1111930f2d2.LJLLJ(str);
        }
    }

    public C1151740g4q(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
