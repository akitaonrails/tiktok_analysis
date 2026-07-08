package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ml.process.bl.MLConfigModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0pSE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512200pSE {
    public int LIZ;
    public volatile boolean LIZIZ;
    public InterfaceC1440050nZr LIZJ;
    public final InterfaceC1512350pST LIZLLL;
    public MLConfigModel LJFF;
    public InterfaceC1512460pSe LJI;
    public C1512240pSI LJII;
    public final String LJIIIIZZ;
    public final C1511890pRj LJIIIZ;
    public String LJIIJ = "ml#evaluator";
    public final InterfaceC1440050nZr LJ = null;

    public final InterfaceC1440050nZr LIZ() {
        InterfaceC1440050nZr interfaceC1440050nZr = this.LJ;
        if (interfaceC1440050nZr != null && (interfaceC1440050nZr instanceof C1512270pSL) && C1512380pSW.LIZ) {
            return interfaceC1440050nZr;
        }
        final String strLIZJ = this.LIZLLL.LIZJ();
        if (C1512320pSQ.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("-----buildEngine modelType:");
            sbLIZ.append(strLIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return TextUtils.isEmpty(strLIZJ) ? new AbstractC1512210pSF(strLIZJ) { // from class: X.0pSK
            public String LJIIIIZZ;
            public InterfaceC1512330pSR LJIIIZ;

            {
                if (strLIZJ != null) {
                    this.LJIIIIZZ = strLIZJ.toLowerCase();
                }
                if (C1512320pSQ.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("-----MixMLEngine created---modelType:");
                    sbLIZ2.append(this.LJIIIIZZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    new Throwable("not crash, only for debug!!");
                }
            }

            @Override // X.AbstractC1512210pSF
            public final boolean LIZLLL(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
                String str;
                if (TextUtils.isEmpty(this.LJIIIIZZ) && (str = mLConfigModel.model_type) != null) {
                    this.LJIIIIZZ = str.toLowerCase();
                }
                if (this.LJIIIZ == null) {
                    if (C1512320pSQ.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(" checkInit modelType: ");
                        sbLIZ2.append(this.LJIIIIZZ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    C1512560pSo c1512560pSoLIZ = null;
                    if (!TextUtils.isEmpty(this.LJIIIIZZ) && this.LJIIIIZZ.startsWith("byte")) {
                        InterfaceC1512360pSU interfaceC1512360pSU = C1512380pSW.LIZIZ;
                        if (interfaceC1512360pSU != null) {
                            c1512560pSoLIZ = interfaceC1512360pSU.LIZ();
                        }
                        this.LJIIIZ = c1512560pSoLIZ;
                        if (c1512560pSoLIZ == null && C1512320pSQ.LIZ) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("bytenn disabled, please config bytenn. model type: ");
                            sbLIZ3.append(this.LJIIIIZZ);
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else if (!TextUtils.isEmpty(this.LJIIIIZZ) && this.LJIIIIZZ.startsWith("tf")) {
                        this.LJIIIZ = null;
                        if (C1512320pSQ.LIZ) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("tensorflow lite disabled, please config tensorflow lite. model type: ");
                            sbLIZ4.append(this.LJIIIIZZ);
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    } else if (C1512320pSQ.LIZ) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("invalid model type: ");
                        sbLIZ5.append(this.LJIIIIZZ);
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
                InterfaceC1512330pSR interfaceC1512330pSR = this.LJIIIZ;
                if (interfaceC1512330pSR != null) {
                    return interfaceC1512330pSR.LIZ(mappedByteBuffer, mLConfigModel);
                }
                return false;
            }

            @Override // X.AbstractC1512210pSF
            public final void LJI(ByteBuffer byteBuffer, float[][] fArr, MLConfigModel mLConfigModel) {
                InterfaceC1512330pSR interfaceC1512330pSR = this.LJIIIZ;
                if (interfaceC1512330pSR != null) {
                    interfaceC1512330pSR.LIZIZ(byteBuffer, fArr);
                }
            }
        } : "bytenn".equals(strLIZJ) ? new AbstractC1512210pSF() { // from class: X.0pSL
            public InterfaceC1512330pSR LJIIIIZZ;

            {
                if (C1512320pSQ.LIZ) {
                    new Throwable("not crash, only for debug!!");
                }
            }

            @Override // X.AbstractC1512210pSF
            public final boolean LIZLLL(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
                C1512560pSo c1512560pSoLIZ;
                InterfaceC1512360pSU interfaceC1512360pSU = C1512380pSW.LIZIZ;
                if (interfaceC1512360pSU != null) {
                    c1512560pSoLIZ = interfaceC1512360pSU.LIZ();
                } else {
                    c1512560pSoLIZ = null;
                }
                this.LJIIIIZZ = c1512560pSoLIZ;
                if (c1512560pSoLIZ != null) {
                    return c1512560pSoLIZ.LIZ(mappedByteBuffer, mLConfigModel);
                }
                return false;
            }

            @Override // X.AbstractC1512210pSF
            public final void LJI(ByteBuffer byteBuffer, float[][] fArr, MLConfigModel mLConfigModel) {
                InterfaceC1512330pSR interfaceC1512330pSR = this.LJIIIIZZ;
                if (interfaceC1512330pSR != null) {
                    interfaceC1512330pSR.LIZIZ(byteBuffer, fArr);
                }
            }
        } : new AbstractC1512210pSF() { // from class: X.0pSJ
            @Override // X.AbstractC1512210pSF
            public final boolean LIZLLL(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
                return false;
            }

            @Override // X.AbstractC1512210pSF
            public final void LJI(ByteBuffer byteBuffer, float[][] fArr, MLConfigModel mLConfigModel) {
            }

            {
                if (C1512320pSQ.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("-----TFEngine created.---TFLiteEnable: ");
                    sbLIZ2.append(false);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    new Throwable("not crash, only for debug!!");
                }
            }
        };
    }

    public final boolean LIZJ() {
        return this.LIZLLL.enable();
    }

    public final boolean LIZLLL() {
        if (C1512310pSP.LIZ().LIZ == null) {
            C1512290pSN.LIZ(this.LJIIJ, "should call Inference.init first before ensureMLEngineReady", null);
            return false;
        }
        synchronized (this) {
            if (this.LJII == null) {
                this.LJII = C1512310pSP.LIZ().LIZ;
            }
            if (this.LJI == null) {
                this.LJI = this.LJII.LIZLLL;
            }
            if (this.LIZJ == null) {
                InterfaceC1440050nZr interfaceC1440050nZrLIZ = LIZ();
                this.LIZJ = interfaceC1440050nZrLIZ;
                ((AbstractC1512210pSF) interfaceC1440050nZrLIZ).LJII = this.LJIIIZ;
                ((AbstractC1512210pSF) interfaceC1440050nZrLIZ).getClass();
            }
        }
        if (LIZJ() && !((AbstractC1512210pSF) this.LIZJ).LJI && !this.LIZIZ && this.LIZ <= 5) {
            this.LIZIZ = true;
            this.LIZ++;
            final long jCurrentTimeMillis = C1512320pSQ.LIZ ? System.currentTimeMillis() : 0L;
            Runnable runnable = new Runnable() { // from class: X.0pSG
                /* JADX WARN: Removed duplicated region for block: B:102:0x06e0  */
                /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x02a4 A[Catch: all -> 0x0667, TRY_LEAVE, TryCatch #5 {all -> 0x0667, blocks: (B:33:0x0298, B:35:0x02a4), top: B:126:0x0298 }] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x03de A[Catch: all -> 0x0721, TRY_LEAVE, TryCatch #1 {all -> 0x0721, blocks: (B:99:0x0668, B:61:0x03c3, B:64:0x03d6, B:66:0x03de, B:71:0x0487, B:73:0x0491, B:84:0x058d, B:87:0x05a5), top: B:120:0x027b }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0487 A[Catch: all -> 0x0721, TRY_ENTER, TryCatch #1 {all -> 0x0721, blocks: (B:99:0x0668, B:61:0x03c3, B:64:0x03d6, B:66:0x03de, B:71:0x0487, B:73:0x0491, B:84:0x058d, B:87:0x05a5), top: B:120:0x027b }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 2133
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1512220pSG.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MLModelComponent@6e18.ensureMLEngineReady$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MLModelComponent@6e18.ensureMLEngineReady$1");
                }
            };
            C1512240pSI c1512240pSI = this.LJII;
            ExecutorService executorService = c1512240pSI.LJI;
            if (executorService == null) {
                InterfaceC1512370pSV interfaceC1512370pSV = c1512240pSI.LJ;
                if (interfaceC1512370pSV != null) {
                    c1512240pSI.LJI = interfaceC1512370pSV.LIZ();
                }
                executorService = c1512240pSI.LJI;
            }
            executorService.submit(runnable);
        }
        if (C1512320pSQ.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ensureMLEngineReady enable: ");
            sbLIZ.append(LIZJ());
            sbLIZ.append(" hasInit: ");
            sbLIZ.append(((AbstractC1512210pSF) this.LIZJ).LJI);
            sbLIZ.append(" modelLoading:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" tryLoadModelCount: ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" modelScene: ");
            sbLIZ.append(this.LIZLLL.LIZ());
            sbLIZ.append(" modelType: ");
            sbLIZ.append(this.LIZLLL.LIZJ());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return ((AbstractC1512210pSF) this.LIZJ).LJI;
    }

    public C1512200pSE(InterfaceC1512350pST interfaceC1512350pST) {
        this.LJIIIIZZ = "default";
        this.LIZLLL = interfaceC1512350pST;
        if (interfaceC1512350pST.enable()) {
            this.LJIIIIZZ = interfaceC1512350pST.LIZ();
        }
        String str = this.LJIIIIZZ;
        HashMap<String, C1511890pRj> map = C1512010pRv.LIZ;
        C1511890pRj c1511890pRj = map.get(str);
        if (c1511890pRj == null) {
            c1511890pRj = new C1511890pRj(str);
            map.put(str, c1511890pRj);
        }
        this.LJIIIZ = c1511890pRj;
        c1511890pRj.LJ.LIZ();
        c1511890pRj.LJFF.LIZ();
        c1511890pRj.LJI.LIZ();
        c1511890pRj.LJII = false;
        c1511890pRj.LJIIIIZZ = false;
        c1511890pRj.LJIIIZ = false;
        c1511890pRj.LIZ();
        if (C1512320pSQ.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("-----MLModelComponent created.---!!! config:");
            sbLIZ.append(interfaceC1512350pST);
            sbLIZ.append(" engine:");
            sbLIZ.append((Object) null);
            C2188811AlT.LIZIZ(sbLIZ);
            new Throwable("not crash, only for debug!!");
        }
    }

    public static void LIZIZ(String... strArr) {
        for (String str : strArr) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
        }
    }

    public final boolean LJ(C0VSJ c0vsj) {
        C0VSP c0vsp = null;
        try {
            C0VSP c0vsp2 = new C0VSP(c0vsj);
            try {
                ((AbstractC1512210pSF) this.LIZJ).LJII(c0vsp2, this.LJFF);
                LJI(7, null);
                this.LJIIIZ.LIZJ(((AbstractC1512210pSF) this.LIZJ).LJI);
                try {
                    c0vsp2.close();
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                c0vsp = c0vsp2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C1512290pSN.LIZ(this.LJIIJ, "loadModel error: ", th);
                    LJI(8, th);
                    this.LJIIIZ.LIZJ(((AbstractC1512210pSF) this.LIZJ).LJI);
                    if (c0vsp != null) {
                        try {
                            c0vsp.close();
                            return false;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    this.LJIIIZ.LIZJ(((AbstractC1512210pSF) this.LIZJ).LJI);
                    if (c0vsp != null) {
                        try {
                            c0vsp.close();
                            throw th2;
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean LJFF(C0VSJ c0vsj, C0VSJ c0vsj2) {
        String str;
        C0VSP c0vsp;
        try {
            C1511890pRj c1511890pRj = this.LJIIIZ;
            if (c1511890pRj.LIZ && !c1511890pRj.LIZLLL) {
                c1511890pRj.LJI.LIZ = System.currentTimeMillis();
            }
            C0VSP c0vsp2 = null;
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1512290pSN.LIZ(this.LJIIJ, "decrypt config failed try no-encrypt config file", e);
                C1512320pSQ.LIZIZ(new RuntimeException("decrypt config failed try no-encrypt config file"));
            }
            if (c0vsj2.exists()) {
                this.LJII.getClass();
                throw null;
            }
            if (TextUtils.isEmpty(null)) {
                byte[] bArr = new byte[(int) c0vsj.length()];
                try {
                    c0vsp = new C0VSP(c0vsj);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (c0vsp.read(bArr) != -1) {
                        try {
                            c0vsp.close();
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        str = new String(bArr);
                    } else {
                        throw new IOException("EOF reached while trying to read the whole file");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0vsp2 = c0vsp;
                    TryCatchGuardChecker.doCheck(th);
                    if (c0vsp2 != null) {
                        try {
                            c0vsp2.close();
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    }
                    throw th;
                }
            } else {
                str = null;
            }
            MLConfigModel mLConfigModel = (MLConfigModel) this.LJII.LIZJ.LIZ(str, MLConfigModel.class);
            this.LJFF = mLConfigModel;
            if (mLConfigModel == null) {
                LJI(6, null);
                return false;
            }
            LJI(5, null);
            return true;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C1512290pSN.LIZ(this.LJIIJ, "loadModelConfig error: ", th3);
            LJI(6, th3);
            return false;
        }
        TryCatchGuardChecker.doCheck(th3);
        C1512290pSN.LIZ(this.LJIIJ, "loadModelConfig error: ", th3);
        LJI(6, th3);
        return false;
    }

    public final void LJI(int i, Throwable th) {
        InterfaceC1512460pSe interfaceC1512460pSe = this.LJI;
        if (interfaceC1512460pSe != null) {
            this.LIZLLL.LIZIZ();
            if (th != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(th.getMessage());
                sbLIZ.append(" ");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                sbLIZ.append(stringWriter.toString());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            interfaceC1512460pSe.LIZ();
        }
    }
}
