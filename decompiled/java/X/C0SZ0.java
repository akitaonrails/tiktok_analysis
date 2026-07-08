package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SZ0 extends AbstractC731360SmU {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final boolean LIZIZ = C2174761A9i.LIZIZ();
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public View LJFF;
    public View LJI;
    public View LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public View LJIIL;
    public View LJIILIIL;
    public View LJIILJJIL;
    public TouchDelegate LJIILL;

    @Override // X.AbstractC731360SmU
    public void LIZ() {
        View view = this.LIZJ;
        if (view != null) {
            C426750GoL.LJIIIZ(view, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(5.5f)))), null, false, 27);
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            C618720OOo.LIZIZ(view2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53)), -2);
        }
        View view3 = this.LJIILIIL;
        if (view3 != null) {
            C618720OOo.LIZIZ(view3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)));
        }
        View view4 = this.LJIIJ;
        if (view4 != null) {
            C618720OOo.LIZIZ(view4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(26.5f))));
        }
        View view5 = this.LJIIJJI;
        if (view5 != null) {
            C618720OOo.LIZIZ(view5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        }
        View view6 = this.LJIIL;
        if (view6 != null) {
            C618720OOo.LIZIZ(view6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(41.5f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(37.5f))));
        }
        View view7 = this.LJFF;
        if (view7 != null) {
            C618720OOo.LIZIZ(view7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        }
        LJ(AFwS243S0000000_11.get$arr$(628));
        View view8 = this.LJI;
        if (view8 != null) {
            C618720OOo.LIZIZ(view8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53)));
            C426750GoL.LJIIIZ(view8, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), null, null, false, 29);
        }
        if (C2533509wL.LIZ()) {
            View view9 = this.LJ;
            if (view9 != null) {
                C426750GoL.LJIIL(view9, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 23);
                C618720OOo.LIZIZ(view9, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                C426750GoL.LJIIIZ(view9, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), null, null, false, 29);
                return;
            }
            return;
        }
        View view10 = this.LJ;
        if (view10 != null) {
            C618720OOo.LIZIZ(view10, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), -2);
            C426750GoL.LJIIL(view10, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 23);
            C426750GoL.LJIIIZ(view10, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), null, null, false, 29);
        }
    }

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(!C0HCN.LIZJ() ? 16 : 12)));
    }

    public static void LJI(View view) {
        if (view == null) {
            return;
        }
        int i = view.getLayoutParams().width;
        int i2 = view.getLayoutParams().height;
        if (i > 0 && i % 2 == 0) {
            i++;
        }
        if (i2 > 0 && i2 % 2 == 0) {
            i2++;
        }
        C618720OOo.LIZIZ(view, i, i2);
    }

    public final void LJ(Function1<? super View, Unit> function1) {
        View view = this.LJII;
        if (view != null) {
            function1.invoke(view);
        }
        View view2 = this.LJIILJJIL;
        if (view2 != null) {
            function1.invoke(view2);
        }
        View view3 = this.LJIIIIZZ;
        if (view3 != null) {
            function1.invoke(view3);
        }
        View view4 = this.LJIIIZ;
        if (view4 != null) {
            function1.invoke(view4);
        }
    }

    public void LJII(C731160SmA c731160SmA) {
        int i;
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        RelativeLayout relativeLayout;
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams3;
        RelativeLayout.LayoutParams layoutParams4;
        RelativeLayout relativeLayout2;
        C1609500rzA c1609500rzA;
        Context context;
        View view;
        ViewGroup.LayoutParams layoutParams5;
        RelativeLayout.LayoutParams layoutParams6;
        RelativeLayout relativeLayout3;
        ViewGroup.LayoutParams layoutParams7;
        RelativeLayout.LayoutParams layoutParams8;
        RelativeLayout relativeLayout4;
        C732110Snh.LJI("avatar helper, hot changed, has setOnTouchListener");
        boolean z = false;
        if (c731160SmA.LJI) {
            C732110Snh.LJI("avatar helper, small screen");
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            if (this.LIZIZ || (c731160SmA.LJIILIIL && C2174771A9j.LIZJ())) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ)));
            }
            View view2 = this.LIZLLL;
            if (view2 != null) {
                C618720OOo.LIZIZ(view2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.getOrDefault(c731160SmA.LIZ)))), -2);
                C426750GoL.LJIIL(view2, Integer.valueOf(iLIZIZ2), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, 28);
                C426750GoL.LJIIIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZLLL)))), null, false, 26);
            }
            View view3 = this.LJIILIIL;
            if (view3 != null) {
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(45.0f)));
                C618720OOo.LIZIZ(view3, iLIZIZ3, iLIZIZ3);
            }
            View view4 = this.LJIIJ;
            if (view4 != null) {
                C618720OOo.LIZIZ(view4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(53.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(26.5f))));
            }
            View view5 = this.LJIIJJI;
            if (view5 != null) {
                C618720OOo.LIZIZ(view5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(40.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
            }
            View view6 = this.LJIIL;
            if (view6 != null) {
                C618720OOo.LIZIZ(view6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(41.5f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(37.5f))));
            }
            View view7 = this.LJFF;
            if (view7 != null) {
                C618720OOo.LIZIZ(view7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            }
            LJ(new AwS590S0100000_11(c731160SmA, 407));
            View view8 = this.LJI;
            if (view8 != null) {
                if (this.LIZIZ || (c731160SmA.LJIILIIL && C2174771A9j.LIZJ())) {
                    C618720OOo.LIZIZ(view8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))));
                    C426750GoL.LJIIIZ(view8, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
                } else {
                    C618720OOo.LIZIZ(view8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))));
                    C426750GoL.LJIIIZ(view8, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), null, null, false, 29);
                }
            }
            if (C2533509wL.LIZ()) {
                if (this.LIZIZ || (c731160SmA.LJIILIIL && C2174771A9j.LIZJ())) {
                    View view9 = this.LJ;
                    if (view9 != null) {
                        C618720OOo.LIZIZ(view9, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_FOLLOW_SMALL.get()))));
                        float f = c731160SmA.LIZ;
                        float f2 = c731160SmA.LIZIZ;
                        float f3 = ((f - f2) / 2) + f2;
                        EnumC2174751A9h enumC2174751A9h = EnumC2174751A9h.AREA_HEIGHT_AVATAR_SMALL;
                        C426750GoL.LJIIL(view9, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((f3 - enumC2174751A9h.get()) - 12)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 20);
                        C426750GoL.LJIIIZ(view9, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get())))), null, null, false, 29);
                        View view10 = this.LJ;
                        if (view10 != null) {
                            layoutParams7 = view10.getLayoutParams();
                        } else {
                            layoutParams7 = null;
                        }
                        if ((layoutParams7 instanceof RelativeLayout.LayoutParams) && (layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7) != null) {
                            layoutParams8.removeRule(14);
                        } else {
                            layoutParams8 = null;
                        }
                        C786410Ut5.W5(view9, layoutParams8);
                        if ((view9 instanceof RelativeLayout) && (relativeLayout4 = (RelativeLayout) view9) != null) {
                            relativeLayout4.setGravity(1);
                        }
                    }
                } else {
                    View view11 = this.LJ;
                    if (view11 != null) {
                        C426750GoL.LJIIL(view11, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LJ)))), 23);
                        C618720OOo.LIZIZ(view11, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
                        C426750GoL.LJIIIZ(view11, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), null, null, false, 29);
                    }
                }
            } else {
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                if (this.LIZ) {
                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                }
                View view12 = this.LJ;
                if (view12 != null) {
                    if (this.LIZIZ || (c731160SmA.LJIILIIL && C2174771A9j.LIZJ())) {
                        C618720OOo.LIZIZ(view12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_FOLLOW_SMALL.get()))));
                        float f4 = c731160SmA.LIZ;
                        float f5 = c731160SmA.LIZIZ;
                        float f6 = ((f4 - f5) / 2) + f5;
                        EnumC2174751A9h enumC2174751A9h2 = EnumC2174751A9h.AREA_HEIGHT_AVATAR_SMALL;
                        C426750GoL.LJIIL(view12, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((f6 - enumC2174751A9h2.get()) - 12)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 20);
                        C426750GoL.LJIIIZ(view12, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get())))), null, null, false, 29);
                        View view13 = this.LJ;
                        if (view13 != null) {
                            layoutParams5 = view13.getLayoutParams();
                        } else {
                            layoutParams5 = null;
                        }
                        if ((layoutParams5 instanceof RelativeLayout.LayoutParams) && (layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5) != null) {
                            layoutParams6.removeRule(14);
                        } else {
                            layoutParams6 = null;
                        }
                        C786410Ut5.W5(view12, layoutParams6);
                        if ((view12 instanceof RelativeLayout) && (relativeLayout3 = (RelativeLayout) view12) != null) {
                            relativeLayout3.setGravity(1);
                        }
                    } else {
                        C426750GoL.LJIIL(view12, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LJ)))), 23);
                        C618720OOo.LIZIZ(view12, iLIZIZ4, -2);
                        C426750GoL.LJIIIZ(view12, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), null, null, false, 29);
                    }
                }
            }
            if (this.LIZIZ || (c731160SmA.LJIILIIL && C2174771A9j.LIZJ())) {
                LJFF(iLIZIZ2, this.LJ);
            }
        } else {
            C732110Snh.LJI("avatar helper, big screen");
            EnumC2174751A9h enumC2174751A9h3 = EnumC2174751A9h.AREA_WIDTH;
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h3.get()))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            View view14 = this.LIZLLL;
            if (view14 != null) {
                C426750GoL.LJIIIZ(view14, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZLLL)))), null, false, 26);
                C618720OOo.LIZIZ(view14, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h3.getOrDefault(60.0f)))), -2);
                if (this.LIZIZ) {
                    C426750GoL.LJIIL(view14, Integer.valueOf(iLIZIZ5), null, null, null, 30);
                }
            }
            LJ(new C723330SYx(c731160SmA));
            View view15 = this.LJI;
            if (view15 != null) {
                if (this.LIZIZ) {
                    C618720OOo.LIZIZ(view15, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h3.get()))), -2);
                    C426750GoL.LJIIIZ(view15, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
                } else {
                    C618720OOo.LIZIZ(view15, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))), -2);
                }
            }
            View view16 = this.LJII;
            if (view16 != null && (context = view16.getContext()) != null && !C0SXF.LJIL(context)) {
                z = true;
            }
            if (z) {
                View view17 = this.LJIILJJIL;
                if (view17 != null) {
                    C426750GoL.LJIIIZ(view17, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 23);
                }
                View view18 = this.LJIILIIL;
                if (view18 != null) {
                    C426750GoL.LJIIIZ(view18, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 23);
                }
                i = 4;
            } else {
                i = 7;
            }
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            float fLJJIIZI = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJIIZI(48.0f - c731160SmA.LIZIZ);
            View view19 = this.LJIIJJI;
            if (view19 != null) {
                C618720OOo.LIZIZ(view19, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZIZ))));
            }
            if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
                iLIZIZ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJIJJLI();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
            }
            View view20 = this.LJIILIIL;
            if (view20 != null) {
                C618720OOo.LIZIZ(view20, iLIZIZ, iLIZIZ);
            }
            View view21 = this.LJIILIIL;
            if ((view21 instanceof C1609500rzA) && (c1609500rzA = (C1609500rzA) view21) != null) {
                c1609500rzA.setRingStrokeWidthByAvatarSize(44);
            }
            View view22 = this.LJIIJ;
            if (view22 != null) {
                C618720OOo.LIZIZ(view22, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))) / 2);
            }
            View view23 = this.LJIIJ;
            if (view23 != null) {
                C426750GoL.LJIIL(view23, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), null, null, 29);
            }
            float f7 = 4 + fLJJIIZI;
            if (this.LIZIZ) {
                View view24 = this.LIZLLL;
                if (view24 != null) {
                    C426750GoL.LJIIIZ(view24, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f7)))), null, null, false, 29);
                }
            } else {
                View view25 = this.LJI;
                if (view25 != null) {
                    C426750GoL.LJIIIZ(view25, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f7)))), null, null, false, 29);
                }
            }
            if (C2533509wL.LIZ()) {
                View view26 = this.LJFF;
                if (view26 != null) {
                    i2 = 2;
                    i3 = 14;
                    C426750GoL.LJIIIZ(view26, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, false, 16);
                } else {
                    i2 = 2;
                    i3 = 14;
                }
                if (this.LIZIZ) {
                    float f8 = c731160SmA.LIZIZ;
                    float f9 = (i / i2) + f8 + ((54 - f8) / i2);
                    EnumC2174751A9h enumC2174751A9h4 = EnumC2174751A9h.AREA_HEIGHT_AVATAR;
                    int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((f9 - enumC2174751A9h4.get()) - 12) - 1)));
                    View view27 = this.LJ;
                    if (view27 != null) {
                        C618720OOo.LIZIZ(view27, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h3.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_FOLLOW.get()))));
                        C426750GoL.LJIIL(view27, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(iLIZIZ6), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 20);
                        C426750GoL.LJIIIZ(view27, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h4.get())))), null, null, false, 29);
                        View view28 = this.LJ;
                        if (view28 != null) {
                            layoutParams3 = view28.getLayoutParams();
                        } else {
                            layoutParams3 = null;
                        }
                        if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3) != null) {
                            layoutParams4.removeRule(i3);
                        } else {
                            layoutParams4 = null;
                        }
                        C786410Ut5.W5(view27, layoutParams4);
                        if ((view27 instanceof RelativeLayout) && (relativeLayout2 = (RelativeLayout) view27) != null) {
                            relativeLayout2.setGravity(1);
                        }
                    }
                } else {
                    View view29 = this.LJ;
                    if (view29 != null) {
                        C426750GoL.LJIIL(view29, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LJ)))), 23);
                        C618720OOo.LIZIZ(view29, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                        C426750GoL.LJIIIZ(view29, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), false, 16);
                    }
                }
            } else if (this.LIZIZ) {
                float f10 = c731160SmA.LIZIZ;
                float f11 = (i / 2) + f10 + ((54 - f10) / 2);
                EnumC2174751A9h enumC2174751A9h5 = EnumC2174751A9h.AREA_HEIGHT_AVATAR;
                int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((f11 - enumC2174751A9h5.get()) - 12) - 1)));
                View view30 = this.LJ;
                if (view30 != null) {
                    C618720OOo.LIZIZ(view30, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h3.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_FOLLOW.get()))));
                    C426750GoL.LJIIL(view30, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(iLIZIZ7), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 20);
                    C426750GoL.LJIIIZ(view30, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h5.get())))), null, null, false, 29);
                    View view31 = this.LJ;
                    if (view31 != null) {
                        layoutParams = view31.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) != null) {
                        layoutParams2.removeRule(14);
                    } else {
                        layoutParams2 = null;
                    }
                    C786410Ut5.W5(view30, layoutParams2);
                    if ((view30 instanceof RelativeLayout) && (relativeLayout = (RelativeLayout) view30) != null) {
                        relativeLayout.setGravity(1);
                    }
                }
            } else {
                View view32 = this.LJ;
                if (view32 != null) {
                    C426750GoL.LJIIL(view32, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LJ)))), 23);
                }
            }
            if (this.LIZIZ) {
                LJFF(iLIZIZ5, this.LJ);
            }
        }
        InterfaceC732170Snn interfaceC732170SnnLJJL = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL();
        View view33 = this.LIZLLL;
        View view34 = this.LJI;
        int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZJ)));
        int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZLLL)));
        int iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LJII)));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LJIIIIZZ)));
        interfaceC732170SnnLJJL.LJI(view33, view34, iLIZIZ8, iLIZIZ9, iLIZIZ10, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LJIIJ))));
        LJI(this.LIZLLL);
        LJI(this.LJI);
        LJI(this.LJII);
        LJI(this.LJIIIIZZ);
        LJI(this.LJIIIZ);
        LJI(this.LJIILJJIL);
        LJI(this.LJIILIIL);
        LJI(this.LJIIJJI);
        LJI(this.LJIIL);
        LJI(this.LJ);
        LJI(this.LJFF);
        LJI(this.LJIIJ);
        if (C20586815h4.LIZ() && (view = this.LIZJ) != null) {
            HandlerHook.viewPostDelay(view, new RunnableC723340SYy(this), C300480BqA.LIZ());
        }
    }

    public final void LJFF(final int i, final View view) {
        View view2;
        ViewTreeObserver viewTreeObserver;
        final ViewParent parent = null;
        if (view != null) {
            parent = view.getParent();
        }
        if (((Number) C04R4.LIZ.getValue()).intValue() == 1) {
            if ((parent instanceof View) && (view2 = (View) parent) != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0SZ1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        View view3;
                        C786410Ut5.C3(((View) parent).getViewTreeObserver(), this);
                        Rect rect = new Rect();
                        view.getHitRect(rect);
                        rect.left -= i;
                        C0SZ0 c0sz0 = this;
                        if (c0sz0.LJIILL == null) {
                            c0sz0.LJIILL = new TouchDelegate(rect, view);
                        }
                        Object obj = parent;
                        if (!(obj instanceof View) || (view3 = (View) obj) == null) {
                            return;
                        }
                        view3.setTouchDelegate(this.LJIILL);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                return;
            }
            return;
        }
        if (parent == null) {
            return;
        }
        HandlerHook.viewPost(view, new Runnable() { // from class: X.03IM
            public final void LIZ() {
                View view3;
                Rect rect = new Rect();
                view.getHitRect(rect);
                rect.left -= i;
                Object obj = parent;
                if (!(obj instanceof View) || (view3 = (View) obj) == null) {
                    return;
                }
                view3.setTouchDelegate(new TouchDelegate(rect, view));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AvatarViewScaleHelper@d879.expandFollowClickHotSpot$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AvatarViewScaleHelper@d879.expandFollowClickHotSpot$1$1");
            }
        });
    }
}
