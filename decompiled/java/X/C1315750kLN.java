package X;

import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.featurecount.LynxFeatureCounter;
import com.lynx.tasm.ui.image.FlattenUIImage;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1315750kLN {
    public static final BPEAHandler LJJLIIIJILLIZJL = new BPEAHandler(Looper.getMainLooper());
    public final s LIZ;
    public final Context LIZIZ;
    public final AbstractC1320720kTO LIZJ;
    public C1320700kTM LIZLLL;
    public int LJFF;
    public int LJI;
    public boolean LJIIIIZZ;
    public C1313900kIO LJIIIZ;
    public boolean LJIIJ;
    public C1320770kTT<C1331070kk5> LJIIJJI;
    public C1320770kTT<C1331070kk5> LJIIL;
    public C1315850kLX LJIILJJIL;
    public C1315850kLX LJIILL;
    public final InterfaceC1316210kM7 LJIILLIIL;
    public C1325710kbR LJIIZILJ;
    public C1315960kLi LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public final boolean LJJ;
    public final boolean LJJII;
    public boolean LJJIII;
    public final boolean LJJIIJ;
    public C1331100kk8 LJJIIJZLJL;
    public C1331070kk5 LJJIIZ;
    public final C1315720kLK LJJIIZI;
    public long LJJIJIIJI;
    public boolean LJJIJL;
    public C1319980kSC<C1331070kk5> LJJIL;
    public C1319980kSC<C1331070kk5> LJJIZ;
    public C1323050kX9<AbstractC1327750kej> LJJJI;
    public C1320010kSF LJJJIL;
    public C1320120kSQ LJJJJ;
    public InterfaceC1324680kZm LJJJJI;
    public InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public Animatable LJJJJLL;
    public C1323050kX9<?> LJJJJZ;
    public C1323050kX9<?> LJJJJZI;
    public boolean LJJJLIIL;
    public Bitmap LJJJLL;
    public boolean LJJJLZIJ;
    public C1323210kXP LJJJZ;
    public final boolean LJJL;
    public View LJJLIIIIJ;
    public WeakReference<FlattenUIImage> LJJLIIIJ;
    public final Map<String, C1320770kTT<C1331070kk5>> LJIILIIL = new LinkedHashMap();
    public C1323050kX9<?> LJJI = null;
    public volatile boolean LJJIFFI = false;
    public LynxBaseUI LJJIJ = null;
    public boolean LJJIJIIJIL = true;
    public ColorFilter LJJIJIL = null;
    public boolean LJJIJLIJ = false;
    public final Map<String, C1319980kSC<C1331070kk5>> LJJJ = new LinkedHashMap();
    public int LJJJJJL = 0;
    public int LJJLI = -1;
    public InterfaceC1320380kSq LJII = InterfaceC1320380kSq.LIZ;
    public final Object LJ = null;

    public void LJIILJJIL() {
        this.LJIIJ = true;
        if (this.LJJJJJ) {
            this.LJJIJIIJI = System.currentTimeMillis();
            C1319980kSC<C1331070kk5> c1319980kSC = this.LJJIL;
            c1319980kSC.LIZIZ = true;
            c1319980kSC.LIZ = true;
            return;
        }
        if (this.LJIIJJI != null) {
            this.LJJIJIIJI = System.currentTimeMillis();
            this.LJIIJJI.LJFF();
        }
    }

    public void LJIILL() {
        this.LJIIJ = false;
        if (this.LJJJJJ) {
            C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LJJJI;
            if (c1323050kX9 != null) {
                C1323050kX9.LJII(c1323050kX9);
                this.LJJJI = null;
            }
            C1319980kSC<C1331070kk5> c1319980kSC = this.LJJIL;
            if (c1319980kSC != null) {
                c1319980kSC.LIZIZ = false;
                if (c1319980kSC.LIZ) {
                    c1319980kSC.LIZ = false;
                    ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1319980kSC, 73);
                    if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
                        aRunnableS120S0100000_20.run();
                    } else {
                        C1301610jyZ.LIZLLL().execute(aRunnableS120S0100000_20);
                    }
                }
            }
            this.LJJJLL = null;
            C1323050kX9<?> c1323050kX92 = this.LJJJJZ;
            if (c1323050kX92 != null) {
                C1323050kX9.LJII(c1323050kX92);
                this.LJJJJZ = null;
            }
            C1331070kk5 c1331070kk5 = this.LJJIIZ;
            if (c1331070kk5 != null) {
                c1331070kk5.reset();
            }
        } else {
            LJIIIIZZ();
        }
        C1315720kLK c1315720kLK = this.LJJIIZI;
        c1315720kLK.LIZLLL = 0;
        c1315720kLK.LJ = 0;
        C1323050kX9<?> c1323050kX93 = this.LJJI;
        if (c1323050kX93 != null) {
            c1323050kX93.close();
            this.LJJI = null;
        }
    }

    public final void LJIIIIZZ() {
        C1320770kTT<C1331070kk5> c1320770kTT = this.LJIIJJI;
        if (c1320770kTT != null) {
            c1320770kTT.LJI();
        }
        C1315850kLX c1315850kLX = this.LJIILJJIL;
        if (c1315850kLX != null) {
            c1315850kLX.LJI();
        }
    }

    public final boolean LJIIJJI() {
        InterfaceC1320850kTb interfaceC1320850kTb;
        if (this.LJJJJJ) {
            return this.LJJJJLL != null;
        }
        C1320770kTT<C1331070kk5> c1320770kTT = this.LJIIJJI;
        return (c1320770kTT == null || (interfaceC1320850kTb = c1320770kTT.LLILZIL) == null || interfaceC1320850kTb.LIZ() == null) ? false : true;
    }

    public final boolean LJIIL() {
        Bitmap bitmap = this.LJJJLL;
        if (bitmap == null || !bitmap.isRecycled()) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bitmap has recycled and bitmap from cache is ");
        sbLIZ.append(this.LJJJLZIJ);
        LynxLog.e("Lynx-Image", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    public final void LJIJ() {
        C1313900kIO c1313900kIO;
        if (this.LJJIII) {
            this.LJJJJLI = false;
            this.LJJJJL = false;
            return;
        }
        if (this.LJJJJLI) {
            this.LJJIIZ.LJIIZILJ(C1316130kLz.LIZ(this.LJII));
            this.LJJJJLI = false;
        }
        if (!this.LJJJJL || (c1313900kIO = this.LJIIIZ) == null) {
            return;
        }
        if (c1313900kIO.LIZ() != null) {
            this.LJJIIJZLJL = C1331100kk8.LIZJ(this.LJIIIZ.LIZ());
        } else {
            this.LJJIIJZLJL = null;
        }
        this.LJJIIZ.LJJIII(this.LJJIIJZLJL);
        this.LJJJJL = false;
    }

    public final void LJIIJ() {
        this.LJJJJIZL = C1322200kVm.LIZ().LIZLLL;
        this.LJJJJ = new C1320120kSQ(this.LIZIZ.getResources(), C1328130kfL.LJIILIIL().LIZIZ(this.LIZIZ));
        this.LJJJIL = new C1320010kSF(this.LJJJJ);
        C1331090kk7 c1331090kk7 = new C1331090kk7(this.LIZIZ.getResources());
        c1331090kk7.LJIIL = C1316130kLz.LIZ(this.LJII);
        c1331090kk7.LIZJ = 0;
        C1331070kk5 c1331070kk5LIZ = c1331090kk7.LIZ();
        this.LJJIIZ = c1331070kk5LIZ;
        this.LJJIL = new C1319980kSC<>(c1331070kk5LIZ);
        s sVar = this.LIZ;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(83, sVar.LLJLILLLLZIIL);
        }
        this.LIZLLL = new C1339410kxX(this, 1);
        this.LJJIIZI.LJJLIIIIJ = this.LJJIIZ;
    }

    public final void LJIIIZ(Throwable th) {
        C1315720kLK c1315720kLK = this.LJJIIZI;
        if (c1315720kLK.LJIILIIL(c1315720kLK.LJIJJLI)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed src:");
        sbLIZ.append(this.LJJIIZI.LJIJJLI);
        sbLIZ.append("with reason");
        sbLIZ.append(th.getMessage());
        LynxLog.e("FrescoImageView", C2188811AlT.LIZIZ(sbLIZ));
        int iLIZ = C846560XIw.LIZ(th);
        int iLIZIZ = C846560XIw.LIZIZ(iLIZ);
        this.LJJLI = -1;
        String message = th.getMessage();
        if (this.LJIJ != null) {
            int i = 0;
            if (TextUtils.isEmpty(message) && (message = Log.getStackTraceString(th)) != null && message.length() > 200) {
                message = message.substring(0, 200);
            }
            LynxError lynxError = new LynxError(iLIZIZ, "Android LynxImageManager loading image failed", "", "error");
            lynxError.LJIIIIZZ(message);
            LynxBaseUI lynxBaseUI = this.LJJIJ;
            if (lynxBaseUI != null) {
                i = lynxBaseUI.mNodeIndex;
            }
            lynxError.LIZ("node_index", Integer.toString(i));
            this.LJIJ.LIZLLL(lynxError, iLIZIZ, iLIZ);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1315720kLK c1315720kLK2 = this.LJJIIZI;
        c1315720kLK2.LJIIIZ(c1315720kLK2.LJIJJLI, false, this.LJJIJIIJI, jCurrentTimeMillis, 0, null);
        C1315720kLK c1315720kLK3 = this.LJJIIZI;
        c1315720kLK3.LJIIJJI(iLIZ, 0, this.LJJIJIIJI, jCurrentTimeMillis, c1315720kLK3.LJIJJLI, false, false);
        C1315720kLK c1315720kLK4 = this.LJJIIZI;
        c1315720kLK4.LJIIJ(c1315720kLK4.LJIJJLI, iLIZ, false, this.LJJLI, this.LJJIJIIJI, jCurrentTimeMillis, true, 0, 0);
        this.LJJIIZI.getClass();
    }

    public C1315750kLN(Context context, C1320810kTX c1320810kTX, InterfaceC1316210kM7 interfaceC1316210kM7, boolean z) {
        boolean z2;
        this.LJJ = false;
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJJJJ = false;
        this.LIZIZ = context;
        this.LIZJ = c1320810kTX;
        this.LJIILLIIL = interfaceC1316210kM7;
        s sVarLIZIZ = C1298530jtb.LIZIZ(context);
        this.LIZ = sVarLIZIZ;
        if (sVarLIZIZ != null) {
            C1310290kCZ c1310290kCZ = sVarLIZIZ.LLLIIII;
            if (c1310290kCZ != null) {
                z2 = c1310290kCZ.LJFF;
            } else {
                z2 = true;
            }
            this.LJJII = z2;
            this.LJJJJJ = (c1310290kCZ != null && c1310290kCZ.LJII) || sVarLIZIZ.LLJZ || LynxEnv.inst().enableImageAsyncRequest();
        }
        this.LJJIII = !LynxEnv.inst().disableImagePostProcessor();
        this.LJJIIJ = LynxEnv.inst().enableFlattenImageFlickerFix();
        this.LJJL = LynxEnv.inst().enableImageRequestOptimize();
        C1315720kLK c1315720kLK = new C1315720kLK(context, new InterfaceC1315950kLh() { // from class: X.0kLT
            @Override // X.InterfaceC1315950kLh
            public final void clear() {
            }

            @Override // X.InterfaceC1315950kLh
            public final void LIZ() {
                this.LIZ.LJIIIIZZ = true;
            }

            @Override // X.InterfaceC1315950kLh
            public final void LIZJ() {
                C1315750kLN c1315750kLN = this.LIZ;
                c1315750kLN.LJIILIIL(c1315750kLN.LJFF, c1315750kLN.LJI, c1315750kLN.LJIJI, c1315750kLN.LJIJJLI, c1315750kLN.LJIJJ, c1315750kLN.LJIL);
            }

            @Override // X.InterfaceC1315950kLh
            public final void LJFF() {
                C1315750kLN c1315750kLN = this.LIZ;
                if (c1315750kLN.LJJJJJ) {
                    c1315750kLN.LJIIZILJ(c1315750kLN.LJFF, c1315750kLN.LJI, c1315750kLN.LJIJI, c1315750kLN.LJIJJLI, c1315750kLN.LJIJJ, c1315750kLN.LJIL);
                } else {
                    c1315750kLN.LJIILLIIL(c1315750kLN.LJFF, c1315750kLN.LJI, c1315750kLN.LJIJI, c1315750kLN.LJIJJLI, c1315750kLN.LJIJJ, c1315750kLN.LJIL);
                }
            }

            @Override // X.InterfaceC1315950kLh
            public final boolean LJI() {
                return this.LIZ.LJJIII;
            }

            @Override // X.InterfaceC1315950kLh
            public final void LJII() {
                C1323050kX9<?> c1323050kX9 = this.LIZ.LJJI;
                if (c1323050kX9 != null) {
                    c1323050kX9.close();
                    this.LIZ.LJJI = null;
                }
            }

            @Override // X.InterfaceC1315950kLh
            public final void LIZIZ(C1323050kX9<?> c1323050kX9) {
                C1323050kX9<?> c1323050kX92;
                Bitmap underlyingBitmap;
                C1323050kX9<?> c1323050kX93 = this.LIZ.LJJI;
                if (c1323050kX93 != null) {
                    c1323050kX93.close();
                    this.LIZ.LJJI = null;
                }
                this.LIZ.LJJI = c1323050kX9.clone();
                C1315750kLN c1315750kLN = this.LIZ;
                if (c1315750kLN.LJIJ != null && (c1323050kX92 = c1315750kLN.LJJI) != null) {
                    Object obj = c1323050kX92.get();
                    if (obj instanceof AbstractC1325130kaV) {
                        underlyingBitmap = ((AbstractC1325130kaV) obj).getUnderlyingBitmap();
                    } else {
                        if (obj instanceof Bitmap) {
                            underlyingBitmap = (Bitmap) obj;
                        }
                        LynxLog.e("LynxImageManager", "onLocalCacheGet error bitmap is null or recycled");
                    }
                    if (underlyingBitmap != null && !underlyingBitmap.isRecycled()) {
                        this.LIZ.LJIJ.LJ(underlyingBitmap.getWidth(), underlyingBitmap.getHeight());
                    } else {
                        LynxLog.e("LynxImageManager", "onLocalCacheGet error bitmap is null or recycled");
                    }
                }
                C1315750kLN c1315750kLN2 = this.LIZ;
                c1315750kLN2.LJIILLIIL.onCloseableRefReady(c1315750kLN2.LJJI);
            }

            @Override // X.InterfaceC1315950kLh
            public final void LIZLLL(List<InterfaceC1291910jiv> list) {
                this.LIZ.getClass();
            }

            @Override // X.InterfaceC1315950kLh
            public final C1325700kbQ LJ(Uri uri) {
                final C1315750kLN c1315750kLN = this.LIZ;
                C1325700kbQ c1325700kbQLIZLLL = c1315750kLN.LJJIIZI.LIZLLL(uri);
                C1323210kXP c1323210kXP = c1315750kLN.LJJJZ;
                if (c1323210kXP != null) {
                    c1323210kXP.LIZ(c1325700kbQLIZLLL);
                }
                if (!C1299180jue.LIZ.booleanValue()) {
                    c1325700kbQLIZLLL.LJIIZILJ = new C1320270kSf(c1315750kLN) { // from class: X.0kLs
                        public final WeakReference<C1315750kLN> LIZ;

                        {
                            this.LIZ = new WeakReference<>(c1315750kLN);
                        }

                        @Override // X.C1320270kSf, X.InterfaceC1325690kbP
                        public final void LJIIIZ(String str, String str2, boolean z3) {
                            C1315750kLN c1315750kLN2 = this.LIZ.get();
                            if (c1315750kLN2 != null) {
                                c1315750kLN2.LJJLI = C1327250kdv.LIZ(str2);
                            }
                        }
                    };
                }
                return c1325700kbQLIZLLL;
            }
        });
        this.LJJIIZI = c1315720kLK;
        boolean z3 = this.LJJJJJ;
        c1315720kLK.LJJIJ = z3;
        if (z3) {
            LJIIJ();
        }
        this.LJJ = z;
        c1315720kLK.LJJIIJZLJL = z;
    }

    public void LJIILIIL(int i, int i2, int i3, int i4, int i5, int i6) {
        C1323050kX9<?> c1323050kX9;
        if (this.LJJL) {
            if (Math.abs(this.LJFF - i) <= 1 && Math.abs(this.LJI - i2) <= 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setBounds with src:");
                sbLIZ.append(this.LJJIIZI.LJIJJLI);
                sbLIZ.append(" :pre-size: ");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(":");
                sbLIZ.append(this.LJI);
                sbLIZ.append(" :cur-size: ");
                sbLIZ.append(i);
                sbLIZ.append(":");
                sbLIZ.append(i2);
                LynxLog.d("LynxImageManager", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                this.LJFF = i;
                this.LJI = i2;
                this.LJIIIIZZ = true;
            }
        } else if (this.LJFF != i || this.LJI != i2) {
            this.LJFF = i;
            this.LJI = i2;
            this.LJIIIIZZ = true;
        }
        this.LJIJI = i3;
        this.LJIJJ = i5;
        this.LJIJJLI = i4;
        this.LJIL = i6;
        if (!this.LJIIIIZZ) {
            return;
        }
        if ((i <= 0 || i2 <= 0) && !this.LJJIIZI.LJIIL) {
            return;
        }
        C1315720kLK c1315720kLK = this.LJJIIZI;
        if (c1315720kLK.LJJ == null && c1315720kLK.LJJI == null) {
            return;
        }
        C1315960kLi c1315960kLi = this.LJIJ;
        if (c1315960kLi != null) {
            c1315960kLi.LJFF();
        }
        TraceEvent.LIZLLL("LynxImageManager.maybeUpdateView");
        C1315720kLK c1315720kLK2 = this.LJJIIZI;
        if (c1315720kLK2.LJIJI) {
            if (c1315720kLK2.LJJIJIL) {
                if (c1315720kLK2.LJJII(i, i2)) {
                    TraceEvent.LJII("LynxImageManager.maybeUpdateView");
                    return;
                }
            } else {
                c1315720kLK2.LJJIFFI(i, i2);
            }
        }
        this.LJJLI = -1;
        if (this.LJJIIZI.LJIJI && (((c1323050kX9 = this.LJJI) != null && c1323050kX9.LJIILLIIL() && this.LJJI.get() != null) || this.LJJIIZI.LJIJJ)) {
            TraceEvent.LJII("LynxImageManager.maybeUpdateView");
            return;
        }
        if (this.LJJJJJ) {
            LJIIZILJ(i, i2, i3, i4, i5, i6);
        } else {
            LJIILLIIL(i, i2, i3, i4, i5, i6);
        }
        TraceEvent.LJII("LynxImageManager.maybeUpdateView");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111 A[PHI: r6
      0x0111: PHI (r6v4 X.0kX9<X.0kej>) = (r6v1 X.0kX9<X.0kej>), (r6v1 X.0kX9<X.0kej>), (r6v3 X.0kX9<X.0kej>), (r6v0 X.0kX9<X.0kej>) binds: [B:53:0x010f, B:41:0x00e1, B:50:0x010b, B:38:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(int r25, int r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315750kLN.LJIILLIIL(int, int, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r29, int r30, int r31, int r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315750kLN.LJIIZILJ(int, int, int, int, int, int):void");
    }

    public final void LJIJI(int i, int i2, int i3, int i4, float[] fArr, InterfaceC1320380kSq interfaceC1320380kSq) {
        C1315720kLK c1315720kLK = this.LJJIIZI;
        if (c1315720kLK.LJFF) {
            this.LJJIII = false;
            return;
        }
        if (this.LJJJLIIL) {
            this.LJJIII = false;
            return;
        }
        if (c1315720kLK.LJJJJLI) {
            this.LJJIII = false;
            return;
        }
        if (this.LJJIII) {
            return;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (c1315720kLK.LJI != null) {
                this.LJJIII = true;
                return;
            }
            if (c1315720kLK.LJIJ != null) {
                this.LJJIII = true;
                return;
            } else {
                if (fArr != null && interfaceC1320380kSq != InterfaceC1320380kSq.LJI && interfaceC1320380kSq != InterfaceC1320380kSq.LJII && interfaceC1320380kSq != InterfaceC1320380kSq.LIZ) {
                    this.LJJIII = true;
                    return;
                }
                return;
            }
        }
        this.LJJIII = true;
    }

    public final C1325710kbR LJII(C089P c089p, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC1320380kSq interfaceC1320380kSq) {
        return this.LJJIIZI.LIZJ(c089p, i, i2, i3, i4, i5, i6, fArr, interfaceC1320380kSq);
    }
}
