package X;

import Y.ARunnableS115S0100000_15;
import Y.ARunnableS84S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSyncEnterRoomChannel;
import com.bytedance.android.live.liveinteract.match.business.event.WindowRecreateBattleInfoChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchBottomNoticeCard;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomIconAttachChannel;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomIconDetachAllChannel;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomIconDismissChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bZ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978310bZ7 implements InterfaceC975560bUg {
    public final DataChannel LL;
    public final MatchBaseWidget LLILLJJLI;
    public EnumC976730bWZ LLILLL;
    public View LLILZ;

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    public final void LJIILIIL() {
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragmentLIZ;
        Fragment fragmentLIZ2;
        C20441214yg.LIZIZ("MatchItemComponent", "loadMatchItemAssem");
        MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
        FrameLayout frameLayout = (FrameLayout) matchBaseWidget.findViewById(R.id.maz);
        if (frameLayout != null) {
            frameLayout.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.0bZ8
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewAdded(View view, View view2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("matchItemContainer onChildViewAdded: child=");
                    sbLIZ.append(view2);
                    C20441214yg.LIZIZ("MatchItemComponent", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewRemoved(View view, View view2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("matchItemContainer onChildViewRemoved: child=");
                    sbLIZ.append(view2);
                    C20441214yg.LJFF("MatchItemComponent", C2188811AlT.LIZIZ(sbLIZ), new Exception("View removed stack trace"));
                }
            });
        }
        View viewFindViewById = matchBaseWidget.findViewById(R.id.m96);
        boolean z = ((frameLayout == null || frameLayout.findViewById(R.id.nkf) == null) && ((((interfaceC1097170eep = matchBaseWidget.widgetCallback) == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) && (fragmentLIZ = C946803n0.LIZ(matchBaseWidget.getView())) == null) || C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IMatchItemAbility.class, null) == null)) ? false : true;
        StringBuilder sb = new StringBuilder("alreadyLoaded = ");
        sb.append(z);
        sb.append(", matchItemContainer?.childCount = ");
        sb.append(frameLayout != null ? Integer.valueOf(frameLayout.getChildCount()) : null);
        sb.append(", bottomContent = ");
        sb.append(viewFindViewById);
        sb.append(", (widget.getFragment()?.vScope()?.ability<IMatchItemAbility>() = ");
        InterfaceC1097170eep interfaceC1097170eep2 = matchBaseWidget.widgetCallback;
        sb.append(((interfaceC1097170eep2 == null || (fragmentLIZ2 = interfaceC1097170eep2.getFragment()) == null) && (fragmentLIZ2 = C946803n0.LIZ(matchBaseWidget.getView())) == null) ? null : C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ2, null), IMatchItemAbility.class, null));
        C20441214yg.LIZIZ("MatchItemComponent", sb.toString());
        if (z) {
            C20441214yg.LIZIZ("MatchItemComponent", "loadMatchItemAssem skip, already loaded");
            return;
        }
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        StringBuilder sb2 = new StringBuilder("loadMatchItemAssem, matchWidget = ");
        sb2.append(this.LLILLJJLI);
        sb2.append(", matchItemContainer ");
        sb2.append(frameLayout != null ? Integer.valueOf(frameLayout.getId()) : null);
        C20441214yg.LIZIZ("MatchItemComponent", sb2.toString());
        HandlerHook.viewPost(frameLayout, new ARunnableS84S0200000_15(matchBaseWidget, this, 68));
        this.LLILZ = matchBaseWidget.findViewById(R.id.m96);
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        DataChannel dataChannel;
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragmentLIZ;
        FrameLayout frameLayout = (FrameLayout) this.LLILLJJLI.findViewById(R.id.maz);
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
        if (matchBaseWidget != null && (((interfaceC1097170eep = matchBaseWidget.widgetCallback) != null && (fragmentLIZ = interfaceC1097170eep.getFragment()) != null) || (fragmentLIZ = C946803n0.LIZ(matchBaseWidget.getView())) != null)) {
            C20441214yg.LIZIZ("MatchItemComponent", "unload MatchItemAssem and MatchBottomNoticeCard");
            C723850SaN.LJIIIIZZ(fragmentLIZ, C13LE.LIZ(MatchBottomNoticeCard.class));
            C723850SaN.LJIIIIZZ(fragmentLIZ, C13LE.LIZ(MatchItemAssem.class));
        }
        this.LLILZ = null;
        C1087790ePh.LIZJ();
        if (this.LLILLJJLI == null || (dataChannel = this.LL) == null) {
            return;
        }
        dataChannel.zQ2(this);
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LLILLL;
    }

    public final void LIZ(BattleInfoResponse battleInfoResponse) {
        Fragment fragmentLIZ;
        Fragment fragmentLIZ2;
        IMatchItemAbility iMatchItemAbility;
        C20441214yg.LIZIZ("MatchItemComponent", "initMatchItemsWhenBattleStart");
        MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
        InterfaceC1097170eep interfaceC1097170eep = matchBaseWidget.widgetCallback;
        if (interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) {
            fragmentLIZ = C946803n0.LIZ(matchBaseWidget.getView());
        }
        if (fragmentLIZ != null && C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IMatchItemAbility.class, null) != null) {
            MatchBaseWidget matchBaseWidget2 = this.LLILLJJLI;
            InterfaceC1097170eep interfaceC1097170eep2 = matchBaseWidget2.widgetCallback;
            if (((interfaceC1097170eep2 != null && (fragmentLIZ2 = interfaceC1097170eep2.getFragment()) != null) || (fragmentLIZ2 = C946803n0.LIZ(matchBaseWidget2.getView())) != null) && (iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ2, null), IMatchItemAbility.class, null)) != null) {
                iMatchItemAbility.z01(battleInfoResponse);
                return;
            }
            return;
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel == null) {
            return;
        }
        dataChannel.LC0(BattleItemSyncEnterRoomChannel.class, battleInfoResponse);
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        LJIILIIL();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.CQ2(WindowRecreateBattleInfoChannel.class, matchBaseWidget, new AwS594S0100000_15(this, 961));
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.DQ2(VirtualTicketCrossRoomIconAttachChannel.class, matchBaseWidget, new AwS594S0100000_15(this, 963));
            dataChannel2.CQ2(VirtualTicketCrossRoomIconDetachAllChannel.class, matchBaseWidget, AFwS250S0000000_15.get$arr$(211));
            dataChannel2.CQ2(VirtualTicketCrossRoomIconDismissChannel.class, matchBaseWidget, AFwS250S0000000_15.get$arr$(212));
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
        C975960bVK c975960bVK;
        View view = this.LLILZ;
        if (view == null || view.getVisibility() != 0) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            List<? extends TeamUsersInfo> list = null;
            if ((interfaceC963620bBQ instanceof C975960bVK) && (c975960bVK = (C975960bVK) interfaceC963620bBQ) != null) {
                list = c975960bVK.LJJIJ;
            }
            c973660bRc.LJJLIIIJL(list, false);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        C975960bVK c975960bVK;
        View view = this.LLILZ;
        if (view == null || view.getVisibility() != 0) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            List<? extends TeamUsersInfo> list = null;
            if ((interfaceC963620bBQ instanceof C975960bVK) && (c975960bVK = (C975960bVK) interfaceC963620bBQ) != null) {
                list = c975960bVK.LJJIJ;
            }
            c973660bRc.LJJLIIIJL(list, false);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, new ARunnableS115S0100000_15(this, 170), 1000L);
        }
    }

    public final void LJIILJJIL(BattleInfoResponse battleInfoResponse) {
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragmentLIZ;
        IMatchItemAbility iMatchItemAbility;
        MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
        if (matchBaseWidget != null && ((((interfaceC1097170eep = matchBaseWidget.widgetCallback) != null && (fragmentLIZ = interfaceC1097170eep.getFragment()) != null) || (fragmentLIZ = C946803n0.LIZ(matchBaseWidget.getView())) != null) && (iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IMatchItemAbility.class, null)) != null)) {
            iMatchItemAbility.z01(battleInfoResponse);
            return;
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel == null) {
            return;
        }
        dataChannel.LC0(BattleItemSyncEnterRoomChannel.class, battleInfoResponse);
    }

    public C978310bZ7(MatchBaseWidget matchBaseWidget, DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILLJJLI = matchBaseWidget;
        EnumSet.of(EnumC963560bBK.AUDIENCE);
        this.LLILLL = EnumC976730bWZ.P1;
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
        C20441214yg.LIZIZ("MatchItemComponent", "onAudienceWindowStateReady");
        C473410IhP.LIZIZ(new ARunnableS84S0200000_15(this, battleInfoResponse, enumC970440bMQ, 69));
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
        Integer numValueOf;
        if (abstractC970850bN5 instanceof C970840bN4) {
            C970840bN4 c970840bN4 = (C970840bN4) abstractC970850bN5;
            BattleInfoResponse battleInfoResponse = c970840bN4.LIZ;
            LJIILJJIL(battleInfoResponse);
            BattleSetting battleSetting = battleInfoResponse.setting;
            if (battleSetting != null && (numValueOf = Integer.valueOf(battleSetting.status)) != null) {
                if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                    LIZ(c970840bN4.LIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
        Fragment fragmentLIZ;
        IMatchItemAbility iMatchItemAbility;
        if (!list.isEmpty()) {
            if (list2 != null && list.size() == ((ArrayList) list2).size()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<C954460awe> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
            MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
            if (matchBaseWidget == null) {
                return;
            }
            InterfaceC1097170eep interfaceC1097170eep = matchBaseWidget.widgetCallback;
            if (((interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) && (fragmentLIZ = C946803n0.LIZ(matchBaseWidget.getView())) == null) || (iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IMatchItemAbility.class, null)) == null) {
                return;
            }
            iMatchItemAbility.eY(arrayList);
        }
    }
}
