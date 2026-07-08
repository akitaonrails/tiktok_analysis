package Y;

import X.C01NB;
import X.C0UO0;
import X.C1AI0;
import X.C2176881AHm;
import X.C354001Za;
import X.C480460Ism;
import X.C930940aKi;
import X.C932420aN6;
import X.C971810bOd;
import X.EnumC774050UXz;
import X.EnumC920250a3T;
import X.EnumC971520bOA;
import X.InterfaceC743640TFa;
import X.InterfaceC927510aFB;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.android.live.liveinteract.multilive.model.EditLiveInfoParams;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesRequestEndChannel;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes16.dex */
public class AcS83S1200000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
        }
    }

    public static final void LIZ$0(AcS83S1200000_15 acS83S1200000_15, LiveDialog liveDialog) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        EditLiveInfoParams editLiveInfoParams = new EditLiveInfoParams();
        String str = acS83S1200000_15.s0;
        editLiveInfoParams.roomId = id;
        if (str == null) {
            str = "";
        }
        editLiveInfoParams.title = str;
        C480460Ism.LIZ().getClass();
        C01NB.LIZ(((IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class)).requestUpdateLiveTitle(editLiveInfoParams)).LJFF(new C0UO0()).LJJIIJ();
        liveDialog.dismiss();
        TextHeaderListFragment.OR((TextHeaderListFragment) acS83S1200000_15.l1, EnumC971520bOA.SET_TITLE_CONFIRM, ((C354001Za) acS83S1200000_15.l2).LIZIZ);
    }

    public static final void LIZ$1(AcS83S1200000_15 acS83S1200000_15, LiveDialog liveDialog) {
        EnumC774050UXz enumC774050UXz;
        C2176881AHm c2176881AHm = (C2176881AHm) ((DataChannel) acS83S1200000_15.l1).gg0(ViewerWishesStatus.class);
        if (c2176881AHm != null && (enumC774050UXz = c2176881AHm.LIZ) != null && enumC774050UXz.isInViewerWishesCreator()) {
            ((DataChannel) acS83S1200000_15.l1).LC0(ViewerWishesRequestEndChannel.class, new AwS546S0100000_2((Function1) acS83S1200000_15.l2, (Function1<? super Boolean, Unit>) 1004));
        } else {
            ((Function1) acS83S1200000_15.l2).invoke(Boolean.TRUE);
        }
        C1AI0.LJIIIIZZ("click", acS83S1200000_15.s0, "confirm");
        liveDialog.cancel();
    }

    public static final void LIZ$2(AcS83S1200000_15 acS83S1200000_15, LiveDialog liveDialog) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        EditLiveInfoParams editLiveInfoParams = new EditLiveInfoParams();
        String str = acS83S1200000_15.s0;
        editLiveInfoParams.roomId = id;
        if (str == null) {
            str = "";
        }
        editLiveInfoParams.title = str;
        C480460Ism.LIZ().getClass();
        C01NB.LIZ(((IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class)).requestUpdateLiveTitle(editLiveInfoParams)).LJFF(new C0UO0()).LJJIIJ();
        liveDialog.dismiss();
        C971810bOd c971810bOd = (C971810bOd) acS83S1200000_15.l1;
        EnumC971520bOA enumC971520bOA = EnumC971520bOA.SET_TITLE_CONFIRM;
        C354001Za c354001Za = (C354001Za) acS83S1200000_15.l2;
        c971810bOd.getClass();
        C971810bOd.LIZJ(enumC971520bOA, c354001Za);
    }

    public static final void LIZ$3(AcS83S1200000_15 acS83S1200000_15, LiveDialog liveDialog) {
        if (((InterfaceC927510aFB) acS83S1200000_15.l1).LJIJJLI() == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
            C932420aN6 c932420aN6 = (C932420aN6) acS83S1200000_15.l2;
            c932420aN6.LJJLJ(acS83S1200000_15.s0, liveDialog, true, true, c932420aN6.LLJZIJLIL, false);
        } else {
            liveDialog.dismiss();
        }
    }

    public AcS83S1200000_15(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
