package X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ICoinService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592100rX6 {
    public static final C1592100rX6 LIZ = new C1592100rX6();

    public static AbstractC1592930rYR LIZ(final C1592950rYT c1592950rYT) {
        C0CXL.LIZ.getClass();
        if (C0CXL.LIZJ()) {
            return new C1593010rYZ(c1592950rYT);
        }
        if (((ICoinService) ServiceManager.get().getService(ICoinService.class)).LJIJJ()) {
            return new C1592940rYS(c1592950rYT) { // from class: X.0rYV
                @Override // X.C1592940rYS, X.AbstractC1592930rYR
                public final ImageView LJIIIIZZ() {
                    ImageView imageView = new ImageView(this.LL.getContext());
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                    if ((C303940Bvk.LIZ() && !C303950Bvl.LIZ()) || C14LC.LJIIL) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
                    layoutParams.gravity = 49;
                    C786410Ut5.c6(imageView, layoutParams);
                    return imageView;
                }

                @Override // X.C1592940rYS, X.AbstractC1592930rYR
                public final TuxTextView LJIIJ() {
                    TuxTextView tuxTextView = new TuxTextView(this.LL.getContext(), null, 6, 0);
                    tuxTextView.setTuxFont(LJIILLIIL(false));
                    tuxTextView.setLetterSpacing(0.01f);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 81;
                    layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    C786410Ut5.R6(tuxTextView, layoutParams);
                    tuxTextView.setGravity(17);
                    tuxTextView.setSingleLine(true);
                    tuxTextView.setText(this.LLILZ.LIZJ);
                    return tuxTextView;
                }

                public final C1593140rYm LJJJJL() {
                    C1592290rXP c1592290rXP = this.LLILZ.LIZLLL;
                    return this.LLILLJJLI == EnumC1571190qzN.DARK ? LJIJ() ? c1592290rXP.LIZIZ : c1592290rXP.LIZLLL : LJIJ() ? c1592290rXP.LIZ : c1592290rXP.LIZJ;
                }

                @Override // X.C1592940rYS, X.AbstractC1592930rYR
                public final void LJJIJIL() {
                    LJIILIIL();
                    LJIILL();
                    C1593140rYm c1593140rYmLJJJJL = LJJJJL();
                    C1592950rYT c1592950rYT2 = this.LL;
                    Integer numLIZJ = C1308910kAL.LIZJ(c1593140rYmLJJJJL.LIZIZ, c1592950rYT2.getContext());
                    c1592950rYT2.setTitleTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
                    c1592950rYT2.setTitleTuxFont(LJIILLIIL(false));
                    int iLJIJI = ((ICoinService) ServiceManager.get().getService(ICoinService.class)).LJIJI();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                    c419910GdJ.LIZ = iLJIJI == 1 ? R.raw.icon_tab_bottom_create : R.raw.icon_camera;
                    c419910GdJ.LJ = Integer.valueOf(LJJJJL().LIZIZ);
                    c419910GdJ.LJFF = false;
                    this.LL.setTabIconBackImageDrawable(c419910GdJ.LIZ(this.LL.getContext()));
                    this.LL.setTitleText(this.LLILZ.LIZJ);
                }

                {
                    if (LJJIJIIJIL(EnumC1593030rYb.UNSELECT, this.LLILZ.LJ, true)) {
                        LJJIJIL();
                    }
                }

                @Override // X.C1592940rYS, X.AbstractC1592930rYR
                public final void LJJIIZ(EnumC1571190qzN enumC1571190qzN) {
                    if (LJJIJIIJIL(EnumC1593030rYb.UNSELECT, enumC1571190qzN, false)) {
                        LJJIJIL();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
                /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
                @Override // X.C1592940rYS, X.AbstractC1592930rYR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LJJIJIIJIL(X.EnumC1593030rYb r2, X.EnumC1571190qzN r3, boolean r4) {
                    /*
                        r1 = this;
                        X.0qzN r0 = r1.LLILLJJLI
                        if (r0 != r3) goto L8
                        if (r4 != 0) goto La
                        r0 = 0
                        return r0
                    L8:
                        if (r4 == 0) goto L10
                    La:
                        r1.LJIILIIL()
                        r1.LJIILL()
                    L10:
                        X.0qzN r0 = r1.LLILLJJLI
                        if (r0 == r3) goto L17
                        r1.LLILLJJLI = r3
                        r4 = 1
                    L17:
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1592970rYV.LJJIJIIJIL(X.0rYb, X.0qzN, boolean):boolean");
                }
            };
        }
        return new C1592960rYU(c1592950rYT);
    }
}
