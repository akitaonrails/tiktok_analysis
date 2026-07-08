package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;

/* JADX INFO: renamed from: X.1A9R, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A9R extends AbstractC731360SmU {
    public View LIZJ;
    public C21387418mu LIZLLL;
    public View LJ;
    public View LJFF;
    public C427870Gq9 LJI;
    public C1D92 LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public TuxIconView LJIIJ;
    public View LJIIJJI;
    public C427870Gq9 LJIIL;
    public View LJIILIIL;
    public View LJIILJJIL;
    public View LJIILL;
    public C1A9W LJIILLIIL;
    public final boolean LIZIZ = C2174761A9i.LIZIZ();
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new C1A9Y());

    @Override // X.AbstractC731360SmU
    public final void LIZ() {
        View view;
        C1A9W c1a9w = this.LJIILLIIL;
        if (c1a9w != null) {
            LJ(c1a9w);
        }
        if (!C20586815h4.LIZ() || (view = this.LJIILIIL) == null) {
            return;
        }
        HandlerHook.viewPostDelay(view, new RunnableC19378210rc(this), C300480BqA.LIZ());
    }

    public final int LJFF() {
        return ((Number) this.LJIIZILJ.getValue()).intValue();
    }

    public final void LJ(C1A9W c1a9w) {
        View view;
        C732110Snh.LJI("music helper, small screen");
        C21387418mu c21387418mu = this.LIZLLL;
        if (c21387418mu != null) {
            C618720OOo.LIZIZ(c21387418mu, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78)));
            C426750GoL.LJIIIZ(c21387418mu, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), Integer.valueOf(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), false, 19);
        }
        View view2 = this.LJIILJJIL;
        if (view2 != null) {
            if (this.LIZIZ || (C2174771A9j.LIZJ() && LowScreenOptimizeAB.LIZIZ())) {
                if (c1a9w.LJI) {
                    C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_MY_PROFILE_MUSIC_SMALL.get()))), view2);
                    C426750GoL.LJIIL(view2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.PROFILE_MUSIC_TOP_SMALL.get())))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.PROFILE_MUSIC_BOTTOM_SMALL.get())))), 21);
                } else {
                    C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_MUSIC_SMALL.get()))), view2);
                    C426750GoL.LJIIL(view2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.MUSIC_TOP_SMALL.get())))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.MUSIC_BOTTOM_SMALL.get())))), 21);
                }
            } else if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJII()) {
                C426750GoL.LJIIIZ(view2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(68 - c1a9w.LIZLLL)))), null, null, false, 29);
            } else {
                C426750GoL.LJIIIZ(view2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(48 - c1a9w.LIZLLL)))), null, null, false, 29);
            }
        }
        View view3 = this.LJ;
        if (view3 != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ + c1a9w.LIZ + c1a9w.LIZIZ + LJFF())));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ + c1a9w.LIZLLL + c1a9w.LIZJ)));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZIZ)));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZ)));
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZLLL)));
            int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZJ)));
            if (this.LIZIZ || (C2174771A9j.LIZJ() && LowScreenOptimizeAB.LIZIZ())) {
                EnumC2174751A9h enumC2174751A9h = EnumC2174751A9h.AREA_WIDTH_SMALL;
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get()))) - iLIZIZ;
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get())));
                iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                iLIZIZ2 = -2;
            }
            C618720OOo.LIZIZ(view3, iLIZIZ, iLIZIZ2);
            C426750GoL.LJIIL(view3, Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ6), 16);
        }
        if ((this.LIZIZ || (C2174771A9j.LIZJ() && LowScreenOptimizeAB.LIZIZ())) && (view = this.LJIILL) != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 8388629;
        }
        View view4 = this.LJFF;
        if (view4 != null) {
            int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZLLL)));
            int iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZJ)));
            int iLIZIZ9 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ + c1a9w.LIZLLL + c1a9w.LIZJ + 1)));
            if (this.LIZIZ || (C2174771A9j.LIZJ() && LowScreenOptimizeAB.LIZIZ())) {
                iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                iLIZIZ8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            }
            C1744700vVE.LJIIIIZZ(iLIZIZ9, view4);
            C426750GoL.LJIIL(view4, null, Integer.valueOf(iLIZIZ7), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZ)))), Integer.valueOf(iLIZIZ8), 17);
        }
        C427870Gq9 c427870Gq9 = this.LJI;
        if (c427870Gq9 != null) {
            C618720OOo.LIZIZ(c427870Gq9, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))));
        }
        C1D92 c1d92 = this.LJII;
        if (c1d92 != null) {
            C618720OOo.LIZIZ(c1d92, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))));
        }
        View view5 = this.LJIIIIZZ;
        if (view5 != null) {
            C618720OOo.LIZIZ(view5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))));
        }
        View view6 = this.LJIIIZ;
        if (view6 != null) {
            C618720OOo.LIZIZ(view6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))));
            int iLIZIZ10 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))) / 2;
            view6.setPadding(iLIZIZ10, iLIZIZ10, iLIZIZ10, iLIZIZ10);
        }
        TuxIconView tuxIconView = this.LJIIJ;
        if (tuxIconView != null) {
            C618720OOo.LIZIZ(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))));
            int iLIZIZ11 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))) / 2;
            tuxIconView.setPadding(iLIZIZ11, iLIZIZ11, iLIZIZ11, iLIZIZ11);
        }
        View view7 = this.LJIIJJI;
        if (view7 != null) {
            C618720OOo.LIZIZ(view7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ + LJFF()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJ))));
        }
        C427870Gq9 c427870Gq92 = this.LJIIL;
        if (c427870Gq92 != null) {
            C618720OOo.LIZIZ(c427870Gq92, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        }
        View view8 = this.LIZJ;
        if (view8 != null) {
            C618720OOo.LIZIZ(view8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LJFF))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        }
    }
}
