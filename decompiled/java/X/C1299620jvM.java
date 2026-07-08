package X;

import Y.ARunnableS120S0100000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.LynxEmbeddedModule;
import com.lynx.jsbridge.LynxModuleFactory;
import com.lynx.tasm.LynxEngine;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299620jvM implements InterfaceC1300010jvz, InterfaceC1299990jvx {
    public final String LIZJ;
    public volatile TemplateBundle LIZLLL;
    public final C1289430jev LJI;
    public final C1299310jur LJII;
    public final EnumC665490Q8l LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final Float LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIL;
    public final boolean LJJ;
    public final int LJJIFFI;
    public final int LJJII;
    public final float LJJIII;
    public final boolean LJJIIJ;
    public final InterfaceC1299640jvO LJJIIJZLJL;
    public final int LJJIIZ;
    public final boolean LJJIIZI;
    public final String LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public LynxEngine LJJIZ;
    public final AtomicInteger LIZ = new AtomicInteger(0);
    public final ConcurrentHashMap<Integer, WeakReference<LynxView>> LIZIZ = new ConcurrentHashMap<>();
    public final CountDownLatch LJJIJIL = new CountDownLatch(1);
    public final List<InterfaceC1290540jgi<TemplateBundle>> LJJIJL = Collections.synchronizedList(new LinkedList());
    public volatile C1289590jfB<TemplateBundle> LJJIJLIJ = null;
    public final Map<String, C1299630jvN> LJJIL = new ConcurrentHashMap();
    public final TemplateData LJ = null;
    public final boolean LJFF = false;
    public final HashMap LJIIIIZZ = null;
    public final boolean LJIILIIL = false;
    public final boolean LJIJJLI = false;
    public final boolean LJJI = false;
    public final InterfaceC1299290jup LJJIJ = null;

    @Override // X.InterfaceC1300010jvz
    public final LynxModuleFactory LJJJ() {
        return null;
    }

    @Override // X.InterfaceC1309820kBo
    public final C1299340juu LIZIZ() {
        return this.LJII.LIZJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final AbstractC1299960jvu LIZJ() {
        return this.LJII.LJII;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIILLIIL() {
        if (this.LJJ) {
            return false;
        }
        return this.LJIL;
    }

    @Override // X.InterfaceC1299990jvx
    public final LynxEngine LJIJ() {
        if (!this.LJFF) {
            return null;
        }
        LynxEngine lynxEngine = this.LJJIZ;
        this.LJJIZ = null;
        return lynxEngine;
    }

    @Override // X.InterfaceC1300010jvz
    public final boolean LJJI() {
        return this.LIZLLL != null;
    }

    @Override // X.InterfaceC1300010jvz
    public final TemplateBundle LJJIII() {
        if (this.LIZLLL == null) {
            try {
                if (this.LJJIJIL.await(3L, TimeUnit.SECONDS)) {
                    return this.LIZLLL;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.i("LynxViewGroup", "getTemplateBundle failed.");
            }
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1300010jvz
    public final int LJJIIZI() {
        return this.LIZ.getAndIncrement();
    }

    @Override // X.InterfaceC1309820kBo
    public final AbstractC1299950jvt LJJIJIIJIL() {
        return this.LJII.LJIIIZ;
    }

    @Override // X.InterfaceC1309820kBo
    public final EnumC665490Q8l LJJIJL() {
        EnumC665490Q8l enumC665490Q8l = this.LJIIIZ;
        return enumC665490Q8l != null ? enumC665490Q8l : EnumC665490Q8l.ALL_ON_UI;
    }

    @Override // X.InterfaceC1309820kBo
    public final EnumC1299430jv3 LJJIJLIJ() {
        return this.LJII.LJIIJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final AbstractC1301590jyX LJJIZ() {
        return this.LJII.LJIIIIZZ;
    }

    @Override // X.InterfaceC1309820kBo
    public final int LIZ() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC1309820kBo
    public final int LIZLLL() {
        return this.LJJII;
    }

    @Override // X.InterfaceC1309820kBo
    public final C1289430jev LJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJFF() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJI() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIIIIZZ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1309820kBo
    public final String LJIIIZ() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC1309820kBo
    public final HashMap LJIIJJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIIL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIILIIL() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1299990jvx
    public final boolean LJIILL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIJI() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJIJJ() {
        return this.LJJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final int LJIJJLI() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC1309820kBo
    public final InterfaceC1299640jvO LJIL() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC1309820kBo
    public final float LJJ() {
        return this.LJJIII;
    }

    @Override // X.InterfaceC1300010jvz
    public final TemplateBundle LJJIFFI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1309820kBo
    public final InterfaceC1299290jup LJJII() {
        return this.LJJIJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJIIJ() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final C1299310jur LJJIIJZLJL() {
        return this.LJII;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJIIZ() {
        return this.LJJIIZI;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJIJIL() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean LJJJIL() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final Float getDensity() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1300010jvz
    public final TemplateData getGlobalProps() {
        return this.LJ;
    }

    @Override // X.InterfaceC1309820kBo
    public final int getScreenHeight() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1309820kBo
    public final int getScreenWidth() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1309820kBo
    public final boolean isDebuggable() {
        return this.LJJI;
    }

    @Override // X.InterfaceC1299990jvx
    public final void LJIILJJIL(LynxEngine lynxEngine) {
        if (this.LJFF) {
            this.LJJIZ = lynxEngine;
        }
    }

    @Override // X.InterfaceC1300010jvz
    public final void LJIIZILJ(int i) {
        this.LIZIZ.remove(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1300010jvz
    public final void LJJIJ(C1299930jvr c1299930jvr) {
        if (this.LJJIJLIJ != null) {
            c1299930jvr.LIZ(this.LJJIJLIJ);
            return;
        }
        synchronized (this.LJJIJL) {
            try {
                if (this.LJJIJLIJ != null) {
                    c1299930jvr.LIZ(this.LJJIJLIJ);
                } else {
                    this.LJJIJL.add(c1299930jvr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1300010jvz
    public final LynxView LJJIJIIJI(int i) {
        WeakReference<LynxView> weakReference = this.LIZIZ.get(Integer.valueOf(i));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC1299990jvx
    public final C1299630jvN LJJJI(String str) {
        String strLIZIZ;
        if (TraceController.isTracingStarted()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getBitmapSizeCache: ");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            TraceEvent.LIZIZ(strLIZIZ);
        } else {
            strLIZIZ = null;
        }
        C1299630jvN c1299630jvN = (C1299630jvN) ((ConcurrentHashMap) this.LJJIL).get(str);
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(strLIZIZ);
        }
        return c1299630jvN;
    }

    public final void LJJJJ(C1289590jfB<TemplateBundle> c1289590jfB) {
        synchronized (this.LJJIJL) {
            try {
                if (this.LJJIJLIJ != null) {
                    LynxLog.e("LynxViewGroup", "internal error: fetch result should be set once");
                    return;
                }
                this.LJJIJLIJ = c1289590jfB;
                if (c1289590jfB.LIZ == EnumC1288980jeC.SUCCESS) {
                    this.LIZLLL = c1289590jfB.LIZIZ;
                }
                if (this.LJJIJIL.getCount() > 0) {
                    this.LJJIJIL.countDown();
                }
                Iterator<InterfaceC1290540jgi<TemplateBundle>> it2 = this.LJJIJL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c1289590jfB);
                }
                this.LJJIJL.clear();
                InterfaceC1299290jup interfaceC1299290jup = this.LJJIJ;
                if (interfaceC1299290jup instanceof C1299280juo) {
                    C1299280juo c1299280juo = (C1299280juo) interfaceC1299290jup;
                    c1299280juo.getClass();
                    c1299280juo.LIZJ = new WeakReference<>(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1300010jvz
    public final void LJII(LynxView lynxView, int i) {
        if (lynxView != null) {
            this.LIZIZ.put(Integer.valueOf(i), new WeakReference<>(lynxView));
        }
    }

    @Override // X.InterfaceC1299990jvx
    public final void LJIIJ(int i, int i2, String str) {
        String strLIZIZ;
        if (TraceController.isTracingStarted()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBitmapSizeCache: ");
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(i);
            sbLIZ.append(" - ");
            sbLIZ.append(i2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            TraceEvent.LIZIZ(strLIZIZ);
        } else {
            strLIZIZ = null;
        }
        if (str == null) {
            if (TraceController.isTracingStarted()) {
                TraceEvent.LJII(strLIZIZ);
            }
        } else {
            ((ConcurrentHashMap) this.LJJIL).put(str, new C1299630jvN(str, i, i2));
            if (TraceController.isTracingStarted()) {
                TraceEvent.LJII(strLIZIZ);
            }
        }
    }

    public C1299620jvM(String str, TemplateBundle templateBundle, C1289430jev c1289430jev, C1299310jur c1299310jur, EnumC665490Q8l enumC665490Q8l, boolean z, boolean z2, boolean z3, Float f, int i, int i2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i3, int i4, float f2, boolean z10, InterfaceC1299640jvO interfaceC1299640jvO, int i5, boolean z11, boolean z12) {
        this.LJIIIZ = EnumC665490Q8l.ALL_ON_UI;
        this.LJJIIZ = 0;
        this.LJJIJIIJI = "50px";
        this.LJJIJIIJIL = false;
        this.LIZJ = str;
        this.LIZLLL = templateBundle;
        this.LJI = c1289430jev;
        this.LJII = c1299310jur;
        this.LJIIIZ = enumC665490Q8l;
        this.LJIIJ = z;
        this.LJIIJJI = z2;
        this.LJIIL = z3;
        this.LJIILJJIL = f;
        this.LJIILL = i;
        this.LJIILLIIL = i2;
        this.LJIIZILJ = z4;
        this.LJIJ = z5;
        this.LJIJJ = z6;
        this.LJIJI = z7;
        this.LJIL = z8;
        this.LJJ = z9;
        this.LJJIFFI = i3;
        this.LJJII = i4;
        this.LJJIII = f2;
        this.LJJIIJ = z10;
        this.LJJIIJZLJL = interfaceC1299640jvO;
        this.LJJIIZ = i5;
        this.LJJIIZI = z12;
        this.LJJIJIIJI = "50px";
        this.LJJIJIIJIL = false;
        if (c1299310jur != null) {
            c1299310jur.LJI = null;
        }
        if (this.LIZLLL == null) {
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 262);
            if (c1299310jur != null) {
                C1301610jyZ.LIZ().execute(aRunnableS120S0100000_20);
            }
        }
        c1299310jur.LIZJ("LynxEmbeddedModule", LynxEmbeddedModule.class, this);
    }
}
