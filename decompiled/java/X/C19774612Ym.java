package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.Point;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.IEmojiSliderStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.IInteractiveEmojiStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.link.ILinkStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.service.ILiveEventStoryStickerService;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.ILiveShare;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.ISecretRepliesStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.ISocialAvatarStickerCoreService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.u;

/* JADX INFO: renamed from: X.12Ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19774612Ym implements InterfaceC386720FEg {
    public final int $t;

    public static final AbstractC388880FMo LIZ$28(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return null;
    }

    public static final AbstractC388880FMo LIZ$29(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return null;
    }

    @Override // X.InterfaceC386720FEg
    public final AbstractC388880FMo LIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        switch (this.$t) {
            case 0:
                return LIZ$0(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 1:
                return LIZ$1(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 2:
                return LIZ$2(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 3:
                return LIZ$3(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 4:
                return LIZ$4(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 5:
                return LIZ$5(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 6:
                return LIZ$6(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 7:
                return LIZ$7(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 8:
                return LIZ$8(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZ$9(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZ$10(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZ$11(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZ$12(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LIZ$13(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 14:
                return LIZ$14(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 15:
                return LIZ$15(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 16:
                return LIZ$16(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LIZ$17(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return LIZ$18(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 19:
                return LIZ$19(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return LIZ$20(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 21:
                return LIZ$21(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 22:
                return LIZ$22(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 23:
                return LIZ$23(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return LIZ$24(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 25:
                return LIZ$25(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 26:
                return LIZ$26(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 27:
                return LIZ$27(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 28:
                return LIZ$28(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            case 29:
                return LIZ$29(this, context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
            default:
                return null;
        }
    }

    public C19774612Ym(int i) {
        this.$t = i;
    }

    public static final AbstractC388880FMo LIZ$0(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19639111sb(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm, c0fth);
    }

    public static final AbstractC388880FMo LIZ$1(C19774612Ym c19774612Ym, final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2, final LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, final C0FUH c0fuh, final C390420FSm c390420FSm) {
        return new AbstractC388880FMo<GlobalHashTagStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11pJ
            public C19618811pK LJII;
            public final InterfaceC388760FMc LJIIIIZZ;

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.PICTURE_HASHTAG_GLOBAL;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                GlobalHashTagStickerModel globalHashTagStickerModel = (GlobalHashTagStickerModel) stickerModel;
                if (!C385630FAb.LIZJ(globalHashTagStickerModel.getBaseStickerModel())) {
                    C385630FAb.LJ(globalHashTagStickerModel.getBaseStickerModel(), this.LJIIIIZZ.LJI());
                }
                return globalHashTagStickerModel.copy(BaseStickerModel.copy$default(globalHashTagStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), globalHashTagStickerModel.hashtagId, globalHashTagStickerModel.contentText, globalHashTagStickerModel.editable, globalHashTagStickerModel.clickable, false);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<GlobalHashTagStickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                GlobalHashTagStickerModel globalHashTagStickerModel = (GlobalHashTagStickerModel) stickerModel;
                return new C19618911pL(this.LIZ, globalHashTagStickerModel.copy(globalHashTagStickerModel.baseStickerModel, globalHashTagStickerModel.hashtagId, globalHashTagStickerModel.contentText, globalHashTagStickerModel.editable, globalHashTagStickerModel.clickable, true), this.LIZIZ, C0FFO.LIZ(c0ffo, false, false, false, false, true, false, null, false, false, 2097087), lifecycleOwner2, this.LJFF);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC388880FMo
            public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
                Parcelable globalHashTagStickerModel;
                int i;
                C1664680tQA<GlobalHashTagStickerModel> c1664680tQA;
                if (c0ftj == null || (globalHashTagStickerModel = c0ftj.LJLI()) == null) {
                    globalHashTagStickerModel = new GlobalHashTagStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, "", false, false, true);
                }
                GlobalHashTagStickerModel globalHashTagStickerModel2 = (GlobalHashTagStickerModel) globalHashTagStickerModel;
                if (C19618011pC.LIZ(str)) {
                    globalHashTagStickerModel2.getBaseStickerModel().setStickerSource("2");
                }
                C19618811pK c19618811pK = this.LJII;
                if (c19618811pK == null) {
                    this.LJII = new C19618811pK(this.LIZ);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    FrameLayout frameLayout3 = this.LIZJ;
                    C19618811pK c19618811pK2 = this.LJII;
                    if (c19618811pK2 == null) {
                        c19618811pK2 = null;
                    }
                    frameLayout3.addView(c19618811pK2, layoutParams);
                    new Point((this.LIZIZ.getLeft() + this.LIZIZ.getRight()) / 2, (this.LIZIZ.getTop() + this.LIZIZ.getBottom()) / 2);
                    C19618811pK c19618811pK3 = this.LJII;
                    if (c19618811pK3 == null) {
                        c19618811pK3 = null;
                    }
                    LifecycleOwner lifecycleOwner2 = this.LIZLLL;
                    c19618811pK3.getClass();
                    i = 0;
                    c1664680tQA = null;
                    c19618811pK3.LLILZ = globalHashTagStickerModel2.copy(BaseStickerModel.copy$default(globalHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), globalHashTagStickerModel2.hashtagId, globalHashTagStickerModel2.contentText, globalHashTagStickerModel2.editable, globalHashTagStickerModel2.clickable, globalHashTagStickerModel2.visible);
                    c19618811pK3.LLILZIL = new C1664680tQA<>(globalHashTagStickerModel2.copy(globalHashTagStickerModel2.baseStickerModel, globalHashTagStickerModel2.hashtagId, globalHashTagStickerModel2.contentText, true, true, true));
                    c19618811pK3.LLILZLL = new C1664680tQA<>(globalHashTagStickerModel2.copy(globalHashTagStickerModel2.baseStickerModel, globalHashTagStickerModel2.hashtagId, globalHashTagStickerModel2.contentText, false, false, false));
                    c19618811pK3.LLJ = lifecycleOwner2;
                    C786410Ut5.Sd(R.layout.cd1, C786410Ut5.ne(c19618811pK3.getContext()), c19618811pK3);
                    c19618811pK3.LLJI = (ViewGroup) c19618811pK3.findViewById(R.id.jhb);
                    c19618811pK3.LLJILJIL = c19618811pK3.findViewById(R.id.y1z);
                    c19618811pK3.LLJIJIL = (FrameLayout) c19618811pK3.findViewById(R.id.w4v);
                    C19584911jr c19584911jr = new C19584911jr(14, c19618811pK3.getContext(), null);
                    C1664680tQA<GlobalHashTagStickerModel> c1664680tQA2 = c19618811pK3.LLILZIL;
                    if (c1664680tQA2 == null) {
                        c1664680tQA2 = null;
                    }
                    LifecycleOwner lifecycleOwner3 = c19618811pK3.LLJ;
                    if (lifecycleOwner3 == null) {
                        lifecycleOwner3 = null;
                    }
                    c19584911jr.LIZIZ(lifecycleOwner3, c1664680tQA2);
                    c19618811pK3.LLIZ = c19584911jr;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 17;
                    FrameLayout frameLayout4 = c19618811pK3.LLJIJIL;
                    if (frameLayout4 == null) {
                        frameLayout4 = null;
                    }
                    C19584911jr c19584911jr2 = c19618811pK3.LLIZ;
                    if (c19584911jr2 == null) {
                        c19584911jr2 = null;
                    }
                    frameLayout4.addView(c19584911jr2, layoutParams2);
                    C19584911jr c19584911jr3 = new C19584911jr(14, c19618811pK3.getContext(), null);
                    C1664680tQA<GlobalHashTagStickerModel> c1664680tQA3 = c19618811pK3.LLILZLL;
                    if (c1664680tQA3 == null) {
                        c1664680tQA3 = null;
                    }
                    LifecycleOwner lifecycleOwner4 = c19618811pK3.LLJ;
                    if (lifecycleOwner4 == null) {
                        lifecycleOwner4 = null;
                    }
                    c19584911jr3.LIZIZ(lifecycleOwner4, c1664680tQA3);
                    c19618811pK3.LLIZLLLIL = c19584911jr3;
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams3.gravity = 17;
                    C19584911jr c19584911jr4 = c19618811pK3.LLIZLLLIL;
                    if (c19584911jr4 == null) {
                        c19584911jr4 = null;
                    }
                    c19618811pK3.addView(c19584911jr4, layoutParams3);
                    ViewGroup viewGroup = c19618811pK3.LLJI;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    C786410Ut5.K7(viewGroup, new ACListenerS163S0100000_29(c19618811pK3, 304));
                } else {
                    i = 0;
                    c1664680tQA = null;
                    c19618811pK.LLILZ = globalHashTagStickerModel2.copy(BaseStickerModel.copy$default(globalHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), globalHashTagStickerModel2.hashtagId, globalHashTagStickerModel2.contentText, globalHashTagStickerModel2.editable, globalHashTagStickerModel2.clickable, globalHashTagStickerModel2.visible);
                    C1664680tQA<GlobalHashTagStickerModel> c1664680tQA4 = c19618811pK.LLILZIL;
                    if (c1664680tQA4 == null) {
                        c1664680tQA4 = null;
                    }
                    c1664680tQA4.LIZLLL(new AwS608S0100000_29(globalHashTagStickerModel2, 813), true);
                    C1664680tQA<GlobalHashTagStickerModel> c1664680tQA5 = c19618811pK.LLILZLL;
                    if (c1664680tQA5 == null) {
                        c1664680tQA5 = null;
                    }
                    c1664680tQA5.LIZLLL(new AwS608S0100000_29(globalHashTagStickerModel2, 814), true);
                }
                C19618811pK c19618811pK4 = this.LJII;
                C19618811pK c19618811pK5 = c19618811pK4;
                if (c19618811pK4 == null) {
                    c19618811pK5 = c1664680tQA;
                }
                c19618811pK5.setStickerEditListener(new C0FSM(EnumC1466150oFx.PICTURE_HASHTAG_GLOBAL, function1, c390370FSh, c0ftj));
                C19618811pK c19618811pK6 = this.LJII;
                C19618811pK c19618811pK7 = c19618811pK6;
                if (c19618811pK6 == null) {
                    c19618811pK7 = c1664680tQA;
                }
                c19618811pK7.getClass();
                int visibility = c19618811pK7.getVisibility();
                c19618811pK7.setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, c19618811pK7);
                GlobalHashTagStickerModel globalHashTagStickerModel3 = c19618811pK7.LLILZ;
                GlobalHashTagStickerModel globalHashTagStickerModel4 = globalHashTagStickerModel3;
                if (globalHashTagStickerModel3 == null) {
                    globalHashTagStickerModel4 = c1664680tQA;
                }
                if (globalHashTagStickerModel4.getContentText().length() == 0) {
                    C1664680tQA<GlobalHashTagStickerModel> c1664680tQA6 = c19618811pK7.LLILZIL;
                    if (c1664680tQA6 == null) {
                        c1664680tQA6 = c1664680tQA;
                    }
                    c1664680tQA6.LIZLLL(AFwS273S0000000_29.get$arr$(434), true);
                    C1664680tQA<GlobalHashTagStickerModel> c1664680tQA7 = c19618811pK7.LLILZLL;
                    if (c1664680tQA7 != null) {
                        c1664680tQA = c1664680tQA7;
                    }
                    c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(435), true);
                }
                HandlerHook.viewPostDelay(c19618811pK7, new ARunnableS129S0100000_29(c19618811pK7, 214), 300L);
            }

            {
                this.LJIIIIZZ = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
            }
        };
    }

    public static final AbstractC388880FMo LIZ$10(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ISecretRepliesStickerComponentProvider iSecretRepliesStickerComponentProvider = (ISecretRepliesStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ISecretRepliesStickerComponentProvider.class, false, false, false, 14, null);
        if (iSecretRepliesStickerComponentProvider != null) {
            return iSecretRepliesStickerComponentProvider.LIZJ(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$11(C19774612Ym c19774612Ym, final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2, final LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, final C0FUH c0fuh, final C390420FSm c390420FSm) {
        return new AbstractC388880FMo<SharedCommentStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11nt
            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.SHARED_COMMENT;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                SharedCommentStickerModel sharedCommentStickerModel = (SharedCommentStickerModel) stickerModel;
                return sharedCommentStickerModel.copy(BaseStickerModel.copy$default(sharedCommentStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), sharedCommentStickerModel.commentModel);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                SharedCommentStickerModel sharedCommentStickerModel = (SharedCommentStickerModel) stickerModel;
                C19610211nw c19610211nw = new C19610211nw(this.LIZ, this.LIZIZ, sharedCommentStickerModel.copy(sharedCommentStickerModel.baseStickerModel, sharedCommentStickerModel.commentModel), c0ffo, lifecycleOwner2, this.LJFF);
                c19610211nw.LJJJJZ();
                return c19610211nw;
            }
        };
    }

    public static final AbstractC388880FMo LIZ$12(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ISecretRepliesStickerComponentProvider iSecretRepliesStickerComponentProvider = (ISecretRepliesStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ISecretRepliesStickerComponentProvider.class, false, false, false, 14, null);
        if (iSecretRepliesStickerComponentProvider != null) {
            return iSecretRepliesStickerComponentProvider.LIZJ(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$13(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ISecretRepliesStickerComponentProvider iSecretRepliesStickerComponentProvider = (ISecretRepliesStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ISecretRepliesStickerComponentProvider.class, false, false, false, 14, null);
        if (iSecretRepliesStickerComponentProvider != null) {
            return iSecretRepliesStickerComponentProvider.LIZIZ(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$14(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ISocialAvatarStickerCoreService iSocialAvatarStickerCoreService = (ISocialAvatarStickerCoreService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStickerCoreService.class, false, false, false, 14, null);
        if (iSocialAvatarStickerCoreService != null) {
            return iSocialAvatarStickerCoreService.LIZIZ(context, frameLayout, frameLayout2, lifecycleOwner, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$15(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ILiveEventStoryStickerService iLiveEventStoryStickerService = (ILiveEventStoryStickerService) PluggableExtentionKt.pluggableSpi$default(ILiveEventStoryStickerService.class, false, false, false, 14, null);
        if (iLiveEventStoryStickerService != null) {
            return iLiveEventStoryStickerService.LIZIZ(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$16(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19634211ro(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fuh, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$17(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ILiveEventStickerService iLiveEventStickerService = (ILiveEventStickerService) PluggableExtentionKt.pluggableSpi$default(ILiveEventStickerService.class, false, false, true, 2, null);
        if (iLiveEventStickerService != null) {
            return iLiveEventStickerService.LIZJ(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$18(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19628011qo(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fuh, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$19(C19774612Ym c19774612Ym, final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2, final LifecycleOwner lifecycleOwner, final InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, final C0FUH c0fuh, final C390420FSm c390420FSm) {
        return new AbstractC388880FMo<HashTagStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fuh, c390420FSm) { // from class: X.11oW
            public final InterfaceC388760FMc LJII;
            public C19613911oX LJIIIIZZ;

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.HASH_TAG;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                HashTagStickerModel hashTagStickerModel = (HashTagStickerModel) stickerModel;
                return hashTagStickerModel.copy(BaseStickerModel.copy$default(hashTagStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), hashTagStickerModel.hashtagName, hashTagStickerModel.editable, hashTagStickerModel.visible, hashTagStickerModel.useCapsuleStyle);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                return new C19614011oY(this.LIZ, (HashTagStickerModel) stickerModel, this.LIZIZ, this.LJII, c0ffo, lifecycleOwner2, this.LJFF);
            }

            @Override // X.AbstractC388880FMo
            public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
                HashTagStickerModel hashTagStickerModel;
                if (c0ftj instanceof C19614011oY) {
                    hashTagStickerModel = ((C19614011oY) c0ftj).LJJJLL().LIZ;
                } else {
                    boolean zLIZIZ = false;
                    BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.HASH_TAG, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null);
                    InterfaceC19614111oZ hashTagService = this.LJII.getHashTagService();
                    if (hashTagService != null) {
                        zLIZIZ = hashTagService.LIZIZ();
                    }
                    hashTagStickerModel = new HashTagStickerModel(baseStickerModel, null, false, true, zLIZIZ);
                }
                if (C19618011pC.LIZ(str)) {
                    hashTagStickerModel.getBaseStickerModel().setStickerSource("2");
                }
                C19613911oX c19613911oX = this.LJIIIIZZ;
                C19613911oX c19613911oX2 = null;
                if (c19613911oX == null) {
                    this.LJIIIIZZ = new C19613911oX(this.LIZ, this.LJFF);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    FrameLayout frameLayout3 = this.LIZJ;
                    C19613911oX c19613911oX3 = this.LJIIIIZZ;
                    if (c19613911oX3 == null) {
                        c19613911oX3 = null;
                    }
                    frameLayout3.addView(c19613911oX3, layoutParams);
                    C19613911oX c19613911oX4 = this.LJIIIIZZ;
                    if (c19613911oX4 == null) {
                        c19613911oX4 = null;
                    }
                    c19613911oX4.LJIIJJI(hashTagStickerModel, new AwS573S0100000_29(this, 989), this.LJII.LJJ(), this.LIZLLL);
                } else {
                    C1664680tQA<HashTagStickerModel> c1664680tQA = c19613911oX.LLJIJIL;
                    if (c1664680tQA == null) {
                        c1664680tQA = null;
                    }
                    c1664680tQA.LIZLLL(new AwS608S0100000_29(hashTagStickerModel, 717), true);
                    C1664680tQA<HashTagStickerModel> c1664680tQA2 = c19613911oX.LLJILJIL;
                    if (c1664680tQA2 == null) {
                        c1664680tQA2 = null;
                    }
                    c1664680tQA2.LIZLLL(new AwS608S0100000_29(hashTagStickerModel, 718), true);
                    c19613911oX.LLJI = hashTagStickerModel;
                }
                C19613911oX c19613911oX5 = this.LJIIIIZZ;
                if (c19613911oX5 == null) {
                    c19613911oX5 = null;
                }
                c19613911oX5.setStickerEditListener(new C0FSM(EnumC1466150oFx.HASH_TAG, function1, c390370FSh, c0ftj));
                C19613911oX c19613911oX6 = this.LJIIIIZZ;
                if (c19613911oX6 != null) {
                    c19613911oX2 = c19613911oX6;
                }
                c19613911oX2.getClass();
                int visibility = c19613911oX2.getVisibility();
                c19613911oX2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c19613911oX2);
                HandlerHook.viewPostDelay(c19613911oX2, new ARunnableS129S0100000_29(c19613911oX2, 196), 300L);
            }

            {
                this.LJII = interfaceC388760FMc;
            }
        };
    }

    public static final AbstractC388880FMo LIZ$2(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19620911pf(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$20(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19638711sX(context, frameLayout, frameLayout2, lifecycleOwner, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$21(C19774612Ym c19774612Ym, final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2, final LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, final C0FUH c0fuh, final C390420FSm c390420FSm) {
        return new AbstractC388880FMo<AttributionLinkStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11lI
            @Override // X.AbstractC388880FMo
            public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
            }

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.ATTRIBUTION_LINK;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                AttributionLinkStickerModel attributionLinkStickerModel = (AttributionLinkStickerModel) stickerModel;
                return attributionLinkStickerModel.copy(BaseStickerModel.copy$default(attributionLinkStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), false, attributionLinkStickerModel.editable, attributionLinkStickerModel.clickable, attributionLinkStickerModel.scenario, attributionLinkStickerModel.title, attributionLinkStickerModel.url, attributionLinkStickerModel.shareFormat, attributionLinkStickerModel.mediaSize);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                AttributionLinkStickerModel attributionLinkStickerModel = (AttributionLinkStickerModel) stickerModel;
                return new C19593711lH(this.LIZ, attributionLinkStickerModel.copy(BaseStickerModel.copy$default(attributionLinkStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073741825, 15, null), true, attributionLinkStickerModel.editable, attributionLinkStickerModel.clickable, attributionLinkStickerModel.scenario, attributionLinkStickerModel.title, attributionLinkStickerModel.url, attributionLinkStickerModel.shareFormat, attributionLinkStickerModel.mediaSize), this.LIZIZ, c0ffo, lifecycleOwner2, this.LJFF);
            }
        };
    }

    public static final AbstractC388880FMo LIZ$22(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ILiveShare iLiveShare = (ILiveShare) PluggableExtentionKt.pluggableSpi$default(ILiveShare.class, false, false, true, 2, null);
        if (iLiveShare != null) {
            return iLiveShare.LIZ(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$23(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        IEmojiSliderStickerComponentProvider iEmojiSliderStickerComponentProvider = (IEmojiSliderStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(IEmojiSliderStickerComponentProvider.class, false, false, false, 14, null);
        if (iEmojiSliderStickerComponentProvider != null) {
            return iEmojiSliderStickerComponentProvider.LIZ(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$24(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        IInteractiveEmojiStickerComponentProvider iInteractiveEmojiStickerComponentProvider = (IInteractiveEmojiStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(IInteractiveEmojiStickerComponentProvider.class, false, false, false, 14, null);
        if (iInteractiveEmojiStickerComponentProvider != null) {
            return iInteractiveEmojiStickerComponentProvider.LIZ(context, frameLayout, frameLayout2, lifecycleOwner, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$25(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ILinkStickerComponentProvider iLinkStickerComponentProvider = (ILinkStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ILinkStickerComponentProvider.class, false, false, false, 14, null);
        if (iLinkStickerComponentProvider != null) {
            return iLinkStickerComponentProvider.LIZ(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$26(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19620911pf(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$27(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19611511o9(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$3(C19774612Ym c19774612Ym, final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2, final LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, final C0FUH c0fuh, final C390420FSm c390420FSm) {
        return new AbstractC388880FMo<EmbedHashTagStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11pG
            public C19618511pH LJII;
            public final InterfaceC388760FMc LJIIIIZZ;

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.PICTURE_HASHTAG_EMBED;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                String strLIZIZ;
                EmbedHashTagStickerModel embedHashTagStickerModel = (EmbedHashTagStickerModel) stickerModel;
                if (!C385630FAb.LIZJ(embedHashTagStickerModel.getBaseStickerModel())) {
                    C385630FAb.LJ(embedHashTagStickerModel.getBaseStickerModel(), this.LJIIIIZZ.LJI());
                }
                BaseStickerModel baseStickerModel = embedHashTagStickerModel.getBaseStickerModel();
                String str = this.LJ.LIZ;
                String str2 = File.separator;
                if (u.LJIIZILJ(str, str2, false)) {
                    strLIZIZ = this.LJ.LIZ;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LJ.LIZ);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(System.currentTimeMillis());
                sbLIZ2.append(".png");
                return embedHashTagStickerModel.copy(BaseStickerModel.copy$default(baseStickerModel, i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, true, C2188811AlT.LIZIZ(sbLIZ2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -98306, 15, null), embedHashTagStickerModel.hashtagId, embedHashTagStickerModel.contentText, embedHashTagStickerModel.editable, embedHashTagStickerModel.clickable, false);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<EmbedHashTagStickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                EmbedHashTagStickerModel embedHashTagStickerModel = (EmbedHashTagStickerModel) stickerModel;
                return new C19618611pI(this.LIZ, embedHashTagStickerModel.copy(embedHashTagStickerModel.baseStickerModel, embedHashTagStickerModel.hashtagId, embedHashTagStickerModel.contentText, embedHashTagStickerModel.editable, embedHashTagStickerModel.clickable, true), this.LIZIZ, C0FFO.LIZ(c0ffo, false, false, false, false, true, false, null, false, false, 2097087), lifecycleOwner2, this.LJFF);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC388880FMo
            public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
                Parcelable embedHashTagStickerModel;
                int i;
                C1664680tQA<EmbedHashTagStickerModel> c1664680tQA;
                if (c0ftj == null || (embedHashTagStickerModel = c0ftj.LJLI()) == null) {
                    embedHashTagStickerModel = new EmbedHashTagStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, "", false, false, true);
                }
                EmbedHashTagStickerModel embedHashTagStickerModel2 = (EmbedHashTagStickerModel) embedHashTagStickerModel;
                if (C19618011pC.LIZ(str)) {
                    embedHashTagStickerModel2.getBaseStickerModel().setStickerSource("2");
                }
                C19618511pH c19618511pH = this.LJII;
                if (c19618511pH == null) {
                    this.LJII = new C19618511pH(this.LIZ);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    FrameLayout frameLayout3 = this.LIZJ;
                    C19618511pH c19618511pH2 = this.LJII;
                    if (c19618511pH2 == null) {
                        c19618511pH2 = null;
                    }
                    frameLayout3.addView(c19618511pH2, layoutParams);
                    new Point((this.LIZIZ.getLeft() + this.LIZIZ.getRight()) / 2, (this.LIZIZ.getTop() + this.LIZIZ.getBottom()) / 2);
                    C19618511pH c19618511pH3 = this.LJII;
                    if (c19618511pH3 == null) {
                        c19618511pH3 = null;
                    }
                    LifecycleOwner lifecycleOwner2 = this.LIZLLL;
                    c19618511pH3.getClass();
                    i = 0;
                    c1664680tQA = null;
                    c19618511pH3.LLILZ = embedHashTagStickerModel2.copy(BaseStickerModel.copy$default(embedHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), embedHashTagStickerModel2.hashtagId, embedHashTagStickerModel2.contentText, embedHashTagStickerModel2.editable, embedHashTagStickerModel2.clickable, embedHashTagStickerModel2.visible);
                    c19618511pH3.LLILZIL = new C1664680tQA<>(embedHashTagStickerModel2.copy(embedHashTagStickerModel2.baseStickerModel, embedHashTagStickerModel2.hashtagId, embedHashTagStickerModel2.contentText, true, true, true));
                    c19618511pH3.LLILZLL = new C1664680tQA<>(embedHashTagStickerModel2.copy(embedHashTagStickerModel2.baseStickerModel, embedHashTagStickerModel2.hashtagId, embedHashTagStickerModel2.contentText, false, false, false));
                    c19618511pH3.LLJ = lifecycleOwner2;
                    C786410Ut5.Sd(R.layout.cd1, C786410Ut5.ne(c19618511pH3.getContext()), c19618511pH3);
                    c19618511pH3.LLJI = (ViewGroup) c19618511pH3.findViewById(R.id.jhb);
                    c19618511pH3.LLJILJIL = c19618511pH3.findViewById(R.id.y1z);
                    c19618511pH3.LLJIJIL = (FrameLayout) c19618511pH3.findViewById(R.id.w4v);
                    C19584311jl c19584311jl = new C19584311jl(14, c19618511pH3.getContext(), null);
                    C1664680tQA<EmbedHashTagStickerModel> c1664680tQA2 = c19618511pH3.LLILZIL;
                    if (c1664680tQA2 == null) {
                        c1664680tQA2 = null;
                    }
                    LifecycleOwner lifecycleOwner3 = c19618511pH3.LLJ;
                    if (lifecycleOwner3 == null) {
                        lifecycleOwner3 = null;
                    }
                    c19584311jl.LIZIZ(lifecycleOwner3, c1664680tQA2);
                    c19618511pH3.LLIZ = c19584311jl;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 17;
                    FrameLayout frameLayout4 = c19618511pH3.LLJIJIL;
                    if (frameLayout4 == null) {
                        frameLayout4 = null;
                    }
                    C19584311jl c19584311jl2 = c19618511pH3.LLIZ;
                    if (c19584311jl2 == null) {
                        c19584311jl2 = null;
                    }
                    frameLayout4.addView(c19584311jl2, layoutParams2);
                    C19584311jl c19584311jl3 = new C19584311jl(14, c19618511pH3.getContext(), null);
                    C1664680tQA<EmbedHashTagStickerModel> c1664680tQA3 = c19618511pH3.LLILZLL;
                    if (c1664680tQA3 == null) {
                        c1664680tQA3 = null;
                    }
                    LifecycleOwner lifecycleOwner4 = c19618511pH3.LLJ;
                    if (lifecycleOwner4 == null) {
                        lifecycleOwner4 = null;
                    }
                    c19584311jl3.LIZIZ(lifecycleOwner4, c1664680tQA3);
                    c19618511pH3.LLIZLLLIL = c19584311jl3;
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams3.gravity = 17;
                    C19584311jl c19584311jl4 = c19618511pH3.LLIZLLLIL;
                    if (c19584311jl4 == null) {
                        c19584311jl4 = null;
                    }
                    c19618511pH3.addView(c19584311jl4, layoutParams3);
                    ViewGroup viewGroup = c19618511pH3.LLJI;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    C786410Ut5.K7(viewGroup, new ACListenerS163S0100000_29(c19618511pH3, 297));
                } else {
                    i = 0;
                    c1664680tQA = null;
                    c19618511pH.LLILZ = embedHashTagStickerModel2.copy(BaseStickerModel.copy$default(embedHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), embedHashTagStickerModel2.hashtagId, embedHashTagStickerModel2.contentText, embedHashTagStickerModel2.editable, embedHashTagStickerModel2.clickable, embedHashTagStickerModel2.visible);
                    C1664680tQA<EmbedHashTagStickerModel> c1664680tQA4 = c19618511pH.LLILZIL;
                    if (c1664680tQA4 == null) {
                        c1664680tQA4 = null;
                    }
                    c1664680tQA4.LIZLLL(new AwS608S0100000_29(embedHashTagStickerModel2, 793), true);
                    C1664680tQA<EmbedHashTagStickerModel> c1664680tQA5 = c19618511pH.LLILZLL;
                    if (c1664680tQA5 == null) {
                        c1664680tQA5 = null;
                    }
                    c1664680tQA5.LIZLLL(new AwS608S0100000_29(embedHashTagStickerModel2, 794), true);
                }
                C19618511pH c19618511pH4 = this.LJII;
                C19618511pH c19618511pH5 = c19618511pH4;
                if (c19618511pH4 == null) {
                    c19618511pH5 = c1664680tQA;
                }
                c19618511pH5.setStickerEditListener(new C0FSM(EnumC1466150oFx.PICTURE_HASHTAG_EMBED, function1, c390370FSh, c0ftj));
                C19618511pH c19618511pH6 = this.LJII;
                C19618511pH c19618511pH7 = c19618511pH6;
                if (c19618511pH6 == null) {
                    c19618511pH7 = c1664680tQA;
                }
                c19618511pH7.getClass();
                int visibility = c19618511pH7.getVisibility();
                c19618511pH7.setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, c19618511pH7);
                EmbedHashTagStickerModel embedHashTagStickerModel3 = c19618511pH7.LLILZ;
                EmbedHashTagStickerModel embedHashTagStickerModel4 = embedHashTagStickerModel3;
                if (embedHashTagStickerModel3 == null) {
                    embedHashTagStickerModel4 = c1664680tQA;
                }
                if (embedHashTagStickerModel4.getContentText().length() == 0) {
                    C1664680tQA<EmbedHashTagStickerModel> c1664680tQA6 = c19618511pH7.LLILZIL;
                    if (c1664680tQA6 == null) {
                        c1664680tQA6 = c1664680tQA;
                    }
                    c1664680tQA6.LIZLLL(AFwS273S0000000_29.get$arr$(418), true);
                    C1664680tQA<EmbedHashTagStickerModel> c1664680tQA7 = c19618511pH7.LLILZLL;
                    if (c1664680tQA7 != null) {
                        c1664680tQA = c1664680tQA7;
                    }
                    c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(419), true);
                }
                HandlerHook.viewPostDelay(c19618511pH7, new ARunnableS129S0100000_29(c19618511pH7, 211), 300L);
            }

            {
                this.LJIIIIZZ = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
            }
        };
    }

    public static final AbstractC388880FMo LIZ$4(C19774612Ym c19774612Ym, final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2, final LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, final C0FUH c0fuh, final C390420FSm c390420FSm) {
        return new AbstractC388880FMo<SingleHashTagStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11pN
            public C19619211pO LJII;
            public final InterfaceC388760FMc LJIIIIZZ;

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.PICTURE_HASHTAG_SINGLE;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                SingleHashTagStickerModel singleHashTagStickerModel = (SingleHashTagStickerModel) stickerModel;
                if (!C385630FAb.LIZJ(singleHashTagStickerModel.getBaseStickerModel())) {
                    C385630FAb.LJ(singleHashTagStickerModel.getBaseStickerModel(), this.LJIIIIZZ.LJI());
                }
                return SingleHashTagStickerModel.copy$default(singleHashTagStickerModel, BaseStickerModel.copy$default(singleHashTagStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), 0L, null, false, false, false, 30, null);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<SingleHashTagStickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                return new C19619311pP(this.LIZ, SingleHashTagStickerModel.copy$default((SingleHashTagStickerModel) stickerModel, null, 0L, null, false, false, true, 31, null), this.LIZIZ, C0FFO.LIZ(c0ffo, false, false, false, false, true, false, null, false, false, 2097087), lifecycleOwner2, this.LJFF);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC388880FMo
            public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
                Parcelable singleHashTagStickerModel;
                int i;
                C1664680tQA<SingleHashTagStickerModel> c1664680tQA;
                if (c0ftj == null || (singleHashTagStickerModel = c0ftj.LJLI()) == null) {
                    singleHashTagStickerModel = new SingleHashTagStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, "", false, false, true);
                }
                SingleHashTagStickerModel singleHashTagStickerModel2 = (SingleHashTagStickerModel) singleHashTagStickerModel;
                if (C19618011pC.LIZ(str)) {
                    singleHashTagStickerModel2.getBaseStickerModel().setStickerSource("2");
                }
                C19619211pO c19619211pO = this.LJII;
                if (c19619211pO == null) {
                    this.LJII = new C19619211pO(this.LIZ);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    FrameLayout frameLayout3 = this.LIZJ;
                    C19619211pO c19619211pO2 = this.LJII;
                    if (c19619211pO2 == null) {
                        c19619211pO2 = null;
                    }
                    frameLayout3.addView(c19619211pO2, layoutParams);
                    new Point((this.LIZIZ.getLeft() + this.LIZIZ.getRight()) / 2, (this.LIZIZ.getTop() + this.LIZIZ.getBottom()) / 2);
                    C19619211pO c19619211pO3 = this.LJII;
                    if (c19619211pO3 == null) {
                        c19619211pO3 = null;
                    }
                    LifecycleOwner lifecycleOwner2 = this.LIZLLL;
                    c19619211pO3.getClass();
                    i = 0;
                    c1664680tQA = null;
                    c19619211pO3.LLILZ = SingleHashTagStickerModel.copy$default(singleHashTagStickerModel2, BaseStickerModel.copy$default(singleHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, null, false, false, false, 62, null);
                    c19619211pO3.LLILZIL = new C1664680tQA<>(SingleHashTagStickerModel.copy$default(singleHashTagStickerModel2, null, 0L, null, true, true, true, 7, null));
                    c19619211pO3.LLILZLL = new C1664680tQA<>(SingleHashTagStickerModel.copy$default(singleHashTagStickerModel2, null, 0L, null, false, false, false, 7, null));
                    c19619211pO3.LLJ = lifecycleOwner2;
                    C786410Ut5.Sd(R.layout.cd1, C786410Ut5.ne(c19619211pO3.getContext()), c19619211pO3);
                    c19619211pO3.LLJI = (ViewGroup) c19619211pO3.findViewById(R.id.jhb);
                    c19619211pO3.LLJILJIL = c19619211pO3.findViewById(R.id.y1z);
                    c19619211pO3.LLJIJIL = (FrameLayout) c19619211pO3.findViewById(R.id.w4v);
                    C19591011kq c19591011kq = new C19591011kq(14, c19619211pO3.getContext(), null);
                    C1664680tQA<SingleHashTagStickerModel> c1664680tQA2 = c19619211pO3.LLILZIL;
                    if (c1664680tQA2 == null) {
                        c1664680tQA2 = null;
                    }
                    LifecycleOwner lifecycleOwner3 = c19619211pO3.LLJ;
                    if (lifecycleOwner3 == null) {
                        lifecycleOwner3 = null;
                    }
                    c19591011kq.LIZIZ(lifecycleOwner3, c1664680tQA2);
                    c19619211pO3.LLIZ = c19591011kq;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 17;
                    FrameLayout frameLayout4 = c19619211pO3.LLJIJIL;
                    if (frameLayout4 == null) {
                        frameLayout4 = null;
                    }
                    C19591011kq c19591011kq2 = c19619211pO3.LLIZ;
                    if (c19591011kq2 == null) {
                        c19591011kq2 = null;
                    }
                    frameLayout4.addView(c19591011kq2, layoutParams2);
                    C19591011kq c19591011kq3 = new C19591011kq(14, c19619211pO3.getContext(), null);
                    C1664680tQA<SingleHashTagStickerModel> c1664680tQA3 = c19619211pO3.LLILZLL;
                    if (c1664680tQA3 == null) {
                        c1664680tQA3 = null;
                    }
                    LifecycleOwner lifecycleOwner4 = c19619211pO3.LLJ;
                    if (lifecycleOwner4 == null) {
                        lifecycleOwner4 = null;
                    }
                    c19591011kq3.LIZIZ(lifecycleOwner4, c1664680tQA3);
                    c19619211pO3.LLIZLLLIL = c19591011kq3;
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams3.gravity = 17;
                    C19591011kq c19591011kq4 = c19619211pO3.LLIZLLLIL;
                    if (c19591011kq4 == null) {
                        c19591011kq4 = null;
                    }
                    c19619211pO3.addView(c19591011kq4, layoutParams3);
                    ViewGroup viewGroup = c19619211pO3.LLJI;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    C786410Ut5.K7(viewGroup, new ACListenerS163S0100000_29(c19619211pO3, 310));
                } else {
                    i = 0;
                    c1664680tQA = null;
                    c19619211pO.LLILZ = SingleHashTagStickerModel.copy$default(singleHashTagStickerModel2, BaseStickerModel.copy$default(singleHashTagStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), 0L, null, false, false, false, 62, null);
                    C1664680tQA<SingleHashTagStickerModel> c1664680tQA4 = c19619211pO.LLILZIL;
                    if (c1664680tQA4 == null) {
                        c1664680tQA4 = null;
                    }
                    c1664680tQA4.LIZLLL(new AwS608S0100000_29(singleHashTagStickerModel2, 832), true);
                    C1664680tQA<SingleHashTagStickerModel> c1664680tQA5 = c19619211pO.LLILZLL;
                    if (c1664680tQA5 == null) {
                        c1664680tQA5 = null;
                    }
                    c1664680tQA5.LIZLLL(new AwS608S0100000_29(singleHashTagStickerModel2, 833), true);
                }
                C19619211pO c19619211pO4 = this.LJII;
                C19619211pO c19619211pO5 = c19619211pO4;
                if (c19619211pO4 == null) {
                    c19619211pO5 = c1664680tQA;
                }
                c19619211pO5.setStickerEditListener(new C0FSM(EnumC1466150oFx.PICTURE_HASHTAG_SINGLE, function1, c390370FSh, c0ftj));
                C19619211pO c19619211pO6 = this.LJII;
                C19619211pO c19619211pO7 = c19619211pO6;
                if (c19619211pO6 == null) {
                    c19619211pO7 = c1664680tQA;
                }
                c19619211pO7.getClass();
                int visibility = c19619211pO7.getVisibility();
                c19619211pO7.setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, c19619211pO7);
                SingleHashTagStickerModel singleHashTagStickerModel3 = c19619211pO7.LLILZ;
                SingleHashTagStickerModel singleHashTagStickerModel4 = singleHashTagStickerModel3;
                if (singleHashTagStickerModel3 == null) {
                    singleHashTagStickerModel4 = c1664680tQA;
                }
                if (singleHashTagStickerModel4.getContentText().length() == 0) {
                    C1664680tQA<SingleHashTagStickerModel> c1664680tQA6 = c19619211pO7.LLILZIL;
                    if (c1664680tQA6 == null) {
                        c1664680tQA6 = c1664680tQA;
                    }
                    c1664680tQA6.LIZLLL(AFwS273S0000000_29.get$arr$(451), true);
                    C1664680tQA<SingleHashTagStickerModel> c1664680tQA7 = c19619211pO7.LLILZLL;
                    if (c1664680tQA7 != null) {
                        c1664680tQA = c1664680tQA7;
                    }
                    c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(452), true);
                }
                HandlerHook.viewPostDelay(c19619211pO7, new ARunnableS129S0100000_29(c19619211pO7, 217), 300L);
            }

            {
                this.LJIIIIZZ = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
            }
        };
    }

    public static final AbstractC388880FMo LIZ$5(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19628011qo(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fuh, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$6(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ILiveEventStickerService iLiveEventStickerService = (ILiveEventStickerService) PluggableExtentionKt.pluggableSpi$default(ILiveEventStickerService.class, false, false, true, 2, null);
        if (iLiveEventStickerService != null) {
            return iLiveEventStickerService.LIZJ(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fth, c0fuh, c390420FSm);
        }
        return null;
    }

    public static final AbstractC388880FMo LIZ$7(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19611511o9(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$8(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19620911pf(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }

    public static final AbstractC388880FMo LIZ$9(C19774612Ym c19774612Ym, Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        ISecretRepliesStickerComponentProvider iSecretRepliesStickerComponentProvider = (ISecretRepliesStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ISecretRepliesStickerComponentProvider.class, false, false, false, 14, null);
        if (iSecretRepliesStickerComponentProvider != null) {
            return iSecretRepliesStickerComponentProvider.LIZIZ(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        }
        return null;
    }
}
