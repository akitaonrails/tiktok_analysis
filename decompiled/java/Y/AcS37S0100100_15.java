package Y;

import X.C01HM;
import X.C09JN;
import X.C306901Gx;
import X.C766270U4b;
import X.C946390ajd;
import X.C955400ayA;
import X.C960020b5c;
import X.C987100bnI;
import X.InterfaceC743640TFa;
import X.InterfaceC946440aji;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import java.util.Map;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: loaded from: classes16.dex */
public class AcS37S0100100_15 implements InterfaceC743640TFa {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS37S0100100_15 acS37S0100100_15, LiveDialog liveDialog) {
        ((MultiCoHostBeInvitedFragment) acS37S0100100_15.l0).LLLJ.LIZ(C960020b5c.LIZIZ(12, true).LJJZ(new C09JN() { // from class: X.00Kz
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostBeInvitedFragment@44e6.onDestroy$1$disposable$1");
                C1C7U.LIZIZ("MultiCoHostBeInvitedFragment@44e6.onDestroy$1$disposable$1");
            }
        }, new C09JN() { // from class: X.00L0
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostBeInvitedFragment@44e6.onDestroy$1$disposable$2");
                C1C7U.LIZIZ("MultiCoHostBeInvitedFragment@44e6.onDestroy$1$disposable$2");
            }
        }, new C987100bnI((MultiCoHostBeInvitedFragment) acS37S0100100_15.l0, 11)));
        liveDialog.dismiss();
        C766270U4b.LIZLLL(2131841234);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJL(acS37S0100100_15.j1, "turn_off");
    }

    public static final void LIZ$1(AcS37S0100100_15 acS37S0100100_15, LiveDialog liveDialog) {
        ShowListUser showListUser;
        liveDialog.dismiss();
        C946390ajd c946390ajd = (C946390ajd) acS37S0100100_15.l0;
        C01HM c01hm = c946390ajd.LLILLL;
        if (c01hm != null && (showListUser = c01hm.LIZ) != null) {
            long j = showListUser.userId;
            InterfaceC946440aji interfaceC946440aji = c946390ajd.LL;
            if (interfaceC946440aji != null) {
                interfaceC946440aji.LIZLLL(j);
            }
        }
        long j2 = acS37S0100100_15.j1;
        Map mapLIZIZ = C306901Gx.LIZIZ();
        mapLIZIZ.put("guest_id", String.valueOf(j2));
        C306901Gx.LJIL("livesdk_anchor_multiguest_liveshow_guest_replay_confirm", mapLIZIZ);
    }

    public AcS37S0100100_15(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
