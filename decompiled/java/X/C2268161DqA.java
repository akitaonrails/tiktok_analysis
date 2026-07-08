package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.RoundAnchorStreamCornerEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS151S0110000_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268161DqA implements InterfaceC2181691AZz {
    public final int LIZ;
    public String LIZIZ;
    public int LIZJ = -1;
    public final DataChannel LIZLLL;
    public final String LJ;
    public boolean LJFF;
    public String LJI;

    @Override // X.InterfaceC2181691AZz
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIL() {
        this.LJI = null;
    }

    public final boolean LIZ() {
        if (this.LJI == null) {
            return false;
        }
        String str = this.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkTokenAndReturn, token:");
        sbLIZ.append(this.LJI);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    public final String LIZJ() {
        int i = this.LIZ;
        return i != 2 ? i != 4 ? String.valueOf(i) : "Guest" : "CoHost";
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIJJI() {
        if (this.LJI != null) {
            this.LJI = null;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS579S0100000_35(this, 420));
    }

    @Override // X.InterfaceC2181691AZz
    public final View LJIILJJIL() {
        C15CK c15ck = (C15CK) this.LIZLLL.gg0(C769520UGo.class);
        if (c15ck != null) {
            return c15ck.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJJ() {
        if (this.LJI != null) {
            this.LJI = null;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS579S0100000_35(this, 420));
    }

    @Override // X.InterfaceC2181691AZz
    public final void init() {
        boolean zContainsKey;
        C15CK c15ck = (C15CK) this.LIZLLL.gg0(C769520UGo.class);
        if (c15ck != null) {
            synchronized (c15ck) {
                zContainsKey = c15ck.LJFF.containsKey(Integer.valueOf(hashCode()));
            }
            if (zContainsKey) {
                return;
            }
            c15ck.LIZJ(this);
        }
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIJ() {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS579S0100000_35(this, 419));
    }

    @Override // X.InterfaceC2181691AZz
    public final int LJIJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2181691AZz
    public final String getLinkMicId() {
        return this.LIZIZ;
    }

    public static final Rect LIZIZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.width, marginLayoutParams.height);
        }
        return null;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIL(int i) {
        this.LIZLLL.LC0(RoundAnchorStreamCornerEvent.class, Integer.valueOf(i));
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIILL(boolean z) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS151S0110000_35(this, z, 2));
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIILLIIL(Rect rect) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS436S0200000_35(this, rect, 89));
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJI(int i) {
        this.LIZJ = i;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJJ(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJJLI(String str) {
        this.LJI = str;
    }

    @Override // X.InterfaceC2181691AZz
    public final void setVisible(boolean z) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS151S0110000_35(this, z, 3));
    }

    public C2268161DqA(DataChannel dataChannel, int i, String str) {
        String str2;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZLLL = dataChannel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (i == 4) {
            str2 = "Multi";
        } else {
            str2 = "Cohost";
        }
        sbLIZ.append(str2);
        sbLIZ.append("LayoutAnchorRTCView");
        this.LJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIZILJ(ViewGroup viewGroup, int i, boolean z, boolean z2) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2268181DqC(this, viewGroup, this.LJFF, i, z2, z));
    }
}
