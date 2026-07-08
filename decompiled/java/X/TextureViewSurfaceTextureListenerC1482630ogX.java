package X;

import Y.ARunnableS10S0102000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS8S0202000_23;
import Y.ARunnableS92S0200000_23;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.simkit.impl.player.TextureViewHolder;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0ogX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class TextureViewSurfaceTextureListenerC1482630ogX implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1482600ogU LLILLJJLI;
    public final /* synthetic */ TextureViewHolder LLILLL;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureDestroyed:");
        sbLIZ.append(surfaceTexture);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS123S0100000_23(this, 43));
        } else {
            InterfaceC1474000oSc interfaceC1474000oSc = this.LLILLL.LLIZ;
            if (interfaceC1474000oSc != null && !this.LL) {
                interfaceC1474000oSc.LIZLLL();
            }
            Iterator<InterfaceC1473950oSX> it2 = this.LLILLL.LLIZLLLIL.keySet().iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
            if (!this.LL) {
                this.LLILLL.LLILZLL = null;
            }
            HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS123S0100000_23(this, 44));
        }
        return !this.LL;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS92S0200000_23(surfaceTexture, this, 30));
            return;
        }
        Iterator<InterfaceC1473950oSX> it2 = this.LLILLL.LLIZLLLIL.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public TextureViewSurfaceTextureListenerC1482630ogX(TextureViewHolder textureViewHolder, boolean z, C1482600ogU c1482600ogU) {
        this.LLILLL = textureViewHolder;
        this.LL = z;
        this.LLILLJJLI = c1482600ogU;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureAvailable:");
        sbLIZ.append(surfaceTexture);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS8S0202000_23(this, surfaceTexture, i, i2, 0));
            return;
        }
        if (this.LLILLL.LLILZLL == null) {
            this.LLILLL.LLILZLL = new Surface(surfaceTexture);
        }
        if (this.LL) {
            this.LLILLL.LLILLL = surfaceTexture;
        }
        InterfaceC1474000oSc interfaceC1474000oSc = this.LLILLL.LLIZ;
        if (interfaceC1474000oSc != null) {
            interfaceC1474000oSc.LJ();
        }
        Iterator<InterfaceC1473950oSX> it2 = this.LLILLL.LLIZLLLIL.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().LLILLIZIL(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (C1474810oTv.LJJZ()) {
            C0C83.INS.runOnMsg(new ARunnableS10S0102000_23(this, i, i2, 3));
            return;
        }
        Iterator<InterfaceC1473950oSX> it2 = this.LLILLL.LLIZLLLIL.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().LLF(i, i2);
        }
    }
}
