package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.VEEditor;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: X.0oH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466830oH3 implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<CompileProbeResult> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [X.0oFW] */
    public static final void subscribe$0(C1466830oH3 c1466830oH3, InterfaceC2329309At interfaceC2329309At) {
        String videoPath;
        boolean z;
        int iLIZLLL;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        TEVideoUtils.nativeCancelCompileProbe();
        InterfaceC1444130ngR interfaceC1444130ngRInvoke = ((C1446290njv) c1466830oH3.l0).LIZIZ.invoke((VideoPublishEditModel) c1466830oH3.l1);
        ((C238400w2) c1466830oH3.l2).element = System.currentTimeMillis();
        EditPreviewInfo previewInfo = ((VideoPublishEditModel) c1466830oH3.l1).getPreviewInfo();
        if (previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) ListProtector.get(videoList, 0)) == null || (videoPath = editVideoSegment.getVideoPath()) == null) {
            videoPath = "";
        }
        String strLJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIIJ((VideoPublishEditModel) c1466830oH3.l1);
        int iLIZLLL2 = interfaceC1444130ngRInvoke.LIZLLL();
        int iLJI = interfaceC1444130ngRInvoke.LJI();
        CompileProbeConfigV1 compileProbeConfigV1 = ((C1446290njv) c1466830oH3.l0).LIZJ;
        long j = compileProbeConfigV1.startPointMs;
        long j2 = compileProbeConfigV1.endPointMs;
        if (((VideoPublishEditModel) c1466830oH3.l1).creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        String strLIZ = C1442260ndQ.LIZ(z);
        final C238400w2 c238400w2 = (C238400w2) c1466830oH3.l2;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        ?? r14 = new InterfaceC1466070oFp() { // from class: X.0oFW
            @Override // X.InterfaceC1466070oFp
            public final void LIZ(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, float f2, int i8, int i9, double d) {
                if (i != -10000) {
                    if (i != 0) {
                        c11kt.tryOnError(new C1465890oFX(new C1466030oFl(i)));
                        return;
                    }
                    c11kt.onSuccess(new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.SUCCESS, i, 0, ""), new CompileProbeResult.ResultData(i2, f, i3, i4, i5, i6, i7, f2, i8, i9, d, (int) (System.currentTimeMillis() - c238400w2.element), 0.0f, new OptBitrateFromVE(0.0f, 0.0f, 0.0f, 0.0f)), 1));
                    return;
                }
                c11kt.tryOnError(new C1465890oFX(new C1466010oFj(i)));
            }
        };
        synchronized (VEEditor.LLLLLLLLLL) {
            try {
                if (VEEditor.LLLLLLLZIL) {
                    iLIZLLL = -2;
                } else {
                    VEEditor.LLLLLLLZIL = true;
                    iLIZLLL = VEEditor.LIZLLL(videoPath, strLJIIJ, iLIZLLL2, iLJI, j, j2, strLIZ, 1, r14, null);
                    VEEditor.LLLLLLLZIL = false;
                    if (iLIZLLL == 0) {
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        interfaceC2329309At.tryOnError(new C1465890oFX(new C1466020oFk(iLIZLLL)));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oFV] */
    public static final void subscribe$1(C1466830oH3 c1466830oH3, InterfaceC2329309At interfaceC2329309At) {
        String videoPath;
        boolean z;
        int iLIZLLL;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        TEVideoUtils.nativeCancelCompileProbe();
        ((C238400w2) c1466830oH3.l0).element = System.currentTimeMillis();
        EditPreviewInfo previewInfo = ((VideoPublishEditModel) c1466830oH3.l1).getPreviewInfo();
        if (previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) ListProtector.get(videoList, 0)) == null || (videoPath = editVideoSegment.getVideoPath()) == null) {
            videoPath = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CHQ.LIZ.getCacheDir().getPath());
        sbLIZ.append(File.separator);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long startPointMs = ((C1446280nju) c1466830oH3.l2).LIZJ.getStartPointMs();
        long endPointMs = ((C1446280nju) c1466830oH3.l2).LIZJ.getEndPointMs();
        if (((VideoPublishEditModel) c1466830oH3.l1).creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        String strLIZ = C1442260ndQ.LIZ(z);
        int probeType = ((C1446280nju) c1466830oH3.l2).LIZJ.getProbeType();
        ((C1446280nju) c1466830oH3.l2).LIZJ.getBitrateStrategy();
        final C1446280nju c1446280nju = (C1446280nju) c1466830oH3.l2;
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c1466830oH3.l1;
        final C238400w2 c238400w2 = (C238400w2) c1466830oH3.l0;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        ?? r3 = new InterfaceC1466060oFo() { // from class: X.0oFV
            @Override // X.InterfaceC1466060oFo
            public final void LIZ(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, int i7, float f3, int i8, int i9, double d) {
                String strLIZ2;
                C201955140j.LIZ("HWCompileProbe -> CompileProbeV2: onCompileProbe2() method is called;  result = " + i + "; crf = " + i2 + "; videoBitrate = " + f + ";optBitrate = " + f2 + "; encoderType = " + i3 + "; preset = " + i4 + "; maxBitrate = " + i5 + "; encodeWidth = " + i6 + ";encodeHeight = " + i7 + "; psnr = " + f3 + "; preEncodeCrf = " + i8 + "; preGop = " + i9 + "; preGpoffse = " + d);
                if (i != -10000) {
                    if (i != 0) {
                        C201955140j.LIZ("HWCompileProbe -> CompileProbeV2: onCompileProbe2() result != VEResult.TER_EXIT And result != VEResult.TER_OK");
                        c11kt.tryOnError(new C1465890oFX(new C1466030oFl(i)));
                        return;
                    }
                    C1780120wQM c1780120wQM = new C1780120wQM(i3, i8, i5, f, f3, c1446280nju.LIZJ.getBitrateStrategy());
                    if (C1433000nOU.LIZ(videoPublishEditModel)) {
                        strLIZ2 = C1442600ndy.LIZ();
                    } else {
                        strLIZ2 = null;
                    }
                    C1465930oFb hwAdaptiveBitrate = new C1780100wQK(2).LIZ().getHwAdaptiveBitrate(Math.min(i6, i7), c1780120wQM, f2, c1446280nju.LIZJ.getBitrateRange(), strLIZ2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("HWCompileProbe -> CompileProbeV2: getHwAdaptiveBitrate() method is called. min_optBitrate = ");
                    sbLIZ2.append(hwAdaptiveBitrate.LIZ);
                    sbLIZ2.append("; optBitrate = ");
                    sbLIZ2.append(hwAdaptiveBitrate.LIZIZ);
                    sbLIZ2.append("; min_optBitrate_HD = ");
                    sbLIZ2.append(hwAdaptiveBitrate.LIZJ);
                    sbLIZ2.append("; optBitrate_HD = ");
                    sbLIZ2.append(hwAdaptiveBitrate.LIZLLL);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    c11kt.onSuccess(new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.SUCCESS, i, 0, ""), new CompileProbeResult.ResultData(i2, f, i3, i4, i5, i6, i7, f3, i2, i9, d, (int) (System.currentTimeMillis() - c238400w2.element), f2, new OptBitrateFromVE(hwAdaptiveBitrate.LIZ, hwAdaptiveBitrate.LIZIZ, hwAdaptiveBitrate.LIZJ, hwAdaptiveBitrate.LIZLLL)), 2));
                    return;
                }
                C201955140j.LIZ("HWCompileProbe -> CompileProbeV2: onCompileProbe2() result = VEResult.TER_EXIT");
                c11kt.tryOnError(new C1465890oFX(new C1466010oFj(i)));
            }
        };
        synchronized (VEEditor.LLLLLLLLLL) {
            try {
                if (VEEditor.LLLLLLLZIL) {
                    iLIZLLL = -2;
                } else {
                    VEEditor.LLLLLLLZIL = true;
                    if (probeType == 0) {
                        C2484209oO.LJIIIIZZ("VEEditor", "compile use not hard encode, not soft encode");
                        iLIZLLL = -100;
                    } else {
                        iLIZLLL = VEEditor.LIZLLL(videoPath, strLIZIZ, 1080, 1920, startPointMs, endPointMs, strLIZ, probeType, null, r3);
                        VEEditor.LLLLLLLZIL = false;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("HWCompileProbe -> CompileProbeV2: compileProbe() method is called, checkResult = ");
        sbLIZ2.append(iLIZLLL);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (iLIZLLL != 0) {
            interfaceC2329309At.tryOnError(new C1465890oFX(new C1466020oFk(iLIZLLL)));
        }
    }

    public C1466830oH3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
