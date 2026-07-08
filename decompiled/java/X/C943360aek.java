package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.AnchorPermitGuestSuccessEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkAnchorOpenOrClickUserCardEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAgreeGuideEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestApplyAcceptGuideEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuideApplyManagerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestManageDialogShowedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCellDismissEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyGuideContinueSetting;
import com.bytedance.android.livesdk.model.message.AgreeApplyGuideMessage;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0aek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943360aek {
    public final DataChannel LIZ;
    public Function0<? extends Map<Integer, ? extends InterfaceC937630aVV>> LIZIZ;
    public final C943370ael LIZJ = new C943370ael();
    public InterfaceC943500aey LIZLLL;
    public C943450aet LJ;
    public C943450aet LJFF;
    public final C943410aep LJI;
    public final C943350aej LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C943490aex LJIIJ;
    public final C943400aeo LJIIJJI;
    public final C943390aen LJIIL;

    public final Long LJ() {
        C943450aet c943450aet;
        User user;
        C943450aet c943450aetLIZ;
        InterfaceC943500aey interfaceC943500aey = this.LIZLLL;
        if ((interfaceC943500aey == null || (c943450aetLIZ = interfaceC943500aey.LIZ()) == null || (user = c943450aetLIZ.LIZ) == null) && ((c943450aet = this.LJ) == null || (user = c943450aet.LIZ) == null)) {
            return null;
        }
        return Long.valueOf(user.getId());
    }

    public final void LIZ() {
        IMessageManager iMessageManager;
        LJIIIZ(LJ(), EnumC943440aes.OTHER.getReason());
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LJI);
        }
        this.LIZIZ = null;
        C943370ael c943370ael = this.LIZJ;
        c943370ael.getClass();
        C915980Zwa.LJIIIIZZ().a9(c943370ael.LIZLLL);
        InterfaceC921620a5g interfaceC921620a5gLIZJ = C921180a4y.LIZJ();
        if (interfaceC921620a5gLIZJ != null) {
            interfaceC921620a5gLIZJ.LJJIIJ(c943370ael.LIZJ);
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILJJIL(c943370ael.LJ);
        c943370ael.LIZIZ.clear();
        c943370ael.LIZ.clear();
        C915980Zwa.LJIIIIZZ().vq0(this.LJIIJJI);
        if (C931790aM5.LIZIZ()) {
            C940770aaZ.LIZ().LJJ(this.LJIIL);
        }
        C923330a8R.LJIILJJIL(this.LJIIJ);
    }

    public static final int LIZJ(C934190aPx c934190aPx) {
        String str;
        Integer numLJIIJJI;
        PosIdentity posIdentity = c934190aPx.getWindow().getPosIdentity();
        if (posIdentity != null && (str = posIdentity.value) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return numLJIIJJI.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static final boolean LIZLLL(Integer num) {
        InterfaceC937900aVw interfaceC937900aVwLIZ;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        String strLJ;
        if (num == null || (interfaceC937900aVwLIZ = C920280a3W.LIZ()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLIZ.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) {
            return false;
        }
        for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
            InterfaceC937840aVq interfaceC937840aVq2 = interfaceC937840aVq;
            if (interfaceC937840aVq2.LJIILIIL() && ((strLJ = interfaceC937840aVq2.LJ()) == null || strLJ.length() == 0)) {
                if (interfaceC937840aVq2.LJIIIIZZ() == num.intValue()) {
                    if (interfaceC937840aVq == null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final InterfaceC937640aVW LIZIZ(long j) {
        Map<Integer, ? extends InterfaceC937630aVV> mapInvoke;
        Collection<? extends InterfaceC937630aVV> collectionValues;
        Object next;
        Integer numValueOf;
        List<PosIdentity> listLJIIJJI;
        Object next2;
        String str;
        Object next3 = null;
        if (C931790aM5.LIZIZ()) {
            C940770aaZ.LIZ().LIZIZ();
            List<AbstractC939840aZ4> listLIZIZ = C937830aVp.LIZIZ(EnumC939900aZA.NO_GUEST, null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                if (obj instanceof C934190aPx) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    PosIdentity posIdentity = ((AbstractC939840aZ4) next2).getWindow().getPosIdentity();
                    if (posIdentity != null) {
                        str = posIdentity.value;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, String.valueOf(j))) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C934190aPx c934190aPx = (C934190aPx) next2;
            if (c934190aPx == null) {
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    next3 = it3.next();
                    if (it3.hasNext()) {
                        int iLIZJ = LIZJ((C934190aPx) next3);
                        do {
                            Object next4 = it3.next();
                            int iLIZJ2 = LIZJ((C934190aPx) next4);
                            if (iLIZJ > iLIZJ2) {
                                next3 = next4;
                                iLIZJ = iLIZJ2;
                            }
                        } while (it3.hasNext());
                    }
                }
                return (C934190aPx) next3;
            }
            return c934190aPx;
        }
        Function0<? extends Map<Integer, ? extends InterfaceC937630aVV>> function0 = this.LIZIZ;
        if (function0 == null || (mapInvoke = function0.invoke()) == null || (collectionValues = mapInvoke.values()) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (obj2 instanceof InterfaceC937630aVV) {
                arrayList2.add(obj2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                InterfaceC937620aVU interfaceC937620aVU = (InterfaceC937620aVU) next;
                String strValueOf = String.valueOf(interfaceC937620aVU.getUiPos());
                int i = (int) j;
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (listLJIIJJI = interfaceC954180awCLLJLL.LJIIJJI()) != null) {
                    Iterator<PosIdentity> it5 = listLJIIJJI.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it5.hasNext()) {
                            if (Intrinsics.LJFF(it5.next().value, String.valueOf(i))) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    numValueOf = Integer.valueOf(i2);
                } else {
                    numValueOf = null;
                }
                if (Intrinsics.LJFF(strValueOf, String.valueOf(numValueOf)) && LIZLLL(interfaceC937620aVU.getUiPos())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC937640aVW interfaceC937640aVW = (InterfaceC937640aVW) next;
        if (interfaceC937640aVW == null) {
            Iterator it6 = arrayList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next5 = it6.next();
                if (LIZLLL(((InterfaceC937620aVU) next5).getUiPos())) {
                    next3 = next5;
                    break;
                }
            }
            return (InterfaceC937640aVW) next3;
        }
        return interfaceC937640aVW;
    }

    public final void LJIIIIZZ(C943450aet c943450aet) {
        AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(this, c943450aet, 24);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startGuideAnimatorIfHasEmptyMicPos, pos=");
        sbLIZ.append(c943450aet.LIZLLL);
        sbLIZ.append(" startime=");
        sbLIZ.append(c943450aet.LIZJ);
        C20441214yg.LIZIZ("AgreeApplyGuideHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (!C930540aK4.LIZJ()) {
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (!C923330a8R.LJI()) {
                C20441214yg.LIZIZ("AgreeApplyGuideHelper", "startGuideAnimatorIfHasEmptyMicPos, has not Permission too permit User");
                return;
            }
        }
        awS416S0200000_15.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0aej] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0aaY, X.0aen] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0aeo, X.0b3v] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0a8T, X.0aex] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0aep, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public C943360aek(DataChannel dataChannel, Function0<? extends Map<Integer, ? extends InterfaceC937630aVV>> function0) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        this.LIZIZ = function0;
        ?? r5 = new OnIMMessageListener() { // from class: X.0aep
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "AgreeApplyGuideIM";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                if (iMessage instanceof AgreeApplyGuideMessage) {
                    C943360aek c943360aek = this.LL;
                    AgreeApplyGuideMessage agreeApplyGuideMessage = (AgreeApplyGuideMessage) iMessage;
                    C943350aej c943350aej = c943360aek.LJII;
                    User user = agreeApplyGuideMessage.user;
                    if (user != null) {
                        c943360aek.LJIIIIZZ(new C943450aet(user, null, 0L, agreeApplyGuideMessage.displayPosition, c943350aej, agreeApplyGuideMessage, null, 192));
                    }
                }
            }
        };
        this.LJI = r5;
        this.LJII = new InterfaceC945820aii() { // from class: X.0aej
            @Override // X.InterfaceC945820aii
            public final void LIZ(int i) {
                C943450aet c943450aetLIZ;
                User user;
                DataChannel dataChannel2;
                DataChannel dataChannel3;
                C943450aet c943450aetLIZ2;
                User user2;
                C943450aet c943450aetLIZ3 = null;
                if (i == R.id.user_avatar) {
                    C20441214yg.LIZIZ("AgreeApplyGuideHelper", "User avatar clicked");
                    C943360aek c943360aek = this.LIZ;
                    InterfaceC943500aey interfaceC943500aey = c943360aek.LIZLLL;
                    if (interfaceC943500aey != null && (c943450aetLIZ2 = interfaceC943500aey.LIZ()) != null && (user2 = c943450aetLIZ2.LIZ) != null) {
                        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                        UserProfileEvent userProfileEvent = new UserProfileEvent(user2);
                        userProfileEvent.clickModule = "multi_guest_agree_apply_guide";
                        c784440UpuLIZ.LIZIZ(userProfileEvent);
                    }
                    InterfaceC943500aey interfaceC943500aey2 = c943360aek.LIZLLL;
                    if (interfaceC943500aey2 != null) {
                        c943450aetLIZ3 = interfaceC943500aey2.LIZ();
                    }
                    c943360aek.LJFF = c943450aetLIZ3;
                    return;
                }
                if (i != R.id.z80) {
                    return;
                }
                C20441214yg.LIZIZ("AgreeApplyGuideHelper", "User accept clicked");
                InterfaceC943500aey interfaceC943500aey3 = this.LIZ.LIZLLL;
                if (interfaceC943500aey3 != null && (c943450aetLIZ = interfaceC943500aey3.LIZ()) != null && (user = c943450aetLIZ.LIZ) != null) {
                    C943360aek c943360aek2 = this.LIZ;
                    c943360aek2.getClass();
                    if (C496890JeB.LIZ(C930540aK4.LIZJ())) {
                        C766270U4b.LIZLLL(2131842763);
                    } else if (user.getSecret() == 1) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842744, C0KVU.LIZ(user)));
                    } else if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vL1().contains(Long.valueOf(user.getId()))) {
                        C20441214yg.LIZIZ("AgreeApplyGuideHelper", "user doesn't have applied");
                    } else {
                        if (C930540aK4.LIZJ()) {
                            DataChannel dataChannel4 = c943360aek2.LIZ;
                            if (dataChannel4 != null) {
                                dataChannel4.LC0(LinkInRoomAnchorPermitGuestEvent.class, new C919530a2J(user, false, true, null, 10));
                            }
                        } else {
                            C923330a8R c923330a8R = C923330a8R.LIZ;
                            if (C923330a8R.LJI() && (dataChannel2 = c943360aek2.LIZ) != null) {
                                dataChannel2.LC0(MultiGuestModeratorPermitGuestEvent.class, new C919440a2A(user, 0, null, 6));
                            }
                        }
                        if (C930540aK4.LIZJ() && (dataChannel3 = c943360aek2.LIZ) != null) {
                            dataChannel3.LC0(MultiGuestAgreeGuideEvent.class, user);
                        }
                    }
                }
                C943360aek.LJII(this.LIZ, "click", "head_accept", null, null, 12);
                C943360aek c943360aek3 = this.LIZ;
                c943360aek3.LJIIIZ(c943360aek3.LJ(), EnumC943440aes.CLICK_ACCEPT.getReason());
            }
        };
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 213));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 212));
        ?? r4 = new InterfaceC923350a8T() { // from class: X.0aex
            @Override // X.InterfaceC923350a8T
            public final void LIZ(boolean z) {
                if (!z) {
                    C943360aek c943360aek = this.LL;
                    c943360aek.LJIIIZ(c943360aek.LJ(), EnumC943440aes.NO_MODERATOR_ABILITY.getReason());
                }
            }
        };
        this.LJIIJ = r4;
        ?? r3 = new InterfaceC958970b3v() { // from class: X.0aeo
            @Override // X.InterfaceC958970b3v
            public final void LIZJ(int i, List list) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJIJL(C2180891AWx c2180891AWx) {
            }

            @Override // X.InterfaceC958970b3v
            public final boolean LJJJIL() {
                return true;
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIIIL(Map map) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJJJ() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLLL(List list, boolean z) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJJI() {
                C943360aek c943360aek = this.LL;
                if (c943360aek.LJ != null) {
                    C500260Jjc.LJJLIIIJJI(500L, new AwS559S0100000_15(c943360aek, 217));
                }
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
                C943360aek c943360aek = this.LL;
                if (c943360aek.LJ != null) {
                    C500260Jjc.LJJLIIIJJI(500L, new AwS559S0100000_15(c943360aek, 217));
                }
            }
        };
        this.LJIIJJI = r3;
        ?? r2 = new InterfaceC940760aaY() { // from class: X.0aen
            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                C943360aek c943360aek = this.LIZ;
                if (c943360aek.LJ != null) {
                    C500260Jjc.LJJLIIIJJI(500L, new AwS559S0100000_15(c943360aek, 217));
                }
            }
        };
        this.LJIIL = r2;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != 0) {
            iMessageManager.addMessageListener(C001A.AGREE_APPLY_GUIDE_MESSAGE.getIntType(), (OnIMMessageListener) r5);
        }
        C915980Zwa.LJIIIIZZ().VE2(r3);
        if (C931790aM5.LIZIZ()) {
            C940770aaZ.LIZ().LJIIZILJ(r2);
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LIZ(r4);
        if (dataChannel != null) {
            dataChannel.CQ2(MultiGuestOperationCellDismissEvent.class, this, new AwS594S0100000_15(this, 220));
            dataChannel.CQ2(LinkAnchorOpenOrClickUserCardEvent.class, this, new AwS594S0100000_15(this, 221));
            dataChannel.CQ2(AnchorPermitGuestSuccessEvent.class, this, new AwS594S0100000_15(this, 222));
            dataChannel.CQ2(MultiGuestApplyAcceptGuideEvent.class, this, new AwS594S0100000_15(this, 223));
            dataChannel.CQ2(MultiGuestGuideApplyManagerEvent.class, this, new AwS594S0100000_15(this, 224));
        }
        if (LinkMicApplyGuideContinueSetting.INSTANCE.enable() && dataChannel != null) {
            dataChannel.CQ2(MultiGuestManageDialogShowedEvent.class, this, new AwS594S0100000_15(this, 225));
        }
    }

    public final void LJFF(InterfaceC937640aVW interfaceC937640aVW, C943450aet c943450aet) {
        C943450aet c943450aetLIZ;
        String idStr;
        InterfaceC943500aey interfaceC943500aey = this.LIZLLL;
        if (interfaceC943500aey != null && (c943450aetLIZ = interfaceC943500aey.LIZ()) != null) {
            User user = c943450aetLIZ.LIZ;
            if (user == null || (idStr = user.getIdStr()) == null) {
                idStr = CardStruct.IStatusCode.DEFAULT;
            }
            C931740aM0.LJIIL(idStr, "guest_apply_anchor", "guest_apply_anchor");
        }
        LJIIIZ(LJ(), EnumC943440aes.DISAPPEAR_BEFORE_SHOW.getReason());
        this.LIZLLL = interfaceC937640aVW.LJ(c943450aet);
        interfaceC937640aVW.LIZ(new AwS559S0100000_15(this, 214));
        InterfaceC943500aey interfaceC943500aey2 = this.LIZLLL;
        if (interfaceC943500aey2 != null) {
            interfaceC943500aey2.LIZJ(new AwS416S0200000_15(this, c943450aet, 23));
        }
        InterfaceC943500aey interfaceC943500aey3 = this.LIZLLL;
        if (interfaceC943500aey3 != null) {
            interfaceC943500aey3.start();
        }
        User user2 = c943450aet.LIZ;
        if (user2 != null) {
            C943370ael c943370ael = this.LIZJ;
            long id = user2.getId();
            c943370ael.LIZIZ.put(Long.valueOf(id), new InterfaceC943540af2() { // from class: X.0aeu
                @Override // X.InterfaceC943540af2
                public final void LIZ(int i, long j) {
                    if (i != 0) {
                        if (i == 2) {
                            C943360aek c943360aek = this.LIZ;
                            C943450aet c943450aet2 = c943360aek.LJ;
                            if (c943450aet2 != null) {
                                c943360aek.LJI(c943450aet2, EnumC943440aes.LINKED.getReason());
                            }
                            this.LIZ.LJIIIZ(Long.valueOf(j), EnumC943440aes.LINKED.getReason());
                            return;
                        }
                        return;
                    }
                    C943360aek c943360aek2 = this.LIZ;
                    C943450aet c943450aet3 = c943360aek2.LJ;
                    if (c943450aet3 != null) {
                        c943360aek2.LJI(c943450aet3, EnumC943440aes.NO_APPLIED.getReason());
                    }
                    this.LIZ.LJIIIZ(Long.valueOf(j), EnumC943440aes.NO_APPLIED.getReason());
                }
            });
        }
        Pair<User, User> pair = c943450aet.LIZIZ;
        if (pair != null) {
            this.LIZJ.LIZIZ.put(Long.valueOf(pair.getFirst().getId()), (InterfaceC943540af2) this.LJIIIZ.getValue());
            this.LIZJ.LIZIZ.put(Long.valueOf(pair.getSecond().getId()), (InterfaceC943540af2) this.LJIIIZ.getValue());
        }
        if (c943450aet.LIZ != null) {
            C500260Jjc.LJJLIIIJJI(500L, new AwS559S0100000_15(this, 215));
        } else {
            C500260Jjc.LJJLIIIJJI(500L, new AwS559S0100000_15(this, 216));
        }
    }

    public final void LJI(C943450aet c943450aet, String str) {
        AgreeApplyGuideMessage agreeApplyGuideMessage;
        int iIntValue;
        C943510aez c943510aez;
        String str2;
        String str3;
        String str4;
        Integer uiPos;
        if (c943450aet == null) {
            return;
        }
        BaseMessage baseMessage = c943450aet.LJFF;
        String str5 = null;
        if (baseMessage instanceof AgreeApplyGuideMessage) {
            agreeApplyGuideMessage = (AgreeApplyGuideMessage) baseMessage;
        } else {
            agreeApplyGuideMessage = null;
        }
        InterfaceC937640aVW interfaceC937640aVWLIZIZ = LIZIZ(c943450aet.LIZLLL);
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        int iLJI = C927600aFK.LJI();
        if (interfaceC937640aVWLIZIZ != null && (uiPos = interfaceC937640aVWLIZIZ.getUiPos()) != null) {
            iIntValue = uiPos.intValue();
        } else {
            iIntValue = -1;
        }
        if ((agreeApplyGuideMessage == null || (str2 = agreeApplyGuideMessage.triggerType) == null) && ((c943510aez = c943450aet.LJI) == null || (str2 = c943510aez.LIZJ) == null)) {
            str2 = "";
        }
        if (Intrinsics.LJFF(str, EnumC943440aes.TIMEOUT.getReason())) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else if (Intrinsics.LJFF(str, EnumC943440aes.CLICK_ACCEPT.getReason())) {
            str3 = "1";
        } else if (Intrinsics.LJFF(str, EnumC943440aes.LINKED.getReason())) {
            str3 = "2";
        } else {
            str3 = "3";
        }
        User user = c943450aet.LIZ;
        if (agreeApplyGuideMessage != null && (str4 = agreeApplyGuideMessage.requestId) != null) {
            str5 = str4;
        } else {
            C943510aez c943510aez2 = c943450aet.LJI;
            if (c943510aez2 != null) {
                str5 = c943510aez2.LIZLLL;
            }
        }
        C931740aM0.LIZ(iLJI, iIntValue, str2, str3, user, false, str5);
    }

    public final void LJIIIZ(Long l, String str) {
        C943450aet c943450aetLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop CurrentGuideAnimator,source=");
        sbLIZ.append(str);
        sbLIZ.append(", needStopUserId=");
        sbLIZ.append(l);
        sbLIZ.append(", currentShowGuideUserId = ");
        sbLIZ.append(LJ());
        C20441214yg.LIZIZ("AgreeApplyGuideHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(l, LJ())) {
            InterfaceC943500aey interfaceC943500aey = this.LIZLLL;
            if (interfaceC943500aey != null && (c943450aetLIZ = interfaceC943500aey.LIZ()) != null) {
                LJI(c943450aetLIZ, str);
            }
            InterfaceC943500aey interfaceC943500aey2 = this.LIZLLL;
            if (interfaceC943500aey2 != null) {
                interfaceC943500aey2.cancel();
            }
            this.LIZLLL = null;
            this.LJ = null;
        }
    }

    public static void LJII(C943360aek c943360aek, String str, String str2, C943450aet c943450aet, String str3, int i) {
        AgreeApplyGuideMessage agreeApplyGuideMessage;
        int iIntValue;
        C943510aez c943510aez;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Integer uiPos;
        InterfaceC943500aey interfaceC943500aey;
        String str11 = str3;
        C943450aet c943450aetLIZ = c943450aet;
        String str12 = str2;
        String str13 = "";
        if ((i & 2) != 0) {
            str12 = "";
        }
        Long lValueOf = null;
        if ((i & 4) != 0) {
            c943450aetLIZ = null;
        }
        if ((i & 8) != 0) {
            str11 = null;
        }
        c943360aek.getClass();
        if (c943450aetLIZ == null && ((interfaceC943500aey = c943360aek.LIZLLL) == null || (c943450aetLIZ = interfaceC943500aey.LIZ()) == null)) {
            return;
        }
        BaseMessage baseMessage = c943450aetLIZ.LJFF;
        if (baseMessage instanceof AgreeApplyGuideMessage) {
            agreeApplyGuideMessage = (AgreeApplyGuideMessage) baseMessage;
        } else {
            agreeApplyGuideMessage = null;
        }
        InterfaceC937640aVW interfaceC937640aVWLIZIZ = c943360aek.LIZIZ(c943450aetLIZ.LIZLLL);
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        int iLJI = C927600aFK.LJI();
        if (interfaceC937640aVWLIZIZ != null && (uiPos = interfaceC937640aVWLIZIZ.getUiPos()) != null) {
            iIntValue = uiPos.intValue();
        } else {
            iIntValue = -1;
        }
        if ((agreeApplyGuideMessage == null || (str4 = agreeApplyGuideMessage.triggerType) == null) && ((c943510aez = c943450aetLIZ.LJI) == null || (str4 = c943510aez.LIZJ) == null)) {
            str4 = "";
        }
        User user = c943450aetLIZ.LIZ;
        if (agreeApplyGuideMessage == null || (str5 = agreeApplyGuideMessage.requestId) == null) {
            C943510aez c943510aez2 = c943450aetLIZ.LJI;
            if (c943510aez2 != null) {
                str5 = c943510aez2.LIZLLL;
            } else {
                str5 = null;
            }
        }
        C943510aez c943510aez3 = c943450aetLIZ.LJI;
        if (c943510aez3 != null) {
            str6 = c943510aez3.LJ;
        } else {
            str6 = null;
        }
        C931740aM0.LIZJ(iLJI, iIntValue, str4, str, str12, user, false, str5, str11, str6);
        if (Intrinsics.LJFF(str, "click") && Intrinsics.LJFF(str12, "head_accept")) {
            C927240aEk c927240aEk = new C927240aEk("anchorLiveHome", "emptyAgreeGuide");
            User user2 = c943450aetLIZ.LIZ;
            if (user2 != null) {
                lValueOf = Long.valueOf(user2.getId());
            }
            c927240aEk.LJ = String.valueOf(lValueOf);
            Map<String, String> map = c927240aEk.LIZJ;
            if (agreeApplyGuideMessage != null && (str10 = agreeApplyGuideMessage.triggerType) != null) {
                str13 = str10;
            } else {
                C943510aez c943510aez4 = c943450aetLIZ.LJI;
                if (c943510aez4 != null && (str9 = c943510aez4.LIZJ) != null) {
                    str13 = str9;
                }
            }
            map.put("link_sub_reason", str13);
            c927240aEk.LIZ();
            return;
        }
        if (Intrinsics.LJFF(str, "click") && Intrinsics.LJFF(str12, "profile_accept")) {
            C927240aEk c927240aEk2 = new C927240aEk("profileV", "acceptBtn");
            User user3 = c943450aetLIZ.LIZ;
            if (user3 != null) {
                lValueOf = Long.valueOf(user3.getId());
            }
            c927240aEk2.LJ = String.valueOf(lValueOf);
            Map<String, String> map2 = c927240aEk2.LIZJ;
            if (agreeApplyGuideMessage != null && (str8 = agreeApplyGuideMessage.triggerType) != null) {
                str13 = str8;
            } else {
                C943510aez c943510aez5 = c943450aetLIZ.LJI;
                if (c943510aez5 != null && (str7 = c943510aez5.LIZJ) != null) {
                    str13 = str7;
                }
            }
            map2.put("link_sub_reason", str13);
            c927240aEk2.LIZ();
            return;
        }
        if (!Intrinsics.LJFF(str, "click") || !Intrinsics.LJFF(str12, "more")) {
            return;
        }
        new C927240aEk("anchorLiveHome", "emptySpotMore").LIZ();
    }
}
