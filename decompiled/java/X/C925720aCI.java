package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.gamelink.model.PreviewCloseCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewHasPermissionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925720aCI extends AbstractC929640aIc {
    public final InterfaceC924460aAG LLILLJJLI;
    public final AbstractC923750a97 LLILLL;
    public final Room LLILZ;
    public final DataChannel LLILZIL;
    public int LLIZ;
    public LiveEffect LLJ;
    public boolean LLJI;
    public int LLILZLL = 1;
    public String LLIZLLLIL = "";
    public final C11NJ LLJIJIL = new C11NJ();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(288));
    public final Keva LLJILJILJ = Keva.getRepo("live-app-core-sdk");

    @Override // X.C929710aIj
    public final void LIZIZ() {
        this.LL = null;
        this.LLJIJIL.LJ();
    }

    @Override // X.AbstractC929640aIc
    public final C11NJ LJ() {
        return null;
    }

    @Override // X.AbstractC929640aIc
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIJ(boolean z, boolean z2) {
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIIZ() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        if (this.LLILZ != null) {
            GameLinkDataHolder gameLinkDataHolderLJIILL = LJIILL();
            gameLinkDataHolderLJIILL.LJJJLIIL = 2;
            C924790aAn.LIZLLL().LJIIL = gameLinkDataHolderLJIILL.LJJJLIIL;
            this.LLILZLL = 2;
            C924790aAn.LIZLLL().LJ = this.LLIZ;
            C924790aAn.LIZLLL().LJFF = this.LLJ;
            C924790aAn.LIZLLL().LJIIIZ = this.LLIZLLLIL;
            this.LLJI = true;
            BizReplyParams bizReplyParams = new BizReplyParams(this.LLILZLL, 0);
            Room room = this.LLILZ;
            if (room != null) {
                C950850aqp c950850aqp = new C950850aqp(room.getId(), room.getOwnerUserId(), 1, bizReplyParams, 0L, 48);
                InterfaceC924460aAG interfaceC924460aAG = this.LLILLJJLI;
                if (interfaceC924460aAG == null || (interfaceC954180awCLLJLL = interfaceC924460aAG.LLJLL()) == null) {
                    return;
                }
                interfaceC954180awCLLJLL.LLFII(c950850aqp, new InterfaceC920680a4A<ReplyResult>() { // from class: X.0aCK
                    public final /* synthetic */ boolean LIZIZ = true;

                    @Override // X.InterfaceC920680a4A
                    public final void onSuccess(ReplyResult replyResult) {
                        BizReplyResponseData bizReplyResponseData;
                        C944230ag9.LIZ("GameLinkInteractDialogPresenter", "reply invite succeed", false);
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
                        C20441214yg.LIZIZ("GameLinkInteractDialogPresenter", C2188811AlT.LIZIZ(sbLIZ));
                        if (bizReplyResponseData != null) {
                            long j = bizReplyResponseData.linkTypePermission;
                            C925720aCI c925720aCI = this.LIZ;
                            GameLinkDataHolder gameLinkDataHolderLJIILL2 = c925720aCI.LJIILL();
                            if (gameLinkDataHolderLJIILL2 != null) {
                                gameLinkDataHolderLJIILL2.LJJII(j);
                            }
                            if (j == 2) {
                                GameLinkDataHolder gameLinkDataHolderLJIILL3 = c925720aCI.LJIILL();
                                if (gameLinkDataHolderLJIILL3 != null) {
                                    gameLinkDataHolderLJIILL3.LIZ();
                                }
                                if (c925720aCI.LLILZLL != 2) {
                                    C766270U4b.LIZLLL(2131843597);
                                }
                                DataChannel dataChannel = c925720aCI.LLILZIL;
                                if (dataChannel != null) {
                                    dataChannel.FQ2(PreviewCloseCameraEvent.class);
                                }
                                c925720aCI.LLILZLL = 2;
                                return;
                            }
                        }
                        InterfaceC925780aCO interfaceC925780aCO = (InterfaceC925780aCO) this.LIZ.LL;
                        if (interfaceC925780aCO != null) {
                            interfaceC925780aCO.oE();
                        }
                        if (!this.LIZIZ) {
                            C925720aCI c925720aCI2 = this.LIZ;
                            C925050aBD.LJI(c925720aCI2.LLILZ, c925720aCI2.LLILZIL, false);
                        } else {
                            C925720aCI c925720aCI3 = this.LIZ;
                            C925050aBD.LJI(c925720aCI3.LLILZ, c925720aCI3.LLILZIL, true);
                        }
                        if (this.LIZIZ) {
                            DataChannel dataChannel2 = this.LIZ.LLILZIL;
                            if (dataChannel2 == null) {
                                return;
                            }
                            dataChannel2.FQ2(PreviewHasPermissionEvent.class);
                            return;
                        }
                        GameLinkDataHolder gameLinkDataHolderLJIILL4 = this.LIZ.LJIILL();
                        if (gameLinkDataHolderLJIILL4 == null) {
                            return;
                        }
                        gameLinkDataHolderLJIILL4.LJJJLL = -1;
                    }

                    @Override // X.InterfaceC920680a4A
                    public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                        InterfaceC925780aCO interfaceC925780aCO;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reply invite failed, ");
                        sbLIZ.append(C2199671B7d.LJIILLIIL(th));
                        C944230ag9.LIZ("GameLinkInteractDialogPresenter", C2188811AlT.LIZIZ(sbLIZ), false);
                        C925720aCI c925720aCI = this.LIZ;
                        c925720aCI.getClass();
                        if ((th instanceof C501470JlZ) && (interfaceC925780aCO = (InterfaceC925780aCO) c925720aCI.LL) != null) {
                            interfaceC925780aCO.BP(th);
                        }
                    }
                });
            }
        }
    }

    public final GameLinkDataHolder LJIILL() {
        return (GameLinkDataHolder) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC929640aIc
    public final ImageModel LJI() {
        return UserService.getInstance().user().getCurrentUser().getAvatarThumb();
    }

    @Override // X.AbstractC929640aIc
    public final String LJFF() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC929640aIc
    public final int LJII() {
        return this.LLILZLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C929710aIj
    public final void LIZ(InterfaceC481310Iu9 interfaceC481310Iu9) {
        this.LL = interfaceC481310Iu9;
        this.LLIZ = this.LLJILJILJ.getInt("live_interact_beauty_level", 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC929640aIc
    public final void LIZLLL(C925770aCN c925770aCN) {
        Fragment fragment;
        C19EG activity;
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        C924790aAn c924790aAnLIZLLL = C924790aAn.LIZLLL();
        c924790aAnLIZLLL.LJIIJ = false;
        c924790aAnLIZLLL.LJIIJJI = 0;
        GameLinkDataHolder gameLinkDataHolderLJIILL = LJIILL();
        gameLinkDataHolderLJIILL.LJJJLIIL = 2;
        C924790aAn.LIZLLL().LJIIL = gameLinkDataHolderLJIILL.LJJJLIIL;
        this.LLILZLL = 2;
        int i = LJIILL().LJJJLL;
        InterfaceC925780aCO interfaceC925780aCO = (InterfaceC925780aCO) this.LL;
        if (interfaceC925780aCO != null) {
            interfaceC925780aCO.getContext();
        }
        T t = this.LL;
        if ((t instanceof MultiGuestUserInfoFragment) && (fragment = (Fragment) t) != null && (activity = fragment.getActivity()) != null) {
            C924650aAZ.LJI = "application_pannel";
            C925070aBF.LIZ(true, 0, activity, Long.valueOf(i), new AwS381S0200000_15(this, c925770aCN, 96), new AwS559S0100000_15(this, 676), new AwS559S0100000_15(this, 677));
        }
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIJJI(int i) {
        this.LLIZ = i;
        this.LLJILJILJ.storeInt("live_interact_beauty_level", i);
    }

    @Override // X.AbstractC929640aIc
    public final void LJIIL(LiveEffect liveEffect) {
        this.LLJ = liveEffect;
    }

    @Override // X.AbstractC929640aIc
    public final void LJIILIIL(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LLIZLLLIL = str2;
        C924790aAn c924790aAnLIZLLL = C924790aAn.LIZLLL();
        if (str == null) {
            str = "";
        }
        c924790aAnLIZLLL.LJIIIZ = str;
    }

    @Override // X.AbstractC929640aIc
    public final void LJIILJJIL(int i) {
        this.LLILZLL = i;
    }

    public C925720aCI(InterfaceC924460aAG interfaceC924460aAG, C923760a98 c923760a98, Room room, DataChannel dataChannel) {
        this.LLILLJJLI = interfaceC924460aAG;
        this.LLILLL = c923760a98;
        this.LLILZ = room;
        this.LLILZIL = dataChannel;
    }
}
