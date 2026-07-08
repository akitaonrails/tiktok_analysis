package X;

import Y.ARunnableS10S0102000_23;
import Y.ARunnableS92S0200000_23;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0oSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class TextureViewSurfaceTextureListenerC1473970oSZ implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C1473960oSY LL;

    public TextureViewSurfaceTextureListenerC1473970oSZ(C1473960oSY c1473960oSY) {
        this.LL = c1473960oSY;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1473870oSP c1473870oSP;
        Surface surface;
        if (C1474810oTv.LJJJJLI() && (c1473870oSP = this.LL.LL) != null && (surface = c1473870oSP.getSurface()) != null) {
            C1471640oOo.LIZJ.remove(surface);
        }
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(surfaceTexture, this, 152));
        } else {
            List arrayList = this.LL.LLILLJJLI;
            if (!C1474810oTv.LJIIZILJ().LIZ) {
                arrayList = new ArrayList(this.LL.LLILLJJLI);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1473950oSX) it2.next()).LIZ();
            }
            C1473960oSY c1473960oSY = this.LL;
            if (!c1473960oSY.LLILLL) {
                surfaceTexture = null;
            }
            c1473960oSY.LLILZ = surfaceTexture;
        }
        return !this.LL.LLILLL;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(surfaceTexture, this, 153));
            return;
        }
        List arrayList = this.LL.LLILLJJLI;
        if (!C1474810oTv.LJIIZILJ().LIZ) {
            arrayList = new ArrayList(this.LL.LLILLJJLI);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1473950oSX) it2.next()).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS10S0102000_23(this, i, i2, 8));
        } else {
            C1473960oSY c1473960oSY = this.LL;
            c1473960oSY.LLILLL = false;
            c1473960oSY.LIZIZ();
            List arrayList = this.LL.LLILLJJLI;
            if (!C1474810oTv.LJIIZILJ().LIZ) {
                arrayList = new ArrayList(this.LL.LLILLJJLI);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1473950oSX) it2.next()).LLILLIZIL(i, i2);
            }
        }
        if (C1474810oTv.LJJJJLI()) {
            C1473870oSP c1473870oSP = this.LL.LL;
            C1471640oOo.LIZJ.put(c1473870oSP.getSurface(), c1473870oSP);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS10S0102000_23(this, i, i2, 9));
            return;
        }
        List arrayList = this.LL.LLILLJJLI;
        if (!C1474810oTv.LJIIZILJ().LIZ) {
            arrayList = new ArrayList(this.LL.LLILLJJLI);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1473950oSX) it2.next()).LLF(i, i2);
        }
    }
}
