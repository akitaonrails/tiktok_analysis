package Y;

import X.AbstractC19763912Uj;
import X.C1175120ggY;
import X.C1196950hFl;
import X.C1196960hFm;
import X.C1197010hFr;
import X.C1197020hFs;
import X.C1197030hFt;
import X.C1197040hFu;
import X.C1202300hOO;
import X.C1202310hOP;
import X.C123100dR;
import X.C15438062q;
import X.C1897280zTK;
import X.C19768212Wa;
import X.C2344009Gk;
import X.C786410Ut5;
import X.InterfaceC1392640mLO;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class ALAdapterS14S0100000_18 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (10 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
            case 6:
            case 7:
            default:
                super.onAnimationEnd(animator);
                break;
            case 8:
                onAnimationEnd$5(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$6(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$7(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$8(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$9(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$10(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            default:
                super.onAnimationStart(animator);
                break;
            case 5:
                onAnimationStart$1(this, animator);
                break;
            case 6:
                onAnimationStart$2(this, animator);
                break;
            case 7:
                onAnimationStart$3(this, animator);
                break;
            case 8:
                onAnimationStart$4(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$5(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$6(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator, z);
                break;
            case 3:
                onAnimationStart$1(this, animator, z);
                break;
            default:
                super.onAnimationStart(animator, z);
                break;
        }
    }

    public ALAdapterS14S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        MyMomentsMainElementsAssem myMomentsMainElementsAssem = (MyMomentsMainElementsAssem) aLAdapterS14S0100000_18.l0;
        SmartImageView smartImageView = myMomentsMainElementsAssem.LLJJI;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 0.0f);
            C786410Ut5.td(smartImageView, 0.0f);
            smartImageView.setTranslationZ(0.0f);
        }
        myMomentsMainElementsAssem.LLLLLLJ = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS14S0100000_18.l0);
        animator.removeAllListeners();
    }

    public static final void onAnimationEnd$1(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS14S0100000_18.l0);
        animator.removeAllListeners();
    }

    public static final void onAnimationEnd$10(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        CharSequence charSequence;
        super.onAnimationEnd(animator);
        C1202300hOO c1202300hOO = (C1202300hOO) aLAdapterS14S0100000_18.l0;
        if (c1202300hOO.getCollapsed()) {
            charSequence = ((C1202300hOO) aLAdapterS14S0100000_18.l0).LLLFZ;
        } else {
            charSequence = ((C1202300hOO) aLAdapterS14S0100000_18.l0).LLLI;
        }
        c1202300hOO.setText(charSequence);
        C1202300hOO c1202300hOO2 = (C1202300hOO) aLAdapterS14S0100000_18.l0;
        ViewGroup.LayoutParams layoutParams = c1202300hOO2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            C786410Ut5.W5(c1202300hOO2, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationEnd$2(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS14S0100000_18.l0);
        animator.removeAllListeners();
    }

    public static final void onAnimationEnd$3(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS14S0100000_18.l0);
        animator.removeAllListeners();
    }

    public static final void onAnimationEnd$4(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Aweme awemeLJJLIIIJJIZ;
        String strCf;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo poiAnchorInfo;
        List<PoiSubTag> list;
        String str;
        String str2;
        String string;
        String string2;
        CharSequence text;
        PoiDataStruct poiDataStruct2;
        super.onAnimationEnd(animator);
        SettingsManager.LIZLLL().getClass();
        boolean z = false;
        if (SettingsManager.LIZ("poi_anchor_two_line_state_opt", false) && (poiDataStruct2 = ((C1196960hFm) aLAdapterS14S0100000_18.l0).LLJ) != null) {
            poiDataStruct2.setAnchorExpanded(true);
        }
        C1196960hFm c1196960hFm = (C1196960hFm) aLAdapterS14S0100000_18.l0;
        c1196960hFm.getClass();
        Map<String, String> map = PoiCoreConfig.LIZ.poiAnchorSubTagFrequencyMap;
        if (map == null || map.isEmpty()) {
            z = true;
        }
        String str3 = "";
        String strLLIIJI = null;
        if (!z && (poiDataStruct = c1196960hFm.LLJ) != null && (poiAnchorInfo = poiDataStruct.videoAnchor) != null && (list = poiAnchorInfo.subTags) != null) {
            ArrayList<PoiSubTag> arrayList = new ArrayList();
            for (PoiSubTag poiSubTag : list) {
                String str4 = poiSubTag.name;
                TuxTextView tuxTextView = c1196960hFm.LLJJJIL;
                if (tuxTextView != null && (text = tuxTextView.getText()) != null) {
                    string2 = text.toString();
                } else {
                    string2 = null;
                }
                if (Intrinsics.LJFF(str4, string2)) {
                    arrayList.add(poiSubTag);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (PoiSubTag poiSubTag2 : arrayList) {
                Map<String, String> map2 = PoiCoreConfig.LIZ.poiAnchorSubTagFrequencyMap;
                if (map2 != null) {
                    Integer num = poiSubTag2.type;
                    if (num == null || (string = num.toString()) == null) {
                        string = "";
                    }
                    str2 = map2.get(string);
                } else {
                    str2 = null;
                }
                arrayList2.add(str2);
            }
            ArrayList<String> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (C123100dR.LIZ((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            for (String str5 : arrayList3) {
                C1197010hFr c1197010hFr = C1197010hFr.LIZ;
                PoiDataStruct poiDataStruct3 = c1196960hFm.LLJ;
                if (poiDataStruct3 != null) {
                    str = poiDataStruct3.poiId;
                } else {
                    str = null;
                }
                c1197010hFr.getClass();
                if (str != null && str5 != null) {
                    C1197010hFr.LIZIZ.put(C1197010hFr.LIZ(str, str5), "1");
                }
            }
        }
        C1196960hFm c1196960hFm2 = (C1196960hFm) aLAdapterS14S0100000_18.l0;
        C1197030hFt c1197030hFt = c1196960hFm2.LLJJJJLIIL;
        if (c1197030hFt != null) {
            numValueOf = Integer.valueOf(c1197030hFt.LIZLLL);
        } else {
            numValueOf = null;
        }
        int iLIZJ = C1175120ggY.LIZJ(numValueOf);
        C1197030hFt c1197030hFt2 = c1196960hFm2.LLJJJJLIIL;
        if (c1197030hFt2 != null) {
            numValueOf2 = Integer.valueOf(c1197030hFt2.LJFF);
        } else {
            numValueOf2 = null;
        }
        int iLIZJ2 = C1175120ggY.LIZJ(numValueOf2);
        C1197030hFt c1197030hFt3 = c1196960hFm2.LLJJJJLIIL;
        if (c1197030hFt3 != null) {
            numValueOf3 = Integer.valueOf(c1197030hFt3.LJIIIIZZ);
        } else {
            numValueOf3 = null;
        }
        int iLIZJ3 = C1175120ggY.LIZJ(numValueOf3);
        C1197020hFs c1197020hFs = c1196960hFm2.LLJJL;
        if (c1197020hFs != null) {
            numValueOf4 = Integer.valueOf(c1197020hFs.LIZ);
        } else {
            numValueOf4 = null;
        }
        int iLIZJ4 = C1175120ggY.LIZJ(numValueOf4);
        C1197020hFs c1197020hFs2 = c1196960hFm2.LLJJL;
        if (c1197020hFs2 != null) {
            numValueOf5 = Integer.valueOf(c1197020hFs2.LIZJ);
        } else {
            numValueOf5 = null;
        }
        int iLIZJ5 = C1175120ggY.LIZJ(numValueOf5);
        C1197040hFu c1197040hFu = c1196960hFm2.LLJJLIIIJLLLLLLLZ;
        if (c1197040hFu != null) {
            numValueOf6 = Integer.valueOf(c1197040hFu.LIZIZ);
        } else {
            numValueOf6 = null;
        }
        c1196960hFm2.LLLFFI(iLIZJ, iLIZJ2, iLIZJ3, iLIZJ4, iLIZJ5, C1175120ggY.LIZJ(numValueOf6));
        InterfaceC1392640mLO interfaceC1392640mLO = c1196960hFm2.LLILZLL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = c1196960hFm2.LLILZLL;
        if (interfaceC1392640mLO2 != null) {
            strLLIIJI = interfaceC1392640mLO2.LLIIJI();
        }
        if (!C123100dR.LIZ(strLLIIJI) || strLLIIJI == null) {
            strLLIIJI = "video_anchor";
        }
        InterfaceC1392640mLO interfaceC1392640mLO3 = c1196960hFm2.LLILZLL;
        if (interfaceC1392640mLO3 == null || (strCf = interfaceC1392640mLO3.Cf()) == null) {
            strCf = "";
        }
        String strLJIILJJIL = c1196960hFm2.LJIILJJIL();
        if (strLJIILJJIL != null) {
            str3 = strLJIILJJIL;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c1196960hFm2.LJIILL()) {
            long j = c1196960hFm2.LLLF;
            if (j != -1 && c1196960hFm2.LLLFF != 0) {
                c2344009Gk.LIZLLL(j, "expand_duration");
            }
            if (C123100dR.LIZ(c1196960hFm2.LLL)) {
                c2344009Gk.LJFF("expand_type", c1196960hFm2.LLL);
            }
        }
        c1196960hFm2.LLILZ.LIZ(awemeLJJLIIIJJIZ, strLLIIJI, strCf, str3, c2344009Gk);
    }

    public static final void onAnimationEnd$5(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        super.onAnimationEnd(animator);
        SmartImageView smartImageView = ((C1196960hFm) aLAdapterS14S0100000_18.l0).LLJILJIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        SmartImageView smartImageView2 = ((C1196960hFm) aLAdapterS14S0100000_18.l0).LLJILJILJ;
        if (smartImageView2 != null) {
            C786410Ut5.u5(smartImageView2, 1.0f);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        CharSequence originalText;
        super.onAnimationEnd(animator);
        C1202310hOP c1202310hOP = (C1202310hOP) aLAdapterS14S0100000_18.l0;
        if (c1202310hOP.getCollapsed()) {
            originalText = ((C1202310hOP) aLAdapterS14S0100000_18.l0).LLJLLL;
        } else {
            originalText = ((C1202310hOP) aLAdapterS14S0100000_18.l0).getOriginalText();
        }
        c1202310hOP.setText(originalText);
        C1202310hOP c1202310hOP2 = (C1202310hOP) aLAdapterS14S0100000_18.l0;
        ViewGroup.LayoutParams layoutParams = c1202310hOP2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            C786410Ut5.W5(c1202310hOP2, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationEnd$7(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        AnimatorSet animatorSet = ((MyMomentsMainElementsAssem) aLAdapterS14S0100000_18.l0).LLLLLLJ;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        super.onAnimationEnd(animator);
        AbstractC19763912Uj abstractC19763912UjLLLIIIIL = ((C19768212Wa) aLAdapterS14S0100000_18.l0).LLLIIIIL();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC19763912UjLLLIIIIL);
        abstractC19763912UjLLLIIIIL.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$9(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        C1897280zTK c1897280zTK = (C1897280zTK) aLAdapterS14S0100000_18.l0;
        LinearLayout linearLayout = c1897280zTK.LIZLLL;
        if (linearLayout != null) {
            HandlerHook.viewPostDelay(linearLayout, new ARunnableS128S0100000_28(c1897280zTK, 125), 200L);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS14S0100000_18.l0);
    }

    public static final void onAnimationStart$1(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        super.onAnimationStart(animator);
        ViewGroup viewGroup = ((C1196950hFl) aLAdapterS14S0100000_18.l0).LLJJ;
        if (viewGroup != null) {
            C786410Ut5.R4(0.0f, viewGroup);
        }
        ViewGroup viewGroup2 = ((C1196950hFl) aLAdapterS14S0100000_18.l0).LLJJ;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        super.onAnimationStart(animator);
        ViewGroup viewGroup = ((C1196950hFl) aLAdapterS14S0100000_18.l0).LLJJIJIIJIL;
        if (viewGroup != null) {
            C786410Ut5.R4(0.0f, viewGroup);
        }
        ViewGroup viewGroup2 = ((C1196950hFl) aLAdapterS14S0100000_18.l0).LLJJIJIIJIL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        super.onAnimationStart(animator);
        ViewGroup viewGroup = ((C1196960hFm) aLAdapterS14S0100000_18.l0).LLJJJ;
        if (viewGroup != null) {
            C786410Ut5.R4(0.0f, viewGroup);
        }
        ViewGroup viewGroup2 = ((C1196960hFm) aLAdapterS14S0100000_18.l0).LLJJJ;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        super.onAnimationStart(animator);
        SmartImageView smartImageView = ((C1196960hFm) aLAdapterS14S0100000_18.l0).LLJILJILJ;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 0.0f);
        }
        SmartImageView smartImageView2 = ((C1196960hFm) aLAdapterS14S0100000_18.l0).LLJILJIL;
        if (smartImageView2 != null) {
            C786410Ut5.u5(smartImageView2, 1.0f);
        }
    }

    public static final void onAnimationStart$5(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        super.onAnimationStart(animator);
        ((C1202310hOP) aLAdapterS14S0100000_18.l0).LLJJLIIIJLLLLLLLZ = !r1.getCollapsed();
        C1202310hOP c1202310hOP = (C1202310hOP) aLAdapterS14S0100000_18.l0;
        c1202310hOP.setText(c1202310hOP.getOriginalText());
    }

    public static final void onAnimationStart$6(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator) {
        super.onAnimationStart(animator);
        ((C1202300hOO) aLAdapterS14S0100000_18.l0).LLJLLL = !r1.getCollapsed();
        C1202300hOO c1202300hOO = (C1202300hOO) aLAdapterS14S0100000_18.l0;
        c1202300hOO.setText(c1202300hOO.LLLI);
    }

    public static final void onAnimationStart$0(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator, boolean z) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS14S0100000_18.l0);
    }

    public static final void onAnimationStart$1(ALAdapterS14S0100000_18 aLAdapterS14S0100000_18, Animator animator, boolean z) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS14S0100000_18.l0);
    }
}
