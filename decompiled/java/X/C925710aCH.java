package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewCloseCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewHasPermissionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
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
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AwS13S1210000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aCH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925710aCH extends AbstractC929640aIc {
    public final AbstractC923750a97 LLILLJJLI;
    public final Room LLILLL;
    public final boolean LLILZ;
    public final List<? extends LinkPayPlan> LLILZIL;
    public final int LLILZLL;
    public final DataChannel LLIZ;
    public LiveEffect LLJIJIL;
    public boolean LLJILJIL;
    public int LLIZLLLIL = 1;
    public int LLJ = 2;
    public String LLJI = "";
    public final C11NJ LLJILJILJ = new C11NJ();
    public final MultiGuestDataHolder LLJILLL = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
    public final Keva LLJJ = Keva.getRepo("live-app-core-sdk");

    @Override // X.C929710aIj
    public final void LIZIZ() {
        this.LL = null;
        InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
        if (interfaceC925800aCQLIZIZ != null) {
            interfaceC925800aCQLIZIZ.clear();
        }
        this.LLJILJILJ.LJ();
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIIZ() {
        if (this.LLILLL != null) {
            MultiGuestDataHolder multiGuestDataHolder = this.LLJILLL;
            this.LLIZLLLIL = multiGuestDataHolder != null ? multiGuestDataHolder.LJIIIIZZ("reply") : 2;
            C924790aAn.LIZLLL().LJ = this.LLJ;
            C924790aAn.LIZLLL().LJFF = this.LLJIJIL;
            C924790aAn.LIZLLL().LJIIIZ = this.LLJI;
            MultiGuestDataHolder multiGuestDataHolder2 = this.LLJILLL;
            if (multiGuestDataHolder2 != null) {
                multiGuestDataHolder2.LJJLIIIJILLIZJL = "invite";
            }
            C925600aC6.LJIJJLI("in_liveroom");
            this.LLJILJIL = true;
            BizReplyParams bizReplyParams = new BizReplyParams(this.LLIZLLLIL, 0);
            Room room = this.LLILLL;
            if (room != null) {
                C950850aqp c950850aqp = new C950850aqp(room.getId(), room.getOwnerUserId(), 1, bizReplyParams, 0L, 48);
                C924630aAX.LJJJI(1, Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.LLFII(c950850aqp, new InterfaceC920680a4A<ReplyResult>() { // from class: X.0aCJ
                        public final /* synthetic */ boolean LIZIZ = true;

                        @Override // X.InterfaceC920680a4A
                        public final void onSuccess(ReplyResult replyResult) {
                            BizReplyResponseData bizReplyResponseData;
                            int i;
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
                            int i2 = 2;
                            if (bizReplyResponseData != null) {
                                long j = bizReplyResponseData.linkTypePermission;
                                C925710aCH c925710aCH = this.LIZ;
                                MultiGuestDataHolder multiGuestDataHolder3 = c925710aCH.LLJILLL;
                                if (multiGuestDataHolder3 != null) {
                                    multiGuestDataHolder3.LJJII(j);
                                }
                                if (C925710aCH.LJIILLIIL(j)) {
                                    MultiGuestDataHolder multiGuestDataHolder4 = c925710aCH.LLJILLL;
                                    if (multiGuestDataHolder4 != null) {
                                        multiGuestDataHolder4.LIZ();
                                    }
                                    if (c925710aCH.LLIZLLLIL != 2) {
                                        if (C498310JgT.LIZ()) {
                                            i = 2131852220;
                                        } else {
                                            i = 2131843597;
                                        }
                                        C766270U4b.LIZLLL(i);
                                    }
                                    DataChannel dataChannel = c925710aCH.LLIZ;
                                    if (dataChannel != null) {
                                        dataChannel.FQ2(PreviewCloseCameraEvent.class);
                                    }
                                    c925710aCH.LLIZLLLIL = 2;
                                    return;
                                }
                            }
                            InterfaceC925780aCO interfaceC925780aCO = (InterfaceC925780aCO) this.LIZ.LL;
                            if (interfaceC925780aCO != null) {
                                interfaceC925780aCO.oE();
                            }
                            C925710aCH c925710aCH2 = this.LIZ;
                            C925150aBN.LJIIJJI(c925710aCH2.LLILLL, c925710aCH2.LLIZ, this.LIZIZ);
                            if (this.LIZIZ) {
                                C929810aIt.LIZIZ(1);
                                DataChannel dataChannel2 = this.LIZ.LLIZ;
                                if (dataChannel2 != null) {
                                    dataChannel2.FQ2(PreviewHasPermissionEvent.class);
                                }
                            } else {
                                MultiGuestDataHolder multiGuestDataHolder5 = this.LIZ.LLJILLL;
                                if (multiGuestDataHolder5 != null) {
                                    multiGuestDataHolder5.LJJJLL = -1;
                                }
                            }
                            if (this.LIZIZ) {
                                i2 = 1;
                            }
                            this.LIZ.getClass();
                            C924630aAX.LJJJIL(i2, UserService.getInstance().user().getCurrentUserId());
                        }

                        @Override // X.InterfaceC920680a4A
                        public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                            int i;
                            C925710aCH c925710aCH = this.LIZ;
                            c925710aCH.getClass();
                            if (th instanceof C501470JlZ) {
                                InterfaceC925780aCO interfaceC925780aCO = (InterfaceC925780aCO) c925710aCH.LL;
                                if (interfaceC925780aCO != null) {
                                    interfaceC925780aCO.BP(th);
                                }
                                C915130ZvD.LIZ(th);
                            }
                            if (this.LIZIZ) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            this.LIZ.getClass();
                            C924630aAX.LJJJ(th, i, UserService.getInstance().user().getCurrentUserId());
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

    public final void LJIJI() {
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
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC929640aIc
    public final String LJFF() {
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

    public static boolean LJIILLIIL(long j) {
        if (j != 2 && !C498310JgT.LIZ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(C925770aCN c925770aCN) {
        if (c925770aCN != null) {
            if (c925770aCN.LIZJ == 7 || c925770aCN.LIZJ == 8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final String LJIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MultiGuestV3GuestPresenter_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C929710aIj
    public final void LIZ(InterfaceC481310Iu9 interfaceC481310Iu9) {
        this.LL = interfaceC481310Iu9;
        this.LLJ = this.LLJJ.getInt("live_interact_beauty_level", 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC929640aIc
    public final void LIZLLL(C925770aCN c925770aCN) {
        int iLJIIIIZZ;
        Context context;
        Fragment fragment;
        Activity activity;
        String strLJJJJ;
        String strLJJJJ2 = null;
        if (this.LLJILJIL) {
            String strLJIJ = LJIJ(130);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyWithPosition return for mIsApplying is true, from source: ");
            if (c925770aCN != null) {
                strLJJJJ = C930540aK4.LJJJJ(c925770aCN.LIZJ);
            } else {
                strLJJJJ = null;
            }
            sbLIZ.append(strLJJJJ);
            C1AZW.LJIIJ(12, strLJIJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            return;
        }
        this.LLJILJIL = true;
        C924790aAn c924790aAnLIZLLL = C924790aAn.LIZLLL();
        if (this.LLILZ) {
            int i = ((LinkPayPlan) ListProtector.get(this.LLILZIL, 0)).duration;
            c924790aAnLIZLLL.LJIIJ = true;
            c924790aAnLIZLLL.LJIIJJI = i;
        } else {
            c924790aAnLIZLLL.LJIIJ = false;
            c924790aAnLIZLLL.LJIIJJI = 0;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.LLJILLL;
        int i2 = 2;
        if (multiGuestDataHolder != null) {
            iLJIIIIZZ = multiGuestDataHolder.LJIIIIZZ("apply");
        } else {
            iLJIIIIZZ = 2;
        }
        this.LLIZLLLIL = iLJIIIIZZ;
        MultiGuestDataHolder multiGuestDataHolder2 = this.LLJILLL;
        if (multiGuestDataHolder2 != null) {
            i2 = multiGuestDataHolder2.LJJJLL;
        }
        if (c925770aCN != null && c925770aCN.LIZJ == 4) {
            LJIJJ(c925770aCN);
            return;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (!C927600aFK.LJIILJJIL(c925770aCN)) {
            InterfaceC925780aCO interfaceC925780aCO = (InterfaceC925780aCO) this.LL;
            if (interfaceC925780aCO != null) {
                context = interfaceC925780aCO.getContext();
            } else {
                context = null;
            }
            C307001Gy.LIZ().getClass();
            if (C927600aFK.LJIILJJIL(c925770aCN)) {
                activity = C520010KaN.LJIJ(context, true);
            } else {
                T t = this.LL;
                if (!(t instanceof LiveThemeAwareFragment) || (fragment = (Fragment) t) == null) {
                    return;
                } else {
                    activity = fragment.getActivity();
                }
            }
            if (activity != null) {
                C307001Gy.LIZ().getClass();
                if (C927600aFK.LJIILJJIL(c925770aCN)) {
                    C920830a4P.LIZLLL = "connection_button";
                } else {
                    C920830a4P.LIZLLL = "application_pannel";
                }
                boolean z = C925080aBG.LIZ;
                DataChannel dataChannel = this.LLIZ;
                long j = i2;
                if (c925770aCN != null) {
                    strLJJJJ2 = C930540aK4.LJJJJ(c925770aCN.LIZJ);
                }
                C925080aBG.LIZ(true, dataChannel, 0, activity, Long.valueOf(j), strLJJJJ2, new AwS381S0200000_15(this, c925770aCN, 105), new AwS559S0100000_15(this, 789));
                return;
            }
            return;
        }
        LJIJJ(c925770aCN);
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIJJI(int i) {
        this.LLJ = i;
        this.LLJJ.storeInt("live_interact_beauty_level", i);
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIL(LiveEffect liveEffect) {
        this.LLJIJIL = liveEffect;
    }

    @Override // X.AbstractC929640aIc
    public final void LJIILIIL(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LLJI = str2;
        C924790aAn c924790aAnLIZLLL = C924790aAn.LIZLLL();
        if (str == null) {
            str = "";
        }
        c924790aAnLIZLLL.LJIIIZ = str;
    }

    @Override // X.AbstractC929640aIc
    public final void LJIILJJIL(int i) {
        this.LLIZLLLIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021c A[PHI: r4
      0x021c: PHI (r4v28 java.lang.Integer) = (r4v27 java.lang.Integer), (r4v30 java.lang.Integer) binds: [B:103:0x0218, B:29:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106 A[PHI: r9
      0x0106: PHI (r9v6 int) = (r9v0 int), (r9v7 int) binds: [B:49:0x0104, B:99:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204 A[PHI: r9
      0x0204: PHI (r9v1 int) = (r9v0 int), (r9v6 int), (r9v6 int) binds: [B:49:0x0104, B:51:0x0108, B:53:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(X.C925770aCN r40) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925710aCH.LJIJJ(X.0aCN):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC929640aIc
    public final void LJIIJ(boolean z, boolean z2) {
        int iLJIIIIZZ;
        Fragment fragment;
        C19EG activity;
        MultiGuestDataHolder multiGuestDataHolder = this.LLJILLL;
        int i = 2;
        if (multiGuestDataHolder != null) {
            iLJIIIIZZ = multiGuestDataHolder.LJIIIIZZ("apply");
        } else {
            iLJIIIIZZ = 2;
        }
        this.LLIZLLLIL = iLJIIIIZZ;
        MultiGuestDataHolder multiGuestDataHolder2 = this.LLJILLL;
        if (multiGuestDataHolder2 != null) {
            i = multiGuestDataHolder2.LJJJLL;
        }
        if (!z) {
            T t = this.LL;
            if ((t instanceof MultiGuestUserInfoFragment) && (fragment = (Fragment) t) != null && (activity = fragment.getActivity()) != null) {
                boolean z3 = C925080aBG.LIZ;
                C925080aBG.LIZJ(true, 0, activity, Long.valueOf(i), new AwS13S1210000_15(activity, this, z2, 4), new AwS559S0100000_15(this, 790), "isReserveDirect_false");
                return;
            }
            return;
        }
        C921390a5J c921390a5J = C921390a5J.LIZ;
        Room room = this.LLILLL;
        C11NJ c11nj = this.LLJILJILJ;
        C925750aCL c925750aCL = new C925750aCL(this, z2);
        c921390a5J.getClass();
        C921390a5J.LIZ(1, z2, room, c11nj, c925750aCL);
    }

    public C925710aCH(AbstractC923750a97 abstractC923750a97, Room room, boolean z, List list, int i, DataChannel dataChannel) {
        this.LLILLJJLI = abstractC923750a97;
        this.LLILLL = room;
        this.LLILZ = z;
        this.LLILZIL = list;
        this.LLILZLL = i;
        this.LLIZ = dataChannel;
    }
}
