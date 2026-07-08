package X;

import X.InterfaceC919320a1y;
import android.view.SurfaceView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGuestStateHandleFix;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC938410aWl<T extends InterfaceC919320a1y> extends AbstractC945390ai1<T> implements InterfaceC724530SbT {
    public static final int $stable = 8;
    public final LifecycleOwner lifecycleOwner;
    public final C01GW rtcMessageReader$delegate = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(68));
    public final C922120a6U linkMicEventListener = new InterfaceC964770bDH(this) { // from class: X.0a6U
        public final /* synthetic */ AbstractC938410aWl<T> LL;

        @Override // X.InterfaceC964770bDH
        public final void LIZ(long j, C1AZU c1azu) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJFF(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIJJI(String str, SurfaceView surfaceView) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIIZILJ(String str, SurfaceView surfaceView) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJIJJLI(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJ(Map<String, String> map) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJI(long j, C1AZU c1azu) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIFFI(int i, int i2, int i3) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIIZI(String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIJIIJIL(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIL(String str, boolean z) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJIZ(String str, long j) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJJ(String str, float f, float f2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJJL(int i, C965030bDh c965030bDh) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJJZI(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLL(C954780axA c954780axA) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJJZ(int i, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJ() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LJJLIIIJJIZ(String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIIIJLJLI() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLIL() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJLL(int i, int i2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJJZZI(C965210bDz c965210bDz) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
        }

        @Override // X.InterfaceC964770bDH
        public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
            return null;
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIILZL() {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLIL(List<LinkUser> list) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LLJI(String str, boolean z, boolean z2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        @InterfaceC1294060jmO
        public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
        }

        @Override // X.InterfaceC964770bDH
        public final void LLLLLZ(String str) {
        }

        {
            this.LL = this;
        }

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
        @Override // X.InterfaceC964770bDH
        public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            ArrayList<LinkLayerRTCMessageUser> arrayList;
            ArrayList<LinkLayerRTCMessageUser> arrayList2;
            if (!C917850Zzb.LIZIZ(interfaceC954180awC, str)) {
                Map<String, Object> map = C1338270kvh.LIZ;
                return;
            }
            this.LL.getRtcMessageReader().getClass();
            LinkLayerRTCMessage linkLayerRTCMessageLIZ = C920330a3b.LIZ(str2);
            if (linkLayerRTCMessageLIZ != null) {
                AbstractC938410aWl<T> abstractC938410aWl = this.LL;
                String str3 = linkLayerRTCMessageLIZ.method;
                int iHashCode = str3.hashCode();
                if (iHashCode != -1609774425) {
                    if (iHashCode != 965604647) {
                        if (iHashCode != 1540435074 || !str3.equals("linkMicSDKAudioMute") || C936430aTZ.LIZ()) {
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("received RTC Message [");
                        sbLIZ.append(linkLayerRTCMessageLIZ.method);
                        sbLIZ.append(']');
                        C2188811AlT.LIZIZ(sbLIZ);
                        Map<String, Object> map2 = C1338270kvh.LIZ;
                        LinkLayerRTCMessageParam linkLayerRTCMessageParam = linkLayerRTCMessageLIZ.param;
                        if (linkLayerRTCMessageParam != null && (arrayList2 = linkLayerRTCMessageParam.users) != null) {
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                            for (LinkLayerRTCMessageUser linkLayerRTCMessageUser : arrayList2) {
                                arrayList3.add(new UserState(null, linkLayerRTCMessageUser.linkMicId, null, 0L, 0, abstractC938410aWl.toMediaState(linkLayerRTCMessageUser.audioMute), 0, 0, 0, 0, 0L));
                            }
                            abstractC938410aWl.onUserMediaStateListChanged(new C922130a6V(arrayList3, 2, 4));
                            return;
                        }
                        return;
                    }
                    if (!str3.equals("linkMicSDKLayoutChange") || (C936430aTZ.LIZIZ() & 2) == 2) {
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("received RTC Message [");
                    sbLIZ2.append(linkLayerRTCMessageLIZ.method);
                    sbLIZ2.append(']');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Map<String, Object> map3 = C1338270kvh.LIZ;
                    LinkLayerRTCMessageParam linkLayerRTCMessageParam2 = linkLayerRTCMessageLIZ.param;
                    if (linkLayerRTCMessageParam2 != null) {
                        abstractC938410aWl.onLayoutChanged(linkLayerRTCMessageParam2.layoutId);
                        return;
                    }
                    return;
                }
                if (!str3.equals("linkMicSDKVideoMute") || C936430aTZ.LIZ()) {
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("received RTC Message [");
                sbLIZ3.append(linkLayerRTCMessageLIZ.method);
                sbLIZ3.append(']');
                C2188811AlT.LIZIZ(sbLIZ3);
                Map<String, Object> map4 = C1338270kvh.LIZ;
                LinkLayerRTCMessageParam linkLayerRTCMessageParam3 = linkLayerRTCMessageLIZ.param;
                if (linkLayerRTCMessageParam3 != null && (arrayList = linkLayerRTCMessageParam3.users) != null) {
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (LinkLayerRTCMessageUser linkLayerRTCMessageUser2 : arrayList) {
                        arrayList4.add(new UserState(null, linkLayerRTCMessageUser2.linkMicId, null, 0L, 0, 0, abstractC938410aWl.toMediaState(linkLayerRTCMessageUser2.videoMute), 0, 0, 0, 0L));
                    }
                    abstractC938410aWl.onUserMediaStateListChanged(new C922130a6V(arrayList4, 1, 4));
                }
            }
        }
    };

    private final boolean isMute(int i, boolean z) {
        return i != 0 ? i != 1 : z;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    public void onUserMediaStateListChanged(C922130a6V c922130a6V) {
    }

    public final int toMediaState(int i) {
        return i == 1 ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C920330a3b getRtcMessageReader() {
        return (C920330a3b) this.rtcMessageReader$delegate.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleOwner.getLifecycle();
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public void detachView() {
        super.detachView();
        C915980Zwa.LJIIIIZZ().a9(this.linkMicEventListener);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C749260TaG.class, C2097608Jq.LJ());
        }
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0a6U] */
    public AbstractC938410aWl(LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
    }

    @Override // X.AbstractC945390ai1
    public void attachView(T t) {
        super.attachView((InterfaceC919320a1y) t);
        Map<String, Object> map = C1338270kvh.LIZ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C749260TaG.class, C2097608Jq.LJ());
        }
        C915980Zwa.LJIIIIZZ().Fe(this.linkMicEventListener);
    }

    public final boolean isAnchor(String str) {
        Long lValueOf;
        LinkUser linkUserLJJLJLI;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long l = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (linkUserLJJLJLI = interfaceC954180awCLLJLL.LJJLJLI(str)) != null) {
            l = linkUserLJJLJLI.userId;
        }
        return Intrinsics.LJFF(lValueOf, l);
    }

    public final Pair<Boolean, Boolean> muteInfo(UserState userState) {
        if (isAnchor(userState)) {
            return new Pair<>(Boolean.valueOf(isMute(userState.audioMuted, false)), Boolean.valueOf(isMute(userState.videoMuted, false)));
        }
        return new Pair<>(Boolean.valueOf(isMute(userState.audioMuted, false)), Boolean.valueOf(isMute(userState.videoMuted, true)));
    }

    public final void notifyDataChannel(List<UserState> list) {
        Long lValueOf;
        if (this.dataChannel == null) {
            return;
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (UserState userState : list) {
            Player player = userState.user;
            if (player != null) {
                long j = player.uid;
                Pair<Boolean, Boolean> pairMuteInfo = muteInfo(userState);
                Long lValueOf2 = Long.valueOf(j);
                pairMuteInfo.getFirst().booleanValue();
                map.put(lValueOf2, new C938460aWq(pairMuteInfo.getSecond().booleanValue()));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            Player player2 = userState.user;
            if (player2 != null) {
                lValueOf = Long.valueOf(player2.uid);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(' ');
            sbLIZ.append(userState.audioMuted);
            sbLIZ.append(' ');
            sbLIZ.append(userState.videoMuted);
            sbLIZ.append("} ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("notifyDataChannel ");
        sbLIZ2.append((Object) sb);
        C2188811AlT.LIZIZ(sbLIZ2);
        Map<String, Object> map2 = C1338270kvh.LIZ;
        this.dataChannel.SX0(C749260TaG.class, map);
    }

    public void onLayoutChanged(C489801vU c489801vU) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        if (LinkMicGuestStateHandleFix.INSTANCE.isEnable()) {
            C918060Zzw c918060Zzw = C918060Zzw.LIZ;
            boolean zLIZJ = C930540aK4.LIZJ();
            c918060Zzw.getClass();
            if (C918060Zzw.LIZ(zLIZJ)) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                    interfaceC937900aVwLLIIJLIL2.LJLLI(c489801vU.LIZ.layoutId, c489801vU.LIZIZ);
                    return;
                }
                return;
            }
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            interfaceC954180awCLLJLL2.LJIJJLI(c489801vU.LIZIZ);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL3 == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL3.LLIIJLIL()) == null) {
            return;
        }
        interfaceC937900aVwLLIIJLIL.LJJJJIZL(c489801vU.LIZ.layoutId, false, false, true, true, new C916150Zwr());
    }

    /* JADX WARN: Incorrect types in method signature: <T::Lcom/bytedance/android/live/liveinteract/platform/statemanager/iablility/ILinkStateAbility;>(TT;)V */
    public final void subscribeStateChange(ILinkStateAbility iLinkStateAbility) {
        C922060a6O c922060a6O = new C2217381BqS() { // from class: X.0a6O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C490701vd) obj).LLILLJJLI;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZIZ = AFwS299S0000000_15.get$arr$(16);
        iLinkStateAbility.cx0(c922060a6O, c1770850wBP, new AwS594S0100000_15(this, 216));
        iLinkStateAbility.cx0(new C2217381BqS() { // from class: X.0aWn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C490701vd) obj).LLILLL;
            }
        }, null, new AwS594S0100000_15(this, 217));
    }

    private final boolean isAnchor(UserState userState) {
        Player player = userState.user;
        if (player != null) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null || player.uid != room.getOwnerUserId()) {
                return false;
            }
            return true;
        }
        return isAnchor(userState.linkMicId);
    }

    @Override // X.AbstractC945390ai1, X.C0JSV
    public /* bridge */ /* synthetic */ void attachView(C0JSP c0jsp) {
        attachView((InterfaceC919320a1y) c0jsp);
    }

    public void onLayoutChanged(String str) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJJJIZL(str, false, false, true, false, new C916150Zwr());
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/0Q7z;>(TT;I)V */
    public void changeOnlineUserState(InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        ILinkStateAbility iLinkStateAbility;
        if (interfaceC665370Q7z != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ILinkStateAbility.class, null)) != null) {
            iLinkStateAbility.Ny(i, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[StateManager]change online user state: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Object> map = C1338270kvh.LIZ;
            return;
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/0Q7z;>(TT;Ljava/lang/String;)Lcom/bytedance/android/live/liveinteract/platform/statemanager/iablility/UserState; */
    public UserState getUserState(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        ILinkStateAbility iLinkStateAbility;
        if (C936430aTZ.LIZ()) {
            if (interfaceC665370Q7z != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ILinkStateAbility.class, null)) != null) {
                return iLinkStateAbility.L8(str);
            }
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RTCManager]getUserState[");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map2 = C1338270kvh.LIZ;
        return null;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return (R) C736680Sv4.LJIJJ(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o> void withStateSafe(VM1 vm1, Function1<? super S1, Unit> function1) {
        C736680Sv4.LJIJJLI(vm1, function1);
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/0Q7z;>(TT;II)Z */
    public boolean changeMediaState(InterfaceC665370Q7z interfaceC665370Q7z, int i, int i2) {
        String str;
        ILinkStateAbility iLinkStateAbility;
        if (i == 4) {
            str = "video";
        } else {
            str = "audio";
        }
        if (C936430aTZ.LIZ()) {
            if (interfaceC665370Q7z != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ILinkStateAbility.class, null)) != null) {
                if (i != 3) {
                    if (i == 4) {
                        iLinkStateAbility.WQ1(i2);
                    }
                } else {
                    iLinkStateAbility.Ww(i2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[StateManager]change Media State[");
                sbLIZ.append(str);
                sbLIZ.append("_state:");
                sbLIZ.append(i2);
                sbLIZ.append(']');
                C2188811AlT.LIZIZ(sbLIZ);
                Map<String, Object> map = C1338270kvh.LIZ;
                return true;
            }
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[RTCManager]change Media State[");
        sbLIZ2.append(str);
        sbLIZ2.append("_state:");
        sbLIZ2.append(i2);
        sbLIZ2.append(']');
        C2188811AlT.LIZIZ(sbLIZ2);
        Map<String, Object> map3 = C1338270kvh.LIZ;
        return false;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C736680Sv4.LJIJI(vm1, vm2, function2);
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/0Q7z;>(TT;Ljava/lang/String;Lkotlin/jvm/functions/Function1<-Lcom/bytedance/android/live/liveinteract/platform/statemanager/iablility/UserState;Lkotlin/Unit;>;)V */
    public void withUserState(InterfaceC665370Q7z interfaceC665370Q7z, String str, Function1 function1) {
        ILinkStateAbility iLinkStateAbility;
        if (C936430aTZ.LIZ()) {
            if (interfaceC665370Q7z != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ILinkStateAbility.class, null)) != null) {
                iLinkStateAbility.Px1(str, function1);
            } else {
                Map<String, Object> map = C1338270kvh.LIZ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RTCManager]withMediaState[");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map2 = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, VM3 extends AssemViewModel<S3>, S3 extends InterfaceC0148002o, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C736680Sv4.LJIJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/0Q7z;>(TT;IIZZ)Z */
    public boolean changeMediaSource(InterfaceC665370Q7z interfaceC665370Q7z, int i, int i2, boolean z, boolean z2) {
        String str;
        ILinkStateAbility iLinkStateAbility;
        if (i == 4) {
            str = "video";
        } else {
            str = "audio";
        }
        if (C936430aTZ.LIZ()) {
            if (interfaceC665370Q7z != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ILinkStateAbility.class, null)) != null) {
                if (i == 3) {
                    iLinkStateAbility.mK2(i2, z, z2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[StateManager]change Media Source[");
                sbLIZ.append(str);
                sbLIZ.append("_source:");
                sbLIZ.append(i2);
                sbLIZ.append("]_");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                Map<String, Object> map = C1338270kvh.LIZ;
                return true;
            }
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[RTCManager]change Media Source[");
        sbLIZ2.append(str);
        sbLIZ2.append("_source:");
        sbLIZ2.append(i2);
        sbLIZ2.append("]_");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        Map<String, Object> map3 = C1338270kvh.LIZ;
        return false;
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public <S extends InterfaceC0148002o, T> C0ZP4 asyncSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function2<? super C03H5, ? super Throwable, Unit> function2, Function1<? super C03H5, Unit> function1, Function2<? super C03H5, ? super T, Unit> function22) {
        return C736680Sv4.LIZ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function2, function1, function22);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, Function1<? super Throwable, Unit> function1, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LJIILIIL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
