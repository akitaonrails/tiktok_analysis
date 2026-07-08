package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732100Sng extends C09AY implements Function2<VideoShareAssem, C731160SmA, Unit> {
    public C732100Sng() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C731160SmA c731160SmA) {
        C732590SoT c732590SoTLIZ;
        Object obj;
        C731160SmA c731160SmALIZ;
        ViewParent parent;
        Object parent2;
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        View view;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        View view2;
        View view3;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        ViewParent parent3;
        Object parent4;
        ViewGroup.LayoutParams layoutParams3;
        RelativeLayout.LayoutParams layoutParams4;
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C731160SmA c731160SmA2 = c731160SmA;
        C732130Snj c732130SnjIp = videoShareAssem2.Ip();
        if (c732130SnjIp != null) {
            C724270Sb3 c724270Sb3 = videoShareAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (C1017070cZd.LLJZ(((VideoItemParams) obj).getAweme())) {
                C01GW<Integer> c01gw = ConstraintSizeVM.LL;
                c731160SmALIZ = C731160SmA.LIZ(c731160SmA2, C679280Qkg.LIZIZ(Integer.valueOf(C693770RJf.LIZIZ())) - C732110Snh.LJ(), false, false, 15359);
            } else {
                c731160SmALIZ = c731160SmA2;
            }
            if (c731160SmALIZ.LJI) {
                View view4 = c732130SnjIp.LIZLLL;
                if (view4 != null) {
                    C618720OOo.LIZIZ(view4, -2, -2);
                    C426750GoL.LJIIIZ(view4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIJ)))), false, 18);
                }
                int iLIZJ = C732110Snh.LIZJ();
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZ)));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZIZ)));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                if ((c732130SnjIp.LIZIZ || (c731160SmALIZ.LJIILIIL && C2174771A9j.LIZJ())) && (view3 = c732130SnjIp.LIZLLL) != null) {
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get())));
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_REGULAR_SMALL.get())));
                    if (c731160SmALIZ.LJIIL) {
                        iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_MY_PROFILE_SHARE_SMALL.get())));
                    }
                    C618720OOo.LIZIZ(view3, iLIZIZ2, iLIZIZ3);
                    if (c731160SmALIZ.LJIIL) {
                        if ((view3 instanceof LinearLayout) && (linearLayout4 = (LinearLayout) view3) != null) {
                            linearLayout4.setGravity(17);
                        }
                    } else if ((view3 instanceof LinearLayout) && (linearLayout3 = (LinearLayout) view3) != null) {
                        linearLayout3.setGravity(1);
                    }
                }
                View view5 = c732130SnjIp.LJ;
                if (view5 != null) {
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIIZZ)));
                    int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIZ))) + iLIZJ;
                    int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJII)));
                    int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIIZZ)));
                    int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIZ)));
                    if (c732130SnjIp.LIZIZ || (c731160SmALIZ.LJIILIIL && C2174771A9j.LIZJ())) {
                        if (c731160SmALIZ.LJIIL) {
                            iLIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        } else {
                            iLIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_TOP_SMALL.get())));
                        }
                        iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        EnumC2174751A9h enumC2174751A9h = EnumC2174751A9h.AREA_WIDTH_SMALL;
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get()))) - iLIZIZ4;
                        iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get())));
                        iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZIZ))) + iLIZJ;
                        iLIZIZ6 = iLIZIZ;
                    }
                    C618720OOo.LIZIZ(view5, iLIZIZ4, iLIZIZ5);
                    C426750GoL.LJIIL(view5, Integer.valueOf(iLIZIZ6), Integer.valueOf(iLIZJ), Integer.valueOf(iLIZIZ7), Integer.valueOf(iLIZIZ8), 16);
                }
                View view6 = c732130SnjIp.LJFF;
                if (view6 != null) {
                    C618720OOo.LIZIZ(view6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZIZ))));
                }
                TuxTextView tuxTextView = c732130SnjIp.LJI;
                if (tuxTextView != null) {
                    if (c732130SnjIp.LIZ) {
                        tuxTextView.setTuxFont(82);
                    } else {
                        tuxTextView.LJJJJI(11.0f);
                    }
                    if (!c732130SnjIp.LIZ) {
                        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIIZZ))));
                        tuxTextView.setMinTextSize(1.0f);
                    }
                    int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJFF)));
                    int iLJ = C732110Snh.LJ();
                    C732110Snh.LIZIZ();
                    int iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2;
                    if (c732130SnjIp.LIZIZ || (c731160SmALIZ.LJIILIIL && C2174771A9j.LIZJ())) {
                        iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        C618720OOo.LIZIZ(tuxTextView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))) - iLIZIZ, -2);
                        tuxTextView.setGravity(17);
                        TuxTextView tuxTextView2 = c732130SnjIp.LJI;
                        if (tuxTextView2 != null) {
                            layoutParams3 = tuxTextView2.getLayoutParams();
                        } else {
                            layoutParams3 = null;
                        }
                        if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3) != null) {
                            layoutParams4.removeRule(14);
                        } else {
                            layoutParams4 = null;
                        }
                        C786410Ut5.R6(tuxTextView, layoutParams4);
                        C426750GoL.LJIIL(tuxTextView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_BOTTOM_SMALL.get())))), 23);
                    }
                    C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(iLIZIZ9), Integer.valueOf(iLIZIZ10), Integer.valueOf(iLJ), false, 17);
                    C732110Snh.LJII(tuxTextView);
                }
                if (c732130SnjIp.LIZIZ || (c731160SmALIZ.LJIILIIL && C2174771A9j.LIZJ())) {
                    TuxTextView tuxTextView3 = c732130SnjIp.LJI;
                    if (tuxTextView3 != null) {
                        parent3 = tuxTextView3.getParent();
                    } else {
                        parent3 = null;
                    }
                    if (parent3 instanceof View) {
                        TuxTextView tuxTextView4 = c732130SnjIp.LJI;
                        if (tuxTextView4 != null) {
                            parent4 = tuxTextView4.getParent();
                        } else {
                            parent4 = null;
                        }
                        View view7 = (View) parent4;
                        C618720OOo.LIZIZ(view7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), -2);
                        C426750GoL.LJIIL(view7, Integer.valueOf(iLIZIZ), null, null, null, 30);
                    }
                }
            } else {
                int iLIZJ2 = C732110Snh.LIZJ();
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZ)));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZIZ)));
                int iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                if (c732130SnjIp.LIZIZ && (view = c732130SnjIp.LIZLLL) != null) {
                    int iLIZIZ12 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get())));
                    int iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_REGULAR.get())));
                    if (c731160SmALIZ.LJIIL) {
                        iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_MY_PROFILE_SHARE.get())));
                    }
                    if (c731160SmALIZ.LJIIL) {
                        if ((view instanceof LinearLayout) && (linearLayout2 = (LinearLayout) view) != null) {
                            linearLayout2.setGravity(17);
                        }
                    } else if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
                        linearLayout.setGravity(1);
                    }
                    C618720OOo.LIZIZ(view, iLIZIZ12, iLIZIZ13);
                }
                View view8 = c732130SnjIp.LJ;
                if (view8 != null) {
                    int iLIZIZ14 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIIZZ)));
                    int iLIZIZ15 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIZ))) + iLIZJ2;
                    int iLIZIZ16 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJII)));
                    int iLIZIZ17 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIIZZ)));
                    int iLIZIZ18 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIZ)));
                    if (c732130SnjIp.LIZIZ) {
                        if (c731160SmALIZ.LJIIL) {
                            iLIZJ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        } else {
                            iLIZJ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_TOP.get())));
                        }
                        EnumC2174751A9h enumC2174751A9h2 = EnumC2174751A9h.AREA_WIDTH;
                        iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get()))) - iLIZIZ14;
                        iLIZIZ17 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ18 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ14 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get())));
                        iLIZIZ15 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZIZ))) + iLIZJ2;
                        iLIZIZ16 = iLIZIZ11;
                    }
                    C618720OOo.LIZIZ(view8, iLIZIZ14, iLIZIZ15);
                    C426750GoL.LJIIL(view8, Integer.valueOf(iLIZIZ16), Integer.valueOf(iLIZJ2), Integer.valueOf(iLIZIZ17), Integer.valueOf(iLIZIZ18), 16);
                }
                View view9 = c732130SnjIp.LJFF;
                if (view9 != null) {
                    C618720OOo.LIZIZ(view9, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZIZ))));
                }
                TuxTextView tuxTextView5 = c732130SnjIp.LJI;
                if (tuxTextView5 != null) {
                    if (!c732130SnjIp.LIZ) {
                        tuxTextView5.setMinTextSize(1.0f);
                    }
                    C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                    if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
                        c19252910Tv.LIZLLL().LJIJI().LJJL().LJII(tuxTextView5);
                    } else if (c732130SnjIp.LIZ) {
                        AbstractC731360SmU.LIZIZ(tuxTextView5, true);
                    } else {
                        tuxTextView5.setTuxFont(72);
                    }
                    if (!c732130SnjIp.LIZ) {
                        tuxTextView5.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIIIZZ))));
                    }
                    int iLIZIZ19 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJFF)));
                    int iLJ2 = C732110Snh.LJ();
                    C732110Snh.LIZIZ();
                    int iLIZIZ20 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2;
                    if (c732130SnjIp.LIZIZ) {
                        iLIZIZ19 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLJ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ20 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        C618720OOo.LIZIZ(tuxTextView5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get()))) - iLIZIZ11, -2);
                        tuxTextView5.setGravity(17);
                        TuxTextView tuxTextView6 = c732130SnjIp.LJI;
                        if (tuxTextView6 != null) {
                            layoutParams = tuxTextView6.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) != null) {
                            layoutParams2.removeRule(14);
                        } else {
                            layoutParams2 = null;
                        }
                        C786410Ut5.R6(tuxTextView5, layoutParams2);
                        C426750GoL.LJIIL(tuxTextView5, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_BOTTOM.get())))), 23);
                    }
                    C426750GoL.LJIIIZ(tuxTextView5, null, Integer.valueOf(iLIZIZ19), Integer.valueOf(iLIZIZ20), Integer.valueOf(iLJ2), false, 17);
                    C732110Snh.LJII(tuxTextView5);
                }
                if (c732130SnjIp.LIZIZ) {
                    TuxTextView tuxTextView7 = c732130SnjIp.LJI;
                    if (tuxTextView7 != null) {
                        parent = tuxTextView7.getParent();
                    } else {
                        parent = null;
                    }
                    if (parent instanceof View) {
                        TuxTextView tuxTextView8 = c732130SnjIp.LJI;
                        if (tuxTextView8 != null) {
                            parent2 = tuxTextView8.getParent();
                        } else {
                            parent2 = null;
                        }
                        View view10 = (View) parent2;
                        C618720OOo.LIZIZ(view10, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get()))), -2);
                        C426750GoL.LJIIL(view10, Integer.valueOf(iLIZIZ11), null, null, null, 30);
                    }
                }
                View view11 = c732130SnjIp.LIZLLL;
                if (view11 != null) {
                    C426750GoL.LJIIIZ(view11, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LIZLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmALIZ.LJIIJ)))), false, 18);
                }
            }
            AbstractC731360SmU.LIZJ(c732130SnjIp.LJI, c732130SnjIp.LIZ);
            if (C20586815h4.LIZ() && (view2 = c732130SnjIp.LIZJ) != null) {
                HandlerHook.viewPostDelay(view2, new RunnableC732120Sni(c732130SnjIp), C300480BqA.LIZ());
            }
        }
        videoShareAssem2.Jp().LL = c731160SmA2.LIZIZ;
        VideoShareViewModel videoShareViewModelJp = videoShareAssem2.Jp();
        float f = videoShareAssem2.Jp().LL;
        C732520SoM c732520SoM = (C732520SoM) videoShareViewModelJp.getState();
        C732590SoT c732590SoT = ((C732520SoM) videoShareViewModelJp.getState()).LLILLL;
        if (c732590SoT != null) {
            c732590SoTLIZ = C732590SoT.LIZ(c732590SoT, null, null, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)))), 3);
        } else {
            c732590SoTLIZ = null;
        }
        C732520SoM.LIZ(c732520SoM, null, c732590SoTLIZ, null, null, null, null, 123);
        return Unit.LIZ;
    }
}
