package Y;

import X.AbstractC1086230eNB;
import X.AbstractC1125980fPI;
import X.AbstractC1273900jFs;
import X.C013C;
import X.C01C5;
import X.C05XL;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0IPN;
import X.C0J1N;
import X.C0TDH;
import X.C0UY5;
import X.C1086220eNA;
import X.C1086280eNG;
import X.C1086300eNI;
import X.C1086310eNJ;
import X.C1086780eO4;
import X.C1086790eO5;
import X.C1086800eO6;
import X.C1091220eVE;
import X.C1091240eVG;
import X.C1092370eX5;
import X.C1097970eg7;
import X.C1098020egC;
import X.C1098060egG;
import X.C1099230ei9;
import X.C1101600ely;
import X.C1104590eqn;
import X.C1104630eqr;
import X.C1104710eqz;
import X.C1107580evc;
import X.C1111930f2d;
import X.C1114360f6Y;
import X.C1114470f6j;
import X.C1114490f6l;
import X.C1116260f9c;
import X.C1116280f9e;
import X.C1116320f9i;
import X.C1117000fAo;
import X.C1117630fBp;
import X.C1118100fCa;
import X.C1118340fCy;
import X.C1119630fF3;
import X.C1120780fGu;
import X.C1120930fH9;
import X.C1120950fHB;
import X.C1120960fHC;
import X.C1121070fHN;
import X.C1121190fHZ;
import X.C1124340fMe;
import X.C1125940fPE;
import X.C1125970fPH;
import X.C1125990fPJ;
import X.C1128450fTH;
import X.C1128460fTI;
import X.C1128760fTm;
import X.C1136460fgC;
import X.C1140740fn6;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1148060fyu;
import X.C1151400g4I;
import X.C1151950g5B;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C11RD;
import X.C1295960jpS;
import X.C1324720kZq;
import X.C13LP;
import X.C158B;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C189200o6;
import X.C1909107dp;
import X.C19322110iZ;
import X.C19748512Ol;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2382909Vj;
import X.C238400w2;
import X.C255000yi;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C520010KaN;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1086920eOI;
import X.EnumC1117590fBl;
import X.EnumC1118040fCU;
import X.EnumC1120810fGx;
import X.InterfaceC1094160eZy;
import X.InterfaceC1114450f6h;
import X.InterfaceC1116370f9n;
import X.InterfaceC1116970fAl;
import X.InterfaceC1118110fCb;
import X.InterfaceC1118350fCz;
import X.InterfaceC1119640fF4;
import X.InterfaceC1121180fHY;
import X.InterfaceC1121280fHi;
import X.InterfaceC1126580fQG;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC773910UXl;
import X.InterfaceC978780bZs;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.chatroom.banner.panel.BannerPanelFragment;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.chatroom.model.ShortTouchBusiness;
import com.bytedance.android.livesdk.chatroom.model.ShortTouchConfig;
import com.bytedance.android.livesdk.chatroom.model.UnifyBaseShortTouchGetResponse;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.dataChannel.MiddleTouchDataList;
import com.bytedance.android.livesdk.dataChannel.StartPollMessageSEIEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.event.TreasureBoxStatusChannel;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.interaction.poll.network.StartPollResponse;
import com.bytedance.android.livesdk.interaction.poll.ui.PollManageDialog;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerPageV2OptimizeSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveMiddleTouchContainerSchemaV2Setting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveStreamGoalRequestOptSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.ShortTouchMessage;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.IBusinessData;
import webcast.api.room.IUnifyBaseConfig;
import webcast.api.room.UnifyBaseBusinessResponse;

/* JADX INFO: loaded from: classes18.dex */
public class AfS153S0200000_17 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws Exception {
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
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                accept$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                accept$34(this, obj);
                break;
            case 35:
                accept$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                accept$36(this, obj);
                break;
        }
    }

    public AfS153S0200000_17(ImageModel imageModel, int i) {
        this.$t = i;
        this.l0 = imageModel;
        this.l1 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        r1 = X.C0IJT.LIZ("livesdk_game_comment_detction_match");
        r1.LJJIJIIJIL(r7.getIdStr());
        r1.LJJII(X.C354201Zc.LIZ(r7.getStreamType()), "live_type");
        r1.LJJII(r8, "regrex");
        r1.LJJII(r8, "regex");
        r1.LIZ();
        r6 = r2.value;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS153S0200000_17 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS153S0200000_17.accept$0(Y.AfS153S0200000_17, java.lang.Object):void");
    }

    public static final void accept$1(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        String str;
        InterfaceC773910UXl interfaceC773910UXlProvideInteractionView;
        boolean zBooleanValue;
        int iIntValue;
        Integer num;
        C1C7U.LIZ("RedEnvelopePresenter@3e12.observerEvent$2$1");
        C1104630eqr c1104630eqr = (C1104630eqr) obj;
        if (c1104630eqr != null) {
            str = c1104630eqr.LIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "start_treasure_box") && (interfaceC773910UXlProvideInteractionView = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).provideInteractionView((LiveWidget) afS153S0200000_17.l0)) != null) {
            View view = ((LiveWidget) afS153S0200000_17.l0).getView();
            String str2 = c1104630eqr.LIZJ;
            WeakReference<InterfaceC978780bZs> weakReference = c1104630eqr.LIZIZ;
            C1104710eqz c1104710eqz = (C1104710eqz) afS153S0200000_17.l1;
            DataChannel dataChannel = c1104710eqz.LIZIZ;
            Boolean bool = c1104710eqz.LIZLLL;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = true;
            }
            DataChannel dataChannel2 = ((C1104710eqz) afS153S0200000_17.l1).LIZIZ;
            if (dataChannel2 != null && (num = (Integer) dataChannel2.gg0(TreasureBoxStatusChannel.class)) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            interfaceC773910UXlProvideInteractionView.LJFF(view, str2, weakReference, dataChannel, zBooleanValue, iIntValue);
        }
        C1C7U.LIZIZ("RedEnvelopePresenter@3e12.observerEvent$2$1");
    }

    public static final void accept$10(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("CommentMethod@ed7.handle$1$2");
        if (((C1114490f6l) obj).LIZIZ) {
            CompletionBlock completionBlock = (CompletionBlock) afS153S0200000_17.l0;
            ((C1117000fAo) afS153S0200000_17.l1).getClass();
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1116970fAl.class, null);
            ((InterfaceC1116970fAl) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            C2382909Vj.LIZ((CompletionBlock) afS153S0200000_17.l0, 0, null, null, 6);
        }
        C1C7U.LIZIZ("CommentMethod@ed7.handle$1$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$11(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        List<IBusinessData> list;
        int i;
        int size;
        Object c098200Yq;
        DataChannel dataChannel;
        C1C7U.LIZ("MiddleTouchWidget@3b6f.createSparkViewOnDemandV2$2");
        MiddleTouchWidget middleTouchWidget = (MiddleTouchWidget) afS153S0200000_17.l0;
        UnifyBaseBusinessResponse.Data data = (UnifyBaseBusinessResponse.Data) ((BaseResponse) obj).data;
        C1098020egC c1098020egC = (C1098020egC) afS153S0200000_17.l1;
        middleTouchWidget.getClass();
        Object obj2 = "";
        IUnifyBaseConfig iUnifyBaseConfig = null;
        if (data != null) {
            list = data.businessDataList;
            iUnifyBaseConfig = data.config;
        } else {
            list = null;
        }
        middleTouchWidget.LLILZ = iUnifyBaseConfig;
        if (LiveStreamGoalRequestOptSetting.INSTANCE.enable() && (dataChannel = middleTouchWidget.dataChannel) != null) {
            dataChannel.zW(MiddleTouchDataList.class, list);
        }
        if (list != null && middleTouchWidget.LLILZ != null && !list.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        c1098020egC.LJI = System.currentTimeMillis();
        c1098020egC.LIZ(Integer.valueOf(i ^ 1), "multi_api_result");
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        c1098020egC.LIZ(Integer.valueOf(size), "total_size");
        C1098060egG.LIZ.LIZLLL();
        if (i != 0) {
            C500260Jjc.LJJLIIIJJIZ(new AwS561S0100000_17(middleTouchWidget, 302));
        } else {
            String value = LiveMiddleTouchContainerSchemaV2Setting.INSTANCE.getValue();
            c1098020egC.LIZ(value, "container_schema");
            try {
                c098200Yq = C1107580evc.LIZJ(UriProtector.parse(value));
                if (c098200Yq == null) {
                    c098200Yq = "";
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            c1098020egC.LIZ(obj2, "container_url");
            if (value.length() != 0) {
                C500260Jjc.LJJLIIIJJIZ(new AwS418S0200000_17(middleTouchWidget, middleTouchWidget.B1(value, new AwS418S0200000_17(middleTouchWidget, data, 53), new AwS383S0200000_17(middleTouchWidget, data, 53), false), 52));
                middleTouchWidget.O1();
            }
        }
        C1C7U.LIZIZ("MiddleTouchWidget@3b6f.createSparkViewOnDemandV2$2");
    }

    public static final void accept$12(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        boolean z;
        int measuredWidth;
        C1C7U.LIZ("LiveConsumeBoostCardPresenter@7d3a.onCreate$8");
        int i = ((C1086310eNJ) obj).LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AbstractC1086230eNB abstractC1086230eNB = (AbstractC1086230eNB) afS153S0200000_17.l1;
                    if (abstractC1086230eNB.LLILLJJLI != null && abstractC1086230eNB.LLILLL != null && abstractC1086230eNB.LLILZIL != null && abstractC1086230eNB.LLILZLL != null && abstractC1086230eNB.LLIZ != null) {
                        if (!C1086280eNG.LIZIZ.LJI && !C1086280eNG.LIZIZ()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(abstractC1086230eNB.LLILLJJLI, (Property<View, Float>) View.ALPHA, 1.0f, 0.2f);
                        objectAnimatorOfFloat.setDuration(240L);
                        objectAnimatorOfFloat.setInterpolator(abstractC1086230eNB.LIZLLL());
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(abstractC1086230eNB.LLILLJJLI, (Property<View, Float>) View.ALPHA, 0.2f, 1.0f);
                        objectAnimatorOfFloat2.setDuration(80L);
                        objectAnimatorOfFloat2.setInterpolator(abstractC1086230eNB.LIZLLL());
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(abstractC1086230eNB.LLILLJJLI, (Property<View, Float>) View.ALPHA, 1.0f, 0.2f);
                        objectAnimatorOfFloat3.setDuration(240L);
                        objectAnimatorOfFloat3.setInterpolator(abstractC1086230eNB.LIZLLL());
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(abstractC1086230eNB.LLILLJJLI, (Property<View, Float>) View.ALPHA, 0.2f, 1.0f);
                        objectAnimatorOfFloat4.setDuration(80L);
                        objectAnimatorOfFloat4.setInterpolator(abstractC1086230eNB.LIZLLL());
                        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(abstractC1086230eNB.LLILLJJLI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(abstractC1086230eNB.LLIZ, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(abstractC1086230eNB.LLILZIL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                        int i2 = (int) abstractC1086230eNB.LLJJ;
                        View view = abstractC1086230eNB.LLILLL;
                        if (view != null) {
                            view.measure(0, 0);
                        }
                        View view2 = abstractC1086230eNB.LLILLL;
                        if (view2 != null) {
                            measuredWidth = view2.getMeasuredWidth();
                        } else {
                            measuredWidth = i2;
                        }
                        if (measuredWidth < i2) {
                            i2 = measuredWidth;
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, 0);
                        valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(abstractC1086230eNB, 54));
                        valueAnimatorOfInt.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB, 31));
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, valueAnimatorOfInt);
                        animatorSet2.setDuration(250L);
                        animatorSet2.setInterpolator(abstractC1086230eNB.LIZLLL());
                        animatorSet2.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB, 33));
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (z) {
                            animatorSet3.playSequentially(animatorSet);
                        } else {
                            animatorSet3.playSequentially(animatorSet, animatorSet2);
                        }
                        animatorSet3.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB, 35));
                        animatorSet3.start();
                    } else {
                        C1086300eNI.LIZIZ();
                    }
                }
            } else {
                ((AbstractC1086230eNB) afS153S0200000_17.l1).LIZIZ(C1086280eNG.LIZIZ.LJII);
            }
        } else {
            View view3 = (View) afS153S0200000_17.l0;
            if (view3 != null) {
                HandlerHook.viewPostDelay(view3, new ARunnableS117S0100000_17((AbstractC1086230eNB) afS153S0200000_17.l1, 150), 1000L);
            }
        }
        C1C7U.LIZIZ("LiveConsumeBoostCardPresenter@7d3a.onCreate$8");
    }

    public static final void accept$13(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        View view;
        boolean z;
        boolean z2;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        C1C7U.LIZ("LiveConsumeBoostCardPresenter@7d3a.onCreate$9");
        int i = ((C1086220eNA) obj).LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            AbstractC1086230eNB abstractC1086230eNB = (AbstractC1086230eNB) afS153S0200000_17.l1;
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(abstractC1086230eNB.LLILZIL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                            int i2 = (int) abstractC1086230eNB.LLJJ;
                            TextView textView = abstractC1086230eNB.LLILZLL;
                            if (textView != null) {
                                textView.measure(0, 0);
                            }
                            View view2 = abstractC1086230eNB.LLILLL;
                            if (view2 != null) {
                                measuredWidth3 = view2.getMeasuredWidth();
                            } else {
                                measuredWidth3 = i2;
                            }
                            if (measuredWidth3 < i2) {
                                i2 = measuredWidth3;
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, 0);
                            valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(abstractC1086230eNB, 55));
                            valueAnimatorOfInt.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB, 32));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.setDuration(250L);
                            animatorSet.setInterpolator(abstractC1086230eNB.LIZLLL());
                            animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
                            animatorSet.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB, 34));
                            animatorSet.start();
                        }
                    } else {
                        AbstractC1086230eNB abstractC1086230eNB2 = (AbstractC1086230eNB) afS153S0200000_17.l1;
                        int i3 = (int) abstractC1086230eNB2.LLJJ;
                        TextView textView2 = abstractC1086230eNB2.LLILZLL;
                        if (textView2 != null) {
                            textView2.measure(0, 0);
                        }
                        TextView textView3 = abstractC1086230eNB2.LLILZLL;
                        if (textView3 != null) {
                            measuredWidth2 = textView3.getMeasuredWidth();
                        } else {
                            measuredWidth2 = i3;
                        }
                        if (measuredWidth2 < i3) {
                            i3 = measuredWidth2;
                        }
                        ValueAnimator duration = ValueAnimator.ofInt(0, i3).setDuration(350L);
                        duration.addUpdateListener(new AUListenerS266S0100000_17(abstractC1086230eNB2, 56));
                        duration.setInterpolator(abstractC1086230eNB2.LIZLLL());
                        duration.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB2, 36));
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(abstractC1086230eNB2.LLILZIL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.setDuration(250L);
                        animatorSet2.setInterpolator(abstractC1086230eNB2.LIZLLL());
                        animatorSet2.playTogether(duration, objectAnimatorOfFloat2);
                        animatorSet2.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB2, 38));
                        animatorSet2.start();
                    }
                } else {
                    AbstractC1086230eNB abstractC1086230eNB3 = (AbstractC1086230eNB) afS153S0200000_17.l1;
                    if (abstractC1086230eNB3.LLILLJJLI != null && (view = abstractC1086230eNB3.LLILLL) != null && abstractC1086230eNB3.LLILZIL != null && abstractC1086230eNB3.LLILZLL != null && abstractC1086230eNB3.LLIZ != null) {
                        if (view.getWidth() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!C1086280eNG.LIZIZ.LJI && !C1086280eNG.LIZIZ()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i4 = (int) abstractC1086230eNB3.LLJJ;
                        View view3 = abstractC1086230eNB3.LLILLL;
                        if (view3 != null) {
                            view3.measure(0, 0);
                        }
                        View view4 = abstractC1086230eNB3.LLILLL;
                        if (view4 != null) {
                            measuredWidth = view4.getMeasuredWidth();
                        } else {
                            measuredWidth = i4;
                        }
                        if (measuredWidth < i4) {
                            i4 = measuredWidth;
                        }
                        ValueAnimator duration2 = ValueAnimator.ofInt(0, i4).setDuration(350L);
                        duration2.addUpdateListener(new AUListenerS266S0100000_17(abstractC1086230eNB3, 52));
                        duration2.setInterpolator(abstractC1086230eNB3.LIZLLL());
                        duration2.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB3, 24));
                        ObjectAnimator.ofFloat(abstractC1086230eNB3.LLILZLL, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(abstractC1086230eNB3.LLJIJIL, (Property<LiveIconView, Float>) View.ALPHA, 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(abstractC1086230eNB3.LLIZ, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.setDuration(250L);
                        animatorSet3.setInterpolator(abstractC1086230eNB3.LIZLLL());
                        animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                        animatorSet3.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB3, 25));
                        ValueAnimator duration3 = ValueAnimator.ofInt(0, 0).setDuration(1000L);
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(abstractC1086230eNB3.LLIZ, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(abstractC1086230eNB3.LLILZLL, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        objectAnimatorOfFloat5.setDuration(250L);
                        objectAnimatorOfFloat5.setInterpolator(abstractC1086230eNB3.LIZLLL());
                        animatorSet4.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                        animatorSet4.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB3, 26));
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(abstractC1086230eNB3.LLILLJJLI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                        ObjectAnimator.ofFloat(abstractC1086230eNB3.LLILZLL, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f);
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(abstractC1086230eNB3.LLJIJIL, (Property<LiveIconView, Float>) View.ALPHA, 1.0f, 0.0f);
                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(abstractC1086230eNB3.LLILZIL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i4, 0);
                        valueAnimatorOfInt2.addUpdateListener(new AUListenerS266S0100000_17(abstractC1086230eNB3, 53));
                        valueAnimatorOfInt2.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB3, 27));
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        objectAnimatorOfFloat7.setDuration(250L);
                        objectAnimatorOfFloat7.setInterpolator(abstractC1086230eNB3.LIZLLL());
                        animatorSet5.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, valueAnimatorOfInt2);
                        animatorSet5.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB3, 28));
                        AnimatorSet animatorSet6 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        if (z) {
                            arrayList.add(duration2);
                        }
                        arrayList.add(animatorSet3);
                        arrayList.add(duration3);
                        if (z2) {
                            arrayList.add(animatorSet4);
                        } else {
                            arrayList.add(animatorSet5);
                        }
                        animatorSet6.playSequentially(arrayList);
                        animatorSet6.addListener(new ALAdapterS13S0100000_17(abstractC1086230eNB3, 30));
                        animatorSet6.start();
                    } else {
                        C1086300eNI.LIZIZ();
                    }
                }
            } else {
                ((AbstractC1086230eNB) afS153S0200000_17.l1).LIZIZ(C1086280eNG.LIZ);
            }
        } else {
            View view5 = (View) afS153S0200000_17.l0;
            if (view5 != null) {
                HandlerHook.viewPostDelay(view5, new ARunnableS117S0100000_17((AbstractC1086230eNB) afS153S0200000_17.l1, 151), 1000L);
            }
        }
        C1C7U.LIZIZ("LiveConsumeBoostCardPresenter@7d3a.onCreate$9");
    }

    public static final void accept$14(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1125990fPJ c1125990fPJ;
        InterfaceC1126580fQG interfaceC1126580fQG;
        boolean z;
        C1C7U.LIZ("LiveGiftRedEnvelopeViewHolderV2@622d.loadImage$4");
        AbstractC1125980fPI abstractC1125980fPI = (AbstractC1125980fPI) obj;
        if ((abstractC1125980fPI instanceof C1125970fPH) && (interfaceC1126580fQG = (c1125990fPJ = (C1125990fPJ) afS153S0200000_17.l0).LLJL) != null) {
            C1125970fPH c1125970fPH = (C1125970fPH) abstractC1125980fPI;
            long j = c1125970fPH.LIZIZ;
            if (!c1125970fPH.LIZ && !((C013C) afS153S0200000_17.l1).element) {
                z = false;
            } else {
                z = true;
            }
            interfaceC1126580fQG.LJLIIL(c1125990fPJ.getBindingAdapterPosition(), j, z);
        }
        C1C7U.LIZIZ("LiveGiftRedEnvelopeViewHolderV2@622d.loadImage$4");
    }

    public static final void accept$15(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1125940fPE c1125940fPE;
        InterfaceC1126580fQG interfaceC1126580fQG;
        boolean z;
        C1C7U.LIZ("LiveGiftSchemeEntranceViewHolder@52a.loadImage$4");
        AbstractC1125980fPI abstractC1125980fPI = (AbstractC1125980fPI) obj;
        if ((abstractC1125980fPI instanceof C1125970fPH) && (interfaceC1126580fQG = (c1125940fPE = (C1125940fPE) afS153S0200000_17.l0).LLJL) != null) {
            C1125970fPH c1125970fPH = (C1125970fPH) abstractC1125980fPI;
            long j = c1125970fPH.LIZIZ;
            if (!c1125970fPH.LIZ && !((C013C) afS153S0200000_17.l1).element) {
                z = false;
            } else {
                z = true;
            }
            interfaceC1126580fQG.LJLIIL(c1125940fPE.getBindingAdapterPosition(), j, z);
        }
        C1C7U.LIZIZ("LiveGiftSchemeEntranceViewHolder@52a.loadImage$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4 A[PHI: r16
      0x01d4: PHI (r16v1 int) = (r16v0 int), (r16v3 int), (r16v3 int) binds: [B:83:0x01c8, B:85:0x01cc, B:87:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$16(Y.AfS153S0200000_17 r31, java.lang.Object r32) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS153S0200000_17.accept$16(Y.AfS153S0200000_17, java.lang.Object):void");
    }

    public static final void accept$17(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        String prompt;
        int i;
        int i2;
        int i3;
        C1C7U.LIZ("StarCommentSender@43e4.sendInternal$2");
        Throwable th = (Throwable) obj;
        C1116280f9e c1116280f9e = (C1116280f9e) afS153S0200000_17.l0;
        C1116260f9c c1116260f9c = (C1116260f9c) afS153S0200000_17.l1;
        int i4 = c1116260f9c.LJI;
        Context context = c1116280f9e.LIZJ.getContext();
        if (context != null) {
            int i5 = c1116260f9c.LIZLLL;
            String str = c1116260f9c.LJIIIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (i5 != 10) {
                if (i5 == 20) {
                    str2 = "up_grade";
                }
            } else {
                str2 = "basic";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_send_fail");
            c474500IjALIZ.LJIL();
            C1116320f9i.LIZ(c474500IjALIZ);
            C1116320f9i.LIZIZ(c474500IjALIZ, th, "error_code");
            c474500IjALIZ.LJJII(str, "enter_from");
            c474500IjALIZ.LJJII(str2, "gear_type");
            c474500IjALIZ.LIZ();
            if (th instanceof C501470JlZ) {
                boolean z = true;
                List listLJIIJJI = C1697810uHb.LJIIJJI(4038005, 4038007, 4038039);
                if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().wk0(th).booleanValue()) {
                    if (i4 == 0) {
                        i2 = 1002;
                        i3 = 0;
                    } else {
                        BalanceStruct balanceStructG52 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52();
                        if (balanceStructG52 != null && balanceStructG52.exchangeInfo != null && balanceStructG52.validUser) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        i2 = i ^ 1;
                        i3 = 15;
                        z = false;
                    }
                    ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().MF1(context, th, i3, i2, z, "star_comment");
                    ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJII(c1116280f9e.LIZIZ, ((C501520Jle) th).getErrorCode(), Boolean.valueOf(c1116260f9c.LJII), c1116260f9c.LJI, "star_comment", "star_comment", c1116260f9c.LJ, null);
                } else {
                    C501470JlZ c501470JlZ = (C501470JlZ) th;
                    if (!listLJIIJJI.contains(Integer.valueOf(c501470JlZ.getErrorCode())) && (prompt = c501470JlZ.getPrompt()) != null && C500260Jjc.LJJIIZ(prompt)) {
                        C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                    }
                }
            }
        }
        InterfaceC1116370f9n interfaceC1116370f9n = ((C1116260f9c) afS153S0200000_17.l1).LJIIJ.get();
        if (interfaceC1116370f9n != null) {
            interfaceC1116370f9n.ut(th);
        }
        C1C7U.LIZIZ("StarCommentSender@43e4.sendInternal$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$18(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        T t;
        Map<String, MGetTranslationResponse.Data.Translation> map;
        C1111930f2d c1111930f2d = (C1111930f2d) afS153S0200000_17.l0;
        List list = (List) afS153S0200000_17.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        c1111930f2d.getClass();
        C1C7U.LIZ("PublicScreenPresenter@c5a7.onFetch$1L");
        ArrayList arrayList = new ArrayList();
        if (baseResponse != null && (t = baseResponse.data) != 0 && (map = ((MGetTranslationResponse.Data) t).translations) != null) {
            c1111930f2d.LLLLLLL.LIZLLL(list, map);
        } else {
            list = arrayList;
        }
        c1111930f2d.LLL.addAll(list);
        c1111930f2d.LJLLILLLL();
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.onFetch$1L");
    }

    public static final void accept$19(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) afS153S0200000_17.l0;
        List list = (List) afS153S0200000_17.l1;
        c1111930f2d.getClass();
        C1C7U.LIZ("PublicScreenPresenter@c5a7.onFetch$2L");
        c1111930f2d.LLL.addAll(list);
        c1111930f2d.LJLLILLLL();
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.onFetch$2L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1114360f6Y c1114360f6Y = (C1114360f6Y) afS153S0200000_17.l0;
        C1114470f6j c1114470f6j = (C1114470f6j) afS153S0200000_17.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        c1114360f6Y.getClass();
        C1C7U.LIZ("CommentPresenter@1a6e.sendBarrage$1L");
        C784440Upu.LIZ().LIZIZ(new C1114490f6l(c1114470f6j, true));
        c1114360f6Y.LL = true;
        T t = c1114360f6Y.mView;
        if (t == 0) {
            C1C7U.LIZIZ("CommentPresenter@1a6e.sendBarrage$1L");
        } else {
            ((InterfaceC1114450f6h) t).Ah2((Barrage) baseResponse.data);
            C1C7U.LIZIZ("CommentPresenter@1a6e.sendBarrage$1L");
        }
    }

    public static final void accept$20(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("StickerGiftTracker@368d.writeFirstFrameCrossScreenSei$1");
        C1136460fgC.LIZ.getClass();
        AbstractC1273900jFs abstractC1273900jFsLJIIIZ = C1136460fgC.LJIIIZ();
        if (abstractC1273900jFsLJIIIZ != null) {
            numValueOf = Integer.valueOf(abstractC1273900jFsLJIIIZ.LJJJJZI("live_cross_screen_first_frame_sei", true, false, "1610666001", 1, (JSONObject) afS153S0200000_17.l0));
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerGiftTracker addSeiFieldV2; write index: ");
        sbLIZ.append(obj);
        sbLIZ.append("; status: ");
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("CROSS_SEI", C2188811AlT.LIZIZ(sbLIZ));
        IInteractService iInteractService = C1128450fTH.LIZ;
        C1128450fTH.LIZ.We1("live_cross_screen_first_frame_sei", (Map) afS153S0200000_17.l1);
        C1C7U.LIZIZ("StickerGiftTracker@368d.writeFirstFrameCrossScreenSei$1");
    }

    public static final void accept$21(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        String str;
        C0UY5 c0uy5Cb;
        C1C7U.LIZ("GoodyBagPresenter@6f83.observerEvent$6$1");
        C1104630eqr c1104630eqr = (C1104630eqr) obj;
        if (c1104630eqr != null) {
            str = c1104630eqr.LIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "start_goody_bag") && (c0uy5Cb = ((IGoodyBagService) C1161920gLG.LIZJ(IGoodyBagService.class)).Cb()) != null) {
            View view = ((LiveWidget) afS153S0200000_17.l0).getView();
            String str2 = c1104630eqr.LIZJ;
            WeakReference<InterfaceC978780bZs> weakReference = c1104630eqr.LIZIZ;
            C1104590eqn c1104590eqn = (C1104590eqn) afS153S0200000_17.l1;
            c0uy5Cb.LJFF(view, str2, weakReference, c1104590eqn.LIZ, c1104590eqn.LIZJ, 0);
        }
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.observerEvent$6$1");
    }

    public static final void accept$22(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("UserInfoGuideAnimator@c8c.startAnimation$1");
        Bitmap bitmap = (Bitmap) obj;
        C1099230ei9 c1099230ei9 = (C1099230ei9) afS153S0200000_17.l0;
        if (c1099230ei9.LJJIIZI) {
            c1099230ei9.LJIL = bitmap;
            c1099230ei9.LJJ = true;
            ((C1099230ei9) afS153S0200000_17.l0).LIZLLL((C1295960jpS) afS153S0200000_17.l1);
        }
        C1C7U.LIZIZ("UserInfoGuideAnimator@c8c.startAnimation$1");
    }

    public static final void accept$23(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("GiftGuideUtils@574d.sendGuideGift$2$onSendGiftFailed$1$1");
        C1124340fMe c1124340fMe = (C1124340fMe) obj;
        if (c1124340fMe != null && c1124340fMe.LIZ) {
            ((Function0) afS153S0200000_17.l0).invoke();
        }
        ((C11NJ) afS153S0200000_17.l1).LJ();
        C1C7U.LIZIZ("GiftGuideUtils@574d.sendGuideGift$2$onSendGiftFailed$1$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$24(Y.AfS153S0200000_17 r6, java.lang.Object r7) {
        /*
            java.lang.String r5 = "GuardianAutographPresenter@8ef9.loadSavedAutograph$1"
            X.C1C7U.LIZ(r5)
            com.bytedance.android.live.network.response.BaseResponse r7 = (com.bytedance.android.live.network.response.BaseResponse) r7
            r4 = 0
            if (r7 == 0) goto L43
            T r3 = r7.data
            tikcast.api.persona.QueryGuardianAutographResponse$ResponseData r3 = (tikcast.api.persona.QueryGuardianAutographResponse.ResponseData) r3
            if (r3 == 0) goto L43
            tikcast.api.persona.PrivilegeImageXUploadedToken r1 = r3.imageXUploadedToken
            if (r1 == 0) goto L43
            java.lang.Object r0 = r6.l0
            X.0fBt r0 = (X.C1117670fBt) r0
            r0.LIZLLL = r1
            com.bytedance.android.live.base.model.ImageModel r2 = r3.autographUrl
            int r1 = r3.tnsStatus
            r0 = 20
            if (r1 != r0) goto L3b
            if (r2 == 0) goto L39
            java.util.List r0 = X.C842240X2g.LIZ(r2)
        L28:
            boolean r0 = X.C500260Jjc.LJJIJIIJI(r0)
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r6.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r2)
        L35:
            X.C1C7U.LIZIZ(r5)
            return
        L39:
            r0 = r4
            goto L28
        L3b:
            java.lang.Object r0 = r6.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r4)
            goto L35
        L43:
            java.lang.String r1 = "GuardianAutographPresenter"
            java.lang.String r0 = "queryGuardianAutograph: missing imageXUploadedToken"
            X.C20441214yg.LJ(r1, r0)
            java.lang.Object r0 = r6.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r4)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS153S0200000_17.accept$24(Y.AfS153S0200000_17, java.lang.Object):void");
    }

    public static final void accept$25(AfS153S0200000_17 afS153S0200000_17, Object obj) throws JSONException {
        C1C7U.LIZ("ShortTouchManager@c96e.requestShortTouch$1");
        UnifyBaseShortTouchGetResponse.Data data = ((UnifyBaseShortTouchGetResponse) obj).data;
        if (data != null) {
            C1101600ely c1101600ely = (C1101600ely) afS153S0200000_17.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) afS153S0200000_17.l1;
            c1101600ely.LLJJIII = true;
            for (ShortTouchConfig shortTouchConfig : data.configList) {
                c1101600ely.LLJJ.put(shortTouchConfig.subBusinessType, shortTouchConfig);
            }
            for (ShortTouchBusiness shortTouchBusiness : data.businessList) {
                ShortTouchConfig shortTouchConfig2 = (ShortTouchConfig) ((LinkedHashMap) c1101600ely.LLJJ).get(shortTouchBusiness.subBusinessType);
                if (shortTouchConfig2 != null || shortTouchBusiness.customPayload.length() != 0) {
                    Object obj2 = ((LinkedHashMap) c1101600ely.LLJ).get(shortTouchBusiness.subBusinessType);
                    if (shortTouchConfig2 != null) {
                        c1101600ely.LIZIZ(shortTouchBusiness, shortTouchConfig2, c1101600ely.LLILLJJLI, lifecycleOwner.getLifecycle());
                    } else if (obj2 != null) {
                        try {
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C20441214yg.LJI(c1101600ely.LL, th);
                        }
                    }
                }
            }
            List<ShortTouchMessage> list = c1101600ely.LLJJIJI;
            if (list != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    c1101600ely.LJ((ShortTouchMessage) it2.next());
                }
            }
            List<ShortTouchMessage> list2 = c1101600ely.LLJJIJI;
            if (list2 != null) {
                ((ArrayList) list2).clear();
            }
        }
        C1C7U.LIZIZ("ShortTouchManager@c96e.requestShortTouch$1");
    }

    public static final void accept$26(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("TeamRankManager@da65.updateRewardGiftInfo$2$1$1");
        InterfaceC1118350fCz interfaceC1118350fCz = ((C1118340fCy) afS153S0200000_17.l0).LJFF;
        if (interfaceC1118350fCz != null) {
            interfaceC1118350fCz.LIZ(((GiftsInfo.LimitedTimeRewardGiftInfo) afS153S0200000_17.l1).giftId);
        }
        C1C7U.LIZIZ("TeamRankManager@da65.updateRewardGiftInfo$2$1$1");
    }

    public static final void accept$27(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        Boolean boolValueOf;
        long id;
        InterfaceC2262081DgM currentUser;
        C1C7U.LIZ("BagListViewModel@cb9.onWidgetCreated$2");
        C255000yi c255000yi = (C255000yi) obj;
        if (c255000yi != null) {
            BagListViewModel bagListViewModel = (BagListViewModel) afS153S0200000_17.l0;
            Fragment fragment = (Fragment) afS153S0200000_17.l1;
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(bagListViewModel.LL);
            if (roomLJJLIIIIJ == null) {
                c255000yi.LIZJ.invoke(Boolean.FALSE, null);
            } else {
                if (fragment != null) {
                    boolValueOf = Boolean.valueOf(fragment.isAdded());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    c255000yi.LIZJ.invoke(Boolean.FALSE, null);
                } else {
                    int i = c255000yi.LIZ;
                    long id2 = roomLJJLIIIIJ.getId();
                    long ownerUserId = roomLJJLIIIIJ.getOwnerUserId();
                    InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                    if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                        id = currentUser.getId();
                    } else {
                        id = 0;
                    }
                    bagListViewModel.yQ2(i, id2, ownerUserId, id, new AwS383S0200000_17(c255000yi, fragment, 106));
                }
            }
        }
        C1C7U.LIZIZ("BagListViewModel@cb9.onWidgetCreated$2");
    }

    public static final void accept$28(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("RechargeUtilKt@d250.queryProductDetail$2$1");
        Diamond diamond = (Diamond) C13LP.LJJJLL((List) obj);
        if (diamond != null) {
            C1151400g4I c1151400g4I = (C1151400g4I) afS153S0200000_17.l1;
            diamond.id = c1151400g4I.LLILLL;
            diamond.givingCount = c1151400g4I.LLILZIL;
            diamond.count = c1151400g4I.LLILZ;
        } else {
            diamond = null;
        }
        ((C05XL) afS153S0200000_17.l0).LJIIZILJ(diamond);
        C1C7U.LIZIZ("RechargeUtilKt@d250.queryProductDetail$2$1");
    }

    public static final void accept$29(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("LiveGiftColorIconPresenter@c443.onReceiveIconInfo$2$1");
        if (!InterfaceC1094160eZy.b1.LIZIZ().booleanValue()) {
            C1120960fHC c1120960fHC = (C1120960fHC) afS153S0200000_17.l0;
            long j = ((C238400w2) afS153S0200000_17.l1).element;
            InterfaceC1121280fHi interfaceC1121280fHi = c1120960fHC.LIZJ;
            if (interfaceC1121280fHi != null) {
                interfaceC1121280fHi.LIZ(j);
            }
        }
        C1C7U.LIZIZ("LiveGiftColorIconPresenter@c443.onReceiveIconInfo$2$1");
    }

    public static final void accept$3(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1114360f6Y c1114360f6Y = (C1114360f6Y) afS153S0200000_17.l0;
        C1114470f6j c1114470f6j = (C1114470f6j) afS153S0200000_17.l1;
        Throwable th = (Throwable) obj;
        c1114360f6Y.getClass();
        C1C7U.LIZ("CommentPresenter@1a6e.sendBarrage$2L");
        C784440Upu.LIZ().LIZIZ(new C1114490f6l(c1114470f6j, false));
        c1114360f6Y.LL = true;
        T t = c1114360f6Y.mView;
        if (t == 0) {
            C1C7U.LIZIZ("CommentPresenter@1a6e.sendBarrage$2L");
            return;
        }
        if (th instanceof Exception) {
            ((InterfaceC1114450f6h) t).wX0((Exception) th);
        }
        C1C7U.LIZIZ("CommentPresenter@1a6e.sendBarrage$2L");
    }

    public static final void accept$30(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("LiveGiftColorIconPresenter@c443.onReceiveIconInfo$3");
        C1120960fHC c1120960fHC = (C1120960fHC) afS153S0200000_17.l0;
        long j = ((C238400w2) afS153S0200000_17.l1).element;
        InterfaceC1121280fHi interfaceC1121280fHi = c1120960fHC.LIZJ;
        if (interfaceC1121280fHi != null) {
            interfaceC1121280fHi.LIZ(j);
        }
        C1C7U.LIZIZ("LiveGiftColorIconPresenter@c443.onReceiveIconInfo$3");
    }

    public static final void accept$31(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("ToolbarGiftBehavior@a3b.onAnimationShown$1$1");
        C1120930fH9 c1120930fH9 = ((C1120780fGu) afS153S0200000_17.l0).LLILLL;
        if (c1120930fH9 != null) {
            c1120930fH9.LIZIZ((C1121190fHZ) afS153S0200000_17.l1);
        }
        C1C7U.LIZIZ("ToolbarGiftBehavior@a3b.onAnimationShown$1$1");
    }

    public static final void accept$32(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("ToolbarGiftBehavior@a3b.onBubbleDisappear$1");
        C1120930fH9 c1120930fH9 = ((C1120780fGu) afS153S0200000_17.l0).LLILLL;
        if (c1120930fH9 != null) {
            c1120930fH9.LIZIZ((C1121190fHZ) afS153S0200000_17.l1);
        }
        C1C7U.LIZIZ("ToolbarGiftBehavior@a3b.onBubbleDisappear$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104 A[EDGE_INSN: B:50:0x0104->B:40:0x0104 BREAK  A[LOOP:0: B:35:0x00f2->B:52:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$33(Y.AfS153S0200000_17 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS153S0200000_17.accept$33(Y.AfS153S0200000_17, java.lang.Object):void");
    }

    public static final void accept$34(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        int size;
        Object objLJIIIIZZ;
        String string;
        String str;
        C1C7U.LIZ("LiveGiftIconView@6ee6.addIconAnimation$1");
        if (((C1120950fHB) afS153S0200000_17.l0).getIView() != null) {
            C1121190fHZ c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.MATCH_ITEM_AWARD_GUIDE, EnumC1118040fCU.ANIMATION, 0L, (Integer) null, 24);
            InterfaceC1121180fHY iView = ((C1120950fHB) afS153S0200000_17.l0).getIView();
            if (iView != null) {
                iView.LIZJ(c1121190fHZ);
            }
            C1324720kZq c1324720kZq = ((C1120950fHB) afS153S0200000_17.l0).LLILZIL;
            if (c1324720kZq != null) {
                C500260Jjc.LJLJLJ(c1324720kZq, true);
            }
            C1120950fHB c1120950fHB = (C1120950fHB) afS153S0200000_17.l0;
            C1324720kZq c1324720kZq2 = c1120950fHB.LLILZIL;
            if (c1324720kZq2 != null) {
                C1121070fHN c1121070fHN = (C1121070fHN) afS153S0200000_17.l1;
                C1143920fsE c1143920fsE = new C1143920fsE();
                c1143920fsE.LJIILJJIL = true;
                c1143920fsE.LIZ = c1324720kZq2;
                c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_2");
                c1143920fsE.LIZJ = "ttlive_match_item_award_guide_anim.webp";
                c1143920fsE.LJFF = true;
                c1143920fsE.LJ = new C1151950g5B(c1120950fHB, 8);
                C1143680frq.LJIIIIZZ(c1143920fsE);
                int i = c1120950fHB.LLJJIJIL;
                List<Integer> list = c1121070fHN.LIZLLL;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                Integer numValueOf = Integer.valueOf(size);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (numValueOf != null && numValueOf.intValue() == 1 && list != null && (!list.isEmpty())) {
                    objLJIIIIZZ = C1120950fHB.LJII(((Number) ListProtector.get(list, 0)).intValue());
                } else {
                    objLJIIIIZZ = C1120950fHB.LJIIIIZZ(list);
                }
                linkedHashMap.put("match_item_type", String.valueOf(objLJIIIIZZ));
                linkedHashMap.put("show_type", "bubble");
                if (i > 0) {
                    linkedHashMap.put("mvp_ranking", String.valueOf(i));
                }
                linkedHashMap.put("pk_id", String.valueOf(C1128450fTH.LIZJ()));
                linkedHashMap.put("channel_id", String.valueOf(C1128450fTH.LIZ.getChannelId()));
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("user_id", string);
                linkedHashMap.put("is_multi", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0());
                linkedHashMap.put("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
                linkedHashMap.put("match_item_type_list", C1120950fHB.LJIIIIZZ(list).toString());
                linkedHashMap.put("match_item_cnts", String.valueOf(numValueOf));
                Map<String, String> mapOA0 = ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).oA0();
                if (mapOA0 == null || (str = mapOA0.get("team_member_cnts")) == null) {
                    str = "";
                }
                linkedHashMap.put("team_member_cnts", str);
                linkedHashMap.put("both_guest_cnt", String.valueOf(C1128450fTH.LIZIZ().size()));
                linkedHashMap.put("linker_mode", String.valueOf(C1140740fn6.LIZIZ().Uh()));
                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                linkedHashMap.put("fans_club_level", String.valueOf(C1128460fTI.LJI()));
                linkedHashMap.put("fans_club_status", String.valueOf(C1128460fTI.LJIIIIZZ(C1128460fTI.LJII())));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mvp_get_match_item_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(linkedHashMap);
                c474500IjALIZ.LIZ();
                c1120950fHB.LLJJIJIL = 0;
            }
        }
        C1C7U.LIZIZ("LiveGiftIconView@6ee6.addIconAnimation$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$35(Y.AfS153S0200000_17 r4, java.lang.Object r5) {
        /*
            java.lang.String r3 = "LiveBadgeLoadUtil@e077.loadBitmap$1"
            X.C1C7U.LIZ(r3)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L60
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.base.model.ImageModel r0 = (com.bytedance.android.live.base.model.ImageModel) r0
            java.lang.String r0 = r0.getUri()
            if (r0 == 0) goto L56
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r2 = X.C1121700fIO.LIZ
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.base.model.ImageModel r0 = (com.bytedance.android.live.base.model.ImageModel) r0
            java.lang.String r0 = r0.getUri()
            java.lang.Object r0 = r2.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L40
            java.lang.Object r1 = r0.get()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L40
            boolean r0 = r1.isRecycled()
            if (r0 != 0) goto L40
            java.lang.Object r0 = r4.l1
            X.0fIP r0 = (X.InterfaceC1121710fIP) r0
            if (r0 == 0) goto L3c
            r0.LIZIZ(r1)
        L3c:
            X.C1C7U.LIZIZ(r3)
            return
        L40:
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L56
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.base.model.ImageModel r0 = (com.bytedance.android.live.base.model.ImageModel) r0
            java.lang.String r1 = r0.getUri()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r2.put(r1, r0)
        L56:
            java.lang.Object r0 = r4.l1
            X.0fIP r0 = (X.InterfaceC1121710fIP) r0
            if (r0 == 0) goto L3c
            r0.LIZIZ(r5)
            goto L3c
        L60:
            java.lang.Object r1 = r4.l1
            X.0fIP r1 = (X.InterfaceC1121710fIP) r1
            if (r1 == 0) goto L3c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            r1.onFail()
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS153S0200000_17.accept$35(Y.AfS153S0200000_17, java.lang.Object):void");
    }

    public static final void accept$36(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("RemoteImage@b4c2.load$1");
        ((InterfaceC1119640fF4) afS153S0200000_17.l0).LIZ(new BitmapDrawable(((C1119630fF3) afS153S0200000_17.l1).LIZIZ.getResources(), (Bitmap) obj));
        C1C7U.LIZIZ("RemoteImage@b4c2.load$1");
    }

    public static final void accept$4(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) afS153S0200000_17.l0;
        LiveRecyclableWidget liveRecyclableWidget = (LiveRecyclableWidget) afS153S0200000_17.l1;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.getClass();
        C1C7U.LIZ("LandscapeAudienceInteractionFragment@c63d.loadPollEffectWidget$1L$1L");
        landscapeAudienceInteractionFragment.HU(liveRecyclableWidget);
        C1C7U.LIZIZ("LandscapeAudienceInteractionFragment@c63d.loadPollEffectWidget$1L$1L");
    }

    public static final void accept$5(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) afS153S0200000_17.l0;
        LiveRecyclableWidget liveRecyclableWidget = (LiveRecyclableWidget) afS153S0200000_17.l1;
        C0TDH c0tdh = (C0TDH) obj;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.getClass();
        C1C7U.LIZ("LandscapeAudienceInteractionFragment@c63d.loadPollEffectWidget$1L");
        if (c0tdh.isVoting()) {
            if (liveRecyclableWidget != null) {
                landscapeAudienceInteractionFragment.LLJJI.unload(liveRecyclableWidget);
            }
        } else if (c0tdh.isHasVoted() && landscapeAudienceInteractionFragment.LLLLIL.zQ2()) {
            ((C0J1N) C11NZ.LJLJJLL(3300L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(landscapeAudienceInteractionFragment))).LIZ(new AfS153S0200000_17(liveRecyclableWidget, landscapeAudienceInteractionFragment, 4), new AfS132S0000000_7(9));
        } else {
            landscapeAudienceInteractionFragment.HU(liveRecyclableWidget);
        }
        C1C7U.LIZIZ("LandscapeAudienceInteractionFragment@c63d.loadPollEffectWidget$1L");
    }

    public static final void accept$6(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        String string;
        boolean zLIZ;
        ArrayList arrayList;
        C1C7U.LIZ("NewTopRightBannerWidget@7df5.createBanner$2");
        C1092370eX5 c1092370eX5 = (C1092370eX5) obj;
        NewTopRightBannerWidget newTopRightBannerWidget = (NewTopRightBannerWidget) afS153S0200000_17.l0;
        List<BannerPanelItem> list = c1092370eX5.LIZ;
        List list2 = (List) afS153S0200000_17.l1;
        String str = c1092370eX5.LIZIZ;
        newTopRightBannerWidget.getClass();
        Iterator<BannerPanelItem> it2 = list.iterator();
        while (true) {
            Object obj2 = null;
            if (!it2.hasNext()) {
                break;
            }
            BannerPanelItem next = it2.next();
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (Intrinsics.LJFF(String.valueOf(((BannerInRoom) next2).id), next.bannerId)) {
                    obj2 = next2;
                    break;
                }
            }
            BannerInRoom bannerInRoom = (BannerInRoom) obj2;
            if (bannerInRoom != null) {
                next.activityId = bannerInRoom.activityId;
                next.bannerType = C1097970eg7.LIZIZ(bannerInRoom);
            }
        }
        if (list.size() == 1) {
            try {
                string = UriProtector.parse(list.get(0).schema).buildUpon().appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis())).appendQueryParameter("fe_enter_from", "native_banner").build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = ((BannerPanelItem) ListProtector.get(list, 0)).schema;
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(newTopRightBannerWidget.context, string);
        } else {
            FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(newTopRightBannerWidget.context, false);
            if (fragmentManagerLJIL != null) {
                C01C5.LIZ(newTopRightBannerWidget.dataChannel);
                String str2 = BannerPanelFragment._pnsPageId;
                boolean z = newTopRightBannerWidget.LLILZLL;
                Room room = newTopRightBannerWidget.LLILZIL;
                DataChannel dataChannel = newTopRightBannerWidget.dataChannel;
                if (dataChannel != null) {
                    zLIZ = C01C5.LIZ(dataChannel);
                } else {
                    zLIZ = false;
                }
                SheetOptions sheetOptions = new SheetOptions();
                sheetOptions.LIZ(1, null);
                sheetOptions.draggable = false;
                if (LiveBannerPageV2OptimizeSetting.INSTANCE.enableExtraHeight()) {
                    sheetOptions.extraHeight = (int) C497740JfY.LIZIZ(41.0f);
                }
                Bundle bundle = new Bundle();
                if (!(list instanceof ArrayList) || (arrayList = (ArrayList) list) == null) {
                    arrayList = new ArrayList(list);
                }
                C786410Ut5.LJJIL(bundle, "banner_list", arrayList);
                try {
                    C786410Ut5.LJJJI("room", C19748512Ol.LIZIZ.LJIILL(room), bundle);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C786410Ut5.LJJJI("focus_banner_id", str, bundle);
                bundle.putBoolean("is_anchor", z);
                bundle.putBoolean("is_admin", zLIZ);
                C19322110iZ.LIZLLL(fragmentManagerLJIL, BannerPanelFragment.class, "tag_banner_panel_fragment", sheetOptions, bundle);
            }
        }
        C1C7U.LIZIZ("NewTopRightBannerWidget@7df5.createBanner$2");
    }

    public static final void accept$7(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C474500IjA c474500IjALIZ;
        C1C7U.LIZ("GallerySetting@50f3.callSettingValueApi$1");
        if (((BaseResponse) obj).statusCode == 0) {
            DataChannelGlobal.LLILZ.JQ2(C1148060fyu.class, Long.valueOf(((C1117630fBp) afS153S0200000_17.l0).LIZ.getValue()));
            ((InterfaceC1118110fCb) afS153S0200000_17.l1).onSuccess();
            EnumC1117590fBl enumC1117590fBl = ((C1117630fBp) afS153S0200000_17.l0).LIZ;
            if (enumC1117590fBl != EnumC1117590fBl.UNKNOWN) {
                if (enumC1117590fBl == EnumC1117590fBl.ON) {
                    c474500IjALIZ = C0IJT.LIZ("livesdk_gift_gallery_opt_in_success");
                } else {
                    c474500IjALIZ = C0IJT.LIZ("livesdk_gift_gallery_opt_out_success");
                }
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII("user", "user_type");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ.LIZ();
            }
            C1118100fCa c1118100fCa = C1118100fCa.LIZ;
            C1117630fBp c1117630fBp = (C1117630fBp) afS153S0200000_17.l0;
            c1118100fCa.getClass();
            GiftManager.inst().getGiftRepository().LJFF(22, c1117630fBp.LIZIZ, c1117630fBp.LIZJ, null, "");
        } else {
            ((InterfaceC1118110fCb) afS153S0200000_17.l1).onError("");
        }
        C1C7U.LIZIZ("GallerySetting@50f3.callSettingValueApi$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$8(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        StartPollResponse startPollResponse;
        DataChannel dataChannel;
        String str;
        C1C7U.LIZ("PollManageDialog@43bd.startPoll$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C766270U4b.LIZLLL(2131843817);
        if (baseResponse != null && (startPollResponse = (StartPollResponse) baseResponse.data) != null && (dataChannel = ((PollManageDialog) afS153S0200000_17.l0).dataChannel) != null) {
            dataChannel.SX0(C1086780eO4.class, Long.valueOf(startPollResponse.pollId));
            LiveMessageSEI liveMessageSEI = startPollResponse.liveMessageSEI;
            if (liveMessageSEI != null) {
                dataChannel.LC0(StartPollMessageSEIEvent.class, liveMessageSEI);
            }
            C500260Jjc.LJIILIIL(((PollManageDialog) afS153S0200000_17.l0).getLoadingViewFromXml());
            C1086800eO6.LIZ.LIZJ(startPollResponse.endTime - C158B.LIZ(), dataChannel, (EnumC1086920eOI) afS153S0200000_17.l1);
            EnumC1086920eOI enumC1086920eOI = (EnumC1086920eOI) afS153S0200000_17.l1;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_poll_start");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C1086790eO5.LIZLLL(c474500IjALIZ);
            c474500IjALIZ.LJJII(Long.valueOf(startPollResponse.pollId), "poll_id");
            if (enumC1086920eOI == EnumC1086920eOI.GIFT) {
                str = "gift_poll";
            } else {
                str = "normal_poll";
            }
            c474500IjALIZ.LJJII(str, "poll_type");
            c474500IjALIZ.LIZ();
            ((PollManageDialog) afS153S0200000_17.l0).dismiss();
        }
        C1C7U.LIZIZ("PollManageDialog@43bd.startPoll$1");
    }

    public static final void accept$9(AfS153S0200000_17 afS153S0200000_17, Object obj) {
        C1C7U.LIZ("NinePatchUtil@39c.preloadNinePatchBitmap$2");
        Bitmap bitmap = (Bitmap) obj;
        C1091240eVG c1091240eVG = C1091220eVE.LIZ;
        C1091220eVE.LIZLLL(bitmap.getByteCount() / 1024, "network", ((ImageModel) afS153S0200000_17.l0).mUri);
        if (((ImageModel) afS153S0200000_17.l0).mUri.length() > 0) {
            C1091240eVG c1091240eVG2 = C1091220eVE.LIZ;
            String str = ((ImageModel) afS153S0200000_17.l0).mUri;
            c1091240eVG2.getClass();
            c1091240eVG2.put(str, new SoftReference(bitmap));
        }
        Runnable runnable = (Runnable) afS153S0200000_17.l1;
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("NinePatchUtil@39c.preloadNinePatchBitmap$2");
    }

    public AfS153S0200000_17(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
