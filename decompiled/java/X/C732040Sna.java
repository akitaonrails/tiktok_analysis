package X;

import android.graphics.Typeface;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732040Sna extends C09AY implements Function2<VideoCommentAssem, C731160SmA, Unit> {
    public C732040Sna() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoCommentAssem videoCommentAssem, C731160SmA c731160SmA) {
        int iLIZIZ;
        View view;
        C731160SmA c731160SmA2 = c731160SmA;
        C732050Snb c732050Snb = videoCommentAssem.LLLILZ;
        if (c732050Snb != null) {
            if (c731160SmA2.LJI) {
                C732110Snh.LJI("comment helper, small screen");
                int iLIZIZ2 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ)))) / 2;
                View view2 = c732050Snb.LIZJ;
                if (view2 != null) {
                    C426750GoL.LJIIIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ)))), false, 18);
                    if (c732050Snb.LJIIJJI || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ())) {
                        C618720OOo.LIZIZ(view2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_REGULAR_SMALL.get()))));
                    }
                }
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                View view3 = c732050Snb.LIZLLL;
                if (view3 != null) {
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                    int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                    int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
                    int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                    int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                    C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    if (c732050Snb.LJIIJJI || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ())) {
                        EnumC2174751A9h enumC2174751A9h = EnumC2174751A9h.AREA_WIDTH_SMALL;
                        iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get()))) - iLIZIZ4;
                        iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_TOP_SMALL.get()))) - iLIZIZ2;
                        iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get())));
                        iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + iLIZIZ9;
                        iLIZIZ3 = iLIZIZ6;
                    }
                    C618720OOo.LIZIZ(view3, iLIZIZ4, iLIZIZ5);
                    C426750GoL.LJIIL(view3, Integer.valueOf(iLIZIZ6), null, Integer.valueOf(iLIZIZ7), Integer.valueOf(iLIZIZ8), 18);
                }
                View view4 = c732050Snb.LJFF;
                if (view4 != null) {
                    C618720OOo.LIZIZ(view4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))));
                }
                TuxTextView tuxTextView = c732050Snb.LJII;
                if (tuxTextView != null) {
                    tuxTextView.LJJJJI(c731160SmA2.LIZIZ);
                }
                TuxTextView tuxTextView2 = c732050Snb.LJI;
                if (tuxTextView2 != null) {
                    int iLIZIZ10 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJFF)));
                    int iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJ))) + C732110Snh.LIZ();
                    int iLIZIZ12 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    C732110Snh.LIZIZ();
                    int iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2;
                    if (c732050Snb.LJIIJJI || (c731160SmA2.LJIILIIL && C2174771A9j.LIZJ())) {
                        iLIZIZ10 = -iLIZIZ2;
                        iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ11 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_BOTTOM_SMALL.get()))) - iLIZIZ2;
                        C618720OOo.LIZIZ(tuxTextView2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH_SMALL.get()))), -2);
                        tuxTextView2.setGravity(17);
                    } else {
                        iLIZIZ3 = iLIZIZ12;
                    }
                    C01GW c01gw = C296070Bj3.LIZ;
                    if (((Number) c01gw.getValue()).intValue() > 0) {
                        iLIZIZ13 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    }
                    C426750GoL.LJIIL(tuxTextView2, Integer.valueOf(iLIZIZ3), null, null, Integer.valueOf(iLIZIZ11), 22);
                    C426750GoL.LJIIIZ(tuxTextView2, null, Integer.valueOf(iLIZIZ10), Integer.valueOf(iLIZIZ13), null, false, 25);
                    if (!c732050Snb.LIZ) {
                        tuxTextView2.LJJJJI(11.0f);
                    }
                    if (c732050Snb.LJIIIIZZ && ((Number) c01gw.getValue()).intValue() > 0) {
                        tuxTextView2.setTypeface((Typeface) c732050Snb.LJIIJ.getValue());
                        tuxTextView2.LJJJJI(11.0f);
                    } else {
                        tuxTextView2.setTuxFont(82);
                    }
                    C732110Snh.LJII(tuxTextView2);
                }
            } else {
                int iLIZIZ14 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ)))) / 2;
                C732110Snh.LJI("comment helper, big screen");
                View view5 = c732050Snb.LIZJ;
                if (view5 != null) {
                    C426750GoL.LJIIIZ(view5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIJ)))), false, 18);
                    if (c732050Snb.LJIIJJI) {
                        C618720OOo.LIZIZ(view5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_REGULAR.get()))));
                    }
                }
                if (C732110Snh.LJFF()) {
                    iLIZIZ = 0;
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                }
                int iLIZIZ15 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                View view6 = c732050Snb.LIZLLL;
                if (view6 != null) {
                    int iLIZIZ16 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                    int iLIZIZ17 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ))) + iLIZIZ;
                    int iLIZIZ18 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJII)));
                    int iLIZIZ19 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIIZZ)));
                    int iLIZIZ20 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJIIIZ)));
                    if (c732050Snb.LJIIJJI) {
                        EnumC2174751A9h enumC2174751A9h2 = EnumC2174751A9h.AREA_WIDTH;
                        iLIZIZ15 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get()))) - iLIZIZ16;
                        iLIZIZ19 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_TOP.get()))) - iLIZIZ14;
                        iLIZIZ20 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ16 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h2.get())));
                        iLIZIZ17 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZ))) + iLIZIZ;
                        iLIZIZ18 = iLIZIZ15;
                    }
                    C618720OOo.LIZIZ(view6, iLIZIZ16, iLIZIZ17);
                    C426750GoL.LJIIL(view6, Integer.valueOf(iLIZIZ18), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ19), Integer.valueOf(iLIZIZ20), 16);
                }
                View view7 = c732050Snb.LJFF;
                if (view7 != null) {
                    C618720OOo.LIZIZ(view7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LIZIZ))));
                }
                TuxTextView tuxTextView3 = c732050Snb.LJII;
                if (tuxTextView3 != null) {
                    tuxTextView3.LJJJJI(c731160SmA2.LIZIZ);
                }
                TuxTextView tuxTextView4 = c732050Snb.LJI;
                if (tuxTextView4 != null) {
                    int iLIZIZ21 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJFF))) + C732110Snh.LIZ();
                    int iLIZIZ22 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA2.LJ)));
                    C732110Snh.LIZIZ();
                    int iLIZIZ23 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2;
                    int iLIZIZ24 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    if (c732050Snb.LJIIJJI) {
                        iLIZIZ21 = -iLIZIZ14;
                        iLIZIZ23 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        iLIZIZ22 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.REGULAR_BOTTOM.get()))) - iLIZIZ14;
                        C618720OOo.LIZIZ(tuxTextView4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_WIDTH.get()))), -2);
                        tuxTextView4.setGravity(17);
                    } else {
                        iLIZIZ15 = iLIZIZ24;
                    }
                    C01GW c01gw2 = C296070Bj3.LIZ;
                    if (((Number) c01gw2.getValue()).intValue() > 0) {
                        iLIZIZ23 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    }
                    C426750GoL.LJIIL(tuxTextView4, Integer.valueOf(iLIZIZ15), null, null, Integer.valueOf(iLIZIZ22), 22);
                    C426750GoL.LJIIIZ(tuxTextView4, null, Integer.valueOf(iLIZIZ21), Integer.valueOf(iLIZIZ23), null, false, 25);
                    if (!c732050Snb.LIZ) {
                        tuxTextView4.setTuxFont(72);
                    }
                    C732110Snh.LJII(tuxTextView4);
                    if (c732050Snb.LJIIIIZZ && ((Number) c01gw2.getValue()).intValue() > 0) {
                        tuxTextView4.setTypeface((Typeface) c732050Snb.LJIIJ.getValue());
                        tuxTextView4.LJJJJI(11.0f);
                    } else {
                        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
                            c19252910Tv.LIZLLL().LJIJI().LJJL().LJII(tuxTextView4);
                        } else {
                            AbstractC731360SmU.LIZIZ(tuxTextView4, c732050Snb.LIZ);
                        }
                    }
                }
            }
            AbstractC731360SmU.LIZJ(c732050Snb.LJI, c732050Snb.LIZ);
            View view8 = c732050Snb.LJ;
            if (view8 != null) {
                C618720OOo.LIZIZ(view8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            }
            if (C20586815h4.LIZ() && (view = c732050Snb.LIZIZ) != null) {
                HandlerHook.viewPostDelay(view, new RunnableC732060Snc(c732050Snb), C300480BqA.LIZ());
            }
        }
        return Unit.LIZ;
    }
}
