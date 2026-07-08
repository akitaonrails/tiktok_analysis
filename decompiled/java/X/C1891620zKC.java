package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zKC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891620zKC implements InterfaceC475720Il8 {
    public ViewGroup.LayoutParams LIZ;
    public boolean LIZJ;
    public Room LJ;
    public View LJFF;
    public View LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public final Map<String, String> LIZIZ = C2097608Jq.LJ();
    public boolean LIZLLL = true;
    public final C687560Qy2 LJIIJJI = new C687560Qy2();
    public final C1891630zKD LJIIL = new InterfaceC2175541ACi() { // from class: X.0zKD
        @Override // X.InterfaceC2175541ACi
        public final Integer Dk() {
            return null;
        }

        @Override // X.InterfaceC2175541ACi
        public final boolean LLILLIZIL() {
            return false;
        }

        @Override // X.InterfaceC2175541ACi
        public final void LLLLLLIL() {
        }

        @Override // X.InterfaceC2175541ACi
        public final Object Md() {
            return null;
        }

        @Override // X.InterfaceC2175541ACi
        public final boolean U1() {
            return true;
        }

        @Override // X.InterfaceC2175541ACi
        public final boolean We() {
            return false;
        }

        @Override // X.InterfaceC2175541ACi
        public final Object Y7() {
            return null;
        }

        @Override // X.InterfaceC2175541ACi
        /* JADX INFO: renamed from: if */
        public final void mo29if(String str) {
        }

        @Override // X.InterfaceC2175541ACi
        public final void o() {
        }

        @Override // X.InterfaceC2175541ACi
        public final void oc(C945320ahu c945320ahu) {
        }

        @Override // X.InterfaceC2175541ACi
        public final void oe(String str) {
        }

        @Override // X.InterfaceC2175541ACi
        public final void sk(String str) {
        }

        @Override // X.InterfaceC2175541ACi
        public final void LLLIL() {
            this.LL.LJII(null, null, false);
        }

        @Override // X.InterfaceC2175541ACi
        public final void T5() {
            this.LL.LJIIJ = SystemClock.uptimeMillis();
            C20441214yg.LIZIZ("GameBottombarPageLivePlayer", "playing");
            this.LL.LJIIIIZZ(false);
            this.LL.LJII(null, null, false);
            C687560Qy2 c687560Qy2 = this.LL.LJIIJJI;
            c687560Qy2.LIZJ = 1;
            c687560Qy2.LIZIZ = System.currentTimeMillis();
        }

        @Override // X.InterfaceC2175541ACi
        public final void v() {
            C1891620zKC c1891620zKC = this.LL;
            c1891620zKC.LJIIJJI.LIZJ = 1;
            c1891620zKC.LJIIJ = SystemClock.uptimeMillis();
            this.LL.LJIIJJI.LIZIZ = System.currentTimeMillis();
        }

        @Override // X.InterfaceC2175541ACi
        public final void w9(String str) {
            this.LL.LJIIJJI.LIZLLL = str;
        }

        @Override // X.InterfaceC2175541ACi
        public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
            String str;
            Integer numLJIIJJI;
            int i = C1891650zKF.LIZ[enumC1913550ztZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LL.LJIIIIZZ(false);
                        return;
                    }
                    return;
                }
                this.LL.LJIIIIZZ(true);
                return;
            }
            if (!(obj instanceof String) || (str = (String) obj) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
                return;
            }
            int iIntValue = numLJIIJJI.intValue();
            this.LL.LJII(Integer.valueOf(65535 & iIntValue), Integer.valueOf(iIntValue >> 16), true);
        }

        @Override // X.InterfaceC2175541ACi
        public final void Th(int i, int i2, View view) {
            this.LL.LJII(Integer.valueOf(i), Integer.valueOf(i2), true);
        }
    };
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 696));

    public final C1ACD LJI() {
        return (C1ACD) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC475720Il8
    public final void LIZIZ() {
        C1ACD c1acdLJI = LJI();
        if (c1acdLJI != null) {
            c1acdLJI.LIZIZ();
        }
        C500260Jjc.LJIILIIL(this.LJFF);
        C500260Jjc.LJIILIIL(this.LJI);
        this.LIZJ = false;
        if (this.LJIIJ > 0) {
            this.LJIIJ = 0L;
        }
        if (this.LJII) {
            C687560Qy2 c687560Qy2 = this.LJIIJJI;
            if (c687560Qy2.LIZ > 0 && c687560Qy2.LJ == 0) {
                c687560Qy2.LIZIZ();
            }
        }
        this.LJII = false;
    }

    @Override // X.InterfaceC475720Il8
    public final boolean isPlaying() {
        C1ACD c1acdLJI = LJI();
        if (c1acdLJI != null) {
            return c1acdLJI.LJJII();
        }
        return false;
    }

    @Override // X.InterfaceC475720Il8
    public final void release() {
        C1ACD c1acdLJI = LJI();
        if (c1acdLJI != null) {
            c1acdLJI.LJJIJIL(null, true);
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC475720Il8
    public final boolean isMute() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC475720Il8
    public final void LIZ(boolean z) {
        this.LIZLLL = z;
        C1ACD c1acdLJI = LJI();
        if (c1acdLJI != null) {
            c1acdLJI.LJIILJJIL(z);
        }
    }

    @Override // X.InterfaceC475720Il8
    public final void LIZLLL(FrameLayout frameLayout) {
        FrameLayout.LayoutParams layoutParams;
        this.LJII = true;
        this.LJIIIZ = frameLayout.getWidth();
        this.LJIIIIZZ = frameLayout.getHeight();
        Room room = this.LJ;
        if (room == null) {
            return;
        }
        LiveRoomStruct liveRoomStructLIZIZ = C1AEY.LIZIZ(room);
        C1ACD c1acdLJI = LJI();
        if (c1acdLJI != null) {
            c1acdLJI.LJJIIJZLJL(this.LIZLLL, liveRoomStructLIZIZ, frameLayout, false, null, "", false, null);
        }
        C1ACD c1acdLJI2 = LJI();
        if (c1acdLJI2 != null) {
            c1acdLJI2.LJIILJJIL(this.LIZLLL);
        }
        LJIIIIZZ(true);
        View childAt = frameLayout.getChildAt(0);
        if (this.LIZ != null && childAt != null) {
            C786410Ut5.W5(childAt, this.LIZ);
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if (childAt != null) {
            layoutParams2 = childAt.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
        }
        this.LJIIJJI.LIZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC475720Il8
    public final void LJ(Room room) {
        if (!Intrinsics.LJFF(this.LJ, room)) {
            this.LIZ = null;
        }
        this.LJ = room;
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            View view = this.LJFF;
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
            }
            View view2 = this.LJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                return;
            }
            return;
        }
        View view3 = this.LJFF;
        if (view3 != null) {
            C339190DRl.LIZLLL(view3);
        }
        View view4 = this.LJI;
        if (view4 == null) {
            return;
        }
        C500260Jjc.LJIILIIL(view4);
    }

    @Override // X.InterfaceC475720Il8
    public final void LIZJ(TuxIconView tuxIconView, View view) {
        this.LJFF = tuxIconView;
        this.LJI = view;
    }

    public final void LJII(Integer num, Integer num2, boolean z) {
        View videoView;
        int height;
        int width;
        FrameLayout.LayoutParams layoutParams;
        C1ACD c1acdLJI = LJI();
        if (c1acdLJI != null && (videoView = c1acdLJI.getVideoView()) != null) {
            if (num2 != null) {
                height = num2.intValue();
            } else {
                height = videoView.getHeight();
            }
            float f = height;
            if (num != null) {
                width = num.intValue();
            } else {
                width = videoView.getWidth();
            }
            float f2 = width;
            if (f2 > f) {
                float f3 = 10 + f;
                float f4 = this.LJIIIIZZ;
                if (f3 < f4) {
                    if (z || !this.LIZJ) {
                        List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(f2), Float.valueOf(f), Float.valueOf(this.LJIIIZ), Float.valueOf(f4));
                        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
                            Iterator it2 = listLJIIJJI.iterator();
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).floatValue() <= 0.0f) {
                                    return;
                                }
                            }
                        }
                        float f5 = this.LJIIIIZZ / f;
                        ViewGroup.LayoutParams layoutParams2 = videoView.getLayoutParams();
                        layoutParams2.height = this.LJIIIIZZ;
                        layoutParams2.width = (int) (f2 * f5);
                        ViewGroup.LayoutParams layoutParams3 = videoView.getLayoutParams();
                        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                            layoutParams.gravity = 17;
                        }
                        C786410Ut5.W5(videoView, layoutParams2);
                        videoView.requestLayout();
                        this.LIZ = layoutParams2;
                        C20441214yg.LIZIZ("GameBottombarPageLivePlayer", "scaleY =" + f5);
                        this.LIZJ = true;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC475720Il8
    public final void LJFF(Context context, Map map, List list, int i) {
        C0J5O c0j5oZ5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gotoWatchLive  defaultIndex=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("GameBottombarPageLivePlayer", C2188811AlT.LIZIZ(sbLIZ));
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            c0j5oZ5.LIZ(context, map, "game_bottombar_page", list, i, null);
        }
    }
}
