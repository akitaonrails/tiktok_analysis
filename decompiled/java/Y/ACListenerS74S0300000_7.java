package Y;

import X.C01C3;
import X.C01C5;
import X.C0IJT;
import X.C0IL8;
import X.C0JCX;
import X.C0JGB;
import X.C0K0R;
import X.C0K0S;
import X.C0K1G;
import X.C0K1P;
import X.C0K21;
import X.C0K26;
import X.C0K41;
import X.C0K4F;
import X.C0K51;
import X.C0K54;
import X.C0KC4;
import X.C0KCC;
import X.C0KCP;
import X.C0KDI;
import X.C0KDJ;
import X.C0KDK;
import X.C0KDQ;
import X.C0KDZ;
import X.C0KE0;
import X.C0KE8;
import X.C0KNJ;
import X.C0KVU;
import X.C0KX8;
import X.C0TZM;
import X.C1161920gLG;
import X.C12KV;
import X.C1391190mJ3;
import X.C16F5;
import X.C197039127h;
import X.C19737012Ka;
import X.C19EG;
import X.C20743716Ff;
import X.C20744116Fj;
import X.C2097608Jq;
import X.C343970De7;
import X.C417410GYh;
import X.C435220H4u;
import X.C464740IKi;
import X.C465060ILo;
import X.C474500IjA;
import X.C475070Ik5;
import X.C475860IlM;
import X.C475870IlN;
import X.C475880IlO;
import X.C475890IlP;
import X.C484470IzF;
import X.C488970JFn;
import X.C492360JSo;
import X.C497740JfY;
import X.C498490Jgl;
import X.C499900Jj2;
import X.C500260Jjc;
import X.C507440JvC;
import X.C510630K0v;
import X.C510690K1b;
import X.C511420K3w;
import X.C511520K4g;
import X.C513830KDd;
import X.C513840KDe;
import X.C513850KDf;
import X.C513880KDi;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC511460K4a;
import X.InterfaceC517340KQq;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.interaction.AudienceInteractionFeaturesDialog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.profile.cell.BulletinBoardCell;
import com.bytedance.android.livesdk.share.ShareSettingsDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.CascadeAnswer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import com.ss.android.ugc.aweme.publicgroup.fragment.AccessCriteriaPickerFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem.SubPackageErrorAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageDialog;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS61S0210000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.api.feed.NoticeItem;
import webcast.api.feed.NoticeUIInfo;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;
import webcast.api.room.BulletinData;
import webcast.api.room.FestHonors;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS74S0300000_7 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
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
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
            case 23:
                onClick$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onClick$24(this, view);
                break;
            case 25:
                onClick$25(this, view);
                break;
        }
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
    public static final void onClick$0(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        boolean zBooleanValue;
        CharSequence text;
        LiveEndCardWidget liveEndCardWidget = (LiveEndCardWidget) aCListenerS74S0300000_7.l0;
        Map<String, String> map = null;
        CharSequence text2 = null;
        Map<String, String> map2 = null;
        String strValueOf = "";
        if (liveEndCardWidget.LLJILLL) {
            Room room = (Room) aCListenerS74S0300000_7.l1;
            final User owner = room.getOwner();
            if (owner != null && owner.getFollowInfo() != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_finish_bell_click");
                c474500IjALIZ.LJIJJLI(liveEndCardWidget.dataChannel);
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ.LIZ();
                C16F5 c16f5 = liveEndCardWidget.LLJJIJI;
                if (c16f5 != null && (text = c16f5.getText()) != null && text.length() > 0) {
                    C16F5 c16f52 = liveEndCardWidget.LLJJIJI;
                    if (c16f52 != null) {
                        text2 = c16f52.getText();
                    }
                    strValueOf = String.valueOf(text2);
                }
                int pushStatus = (int) owner.getFollowInfo().getPushStatus();
                C0IL8 c0il8 = new C0IL8();
                c0il8.LIZIZ = String.valueOf(owner.getId());
                c0il8.LIZ = String.valueOf(room.getId());
                c0il8.LIZJ = "live_end";
                c0il8.LIZLLL = "live_cover";
                Boolean bool = (Boolean) liveEndCardWidget.dataChannel.gg0(C0TZM.class);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).showNotificationTipDialog(C0KVU.LIZLLL(owner), String.valueOf(owner.getId()), strValueOf, owner.getSecUid(), pushStatus, liveEndCardWidget.LLJJJIL, C497740JfY.LJIJJ(2131843721, strValueOf), c0il8, zBooleanValue, new InterfaceC517340KQq() { // from class: X.0IL6
                    @Override // X.InterfaceC517340KQq
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC517340KQq
                    public final void LIZ(int i) {
                        owner.getFollowInfo().setPushStatus(i);
                    }
                });
                return;
            }
            return;
        }
        if (((C464740IKi) aCListenerS74S0300000_7.l2).LJ) {
            C465060ILo c465060ILo = liveEndCardWidget.LLJJL;
            if (c465060ILo == null) {
                return;
            }
            Room room2 = (Room) aCListenerS74S0300000_7.l1;
            Boolean bool2 = Boolean.TRUE;
            C464740IKi c464740IKi = liveEndCardWidget.LLJILJILJ;
            if (c464740IKi != null) {
                map2 = c464740IKi.LJI;
            }
            c465060ILo.LIZIZ(room2, "", bool2, map2);
            return;
        }
        C465060ILo c465060ILo2 = liveEndCardWidget.LLJJL;
        if (c465060ILo2 == null) {
            return;
        }
        Room room3 = (Room) aCListenerS74S0300000_7.l1;
        C464740IKi c464740IKi2 = liveEndCardWidget.LLJILJILJ;
        if (c464740IKi2 != null) {
            map = c464740IKi2.LJI;
        }
        c465060ILo2.LIZ(room3, "", true, map);
    }

    public static final void onClick$1(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        OfficialChannelInfo officialChannelInfo;
        LiveEndCardWidget liveEndCardWidget = (LiveEndCardWidget) aCListenerS74S0300000_7.l0;
        Room room = (Room) aCListenerS74S0300000_7.l1;
        boolean z = ((C464740IKi) aCListenerS74S0300000_7.l2).LJ;
        liveEndCardWidget.getClass();
        User owner = room.getOwner();
        if (z && ((officialChannelInfo = room.officialChannelInfo) == null || (owner = officialChannelInfo.channelUser) == null)) {
            owner = room.getOwner();
        }
        HashMap map = new HashMap(1);
        map.put("sec_user_id", owner.getSecUid());
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).showUserProfile(owner.getId(), null, map);
    }

    public static final void onClick$10(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        String str;
        Integer numValueOf;
        C0KCC c0kcc;
        C0KNJ.LIZLLL(((C197039127h) aCListenerS74S0300000_7.l0).getContext());
        C0KDQ c0kdq = C0KDQ.LIZ;
        C0KC4 c0kc4Hp = ((SubPackageErrorAssem) aCListenerS74S0300000_7.l1).hp();
        Map<String, String> map = null;
        if (c0kc4Hp != null && (c0kcc = c0kc4Hp.LL) != null) {
            str = c0kcc.LJII;
        } else {
            str = null;
        }
        C0KCP c0kcp = (C0KCP) aCListenerS74S0300000_7.l2;
        if (c0kcp != null) {
            numValueOf = Integer.valueOf(c0kcp.LIZIZ);
        } else {
            numValueOf = null;
        }
        C0KC4 c0kc4Hp2 = ((SubPackageErrorAssem) aCListenerS74S0300000_7.l1).hp();
        if (c0kc4Hp2 != null) {
            map = c0kc4Hp2.LLILLL;
        }
        c0kdq.getClass();
        C0KDQ.LJI(str, numValueOf, "google_page", map);
    }

    public static final void onClick$11(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        String strLIZLLL = ((C488970JFn) ((BulletinBoardCell) aCListenerS74S0300000_7.l0).LLJI.getValue()).LIZLLL((User) aCListenerS74S0300000_7.l1);
        w.LIZ.getClass();
        ((BulletinBoardCell) aCListenerS74S0300000_7.l0).LLIZLLLIL = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openBulletinPageWithSheet(((BulletinData) aCListenerS74S0300000_7.l2).bbId, "live_room_avatar_page", C2097608Jq.LJIIJ(new Pair("anchor_id", String.valueOf(w.LJ())), new Pair("room_id", String.valueOf(w.LJIJJ())), new Pair("enter_from_merge", w.LJIIIZ()), new Pair("enter_method", w.LJIIL()), new Pair("action_type", w.LIZLLL()), new Pair("request_page", strLIZLLL)));
        ((BulletinBoardCell) aCListenerS74S0300000_7.l0).LJIIZILJ((BulletinData) aCListenerS74S0300000_7.l2, "click");
    }

    public static final void onClick$12(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(((C0JGB) aCListenerS74S0300000_7.l2).LL.LIZ, UriProtector.parse(((FestHonors) aCListenerS74S0300000_7.l0).jumpSchemaUrl).buildUpon().appendQueryParameter("preview_uid", String.valueOf(((User) aCListenerS74S0300000_7.l1).getId())).appendQueryParameter("enter_from", "profile_page").toString(), null);
    }

    public static final void onClick$13(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        String str;
        ILiveEventService iLiveEventService = (ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class);
        C498490Jgl c498490Jgl = (C498490Jgl) aCListenerS74S0300000_7.l0;
        iLiveEventService.oe0(c498490Jgl.LL.LIZ, c498490Jgl.LLJ, true, false, ((LiveEventInfo) aCListenerS74S0300000_7.l1).eventId.longValue());
        C498490Jgl c498490Jgl2 = (C498490Jgl) aCListenerS74S0300000_7.l0;
        LiveEventInfo liveEventInfo = (LiveEventInfo) aCListenerS74S0300000_7.l1;
        List<? extends LiveEventInfo> list = (List) aCListenerS74S0300000_7.l2;
        if (c498490Jgl2.LL.LIZJ.LIZLLL) {
            str = "livesdk_live_event_anchor_entrance_click";
        } else {
            str = "livesdk_live_event_user_entrance_click";
        }
        c498490Jgl2.LJIIZILJ(str, "click", liveEventInfo, list);
    }

    public static final void onClick$14(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        int bindingAdapterPosition = ((C475880IlO) aCListenerS74S0300000_7.l0).getBindingAdapterPosition();
        C475870IlN c475870IlN = (C475870IlN) aCListenerS74S0300000_7.l1;
        if (c475870IlN.LLILZ != bindingAdapterPosition) {
            c475870IlN.LLLI(bindingAdapterPosition);
        }
        C475860IlM c475860IlM = (C475860IlM) aCListenerS74S0300000_7.l2;
        C475860IlM c475860IlM2 = new C475860IlM(c475860IlM.LIZ, c475860IlM.LIZIZ, c475860IlM.LIZJ, false, false, c475860IlM.LJFF);
        ((C475870IlN) aCListenerS74S0300000_7.l1).getClass();
        C475890IlP.LIZ(c475860IlM2);
        C475870IlN.LLLFZ((C475860IlM) aCListenerS74S0300000_7.l2);
        ((C475870IlN) aCListenerS74S0300000_7.l1).LL.invoke((C475860IlM) aCListenerS74S0300000_7.l2);
    }

    public static final void onClick$15(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        ((FrameLayout) aCListenerS74S0300000_7.l0).setEnabled(false);
        boolean z = !((C20743716Ff) aCListenerS74S0300000_7.l1).isChecked();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_translation_switch_click");
        c474500IjALIZ.LJJII("viewer", "admin_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).v12(z, ((ShareSettingsDialog) aCListenerS74S0300000_7.l2).dataChannel, new AwS61S0210000_7((FrameLayout) aCListenerS74S0300000_7.l0, (C20743716Ff) aCListenerS74S0300000_7.l1, z, 0));
    }

    public static final void onClick$16(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        Integer numValueOf;
        C0KNJ.LIZLLL(((C197039127h) aCListenerS74S0300000_7.l0).getContext());
        C0KDQ c0kdq = C0KDQ.LIZ;
        String str = ((SubPackagePageDialog) aCListenerS74S0300000_7.l1).LLIZLLLIL.LJII;
        C0KCP c0kcp = (C0KCP) aCListenerS74S0300000_7.l2;
        if (c0kcp != null) {
            numValueOf = Integer.valueOf(c0kcp.LIZIZ);
        } else {
            numValueOf = null;
        }
        Map<String, String> map = ((SubPackagePageDialog) aCListenerS74S0300000_7.l1).LLJJI;
        c0kdq.getClass();
        C0KDQ.LJI(str, numValueOf, "google_page", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$17(Y.ACListenerS74S0300000_7 r14, android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS74S0300000_7.onClick$17(Y.ACListenerS74S0300000_7, android.view.View):void");
    }

    public static final void onClick$18(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        Boolean boolValueOf;
        C19EG c19egLJ;
        C0KX8 c0kx8;
        DataChannel dataChannel = ((AudienceInteractionFeaturesDialog) aCListenerS74S0300000_7.l0).dataChannel;
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C01C5.LIZ(dataChannel));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (c0kx8 = (C0KX8) aCListenerS74S0300000_7.l1) != null && c0kx8.LIZLLL) {
            C766270U4b.LIZLLL(2131844187);
            return;
        }
        ((AudienceInteractionFeaturesDialog) aCListenerS74S0300000_7.l0).dismiss();
        C01C3.LIZJ(((AudienceInteractionFeaturesDialog) aCListenerS74S0300000_7.l0).dataChannel, "interaction_panel", false, false, false, false, "video_live", 0);
        Context context = ((View) aCListenerS74S0300000_7.l2).getContext();
        if (context != null && (c19egLJ = C500260Jjc.LJ(context)) != null) {
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Sc2("interaction_panel", c19egLJ, ((AudienceInteractionFeaturesDialog) aCListenerS74S0300000_7.l0).dataChannel, true, "");
        }
    }

    public static final void onClick$19(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        String str;
        C19EG c19egLIZIZ = C0K51.LIZIZ(((AbsPrivilegeDetailBaseFragment) aCListenerS74S0300000_7.l0).getContext());
        PGCGetSubPrivilegeDetailResponse.Data.SubscribePermission subscribePermission = ((PGCGetSubPrivilegeDetailResponse.Data) aCListenerS74S0300000_7.l1).subscribePermission;
        if (subscribePermission == null || (str = subscribePermission.forbiddenToast) == null) {
            str = "";
        }
        C0JCX.LIZJ(c19egLIZIZ, str);
        ((Function0) aCListenerS74S0300000_7.l2).invoke();
    }

    public static final void onClick$2(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        ((C20744116Fj) aCListenerS74S0300000_7.l0).setChecked(!((C20744116Fj) aCListenerS74S0300000_7.l0).isChecked());
        ((C475070Ik5) aCListenerS74S0300000_7.l1).L5(((Question) aCListenerS74S0300000_7.l2).questionId, ((CascadeAnswer) view.getTag()).value, ((C20744116Fj) aCListenerS74S0300000_7.l0).isChecked());
    }

    public static final void onClick$20(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        ViewGroup viewGroup = (ViewGroup) aCListenerS74S0300000_7.l0;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ((FrameLayout) aCListenerS74S0300000_7.l1, viewGroup);
        }
        View view2 = (View) aCListenerS74S0300000_7.l2;
        if (view2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) view2).LJJ(true);
        }
    }

    public static final void onClick$21(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        int i;
        ((Function0) aCListenerS74S0300000_7.l0).invoke();
        C484470IzF c484470IzF = C484470IzF.LIZ;
        NoticeItem noticeItem = (NoticeItem) aCListenerS74S0300000_7.l1;
        NoticeUIInfo noticeUIInfo = noticeItem.showUiInfo;
        if (noticeUIInfo != null) {
            i = noticeUIInfo.defaultJumpType;
        } else {
            i = 0;
        }
        Context context = ((LiveNotificationItem) aCListenerS74S0300000_7.l2).getContext();
        int iGl = ((LiveNotificationItem) aCListenerS74S0300000_7.l2).gl();
        c484470IzF.getClass();
        C484470IzF.LIZJ(i, noticeItem, context, "live_activity_notification_message_head", iGl, false);
    }

    public static final void onClick$22(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        String str;
        InterfaceC511460K4a interfaceC511460K4aLIZ = C0K54.LIZ();
        Context context = (Context) aCListenerS74S0300000_7.l0;
        C0K21 c0k21 = (C0K21) aCListenerS74S0300000_7.l1;
        String str2 = c0k21.LJ;
        Pair[] pairArr = new Pair[1];
        if (Intrinsics.LJFF(c0k21.LJIIIIZZ, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("hide_nav_bar", str);
        interfaceC511460K4aLIZ.LJ(context, str2, C2097608Jq.LJI(pairArr));
        ((Function0) aCListenerS74S0300000_7.l2).invoke();
    }

    public static final void onClick$23(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        String str;
        InterfaceC511460K4a interfaceC511460K4aLIZ = C0K54.LIZ();
        Context context = (Context) aCListenerS74S0300000_7.l0;
        C0K21 c0k21 = (C0K21) aCListenerS74S0300000_7.l1;
        String str2 = c0k21.LJ;
        Pair[] pairArr = new Pair[1];
        if (Intrinsics.LJFF(c0k21.LJIIIIZZ, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("hide_nav_bar", str);
        interfaceC511460K4aLIZ.LJ(context, str2, C2097608Jq.LJI(pairArr));
        ((Function0) aCListenerS74S0300000_7.l2).invoke();
    }

    public static final void onClick$24(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        C0K1G c0k1g = (C0K1G) aCListenerS74S0300000_7.l0;
        if (c0k1g.LLIZLLLIL) {
            return;
        }
        c0k1g.LLIZLLLIL = true;
        List<C510630K0v> list = (List) aCListenerS74S0300000_7.l1;
        C0K0S c0k0s = (C0K0S) aCListenerS74S0300000_7.l2;
        for (C510630K0v c510630K0v : list) {
            LinearLayout linearLayout = c0k1g.LLILLL;
            if (linearLayout != null) {
                linearLayout.addView(c0k1g.R5(c510630K0v, c0k0s));
            }
        }
        C0K0R.LIZ(((C0K1G) aCListenerS74S0300000_7.l0).LLILZIL);
    }

    public static final void onClick$25(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        ((C0K41) aCListenerS74S0300000_7.l0).LLILLJJLI.JQ2((SpaceTopicContent) aCListenerS74S0300000_7.l1);
        C0K26 c0k26 = C0K26.LIZ;
        C0K4F c0k4f = (C0K4F) aCListenerS74S0300000_7.l2;
        String str = c0k4f.LL.LIZIZ.topicCategoryText;
        String str2 = c0k4f.LLILLJJLI;
        c0k26.getClass();
        C0K26.LIZJ("choose_topic", str, str2);
    }

    public static final void onClick$3(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        Function1<? super Integer, Unit> function1 = ((C492360JSo) aCListenerS74S0300000_7.l0).LIZIZ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(((C12KV) ListProtector.get(((C19737012Ka) aCListenerS74S0300000_7.l1).getColumnPickers$tux_theme_release(), 0)).getIndex$tux_theme_release()));
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((AccessCriteriaPickerFragment) aCListenerS74S0300000_7.l2, C343970De7.LIZ);
    }

    public static final void onClick$4(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        C510690K1b.LIZ(((C0K1P) aCListenerS74S0300000_7.l0).getContext(), ((SpaceActivityIndicator) aCListenerS74S0300000_7.l1).schema, null);
        ((Function0) aCListenerS74S0300000_7.l2).invoke();
    }

    public static final void onClick$5(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        C435220H4u c435220H4u = (C435220H4u) aCListenerS74S0300000_7.l0;
        C417410GYh c417410GYh = (C417410GYh) aCListenerS74S0300000_7.l1;
        EmoteModel emoteModel = (EmoteModel) aCListenerS74S0300000_7.l2;
        if (emoteModel == null) {
            c435220H4u.getClass();
            return;
        }
        PopupWindow popupWindow = c435220H4u.LLIZ;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c435220H4u.LL), R.layout.fg1, null, false);
        PopupWindow popupWindow2 = new PopupWindow(viewTd, -2, -2);
        popupWindow2.setOutsideTouchable(true);
        C511420K3w.LJIIJ.getClass();
        C511420K3w c511420K3w = new C511420K3w();
        c511420K3w.LIZ = emoteModel.image;
        c511420K3w.LIZ(viewTd.findViewById(R.id.h6r));
        int iLIZ = (int) C511520K4g.LIZ(84.0f);
        int measuredWidth = c417410GYh.getMeasuredWidth();
        C786410Ut5.j3(popupWindow2, c417410GYh, (measuredWidth - iLIZ) / 2, ((-measuredWidth) - iLIZ) - ((int) C511520K4g.LIZ(c435220H4u.LLJ.LLILLL)), 3);
        c435220H4u.LLIZ = popupWindow2;
        c435220H4u.LLILZ.cS(C507440JvC.LIZ(1).LIZIZ, C2097608Jq.LJ());
    }

    public static final void onClick$6(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        boolean z;
        int i;
        String str;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) aCListenerS74S0300000_7.l0;
        C20743716Ff c20743716Ff = (C20743716Ff) aCListenerS74S0300000_7.l1;
        Integer num = (Integer) aCListenerS74S0300000_7.l2;
        basePreviewSettingMainFragmentSheetInitializer.getClass();
        boolean zIsChecked = c20743716Ff.isChecked();
        Context context = basePreviewSettingMainFragmentSheetInitializer.LL.getContext();
        if (context != null) {
            C499900Jj2 c499900Jj2 = new C499900Jj2();
            if (num != null && num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (zIsChecked) {
                i = 1;
            } else {
                i = 2;
            }
            c499900Jj2.LIZ(context, "live_take_page", z, i, new AwS551S0100000_7(c20743716Ff, 629), new AwS125S0110000_7(c20743716Ff, zIsChecked, 3), new AwS125S0110000_7(c20743716Ff, zIsChecked, 2));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_click_record_icon");
            c474500IjALIZ.LJIJJLI(basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI);
            if (zIsChecked) {
                str = "open";
            } else {
                str = "close";
            }
            c474500IjALIZ.LJJII(str, "record_status");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void onClick$7(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        OfferInfo offerInfo;
        Map<String, String> map;
        C0KC4 c0kc4Ku;
        C0KC4 c0kc4Ku2;
        ISubPackagePageAbility iSubPackagePageAbility = ((C513850KDf) aCListenerS74S0300000_7.l0).LLILZIL;
        if (iSubPackagePageAbility != null && C513840KDe.LJIIJ(iSubPackagePageAbility.hd())) {
            return;
        }
        TemplateInfo templateInfo = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
        Map<String, String> map2 = null;
        if (templateInfo != null) {
            offerInfo = templateInfo.offerInfo;
        } else {
            offerInfo = null;
        }
        C513880KDi.LIZIZ(offerInfo);
        C0KDQ c0kdq = C0KDQ.LIZ;
        C513850KDf c513850KDf = (C513850KDf) aCListenerS74S0300000_7.l0;
        if (c513850KDf.LLILZLL == null) {
            ISubPackagePageAbility iSubPackagePageAbility2 = c513850KDf.LLILZIL;
            if (iSubPackagePageAbility2 != null) {
                c0kc4Ku2 = iSubPackagePageAbility2.Ku();
            } else {
                c0kc4Ku2 = null;
            }
            c513850KDf.LLILZLL = c0kc4Ku2;
        }
        C0KC4 c0kc4 = c513850KDf.LLILZLL;
        if (c0kc4 != null) {
            map = c0kc4.LLILLL;
        } else {
            map = null;
        }
        TemplateInfo templateInfo2 = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
        c0kdq.getClass();
        C0KDQ.LIZLLL(map, templateInfo2);
        C513850KDf c513850KDf2 = (C513850KDf) aCListenerS74S0300000_7.l0;
        if (c513850KDf2.LLILZLL == null) {
            ISubPackagePageAbility iSubPackagePageAbility3 = c513850KDf2.LLILZIL;
            if (iSubPackagePageAbility3 != null) {
                c0kc4Ku = iSubPackagePageAbility3.Ku();
            } else {
                c0kc4Ku = null;
            }
            c513850KDf2.LLILZLL = c0kc4Ku;
        }
        C0KC4 c0kc42 = c513850KDf2.LLILZLL;
        if (c0kc42 != null) {
            map2 = c0kc42.LLILLL;
        }
        C0KDQ.LIZJ(map2, ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo());
        ((C513850KDf) aCListenerS74S0300000_7.l0).LLLI((C0KE8) ((RecyclerView.ViewHolder) aCListenerS74S0300000_7.l2));
        ISubPackagePageAbility iSubPackagePageAbility4 = ((C513850KDf) aCListenerS74S0300000_7.l0).LLILZIL;
        if (iSubPackagePageAbility4 != null) {
            iSubPackagePageAbility4.js1((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1);
        }
    }

    public static final void onClick$8(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        C0KDZ value;
        OfferInfo offerInfo;
        String str;
        MutableLiveData<C0KDZ> mutableLiveData;
        PackagePageViewModel packagePageViewModel = ((C513830KDd) aCListenerS74S0300000_7.l0).LL;
        String str2 = null;
        if (packagePageViewModel != null && (mutableLiveData = packagePageViewModel.LLJIJIL) != null) {
            value = mutableLiveData.getValue();
        } else {
            value = null;
        }
        if (C513840KDe.LJIIJ(value)) {
            return;
        }
        TemplateInfo templateInfo = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
        if (templateInfo != null) {
            offerInfo = templateInfo.offerInfo;
        } else {
            offerInfo = null;
        }
        C513880KDi.LIZIZ(offerInfo);
        C0KDQ c0kdq = C0KDQ.LIZ;
        Map<String, String> map = ((C513830KDd) aCListenerS74S0300000_7.l0).LLILLJJLI;
        TemplateInfo templateInfo2 = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
        c0kdq.getClass();
        C0KDQ.LIZLLL(map, templateInfo2);
        C0KDQ.LIZJ(((C513830KDd) aCListenerS74S0300000_7.l0).LLILLJJLI, ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo());
        ((C513830KDd) aCListenerS74S0300000_7.l0).LLLII((C0KE0) ((RecyclerView.ViewHolder) aCListenerS74S0300000_7.l2));
        PackagePageViewModel packagePageViewModel2 = ((C513830KDd) aCListenerS74S0300000_7.l0).LL;
        if (packagePageViewModel2 != null) {
            TemplateInfo templateInfo3 = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
            if (templateInfo3 != null) {
                str = templateInfo3.iapId;
            } else {
                str = null;
            }
            TemplateInfo templateInfo4 = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
            if (templateInfo4 != null) {
                str2 = templateInfo4.basePlanId;
            }
            packagePageViewModel2.vQ2(str, str2);
        }
    }

    public static final void onClick$9(ACListenerS74S0300000_7 aCListenerS74S0300000_7, View view) {
        C0KDZ value;
        OfferInfo offerInfo;
        String str;
        MutableLiveData<C0KDZ> mutableLiveData;
        UpDowngradePackageViewModel upDowngradePackageViewModel = ((C0KDI) aCListenerS74S0300000_7.l0).LL;
        String str2 = null;
        if (upDowngradePackageViewModel != null && (mutableLiveData = upDowngradePackageViewModel.LLJI) != null) {
            value = mutableLiveData.getValue();
        } else {
            value = null;
        }
        if (!C513840KDe.LJIIJ(value) && !((C0KDI) aCListenerS74S0300000_7.l0).LLILLL) {
            TemplateInfo templateInfo = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
            if (templateInfo != null) {
                offerInfo = templateInfo.offerInfo;
            } else {
                offerInfo = null;
            }
            C513880KDi.LIZIZ(offerInfo);
            C0KDQ c0kdq = C0KDQ.LIZ;
            Map<String, String> map = ((C0KDI) aCListenerS74S0300000_7.l0).LLILLJJLI;
            TemplateInfo templateInfo2 = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
            c0kdq.getClass();
            C0KDQ.LIZLLL(map, templateInfo2);
            C0KDQ.LIZJ(((C0KDI) aCListenerS74S0300000_7.l0).LLILLJJLI, ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo());
            ((C0KDI) aCListenerS74S0300000_7.l0).LLLFZ((C0KDJ) ((RecyclerView.ViewHolder) aCListenerS74S0300000_7.l2));
            UpDowngradePackageViewModel upDowngradePackageViewModel2 = ((C0KDI) aCListenerS74S0300000_7.l0).LL;
            if (upDowngradePackageViewModel2 != null) {
                TemplateInfo templateInfo3 = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
                if (templateInfo3 != null) {
                    str = templateInfo3.iapId;
                } else {
                    str = null;
                }
                TemplateInfo templateInfo4 = ((PGCSubscriptionProductDetailWithTemplateInfo) aCListenerS74S0300000_7.l1).getTemplateInfo();
                if (templateInfo4 != null) {
                    str2 = templateInfo4.basePlanId;
                }
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                upDowngradePackageViewModel2.LLIZ.setValue(new C0KDK(str, str2));
            }
        }
    }

    public ACListenerS74S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ACListenerS74S0300000_7(FrameLayout frameLayout, C20743716Ff c20743716Ff, Room room, ShareSettingsDialog shareSettingsDialog, int i) {
        this.$t = i;
        this.l0 = frameLayout;
        this.l1 = c20743716Ff;
        this.l2 = shareSettingsDialog;
    }
}
