package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.AwS236S0300000_27;

/* JADX INFO: renamed from: X.0y7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845100y7A {
    public static final /* synthetic */ int LIZ = 0;

    public static ConstraintLayout LIZ(Context context, final boolean z) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        C786410Ut5.m6(constraintLayout, new C19ME(-1, -1));
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        C786410Ut5.c6(imageView, new C19ME(0, -1));
        int i = 1;
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(0);
        C1143680frq.LJ(imageView, "tiktok_live_interaction_ai_commentary_resource", "intro_panel_image.png", ImageView.ScaleType.FIT_CENTER);
        constraintLayout.addView(imageView);
        C19ME c19me = (C19ME) imageView.getLayoutParams();
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.endToEnd = 0;
        c19me.bottomToBottom = 0;
        c19me.horizontalBias = 0.5f;
        c19me.dimensionRatio = "W,210:165";
        int iLIZ = C439101nJ.LIZ(33);
        C1324720kZq c1324720kZq = new C1324720kZq(context);
        c1324720kZq.setId(View.generateViewId());
        C786410Ut5.u6(c1324720kZq, new C19ME(iLIZ, iLIZ));
        C786410Ut5.LLJJIII(c1324720kZq, 0);
        constraintLayout.addView(c1324720kZq);
        C19ME c19me2 = (C19ME) c1324720kZq.getLayoutParams();
        c19me2.startToStart = imageView.getId();
        c19me2.topToTop = imageView.getId();
        c19me2.setMarginStart(C439101nJ.LIZ(22));
        ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C439101nJ.LIZ(48);
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = c1324720kZq;
        c1143920fsE.LIZIZ = "tiktok_live_interaction_ai_commentary_resource";
        c1143920fsE.LIZJ = "intro_panel_animation.webp";
        c1143920fsE.LJFF = true;
        if (!z) {
            i = Integer.MAX_VALUE;
        }
        c1143920fsE.LJI = i;
        c1143920fsE.LJ = new C1143950fsH() { // from class: X.0fsJ
            @Override // X.C1143950fsH
            public final void LJ(Animatable animatable) {
                AnimatedDrawable2 animatedDrawable2;
                if (z) {
                    if ((animatable instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) animatable) != null) {
                        int iLIZJ = animatedDrawable2.LIZJ() - 1;
                        if (animatedDrawable2 != null && iLIZJ >= 0) {
                            try {
                                animatedDrawable2.LJ(iLIZJ);
                                animatedDrawable2.LJFF();
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                animatedDrawable2.stop();
                                return;
                            }
                        }
                    }
                    animatable.stop();
                }
            }

            @Override // X.C1143950fsH
            public final void LIZ(Animatable animatable, int i2, int i3) {
                if (!z && i3 > 0 && i2 >= i3 - 1) {
                    if (animatable instanceof AnimatedDrawable2) {
                        ((AnimatedDrawable2) animatable).LJFF();
                    } else {
                        if (animatable == null) {
                            return;
                        }
                        animatable.stop();
                    }
                }
            }
        };
        c1143920fsE.LIZLLL();
        return constraintLayout;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.intro.TuxPanel] */
    public static TuxPanel LIZIZ(Context context, FragmentManager fragmentManager, C1845110y7B c1845110y7B) {
        C259800zU c259800zU = new C259800zU();
        AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(c1845110y7B, (C1845110y7B) context, (Context) c259800zU, (C259800zU<TuxPanel>) 8);
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LIZ = true;
        c1391960mKI.LJI = 2;
        c1391960mKI.LJFF = LIZ(context, true);
        c1391960mKI.LJII = C497740JfY.LJIJI(2131853666);
        c1391960mKI.LJIILJJIL = true;
        awS236S0300000_27.invoke(c1391960mKI);
        ?? r1 = c1391960mKI.LIZ().LIZ;
        r1.LLJILJIL = false;
        r1.LLJI = true;
        r1.LLJ = false;
        r1.LLIZLLLIL = true;
        r1.show(fragmentManager, "ai_commentary_guide_panel");
        c259800zU.element = r1;
        C973660bRc.LIZ.LJJJJL(c1845110y7B.LIZLLL, c1845110y7B.LJ, false, null, c1845110y7B.LJFF, c1845110y7B.LJI);
        return r1;
    }
}
