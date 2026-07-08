package Y;

import X.AnonymousClass0629;
import X.C04TK;
import X.C06H7;
import X.C06H8;
import X.C06LV;
import X.C06QY;
import X.C0I0B;
import X.C0I7D;
import X.C0OBG;
import X.C0WZX;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZQ1;
import X.C1164304gz;
import X.C11S5;
import X.C1263950izp;
import X.C1275904yz;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C13LP;
import X.C1400340mXo;
import X.C1440005kM;
import X.C1508705vR;
import X.C1530305yv;
import X.C15377060h;
import X.C15380060k;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1613406Tk;
import X.C1643806c8;
import X.C1671006gW;
import X.C1697810uHb;
import X.C1699106l3;
import X.C1699306l5;
import X.C1701940uOG;
import X.C1714406nW;
import X.C1734206qi;
import X.C1749280vcc;
import X.C1904150zeP;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21560119Zf;
import X.C2204961BRm;
import X.C23250099c;
import X.C2344009Gk;
import X.C337180DJs;
import X.C343970De7;
import X.C418440Gaw;
import X.C453940Hr6;
import X.C623900OdY;
import X.C635080Ova;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C912070ZqH;
import X.DialogInterfaceC21560019Ze;
import X.DialogInterfaceOnDismissListenerC1767806w8;
import X.EnumC1699206l4;
import X.EnumC1711006my;
import X.EnumC1786290waJ;
import X.InterfaceC1638406bG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC911930Zq3;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.chatnoticenew.feature.streak.StreakWheeDriveTrafficCardReusedUISlot;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation.IMAIBotCreationVM;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation.IMBotCreateGuideAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user.UserAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.user.UserPanelViewModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.StreakWheeDriveTrafficCardDataAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryCreationFeature;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraSideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxGeneralSearchCell;
import com.ss.android.ugc.aweme.inbox.workbench.WorkBenchFilterSheetFragment;
import com.ss.android.ugc.aweme.inbox.workbench.assem.WorkBenchFilterAssem;
import com.ss.android.ugc.aweme.inbox.workbench.assem.filter.WorkBenchFilterBtnAssem;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.legacy.select.RecUserSelectCell;
import com.ss.android.ugc.aweme.legacy.select.SelectedCardVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryHighlightsAnchorComponent;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS87S1200000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public class ACListenerS106S0200000_2 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onClick$0(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        String string;
        Editable editableLLLLJI;
        String string2;
        C0I7D c0i7d = (C0I7D) ((UserAssem) aCListenerS106S0200000_2.l0).LLJJIJI.getValue();
        if (c0i7d == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZ7Hkjs6G5KggHMt57IlGIzkvu+AVFWgEdxjzD/F62gXCHIHadjBU1WANw==", null))) == null || (string2 = editableLLLLJI.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
            string = "";
        }
        UserPanelViewModel userPanelViewModelHp = ((UserAssem) aCListenerS106S0200000_2.l0).hp();
        userPanelViewModelHp.withState(new AwS87S1200000_2(userPanelViewModelHp, string, (View) aCListenerS106S0200000_2.l1, 10));
        Fragment fragmentLJI = C724240Sb0.LJI((UserAssem) aCListenerS106S0200000_2.l0);
        if (fragmentLJI != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
        }
    }

    public static final void onClick$1(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
        InterfaceC911930Zq3 interfaceC911930Zq3LJIIZILJ = c912070ZqH.LJIIZILJ();
        C19EG c19eg = (C19EG) aCListenerS106S0200000_2.l0;
        C1699306l5 c1699306l5 = (C1699306l5) aCListenerS106S0200000_2.l1;
        String str = c1699306l5.LIZ;
        String str2 = c1699306l5.LIZJ;
        EnumC1786290waJ enumC1786290waJ = EnumC1786290waJ.ONGOING_TOP_BANNER;
        EnumC1711006my enumC1711006my = EnumC1711006my.JOIN;
        interfaceC911930Zq3LJIIZILJ.LJ(c19eg, str, str2, enumC1786290waJ, enumC1711006my, "chat", c1699306l5.LJI, false, c1699306l5.LIZIZ, null, Long.valueOf(c1699306l5.LJII));
        c912070ZqH.LJIIL().LJIIJJI("chat", enumC1786290waJ, enumC1711006my, EnumC1699206l4.START_GROUP_SHOT, Integer.valueOf(((C1699306l5) aCListenerS106S0200000_2.l1).LJI));
    }

    public static final void onClick$10(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1904150zeP c1904150zeP = C1904150zeP.LIZ;
        String str = ((C1275904yz) aCListenerS106S0200000_2.l0).LL;
        Context context = ((InboxGeneralSearchCell) aCListenerS106S0200000_2.l1).itemView.getContext();
        c1904150zeP.getClass();
        C1904150zeP.LIZIZ(context, str);
    }

    public static final void onClick$11(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        ((BotDetailViewModel) aCListenerS106S0200000_2.l0).yQ2((Activity) aCListenerS106S0200000_2.l1);
    }

    public static final void onClick$12(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        String uid;
        UrlModel avatarThumb;
        String str;
        FragmentManager supportFragmentManager;
        int iIntValue;
        GradientDrawable gradientDrawable;
        C15380060k c15380060k;
        String str2;
        C15380060k c15380060k2;
        Context context = ((C197039127h) aCListenerS106S0200000_2.l0).getContext();
        if (context != null) {
            IMAIBotCreationVM iMAIBotCreationVMHp = ((IMBotCreateGuideAssem) aCListenerS106S0200000_2.l1).hp();
            User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
            if (currentUser != null) {
                uid = currentUser.getUid();
                avatarThumb = currentUser.getAvatarThumb();
            } else {
                uid = null;
                avatarThumb = null;
            }
            C1508705vR c1508705vR = C1508705vR.LL;
            C15377060h c15377060hVQ2 = iMAIBotCreationVMHp.vQ2();
            String str3 = "";
            if (c15377060hVQ2 == null || (c15380060k2 = c15377060hVQ2.LL) == null || (str = c15380060k2.LIZ) == null) {
                str = "";
            }
            C15377060h c15377060hVQ22 = iMAIBotCreationVMHp.vQ2();
            if (c15377060hVQ22 != null && (c15380060k = c15377060hVQ22.LL) != null && (str2 = c15380060k.LIZIZ) != null) {
                str3 = str2;
            }
            c1508705vR.getClass();
            C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1530305yv(str3, "continue", str, null), 3);
            new Object() { // from class: X.06H8
                public static void LIZ(C06H7 c06h7, View view2, int i, int i2, int i3) {
                    if (c06h7 == null) {
                        C337180DJs.LIZ(view2.findViewById(i));
                        C337180DJs.LIZ(view2.findViewById(i2));
                        C337180DJs.LIZ(view2.findViewById(i3));
                        return;
                    }
                    ((TuxIconView) view2.findViewById(i)).setIconRes(c06h7.LIZ);
                    ((TextView) view2.findViewById(i2)).setText(C1383370m6R.LJIIJ(c06h7.LIZIZ));
                    TextView textView = (TextView) view2.findViewById(i3);
                    if (c06h7.LIZLLL != null) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setText(c06h7.LIZLLL);
                    } else {
                        textView.setText(C1383370m6R.LJIIJ(c06h7.LIZJ));
                    }
                }
            };
            AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2(iMAIBotCreationVMHp, context, 104);
            List listLJIIJJI = C1697810uHb.LJIIJJI(new C06H7(R.raw.icon_message_fill, 2131848471, 2131848469), new C06H7(R.raw.icon_two_person_large_fill, 2131848472, 2131848470));
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                View viewSd = C786410Ut5.Sd(R.layout.cqv, C786410Ut5.ne(context), null);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIII = viewSd;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJLLL = true;
                tuxSheet.LLILZIL = true;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer numValueOf = Integer.valueOf(iIntValue);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJI = numValueOf;
                tuxSheet2.LLILLL = true;
                c1390920mIc.LJIIIIZZ(1);
                DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8 = new DialogInterfaceOnDismissListenerC1767806w8(9);
                TuxSheet tuxSheet3 = c1390920mIc.LIZ;
                tuxSheet3.LLILLJJLI = dialogInterfaceOnDismissListenerC1767806w8;
                AwS368S0200000_2 awS368S0200000_22 = new AwS368S0200000_2(tuxSheet3, awS368S0200000_2, 109);
                SmartImageView smartImageView = (SmartImageView) viewSd.findViewById(R.id.biz);
                IMAvatarLoaderApi.LIZ.getClass();
                C04TK.LIZIZ.LIZJ(smartImageView, "ai_creation").LIZIZ(uid, avatarThumb, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
                TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.bhq);
                IMAIServiceAPI.LIZ.getClass();
                Drawable drawable = AnonymousClass0629.LIZ().LIZ().LJII(C0ZQ1.DISCLAIMER_BANNER_AVATAR_LABEL, null).LIZIZ;
                if (drawable != null) {
                    tuxIconView.setImageDrawable(drawable);
                } else {
                    C337180DJs.LIZ(tuxIconView);
                }
                ((TextView) viewSd.findViewById(R.id.title)).setText(2131848465);
                C06H8.LIZ((C06H7) C13LP.LJJJLZIJ(0, listLJIIJJI), viewSd, R.id.mih, R.id.wlw, R.id.fmd);
                C06H8.LIZ((C06H7) C13LP.LJJJLZIJ(1, listLJIIJJI), viewSd, R.id.mii, R.id.wlx, R.id.fmf);
                C06H8.LIZ((C06H7) C13LP.LJJJLZIJ(2, listLJIIJJI), viewSd, R.id.mij, R.id.wly, R.id.fmg);
                C197039127h c197039127h = (C197039127h) viewSd.findViewById(R.id.d6g);
                c197039127h.setText(C1383370m6R.LJIIJ(2131848462));
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ca, context);
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    Drawable background = c197039127h.getBackground();
                    if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                        gradientDrawable.setColor(iIntValue2);
                    }
                }
                C786410Ut5.U8(c197039127h, new ACListenerS137S0100000_2(awS368S0200000_22, 69));
                TextView textView = (TextView) viewSd.findViewById(R.id.ui7);
                textView.setText(C1383370m6R.LJIIJ(2131848463));
                C786410Ut5.T7(textView, new ACListenerS137S0100000_2(awS368S0200000_22, 70));
                C786410Ut5.I7(new ACListenerS137S0100000_2(tuxSheet3, 71), viewSd.findViewById(R.id.e1g));
                tuxSheet3.show(supportFragmentManager, "SmartReplyDisclaimerBanner");
            }
        }
    }

    public static final void onClick$13(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) aCListenerS106S0200000_2.l0, C343970De7.LIZ);
        ((C1734206qi) aCListenerS106S0200000_2.l1).getClass();
        C1734206qi.LJIILIIL("creator_to_creator_pro", "click_ok");
    }

    public static final void onClick$14(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        C06QY c06qy = StoryCreationFeature.LIZ;
        c06qy.getClass();
        StoryCreationFeature value = C06QY.LIZJ.getValue(c06qy, C06QY.LIZIZ[0]);
        if (value != null) {
            value.LIZ(view, (C869590Y9l) aCListenerS106S0200000_2.l0);
        }
        ((DMCameraSideMessageStatusReusedSkeletonUISlot) aCListenerS106S0200000_2.l1).getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "chat");
        c2344009Gk.LJIIIIZZ("enter_method", "dm_cell_accessory");
        C20684815ws.LJIILLIIL("share_to_story_click", c2344009Gk.LIZ);
        ((Keva) ((DMCameraSideMessageStatusReusedSkeletonUISlot) aCListenerS106S0200000_2.l1).LLLILZLLLI.getValue()).storeInt("show_count", 2);
    }

    public static final void onClick$15(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        ((Function0) aCListenerS106S0200000_2.l0).invoke();
        ((C1397510mTF) aCListenerS106S0200000_2.l1).LIZIZ(null);
    }

    public static final void onClick$16(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        ((Function0) aCListenerS106S0200000_2.l0).invoke();
        ((C1397510mTF) aCListenerS106S0200000_2.l1).LIZIZ(null);
    }

    public static final void onClick$17(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        C06LV c06lvEs;
        Function0<Unit> function0;
        StreakWheeDriveTrafficCardDataAbility streakWheeDriveTrafficCardDataAbility = (StreakWheeDriveTrafficCardDataAbility) C1558520qew.LIZ(C1558520qew.LJIIL((StreakWheeDriveTrafficCardReusedUISlot) aCListenerS106S0200000_2.l0), StreakWheeDriveTrafficCardDataAbility.class, null);
        if (streakWheeDriveTrafficCardDataAbility != null && (c06lvEs = streakWheeDriveTrafficCardDataAbility.es()) != null && (function0 = c06lvEs.LJI) != null) {
            function0.invoke();
        }
        ((Function0) aCListenerS106S0200000_2.l1).invoke();
    }

    public static final void onClick$18(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        C1164304gz c1164304gz = (C1164304gz) aCListenerS106S0200000_2.l0;
        int i = c1164304gz.LIZ;
        if (i > 0) {
            c1164304gz.LIZJ.invoke((TuxIconView) aCListenerS106S0200000_2.l1, Integer.valueOf(i - 1));
        }
    }

    public static final void onClick$19(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        C1164304gz c1164304gz = (C1164304gz) aCListenerS106S0200000_2.l0;
        int i = c1164304gz.LIZ;
        if (i < c1164304gz.LIZIZ - 1) {
            c1164304gz.LIZJ.invoke((TuxIconView) aCListenerS106S0200000_2.l1, Integer.valueOf(i + 1));
        }
    }

    public static final void onClick$2(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        C1699106l3 c1699106l3 = (C1699106l3) aCListenerS106S0200000_2.l0;
        c1699106l3.getClass();
        C786410Ut5.LJLLLLLL(8, c1699106l3);
        c1699106l3.LLZLI();
        ((Function0) aCListenerS106S0200000_2.l1).invoke();
    }

    public static final void onClick$20(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        ((InterfaceC1638406bG) aCListenerS106S0200000_2.l0).LIZ(2, "bric_recalled_user_risk_notice");
        C1643806c8 c1643806c8 = (C1643806c8) aCListenerS106S0200000_2.l1;
        int visibility = c1643806c8.getVisibility();
        c1643806c8.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1643806c8);
        c1643806c8.LLZLI();
    }

    public static final void onClick$21(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        String str;
        String aid;
        Context context;
        User author;
        StoryHighlightInfo storyHighlightInfo = ((VideoItemParams) aCListenerS106S0200000_2.l0).getAweme().storyHighlightInfo;
        if (storyHighlightInfo != null) {
            StoryHighlightCollection storyHighlightCollection = storyHighlightInfo.primaryCollectionInfo;
            if (storyHighlightCollection == null || (str = storyHighlightCollection.collectionId) == null) {
                StoryHighlightCollection storyHighlightCollection2 = storyHighlightInfo.containerCollectionInfo;
                if (storyHighlightCollection2 != null) {
                    str = storyHighlightCollection2.collectionId;
                } else {
                    return;
                }
            }
            if (str == null || (aid = ((VideoItemParams) aCListenerS106S0200000_2.l0).getAweme().getAid()) == null || (context = ((StoryHighlightsAnchorComponent) aCListenerS106S0200000_2.l1).getContext()) == null || (author = ((VideoItemParams) aCListenerS106S0200000_2.l0).getAweme().getAuthor()) == null) {
                return;
            }
            ((StoryHighlightsAnchorComponent) aCListenerS106S0200000_2.l1).getClass();
            C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
            c1749280vcc.LJ();
            C21560119Zf c21560119Zf = new C21560119Zf(context);
            c21560119Zf.LIZ.LJIJI = c1749280vcc;
            DialogInterfaceC21560019Ze dialogInterfaceC21560019ZeLIZ = c21560119Zf.LIZ();
            Window window = dialogInterfaceC21560019ZeLIZ.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = dialogInterfaceC21560019ZeLIZ.getWindow();
            if (window2 != null) {
                window2.clearFlags(2);
            }
            C786410Ut5.D4(dialogInterfaceC21560019ZeLIZ);
            C1440005kM.LIZ(new C453940Hr6(true, false, 6));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope((ViewModel) ((StoryHighlightsAnchorComponent) aCListenerS106S0200000_2.l1).LLJZ.getValue()), null, null, new C1613406Tk((StoryHighlightsAnchorComponent) aCListenerS106S0200000_2.l1, view, str, (VideoItemParams) aCListenerS106S0200000_2.l0, author, dialogInterfaceC21560019ZeLIZ, aid, null), 3);
        }
    }

    public static final void onClick$22(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        C1263950izp.LIZIZ((User) aCListenerS106S0200000_2.l0, view.getContext(), ((SelectedCardVM) ((RecUserSelectCell) aCListenerS106S0200000_2.l1).LLILZLL.getValue()).LL, ((SelectedCardVM) ((RecUserSelectCell) aCListenerS106S0200000_2.l1).LLILZLL.getValue()).LLILLJJLI, null, null, null, false, null, null, null, null, null, null, false, null, 0, null, 524280);
    }

    public static final void onClick$3(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        ((C1714406nW) aCListenerS106S0200000_2.l0).LIZIZ("click_chat_page_banner");
        ((C1714406nW) aCListenerS106S0200000_2.l0).getPrivacySettings().LJFF("dm_setting_friends", 1, C11S5.LIZ(), C1701940uOG.LIZIZ(), new AwS403S0200000_2((C1714406nW) aCListenerS106S0200000_2.l0, (TuxTextView) aCListenerS106S0200000_2.l1, 23), AFwS229S0000000_2.get$arr$(266), true);
    }

    public static final void onClick$4(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        FragmentManager parentFragmentManager;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        String str = WorkBenchFilterSheetFragment._pnsPageId;
        Context context = view.getContext();
        Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) aCListenerS106S0200000_2.l0);
        if (fragmentLJI != null) {
            parentFragmentManager = fragmentLJI.getParentFragmentManager();
        } else {
            parentFragmentManager = null;
        }
        if (parentFragmentManager != null) {
            WorkBenchFilterSheetFragment workBenchFilterSheetFragment = new WorkBenchFilterSheetFragment();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = workBenchFilterSheetFragment;
            c1390920mIc.LJIIIIZZ(1);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(616));
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = iLIZIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, context);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLIZJ;
            tuxSheet2.show(parentFragmentManager, "WorkBenchFilterSheetFragment");
        }
        C635080Ova c635080Ova = C635080Ova.LIZ;
        AssemVMLazy assemVMLazy = ((WorkBenchFilterAssem) aCListenerS106S0200000_2.l1).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = WorkBenchFilterAssem.LLJ;
        String strLIZ = C623900OdY.LIZ(((WorkBenchViewModel) assemVMLazy.getValue()).LLILZ);
        c635080Ova.getClass();
        C20684815ws.LJIILLIIL("enter_message_filter", C2097608Jq.LJIIJ(new Pair("enter_from", "brand_partnership_page"), new Pair("tab_name", strLIZ)));
    }

    public static final void onClick$5(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((Fragment) aCListenerS106S0200000_2.l0, C343970De7.LIZ);
        C635080Ova c635080Ova = C635080Ova.LIZ;
        AssemVMLazy assemVMLazy = ((WorkBenchFilterBtnAssem) aCListenerS106S0200000_2.l1).LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = WorkBenchFilterBtnAssem.LLJIJIL;
        String strLIZ = C623900OdY.LIZ(((WorkBenchViewModel) assemVMLazy.getValue()).LLILZ);
        c635080Ova.getClass();
        C635080Ova.LIZ(strLIZ, "cancel", null);
    }

    public static final void onClick$6(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        WorkBenchFilterBtnAssem workBenchFilterBtnAssem = (WorkBenchFilterBtnAssem) aCListenerS106S0200000_2.l0;
        View viewFindViewById = workBenchFilterBtnAssem.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = workBenchFilterBtnAssem.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.workbench_filter_done_btn);
            } else {
                viewFindViewById = null;
            }
            workBenchFilterBtnAssem.LLJ = (C197039127h) viewFindViewById;
        }
        ((C197039127h) viewFindViewById).setLoading(true);
        AssemVMLazy assemVMLazy = ((WorkBenchFilterBtnAssem) aCListenerS106S0200000_2.l0).LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = WorkBenchFilterBtnAssem.LLJIJIL;
        WorkBenchViewModel workBenchViewModel = (WorkBenchViewModel) assemVMLazy.getValue();
        workBenchViewModel.withState(new AwS588S0100000_9(workBenchViewModel, 451));
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((Fragment) aCListenerS106S0200000_2.l1, C343970De7.LIZ);
        C635080Ova c635080Ova = C635080Ova.LIZ;
        String strLIZ = C623900OdY.LIZ(((WorkBenchViewModel) ((WorkBenchFilterBtnAssem) aCListenerS106S0200000_2.l0).LLJI.getValue()).LLILZ);
        c635080Ova.getClass();
        C635080Ova.LIZ(strLIZ, "apply", null);
    }

    public static final void onClick$7(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) aCListenerS106S0200000_2.l0, "//story_thought_creation_activity");
        smartRouteBuildRoute.withParam("enter_from", ((StoryArchiveV2ListAssem) aCListenerS106S0200000_2.l1).Lo().LLILLL);
        smartRouteBuildRoute.withParam("enter_method", "archive_thought_tab_post_new");
        smartRouteBuildRoute.open();
    }

    public static final void onClick$8(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        Object obj;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("action", "expand");
        Boolean value = ((CreatorCareModeNewDesignFragment) aCListenerS106S0200000_2.l0).VR().LL.getValue();
        Boolean bool = Boolean.TRUE;
        String str = "on";
        if (Intrinsics.LJFF(value, bool)) {
            obj = "on";
        } else {
            obj = "off";
        }
        pairArr[1] = new Pair("care_mode_status", obj);
        if (!Intrinsics.LJFF(((CreatorCareModeNewDesignFragment) aCListenerS106S0200000_2.l0).VR().LLILLJJLI.getValue(), bool)) {
            str = "off";
        }
        pairArr[2] = new Pair("filter_all_status", str);
        C20684815ws.LJIILLIIL("cmt_care_mode_page_click", C2097608Jq.LJIIIIZZ(pairArr));
        C786410Ut5.LLZLL(((CreatorCareModeNewDesignFragment) aCListenerS106S0200000_2.l0).UR(), 0);
        ((TuxTextView) aCListenerS106S0200000_2.l1).setText(((CreatorCareModeNewDesignFragment) aCListenerS106S0200000_2.l0).getString(2131830112));
        C786410Ut5.h9((TuxTextView) aCListenerS106S0200000_2.l1, null);
    }

    public static final void onClick$9(ACListenerS106S0200000_2 aCListenerS106S0200000_2, View view) {
        ((C1671006gW) aCListenerS106S0200000_2.l0).LIZIZ();
        ((Function1) aCListenerS106S0200000_2.l1).invoke(Boolean.TRUE);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS106S0200000_2(androidx.fragment.app.Fragment r2, com.ss.android.ugc.aweme.inbox.workbench.assem.filter.WorkBenchFilterBtnAssem r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 5 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS106S0200000_2.<init>(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.inbox.workbench.assem.filter.WorkBenchFilterBtnAssem, int):void");
    }

    public ACListenerS106S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
