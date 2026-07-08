package Y;

import X.C1468940oKS;
import X.C1473960oSY;
import X.C1474810oTv;
import X.C1493010oxH;
import X.C1C7U;
import X.C21305518Zh;
import X.EnumC1493060oxM;
import X.InterfaceC1473950oSX;
import X.InterfaceC1492980oxE;
import X.InterfaceC1493130oxT;
import X.SurfaceHolderCallbackC1474210oSx;
import X.TextureViewSurfaceTextureListenerC1473970oSZ;
import X.TextureViewSurfaceTextureListenerC1482630ogX;
import com.ss.android.ugc.aweme.simkit.impl.player.SurfaceViewHolder;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS10S0102000_23 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    public static final void run$4(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        C1468940oKS.LLLZZIL((C1468940oKS) aRunnableS10S0102000_23.l0, aRunnableS10S0102000_23.i1, aRunnableS10S0102000_23.i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        SurfaceViewHolder surfaceViewHolder = ((SurfaceHolderCallbackC1474210oSx) this.l0).LLILLJJLI;
        surfaceViewHolder.LLILZIL = this.i1;
        surfaceViewHolder.LLILZLL = this.i2;
        Iterator<InterfaceC1473950oSX> it2 = surfaceViewHolder.LLILZ.keySet().iterator();
        while (it2.hasNext()) {
            it2.next().LLF(this.i1, this.i2);
        }
    }

    public final void LIZ$1() {
        C1473960oSY c1473960oSY = ((TextureViewSurfaceTextureListenerC1473970oSZ) this.l0).LL;
        c1473960oSY.LLILLL = false;
        c1473960oSY.LIZIZ();
        Iterator it2 = new ArrayList(((TextureViewSurfaceTextureListenerC1473970oSZ) this.l0).LL.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1473950oSX) it2.next()).LLILLIZIL(this.i1, this.i2);
        }
    }

    public final void LIZ$2() {
        List arrayList = ((TextureViewSurfaceTextureListenerC1473970oSZ) this.l0).LL.LLILLJJLI;
        if (!C1474810oTv.LJIIZILJ().LIZ) {
            arrayList = new ArrayList(((TextureViewSurfaceTextureListenerC1473970oSZ) this.l0).LL.LLILLJJLI);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1473950oSX) it2.next()).LLF(this.i1, this.i2);
        }
    }

    public static final void run$0(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTWiFiCellSwitcher@1c81.handleWiFiToCellState$1");
        try {
            InterfaceC1492980oxE interfaceC1492980oxE = (InterfaceC1492980oxE) aRunnableS10S0102000_23.l0;
            EnumC1493060oxM.values();
            EnumC1493060oxM enumC1493060oxM = EnumC1493060oxM.STOPPED;
            interfaceC1492980oxE.LIZ(EnumC1493060oxM.values()[aRunnableS10S0102000_23.i2 - enumC1493060oxM.state]);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTWiFiCellSwitcher@1c81.handleWiFiToCellState$1");
    }

    public static final void run$1(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTWiFiCellSimpleSwitcher@d66c.onStateChanged$1");
        try {
            ((InterfaceC1493130oxT) aRunnableS10S0102000_23.l0).LIZ(aRunnableS10S0102000_23.i1, aRunnableS10S0102000_23.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTWiFiCellSimpleSwitcher@d66c.onStateChanged$1");
    }

    public static final void run$2(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        boolean zLIZ;
        C1C7U.LIZ("AICreationPreviewScene@6644.initPlayerEngine$1$onVideoSizeChanged$1");
        try {
            ((C21305518Zh) aRunnableS10S0102000_23.l0).LLLLLL(aRunnableS10S0102000_23.i1, aRunnableS10S0102000_23.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AICreationPreviewScene@6644.initPlayerEngine$1$onVideoSizeChanged$1");
    }

    public static final void run$3(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TextureViewHolder@dd04.<init>$2$onSurfaceTextureSizeChanged$1");
        try {
            Iterator<InterfaceC1473950oSX> it2 = ((TextureViewSurfaceTextureListenerC1482630ogX) aRunnableS10S0102000_23.l0).LLILLL.LLIZLLLIL.keySet().iterator();
            while (it2.hasNext()) {
                it2.next().LLF(aRunnableS10S0102000_23.i1, aRunnableS10S0102000_23.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextureViewHolder@dd04.<init>$2$onSurfaceTextureSizeChanged$1");
    }

    public static final void run$5(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS10S0102000_23.l0;
        int i = aRunnableS10S0102000_23.i1;
        int i2 = aRunnableS10S0102000_23.i2;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifySARChanged$1L");
        c1468940oKS.LLLLLZL.LJJII(i, i2);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifySARChanged$1L");
    }

    public static final void run$6(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS10S0102000_23.l0;
        int i = aRunnableS10S0102000_23.i1;
        int i2 = aRunnableS10S0102000_23.i2;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyVideoSizeChanged$1L");
        c1468940oKS.LLLLLZL.LJIIJJI(c1468940oKS.y5, i, i2);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyVideoSizeChanged$1L");
    }

    public static final void run$7(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SurfaceViewHolder@9c60.<init>$1$surfaceChanged$1");
        try {
            aRunnableS10S0102000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SurfaceViewHolder@9c60.<init>$1$surfaceChanged$1");
    }

    public static final void run$8(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TextureViewWrapper@7f15.initView$1$onSurfaceTextureAvailable$1");
        try {
            aRunnableS10S0102000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextureViewWrapper@7f15.initView$1$onSurfaceTextureAvailable$1");
    }

    public static final void run$9(ARunnableS10S0102000_23 aRunnableS10S0102000_23) {
        boolean zLIZ;
        C1C7U.LIZ("TextureViewWrapper@7f15.initView$1$onSurfaceTextureSizeChanged$1");
        try {
            aRunnableS10S0102000_23.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextureViewWrapper@7f15.initView$1$onSurfaceTextureSizeChanged$1");
    }

    public ARunnableS10S0102000_23(C1493010oxH c1493010oxH, int i, InterfaceC1493130oxT interfaceC1493130oxT, int i2) {
        this.$t = i2;
        this.l0 = interfaceC1493130oxT;
        this.i1 = c1493010oxH.LIZ;
        this.i2 = i;
    }

    public ARunnableS10S0102000_23(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
