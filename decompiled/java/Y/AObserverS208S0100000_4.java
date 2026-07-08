package Y;

import X.AbstractC329610Cw3;
import X.C098200Yq;
import X.C09C2;
import X.C0PEM;
import X.C0Z6C;
import X.C127A;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1390380mHk;
import X.C13DV;
import X.C1636790shB;
import X.C1697820uHc;
import X.C189200o6;
import X.C19EG;
import X.C1DFH;
import X.C20012313Rx;
import X.C201955140j;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C292940Be0;
import X.C318780Cea;
import X.C327810Ct9;
import X.C327820CtA;
import X.C337180DJs;
import X.C339520DSs;
import X.C339940DUi;
import X.C558180Luq;
import X.C572260McS;
import X.C631370Opb;
import X.C786410Ut5;
import X.DialogC1368760lis;
import X.InterfaceC1106030et7;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.im.saas.host.impl.live.IMLiveServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContentAssem;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.dislike.ImmersiveStoryDislikeAssem;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public class AObserverS208S0100000_4 implements Observer {
    public final int $t;
    public Object l0;

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
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
        }
    }

    public AObserverS208S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        C327810Ct9 c327810Ct9;
        C327810Ct9 c327810Ct92 = (C327810Ct9) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("contineTime--- ");
        sbLIZ.append(c327810Ct92.LIZJ);
        sbLIZ.append("  content--- ");
        sbLIZ.append(c327810Ct92.LIZ);
        C20441214yg.LIZIZ("CaptionTextWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (InterfaceC1106030et7.r6.LIZIZ().booleanValue()) {
            CaptionTextWidget captionTextWidget = (CaptionTextWidget) aObserverS208S0100000_4.l0;
            if (captionTextWidget.LLILZ && (c327810Ct9 = captionTextWidget.LLJJIJIL) != null) {
                if ((!c327810Ct9.LJ.isEmpty()) && Intrinsics.LJFF(ListProtector.get(c327810Ct9.LJ, 0), captionTextWidget.LLJJJJ)) {
                    c327810Ct9.LJ.clear();
                } else {
                    c327810Ct9.LJ.clear();
                    c327810Ct9.LJ.add(captionTextWidget.LLJJJIL);
                }
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((CaptionTextWidget) aObserverS208S0100000_4.l0);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C327820CtA((CaptionTextWidget) aObserverS208S0100000_4.l0, c327810Ct92, null), 2);
        }
    }

    public static final void onChanged$1(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        ((ViewOnAttachStateChangeListenerC20604515jv) aObserverS208S0100000_4.l0).LJIIJ();
    }

    public static final void onChanged$10(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stickerView.onTabChanged, ");
        sbLIZ.append(stickerTagChangeData);
        C1636790shB.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        CreateTabBottomBtnViewModel createTabBottomBtnViewModelSR = ((EffectTemplateCategoryFragment) aObserverS208S0100000_4.l0).SR();
        String str = stickerTagChangeData.tabKey;
        createTabBottomBtnViewModelSR.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(createTabBottomBtnViewModelSR), null, null, new C318780Cea(str, createTabBottomBtnViewModelSR, null), 3);
    }

    public static final void onChanged$11(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ameEntry Show callback, ");
            sbLIZ.append(bool);
            C201955140j.LIZLLL(c20012313Rx, "CreateTabBottomCreateBtnRvScrollListener", C2188811AlT.LIZIZ(sbLIZ));
            ((C339520DSs) aObserverS208S0100000_4.l0).LL.LIZ(bool.booleanValue());
        }
    }

    public static final void onChanged$12(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        Object c098200Yq;
        Object second;
        Pair pair = (Pair) obj;
        Object first = null;
        if (((Boolean) C292940Be0.LIZ.getValue()).booleanValue() && pair != null && (second = pair.getSecond()) != null) {
            try {
                c098200Yq = C09C2.LIZ().LJIILL(second);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
        } else {
            c098200Yq = null;
        }
        Observer observer = (Observer) aObserverS208S0100000_4.l0;
        if (pair != null) {
            first = pair.getFirst();
        }
        observer.onChanged(new Pair(first, c098200Yq));
    }

    public static final void onChanged$13(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1389890mGx c1389890mGx = new C1389890mGx((DialogC1368760lis) aObserverS208S0100000_4.l0);
            c1389890mGx.LJIIIZ(2131857166);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void onChanged$14(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        View view = ((StoryThoughtAvatarCreationFragment) aObserverS208S0100000_4.l0).getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4((StoryThoughtAvatarCreationFragment) aObserverS208S0100000_4.l0, 151));
        }
    }

    public static final void onChanged$15(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        View view = ((StoryThoughtCreationFragment) aObserverS208S0100000_4.l0).getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4((StoryThoughtCreationFragment) aObserverS208S0100000_4.l0, 152));
        }
    }

    public static final void onChanged$16(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        ((C127A) aObserverS208S0100000_4.l0).LJIILJJIL(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$17(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        List list = (List) obj;
        C339940DUi c339940DUi = ((StoryThoughtDraftFragment) aObserverS208S0100000_4.l0).LLILLL;
        if (c339940DUi != null) {
            c339940DUi.LLLI(list);
        }
    }

    public static final void onChanged$2(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        AwemeStatusViewModel awemeStatusViewModel = (AwemeStatusViewModel) aObserverS208S0100000_4.l0;
        awemeStatusViewModel.getClass();
        String userId = followStatus.getUserId();
        if (userId != null && followStatus.getFollowStatus() == 2) {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            Set<String> set = awemeStatusViewModel.LLILZ.get(userId);
            if (set != null) {
                c13dvLIZIZ.addAll(set);
            }
            Set<String> set2 = awemeStatusViewModel.LLILZ.get("");
            if (set2 != null) {
                c13dvLIZIZ.addAll(set2);
            }
            List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj2 : listLIZ) {
                Set<Long> set3 = awemeStatusViewModel.LLILZIL.get(obj2);
                if (set3 != null && !set3.isEmpty()) {
                    arrayList.addAll(set3);
                } else {
                    linkedHashSet.add(obj2);
                }
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(awemeStatusViewModel), C0PEM.LIZJ, null, new C0Z6C(arrayList, linkedHashSet, null), 2);
        }
    }

    public static final void onChanged$3(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        if (((PoiReviewsContentAssem) aObserverS208S0100000_4.l0).Go().getListItems().size() > 0 && ((PoiReviewsContentAssem) aObserverS208S0100000_4.l0).Lo().LLJJIJIL) {
            RecyclerView.LayoutManager layoutManager = ((PoiReviewsContentAssem) aObserverS208S0100000_4.l0).Go().getLayoutManager();
            if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
            }
            ((PoiReviewsContentAssem) aObserverS208S0100000_4.l0).Lo().LLJJIJIL = false;
        }
    }

    public static final void onChanged$4(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        RecUserVideoListSharedVM recUserVideoListSharedVM = (RecUserVideoListSharedVM) aObserverS208S0100000_4.l0;
        recUserVideoListSharedVM.getClass();
        if (Intrinsics.LJFF(followStatus.getUserId(), recUserVideoListSharedVM.LLILZIL.getUid())) {
            Iterator it2 = ((ArrayList) recUserVideoListSharedVM.getAwemeList()).iterator();
            while (it2.hasNext()) {
                User author = ((Aweme) it2.next()).getAuthor();
                if (author != null) {
                    author.setFollowStatus(followStatus.getFollowStatus());
                }
            }
            recUserVideoListSharedVM.LLILZIL.setFollowStatus(followStatus.getFollowStatus());
        }
    }

    public static final void onChanged$5(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        C558180Luq c558180Luq;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if (((Boolean) obj).booleanValue() && (viewOnAttachStateChangeListenerC20604515jv = (c558180Luq = (C558180Luq) aObserverS208S0100000_4.l0).LLJILLL) != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) c558180Luq.LLJLLL.getValue());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onChanged$6(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        int iIntValue;
        CharSequence charSequenceLIZIZ;
        Integer num = (Integer) obj;
        if (num.intValue() >= 240) {
            C337180DJs.LIZJ(((C572260McS) aObserverS208S0100000_4.l0).LLJILJILJ);
            C572260McS c572260McS = (C572260McS) aObserverS208S0100000_4.l0;
            TuxTextView tuxTextView = c572260McS.LLJILJILJ;
            if (tuxTextView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(num);
                sbLIZ.append("/250");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (num.intValue() <= 250) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(num);
                    sbLIZ2.append("/250");
                    charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    SpannableString spannableString = new SpannableString(strLIZIZ);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1l, c572260McS.getActivity());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = -65536;
                    }
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, a0.LJJIZ(strLIZIZ, '/', 0, false, 6), 33);
                    charSequenceLIZIZ = spannableString;
                }
                tuxTextView.setText(charSequenceLIZIZ);
                return;
            }
            return;
        }
        C337180DJs.LIZIZ(((C572260McS) aObserverS208S0100000_4.l0).LLJILJILJ);
    }

    public static final void onChanged$7(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        String authorUid;
        FollowStatus followStatus = (FollowStatus) obj;
        String userId = followStatus.getUserId();
        if (userId != null) {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryDislikeAssem) aObserverS208S0100000_4.l0)).getAweme();
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            if (Intrinsics.LJFF(userId, authorUid)) {
                int followStatus2 = followStatus.getFollowStatus();
                if (followStatus2 != 1 && followStatus2 != 2) {
                    if (followStatus2 == 0) {
                        ((ImmersiveStoryDislikeAssem) aObserverS208S0100000_4.l0).Ep().setEnabled(true);
                        return;
                    }
                    return;
                }
                ((ImmersiveStoryDislikeAssem) aObserverS208S0100000_4.l0).Ep().setEnabled(false);
            }
        }
    }

    public static final void onChanged$8(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        C1389890mGx c1389890mGx = new C1389890mGx((VideoAuthorizationActivity) aObserverS208S0100000_4.l0);
        c1389890mGx.LJIIJ(((VideoAuthorizationActivity) aObserverS208S0100000_4.l0).getString(2131849567));
        c1389890mGx.LJIIJJI();
    }

    public static final void onChanged$9(AObserverS208S0100000_4 aObserverS208S0100000_4, Object obj) {
        C19EG activity = ((EffectTemplateCategoryFragment) aObserverS208S0100000_4.l0).getActivity();
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131834217);
            C1390380mHk.LIZ(activity, 3042, creativeToastBuilder);
        }
    }

    public AObserverS208S0100000_4(AObserverS178S0200000_14 aObserverS178S0200000_14, IMLiveServiceImpl iMLiveServiceImpl, int i) {
        this.$t = i;
        this.l0 = aObserverS178S0200000_14;
    }
}
