package Y;

import X.C0KVU;
import X.C0THQ;
import X.C1121670fIL;
import X.C1126540fQC;
import X.C1161920gLG;
import X.C1291830jin;
import X.C1324720kZq;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473410IhP;
import X.C754570Tip;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917110ZyP;
import X.C923650a8x;
import X.C923760a98;
import X.C935990aSr;
import X.C944270agD;
import X.C944300agG;
import X.C944570agh;
import X.C946630ak1;
import X.C946660ak4;
import X.C946680ak6;
import X.C952540atY;
import X.C954460awe;
import X.C954630awv;
import X.C954640aww;
import X.C954650awx;
import X.C954930axP;
import X.C963630bBR;
import X.EnumC944090afv;
import X.InterfaceC923890a9L;
import X.InterfaceC944250agB;
import X.InterfaceC954180awC;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.FloatWindowCoHostEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSyncEffectRealtimeSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class AObjectS530S0100000_15 implements Function2 {
    public final int $t;
    public Object l0;

    public static final Object invoke$9(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        MultiGuestPreviewFragment.aS((MultiGuestPreviewFragment) aObjectS530S0100000_15.l0, (TreeMap) obj2);
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS530S0100000_15(MultiGuestPreviewFragment multiGuestPreviewFragment, int i) {
        this.$t = i;
        if (7 - i != 0) {
            this.l0 = multiGuestPreviewFragment;
        } else {
            this.l0 = multiGuestPreviewFragment;
        }
    }

    public AObjectS530S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        Context context = (Context) obj;
        PerceptionDialogInfo perceptionDialogInfo = (PerceptionDialogInfo) obj2;
        String str = perceptionDialogInfo.violationDetailUrl;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, perceptionDialogInfo.violationDetailUrl);
        }
        C0THQ c0thq = ((MultiGuestV3GuestPresenter) aObjectS530S0100000_15.l0).copyrightPerceptionHelper;
        if (c0thq != null) {
            c0thq.LIZLLL = true;
            c0thq.LIZJ(201);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        C0THQ c0thq = ((MultiGuestV3GuestPresenter) aObjectS530S0100000_15.l0).copyrightPerceptionHelper;
        if (c0thq != null) {
            c0thq.LIZLLL = true;
            c0thq.LIZJ(202);
        }
        C0THQ c0thq2 = ((MultiGuestV3GuestPresenter) aObjectS530S0100000_15.l0).copyrightPerceptionHelper;
        if (c0thq2 != null) {
            c0thq2.LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        C944270agD c944270agD = (C944270agD) aObjectS530S0100000_15.l0;
        c944270agD.getClass();
        C954640aww c954640aww = (C954640aww) ((C917110ZyP) obj2).LIZ;
        if (c954640aww.LIZ == 0) {
            DataChannel dataChannel = c944270agD.dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(FloatWindowCoHostEvent.class);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceiveInvitationNewArc,  ");
            sbLIZ.append(c954640aww.hashCode());
            C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
            T t = c944270agD.mView;
            if (t != 0) {
                ((InterfaceC944250agB) t).Sx0(c954640aww);
            }
            C944300agG.LIZ("reentrant_join_msg");
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onReceiveApplyNewArc,  ");
            sbLIZ2.append(c954640aww.hashCode());
            sbLIZ2.append("   channelId = ");
            sbLIZ2.append(C915980Zwa.LJI().LJIIJ().getChannelId());
            C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
            T t2 = c944270agD.mView;
            if (t2 != 0) {
                ((InterfaceC944250agB) t2).QE0(c954640aww);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$11(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        C944270agD c944270agD = (C944270agD) aObjectS530S0100000_15.l0;
        C917110ZyP c917110ZyP = (C917110ZyP) obj2;
        if (c944270agD.mView != 0) {
            if (((C954650awx) c917110ZyP.LIZ).LIZ == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCancelInviteNewArc,  ");
                sbLIZ.append(c917110ZyP.hashCode());
                C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
                ((InterfaceC944250agB) c944270agD.mView).VM1();
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onCancelApplyNewArc,  ");
                sbLIZ2.append(c917110ZyP.hashCode());
                C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                ((InterfaceC944250agB) c944270agD.mView).wz2();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        String strLIZIZ;
        C754570Tip c754570Tip;
        C944270agD c944270agD = (C944270agD) aObjectS530S0100000_15.l0;
        C917110ZyP c917110ZyP = (C917110ZyP) obj2;
        c944270agD.getClass();
        C954630awv c954630awv = (C954630awv) c917110ZyP.LIZ;
        int i = c954630awv.LIZIZ;
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(c954630awv.LIZJ);
        if (c954460aweLLILL != null && (c754570Tip = c954460aweLLILL.LJIJJ) != null) {
            strLIZIZ = C0KVU.LIZIZ(c754570Tip.LIZ, c754570Tip.LIZIZ);
        } else {
            strLIZIZ = "";
        }
        if (c944270agD.mView != 0) {
            if (c954630awv.LIZ == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReceiveReplyNewArc,  ");
                sbLIZ.append(c954630awv.hashCode());
                C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
                ((InterfaceC944250agB) c944270agD.mView).SB2(i, CertProviderManagerKt.findCert("bpea-linkmic_linkcontrolpresenter_onreceivereply_group", 1476788233), strLIZIZ, c954630awv.LJI);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onReceivePermitApplyNewArc,  ");
                sbLIZ2.append(c917110ZyP.hashCode());
                sbLIZ2.append("   channelId = ");
                sbLIZ2.append(C915980Zwa.LJI().LJIIJ().getChannelId());
                C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                ((InterfaceC944250agB) c944270agD.mView).DD1(i);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        InterfaceC954180awC interfaceC954180awC = (InterfaceC954180awC) obj;
        C917110ZyP c917110ZyP = (C917110ZyP) obj2;
        C963630bBR c963630bBR = ((C944270agD) aObjectS530S0100000_15.l0).LLJJJJJIL;
        if (c963630bBR != null) {
            c963630bBR.LIZIZ(UserService.getInstance().user().getCurrentUserId(), interfaceC954180awC, (C954930axP) c917110ZyP.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        EnumC944090afv enumC944090afv;
        C944270agD c944270agD = (C944270agD) aObjectS530S0100000_15.l0;
        C917110ZyP c917110ZyP = (C917110ZyP) obj2;
        c944270agD.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChannelChange,  ");
        sbLIZ.append(((C944570agh) c917110ZyP.LIZ).LIZ);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        T t = c944270agD.mView;
        if (t != 0) {
            if (((C944570agh) c917110ZyP.LIZ).LIZ) {
                if (((InterfaceC944250agB) t).GC2(4)) {
                    enumC944090afv = EnumC944090afv.AUDIENCE_IN_ROOM_NORMAL;
                } else {
                    enumC944090afv = EnumC944090afv.AUDIENCE_IN_ROOM_LINKMIC_ONLINE;
                }
                ((InterfaceC944250agB) c944270agD.mView).Qz2(false, new C952540atY(enumC944090afv, 3));
            } else {
                ((InterfaceC944250agB) t).YJ(1L);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        C944270agD c944270agD = (C944270agD) aObjectS530S0100000_15.l0;
        c944270agD.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionDestroyMessage,  message = ");
        sbLIZ.append(obj2);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        T t = c944270agD.mView;
        if (t != 0) {
            ((InterfaceC944250agB) t).sE0();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        C944270agD c944270agD = (C944270agD) aObjectS530S0100000_15.l0;
        c944270agD.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenUserListMessage,  message = ");
        sbLIZ.append(obj2);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (c944270agD.mView != 0) {
            ((InterfaceC944250agB) c944270agD.mView).EM1(C915980Zwa.LJI().LIZ().getEnterFrom(), null, Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        Context context = (Context) obj;
        PerceptionDialogInfo perceptionDialogInfo = (PerceptionDialogInfo) obj2;
        String str = perceptionDialogInfo.violationDetailUrl;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, perceptionDialogInfo.violationDetailUrl);
        }
        C0THQ c0thq = ((C923650a8x) aObjectS530S0100000_15.l0).LLJJJ;
        if (c0thq != null) {
            c0thq.LIZLLL = true;
            c0thq.LIZJ(201);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        C0THQ c0thq = ((C923650a8x) aObjectS530S0100000_15.l0).LLJJJ;
        if (c0thq != null) {
            c0thq.LIZLLL = true;
            c0thq.LIZJ(202);
        }
        C0THQ c0thq2 = ((C923650a8x) aObjectS530S0100000_15.l0).LLJJJ;
        if (c0thq2 != null) {
            c0thq2.LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        C917110ZyP c917110ZyP = (C917110ZyP) obj2;
        C946660ak4.LJFF.put(((C946680ak6) c917110ZyP.LIZ).LIZ, Boolean.TRUE);
        C946660ak4 c946660ak4 = (C946660ak4) aObjectS530S0100000_15.l0;
        C946630ak1 c946630ak1LIZ = C946660ak4.LIZ(c946660ak4.LIZJ, ((C946680ak6) c917110ZyP.LIZ).LIZ);
        if (c946630ak1LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifySurfaceViewAdded, currLinkMicId = ");
            sbLIZ.append(c946630ak1LIZ.getLinkMicId());
            C20441214yg.LJIIIZ("MultiHostGuestWindowView", C2188811AlT.LIZIZ(sbLIZ));
            c946630ak1LIZ.N0();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        Context context = (Context) obj;
        PerceptionDialogInfo perceptionDialogInfo = (PerceptionDialogInfo) obj2;
        String str = perceptionDialogInfo.violationDetailUrl;
        if (str != null && str.length() != 0) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, perceptionDialogInfo.violationDetailUrl);
        }
        C0THQ c0thq = ((C923760a98) aObjectS530S0100000_15.l0).copyrightPerceptionHelper;
        if (c0thq != null) {
            c0thq.LIZLLL = true;
            c0thq.LIZJ(201);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        C0THQ c0thq = ((C923760a98) aObjectS530S0100000_15.l0).copyrightPerceptionHelper;
        if (c0thq != null) {
            c0thq.LIZLLL = true;
            c0thq.LIZJ(202);
        }
        C0THQ c0thq2 = ((C923760a98) aObjectS530S0100000_15.l0).copyrightPerceptionHelper;
        if (c0thq2 != null) {
            c0thq2.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        ((MultiGuestPreviewFragment) aObjectS530S0100000_15.l0).eT((Boolean) obj, (Avatar) obj2);
        return null;
    }

    public static final Object invoke$8(AObjectS530S0100000_15 aObjectS530S0100000_15, Object obj, Object obj2) {
        InterfaceC923890a9L interfaceC923890a9L;
        Boolean bool = (Boolean) obj;
        Avatar avatar = (Avatar) obj2;
        if (LiveSdkMultiGuestSyncEffectRealtimeSetting.isEnable() && bool.booleanValue() && (interfaceC923890a9L = ((GuestMediaManageFragment) aObjectS530S0100000_15.l0).LLLLIILLL) != null) {
            interfaceC923890a9L.LJIIL();
        }
        GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS530S0100000_15.l0;
        guestMediaManageFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchAvatar selected=");
        sbLIZ.append(bool);
        C20441214yg.LIZIZ("GuestMediaManageFragment", C2188811AlT.LIZIZ(sbLIZ));
        guestMediaManageFragment.LLLIL = bool.booleanValue();
        View view = guestMediaManageFragment.LLJLLIL;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(guestMediaManageFragment.LLJLLIL, (ViewGroup) guestMediaManageFragment.LLJLLIL.getParent());
            guestMediaManageFragment.LLJLLIL = null;
        }
        if (guestMediaManageFragment.LLLIL) {
            C1324720kZq c1324720kZq = guestMediaManageFragment.LL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            C1126540fQC c1126540fQC = guestMediaManageFragment.LLILZIL;
            if (c1126540fQC != null) {
                C786410Ut5.LLJJI(c1126540fQC, 8);
                guestMediaManageFragment.LLILZIL.LIZLLL();
            }
            ImageView imageView = guestMediaManageFragment.LLJ;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
            guestMediaManageFragment.aS(avatar);
            if (avatar != null && avatar.status != 1) {
                guestMediaManageFragment.LLJLLIL = C935990aSr.LIZ(avatar, guestMediaManageFragment.getContext(), guestMediaManageFragment.LLLJL);
                if (guestMediaManageFragment.LLJJIJIL != null) {
                    C473410IhP.LIZIZ(new ARunnableS115S0100000_15(guestMediaManageFragment, 131));
                }
            }
            return null;
        }
        C1324720kZq c1324720kZq2 = guestMediaManageFragment.LL;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 0);
        }
        C1126540fQC c1126540fQC2 = guestMediaManageFragment.LLILZIL;
        if (c1126540fQC2 != null) {
            C786410Ut5.LLJJI(c1126540fQC2, 0);
            guestMediaManageFragment.LLILZIL.LJII();
        }
        if (!guestMediaManageFragment.LLLJ) {
            ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
            C1121670fIL.LJII(guestMediaManageFragment.LL, avatarThumb, new C1291830jin(0.74698794f));
            ImageView imageView2 = guestMediaManageFragment.LLJ;
            C1121670fIL.LJIILIIL(imageView2, avatarThumb, imageView2.getWidth(), guestMediaManageFragment.LLJ.getHeight(), R.drawable.el_);
            guestMediaManageFragment.LLLJ = true;
        }
        ImageView imageView3 = guestMediaManageFragment.LLJ;
        if (imageView3 != null) {
            C786410Ut5.LJZI(0, imageView3);
        }
        guestMediaManageFragment.aS(avatar);
        return null;
    }
}
