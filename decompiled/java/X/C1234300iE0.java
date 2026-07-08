package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.relation.experiment.LinkReflowPopupIterationSharerExp;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0iE0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234300iE0 {
    public static final C1234300iE0 LIZ = new C1234300iE0();
    public static C1234310iE1 LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0iDx, java.lang.Object] */
    public final synchronized C1234310iE1 LIZ() {
        C1234310iE1 c1234310iE1;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c1234310iE1 = LIZIZ;
        if (c1234310iE1 != null) {
            if (!Intrinsics.LJFF(c1234310iE1.LIZ, curUserId)) {
                InterfaceC1234320iE2 interfaceC1234320iE2 = c1234310iE1.LIZIZ;
                if (interfaceC1234320iE2 != null) {
                    interfaceC1234320iE2.deInit();
                }
                InterfaceC1234330iE3 interfaceC1234330iE3 = c1234310iE1.LIZJ;
                if (interfaceC1234330iE3 != null) {
                    interfaceC1234330iE3.deInit();
                }
            }
        }
        ?? r6 = new InterfaceC1234320iE2() { // from class: X.0iDx
            @Override // X.InterfaceC1234320iE2
            public final void deInit() {
                EventBus.LIZLLL().LJJI(this);
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onChannelShare(C1234290iDz c1234290iDz) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChannelShare, success: ");
                c1234290iDz.getClass();
                sbLIZ.append(true);
                sbLIZ.append(", channel=");
                sbLIZ.append(c1234290iDz.LIZIZ.key());
                C1720106oR.LJI("@LinkRelation", C2188811AlT.LIZIZ(sbLIZ));
                Context context = c1234290iDz.LIZ;
                InterfaceC1369790lkX interfaceC1369790lkX = c1234290iDz.LIZIZ;
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy") && ComplianceServiceProvider.LJIJJ().LJJIJIIJI()) {
                        C451701pL.LIZ.getClass();
                        C451701pL.LIZ(c19egLIZIZ);
                    } else {
                        if (!c19egLIZIZ.isFinishing() && C451401pI.LIZ()) {
                            final boolean z = !Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy");
                            LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(c19egLIZIZ, null, false);
                            final Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                            final C5182020e c5182020e = new C5182020e(c19egLIZIZ, 648);
                            lifecycleOwnerRequireMainSAFLifecycle.getLifecycle().addObserver(new LifecycleEventObserver(z, event, c5182020e) { // from class: com.ss.android.ugc.aweme.relation.utils.CommonExtKt$runOn$observer$1
                                public boolean LL;
                                public final /* synthetic */ Lifecycle.Event LLILLJJLI;
                                public final /* synthetic */ Function0<Unit> LLILLL;

                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                                    if (event2 == this.LLILLJJLI) {
                                        if (!this.LL) {
                                            this.LLILLL.invoke();
                                            lifecycleOwner.getLifecycle().removeObserver(this);
                                        }
                                        this.LL = false;
                                    }
                                }

                                {
                                    this.LLILLJJLI = event;
                                    this.LLILLL = c5182020e;
                                    this.LL = z;
                                }
                            });
                            return;
                        }
                        C1720106oR.LJI("@LinkRelation", "not enable showPrivacyNotice, skip!");
                    }
                }
            }

            @Override // X.InterfaceC1234320iE2
            public final void LIZ(EnumC1373410lqN enumC1373410lqN, C0XI4 c0xi4) {
                EnumC1234280iDy enumC1234280iDy;
                LinkReflowPopupIterationSharerExp.LinkReflowParams linkReflowParams;
                LinkReflowPopupIterationSharerExp.LinkReflowParams linkReflowParams2;
                LinkReflowPopupIterationSharerExp.LinkReflowParams linkReflowParams3;
                String strLJFF = c0xi4.LJFF();
                boolean z = false;
                if (!a0.LJJIIZI(strLJFF, "timestamp", false)) {
                    c0xi4.LIZJ(System.currentTimeMillis() / 1000, "timestamp");
                }
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    if (!a0.LJJIIZI(strLJFF, "user_id", false)) {
                        c0xi4.LJ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    }
                    if (!a0.LJJIIZI(strLJFF, "sec_user_id", false)) {
                        c0xi4.LJ("sec_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId());
                    }
                } else {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LJI("@LinkRelation", "current user not login, skip uid append");
                }
                switch (C1373420lqO.LIZ[enumC1373410lqN.ordinal()]) {
                    case 1:
                        enumC1234280iDy = EnumC1234280iDy.USER;
                        break;
                    case 2:
                        enumC1234280iDy = EnumC1234280iDy.VIDEO_POST;
                        break;
                    case 3:
                        enumC1234280iDy = EnumC1234280iDy.CHALLENGE;
                        break;
                    case 4:
                        enumC1234280iDy = EnumC1234280iDy.MUSIC;
                        break;
                    case 5:
                        enumC1234280iDy = EnumC1234280iDy.STICKERS;
                        break;
                    case 6:
                        enumC1234280iDy = EnumC1234280iDy.INVITE_FRIENDS;
                        break;
                    case 7:
                        enumC1234280iDy = EnumC1234280iDy.LIVE;
                        break;
                    case 8:
                        enumC1234280iDy = EnumC1234280iDy.SEARCH;
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        enumC1234280iDy = EnumC1234280iDy.QA;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        enumC1234280iDy = EnumC1234280iDy.GROUP_CHAT;
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        enumC1234280iDy = EnumC1234280iDy.PHOTO_VIDEO;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        enumC1234280iDy = EnumC1234280iDy.PRODUCT;
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        enumC1234280iDy = EnumC1234280iDy.PLAYLIST;
                        break;
                    case 14:
                        enumC1234280iDy = EnumC1234280iDy.MULTI_LIVE;
                        break;
                    case 15:
                        enumC1234280iDy = EnumC1234280iDy.SUBSCRIBE_INVITE;
                        break;
                    case 16:
                        enumC1234280iDy = EnumC1234280iDy.COMMENT;
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        enumC1234280iDy = EnumC1234280iDy.STORY;
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        enumC1234280iDy = EnumC1234280iDy.VIDEO_COLLECTION;
                        break;
                    case 19:
                        enumC1234280iDy = EnumC1234280iDy.POI;
                        break;
                    default:
                        enumC1234280iDy = EnumC1234280iDy.DEFAULT;
                        break;
                }
                if (!a0.LJJIIZI(strLJFF, "social_share_type", false)) {
                    c0xi4.LIZIZ(enumC1234280iDy.getRawValue(), "social_share_type");
                }
                if (enumC1234280iDy == EnumC1234280iDy.VIDEO_POST || enumC1234280iDy == EnumC1234280iDy.PHOTO_VIDEO) {
                    C01GW c01gw = LinkReflowPopupIterationSharerExp.LIZIZ;
                    LinkReflowPopupIterationSharerExp.LinkReflowParams linkReflowParams4 = (LinkReflowPopupIterationSharerExp.LinkReflowParams) c01gw.getValue();
                    if (linkReflowParams4 != null && linkReflowParams4.followToPlayDuration != null && (linkReflowParams = (LinkReflowPopupIterationSharerExp.LinkReflowParams) c01gw.getValue()) != null && linkReflowParams.clickEmptyToPlay != null && (linkReflowParams2 = (LinkReflowPopupIterationSharerExp.LinkReflowParams) c01gw.getValue()) != null && linkReflowParams2.profileClickable != null && (linkReflowParams3 = (LinkReflowPopupIterationSharerExp.LinkReflowParams) c01gw.getValue()) != null && linkReflowParams3.dynamicCover != null) {
                        z = true;
                    }
                    if (z) {
                        Object value = c01gw.getValue();
                        if (value != null) {
                            C1227904rF.LIZ.getClass();
                            c0xi4.LJ("link_reflow_popup_iteration_sharer", C1227904rF.LJI(value));
                        }
                    } else {
                        c0xi4.LJ("link_reflow_popup_iteration_sharer", "{}");
                    }
                }
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("@LinkRelation", "appendParams for type=" + enumC1234280iDy + ", url=" + c0xi4.LJFF());
            }
        };
        EventBus.LIZLLL().LJIJJ(r6);
        C1234160iDm c1234160iDm = new C1234160iDm(0);
        InterfaceC497601wk interfaceC497601wk = c1234160iDm.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C327420CsW(c1234160iDm, null), 2);
        c1234310iE1 = new C1234310iE1(curUserId, r6, c1234160iDm);
        LIZIZ = c1234310iE1;
        return c1234310iE1;
    }
}
