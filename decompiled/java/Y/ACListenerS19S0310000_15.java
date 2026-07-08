package Y;

import X.C01GW;
import X.C1109770ez9;
import X.C1119700fFA;
import X.C15438062q;
import X.C307001Gy;
import X.C497740JfY;
import X.C766270U4b;
import X.C918910a1J;
import X.C922480a74;
import X.C927240aEk;
import X.C927600aFK;
import X.C933400aOg;
import X.C944860ahA;
import X.InterfaceC920480a3q;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.event.OpenCoHostListPanelEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkmicAudienceInviteGroupChatMemberGuide;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS19S0310000_15 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS19S0310000_15 aCListenerS19S0310000_15, View view) {
        ArrayList arrayList;
        if (aCListenerS19S0310000_15.z3) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842052));
            return;
        }
        C922480a74.LIZ(((C1109770ez9) aCListenerS19S0310000_15.l0).LJIIIZ, null);
        List<Long> list = ((LinkmicAudienceInviteGroupChatMemberGuide) aCListenerS19S0310000_15.l1).groupMemberUserIds;
        ArrayList arrayList2 = new ArrayList();
        for (Long l : list) {
            long jLongValue = l.longValue();
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            List<LinkPlayerInfo> list2 = C307001Gy.LIZ().LJIILIIL().LJJJ;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<LinkPlayerInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().mUser.getId()));
                }
            } else {
                arrayList = null;
            }
            if (C933400aOg.P5(jLongValue, arrayList)) {
                arrayList2.add(l);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(String.valueOf(((Number) it3.next()).longValue()));
        }
        C927240aEk c927240aEk = new C927240aEk("anchorLiveHome", "capsuleBtnInRoom");
        c927240aEk.LJ = "default";
        c927240aEk.LIZ();
        InterfaceC920480a3q interfaceC920480a3qLIZ = C918910a1J.LIZ();
        if (interfaceC920480a3qLIZ != null) {
            interfaceC920480a3qLIZ.LIZJ(arrayList3, null);
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842053));
        ((C933400aOg) aCListenerS19S0310000_15.l2).getClass();
        C933400aOg.S5("click", arrayList3);
        aCListenerS19S0310000_15.z3 = true;
    }

    public static final void onClick$1(ACListenerS19S0310000_15 aCListenerS19S0310000_15, View view) {
        if (aCListenerS19S0310000_15.z3) {
            C944860ahA c944860ahA = (C944860ahA) aCListenerS19S0310000_15.l0;
            User user = ((OptPairInfo.OptPairUser) ListProtector.get((List) aCListenerS19S0310000_15.l1, 0)).user;
            if (user == null) {
                user = new User();
            }
            c944860ahA.LJIIIIZZ(user, ((OptPairInfo.OptPairUser) ListProtector.get((List) aCListenerS19S0310000_15.l1, 0)).roomId, null, ((LinkMicAnchorGuideMessage) aCListenerS19S0310000_15.l2).optPairInfo);
        } else {
            ((C944860ahA) aCListenerS19S0310000_15.l0).getClass();
            DataChannelGlobal.LLILZ.FQ2(OpenCoHostListPanelEvent.class, "from_pairing_notice");
        }
        C1119700fFA.LIZ(4, ((C944860ahA) aCListenerS19S0310000_15.l0).LJII());
    }

    public ACListenerS19S0310000_15(C1109770ez9 c1109770ez9, LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide, C933400aOg c933400aOg, int i) {
        this.$t = i;
        this.l0 = c1109770ez9;
        this.l1 = linkmicAudienceInviteGroupChatMemberGuide;
        this.l2 = c933400aOg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS19S0310000_15(boolean z, boolean z2, C944860ahA c944860ahA, List<OptPairInfo.OptPairUser> list, LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        this.$t = linkMicAnchorGuideMessage;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = c944860ahA;
        this.l2 = list;
    }
}
