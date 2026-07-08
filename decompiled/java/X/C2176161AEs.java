package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicForceRenderViewLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicForceRenderViewLayoutCount;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlayerRenderViewRebuildCleanupFix;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176161AEs implements InterfaceC2181941AaO {
    public final String LIZ;
    public Rect LIZIZ;
    public int LIZJ;
    public WeakReference<View> LIZLLL;
    public WeakReference<View> LJ;
    public FrameLayout.LayoutParams LJFF;
    public Pair<Integer, Integer> LJI;
    public String LJII = "";
    public final String LJIIIIZZ = C500260Jjc.LJIIJJI(this);
    public final ViewOnLayoutChangeListenerC2176171AEt LJIIIZ = new View.OnLayoutChangeListener() { // from class: X.1AEt
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            FrameLayout.LayoutParams layoutParams;
            if (view == null) {
                return;
            }
            C2176161AEs c2176161AEs = this.LL;
            c2176161AEs.getClass();
            if (!Intrinsics.LJFF(view.getTag(R.id.ysw), c2176161AEs.LIZ)) {
                view.removeOnLayoutChangeListener(this);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLayoutChange, remove layout change listener, ");
                sbLIZ.append(C500260Jjc.LJIIL(view));
                sbLIZ.append(", key:");
                sbLIZ.append(view.getTag(R.id.ysw));
                C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (LinkMicPlayerRenderViewRebuildCleanupFix.INSTANCE.isEnable() && !this.LL.LJFF(view)) {
                view.removeOnLayoutChangeListener(this);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLayoutChange, owner not match, remove layout change listener, view:");
                sbLIZ2.append(C500260Jjc.LJIIL(view));
                sbLIZ2.append(", self:");
                sbLIZ2.append(this.LL.LJIIIIZZ);
                sbLIZ2.append(", owner:");
                sbLIZ2.append(view.getTag(R.id.ysr));
                C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            C2176161AEs c2176161AEs2 = this.LL;
            Rect rect = c2176161AEs2.LIZIZ;
            if (rect == null) {
                return;
            }
            if (c2176161AEs2.LIZJ >= LinkMicForceRenderViewLayoutCount.INSTANCE.getValue()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onLayoutChange, over limit time, ");
                sbLIZ3.append(this.LL.LIZJ);
                C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            if (Math.abs(i - rect.left) <= 5 && Math.abs(i2 - rect.top) <= 5 && Math.abs(i3 - rect.right) <= 5 && Math.abs(i4 - rect.bottom) <= 5) {
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onLayoutChange, on layout not match, actual: ");
            sbLIZ4.append(i);
            sbLIZ4.append(", ");
            sbLIZ4.append(i2);
            sbLIZ4.append(", ");
            sbLIZ4.append(i3);
            sbLIZ4.append(", ");
            sbLIZ4.append(i4);
            sbLIZ4.append(", params: ");
            sbLIZ4.append(C500260Jjc.LJIIJJI(view.getLayoutParams()));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                C2176161AEs c2176161AEs3 = this.LL;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append(", gravity:");
                sbLIZ5.append(layoutParams.gravity);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                c2176161AEs3.LIZJ++;
                if (layoutParams.gravity != 51) {
                    layoutParams.gravity = 51;
                }
                layoutParams.leftMargin = rect.left;
                layoutParams.topMargin = rect.top;
                layoutParams.width = rect.width();
                layoutParams.height = rect.height();
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ2);
                sbLIZ6.append(", expect: ");
                sbLIZ6.append(rect);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                view.requestLayout();
            }
            C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", strLIZIZ);
        }
    };

    public final View LIZLLL() {
        View view;
        WeakReference<View> weakReference = this.LIZLLL;
        return (weakReference == null || (view = weakReference.get()) == null) ? LJ() : view;
    }

    public final View LJ() {
        InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
        if (interfaceC480510Isr == null) {
            C20441214yg.LJ("LinkMicPlayerRenderViewAdapter", "getPlayerController, current player is null");
            return null;
        }
        View videoView = interfaceC480510Isr.getVideoView();
        if (videoView == null) {
            return videoView;
        }
        this.LIZLLL = new WeakReference<>(videoView);
        String strLJIIJJI = C500260Jjc.LJIIJJI(videoView);
        if (this.LJII.length() == 0) {
            this.LJII = strLJIIJJI;
        }
        if (Intrinsics.LJFF(strLJIIJJI, this.LJII)) {
            return videoView;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRenderViewFromPlayer, new player render view is not match, new:");
        sbLIZ.append(strLJIIJJI);
        sbLIZ.append(", old:");
        sbLIZ.append(this.LJII);
        C20441214yg.LJIIL("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ));
        return videoView;
    }

    @Override // X.InterfaceC2181941AaO
    public final Pair<Integer, Integer> getResolution() {
        InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
        if (interfaceC480510Isr == null) {
            C20441214yg.LJ("LinkMicPlayerRenderViewAdapter", "getPlayerController, current player is null");
        } else {
            int iP0 = interfaceC480510Isr.p0();
            if (iP0 != 0) {
                return new Pair<>(Integer.valueOf(65535 & iP0), Integer.valueOf(iP0 >> 16));
            }
        }
        return this.LJI;
    }

    @Override // X.InterfaceC2181941AaO
    public final Rect getSize() {
        Rect rect = this.LIZIZ;
        if (rect != null) {
            return rect;
        }
        View viewLIZLLL = LIZLLL();
        if (viewLIZLLL != null) {
            return new Rect(viewLIZLLL.getLeft(), viewLIZLLL.getTop(), viewLIZLLL.getRight(), viewLIZLLL.getBottom());
        }
        return null;
    }

    @Override // X.InterfaceC2181941AaO
    public final void reset() {
        View viewLIZLLL = LIZLLL();
        LinkMicPlayerRenderViewRebuildCleanupFix linkMicPlayerRenderViewRebuildCleanupFix = LinkMicPlayerRenderViewRebuildCleanupFix.INSTANCE;
        if (linkMicPlayerRenderViewRebuildCleanupFix.isEnable()) {
            this.LIZIZ = null;
            this.LJFF = null;
            this.LIZJ = 0;
        }
        LIZJ(viewLIZLLL);
        if (viewLIZLLL == null) {
            C20441214yg.LJ("LinkMicPlayerRenderViewAdapter", "reset, renderView is null");
            return;
        }
        LJI(viewLIZLLL, false);
        if (linkMicPlayerRenderViewRebuildCleanupFix.isEnable() && LJFF(viewLIZLLL)) {
            viewLIZLLL.setTag(R.id.ysr, null);
        }
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) viewLIZLLL.getTag(R.id.yss);
        String str = (String) viewLIZLLL.getTag(R.id.yst);
        if (layoutParams != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reset, view:");
            sbLIZ.append(C500260Jjc.LJIIL(viewLIZLLL));
            sbLIZ.append(", use last layout params[");
            sbLIZ.append(layoutParams.hashCode());
            sbLIZ.append("], from:");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.W5(viewLIZLLL, layoutParams);
            return;
        }
        if (!(viewLIZLLL.getParent() instanceof FrameLayout)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateSize,  parent isn't FrameLayout, ");
            sbLIZ2.append(C500260Jjc.LJIIL((View) viewLIZLLL.getParent()));
            C20441214yg.LJ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("reset, view:");
        sbLIZ3.append(C500260Jjc.LJIIL(viewLIZLLL));
        C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ3));
        C786410Ut5.W5(viewLIZLLL, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // X.InterfaceC2181941AaO
    public final void init() {
        LJ();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1AEt] */
    public C2176161AEs(String str) {
        this.LIZ = str;
    }

    public final void LIZJ(View view) {
        View view2;
        WeakReference<View> weakReference = this.LJ;
        if (weakReference != null && (view2 = weakReference.get()) != null) {
            if (view2 != view) {
                view2.removeOnLayoutChangeListener(this.LJIIIZ);
                if (view != null) {
                }
            }
            view.removeOnLayoutChangeListener(this.LJIIIZ);
        } else if (view != null) {
            view.removeOnLayoutChangeListener(this.LJIIIZ);
        }
        this.LJ = null;
    }

    public final boolean LJFF(View view) {
        Object tag = view.getTag(R.id.ysr);
        if ((tag instanceof String) && tag != null && !Intrinsics.LJFF(tag, this.LJIIIIZZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC2181941AaO
    public final void LIZIZ(int i, int i2) {
        this.LJI = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void LJI(View view, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add mark view[");
            sbLIZ.append(C500260Jjc.LJIIL(view));
            sbLIZ.append("], key=");
            sbLIZ.append(this.LIZ);
            C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ));
            view.setTag(R.id.ysw, this.LIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("clear mark view[");
        sbLIZ2.append(C500260Jjc.LJIIL(view));
        sbLIZ2.append(']');
        C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        view.setTag(R.id.ysw, null);
    }

    @Override // X.InterfaceC2181941AaO
    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LIZIZ = new Rect(i, i2, i3, i4);
        this.LIZJ = 0;
        View viewLIZLLL = LIZLLL();
        if (viewLIZLLL != null) {
            if (viewLIZLLL.getParent() instanceof FrameLayout) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateSize, view:");
                sbLIZ.append(C500260Jjc.LJIIL(viewLIZLLL));
                sbLIZ.append(", l:");
                sbLIZ.append(i);
                sbLIZ.append(" t:");
                sbLIZ.append(i2);
                sbLIZ.append(" r:");
                sbLIZ.append(i3);
                sbLIZ.append(" b:");
                sbLIZ.append(i4);
                C20441214yg.LIZIZ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ));
                LJI(viewLIZLLL, true);
                if (LinkMicPlayerRenderViewRebuildCleanupFix.INSTANCE.isEnable() && LinkMicForceRenderViewLayout.INSTANCE.isEnable()) {
                    viewLIZLLL.setTag(R.id.ysr, this.LJIIIIZZ);
                }
                if (LinkMicForceRenderViewLayout.INSTANCE.isEnable()) {
                    LIZJ(viewLIZLLL);
                    viewLIZLLL.addOnLayoutChangeListener(this.LJIIIZ);
                    this.LJ = new WeakReference<>(viewLIZLLL);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3 - i, i4 - i2, 51);
                layoutParams.leftMargin = i;
                layoutParams.topMargin = i2;
                C786410Ut5.W5(viewLIZLLL, layoutParams);
                this.LJFF = layoutParams;
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateSize, parent isn't FrameLayout, ");
            sbLIZ2.append(C500260Jjc.LJIIL((View) viewLIZLLL.getParent()));
            C20441214yg.LJ("LinkMicPlayerRenderViewAdapter", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C20441214yg.LJ("LinkMicPlayerRenderViewAdapter", "updateSize, renderView is null");
    }
}
