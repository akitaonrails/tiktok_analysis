package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC1136060ffY;
import X.AbstractC19994813Le;
import X.AbstractC950580aqO;
import X.C001X;
import X.C01GW;
import X.C093Y;
import X.C0HZQ;
import X.C0IJT;
import X.C1161920gLG;
import X.C11NJ;
import X.C1304660k3U;
import X.C1324610kZf;
import X.C13LP;
import X.C15438062q;
import X.C16F5;
import X.C16FS;
import X.C1819620xS4;
import X.C1935407i4;
import X.C20441214yg;
import X.C2188811AlT;
import X.C341701Uh;
import X.C410901il;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C925600aC6;
import X.C943660afE;
import X.C943830afV;
import X.C943840afW;
import X.C945230ahl;
import X.C947390alF;
import X.C947400alG;
import X.C948770anT;
import X.C950100apc;
import X.C950220apo;
import X.C954460awe;
import X.C954640aww;
import X.C954890axL;
import X.C954930axP;
import X.C955400ayA;
import X.C955410ayB;
import X.C955440ayE;
import X.C955520ayM;
import X.C955700aye;
import X.C955870ayv;
import X.C955890ayx;
import X.C956270azZ;
import X.C957090b0t;
import X.C978980baC;
import X.EnumC955760ayk;
import X.RunnableC781530UlD;
import Y.ALAdapterS0S0100001_12;
import Y.ALAdapterS1S0101001_12;
import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS84S0200000_15;
import Y.AUListenerS262S0100000_12;
import Y.AcS17S0000100_15;
import Y.AcS37S0100100_15;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostInvitationReorderSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostInviteePopupAutoDismissIfContainSelf;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2UiDebugSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveCoHostInvitationTimeLimitSettings;
import com.bytedance.android.livesdk.model.message.LinkBusinessMessage;
import com.bytedance.android.livesdk.model.message.PopupStateChangeContent;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS69S0100100_15;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostBeInvitedFragment extends MultiCoHostBeInvitedContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgHELIOSPGsuIDV9JCwiImE1OiQrJCo9PGsBPCMnIQYjASAgPAcpACElITEpLQkhKSIhLCEn";
    public View LLILZ;
    public View LLJJJ;
    public boolean LLJJJJJIL;
    public ValueAnimator LLJLIL;
    public ValueAnimator LLJLILLLLZIIL;
    public AnimatorSet LLJLL;
    public LinkerInviteContent LLLFF;
    public C954640aww LLLFFI;
    public DataChannel LLLFZ;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public final C01GW LLILZIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 422));
    public final C01GW LLILZLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 424));
    public final C01GW LLIZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 423));
    public final C01GW LLIZLLLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 402));
    public final C01GW LLJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 420));
    public final C01GW LLJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 404));
    public final C01GW LLJIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 406));
    public final C01GW LLJILJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 401));
    public final C01GW LLJILJILJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 400));
    public final C01GW LLJILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 421));
    public final C01GW LLJJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 415));
    public final C01GW LLJJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 425));
    public final C01GW LLJJIII = C1935407i4.LIZ(new AwS559S0100000_15(this, 413));
    public final C01GW LLJJIJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 412));
    public final C01GW LLJJIJIIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 419));
    public final C01GW LLJJIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 411));
    public final C01GW LLJJJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 403));
    public List<C955890ayx> LLJJJJ = new ArrayList();
    public final int LLJJJJLIIL = C915980Zwa.LJII().Uh();
    public final C01GW LLJJL = C1935407i4.LIZ(new AwS559S0100000_15(this, 417));
    public final List<C955870ayv> LLJJLIIIJLLLLLLLZ = new ArrayList();
    public final C01GW LLJL = C1935407i4.LIZ(new AwS559S0100000_15(this, 414));
    public final C01GW LLJLLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 405));
    public final C01GW LLJLLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 409));
    public final C01GW LLJZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 407));
    public final C01GW LLJZIJLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 418));
    public final C01GW LLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 416));
    public final C955700aye LLLF = new C955700aye();
    public int LLLI = 1;
    public String LLLII = "";
    public final long LLLIIII = SystemClock.uptimeMillis();
    public String LLLIIIIL = "show";
    public final C11NJ LLLJ = new C11NJ();
    public final C945230ahl LLLJIL = new C945230ahl();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LJIIL = false;
        c978980baC.LIZIZ = true;
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIIIZZ = false;
        return c978980baC;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final long PR() {
        C954640aww c954640aww = this.LLLFFI;
        if (c954640aww != null) {
            return c954640aww.LIZIZ;
        }
        LinkerInviteContent linkerInviteContent = this.LLLFF;
        if (linkerInviteContent == null) {
            linkerInviteContent = null;
        }
        return linkerInviteContent.fromUserId;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final List<Long> RR() {
        List<C955890ayx> list = this.LLJJJJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C955890ayx> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LIZ.userId));
        }
        return arrayList;
    }

    public final int bS() {
        JoinGroupMessageExtra joinGroupMessageExtra;
        C954640aww c954640aww = this.LLLFFI;
        if (c954640aww == null) {
            LinkerInviteContent linkerInviteContent = this.LLLFF;
            if (linkerInviteContent == null) {
                linkerInviteContent = null;
            }
            return linkerInviteContent.linkerInviteMsgExtra.inviteType;
        }
        MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
        if (mHJoinBizContent == null || (joinGroupMessageExtra = mHJoinBizContent.bizExtra) == null) {
            return 0;
        }
        return (int) joinGroupMessageExtra.sourceType;
    }

    public final RunnableC781530UlD cS() {
        return (RunnableC781530UlD) this.LLJJL.getValue();
    }

    public final C16F5 dS() {
        return (C16F5) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final void dismiss() {
        C20441214yg.LJFF("MultiCoHostBeInvitedFragment", "Invited pannel dismiss:", new RuntimeException());
        if (this.mStatusViewValid) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 408));
        }
    }

    public final ViewGroup gS() {
        return (ViewGroup) this.LLJJJIL.getValue();
    }

    public final EnumC955760ayk hS() {
        return this.LLLILZLLLI ? EnumC955760ayk.EDUCATION : this.LLLILZJ ? EnumC955760ayk.DESCRIPTION : EnumC955760ayk.NONE;
    }

    public final C0HZQ iS() {
        return (C0HZQ) this.LLJLLIL.getValue();
    }

    public final C16F5 kS() {
        return (C16F5) this.LLJJIJIL.getValue();
    }

    public final C16F5 mS() {
        return (C16F5) this.LLJJIII.getValue();
    }

    public final boolean qS() {
        if (CohostWithGuestPhase2UiDebugSetting.INSTANCE.isEnabled()) {
            return true;
        }
        if (C948770anT.LIZLLL()) {
            return this.LLJJJJLIIL == 1;
        }
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", "isShowingMuteCohostWhenMG, ignored due to ab");
        return false;
    }

    public final void ES() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestListView, guest_size=");
        sbLIZ.append(((ArrayList) this.LLJJLIIIJLLLLLLLZ).size());
        sbLIZ.append(", list=");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (((ArrayList) this.LLJJLIIIJLLLLLLLZ).isEmpty()) {
            C786410Ut5.LJLZ(8, (ViewGroup) this.LLJL.getValue());
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) ((View) this.LLJL.getValue()).findViewById(R.id.j_7);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ((View) this.LLJL.getValue()).findViewById(R.id.j_8);
        if (((ArrayList) this.LLJJLIIIJLLLLLLLZ).size() == 1) {
            C786410Ut5.LL(8, constraintLayout2);
        } else {
            C786410Ut5.LL(0, constraintLayout2);
        }
        C786410Ut5.LJLZ(0, (ViewGroup) this.LLJL.getValue());
        zS(constraintLayout, (C955870ayv) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, 0));
        if (((ArrayList) this.LLJJLIIIJLLLLLLLZ).size() > 1) {
            zS(constraintLayout2, (C955870ayv) ListProtector.get(this.LLJJLIIIJLLLLLLLZ, 1));
        }
    }

    public final void ZR() {
        if (getView() != null && isAdded()) {
            C947390alF.LIZ(getContext(), getViewLifecycleOwner(), this.LLLFZ, C947400alG.LIZ, AFwS193S0000000_7.get$arr$(224), new AwS559S0100000_15(this, 410));
            return;
        }
        int i = this.LLLI;
        if (i == 1) {
            aS(1);
        } else if (i == 2) {
            WR(1);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        long j;
        String strOE2;
        super.onDestroy();
        LiveCoHostInvitationTimeLimitSettings liveCoHostInvitationTimeLimitSettings = LiveCoHostInvitationTimeLimitSettings.INSTANCE;
        if (liveCoHostInvitationTimeLimitSettings.timeLimited() && iS().isChecked() && !qS()) {
            if (C950100apc.LIZ >= 3) {
                int i = this.LLLI;
                if (i == 1) {
                    C954640aww c954640aww = this.LLLFFI;
                    if (c954640aww != null) {
                        j = c954640aww.LIZIZ;
                    } else {
                        LinkerInviteContent linkerInviteContent = this.LLLFF;
                        if (linkerInviteContent == null) {
                            linkerInviteContent = null;
                        }
                        j = linkerInviteContent.fromUserId;
                    }
                } else if (i != 2) {
                    j = 0;
                } else {
                    C954640aww c954640aww2 = this.LLLFFI;
                    if (c954640aww2 != null) {
                        j = c954640aww2.LIZIZ;
                    } else {
                        LinkerInviteContent linkerInviteContent2 = this.LLLFF;
                        if (linkerInviteContent2 == null) {
                            linkerInviteContent2 = null;
                        }
                        j = linkerInviteContent2.fromUserId;
                    }
                }
                C782110Um9 c782110Um9 = new C782110Um9(getContext());
                c782110Um9.LJII(2131841118);
                c782110Um9.LJIILL = false;
                c782110Um9.LJIILIIL(2131841108, new AcS37S0100100_15(this, j, 0));
                c782110Um9.LJIIJ(2131841107, new AcS17S0000100_15(j, 2));
                c782110Um9.LJIJI = new DialogInterface.OnCancelListener() { // from class: X.0azQ
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        dialogInterface.dismiss();
                    }
                };
                C786410Ut5.E4(c782110Um9.LIZ());
                C955400ayA c955400ayA = C955400ayA.LIZ;
                HashMap map = new HashMap();
                map.put("connection_inviter_id", String.valueOf(j));
                map.put("anchor_id", String.valueOf(C950220apo.LJFF()));
                Room roomLIZJ = C950220apo.LIZJ();
                map.put("room_id", String.valueOf(roomLIZJ != null ? Long.valueOf(roomLIZJ.getId()) : null));
                map.put("connection_type", "anchor");
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                if (iInteractService == null || (strOE2 = iInteractService.oE2()) == null) {
                    strOE2 = "";
                }
                map.put("core_connection_type", strOE2);
                C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
                map.put("turn_off_type", liveCoHostInvitationTimeLimitSettings.timeLimited() ? "10min" : "for_this_live");
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_invitation_turn_off_pop_up_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
            }
            C766270U4b.LIZLLL(2131841235);
        }
        if (liveCoHostInvitationTimeLimitSettings.blockThisLive() && iS().isChecked() && !qS()) {
            C766270U4b.LIZLLL(2131841234);
        }
        this.LLJJJJJIL = false;
        T t = this.LLILLL;
        if (t != 0) {
            t.LJIIIIZZ();
        }
        this.LLILLL = null;
    }

    public static String rS(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) || ('0' <= c && c < ':')) {
                sb.append(c);
            } else {
                sb.append(Character.getNumericValue(c));
            }
        }
        return sb.toString();
    }

    public static final void wS(boolean z) {
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", "showMutePopupDuringMg, click cancel");
        if (z) {
            C943830afV.LIZLLL.getClass();
            C943830afV.LJFF.LJFF(Boolean.TRUE);
        } else {
            C943840afW.LIZLLL.getClass();
            C943840afW.LJFF.LJFF(Boolean.TRUE);
        }
        C955520ayM.LJIIIIZZ("cancel", z);
    }

    public final void FS(PopupStateChangeContent popupStateChangeContent) {
        int size;
        long j;
        JoinGroupMessageExtra.RivalExtra rivalExtra;
        long j2;
        Long lValueOf;
        long j3;
        final boolean z;
        boolean z2;
        boolean z3;
        long j4;
        MHJoinBizContent mHJoinBizContent;
        JoinGroupMessageExtra joinGroupMessageExtra;
        JoinGroupMessageExtra.RivalExtra rivalExtra2;
        List<JoinGroupMessageExtra.RivalExtra> list;
        boolean z4 = false;
        if (popupStateChangeContent != null && (list = popupStateChangeContent.otherUsers) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        int i = size + 1;
        final ArrayList arrayList = new ArrayList();
        C954640aww c954640aww = this.LLLFFI;
        if (c954640aww != null && (mHJoinBizContent = c954640aww.LJI) != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null && (rivalExtra2 = joinGroupMessageExtra.extra) != null) {
            j = rivalExtra2.userId;
        } else {
            j = 0;
        }
        if (popupStateChangeContent != null && (rivalExtra = popupStateChangeContent.joinUser) != null && j == rivalExtra.userId) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("itemList.size = ");
            sbLIZ.append(((ArrayList) this.LLJJJJ).size());
            sbLIZ.append(", popupChangeUserNum = ");
            sbLIZ.append(i);
            sbLIZ.append(", popupStateChangeContent. =");
            sbLIZ.append(popupStateChangeContent.otherUsers);
            C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
            if (CohostInviteePopupAutoDismissIfContainSelf.INSTANCE.isEnabled()) {
                List<JoinGroupMessageExtra.RivalExtra> list2 = popupStateChangeContent.otherUsers;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<JoinGroupMessageExtra.RivalExtra> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().userId == C950220apo.LJFF()) {
                            dismiss();
                            int i2 = this.LLLI;
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    WR(6);
                                    return;
                                }
                                return;
                            }
                            aS(6);
                            return;
                        }
                    }
                }
            }
            if (((ArrayList) this.LLJJJJ).size() < i) {
                HashSet hashSet = new HashSet();
                for (C955890ayx c955890ayx : (ArrayList) this.LLJJJJ) {
                    if (c955890ayx instanceof C955890ayx) {
                        if (this.LLLFFI != null) {
                            JoinGroupMessageExtra.RivalExtra rivalExtra3 = c955890ayx.LJ;
                            if (rivalExtra3 != null) {
                                j4 = rivalExtra3.userId;
                            } else {
                                j4 = 0;
                            }
                            hashSet.add(Long.valueOf(j4));
                        } else {
                            hashSet.add(Long.valueOf(c955890ayx.LIZ.userId));
                        }
                        arrayList.add(c955890ayx);
                    }
                }
                for (JoinGroupMessageExtra.RivalExtra rivalExtra4 : popupStateChangeContent.otherUsers) {
                    if (!hashSet.contains(Long.valueOf(rivalExtra4.userId))) {
                        arrayList.add(new C955890ayx(C001X.LIZIZ(rivalExtra4), new RivalExtraInfo.Tag(), new TagV2(), new User(), rivalExtra4, rivalExtra4.nudgeInfo, this.LLLILZJ, z4, 128));
                    }
                }
            } else {
                Long[] lArr = new Long[1];
                JoinGroupMessageExtra.RivalExtra rivalExtra5 = popupStateChangeContent.joinUser;
                if (rivalExtra5 != null) {
                    j2 = rivalExtra5.userId;
                } else {
                    j2 = 0;
                }
                lArr[0] = Long.valueOf(j2);
                HashSet hashSetLIZJ = C093Y.LIZJ(lArr);
                HashSet hashSet2 = new HashSet();
                List<JoinGroupMessageExtra.RivalExtra> list3 = popupStateChangeContent.otherUsers;
                if (list3 != null) {
                    Iterator<JoinGroupMessageExtra.RivalExtra> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        hashSetLIZJ.add(Long.valueOf(it3.next().userId));
                    }
                }
                for (C955890ayx c955890ayx2 : (ArrayList) this.LLJJJJ) {
                    if (c955890ayx2 instanceof C955890ayx) {
                        if (this.LLLFFI != null) {
                            JoinGroupMessageExtra.RivalExtra rivalExtra6 = c955890ayx2.LJ;
                            if (rivalExtra6 != null) {
                                lValueOf = Long.valueOf(rivalExtra6.userId);
                            } else {
                                lValueOf = null;
                            }
                            if (C13LP.LJJJJ(lValueOf, hashSetLIZJ)) {
                                arrayList.add(c955890ayx2);
                                JoinGroupMessageExtra.RivalExtra rivalExtra7 = c955890ayx2.LJ;
                                if (rivalExtra7 != null) {
                                    j3 = rivalExtra7.userId;
                                } else {
                                    j3 = 0;
                                }
                                hashSet2.add(Long.valueOf(j3));
                            }
                        } else if (hashSetLIZJ.contains(Long.valueOf(c955890ayx2.LIZ.userId))) {
                            arrayList.add(c955890ayx2);
                            hashSet2.add(Long.valueOf(c955890ayx2.LIZ.userId));
                        }
                    }
                }
                for (JoinGroupMessageExtra.RivalExtra rivalExtra8 : popupStateChangeContent.otherUsers) {
                    if (!hashSet2.contains(Long.valueOf(rivalExtra8.userId))) {
                        arrayList.add(new C955890ayx(C001X.LIZIZ(rivalExtra8), new RivalExtraInfo.Tag(), new TagV2(), new User(), rivalExtra8, rivalExtra8.nudgeInfo, this.LLLILZJ, z4, 128));
                    }
                }
            }
            if (((ArrayList) this.LLJJJJ).size() > arrayList.size()) {
                z = true;
            } else {
                z = false;
            }
            if (((ArrayList) this.LLJJJJ).size() == arrayList.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            final int size2 = ((ArrayList) this.LLJJJJ).size();
            this.LLJJJJ = arrayList;
            if (this.LLJJJJJIL) {
                C410901il c410901il = new C410901il();
                if (((ArrayList) this.LLJJJJ).size() > 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c410901il.add(new C957090b0t(C497740JfY.LJIJI(2131851654), z3));
                Iterator it4 = ((ArrayList) this.LLJJJJ).iterator();
                while (it4.hasNext()) {
                    c410901il.add(it4.next());
                }
                this.LLLF.LLLII(c410901il);
            } else {
                this.LLLF.LLLII(arrayList);
            }
            ValueAnimator valueAnimator = this.LLJLIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.LLJLILLLLZIIL;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            AnimatorSet animatorSet = this.LLJLL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            int iLLLIIIIL = this.LLLF.LLLIIIIL();
            C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", "mAdapter.originalItemSize = " + iLLLIIIIL + ", is headerShow = " + this.LLJJJJJIL + ", three to two = " + z + ", sizeNotChanged:" + z2);
            if (iLLLIIIIL <= 1) {
                C786410Ut5.LJLLLLLL(0, (View) this.LLIZ.getValue());
                C786410Ut5.LLLILZJ(cS(), 8);
            } else if (this.LLJJJJJIL ? iLLLIIIIL != 3 : iLLLIIIIL != 2) {
                if (z2) {
                    this.LLLF.notifyDataSetChanged();
                    C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", "sizeNotChanged, return");
                    return;
                }
                C786410Ut5.y3(cS().getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0TLH
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        C786410Ut5.D3(this.LL.cS().getViewTreeObserver(), this);
                        int size3 = arrayList.size() - 1;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("popupChangeListItems.size = ");
                        sbLIZ2.append(arrayList.size());
                        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ2));
                        if (size2 == 1) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("animateFrom1Member");
                            sbLIZ3.append(", onPreDraw, mCoHostUsersRecyclerView.height.toFloat() = ");
                            sbLIZ3.append(this.LL.cS().getHeight());
                            sbLIZ3.append(", targetMemberSize=");
                            sbLIZ3.append(size3);
                            C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ3));
                            this.LL.LLLF.notifyDataSetChanged();
                            float height = this.LL.cS().getHeight() + (((int) C497740JfY.LIZIZ(78.0f)) * size3);
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = this.LL;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(multiCoHostBeInvitedFragment.cS().getHeight(), height);
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = this.LL;
                            valueAnimatorOfFloat.setDuration(200L);
                            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment2, 15));
                            valueAnimatorOfFloat.addListener(new ALAdapterS1S0101001_12(height, size3, multiCoHostBeInvitedFragment2, 2));
                            valueAnimatorOfFloat.start();
                            multiCoHostBeInvitedFragment.LLJLIL = valueAnimatorOfFloat;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("animateFrom1Member");
                            sbLIZ4.append(", childView animator, mCoHostUsersRecyclerView.children.last().alpha = ");
                            View view = (View) C09RB.LJIJ(new C09RD(this.LL.cS()));
                            sbLIZ4.append(view != null ? Float.valueOf(view.getAlpha()) : null);
                            sbLIZ4.append(", ");
                            C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ4));
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment3 = this.LL;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment4 = this.LL;
                            valueAnimatorOfFloat2.setDuration(200L);
                            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                            AnimatorSet animatorSet2 = multiCoHostBeInvitedFragment4.LLJLL;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                            }
                            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment4, 16));
                            valueAnimatorOfFloat2.addListener(new ALAdapterS9S0100000_12(multiCoHostBeInvitedFragment4, 9));
                            valueAnimatorOfFloat2.setStartDelay(100L);
                            valueAnimatorOfFloat2.start();
                            multiCoHostBeInvitedFragment3.LLJLILLLLZIIL = valueAnimatorOfFloat2;
                            return true;
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("animateFrom0Member, mCoHostUsersRecyclerView onPreDraw, mCoHostUsersRecyclerView.height = ");
                        sbLIZ5.append(this.LL.cS().getHeight());
                        sbLIZ5.append(" mCoHostUsersRecyclerView.visibility = ");
                        sbLIZ5.append(this.LL.cS().getVisibility());
                        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ5));
                        C786410Ut5.LLLILZJ(this.LL.cS(), 0);
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment5 = this.LL;
                        if (multiCoHostBeInvitedFragment5.LLJJJJJIL) {
                            C786410Ut5.D3(multiCoHostBeInvitedFragment5.cS().getViewTreeObserver(), this);
                            float height2 = this.LL.cS().getHeight() + ((int) C497740JfY.LIZIZ(size3 * 86.0f));
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment6 = this.LL;
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(multiCoHostBeInvitedFragment6.cS().getHeight(), height2);
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment7 = this.LL;
                            valueAnimatorOfFloat3.setDuration(200L);
                            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment7, 11));
                            valueAnimatorOfFloat3.addListener(new ALAdapterS1S0101001_12(height2, size3, multiCoHostBeInvitedFragment7, 0));
                            valueAnimatorOfFloat3.start();
                            multiCoHostBeInvitedFragment6.LLJLIL = valueAnimatorOfFloat3;
                            return true;
                        }
                        float fLIZIZ = (int) C497740JfY.LIZIZ(size3 * 86.0f);
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.LL.cS().getHeight(), fLIZIZ);
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment8 = this.LL;
                        valueAnimatorOfFloat4.setDuration(200L);
                        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment8, 13));
                        valueAnimatorOfFloat4.addListener(new ALAdapterS1S0101001_12(fLIZIZ, size3, multiCoHostBeInvitedFragment8, 1));
                        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, (int) C497740JfY.LIZIZ(8.0f));
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment9 = this.LL;
                        valueAnimatorOfFloat5.setDuration(200L);
                        valueAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat5.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment9, 14));
                        valueAnimatorOfFloat5.addListener(new ALAdapterS9S0100000_12(multiCoHostBeInvitedFragment9, 8));
                        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment10 = this.LL;
                        valueAnimatorOfFloat6.setDuration(200L);
                        valueAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat6.setStartDelay(100L);
                        valueAnimatorOfFloat6.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment10, 12));
                        valueAnimatorOfFloat6.addListener(new ALAdapterS9S0100000_12(multiCoHostBeInvitedFragment10, 7));
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment11 = this.LL;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.playTogether(valueAnimatorOfFloat6, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
                        animatorSet3.start();
                        multiCoHostBeInvitedFragment11.LLJLL = animatorSet3;
                        return true;
                    }
                });
            } else {
                if (cS().getVisibility() == 8) {
                    C500260Jjc.LJLJL(0, cS());
                    C500260Jjc.LJJLJ(0, cS());
                }
                C786410Ut5.y3(cS().getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0TLI
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        C786410Ut5.D3(this.LL.cS().getViewTreeObserver(), this);
                        this.LL.LLLF.notifyDataSetChanged();
                        if (z) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("animate2To1Member");
                            sbLIZ2.append(", mCoHostUsersRecyclerView animator height == ");
                            sbLIZ2.append(this.LL.cS().getHeight());
                            C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ2));
                            float height = this.LL.cS().getHeight() - ((int) C497740JfY.LIZIZ(78.0f));
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = this.LL;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(multiCoHostBeInvitedFragment.cS().getHeight(), height);
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = this.LL;
                            valueAnimatorOfFloat.setDuration(200L);
                            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment2, 10));
                            valueAnimatorOfFloat.addListener(new ALAdapterS0S0100001_12(height, multiCoHostBeInvitedFragment2, 2));
                            valueAnimatorOfFloat.start();
                            multiCoHostBeInvitedFragment.LLJLIL = valueAnimatorOfFloat;
                            return true;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("animate0To1Member, mCoHostUsersRecyclerView onPreDraw, mCoHostUsersRecyclerView.height = ");
                        sbLIZ3.append(this.LL.cS().getHeight());
                        sbLIZ3.append(" mCoHostUsersRecyclerView.visibility = ");
                        sbLIZ3.append(this.LL.cS().getVisibility());
                        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ3));
                        C786410Ut5.LLLILZJ(this.LL.cS(), 0);
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment3 = this.LL;
                        if (multiCoHostBeInvitedFragment3.LLJJJJJIL) {
                            C786410Ut5.D3(multiCoHostBeInvitedFragment3.cS().getViewTreeObserver(), this);
                            float height2 = this.LL.cS().getHeight() + ((int) C497740JfY.LIZIZ(1 * 86.0f));
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment4 = this.LL;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(multiCoHostBeInvitedFragment4.cS().getHeight(), height2);
                            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment5 = this.LL;
                            valueAnimatorOfFloat2.setDuration(200L);
                            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment5, 6));
                            valueAnimatorOfFloat2.addListener(new ALAdapterS0S0100001_12(height2, multiCoHostBeInvitedFragment5, 0));
                            valueAnimatorOfFloat2.start();
                            multiCoHostBeInvitedFragment4.LLJLIL = valueAnimatorOfFloat2;
                            return true;
                        }
                        float fLIZIZ = (int) C497740JfY.LIZIZ(1 * 86.0f);
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.LL.cS().getHeight(), fLIZIZ);
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment6 = this.LL;
                        valueAnimatorOfFloat3.setDuration(200L);
                        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment6, 8));
                        valueAnimatorOfFloat3.addListener(new ALAdapterS0S0100001_12(fLIZIZ, multiCoHostBeInvitedFragment6, 1));
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, (int) C497740JfY.LIZIZ(8.0f));
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment7 = this.LL;
                        valueAnimatorOfFloat4.setDuration(200L);
                        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment7, 9));
                        valueAnimatorOfFloat4.addListener(new ALAdapterS9S0100000_12(multiCoHostBeInvitedFragment7, 6));
                        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment8 = this.LL;
                        valueAnimatorOfFloat5.setDuration(200L);
                        valueAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat5.setStartDelay(100L);
                        valueAnimatorOfFloat5.addUpdateListener(new AUListenerS262S0100000_12(multiCoHostBeInvitedFragment8, 7));
                        valueAnimatorOfFloat5.addListener(new ALAdapterS9S0100000_12(multiCoHostBeInvitedFragment8, 5));
                        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment9 = this.LL;
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(valueAnimatorOfFloat5, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                        animatorSet2.start();
                        multiCoHostBeInvitedFragment9.LLJLL = animatorSet2;
                        return true;
                    }
                });
            }
            BS("ChangeContent", popupStateChangeContent.rivalGuestsMap);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final void SR(long j) {
        if (!this.mStatusViewValid) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS69S0100100_15(this, j, 5));
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final void UR(LinkBusinessMessage linkBusinessMessage) {
        C473410IhP.LIZJ(new ARunnableS84S0200000_15(this, linkBusinessMessage, 21), 500L);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView
    public final void VR(C954930axP c954930axP) {
        long j;
        if (!this.mStatusViewValid) {
            return;
        }
        C915980Zwa.LJII().jn1();
        List<C954460awe> list = c954930axP.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C954460awe> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("list item size = ");
        sbLIZ.append(((ArrayList) this.LLJJJJ).size());
        sbLIZ.append(" linkedUserList = ");
        sbLIZ.append(arrayList);
        sbLIZ.append(", message = ");
        sbLIZ.append(c954930axP.LIZ);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C954640aww c954640aww = this.LLLFFI;
        if (c954640aww != null) {
            j = c954640aww.LIZIZ;
        } else {
            j = 0;
        }
        if (arrayList.contains(Long.valueOf(j))) {
            dismiss();
            int i = this.LLLI;
            if (i != 1) {
                if (i == 2) {
                    WR(6);
                    return;
                }
                return;
            }
            aS(6);
            return;
        }
        if (((ArrayList) this.LLJJJJ).size() + c954930axP.LIZ.size() <= C950220apo.LJIIJJI()) {
            return;
        }
        dismiss();
        int i2 = this.LLLI;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            WR(26);
            return;
        }
        aS(26);
    }

    public final void WR(int i) {
        boolean z;
        boolean zIsChecked;
        MHJoinBizContent mHJoinBizContent;
        Integer num;
        if (!this.mStatusViewValid || this.LLLIL) {
            return;
        }
        int iIntValue = 0;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        try {
            sS(z);
            HashMap map = new HashMap();
            map.put("show_timestamp", Long.valueOf(this.LLLIIII));
            if (!this.mStatusViewValid) {
                zIsChecked = false;
            } else {
                zIsChecked = iS().isChecked();
            }
            map.put("is_turn_off", Boolean.valueOf(zIsChecked));
            C954640aww c954640aww = this.LLLFFI;
            if (c954640aww != null && (mHJoinBizContent = c954640aww.LJI) != null && (num = mHJoinBizContent.LIZLLL) != null) {
                iIntValue = num.intValue();
            }
            map.put("cohost_layout_mode", Integer.valueOf(iIntValue));
            C954640aww c954640aww2 = this.LLLFFI;
            if (c954640aww2 != null) {
                AbstractC950580aqO abstractC950580aqO = (AbstractC950580aqO) this.LLILLL;
                if (abstractC950580aqO != null) {
                    abstractC950580aqO.LJIILIIL(c954640aww2, i, map);
                }
            } else {
                AbstractC950580aqO abstractC950580aqO2 = (AbstractC950580aqO) this.LLILLL;
                if (abstractC950580aqO2 != null) {
                    LinkerInviteContent linkerInviteContent = this.LLLFF;
                    if (linkerInviteContent == null) {
                        linkerInviteContent = null;
                    }
                    abstractC950580aqO2.LJIIL(linkerInviteContent, i, map);
                }
            }
            dismiss();
            C915980Zwa.LJII().LJLLJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dismiss();
            C915980Zwa.LJII().LJLLJ();
            C1304660k3U.LIZ.LIZIZ(904, "cohost doPermit failed", th, null);
        }
        this.LLLIL = true;
    }

    public final void aS(int i) {
        boolean z;
        HashMap map;
        boolean zIsChecked;
        MHJoinBizContent mHJoinBizContent;
        Integer num;
        boolean zIsChecked2;
        MHJoinBizContent mHJoinBizContent2;
        Integer num2;
        PunishEventInfo punishEventInfo;
        if (!this.mStatusViewValid || this.LLLIL) {
            return;
        }
        int iIntValue = 0;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        try {
            sS(z);
            if (this.LLLIIIL && i == 5) {
                this.LLLIIIIL = "timeout";
                C954640aww c954640aww = this.LLLFFI;
                if (c954640aww != null) {
                    MHJoinBizContent mHJoinBizContent3 = c954640aww.LJI;
                    if (mHJoinBizContent3 != null) {
                        punishEventInfo = mHJoinBizContent3.punishInfo;
                    } else {
                        punishEventInfo = null;
                    }
                    C925600aC6.LJII("timeout", punishEventInfo);
                } else {
                    LinkerInviteContent linkerInviteContent = this.LLLFF;
                    if (linkerInviteContent == null) {
                        linkerInviteContent = null;
                    }
                    C925600aC6.LJII("timeout", linkerInviteContent.punishEventInfo);
                }
            }
            C956270azZ c956270azZLIZ = C954890axL.LIZ(this.LLLFFI);
            boolean z2 = c956270azZLIZ.LIZ;
            double d = c956270azZLIZ.LIZIZ;
            String str = c956270azZLIZ.LIZJ;
            if (CohostInvitationReorderSetting.isEnable()) {
                map = new HashMap();
                map.put("show_timestamp", Long.valueOf(this.LLLIIII));
                if (!this.mStatusViewValid) {
                    zIsChecked2 = false;
                } else {
                    zIsChecked2 = iS().isChecked();
                }
                map.put("is_turn_off", Boolean.valueOf(zIsChecked2));
                C954640aww c954640aww2 = this.LLLFFI;
                if (c954640aww2 != null && (mHJoinBizContent2 = c954640aww2.LJI) != null && (num2 = mHJoinBizContent2.LIZLLL) != null) {
                    iIntValue = num2.intValue();
                }
                map.put("cohost_layout_mode", Integer.valueOf(iIntValue));
                map.put("isFromQueueReorder", Boolean.valueOf(z2));
                map.put("strategyScore", Double.valueOf(d));
                map.put("strategyName", str);
            } else {
                map = new HashMap();
                map.put("show_timestamp", Long.valueOf(this.LLLIIII));
                if (!this.mStatusViewValid) {
                    zIsChecked = false;
                } else {
                    zIsChecked = iS().isChecked();
                }
                map.put("is_turn_off", Boolean.valueOf(zIsChecked));
                C954640aww c954640aww3 = this.LLLFFI;
                if (c954640aww3 != null && (mHJoinBizContent = c954640aww3.LJI) != null && (num = mHJoinBizContent.LIZLLL) != null) {
                    iIntValue = num.intValue();
                }
                map.put("cohost_layout_mode", Integer.valueOf(iIntValue));
            }
            C954640aww c954640aww4 = this.LLLFFI;
            if (c954640aww4 != null) {
                AbstractC950580aqO abstractC950580aqO = (AbstractC950580aqO) this.LLILLL;
                if (abstractC950580aqO != null) {
                    abstractC950580aqO.LJIILL(c954640aww4, i, map);
                }
            } else {
                AbstractC950580aqO abstractC950580aqO2 = (AbstractC950580aqO) this.LLILLL;
                if (abstractC950580aqO2 != null) {
                    LinkerInviteContent linkerInviteContent2 = this.LLLFF;
                    if (linkerInviteContent2 == null) {
                        linkerInviteContent2 = null;
                    }
                    abstractC950580aqO2.LJIILJJIL(linkerInviteContent2, i, map);
                }
            }
            dismiss();
            C915980Zwa.LJII().LJLLJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dismiss();
            C915980Zwa.LJII().LJLLJ();
            C1304660k3U.LIZ.LIZIZ(903, "cohost doReply failed", th, null);
        }
        this.LLLIL = true;
    }

    public final void nS(CharSequence charSequence) {
        boolean z;
        C410901il c410901il = new C410901il();
        int size = this.LLJJJJ.size();
        if (size > 1) {
            z = true;
        } else {
            z = false;
        }
        c410901il.add(new C957090b0t(charSequence, z));
        if (size > 1) {
            Iterator<C955890ayx> it2 = this.LLJJJJ.iterator();
            while (it2.hasNext()) {
                c410901il.add(it2.next());
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleNRViewNewUI, size = ");
        sbLIZ.append(size);
        sbLIZ.append(", text = ");
        sbLIZ.append((Object) charSequence);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJJIL = true;
        this.LLLF.LLLII(c410901il);
        this.LLLF.notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oS(X.C955890ayx r12) {
        /*
            Method dump skipped, instruction units count: 1219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment.oS(X.0ayx):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec A[PHI: r0 r10
      0x00ec: PHI (r0v27 long) = (r0v26 long), (r0v29 long), (r0v29 long) binds: [B:58:0x00e9, B:37:0x009c, B:39:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r10v1 com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag) = 
      (r10v0 com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag)
      (r10v3 com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag)
      (r10v3 com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag)
     binds: [B:58:0x00e9, B:37:0x009c, B:39:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0ayA] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0ayA] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sS(boolean r30) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment.sS(boolean):void");
    }

    public final void uS(int i) {
        MHMessageInfo mHMessageInfo;
        MHMessageInfo mHMessageInfo2;
        int i2 = this.LLLI;
        long j = 0;
        AbstractC1136060ffY abstractC1136060ffY = null;
        if (i2 != 1) {
            if (i2 == 2) {
                if (this.LLLFFI != null) {
                    C955440ayE c955440ayE = new C955440ayE();
                    C954640aww c954640aww = this.LLLFFI;
                    if (c954640aww != null) {
                        j = c954640aww.LIZIZ;
                        MHMessageInfo mHMessageInfo3 = c954640aww.LJII;
                        if (mHMessageInfo3 != null) {
                            abstractC1136060ffY = mHMessageInfo3.baseLiveMessage;
                        }
                    }
                    c955440ayE.LJJJ(j, i, abstractC1136060ffY);
                    return;
                }
                C955440ayE c955440ayE2 = new C955440ayE();
                LinkerInviteContent linkerInviteContent = this.LLLFF;
                if (linkerInviteContent == null) {
                    linkerInviteContent = null;
                }
                long j2 = linkerInviteContent.fromUserId;
                C954640aww c954640aww2 = this.LLLFFI;
                if (c954640aww2 != null && (mHMessageInfo2 = c954640aww2.LJII) != null) {
                    abstractC1136060ffY = mHMessageInfo2.baseLiveMessage;
                }
                c955440ayE2.LJJJ(j2, i, abstractC1136060ffY);
                return;
            }
            return;
        }
        if (this.LLLFFI != null) {
            C955440ayE c955440ayE3 = new C955440ayE();
            C954640aww c954640aww3 = this.LLLFFI;
            if (c954640aww3 != null) {
                j = c954640aww3.LIZIZ;
                MHMessageInfo mHMessageInfo4 = c954640aww3.LJII;
                if (mHMessageInfo4 != null) {
                    abstractC1136060ffY = mHMessageInfo4.baseLiveMessage;
                }
            }
            c955440ayE3.LJJJIL(j, i, abstractC1136060ffY);
            return;
        }
        C955440ayE c955440ayE4 = new C955440ayE();
        LinkerInviteContent linkerInviteContent2 = this.LLLFF;
        if (linkerInviteContent2 == null) {
            linkerInviteContent2 = null;
        }
        long j3 = linkerInviteContent2.fromUserId;
        C954640aww c954640aww4 = this.LLLFFI;
        if (c954640aww4 != null && (mHMessageInfo = c954640aww4.LJII) != null) {
            abstractC1136060ffY = mHMessageInfo.baseLiveMessage;
        }
        c955440ayE4.LJJJIL(j3, i, abstractC1136060ffY);
    }

    public final void yS(long j) {
        ((C16FS) this.LLJZIJLIL.getValue()).setText(C341701Uh.LIZ(getString(2131841117), Integer.valueOf((int) j)));
        if (j == 0) {
            int i = this.LLLI;
            if (i != 1) {
                if (i == 2) {
                    WR(5);
                    return;
                }
                return;
            }
            aS(5);
        }
    }

    public static void zS(ConstraintLayout constraintLayout, C955870ayv c955870ayv) {
        if (constraintLayout == null) {
            return;
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.ifr);
        if (textView != null) {
            textView.setText(c955870ayv.LIZIZ);
        }
        View viewFindViewById = constraintLayout.findViewById(R.id.biq);
        if (viewFindViewById != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c955870ayv.LIZJ);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            int width = viewFindViewById.getWidth();
            int height = viewFindViewById.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            c1324610kZfLJIIIZ.LJJI(viewFindViewById);
        }
    }

    public final void BS(String str, Map map) {
        List<JoinGroupMessageExtra.RivalGuestExtra> list;
        ImageModel avatarThumb;
        User owner;
        User owner2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestList, debugSource=");
        sbLIZ.append(str);
        sbLIZ.append(", itemList.size=");
        sbLIZ.append(((ArrayList) this.LLJJJJ).size());
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).clear();
        Long lValueOf = null;
        avatarThumb = null;
        ImageModel avatarThumb2 = null;
        if (CohostWithGuestPhase2UiDebugSetting.INSTANCE.isEnabled()) {
            boolean zNextBoolean = AbstractC19994813Le.Default.nextBoolean();
            List<C955870ayv> list2 = this.LLJJLIIIJLLLLLLLZ;
            Room roomLIZJ = C950220apo.LIZJ();
            if (roomLIZJ != null && (owner2 = roomLIZJ.getOwner()) != null) {
                avatarThumb = owner2.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            ((ArrayList) list2).add(new C955870ayv(1L, "Test Guest 1", avatarThumb));
            if (zNextBoolean) {
                List<C955870ayv> list3 = this.LLJJLIIIJLLLLLLLZ;
                Room roomLIZJ2 = C950220apo.LIZJ();
                if (roomLIZJ2 != null && (owner = roomLIZJ2.getOwner()) != null) {
                    avatarThumb2 = owner.getAvatarThumb();
                }
                ((ArrayList) list3).add(new C955870ayv(2L, "Test Guest 2", avatarThumb2));
            }
            ES();
            return;
        }
        if (!C948770anT.LIZLLL()) {
            C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", "shouldShowGuestList, ignored due to ab");
            return;
        }
        if (((ArrayList) this.LLJJJJ).size() > 1) {
            return;
        }
        if (map != null) {
            C954640aww c954640aww = this.LLLFFI;
            if (c954640aww != null) {
                lValueOf = Long.valueOf(c954640aww.LIZJ);
            }
            JoinGroupMessageExtra.RivalGuestExtras rivalGuestExtras = (JoinGroupMessageExtra.RivalGuestExtras) map.get(lValueOf);
            if (rivalGuestExtras != null && (list = rivalGuestExtras.rivalGuests) != null) {
                for (JoinGroupMessageExtra.RivalGuestExtra rivalGuestExtra : list) {
                    ((ArrayList) this.LLJJLIIIJLLLLLLLZ).add(new C955870ayv(rivalGuestExtra.userId, rivalGuestExtra.nickname, rivalGuestExtra.avatarThumb));
                }
            }
        }
        ES();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C943660afE.LIZ("MultiCoHostPrivateAccountDialog");
        if (C943660afE.LIZLLL("LinkDialog")) {
            View view2 = this.LLILZ;
            if (view2 == null) {
                view2 = null;
            }
            HandlerHook.viewPostDelay(view2, new ARunnableS115S0100000_15(this, 64), 300L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0874  */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.0ayA] */
    /* JADX WARN: Type inference failed for: r19v3, types: [X.0ayA] */
    /* JADX WARN: Type inference failed for: r1v126 */
    /* JADX WARN: Type inference failed for: r1v127, types: [X.19GS] */
    /* JADX WARN: Type inference failed for: r1v219 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v57, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v87, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v88, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r36, android.view.ViewGroup r37, android.os.Bundle r38) {
        /*
            Method dump skipped, instruction units count: 2606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
