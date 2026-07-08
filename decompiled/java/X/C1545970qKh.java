package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;

/* JADX INFO: renamed from: X.0qKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545970qKh {
    public final SparkPopup LIZ;
    public C1546000qKk LIZIZ;
    public Configuration LIZJ;
    public final C1542180qEa LIZLLL = new C1542180qEa();

    public final Context LIZIZ() {
        return this.LIZ.getContext();
    }

    public final int LIZLLL() {
        SparkPopupSchemaParam sparkPopupSchemaParamNR;
        Resources resources;
        LinearLayout linearLayoutMR = this.LIZ.MR();
        int iIntValue = 0;
        if (linearLayoutMR == null || (sparkPopupSchemaParamNR = this.LIZ.NR()) == null) {
            return 0;
        }
        Configuration configuration = this.LIZJ;
        if (configuration == null) {
            Context contextLIZIZ = LIZIZ();
            configuration = (contextLIZIZ == null || (resources = contextLIZIZ.getResources()) == null) ? null : resources.getConfiguration();
        }
        int i = LJII(configuration).LIZLLL - this.LIZ.LLJL;
        if (i < 0) {
            i = 0;
        }
        if (!LJIIIIZZ()) {
            Integer[] numArr = new Integer[3];
            Integer numValueOf = Integer.valueOf(linearLayoutMR.getHeight());
            int iIntValue2 = numValueOf.intValue();
            if (1 > iIntValue2 || iIntValue2 > i) {
                numValueOf = null;
            }
            numArr[0] = numValueOf;
            ViewGroup.LayoutParams layoutParams = linearLayoutMR.getLayoutParams();
            Integer numValueOf2 = Integer.valueOf(layoutParams != null ? layoutParams.height : 0);
            int iIntValue3 = numValueOf2.intValue();
            if (1 > iIntValue3 || iIntValue3 > i) {
                numValueOf2 = null;
            }
            numArr[1] = numValueOf2;
            Window windowWR = this.LIZ.WR();
            this.LIZ.getActivity();
            Integer numValueOf3 = Integer.valueOf(C1549340qQ8.LIZIZ(windowWR, sparkPopupSchemaParamNR, this.LIZ, false));
            numArr[2] = numValueOf3.intValue() > 0 ? numValueOf3 : null;
            Integer numLIZJ = C1545950qKf.LIZJ(numArr);
            return (numLIZJ == null || (iIntValue = numLIZJ.intValue()) <= i) ? iIntValue : i;
        }
        Integer[] numArr2 = new Integer[3];
        Window windowWR2 = this.LIZ.WR();
        this.LIZ.getActivity();
        Integer numValueOf4 = Integer.valueOf(C1549340qQ8.LIZIZ(windowWR2, sparkPopupSchemaParamNR, this.LIZ, false));
        if (numValueOf4.intValue() <= 0) {
            numValueOf4 = null;
        }
        numArr2[0] = numValueOf4;
        ViewGroup.LayoutParams layoutParams2 = linearLayoutMR.getLayoutParams();
        Integer numValueOf5 = Integer.valueOf(layoutParams2 != null ? layoutParams2.height : 0);
        int iIntValue4 = numValueOf5.intValue();
        if (1 > iIntValue4 || iIntValue4 > i) {
            numValueOf5 = null;
        }
        numArr2[1] = numValueOf5;
        Integer numValueOf6 = Integer.valueOf(linearLayoutMR.getHeight());
        int iIntValue5 = numValueOf6.intValue();
        if (1 <= iIntValue5 && iIntValue5 <= i) {
            num = numValueOf6;
        }
        numArr2[2] = num;
        Integer numLIZJ2 = C1545950qKf.LIZJ(numArr2);
        return (numLIZJ2 == null || (iIntValue = numLIZJ2.intValue()) <= i) ? iIntValue : i;
    }

    public final int LJ() {
        SparkPopupSchemaParam sparkPopupSchemaParamNR;
        Resources resources;
        LinearLayout linearLayoutMR = this.LIZ.MR();
        if (linearLayoutMR == null || (sparkPopupSchemaParamNR = this.LIZ.NR()) == null) {
            return 0;
        }
        if (LJIIIIZZ()) {
            Integer[] numArr = new Integer[3];
            Context contextLIZIZ = LIZIZ();
            numArr[0] = Integer.valueOf(LIZJ((contextLIZIZ == null || (resources = contextLIZIZ.getResources()) == null) ? null : resources.getConfiguration()));
            ViewGroup.LayoutParams layoutParams = linearLayoutMR.getLayoutParams();
            Integer numValueOf = Integer.valueOf(layoutParams != null ? layoutParams.width : 0);
            numArr[1] = numValueOf.intValue() > 0 ? numValueOf : null;
            numArr[2] = Integer.valueOf(linearLayoutMR.getWidth());
            Integer numLIZJ = C1545950qKf.LIZJ(numArr);
            if (numLIZJ != null) {
                return numLIZJ.intValue();
            }
            return 0;
        }
        Integer[] numArr2 = new Integer[3];
        numArr2[0] = Integer.valueOf(linearLayoutMR.getWidth());
        ViewGroup.LayoutParams layoutParams2 = linearLayoutMR.getLayoutParams();
        Integer numValueOf2 = Integer.valueOf(layoutParams2 != null ? layoutParams2.width : 0);
        if (numValueOf2.intValue() <= 0) {
            numValueOf2 = null;
        }
        numArr2[1] = numValueOf2;
        Integer numValueOf3 = Integer.valueOf(sparkPopupSchemaParamNR.getRealWidth(LIZIZ()));
        numArr2[2] = numValueOf3.intValue() > 0 ? numValueOf3 : null;
        Integer numLIZJ2 = C1545950qKf.LIZJ(numArr2);
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        return 0;
    }

    public final boolean LJIIIIZZ() {
        Resources resources;
        Configuration configuration = this.LIZJ;
        if (configuration == null) {
            Context contextLIZIZ = LIZIZ();
            configuration = (contextLIZIZ == null || (resources = contextLIZIZ.getResources()) == null) ? null : resources.getConfiguration();
        }
        return LJIIIZ(configuration);
    }

    public C1545970qKh(SparkPopup sparkPopup) {
        this.LIZ = sparkPopup;
    }

    public final void LIZ(Configuration configuration) {
        InterfaceC1541990qEH kitView;
        InterfaceC1545990qKj interfaceC1545990qKjLIZ = C1542190qEb.LIZ();
        if ((interfaceC1545990qKjLIZ != null && !interfaceC1545990qKjLIZ.LJ()) || this.LIZ.MR() == null) {
            return;
        }
        int iLJ = LJ();
        int iLIZLLL = LIZLLL();
        int iLJI = LJI(iLJ);
        int iLJFF = LJFF(iLIZLLL);
        C1542090qER c1542090qERLJII = LJII(configuration);
        C1542180qEa c1542180qEa = this.LIZLLL;
        int i = c1542090qERLJII.LIZJ;
        int i2 = c1542090qERLJII.LIZLLL;
        boolean z = c1542180qEa.LJ;
        if (z && i == c1542180qEa.LIZ && i2 == c1542180qEa.LIZIZ && iLJI == c1542180qEa.LIZJ && iLJFF == c1542180qEa.LIZLLL) {
            return;
        }
        c1542180qEa.LIZ = i;
        c1542180qEa.LIZIZ = i2;
        c1542180qEa.LIZJ = iLJI;
        c1542180qEa.LIZLLL = iLJFF;
        c1542180qEa.LJ = true;
        if (!z) {
            return;
        }
        Context contextLIZIZ = LIZIZ();
        SparkFragment sparkFragment = this.LIZ.LLJILLL;
        if (sparkFragment != null) {
            kitView = sparkFragment.getKitView();
        } else {
            kitView = null;
        }
        C1545950qKf.LIZIZ(contextLIZIZ, kitView, c1542090qERLJII.LIZ, c1542090qERLJII.LIZIZ, iLJI, iLJFF, "viewSizeChanged");
    }

    public final int LIZJ(Configuration configuration) {
        InterfaceC1545990qKj interfaceC1545990qKjLIZ = C1542190qEb.LIZ();
        if (interfaceC1545990qKjLIZ == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(LJII(configuration).LIZJ);
        if (numValueOf.intValue() <= 0) {
            return 0;
        }
        return interfaceC1545990qKjLIZ.LIZJ(numValueOf.intValue(), interfaceC1545990qKjLIZ.LJII(r2.LIZ));
    }

    public final int LJFF(int i) {
        int i2;
        int i3;
        SparkPopup sparkPopup = this.LIZ;
        C415540GRc c415540GRc = sparkPopup.LLILZ;
        Integer num = null;
        if (c415540GRc == null) {
            c415540GRc = null;
        }
        if (c415540GRc == null) {
            return 0;
        }
        int iAS = sparkPopup.aS();
        if (iAS < 0) {
            iAS = 0;
        }
        if (LJIIIIZZ()) {
            Integer[] numArr = new Integer[3];
            Integer numValueOf = Integer.valueOf(i - iAS);
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            numArr[0] = numValueOf;
            ViewGroup.LayoutParams layoutParams = c415540GRc.getLayoutParams();
            if (layoutParams != null) {
                i3 = layoutParams.height;
            } else {
                i3 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i3);
            if (numValueOf2.intValue() > 0) {
                num = numValueOf2;
            }
            numArr[1] = num;
            numArr[2] = Integer.valueOf(c415540GRc.getHeight());
            Integer numLIZJ = C1545950qKf.LIZJ(numArr);
            if (numLIZJ == null) {
                return 0;
            }
            return numLIZJ.intValue();
        }
        Integer[] numArr2 = new Integer[3];
        numArr2[0] = Integer.valueOf(c415540GRc.getHeight());
        ViewGroup.LayoutParams layoutParams2 = c415540GRc.getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        } else {
            i2 = 0;
        }
        Integer numValueOf3 = Integer.valueOf(i2);
        if (numValueOf3.intValue() <= 0) {
            numValueOf3 = null;
        }
        numArr2[1] = numValueOf3;
        Integer numValueOf4 = Integer.valueOf(i - iAS);
        if (numValueOf4.intValue() > 0) {
            num = numValueOf4;
        }
        numArr2[2] = num;
        Integer numLIZJ2 = C1545950qKf.LIZJ(numArr2);
        if (numLIZJ2 == null) {
            return 0;
        }
        return numLIZJ2.intValue();
    }

    public final int LJI(int i) {
        int i2;
        int i3;
        C415540GRc c415540GRc = this.LIZ.LLILZ;
        Integer num = null;
        if (c415540GRc == null) {
            c415540GRc = null;
        }
        if (c415540GRc == null) {
            return 0;
        }
        if (LJIIIIZZ()) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(i);
            ViewGroup.LayoutParams layoutParams = c415540GRc.getLayoutParams();
            if (layoutParams != null) {
                i3 = layoutParams.width;
            } else {
                i3 = 0;
            }
            Integer numValueOf = Integer.valueOf(i3);
            if (numValueOf.intValue() > 0) {
                num = numValueOf;
            }
            numArr[1] = num;
            numArr[2] = Integer.valueOf(c415540GRc.getWidth());
            Integer numLIZJ = C1545950qKf.LIZJ(numArr);
            if (numLIZJ == null) {
                return 0;
            }
            return numLIZJ.intValue();
        }
        Integer[] numArr2 = new Integer[3];
        numArr2[0] = Integer.valueOf(c415540GRc.getWidth());
        ViewGroup.LayoutParams layoutParams2 = c415540GRc.getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.width;
        } else {
            i2 = 0;
        }
        Integer numValueOf2 = Integer.valueOf(i2);
        if (numValueOf2.intValue() > 0) {
            num = numValueOf2;
        }
        numArr2[1] = num;
        numArr2[2] = Integer.valueOf(i);
        Integer numLIZJ2 = C1545950qKf.LIZJ(numArr2);
        if (numLIZJ2 == null) {
            return 0;
        }
        return numLIZJ2.intValue();
    }

    public final C1542090qER LJII(Configuration configuration) {
        return C1545950qKf.LJ(LIZIZ(), configuration, this.LIZ.WR());
    }

    public final boolean LJIIIZ(Configuration configuration) {
        InterfaceC1545990qKj interfaceC1545990qKjLIZ;
        SparkPopupSchemaParam sparkPopupSchemaParamNR = this.LIZ.NR();
        if (sparkPopupSchemaParamNR == null || (interfaceC1545990qKjLIZ = C1542190qEb.LIZ()) == null || !interfaceC1545990qKjLIZ.LJFF()) {
            return false;
        }
        return C1545950qKf.LIZLLL(LIZIZ(), LJII(configuration).LIZ, sparkPopupSchemaParamNR.getEnableAutoAdaptation());
    }

    public final void LJIIJ(Configuration configuration) {
        if (LJIIIZ(configuration)) {
            if (LJIIIZ(configuration) && this.LIZ.MR() != null) {
                LJIIJJI(configuration);
                return;
            }
            return;
        }
        if (this.LIZ.MR() == null) {
            return;
        }
        SparkPopupSchemaParam sparkPopupSchemaParamNR = this.LIZ.NR();
        if (this.LIZIZ == null) {
            if (sparkPopupSchemaParamNR == null) {
                return;
            }
            if (!sparkPopupSchemaParamNR.getAutoAdaptActive() && sparkPopupSchemaParamNR.getAutoAdaptContentWidthPx() <= 0) {
                return;
            }
        }
        LJIIJJI(configuration);
    }

    public final void LJIIJJI(Configuration configuration) {
        LinearLayout linearLayoutMR;
        SparkPopup sparkPopup;
        C415540GRc c415540GRc;
        boolean z;
        LinearLayout linearLayoutMR2;
        SparkPopupSchemaParam sparkPopupSchemaParamNR;
        C16G1 c16g1;
        LinearLayout linearLayoutMR3;
        SparkPopupSchemaParam sparkPopupSchemaParamNR2;
        C16G1 c16g12;
        C16BC c16bc;
        int iLIZJ;
        SparkPopupSchemaParam sparkPopupSchemaParamNR3 = this.LIZ.NR();
        boolean z2 = false;
        if (sparkPopupSchemaParamNR3 != null) {
            boolean zLJIIIZ = LJIIIZ(configuration);
            sparkPopupSchemaParamNR3.setAutoAdaptActive(zLJIIIZ);
            if (zLJIIIZ) {
                iLIZJ = LIZJ(configuration);
            } else {
                iLIZJ = 0;
            }
            sparkPopupSchemaParamNR3.setAutoAdaptContentWidthPx(iLIZJ);
        }
        SparkPopupSchemaParam sparkPopupSchemaParamNR4 = this.LIZ.NR();
        if (sparkPopupSchemaParamNR4 != null && (linearLayoutMR = this.LIZ.MR()) != null && (c415540GRc = (sparkPopup = this.LIZ).LLILZ) != null) {
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior = sparkPopup.LLJJ;
            if (bottomSheetBehavior == null) {
                bottomSheetBehavior = null;
            }
            if (bottomSheetBehavior != null) {
                z = true;
            } else {
                z = false;
            }
            if (LJIIIZ(configuration)) {
                SparkPopup sparkPopup2 = this.LIZ;
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = sparkPopup2.LLJJ;
                if (bottomSheetBehavior2 != null && (linearLayoutMR3 = sparkPopup2.MR()) != null && (sparkPopupSchemaParamNR2 = this.LIZ.NR()) != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayoutMR3.getLayoutParams();
                    if (layoutParams instanceof C16G1) {
                        c16g12 = (C16G1) layoutParams;
                    } else {
                        c16g12 = null;
                    }
                    if (this.LIZIZ == null) {
                        if (c16g12 != null) {
                            c16bc = c16g12.LIZ;
                        } else {
                            c16bc = null;
                        }
                        this.LIZIZ = new C1546000qKk(c16bc, bottomSheetBehavior2.LJJIIJ);
                    }
                    if (c16g12 != null) {
                        c16g12.LIZIZ(null);
                        C786410Ut5.d6(linearLayoutMR3, c16g12);
                    }
                    Window windowWR = this.LIZ.WR();
                    this.LIZ.getActivity();
                    int iLIZIZ = C1549340qQ8.LIZIZ(windowWR, sparkPopupSchemaParamNR2, this.LIZ, true);
                    if (iLIZIZ > 0) {
                        bottomSheetBehavior2.setPeekHeight(iLIZIZ);
                        bottomSheetBehavior2.LJIJJLI = iLIZIZ;
                    }
                    bottomSheetBehavior2.LJIILLIIL = true;
                    bottomSheetBehavior2.setHideable(false);
                    bottomSheetBehavior2.LJIIZILJ = false;
                    bottomSheetBehavior2.LIZIZ(3, false);
                }
            } else {
                SparkPopup sparkPopup3 = this.LIZ;
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = sparkPopup3.LLJJ;
                if (bottomSheetBehavior3 != null && (linearLayoutMR2 = sparkPopup3.MR()) != null && (sparkPopupSchemaParamNR = this.LIZ.NR()) != null) {
                    C1546000qKk c1546000qKk = this.LIZIZ;
                    ViewGroup.LayoutParams layoutParams2 = linearLayoutMR2.getLayoutParams();
                    if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
                        if (c1546000qKk != null) {
                            c16g1.LIZIZ(c1546000qKk.LIZ);
                        }
                        C786410Ut5.d6(linearLayoutMR2, c16g1);
                    }
                    bottomSheetBehavior3.setHideable(sparkPopupSchemaParamNR.getEnablePullDownClose());
                    bottomSheetBehavior3.LJIIZILJ = sparkPopupSchemaParamNR.getDragByGesture();
                    bottomSheetBehavior3.LJIILLIIL = !sparkPopupSchemaParamNR.getDragBack();
                    bottomSheetBehavior3.LJIJJLI = sparkPopupSchemaParamNR.getDragHeight();
                    if (c1546000qKk != null) {
                        bottomSheetBehavior3.LIZIZ(c1546000qKk.LIZIZ, false);
                    }
                    this.LIZIZ = null;
                }
            }
            new C1545960qKg(linearLayoutMR, sparkPopupSchemaParamNR4).invoke();
            this.LIZ.iS(-1, true, false);
            new C1546190qL3(sparkPopupSchemaParamNR4, linearLayoutMR, this.LIZ.LLLI).invoke();
            if (!LJIIIZ(configuration) && z) {
                z2 = true;
            }
            new C1545980qKi(sparkPopupSchemaParamNR4, linearLayoutMR, c415540GRc, z2, sparkPopupSchemaParamNR4.getRealGravity(LIZIZ())).invoke();
            linearLayoutMR.requestLayout();
        }
    }

    public final void LJIIL(Configuration configuration) {
        SparkPopupSchemaParam sparkPopupSchemaParamNR = this.LIZ.NR();
        if (sparkPopupSchemaParamNR == null || !sparkPopupSchemaParamNR.getEnableAutoAdaptation()) {
            return;
        }
        C1542090qER c1542090qERLJII = LJII(configuration);
        sparkPopupSchemaParamNR.updateOrientationDependentParams(c1542090qERLJII.LJ, c1542090qERLJII.LIZJ, c1542090qERLJII.LIZLLL, LJIIIZ(configuration));
    }
}
