package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS6S1300000_5;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerCreateComponent$initAddYoursStickerEditLayout$2;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FS0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FS0 extends AbstractC388880FMo<AddYoursStickerModel> {
    public final InterfaceC388760FMc LJII;
    public final C0FTH LJIIIIZZ;
    public C0FS1 LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public final C0FSF LJIIL;

    @Override // X.AbstractC388880FMo
    public final C0FEF LIZIZ() {
        return this.LJIIL;
    }

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.ADD_YOURS;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        float f;
        InterfaceC390170FRn interfaceC390170FRnLJIILIIL;
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) stickerModel;
        BaseStickerModel baseStickerModel = addYoursStickerModel.getBaseStickerModel();
        InterfaceC390170FRn interfaceC390170FRnLJIILIIL2 = this.LJII.LJIILIIL();
        if (interfaceC390170FRnLJIILIIL2 != null && interfaceC390170FRnLJIILIIL2.LJI() && (interfaceC390170FRnLJIILIIL = this.LJII.LJIILIIL()) != null && interfaceC390170FRnLJIILIIL.LIZLLL()) {
            f = 0.5f;
        } else if (addYoursStickerModel.isCandidateState()) {
            f = 0.0f;
        } else {
            f = 0.9f;
        }
        return addYoursStickerModel.copy(BaseStickerModel.copy$default(baseStickerModel, i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, 2147483646, 15, null), addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, false, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) stickerModel;
        return new C390150FRl(this.LIZ, addYoursStickerModel.copy(BaseStickerModel.copy$default(addYoursStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073741825, 15, null), addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, true, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale), this.LIZIZ, this.LJII, c0ffo, lifecycleOwner, this.LJFF);
    }

    @Override // X.AbstractC388880FMo
    public final void LJI(final C0FTJ c0ftj, C388340FKm c388340FKm, final C390370FSh c390370FSh, String str, final Function1 function1) {
        Parcelable addYoursStickerModel;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (c0ftj == null || (addYoursStickerModel = c0ftj.LJLI()) == null) {
            addYoursStickerModel = new AddYoursStickerModel(new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7681, 15, null), null, null, null, true, false, false, null, str, 0, 14.0f, 0, null, null, false, false, null, false, null, null, true, null);
        }
        AddYoursStickerModel addYoursStickerModel2 = (AddYoursStickerModel) addYoursStickerModel;
        if (C19618011pC.LIZ(str)) {
            addYoursStickerModel2.getBaseStickerModel().setStickerSource("2");
        }
        C0FS1 c0fs1 = this.LJIIIZ;
        if (c0fs1 == null) {
            this.LJIIIZ = new C0FS1(this.LIZ, this.LJFF);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.LIZJ;
            C0FS1 c0fs12 = this.LJIIIZ;
            if (c0fs12 == null) {
                c0fs12 = null;
            }
            frameLayout.addView(c0fs12, layoutParams);
            C0FS1 c0fs13 = this.LJIIIZ;
            if (c0fs13 == null) {
                c0fs13 = null;
            }
            AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 1056);
            LifecycleOwner lifecycleOwner = this.LIZLLL;
            c0fs13.getClass();
            c0fs13.LLILZ = addYoursStickerModel2.copy(BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), addYoursStickerModel2.topicID, addYoursStickerModel2.topicText, addYoursStickerModel2.topicTextFromRecommendTopicList, addYoursStickerModel2.visible, addYoursStickerModel2.editable, addYoursStickerModel2.clickable, addYoursStickerModel2.addYoursInvitees, addYoursStickerModel2.addYoursEnterMethod, addYoursStickerModel2.isOperationSet, addYoursStickerModel2.fontSize, addYoursStickerModel2.topicType, addYoursStickerModel2.followTopicText, addYoursStickerModel2.followTopicId, addYoursStickerModel2.needRemindUserCanChangeTopic, addYoursStickerModel2.isEdited, addYoursStickerModel2.sourceOfTrendsAddYoursInVideo, addYoursStickerModel2.isCandidateState, addYoursStickerModel2.initialRecommendTopicByContent, addYoursStickerModel2.videoCount, addYoursStickerModel2.isSelectedAddYours, addYoursStickerModel2.recommendAyInitialScale);
            c0fs13.setStateContainer(new C1664680tQA<>(addYoursStickerModel2.copy(BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), addYoursStickerModel2.topicID, addYoursStickerModel2.topicText, addYoursStickerModel2.topicTextFromRecommendTopicList, false, true, true, addYoursStickerModel2.addYoursInvitees, addYoursStickerModel2.addYoursEnterMethod, addYoursStickerModel2.isOperationSet, addYoursStickerModel2.fontSize, addYoursStickerModel2.topicType, addYoursStickerModel2.followTopicText, addYoursStickerModel2.followTopicId, addYoursStickerModel2.needRemindUserCanChangeTopic, addYoursStickerModel2.isEdited, addYoursStickerModel2.sourceOfTrendsAddYoursInVideo, addYoursStickerModel2.isCandidateState, addYoursStickerModel2.initialRecommendTopicByContent, addYoursStickerModel2.videoCount, addYoursStickerModel2.isSelectedAddYours, addYoursStickerModel2.recommendAyInitialScale)));
            c0fs13.LLIZ = new C1664680tQA<>(addYoursStickerModel2.copy(BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), addYoursStickerModel2.topicID, addYoursStickerModel2.topicText, addYoursStickerModel2.topicTextFromRecommendTopicList, false, false, false, addYoursStickerModel2.addYoursInvitees, addYoursStickerModel2.addYoursEnterMethod, addYoursStickerModel2.isOperationSet, addYoursStickerModel2.fontSize, addYoursStickerModel2.topicType, addYoursStickerModel2.followTopicText, addYoursStickerModel2.followTopicId, addYoursStickerModel2.needRemindUserCanChangeTopic, addYoursStickerModel2.isEdited, addYoursStickerModel2.sourceOfTrendsAddYoursInVideo, addYoursStickerModel2.isCandidateState, addYoursStickerModel2.initialRecommendTopicByContent, addYoursStickerModel2.videoCount, addYoursStickerModel2.isSelectedAddYours, addYoursStickerModel2.recommendAyInitialScale));
            c0fs13.LLJILLL = awS549S0100000_5;
            c0fs13.LLIZLLLIL = lifecycleOwner;
            C786410Ut5.Sd(R.layout.m0, C786410Ut5.ne(c0fs13.getContext()), c0fs13);
            c0fs13.LLILZIL = (ViewGroup) c0fs13.findViewById(R.id.afm);
            View viewFindViewById = c0fs13.findViewById(R.id.y1z);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = C497820Jfg.LIZJ(viewFindViewById.getContext());
            }
            c0fs13.LLJI = viewFindViewById;
            TuxTextView tuxTextView = (TuxTextView) c0fs13.findViewById(R.id.tv_sure);
            C786410Ut5.h9(tuxTextView, new ACListenerS140S0100000_5(c0fs13, 120));
            c0fs13.LLJIJIL = tuxTextView;
            c0fs13.LLJ = (FrameLayout) c0fs13.findViewById(R.id.w4v);
            C19614411oc c19614411oc = new C19614411oc(c0fs13.getContext(), c0fs13.LJIIJ());
            C1664680tQA<AddYoursStickerModel> c1664680tQA = c0fs13.LLIZ;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            LifecycleOwner lifecycleOwner2 = c0fs13.LLIZLLLIL;
            if (lifecycleOwner2 == null) {
                lifecycleOwner2 = null;
            }
            c19614411oc.LIZIZ(lifecycleOwner2, c1664680tQA);
            c0fs13.LLJILJILJ = c19614411oc;
            c0fs13.addView(c19614411oc);
            C390250FRv abilityContainer = c0fs13.getAbilityContainer();
            FrameLayout frameLayout2 = c0fs13.LLJ;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            abilityContainer.LIZLLL(new C390230FRt(frameLayout2, c0fs13.getAbilityContainer()));
            InterfaceC390170FRn interfaceC390170FRn = abilityContainer.LJI;
            if (interfaceC390170FRn != null && interfaceC390170FRn.LJI() && abilityContainer.LJI.LJ()) {
                abilityContainer.LIZLLL(new C388960FMw((C388620FLo) c0fs13.findViewById(R.id.afk), c0fs13.getAbilityContainer()));
            } else {
                abilityContainer.LIZLLL(new C0FS2((ViewGroup) c0fs13.findViewById(R.id.afl), c0fs13.getAbilityContainer()));
            }
            ViewGroup viewGroup = c0fs13.LLILZIL;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C786410Ut5.K7(viewGroup, new ACListenerS140S0100000_5(c0fs13, 119));
            LiveState<V> liveStateLIZ = c0fs13.getStateContainer().LIZ(new C2217381BqS() { // from class: X.0FSD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((AddYoursStickerModel) obj).getTopicText();
                }
            });
            LifecycleOwner lifecycleOwner3 = c0fs13.LLIZLLLIL;
            if (lifecycleOwner3 == null) {
                lifecycleOwner3 = null;
            }
            liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS584S0100000_5(c0fs13, 886));
            this.LIZLLL.getLifecycle().addObserver(new AddYoursStickerCreateComponent$initAddYoursStickerEditLayout$2(this));
            z = true;
        } else {
            z = true;
            c0fs1.LLILZ = addYoursStickerModel2.copy(BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null), addYoursStickerModel2.topicID, addYoursStickerModel2.topicText, addYoursStickerModel2.topicTextFromRecommendTopicList, addYoursStickerModel2.visible, addYoursStickerModel2.editable, addYoursStickerModel2.clickable, addYoursStickerModel2.addYoursInvitees, addYoursStickerModel2.addYoursEnterMethod, addYoursStickerModel2.isOperationSet, addYoursStickerModel2.fontSize, addYoursStickerModel2.topicType, addYoursStickerModel2.followTopicText, addYoursStickerModel2.followTopicId, addYoursStickerModel2.needRemindUserCanChangeTopic, addYoursStickerModel2.isEdited, addYoursStickerModel2.sourceOfTrendsAddYoursInVideo, addYoursStickerModel2.isCandidateState, addYoursStickerModel2.initialRecommendTopicByContent, addYoursStickerModel2.videoCount, addYoursStickerModel2.isSelectedAddYours, addYoursStickerModel2.recommendAyInitialScale);
            c0fs1.getStateContainer().LIZLLL(new AwS584S0100000_5(addYoursStickerModel2, 891), true);
            C1664680tQA<AddYoursStickerModel> c1664680tQA2 = c0fs1.LLIZ;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            c1664680tQA2.LIZLLL(new AwS584S0100000_5(addYoursStickerModel2, 892), true);
            C390230FRt c390230FRt = (C390230FRt) c0fs1.getAbilityContainer().LIZJ(C13LE.LIZ(C390230FRt.class));
            if (c390230FRt != null) {
                c390230FRt.LIZJ.LJ.LIZLLL(new AwS3S0000001_5(1.0f, 18), true);
                c390230FRt.LJIIJ();
            }
        }
        if (c390370FSh != null) {
            c390370FSh.LIZIZ(addYoursStickerModel2);
        }
        C0FS1 c0fs14 = this.LJIIIZ;
        if (c0fs14 == null) {
            c0fs14 = null;
        }
        c0fs14.setStickerEditListener(new C0FSC() { // from class: X.0FS3
            @Override // X.C0FSC
            public final void LIZIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FSC
            public final void LJ() {
                this.LJIIIIZZ.LJFF().LJJIJIL();
            }

            @Override // X.C0FSC
            public final void LJFF() {
                this.LJIIIIZZ.LJFF().LJJIJIL();
            }

            @Override // X.C0FSC
            public final void LIZJ() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0FS0 c0fs0 = this;
                if (jCurrentTimeMillis - c0fs0.LJIIJ > 3000) {
                    c0fs0.LJIIJ = System.currentTimeMillis();
                    C0FSY c0fsyLJFF = this.LJIIIIZZ.LJFF();
                    String string = this.LIZ.getString(2131825073);
                    C0FS1 c0fs15 = this.LJIIIZ;
                    if (c0fs15 == null) {
                        c0fs15 = null;
                    }
                    C19614411oc addYoursStickerView = c0fs15.getAddYoursStickerView();
                    C0FSX c0fsx = C0FSX.BOTTOM;
                    c0fsyLJFF.getClass();
                    HandlerHook.viewPost(addYoursStickerView, new ARunnableS6S1300000_5(addYoursStickerView, c0fsyLJFF, c0fsx, string, 1));
                }
            }

            @Override // X.C0FSC
            public final void LIZLLL(boolean z2) {
                C0FTJ<StickerModel> c0ftj2 = c0ftj;
                if (c0ftj2 != null) {
                    c0ftj2.setVisible(false);
                }
            }

            @Override // X.C0FSC
            public final void LIZ(StickerModel stickerModel, boolean z2) {
                AddYoursStickerModel addYoursStickerModel3;
                int iIntValue;
                C0FSC c0fsc = c390370FSh;
                if (c0fsc != null) {
                    c0fsc.LIZ(stickerModel, false);
                }
                C0FS1 c0fs15 = null;
                if ((stickerModel instanceof AddYoursStickerModel) && (addYoursStickerModel3 = (AddYoursStickerModel) stickerModel) != null) {
                    C0FS0 c0fs0 = this;
                    Function1<StickerModel, Unit> function12 = function1;
                    AddYoursStickerModel addYoursStickerModel4 = (AddYoursStickerModel) stickerModel;
                    if (addYoursStickerModel4.isNotEmptyModel() && !Intrinsics.LJFF(addYoursStickerModel4.getAddYoursEnterMethod(), "edit_page_text_entrance")) {
                        c0fs0.LJIIJJI = true;
                    }
                    function12.invoke(addYoursStickerModel3);
                    InterfaceC390170FRn interfaceC390170FRnLJIILIIL = c0fs0.LJII.LJIILIIL();
                    if (interfaceC390170FRnLJIILIIL != null) {
                        String topicText = addYoursStickerModel3.getTopicText();
                        String str2 = "";
                        if (topicText == null) {
                            topicText = "";
                        }
                        C0FS1 c0fs16 = c0fs0.LJIIIZ;
                        if (c0fs16 != null) {
                            c0fs15 = c0fs16;
                        }
                        String value = c0fs15.getInputMode().getValue();
                        boolean z3 = C0FS1.LLJJIJIIJIL;
                        String addYoursEnterMethod = addYoursStickerModel3.getAddYoursEnterMethod();
                        if (addYoursEnterMethod != null) {
                            str2 = addYoursEnterMethod;
                        }
                        Integer numIsOperationSet = addYoursStickerModel3.isOperationSet();
                        if (numIsOperationSet != null) {
                            iIntValue = numIsOperationSet.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        interfaceC390170FRnLJIILIIL.LJIIJ(topicText, value, z3, str2, iIntValue, addYoursStickerModel3);
                    }
                }
            }
        });
        C0FS1 c0fs15 = this.LJIIIZ;
        if (c0fs15 == null) {
            c0fs15 = null;
        }
        c0fs15.getClass();
        int visibility = c0fs15.getVisibility();
        c0fs15.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0fs15);
        AddYoursStickerModel addYoursStickerModel3 = c0fs15.LLILZ;
        if (addYoursStickerModel3 == null) {
            addYoursStickerModel3 = null;
        }
        String topicText = addYoursStickerModel3.getTopicText();
        if (topicText == null || topicText.length() == 0) {
            C19614411oc addYoursStickerView = c0fs15.getAddYoursStickerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(addYoursStickerView);
            addYoursStickerView.setScaleX(0.0f);
            C19614411oc addYoursStickerView2 = c0fs15.getAddYoursStickerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(addYoursStickerView2);
            addYoursStickerView2.setScaleY(0.0f);
            c0fs15.getStateContainer().LIZLLL(AFwS234S0000000_5.get$arr$(425), z);
            C1664680tQA<AddYoursStickerModel> c1664680tQA3 = c0fs15.LLIZ;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(AFwS234S0000000_5.get$arr$(426), z);
        }
        c0fs15.getAbilityContainer().LIZIZ();
        HandlerHook.viewPostDelay(c0fs15, new ARunnableS105S0100000_5(c0fs15, 88), 300L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0FSF] */
    public C0FS0(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        InterfaceC390170FRn interfaceC390170FRnLJIILIIL;
        AddYoursStickerTopicRepo addYoursStickerTopicRepoLJII;
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        this.LJII = interfaceC388760FMc;
        this.LJIIIIZZ = c0fth;
        this.LJIIL = new InterfaceC388500FLc() { // from class: X.0FSF
            @Override // X.C0FEF
            public final boolean onBackPressed() {
                return false;
            }

            @Override // X.InterfaceC388500FLc
            public final boolean LLIIII() {
                return this.LL.LJIIJJI;
            }
        };
        if (C0FS1.LLJJIJIIJIL && (interfaceC390170FRnLJIILIIL = interfaceC388760FMc.LJIILIIL()) != null && (addYoursStickerTopicRepoLJII = interfaceC390170FRnLJIILIIL.LJII()) != null) {
            addYoursStickerTopicRepoLJII.LJFF(AFwS234S0000000_5.get$arr$(101));
        }
    }
}
