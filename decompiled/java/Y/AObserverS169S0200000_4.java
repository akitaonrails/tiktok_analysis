package Y;

import X.C0D8F;
import X.C0D8G;
import X.C0D8Q;
import X.C0DUR;
import X.C0M11;
import X.C0PEM;
import X.C0XHP;
import X.C1250250idj;
import X.C13LP;
import X.C1623660sM0;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C345120Dfy;
import X.C786410Ut5;
import X.InterfaceC1624480sNK;
import android.animation.ObjectAnimator;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.List;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public class AObserverS169S0200000_4 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS169S0200000_4 aObserverS169S0200000_4, Object obj) {
        if (obj == C0XHP.READY) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0D8Q((SignupViewModel) aObserverS169S0200000_4.l0, (BaseActivity) aObserverS169S0200000_4.l1, null), 3);
        }
    }

    public static final void onChanged$1(AObserverS169S0200000_4 aObserverS169S0200000_4, Object obj) {
        List<? extends NewFaceStickerBean> list;
        NewFaceStickerBean newFaceStickerBean;
        MobileEffect mobileEffect;
        C19EG activity;
        ShortVideoContext shortVideoContext;
        C0D8F c0d8f = (C0D8F) obj;
        if (c0d8f != null) {
            int i = C0D8G.LIZ[c0d8f.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            CreativeDialogWrapper creativeDialogWrapper = ((EffectTemplateCategoryFragment) aObserverS169S0200000_4.l0).LLJJL;
                            if (creativeDialogWrapper != null) {
                                creativeDialogWrapper.dismiss();
                            }
                            NewFaceStickerListBean newFaceStickerListBean = ((MyEffectsViewModel) aObserverS169S0200000_4.l1).LLJLIL;
                            if (newFaceStickerListBean != null && (list = newFaceStickerListBean.mStickers) != null && (newFaceStickerBean = (NewFaceStickerBean) C13LP.LJJJLL(list)) != null) {
                                EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) aObserverS169S0200000_4.l0;
                                Effect effect = effectTemplateCategoryFragment.LLJJJJ;
                                InterfaceC1624480sNK interfaceC1624480sNK = null;
                                if ((effect instanceof MobileEffect) && (mobileEffect = (MobileEffect) effect) != null && (activity = effectTemplateCategoryFragment.getActivity()) != null) {
                                    EffectTemplateCategoryFragment effectTemplateCategoryFragment2 = (EffectTemplateCategoryFragment) aObserverS169S0200000_4.l0;
                                    effectTemplateCategoryFragment2.LLJI.put(Integer.valueOf(effectTemplateCategoryFragment2.LLJJJJLIIL), newFaceStickerBean);
                                    FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                                    EffectTemplateCategoryFragment effectTemplateCategoryFragment3 = (EffectTemplateCategoryFragment) aObserverS169S0200000_4.l0;
                                    ShortVideoContext shortVideoContext2 = effectTemplateCategoryFragment3.LL;
                                    if (shortVideoContext2 == null) {
                                        shortVideoContext = null;
                                    } else {
                                        shortVideoContext = shortVideoContext2;
                                    }
                                    int i2 = effectTemplateCategoryFragment3.LLJJJJLIIL;
                                    int i3 = effectTemplateCategoryFragment3.LLJJJJJIL;
                                    MyEffectsViewModel myEffectsViewModel = (MyEffectsViewModel) aObserverS169S0200000_4.l1;
                                    InterfaceC1624480sNK interfaceC1624480sNK2 = effectTemplateCategoryFragment3.LLJILJILJ;
                                    if (interfaceC1624480sNK2 != null) {
                                        interfaceC1624480sNK = interfaceC1624480sNK2;
                                    }
                                    C345120Dfy.LIZLLL(activity, supportFragmentManager, newFaceStickerBean, shortVideoContext, mobileEffect, i2, i3, myEffectsViewModel, C1623660sM0.LIZ(interfaceC1624480sNK).getKey());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    CreativeDialogWrapper creativeDialogWrapper2 = ((EffectTemplateCategoryFragment) aObserverS169S0200000_4.l0).LLJJL;
                    if (creativeDialogWrapper2 == null) {
                        return;
                    }
                    creativeDialogWrapper2.show();
                    return;
                }
                CreativeDialogWrapper creativeDialogWrapper3 = ((EffectTemplateCategoryFragment) aObserverS169S0200000_4.l0).LLJJL;
                if (creativeDialogWrapper3 == null) {
                    return;
                }
                creativeDialogWrapper3.dismiss();
                return;
            }
            CreativeDialogWrapper creativeDialogWrapper4 = ((EffectTemplateCategoryFragment) aObserverS169S0200000_4.l0).LLJJL;
            if (creativeDialogWrapper4 == null) {
                return;
            }
            creativeDialogWrapper4.show();
        }
    }

    public static final void onChanged$2(AObserverS169S0200000_4 aObserverS169S0200000_4, Object obj) {
        ((EffectTemplateCategoryFragment) aObserverS169S0200000_4.l0).aS().LLLLIL(((Integer) obj).intValue());
        ((TemplateEffectsViewModel) aObserverS169S0200000_4.l1).LLJJLIIIJLLLLLLLZ = false;
    }

    public static final void onChanged$3(AObserverS169S0200000_4 aObserverS169S0200000_4, Object obj) {
        Boolean bool = (Boolean) obj;
        TuxNavBar tuxNavBar = ((C0M11) aObserverS169S0200000_4.l0).LIZJ;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(new AwS370S0200000_4(bool, (C19EG) aObserverS169S0200000_4.l1, 114), "select_all");
        }
    }

    public static final void onChanged$4(AObserverS169S0200000_4 aObserverS169S0200000_4, Object obj) {
        C1250250idj c1250250idj;
        Boolean bool = (Boolean) obj;
        ((C0DUR) aObserverS169S0200000_4.l0).LLILZ.LJJ(new AwS583S0100000_4(bool, 372), "back");
        ((C0DUR) aObserverS169S0200000_4.l0).LLILZ.LJJ(new AwS583S0100000_4(bool, 373), "select_all");
        TuxNavBar tuxNavBar = ((C0DUR) aObserverS169S0200000_4.l0).LLILZ;
        if (bool.booleanValue()) {
            c1250250idj = new C1250250idj();
            c1250250idj.LIZIZ = "title";
            c1250250idj.LIZJ = "";
        } else {
            c1250250idj = new C1250250idj();
            c1250250idj.LIZIZ = "title";
            c1250250idj.LIZJ = ((StoryThoughtDraftFragment) aObserverS169S0200000_4.l1).getString(2131832435);
        }
        tuxNavBar.LJIJJ(c1250250idj);
        ((C0DUR) aObserverS169S0200000_4.l0).LLILZ.LJJ(new AwS583S0100000_4(bool, 374), "select");
        ((C0DUR) aObserverS169S0200000_4.l0).LLILZ.LJJ(new AwS583S0100000_4(bool, 375), "cancel");
    }

    public static final void onChanged$5(AObserverS169S0200000_4 aObserverS169S0200000_4, Object obj) {
        List list = (List) obj;
        ((C0DUR) aObserverS169S0200000_4.l0).LLILZ.LJJ(new AwS370S0200000_4(list, (List<String>) aObserverS169S0200000_4.l1, (StoryThoughtDraftFragment) 117), "select_all");
        if (list.isEmpty()) {
            StoryThoughtDraftFragment storyThoughtDraftFragment = (StoryThoughtDraftFragment) aObserverS169S0200000_4.l1;
            C0DUR c0dur = storyThoughtDraftFragment.LLILLJJLI;
            if (c0dur != null && c0dur.LLILLJJLI.getVisibility() != 8) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(c0dur.LLILLJJLI, "translationY", r4.getMeasuredHeight()).setDuration(200L);
                duration.addListener(new ALAdapterS1S0100000_4(c0dur, 2));
                C786410Ut5.Pd(duration);
                storyThoughtDraftFragment.LLILZ = duration;
            }
        } else {
            StoryThoughtDraftFragment storyThoughtDraftFragment2 = (StoryThoughtDraftFragment) aObserverS169S0200000_4.l1;
            C0DUR c0dur2 = storyThoughtDraftFragment2.LLILLJJLI;
            if (c0dur2 != null && c0dur2.LLILLJJLI.getVisibility() != 0) {
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(c0dur2.LLILLJJLI, "translationY", r7.getMeasuredHeight(), 0.0f).setDuration(200L);
                duration2.addListener(new ALAdapterS1S0100000_4(c0dur2, 3));
                C786410Ut5.Pd(duration2);
                storyThoughtDraftFragment2.LLILZIL = duration2;
            }
        }
        ((C0DUR) aObserverS169S0200000_4.l0).LLILZIL.setText(((StoryThoughtDraftFragment) aObserverS169S0200000_4.l1).getString(2131826971, Integer.valueOf(list.size())));
    }

    public AObserverS169S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
