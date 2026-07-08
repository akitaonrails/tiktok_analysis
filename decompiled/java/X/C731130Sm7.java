package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731130Sm7 extends C09AY implements Function2<VideoDiggAssem, C731160SmA, Unit> {
    public C731130Sm7() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C731160SmA c731160SmA) {
        TuxTextView tuxTextView;
        View view;
        TuxTextView tuxTextView2;
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        C731160SmA c731160SmA2 = c731160SmA;
        C731140Sm8 c731140Sm8Gp = videoDiggAssem2.Gp();
        if (c731160SmA2.LJI) {
            C732110Snh.LJI("digg helper, small screen");
            int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ)))) / 2;
            View view2 = c731140Sm8Gp.LIZJ;
            if (view2 != null) {
                C426750GoL.LJIIIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ)))), false, 18);
            }
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            View view3 = c731140Sm8Gp.LIZLLL;
            if (view3 != null) {
                View view4 = c731140Sm8Gp.LJI;
                if (view4 != null && (c731140Sm8Gp.LIZIZ || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ()))) {
                    C618720OOo.LIZIZ(view4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_REGULAR_SMALL.get()))));
                }
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
                int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                if (c731140Sm8Gp.LIZIZ || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ())) {
                    EnumC2174751A9h enumC2174751A9h = EnumC2174751A9h.AREA_WIDTH_SMALL;
                    iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get()))) - iLIZIZ3;
                    iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_TOP_SMALL.get()))) - iLIZIZ;
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get())));
                    iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + iLIZIZ8;
                    iLIZIZ2 = iLIZIZ5;
                }
                C618720OOo.LIZIZ(view3, iLIZIZ3, iLIZIZ4);
                C426750GoL.LJIIL(view3, Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ8), Integer.valueOf(iLIZIZ6), Integer.valueOf(iLIZIZ7), 16);
            }
            View view5 = c731140Sm8Gp.LJ;
            if (view5 != null) {
                C618720OOo.LIZIZ(view5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))));
            }
            if (!c731140Sm8Gp.LIZ && (tuxTextView2 = c731140Sm8Gp.LJFF) != null) {
                tuxTextView2.setTuxFont(42);
            }
            TuxTextView tuxTextView3 = c731140Sm8Gp.LJFF;
            if (tuxTextView3 != null) {
                if (c731140Sm8Gp.LIZ) {
                    tuxTextView3.setTuxFont(82);
                } else {
                    tuxTextView3.setTextSize(1, 11.0f);
                }
                int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJ)));
                int iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJFF)));
                C732110Snh.LIZIZ();
                int iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2;
                if (c731140Sm8Gp.LIZIZ || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ())) {
                    iLIZIZ10 = -iLIZIZ;
                    iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    C618720OOo.LIZIZ(tuxTextView3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), -2);
                    tuxTextView3.setGravity(17);
                }
                C426750GoL.LJIIL(tuxTextView3, Integer.valueOf(iLIZIZ2), null, null, Integer.valueOf(iLIZIZ9), 22);
                C426750GoL.LJIIIZ(tuxTextView3, null, Integer.valueOf(iLIZIZ10), Integer.valueOf(iLIZIZ11), null, false, 25);
                C732110Snh.LJII(tuxTextView3);
            }
            InterfaceC732170Snn interfaceC732170SnnLJJL = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL();
            View view6 = c731140Sm8Gp.LIZLLL;
            int iLIZIZ12 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
            int iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
            int iLIZIZ14 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)));
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)));
            interfaceC732170SnnLJJL.LJIIIIZZ(iLIZIZ12, iLIZIZ13, iLIZIZ14, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ))), view6);
        } else {
            int iLIZIZ15 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ)))) / 2;
            C732110Snh.LJI("digg helper, big screen");
            View view7 = c731140Sm8Gp.LIZJ;
            if (view7 != null) {
                C426750GoL.LJIIIZ(view7, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ)))), false, 18);
            }
            if (c731140Sm8Gp.LIZIZ) {
                View view8 = c731140Sm8Gp.LJI;
                if (view8 != null) {
                    C618720OOo.LIZIZ(view8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_REGULAR.get()))));
                }
                int iLIZIZ16 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                EnumC2174751A9h enumC2174751A9h2 = EnumC2174751A9h.AREA_WIDTH;
                int iLIZIZ17 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get()))) - iLIZIZ16;
                int iLIZIZ18 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_TOP.get()))) - iLIZIZ15;
                View view9 = c731140Sm8Gp.LIZLLL;
                if (view9 != null) {
                    C618720OOo.LIZIZ(view9, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + iLIZIZ18);
                    C426750GoL.LJIIL(view9, Integer.valueOf(iLIZIZ17), Integer.valueOf(iLIZIZ18), null, null, 28);
                }
                View view10 = c731140Sm8Gp.LJ;
                if (view10 != null) {
                    C618720OOo.LIZIZ(view10, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))));
                }
                TuxTextView tuxTextView4 = c731140Sm8Gp.LJFF;
                if (tuxTextView4 != null) {
                    C618720OOo.LIZIZ(tuxTextView4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get()))), -2);
                    C426750GoL.LJIIL(tuxTextView4, Integer.valueOf(iLIZIZ17), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 22);
                    C426750GoL.LJIIIZ(tuxTextView4, null, Integer.valueOf(-iLIZIZ15), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, false, 25);
                    tuxTextView4.setGravity(17);
                    C732110Snh.LJII(tuxTextView4);
                    C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                    if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
                        c19252910Tv.LIZLLL().LJIJI().LJJL().LJII(tuxTextView4);
                    } else {
                        AbstractC731360SmU.LIZIZ(tuxTextView4, c731140Sm8Gp.LIZ);
                    }
                }
            } else {
                View view11 = c731140Sm8Gp.LIZLLL;
                if (view11 != null) {
                    C618720OOo.LIZIZ(view11, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ))));
                    C426750GoL.LJIIL(view11, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)))), 18);
                }
                View view12 = c731140Sm8Gp.LJ;
                if (view12 != null) {
                    C618720OOo.LIZIZ(view12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))));
                }
                TuxTextView tuxTextView5 = c731140Sm8Gp.LJFF;
                if (tuxTextView5 != null) {
                    C426750GoL.LJIIL(tuxTextView5, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJ)))), 23);
                    Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJFF))));
                    C732110Snh.LIZIZ();
                    C426750GoL.LJIIIZ(tuxTextView5, null, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2), null, false, 25);
                    C732110Snh.LJII(tuxTextView5);
                    C19252910Tv c19252910Tv2 = C19252910Tv.LIZIZ;
                    if (c19252910Tv2.LIZLLL().LJIJI().LJJL().LJJII()) {
                        c19252910Tv2.LIZLLL().LJIJI().LJJL().LJII(tuxTextView5);
                    } else {
                        AbstractC731360SmU.LIZIZ(tuxTextView5, c731140Sm8Gp.LIZ);
                    }
                }
            }
            if (!c731140Sm8Gp.LIZ && (tuxTextView = c731140Sm8Gp.LJFF) != null) {
                tuxTextView.setTuxFont(72);
            }
        }
        AbstractC731360SmU.LIZJ(c731140Sm8Gp.LJFF, c731140Sm8Gp.LIZ);
        InterfaceC732170Snn interfaceC732170SnnLJJL2 = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL();
        View view13 = c731140Sm8Gp.LIZLLL;
        int iLIZIZ19 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
        int iLIZIZ20 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
        int iLIZIZ21 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)));
        interfaceC732170SnnLJJL2.LJIIIIZZ(iLIZIZ19, iLIZIZ20, iLIZIZ21, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ))), view13);
        if (C20586815h4.LIZ() && (view = c731140Sm8Gp.LIZJ) != null) {
            HandlerHook.viewPostDelay(view, new RunnableC730830Sld(c731140Sm8Gp), C300480BqA.LIZ());
        }
        VideoDiggVM videoDiggVMFp = videoDiggAssem2.Fp();
        videoDiggVMFp.getClass();
        videoDiggVMFp.setState(new C731150Sm9());
        return Unit.LIZ;
    }
}
