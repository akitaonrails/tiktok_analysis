package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891590zK9 implements InterfaceC1885180z9o {
    public ViewGroup.LayoutParams LIZ;
    public boolean LIZJ;
    public Room LJ;
    public int LJFF;
    public View LJI;
    public View LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public Map<String, String> LIZIZ = C2097608Jq.LJ();
    public boolean LIZLLL = true;
    public final C687560Qy2 LJIIL = new C687560Qy2();
    public final C1891600zKA LJIILIIL = new InterfaceC2175541ACi() { // from class: X.0zKA
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
            this.LL.LJIIIIZZ(null, null, false);
        }

        @Override // X.InterfaceC2175541ACi
        public final void T5() {
            this.LL.LJIIJJI = SystemClock.uptimeMillis();
            C20441214yg.LIZIZ("GameMixPageLivePlayCore", "playing");
            this.LL.LJIIIZ(false);
            this.LL.LJIIIIZZ(null, null, false);
            C687560Qy2 c687560Qy2 = this.LL.LJIIL;
            c687560Qy2.LIZJ = 1;
            c687560Qy2.LIZIZ = System.currentTimeMillis();
        }

        @Override // X.InterfaceC2175541ACi
        public final void v() {
            C1891590zK9 c1891590zK9 = this.LL;
            c1891590zK9.LJIIL.LIZJ = 1;
            c1891590zK9.LJIIJJI = SystemClock.uptimeMillis();
            this.LL.LJIIL.LIZIZ = System.currentTimeMillis();
        }

        @Override // X.InterfaceC2175541ACi
        public final void w9(String str) {
            this.LL.LJIIL.LIZLLL = str;
        }

        @Override // X.InterfaceC2175541ACi
        public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
            String str;
            Integer numLJIIJJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayerMessage message=");
            sbLIZ.append(enumC1913550ztZ.name());
            C20441214yg.LIZIZ("GameMixPageLivePlayCore", C2188811AlT.LIZIZ(sbLIZ));
            int i = C1891660zKG.LIZ[enumC1913550ztZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LL.LJIIIZ(false);
                        return;
                    }
                    return;
                }
                this.LL.LJIIIZ(true);
                return;
            }
            if (!(obj instanceof String) || (str = (String) obj) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
                return;
            }
            int iIntValue = numLJIIJJI.intValue();
            this.LL.LJIIIIZZ(Integer.valueOf(65535 & iIntValue), Integer.valueOf(iIntValue >> 16), true);
        }

        @Override // X.InterfaceC2175541ACi
        public final void Th(int i, int i2, View view) {
            this.LL.LJIIIIZZ(Integer.valueOf(i), Integer.valueOf(i2), true);
        }
    };
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 810));

    public final C1ACD LJII() {
        return (C1ACD) this.LJIILJJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r4
      0x0030: PHI (r4v8 boolean) = (r4v2 boolean), (r4v9 boolean) binds: [B:36:0x00c9, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd A[PHI: r4
      0x00cd: PHI (r4v3 boolean) = (r4v2 boolean), (r4v8 boolean) binds: [B:36:0x00c9, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1885180z9o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891590zK9.LIZIZ():void");
    }

    @Override // X.InterfaceC1885180z9o
    public final boolean isPlaying() {
        return LJII().LJJII();
    }

    @Override // X.InterfaceC1885180z9o
    public final void release() {
        LJII().LJJIJIL(null, true);
        this.LIZ = null;
    }

    @Override // X.InterfaceC1885180z9o
    public final boolean isMute() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1885180z9o
    public final void LIZ(boolean z) {
        this.LIZLLL = z;
        LJII().LJIILJJIL(z);
    }

    @Override // X.InterfaceC1885180z9o
    public final void LIZLLL(FrameLayout frameLayout) {
        FrameLayout.LayoutParams layoutParams;
        this.LJIIIIZZ = true;
        this.LJIIJ = frameLayout.getWidth();
        Room room = this.LJ;
        if (room == null) {
            return;
        }
        LJII().LJJIIJZLJL(this.LIZLLL, C1AEY.LIZIZ(room), frameLayout, false, null, "", false, null);
        LJII().LJIILJJIL(this.LIZLLL);
        LJIIIZ(true);
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
        this.LJIIL.LIZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1885180z9o
    public final void LJFF(int i) {
        this.LJIIIZ = i;
    }

    public final void LJIIIZ(boolean z) {
        if (z) {
            View view = this.LJI;
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
            }
            View view2 = this.LJII;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                return;
            }
            return;
        }
        View view3 = this.LJI;
        if (view3 != null) {
            C339190DRl.LIZLLL(view3);
        }
        View view4 = this.LJII;
        if (view4 == null) {
            return;
        }
        C500260Jjc.LJIILIIL(view4);
    }

    @Override // X.InterfaceC1885180z9o
    public final void setLogExtras(Map<String, String> map) {
        this.LIZIZ = map;
    }

    @Override // X.InterfaceC1885180z9o
    public final void LIZJ(TuxIconView tuxIconView, View view) {
        this.LJI = tuxIconView;
        this.LJII = view;
    }

    @Override // X.InterfaceC1885180z9o
    public final void LJ(int i, Room room) {
        if (!Intrinsics.LJFF(this.LJ, room)) {
            this.LIZ = null;
        }
        this.LJ = room;
        this.LJFF = i;
    }

    public final void LJIIIIZZ(Integer num, Integer num2, boolean z) {
        int height;
        int width;
        FrameLayout.LayoutParams layoutParams;
        View videoView = LJII().getVideoView();
        if (videoView == null) {
            return;
        }
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
            float f4 = this.LJIIIZ;
            if (f3 < f4) {
                if (z || !this.LIZJ) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(f2), Float.valueOf(f), Float.valueOf(this.LJIIJ), Float.valueOf(f4));
                    if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
                        Iterator it2 = listLJIIJJI.iterator();
                        while (it2.hasNext()) {
                            if (((Number) it2.next()).floatValue() <= 0.0f) {
                                return;
                            }
                        }
                    }
                    float f5 = this.LJIIIZ / f;
                    ViewGroup.LayoutParams layoutParams2 = videoView.getLayoutParams();
                    layoutParams2.height = this.LJIIIZ;
                    layoutParams2.width = (int) (f2 * f5);
                    ViewGroup.LayoutParams layoutParams3 = videoView.getLayoutParams();
                    if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                        layoutParams.gravity = 17;
                    }
                    C786410Ut5.W5(videoView, layoutParams2);
                    videoView.requestLayout();
                    this.LIZ = layoutParams2;
                    C20441214yg.LIZIZ("GameMixPageLivePlayCore", "scaleY =" + f5);
                    this.LIZJ = true;
                }
            }
        }
    }

    @Override // X.InterfaceC1885180z9o
    public final void LJI(Context context, Room room, EnterRoomConfig enterRoomConfig, List<Long> list, Map<String, String> map) {
        ILiveOuterService iLiveOuterService;
        C0J5O c0j5oZ5;
        LiveRoomStruct liveRoomStructLIZIZ = C1AEY.LIZIZ(room);
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (iLiveOuterService = (ILiveOuterService) serviceManager.getService(ILiveOuterService.class)) != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            c0j5oZ5.LJI(context, enterRoomConfig, liveRoomStructLIZIZ, list, map);
        }
    }
}
