package X;

import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3SingleViewSetting;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180911AWz implements InterfaceC937840aVq {
    public final int LIZ;
    public final int LIZIZ;
    public final C1AX3 LIZJ;
    public final String LIZLLL;
    public final C1AXA LJ;
    public final Function1<View, Rect> LJFF;
    public final Rect LJI;
    public final Rect LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public int LJIILIIL;

    public C2180911AWz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2180911AWz)) {
            return false;
        }
        C2180911AWz c2180911AWz = (C2180911AWz) obj;
        return this.LIZ == c2180911AWz.LIZ && this.LIZIZ == c2180911AWz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2180911AWz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2180911AWz.LIZLLL) && Intrinsics.LJFF(this.LJ, c2180911AWz.LJ) && Intrinsics.LJFF(this.LJFF, c2180911AWz.LJFF) && Intrinsics.LJFF(this.LJI, c2180911AWz.LJI) && Intrinsics.LJFF(this.LJII, c2180911AWz.LJII) && this.LJIIIIZZ == c2180911AWz.LJIIIIZZ && this.LJIIIZ == c2180911AWz.LJIIIZ && this.LJIIJ == c2180911AWz.LJIIJ && this.LJIIJJI == c2180911AWz.LJIIJJI && this.LJIIL == c2180911AWz.LJIIL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL);
    }

    public final String toString() {
        return "MaskWindow(pos=" + this.LIZ + ", serverPos=" + this.LIZIZ + ", micWindow=" + this.LIZJ + ", layoutId=" + this.LIZLLL + ", snapshot=" + this.LJ + ", measureAction=" + this.LJFF + ", containerInWindow=" + this.LJI + ", surfaceViewRectInScreen=" + this.LJII + ", contentPositionType=" + this.LJIIIIZZ + ", radius=" + this.LJIIIZ + ", needBindZOrder=" + this.LJIIJ + ", singleViewModeV2=" + this.LJIIJJI + ", enableRenderLayer=" + this.LJIIL + ')';
    }

    @Override // X.InterfaceC937840aVq
    public final long LIZ() {
        Long l = this.LIZJ.LIZ.LIZIZ;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // X.InterfaceC937840aVq
    public final boolean LIZJ() {
        return this.LIZ == 0;
    }

    @Override // X.InterfaceC937840aVq
    public final SurfaceView LIZLLL() {
        return this.LIZJ.LIZ.LIZLLL;
    }

    @Override // X.InterfaceC937840aVq
    public final String LJ() {
        return this.LIZJ.LIZ.LIZJ;
    }

    @Override // X.InterfaceC937840aVq
    public final Rect LJFF() {
        Rect rect = new Rect();
        this.LIZJ.LIZIZ.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // X.InterfaceC937840aVq
    public final boolean LJI() {
        return this.LIZIZ != -1;
    }

    @Override // X.InterfaceC937840aVq
    public final Rect LJIIJ() {
        return MultiGuestV3SingleViewSetting.INSTANCE.getValue() ? this.LJII : this.LJI;
    }

    @Override // X.InterfaceC937840aVq
    public final Rect LJIIJJI() {
        C1850090yFD c1850090yFD = this.LJ.LIZJ;
        return new Rect(c1850090yFD.LIZ, c1850090yFD.LIZIZ, c1850090yFD.LIZJ, c1850090yFD.LIZLLL);
    }

    @Override // X.InterfaceC937840aVq
    public final Rect LJIIL() {
        return this.LJFF.invoke(this.LIZJ.LIZIZ);
    }

    @Override // X.InterfaceC937840aVq
    public final FrameLayout LJJIIJ() {
        return this.LIZJ.LIZIZ;
    }

    @Override // X.InterfaceC937840aVq
    public final EnumC918810a19 state() {
        EnumC918810a19 enumC918810a19 = this.LIZJ.LIZ.LIZ;
        return enumC918810a19 == null ? EnumC918810a19.StateIdle : enumC918810a19;
    }

    @Override // X.InterfaceC937840aVq
    public final boolean LJIILIIL() {
        return state() == EnumC918810a19.StateIdle || state() == EnumC918810a19.StateInit;
    }

    @Override // X.InterfaceC937840aVq
    public final boolean LJII() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC937840aVq
    public final int LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC937840aVq
    public final Rect LJIIIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC937840aVq
    public final int LJIILJJIL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC937840aVq
    public final int LJIILL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC937840aVq
    public final boolean LJIILLIIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC937840aVq
    public final int getCornerRadius() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC937840aVq
    public final int LIZIZ(boolean z) {
        if (z) {
            C918060Zzw c918060Zzw = C918060Zzw.LIZ;
            boolean zCurrentUserIsAnchor = LinkCoreModelKt.currentUserIsAnchor();
            c918060Zzw.getClass();
            if (C918060Zzw.LIZ(zCurrentUserIsAnchor)) {
                return this.LIZJ.LIZ.LJIIIZ;
            }
        }
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    @Override // X.InterfaceC937840aVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIZILJ(boolean r6) {
        /*
            r5 = this;
            r4 = 3
            r3 = 2
            r2 = 1
            if (r6 == 0) goto L23
            X.0Zzw r1 = X.C918060Zzw.LIZ
            boolean r0 = com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt.currentUserIsAnchor()
            r1.getClass()
            boolean r0 = X.C918060Zzw.LIZ(r0)
            if (r0 == 0) goto L23
            X.1AX3 r0 = r5.LIZJ
            X.1AXI r0 = r0.LIZ
            int r0 = r0.LJIIIZ
            if (r0 == r2) goto L22
            int r0 = r5.LJIIIIZZ
            if (r0 == r3) goto L22
            if (r0 != r4) goto L2c
        L22:
            return r2
        L23:
            int r0 = r5.LJIIIIZZ
            if (r0 == r2) goto L22
            if (r0 == r3) goto L22
            if (r0 != r4) goto L2c
            return r2
        L2c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2180911AWz.LJIIZILJ(boolean):boolean");
    }

    public C2180911AWz(int i, int i2, C1AX3 c1ax3, String str, C1AXA c1axa, C2180791AWn c2180791AWn, Rect rect, Rect rect2, int i3, int i4, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c1ax3;
        this.LIZLLL = str;
        this.LJ = c1axa;
        this.LJFF = c2180791AWn;
        this.LJI = rect;
        this.LJII = rect2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = false;
        this.LJIIJJI = z;
        this.LJIIL = z2;
    }
}
