package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* JADX INFO: renamed from: X.0qEF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541970qEF {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ;
    public Configuration LIZJ;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public Integer LJII;
    public View LJIIIIZZ;
    public String LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public int LIZIZ = 1;
    public final C1542180qEa LIZLLL = new C1542180qEa();
    public final C1554470qYP LJIIIZ = new C1554470qYP(this, 2);
    public final ViewOnLayoutChangeListenerC1554380qYG LJIIJ = new ViewOnLayoutChangeListenerC1554380qYG(this, 1);
    public final int[] LJIILJJIL = new int[2];

    public final View LIZJ() {
        InterfaceC1541990qEH viewDelegate$spark_release = this.LIZ.getViewDelegate$spark_release();
        if (viewDelegate$spark_release != null) {
            return viewDelegate$spark_release.e1();
        }
        return null;
    }

    public final Context LIZLLL() {
        return this.LIZ.getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ() {
        /*
            r4 = this;
            X.0qEB r0 = r4.LIZ
            com.bytedance.hybrid.spark.SparkContext r1 = r0.LLILZLL
            r0 = 0
            if (r1 == 0) goto Lb
            X.0dfi r0 = r1.LJJIJLIJ()
        Lb:
            boolean r0 = r0 instanceof com.bytedance.hybrid.spark.page.SparkActivity
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L1f
            android.content.Context r1 = r4.LIZLLL()
        L15:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L4f
            boolean r0 = r1 instanceof com.bytedance.hybrid.spark.page.SparkActivity
            if (r0 == 0) goto L34
            if (r1 == 0) goto L4f
        L1f:
            X.0qKj r0 = X.C1542190qEb.LIZ()
            if (r0 == 0) goto L4e
            boolean r0 = r0.LJI()
            if (r0 != r3) goto L4e
            X.0qEB r0 = r4.LIZ
            com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPageSchemaParam r0 = r0.LJIILL()
            if (r0 != 0) goto L3b
            return r2
        L34:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L15
        L3b:
            boolean r2 = r0.getEnableAutoAdaptation()
            android.content.Context r1 = r4.LIZLLL()
            X.0qER r0 = r4.LJI()
            int r0 = r0.LIZ
            boolean r0 = X.C1545950qKf.LIZLLL(r1, r0, r2)
            return r0
        L4e:
            return r2
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541970qEF.LJIIIIZZ():boolean");
    }

    public final C1542080qEQ LJIIJ() {
        int iLJFF;
        int iLJ;
        SparkContext sparkContext = this.LIZ.LLILZLL;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext != null ? sparkContext.LJJIJLIJ() : null;
        SparkPopup sparkPopup = interfaceC1059280dfiLJJIJLIJ instanceof SparkPopup ? (SparkPopup) interfaceC1059280dfiLJJIJLIJ : null;
        int i = LJI().LIZJ;
        int i2 = LJI().LIZLLL;
        if (sparkPopup != null) {
            C1545970qKh c1545970qKhZR = sparkPopup.ZR();
            iLJFF = c1545970qKhZR.LJI(c1545970qKhZR.LJ());
            C1545970qKh c1545970qKhZR2 = sparkPopup.ZR();
            iLJ = c1545970qKhZR2.LJFF(c1545970qKhZR2.LIZLLL());
        } else {
            iLJFF = LJFF(i);
            iLJ = LJ();
        }
        return new C1542080qEQ(i, i2, iLJFF, iLJ);
    }

    public static boolean LJII() {
        InterfaceC1545990qKj interfaceC1545990qKjLIZ = C1542190qEb.LIZ();
        return !((interfaceC1545990qKjLIZ == null || interfaceC1545990qKjLIZ.LJ()) ? false : true);
    }

    public final void LIZ() {
        int iLIZIZ;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (!LJIIIIZZ()) {
            if (this.LJIIL || this.LJIILIIL != 0) {
                View viewLIZJ = LIZJ();
                ViewGroup.LayoutParams layoutParams3 = viewLIZJ != null ? viewLIZJ.getLayoutParams() : null;
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    layoutParams2.width = -1;
                    layoutParams2.gravity = 0;
                    C786410Ut5.W5(viewLIZJ, layoutParams2);
                    viewLIZJ.requestLayout();
                }
                this.LJIIL = false;
                this.LJIILIIL = 0;
                return;
            }
            return;
        }
        View viewLIZJ2 = LIZJ();
        if (viewLIZJ2 == null) {
            return;
        }
        int i = LJI().LIZJ;
        int i2 = LJI().LIZLLL;
        InterfaceC1545990qKj interfaceC1545990qKjLIZ = C1542190qEb.LIZ();
        if (interfaceC1545990qKjLIZ == null || (iLIZIZ = interfaceC1545990qKjLIZ.LIZIZ(i, i2)) <= 0) {
            return;
        }
        this.LJIILIIL = iLIZIZ;
        ViewGroup.LayoutParams layoutParams4 = viewLIZJ2.getLayoutParams();
        if (!(layoutParams4 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams4) == null) {
            layoutParams = new FrameLayout.LayoutParams(iLIZIZ, -1);
        }
        layoutParams.width = iLIZIZ;
        layoutParams.gravity = 1;
        C786410Ut5.W5(viewLIZJ2, layoutParams);
        this.LJIIL = true;
        viewLIZJ2.requestLayout();
    }

    public final void LIZIZ() {
        C1542080qEQ c1542080qEQLJIIJ = LJIIJ();
        C1542180qEa c1542180qEa = this.LIZLLL;
        int i = c1542080qEQLJIIJ.LIZ;
        int i2 = c1542080qEQLJIIJ.LIZIZ;
        int i3 = c1542080qEQLJIIJ.LIZJ;
        int i4 = c1542080qEQLJIIJ.LIZLLL;
        boolean z = c1542180qEa.LJ;
        if (z && i == c1542180qEa.LIZ && i2 == c1542180qEa.LIZIZ && i3 == c1542180qEa.LIZJ && i4 == c1542180qEa.LIZLLL) {
            return;
        }
        c1542180qEa.LIZ = i;
        c1542180qEa.LIZIZ = i2;
        c1542180qEa.LIZJ = i3;
        c1542180qEa.LIZLLL = i4;
        c1542180qEa.LJ = true;
        if (z) {
            LJIIJJI("viewSizeChanged");
        }
    }

    public final int LJ() {
        int iLIZIZ;
        int iIntValue;
        int i;
        int i2 = LJI().LIZLLL;
        if (i2 > 0) {
            Integer num = this.LJII;
            if (num != null) {
                iLIZIZ = num.intValue();
            } else {
                C1338790kwX c1338790kwX = C1338790kwX.LIZ;
                Context contextLIZLLL = LIZLLL();
                c1338790kwX.getClass();
                iLIZIZ = C1338790kwX.LIZIZ(contextLIZLLL);
            }
            if (iLIZIZ < 0) {
                iLIZIZ = 0;
            }
            Integer numValueOf = Integer.valueOf(i2 - iLIZIZ);
            if (numValueOf.intValue() <= 0 || (iIntValue = numValueOf.intValue()) <= 0 || (i = iIntValue - this.LJ) < 0) {
                return 0;
            }
            return i;
        }
        return 0;
    }

    public final C1542090qER LJI() {
        Resources resources;
        Context contextLIZLLL = LIZLLL();
        Configuration configuration = this.LIZJ;
        Window window = null;
        if (configuration == null) {
            Context contextLIZLLL2 = LIZLLL();
            configuration = (contextLIZLLL2 == null || (resources = contextLIZLLL2.getResources()) == null) ? null : resources.getConfiguration();
        }
        Context contextLIZLLL3 = LIZLLL();
        while (true) {
            if (!(contextLIZLLL3 instanceof ContextWrapper)) {
                break;
            }
            if (contextLIZLLL3 instanceof SparkActivity) {
                Activity activity = (Activity) contextLIZLLL3;
                if (activity != null) {
                    window = activity.getWindow();
                }
            } else {
                contextLIZLLL3 = ((ContextWrapper) contextLIZLLL3).getBaseContext();
            }
        }
        return C1545950qKf.LJ(contextLIZLLL, configuration, window);
    }

    public C1541970qEF(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public final int LJFF(int i) {
        boolean z;
        int iLIZIZ;
        if (!LJIIIIZZ()) {
            return i;
        }
        Integer numValueOf = Integer.valueOf(this.LJIILIIL);
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iLIZIZ = numValueOf.intValue();
        } else {
            int i2 = LJI().LIZJ;
            int i3 = LJI().LIZLLL;
            InterfaceC1545990qKj interfaceC1545990qKjLIZ = C1542190qEb.LIZ();
            if (interfaceC1545990qKjLIZ != null) {
                iLIZIZ = interfaceC1545990qKjLIZ.LIZIZ(i2, i3);
            } else {
                iLIZIZ = 0;
            }
        }
        Integer numValueOf2 = Integer.valueOf(iLIZIZ);
        if (numValueOf2.intValue() > 0) {
            return numValueOf2.intValue();
        }
        return i;
    }

    public final void LJIIIZ(WebKitView webKitView) {
        FrameLayout.LayoutParams layoutParams;
        webKitView.getClass();
        ViewGroup.LayoutParams layoutParams2 = webKitView.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        if (!this.LJIIL) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.gravity = 0;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(webKitView);
        webKitView.setLayoutParams(layoutParams);
        webKitView.requestLayout();
        webKitView.invalidate();
    }

    public final void LJIIJJI(String str) {
        if (!LJII()) {
            return;
        }
        C1542080qEQ c1542080qEQLJIIJ = LJIIJ();
        C1542090qER c1542090qERLJI = LJI();
        C1545950qKf.LIZIZ(LIZLLL(), this.LIZ.getViewDelegate$spark_release(), c1542090qERLJI.LIZ, c1542090qERLJI.LIZIZ, c1542080qEQLJIIJ.LIZJ, c1542080qEQLJIIJ.LIZLLL, str);
    }
}
