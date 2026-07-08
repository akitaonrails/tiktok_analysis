package X;

import Y.ARunnableS10S0102000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.simkit.impl.player.SurfaceViewHolder;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0oSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class SurfaceHolderCallbackC1474210oSx implements SurfaceHolder.Callback {
    public final /* synthetic */ C1474220oSy LL;
    public final /* synthetic */ SurfaceViewHolder LLILLJJLI;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (((Boolean) C1474810oTv.l5.getValue()).booleanValue()) {
            C1972507o3.LIZ(this.LL);
        }
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(surfaceHolder, this, 113));
            return;
        }
        if (this.LLILLJJLI.LLILLJJLI == null) {
            this.LLILLJJLI.LLILLJJLI = surfaceHolder.getSurface();
        }
        InterfaceC1474000oSc interfaceC1474000oSc = this.LLILLJJLI.LLILLL;
        if (interfaceC1474000oSc != null) {
            interfaceC1474000oSc.LJ();
        }
        for (InterfaceC1473950oSX interfaceC1473950oSX : this.LLILLJJLI.LLILZ.keySet()) {
            SurfaceViewHolder surfaceViewHolder = this.LLILLJJLI;
            interfaceC1473950oSX.LLILLIZIL(surfaceViewHolder.LLILZIL, surfaceViewHolder.LLILZLL);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 171));
            return;
        }
        InterfaceC1474000oSc interfaceC1474000oSc = this.LLILLJJLI.LLILLL;
        if (interfaceC1474000oSc != null) {
            interfaceC1474000oSc.LIZLLL();
        }
        Iterator<InterfaceC1473950oSX> it2 = this.LLILLJJLI.LLILZ.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        this.LLILLJJLI.LLILLJJLI = null;
    }

    public SurfaceHolderCallbackC1474210oSx(SurfaceViewHolder surfaceViewHolder, C1474220oSy c1474220oSy) {
        this.LLILLJJLI = surfaceViewHolder;
        this.LL = c1474220oSy;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS10S0102000_23(this, i2, i3, 7));
            return;
        }
        SurfaceViewHolder surfaceViewHolder = this.LLILLJJLI;
        surfaceViewHolder.LLILZIL = i2;
        surfaceViewHolder.LLILZLL = i3;
        Iterator<InterfaceC1473950oSX> it2 = surfaceViewHolder.LLILZ.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().LLF(i2, i3);
        }
    }
}
