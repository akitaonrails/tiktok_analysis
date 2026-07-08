package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390150FRl extends C0FFE<AddYoursStickerModel> {
    public final Context LJIILIIL;
    public final AddYoursStickerModel LJIILJJIL;
    public final FrameLayout LJIILL;
    public final InterfaceC388760FMc LJIILLIIL;
    public final C0FFO LJIIZILJ;
    public final LifecycleOwner LJIJ;
    public final C390420FSm LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public TuxTextView LJJI;

    @Override // X.C0FFE, X.C0FTJ
    public final float LJ() {
        return ((Boolean) this.LJIJJLI.getValue()).booleanValue() ? 0.5f : 0.9f;
    }

    @Override // X.C0FFE
    public final void LJJIZ() {
        Point point = new Point((this.LJIILL.getLeft() + this.LJIILL.getRight()) / 2, (this.LJIILL.getTop() + this.LJIILL.getBottom()) / 2);
        C388980FMy c388980FMy = C388980FMy.LIZ;
        Context context = this.LJIILIIL;
        View view = (View) this.LJJ.getValue();
        AddYoursStickerModel addYoursStickerModel = this.LJIILJJIL;
        c388980FMy.getClass();
        view.measure(-2, -2);
        Pair pair = new Pair(Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight()));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C388980FMy.LIZIZ = new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        int containerLeft = point.x;
        if (containerLeft <= 0) {
            containerLeft = addYoursStickerModel.getBaseStickerModel().getContainerLeft() + (addYoursStickerModel.getBaseStickerModel().getContainerWidth() / 2);
        }
        int containerTop = point.y;
        if (containerTop <= 0) {
            containerTop = addYoursStickerModel.getBaseStickerModel().getContainerTop() + (addYoursStickerModel.getBaseStickerModel().getContainerHeight() / 2);
        }
        int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(34.0f))) + (iIntValue / 2)) - containerLeft;
        AddYoursStickerModel addYoursStickerModelCopy = addYoursStickerModel.copy(BaseStickerModel.copy$default(addYoursStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, iIntValue, iIntValue2, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, (C426750GoL.LIZLLL(context) ? -1 : 1) * iLIZIZ, (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(158.0f))) + (iIntValue2 / 2)) - containerTop, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291841, 15, null), addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, true, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
        if (this.LJIILJJIL.isCandidateState()) {
            addYoursStickerModelCopy = addYoursStickerModelCopy.copy(((C0FTH) this.LJIJI.LIZIZ(C13LE.LIZ(C0FTH.class))).LIZ().LIZLLL(BaseStickerModel.copy$default(addYoursStickerModelCopy.getBaseStickerModel(), 0, 0, null, 0, 0, point.x, point.y, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -97, 15, null)), addYoursStickerModelCopy.topicID, addYoursStickerModelCopy.topicText, addYoursStickerModelCopy.topicTextFromRecommendTopicList, addYoursStickerModelCopy.visible, addYoursStickerModelCopy.editable, addYoursStickerModelCopy.clickable, addYoursStickerModelCopy.addYoursInvitees, addYoursStickerModelCopy.addYoursEnterMethod, addYoursStickerModelCopy.isOperationSet, addYoursStickerModelCopy.fontSize, addYoursStickerModelCopy.topicType, addYoursStickerModelCopy.followTopicText, addYoursStickerModelCopy.followTopicId, addYoursStickerModelCopy.needRemindUserCanChangeTopic, addYoursStickerModelCopy.isEdited, addYoursStickerModelCopy.sourceOfTrendsAddYoursInVideo, addYoursStickerModelCopy.isCandidateState, addYoursStickerModelCopy.initialRecommendTopicByContent, addYoursStickerModelCopy.videoCount, addYoursStickerModelCopy.isSelectedAddYours, addYoursStickerModelCopy.recommendAyInitialScale);
        }
        LJIIJJI(addYoursStickerModelCopy);
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return (View) this.LJJ.getValue();
    }

    public final C1664680tQA<AddYoursStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIJJ.getValue();
    }

    public final void LJJJZ() {
        ViewGroup viewGroup;
        TuxTextView tuxTextView = this.LJJI;
        if (tuxTextView == null) {
            return;
        }
        ViewParent parent = tuxTextView.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LJJI, viewGroup);
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        final C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        final C390420FSm c390420FSm = this.LJIJI;
        C0FUE c0fue = new C0FUE(c1664680tQALJJIJ, c390420FSm) { // from class: X.0FPy
            @Override // X.C0FUE
            public final boolean LJJJJ() {
                return (!this.LL.LIZ.getVisible() || ((C0FTH) this.LJIJI.LIZIZ(C13LE.LIZ(C0FTH.class))).LIZLLL().LJIILIIL().LIZ.LIZIZ || this.LJJJLL().LIZ.isCandidateState()) ? false : true;
            }
        };
        c0fue.LJJIJLIJ();
        return c0fue;
    }

    @Override // X.C0FFE
    public final void LJJJIL() {
        super.LJJJIL();
        LJJJLL().LIZ(new C2217371BqR() { // from class: X.0FRo
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((AddYoursStickerModel) obj).isCandidateState());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((AddYoursStickerModel) obj).setCandidateState(((Boolean) obj2).booleanValue());
            }
        }).LJIIIZ(this.LJIJ, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 888));
    }

    @Override // X.C0FTJ
    /* JADX INFO: renamed from: LJJJLZIJ, reason: merged with bridge method [inline-methods] */
    public final AddYoursStickerModel LJLI() {
        return LJJJLL().LIZ;
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIJ;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIIZILJ;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        AddYoursStickerModel addYoursStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof AddYoursStickerModel) && (addYoursStickerModel = (AddYoursStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS584S0100000_5(addYoursStickerModel, 890), true);
            LJJJLIIL(((AddYoursStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    @Override // X.C0FFE
    public final void LJJIIZI(AwS406S0200000_5 awS406S0200000_5) {
        if (Intrinsics.LJFF(LJJJLL().LIZ.getAddYoursEnterMethod(), "edit_page_text_entrance")) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C389740FPw(this, awS406S0200000_5, null), 3);
        } else if (LJJJLL().LIZ.isCandidateState()) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C390160FRm(this, null), 3);
        } else {
            awS406S0200000_5.invoke();
        }
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS584S0100000_5(baseStickerModel, 889), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LLD(boolean z) {
        super.LLD(z);
        LJJJZ();
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        if (!((Boolean) this.LJIJJLI.getValue()).booleanValue()) {
            AddYoursStickerModel addYoursStickerModel = LJJJLL().LIZ;
            LJIIJJI(addYoursStickerModel.copy(BaseStickerModel.copy$default(LJJIJ().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, null, null, null, false, Integer.MAX_VALUE, 15, null), addYoursStickerModel.topicID, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale));
        }
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS20S0010000_5(z, 57), true);
        LJJJLL().LIZLLL(new AwS20S0010000_5(z, 58), true);
    }

    public C390150FRl(Context context, AddYoursStickerModel addYoursStickerModel, FrameLayout frameLayout, InterfaceC388760FMc interfaceC388760FMc, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, addYoursStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = addYoursStickerModel;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = interfaceC388760FMc;
        this.LJIIZILJ = c0ffo;
        this.LJIJ = lifecycleOwner;
        this.LJIJI = c390420FSm;
        this.LJIJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1061));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1060));
        this.LJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1059));
        this.LJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1062));
        LJJJJ(frameLayout);
    }
}
