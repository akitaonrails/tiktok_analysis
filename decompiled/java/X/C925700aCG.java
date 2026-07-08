package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewCloseCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewHasPermissionEvent;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925700aCG extends AbstractC929640aIc {
    public final C923650a8x LLILLJJLI;
    public final Room LLILLL;
    public final boolean LLILZ;
    public final List<? extends LinkPayPlan> LLILZIL;
    public final int LLILZLL;
    public final DataChannel LLIZ;
    public boolean LLJ;
    public int LLIZLLLIL = 2;
    public final C11NJ LLJI = new C11NJ();
    public final MultiGuestDataHolder LLJIJIL = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");

    @Override // X.C929710aIj
    public final void LIZIZ() {
        this.LL = null;
        InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
        if (interfaceC925800aCQLIZIZ != null) {
            interfaceC925800aCQLIZIZ.clear();
        }
        this.LLJI.LJ();
    }

    @Override // X.AbstractC929640aIc
    public final String LJFF() {
        return "";
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIJ(boolean z, boolean z2) {
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIJJI(int i) {
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIL(LiveEffect liveEffect) {
    }

    @Override // X.AbstractC929640aIc
    public final void LJIILIIL(String str) {
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIIZ() {
        if (this.LLILLL != null) {
            MultiGuestDataHolder multiGuestDataHolder = this.LLJIJIL;
            this.LLIZLLLIL = multiGuestDataHolder != null ? multiGuestDataHolder.LJIIIIZZ("reply") : 2;
            MultiGuestDataHolder multiGuestDataHolder2 = this.LLJIJIL;
            if (multiGuestDataHolder2 != null) {
                multiGuestDataHolder2.LJJLIIIJILLIZJL = "invite";
            }
            C925600aC6.LJIJJLI("in_liveroom");
            this.LLJ = true;
            BizReplyParams bizReplyParams = new BizReplyParams(this.LLIZLLLIL, 0);
            Room room = this.LLILLL;
            if (room != null) {
                C950850aqp c950850aqp = new C950850aqp(room.getId(), room.getOwnerUserId(), 1, bizReplyParams, 0L, 48);
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.LLFII(c950850aqp, new InterfaceC920680a4A<ReplyResult>() { // from class: X.0aCM
                        public final /* synthetic */ boolean LIZIZ = true;

                        @Override // X.InterfaceC920680a4A
                        public final void onSuccess(ReplyResult replyResult) {
                            BizReplyResponseData bizReplyResponseData;
                            this.LIZ.getClass();
                            BizReplyResponse bizReplyResponse = replyResult.multiGuestRespExtra;
                            if (bizReplyResponse != null) {
                                bizReplyResponseData = bizReplyResponse.responseData;
                            } else {
                                bizReplyResponseData = null;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("bizReplyResponseData ");
                            sbLIZ.append(bizReplyResponseData);
                            C20441214yg.LIZIZ("HybridKit", C2188811AlT.LIZIZ(sbLIZ));
                            if (bizReplyResponseData != null) {
                                long j = bizReplyResponseData.linkTypePermission;
                                C925700aCG c925700aCG = this.LIZ;
                                MultiGuestDataHolder multiGuestDataHolder3 = c925700aCG.LLJIJIL;
                                if (multiGuestDataHolder3 != null) {
                                    multiGuestDataHolder3.LJJII(j);
                                }
                                if (j == 2) {
                                    MultiGuestDataHolder multiGuestDataHolder4 = c925700aCG.LLJIJIL;
                                    if (multiGuestDataHolder4 != null) {
                                        multiGuestDataHolder4.LIZ();
                                    }
                                    if (c925700aCG.LLIZLLLIL != 2) {
                                        C766270U4b.LIZLLL(2131843597);
                                    }
                                    DataChannel dataChannel = c925700aCG.LLIZ;
                                    if (dataChannel != null) {
                                        dataChannel.FQ2(PreviewCloseCameraEvent.class);
                                    }
                                    c925700aCG.LLIZLLLIL = 2;
                                    return;
                                }
                            }
                            InterfaceC925780aCO interfaceC925780aCO = (InterfaceC925780aCO) this.LIZ.LL;
                            if (interfaceC925780aCO != null) {
                                interfaceC925780aCO.oE();
                            }
                            if (!this.LIZIZ) {
                                C925700aCG c925700aCG2 = this.LIZ;
                                C925150aBN.LJIIJJI(c925700aCG2.LLILLL, c925700aCG2.LLIZ, false);
                            } else {
                                C925700aCG c925700aCG3 = this.LIZ;
                                C925150aBN.LJIIJJI(c925700aCG3.LLILLL, c925700aCG3.LLIZ, true);
                            }
                            if (this.LIZIZ) {
                                DataChannel dataChannel2 = this.LIZ.LLIZ;
                                if (dataChannel2 == null) {
                                    return;
                                }
                                dataChannel2.FQ2(PreviewHasPermissionEvent.class);
                                return;
                            }
                            MultiGuestDataHolder multiGuestDataHolder5 = this.LIZ.LLJIJIL;
                            if (multiGuestDataHolder5 == null) {
                                return;
                            }
                            multiGuestDataHolder5.LJJJLL = -1;
                        }

                        @Override // X.InterfaceC920680a4A
                        public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                            InterfaceC925780aCO interfaceC925780aCO;
                            C925700aCG c925700aCG = this.LIZ;
                            c925700aCG.getClass();
                            if ((th instanceof C501470JlZ) && (interfaceC925780aCO = (InterfaceC925780aCO) c925700aCG.LL) != null) {
                                interfaceC925780aCO.BP(th);
                            }
                        }
                    });
                }
            }
        }
    }

    public final void LJIILL() {
        LiveDialogFragment dialog;
        InterfaceC925780aCO interfaceC925780aCO;
        LiveDialogFragment dialog2;
        InterfaceC925780aCO interfaceC925780aCO2 = (InterfaceC925780aCO) this.LL;
        if (interfaceC925780aCO2 == null || (dialog = interfaceC925780aCO2.getDialog()) == null || !dialog.isShowing() || (interfaceC925780aCO = (InterfaceC925780aCO) this.LL) == null || (dialog2 = interfaceC925780aCO.getDialog()) == null) {
            return;
        }
        dialog2.dismiss();
    }

    public final void LJIIZILJ() {
        User owner;
        User owner2;
        FollowPair followPair = new FollowPair();
        Room room = this.LLILLL;
        followPair.followStatus = C500260Jjc.LJJJI((room == null || (owner2 = room.getOwner()) == null) ? null : Boolean.valueOf(owner2.isFollower)) ? 2 : 1;
        Room room2 = this.LLILLL;
        followPair.LIZ = (room2 == null || (owner = room2.getOwner()) == null) ? 0L : owner.getId();
        followPair.LIZJ = followPair.followStatus;
        UserService.getInstance().user().LJIIJJI(followPair);
    }

    @Override // X.AbstractC929640aIc
    public final ImageModel LJI() {
        return UserService.getInstance().user().getCurrentUser().getAvatarThumb();
    }

    @Override // X.AbstractC929640aIc
    public final C11NJ LJ() {
        return this.LLJI;
    }

    @Override // X.AbstractC929640aIc
    public final int LJII() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC929640aIc
    public final boolean LJIIIIZZ() {
        return this.LLILZ;
    }

    public static final boolean LJIILLIIL(C925770aCN c925770aCN) {
        if (c925770aCN != null) {
            if (c925770aCN.LIZJ == 7 || c925770aCN.LIZJ == 8) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C929710aIj
    public final void LIZ(InterfaceC481310Iu9 interfaceC481310Iu9) {
        this.LL = interfaceC481310Iu9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC929640aIc
    public final void LIZLLL(C925770aCN c925770aCN) {
        int iLJIIIIZZ;
        Fragment fragment;
        Activity activity;
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        C924790aAn c924790aAnLIZLLL = C924790aAn.LIZLLL();
        if (this.LLILZ) {
            int i = ((LinkPayPlan) ListProtector.get(this.LLILZIL, 0)).duration;
            c924790aAnLIZLLL.LJIIJ = true;
            c924790aAnLIZLLL.LJIIJJI = i;
        } else {
            c924790aAnLIZLLL.LJIIJ = false;
            c924790aAnLIZLLL.LJIIJJI = 0;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.LLJIJIL;
        int i2 = 2;
        if (multiGuestDataHolder != null) {
            iLJIIIIZZ = multiGuestDataHolder.LJIIIIZZ("apply");
        } else {
            iLJIIIIZZ = 2;
        }
        this.LLIZLLLIL = iLJIIIIZZ;
        MultiGuestDataHolder multiGuestDataHolder2 = this.LLJIJIL;
        if (multiGuestDataHolder2 != null) {
            i2 = multiGuestDataHolder2.LJJJLL;
        }
        if (c925770aCN != null && (c925770aCN.LIZJ == 0 || c925770aCN.LIZJ == 1)) {
            LJIJ(c925770aCN);
            return;
        }
        InterfaceC925780aCO interfaceC925780aCO = (InterfaceC925780aCO) this.LL;
        Context context = null;
        if (interfaceC925780aCO != null) {
            context = interfaceC925780aCO.getContext();
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILJJIL(c925770aCN)) {
            activity = C520010KaN.LJIJ(context, true);
        } else {
            T t = this.LL;
            if (!(t instanceof VoiceChatUserInfoFragment) || (fragment = (Fragment) t) == null) {
                return;
            } else {
                activity = fragment.getActivity();
            }
        }
        if (activity == null) {
            return;
        }
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILJJIL(c925770aCN)) {
            C920830a4P.LIZLLL = "connection_button";
        } else {
            C920830a4P.LIZLLL = "application_pannel";
        }
        boolean z = C925090aBH.LIZ;
        C925090aBH.LIZ(this.LLIZ, 0, activity, Long.valueOf(i2), new AwS381S0200000_15(this, c925770aCN, 176), new AwS559S0100000_15(this, 1188));
    }

    @Override // X.AbstractC929640aIc
    public final void LJIILJJIL(int i) {
        this.LLIZLLLIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194 A[PHI: r5
      0x0194: PHI (r5v2 int) = (r5v1 int), (r5v5 int), (r5v5 int) binds: [B:75:0x0190, B:37:0x00b3, B:39:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c A[PHI: r5
      0x019c: PHI (r5v8 java.lang.Integer) = (r5v7 java.lang.Integer), (r5v10 java.lang.Integer) binds: [B:79:0x0198, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJ(X.C925770aCN r37) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925700aCG.LJIJ(X.0aCN):boolean");
    }

    public C925700aCG(C923650a8x c923650a8x, Room room, boolean z, List list, int i, DataChannel dataChannel) {
        this.LLILLJJLI = c923650a8x;
        this.LLILLL = room;
        this.LLILZ = z;
        this.LLILZIL = list;
        this.LLILZLL = i;
        this.LLIZ = dataChannel;
    }
}
