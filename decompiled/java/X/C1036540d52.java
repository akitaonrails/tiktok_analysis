package X;

import Y.AObserverS220S0100000_16;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS31S0010000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036540d52 implements InterfaceC1036280d4c {
    public static final int LJIILJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public final C19EG LIZ;
    public final Fragment LIZIZ;
    public final InterfaceC1036350d4j LIZJ;
    public final C1036360d4k LIZLLL;
    public C1250250idj LJ;
    public View LJFF;
    public TuxNavBar LJIIIIZZ;
    public int LJIIIZ;
    public C419910GdJ LJIIJJI;
    public C419910GdJ LJIIL;
    public C419910GdJ LJIILIIL;
    public EnumC1036120d4M LJI = EnumC1036120d4M.DEFAULT;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(199));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 325));

    @Override // X.InterfaceC1036280d4c
    public final void LIZ() {
    }

    public final Integer LJI() {
        Context contextLIZIZ = this.LIZ;
        C1036360d4k c1036360d4k = this.LIZLLL;
        if ((c1036360d4k != null ? c1036360d4k.LJFF : null) == EnumC1036160d4Q.FROM_SPLIT_SCREEN) {
            contextLIZIZ = C1385040m98.LIZIZ(contextLIZIZ);
        }
        return this.LJI.isImmersion() ? C1308910kAL.LIZJ(R.attr.bx, contextLIZIZ) : C1308910kAL.LIZJ(R.attr.a1h, contextLIZIZ);
    }

    public final void LJII() {
        if (this.LJI.isFullScreen()) {
            if (this.LJI.isImmersion()) {
                InterfaceC1036350d4j interfaceC1036350d4j = this.LIZJ;
                if (interfaceC1036350d4j != null) {
                    interfaceC1036350d4j.LIZLLL(0, Boolean.TRUE, null);
                    return;
                }
                return;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this.LIZ);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                InterfaceC1036350d4j interfaceC1036350d4j2 = this.LIZJ;
                if (interfaceC1036350d4j2 != null) {
                    interfaceC1036350d4j2.LIZLLL(iIntValue, Boolean.TRUE, null);
                }
            }
        }
    }

    @Override // X.InterfaceC1036280d4c
    public final void onDestroy() {
        InterfaceC1036350d4j interfaceC1036350d4j;
        C1036360d4k c1036360d4k = this.LIZLLL;
        if ((c1036360d4k != null ? c1036360d4k.LJFF : null) == EnumC1036160d4Q.FROM_SCROLL_VIEW_PAGER || (interfaceC1036350d4j = this.LIZJ) == null) {
            return;
        }
        interfaceC1036350d4j.LIZLLL(0, Boolean.TRUE, Boolean.FALSE);
    }

    @Override // X.InterfaceC1036280d4c
    public final void LIZIZ(float f) {
        LJIIIIZZ(f);
    }

    @Override // X.InterfaceC1036280d4c
    public final void LIZJ(int i) {
        TuxNavBar tuxNavBar = this.LJIIIIZZ;
        TuxNavBar tuxNavBar2 = null;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        tuxNavBar.LJJ(new AwS31S0010000_16(10), "navBarShoppingCart");
        if (i > 0) {
            TuxNavBar tuxNavBar3 = this.LJIIIIZZ;
            if (tuxNavBar3 != null) {
                tuxNavBar2 = tuxNavBar3;
            }
            tuxNavBar2.LJIILLIIL(1, i, "navBarShoppingCart");
            return;
        }
        TuxNavBar tuxNavBar4 = this.LJIIIIZZ;
        if (tuxNavBar4 != null) {
            tuxNavBar2 = tuxNavBar4;
        }
        tuxNavBar2.LJIIIZ("navBarShoppingCart");
    }

    @Override // X.InterfaceC1036280d4c
    public final void LIZLLL(int i) {
        TuxNavBar tuxNavBar = null;
        if (Intrinsics.LJFF("navBarBack", "navBarBack")) {
            C419910GdJ c419910GdJ = this.LJIIJJI;
            if (c419910GdJ != null) {
                c419910GdJ.LIZ = i;
            }
            TuxNavBar tuxNavBar2 = this.LJIIIIZZ;
            if (tuxNavBar2 != null) {
                tuxNavBar = tuxNavBar2;
            }
            tuxNavBar.LJJ(new AwS595S0100000_16(this, 315), "navBarBack");
            return;
        }
        if (!Intrinsics.LJFF("navBarBack", "navBarMore")) {
            return;
        }
        C419910GdJ c419910GdJ2 = this.LJIIL;
        if (c419910GdJ2 != null) {
            c419910GdJ2.LIZ = i;
        }
        TuxNavBar tuxNavBar3 = this.LJIIIIZZ;
        if (tuxNavBar3 != null) {
            tuxNavBar = tuxNavBar3;
        }
        tuxNavBar.LJJ(new AwS595S0100000_16(this, 310), "navBarMore");
    }

    @Override // X.InterfaceC1036280d4c
    public final void LJFF(C1318590kPx c1318590kPx) {
        int iIntValue;
        int iIntValue2;
        EnumC1036120d4M enumC1036120d4M = this.LJI;
        EnumC1036120d4M enumC1036120d4M2 = EnumC1036120d4M.FULLSCREEN_IMMERSION;
        if ((enumC1036120d4M == enumC1036120d4M2 || enumC1036120d4M == EnumC1036120d4M.SPLIT_SCREEN_IMMERSION) && (c1318590kPx instanceof C1318590kPx)) {
            TuxNavBar tuxNavBar = null;
            if (c1318590kPx.getRealScrollY() == 0) {
                TuxNavBar tuxNavBar2 = this.LJIIIIZZ;
                if (tuxNavBar2 == null) {
                    tuxNavBar2 = null;
                }
                tuxNavBar2.setNavBackground(0);
                if (this.LJI == EnumC1036120d4M.SPLIT_SCREEN_IMMERSION) {
                    View view = this.LJFF;
                    if (view != null) {
                        C786410Ut5.T4(view, 0.0f);
                    }
                    View view2 = this.LJFF;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                    TuxNavBar tuxNavBar3 = this.LJIIIIZZ;
                    if (tuxNavBar3 == null) {
                        tuxNavBar3 = null;
                    }
                    C786410Ut5.LLLLZLLLI(tuxNavBar3, 8);
                }
                if (this.LJI == enumC1036120d4M2) {
                    InterfaceC1036350d4j interfaceC1036350d4j = this.LIZJ;
                    if (interfaceC1036350d4j != null) {
                        interfaceC1036350d4j.LIZLLL(0, null, null);
                        return;
                    }
                    return;
                }
                InterfaceC1036350d4j interfaceC1036350d4j2 = this.LIZJ;
                if (interfaceC1036350d4j2 == null) {
                    return;
                }
                interfaceC1036350d4j2.LIZLLL(0, null, Boolean.FALSE);
                return;
            }
            float realScrollY = c1318590kPx.getRealScrollY() / (C12ES.LJIIJJI(c1318590kPx.getContext()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
            if (realScrollY > 1.0f) {
                realScrollY = 1.0f;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, c1318590kPx.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 16777215;
            }
            int iLJIIL = C2441009hQ.LJIIL(iIntValue, (int) (255 * realScrollY));
            TuxNavBar tuxNavBar4 = this.LJIIIIZZ;
            if (tuxNavBar4 == null) {
                tuxNavBar4 = null;
            }
            C786410Ut5.LLLLZLLLI(tuxNavBar4, 0);
            TuxNavBar tuxNavBar5 = this.LJIIIIZZ;
            if (tuxNavBar5 == null) {
                tuxNavBar5 = null;
            }
            tuxNavBar5.setNavBackground(iLJIIL);
            if (this.LJI == enumC1036120d4M2) {
                InterfaceC1036350d4j interfaceC1036350d4j3 = this.LIZJ;
                if (interfaceC1036350d4j3 != null) {
                    interfaceC1036350d4j3.LIZLLL(iLJIIL, Boolean.TRUE, null);
                }
            } else {
                InterfaceC1036350d4j interfaceC1036350d4j4 = this.LIZJ;
                if (interfaceC1036350d4j4 != null) {
                    interfaceC1036350d4j4.LIZLLL(iLJIIL, null, Boolean.TRUE);
                }
                View view3 = this.LJFF;
                if (view3 != null) {
                    C786410Ut5.T4(view3, 1.0f);
                }
                View view4 = this.LJFF;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
                View view5 = this.LJFF;
                if (view5 != null) {
                    view5.setBackgroundColor(iLJIIL);
                }
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, c1318590kPx.getContext());
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, c1318590kPx.getContext());
            if (realScrollY < 0.5f) {
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = -1;
                }
            } else if (numLIZJ3 != null) {
                iIntValue2 = numLIZJ3.intValue();
            } else {
                iIntValue2 = -16777216;
            }
            C1036550d53 c1036550d53 = new C1036550d53(this, iIntValue2);
            TuxNavBar tuxNavBar6 = this.LJIIIIZZ;
            if (tuxNavBar6 == null) {
                tuxNavBar6 = null;
            }
            tuxNavBar6.LJJ(new AwS595S0100000_16(c1036550d53, 312), "navBarBack");
            TuxNavBar tuxNavBar7 = this.LJIIIIZZ;
            if (tuxNavBar7 == null) {
                tuxNavBar7 = null;
            }
            tuxNavBar7.LJJ(new AwS595S0100000_16(c1036550d53, 313), "navBarMore");
            TuxNavBar tuxNavBar8 = this.LJIIIIZZ;
            if (tuxNavBar8 != null) {
                tuxNavBar = tuxNavBar8;
            }
            tuxNavBar.LJJ(new AwS595S0100000_16(c1036550d53, 314), "navBarShoppingCart");
        }
    }

    public final void LJIIIIZZ(float f) {
        FrameLayout frameLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxNavBar tuxNavBar = this.LJIIIIZZ;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        EnumC1036160d4Q enumC1036160d4Q = null;
        marginLayoutParams2 = null;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        ViewParent parent = tuxNavBar.getParent();
        if ((parent instanceof FrameLayout) && (frameLayout = (FrameLayout) parent) != null) {
            if (this.LJI.isFullScreen()) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    C1036360d4k c1036360d4k = this.LIZLLL;
                    if (c1036360d4k != null) {
                        enumC1036160d4Q = c1036360d4k.LJFF;
                    }
                    if (enumC1036160d4Q == EnumC1036160d4Q.FROM_SPLIT_SCREEN) {
                        marginLayoutParams.topMargin = (int) (this.LJIIIZ * f);
                    } else {
                        marginLayoutParams.topMargin = this.LJIIIZ;
                    }
                    marginLayoutParams2 = marginLayoutParams;
                }
                C786410Ut5.a6(frameLayout, marginLayoutParams2);
            }
            if (this.LJI == EnumC1036120d4M.SPLIT_SCREEN_NON_IMMERSION) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                layoutParams2.height = 0;
                C786410Ut5.a6(frameLayout, layoutParams2);
            }
        }
    }

    @Override // X.InterfaceC1036280d4c
    public final void LJ(TuxNavBar tuxNavBar, EnumC1036120d4M enumC1036120d4M) {
        Context context;
        EnumC1036160d4Q enumC1036160d4Q;
        int i;
        EnumC1036160d4Q enumC1036160d4Q2;
        EnumC1036160d4Q enumC1036160d4Q3;
        C1036360d4k c1036360d4k;
        String str;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayout;
        String str2;
        View view;
        this.LJI = enumC1036120d4M;
        this.LJIIIIZZ = tuxNavBar;
        Object parent = tuxNavBar.getParent();
        String str3 = null;
        if ((parent instanceof FrameLayout) && (view = (View) parent) != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        this.LJIIIZ = C12ES.LJIIJJI(context);
        C1036360d4k c1036360d4k2 = this.LIZLLL;
        if (c1036360d4k2 != null) {
            enumC1036160d4Q = c1036360d4k2.LJFF;
        } else {
            enumC1036160d4Q = null;
        }
        if (enumC1036160d4Q == EnumC1036160d4Q.FROM_SPLIT_SCREEN) {
            TuxNavBar tuxNavBar2 = this.LJIIIIZZ;
            if (tuxNavBar2 == null) {
                tuxNavBar2 = null;
            }
            tuxNavBar2.LJIJ(C1385040m98.LIZLLL(this.LIZ));
        }
        TuxNavBar tuxNavBar3 = this.LJIIIIZZ;
        if (tuxNavBar3 == null) {
            tuxNavBar3 = null;
        }
        C0OM1 c0om1 = new C0OM1();
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (this.LJI.isFullScreen()) {
            i = R.raw.icon_chevron_left_offset_ltr;
        } else {
            i = R.raw.icon_x_mark;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZLLL = LJI();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LJIIJJI = c419910GdJ;
        c1251150ifB.LIZIZ(c419910GdJ);
        c1251150ifB.LIZIZ = "navBarBack";
        c1251150ifB.LIZJ(new AwS560S0100000_16(this, c1251150ifB, 813));
        abstractC1250290idnArr[0] = c1251150ifB;
        c0om1.LJ(abstractC1250290idnArr);
        EnumC1036120d4M enumC1036120d4M2 = this.LJI;
        EnumC1036120d4M enumC1036120d4M3 = EnumC1036120d4M.SPLIT_SCREEN_IMMERSION;
        if (enumC1036120d4M2 != enumC1036120d4M3 && enumC1036120d4M2 != EnumC1036120d4M.FULLSCREEN_IMMERSION) {
            C1250250idj c1250250idj = new C1250250idj();
            C1036360d4k c1036360d4k3 = this.LIZLLL;
            if (c1036360d4k3 == null || (str2 = c1036360d4k3.LIZ) == null) {
                str2 = "";
            }
            c1250250idj.LIZJ = str2;
            this.LJ = c1250250idj;
            c0om1.LIZJ = c1250250idj;
        }
        ArrayList arrayList = new ArrayList();
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_shopping_cart_ltr;
        c419910GdJ2.LIZLLL = LJI();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LJIILIIL = c419910GdJ2;
        c1251150ifB2.LIZIZ(c419910GdJ2);
        c1251150ifB2.LJI = false;
        c1251150ifB2.LIZIZ = "navBarShoppingCart";
        c1251150ifB2.LIZJ(new AwS560S0100000_16(this, c1251150ifB2, 812));
        arrayList.add(c1251150ifB2);
        C1251150ifB c1251150ifB3 = new C1251150ifB();
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_ellipsis_horizontal;
        c419910GdJ3.LIZLLL = LJI();
        c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LJIIL = c419910GdJ3;
        c1251150ifB3.LIZIZ(c419910GdJ3);
        c1251150ifB3.LIZIZ = "navBarMore";
        c1251150ifB3.LIZJ(new AwS417S0200000_16(this, c1251150ifB3, 85));
        arrayList.add(c1251150ifB3);
        c0om1.LIZ(arrayList);
        tuxNavBar3.setNavActions(c0om1);
        if (this.LJI.isImmersion()) {
            TuxNavBar tuxNavBar4 = this.LJIIIIZZ;
            if (tuxNavBar4 == null) {
                tuxNavBar4 = null;
            }
            tuxNavBar4.setNavBackground(0);
        }
        LJIIIIZZ(0.0f);
        if (this.LJI == enumC1036120d4M3) {
            TuxNavBar tuxNavBar5 = this.LJIIIIZZ;
            if (tuxNavBar5 == null) {
                tuxNavBar5 = null;
            }
            tuxNavBar5.setNavBackground(0);
            TuxNavBar tuxNavBar6 = this.LJIIIIZZ;
            if (tuxNavBar6 == null) {
                tuxNavBar6 = null;
            }
            C786410Ut5.LLLLZLLLI(tuxNavBar6, 8);
            TuxNavBar tuxNavBar7 = this.LJIIIIZZ;
            if (tuxNavBar7 == null) {
                tuxNavBar7 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = tuxNavBar7.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.gravity = 80;
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            } else {
                layoutParams = null;
            }
            C786410Ut5.S6(tuxNavBar7, layoutParams);
            TuxNavBar tuxNavBar8 = this.LJIIIIZZ;
            if (tuxNavBar8 == null) {
                tuxNavBar8 = null;
            }
            ViewParent parent2 = tuxNavBar8.getParent();
            if ((parent2 instanceof FrameLayout) && (frameLayout = (FrameLayout) parent2) != null) {
                View view2 = new View(frameLayout.getContext());
                this.LJFF = view2;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C12ES.LJIIJ(frameLayout.getContext()), C12ES.LJIIJJI(frameLayout.getContext()));
                layoutParams3.gravity = 48;
                frameLayout.addView(view2, 0, layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
                layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)) + C12ES.LJIIJJI(this.LIZ);
                C786410Ut5.a6(frameLayout, layoutParams4);
            }
            View view3 = this.LJFF;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            View view4 = this.LJFF;
            if (view4 != null) {
                view4.setBackgroundColor(0);
            }
        }
        C1036360d4k c1036360d4k4 = this.LIZLLL;
        if (c1036360d4k4 != null) {
            enumC1036160d4Q2 = c1036360d4k4.LJFF;
        } else {
            enumC1036160d4Q2 = null;
        }
        EnumC1036160d4Q enumC1036160d4Q4 = EnumC1036160d4Q.FROM_SCROLL_VIEW_PAGER;
        if (enumC1036160d4Q2 != enumC1036160d4Q4) {
            if (this.LJI == EnumC1036120d4M.FULLSCREEN_IMMERSION) {
                C1250250idj c1250250idj2 = this.LJ;
                if (c1250250idj2 != null) {
                    c1250250idj2.LIZJ = "";
                }
                TuxNavBar tuxNavBar9 = this.LJIIIIZZ;
                if (tuxNavBar9 == null) {
                    tuxNavBar9 = null;
                }
                tuxNavBar9.setNavBackground(0);
            }
            LJII();
        }
        C1036360d4k c1036360d4k5 = this.LIZLLL;
        if (c1036360d4k5 != null) {
            enumC1036160d4Q3 = c1036360d4k5.LJFF;
        } else {
            enumC1036160d4Q3 = null;
        }
        if (enumC1036160d4Q3 == enumC1036160d4Q4) {
            C486860J7k.LIZIZ(this.LIZ).IQ2(this.LIZ, new AObserverS220S0100000_16(this, 8));
        }
        EnumC1036120d4M enumC1036120d4M4 = this.LJI;
        if ((enumC1036120d4M4 == EnumC1036120d4M.FULLSCREEN_NON_IMMERSION || enumC1036120d4M4 == EnumC1036120d4M.SPLIT_SCREEN_NON_IMMERSION) && (c1036360d4k = this.LIZLLL) != null && (str = c1036360d4k.LIZJ) != null && str.length() != 0) {
            C1036360d4k c1036360d4k6 = this.LIZLLL;
            if (c1036360d4k6 != null) {
                str3 = c1036360d4k6.LIZJ;
            }
            C1331660kl2.LJI(UriProtector.parse(str3)).LJIILLIIL(new AbstractC438570HHr() { // from class: X.0HHq
                @Override // X.InterfaceC605070NoH
                public final void LIZ(File file) {
                    File absoluteFile;
                    Object c098200Yq;
                    SpannableString spannableString;
                    String str4;
                    String str5;
                    if (file != null && (absoluteFile = file.getAbsoluteFile()) != null) {
                        C1036540d52 c1036540d52 = this.LIZ;
                        try {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(WebpBitmapFactoryImpl.hookDecodeFile(absoluteFile.getAbsolutePath())) { // from class: X.0GVx
                                public final Paint LIZ;

                                {
                                    super(bitmap);
                                    Paint paint = new Paint();
                                    this.LIZ = paint;
                                    int width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    Matrix matrix = new Matrix();
                                    float f = C1036540d52.LJIILJJIL * 1.0f;
                                    matrix.postScale(f / width, f / height);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                                    paint.setAntiAlias(true);
                                }

                                @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
                                public final void draw(Canvas canvas) {
                                    int i2 = C1036540d52.LJIILJJIL;
                                    int i3 = C1036540d52.LJIILJJIL;
                                    canvas.drawCircle(i3 / 2.0f, i3 / 2.0f, (i3 / 2.0f) - 4.0f, this.LIZ);
                                }
                            };
                            int i2 = C1036540d52.LJIILJJIL;
                            bitmapDrawable.setBounds(new Rect(0, 0, i2, i2));
                            C419890GdH c419890GdH = new C419890GdH(bitmapDrawable, 2);
                            String str6 = "";
                            if (!C426750GoL.LIZLLL(c1036540d52.LIZ)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(' ');
                                C1036360d4k c1036360d4k7 = c1036540d52.LIZLLL;
                                if (c1036360d4k7 != null && (str5 = c1036360d4k7.LIZ) != null) {
                                    str6 = str5;
                                }
                                sbLIZ.append(str6);
                                spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                                c419890GdH.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), false);
                                C786410Ut5.p2(spannableString, c419890GdH, 0, 1, 18);
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                C1036360d4k c1036360d4k8 = c1036540d52.LIZLLL;
                                if (c1036360d4k8 != null && (str4 = c1036360d4k8.LIZ) != null) {
                                    str6 = str4;
                                }
                                sbLIZ2.append(str6);
                                sbLIZ2.append(' ');
                                spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
                                c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, true);
                                C786410Ut5.p2(spannableString, c419890GdH, spannableString.length() - 1, spannableString.length(), 18);
                            }
                            C1250250idj c1250250idj3 = c1036540d52.LJ;
                            c098200Yq = null;
                            TuxNavBar tuxNavBar10 = null;
                            if (c1250250idj3 != null) {
                                c1250250idj3.LIZJ = spannableString;
                                TuxNavBar tuxNavBar11 = c1036540d52.LJIIIIZZ;
                                if (tuxNavBar11 != null) {
                                    tuxNavBar10 = tuxNavBar11;
                                }
                                tuxNavBar10.LJIJJ(c1250250idj3);
                                c098200Yq = Unit.LIZ;
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m1boximpl(c098200Yq);
                    }
                }
            });
        }
    }

    public C1036540d52(C19EG c19eg, Fragment fragment, InterfaceC1036350d4j interfaceC1036350d4j, C1036360d4k c1036360d4k) {
        this.LIZ = c19eg;
        this.LIZIZ = fragment;
        this.LIZJ = interfaceC1036350d4j;
        this.LIZLLL = c1036360d4k;
    }
}
