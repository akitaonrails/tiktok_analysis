package Y;

import X.C0CHQ;
import X.C0LAB;
import X.C1630940sXk;
import X.C1631020sXs;
import X.C1635790sfZ;
import X.C1637820siq;
import X.C1638250sjX;
import X.C1638260sjY;
import X.C1638280sja;
import X.C1643750ssP;
import X.C1643970ssl;
import X.C1654280t9O;
import X.C1662060tLw;
import X.C1663620tOS;
import X.C1663630tOT;
import X.C1749260vca;
import X.C20684815ws;
import X.C21366318jV;
import X.C547790Le5;
import X.C737910Sx3;
import X.InterfaceC1630950sXl;
import X.InterfaceC1631390sYT;
import X.InterfaceC1636410sgZ;
import X.InterfaceC1638030sjB;
import X.ViewOnClickListenerC1638020sjA;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment;
import com.ss.android.ugc.aweme.aiportrait.detail.assem.AIPortraitDetailDescAssem;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitLauncher;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.theater.common.ContinueConfig;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class ACListenerS127S0200000_25 implements View.OnClickListener {
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
        }
    }

    public static final void onClick$0(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        if (C1662060tLw.LIZIZ(view) || ((ShortVideoContext) aCListenerS127S0200000_25.l0).LJJJJLL()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", ((ShortVideoContext) aCListenerS127S0200000_25.l0).getCreationId());
        c0lab.LJ("shoot_way", ((ShortVideoContext) aCListenerS127S0200000_25.l0).shootWay);
        c0lab.LIZ(((ShortVideoContext) aCListenerS127S0200000_25.l0).draftId, "draft_id");
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LIZ(((ShortVideoContext) aCListenerS127S0200000_25.l0).videoLength, "creation_duration");
        C20684815ws.LJIILLIIL("change_music", c0lab.LIZ);
        ((C1654280t9O) aCListenerS127S0200000_25.l1).LLJI.LJIIJ.LJIIJ(Unit.LIZ);
    }

    public static final void onClick$1(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        ((C1637820siq) aCListenerS127S0200000_25.l0).LJJJJLL(false);
        ((C1637820siq) aCListenerS127S0200000_25.l0).LLILZIL.invoke((FrameLayout) aCListenerS127S0200000_25.l1);
    }

    public static final void onClick$10(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        String effectId;
        Effect effect = ((C1630940sXk) aCListenerS127S0200000_25.l0).LLILLJJLI;
        if (effect != null && (effectId = effect.getEffectId()) != null && effectId.length() != 0) {
            ((InterfaceC1630950sXl) aCListenerS127S0200000_25.l1).LIZ(((C1630940sXk) aCListenerS127S0200000_25.l0).LLILLJJLI);
        }
    }

    public static final void onClick$11(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        InterfaceC1638030sjB interfaceC1638030sjB = ((ViewOnClickListenerC1638020sjA) aCListenerS127S0200000_25.l0).LLJJJJLIIL;
        if (interfaceC1638030sjB != null) {
            ((InterfaceC1636410sgZ) aCListenerS127S0200000_25.l1).LIZ(interfaceC1638030sjB);
        }
    }

    public static final void onClick$2(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        if (((C1663630tOT) aCListenerS127S0200000_25.l0).getAdapterPosition() >= 0 && ((C1663630tOT) aCListenerS127S0200000_25.l0).getAdapterPosition() < ((C1663620tOS) aCListenerS127S0200000_25.l1).LLIZLLLIL.size()) {
            ((C1663620tOS) aCListenerS127S0200000_25.l1).LL.invoke(Integer.valueOf(((C1663630tOT) aCListenerS127S0200000_25.l0).getAdapterPosition()), ((C1663620tOS) aCListenerS127S0200000_25.l1).LLIZLLLIL.get(((C1663630tOT) aCListenerS127S0200000_25.l0).getAdapterPosition()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$3(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        IAIPortraitLauncher iAIPortraitLauncherLIZ;
        Activity activityLIZIZ;
        if (!((AIPortraitDetailFragment) aCListenerS127S0200000_25.l0).hS()) {
            String creationId = ((AIPortraitDetailFragment) aCListenerS127S0200000_25.l0).getCreationId();
            AIPortraitDetailFragment aIPortraitDetailFragment = (AIPortraitDetailFragment) aCListenerS127S0200000_25.l0;
            aIPortraitDetailFragment.getClass();
            AIPortraitEventService aIPortraitEventServiceCS = AIPortraitDetailFragment.cS();
            if (aIPortraitEventServiceCS != null) {
                aIPortraitEventServiceCS.reportEditProfileEntranceClick(aIPortraitDetailFragment.WR(creationId));
            }
            Context context = ((AIPortraitDetailDescAssem) aCListenerS127S0200000_25.l1).getContext();
            if (context != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null) {
                AIPortraitDetailFragment aIPortraitDetailFragment2 = (AIPortraitDetailFragment) aCListenerS127S0200000_25.l0;
                aIPortraitDetailFragment2.kS(activityLIZIZ, creationId, new ContinueConfig("//ai_portrait/customize", aIPortraitDetailFragment2.UR(AIGC.AICreationSceneName.CAMEO_CREATED_CONTINUE.INSTANCE, AIGC.RefPageName.FaceSoundVerify.INSTANCE, creationId).LIZIZ(), null, 0 == true ? 1 : 0, 12));
                return;
            }
            return;
        }
        String creationId2 = ((AIPortraitDetailFragment) aCListenerS127S0200000_25.l0).getCreationId();
        AIPortraitEnterParams aIPortraitEnterParamsUR = ((AIPortraitDetailFragment) aCListenerS127S0200000_25.l0).UR(null, null, creationId2);
        ((AIPortraitDetailFragment) aCListenerS127S0200000_25.l0).mS(creationId2);
        Context context2 = ((AIPortraitDetailDescAssem) aCListenerS127S0200000_25.l1).getContext();
        if (context2 == null) {
            return;
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ == null || (iAIPortraitLauncherLIZ = iAIPortraitFeatureServiceLIZ.LIZ()) == null) {
            return;
        }
        iAIPortraitLauncherLIZ.openPortraitCustomizeTab(context2, aIPortraitEnterParamsUR);
    }

    public static final void onClick$4(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        ((C1749260vca) aCListenerS127S0200000_25.l0).getEditTextView().setText("");
        ((C1643750ssP) aCListenerS127S0200000_25.l1).LIZ(true);
    }

    public static final void onClick$5(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        C1643970ssl c1643970ssl = (C1643970ssl) aCListenerS127S0200000_25.l0;
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) aCListenerS127S0200000_25.l1;
        c1643970ssl.LJI.onNext(effectCategoryResponse);
        c1643970ssl.LJIJ(effectCategoryResponse, true, false);
    }

    public static final void onClick$6(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        C1638250sjX c1638250sjX = (C1638250sjX) aCListenerS127S0200000_25.l0;
        boolean z = c1638250sjX.LJII;
        if (!z) {
            Integer num = c1638250sjX.LJIIIIZZ;
            if (num != null) {
                Context context = (Context) aCListenerS127S0200000_25.l1;
                C1638280sja.LIZLLL(C21366318jV.LIZLLL, context, context.getResources().getString(num.intValue())).LIZ();
                return;
            }
            return;
        }
        Function1<? super Boolean, Boolean> function1 = c1638250sjX.LIZIZ.LJIIIIZZ;
        if (function1 != null && function1.invoke(Boolean.valueOf(z)).booleanValue()) {
            return;
        }
        C1638250sjX c1638250sjX2 = (C1638250sjX) aCListenerS127S0200000_25.l0;
        C1638260sjY c1638260sjY = c1638250sjX2.LIZIZ;
        if (!c1638260sjY.LJIILIIL) {
            c1638250sjX2.LIZLLL.animate().rotationBy(-180).setDuration(200L).withStartAction(new ARunnableS116S0100000_16(c1638250sjX2, 214)).withEndAction(new ARunnableS116S0100000_16(c1638250sjX2, 215)).start();
        }
        Function1<? super View, Unit> function12 = c1638260sjY.LJI;
        if (function12 != null) {
            function12.invoke(c1638250sjX2.LIZLLL);
        }
    }

    public static final void onClick$7(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        Context context;
        String str;
        Context context2;
        String string;
        ((C1631020sXs) aCListenerS127S0200000_25.l0).LIZ.creativeModel.commerceModel.setShowedCommerceTransformButton(false);
        ((C1631020sXs) aCListenerS127S0200000_25.l0).LIZ.creativeModel.commerceModel.setShowedCommerceTransformBottomButton(true);
        ((C1631020sXs) aCListenerS127S0200000_25.l0).LIZJ.LIZIZ(String.valueOf(((FaceStickerBean) aCListenerS127S0200000_25.l1).getStickerId()));
        InterfaceC1631390sYT commerceService = C0CHQ.LIZ().getCommerceService();
        TextView textView = ((C1631020sXs) aCListenerS127S0200000_25.l0).LJ;
        if (textView != null) {
            context = textView.getContext();
        } else {
            context = null;
        }
        FaceStickerCommerceBean faceStickerCommerceBean = ((FaceStickerBean) aCListenerS127S0200000_25.l1).getFaceStickerCommerceBean();
        if (faceStickerCommerceBean != null) {
            str = faceStickerCommerceBean.commerceStickerOpenUrl;
        } else {
            str = null;
        }
        commerceService.getClass();
        if (!((ICommercializeFromMainOutService) PluggableExtentionKt.pluggableSpi(ICommercializeFromMainOutService.class)).LIZ(context, str)) {
            InterfaceC1631390sYT commerceService2 = C0CHQ.LIZ().getCommerceService();
            TextView textView2 = ((C1631020sXs) aCListenerS127S0200000_25.l0).LJ;
            if (textView2 != null) {
                context2 = textView2.getContext();
            } else {
                context2 = null;
            }
            C1631020sXs c1631020sXs = (C1631020sXs) aCListenerS127S0200000_25.l0;
            FaceStickerCommerceBean faceStickerCommerceBean2 = ((FaceStickerBean) aCListenerS127S0200000_25.l1).getFaceStickerCommerceBean();
            if (faceStickerCommerceBean2 != null) {
                string = faceStickerCommerceBean2.commerceStickerWebUrl;
            } else {
                string = null;
            }
            String strValueOf = String.valueOf(((FaceStickerBean) aCListenerS127S0200000_25.l1).getStickerId());
            c1631020sXs.getClass();
            if (!TextUtils.isEmpty(string)) {
                Uri.Builder builderAppendQueryParameter = UriProtector.parse(string).buildUpon().appendQueryParameter("enter_from", "commerce_sticker_button");
                if (TextUtils.isEmpty(strValueOf)) {
                    strValueOf = "";
                }
                string = builderAppendQueryParameter.appendQueryParameter("sticker_id", strValueOf).build().toString();
            }
            commerceService2.getClass();
            ((ICommercializeFromMainOutService) PluggableExtentionKt.pluggableSpi(ICommercializeFromMainOutService.class)).openAdWebUrl(context2, string, null);
        }
    }

    public static final void onClick$8(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        ((C1635790sfZ) aCListenerS127S0200000_25.l0).LJI.setValue(Unit.LIZ);
        ((Function0) aCListenerS127S0200000_25.l1).invoke();
    }

    public static final void onClick$9(ACListenerS127S0200000_25 aCListenerS127S0200000_25, View view) {
        ((Function1) aCListenerS127S0200000_25.l0).invoke((ComposerNode) aCListenerS127S0200000_25.l1);
    }

    public ACListenerS127S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
