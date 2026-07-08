package Y;

import X.AbstractC1038140d7c;
import X.C0RAE;
import X.C1003610cDv;
import X.C1003650cDz;
import X.C1018320cbe;
import X.C1019030ccn;
import X.C1022820ciu;
import X.C1025890cnr;
import X.C1025960cny;
import X.C1030050cuZ;
import X.C1030100cue;
import X.C1035340d36;
import X.C1038030d7R;
import X.C1045340dJE;
import X.C14KQ;
import X.C2184171Adz;
import X.C2214471Bll;
import X.C444960Hcc;
import X.C787230UuP;
import X.EnumC1038130d7b;
import X.InterfaceC1036270d4b;
import X.InterfaceC1037450d6V;
import X.InterfaceC988610bpj;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.feed.dialog.FeedAdDislikeSubReasonV2Dialog;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridFragment;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.model.AnolePlayerVideoDataModel;
import com.ss.android.ugc.aweme.model.VideoConfigInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class ATListenerS449S0100000_16 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS449S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        if (motionEvent != null) {
            ((GestureDetector) ((C1003650cDz) aTListenerS449S0100000_16.l0).LLJZIJLIL.getValue()).onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$1(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        Boolean bool;
        VideoConfigInfo videoConfigInfo;
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = ((C1018320cbe) aTListenerS449S0100000_16.l0).LJJIII();
        if (anolePlayerVideoDataModelLJJIII != null && (videoConfigInfo = anolePlayerVideoDataModelLJJIII.videoConfigInfo) != null) {
            bool = videoConfigInfo.videoTouchEnable;
        } else {
            bool = null;
        }
        if (bool == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return false;
    }

    public static final boolean onTouch$10(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        ((C1035340d36) aTListenerS449S0100000_16.l0).getActionMode().LIZIZ(motionEvent);
        return false;
    }

    public static final boolean onTouch$11(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        AbstractC1038140d7c abstractC1038140d7c;
        if (motionEvent == null || motionEvent.getAction() != 0 || ((abstractC1038140d7c = ((C1038030d7R) aTListenerS449S0100000_16.l0).LL) != null && abstractC1038140d7c.LJI())) {
            return true;
        }
        ((C1038030d7R) aTListenerS449S0100000_16.l0).LJII(EnumC1038130d7b.TITLE);
        return true;
    }

    public static final boolean onTouch$12(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        ((GestureDetector) ((C1003610cDv) aTListenerS449S0100000_16.l0).LJI.getValue()).onTouchEvent(motionEvent);
        return true;
    }

    public static final boolean onTouch$13(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        ((GestureDetector) aTListenerS449S0100000_16.l0).onTouchEvent(motionEvent);
        return false;
    }

    public static final boolean onTouch$2(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        FeedAdDislikeSubReasonV2Dialog feedAdDislikeSubReasonV2Dialog = (FeedAdDislikeSubReasonV2Dialog) aTListenerS449S0100000_16.l0;
        feedAdDislikeSubReasonV2Dialog.getClass();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                float y = motionEvent.getY() - feedAdDislikeSubReasonV2Dialog.LLJIJIL;
                if (y > 0.0f && Math.abs(y) > feedAdDislikeSubReasonV2Dialog.LLJILJILJ) {
                    feedAdDislikeSubReasonV2Dialog.LLJILJIL = true;
                }
            } else {
                float y2 = motionEvent.getY() - feedAdDislikeSubReasonV2Dialog.LLJIJIL;
                if (feedAdDislikeSubReasonV2Dialog.LLJILJIL && y2 > feedAdDislikeSubReasonV2Dialog.LLJILJILJ) {
                    feedAdDislikeSubReasonV2Dialog.PR();
                } else {
                    View view2 = feedAdDislikeSubReasonV2Dialog.getView();
                    if (view2 != null) {
                        view2.getLocationOnScreen(new int[2]);
                        if (motionEvent.getRawY() < r0[1] && y2 > feedAdDislikeSubReasonV2Dialog.LLJILJILJ / 2) {
                            feedAdDislikeSubReasonV2Dialog.PR();
                        }
                    }
                    feedAdDislikeSubReasonV2Dialog.LLJILJIL = false;
                    return false;
                }
            }
        } else {
            feedAdDislikeSubReasonV2Dialog.LLJIJIL = motionEvent.getY();
            motionEvent.getY();
            feedAdDislikeSubReasonV2Dialog.LLJILJIL = false;
        }
        return true;
    }

    public static final boolean onTouch$3(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        long jLJLJLLL;
        float rawX;
        if (motionEvent.getAction() == 1) {
            CommerceVideoDelegateKt commerceVideoDelegateKt = (CommerceVideoDelegateKt) aTListenerS449S0100000_16.l0;
            C0RAE<?, ?> c0rae = commerceVideoDelegateKt.baseHolder;
            if (commerceVideoDelegateKt.LLLLZLLIL(c0rae)) {
                Fragment fragment = ((CommerceVideoDelegateKt) aTListenerS449S0100000_16.l0).fragment;
                if ((fragment instanceof FeedRecommendFragment) && fragment != null) {
                    jLJLJLLL = ((FeedRecommendFragment) fragment).LLIZLLLIL.LJLJLLL();
                } else {
                    jLJLJLLL = 0;
                }
                HashMap map = new HashMap();
                map.put("duration", String.valueOf(jLJLJLLL));
                HashMap map2 = new HashMap();
                if (C444960Hcc.LIZJ(((CommerceVideoDelegateKt) aTListenerS449S0100000_16.l0).context)) {
                    map2.put("click_x", String.valueOf(C14KQ.LJIIIIZZ(((CommerceVideoDelegateKt) aTListenerS449S0100000_16.l0).context) - motionEvent.getRawX()));
                } else {
                    map2.put("click_x", String.valueOf(motionEvent.getRawX()));
                }
                map2.put("click_y", String.valueOf(motionEvent.getRawY()));
                InterfaceC988610bpj interfaceC988610bpj = (InterfaceC988610bpj) C2214471Bll.LJIIJJI.LIZ();
                if (interfaceC988610bpj != null) {
                    map.put("ad_extra_data", GsonProtectorUtils.toJson(interfaceC988610bpj.getGson(), map2));
                    Context context = C787230UuP.LIZ;
                    Aweme aweme = c0rae.getAweme();
                    C1019030ccn.LJJJJ(context, "skip", aweme, C1019030ccn.LJIIJJI(context, aweme, false, map));
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "skip", c0rae.getAweme().getAwemeRawAd());
                    if (C444960Hcc.LIZJ(((CommerceVideoDelegateKt) aTListenerS449S0100000_16.l0).context)) {
                        rawX = C14KQ.LJIIIIZZ(((CommerceVideoDelegateKt) aTListenerS449S0100000_16.l0).context) - motionEvent.getRawX();
                    } else {
                        rawX = motionEvent.getRawX();
                    }
                    c1022820ciuLIZLLL.LIZIZ(Float.valueOf(rawX), "click_x");
                    c1022820ciuLIZLLL.LIZIZ(Float.valueOf(motionEvent.getRawY()), "click_y");
                    c1022820ciuLIZLLL.LJIIIIZZ();
                    ViewGroup rootView = ((CommerceVideoDelegateKt) aTListenerS449S0100000_16.l0).getRootView();
                    if (rootView != null) {
                        C1045340dJE.LJIJI().LJJIJL(C787230UuP.LIZ, rootView, c0rae.getAweme());
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            ((CommerceVideoDelegateKt) aTListenerS449S0100000_16.l0).LLLZLZ();
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        if (((C1035340d36) aTListenerS449S0100000_16.l0).getActionMode().LIZJ == 5) {
            ((C1035340d36) aTListenerS449S0100000_16.l0).setFromTitleBarClick(true);
        }
        ((C1035340d36) aTListenerS449S0100000_16.l0).getActionMode().LIZIZ(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return true;
            }
            ((C1035340d36) aTListenerS449S0100000_16.l0).getEnableWebSpark();
            return true;
        }
        int i = C1030050cuZ.LLJLILLLLZIIL;
        C1030100cue.LIZ = true;
        return true;
    }

    public static final boolean onTouch$5(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        ((C1035340d36) aTListenerS449S0100000_16.l0).getActionMode().LIZIZ(motionEvent);
        return false;
    }

    public static final boolean onTouch$6(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                ((AdWebSparkFragment) aTListenerS449S0100000_16.l0).LLLIIL = System.currentTimeMillis();
            } else {
                if (numValueOf.intValue() == 2) {
                    ((AdWebSparkFragment) aTListenerS449S0100000_16.l0).LLLIIL = System.currentTimeMillis();
                    return true;
                }
                if (numValueOf.intValue() == 3) {
                    ((AdWebSparkFragment) aTListenerS449S0100000_16.l0).LLLIIL = System.currentTimeMillis();
                    return true;
                }
                if (numValueOf.intValue() == 1) {
                    ((AdWebSparkFragment) aTListenerS449S0100000_16.l0).LLLIILIL = System.currentTimeMillis();
                    AdWebSparkFragment adWebSparkFragment = (AdWebSparkFragment) aTListenerS449S0100000_16.l0;
                    if (adWebSparkFragment.LLLIILIL - adWebSparkFragment.LLLIIL <= 150 && view != null) {
                        HandlerHook.viewPost(view, new ARunnableS116S0100000_16(adWebSparkFragment, 36));
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$7(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        AdSparkHybridFragment adSparkHybridFragment = (AdSparkHybridFragment) aTListenerS449S0100000_16.l0;
        InterfaceC1036270d4b interfaceC1036270d4b = adSparkHybridFragment.LLLJIL;
        if (interfaceC1036270d4b != null) {
            boolean z = adSparkHybridFragment.getParentFragment() instanceof TuxSheet;
            interfaceC1036270d4b.Gn(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$8(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        AdSparkHybridFragment adSparkHybridFragment = (AdSparkHybridFragment) aTListenerS449S0100000_16.l0;
        InterfaceC1036270d4b interfaceC1036270d4b = adSparkHybridFragment.LLLJIL;
        if (interfaceC1036270d4b != null) {
            boolean z = adSparkHybridFragment.getParentFragment() instanceof TuxSheet;
            interfaceC1036270d4b.Gn(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$9(ATListenerS449S0100000_16 aTListenerS449S0100000_16, View view, MotionEvent motionEvent) {
        InterfaceC1037450d6V webView;
        ((C1025890cnr) aTListenerS449S0100000_16.l0).getActionMode().LIZIZ(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action != 1 && action != 3) || (webView = ((C1025890cnr) aTListenerS449S0100000_16.l0).getWebView()) == null || webView.getView().getScrollY() <= 0) {
                return true;
            }
            boolean z = C1025960cny.LLJLIL;
            C1025960cny.LLJLIL = false;
            return true;
        }
        boolean z2 = C1025960cny.LLJLIL;
        C1025960cny.LLJLIL = true;
        return true;
    }
}
