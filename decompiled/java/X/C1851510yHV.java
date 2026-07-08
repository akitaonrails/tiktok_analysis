package X;

import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851510yHV extends AbstractC1664490tPr<C1851530yHX, C1851570yHb> {
    public boolean LLJLLIL;
    public int LLLIILIL;
    public int LLLIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1205));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1196));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1199));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1197));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1198));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1192));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1190));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1194));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1189));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1187));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1203));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1202));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1200));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1201));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1193));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1191));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1195));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1186));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1204));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1182));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1183));
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1188));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1184));
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1185));

    public final C1287400jbe LLLLLL() {
        return (C1287400jbe) this.LLJLL.getValue();
    }

    public final int LLLLLLIL() {
        int i = this.LLLIL;
        return i == 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(206)) : i;
    }

    public final int LLLLLLJ() {
        int i = this.LLLIILIL;
        return i == 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(151)) : i;
    }

    public final FrameLayout LLLLLLL() {
        return (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final FrameLayout LLLLLLLLL() {
        return (FrameLayout) this.LLLF.getValue();
    }

    public final C417220GXo LLLLLLLLLL() {
        return (C417220GXo) this.LLJLIL.getValue();
    }

    public final C417220GXo LLLLLLLZIL() {
        return (C417220GXo) this.LLLFFI.getValue();
    }

    public final FrameLayout LLLLLLZ() {
        return (FrameLayout) this.LLJJJJ.getValue();
    }

    public final AppCompatImageView LLLLLLZZ() {
        return (AppCompatImageView) this.LLJJJJLIIL.getValue();
    }

    public final AppCompatImageView LLLLLZ() {
        return (AppCompatImageView) this.LLJJL.getValue();
    }

    public final AppCompatImageView LLLLLZL() {
        return (AppCompatImageView) this.LLJZIJLIL.getValue();
    }

    public final AppCompatImageView LLLLZ() {
        return (AppCompatImageView) this.LLL.getValue();
    }

    public final FrameLayout LLLLZIL() {
        return (FrameLayout) this.LLJLLL.getValue();
    }

    public final ConstraintLayout LLLLZLL() {
        return (ConstraintLayout) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        LLLLLJLJLL(false, true);
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        LLLLLJIL(false);
    }

    public final void LLLLLJIL(boolean z) {
        if (!z && LLLLILI().LIZ.LIZ == AIGenerationType.IMAGE_TO_VIDEO && LLLLLLL().getVisibility() == 0) {
            LLLLLJLJLL(true, true);
        }
    }

    public final void LLLLZLLLI(UploadImageParam uploadImageParam) {
        boolean z;
        C1332060klg c1332060klg;
        C1332060klg c1332060klg2;
        if (uploadImageParam.width > uploadImageParam.height) {
            z = true;
        } else {
            z = false;
        }
        String str = uploadImageParam.path;
        if (z) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJII.LJJI(LLLLLLZZ());
            if (uploadImageParam.showMask) {
                c1332060klg2 = new C1332060klg(20, 3, 0);
            } else {
                c1332060klg2 = null;
            }
            c1331670kl3LJII.LJJIFFI = c1332060klg2;
            C786410Ut5.h3(c1331670kl3LJII);
            LLLLLLZZ().setScaleType(ImageView.ScaleType.FIT_CENTER);
            C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII2.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJII2.LJJIFFI = new C1332060klg(20, 3, 0);
            c1331670kl3LJII2.LJJI(LLLLLZ());
            C786410Ut5.h3(c1331670kl3LJII2);
            C786410Ut5.LLILIL(LLLLLZ(), 0);
            C786410Ut5.a5(LLLLLZ(), 0.2f);
        } else {
            if (Intrinsics.LJFF(LLLLILI().LIZ.LJFF, Boolean.TRUE)) {
                LLLLLLZZ().setImageDrawable(new ColorDrawable(-14145496));
            } else {
                C1331670kl3 c1331670kl3LJII3 = C1331660kl2.LJII(new C0VSJ(str));
                c1331670kl3LJII3.LJJ = EnumC1338240kve.CENTER_CROP;
                if (uploadImageParam.showMask) {
                    c1332060klg = new C1332060klg(20, 3, 0);
                } else {
                    c1332060klg = null;
                }
                c1331670kl3LJII3.LJJIFFI = c1332060klg;
                c1331670kl3LJII3.LJJI(LLLLLLZZ());
                C786410Ut5.h3(c1331670kl3LJII3);
            }
            LLLLLLZZ().setScaleType(ImageView.ScaleType.CENTER_CROP);
            C786410Ut5.LLILIL(LLLLLZ(), 8);
        }
        C786410Ut5.LJZ(0, (FrameLayout) this.LLJJJJJIL.getValue());
        C786410Ut5.LJZ(8, LLLLLLL());
        C786410Ut5.O7(LLLLLLL(), null);
        LLLLLJLJLL(false, false);
        C786410Ut5.R7((LinearLayout) this.LLLII.getValue(), new ACListenerS161S0100000_27(this, 147));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int iLIZIZ;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        float f;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        super.onViewCreated(this.mView, bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0xz5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851530yHX) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 414));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yHY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851530yHX) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 418));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yHZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851530yHX) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 421));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0y4U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851530yHX) obj).LIZLLL;
            }
        }, new AwS606S0100000_27(this, 425));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yHa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851530yHX) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 408));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0yHW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1851530yHX) obj).LJI;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 410));
        C786410Ut5.O7(LLLLLLL(), new ACListenerS161S0100000_27(this, 151));
        C786410Ut5.O7(LLLLLLLLL(), new ACListenerS161S0100000_27(this, 152));
        int iIntValue8 = 0;
        if (getSceneContext() == null) {
            this.LLLIILIL = 0;
            this.LLLIL = 0;
        } else {
            int screenWidth = ScreenUtils.getScreenWidth(getSceneContext());
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            if (C1429560nIw.LIZ()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            int i = ((screenWidth - iLIZIZ) - (iLIZIZ2 * 2)) / 2;
            this.LLLIILIL = i;
            this.LLLIL = (int) (i / 0.76f);
        }
        if (C1429560nIw.LIZ()) {
            C786410Ut5.LLLZIIL(LLLLLL(), 0);
            LLLLLL().LIZIZ(C08E3.LIZ(R.raw.hexagon_vert, requireSceneContext()), C08E3.LIZ(R.raw.hexagon_zoom_frag, requireSceneContext()), true, new C1287390jbd(0.6f, 0.15f, 0.0f, (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f)), (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(0.9f), Float.valueOf(0.9f)), Color.rgb(27, 203, 176), Color.rgb(27, 180, 224), Color.rgb(79, 140, 100), Color.rgb(88, 75, 74), Color.rgb(0, 0, 0), 1.0f, 0.5f));
            C426750GoL.LJIIIZ(LLLLLL(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), false, 16);
            C1447470nlp.LIZIZ(LLLLLL(), C418440Gaw.LIZIZ(13));
            LLLLLL().LIZJ();
            this.LLJLLIL = true;
        }
        boolean zLIZ = C1429560nIw.LIZ();
        Integer numValueOf = Integer.valueOf(R.attr.cc);
        if (zLIZ) {
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                TuxIconView tuxIconView = (TuxIconView) this.LLJL.getValue();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_ai_add_image_fill;
                tuxIconView.setTuxIcon(c419910GdJ);
                LLLLLLLLLL().setGradientEnabled(true);
                C417220GXo c417220GXoLLLLLLLLLL = LLLLLLLLLL();
                int[] iArr = new int[4];
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cn, sceneContext);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                iArr[0] = iIntValue;
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cn, sceneContext);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                iArr[1] = iIntValue2;
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, sceneContext);
                if (numLIZJ3 != null) {
                    iIntValue3 = numLIZJ3.intValue();
                } else {
                    iIntValue3 = 0;
                }
                iArr[2] = iIntValue3;
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.cc, sceneContext);
                if (numLIZJ4 != null) {
                    iIntValue4 = numLIZJ4.intValue();
                } else {
                    iIntValue4 = 0;
                }
                iArr[3] = iIntValue4;
                c417220GXoLLLLLLLLLL.setColors(iArr);
                LLLLLLLLLL().setPositions(new float[]{0.0f, 0.3f, 0.5f, 1.0f});
                C1295960jpS c1295960jpS = (C1295960jpS) this.LLLFZ.getValue();
                c1295960jpS.setAnimation(R.raw.tux_lottie_common_creation_icon_ai_transition_arrow);
                if (C423170GiZ.LIZ(requireSceneContext())) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                C786410Ut5.Wb(c1295960jpS, f);
                TuxIconView tuxIconView2 = (TuxIconView) this.LLLFF.getValue();
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_color_ai_add_image_fill;
                tuxIconView2.setTuxIcon(c419910GdJ2);
                LLLLLLLZIL().setGradientEnabled(true);
                C417220GXo c417220GXoLLLLLLLZIL = LLLLLLLZIL();
                int[] iArr2 = new int[4];
                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.cn, sceneContext);
                if (numLIZJ5 != null) {
                    iIntValue5 = numLIZJ5.intValue();
                } else {
                    iIntValue5 = 0;
                }
                iArr2[0] = iIntValue5;
                Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.cn, sceneContext);
                if (numLIZJ6 != null) {
                    iIntValue6 = numLIZJ6.intValue();
                } else {
                    iIntValue6 = 0;
                }
                iArr2[1] = iIntValue6;
                Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.ce, sceneContext);
                if (numLIZJ7 != null) {
                    iIntValue7 = numLIZJ7.intValue();
                } else {
                    iIntValue7 = 0;
                }
                iArr2[2] = iIntValue7;
                Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.cc, sceneContext);
                if (numLIZJ8 != null) {
                    iIntValue8 = numLIZJ8.intValue();
                }
                iArr2[3] = iIntValue8;
                c417220GXoLLLLLLLZIL.setColors(iArr2);
                LLLLLLLZIL().setPositions(new float[]{0.0f, 0.3f, 0.5f, 1.0f});
                return;
            }
            return;
        }
        C786410Ut5.LLD(8, (C1295960jpS) this.LLLFZ.getValue());
        Context sceneContext2 = getSceneContext();
        if (sceneContext2 != null) {
            LLLLLLL().setBackground(sceneContext2.getDrawable(R.drawable.bp4));
        }
        TuxIconView tuxIconView3 = (TuxIconView) this.LLJL.getValue();
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_image_plus;
        c419910GdJ3.LJ = numValueOf;
        tuxIconView3.setTuxIcon(c419910GdJ3);
        LLLLLLLLLL().setGradientEnabled(false);
        C417220GXo c417220GXoLLLLLLLLLL2 = LLLLLLLLLL();
        c417220GXoLLLLLLLLLL2.LLJJL = false;
        c417220GXoLLLLLLLLLL2.getPaint().setShader(null);
        if (numValueOf != null) {
            c417220GXoLLLLLLLLLL2.setTextColor(numValueOf.intValue());
        }
        c417220GXoLLLLLLLLLL2.invalidate();
        LLLLLLLLLL().setTextColorRes(R.attr.cc);
        Context sceneContext3 = getSceneContext();
        if (sceneContext3 != null) {
            LLLLLLLLL().setBackground(sceneContext3.getDrawable(R.drawable.bp4));
        }
        TuxIconView tuxIconView4 = (TuxIconView) this.LLLFF.getValue();
        C419910GdJ c419910GdJ4 = new C419910GdJ();
        c419910GdJ4.LIZ = R.raw.icon_image_plus;
        c419910GdJ4.LJ = numValueOf;
        tuxIconView4.setTuxIcon(c419910GdJ4);
        View view = (View) this.LLJL.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            C19ME c19me = (C19ME) layoutParams;
            c19me.matchConstraintPercentWidth = 0.178f;
            c19me.matchConstraintPercentHeight = 0.134f;
            C786410Ut5.W5(view, c19me);
            View view2 = (View) this.LLLFF.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                C19ME c19me2 = (C19ME) layoutParams2;
                c19me2.matchConstraintPercentWidth = 0.178f;
                c19me2.matchConstraintPercentHeight = 0.134f;
                C786410Ut5.W5(view2, c19me2);
                LLLLLLLZIL().setGradientEnabled(false);
                C417220GXo c417220GXoLLLLLLLZIL2 = LLLLLLLZIL();
                c417220GXoLLLLLLLZIL2.LLJJL = false;
                c417220GXoLLLLLLLZIL2.getPaint().setShader(null);
                if (numValueOf != null) {
                    c417220GXoLLLLLLLZIL2.setTextColor(numValueOf.intValue());
                }
                c417220GXoLLLLLLLZIL2.invalidate();
                LLLLLLLZIL().setTextColorRes(R.attr.cc);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void LLLLLJLJLL(boolean z, boolean z2) {
        if (C1429560nIw.LIZ()) {
            int i = 0;
            if (!z) {
                LLLLLL().onPause();
                C1287400jbe c1287400jbeLLLLLL = LLLLLL();
                if (!z2) {
                    i = 8;
                }
                C786410Ut5.LLLZIIL(c1287400jbeLLLLLL, i);
            } else {
                if (!this.LLJLLIL) {
                    C786410Ut5.LLLZIIL(LLLLLL(), 8);
                }
                C1287400jbe c1287400jbeLLLLLL2 = LLLLLL();
                if (!z2) {
                    i = 8;
                }
                C786410Ut5.LLLZIIL(c1287400jbeLLLLLL2, i);
                LLLLLL().onResume();
            }
            this.LLJLLIL = z;
        }
    }

    public final void LLLLZLLIL(UploadImageParam uploadImageParam, UploadImageParam uploadImageParam2) {
        boolean z;
        C1332060klg c1332060klg;
        C1332060klg c1332060klg2;
        if (LLLLILI().LIZ.LIZ == AIGenerationType.IMAGE_TO_VIDEO) {
            if (uploadImageParam != null) {
                LLLLZLLLI(uploadImageParam);
                return;
            }
            return;
        }
        if (LLLLILI().LIZ.LIZ != AIGenerationType.AI_TRANSITION) {
            return;
        }
        if (uploadImageParam != null) {
            LLLLZLLLI(uploadImageParam);
        }
        if (uploadImageParam2 == null) {
            return;
        }
        if (uploadImageParam2.width > uploadImageParam2.height) {
            z = true;
        } else {
            z = false;
        }
        String str = uploadImageParam2.path;
        if (z) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_CENTER;
            if (uploadImageParam2.showMask) {
                c1332060klg2 = new C1332060klg(20, 3, 0);
            } else {
                c1332060klg2 = null;
            }
            c1331670kl3LJII.LJJIFFI = c1332060klg2;
            c1331670kl3LJII.LJJI(LLLLLZL());
            C786410Ut5.h3(c1331670kl3LJII);
            LLLLLZL().setScaleType(ImageView.ScaleType.FIT_CENTER);
            C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII2.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJII2.LJJIFFI = new C1332060klg(20, 3, 0);
            c1331670kl3LJII2.LJJI(LLLLZ());
            C786410Ut5.h3(c1331670kl3LJII2);
            C786410Ut5.LLILIL(LLLLZ(), 0);
            C786410Ut5.a5(LLLLZ(), 0.2f);
        } else {
            if (Intrinsics.LJFF(LLLLILI().LIZ.LJI, Boolean.TRUE)) {
                LLLLLZL().setImageDrawable(new ColorDrawable(-14145496));
            } else {
                C1331670kl3 c1331670kl3LJII3 = C1331660kl2.LJII(new C0VSJ(str));
                c1331670kl3LJII3.LJJ = EnumC1338240kve.CENTER_CROP;
                if (uploadImageParam2.showMask) {
                    c1332060klg = new C1332060klg(20, 3, 0);
                } else {
                    c1332060klg = null;
                }
                c1331670kl3LJII3.LJJIFFI = c1332060klg;
                c1331670kl3LJII3.LJJI(LLLLLZL());
                C786410Ut5.h3(c1331670kl3LJII3);
            }
            LLLLLZL().setScaleType(ImageView.ScaleType.CENTER_CROP);
            C786410Ut5.LLILIL(LLLLZ(), 8);
        }
        C786410Ut5.LJZ(0, (FrameLayout) this.LLJZ.getValue());
        C786410Ut5.LJZ(8, LLLLLLLLL());
        C786410Ut5.O7(LLLLLLLLL(), null);
        C786410Ut5.R7((LinearLayout) this.LLLIIIL.getValue(), new ACListenerS161S0100000_27(this, 154));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.mv, viewGroup, false);
    }
}
