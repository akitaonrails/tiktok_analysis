package Y;

import X.AbstractC1585810rMx;
import X.AbstractC20634115oh;
import X.AbstractC643470PLt;
import X.AbstractC653010PjP;
import X.AbstractC683510QrV;
import X.AbstractC683590Qrd;
import X.C04SE;
import X.C07GF;
import X.C07OE;
import X.C086I;
import X.C0BYZ;
import X.C0P5K;
import X.C0P6H;
import X.C0P6J;
import X.C0P6N;
import X.C0P8E;
import X.C0PC5;
import X.C0PCF;
import X.C0PCV;
import X.C0PCY;
import X.C0PFV;
import X.C0PQC;
import X.C0PQZ;
import X.C0PRC;
import X.C0PRW;
import X.C0PT6;
import X.C0PTR;
import X.C0Q3E;
import X.C0Q7D;
import X.C0QO8;
import X.C0R0W;
import X.C0R0X;
import X.C0R0Y;
import X.C0VWN;
import X.C12ES;
import X.C1318570kPv;
import X.C13BV;
import X.C13LQ;
import X.C1820407Ba;
import X.C2097608Jq;
import X.C21674119s3;
import X.C2187451AjH;
import X.C2341109Fh;
import X.C2344009Gk;
import X.C2399609ak;
import X.C416190GTp;
import X.C444960Hcc;
import X.C640690PBb;
import X.C641510PEf;
import X.C641530PEh;
import X.C643360PLi;
import X.C645870PUz;
import X.C646000PVm;
import X.C648230Pbh;
import X.C648750PcX;
import X.C650950Pg5;
import X.C652600Pik;
import X.C652990PjN;
import X.C653210Pjj;
import X.C653280Pjq;
import X.C661360Pws;
import X.C664400Q4g;
import X.C678130Qip;
import X.C678140Qiq;
import X.C678150Qir;
import X.C678200Qiw;
import X.C679270Qkf;
import X.C679280Qkg;
import X.C679300Qki;
import X.InterfaceC1602960roc;
import X.InterfaceC21676919sV;
import X.InterfaceC648270Pbl;
import X.InterfaceC648350Pbt;
import X.InterfaceC652740Piy;
import X.InterfaceC653030PjR;
import X.InterfaceC654580Plw;
import X.InterfaceC665710Q9h;
import X.InterfaceC676520QgE;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.gson.n;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.arch.MixStickyLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ui.EcSearchSugAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.ui.SearchHorizontalListAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.SearchListPlayer;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.ability.SearchDislikeAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AsS37S0100000_10 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) throws JSONException {
        switch (this.$t) {
            case 1:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 2:
            case 4:
            case 5:
            case 26:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 3:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIJ$7(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJIIJ$8(this, recyclerView, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJJIIJ$9(this, recyclerView, i);
                break;
            case 14:
                LJJIIJ$10(this, recyclerView, i);
                break;
            case 15:
                LJJIIJ$11(this, recyclerView, i);
                break;
            case 16:
                LJJIIJ$12(this, recyclerView, i);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LJJIIJ$13(this, recyclerView, i);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LJJIIJ$14(this, recyclerView, i);
                break;
            case 19:
                LJJIIJ$15(this, recyclerView, i);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LJJIIJ$16(this, recyclerView, i);
                break;
            case 21:
                LJJIIJ$17(this, recyclerView, i);
                break;
            case 22:
                LJJIIJ$18(this, recyclerView, i);
                break;
            case 23:
                LJJIIJ$19(this, recyclerView, i);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LJJIIJ$20(this, recyclerView, i);
                break;
            case 25:
                LJJIIJ$21(this, recyclerView, i);
                break;
            case 27:
                LJJIIJ$22(this, recyclerView, i);
                break;
            case 28:
                LJJIIJ$23(this, recyclerView, i);
                break;
            case 29:
                LJJIIJ$24(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 6:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case 14:
            case 15:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 22:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
            case 27:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIZI$8(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJJIIZI$9(this, recyclerView, i, i2);
                break;
            case 16:
                LJJIIZI$10(this, recyclerView, i, i2);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LJJIIZI$11(this, recyclerView, i, i2);
                break;
            case 21:
                LJJIIZI$12(this, recyclerView, i, i2);
                break;
            case 23:
                LJJIIZI$13(this, recyclerView, i, i2);
                break;
            case 26:
                LJJIIZI$14(this, recyclerView, i, i2);
                break;
            case 28:
                LJJIIZI$15(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS37S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        Animator animator;
        Animator animator2;
        View first;
        AnimatorSet animatorSet;
        boolean z;
        AnimatorSet animatorSet2;
        boolean z2;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        C679300Qki c679300Qki = new C679300Qki(i);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(c679300Qki);
        if (C0BYZ.LIZ()) {
            MixFloatingLayerAssem mixFloatingLayerAssem = (MixFloatingLayerAssem) asS37S0100000_10.l0;
            if (i != 1 && i != 2) {
                z2 = false;
            } else {
                z2 = true;
            }
            mixFloatingLayerAssem.LLJJJ = z2;
            if (i == 0) {
                ARunnableS79S0200000_10 aRunnableS79S0200000_10 = mixFloatingLayerAssem.LLJJIJIL;
                if (aRunnableS79S0200000_10 != null) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = mixFloatingLayerAssem.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv != null) {
                        HandlerHook.viewRemoveCallbacks(viewOnAttachStateChangeListenerC20604515jv, aRunnableS79S0200000_10);
                    }
                    mixFloatingLayerAssem.LLJJIJIL = null;
                }
                MixFloatingLayerAssem mixFloatingLayerAssem2 = (MixFloatingLayerAssem) asS37S0100000_10.l0;
                if (mixFloatingLayerAssem2.LLJJIJIIJIL && !mixFloatingLayerAssem2.LLJJJIL) {
                    mixFloatingLayerAssem2.Go(recyclerView, false);
                }
            }
        }
        Pair<? extends View, ? extends SearchBffItem> pair = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJJLIIIJLLLLLLLZ.get(17);
        if (pair != null && (first = pair.getFirst()) != null && first.getVisibility() == 0) {
            if (i != 0) {
                if (i == 1) {
                    AnimatorSet animatorSet3 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLILLLLZIIL;
                    if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet2 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLILLLLZIIL) != null) {
                        animatorSet2.cancel();
                    }
                    int measuredWidth = (first.getMeasuredWidth() - C679280Qkg.LIZ(10)) - C679280Qkg.LIZ(10);
                    if (first.getLayoutDirection() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float f = measuredWidth;
                    if (z) {
                        f = -f;
                    }
                    MixFloatingLayerAssem mixFloatingLayerAssem3 = (MixFloatingLayerAssem) asS37S0100000_10.l0;
                    float translationX = first.getTranslationX() + f;
                    mixFloatingLayerAssem3.getClass();
                    mixFloatingLayerAssem3.LLJLILLLLZIIL = MixFloatingLayerAssem.Vo(first, translationX);
                    AnimatorSet animatorSet4 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLILLLLZIIL;
                    if (animatorSet4 != null) {
                        animatorSet4.start();
                    }
                }
            } else {
                AnimatorSet animatorSet5 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLILLLLZIIL;
                if (animatorSet5 != null && animatorSet5.isRunning() && (animatorSet = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLILLLLZIIL) != null) {
                    animatorSet.cancel();
                }
                MixFloatingLayerAssem mixFloatingLayerAssem4 = (MixFloatingLayerAssem) asS37S0100000_10.l0;
                mixFloatingLayerAssem4.getClass();
                mixFloatingLayerAssem4.LLJLILLLLZIIL = MixFloatingLayerAssem.Vo(first, 0.0f);
                AnimatorSet animatorSet6 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLILLLLZIIL;
                if (animatorSet6 != null) {
                    animatorSet6.start();
                }
            }
        }
        if (i != 0) {
            if (i == 1) {
                Animator animator3 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLL;
                if (animator3 != null && animator3.isRunning() && (animator2 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLL) != null) {
                    animator2.cancel();
                }
                MixFloatingLayerAssem mixFloatingLayerAssem5 = (MixFloatingLayerAssem) asS37S0100000_10.l0;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mixFloatingLayerAssem5.ap(), "alpha", ((MixFloatingLayerAssem) asS37S0100000_10.l0).ap().getAlpha(), 0.5f);
                objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
                objectAnimatorOfFloat.setDuration(200L);
                mixFloatingLayerAssem5.LLJLL = objectAnimatorOfFloat;
                Animator animator4 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLL;
                if (animator4 != null) {
                    animator4.start();
                    return;
                }
                return;
            }
            return;
        }
        Animator animator5 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLL;
        if (animator5 != null && animator5.isRunning() && (animator = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLL) != null) {
            animator.cancel();
        }
        MixFloatingLayerAssem mixFloatingLayerAssem6 = (MixFloatingLayerAssem) asS37S0100000_10.l0;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(mixFloatingLayerAssem6.ap(), "alpha", ((MixFloatingLayerAssem) asS37S0100000_10.l0).ap().getAlpha(), 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat2.setDuration(200L);
        mixFloatingLayerAssem6.LLJLL = objectAnimatorOfFloat2;
        Animator animator6 = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLL;
        if (animator6 == null) {
            return;
        }
        animator6.start();
    }

    public static final void LJJIIJ$1(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        int i2;
        InterfaceC653030PjR interfaceC653030PjR;
        if (C643360PLi.LIZ()) {
            return;
        }
        if (((C652990PjN) asS37S0100000_10.l0).LJIIIIZZ && ((C0P8E) C0Q3E.LJFF().Im0().LIZJ()).LL) {
            return;
        }
        C652990PjN c652990PjN = (C652990PjN) asS37S0100000_10.l0;
        RecyclerView.LayoutManager layoutManager = c652990PjN.LIZ.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).getOrientation() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c652990PjN.LJII.LIZ(i2);
        C652990PjN c652990PjN2 = (C652990PjN) asS37S0100000_10.l0;
        c652990PjN2.LIZJ = i;
        InterfaceC653030PjR interfaceC653030PjR2 = c652990PjN2.LJFF;
        if (interfaceC653030PjR2 != null) {
            interfaceC653030PjR2.LLF(recyclerView, i);
        }
        if (i == 0) {
            C652990PjN c652990PjN3 = (C652990PjN) asS37S0100000_10.l0;
            if (c652990PjN3.LIZLLL || (c652990PjN3.LJ && (interfaceC653030PjR = c652990PjN3.LJFF) != null && !interfaceC653030PjR.LIZLLL())) {
                ((C652990PjN) asS37S0100000_10.l0).LIZJ();
            }
            C652990PjN c652990PjN4 = (C652990PjN) asS37S0100000_10.l0;
            c652990PjN4.LIZLLL = false;
            c652990PjN4.LJ = false;
            return;
        }
        if (i == 2) {
            ((C652990PjN) asS37S0100000_10.l0).LIZLLL = true;
        } else {
            if (i != 1) {
                return;
            }
            ((C652990PjN) asS37S0100000_10.l0).LJ = true;
        }
    }

    public static final void LJJIIJ$10(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) throws JSONException {
        C678140Qiq c678140Qiq;
        MixPageViewModel mixPageViewModel;
        C678130Qip c678130Qip;
        C678140Qiq c678140Qiq2;
        MixPageViewModel mixPageViewModel2;
        C678200Qiw c678200Qiw = (C678200Qiw) asS37S0100000_10.l0;
        if (i != 0) {
            if (i != 1) {
                c678200Qiw.getClass();
            } else {
                ((InterfaceC1602960roc) c678200Qiw.LLILLL.getValue()).start();
            }
        } else {
            ((InterfaceC1602960roc) c678200Qiw.LLILLL.getValue()).stop();
        }
        if (i != 0) {
            if (i == 1 && (c678130Qip = ((C678200Qiw) asS37S0100000_10.l0).LL) != null && (c678140Qiq2 = c678130Qip.LJII) != null && (mixPageViewModel2 = c678140Qiq2.LJIIL) != null) {
                n nVar = new n();
                nVar.LJJIII(1, "listScrollState");
                mixPageViewModel2.wQ2(nVar, "page_state");
                return;
            }
            return;
        }
        C678130Qip c678130Qip2 = ((C678200Qiw) asS37S0100000_10.l0).LL;
        if (c678130Qip2 != null && (c678140Qiq = c678130Qip2.LJII) != null && (mixPageViewModel = c678140Qiq.LJIIL) != null) {
            n nVar2 = new n();
            nVar2.LJJIII(2, "listScrollState");
            mixPageViewModel.wQ2(nVar2, "page_state");
        }
        ((C678200Qiw) asS37S0100000_10.l0).LIZ();
    }

    public static final void LJJIIJ$11(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        InterfaceC676520QgE interfaceC676520QgE;
        C678150Qir c678150Qir = (C678150Qir) asS37S0100000_10.l0;
        c678150Qir.LLILZ = i;
        if (i != 0) {
            if (i == 1 && !C07GF.LIZ() && ((Number) C1820407Ba.LIZ.getValue()).intValue() == 1 && (interfaceC676520QgE = c678150Qir.LL) != null) {
                interfaceC676520QgE.LJI();
                return;
            }
            return;
        }
        if (c678150Qir.LLILZIL) {
            C07OE.LIZ.getClass();
            if (Intrinsics.LJFF(C07OE.LIZ(), "disable")) {
                return;
            }
            c678150Qir.LIZJ();
            return;
        }
        c678150Qir.LIZJ();
    }

    public static final void LJJIIJ$12(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        VerticalScrollDoubleColumnProvider verticalScrollDoubleColumnProvider = (VerticalScrollDoubleColumnProvider) asS37S0100000_10.l0;
        verticalScrollDoubleColumnProvider.LLJILLL = i;
        if (!C641510PEf.LIZIZ(verticalScrollDoubleColumnProvider.LLILZ, false) && i == 0) {
            VerticalScrollDoubleColumnProvider verticalScrollDoubleColumnProvider2 = (VerticalScrollDoubleColumnProvider) asS37S0100000_10.l0;
            VerticalScrollDoubleColumnProvider.LJI(verticalScrollDoubleColumnProvider2, verticalScrollDoubleColumnProvider2.LLIZ, null, false, 12);
        }
    }

    public static final void LJJIIJ$13(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        ISearchSugContextAbility iSearchSugContextAbility = ((EcSearchSugAssem) asS37S0100000_10.l0).kp().LLILLL;
        if (iSearchSugContextAbility != null) {
            iSearchSugContextAbility.PG1(false);
        }
    }

    public static final void LJJIIJ$14(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1 && i != 2) {
                ((C0P6N) asS37S0100000_10.l0).LJI = false;
                return;
            }
            C0P6N c0p6n = (C0P6N) asS37S0100000_10.l0;
            c0p6n.LJI = false;
            if (c0p6n.LJIILLIIL) {
                return;
            }
            c0p6n.LJIILL = 0;
            c0p6n.LJIILLIIL = true;
            return;
        }
        C0P6N c0p6n2 = (C0P6N) asS37S0100000_10.l0;
        c0p6n2.LJIILLIIL = false;
        c0p6n2.LJI = false;
        c0p6n2.LJII = false;
        if (c0p6n2.LJIILL > ((Number) c0p6n2.LJIIJJI.getValue()).intValue()) {
            ((C0P6N) asS37S0100000_10.l0).LIZ();
        }
        ((C0P6N) asS37S0100000_10.l0).LJIILL = 0;
    }

    public static final void LJJIIJ$15(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        if (((SearchMinisAllResultsActivity) asS37S0100000_10.l0).LLJI && !recyclerView.canScrollVertically(1) && i == 0) {
            ((SearchMinisAllResultsActivity) asS37S0100000_10.l0).LLLLZIL();
        }
    }

    public static final void LJJIIJ$16(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        if (i == 0 && ((AbstractC643470PLt) asS37S0100000_10.l0).LLILZIL.getItemCount() > 1) {
            AbstractC643470PLt abstractC643470PLt = (AbstractC643470PLt) asS37S0100000_10.l0;
            if (abstractC643470PLt.LLIZ) {
                abstractC643470PLt.LLILZIL.notifyItemChanged(1);
                ((AbstractC643470PLt) asS37S0100000_10.l0).LLIZ = false;
            }
        }
    }

    public static final void LJJIIJ$17(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        ((C0PTR) asS37S0100000_10.l0).LJIIJ.LIZIZ();
        IntRange intRangeLLF = ((C0PTR) asS37S0100000_10.l0).LJI.LLF(recyclerView, i);
        if (intRangeLLF != null) {
            C0PTR c0ptr = (C0PTR) asS37S0100000_10.l0;
            int i2 = intRangeLLF.LL;
            int i3 = intRangeLLF.LLILLJJLI;
            if (i2 > i3) {
                return;
            }
            while (true) {
                c0ptr.LIZ(i2);
                if (i2 != i3) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void LJJIIJ$18(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        int i2;
        if (i != 0) {
            return;
        }
        C0P5K c0p5k = (C0P5K) asS37S0100000_10.l0;
        c0p5k.getClass();
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() > c0p5k.LIZ) {
            i2 = 11;
        } else {
            i2 = 10;
        }
        C0QO8.LIZ.LJI(i2);
    }

    public static final void LJJIIJ$19(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        Iterator it2 = ((ArrayList) ((SearchHorizontalListAssem) asS37S0100000_10.l0).LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC654580Plw) it2.next()).LIZ(i);
        }
    }

    public static final void LJJIIJ$2(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) throws JSONException {
        if (i == 0) {
            C0Q7D c0q7d = C0Q7D.LIZ;
            Map<String, String> commonParams = ((SearchTakoCardAssem) asS37S0100000_10.l0).getCommonParams();
            c0q7d.getClass();
            JSONObject jSONObject = new JSONObject();
            C0Q7D.LJI(jSONObject, commonParams);
            jSONObject.put("click_type", "click_video_Slip");
            jSONObject.put("is_page", (Object) 0);
            AppLogNewUtils.onEventV3("search_card_click", jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIJ$20(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        boolean zIsPlaying;
        boolean zIsPlaying2;
        if (i == 0) {
            Iterator it2 = ((CopyOnWriteArrayList) ((C648230Pbh) asS37S0100000_10.l0).LIZJ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                InterfaceC648350Pbt interfaceC648350Pbt = (InterfaceC648350Pbt) next;
                Boolean boolZ3 = interfaceC648350Pbt.z3();
                if (boolZ3 != null) {
                    zIsPlaying = boolZ3.booleanValue();
                } else {
                    zIsPlaying = interfaceC648350Pbt.isPlaying();
                }
                if (zIsPlaying) {
                    if (next != null) {
                        for (Object obj : (CopyOnWriteArrayList) ((C648230Pbh) asS37S0100000_10.l0).LIZJ) {
                            InterfaceC648270Pbl interfaceC648270Pbl = (InterfaceC648270Pbl) obj;
                            Boolean boolZ32 = interfaceC648270Pbl.z3();
                            if (boolZ32 != null) {
                                zIsPlaying2 = boolZ32.booleanValue();
                            } else {
                                zIsPlaying2 = interfaceC648270Pbl.isPlaying();
                            }
                            if (zIsPlaying2 && C648230Pbh.LIZLLL((View) interfaceC648270Pbl)) {
                                if (obj != null) {
                                    ((C648230Pbh) asS37S0100000_10.l0).LJ();
                                    ((C648230Pbh) asS37S0100000_10.l0).LJFF();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
            }
            for (Object obj2 : (CopyOnWriteArrayList) ((C648230Pbh) asS37S0100000_10.l0).LIZJ) {
                if (!C648230Pbh.LIZLLL((View) ((InterfaceC648270Pbl) obj2))) {
                    if (obj2 == null) {
                        return;
                    }
                    ((C648230Pbh) asS37S0100000_10.l0).LJFF();
                    return;
                }
            }
        }
    }

    public static final void LJJIIJ$21(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        if (i != 0) {
            ((InterfaceC665710Q9h) asS37S0100000_10.l0).LIZIZ();
        }
    }

    public static final void LJJIIJ$22(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        C652600Pik c652600Pik = (C652600Pik) asS37S0100000_10.l0;
        if (!c652600Pik.LJFF) {
            return;
        }
        c652600Pik.LJII = 0L;
        if (i == 0) {
            c652600Pik.LJII = System.currentTimeMillis();
            C652600Pik c652600Pik2 = (C652600Pik) asS37S0100000_10.l0;
            C664400Q4g c664400Q4g = new C664400Q4g();
            C652600Pik c652600Pik3 = (C652600Pik) asS37S0100000_10.l0;
            c664400Q4g.LIZJ = c652600Pik3.LJII;
            c664400Q4g.LJIIJ = "scroll";
            c652600Pik2.LJIIJ = c664400Q4g;
            c652600Pik3.LJIIIIZZ();
            return;
        }
        c652600Pik.LJIIIIZZ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13BV] */
    public static final void LJJIIJ$23(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        ?? arrayList;
        int i2;
        ((C648750PcX) asS37S0100000_10.l0).getClass();
        if (i == 0) {
            System.currentTimeMillis();
            C648750PcX c648750PcX = (C648750PcX) asS37S0100000_10.l0;
            RecyclerView recyclerView2 = c648750PcX.LIZIZ;
            RecyclerView recyclerView3 = null;
            if (recyclerView2 != null) {
                List<Integer> listLIZ = C641510PEf.LIZ(recyclerView2);
                if (listLIZ.isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList();
                    Iterator<Integer> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(it2.next().intValue());
                        if ((viewHolderFindViewHolderForAdapterPosition instanceof RecyclerView.ViewHolder) && viewHolderFindViewHolderForAdapterPosition != null) {
                            arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                        }
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            int[] iArr = new int[2];
            RecyclerView recyclerView4 = c648750PcX.LIZIZ;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            recyclerView4.getLocationOnScreen(iArr);
            HashMap map = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            for (RecyclerView.ViewHolder viewHolder : arrayList) {
                View view = viewHolder.itemView;
                view.getLocationOnScreen(iArr);
                HashMap map2 = new HashMap();
                if (C444960Hcc.LIZJ(view.getContext())) {
                    map2.put("x", Integer.valueOf(((Number) c648750PcX.LIZJ.getValue()).intValue() - (iArr[0] + view.getWidth())));
                    map2.put("y", Integer.valueOf(iArr[1]));
                } else {
                    map2.put("x", Integer.valueOf(iArr[0]));
                    map2.put("y", Integer.valueOf(iArr[1]));
                }
                map2.put("width", Integer.valueOf(view.getWidth()));
                map2.put("height", Integer.valueOf(view.getHeight()));
                map2.put("index", Integer.valueOf(viewHolder.getAbsoluteAdapterPosition()));
                arrayList2.add(map2);
            }
            map.put("childs", arrayList2);
            HashMap map3 = new HashMap();
            RecyclerView recyclerView5 = c648750PcX.LIZIZ;
            if (recyclerView5 != null) {
                recyclerView3 = recyclerView5;
            }
            if (C444960Hcc.LIZJ(recyclerView3.getContext())) {
                i2 = (1 - c648750PcX.LJ) - 1;
            } else {
                i2 = c648750PcX.LJ;
            }
            map3.put("direction_x", Integer.valueOf(i2));
            map.put("direction", map3);
            System.currentTimeMillis();
            ((C648750PcX) asS37S0100000_10.l0).getClass();
        }
    }

    public static final void LJJIIJ$24(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        Boolean bool;
        if (i == 0 && ((C645870PUz) asS37S0100000_10.l0).LL.getParent() != null) {
            C646000PVm c646000PVm = C650950Pg5.Companion;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((C645870PUz) asS37S0100000_10.l0).LL;
            c646000PVm.getClass();
            C0PRW c0prwLIZLLL = C646000PVm.LIZLLL(viewOnAttachStateChangeListenerC20604515jv);
            if (c0prwLIZLLL != null && (bool = c0prwLIZLLL.hasShownResearchFilter) != null && bool.booleanValue()) {
                C645870PUz c645870PUz = (C645870PUz) asS37S0100000_10.l0;
                HandlerHook.viewPost(c645870PUz.LL, new ARunnableS29S0110000_10(c645870PUz, C641510PEf.LIZIZ(recyclerView, false), 6));
            }
        }
    }

    public static final void LJJIIJ$3(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        boolean z;
        SearchStateViewModel searchStateViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        ((SearchFragment) asS37S0100000_10.l0).getClass();
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        SearchStateViewModel searchStateViewModel2 = ((SearchFragment) asS37S0100000_10.l0).LLLFZ;
        if ((searchStateViewModel2 == null || (mutableLiveData = searchStateViewModel2.isResultRVScrolling) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.valueOf(z))) && (searchStateViewModel = ((SearchFragment) asS37S0100000_10.l0).LLLFZ) != null) {
            searchStateViewModel.setIsResultRVScrolling(z);
        }
    }

    public static final void LJJIIJ$4(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((SearchDislikeAbilityImpl) asS37S0100000_10.l0).LLIZLLLIL = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0R0X, X.19s2] */
    public static final void LJJIIJ$5(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        UIComponent uIComponent;
        final int i2;
        C0R0Y c0r0y;
        ((C0R0W) asS37S0100000_10.l0).LL.recognizeGesturere();
        C0R0W c0r0w = (C0R0W) asS37S0100000_10.l0;
        c0r0w.LLILZLL = i;
        if (c0r0w.LLILLJJLI.LJIIJ && c0r0w.LLIZ == null && i == 0 && c0r0w.LIZIZ(recyclerView)) {
            final C0R0W c0r0w2 = (C0R0W) asS37S0100000_10.l0;
            final C1318570kPv c1318570kPvLIZ = c0r0w2.LIZ(recyclerView);
            C0R0X c0r0x = c0r0w2.LLIZ;
            if ((c0r0x != null && c0r0x.LJ) || c1318570kPvLIZ == null || (uIComponent = c1318570kPvLIZ.LL.LLILLJJLI) == null || (i2 = c0r0w2.LLILLJJLI.LJIL) == 0) {
                return;
            }
            final int width = uIComponent.getWidth();
            float f = width;
            float f2 = i2;
            if (((long) ((f / f2) * 200)) <= 0) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) c0r0w2.LL.mView).getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == 0) {
                return;
            }
            ((AbstractC20634115oh) c0r0w2.LLILLJJLI.LJJIFFI.getValue()).LIZIZ(null);
            if (f > f2 * 0.88f && (c0r0y = c0r0w2.LLILLJJLI.LJIIZILJ) != null) {
                C0R0Y.LIZ(c0r0y, "scrolltobounce", C2097608Jq.LJ());
            }
            final Context context = c0r0w2.LL.mView.getContext();
            ?? r8 = new C21674119s3(context) { // from class: X.0R0X
                @Override // X.C21674119s3, X.AbstractC21674019s2
                public final void LJFF() {
                    C0R0W c0r0w3 = c0r0w2;
                    C1318570kPv c1318570kPv = c1318570kPvLIZ;
                    if (c1318570kPv == null) {
                        c0r0w3.getClass();
                        return;
                    }
                    c0r0w3.LLILLJJLI.LJJ = false;
                    UIComponent uIComponent2 = c1318570kPv.LL.LLILLJJLI;
                    if (uIComponent2 != null) {
                        uIComponent2.setWidth(0);
                    }
                    c1318570kPv.itemView.requestLayout();
                    C0R0K c0r0k = c0r0w3.LLILLJJLI;
                    if (c0r0k.LJIIL) {
                        ((AbstractC20634115oh) c0r0k.LJJIFFI.getValue()).LIZIZ((RecyclerView) c0r0w3.LL.mView);
                    }
                    ((RecyclerView) c0r0w3.LL.mView).scrollToPosition(c1318570kPv.getAdapterPosition() > 0 ? c1318570kPv.getAdapterPosition() - 1 : 0);
                    c0r0w3.LLIZ = null;
                }

                @Override // X.C21674119s3
                public final float LJIIJJI(DisplayMetrics displayMetrics) {
                    return 200.0f / i2;
                }

                @Override // X.C21674119s3, X.AbstractC21674019s2
                public final void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
                    int iLJIILIIL = LJIILIIL(width);
                    if (iLJIILIIL > 0) {
                        c21675319sF.LIZIZ(-width, 0, this.LJII, iLJIILIIL);
                    }
                }
            };
            c0r0w2.LLIZ = r8;
            r8.LIZ = c1318570kPvLIZ.getAdapterPosition() - 1;
            layoutManager.startSmoothScroll(r8);
            c0r0w2.LIZJ(false);
        }
    }

    public static final void LJJIIJ$6(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                ((C0P6H) asS37S0100000_10.l0).LIZLLL = true;
            }
        } else {
            C0P6J.LIZ.getClass();
            if (C0P6J.LIZIZ()) {
                return;
            }
            ((C0P6H) asS37S0100000_10.l0).LIZJ(recyclerView);
        }
    }

    public static final void LJJIIJ$7(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((C653280Pjq) asS37S0100000_10.l0).LIZLLL = true;
        }
    }

    public static final void LJJIIJ$8(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        String str;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        if (i != 0) {
            if (i == 1) {
                InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ("search_photo_list");
                if (interfaceC1602960rocLIZIZ != null) {
                    ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ((RecyclerView) asS37S0100000_10.l0);
                    if (iSearchContextAbilityLIZ == null || (c0pcyPh1 = iSearchContextAbilityLIZ.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str = c0prc.LLILLL) == null) {
                        str = "";
                    }
                    interfaceC1602960rocLIZIZ.LIZ("search_id", str);
                }
                C0PFV.LIZ.getClass();
                if (C0PFV.LIZIZ()) {
                    C0PFV.LIZJ();
                }
                C0PQC.LIZ.getClass();
                if (C0PQC.LIZ().enableScrollJit) {
                    C0PQC.LIZ();
                    int i2 = C2187451AjH.LIZ;
                    return;
                }
                return;
            }
            return;
        }
        C0PFV.LIZ.getClass();
        if (!C0PFV.LIZIZ()) {
            return;
        }
        C0PFV.LIZLLL();
    }

    public static final void LJJIIJ$9(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                C0PQZ.LIZ.getClass();
                C0PQZ.LIZIZ = true;
                return;
            }
            return;
        }
        C0P6J.LIZ.getClass();
        if (C0P6J.LIZIZ()) {
            return;
        }
        C0PQZ c0pqz = C0PQZ.LIZ;
        AbstractC683590Qrd abstractC683590Qrd = (AbstractC683590Qrd) asS37S0100000_10.l0;
        c0pqz.getClass();
        C0PQZ.LJI(abstractC683590Qrd, recyclerView, true);
    }

    public static final void LJJIIZI$0(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0) {
            MixStickyLayoutManager mixStickyLayoutManager = ((C678140Qiq) asS37S0100000_10.l0).LJIILIIL;
            MixStickyLayoutManager mixStickyLayoutManager2 = null;
            if (mixStickyLayoutManager == null) {
                mixStickyLayoutManager = null;
            }
            int iLJJJJLI = C13LQ.LJJJJLI(mixStickyLayoutManager.LJIJJ(null));
            MixStickyLayoutManager mixStickyLayoutManager3 = ((C678140Qiq) asS37S0100000_10.l0).LJIILIIL;
            if (mixStickyLayoutManager3 != null) {
                mixStickyLayoutManager2 = mixStickyLayoutManager3;
            }
            int itemCount = mixStickyLayoutManager2.getItemCount();
            ((C678140Qiq) asS37S0100000_10.l0).LJIIJJI = ((Number) C04SE.LIZ.getValue()).intValue();
            int i3 = iLJJJJLI + 1;
            C678140Qiq c678140Qiq = (C678140Qiq) asS37S0100000_10.l0;
            if (i3 >= itemCount - c678140Qiq.LJIIJJI) {
                c678140Qiq.LIZLLL();
            }
        }
    }

    public static final void LJJIIZI$1(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        View first;
        String enterMethod;
        String keyword;
        String strLIZJ;
        String imprId;
        MixFloatingLayerAssem mixFloatingLayerAssem = (MixFloatingLayerAssem) asS37S0100000_10.l0;
        mixFloatingLayerAssem.LLJLIL += i2;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS150S0101000_10 awS150S0101000_10 = new AwS150S0101000_10(i2, mixFloatingLayerAssem, 1);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS150S0101000_10);
        Pair<? extends View, ? extends SearchBffItem> pair = ((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJJLIIIJLLLLLLLZ.get(1005);
        if (pair != null && (first = pair.getFirst()) != null) {
            if (((MixFloatingLayerAssem) asS37S0100000_10.l0).LLJLIL > C12ES.LJIIIIZZ(recyclerView.getContext())) {
                if (first.getVisibility() != 0) {
                    MixFloatingLayerAssem mixFloatingLayerAssem2 = (MixFloatingLayerAssem) asS37S0100000_10.l0;
                    mixFloatingLayerAssem2.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    SearchResultParam searchResultParam = mixFloatingLayerAssem2.LLJILLL;
                    if (searchResultParam != null) {
                        enterMethod = searchResultParam.getEnterMethod();
                    } else {
                        enterMethod = null;
                    }
                    c2344009Gk.LJIIIIZZ("enter_method", enterMethod);
                    c2344009Gk.LJIIIIZZ("search_entrance", mixFloatingLayerAssem2.So());
                    c2344009Gk.LJIIIIZZ("enter_from", mixFloatingLayerAssem2.Zo());
                    c2344009Gk.LJIIIIZZ("search_type", "shop");
                    SearchResultParam searchResultParam2 = mixFloatingLayerAssem2.LLJILLL;
                    if (searchResultParam2 != null) {
                        keyword = searchResultParam2.getKeyword();
                    } else {
                        keyword = null;
                    }
                    c2344009Gk.LJIIIIZZ("search_keyword", keyword);
                    n value = mixFloatingLayerAssem2.No().LLJI.getValue();
                    if (value != null) {
                        strLIZJ = C2399609ak.LIZJ(value, "search_id");
                    } else {
                        strLIZJ = null;
                    }
                    c2344009Gk.LJIIIIZZ("search_id", strLIZJ);
                    c2344009Gk.LJ(mixFloatingLayerAssem2.No().LLJ.getValue(), "log_pb");
                    LogPbBean value2 = mixFloatingLayerAssem2.No().LLJ.getValue();
                    if (value2 != null) {
                        imprId = value2.getImprId();
                    } else {
                        imprId = null;
                    }
                    c2344009Gk.LJIIIIZZ("impr_id", imprId);
                    C679270Qkf.LIZIZ("return_to_top_show", c2344009Gk.LIZ);
                }
                C12ES.LJIILL(0, first);
            } else {
                C12ES.LJIILL(4, first);
            }
        }
        if (C0BYZ.LIZ()) {
            MixFloatingLayerAssem mixFloatingLayerAssem3 = (MixFloatingLayerAssem) asS37S0100000_10.l0;
            if (mixFloatingLayerAssem3.LLJJIJIIJIL && mixFloatingLayerAssem3.LLJJJ) {
                ARunnableS79S0200000_10 aRunnableS79S0200000_10 = mixFloatingLayerAssem3.LLJJIJIL;
                if (aRunnableS79S0200000_10 != null) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = mixFloatingLayerAssem3.LLIZLLLIL;
                    if (viewOnAttachStateChangeListenerC20604515jv != null) {
                        HandlerHook.viewRemoveCallbacks(viewOnAttachStateChangeListenerC20604515jv, aRunnableS79S0200000_10);
                    }
                    mixFloatingLayerAssem3.LLJJIJIL = null;
                }
                mixFloatingLayerAssem3.LLJJIJIL = new ARunnableS79S0200000_10(mixFloatingLayerAssem3, recyclerView, 54);
                ARunnableS79S0200000_10 aRunnableS79S0200000_102 = mixFloatingLayerAssem3.LLJJIJIL;
                if (aRunnableS79S0200000_102 != null) {
                    HandlerHook.viewPostDelay(recyclerView, aRunnableS79S0200000_102, 300L);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIZI$10(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        boolean z = false;
        if (C641510PEf.LIZIZ(recyclerView, false) || i2 == 0) {
            return;
        }
        RecyclerView.ViewHolder viewHolderLIZ = C0PCF.LIZ(((VerticalScrollDoubleColumnProvider) asS37S0100000_10.l0).LLILZ);
        if (viewHolderLIZ != 0 && C0PCV.LIZ(viewHolderLIZ)) {
            z = true;
        }
        InterfaceC648350Pbt interfaceC648350Pbt = null;
        if (z) {
            VerticalScrollDoubleColumnProvider verticalScrollDoubleColumnProvider = (VerticalScrollDoubleColumnProvider) asS37S0100000_10.l0;
            if (viewHolderLIZ instanceof InterfaceC648350Pbt) {
                interfaceC648350Pbt = (InterfaceC648350Pbt) viewHolderLIZ;
            }
            VerticalScrollDoubleColumnProvider.LJI(verticalScrollDoubleColumnProvider, i2, interfaceC648350Pbt, true, 2);
            return;
        }
        VerticalScrollDoubleColumnProvider.LJI((VerticalScrollDoubleColumnProvider) asS37S0100000_10.l0, i2, null, true, 6);
    }

    public static final void LJJIIZI$11(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        C0P6N c0p6n = (C0P6N) asS37S0100000_10.l0;
        int i3 = c0p6n.LJIILL + i2;
        c0p6n.LJIILL = i3;
        if (i3 > ((Number) c0p6n.LJIIJ.getValue()).intValue()) {
            C0P6N c0p6n2 = (C0P6N) asS37S0100000_10.l0;
            if (!c0p6n2.LJI && !c0p6n2.LJII) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - ((C0P6N) asS37S0100000_10.l0).LJFF < ((Number) r2.LJIIIIZZ.getValue()).intValue()) {
                    return;
                }
                C0P6N c0p6n3 = (C0P6N) asS37S0100000_10.l0;
                c0p6n3.LJFF = jCurrentTimeMillis;
                c0p6n3.LJI = true;
                c0p6n3.LIZ();
            }
        }
    }

    public static final void LJJIIZI$12(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        if (C640690PBb.LIZIZ.enableScrollAsyncBind) {
            IntRange intRangeLIZIZ = ((C0PTR) asS37S0100000_10.l0).LJI.LIZIZ(recyclerView, i2);
            if (intRangeLIZIZ != null) {
                C0PTR c0ptr = (C0PTR) asS37S0100000_10.l0;
                int i3 = intRangeLIZIZ.LL;
                int i4 = intRangeLIZIZ.LLILLJJLI;
                if (i3 > i4) {
                    return;
                }
                while (true) {
                    c0ptr.LIZ(i3);
                    if (i3 != i4) {
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            C0PT6 c0pt6 = ((C0PTR) asS37S0100000_10.l0).LJI;
            if (c0pt6 instanceof C641530PEh) {
                ((C641530PEh) c0pt6).LIZ = i2;
            }
        }
    }

    public static final void LJJIIZI$13(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        Iterator it2 = ((ArrayList) ((SearchHorizontalListAssem) asS37S0100000_10.l0).LLJLIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC654580Plw) it2.next()).LIZJ(i);
        }
    }

    public static final void LJJIIZI$14(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        if (i2 >= 0 && ((AbstractC683510QrV) asS37S0100000_10.l0).isNestedFlingHandled()) {
            recyclerView.stopScroll();
        }
    }

    public static final void LJJIIZI$15(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        ((C648750PcX) asS37S0100000_10.l0).LJ = i;
    }

    public static final void LJJIIZI$2(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        Function0<Boolean> function0;
        C0PC5 c0pc5Lo = ((SearchTop1BackgroundAssem) asS37S0100000_10.l0).Lo();
        boolean z = true;
        if (c0pc5Lo != null && (function0 = c0pc5Lo.LLILLJJLI) != null && function0.invoke().booleanValue()) {
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            SearchTop1BackgroundAssem searchTop1BackgroundAssem = (SearchTop1BackgroundAssem) asS37S0100000_10.l0;
            if (iComputeVerticalScrollOffset < searchTop1BackgroundAssem.LLJJJJLIIL) {
                C661360Pws c661360Pws = searchTop1BackgroundAssem.LLJJIJIIJIL;
                if (c661360Pws != null) {
                    int i3 = -iComputeVerticalScrollOffset;
                    float f = -c661360Pws.LLJILJIL;
                    int i4 = c661360Pws.LLJILJILJ;
                    if (f <= i4 || (-i3) <= i4) {
                        c661360Pws.LLJILJIL = i3 * 1.0f;
                        c661360Pws.invalidateSelf();
                    }
                }
                C416190GTp c416190GTp = ((SearchTop1BackgroundAssem) asS37S0100000_10.l0).LLJJIJIL;
                if (c416190GTp != null) {
                    c416190GTp.LJFF = iComputeVerticalScrollOffset;
                }
            } else {
                z = false;
            }
            ((SearchTop1BackgroundAssem) asS37S0100000_10.l0).Np2(z);
        }
    }

    public static final void LJJIIZI$3(final AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        int i3;
        InterfaceC653030PjR interfaceC653030PjR;
        if (C643360PLi.LIZ()) {
            return;
        }
        if (((C652990PjN) asS37S0100000_10.l0).LJIIIIZZ && ((C0P8E) C0Q3E.LJFF().Im0().LIZJ()).LL) {
            return;
        }
        C652990PjN c652990PjN = (C652990PjN) asS37S0100000_10.l0;
        RecyclerView.LayoutManager layoutManager = c652990PjN.LIZ.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).getOrientation() == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c652990PjN.LJII.LIZ(i3);
        C652990PjN c652990PjN2 = (C652990PjN) asS37S0100000_10.l0;
        InterfaceC653030PjR interfaceC653030PjR2 = c652990PjN2.LJFF;
        if (interfaceC653030PjR2 != null) {
            c652990PjN2.LJII.getOrientation();
            interfaceC653030PjR2.LIZIZ();
        }
        C652990PjN c652990PjN3 = (C652990PjN) asS37S0100000_10.l0;
        if (c652990PjN3.LIZJ == 1 && ((interfaceC653030PjR = c652990PjN3.LJFF) == null || interfaceC653030PjR.LIZLLL())) {
            ((C652990PjN) asS37S0100000_10.l0).LIZJ();
        }
        if (((C652990PjN) asS37S0100000_10.l0).LIZJ == 0 && i2 == 0) {
            if (recyclerView.getItemAnimator() != null) {
                recyclerView.getItemAnimator().LJIJ(new InterfaceC21676919sV() { // from class: X.0PjQ
                    @Override // X.InterfaceC21676919sV
                    public final void LIZ() {
                        ((C652990PjN) this.LIZ.l0).LIZJ();
                    }
                });
            } else {
                ((C652990PjN) asS37S0100000_10.l0).LIZJ();
            }
        }
        ((C652990PjN) asS37S0100000_10.l0).LIZIZ();
        C652990PjN c652990PjN4 = (C652990PjN) asS37S0100000_10.l0;
        if (!C086I.LIZIZ(c652990PjN4.LIZIZ)) {
            for (AbstractC653010PjP abstractC653010PjP : c652990PjN4.LIZIZ) {
                if (c652990PjN4.LJII.LIZLLL(abstractC653010PjP.LIZJ())) {
                    if (!abstractC653010PjP.LIZJ) {
                        abstractC653010PjP.LIZJ = true;
                    }
                } else if (abstractC653010PjP.LIZJ) {
                    abstractC653010PjP.LIZJ = false;
                }
            }
        }
        C652990PjN c652990PjN5 = (C652990PjN) asS37S0100000_10.l0;
        if (!C086I.LIZIZ(c652990PjN5.LIZIZ)) {
            Iterator<AbstractC653010PjP> it2 = c652990PjN5.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    public static final void LJJIIZI$4(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        InterfaceC652740Piy interfaceC652740PiyLJIIIIZZ;
        SearchListPlayer searchListPlayer = (SearchListPlayer) asS37S0100000_10.l0;
        Map<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> mapLJJIZ = searchListPlayer.LJJIZ(searchListPlayer.vi());
        SearchListPlayer searchListPlayer2 = (SearchListPlayer) asS37S0100000_10.l0;
        C653210Pjj c653210Pjj = searchListPlayer2.LLILLJJLI.LJJII;
        if (c653210Pjj != null && (interfaceC652740PiyLJIIIIZZ = c653210Pjj.LJIIIIZZ(recyclerView, searchListPlayer2.LLILZIL, mapLJJIZ.keySet())) != null) {
            ((SearchListPlayer) asS37S0100000_10.l0).LJJIL(interfaceC652740PiyLJIIIIZZ, mapLJJIZ.get(interfaceC652740PiyLJIIIIZZ), true);
        }
    }

    public static final void LJJIIZI$5(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        ((SearchTakoCardAssem) asS37S0100000_10.l0).yp();
    }

    public static final void LJJIIZI$6(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        ((SearchFragment) asS37S0100000_10.l0).getClass();
    }

    public static final void LJJIIZI$7(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        C0P6H c0p6h = (C0P6H) asS37S0100000_10.l0;
        if (c0p6h.LIZLLL) {
            c0p6h.LIZJ(recyclerView);
            return;
        }
        C0P6J.LIZ.getClass();
        if (C0P6J.LIZ().group != 3 && C0P6J.LIZ().group != 6) {
            return;
        }
        ((C0P6H) asS37S0100000_10.l0).LIZJ(recyclerView);
    }

    public static final void LJJIIZI$8(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        ((C653280Pjq) asS37S0100000_10.l0).LJ = i;
    }

    public static final void LJJIIZI$9(AsS37S0100000_10 asS37S0100000_10, RecyclerView recyclerView, int i, int i2) {
        C0PQZ.LIZ.getClass();
        if (C0PQZ.LIZIZ) {
            C0P6J.LIZ.getClass();
            if (C0P6J.LIZ().group == 2 || C0P6J.LIZ().group == 5) {
                C0PQZ.LJI((AbstractC683590Qrd) asS37S0100000_10.l0, recyclerView, false);
                return;
            }
        }
        C0P6J.LIZ.getClass();
        if (C0P6J.LIZ().group != 3 && C0P6J.LIZ().group != 6) {
            return;
        }
        C0PQZ.LJI((AbstractC683590Qrd) asS37S0100000_10.l0, recyclerView, false);
    }
}
