package X;

import Y.ACListenerS140S0100000_5;
import Y.AObjectS240S0100000_5;
import Y.ATListenerS439S0100000_5;
import Y.AUListenerS55S0201000_5;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385880FBa extends AbstractC1664490tPr<C385430F9h, C385590F9x> {
    public static final int LLLF;
    public C385910FBd LLJJJIL;
    public C0FAH LLJJJJ;
    public InterfaceC385890FBb LLJJJJJIL;
    public InterfaceC385950FBh LLJJJJLIIL;
    public InterfaceC385960FBi LLJJL;
    public InterfaceC385920FBe LLJJLIIIJLLLLLLLZ;
    public InterfaceC385940FBg LLJL;
    public InterfaceC386130FBz LLJLIL;
    public C0EOZ LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public String LLJLLL;
    public final TextPaint LLJZ = new TextPaint();
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 664));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(182));

    public final C0FGR LLLLLL() {
        return (C0FGR) this.LLL.getValue();
    }

    public final void LLLLLLJ() {
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view = this.mView;
        View viewFindViewById2 = view != null ? view.findViewById(R.id.cev) : null;
        if (viewFindViewById2 != null && (layoutParams2 = viewFindViewById2.getLayoutParams()) != null) {
            C385910FBd c385910FBd = this.LLJJJIL;
            layoutParams2.height = c385910FBd != null ? c385910FBd.LIZ() : 0;
        }
        View view2 = this.mView;
        if (view2 != null) {
            int measuredHeight = view2.getMeasuredHeight();
            View view3 = this.mView;
            if (view3 == null || (viewFindViewById = view3.findViewById(R.id.rre)) == null || (layoutParams = viewFindViewById.getLayoutParams()) == null) {
                return;
            }
            C385910FBd c385910FBd2 = this.LLJJJIL;
            layoutParams.height = measuredHeight - (c385910FBd2 != null ? c385910FBd2.LIZ() : 0);
        }
    }

    public final void LLLLLLLLL() {
        C385910FBd c385910FBd = this.LLJJJIL;
        if (c385910FBd != null) {
            int iLIZIZ = c385910FBd.LIZIZ();
            InterfaceC385950FBh interfaceC385950FBh = this.LLJJJJLIIL;
            if (interfaceC385950FBh != null) {
                interfaceC385950FBh.V0(iLIZIZ);
            }
            InterfaceC385960FBi interfaceC385960FBi = this.LLJJL;
            if (interfaceC385960FBi != null) {
                interfaceC385960FBi.V0(iLIZIZ);
            }
            InterfaceC385920FBe interfaceC385920FBe = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC385920FBe != null) {
                interfaceC385920FBe.V0(iLIZIZ);
            }
        }
    }

    static {
        LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C293810BfP.LIZ() ? 40 : 37)));
    }

    public final void LLLLLLIL(C0FAK c0fak) {
        String string;
        if (c0fak == null || (string = c0fak.toString()) == null) {
            string = this.LLJLLL;
        }
        this.LLJLLL = string;
        if (c0fak != null) {
            this.LLJLLL = String.valueOf(c0fak);
        }
        String string2 = this.LLJLLL;
        if (string2 == null) {
            string2 = C0FAK.CLICK_ICON.toString();
        }
        LLLLLL().LJJIJIIJI(string2);
        this.LLJLLL = null;
    }

    public final void LLLLLLL(boolean z) {
        View viewFindViewById;
        int i;
        View view = this.mView;
        if (view != null && (viewFindViewById = view.findViewById(R.id.grz)) != null) {
            if (z) {
                i = LLLF;
            } else {
                i = -2;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null && layoutParams.height == i) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = i;
            }
            viewFindViewById.requestLayout();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        C385670FAf<Boolean> c385670FAfDU0;
        C385670FAf<EnumC371580EhY> c385670FAfLLL;
        C385670FAf<Boolean> c385670FAfSM;
        C385670FAf<C386100FBw> c385670FAfRf;
        C385670FAf<C385490F9n> c385670FAfG31;
        View viewFindViewById;
        FrameLayout frameLayout;
        super.onActivityCreated(bundle);
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ == null || (videoPublishEditModel = editModelProviderLIZIZ.getEditModel()) == null) {
            videoPublishEditModel = new VideoPublishEditModel();
        }
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(299));
        C1664590tQ1.LIZLLL(this, "EPTextEditPanelScene", false, new AwS584S0100000_5(this, 593), 2);
        C1664600tQ2.LIZ(this, "EPTextEditPanelScene", new AwS371S0200000_5(videoPublishEditModel, this, 123));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLJJJJ = (C0FAH) c1drg.LJIIL(null, C0FAH.class);
            this.LLJJJJJIL = (InterfaceC385890FBb) c1drg.LJIIL(null, InterfaceC385890FBb.class);
            this.LLJJJJLIIL = (InterfaceC385950FBh) c1drg.LJIIL(null, InterfaceC385950FBh.class);
            this.LLJJL = (InterfaceC385960FBi) c1drg.LJIIL(null, InterfaceC385960FBi.class);
            this.LLJJLIIIJLLLLLLLZ = (InterfaceC385920FBe) c1drg.LJIIL(null, InterfaceC385920FBe.class);
            this.LLJL = (InterfaceC385940FBg) c1drg.LJIIL(null, InterfaceC385940FBg.class);
            this.LLJLIL = (InterfaceC386130FBz) c1drg.LJIIL(null, InterfaceC386130FBz.class);
            this.LLJLILLLLZIIL = (C0EOZ) c1drg.LJIIL(null, C0EOZ.class);
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F9q
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LIZIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 583));
            View view = this.mView;
            if (view != null && (frameLayout = (FrameLayout) view.findViewById(R.id.cev)) != null) {
                C786410Ut5.O7(frameLayout, new ACListenerS140S0100000_5(this, 77));
            }
            View view2 = this.mView;
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.rre)) != null) {
                viewFindViewById.setOnTouchListener(new ATListenerS439S0100000_5(this, 4));
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F9t
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LIZJ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 592));
            C0FAH c0fah = this.LLJJJJ;
            if (c0fah != null && (c385670FAfG31 = c0fah.g31()) != null) {
                c385670FAfG31.LIZ(this, new AObjectS240S0100000_5(this, 90));
            }
            InterfaceC385890FBb interfaceC385890FBb = this.LLJJJJJIL;
            if (interfaceC385890FBb != null && (c385670FAfRf = interfaceC385890FBb.Rf()) != null) {
                c385670FAfRf.LIZ(this, new AObjectS240S0100000_5(this, 87));
            }
            InterfaceC385890FBb interfaceC385890FBb2 = this.LLJJJJJIL;
            if (interfaceC385890FBb2 != null && (c385670FAfSM = interfaceC385890FBb2.SM()) != null) {
                c385670FAfSM.LIZ(this, new AObjectS240S0100000_5(this, 88));
            }
            InterfaceC385890FBb interfaceC385890FBb3 = this.LLJJJJJIL;
            if (interfaceC385890FBb3 != null) {
                interfaceC385890FBb3.GX1(new InterfaceC19682311zZ() { // from class: X.0FA8
                    @Override // X.InterfaceC19682311zZ
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC19682311zZ
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC19682311zZ
                    public final void LIZ(Editable editable, boolean z) {
                        String strValueOf;
                        if (z) {
                            return;
                        }
                        TextStickerModel textStickerModel = this.LIZ.LLLLILI().LIZ.LIZ;
                        this.LIZ.LLLLIL().LJIILIIL.invoke();
                        if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                            strValueOf = this.LIZ.LLLLLJLJLL(String.valueOf(editable), textStickerModel.getFontModel());
                        } else {
                            strValueOf = String.valueOf(editable);
                        }
                        this.LIZ.LLLLIL().LIZ.invoke(String.valueOf(editable), strValueOf);
                    }
                });
            }
            InterfaceC385890FBb interfaceC385890FBb4 = this.LLJJJJJIL;
            if (interfaceC385890FBb4 != null) {
                interfaceC385890FBb4.j01(requireSceneContext().getString(2131821598));
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBm
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 587));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FBs
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LJIIIIZZ;
                }
            }, new AwS584S0100000_5(this, 588));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FBt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LJIIIZ;
                }
            }, new AwS584S0100000_5(this, 590));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBr
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LIZLLL;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 586));
            InterfaceC385920FBe interfaceC385920FBe = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC385920FBe != null) {
                interfaceC385920FBe.Pw(new C0FHQ() { // from class: X.0FA7
                    @Override // X.C0FHQ
                    public final void LIZ(TextFontModel textFontModel, int i) {
                        String textStrWithLineBreak;
                        TextStickerModel textStickerModel = this.LIZ.LLLLILI().LIZ.LIZ;
                        if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                            textStrWithLineBreak = this.LIZ.LLLLLJLJLL(textStickerModel.getTextStr(), textFontModel);
                        } else {
                            textStrWithLineBreak = textStickerModel.getTextStrWithLineBreak();
                        }
                        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(this.LIZ.LLLLILI().LIZ.LIZ, null, null, null, null, textStrWithLineBreak, i, 0, 0, 0.0f, textFontModel, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -561, 65535, null);
                        C385050F7v.LJJIIJZLJL(textStickerModelCopy$default, true);
                        this.LIZ.LLLLIL().LIZIZ.invoke(textFontModel, Integer.valueOf(i), textStrWithLineBreak, textStickerModelCopy$default.getCaptionTemplateModel());
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBn
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 589));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0F9r
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LJIIJ;
                }
            }, new AwS584S0100000_5(this, 591));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBo
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LJI;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 572));
            InterfaceC385950FBh interfaceC385950FBh = this.LLJJJJLIIL;
            if (interfaceC385950FBh != null) {
                interfaceC385950FBh.uP0(new InterfaceC387360FGs() { // from class: X.0F9y
                    @Override // X.InterfaceC387360FGs
                    public final void LIZ() {
                        this.LIZ.LLLLIL().LIZLLL.invoke(TextMotionModel.LIZ(this.LIZ.LLLLILI().LIZ.LIZ.getTextMotionModel(), null, 0.0f, 0, null, null, 2, false, 831), CaptionTemplateModel.LIZ(this.LIZ.LLLLILI().LIZ.LIZ.getCaptionTemplateModel(), false, null, null, false, false, false, 15));
                        this.LIZ.LLLLIL().LJIILLIIL.invoke();
                    }

                    @Override // X.InterfaceC387360FGs
                    public final void LIZIZ(Effect effect) {
                        this.LIZ.LLLLIL().LJIILJJIL.invoke(effect);
                    }

                    @Override // X.InterfaceC387360FGs
                    public final void LIZJ(TextMotionModel textMotionModel) {
                        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(this.LIZ.LLLLILI().LIZ.LIZ, null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, textMotionModel, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -268435457, 65535, null);
                        C385050F7v.LJJIIJZLJL(textStickerModelCopy$default, true);
                        this.LIZ.LLLLIL().LIZLLL.invoke(textMotionModel, textStickerModelCopy$default.getCaptionTemplateModel());
                        this.LIZ.LLLLIL().LJIILL.invoke();
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 573));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LJFF;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 575));
            InterfaceC385960FBi interfaceC385960FBi = this.LLJJL;
            if (interfaceC385960FBi != null) {
                interfaceC385960FBi.iy0(new InterfaceC387190FGb() { // from class: X.0FBc
                    @Override // X.InterfaceC387190FGb
                    public final void LIZIZ(boolean z) {
                        int i;
                        if (this.LIZ.LLLLILI().LIZ.LIZ.getFontModel().enableMaskBlurLightColor) {
                            i = 5;
                        } else {
                            i = 1;
                        }
                        this.LIZ.LLLLIL().LJ.invoke(null, -1, Integer.valueOf(i), null, Boolean.valueOf(z), this.LIZ.LLJJLIIIJLLLLLLLZ);
                    }

                    @Override // X.InterfaceC387190FGb
                    public final void LIZ(TextStyleModel textStyleModel, int i, Effect effect, boolean z) {
                        this.LIZ.LLLLIL().LJ.invoke(textStyleModel, Integer.valueOf(i), 1, effect, Boolean.valueOf(z), this.LIZ.LLJJLIIIJLLLLLLLZ);
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 582));
            InterfaceC385940FBg interfaceC385940FBg = this.LLJL;
            if (interfaceC385940FBg != null) {
                interfaceC385940FBg.X62(new InterfaceC386120FBy() { // from class: X.0FBf
                    @Override // X.InterfaceC386120FBy
                    public final void LIZ(int i) {
                        this.LIZ.LLLLIL().LIZJ.invoke(Integer.valueOf(i));
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LJ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 574));
            InterfaceC385940FBg interfaceC385940FBg2 = this.LLJL;
            if (interfaceC385940FBg2 != null && (c385670FAfLLL = interfaceC385940FBg2.LLL()) != null) {
                c385670FAfLLL.LIZ(this, new AObjectS240S0100000_5(this, 86));
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 581));
            C0EOZ c0eoz = this.LLJLILLLLZIIL;
            if (c0eoz != null && (c385670FAfDU0 = c0eoz.dU0()) != null) {
                c385670FAfDU0.LIZ(this, new AObjectS240S0100000_5(this, 89));
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F9s
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C385430F9h) obj).LJII;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 571));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLLLLJIL(int i, Function0<Unit> function0) {
        FrameLayout frameLayout;
        C0E55 player;
        float[] fArrLLJLLIL;
        C372480Ej0 c372480Ej0;
        C0EGE c0ege;
        C372830EjZ c372830EjZ;
        C19A3 c19a3;
        View viewFindViewById;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        ViewPropertyAnimator viewPropertyAnimatorTranslationY2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator updateListener2;
        ViewPropertyAnimator listener2;
        ViewPropertyAnimator updateListener3;
        Scene scene;
        View viewFindViewById2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator listener3;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration4;
        ViewPropertyAnimator listener4;
        View viewFindViewById3;
        this.LLJLL = false;
        LLLLLLJ();
        View view = this.mView;
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.cev);
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            C786410Ut5.U4(frameLayout, 1.0f);
        }
        View view2 = this.mView;
        if (view2 != null && (viewFindViewById3 = view2.findViewById(R.id.dir)) != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
            }
            viewFindViewById3.requestLayout();
        }
        C385910FBd c385910FBd = this.LLJJJIL;
        if (c385910FBd != null) {
            C0E48 c0e48 = (C0E48) this.LLJZIJLIL.getValue();
            AwS406S0200000_5 awS406S0200000_5 = new AwS406S0200000_5(this, (C385880FBa) function0, (Function0<Unit>) 60);
            if (c0e48 != null && (player = c0e48.getPlayer()) != null && (fArrLLJLLIL = player.LLJLLIL()) != null) {
                Scene scene2 = c385910FBd.LIZJ;
                if ((scene2 instanceof C372480Ej0) && (c372480Ej0 = (C372480Ej0) scene2) != null && (c0ege = c372480Ej0.LLLILZ) != null && (c372830EjZ = c0ege.LJIIJ) != null) {
                    int navBarHeight = c372830EjZ.getNavBarHeight();
                    View view3 = c385910FBd.LIZ;
                    if (view3 != null) {
                        C786410Ut5.ed(view3, 0.0f);
                        C786410Ut5.T4(view3, 0.0f);
                        C786410Ut5.LJLLLLLL(0, view3);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                        if (viewPropertyAnimatorAnimate != null && (listener4 = viewPropertyAnimatorAnimate.setListener(null)) != null) {
                            listener4.cancel();
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        if (viewPropertyAnimatorAnimate2 != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null && (duration4 = viewPropertyAnimatorAlpha2.setDuration(200L)) != null) {
                            duration4.start();
                        }
                    }
                    View view4 = c385910FBd.LIZIZ;
                    if (view4 != null) {
                        C786410Ut5.T4(view4, 0.0f);
                        C786410Ut5.LJLLLLLL(0, view4);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        if (viewPropertyAnimatorAnimate3 != null && (listener3 = viewPropertyAnimatorAnimate3.setListener(null)) != null) {
                            listener3.cancel();
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate4 = view4.animate();
                        if (viewPropertyAnimatorAnimate4 != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate4.alpha(1.0f)) != null && (duration3 = viewPropertyAnimatorAlpha.setDuration(200L)) != null) {
                            duration3.start();
                        }
                    }
                    C01TT.LIZIZ(300L, new AwS549S0100000_5(awS406S0200000_5, 665));
                    Scene scene3 = c385910FBd.LIZJ;
                    if (scene3 instanceof C19A3) {
                        c19a3 = (C19A3) scene3;
                    } else {
                        c19a3 = null;
                    }
                    if (!C363470EMv.LJFF(c19a3) && (scene = c385910FBd.LIZJ) != null && (viewFindViewById2 = scene.findViewById(R.id.gct)) != null) {
                        C786410Ut5.LJLLLLLL(4, viewFindViewById2);
                    }
                    if (navBarHeight > 0) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate5 = c372830EjZ.animate();
                        if (viewPropertyAnimatorAnimate5 != null && (listener2 = viewPropertyAnimatorAnimate5.setListener(null)) != null && (updateListener3 = listener2.setUpdateListener(null)) != null) {
                            updateListener3.cancel();
                        }
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c372830EjZ);
                        c372830EjZ.setTranslationY(0.0f);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate6 = c372830EjZ.animate();
                        if (viewPropertyAnimatorAnimate6 != null && (viewPropertyAnimatorTranslationY2 = viewPropertyAnimatorAnimate6.translationY(-navBarHeight)) != null && (duration2 = viewPropertyAnimatorTranslationY2.setDuration(200L)) != null && (updateListener2 = duration2.setUpdateListener(new AUListenerS55S0201000_5(fArrLLJLLIL, navBarHeight, player, 0))) != null) {
                            updateListener2.start();
                        }
                        Scene scene4 = c385910FBd.LIZJ;
                        if (scene4 != null && (viewFindViewById = scene4.findViewById(R.id.cev)) != null) {
                            C786410Ut5.ed(viewFindViewById, navBarHeight);
                            ViewPropertyAnimator viewPropertyAnimatorAnimate7 = viewFindViewById.animate();
                            if (viewPropertyAnimatorAnimate7 != null && (listener = viewPropertyAnimatorAnimate7.setListener(null)) != null && (updateListener = listener.setUpdateListener(null)) != null) {
                                updateListener.cancel();
                            }
                            ViewPropertyAnimator viewPropertyAnimatorAnimate8 = viewFindViewById.animate();
                            if (viewPropertyAnimatorAnimate8 != null && (viewPropertyAnimatorTranslationY = viewPropertyAnimatorAnimate8.translationY(0.0f)) != null && (duration = viewPropertyAnimatorTranslationY.setDuration(200L)) != null) {
                                duration.start();
                            }
                        }
                    }
                }
            }
        }
    }

    public final String LLLLLJLJLL(String str, TextFontModel textFontModel) {
        Context context;
        TextPaint textPaint = this.LLJZ;
        textPaint.setTextSize(C418440Gaw.LIZIZ(Integer.valueOf(textFontModel.fontSize)));
        textPaint.setTypeface(C0FI2.LJJI(textFontModel.fileName));
        View view = this.mView;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        return C385390F9d.LIZ(str, context, this.LLJZ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c2l, viewGroup, false);
        C786410Ut5.LJLLLLLL(8, viewTd);
        this.LLJJJIL = new C385910FBd(viewTd.findViewById(R.id.eqx), viewTd.findViewById(R.id.y0b), this.mParentScene);
        return (ViewGroup) viewTd;
    }
}
