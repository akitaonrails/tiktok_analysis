package X;

import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkSurfaceViewLayerFix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AXI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXI {
    public static final C01GW<HashSet<Pair<EnumC918810a19, EnumC918810a19>>> LJIIJ = C452501pT.LIZIZ(new C1AXJ());
    public EnumC918810a19 LIZ;
    public Long LIZIZ;
    public String LIZJ;
    public SurfaceView LIZLLL;
    public C1AXG LJ;
    public WeakReference<InterfaceC1268870j7l> LJFF;
    public EnumC918810a19 LJI;
    public final boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;

    public C1AXI() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1AXI)) {
            return false;
        }
        C1AXI c1axi = (C1AXI) obj;
        return this.LIZ == c1axi.LIZ && Intrinsics.LJFF(this.LIZIZ, c1axi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1axi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1axi.LIZLLL) && Intrinsics.LJFF(this.LJ, c1axi.LJ) && Intrinsics.LJFF(this.LJFF, c1axi.LJFF) && this.LJI == c1axi.LJI && this.LJII == c1axi.LJII && this.LJIIIIZZ == c1axi.LJIIIIZZ && this.LJIIIZ == c1axi.LJIIIZ;
    }

    public final int hashCode() {
        EnumC918810a19 enumC918810a19 = this.LIZ;
        int iHashCode = (enumC918810a19 == null ? 0 : enumC918810a19.hashCode()) * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SurfaceView surfaceView = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (surfaceView == null ? 0 : surfaceView.hashCode())) * 31;
        C1AXG c1axg = this.LJ;
        int iHashCode5 = (iHashCode4 + (c1axg == null ? 0 : c1axg.hashCode())) * 31;
        WeakReference<InterfaceC1268870j7l> weakReference = this.LJFF;
        return ((((((((iHashCode5 + (weakReference != null ? weakReference.hashCode() : 0)) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MicInfo(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", surfaceView=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", anchorRTCView=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", layer=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", lastState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", canConsume=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", needRemoveSurfaceView=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1AXG LIZ() {
        C1AXG c1axg = this.LJ;
        if (c1axg != null) {
            return c1axg;
        }
        final SurfaceView surfaceView = this.LIZLLL;
        return new C1AXG(surfaceView) { // from class: X.1AKs
            public final SurfaceView LIZ;

            @Override // X.C1AXG
            public final void LIZIZ() {
            }

            @Override // X.C1AXG
            public final boolean LIZJ() {
                return this.LIZ != null;
            }

            @Override // X.C1AXG
            public final void LJIIJ() {
                ViewGroup viewGroup;
                SurfaceView surfaceView2 = this.LIZ;
                if (surfaceView2 != null) {
                    ViewParent parent = surfaceView2.getParent();
                    if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                        return;
                    }
                    C786410Ut5.LJJJLZIJ(surfaceView2, viewGroup);
                }
            }

            {
                this.LIZ = surfaceView;
            }

            @Override // X.C1AXG
            public final void LIZ(FrameLayout.LayoutParams layoutParams) {
                SurfaceView surfaceView2 = this.LIZ;
                if (surfaceView2 != null) {
                    surfaceView2.setTag(surfaceView2.getLayoutParams());
                    C786410Ut5.U5(surfaceView2, layoutParams);
                }
            }

            @Override // X.C1AXG
            public final void LJIIL(int i) {
                SurfaceView surfaceView2 = this.LIZ;
                if (surfaceView2 != null) {
                    C951770asJ.LIZ(i, surfaceView2);
                }
            }

            @Override // X.C1AXG
            public final void LIZLLL(ViewGroup viewGroup, boolean z, boolean z2) {
                ViewGroup viewGroup2;
                SurfaceView surfaceView2 = this.LIZ;
                if (surfaceView2 == null) {
                    return;
                }
                if (surfaceView2.getParent() != null && Intrinsics.LJFF(surfaceView2.getParent(), viewGroup) && !(surfaceView2.getParent() instanceof InterfaceC937820aVo)) {
                    if (LinkMicSdkSurfaceViewLayerFix.INSTANCE.getValue()) {
                        surfaceView2.setZOrderMediaOverlay(z2);
                        return;
                    }
                    return;
                }
                ViewParent parent = surfaceView2.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(surfaceView2, viewGroup2);
                }
                View viewFindViewWithTag = viewGroup.findViewWithTag(surfaceView2.getTag());
                if (viewFindViewWithTag != null) {
                    C786410Ut5.LJJJLZIJ(viewFindViewWithTag, viewGroup);
                }
                try {
                    if (z) {
                        viewGroup.addView(surfaceView2, 0);
                    } else {
                        surfaceView2.setZOrderMediaOverlay(z2);
                        viewGroup.addView(surfaceView2);
                    }
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    public C1AXI(EnumC918810a19 enumC918810a19, Long l, String str, SurfaceView surfaceView, C2181211AYd c2181211AYd, WeakReference weakReference, EnumC918810a19 enumC918810a192, int i) {
        surfaceView = (i & 8) != 0 ? null : surfaceView;
        c2181211AYd = (i & 16) != 0 ? null : c2181211AYd;
        weakReference = (i & 32) != 0 ? null : weakReference;
        enumC918810a192 = (i & 64) != 0 ? EnumC918810a19.StateIdle : enumC918810a192;
        this.LIZ = enumC918810a19;
        this.LIZIZ = l;
        this.LIZJ = str;
        this.LIZLLL = surfaceView;
        this.LJ = c2181211AYd;
        this.LJFF = weakReference;
        this.LJI = enumC918810a192;
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = 0;
    }
}
