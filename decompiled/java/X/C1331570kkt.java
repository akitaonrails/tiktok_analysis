package X;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.fresco.sr.BmfJniSr;
import com.bytedance.lighten.core.config.SRConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.optimize.statistics.StatLogUtils;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: X.0kkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331570kkt implements InterfaceC1331800klG {
    public static volatile boolean LIZLLL;
    public final C1328960kgg LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
        return null;
    }

    @Override // X.InterfaceC1331800klG
    public final String getKey() {
        return "SRTransform";
    }

    public C1331570kkt() {
        this.LIZIZ = 32768;
        LIZJ((SRConfig) C1331660kl2.LIZLLL().LIZIZ.LJJIJ.LIZ());
        this.LIZJ = true;
        this.LIZ = new C1328960kgg(32768, true);
    }

    public C1331570kkt(EnumC720130SMp enumC720130SMp) {
        this.LIZIZ = 32768;
        switch (C720140SMq.LIZ[enumC720130SMp.ordinal()]) {
            case 1:
                this.LIZIZ = 4;
                break;
            case 2:
                this.LIZIZ = 8;
                break;
            case 3:
                this.LIZIZ = 16;
                break;
            case 4:
                this.LIZIZ = 32;
                break;
            case 5:
                this.LIZIZ = 1;
                break;
            case 6:
                this.LIZIZ = 2;
                break;
            default:
                this.LIZIZ = 32768;
                break;
        }
        LIZJ((SRConfig) C1331660kl2.LIZLLL().LIZIZ.LJJIJ.LIZ());
        this.LIZJ = false;
        this.LIZ = new C1328960kgg(this.LIZIZ, false);
    }

    public static void LIZJ(SRConfig sRConfig) {
        int i;
        String absolutePath;
        boolean z;
        String absolutePath2;
        if (!LIZLLL) {
            synchronized (C1331570kkt.class) {
                try {
                    if (!LIZLLL) {
                        if (sRConfig == null) {
                            sRConfig = new SRConfig();
                        }
                        if (sRConfig.useJniSr) {
                            IDebugConfig iDebugConfig = (IDebugConfig) PluggableExtentionKt.pluggableSpi(IDebugConfig.class);
                            if (iDebugConfig != null && iDebugConfig.isOpen()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            StatLogUtils.setsIsDebug(z);
                            C1328730kgJ.LJIJJLI = true;
                            try {
                                int i2 = sRConfig.bitmapWidth;
                                int i3 = sRConfig.bitmapHeight;
                                int i4 = sRConfig.srConcurrencyLimit;
                                File fileLJII = C1331660kl2.LIZLLL().LJII();
                                if (fileLJII != null) {
                                    absolutePath2 = fileLJII.getAbsolutePath();
                                } else {
                                    absolutePath2 = "";
                                }
                                BmfJniSr.initBMFSR(i2, i3, i4, absolutePath2);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1328730kgJ.LJIJJLI = false;
                                return;
                            }
                        } else {
                            int i5 = sRConfig.stageType;
                            int i6 = sRConfig.optimizeLevel;
                            if ((i6 & 1) > 0 && Build.VERSION.SDK_INT >= 30) {
                                C1328730kgJ.LIZLLL = false;
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if ((i6 & 2) > 0 && Build.VERSION.SDK_INT >= 29) {
                                i |= 2;
                                C1328730kgJ.LJ = false;
                            }
                            int i7 = sRConfig.bitmapWidth;
                            int i8 = sRConfig.bitmapHeight;
                            File fileLJII2 = C1331660kl2.LIZLLL().LJII();
                            if (fileLJII2 != null) {
                                absolutePath = fileLJII2.getAbsolutePath();
                            } else {
                                absolutePath = "";
                            }
                            C1328970kgh.LIZJ(i5, i, i7, absolutePath, i8);
                        }
                        LIZLLL = true;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZ(Bitmap bitmap, final C0I7N c0i7n, Map<String, String> map) {
        return new C1331870klN(this.LIZ.process(bitmap, new AbstractC1301670jyf() { // from class: X.0kl6
            @Override // X.AbstractC1301670jyf
            public final C1323050kX9<Bitmap> LJFF(int i, int i2, Bitmap.Config config) {
                return null;
            }

            @Override // X.AbstractC1301670jyf
            public final C1323050kX9<Bitmap> LIZJ(Bitmap bitmap2) {
                return ((C1331760klC) c0i7n).LIZIZ(bitmap2).LIZ;
            }
        }, map));
    }
}
