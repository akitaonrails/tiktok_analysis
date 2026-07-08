package X;

import Y.AAListenerS316S0100000_5;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS21S0100001_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS6S0002000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FS1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FS1 extends AbstractC390720FTq {
    public static boolean LLJJIJIIJIL;
    public AddYoursStickerModel LLILZ;
    public ViewGroup LLILZIL;
    public C1664680tQA<AddYoursStickerModel> LLILZLL;
    public C1664680tQA<AddYoursStickerModel> LLIZ;
    public LifecycleOwner LLIZLLLIL;
    public FrameLayout LLJ;
    public View LLJI;
    public TuxTextView LLJIJIL;
    public final C01GW LLJILJIL;
    public C19614411oc LLJILJILJ;
    public Function0<? extends Point> LLJILLL;
    public C0FSC LLJJ;
    public final C01GW LLJJI;
    public final long LLJJIII;
    public final C01GW LLJJIJI;

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    public final void setInputMode(C0FS5 c0fs5) {
    }

    static {
        Keva repo = Keva.getRepo("add_yours_sticker_edit");
        boolean z = true;
        if (repo.getBoolean("is_first", true)) {
            repo.storeBoolean("is_first", false);
        } else {
            z = false;
        }
        LLJJIJIIJIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0142  */
    @Override // X.AbstractC390720FTq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FS1.LIZIZ():void");
    }

    @Override // X.AbstractC390720FTq
    public final void LIZJ() {
        C0FSC c0fsc = this.LLJJ;
        if (c0fsc != null) {
            c0fsc.LJ();
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() throws Throwable {
        C1664680tQA<AddYoursStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS234S0000000_5.get$arr$(107), true);
        getStateContainer().LIZLLL(AFwS234S0000000_5.get$arr$(108), true);
        getAddYoursStickerView().getContentEditText().requestFocus();
        C390290FRz contentEditText = getAddYoursStickerView().getContentEditText();
        Editable editableB = C2204961BRm.B(getAddYoursStickerView().getContentEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUeBwlhe8kYnXMyYIOGO4ZwZhhUKUxKpvjuUACQTBI8Qw==", null));
        contentEditText.setSelection(editableB != null ? editableB.length() : 0);
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJJ;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    public final C390250FRv getAbilityContainer() {
        return (C390250FRv) this.LLJJIJI.getValue();
    }

    public final C19614411oc getAddYoursStickerView() {
        return (C19614411oc) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        ViewGroup viewGroup = this.LLILZIL;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    public final InterfaceC388760FMc getEditProvideStickerService() {
        return (InterfaceC388760FMc) this.LLJJI.getValue();
    }

    public final C1664680tQA<AddYoursStickerModel> getStateContainer() {
        C1664680tQA<AddYoursStickerModel> c1664680tQA = this.LLILZLL;
        if (c1664680tQA != null) {
            return c1664680tQA;
        }
        return null;
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int top = frameLayout.getTop();
        return ((top + (this.LLJ != null ? r0 : null).getBottom()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        AddYoursStickerModel addYoursStickerModel = this.LLILZ;
        if (addYoursStickerModel == null) {
            addYoursStickerModel = null;
        }
        float centerY = addYoursStickerModel.getBaseStickerModel().getCenterY();
        AddYoursStickerModel addYoursStickerModel2 = this.LLILZ;
        if (addYoursStickerModel2 == null) {
            addYoursStickerModel2 = null;
        }
        return ((centerY + addYoursStickerModel2.getBaseStickerModel().getTranslateY()) + (this.LLILZ != null ? r0 : null).getBaseStickerModel().getContainerTop()) - ((getTop() + getBottom()) / 2);
    }

    public final C390690FTn LJIIJ() {
        InterfaceC390170FRn interfaceC390170FRnLJIILIIL;
        InterfaceC390170FRn interfaceC390170FRnLJIILIIL2 = getEditProvideStickerService().LJIILIIL();
        int iLJIIIIZZ = interfaceC390170FRnLJIILIIL2 != null ? interfaceC390170FRnLJIILIIL2.LJIIIIZZ() : 2131825072;
        InterfaceC390170FRn interfaceC390170FRnLJIILIIL3 = getEditProvideStickerService().LJIILIIL();
        AwS430S0200000_29 awS430S0200000_29 = null;
        boolean z = false;
        return new C390690FTn((interfaceC390170FRnLJIILIIL3 == null || !interfaceC390170FRnLJIILIIL3.LJI() || ((interfaceC390170FRnLJIILIIL = getEditProvideStickerService().LJIILIIL()) != null && interfaceC390170FRnLJIILIIL.LJ())) ? R.raw.icon_camera_plus_fill : R.raw.icon_two_person_large_fill, iLJIIIIZZ, awS430S0200000_29, awS430S0200000_29, 0.0f, z, z, z, 16776671);
    }

    public final void LJIIJJI() {
        if (Intrinsics.LJFF(getStateContainer().LIZ.getTopicText(), String.valueOf(C2204961BRm.B(getAddYoursStickerView().getContentEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUeBwlhe8kYnXMyYIOGO4ZwZhhUKUxKpvjuUACQTBI8Qw==", null))))) {
            return;
        }
        getStateContainer().LIZLLL(new AwS584S0100000_5(this, 156), true);
        getAbilityContainer().LJIIJ = C0FS5.MANUAL;
    }

    public final C0FS5 getInputMode() {
        return getAbilityContainer().LJIIJ;
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJJ;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZ(EditText editText) {
        LJIIJJI();
        C1664680tQA<AddYoursStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS584S0100000_5(this, 154), true);
        super.LIZ(editText);
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        ViewGroup viewGroup = this.LLILZIL;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        ViewGroup viewGroup3 = this.LLILZIL;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        C786410Ut5.X5(marginLayoutParams, viewGroup2);
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        FrameLayout frameLayout = this.LLJ;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        FrameLayout frameLayout3 = this.LLJ;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        LIZLLL(i);
        AddYoursStickerModel addYoursStickerModel = this.LLILZ;
        C1664680tQA<AddYoursStickerModel> c1664680tQA = null;
        if (addYoursStickerModel == null) {
            addYoursStickerModel = null;
        }
        String topicText = addYoursStickerModel.getTopicText();
        if (topicText != null && topicText.length() != 0) {
            float stickerInitTranslationY = getStickerInitTranslationY();
            C19614411oc c19614411oc = this.LLJILJILJ;
            if (c19614411oc == null) {
                c19614411oc = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19614411oc);
            c19614411oc.setTranslationY(stickerInitTranslationY);
            C1664680tQA<AddYoursStickerModel> c1664680tQA2 = this.LLIZ;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            BaseStickerModel baseStickerModel = c1664680tQA2.LIZ.getBaseStickerModel();
            C1664680tQA<AddYoursStickerModel> c1664680tQA3 = this.LLIZ;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(new AwS21S0100001_5(baseStickerModel, stickerInitTranslationY, 0), true);
            C1664680tQA<AddYoursStickerModel> c1664680tQA4 = this.LLIZ;
            if (c1664680tQA4 == null) {
                c1664680tQA4 = null;
            }
            c1664680tQA4.LIZLLL(AFwS234S0000000_5.get$arr$(427), true);
            getStateContainer().LIZLLL(AFwS234S0000000_5.get$arr$(428), true);
            setAnimDuration(this.LLJJIII);
            C19614411oc c19614411oc2 = this.LLJILJILJ;
            if (c19614411oc2 == null) {
                c19614411oc2 = null;
            }
            C1664680tQA<AddYoursStickerModel> c1664680tQA5 = this.LLIZ;
            if (c1664680tQA5 != null) {
                c1664680tQA = c1664680tQA5;
            }
            LJIIIZ(c19614411oc2, c1664680tQA.LIZ.getBaseStickerModel(), BaseStickerModel.copy$default(getStateContainer().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null));
            return;
        }
        C19614411oc addYoursStickerView = getAddYoursStickerView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(addYoursStickerView);
        addYoursStickerView.setScaleX(1.0f);
        C19614411oc addYoursStickerView2 = getAddYoursStickerView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(addYoursStickerView2);
        addYoursStickerView2.setScaleY(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(this.LLJJIII);
        objectAnimatorOfFloat.addListener(new AAListenerS316S0100000_5(this, 3));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        int i2;
        float scale;
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        super.LJZI(i);
        if (!Intrinsics.LJFF(getAbilityContainer().LJIIIIZZ, getStateContainer().LIZ.getTopicText())) {
            getStateContainer().LIZLLL(AFwS234S0000000_5.get$arr$(102), true);
        }
        C1664680tQA<AddYoursStickerModel> c1664680tQA = this.LLIZ;
        C1664680tQA<AddYoursStickerModel> c1664680tQA2 = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS584S0100000_5(this, 155), true);
        getStateContainer().LIZLLL(AFwS234S0000000_5.get$arr$(103), true);
        AddYoursStickerModel addYoursStickerModel = this.LLILZ;
        if (addYoursStickerModel == null) {
            addYoursStickerModel = null;
        }
        String topicText = addYoursStickerModel.getTopicText();
        if (topicText == null || topicText.length() == 0) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(34.0f))) + (getAddYoursStickerView().getWidth() / 2);
            Function0<? extends Point> function0 = this.LLJILLL;
            if (function0 == null) {
                function0 = null;
            }
            int i3 = iLIZIZ - function0.invoke().x;
            if (C426750GoL.LIZLLL(getContext())) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            int i4 = i3 * i2;
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(158.0f))) + (getAddYoursStickerView().getHeight() / 2);
            Function0<? extends Point> function02 = this.LLJILLL;
            if (function02 == null) {
                function02 = null;
            }
            int i5 = iLIZIZ2 - function02.invoke().y;
            C1664680tQA<AddYoursStickerModel> c1664680tQA3 = this.LLIZ;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(new AwS6S0002000_5(i4, i5, 1), true);
        }
        String topicText2 = getStateContainer().LIZ.getTopicText();
        if (topicText2 == null || topicText2.length() == 0) {
            C1664680tQA<AddYoursStickerModel> c1664680tQA4 = this.LLIZ;
            if (c1664680tQA4 == null) {
                c1664680tQA4 = null;
            }
            c1664680tQA4.LIZLLL(AFwS234S0000000_5.get$arr$(104), true);
        }
        AddYoursStickerModel addYoursStickerModel2 = this.LLILZ;
        if (addYoursStickerModel2 == null) {
            addYoursStickerModel2 = null;
        }
        Float recommendAyInitialScale = addYoursStickerModel2.getRecommendAyInitialScale();
        if (recommendAyInitialScale != null) {
            scale = recommendAyInitialScale.floatValue();
        } else {
            AddYoursStickerModel addYoursStickerModel3 = this.LLILZ;
            if (addYoursStickerModel3 == null) {
                addYoursStickerModel3 = null;
            }
            scale = addYoursStickerModel3.getBaseStickerModel().getScale();
        }
        C19614411oc c19614411oc = this.LLJILJILJ;
        if (c19614411oc == null) {
            c19614411oc = null;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(getStateContainer().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null);
        C1664680tQA<AddYoursStickerModel> c1664680tQA5 = this.LLIZ;
        if (c1664680tQA5 != null) {
            c1664680tQA2 = c1664680tQA5;
        }
        LJIIIIZZ(c19614411oc, baseStickerModelCopy$default, BaseStickerModel.copy$default(c1664680tQA2.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, scale, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
        getAbilityContainer().LIZ();
    }

    public final void setStateContainer(C1664680tQA<AddYoursStickerModel> c1664680tQA) {
        this.LLILZLL = c1664680tQA;
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJJ = c0fsc;
    }

    public C0FS1(Context context, C390420FSm c390420FSm) {
        super(context, null, 0);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS406S0200000_5(this, context, 101));
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1058));
        this.LLJJIII = 300L;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS406S0200000_5(this, c390420FSm, 22));
    }
}
