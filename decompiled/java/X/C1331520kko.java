package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331520kko extends AbstractC447090Hg3 {
    public final /* synthetic */ C1331510kkn LIZ;
    public final /* synthetic */ C1330570kjH LIZIZ;
    public final /* synthetic */ InterfaceC1331500kkm LIZJ;
    public final /* synthetic */ InterfaceC1320200kSY LIZLLL;
    public final /* synthetic */ InterfaceC1331910klR LJ;
    public final /* synthetic */ FrescoImageLoaderImpl LJFF;

    @Override // X.C0HWE, X.InterfaceC589510NAf
    public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
        if (abstractC1321260kUG == null) {
            return;
        }
        final float progress = abstractC1321260kUG.getProgress();
        this.LJFF.getCallbackExecutor(this.LIZ).execute(new Runnable() { // from class: X.0kl1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FrescoImageLoaderImpl@7681.createBaseBitmapDataSubscriber$1$onProgressUpdate$1");
                try {
                    int i = C2187451AjH.LIZ;
                    C1330590kjJ.LJII(this.LLILLJJLI.LIZ.hashCode(), "FrescoImageLoaderImpl", "onProgressUpdate");
                    InterfaceC1331910klR interfaceC1331910klR = this.LLILLJJLI.LJ;
                    if (interfaceC1331910klR != null) {
                        interfaceC1331910klR.onProgress(progress);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FrescoImageLoaderImpl@7681.createBaseBitmapDataSubscriber$1$onProgressUpdate$1");
            }
        });
    }

    @Override // X.C0HWE, X.InterfaceC589510NAf
    public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
        C1331710kl7.LIZ(this.LIZ);
        if (abstractC1321260kUG == null) {
            return;
        }
        abstractC1321260kUG.close();
        this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS120S0100000_20(this, 33));
    }

    @Override // X.C0HWE
    public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        C1331710kl7.LIZ(this.LIZ);
        if (interfaceC1320200kSY == null) {
            return;
        }
        this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS89S0200000_20(this, interfaceC1320200kSY.LIZLLL(), 23));
    }

    @Override // X.AbstractC447090Hg3, X.C0HWE
    public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        Bitmap underlyingBitmap;
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "onNewResultImpl$$0");
        if (!interfaceC1320200kSY.LIZ()) {
            C1330590kjJ.LJFF("FrescoImageLoaderImpl", "onNewResultImpl$$0", "dataSource unfinished");
            return;
        }
        C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
        if (result == null) {
            C1330590kjJ.LIZLLL(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "onNewResultImpl$$0", "closeableImageRef is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("scene_tag", this.LIZ.LJJIIJ);
        this.LIZIZ.LJIIIIZZ(null, result.get(), null, this.LIZJ.LIZ(interfaceC1320200kSY), map);
        if (result.get() instanceof AbstractC1325130kaV) {
            underlyingBitmap = ((AbstractC1325130kaV) result.get()).getUnderlyingBitmap();
        } else {
            underlyingBitmap = null;
        }
        try {
            LJI(underlyingBitmap);
            C1323050kX9.LJII(result);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(result);
            throw th;
        }
    }

    @Override // X.AbstractC447090Hg3
    public final void LJI(Bitmap bitmap) {
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "onNewResultImpl$$1");
        C1331710kl7.LIZ(this.LIZ);
        if (this.LIZLLL.LIZ() && bitmap != null && !bitmap.isRecycled()) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            try {
                final Bitmap bitmapCopy = bitmap.copy(config, true);
                this.LIZLLL.close();
                this.LJFF.getCallbackExecutor(this.LIZ).execute(new Runnable() { // from class: X.0kl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FrescoImageLoaderImpl@7681.createBaseBitmapDataSubscriber$1$onNewResultImpl$1");
                        try {
                            int i2 = C2187451AjH.LIZ;
                            C1330590kjJ.LIZ(this.LLILLJJLI.LIZ.hashCode(), "FrescoImageLoaderImpl", "onNewResultImpl$$1", "onCompleted");
                            InterfaceC1331910klR interfaceC1331910klR = this.LLILLJJLI.LJ;
                            if (interfaceC1331910klR != null) {
                                interfaceC1331910klR.LIZ(bitmapCopy);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FrescoImageLoaderImpl@7681.createBaseBitmapDataSubscriber$1$onNewResultImpl$1");
                    }
                });
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C1331660kl2.LIZLLL().LIZ) {
                    C1332160klq c1332160klqLIZLLL = C1331660kl2.LIZLLL();
                    if (c1332160klqLIZLLL.LIZIZ.LJJJJZ.LIZ() == null || !((Boolean) c1332160klqLIZLLL.LIZIZ.LJJJJZ.LIZ()).booleanValue()) {
                        throw th;
                    }
                }
                if (th instanceof OutOfMemoryError) {
                    C1322200kVm.LIZ().LIZIZ();
                    C0QD7.LIZ.LIZIZ();
                    System.gc();
                    this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS120S0100000_20(this, 31));
                    return;
                }
                return;
            }
        }
        this.LJFF.getCallbackExecutor(this.LIZ).execute(new ARunnableS120S0100000_20(this, 32));
    }

    public C1331520kko(FrescoImageLoaderImpl frescoImageLoaderImpl, C1331510kkn c1331510kkn, C1330570kjH c1330570kjH, InterfaceC1331500kkm interfaceC1331500kkm, InterfaceC1320200kSY interfaceC1320200kSY, InterfaceC1331910klR interfaceC1331910klR) {
        this.LJFF = frescoImageLoaderImpl;
        this.LIZ = c1331510kkn;
        this.LIZIZ = c1330570kjH;
        this.LIZJ = interfaceC1331500kkm;
        this.LIZLLL = interfaceC1320200kSY;
        this.LJ = interfaceC1331910klR;
    }
}
