package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.model.VEPrePlayParams;
import java.util.Stack;

/* JADX INFO: renamed from: X.1DLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254331DLj implements C1DMH, InterfaceC2254511DMb, InterfaceC1622650sKN {
    public final k LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJIIIIZZ;
    public InterfaceC1622670sKP LJIIJ;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public final Stack<Long> LJIIIZ = new Stack<>();
    public boolean LJII = false;

    @Override // X.C1DMH
    public final synchronized void LIZIZ() {
        Long lPeek;
        try {
            this.LJIIIZ.pop();
            lPeek = this.LJIIIZ.peek();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LJI("TEVideoBGProxy", "Seek to 0");
        }
        long jLongValue = lPeek != null ? lPeek.longValue() : 0L;
        LJIIL(jLongValue);
    }

    @Override // X.C1DMH
    public final synchronized void LIZLLL() {
        C2484209oO.LJI("TEVideoBGProxy", "tryRestore");
        this.LJII = false;
        if (this.LJ >= 0) {
            VEVolumeParam vEVolumeParam = new VEVolumeParam();
            vEVolumeParam.trackIndex = this.LJ;
            vEVolumeParam.bgmPlayVolume = 1.0f;
            this.LIZ.LJJIJIIJIL(vEVolumeParam);
        }
        start();
    }

    @Override // X.C1DMY
    public final void LJ(int i) {
    }

    @Override // X.C1DMY
    public final void LJI(boolean z) {
    }

    public final synchronized void LJIILJJIL() {
        LJII(this.LIZLLL);
        LJIIIIZZ(this.LIZJ);
        LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setup v(");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("), a(");
        sbLIZ.append(this.LJ);
        sbLIZ.append(")");
        C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ));
        int iLJIIIIZZ = this.LIZ.LJIIIIZZ(this.LJFF, 0, this.LJ, 1);
        start();
        int[] iArr = new int[12];
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue() && TEVideoUtils.nativeGetFileInfo(this.LIZJ, iArr) != null) {
            this.LIZ.LJJIZ(new VEPrePlayParams(iArr[3], true));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("alignTo ret: ");
        sbLIZ2.append(iLJIIIIZZ);
        sbLIZ2.append(", duration: ");
        sbLIZ2.append(iArr[3]);
        C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C1DMH
    public final synchronized void LJJIJIIJIL() {
        pause();
        if (this.LJIIIZ.isEmpty()) {
            this.LJIIIZ.push(0L);
        }
        this.LJIIIZ.push(Long.valueOf(this.LIZ.LJIILL() - this.LJIIIIZZ));
    }

    @Override // X.C1DMH
    public final synchronized void onDestroy() {
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue()) {
            this.LIZ.LJJJIL();
        }
        LJIIJ();
        this.LIZ.LIZLLL(this);
    }

    @Override // X.InterfaceC1622650sKN
    public final synchronized void pause() {
        C2484209oO.LJI("TEVideoBGProxy", "pause");
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue()) {
            this.LIZ.LJJJIL();
        }
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.LJJIII(i, 1);
        } else {
            int i2 = this.LJFF;
            if (i2 >= 0) {
                this.LIZ.LJJIII(i2, 0);
            }
        }
    }

    @Override // X.InterfaceC1622650sKN
    public final synchronized void start() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start, aTrack=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", vTrack=");
        sbLIZ.append(this.LJFF);
        C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.LJJJ.LJJIIZI(i, 1, 0, -1, -1L, false);
        } else {
            int i2 = this.LJFF;
            if (i2 >= 0) {
                this.LIZ.LJJJ.LJJIIZI(i2, 0, 0, -1, -1L, false);
            }
        }
    }

    public final void LJIIJ() {
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.LJJIII(i, 1);
            this.LIZ.LJJIIJ(1, this.LJ, true);
            this.LJ = -1;
        }
        int i2 = this.LJFF;
        if (i2 >= 0) {
            this.LIZ.LJJIII(i2, 0);
            this.LIZ.LJJIIJ(0, this.LJFF, true);
            this.LJFF = -1;
            this.LJI = -1;
        }
    }

    public final void LJIILL() {
        C2254451DLv c2254451DLv = new C2254451DLv();
        c2254451DLv.LIZ("camera_path");
        c2254451DLv.LIZLLL();
        c2254451DLv.LJ(0);
        c2254451DLv.LJFF(Integer.MAX_VALUE);
        c2254451DLv.LIZIZ(0);
        c2254451DLv.LIZJ(Integer.MAX_VALUE);
        VETrackParams vETrackParams = c2254451DLv.LIZ;
        vETrackParams.layer = 0;
        vETrackParams.trackPriority = C1D40.HOST;
        k kVar = this.LIZ;
        kVar.getClass();
        TEBundle tEBundleLIZ = C2254321DLi.LIZ(vETrackParams);
        tEBundleLIZ.setInt("TrackIndex", 0);
        tEBundleLIZ.setInt("TrackType", 0);
        tEBundleLIZ.setBool("UpdateTimeline", true);
        kVar.LJJJ.LJIL("UpdateTrack", tEBundleLIZ);
    }

    @Override // X.InterfaceC1622650sKN
    public final synchronized void LIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableEffCtrl ");
        sbLIZ.append(z);
        C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1DMH
    public final synchronized void LIZJ(float f) {
        if (!this.LJII) {
            this.LJII = true;
            LJIIL(0L);
        }
        start();
        this.LJIIIIZZ = this.LIZ.LJIILL();
    }

    @Override // X.InterfaceC1622650sKN
    public final synchronized void LJFF(C1622630sKL c1622630sKL) {
        this.LJIIJ = c1622630sKL;
        C2484209oO.LJI("TEVideoBGProxy", "setVEOnVideoEOFListener");
    }

    public final void LJII(String str) {
        C2254451DLv c2254451DLv = new C2254451DLv();
        c2254451DLv.LIZ(str);
        c2254451DLv.LIZLLL();
        c2254451DLv.LJ(0);
        c2254451DLv.LJFF(-1);
        C1D40 c1d40 = C1D40.External;
        VETrackParams vETrackParams = c2254451DLv.LIZ;
        vETrackParams.trackPriority = c1d40;
        int iLJII = this.LIZ.LJII(1, vETrackParams, true);
        this.LJ = iLJII;
        this.LIZ.LJJIIJZLJL(iLJII, 1, 0L);
    }

    public final void LJIIIIZZ(String str) {
        C2254451DLv c2254451DLv = new C2254451DLv();
        c2254451DLv.LIZ(str);
        c2254451DLv.LIZLLL();
        c2254451DLv.LJ(0);
        c2254451DLv.LJFF(-1);
        VETrackParams vETrackParams = c2254451DLv.LIZ;
        vETrackParams.layer = 1;
        vETrackParams.trackPriority = C1D40.External;
        int iLJII = this.LIZ.LJII(0, vETrackParams, true);
        this.LJFF = iLJII;
        this.LIZ.LJJIIJZLJL(iLJII, 0, 0L);
        int i = this.LJFF;
        VEVideoEffectStreamFilterParam vEVideoEffectStreamFilterParam = new VEVideoEffectStreamFilterParam();
        vEVideoEffectStreamFilterParam.streamFlags = 6;
        vEVideoEffectStreamFilterParam.extraString = this.LIZIZ;
        int i2 = this.LJI;
        if (i2 >= 0) {
            this.LIZ.LJJIZ.updateTrackFilterParam(i2, vEVideoEffectStreamFilterParam);
        } else {
            this.LJI = this.LIZ.LJJIZ.addTrackFilter(0, i, vEVideoEffectStreamFilterParam, -1, -1);
        }
    }

    public final synchronized void LJIIJJI(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeRecordBGM ");
        sbLIZ.append(i);
        C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized void LJIIL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seek ");
        sbLIZ.append(j);
        C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.LJJIIJZLJL(i, 1, j);
        } else {
            int i2 = this.LJFF;
            if (i2 >= 0) {
                this.LIZ.LJJIIJZLJL(i2, 0, j);
            }
        }
    }

    public final synchronized void LJIILLIIL(float f) {
        int i = this.LJ;
        if (i >= 0) {
            this.LIZ.LJJIJIIJI(1.0f / f, i, 1);
        }
        int i2 = this.LJFF;
        if (i2 >= 0) {
            this.LIZ.LJJIJIIJI(1.0f / f, i2, 0);
        }
    }

    public final synchronized void LJIILIIL(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRecordBGM , trackIndex=");
        sbLIZ.append(i);
        sbLIZ.append(",");
        sbLIZ.append(0);
        sbLIZ.append(", bgmPath=");
        sbLIZ.append(str);
        C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ));
        if (VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue()) {
            this.LIZ.LJJJIL();
        }
        if (i < 0) {
            if (this.LJ < 0) {
                LJII(this.LIZLLL);
                this.LIZ.LJIIIIZZ(this.LJFF, 0, this.LJ, 1);
            }
        } else {
            int i2 = this.LJ;
            if (i2 >= 0) {
                this.LIZ.LJJIII(i2, 1);
                this.LIZ.LJJIIJ(1, this.LJ, true);
                this.LJ = -1;
                k kVar = this.LIZ;
                kVar.LJJJ.LJJIII("SeparateVideoTrack", this.LJFF);
            }
        }
    }

    public final synchronized void LJIIIZ(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6 = this.LIZIZ;
        if ((str6 == str || (str6 != null && str6.equals(str))) && (((str4 = this.LIZJ) == str2 || (str4 != null && str4.equals(str2))) && ((str5 = this.LIZLLL) == str3 || (str5 != null && str5.equals(str3))))) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeVideo ");
        sbLIZ.append(str);
        sbLIZ.append(", vPath=");
        sbLIZ.append(str2);
        sbLIZ.append(", aPath=");
        sbLIZ.append(str3);
        C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIZ.clear();
        this.LJII = false;
        LJIIJ();
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        if (str2 != null && str3 != null) {
            LJIILJJIL();
        }
    }

    @Override // X.InterfaceC2254511DMb
    public final void onInfo(int i, int i2, String str) {
        boolean z;
        int i3;
        if (i == VEInfo.TE_INFO_MULTIPLE_TRACK_EOF) {
            if (Integer.MIN_VALUE == (i2 & Integer.MIN_VALUE)) {
                z = true;
            } else {
                z = false;
            }
            int i4 = i2 & Integer.MAX_VALUE;
            try {
                i3 = CastIntegerProtector.parseInt(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                i3 = -1;
            }
            synchronized (this) {
                if (i3 >= 0) {
                    try {
                        if (this.LJFF == i3 && z) {
                            InterfaceC1622670sKP interfaceC1622670sKP = this.LJIIJ;
                            if (interfaceC1622670sKP != null) {
                                interfaceC1622670sKP.LIZ();
                            }
                            LJIIL(0L);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("timeInMS=");
                            sbLIZ.append(i4);
                            sbLIZ.append(", eof=");
                            sbLIZ.append(z);
                            sbLIZ.append(", videoIndex=");
                            sbLIZ.append(i3);
                            C2484209oO.LJI("TEVideoBGProxy", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    public C2254331DLj(k kVar, String str, String str2, String str3) {
        this.LIZ = kVar;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        VEConfigCenter.getInstance().updateValue("ve_titan_hw_dec_res_min_side", -1);
    }
}
