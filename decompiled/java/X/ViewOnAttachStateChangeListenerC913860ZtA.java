package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.messagelist.protocols.DynamicCardReusedUISlot;
import com.ss.android.ugc.aweme.im.messagelist.protocols.ShareLiveCardAssem;
import com.ss.android.ugc.aweme.im.perf.cls.MessageListCLSTrackerImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraVideoCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.PhotoSwapAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveReactionVideoAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.MediaThumbnailViewAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0ZtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class ViewOnAttachStateChangeListenerC913860ZtA implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
            case 7:
                onViewAttachedToWindow$7(this, view);
                break;
            case 8:
                onViewAttachedToWindow$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onViewAttachedToWindow$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onViewAttachedToWindow$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onViewAttachedToWindow$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onViewAttachedToWindow$12(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                break;
            case 8:
                onViewDetachedFromWindow$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onViewDetachedFromWindow$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onViewDetachedFromWindow$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onViewDetachedFromWindow$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onViewDetachedFromWindow$12(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC913860ZtA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ViewTreeObserverOnScrollChangedListenerC888050Ysd viewTreeObserverOnScrollChangedListenerC888050Ysd;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (viewTreeObserverOnScrollChangedListenerC888050Ysd = ((C888110Ysj) viewOnAttachStateChangeListenerC913860ZtA.l0).LLILZIL) != null) {
            viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC888050Ysd);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC888050Ysd, ViewTreeObserver.OnScrollChangedListener.class);
        }
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        C0ZVX c0zvxSp = ((DynamicCardReusedUISlot) viewOnAttachStateChangeListenerC913860ZtA.l0).sp();
        if (c0zvxSp != null) {
            c0zvxSp.onAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$10(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        PhotoSwapAnimationAbility photoSwapAnimationAbility;
        AnonymousClass0956 anonymousClass0956 = ((PhotoSwapAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLFFI;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        PhotoSwapAssem photoSwapAssem = (PhotoSwapAssem) viewOnAttachStateChangeListenerC913860ZtA.l0;
        C910970ZoV c910970ZoV = photoSwapAssem.LLLFZ;
        if (c910970ZoV == null) {
            synchronized (photoSwapAssem) {
                c910970ZoV = photoSwapAssem.LLLFZ;
                if (c910970ZoV == null) {
                    c910970ZoV = new C910970ZoV(photoSwapAssem.Ap(), photoSwapAssem, photoSwapAssem);
                    photoSwapAssem.LLLFZ = c910970ZoV;
                }
            }
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((PhotoSwapAssem) viewOnAttachStateChangeListenerC913860ZtA.l0);
        C869590Y9l msg = c910970ZoV.LIZIZ.getMsg();
        if (C896400ZEo.LJIIIZ(msg) && !C0ZDX.LJJJJIZL(msg) && c910970ZoV.LJ.getValue() != null && (photoSwapAnimationAbility = (PhotoSwapAnimationAbility) c910970ZoV.LJ.getValue()) != null) {
            if (photoSwapAnimationAbility.ct0(msg.getIndex(), msg.getUuid())) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C0IC0(c910970ZoV, msg, null), 3);
            }
        }
        photoSwapAssem.LLLFFI = anonymousClass0956LIZLLL;
    }

    public static final void onViewAttachedToWindow$11(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        int value;
        ((QuickLiveReactionVideoAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLFF.LIZIZ("quick_live_react");
        QuickLiveReactionVideoAssem quickLiveReactionVideoAssem = (QuickLiveReactionVideoAssem) viewOnAttachStateChangeListenerC913860ZtA.l0;
        C911250Zox c911250Zox = quickLiveReactionVideoAssem.LLLIIIIL;
        if (((View) quickLiveReactionVideoAssem.LLJLLIL.getValue()).getVisibility() == 0) {
            value = EnumC911240Zow.RETRY.getValue();
        } else if (((View) quickLiveReactionVideoAssem.LLJLILLLLZIIL.getValue()).getVisibility() == 0) {
            value = EnumC911240Zow.LOADING.getValue();
        } else if (quickLiveReactionVideoAssem.tp().LJIL()) {
            value = EnumC911240Zow.PLAYING.getValue();
        } else {
            value = EnumC911240Zow.UNKNOWN.getValue();
        }
        c911250Zox.LIZ = value;
    }

    public static final void onViewAttachedToWindow$12(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        MediaThumbnailViewAssem mediaThumbnailViewAssem = (MediaThumbnailViewAssem) viewOnAttachStateChangeListenerC913860ZtA.l0;
        mediaThumbnailViewAssem.LLJLIL.LIZIZ(mediaThumbnailViewAssem.yp());
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((ShareLiveCardAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLI.LIZIZ("live_card_protocol");
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        RecyclerView recyclerView = ((MessageListCLSTrackerImpl) viewOnAttachStateChangeListenerC913860ZtA.l0).LLILZIL;
        if (recyclerView == null) {
            return;
        }
        C786410Ut5.x3(recyclerView.getViewTreeObserver(), ((MessageListCLSTrackerImpl) viewOnAttachStateChangeListenerC913860ZtA.l0).LLIZLLLIL);
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((ReusedSkeletonUISlotAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).sp();
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((AwemeCardAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLIL.LIZIZ("aweme_card_assem");
    }

    public static final void onViewAttachedToWindow$6(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        C901490ZYd c901490ZYd = (C901490ZYd) ((VoiceAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLJZIJLIL.getValue();
        c901490ZYd.LL.addOnScrollListener(c901490ZYd);
        c901490ZYd.LL.addOnItemTouchListener(c901490ZYd);
        if (((C0ZXC) C631370Opb.LIZ((VoiceAssem) viewOnAttachStateChangeListenerC913860ZtA.l0)).LJII().LIZJ instanceof C0ZXU) {
            ((VoiceAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLJLL.LIZIZ("voice_assem");
        }
    }

    public static final void onViewAttachedToWindow$7(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        TextTranslateAssem textTranslateAssem = (TextTranslateAssem) viewOnAttachStateChangeListenerC913860ZtA.l0;
        if (textTranslateAssem.LLJJLIIIJLLLLLLLZ) {
            textTranslateAssem.Qp().xQ2();
        }
        if (((C0ZS7) C631370Opb.LIZ((TextTranslateAssem) viewOnAttachStateChangeListenerC913860ZtA.l0)).LJII().LIZJ instanceof C0ZXU) {
            ((TextTranslateAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLFZ.LIZIZ("text_translate_assem");
        }
    }

    public static final void onViewAttachedToWindow$8(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((DMCameraPhotoCardAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLJLILLLLZIIL.LIZIZ("photo");
    }

    public static final void onViewAttachedToWindow$9(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((DMCameraVideoCardAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLJLILLLLZIIL.LIZIZ("private_video");
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        if (view.getViewTreeObserver().isAlive() && ((C888110Ysj) viewOnAttachStateChangeListenerC913860ZtA.l0).LLILZIL != null) {
            C786410Ut5.E3(view.getViewTreeObserver(), ((C888110Ysj) viewOnAttachStateChangeListenerC913860ZtA.l0).LLILZIL);
        }
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        C0ZVX c0zvxSp = ((DynamicCardReusedUISlot) viewOnAttachStateChangeListenerC913860ZtA.l0).sp();
        if (c0zvxSp != null) {
            c0zvxSp.onDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$10(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        AnonymousClass0956 anonymousClass0956 = ((PhotoSwapAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static final void onViewDetachedFromWindow$11(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        int value;
        ((QuickLiveReactionVideoAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLFF.LIZLLL("quick_live_react");
        QuickLiveReactionVideoAssem quickLiveReactionVideoAssem = (QuickLiveReactionVideoAssem) viewOnAttachStateChangeListenerC913860ZtA.l0;
        C911250Zox c911250Zox = quickLiveReactionVideoAssem.LLLIIIIL;
        int i = c911250Zox.LIZLLL;
        EnumC911240Zow enumC911240Zow = EnumC911240Zow.PLAYING;
        if (i != enumC911240Zow.getValue()) {
            if (((View) quickLiveReactionVideoAssem.LLJLLIL.getValue()).getVisibility() == 0) {
                value = EnumC911240Zow.RETRY.getValue();
            } else if (((View) quickLiveReactionVideoAssem.LLJLILLLLZIIL.getValue()).getVisibility() == 0) {
                value = EnumC911240Zow.LOADING.getValue();
            } else if (quickLiveReactionVideoAssem.tp().LJIL()) {
                value = enumC911240Zow.getValue();
            } else {
                value = EnumC911240Zow.UNKNOWN.getValue();
            }
            c911250Zox.LIZLLL = value;
        }
        C911250Zox c911250Zox2 = ((QuickLiveReactionVideoAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLIIIIL;
        C0I0B.LJFF.LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(c911250Zox2.LIZ, "on_display_status");
        c2344009Gk.LIZJ(c911250Zox2.LIZIZ, "error_code");
        c2344009Gk.LIZJ(c911250Zox2.LIZLLL, "off_display_status");
        c2344009Gk.LIZJ(c911250Zox2.LJFF ? 1 : 0, "using_local_cache");
        c2344009Gk.LIZJ(c911250Zox2.LJI ? 1 : 0, "requested_message_refresh");
        c2344009Gk.LIZJ(c911250Zox2.LJII ? 1 : 0, "requested_retry");
        c2344009Gk.LIZJ(c911250Zox2.LJIIIIZZ ? 1 : 0, "sent_from_user_self");
        Integer num = c911250Zox2.LIZJ;
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "underlying_error_code");
        }
        Double d = c911250Zox2.LJ;
        if (d != null) {
            c2344009Gk.LIZ(d.doubleValue(), "first_frame_ready_duration");
        }
        String str = c911250Zox2.LJIIIZ;
        if (str != null) {
            c2344009Gk.LJFF("message_id", str);
        }
        String str2 = c911250Zox2.LJIIJ;
        if (str2 != null) {
            c2344009Gk.LJFF("message_ttl", str2);
        }
        Boolean bool = c911250Zox2.LJIIJJI;
        if (bool != null) {
            c2344009Gk.LIZJ(bool.booleanValue() ? 1 : 0, "message_expired_when_display");
        }
        C20684815ws.LJIILLIIL("im_live_reaction_message_display_perf", c2344009Gk.LIZ);
        ((QuickLiveReactionVideoAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLIIIIL = new C911250Zox();
        QuickLiveReactionVideoAssem quickLiveReactionVideoAssem2 = (QuickLiveReactionVideoAssem) viewOnAttachStateChangeListenerC913860ZtA.l0;
        quickLiveReactionVideoAssem2.LLLIIIL = 0L;
        quickLiveReactionVideoAssem2.LLLIIL = null;
        quickLiveReactionVideoAssem2.LLLIILIL = null;
    }

    public static final void onViewDetachedFromWindow$12(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        MediaThumbnailViewAssem mediaThumbnailViewAssem = (MediaThumbnailViewAssem) viewOnAttachStateChangeListenerC913860ZtA.l0;
        mediaThumbnailViewAssem.LLJLIL.LIZLLL(mediaThumbnailViewAssem.yp());
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((ShareLiveCardAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLI.LIZLLL("live_card_protocol");
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        RecyclerView recyclerView = ((MessageListCLSTrackerImpl) viewOnAttachStateChangeListenerC913860ZtA.l0).LLILZIL;
        if (recyclerView == null) {
            return;
        }
        C786410Ut5.C3(recyclerView.getViewTreeObserver(), ((MessageListCLSTrackerImpl) viewOnAttachStateChangeListenerC913860ZtA.l0).LLIZLLLIL);
        MessageListCLSTrackerImpl messageListCLSTrackerImpl = (MessageListCLSTrackerImpl) viewOnAttachStateChangeListenerC913860ZtA.l0;
        messageListCLSTrackerImpl.LLILZIL = null;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1495305tH(messageListCLSTrackerImpl, C0I0B.LJFF.LIZIZ(), null), 3);
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((ReusedSkeletonUISlotAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).yp();
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((AwemeCardAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLIL.LIZLLL("aweme_card_assem");
    }

    public static final void onViewDetachedFromWindow$6(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        C901490ZYd c901490ZYd = (C901490ZYd) ((VoiceAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLJZIJLIL.getValue();
        c901490ZYd.LL.removeOnScrollListener(c901490ZYd);
        c901490ZYd.LL.removeOnItemTouchListener(c901490ZYd);
        if (((C0ZXC) C631370Opb.LIZ((VoiceAssem) viewOnAttachStateChangeListenerC913860ZtA.l0)).LJII().LIZJ instanceof C0ZXU) {
            ((VoiceAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLJLL.LIZLLL("voice_assem");
        }
    }

    public static final void onViewDetachedFromWindow$7(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        TextTranslateAssem textTranslateAssem = (TextTranslateAssem) viewOnAttachStateChangeListenerC913860ZtA.l0;
        if (textTranslateAssem.LLJJLIIIJLLLLLLLZ) {
            textTranslateAssem.Qp().yQ2();
        }
        if (((C0ZS7) C631370Opb.LIZ((TextTranslateAssem) viewOnAttachStateChangeListenerC913860ZtA.l0)).LJII().LIZJ instanceof C0ZXU) {
            ((TextTranslateAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLLFZ.LIZLLL("text_translate_assem");
        }
    }

    public static final void onViewDetachedFromWindow$8(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((DMCameraPhotoCardAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLJLILLLLZIIL.LIZLLL("photo");
    }

    public static final void onViewDetachedFromWindow$9(ViewOnAttachStateChangeListenerC913860ZtA viewOnAttachStateChangeListenerC913860ZtA, View view) {
        ((DMCameraVideoCardAssem) viewOnAttachStateChangeListenerC913860ZtA.l0).LLJLILLLLZIIL.LIZLLL("private_video");
    }
}
