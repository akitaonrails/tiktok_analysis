package X;

import android.content.DialogInterface;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0ycg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class DialogInterfaceOnClickListenerC1864640ycg implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC1864640ycg(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC1864640ycg dialogInterfaceOnClickListenerC1864640ycg, DialogInterface dialogInterface, int i) {
        DataChannel dataChannelNK;
        RankRootController rankRootController = (RankRootController) dialogInterfaceOnClickListenerC1864640ycg.l0;
        RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) dialogInterfaceOnClickListenerC1864640ycg.l1;
        rankRootController.getClass();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099430eiT c1099430eiT = new C1099430eiT();
        c1099430eiT.LIZIZ(rankInfo.user.getId());
        c1099430eiT.LJ(rankInfo.roomId);
        interfaceC500940JkiUser.LIZ(c1099430eiT.LIZJ()).LJJLL(new C09JN() { // from class: X.00Lq
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RankRootController@4c8d.follow$1");
                C1C7U.LIZIZ("RankRootController@4c8d.follow$1");
            }
        }, new C09JN() { // from class: X.00Lr
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RankRootController@4c8d.follow$2");
                C1C7U.LIZIZ("RankRootController@4c8d.follow$2");
            }
        });
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        InterfaceC1790880whi interfaceC1790880whi = rankRootController.LLILZ;
        if (interfaceC1790880whi != null) {
            dataChannelNK = interfaceC1790880whi.nK();
        } else {
            dataChannelNK = null;
        }
        c1810690xDf.getClass();
        C1810690xDf.LJIILLIIL(dataChannelNK, rankInfo);
        dialogInterface.dismiss();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1864640ycg dialogInterfaceOnClickListenerC1864640ycg, DialogInterface dialogInterface, int i) {
        C1786240waE c1786240waE = (C1786240waE) dialogInterfaceOnClickListenerC1864640ycg.l0;
        RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) dialogInterfaceOnClickListenerC1864640ycg.l1;
        c1786240waE.getClass();
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099430eiT c1099430eiT = new C1099430eiT();
        c1099430eiT.LIZIZ(rankInfo.user.getId());
        c1099430eiT.LJ(rankInfo.roomId);
        interfaceC500940JkiUser.LIZ(c1099430eiT.LIZJ()).LJJLL(new C09JN() { // from class: X.00Lt
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CreatorRankingPageNavigator@bc8e.follow$1");
                C1C7U.LIZIZ("CreatorRankingPageNavigator@bc8e.follow$1");
            }
        }, new C09JN() { // from class: X.00Lu
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CreatorRankingPageNavigator@bc8e.follow$2");
                C1C7U.LIZIZ("CreatorRankingPageNavigator@bc8e.follow$2");
            }
        });
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        DataChannel dataChannel = c1786240waE.LIZ.getDataChannel();
        c1810690xDf.getClass();
        C1810690xDf.LJIILLIIL(dataChannel, rankInfo);
        dialogInterface.dismiss();
    }
}
