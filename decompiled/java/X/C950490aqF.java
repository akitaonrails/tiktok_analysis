package X;

import Y.AfS7S0010000_15;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostBeInvitedContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownRemoveEvent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostInvitationReorderSetting;
import com.bytedance.android.livesdk.model.message.LinkBusinessMessage;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0aqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950490aqF extends AbstractC950580aqO implements InterfaceC944700agu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public Long LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public final C945230ahl LLILZLL;
    public final C304201Fw LLIZ;
    public final AwS629S0100000_15 LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C950490aqF.class, "linkMessageCenter", "getLinkMessageCenter()Lcom/bytedance/android/live/liveinteract/platform/core/message/LinkMessageCenter;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void LJIIIIZZ() {
        C304201Fw c304201Fw = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c304201Fw.LIZ();
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(this);
        }
        C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, this.LLIZLLLIL);
    }

    @Override // X.AbstractC950580aqO
    public final void LJJ() {
        this.LLILZIL = "new_user";
    }

    @Override // X.AbstractC950580aqO
    public final Long LJIIIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC950580aqO
    public final boolean LJIIJ(int i) {
        if (C915980Zwa.LJII().BL2() && C915980Zwa.LJII().LLILZLL(true).size() == 2 && i == 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC950580aqO
    public final void LJIIZILJ(long j) {
        this.LLILLJJLI = Long.valueOf(j);
    }

    @Override // X.AbstractC950580aqO
    public final void LJIJI(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.AbstractC950580aqO
    public final void LJIJJ(boolean z) {
        C11NZ<C470590Icr<Void>> c11nzLIZIZ = C960020b5c.LIZIZ(8, z);
        if (c11nzLIZIZ == null) {
            return;
        }
        ((C0J1N) c11nzLIZIZ.LIZJ(LJII())).LIZ(new AfS7S0010000_15(z, 0), new C09JN() { // from class: X.0aqI
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostBeInvitedPresenter@c4f7.updateBlockThisMultiHostApply$2");
                C1C7U.LIZIZ("MultiCoHostBeInvitedPresenter@c4f7.updateBlockThisMultiHostApply$2");
            }
        });
    }

    @Override // X.AbstractC950580aqO
    public final void LJIJJLI(boolean z) {
        C11NZ<C470590Icr<Void>> c11nzLIZIZ = C960020b5c.LIZIZ(7, z);
        if (c11nzLIZIZ == null) {
            return;
        }
        ((C0J1N) c11nzLIZIZ.LIZJ(LJII())).LIZ(new AfS7S0010000_15(z, 1), new C09JN() { // from class: X.0aqJ
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostBeInvitedPresenter@c4f7.updateBlockThisMultiHostInvites$2");
                C1C7U.LIZIZ("MultiCoHostBeInvitedPresenter@c4f7.updateBlockThisMultiHostInvites$2");
            }
        });
    }

    @Override // X.AbstractC950580aqO
    public final void LJJI(boolean z) {
        String str;
        C0J1N c0j1n;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMuteForCohostInvitationDuringMG, isChecked=");
        sbLIZ.append(z);
        sbLIZ.append(", forThisLiveOnly=");
        sbLIZ.append(true);
        C20441214yg.LJIIIZ("MultiCoHostBeInvitedPresenter", C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = !z;
        C11JN c11jnLIZ = this.LLILZLL.LIZ(C943840afW.LIZLLL, z2);
        if (c11jnLIZ != null && (c0j1n = (C0J1N) c11jnLIZ.LIZJ(LJII())) != null) {
            c0j1n.subscribe();
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("anchor_id", String.valueOf(C950220apo.LJ()));
        if (z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        pairArr[1] = new Pair("is_select", str);
        C955400ayA.LLIILII("livesdk_disable_chmg_button_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC944700agu
    public final void LLZLL(LinkBusinessMessage linkBusinessMessage) {
        C20441214yg.LJIIIZ("MultiCoHostBeInvitedPresenter", "onReceiveLinkBusinessMessage");
        MultiCoHostBeInvitedContract$AbsView multiCoHostBeInvitedContract$AbsView = (MultiCoHostBeInvitedContract$AbsView) this.LL;
        if (multiCoHostBeInvitedContract$AbsView != null) {
            multiCoHostBeInvitedContract$AbsView.UR(linkBusinessMessage);
        }
    }

    public C950490aqF(MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment, C943860afY c943860afY) {
        super(multiCoHostBeInvitedFragment);
        this.LLILZ = 1;
        this.LLILZIL = "";
        this.LLILZLL = new C945230ahl();
        C304201Fw c304201Fw = new C304201Fw("LINK_MESSAGE_CENTER");
        this.LLIZ = c304201Fw;
        AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(this, 10);
        this.LLIZLLLIL = awS629S0100000_15;
        DataChannel dataChannel = c943860afY.LIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(multiCoHostBeInvitedFragment, MultiCoHostCountDownEvent.class, new AwS381S0200000_15(this, multiCoHostBeInvitedFragment, 22));
        }
        DataChannel dataChannel2 = c943860afY.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(multiCoHostBeInvitedFragment, MultiCoHostCountDownRemoveEvent.class, new AwS594S0100000_15(multiCoHostBeInvitedFragment, 77));
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c304201Fw.LIZ();
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZ(this);
        }
        C915980Zwa.LJII().LLLJIL(C954930axP.class, awS629S0100000_15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0aqA] */
    @Override // X.AbstractC950580aqO
    public final void LJIIL(LinkerInviteContent linkerInviteContent, int i, Map<String, ? extends Object> map) {
        long channelId = C915980Zwa.LJII().getChannelId();
        LJIIJJI(linkerInviteContent, null, i, true, false, this.LLILLL);
        if (channelId <= 0) {
            return;
        }
        long j = linkerInviteContent.fromRoomId;
        long j2 = linkerInviteContent.fromUserId;
        String str = linkerInviteContent.fromLinkmicIdStr;
        if (str == null) {
            str = "";
        }
        C915980Zwa.LJII().LLII(new C920410a3j(j, j2, null, str, i, null, 100), new InterfaceC920680a4A<PermitResult>() { // from class: X.0aqA
            @Override // X.InterfaceC920680a4A
            public final void onSuccess(PermitResult permitResult) {
                String str2;
                C943870afZ enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom();
                if (enterFrom == null || (str2 = enterFrom.LIZ) == null) {
                    str2 = "";
                }
                C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ(str2));
            }

            @Override // X.InterfaceC920680a4A
            public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                if (th != null) {
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                    C1304660k3U.LIZ.LIZIZ(703, "permit multi_cohost application failed", th, null);
                }
            }
        }, map);
    }

    @Override // X.AbstractC950580aqO
    public final void LJIILIIL(C954640aww c954640aww, final int i, Map<String, ? extends Object> map) {
        long j;
        long j2;
        long j3;
        MHJoinReplyBizContent mHJoinReplyBizContent;
        String str;
        Integer numValueOf;
        MHJoinBizContent mHJoinBizContent;
        JoinGroupMessageExtra joinGroupMessageExtra;
        LJIIJJI(new LinkerInviteContent(), c954640aww, i, true, false, this.LLILLL);
        long j4 = 0;
        if (i == 1) {
            VirtualWaitingUser virtualWaitingUser = null;
            if (c954640aww != null && (mHJoinBizContent = c954640aww.LJI) != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null) {
                numValueOf = Integer.valueOf((int) joinGroupMessageExtra.sourceType);
            } else {
                numValueOf = null;
            }
            boolean z = !C957990b2L.LIZLLL(numValueOf);
            Iterator<VirtualWaitingUser> it2 = C915980Zwa.LJII().LJJIJIL().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                VirtualWaitingUser next = it2.next();
                long j5 = next.sendUserId;
                if (j5 != 0 && j5 != C950220apo.LJFF()) {
                    virtualWaitingUser = next;
                    break;
                }
            }
            VirtualWaitingUser virtualWaitingUser2 = virtualWaitingUser;
            if ((C915980Zwa.LJIIIZ().k0() == EnumC958900b3o.WAITED && !z) || (virtualWaitingUser2 != null && C950540aqK.LIZ(virtualWaitingUser2) > 0)) {
                C915980Zwa.LJI().LIZ().LJJIIZI(true);
            }
        }
        if (c954640aww != null) {
            j = c954640aww.LIZJ;
            j2 = c954640aww.LIZIZ;
            j3 = c954640aww.LIZLLL;
            j4 = c954640aww.LJ;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        if (i == 1) {
            if (c954640aww != null) {
                C950570aqN.LIZIZ(c954640aww, "MultiCoHostBeInvitedPresenter", "Quick Recommend invitee-side / T071a / manual accept");
                mHJoinReplyBizContent = C950570aqN.LIZ(c954640aww);
            }
            mHJoinReplyBizContent = new MHJoinReplyBizContent(0, "", 0);
        } else if (c954640aww != null) {
            mHJoinReplyBizContent = C950570aqN.LIZ(c954640aww);
        } else {
            mHJoinReplyBizContent = new MHJoinReplyBizContent(0, "", 0);
        }
        if (c954640aww == null || (str = c954640aww.LJFF) == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("permitNewArc");
        C915980Zwa.LJII().LJLIL(new C945210ahj(1, j, j2, j3, j4, str, i, map, mHJoinReplyBizContent, arrayList, 256), new InterfaceC950010apT<C920610a43>() { // from class: X.0aqC
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                if (i == 1) {
                    C961300b7g.LIZ.getClass();
                    C961300b7g.LJ();
                }
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                if (th != null) {
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                    C1304660k3U.LIZ.LIZIZ(703, "permit multi_cohost application failed", th, null);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0aqD] */
    @Override // X.AbstractC950580aqO
    public final void LJIILJJIL(LinkerInviteContent linkerInviteContent, int i, Map<String, ? extends Object> map) {
        long channelId = C915980Zwa.LJII().getChannelId();
        LJIIJJI(linkerInviteContent, null, i, false, false, this.LLILLL);
        if (channelId <= 0) {
            return;
        }
        if (i == 1) {
            C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.CO_HOST_START, null);
        }
        C915980Zwa.LJII().LJLIIL(new C950850aqp(linkerInviteContent.fromRoomId, linkerInviteContent.fromUserId, i, null, 0L, 56), new InterfaceC920680a4A<ReplyResult>() { // from class: X.0aqD
            @Override // X.InterfaceC920680a4A
            public final void onSuccess(ReplyResult replyResult) {
                String str;
                C943870afZ enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom();
                if (enterFrom == null || (str = enterFrom.LIZ) == null) {
                    str = "";
                }
                C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ(str));
            }

            @Override // X.InterfaceC920680a4A
            public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                if (th != null) {
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                    C1304660k3U.LIZ.LIZIZ(702, "reply multi_cohost invitation failed", th, null);
                }
            }
        }, map);
    }

    @Override // X.AbstractC950580aqO
    public final void LJIILL(C954640aww c954640aww, final int i, Map<String, ? extends Object> map) {
        long j;
        long j2;
        long j3;
        MHJoinReplyBizContent mHJoinReplyBizContent;
        Boolean bool;
        double dDoubleValue;
        String str;
        Double d;
        Integer numValueOf;
        MHJoinBizContent mHJoinBizContent;
        JoinGroupMessageExtra joinGroupMessageExtra;
        LJIIJJI(new LinkerInviteContent(), c954640aww, i, false, false, this.LLILLL);
        if (i == 1) {
            if (C915980Zwa.LJIIIZ().k0() == EnumC958900b3o.WAITED) {
                if (c954640aww != null && (mHJoinBizContent = c954640aww.LJI) != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null) {
                    numValueOf = Integer.valueOf((int) joinGroupMessageExtra.sourceType);
                } else {
                    numValueOf = null;
                }
                if (!C957990b2L.LIZLLL(numValueOf)) {
                    C915980Zwa.LJI().LIZ().LJJIIZI(true);
                }
            }
            C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.CO_HOST_START, null);
            if (CohostInvitationReorderSetting.isEnable()) {
                C955400ayA.LJJJI = false;
                Object obj = map.get("isFromQueueReorder");
                if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
                    Object obj2 = map.get("strategyScore");
                    if ((obj2 instanceof Double) && (d = (Double) obj2) != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    Object obj3 = map.get("strategyName");
                    if (!(obj3 instanceof String) || (str = (String) obj3) == null) {
                        str = "";
                    }
                    C955400ayA.LJJJI = true;
                    C955400ayA.LJJJIL = String.valueOf(dDoubleValue);
                    C955400ayA.LJJJJ = str;
                }
            }
        }
        long j4 = 0;
        if (c954640aww != null) {
            j = c954640aww.LIZJ;
            j2 = c954640aww.LIZIZ;
            j3 = c954640aww.LIZLLL;
            j4 = c954640aww.LJ;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        if (i == 1) {
            if (c954640aww != null) {
                C950570aqN.LIZIZ(c954640aww, "MultiCoHostBeInvitedPresenter", "Quick Recommend invitee-side / T071a / manual accept");
                mHJoinReplyBizContent = C950570aqN.LIZ(c954640aww);
            }
            mHJoinReplyBizContent = new MHJoinReplyBizContent(0, "", 0);
        } else if (c954640aww != null) {
            mHJoinReplyBizContent = C950570aqN.LIZ(c954640aww);
        } else {
            mHJoinReplyBizContent = new MHJoinReplyBizContent(0, "", 0);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("replyNewArc");
        C915980Zwa.LJII().LLILZIL(new C945210ahj(0, j, j2, j3, j4, (String) null, i, map, mHJoinReplyBizContent, arrayList, 288), new InterfaceC950010apT<C920610a43>() { // from class: X.0aqE
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                String str2;
                if (i == 1) {
                    C961300b7g.LIZ.getClass();
                    C961300b7g.LJ();
                }
                C943870afZ enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom();
                if (enterFrom == null || (str2 = enterFrom.LIZ) == null) {
                    str2 = "";
                }
                C943870afZ c943870afZ = new C943870afZ(str2);
                c943870afZ.LJFF = this.LLILZIL;
                C915980Zwa.LJI().LIZ().LJIIJ(c943870afZ);
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                if (th != null) {
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                    C1304660k3U.LIZ.LIZIZ(702, "reply multi_cohost invitation failed", th, null);
                }
            }
        }, C915260ZvQ.LIZ);
    }

    @Override // X.AbstractC950580aqO
    public final void LJIIJJI(LinkerInviteContent linkerInviteContent, C954640aww c954640aww, int i, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        EnumC950500aqG enumC950500aqG;
        List<InviterRivalExtra> list;
        ArrayList arrayList2;
        EnumC950500aqG enumC950500aqG2;
        JoinGroupMessageExtra joinGroupMessageExtra;
        List<JoinGroupMessageExtra.RivalExtra> list2;
        long channelId = C915980Zwa.LJII().getChannelId();
        if (c954640aww != null) {
            String strValueOf = String.valueOf(channelId);
            C955400ayA c955400ayA = C955400ayA.LIZ;
            long j = c954640aww.LIZIZ;
            MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
            if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null && (list2 = joinGroupMessageExtra.otherUsers) != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<JoinGroupMessageExtra.RivalExtra> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(it2.next().userId));
                }
            } else {
                arrayList2 = new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            if (j > 0) {
                arrayList3.add(Long.valueOf(j));
            }
            arrayList3.addAll(arrayList2);
            if (z2) {
                enumC950500aqG2 = EnumC950500aqG.INVITE_WITHDRAW;
            } else if (z) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 5) {
                            enumC950500aqG2 = EnumC950500aqG.UNKNOW;
                        } else {
                            enumC950500aqG2 = EnumC950500aqG.OVER_TIME;
                        }
                    } else {
                        enumC950500aqG2 = EnumC950500aqG.REJECT;
                    }
                } else {
                    enumC950500aqG2 = EnumC950500aqG.ACCEPT;
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        enumC950500aqG2 = EnumC950500aqG.UNKNOW;
                    } else {
                        enumC950500aqG2 = EnumC950500aqG.OVER_TIME;
                    }
                } else {
                    enumC950500aqG2 = EnumC950500aqG.REJECT;
                }
            } else {
                enumC950500aqG2 = EnumC950500aqG.ACCEPT;
            }
            C955400ayA c955400ayA2 = C955400ayA.LIZ;
            C955400ayA.LJLJJL(strValueOf, enumC950500aqG2.getValue(), z, arrayList3, z3, j);
            return;
        }
        String strValueOf2 = String.valueOf(channelId);
        C955400ayA c955400ayA3 = C955400ayA.LIZ;
        long j2 = linkerInviteContent.fromUserId;
        LinkerInviteMessageExtra linkerInviteMessageExtra = linkerInviteContent.linkerInviteMsgExtra;
        if (linkerInviteMessageExtra != null && (list = linkerInviteMessageExtra.otherRivalExtra) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InviterRivalExtra> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(Long.valueOf(it3.next().userId));
            }
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList4 = new ArrayList();
        if (j2 > 0) {
            arrayList4.add(Long.valueOf(j2));
        }
        arrayList4.addAll(arrayList);
        if (z2) {
            enumC950500aqG = EnumC950500aqG.INVITE_WITHDRAW;
        } else if (z) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        enumC950500aqG = EnumC950500aqG.UNKNOW;
                    } else {
                        enumC950500aqG = EnumC950500aqG.OVER_TIME;
                    }
                } else {
                    enumC950500aqG = EnumC950500aqG.REJECT;
                }
            } else {
                enumC950500aqG = EnumC950500aqG.ACCEPT;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    enumC950500aqG = EnumC950500aqG.UNKNOW;
                } else {
                    enumC950500aqG = EnumC950500aqG.OVER_TIME;
                }
            } else {
                enumC950500aqG = EnumC950500aqG.REJECT;
            }
        } else {
            enumC950500aqG = EnumC950500aqG.ACCEPT;
        }
        C955400ayA c955400ayA4 = C955400ayA.LIZ;
        C955400ayA.LJLJJL(strValueOf2, enumC950500aqG.getValue(), z, arrayList4, z3, j2);
    }
}
