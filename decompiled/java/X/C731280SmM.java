package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.spi.ICommonFeedCustomLogic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731280SmM extends C09AY implements Function2<VideoFavoriteAssem, C731160SmA, Unit> {
    public C731280SmM() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C731160SmA c731160SmA) {
        View view;
        View view2;
        View view3;
        View view4;
        Object obj;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C731160SmA c731160SmA2 = c731160SmA;
        C731340SmS c731340SmS = videoFavoriteAssem2.LLLFFI;
        if (c731340SmS != null) {
            ICommonFeedCustomLogic iCommonFeedCustomLogic = (ICommonFeedCustomLogic) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomLogic.class, false, false, false, 14, null);
            if (iCommonFeedCustomLogic != null) {
                C724270Sb3 c724270Sb3 = videoFavoriteAssem2.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                iCommonFeedCustomLogic.LIZLLL(c731160SmA2);
            }
            int iLIZIZ = 0;
            if (c731160SmA2.LJI) {
                C732110Snh.LJI("favorite helper, small screen");
                int iLIZIZ2 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ)))) / 2;
                View view5 = c731340SmS.LIZJ;
                if (view5 != null) {
                    C426750GoL.LJIIIZ(view5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ)))), false, 18);
                }
                if ((c731340SmS.LIZIZ || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ())) && (view3 = c731340SmS.LIZLLL) != null) {
                    C618720OOo.LIZIZ(view3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_REGULAR_SMALL.get()))));
                }
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                View view6 = c731340SmS.LJ;
                if (view6 != null) {
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                    int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                    int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                    int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
                    int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                    int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    if (c731340SmS.LIZIZ || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ())) {
                        iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_TOP_SMALL.get()))) - iLIZIZ2;
                        iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        EnumC2174751A9h enumC2174751A9h = EnumC2174751A9h.AREA_WIDTH_SMALL;
                        iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get()))) - iLIZIZ4;
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get())));
                        iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + iLIZIZ9;
                        iLIZIZ3 = iLIZIZ7;
                    }
                    C618720OOo.LIZIZ(view6, iLIZIZ4, iLIZIZ5);
                    C426750GoL.LJIIL(view6, Integer.valueOf(iLIZIZ7), Integer.valueOf(iLIZIZ9), Integer.valueOf(iLIZIZ8), Integer.valueOf(iLIZIZ6), 16);
                }
                if (!c731340SmS.LIZ) {
                    View view7 = c731340SmS.LJFF;
                    if (view7 != null) {
                        C618720OOo.LIZIZ(view7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))));
                    }
                    TuxTextView tuxTextView = c731340SmS.LJI;
                    if (tuxTextView != null) {
                        tuxTextView.setTuxFont(42);
                    }
                } else {
                    View view8 = c731340SmS.LJFF;
                    if (view8 != null) {
                        C618720OOo.LIZIZ(view8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))));
                    }
                }
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJIJ() && (view4 = c731340SmS.LJFF) != null) {
                    C618720OOo.LIZIZ(view4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))));
                }
                TuxTextView tuxTextView2 = c731340SmS.LJI;
                if (tuxTextView2 != null) {
                    if (c731340SmS.LIZ) {
                        tuxTextView2.setTuxFont(82);
                    } else {
                        tuxTextView2.setTextSize(1, 11.0f);
                    }
                    int iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJ)));
                    int iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJFF)));
                    C732110Snh.LIZIZ();
                    int iLIZIZ12 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2;
                    if (c731340SmS.LIZIZ || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ())) {
                        iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ11 = -iLIZIZ2;
                        iLIZIZ12 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        C618720OOo.LIZIZ(tuxTextView2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), -2);
                        tuxTextView2.setGravity(17);
                    }
                    C426750GoL.LJIIL(tuxTextView2, Integer.valueOf(iLIZIZ3), null, null, Integer.valueOf(iLIZIZ10), 22);
                    C426750GoL.LJIIIZ(tuxTextView2, null, Integer.valueOf(iLIZIZ11), Integer.valueOf(iLIZIZ12), null, false, 25);
                    C732110Snh.LJII(tuxTextView2);
                }
                InterfaceC732170Snn interfaceC732170SnnLJJL = c19252910Tv.LIZLLL().LJIJI().LJJL();
                View view9 = c731340SmS.LJ;
                int iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
                int iLIZIZ14 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                int iLIZIZ15 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)));
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)));
                interfaceC732170SnnLJJL.LJIIIIZZ(iLIZIZ13, iLIZIZ14, iLIZIZ15, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ))), view9);
            } else {
                int iLIZIZ16 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ)))) / 2;
                C732110Snh.LJI("favorite helper,big screen");
                View view10 = c731340SmS.LIZJ;
                if (view10 != null) {
                    C426750GoL.LJIIIZ(view10, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ)))), false, 18);
                }
                if (c731340SmS.LIZIZ && (view = c731340SmS.LIZLLL) != null) {
                    C618720OOo.LIZIZ(view, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_REGULAR.get()))));
                }
                int iLIZIZ17 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                View view11 = c731340SmS.LJ;
                if (view11 != null) {
                    int iLIZIZ18 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                    int iLIZIZ19 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                    int iLIZIZ20 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                    int iLIZIZ21 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
                    int iLIZIZ22 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                    int iLIZIZ23 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    if (c731340SmS.LIZIZ) {
                        iLIZIZ23 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_TOP.get()))) - iLIZIZ16;
                        iLIZIZ20 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ22 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        EnumC2174751A9h enumC2174751A9h2 = EnumC2174751A9h.AREA_WIDTH;
                        iLIZIZ21 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get()))) - iLIZIZ18;
                        iLIZIZ18 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get())));
                        iLIZIZ19 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + iLIZIZ23;
                        iLIZIZ17 = iLIZIZ21;
                    }
                    C618720OOo.LIZIZ(view11, iLIZIZ18, iLIZIZ19);
                    C426750GoL.LJIIL(view11, Integer.valueOf(iLIZIZ21), Integer.valueOf(iLIZIZ23), Integer.valueOf(iLIZIZ22), Integer.valueOf(iLIZIZ20), 16);
                }
                if (!c731340SmS.LIZ) {
                    View view12 = c731340SmS.LJFF;
                    if (view12 != null) {
                        C618720OOo.LIZIZ(view12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))));
                    }
                    TuxTextView tuxTextView3 = c731340SmS.LJI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setTuxFont(72);
                    }
                } else {
                    View view13 = c731340SmS.LJFF;
                    if (view13 != null) {
                        C618720OOo.LIZIZ(view13, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))));
                    }
                }
                TuxTextView tuxTextView4 = c731340SmS.LJI;
                if (tuxTextView4 != null) {
                    int iLIZIZ24 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJFF)));
                    C732110Snh.LIZIZ();
                    int iLIZIZ25 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2;
                    int iLIZIZ26 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJ)));
                    if (!C732110Snh.LJFF()) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    }
                    int iLIZIZ27 = iLIZIZ26 + iLIZIZ;
                    if (c731340SmS.LIZIZ) {
                        iLIZIZ24 = -iLIZIZ16;
                        iLIZIZ25 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ27 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        C618720OOo.LIZIZ(tuxTextView4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get()))), -2);
                        tuxTextView4.setGravity(17);
                    }
                    C426750GoL.LJIIIZ(tuxTextView4, null, Integer.valueOf(iLIZIZ24), Integer.valueOf(iLIZIZ25), null, false, 25);
                    C426750GoL.LJIIL(tuxTextView4, Integer.valueOf(iLIZIZ17), null, null, Integer.valueOf(iLIZIZ27), 22);
                    C732110Snh.LJII(tuxTextView4);
                    C19252910Tv c19252910Tv2 = C19252910Tv.LIZIZ;
                    if (c19252910Tv2.LIZLLL().LJIJI().LJJL().LJJII()) {
                        c19252910Tv2.LIZLLL().LJIJI().LJJL().LJII(tuxTextView4);
                    } else {
                        AbstractC731360SmU.LIZIZ(tuxTextView4, c731340SmS.LIZ);
                    }
                }
            }
            AbstractC731360SmU.LIZJ(c731340SmS.LJI, c731340SmS.LIZ);
            InterfaceC732170Snn interfaceC732170SnnLJJL2 = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL();
            View view14 = c731340SmS.LJ;
            int iLIZIZ28 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
            int iLIZIZ29 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
            int iLIZIZ30 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)));
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)));
            interfaceC732170SnnLJJL2.LJIIIIZZ(iLIZIZ28, iLIZIZ29, iLIZIZ30, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ))), view14);
            if (C20586815h4.LIZ() && (view2 = c731340SmS.LIZJ) != null) {
                HandlerHook.viewPostDelay(view2, new RunnableC731290SmN(c731340SmS), C300480BqA.LIZ());
            }
        }
        return Unit.LIZ;
    }
}
