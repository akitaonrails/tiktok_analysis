package X;

import android.content.Context;
import android.util.Pair;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VESize;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.List;

/* JADX INFO: renamed from: X.0Mfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574360Mfq extends AbstractC1452680nuE {
    public static final /* synthetic */ int LJJIJL = 0;
    public int LJJIJIIJIL;
    public int LJJIJIL;

    static {
        new C574120MfS();
    }

    public final void LJJIJIIJIL() {
        C347660Dk4 c347660Dk4LJJJJ;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = ((VEPreviewParams) this.LJIIIIZZ).recordData;
        MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
        int i = multiEditVideoStatusRecordData.currentEditIndex;
        if (multiEditVideoStatusRecordData.isMultiEditRetake) {
            int endTime = 0;
            if (multiEditVideoStatusRecordData.segmentSizeChange || this.LJIILIIL) {
                Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
                Integer num = (Integer) playInOutTime.first;
                Integer num2 = (Integer) playInOutTime.second;
                int i2 = 0;
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                    if (i2 < i) {
                        endTime += (int) (multiEditVideoSegmentRecordData2.getEndTime() - multiEditVideoSegmentRecordData2.getStartTime());
                    }
                    i2 = i3;
                }
                C574800MgY.LIZJ(multiEditVideoRecordData).setTimeRange(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
                LJJIJL(LJJ(), multiEditVideoRecordData);
                LJJ().setLoopPlay(true);
                LJJ().nf(endTime, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                return;
            }
            if (C580130Mp9.LIZ(multiEditVideoRecordData.segmentDataList)) {
                return;
            }
            MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C383300F1c.LIZIZ(multiEditVideoRecordData, null);
            multiEditVideoRecordDataLIZIZ.resetTimeData();
            Object obj = ListProtector.get(multiEditVideoRecordDataLIZIZ.segmentDataList, i);
            multiEditVideoRecordDataLIZIZ.segmentDataList.clear();
            multiEditVideoRecordDataLIZIZ.segmentDataList.add((MultiEditVideoSegmentRecordData) obj);
            int i4 = 0;
            int endTime2 = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 : multiEditVideoRecordData.segmentDataList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData4 = multiEditVideoSegmentRecordData3;
                if (i4 < i) {
                    endTime2 += (int) (multiEditVideoSegmentRecordData4.getEndTime() - multiEditVideoSegmentRecordData4.getStartTime());
                }
                i4 = i5;
            }
            long startTime = ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i)).getStartTime();
            long endTime3 = ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i)).getEndTime();
            if (multiEditVideoRecordData.isPlaySingleSegmentMusic()) {
                LJJIJL(LJJ(), multiEditVideoRecordData);
                int i6 = (int) (endTime3 - startTime);
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJJ());
                if (c348100DkmLIZIZ != null && (c347660Dk4LJJJJ = c348100DkmLIZIZ.LJFF().LJJJJ()) != null) {
                    int i7 = endTime2 + multiEditVideoRecordData.musicTrimIn;
                    int i8 = multiEditVideoRecordData.musicDuration;
                    if (i7 > i8) {
                        i7 %= i8;
                    }
                    c347660Dk4LJJJJ.LIZLLL = i7;
                    c347660Dk4LJJJJ.LJ = i7 + i6;
                    c347660Dk4LJJJJ.LJIJJLI = false;
                    c348100DkmLIZIZ.LJFF().LJJJJLL(c347660Dk4LJJJJ);
                }
            }
            LJJ().setLoopPlay(true);
            int i9 = (int) startTime;
            LJJ().uf(i9, (int) endTime3);
            LJJ().nf(i9, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574360Mfq(C1441900ncq c1441900ncq) {
        super(c1441900ncq);
        C823050WQl.LJ();
    }

    public static final boolean LJJIJIL(VEPreviewParams vEPreviewParams) {
        if (vEPreviewParams.isStoryEditMode || !vEPreviewParams.mIsFromDraft) {
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = vEPreviewParams.recordData;
        if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.isSupportMultiEdit && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1452680nuE
    public final NLEEditor LJII(VEPreviewParams vEPreviewParams) {
        boolean z;
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = vEPreviewParams.recordData;
        int i = 0;
        if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.isMultiEditRetake) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!multiEditVideoStatusRecordData.segmentSizeChange && !this.LJIILIIL) {
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                int i2 = multiEditVideoStatusRecordData.currentEditIndex;
                if (!C580130Mp9.LIZ(multiEditVideoRecordData.segmentDataList)) {
                    MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C383300F1c.LIZIZ(multiEditVideoRecordData, null);
                    multiEditVideoRecordDataLIZIZ.resetTimeData();
                    Object obj = ListProtector.get(multiEditVideoRecordDataLIZIZ.segmentDataList, i2);
                    multiEditVideoRecordDataLIZIZ.segmentDataList.clear();
                    multiEditVideoRecordDataLIZIZ.segmentDataList.add((MultiEditVideoSegmentRecordData) obj);
                    for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
                        int i3 = i + 1;
                        if (i >= 0) {
                            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                            if (i < i2) {
                                multiEditVideoSegmentRecordData2.getEndTime();
                                multiEditVideoSegmentRecordData2.getStartTime();
                            }
                            i = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    LJJ().setReuseFirstAVFileInfo(true);
                    if (LJJIJIL(vEPreviewParams)) {
                        C574120MfS.LIZ(C574800MgY.LIZJ(multiEditVideoRecordDataLIZIZ), nLEEditorLIZ, vEPreviewParams.isFormRecord);
                    } else {
                        C574120MfS.LIZIZ(C574800MgY.LIZJ(multiEditVideoRecordDataLIZIZ), nLEEditorLIZ, vEPreviewParams.isFormRecord, 1.0f);
                        return nLEEditorLIZ;
                    }
                }
                return nLEEditorLIZ;
            }
            MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            int i4 = multiEditVideoStatusRecordData.currentEditIndex;
            Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData2.getPlayInOutTime();
            Integer num = (Integer) playInOutTime.first;
            Integer num2 = (Integer) playInOutTime.second;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 : multiEditVideoRecordData2.segmentDataList) {
                int i5 = i + 1;
                if (i >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData4 = multiEditVideoSegmentRecordData3;
                    if (i < i4) {
                        multiEditVideoSegmentRecordData4.getEndTime();
                        multiEditVideoSegmentRecordData4.getStartTime();
                    }
                    i = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(multiEditVideoRecordData2);
            vERecordDataLIZJ.setTimeRange(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
            LJJ().setReuseFirstAVFileInfo(true);
            if (LJJIJIL(vEPreviewParams)) {
                C574120MfS.LIZ(vERecordDataLIZJ, nLEEditorLIZ, vEPreviewParams.isFormRecord);
                return nLEEditorLIZ;
            }
            C574120MfS.LIZIZ(vERecordDataLIZJ, nLEEditorLIZ, vEPreviewParams.isFormRecord, 1.0f);
            return nLEEditorLIZ;
        }
        Pair<Integer, Integer> playInOutTime2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData.getPlayInOutTime();
        Integer num3 = (Integer) playInOutTime2.first;
        Integer num4 = (Integer) playInOutTime2.second;
        VERecordData vERecordDataLIZJ2 = C574800MgY.LIZJ(vEPreviewParams.recordData.curMultiEditVideoRecordData);
        vERecordDataLIZJ2.setTimeRange(((long) num3.intValue()) * 1000, ((long) num4.intValue()) * 1000);
        if (LJJIJIL(vEPreviewParams)) {
            C574120MfS.LIZ(vERecordDataLIZJ2, nLEEditorLIZ, vEPreviewParams.isFormRecord);
            return nLEEditorLIZ;
        }
        C574120MfS.LIZIZ(vERecordDataLIZJ2, nLEEditorLIZ, vEPreviewParams.isFormRecord, 1.0f);
        return nLEEditorLIZ;
    }

    @Override // X.AbstractC1452680nuE
    public final void LJJIJ(SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.0nuz
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                boolean z;
                C574360Mfq c574360Mfq = this.LL;
                if (c574360Mfq.LJJIJIIJIL == i2 && c574360Mfq.LJJIJIL == i3) {
                    return;
                }
                VESize initSize = c574360Mfq.LJIJ().getInitSize(i2, i3);
                int i4 = initSize.width;
                int i5 = initSize.height;
                C1453180nv2.LJI = i2;
                C1453180nv2.LJII = i3;
                C1453180nv2.LJIIIIZZ = i4;
                C1453180nv2.LJIIIZ = i5;
                InterfaceC1452170ntP interfaceC1452170ntPLJIJ = this.LL.LJIJ();
                interfaceC1452170ntPLJIJ.tf(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                if (C1453180nv2.LJFF > 0 && C1453180nv2.LJ > 0) {
                    interfaceC1452170ntPLJIJ.Vf(C1453180nv2.LJ, C1453180nv2.LJFF);
                }
                InterfaceC1452170ntP interfaceC1452170ntPLJIJ2 = this.LL.LJIJ();
                if (C1453180nv2.LJI > 0 && C1453180nv2.LJII > 0 && C1453180nv2.LJIIIIZZ > 0 && C1453180nv2.LJIIIZ > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (C1453180nv2.LIZLLL > 0 && C1453180nv2.LIZJ > 0 && C1453180nv2.LIZ > 0 && C1453180nv2.LIZIZ > 0 && z) {
                    interfaceC1452170ntPLJIJ2.setDisplayState(C1453180nv2.LIZJ / C1453180nv2.LJIIIIZZ, C1453180nv2.LIZLLL / C1453180nv2.LJIIIZ, 0.0f, -(((C1453180nv2.LJI / 2) - (C1453180nv2.LIZJ / 2)) - C1453180nv2.LIZ), ((C1453180nv2.LJII / 2) - (C1453180nv2.LIZLLL / 2)) - C1453180nv2.LIZIZ);
                }
                C574360Mfq c574360Mfq2 = this.LL;
                c574360Mfq2.LJJIJIIJIL = i2;
                c574360Mfq2.LJJIJIL = i3;
            }
        });
    }

    public static void LJJIJL(InterfaceC1452170ntP interfaceC1452170ntP, MultiEditVideoRecordData multiEditVideoRecordData) {
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        if (!multiEditVideoRecordData.hasRetake) {
            if (!C2486109oh.LIZLLL(C0CHQ.LIZ, multiEditVideoRecordData.musicPath)) {
                return;
            }
            if (multiEditVideoRecordData.musicDuration <= 0) {
                multiEditVideoRecordData.musicDuration = C141Q.LIZIZ(-1, multiEditVideoRecordData.musicPath);
            }
            C347660Dk4 c347660Dk4 = new C347660Dk4();
            c347660Dk4.LIZIZ = multiEditVideoRecordData.musicPath;
            c347660Dk4.LJFF = 0L;
            int i = multiEditVideoRecordData.musicDuration;
            int i2 = multiEditVideoRecordData.musicTrimIn;
            c347660Dk4.LJI = i - i2;
            c347660Dk4.LIZLLL = i2;
            c347660Dk4.LJ = i;
            c347660Dk4.LJIIIZ = multiEditVideoRecordData.musicVolume;
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null) {
                interfaceC391070FUzLJFF.LJJJJLL(c347660Dk4);
            }
        }
    }

    @Override // X.AbstractC1452680nuE
    public final boolean LJIIJJI(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
        super.LJIIJJI(vEPreviewMusicParams, list);
        return false;
    }

    @Override // X.AbstractC1452680nuE
    public final void LJJI(NLEModel nLEModel, boolean z) {
        super.LJJI(nLEModel, z);
        LJJIJIIJIL();
    }

    @Override // X.AbstractC1452680nuE
    public final void LJJIFFI(String str, boolean z) {
        super.LJJIFFI(str, z);
        LJJIJIIJIL();
    }

    @Override // X.AbstractC1452680nuE
    public final int LJJII(Context context, InterfaceC574340Mfo interfaceC574340Mfo, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
        super.LJJII(context, interfaceC574340Mfo, surfaceView, lifecycleOwner);
        if (this.LJIIZILJ == 1) {
            LJIJ().setReuseFirstAVFileInfo(false);
            return 0;
        }
        LJIJ().setReuseFirstAVFileInfo(true);
        return 0;
    }
}
