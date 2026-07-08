package X;

import Y.AcS496S0100000_15;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C919080a1a extends C2217421BqW implements Function1<GuestInvitePanelResp.ListUser, Unit> {
    public C919080a1a(C932420aN6 c932420aN6) {
        super(1, c932420aN6, C932420aN6.class, "onInviteQuickUserClick", "onInviteQuickUserClick(Lcom/bytedance/android/live/liveinteract/multilive/social/model/GuestInvitePanelResp$ListUser;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GuestInvitePanelResp.ListUser listUser) {
        C19EG c19egLJIJJLI;
        GuestInvitePanelResp.ListUser listUser2 = listUser;
        C932420aN6 c932420aN6 = (C932420aN6) this.receiver;
        c932420aN6.getClass();
        if (!listUser2.invited) {
            if (((C932810aNj) c932420aN6.LLJJL.getValue()).LIZIZ()) {
                C766270U4b.LIZLLL(2131852852);
            } else {
                AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(c932420aN6, listUser2, 83);
                if (Intrinsics.LJFF(InterfaceC934710aQn.Qc.LIZIZ(), Boolean.TRUE) || (c19egLJIJJLI = C520010KaN.LJIJJLI(c932420aN6.LL, true)) == null) {
                    awS416S0200000_15.invoke();
                } else {
                    String strLIZ = C0KVU.LIZ(listUser2.user);
                    C782110Um9 c782110Um9 = new C782110Um9(c19egLJIJJLI);
                    c782110Um9.LJIILLIIL = true;
                    c782110Um9.LJIILL = true;
                    c782110Um9.LIZJ = C497740JfY.LJIJJ(2131854528, strLIZ);
                    c782110Um9.LJII(2131854527);
                    c782110Um9.LJIILIIL(2131854532, new AcS496S0100000_15(awS416S0200000_15, 52));
                    c782110Um9.LJIIJ(2131841087, new InterfaceC743640TFa() { // from class: X.0Zw0
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            InterfaceC934710aQn.Qc.LJFF(Boolean.TRUE);
                            liveDialog.dismiss();
                        }
                    });
                    C786410Ut5.E4(c782110Um9.LIZ());
                }
            }
        }
        return Unit.LIZ;
    }
}
