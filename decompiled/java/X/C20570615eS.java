package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15eS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20570615eS extends AbstractC20570315eP {
    public final View LJIIIZ;
    public final C01GW LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public final boolean LJIILJJIL;
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
        RectF rectF;
        View viewLIZIZ2;
        if (!c20571215eY.LIZLLL) {
            return;
        }
        if ((!this.LJIILL || z) && (viewLIZIZ = LIZIZ()) != null && this.LIZIZ.zt1() != null) {
            this.LJIILL = true;
            Video video = this.LIZ.getVideo();
            if (video != null) {
                FakeLandscapeInfo fakeLandscapeInfo = video.getFakeLandscapeInfo();
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
                PillarBoxVideoInfo pillarBoxVideoInfo = video.getPillarBoxVideoInfo();
                if (pillarBoxVideoInfo == null) {
                    rectF = new RectF(fakeLandscapeInfo.getLeft(), fakeLandscapeInfo.getTop(), fakeLandscapeInfo.getRight(), fakeLandscapeInfo.getBottom());
                } else {
                    RectF rectFLIZIZ = C1074904Ih.LIZIZ(pillarBoxVideoInfo);
                    float left = fakeLandscapeInfo.getLeft();
                    float f3 = rectFLIZIZ.left;
                    if (left < f3) {
                        left = f3;
                    }
                    float top = fakeLandscapeInfo.getTop();
                    float f4 = rectFLIZIZ.top;
                    if (top < f4) {
                        top = f4;
                    }
                    float right = fakeLandscapeInfo.getRight();
                    float f5 = rectFLIZIZ.right;
                    if (right > f5) {
                        right = f5;
                    }
                    float bottom = fakeLandscapeInfo.getBottom();
                    float f6 = rectFLIZIZ.bottom;
                    if (bottom > f6) {
                        bottom = f6;
                    }
                    rectF = new RectF(left, top, right, bottom);
                }
                float f7 = rectF.bottom;
                float f8 = rectF.top;
                float f9 = height;
                this.LJIIL = (f7 - f8) * f9;
                this.LJIIJJI = (rectF.right - rectF.left) * width;
                this.LJIILIIL = (((f7 + f8) * f9) / 2.0f) + ((iLIZJ - height) / 2.0f);
            }
        }
        ViewGroup viewGroupZt13 = this.LIZIZ.zt1();
        if (viewGroupZt13 == null || (viewLIZIZ2 = LIZIZ()) == null) {
            return;
        }
        int iLIZJ2 = LIZJ();
        int width2 = viewGroupZt13.getWidth();
        float f10 = this.LJIIL;
        float f11 = this.LJIIJJI;
        float f12 = iLIZJ2;
        float fLJ = (f12 - (f2 - C14LC.LJIILLIIL)) - LJ();
        if (f10 != 0.0f && f2 != 0.0f) {
            float fLIZLLL = fLJ / f10;
            if (!this.LJIILJJIL) {
                fLIZLLL = C13LZ.LIZLLL(fLIZLLL, 0.0f, 1.0f);
            }
            float f13 = this.LJIIJJI;
            if (f13 != 0.0f) {
                float f14 = this.LJIIL;
                if (f14 != 0.0f) {
                    float f15 = f14 / f13;
                    if (0.55f <= f15 && f15 <= 0.57f && f11 != 0.0f && c20571215eY.LJ) {
                        float f16 = width2 / f11;
                        if (fLIZLLL < f16) {
                            fLIZLLL = f16;
                        }
                    }
                }
            }
            float f18 = f / f2;
            float f19 = 1;
            float f20 = ((fLIZLLL - f19) * f18) + 1.0f;
            float f21 = this.LJIILIIL;
            float fLIZ = LIZ() - ((LIZ() + (((f21 + (((f12 / 2.0f) - f21) * (f19 - fLIZLLL))) - (fLJ / 2.0f)) - LJ())) * f18);
            C786410Ut5.Ob(viewLIZIZ2, f20);
            C786410Ut5.pc(viewLIZIZ2, f20);
            C786410Ut5.ed(viewLIZIZ2, fLIZ);
            View view = this.LIZJ;
            if (view != null) {
                C786410Ut5.Ob(view, f20);
                C786410Ut5.pc(view, f20);
                C786410Ut5.ed(view, fLIZ);
            }
            if (f18 == 1.0f || f18 == 0.0f) {
                ((AbstractC1604130rqV) this.LJIIJ.getValue()).LJIIIZ("fakelandscape " + f20 + ' ' + viewLIZIZ2.getTranslationY() + ' ' + f10 + ' ' + fLJ + ' ' + f2);
            }
        }
    }

    public C20570615eS(Aweme aweme, InterfaceC583650Mup interfaceC583650Mup, View view, IScreenComponentAbility iScreenComponentAbility, View view2, View view3) {
        super(aweme, interfaceC583650Mup, view, iScreenComponentAbility, view3);
        this.LJIIIZ = view2;
        this.LJIIJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS221S0000000_31.get$arr$(487));
        this.LJIILJJIL = C0BXF.LIZ();
    }
}
