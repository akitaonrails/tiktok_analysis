package X;

import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLERenderSetting;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.AssetType;
import com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem;
import com.ss.android.ugc.aweme.aigc.asynctask.SummarySegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LDT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LDT {
    public final C0LDY LIZ;
    public NLEEditor LIZIZ;
    public C1463860oCG LIZJ;
    public boolean LIZLLL;

    public final synchronized void LIZJ() {
        C1463860oCG c1463860oCG;
        INLEExporter exporterApi;
        C201955140j.LIZLLL(C539300LDc.LIZIZ, "SummaryComposer", "Destroying composer resources");
        try {
            c1463860oCG = this.LIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C537680L6w.LIZ(C539300LDc.LIZIZ, "SummaryComposer", "Error destroying compiler", e);
        }
        if (c1463860oCG == null || (exporterApi = c1463860oCG.getExporterApi()) == null) {
            this.LIZJ = null;
            this.LIZIZ = null;
            this.LIZLLL = false;
            C201955140j.LIZLLL(C539300LDc.LIZIZ, "SummaryComposer", "Composer resources released");
        } else {
            ((C1463840oCE) exporterApi).destroyCompiler();
            this.LIZJ = null;
            this.LIZIZ = null;
            this.LIZLLL = false;
            C201955140j.LIZLLL(C539300LDc.LIZIZ, "SummaryComposer", "Composer resources released");
        }
    }

    public final Pair<Integer, Integer> LIZLLL() {
        C0LDY c0ldy = this.LIZ;
        int i = c0ldy.LIZJ;
        int i2 = c0ldy.LIZLLL;
        C539300LDc c539300LDc = C539300LDc.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Using fixed output resolution: ");
        sbLIZ.append(i);
        sbLIZ.append('x');
        sbLIZ.append(i2);
        C201955140j.LIZLLL(c539300LDc, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ));
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public C0LDT(C0LDY c0ldy) {
        this.LIZ = c0ldy;
    }

    public final Pair LIZ(int i, int i2, List list) {
        C443120HZe c443120HZe;
        long jLongValue;
        NLEResType nLEResType;
        AssetType assetType;
        String str;
        NLEEditor nLEEditor = this.LIZIZ;
        if (nLEEditor != null) {
            NLEModel model = nLEEditor.getModel();
            NLERenderSetting nLERenderSetting = new NLERenderSetting();
            nLERenderSetting.setEnable(true);
            nLERenderSetting.setCanvasWidth(i);
            nLERenderSetting.setCanvasHeight(i2);
            nLERenderSetting.setPreviewBackgroundColor(4278190080L);
            model.setRenderSetting(nLERenderSetting);
            nLEEditor.getModel().setCanvasRatio(i / i2);
            ArrayList arrayList = new ArrayList();
            NLETrack nLETrack = new NLETrack();
            nLETrack.setMainTrack(true);
            int i3 = 0;
            long j = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    CompositionMediaItem compositionMediaItem = (CompositionMediaItem) obj;
                    try {
                        VideoFileInfo videoFileInfoLJIIJ = C571500MbE.LJIIJ(compositionMediaItem.uri);
                        c443120HZe = new C443120HZe(Integer.valueOf(videoFileInfoLJIIJ.getWidth()), Integer.valueOf(videoFileInfoLJIIJ.getHeight()), Long.valueOf(videoFileInfoLJIIJ.getDuration()));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C539300LDc c539300LDc = C539300LDc.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed to get video info: ");
                        sbLIZ.append(compositionMediaItem.uri);
                        C537680L6w.LIZ(c539300LDc, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ), e);
                        c443120HZe = new C443120HZe(Integer.valueOf(compositionMediaItem.width), Integer.valueOf(compositionMediaItem.height), Long.valueOf(this.LIZ.LIZIZ));
                    }
                    int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
                    int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
                    long jLongValue2 = ((Number) c443120HZe.getThird()).longValue();
                    if (compositionMediaItem.isVideo) {
                        Long lValueOf = Long.valueOf(jLongValue2);
                        if (lValueOf.longValue() > 0) {
                            jLongValue = lValueOf.longValue();
                        } else {
                            jLongValue = this.LIZ.LIZIZ;
                        }
                    } else {
                        jLongValue = this.LIZ.LIZIZ;
                    }
                    if (jLongValue <= 0) {
                        C539300LDc c539300LDc2 = C539300LDc.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Skipping item ");
                        sbLIZ2.append(i3);
                        sbLIZ2.append(" with zero duration");
                        C201955140j.LIZLLL(c539300LDc2, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        NLEResourceAV nLEResourceAV = new NLEResourceAV();
                        nLEResourceAV.setResourceFile(compositionMediaItem.uri);
                        if (compositionMediaItem.isVideo) {
                            nLEResType = NLEResType.VIDEO;
                        } else {
                            nLEResType = NLEResType.IMAGE;
                        }
                        nLEResourceAV.setResourceType(nLEResType);
                        nLEResourceAV.setWidth(iIntValue);
                        nLEResourceAV.setHeight(iIntValue2);
                        long j2 = jLongValue * 1000;
                        nLEResourceAV.setDuration(j2);
                        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                        nLESegmentVideo.setAVFile(nLEResourceAV);
                        nLESegmentVideo.setTimeClipStart(0L);
                        nLESegmentVideo.setTimeClipEnd(j2);
                        NLETrackSlot nLETrackSlot = new NLETrackSlot();
                        nLETrackSlot.setMainSegment(nLESegmentVideo);
                        nLETrackSlot.setStartTime(j * 1000);
                        long j3 = j + jLongValue;
                        nLETrackSlot.setEndTime(j3 * 1000);
                        nLETrackSlot.setDuration(j2);
                        nLETrack.addSlotAtEnd(nLETrackSlot);
                        String str2 = compositionMediaItem.id;
                        if (compositionMediaItem.isVideo) {
                            assetType = AssetType.VIDEO;
                        } else {
                            assetType = AssetType.IMAGE;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(iIntValue);
                        sbLIZ3.append('x');
                        sbLIZ3.append(iIntValue2);
                        arrayList.add(new SummarySegment(str2, assetType, j, j3, jLongValue2, C2188811AlT.LIZIZ(sbLIZ3), ""));
                        C539300LDc c539300LDc3 = C539300LDc.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Added segment ");
                        sbLIZ4.append(i3);
                        sbLIZ4.append(": ");
                        sbLIZ4.append(C13LN.LL(30, compositionMediaItem.uri));
                        sbLIZ4.append(", type=");
                        if (compositionMediaItem.isVideo) {
                            str = "video";
                        } else {
                            str = "image";
                        }
                        sbLIZ4.append(str);
                        sbLIZ4.append(", timeline=");
                        sbLIZ4.append(j);
                        sbLIZ4.append('-');
                        sbLIZ4.append(j3);
                        sbLIZ4.append("ms");
                        C201955140j.LIZLLL(c539300LDc3, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ4));
                        j = j3;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            long j4 = j * 1000;
            nLETrack.setDuration(j4);
            nLEEditor.getModel().addTrack(nLETrack);
            nLEEditor.getModel().setDuration(j4);
            C539300LDc c539300LDc4 = C539300LDc.LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Timeline built: ");
            sbLIZ5.append(arrayList.size());
            sbLIZ5.append(" segments on main track, total ");
            sbLIZ5.append(j);
            sbLIZ5.append("ms, outputRes=");
            sbLIZ5.append(i);
            sbLIZ5.append('x');
            sbLIZ5.append(i2);
            C201955140j.LIZLLL(c539300LDc4, "SummaryComposer", C2188811AlT.LIZIZ(sbLIZ5));
            return new Pair(arrayList, Long.valueOf(j));
        }
        throw new IllegalStateException("Editor not initialized");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r6, X.InterfaceC1364105Vn r7, X.C539350LDh r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0LDU
            if (r0 == 0) goto L3b
            r4 = r7
            X.0LDU r4 = (X.C0LDU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L41
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0LDX r1 = new X.0LDX
            r0 = 0
            r1.<init>(r6, r5, r8, r0)
            r4.LLILLL = r2
            java.lang.Object r1 = X.C2296808zG.LJ(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L3b:
            X.0LDU r4 = new X.0LDU
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LDT.LIZIZ(java.util.List, X.05Vn, X.0LDh):java.lang.Object");
    }
}
