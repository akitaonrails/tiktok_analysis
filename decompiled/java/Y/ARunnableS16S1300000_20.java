package Y;

import X.AbstractC1299960jvu;
import X.AbstractC1316490kMZ;
import X.AbstractC1319960kSA;
import X.C1272170jD5;
import X.C1298660jto;
import X.C1301090jxj;
import X.C1301180jxs;
import X.C1301260jy0;
import X.C1301600jyY;
import X.C1301610jyZ;
import X.C1313490kHj;
import X.C1315750kLN;
import X.C1319980kSC;
import X.C1320010kSF;
import X.C1320030kSH;
import X.C1325710kbR;
import X.C1331070kk5;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.CallableC1313590kHt;
import X.EnumC1299880jvm;
import X.EnumC1301150jxp;
import X.InterfaceC1290540jgi;
import X.InterfaceC1301170jxr;
import Y.ARunnableS16S1300000_20;
import android.graphics.Typeface;
import android.os.Looper;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.LynxModuleWrapper;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.core.LynxEngineProxy;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS16S1300000_20 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r2v1, types: [REQUEST, X.0kbR] */
    public final void LIZ$0() {
        C1315750kLN c1315750kLN = (C1315750kLN) this.l3;
        C1320010kSF c1320010kSF = c1315750kLN.LJJJIL;
        c1320010kSF.LJFF = c1315750kLN.LJJIJIIJIL;
        c1320010kSF.LIZIZ = c1315750kLN.LJ;
        c1320010kSF.LJ = c1315750kLN.LIZLLL;
        ?? r2 = (C1325710kbR) this.l1;
        c1320010kSF.LJI = r2 != 0;
        ?? r1 = (C1325710kbR) this.l2;
        c1320010kSF.LIZJ = r1;
        c1320010kSF.LJII = c1315750kLN.LJJIL.LIZLLL;
        c1320010kSF.LIZ = false;
        c1320010kSF.LIZLLL = r2;
        if (r1 == 0 && r2 != 0) {
            c1320010kSF.LIZJ = r2;
            c1320010kSF.LIZLLL = null;
        }
        C1320030kSH c1320030kSHLIZIZ = c1320010kSF.LIZIZ();
        c1320030kSHLIZIZ.LJFF = c1320010kSF.LJI;
        Object obj = c1320010kSF.LJ;
        if (obj != null) {
            c1320030kSHLIZIZ.LIZ(obj);
        }
        if (c1320010kSF.LJFF) {
            c1320030kSHLIZIZ.LIZ(AbstractC1316490kMZ.LJIIIIZZ);
        }
        C1315750kLN c1315750kLN2 = (C1315750kLN) this.l3;
        c1320030kSHLIZIZ.LJIIL = c1315750kLN2.LJJLIIIJ;
        c1320030kSHLIZIZ.LJIILIIL = this.s0;
        C1319980kSC<C1331070kk5> c1319980kSC = c1315750kLN2.LJJIL;
        boolean z = c1319980kSC.LIZ;
        if (z && c1319980kSC.LIZ) {
            c1319980kSC.LIZ = false;
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1319980kSC, 73);
            if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
                aRunnableS120S0100000_20.run();
            } else {
                C1301610jyZ.LIZLLL().execute(aRunnableS120S0100000_20);
            }
        }
        AbstractC1319960kSA abstractC1319960kSA = c1319980kSC.LIZLLL;
        if (abstractC1319960kSA != null && abstractC1319960kSA.LJIIJJI == c1319980kSC.LIZJ) {
            abstractC1319960kSA.LJIILIIL(null);
        }
        c1319980kSC.LIZLLL = c1320030kSHLIZIZ;
        c1320030kSHLIZIZ.LJIILIIL(c1319980kSC.LIZJ);
        if (z && !c1319980kSC.LIZ) {
            c1319980kSC.LIZ = true;
            ARunnableS120S0100000_20 aRunnableS120S0100000_202 = new ARunnableS120S0100000_20(c1319980kSC, 72);
            if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
                aRunnableS120S0100000_202.run();
            } else {
                C1301610jyZ.LIZLLL().execute(aRunnableS120S0100000_202);
            }
        }
        C1320010kSF c1320010kSF2 = ((C1315750kLN) this.l3).LJJJIL;
        c1320010kSF2.getClass();
        c1320010kSF2.LIZIZ = null;
        c1320010kSF2.LIZJ = null;
        c1320010kSF2.LIZLLL = null;
        c1320010kSF2.LJ = null;
        c1320010kSF2.LJFF = false;
        c1320010kSF2.LJII = null;
    }

    public final void LIZ$1() {
        String strLIZIZ;
        if (!this.s0.startsWith("data:")) {
            if (this.s0.startsWith("http")) {
                C1301600jyY c1301600jyY = new C1301600jyY(this.s0, EnumC1299880jvm.LynxResourceTypeFont);
                AbstractC1299960jvu abstractC1299960jvu = ((s) this.l1).LLL;
                if (abstractC1299960jvu != null) {
                    abstractC1299960jvu.LIZIZ(c1301600jyY, new InterfaceC1290540jgi<byte[]>() { // from class: X.0jxl
                        @Override // X.InterfaceC1290540jgi
                        public final void LIZ(C1289590jfB<byte[]> c1289590jfB) {
                            byte[] bArr;
                            if (c1289590jfB.LIZ == EnumC1288980jeC.SUCCESS && (bArr = c1289590jfB.LIZIZ) != null) {
                                Typeface typefaceLIZIZ = C08JN.LIZIZ((s) this.LIZ.l1, bArr);
                                if (typefaceLIZIZ != null) {
                                    ARunnableS16S1300000_20 aRunnableS16S1300000_20 = this.LIZ;
                                    ((C1301090jxj) aRunnableS16S1300000_20.l3).LIZ(typefaceLIZIZ, aRunnableS16S1300000_20.s0);
                                    InterfaceC1301170jxr interfaceC1301170jxr = (InterfaceC1301170jxr) this.LIZ.l2;
                                    if (interfaceC1301170jxr != null) {
                                        ((C1301260jy0) ((C1301180jxs) interfaceC1301170jxr).LIZ).LIZ(0, "");
                                        return;
                                    }
                                    return;
                                }
                                ARunnableS16S1300000_20 aRunnableS16S1300000_202 = this.LIZ;
                                ((C1301090jxj) aRunnableS16S1300000_202.l3).LJIIJJI((s) aRunnableS16S1300000_202.l1, aRunnableS16S1300000_202.s0, (InterfaceC1301170jxr) aRunnableS16S1300000_202.l2);
                                return;
                            }
                            ARunnableS16S1300000_20 aRunnableS16S1300000_203 = this.LIZ;
                            ((C1301090jxj) aRunnableS16S1300000_203.l3).LJIIJJI((s) aRunnableS16S1300000_203.l1, aRunnableS16S1300000_203.s0, (InterfaceC1301170jxr) aRunnableS16S1300000_203.l2);
                        }
                    });
                    return;
                }
            }
            ((C1301090jxj) this.l3).LJIIJJI((s) this.l1, this.s0, (InterfaceC1301170jxr) this.l2);
            return;
        }
        int i = 32101;
        try {
            C1301090jxj c1301090jxj = (C1301090jxj) this.l3;
            s sVar = (s) this.l1;
            EnumC1301150jxp enumC1301150jxp = EnumC1301150jxp.URL;
            String str = this.s0;
            c1301090jxj.getClass();
            Typeface typefaceLJI = C1301090jxj.LJI(sVar, enumC1301150jxp, str);
            if (typefaceLJI != null) {
                ((C1301090jxj) this.l3).LIZ(typefaceLJI, this.s0);
                i = 0;
                strLIZIZ = "";
            } else {
                strLIZIZ = "loadFromBase64 failed";
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prefetchFont base64 failed: ");
            sbLIZ.append(e.getMessage());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LynxLog.e("FontFaceManager", strLIZIZ);
        }
        InterfaceC1301170jxr interfaceC1301170jxr = (InterfaceC1301170jxr) this.l2;
        if (interfaceC1301170jxr != null) {
            ((C1301260jy0) ((C1301180jxs) interfaceC1301170jxr).LIZ).LIZ(i, strLIZIZ);
        }
    }

    public final void LIZ$2() {
        SDUIBaseUI[] sDUIBaseUIArr = (SDUIBaseUI[]) this.l1;
        CallableC1313590kHt callableC1313590kHt = (CallableC1313590kHt) this.l3;
        sDUIBaseUIArr[0] = callableC1313590kHt.LLILZLL.LIZ(sDUIBaseUIArr[0], (C1313490kHj) this.l2, callableC1313590kHt.LLILLL);
        CallableC1313590kHt callableC1313590kHt2 = (CallableC1313590kHt) this.l3;
        callableC1313590kHt2.LLILZLL.LJIILJJIL(callableC1313590kHt2.LLILLJJLI, this.s0, callableC1313590kHt2.LLILLL);
        CallableC1313590kHt callableC1313590kHt3 = (CallableC1313590kHt) this.l3;
        callableC1313590kHt3.LLILZLL.LJFF.put(Integer.valueOf(callableC1313590kHt3.LLILLJJLI), ((SDUIBaseUI[]) this.l1)[0]);
    }

    public static final void run$0(ARunnableS16S1300000_20 aRunnableS16S1300000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxTemplateRender@a577.renderTemplateBundle$1");
        try {
            ((LynxTemplateRender) aRunnableS16S1300000_20.l3).LJJLIIIJILLIZJL((TemplateBundle) aRunnableS16S1300000_20.l1, (TemplateData) aRunnableS16S1300000_20.l2, aRunnableS16S1300000_20.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxTemplateRender@a577.renderTemplateBundle$1");
    }

    public static final void run$1(ARunnableS16S1300000_20 aRunnableS16S1300000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxTemplateRender@a577.renderSSR$1");
        try {
            ((LynxTemplateRender) aRunnableS16S1300000_20.l3).LJJLIIIIJ((byte[]) aRunnableS16S1300000_20.l1, aRunnableS16S1300000_20.s0, (TemplateData) aRunnableS16S1300000_20.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxTemplateRender@a577.renderSSR$1");
    }

    public static final void run$2(ARunnableS16S1300000_20 aRunnableS16S1300000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxImageManager@8c93.doAsyncFrescoImageRequest$1");
        try {
            aRunnableS16S1300000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxImageManager@8c93.doAsyncFrescoImageRequest$1");
    }

    public static final void run$3(ARunnableS16S1300000_20 aRunnableS16S1300000_20) {
        C1272170jD5 c1272170jD5 = (C1272170jD5) aRunnableS16S1300000_20.l1;
        String[] strArr = (String[]) aRunnableS16S1300000_20.l2;
        int[] iArr = (int[]) aRunnableS16S1300000_20.l3;
        String str = aRunnableS16S1300000_20.s0;
        c1272170jD5.getClass();
        C1C7U.LIZ("EffectTrack@7ea1.setStickerPaths$1L");
        c1272170jD5.LIZIZ.setEffectTrackStickerPaths(c1272170jD5.LIZ, strArr, iArr, strArr.length, str);
        C1C7U.LIZIZ("EffectTrack@7ea1.setStickerPaths$1L");
    }

    public static final void run$4(ARunnableS16S1300000_20 aRunnableS16S1300000_20) {
        boolean zLIZ;
        C1C7U.LIZ("FontFaceManager@c8f5.prefetchFont$1");
        try {
            aRunnableS16S1300000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FontFaceManager@c8f5.prefetchFont$1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x015c, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$5(Y.ARunnableS16S1300000_20 r15) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS16S1300000_20.run$5(Y.ARunnableS16S1300000_20):void");
    }

    public static final void run$6(ARunnableS16S1300000_20 aRunnableS16S1300000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LynxLepusModule@9e9d.triggerLepusBridgeAsync$1");
        try {
            LynxModuleWrapper lynxModuleWrapper = (LynxModuleWrapper) ((WeakReference) aRunnableS16S1300000_20.l1).get();
            LynxEngineProxy lynxEngineProxy = (LynxEngineProxy) ((WeakReference) aRunnableS16S1300000_20.l2).get();
            if (lynxModuleWrapper != null && lynxEngineProxy != null) {
                C1298660jto.LIZ(lynxModuleWrapper, lynxEngineProxy, (ReadableMap) aRunnableS16S1300000_20.l3, aRunnableS16S1300000_20.s0);
            } else {
                LynxLog.i("LynxLepusModule", "triggerLepusBridgeAsync failed, LynxModule or LynxEngine has been released.");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxLepusModule@9e9d.triggerLepusBridgeAsync$1");
    }

    public static final void run$7(ARunnableS16S1300000_20 aRunnableS16S1300000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SDUIUIOwner@fafd.createViewAsync$1$call$1");
        try {
            aRunnableS16S1300000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SDUIUIOwner@fafd.createViewAsync$1$call$1");
    }

    public ARunnableS16S1300000_20(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.s0 = str;
    }
}
