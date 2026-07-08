package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15eT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20570715eT extends AbstractC20570315eP {
    public final C01GW LJIIIZ;
    public final boolean LJIIJ;
    public final C01GW LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public boolean LJIILL;

    @Override // X.AbstractC20570315eP
    public final void LJI() {
        this.LJIILL = false;
    }

    @Override // X.AbstractC20570315eP
    public final void LJFF(float f, float f2, boolean z, C20571215eY c20571215eY) {
        View viewLIZIZ;
        int height;
        int width;
        View viewLIZIZ2;
        if (!c20571215eY.LIZJ) {
            return;
        }
        if ((!this.LJIILL || z) && (viewLIZIZ = LIZIZ()) != null) {
            this.LJIILL = true;
            if (this.LIZIZ.go1()) {
                ViewGroup viewGroupZt1 = this.LIZIZ.zt1();
                if (viewGroupZt1 != null) {
                    height = viewGroupZt1.getHeight();
                } else {
                    height = 0;
                }
            } else {
                height = viewLIZIZ.getHeight();
            }
            if (this.LIZIZ.go1()) {
                ViewGroup viewGroupZt12 = this.LIZIZ.zt1();
                if (viewGroupZt12 != null) {
                    width = viewGroupZt12.getWidth();
                } else {
                    width = 0;
                }
            } else {
                width = viewLIZIZ.getWidth();
            }
            int iLIZJ = LIZJ();
            Video video = this.LIZ.getVideo();
            if (video != null) {
                PillarBoxVideoInfo pillarBoxVideoInfo = video.getPillarBoxVideoInfo();
                if (((Boolean) this.LJIIJJI.getValue()).booleanValue() && pillarBoxVideoInfo != null && C1074904Ih.LIZ(pillarBoxVideoInfo)) {
                    RectF rectFLIZIZ = C1074904Ih.LIZIZ(pillarBoxVideoInfo);
                    float f3 = rectFLIZIZ.bottom;
                    float f4 = rectFLIZIZ.top;
                    float f5 = height;
                    this.LJIIL = (f3 - f4) * f5;
                    this.LJIILIIL = (rectFLIZIZ.right - rectFLIZIZ.left) * width;
                    this.LJIILJJIL = (((f3 + f4) * f5) / 2.0f) + ((iLIZJ - height) / 2.0f);
                } else {
                    this.LJIILIIL = width;
                    this.LJIIL = height;
                    this.LJIILJJIL = iLIZJ / 2.0f;
                }
            }
        }
        ViewGroup viewGroupZt13 = this.LIZIZ.zt1();
        if (viewGroupZt13 == null || (viewLIZIZ2 = LIZIZ()) == null) {
            return;
        }
        int iLIZJ2 = LIZJ();
        int width2 = viewGroupZt13.getWidth();
        float f6 = this.LJIIL;
        float f7 = this.LJIILIIL;
        if (f2 > 0.0f && f6 > 0.0f) {
            float f8 = iLIZJ2;
            float fLJ = (f8 - (f2 - C14LC.LJIILLIIL)) - LJ();
            float fLIZLLL = fLJ / f6;
            if (!this.LJIIJ || !c20571215eY.LJIIIIZZ) {
                fLIZLLL = C13LZ.LIZLLL(fLIZLLL, 0.0f, 1.0f);
            }
            float f9 = this.LJIILIIL;
            if (f9 != 0.0f) {
                float f10 = this.LJIIL;
                if (f10 != 0.0f) {
                    float f11 = f10 / f9;
                    if (0.55f <= f11 && f11 <= 0.57f && f7 != 0.0f && c20571215eY.LJ) {
                        float f12 = width2 / f7;
                        if (fLIZLLL < f12) {
                            fLIZLLL = f12;
                        }
                    }
                }
            }
            float f13 = this.LJIILJJIL;
            float f14 = 1;
            float fLJ2 = ((f13 + (((f8 / 2.0f) - f13) * (f14 - fLIZLLL))) - (fLJ / 2.0f)) - LJ();
            float f15 = f / f2;
            float f16 = ((fLIZLLL - f14) * f15) + 1.0f;
            float fLIZ = LIZ() - ((LIZ() + fLJ2) * f15);
            C786410Ut5.Ob(viewLIZIZ2, f16);
            C786410Ut5.pc(viewLIZIZ2, f16);
            C786410Ut5.ed(viewLIZIZ2, fLIZ);
            View view = this.LIZJ;
            if (view != null) {
                C786410Ut5.Ob(view, f16);
                C786410Ut5.pc(view, f16);
                C786410Ut5.ed(view, fLIZ);
            }
            if (f15 == 1.0f || f15 == 0.0f) {
                ((AbstractC1604130rqV) this.LJIIIZ.getValue()).LJIIIZ("landscape " + f16 + ' ' + viewLIZIZ2.getTranslationY() + ' ' + f6 + ' ' + fLJ + ' ' + f2);
            }
        }
    }

    public C20570715eT(Aweme aweme, InterfaceC583650Mup interfaceC583650Mup, View view, IScreenComponentAbility iScreenComponentAbility, View view2) {
        super(aweme, interfaceC583650Mup, view, iScreenComponentAbility, view2);
        this.LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS221S0000000_31.get$arr$(489));
        this.LJIIJ = C0BXF.LIZ();
        this.LJIIJJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(488));
    }
}
