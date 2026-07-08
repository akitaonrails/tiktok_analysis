package Y;

import X.AbstractC920180a3M;
import X.AbstractC922920a7m;
import X.C01HE;
import X.C09JN;
import X.C0K04;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C1C7U;
import X.C20424814w2;
import X.C20441214yg;
import X.C20631086j;
import X.C20632086k;
import X.C2188811AlT;
import X.C919870a2r;
import X.C919990a33;
import X.C920000a34;
import X.C920030a37;
import X.C920060a3A;
import X.C920070a3B;
import X.C922940a7o;
import X.C923010a7v;
import X.C923050a7z;
import X.C924250a9v;
import X.C924810aAp;
import X.C925050aBD;
import X.C930480aJy;
import X.C944720agw;
import X.C944860ahA;
import X.C945060ahU;
import X.C956740b0K;
import X.C970920bNC;
import X.EnumC919060a1Y;
import X.EnumC943790afR;
import X.InterfaceC920110a3F;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public class AfS41S1200000_15 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("NoticeboardEntity@cd1e.getReviewStatusAndTriggerConfigUpdate$2");
        String str = ((NoticeboardEntity) afS41S1200000_15.l1).LLJJJJJIL.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTemplateReviewStatusById error, throwable=");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
        ((NoticeboardEntity) afS41S1200000_15.l1).LJJLIIIJLJLI((C20424814w2) afS41S1200000_15.l2, null, afS41S1200000_15.s0);
        C1C7U.LIZIZ("NoticeboardEntity@cd1e.getReviewStatusAndTriggerConfigUpdate$2");
    }

    public static final void accept$1(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("CompetitionIdentifierUtils@8fd.requestCompetitionInfo$2");
        ((C970920bNC) afS41S1200000_15.l1).LJJIIJ(afS41S1200000_15.s0);
        ((Function1) afS41S1200000_15.l2).invoke(obj);
        C1C7U.LIZIZ("CompetitionIdentifierUtils@8fd.requestCompetitionInfo$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$10(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        EnlargeScreenManageResponse.ResponseData responseData;
        List<PosIdentity> list;
        C1C7U.LIZ("ZoomAnchorPresenterV2@cbee.zoom$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData = (EnlargeScreenManageResponse.ResponseData) baseResponse.data) != null && (list = responseData.enlargedMultiPos) != null) {
            ((C920060a3A) afS41S1200000_15.l2).LIZ.LJJ(list);
        }
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l1;
        if (interfaceC920110a3F != null) {
            interfaceC920110a3F.LIZJ(afS41S1200000_15.s0);
        }
        C1C7U.LIZIZ("ZoomAnchorPresenterV2@cbee.zoom$1");
    }

    public static final void accept$11(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomAnchorPresenterV2@cbee.zoom$2");
        C920060a3A c920060a3A = (C920060a3A) afS41S1200000_15.l1;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l2;
        String str = afS41S1200000_15.s0;
        c920060a3A.LJJIFFI(EnumC919060a1Y.E_C_DEFAULT.ordinal(), interfaceC920110a3F, str, null, (Throwable) obj);
        C1C7U.LIZIZ("ZoomAnchorPresenterV2@cbee.zoom$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$12(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        EnlargeScreenManageResponse.ResponseData responseData;
        List<PosIdentity> list;
        C1C7U.LIZ("ZoomGuestPresenterV2@dbe4.guestZoom$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData = (EnlargeScreenManageResponse.ResponseData) baseResponse.data) != null && (list = responseData.enlargedMultiPos) != null) {
            ((C920030a37) afS41S1200000_15.l2).LIZ.LJJ(list);
        }
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l1;
        if (interfaceC920110a3F != null) {
            interfaceC920110a3F.LIZJ(afS41S1200000_15.s0);
        }
        C1C7U.LIZIZ("ZoomGuestPresenterV2@dbe4.guestZoom$1");
    }

    public static final void accept$13(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomModeratorPresenter@26.zoomGuestToMax$3");
        C920000a34 c920000a34 = (C920000a34) afS41S1200000_15.l1;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l2;
        String str = afS41S1200000_15.s0;
        c920000a34.LJJIFFI(EnumC919060a1Y.E_C_DEFAULT.ordinal(), interfaceC920110a3F, str, null, (Throwable) obj);
        C1C7U.LIZIZ("ZoomModeratorPresenter@26.zoomGuestToMax$3");
    }

    public static final void accept$14(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomModeratorPresenter@26.zoomGuestToMin$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C930480aJy.LIZ.getClass();
        int i = baseResponse.statusCode;
        if (i == 0) {
            C919870a2r.LIZJ(3, Long.valueOf(C01HE.LJI(afS41S1200000_15.s0)).toString(), "cancel_enlarge");
            InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l1;
            if (interfaceC920110a3F != null) {
                interfaceC920110a3F.LIZJ(afS41S1200000_15.s0);
            }
        } else {
            ((C920000a34) afS41S1200000_15.l2).LJJIFFI(i, (InterfaceC920110a3F) afS41S1200000_15.l1, afS41S1200000_15.s0, baseResponse.LJ.message, null);
        }
        C1C7U.LIZIZ("ZoomModeratorPresenter@26.zoomGuestToMin$2");
    }

    public static final void accept$15(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomModeratorPresenter@26.zoomGuestToMin$3");
        C920000a34 c920000a34 = (C920000a34) afS41S1200000_15.l1;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l2;
        String str = afS41S1200000_15.s0;
        c920000a34.LJJIFFI(EnumC919060a1Y.E_C_DEFAULT.ordinal(), interfaceC920110a3F, str, null, (Throwable) obj);
        C1C7U.LIZIZ("ZoomModeratorPresenter@26.zoomGuestToMin$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$16(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        EnlargeScreenManageResponse.ResponseData responseData;
        List<PosIdentity> list;
        C1C7U.LIZ("ZoomModeratorPresenterV2@8385.zoom$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData = (EnlargeScreenManageResponse.ResponseData) baseResponse.data) != null && (list = responseData.enlargedMultiPos) != null) {
            ((C920070a3B) afS41S1200000_15.l2).LIZ.LJJ(list);
        }
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l1;
        if (interfaceC920110a3F != null) {
            interfaceC920110a3F.LIZJ(afS41S1200000_15.s0);
        }
        C1C7U.LIZIZ("ZoomModeratorPresenterV2@8385.zoom$1");
    }

    public static final void accept$17(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomModeratorPresenterV2@8385.zoom$2");
        C920070a3B.LJJIII((C920070a3B) afS41S1200000_15.l1, (Throwable) obj, (InterfaceC920110a3F) afS41S1200000_15.l2, afS41S1200000_15.s0);
        C1C7U.LIZIZ("ZoomModeratorPresenterV2@8385.zoom$2");
    }

    public static final void accept$2(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("CompetitionIdentifierUtils@8fd.requestCompetitionInfo$3");
        Throwable th = (Throwable) obj;
        ((C970920bNC) afS41S1200000_15.l1).LJJIII(afS41S1200000_15.s0, th);
        ((Function1) afS41S1200000_15.l2).invoke(th);
        C1C7U.LIZIZ("CompetitionIdentifierUtils@8fd.requestCompetitionInfo$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        boolean z;
        long id;
        Long lValueOf;
        C1C7U.LIZ("AbsGameLinkUserManager@2f08.fetchUserList$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null) {
            AbstractC922920a7m abstractC922920a7m = (AbstractC922920a7m) afS41S1200000_15.l1;
            Function1 function1 = (Function1) afS41S1200000_15.l2;
            String str = afS41S1200000_15.s0;
            C922940a7o c922940a7o = (C922940a7o) abstractC922920a7m;
            c922940a7o.LJII().LJI(multiLiveGuestInfoList);
            if (function1 != null) {
                function1.invoke(c922940a7o.LJII());
            }
            c922940a7o.LJIIIIZZ().LJII(true);
            LinkMessage linkMessage = new LinkMessage();
            LinkerListChangeContent linkerListChangeContent = new LinkerListChangeContent();
            linkMessage.mListChangeContent = linkerListChangeContent;
            Iterator<LinkPlayerInfo> it2 = multiLiveGuestInfoList.onLineUsers.iterator();
            while (it2.hasNext()) {
                linkerListChangeContent.onLineUsers.add(C925050aBD.LIZIZ(it2.next()));
            }
            Iterator<LinkPlayerInfo> it3 = multiLiveGuestInfoList.waitingUsers.iterator();
            while (it3.hasNext()) {
                linkerListChangeContent.waitingUsers.add(C925050aBD.LIZIZ(it3.next()));
            }
            c922940a7o.LJIIIIZZ().LJI(linkMessage);
            ArrayList arrayList = new ArrayList();
            for (LinkPlayerInfo linkPlayerInfo : c922940a7o.LJII().LIZLLL()) {
                final long id2 = linkPlayerInfo.mUser.getId();
                final String str2 = linkPlayerInfo.mInteractIdStr;
                final int i = linkPlayerInfo.LIZ;
                arrayList.add(new Object(id2, str2, i) { // from class: X.0a7I
                    public final long LIZ;
                    public final String LIZIZ;
                    public final int LIZJ;

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("userId=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(", linkmicId='");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append("', status=");
                        sbLIZ.append(this.LIZJ);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = id2;
                        this.LIZIZ = str2;
                        this.LIZJ = i;
                    }
                });
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject();
                    C0K04.LJFF("source", str, jSONObject);
                    C0K04.LJFF("user_list", arrayList.toString(), jSONObject);
                    C944720agw.LJIIJJI("refresh_user_list", jSONObject);
                } else {
                    "Failed requirement.".toString();
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            List<LinkPlayerInfo> listLIZLLL = c922940a7o.LJII().LIZLLL();
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJFF("response", listLIZLLL.toString(), jSONObject2);
            C0K04.LJ("cost", System.currentTimeMillis() - C944720agw.LIZ, jSONObject2);
            C944720agw.LJIIJJI("list_succeed", jSONObject2);
            ((HashSet) C924810aAp.LJ().LJJIFFI).clear();
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            if (C923010a7v.LIZ(c922940a7o.LJII()) > 0) {
                z = true;
            } else {
                z = false;
            }
            c924810aApLJ.LJIIIZ(z);
            C924810aAp.LJ().LJJII = C923010a7v.LIZ(c922940a7o.LJII());
            C924250a9v.LIZ().LJJIII(C923010a7v.LIZ(c922940a7o.LJII()));
            for (LinkPlayerInfo linkPlayerInfo2 : c922940a7o.LJII().LIZLLL()) {
                C20631086j c20631086j = C20632086k.LIZ;
                User user = linkPlayerInfo2.mUser;
                if (user != null) {
                    id = user.getId();
                } else {
                    id = 0;
                }
                c20631086j.LIZLLL(id, linkPlayerInfo2.mInteractIdStr);
                int i2 = linkPlayerInfo2.LIZ;
                if (i2 == 2 || (i2 == 1 && linkPlayerInfo2.mRoleType == 4)) {
                    Set<Long> set = C924810aAp.LJ().LJJIFFI;
                    User user2 = linkPlayerInfo2.mUser;
                    if (user2 != null) {
                        lValueOf = Long.valueOf(user2.getId());
                    } else {
                        lValueOf = null;
                    }
                    ((HashSet) set).add(lValueOf);
                }
                if (linkPlayerInfo2.mRoleType == 1) {
                    C924810aAp.LJ().LJIILJJIL = linkPlayerInfo2.mInteractIdStr;
                }
            }
            if (TextUtils.equals(str, "message_linked_list_change")) {
                c922940a7o.LJI(4);
            } else {
                c922940a7o.LJI(1);
            }
            boolean zEquals = TextUtils.equals(str, "enter_room");
            if (zEquals && C924810aAp.LJ().LJJII > 0) {
                C923050a7z.LIZJ("live_play");
            }
            c922940a7o.LJIIIZ(zEquals);
        }
        ((AbstractC922920a7m) afS41S1200000_15.l1).LLIZ = null;
        C1C7U.LIZIZ("AbsGameLinkUserManager@2f08.fetchUserList$1");
    }

    public static final void accept$4(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("BaseLayoutAction@e477.zoom$2");
        AbstractC920180a3M.LJIIIIZZ((AbstractC920180a3M) afS41S1200000_15.l1, (Throwable) obj, (InterfaceC920110a3F) afS41S1200000_15.l2, afS41S1200000_15.s0);
        C1C7U.LIZIZ("BaseLayoutAction@e477.zoom$2");
    }

    public static final void accept$5(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C945060ahU c945060ahU;
        C1C7U.LIZ("ToolbarCoHostBehavior@a5e6.onCohostAvatarAnimationShow$animationListener$1$onStart$1");
        C11JF c11jf = ((C944860ahA) afS41S1200000_15.l1).LLJL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (((EnumC943790afR) afS41S1200000_15.l2) == EnumC943790afR.FRIEND_LIVING) {
            DataChannel dataChannel = ((C944860ahA) afS41S1200000_15.l1).LLJJLIIIJLLLLLLLZ;
            if (dataChannel != null && (c945060ahU = (C945060ahU) dataChannel.gg0(C956740b0K.class)) != null) {
                c945060ahU.LIZJ = false;
            }
            C11JF c11jf2 = ((C944860ahA) afS41S1200000_15.l1).LLJLIL;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            ((C944860ahA) afS41S1200000_15.l1).LLJLIL = (C11JF) C11NZ.LJLJJLL(20L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS48S1100000_15((C944860ahA) afS41S1200000_15.l1, afS41S1200000_15.s0, 4));
            ((C944860ahA) afS41S1200000_15.l1).LLL.getClass();
            C20441214yg.LIZIZ("CoHostFriendNoticeService", "onCoHostFriendNoticeDismiss");
        }
        C1C7U.LIZIZ("ToolbarCoHostBehavior@a5e6.onCohostAvatarAnimationShow$animationListener$1$onStart$1");
    }

    public static final void accept$6(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomAnchorPresent@8a17.zoomGuestToMin$3");
        C919990a33 c919990a33 = (C919990a33) afS41S1200000_15.l1;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l2;
        String str = afS41S1200000_15.s0;
        c919990a33.LJJIFFI(EnumC919060a1Y.E_C_DEFAULT.ordinal(), interfaceC920110a3F, str, null, (Throwable) obj);
        C1C7U.LIZIZ("ZoomAnchorPresent@8a17.zoomGuestToMin$3");
    }

    public static final void accept$7(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomAnchorPresent@8a17.zoomAnchorToMax$3");
        C919990a33 c919990a33 = (C919990a33) afS41S1200000_15.l1;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l2;
        String str = afS41S1200000_15.s0;
        c919990a33.LJJIFFI(EnumC919060a1Y.E_C_DEFAULT.ordinal(), interfaceC920110a3F, str, null, (Throwable) obj);
        C1C7U.LIZIZ("ZoomAnchorPresent@8a17.zoomAnchorToMax$3");
    }

    public static final void accept$8(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomAnchorPresent@8a17.zoomAnchorToMin$3");
        C919990a33 c919990a33 = (C919990a33) afS41S1200000_15.l1;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l2;
        String str = afS41S1200000_15.s0;
        c919990a33.LJJIFFI(EnumC919060a1Y.E_C_DEFAULT.ordinal(), interfaceC920110a3F, str, null, (Throwable) obj);
        C1C7U.LIZIZ("ZoomAnchorPresent@8a17.zoomAnchorToMin$3");
    }

    public static final void accept$9(AfS41S1200000_15 afS41S1200000_15, Object obj) {
        C1C7U.LIZ("ZoomAnchorPresent@8a17.zoomGuestToMax$3");
        C919990a33 c919990a33 = (C919990a33) afS41S1200000_15.l1;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS41S1200000_15.l2;
        String str = afS41S1200000_15.s0;
        c919990a33.LJJIFFI(EnumC919060a1Y.E_C_DEFAULT.ordinal(), interfaceC920110a3F, str, null, (Throwable) obj);
        C1C7U.LIZIZ("ZoomAnchorPresent@8a17.zoomGuestToMax$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS41S1200000_15(X.InterfaceC920110a3F r2, X.C920000a34 r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 13: goto L10;
                case 14: goto L5;
                case 15: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.s0 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS41S1200000_15.<init>(X.0a3F, X.0a34, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS41S1200000_15(X.C920060a3A r2, X.InterfaceC920110a3F r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 10 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l1 = r2
            r0.l2 = r3
            r0.s0 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l1 = r3
            r0.s0 = r4
            r0.l2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS41S1200000_15.<init>(X.0a3A, X.0a3F, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS41S1200000_15(X.InterfaceC920110a3F r2, X.C920070a3B r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 16 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.s0 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r4
            r0.l2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS41S1200000_15.<init>(X.0a3F, X.0a3B, java.lang.String, int):void");
    }

    public AfS41S1200000_15(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
