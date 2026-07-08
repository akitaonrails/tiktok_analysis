package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.MultiGuestGuidenceViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933510aOr implements LifecycleOwner {
    public final DataChannel LL;
    public final LifecycleRegistry LLILLJJLI = new LifecycleRegistry(this);
    public final C01GW LLILLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 218));
    public final C921150a4v LLILZ = new InterfaceC922630a7J() { // from class: X.0a4v
        @Override // X.InterfaceC922630a7J
        public final void Ue(Throwable th) {
        }

        @Override // X.InterfaceC922630a7J
        public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
            C20441214yg.LIZIZ("live_guidence", "AnchorInviteGuideHelper_onListChangeByFetch");
            ArrayList arrayList = new ArrayList();
            Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LJIILL().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().mUser);
            }
            this.LL.LIZ(arrayList);
        }

        @Override // X.InterfaceC922630a7J
        public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
            C20441214yg.LIZIZ("live_guidence", "AnchorInviteGuideHelper_onListChangeByIM");
            ArrayList arrayList = new ArrayList();
            Iterator<LinkListUser> it2 = interfaceC921200a50.LJIILL().iterator();
            while (it2.hasNext()) {
                User user = it2.next().user;
                if (user != null) {
                    arrayList.add(user);
                }
            }
            this.LL.LIZ(arrayList);
        }
    };
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 219));
    public C11JF LLILZLL;
    public boolean LLIZ;
    public IGuidenceAbility LLIZLLLIL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0a4v] */
    public C933510aOr(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void LIZ(List<? extends User> list) {
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        C933460aOm c933460aOm;
        User user;
        MultiGuestGuidenceViewModel viewModel2;
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel3;
        C933680aP8 state2;
        C933460aOm c933460aOm2;
        IGuidenceAbility iGuidenceAbility2 = this.LLIZLLLIL;
        if (iGuidenceAbility2 != null && (viewModel = iGuidenceAbility2.getViewModel()) != null && (state = viewModel.getState()) != null && (c933460aOm = state.LL) != null && (user = c933460aOm.LIZ) != null) {
            for (Object obj : (ArrayList) list) {
                if (((User) obj).getId() == user.getId()) {
                    if (obj != null) {
                        if (this.LLIZ && (iGuidenceAbility = this.LLIZLLLIL) != null && (viewModel3 = iGuidenceAbility.getViewModel()) != null && (state2 = viewModel3.getState()) != null && (c933460aOm2 = state2.LL) != null && c933460aOm2.LIZ != null) {
                            this.LLIZ = false;
                            LIZIZ(new C933610aP1(2));
                        }
                        IGuidenceAbility iGuidenceAbility3 = this.LLIZLLLIL;
                        if (iGuidenceAbility3 != null && (viewModel2 = iGuidenceAbility3.getViewModel()) != null) {
                            viewModel2.wQ2(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void LIZIZ(C933610aP1 c933610aP1) {
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        C933690aP9 c933690aP9;
        IGuidenceAbility iGuidenceAbility2;
        MultiGuestGuidenceViewModel viewModel2;
        C933680aP8 state2;
        C933460aOm c933460aOm;
        if (c933610aP1 != null && Integer.valueOf(c933610aP1.LIZ) != null && (iGuidenceAbility = this.LLIZLLLIL) != null && (viewModel = iGuidenceAbility.getViewModel()) != null && (state = viewModel.getState()) != null && (c933690aP9 = state.LLILLJJLI) != null && (iGuidenceAbility2 = this.LLIZLLLIL) != null && (viewModel2 = iGuidenceAbility2.getViewModel()) != null && (state2 = viewModel2.getState()) != null && (c933460aOm = state2.LL) != null) {
            C931740aM0.LIZ(C940770aaZ.LIZ().getDataSource().LIZJ() - 1, c933690aP9.LIZ, c933460aOm.LIZIZ, String.valueOf(c933610aP1.LIZ), c933460aOm.LIZ, c933460aOm.LIZLLL, null);
        }
    }

    public final void LIZJ(int i, Long l) {
        Long lValueOf;
        MultiGuestGuidenceViewModel viewModel;
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel2;
        C933680aP8 state;
        C933460aOm c933460aOm;
        MultiGuestGuidenceViewModel viewModel3;
        C933680aP8 state2;
        C933460aOm c933460aOm2;
        User user;
        if (l != null) {
            IGuidenceAbility iGuidenceAbility2 = this.LLIZLLLIL;
            if (iGuidenceAbility2 != null && (viewModel3 = iGuidenceAbility2.getViewModel()) != null && (state2 = viewModel3.getState()) != null && (c933460aOm2 = state2.LL) != null && (user = c933460aOm2.LIZ) != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(lValueOf, l)) {
                if (this.LLIZ && (iGuidenceAbility = this.LLIZLLLIL) != null && (viewModel2 = iGuidenceAbility.getViewModel()) != null && (state = viewModel2.getState()) != null && (c933460aOm = state.LL) != null && c933460aOm.LIZ != null) {
                    this.LLIZ = false;
                    LIZIZ(new C933610aP1(i));
                }
                IGuidenceAbility iGuidenceAbility3 = this.LLIZLLLIL;
                if (iGuidenceAbility3 != null && (viewModel = iGuidenceAbility3.getViewModel()) != null) {
                    viewModel.wQ2(null);
                }
            }
        }
    }

    public final void LIZLLL(int i, boolean z) {
        MultiGuestGuidenceViewModel viewModel;
        C20441214yg.LIZIZ("live_guidence", "AnchorInviteGuideHelper_hideInviteGuidence");
        this.LLIZ = false;
        IGuidenceAbility iGuidenceAbility = this.LLIZLLLIL;
        if (iGuidenceAbility != null && (viewModel = iGuidenceAbility.getViewModel()) != null) {
            viewModel.xQ2(i, z);
        }
        C940770aaZ.LIZ().LIZIZ();
        for (AbstractC939840aZ4 abstractC939840aZ4 : (ArrayList) C937830aVp.LIZIZ(EnumC939900aZA.NO_GUEST, null)) {
            if (abstractC939840aZ4 instanceof C934190aPx) {
                ((C934190aPx) abstractC939840aZ4).LJIILJJIL(null);
            }
        }
    }
}
