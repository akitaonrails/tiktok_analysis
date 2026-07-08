package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.ttm.player.s;
import cxo.s0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472150oPd extends C1469520oLO {
    public static final WeakHashMap<Surface, C1472150oPd> LJJIIZ = new WeakHashMap<>();
    public static final C1486330omV<Surface, C1472150oPd> LJJIIZI = new C1486330omV<>();
    public static final WeakHashMap<Surface, C2032207xg<C1472150oPd>> LJJIJ = new WeakHashMap<>();
    public static final C1486330omV<Surface, C2032207xg<C1472150oPd>> LJJIJIIJI = new C1486330omV<>();
    public static final WeakHashMap<Surface, Object> LJJIJIIJIL = new WeakHashMap<>();
    public static final C1472140oPc LJJIJIL = new C1472140oPc();
    public static final C1472170oPf LJJIJL = new C1472170oPf(((Number) C1474810oTv.LLLLZIL.getValue()).intValue());
    public static WeakReference<C1472150oPd> LJJIJLIJ;
    public final Map<Integer, Object> LJJ;
    public final C1472160oPe LJJI;
    public final InterfaceC1472230oPl LJJIFFI;
    public String LJJII;
    public boolean LJJIII;
    public final boolean LJJIIJ;
    public Surface LJJIIJZLJL;

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final synchronized void LJIILL() {
        SimRadar.traceGroup(toString()).LIZIZ("release-2");
        SimRadar.keyScan("MTTVideoEngine", "releaseAsync", this, ((C1472250oPn) this.LJJIFFI).LLJ);
        LLJJL();
        super.LJIILL();
        LJJIJIL.LIZIZ(this);
        C1472160oPe c1472160oPe = this.LJJI;
        c1472160oPe.LIZ = -1.0f;
        c1472160oPe.LIZIZ = -1.0f;
        c1472160oPe.LIZJ = null;
        c1472160oPe.LIZLLL = null;
        LLJJLIIIJLLLLLLLZ(false);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final synchronized void LJJIJIIJIL() {
        SimRadar.traceGroup(toString()).LIZIZ("createPlayer");
        SimRadar.keyScan("MTTVideoEngine", "createPlayer", this);
        super.LJJIJIIJIL();
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final synchronized void release() {
        C1472910oQr c1472910oQrAnalyzer = SimRadar.analyzer();
        String str = ((C1472250oPn) this.LJJIFFI).LLJ;
        c1472910oQrAnalyzer.getClass();
        C1473150oRF c1473150oRFLIZ = C1472910oQr.LIZ(str);
        if (c1473150oRFLIZ != null) {
            c1473150oRFLIZ.LJIIIZ();
        }
        SimRadar.traceGroup(toString()).LIZIZ("release-1");
        SimRadar.traceGroup(toString()).LIZ("MTTVEngineC-R").end();
        SimRadar.keyScan("MTTVideoEngine", "release", this, ((C1472250oPn) this.LJJIFFI).LLJ);
        LLJJL();
        super.release();
        LJJIJIL.LIZIZ(this);
        C1472160oPe c1472160oPe = this.LJJI;
        c1472160oPe.LIZ = -1.0f;
        c1472160oPe.LIZIZ = -1.0f;
        c1472160oPe.LIZJ = null;
        c1472160oPe.LIZLLL = null;
        LLJJLIIIJLLLLLLLZ(false);
    }

    static {
        if (!C1472190oPh.LIZIZ) {
            C0WPS.instance.setMergeListener(C1472190oPh.LIZ);
            C1472190oPh.LIZIZ = true;
        }
        LJJIJLIJ = new WeakReference<>(null);
    }

    public final void LLJJL() {
        Surface surface = this.LIZ.LJIIL;
        if (surface != null) {
            if (((Boolean) C1474810oTv.k3.getValue()).booleanValue()) {
                LJJIIZI.remove(surface);
            } else {
                WeakHashMap<Surface, C1472150oPd> weakHashMap = LJJIIZ;
                synchronized (weakHashMap) {
                    try {
                        weakHashMap.remove(surface);
                    } finally {
                    }
                }
            }
        }
        if (this.LJJIIJZLJL != null) {
            if (((Boolean) C1474810oTv.j3.getValue()).booleanValue()) {
                LJJIJIIJI.remove(this.LJJIIJZLJL);
                return;
            }
            WeakHashMap<Surface, C2032207xg<C1472150oPd>> weakHashMap2 = LJJIJ;
            synchronized (weakHashMap2) {
                try {
                    weakHashMap2.remove(this.LJJIIJZLJL);
                } finally {
                }
            }
        }
    }

    public final String toString() {
        String strLIZIZ;
        if (C1481110oe5.LIZ && this.LJJIIJ && !TextUtils.isEmpty(LJJJJLL())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", mTTVideoEngine@");
            sbLIZ.append(Integer.toHexString(CastIntegerProtector.parseInt(LJJJJLL())));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MTTVideoEngine@");
        sbLIZ2.append(Integer.toHexString(hashCode()));
        sbLIZ2.append(TextUtils.isEmpty(strLIZIZ) ? "" : strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void pause() {
        SimRadar.traceGroup(toString()).LIZIZ("pause");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sub-tag:");
        sbLIZ.append(this.LJJI.LIZLLL);
        SimRadar.keyScan("MTTVideoEngine", "pause", this, C2188811AlT.LIZIZ(sbLIZ), ((C1472250oPn) this.LJJIFFI).LLJ);
        C1472910oQr c1472910oQrAnalyzer = SimRadar.analyzer();
        String str = ((C1472250oPn) this.LJJIFFI).LLJ;
        c1472910oQrAnalyzer.getClass();
        C1473150oRF c1473150oRFLIZ = C1472910oQr.LIZ(str);
        if (c1473150oRFLIZ != null) {
            c1473150oRFLIZ.LJFF();
        }
        super.pause();
        LLJJLIIIJLLLLLLLZ(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void play() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472150oPd.play():void");
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void start() {
        SimRadar.traceGroup(toString()).LIZIZ("start");
        SimRadar.keyScan("MTTVideoEngine", "start", this, ((C1472250oPn) this.LJJIFFI).LLJ);
        super.start();
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void stop() {
        SimRadar.traceGroup(toString()).LIZIZ("stop");
        SimRadar.keyScan("MTTVideoEngine", "stop", this, ((C1472250oPn) this.LJJIFFI).LLJ);
        C1472910oQr c1472910oQrAnalyzer = SimRadar.analyzer();
        String str = ((C1472250oPn) this.LJJIFFI).LLJ;
        c1472910oQrAnalyzer.getClass();
        C1473150oRF c1473150oRFLIZ = C1472910oQr.LIZ(str);
        if (c1473150oRFLIZ != null) {
            c1473150oRFLIZ.LJIIJ();
        }
        super.stop();
        LLJJLIIIJLLLLLLLZ(false);
    }

    @Override // X.C1469520oLO, com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void LIZLLL(s sVar) {
        C1472160oPe c1472160oPe = this.LJJI;
        s sVar2 = c1472160oPe.LIZJ;
        if (sVar2 != null && sVar != null && sVar2.LIZLLL == sVar.LIZLLL && sVar2.LIZJ == sVar.LIZJ && sVar2.LIZ == sVar.LIZ && sVar2.LIZIZ == sVar.LIZIZ) {
            if (!(true ^ LJJIJL.LIZJ)) {
                return;
            }
        } else {
            c1472160oPe.LIZJ = sVar;
        }
        super.LIZLLL(sVar);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLILZIL(String str) {
        super.LLILZIL(str);
        this.LJJI.LIZLLL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    @Override // com.ss.ttvideoengine.TTVideoEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIZ(android.view.SurfaceHolder r12) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472150oPd.LLIZ(android.view.SurfaceHolder):void");
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJIJIL(String str) {
        super.LLJIJIL(str);
        this.LJJI.getClass();
    }

    public final void LLJJLIIIJLLLLLLLZ(boolean z) {
        int iLJZI = C1474810oTv.LJZI();
        if (iLJZI != 0) {
            C1472150oPd c1472150oPd = LJJIJLIJ.get();
            if (z) {
                if (c1472150oPd != null && c1472150oPd.hashCode() != hashCode()) {
                    if (iLJZI == 1) {
                        c1472150oPd.pause();
                        return;
                    }
                    if (iLJZI != 2) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("last engine: ");
                    sbLIZ.append(c1472150oPd.LJJII);
                    sbLIZ.append("\ncurrent engine: ");
                    sbLIZ.append(this.LJJII);
                    throw new Error(C2188811AlT.LIZIZ(sbLIZ));
                }
                LJJIJLIJ = new WeakReference<>(this);
                return;
            }
            if (c1472150oPd == null || c1472150oPd.hashCode() != hashCode()) {
                return;
            }
            LJJIJLIJ.clear();
        }
    }

    public final void LLJL(boolean z) {
        this.LJJIII = z;
        play();
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void setSurface(Surface surface) {
        String strLIZIZ;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (surface != null) {
            SimRadar.traceGroup(toString()).LIZIZ("setSurface");
            if (!surface.isValid()) {
                SimRadar.errorScan("MTTVideoEngine", "setSurface", new C1473280oRS("Surface is invalid"), new Object[0]);
                return;
            }
        }
        Object[] objArr = new Object[3];
        if (surface != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("surface@");
            sbLIZ.append(Integer.toHexString(surface.hashCode()));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        objArr[0] = strLIZIZ;
        objArr[1] = this;
        objArr[2] = ((C1472250oPn) this.LJJIFFI).LLJ;
        SimRadar.keyScan("MTTVideoEngine", "setSurface", objArr);
        if (((Boolean) C1474810oTv.LJLJI.getValue()).booleanValue()) {
            if (((Boolean) C1474810oTv.k3.getValue()).booleanValue()) {
                Surface surface2 = this.LIZ.LJIIL;
                C1486330omV<Surface, C1472150oPd> c1486330omV = LJJIIZI;
                C1472150oPd c1472150oPd = c1486330omV.get(surface);
                if (surface2 != null) {
                    c1486330omV.remove(surface2);
                }
                if (surface != null) {
                    c1486330omV.put(surface, this);
                }
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setSurface opt. lastSurface:");
                    sbLIZ2.append(surface2);
                    sbLIZ2.append(", lastEngine:");
                    sbLIZ2.append(c1472150oPd);
                    sbLIZ2.append(", surface:");
                    sbLIZ2.append(surface);
                    sbLIZ2.append(", this:");
                    sbLIZ2.append(this);
                    C1481110oe5.LIZIZ("MTTVideoEngine", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (surface2 == surface && surface != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c1472150oPd != null && c1472150oPd != this) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 && z4) {
                    SimRadar.keyScan("MTTVideoEngine", "setSurface: clear Last Engine Surface", c1472150oPd, surface2);
                    c1472150oPd.setSurface(null);
                }
            } else {
                WeakHashMap<Surface, C1472150oPd> weakHashMap = LJJIIZ;
                synchronized (weakHashMap) {
                    try {
                        Surface surface3 = this.LIZ.LJIIL;
                        C1472150oPd c1472150oPd2 = weakHashMap.get(surface);
                        if (surface3 != null) {
                            weakHashMap.remove(surface3);
                        }
                        if (surface != null) {
                            LJJIIZ.put(surface, this);
                        }
                        if (surface3 == surface && surface != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c1472150oPd2 != null && c1472150oPd2 != this) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z && z2) {
                            SimRadar.keyScan("MTTVideoEngine", "setSurface: clear Last Engine Surface", c1472150oPd2, surface3);
                            c1472150oPd2.setSurface(null);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        super.setSurface(surface);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void LIZ(int i, String str) {
        if (LLJJJJLIIL(i, str)) {
            super.LIZ(i, str);
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void LIZIZ(int i, long j) {
        if (LLJJJJLIIL(i, Long.valueOf(j))) {
            super.LIZIZ(i, j);
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void LIZJ(int i, int i2) {
        if (LLJJJJLIIL(i, Integer.valueOf(i2))) {
            super.LIZJ(i, i2);
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void LJIILLIIL(float f, float f2) {
        C1472160oPe c1472160oPe = this.LJJI;
        if (c1472160oPe.LIZ == f && c1472160oPe.LIZIZ == f2) {
            if (!(true ^ LJJIJL.LIZIZ)) {
                return;
            }
        } else {
            c1472160oPe.LIZIZ = f2;
            c1472160oPe.LIZ = f;
        }
        super.LJIILLIIL(f, f2);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine, X.InterfaceC1467390oHx
    public final void LJIJJLI(int i, s0 s0Var) {
        SimRadar.keyScan("MTTVideoEngine", "seekTo", this, Integer.valueOf(i), ((C1472250oPn) this.LJJIFFI).LLJ);
        super.LJIJJLI(i, s0Var);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLD(float f, int i) {
        if (LLJJJJLIIL(i, Float.valueOf(f))) {
            super.LLD(f, i);
        }
    }

    public final boolean LLJJJJLIIL(int i, Object obj) {
        if (this.LJJ.containsKey(Integer.valueOf(i))) {
            if (this.LJJ.get(Integer.valueOf(i)) != obj) {
                return true;
            }
            return !LJJIJL.LIZ;
        }
        if (obj != null) {
            this.LJJ.put(Integer.valueOf(i), obj);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:4:0x0003, B:6:0x0007, B:36:0x00d7, B:7:0x000f, B:9:0x0015, B:10:0x0020, B:12:0x0026, B:13:0x0051, B:15:0x005a, B:17:0x0063, B:19:0x0067, B:20:0x006e, B:21:0x0076, B:27:0x008d, B:29:0x0091, B:33:0x00b6, B:35:0x00d1, B:24:0x0081, B:26:0x0085, B:30:0x00af), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLIL(java.util.Map r8, android.view.SurfaceHolder r9, X.C2032207xg r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472150oPd.LLJLIL(java.util.Map, android.view.SurfaceHolder, X.07xg):void");
    }

    public C1472150oPd(Context context, int i, Map map, InterfaceC1472230oPl interfaceC1472230oPl) {
        super(context, i, map);
        this.LJJ = new ConcurrentHashMap();
        this.LJJI = new C1472160oPe();
        this.LJJIIJZLJL = null;
        SimRadar.traceGroup(toString()).LIZ("MTTVEngineC-R").LIZ();
        this.LJJIFFI = interfaceC1472230oPl;
        this.LJJIIJ = true;
    }
}
