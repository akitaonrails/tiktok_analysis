package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01HL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HL extends AbstractDialogC341101Ub {
    public final C01HO LLJJIJI;
    public List<? extends LinkPlayerInfo> LLJJIJIIJIL;
    public final C01H9 LLJJIJIL;
    public final DataChannel LLJJJ;
    public final Long LLJJJIL;

    @Override // X.AbstractDialogC341101Ub
    public final void LJLI() {
        this.LLJJI.LLLI(C01HM.class, new C946420ajg(new InterfaceC946440aji() { // from class: X.01HN
            @Override // X.InterfaceC946440aji
            public final void LIZLLL(long j) {
            }

            @Override // X.InterfaceC946440aji
            public final C21688219uK LJ() {
                return null;
            }

            @Override // X.InterfaceC946440aji
            public final Long LIZJ() {
                return this.LIZ.LLJJJIL;
            }

            @Override // X.InterfaceC946440aji
            public final void LIZ(long j) {
                this.LIZ.LLJJIJI.LIZ(j);
            }

            @Override // X.InterfaceC946440aji
            public final void LIZIZ(long j) {
                this.LIZ.LLJJIJI.LIZIZ(j);
                C01HL c01hl = this.LIZ;
                c01hl.dismiss();
                C785410UrT.LIZ(c01hl);
            }
        }, this.LLJJJ));
        this.LLJJI.LLLI(C930130aJP.class, new C930090aJL(null));
    }

    @Override // X.AbstractDialogC341101Ub, X.AbstractDialogC423201kk
    public final void LJL() {
        super.LJL();
        ViewGroup viewGroup = this.LLJJ;
        if (viewGroup != null) {
            C439101nJ.LJI(viewGroup);
        }
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView != null) {
            C439101nJ.LJI(liveIconView);
        }
        LiveIconView liveIconView2 = this.LLJILJIL;
        if (liveIconView2 != null) {
            C439101nJ.LJI(liveIconView2);
        }
        LJLIIIL(this.LLJJIJIL);
    }

    public final void LJLIIIL(C01H9 c01h9) {
        boolean z;
        C20441214yg.LIZIZ("LiveShowGuestListDialog", "LiveShowGuestListDialog");
        if (c01h9 == null) {
            return;
        }
        C951190arN c951190arN = this.LLJJI;
        C410901il c410901il = new C410901il();
        ShowListUser showListUser = c01h9.LIZ;
        if (showListUser != null) {
            c410901il.add(new C01HM(showListUser, true, -1));
        }
        List<ShowListUser> list = c01h9.LIZIZ;
        if (list != null) {
            Iterator<ShowListUser> it2 = list.iterator();
            while (it2.hasNext()) {
                c410901il.add(new C01HM(it2.next(), true, -1));
            }
        }
        List<ShowListUser> list2 = c01h9.LIZJ;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                c410901il.add(new C930130aJP(C497740JfY.LJIJI(2131843564), 6));
            }
            for (ShowListUser showListUser2 : list2) {
                List<? extends LinkPlayerInfo> list3 = this.LLJJIJIIJIL;
                if (list3 != null) {
                    Iterator<? extends LinkPlayerInfo> it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        LinkPlayerInfo next = it3.next();
                        if (Intrinsics.LJFF(next.mInteractIdStr, showListUser2.linkmicIdStr)) {
                            if (next != null) {
                                z = true;
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                c410901il.add(new C01HM(showListUser2, z, -1));
            }
        }
        c951190arN.LLLII(c410901il);
    }

    public C01HL(Context context, C01HO c01ho, List<? extends LinkPlayerInfo> list, C01H9 c01h9, DataChannel dataChannel, Long l) {
        super(context);
        this.LLJJIJI = c01ho;
        this.LLJJIJIIJIL = list;
        this.LLJJIJIL = c01h9;
        this.LLJJJ = dataChannel;
        this.LLJJJIL = l;
    }
}
