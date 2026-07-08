package Y;

import X.AbstractC1100450ek7;
import X.AbstractC1110800f0o;
import X.AbstractC1136060ffY;
import X.AbstractC21673619ry;
import X.C0HZQ;
import X.C0IJT;
import X.C0KVU;
import X.C1086690eNv;
import X.C1086830eO9;
import X.C1094360eaI;
import X.C1095140ebY;
import X.C1101370elb;
import X.C1109770ez9;
import X.C1113510f5B;
import X.C1114840f7K;
import X.C1116210f9X;
import X.C1117370fBP;
import X.C1119660fF6;
import X.C1119740fFE;
import X.C1120150fFt;
import X.C1120950fHB;
import X.C1124220fMS;
import X.C1124240fMU;
import X.C1124260fMW;
import X.C1124290fMZ;
import X.C1124490fMt;
import X.C1124560fN0;
import X.C1125140fNw;
import X.C1125150fNx;
import X.C1128460fTI;
import X.C1128710fTh;
import X.C1128760fTm;
import X.C1128860fTw;
import X.C1130100fVw;
import X.C1130510fWb;
import X.C1135800ff8;
import X.C1143030fqn;
import X.C1143200fr4;
import X.C1143210fr5;
import X.C1143240fr8;
import X.C1144580ftI;
import X.C1146260fw0;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C150300hp;
import X.C158B;
import X.C176600m4;
import X.C1819620xS4;
import X.C194309110h;
import X.C195900pB;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C340280DVq;
import X.C384000F3u;
import X.C474500IjA;
import X.C495520Jby;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C784440Upu;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1120860fH2;
import X.EnumC1130940fXI;
import X.InterfaceC1094160eZy;
import X.InterfaceC1118070fCX;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftGalleryMetrics;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.impl.revenue.starcomment.manage.AudienceStarCommentManageDialog;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.GiftSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.GiftPollWarnDialog;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftBatchSendTTPSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMusicTabPlacementSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class ACListenerS83S0300000_17 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        String str;
        Long lValueOf;
        String secUid;
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        GiftGalleryEntranceResponse.Data data = (GiftGalleryEntranceResponse.Data) aCListenerS83S0300000_17.l0;
        Boolean boolValueOf = null;
        if (data != null) {
            str = data.giftGalleryMainPageSchemeUrl;
        } else {
            str = null;
        }
        C1143030fqn c1143030fqn = (C1143030fqn) aCListenerS83S0300000_17.l1;
        Context context = c1143030fqn.LLJJIII;
        Long lValueOf2 = Long.valueOf(c1143030fqn.LL.LJFF.getId());
        User user = (User) aCListenerS83S0300000_17.l2;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        String strLIZLLL = C0KVU.LIZLLL(user);
        if (user != null) {
            secUid = user.getSecUid();
        } else {
            secUid = null;
        }
        C495520Jby c495520Jby = new C495520Jby(str);
        c495520Jby.LIZJ("entrance", "profile_card");
        if (lValueOf != null) {
            c495520Jby.LIZIZ(lValueOf.longValue(), "gift_to_user_id");
        }
        if (lValueOf2 != null) {
            c495520Jby.LIZIZ(lValueOf2.longValue(), "gift_to_room_id");
        }
        if (secUid != null) {
            c495520Jby.LIZJ("gift_to_sec_user_id", secUid);
        }
        if (strLIZLLL != null) {
            c495520Jby.LIZJ("gift_to_user_nick_name", strLIZLLL);
        }
        C1125150fNx.LIZ(c495520Jby, lValueOf);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
        GiftGalleryEntranceResponse.Data data2 = (GiftGalleryEntranceResponse.Data) aCListenerS83S0300000_17.l0;
        if (data2 != null) {
            numValueOf = Integer.valueOf((int) data2.lightedGiftCount);
        } else {
            numValueOf = null;
        }
        GiftGalleryEntranceResponse.Data data3 = (GiftGalleryEntranceResponse.Data) aCListenerS83S0300000_17.l0;
        if (data3 != null) {
            numValueOf2 = Integer.valueOf((int) data3.totalGiftCount);
        } else {
            numValueOf2 = null;
        }
        DataChannel dataChannel = ((C1143030fqn) aCListenerS83S0300000_17.l1).LLILZIL;
        long id = ((User) aCListenerS83S0300000_17.l2).getId();
        GiftGalleryEntranceResponse.Data data4 = (GiftGalleryEntranceResponse.Data) aCListenerS83S0300000_17.l0;
        if (data4 != null) {
            boolValueOf = Boolean.valueOf(data4.allSponsored);
        }
        GiftGalleryMetrics giftGalleryMetricsLIZJ = C1125140fNw.LIZJ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_gift_gallery_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIIIIZZ();
        C1125140fNw.LIZ(c474500IjALIZ, id);
        if (numValueOf != null && Intrinsics.LJFF(numValueOf, numValueOf2)) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_lit_up");
        c474500IjALIZ.LJJII(numValueOf, "lit_progress");
        c474500IjALIZ.LJJII(numValueOf2, "lit_target");
        c474500IjALIZ.LJJII(Integer.valueOf(giftGalleryMetricsLIZJ.isFirstTimeUser), "is_first_time_user");
        c474500IjALIZ.LJJII(Integer.valueOf(giftGalleryMetricsLIZJ.isNewToGallery), "is_new_to_gallery");
        c474500IjALIZ.LJJII(Integer.valueOf(C176600m4.LIZIZ(boolValueOf) ? 1 : 0), "is_gallery_all_lit_up");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$1(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) throws JSONException {
        String str;
        long j;
        long j2;
        GiftsInfo giftsInfo;
        GiftsInfo.BatchGiftInfo batchGiftInfo;
        GiftsInfo giftsInfo2;
        GiftsInfo.BatchGiftInfo batchGiftInfo2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger reason ");
        C1143200fr4 c1143200fr4 = (C1143200fr4) aCListenerS83S0300000_17.l0;
        if (c1143200fr4 != null) {
            str = c1143200fr4.LL;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("batchsend", C2188811AlT.LIZIZ(sbLIZ));
        C1143210fr5 c1143210fr5 = (C1143210fr5) aCListenerS83S0300000_17.l1;
        C1143240fr8 c1143240fr8 = (C1143240fr8) aCListenerS83S0300000_17.l2;
        Context context = c1143210fr5.LL.getContext();
        C1143200fr4 c1143200fr42 = (C1143200fr4) aCListenerS83S0300000_17.l0;
        if (LiveGiftBatchSendTTPSetting.showMoreForTTP()) {
            if (!C1143210fr5.I5(c1143240fr8, context, c1143200fr42)) {
                C784440Upu.LIZ().LIZIZ(new C1130510fWb(c1143240fr8.LIZ, c1143240fr8.LIZJ));
            }
        } else {
            Keva keva = C1124560fN0.LIZ;
            long j3 = keva.getLong(C1124560fN0.LIZJ(), 0L);
            GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
            if (giftListResult != null && (giftsInfo2 = giftListResult.giftsInfo) != null && (batchGiftInfo2 = giftsInfo2.batchGiftInfo) != null) {
                j = batchGiftInfo2.dismissExpireSeconds;
            } else {
                j = 0;
            }
            int i = (int) (j / ((long) 86400));
            GiftListResult giftListResult2 = GiftManager.inst().getGiftListResult();
            if (giftListResult2 != null && (giftsInfo = giftListResult2.giftsInfo) != null && (batchGiftInfo = giftsInfo.batchGiftInfo) != null) {
                j2 = batchGiftInfo.consumeLimit;
            } else {
                j2 = 0;
            }
            if (j > 0 && C158B.LIZJ() - j3 > j && c1143240fr8.LJ > j2) {
                View viewSd = C786410Ut5.Sd(R.layout.go9, C786410Ut5.ne(context), null);
                TextView textView = (TextView) viewSd.findViewById(R.id.ftg);
                C0HZQ c0hzq = (C0HZQ) viewSd.findViewById(R.id.fsv);
                textView.setText(C497740JfY.LJIIL(2131755801, i, String.valueOf(i)));
                ImageView imageView = new ImageView(context);
                C1819620xS4.LIZ().LJIIIZ(c1143240fr8.LIZIZ).LJJI(imageView);
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJIIIZ = new C340280DVq(context, imageView);
                C985403tE.LIZ(c1397580mTM, new AwS226S0300000_17(c1143200fr42, c1143240fr8, c0hzq, 3));
                C384000F3u.LIZ(c1397580mTM, viewSd);
                c1397580mTM.LJI(C497740JfY.LJIJJ(2131851338, c1143240fr8.LIZLLL, Integer.valueOf(c1143240fr8.LIZJ)));
                long j4 = c1143240fr8.LJ;
                c1397580mTM.LIZIZ(C497740JfY.LJIIL(2131755802, (int) j4, String.valueOf(j4)));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
                C1128760fTm.LJIIJ.LJJIIJ(c1143240fr8.LIZJ, c1143200fr42.LL, c1143240fr8.LIZ, "large_amount_confirmation");
                keva.storeBoolean(C1124560fN0.LIZIZ(), true);
            } else if (!C1143210fr5.I5(c1143240fr8, context, c1143200fr42)) {
                C784440Upu.LIZ().LIZIZ(new C1130510fWb(c1143240fr8.LIZ, c1143240fr8.LIZJ));
            }
        }
        if (!C1101370elb.LIZ.LJIILJJIL("live_gift_overload_downgrade_combo_sound_enable")) {
            C194309110h.LIZIZ(1);
        }
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        C1143240fr8 c1143240fr82 = (C1143240fr8) aCListenerS83S0300000_17.l2;
        long j5 = c1143240fr82.LIZ;
        int i2 = c1143240fr82.LIZJ;
        String str2 = ((C1143200fr4) aCListenerS83S0300000_17.l0).LL;
        c1128760fTm.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j5);
        if (giftFindGiftById != null) {
            C1135800ff8.LJ(giftFindGiftById, 0L, jSONObject, jSONObject3);
        }
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_batch_gift_send_click");
        c1128760fTm.LIZLLL(c474500IjALIZ, j5, c1128760fTm.LIZ, str2);
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "batch_send_num");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onClick$10(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        MutableLiveData<Integer> mutableLiveData;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL;
        MutableLiveData<GiftPanelBanner> mutableLiveData2;
        Integer numLIZJ;
        MutableLiveData<EnumC1130940fXI> mutableLiveData3;
        C1128710fTh c1128710fTh;
        C1124490fMt c1124490fMt = (C1124490fMt) aCListenerS83S0300000_17.l0;
        boolean zLJJJJIZL = C500260Jjc.LJJJJIZL(((C1124220fMS) aCListenerS83S0300000_17.l1).LLILZ);
        C1124240fMU c1124240fMU = (C1124240fMU) aCListenerS83S0300000_17.l2;
        c1124490fMt.getClass();
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (c1124240fMU.LIZJ == 18) {
            int iLIZLLL = C1124260fMW.LIZLLL();
            LiveGiftMusicTabPlacementSetting liveGiftMusicTabPlacementSetting = LiveGiftMusicTabPlacementSetting.INSTANCE;
            if (iLIZLLL < liveGiftMusicTabPlacementSetting.firstExposureThreshold()) {
                C1124260fMW.LJFF().storeBoolean(C1124260fMW.LIZ(), true);
            } else if (iLIZLLL < liveGiftMusicTabPlacementSetting.secondExposureThreshold()) {
                C1124260fMW.LJFF().storeBoolean(C1124260fMW.LIZIZ(), true);
            }
        }
        int iXQ2 = 0;
        Long lValueOf = null;
        List<Long> list = null;
        if (iIntValue == c1124490fMt.LLILZIL) {
            if (iIntValue == 1) {
                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                EnumC1130940fXI enumC1130940fXI = c1124240fMU.LJIIJJI;
                String str = c1124240fMU.LJII;
                C1124290fMZ c1124290fMZ = c1124490fMt.LLILLL;
                if (c1124290fMZ != null) {
                    AbstractC1100450ek7 abstractC1100450ek7 = c1124290fMZ.LLIZLLLIL;
                    if (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null || (list = c1128710fTh.LLJL) == null) {
                        list = C13BV.INSTANCE;
                    }
                }
                c1128760fTm.LJJIJ(enumC1130940fXI, str, list);
                EnumC1130940fXI enumC1130940fXINextState = c1124240fMU.LJIIJJI.nextState();
                c1124240fMU.LJIIJJI = enumC1130940fXINextState;
                if (c1124490fMt.LL != null) {
                    iXQ2 = GiftPanelLeafViewModel.xQ2(iIntValue, enumC1130940fXINextState);
                }
                c1124240fMU.LJIIIIZZ = iXQ2;
                GiftPanelLeafViewModel giftPanelLeafViewModel = c1124490fMt.LL;
                if (giftPanelLeafViewModel != null && (mutableLiveData3 = giftPanelLeafViewModel.LLJJJIL) != null) {
                    mutableLiveData3.setValue(c1124240fMU.LJIIJJI);
                }
                c1124490fMt.LLLI(iIntValue);
                return;
            }
            return;
        }
        GiftPanelBanner giftPanelBanner = c1124240fMU.LJ;
        View view2 = c1124490fMt.LLILZ;
        if (view2 != null) {
            if (view2 instanceof TextView) {
                Context context = view.getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context)) != null) {
                    ((TextView) c1124490fMt.LLILZ).setTextColor(numLIZJ.intValue());
                }
            } else {
                C786410Ut5.T4(view2, 0.5f);
            }
        }
        c1124490fMt.LLILZ = view;
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(ColorProtector.parseColor("#E6FFFFFF"));
        } else if (view instanceof ImageView) {
            C786410Ut5.V4((ImageView) view, 0.9f);
        }
        C1124290fMZ c1124290fMZ2 = c1124490fMt.LLILLL;
        if (c1124290fMZ2 != null && (giftPanelLeafViewModelLJJJJIZL = c1124290fMZ2.LJJJJIZL()) != null && (mutableLiveData2 = giftPanelLeafViewModelLJJJJIZL.LL) != null) {
            mutableLiveData2.setValue(giftPanelBanner);
        }
        GiftPanelLeafViewModel giftPanelLeafViewModel2 = c1124490fMt.LL;
        if (giftPanelLeafViewModel2 != null && (mutableLiveData = giftPanelLeafViewModel2.LLILZ) != null) {
            mutableLiveData.setValue(Integer.valueOf(iIntValue));
        }
        C1130100fVw.LIZ.getClass();
        C1128760fTm c1128760fTm2 = C1128760fTm.LJIIJ;
        C1128760fTm.LJIIJ.getClass();
        c1124490fMt.LLLI(iIntValue);
        if (iIntValue == 15) {
            InterfaceC1094160eZy.u1.LJFF(Boolean.FALSE);
            ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Wt2();
        }
        if (c1124240fMU.LIZJ == 16) {
            C1128860fTw.LIZ = System.currentTimeMillis();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_backpack_entrance_click");
            C1128860fTw.LJ(c474500IjALIZ);
            C1128460fTI.LIZ(c474500IjALIZ, null);
            c474500IjALIZ.LJJII(Integer.valueOf(zLJJJJIZL ? 1 : 0), "is_red_dot");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        }
        int i = c1124240fMU.LIZJ;
        int i2 = c1124240fMU.LIZLLL;
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (c1095140ebYUw0 != null) {
            lValueOf = Long.valueOf(c1095140ebYUw0.LIZ | 0);
        }
        String strLJII = C1128460fTI.LJII();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_panel_tab_click");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJIIZI(C150300hp.LIZ());
        c474500IjALIZ2.LJJII(Integer.valueOf(i), "tab_id");
        c474500IjALIZ2.LJJII(C1128460fTI.LJIIJ(Integer.valueOf(i), ""), "tab_name");
        c474500IjALIZ2.LJJII(Integer.valueOf(i2), "tab_location");
        c474500IjALIZ2.LJJII(Integer.valueOf(zLJJJJIZL ? 1 : 0), "is_reddot");
        if (c1094360eaIHP != null) {
            iXQ2 = c1094360eaIHP.LIZ;
        }
        c474500IjALIZ2.LJJII(Integer.valueOf(iXQ2), "user_level");
        c474500IjALIZ2.LJJII("click", "select_type");
        c474500IjALIZ2.LJJII(lValueOf, "fans_level");
        c474500IjALIZ2.LJJII(strLJII, "fans_status");
        c474500IjALIZ2.LIZ();
        if (!zLJJJJIZL) {
            return;
        }
        int i3 = c1124240fMU.LIZJ;
        int i4 = c1124240fMU.LIZLLL;
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_panel_tab_reddot_click");
        c474500IjALIZ3.LJIL();
        c474500IjALIZ3.LJJIIZI(C150300hp.LIZ());
        c474500IjALIZ3.LJJII(Integer.valueOf(i3), "tab_id");
        c474500IjALIZ3.LJJII(C1128460fTI.LJIIJ(Integer.valueOf(i3), ""), "tab_name");
        c474500IjALIZ3.LJJII(Integer.valueOf(i4), "tab_location");
        c474500IjALIZ3.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r0 = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fportal_go%2Ftemplate.js&gravity=bottom&height=684rpx&landscape_screen_size_as_portrait=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Ftreasure_box";
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$11(Y.ACListenerS83S0300000_17 r16, android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS83S0300000_17.onClick$11(Y.ACListenerS83S0300000_17, android.view.View):void");
    }

    public static final void onClick$12(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        C1119740fFE c1119740fFE = (C1119740fFE) aCListenerS83S0300000_17.l0;
        int[] iArr = (int[]) aCListenerS83S0300000_17.l1;
        C1119660fF6 c1119660fF6 = (C1119660fF6) aCListenerS83S0300000_17.l2;
        c1119740fFE.LL = 8;
        c1119740fFE.dismiss();
        long jUptimeMillis = SystemClock.uptimeMillis();
        c1119660fF6.LIZIZ.getRootView().dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iArr[0] + (c1119660fF6.LIZIZ.getWidth() / 2), iArr[1] + (c1119660fF6.LIZIZ.getHeight() / 2), 0));
        c1119660fF6.LIZIZ.getRootView().dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, iArr[0] + (c1119660fF6.LIZIZ.getWidth() / 2), iArr[1] + (c1119660fF6.LIZIZ.getHeight() / 2), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[PHI: r6
      0x001e: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:7:0x0018, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a A[PHI: r6
      0x001a: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:7:0x0018, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$13(Y.ACListenerS83S0300000_17 r15, android.view.View r16) {
        /*
            r0 = r15
            java.lang.Object r4 = r0.l0
            X.0f5B r4 = (X.C1113510f5B) r4
            java.lang.Object r5 = r0.l1
            X.0f0o r5 = (X.AbstractC1110800f0o) r5
            java.lang.Object r1 = r0.l2
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$TagItem r1 = (com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) r1
            com.bytedance.android.livesdk.model.message.common.Text r2 = r1.tagText
            java.lang.String r1 = ""
            if (r2 == 0) goto L17
            java.lang.String r6 = r2.key
            if (r6 != 0) goto L1a
        L17:
            r6 = r1
            if (r2 == 0) goto L1e
        L1a:
            java.lang.String r7 = r2.key
            if (r7 != 0) goto L1f
        L1e:
            r7 = r1
        L1f:
            r8 = 1
            java.lang.String r9 = ""
            java.lang.String r10 = "negative_page_fixed_icon"
            java.lang.String r11 = "tag_none_cta"
            r12 = 0
            r4.getClass()
            java.util.List r2 = X.C1113510f5B.LJ(r5)
            int r13 = r2.size()
            java.lang.Object r2 = r0.l0
            X.0f5B r2 = (X.C1113510f5B) r2
            java.lang.Object r3 = r0.l1
            X.0f0o r3 = (X.AbstractC1110800f0o) r3
            r2.getClass()
            boolean r2 = r3 instanceof X.C234500vP
            if (r2 != 0) goto L72
            boolean r2 = r3 instanceof X.C239500wD
            if (r2 != 0) goto L72
            boolean r2 = r3 instanceof X.C1111000f18
            if (r2 != 0) goto L72
            boolean r2 = r3 instanceof X.C180400mg
            if (r2 != 0) goto L72
            boolean r2 = r3 instanceof X.C181000mm
            if (r2 != 0) goto L72
            java.util.List r3 = X.C1113510f5B.LJ(r3)
            r2 = 3
            java.util.List r2 = X.C13LP.LL(r3, r2)
        L5a:
            int r14 = r2.size()
            java.lang.Object r2 = r0.l2
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$TagItem r2 = (com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) r2
            java.lang.String r15 = r2.bizName
            r16 = 128(0x80, float:1.8E-43)
            X.C1113510f5B.LJIIL(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r0.l2
            com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon$CreatorSuccessInfo$TagItem r4 = (com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) r4
            boolean r2 = r4.disableCrmClick
            if (r2 == 0) goto L75
            return
        L72:
            X.13BV r2 = X.C13BV.INSTANCE
            goto L5a
        L75:
            java.lang.Object r3 = r0.l0
            X.0f5B r3 = (X.C1113510f5B) r3
            java.lang.Object r2 = r0.l1
            X.0f0o r2 = (X.AbstractC1110800f0o) r2
            com.bytedance.android.livesdk.model.message.common.Text r0 = r4.tagText
            if (r0 == 0) goto L86
            java.lang.String r0 = r0.key
            if (r0 == 0) goto L86
            r1 = r0
        L86:
            java.lang.String r0 = "negative_page_fixed_icon"
            r3.LJII(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS83S0300000_17.onClick$13(Y.ACListenerS83S0300000_17, android.view.View):void");
    }

    public static final void onClick$14(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        C20441214yg.LIZIZ("NewMvpContainer", "guideContainer click");
        ((ALAdapterS12S0200000_17) aCListenerS83S0300000_17.l0).LIZ$0((C1144580ftI) aCListenerS83S0300000_17.l1);
        Function1<? super Boolean, Unit> function1 = ((C1146260fw0) aCListenerS83S0300000_17.l2).LL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void onClick$15(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        C20441214yg.LIZIZ("NewMvpContainer", "guideTextContent click");
        ((ALAdapterS12S0200000_17) aCListenerS83S0300000_17.l0).LIZ$0((C1144580ftI) aCListenerS83S0300000_17.l1);
        Function1<? super Boolean, Unit> function1 = ((C1146260fw0) aCListenerS83S0300000_17.l2).LL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void onClick$2(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        String str;
        ISendCommentEvent.Sender sender;
        ((ICommentService) C1161920gLG.LIZJ(ICommentService.class)).bF1((QuickCommentWidget) aCListenerS83S0300000_17.l0);
        Room room = ((QuickCommentWidget) aCListenerS83S0300000_17.l0).LLILLL;
        if (room != null) {
            EmoteModel emoteModel = (EmoteModel) aCListenerS83S0300000_17.l1;
            C1114840f7K c1114840f7K = (C1114840f7K) aCListenerS83S0300000_17.l2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(emoteModel);
            ICommentService iCommentService = (ICommentService) C1161920gLG.LIZJ(ICommentService.class);
            long id = room.getId();
            C195900pB c195900pB = c1114840f7K.LLILLL;
            if (c195900pB != null) {
                str = c195900pB.LIZLLL;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "1")) {
                sender = ISendCommentEvent.Sender.QUICKEMOTECOMMENT;
            } else {
                sender = ISendCommentEvent.Sender.QUICKCOMMENT;
            }
            iCommentService.Pv1(id, arrayList, sender);
        }
        QuickCommentWidget quickCommentWidget = (QuickCommentWidget) aCListenerS83S0300000_17.l0;
        if (!quickCommentWidget.isShowing()) {
            quickCommentWidget.x1();
        } else {
            quickCommentWidget.animateHide();
        }
    }

    public static final void onClick$3(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        if (((C1117370fBP) ((AbstractC21673619ry) aCListenerS83S0300000_17.l0)).LL.indexOf(ListProtector.get((List) aCListenerS83S0300000_17.l1, ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL)) >= 0) {
            ((C1116210f9X) ListProtector.get((List) aCListenerS83S0300000_17.l1, ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL)).LLJJ = false;
            AbstractC21673619ry abstractC21673619ry = (AbstractC21673619ry) aCListenerS83S0300000_17.l0;
            abstractC21673619ry.notifyItemChanged(((C1117370fBP) abstractC21673619ry).LL.indexOf(ListProtector.get((List) aCListenerS83S0300000_17.l1, ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL)), "");
            AudienceStarCommentManageDialog audienceStarCommentManageDialog = (AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2;
            audienceStarCommentManageDialog.LLJIJIL = (audienceStarCommentManageDialog.LLJIJIL + 1) % ((List) aCListenerS83S0300000_17.l1).size();
            ((C1116210f9X) ListProtector.get((List) aCListenerS83S0300000_17.l1, ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL)).LLJJ = true;
            AudienceStarCommentManageDialog audienceStarCommentManageDialog2 = (AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2;
            audienceStarCommentManageDialog2.LLJILJIL = ((C1116210f9X) ListProtector.get((List) aCListenerS83S0300000_17.l1, audienceStarCommentManageDialog2.LLJIJIL)).LL;
            AbstractC21673619ry abstractC21673619ry2 = (AbstractC21673619ry) aCListenerS83S0300000_17.l0;
            abstractC21673619ry2.notifyItemChanged(((C1117370fBP) abstractC21673619ry2).LL.indexOf(ListProtector.get((List) aCListenerS83S0300000_17.l1, ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL)), "");
            ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).UR().setText(C497740JfY.LJIJJ(2131844120, Integer.valueOf(((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL + 1), Integer.valueOf(((List) aCListenerS83S0300000_17.l1).size()), Long.valueOf(((C1116210f9X) ListProtector.get((List) aCListenerS83S0300000_17.l1, ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL)).LIZ())));
            ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).SR().setText(String.valueOf(((C1116210f9X) ListProtector.get((List) aCListenerS83S0300000_17.l1, ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL)).LLJILLL));
            ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).NR().smoothScrollToPosition(((C1117370fBP) ((AbstractC21673619ry) aCListenerS83S0300000_17.l0)).LL.indexOf(ListProtector.get((List) aCListenerS83S0300000_17.l1, ((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL)));
            if (((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).LLJIJIL == ((List) aCListenerS83S0300000_17.l1).size() - 1) {
                C786410Ut5.qc(((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).PR(), -1.0f);
            } else {
                C786410Ut5.qc(((AudienceStarCommentManageDialog) aCListenerS83S0300000_17.l2).PR(), 1.0f);
            }
        }
    }

    public static final void onClick$4(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        InterfaceC1118070fCX interfaceC1118070fCX;
        C1120950fHB c1120950fHB = (C1120950fHB) aCListenerS83S0300000_17.l0;
        if (c1120950fHB != null && (interfaceC1118070fCX = (InterfaceC1118070fCX) aCListenerS83S0300000_17.l2) != null) {
            interfaceC1118070fCX.LIZJ(c1120950fHB);
        }
        C1120150fFt.LIZ(17, ((EnumC1120860fH2) aCListenerS83S0300000_17.l1).getKey(), false);
    }

    public static final void onClick$5(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        InterfaceC1118070fCX interfaceC1118070fCX;
        C1120950fHB c1120950fHB = (C1120950fHB) aCListenerS83S0300000_17.l0;
        if (c1120950fHB != null && (interfaceC1118070fCX = (InterfaceC1118070fCX) aCListenerS83S0300000_17.l2) != null) {
            interfaceC1118070fCX.LIZJ(c1120950fHB);
        }
        C1120150fFt.LIZ(1, ((EnumC1120860fH2) aCListenerS83S0300000_17.l1).getKey(), false);
    }

    public static final void onClick$6(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        InterfaceC1118070fCX interfaceC1118070fCX;
        C1120950fHB c1120950fHB = (C1120950fHB) aCListenerS83S0300000_17.l0;
        if (c1120950fHB != null && (interfaceC1118070fCX = (InterfaceC1118070fCX) aCListenerS83S0300000_17.l2) != null) {
            interfaceC1118070fCX.LIZJ(c1120950fHB);
        }
        C1120150fFt.LIZ(1, ((EnumC1120860fH2) aCListenerS83S0300000_17.l1).getKey(), false);
    }

    public static final void onClick$7(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        InterfaceC1118070fCX interfaceC1118070fCX;
        C1120950fHB c1120950fHB = (C1120950fHB) aCListenerS83S0300000_17.l0;
        if (c1120950fHB != null && (interfaceC1118070fCX = (InterfaceC1118070fCX) aCListenerS83S0300000_17.l2) != null) {
            interfaceC1118070fCX.LIZJ(c1120950fHB);
        }
        C1120150fFt.LIZ(1, ((EnumC1120860fH2) aCListenerS83S0300000_17.l1).getKey(), false);
    }

    public static final void onClick$8(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        InterfaceC1118070fCX interfaceC1118070fCX;
        C1120950fHB c1120950fHB = (C1120950fHB) aCListenerS83S0300000_17.l0;
        if (c1120950fHB != null && (interfaceC1118070fCX = (InterfaceC1118070fCX) aCListenerS83S0300000_17.l2) != null) {
            interfaceC1118070fCX.LIZJ(c1120950fHB);
        }
        C1120150fFt.LIZ(1, ((EnumC1120860fH2) aCListenerS83S0300000_17.l1).getKey(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$9(ACListenerS83S0300000_17 aCListenerS83S0300000_17, View view) {
        ConstraintProperty constraintPropertyById;
        T t = ((C259800zU) aCListenerS83S0300000_17.l0).element;
        if (t == 0) {
            return;
        }
        SelectPollViewModel selectPollViewModel = ((GiftSelectPollWidget) aCListenerS83S0300000_17.l1).LLJILJIL;
        if (selectPollViewModel != null) {
            Gift gift = (Gift) t;
            Room room = (Room) selectPollViewModel.LL.gg0(RoomChannel.class);
            try {
                if (InterfaceC1094160eZy.D0.LIZIZ().booleanValue()) {
                    GiftPollWarnDialog giftPollWarnDialog = new GiftPollWarnDialog();
                    giftPollWarnDialog.LL = gift;
                    giftPollWarnDialog.LLILLL = selectPollViewModel;
                    giftPollWarnDialog.LLILLJJLI = new AwS261S0300000_17(room, gift, selectPollViewModel, 5);
                    FragmentManager fragmentManager = (FragmentManager) selectPollViewModel.LL.gg0(C748880TZe.class);
                    if (fragmentManager != null) {
                        C1086690eNv.LIZLLL(gift.id, selectPollViewModel.LL);
                        giftPollWarnDialog.show(fragmentManager, "gift warn dialog");
                    }
                } else if (room != null) {
                    ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).sendGiftPoll(gift.id, C1086830eO9.LIZIZ, room, selectPollViewModel.LL, selectPollViewModel.LLILLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                selectPollViewModel.vQ2().setValue(th);
            }
        }
        ((GiftSelectPollWidget) aCListenerS83S0300000_17.l1).z1(false);
        LayeredElementContext layeredElementContext = ((GiftSelectPollWidget) aCListenerS83S0300000_17.l1).getLayeredElementContext();
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(((GiftSelectPollWidget) aCListenerS83S0300000_17.l1).getId())) != null) {
            constraintPropertyById.alpha(0.3f);
        }
        if (((GiftSelectPollWidget) aCListenerS83S0300000_17.l1).dataChannel.gg0(RoomChannel.class) == null) {
            return;
        }
        GiftSelectPollWidget giftSelectPollWidget = (GiftSelectPollWidget) aCListenerS83S0300000_17.l1;
        PollOptionInfo pollOptionInfo = (PollOptionInfo) aCListenerS83S0300000_17.l2;
        giftSelectPollWidget.LLILLL = pollOptionInfo.displayContent;
        giftSelectPollWidget.LLILZ = pollOptionInfo.optionIndex;
        giftSelectPollWidget.x1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS83S0300000_17(Object obj, AbstractC21673619ry abstractC21673619ry, List<? extends Object> list, AudienceStarCommentManageDialog audienceStarCommentManageDialog) {
        this.$t = audienceStarCommentManageDialog;
        this.l0 = obj;
        this.l1 = abstractC21673619ry;
        this.l2 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS83S0300000_17(C1113510f5B c1113510f5B, C1113510f5B c1113510f5B2, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem, C1109770ez9 c1109770ez9) {
        this.$t = c1109770ez9;
        this.l0 = c1113510f5B;
        this.l1 = c1113510f5B2;
        this.l2 = abstractC1110800f0o;
    }
}
