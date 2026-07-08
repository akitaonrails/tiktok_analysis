package X;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.RoundAnchorStreamCornerEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicEnableSurfaceStateTracker;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.1Dq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268141Dq8 implements InterfaceC2181691AZz {
    public final DataChannel LIZ;
    public final InterfaceC2181771Aa7 LIZIZ;
    public String LIZJ = "";
    public int LIZLLL = -1;
    public final boolean LJ = false;
    public final String LJFF;
    public boolean LJI;
    public SurfaceHolderCallbackC2176471AFx<C2268141Dq8> LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;

    @Override // X.InterfaceC2181691AZz
    public final void LJIL() {
        this.LJIIIZ = null;
    }

    public final boolean LIZ() {
        if (this.LJIIIZ == null) {
            return false;
        }
        String str = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkTokenAndReturn, token:");
        sbLIZ.append(this.LJIIIZ);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIJJI() {
        boolean zIsDestroyed = this.LIZIZ.isDestroyed();
        if (this.LJIIIZ != null) {
            this.LJIIIZ = null;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2268151Dq9(this, zIsDestroyed, "release"));
    }

    @Override // X.InterfaceC2181691AZz
    public final View LJIILJJIL() {
        C15CK c15ck;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (c15ck = (C15CK) dataChannel.gg0(C769520UGo.class)) == null) {
            return null;
        }
        return c15ck.LIZIZ;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJJ() {
        if (this.LJIIIZ != null) {
            this.LJIIIZ = null;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2268151Dq9(this, false, "layout end"));
    }

    @Override // X.InterfaceC2181691AZz
    public final void init() {
        boolean zContainsKey;
        SurfaceView surfaceView;
        SurfaceHolder holder;
        View view;
        DataChannel dataChannel = this.LIZ;
        String strLJIIL = null;
        C15CK c15ck = dataChannel != null ? (C15CK) dataChannel.gg0(C769520UGo.class) : null;
        String str = this.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, render view:");
        if (c15ck != null && (view = c15ck.LIZIZ) != null) {
            strLJIIL = C500260Jjc.LJIIL(view);
        }
        sbLIZ.append(strLJIIL);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (c15ck == null) {
            return;
        }
        synchronized (c15ck) {
            zContainsKey = c15ck.LJFF.containsKey(Integer.valueOf(hashCode()));
        }
        if (!zContainsKey) {
            c15ck.LIZJ(this);
        }
        if (LinkMicEnableSurfaceStateTracker.INSTANCE.isEnable()) {
            if (this.LJII == null) {
                this.LJII = new SurfaceHolderCallbackC2176471AFx<>(this.LJFF, this);
            }
            if (this.LJIIIIZZ) {
                return;
            }
            View view2 = c15ck.LIZIZ;
            if ((view2 instanceof SurfaceView) && (surfaceView = (SurfaceView) view2) != null && (holder = surfaceView.getHolder()) != null) {
                holder.addCallback(this.LJII);
            }
            this.LJIIIIZZ = true;
        }
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIJ() {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2268211DqF(this));
    }

    @Override // X.InterfaceC2181691AZz
    public final boolean LJIILIIL() {
        return this.LJ;
    }

    @Override // X.InterfaceC2181691AZz
    public final int LJIJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2181691AZz
    public final String getLinkMicId() {
        return this.LIZJ;
    }

    public static final Rect LIZIZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        return null;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIL(int i) {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(RoundAnchorStreamCornerEvent.class, Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIILL(boolean z) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2268201DqE(this, z));
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIILLIIL(Rect rect) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2268171DqB(this, rect));
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJI(int i) {
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJJ(String str) {
        this.LIZJ = str;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJJLI(String str) {
        this.LJIIIZ = str;
    }

    @Override // X.InterfaceC2181691AZz
    public final void setVisible(boolean z) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2268221DqG(this, z));
    }

    public C2268141Dq8(DataChannel dataChannel, InterfaceC2181771Aa7 interfaceC2181771Aa7) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC2181771Aa7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append("AnchorRenderViewAdapter");
        this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIZILJ(ViewGroup viewGroup, int i, boolean z, boolean z2) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2268191DqD(this, viewGroup, this.LJI, i, z2, z));
    }
}
