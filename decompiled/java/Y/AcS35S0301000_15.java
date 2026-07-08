package Y;

import X.C09JN;
import X.C11HU;
import X.C11NJ;
import X.C1701940uOG;
import X.C19487311Lz;
import X.C443120HZe;
import X.C917520Zz4;
import X.C921390a5J;
import X.C924610aAV;
import X.C936100aT2;
import X.C936250aTH;
import X.InterfaceC743640TFa;
import X.InterfaceC921410a5L;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes16.dex */
public class AcS35S0301000_15 implements InterfaceC743640TFa {
    public final int $t;
    public int i3;
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
        }
    }

    public static final void LIZ$0(AcS35S0301000_15 acS35S0301000_15, LiveDialog liveDialog) {
        Long l;
        Integer num;
        liveDialog.dismiss();
        String strLJI = C917520Zz4.LJI();
        int i = acS35S0301000_15.i3;
        boolean z = !((MultiGuestAvatarPreviewFragment) acS35S0301000_15.l0).LLJJJJ;
        C443120HZe c443120HZe = (C443120HZe) acS35S0301000_15.l1;
        Boolean bool = null;
        if (c443120HZe != null) {
            l = (Long) c443120HZe.getFirst();
        } else {
            l = null;
        }
        C443120HZe c443120HZe2 = (C443120HZe) acS35S0301000_15.l1;
        if (c443120HZe2 != null) {
            num = (Integer) c443120HZe2.getSecond();
        } else {
            num = null;
        }
        C443120HZe c443120HZe3 = (C443120HZe) acS35S0301000_15.l1;
        if (c443120HZe3 != null) {
            bool = (Boolean) c443120HZe3.getThird();
        }
        C924610aAV.LIZ(strLJI, i, "delete_confirm", z, l, num, bool);
        boolean z2 = C936250aTH.LIZIZ;
        C11HU c11huLJJ = C936250aTH.LIZIZ(((C936100aT2) acS35S0301000_15.l2).LIZ).LJJ(C1701940uOG.LIZIZ());
        MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment = (MultiGuestAvatarPreviewFragment) acS35S0301000_15.l0;
        C19487311Lz.LIZJ(c11huLJJ, multiGuestAvatarPreviewFragment.LLJJI, new AfS151S0200000_15(multiGuestAvatarPreviewFragment, (C936100aT2) acS35S0301000_15.l2, 30), new C09JN() { // from class: X.00L2
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiGuestAvatarPreviewFragment@53ab.onAvatarDeleteClick$2$2");
                C1C7U.LIZIZ("MultiGuestAvatarPreviewFragment@53ab.onAvatarDeleteClick$2$2");
            }
        }, 24);
    }

    public static final void LIZ$1(AcS35S0301000_15 acS35S0301000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C921390a5J c921390a5J = C921390a5J.LIZ;
        int i = acS35S0301000_15.i3;
        Room room = (Room) acS35S0301000_15.l0;
        C11NJ c11nj = (C11NJ) acS35S0301000_15.l1;
        InterfaceC921410a5L interfaceC921410a5L = (InterfaceC921410a5L) acS35S0301000_15.l2;
        c921390a5J.getClass();
        C921390a5J.LIZ(i, false, room, c11nj, interfaceC921410a5L);
    }

    public AcS35S0301000_15(Room room, C11NJ c11nj, InterfaceC921410a5L interfaceC921410a5L, int i) {
        this.$t = i;
        this.i3 = 2;
        this.l0 = room;
        this.l1 = c11nj;
        this.l2 = interfaceC921410a5L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcS35S0301000_15(int i, int i2, MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment, C443120HZe<Long, Integer, Boolean> c443120HZe, C936100aT2 c936100aT2) {
        this.$t = c936100aT2;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = multiGuestAvatarPreviewFragment;
        this.l2 = c443120HZe;
    }
}
