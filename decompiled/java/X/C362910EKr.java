package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0EKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362910EKr extends AbstractC371450EhL<Unit> {
    public final C365910EWf LIZLLL;
    public final C0ELI LJ;
    public final C362980EKy LJI;
    public final C358100E2e LJII;
    public final C351770Dqh LJIIIIZZ;
    public final C19EG LJIIIZ;
    public final C348830Dlx LJFF = new C348830Dlx();
    public final C362960EKw LJIIJ = new C362960EKw(0);

    public C362910EKr(C0EI6 c0ei6) {
        this.LIZLLL = (C365910EWf) c0ei6.LIZ(C365910EWf.class);
        this.LJ = (C0ELI) c0ei6.LIZ(C0ELI.class);
        this.LJI = (C362980EKy) c0ei6.LIZ(C362980EKy.class);
        this.LJII = (C358100E2e) c0ei6.LIZ.LJIIL(null, C358100E2e.class);
        this.LJIIIIZZ = (C351770Dqh) c0ei6.LIZ(C351770Dqh.class);
        this.LJIIIZ = (C19EG) c0ei6.LIZ(C19EG.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static void LJFF(NLEModel nLEModel) {
        NLETrack mainTrack;
        ?? arrayList;
        NLETrack nLETrack = (NLETrack) C13LP.LJJJLL(C346780Die.LIZIZ(nLEModel));
        if (nLETrack == null || (mainTrack = nLEModel.getMainTrack()) == null) {
            return;
        }
        VecNLETrackSlotSPtr sortedSlots = mainTrack.getSortedSlots();
        if (sortedSlots != null) {
            arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                if (C351220Dpo.LLIFFJFJJ(nLETrackSlot)) {
                    arrayList.add(nLETrackSlot);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                NLENode nLENode = (NLENode) obj;
                NLENode nLENode2 = (NLENode) C13LP.LJJJLZIJ(i, nLETrack.getSortedSlots());
                if (nLENode2 != null) {
                    nLENode.setExtra("original_audio_uuid", nLENode2.getUUID());
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static void LJI(NLEModel nLEModel) {
        long duration;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            duration = mainTrack.getDuration();
        } else {
            duration = 0;
        }
        if (C351220Dpo.LJII(nLEModel) > duration) {
            C351510DqH c351510DqH = C351510DqH.LIZ;
            AFwS191S0000000_5 aFwS191S0000000_5 = AFwS191S0000000_5.get$arr$(352);
            c351510DqH.getClass();
            C351510DqH.LJIIJ(nLEModel, false, aFwS191S0000000_5);
        }
    }

    public static void LJIIIZ(NLEModel nLEModel) {
        C356600DyU.LIZ = C351220Dpo.LJJIJLIJ(nLEModel).size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0481, code lost:
    
        if (r9.getEndTime() <= r2) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0489, code lost:
    
        if (((int) r9.getEndTime()) == (-2)) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0491, code lost:
    
        if (r9.getStartTime() <= r2) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0497, code lost:
    
        if (X.C351220Dpo.LLILLL(r12) != false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x049d, code lost:
    
        if (X.C351220Dpo.LLJILLL(r12) != false) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x049f, code lost:
    
        r12.removeSlot(r9);
        r0 = X.C351510DqH.LIZ;
        r1 = X.C350870DpF.LJIIIIZZ(r12);
        r0.getClass();
        X.C351510DqH.LJIIJJI(r4, r1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04b1, code lost:
    
        r8 = X.C351220Dpo.LJLILLLLZI(r9.getMainSegment());
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04bd, code lost:
    
        if (X.C351220Dpo.LJZ(r9) == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04bf, code lost:
    
        r11 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.dynamicCast((com.bytedance.ies.nle.editor_jni.NLENode) r9.getMainSegment());
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04c7, code lost:
    
        if (r11 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04c9, code lost:
    
        r10 = new com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator(r11.getSeqCurveSpeedPoints());
        r10.setSeqDuration(r9.getDuration());
        r7 = (r11.getTimeClipEnd() - r11.getTimeClipStart()) - ((long) ((r2 - r9.getStartTime()) * r10.getAveCurveSpeedRatio()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04f0, code lost:
    
        r9.setEndTime(r2);
        r15 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.dynamicCast(r9.getMainSegment());
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04fb, code lost:
    
        if (r15 == null) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04fd, code lost:
    
        r15.setTimeClipEnd(r15.getTimeClipEnd() - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0516, code lost:
    
        if ((r15.getTimeClipEnd() - r15.getTimeClipStart()) >= (((long) 100) * 1000)) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0518, code lost:
    
        r12.removeSlot(r9);
        r0 = X.C351510DqH.LIZ;
        r1 = X.C350870DpF.LJIIIIZZ(r12);
        r0.getClass();
        X.C351510DqH.LJIIJJI(r4, r1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x052b, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x052e, code lost:
    
        r7 = (long) ((r9.getEndTime() - r2) * r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:287:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07cd A[LOOP:16: B:297:0x07c7->B:299:0x07cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0bf3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0bf4  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0c39 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0176  */
    @Override // X.AbstractC371450EhL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362910EKr.LIZJ(X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC371450EhL
    public final void LJ(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> list;
        List<EditVideoSegment> list2;
        C362970EKx c362970EKx = this.LJIIJ.LIZ;
        if (c362970EKx != null) {
            if (c362970EKx.LIZ) {
                C389790FQb.LIZ.getClass();
                C389790FQb.LIZ(videoPublishEditModel, true);
                List<TextStickerModel> list3 = c362970EKx.LIZIZ;
                if (list3 != null) {
                    videoPublishEditModel.creativeModel.stickerModel.textStickerModels = new ArrayList(list3);
                }
            }
            if (c362970EKx.LIZJ && (list2 = c362970EKx.LIZLLL) != null) {
                videoPublishEditModel.getEditorProModel().setCanvasShootImageSegments(list2);
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.LJIIJ.LIZIZ;
        if (multiEditVideoStatusRecordData != null) {
            if (((Boolean) C273840AoI.LIZ.getValue()).booleanValue()) {
                if (videoPublishEditModel.getMultiEditVideoRecordData() == null) {
                    videoPublishEditModel.setMultiEditVideoRecordData(multiEditVideoStatusRecordData);
                }
                MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData != null) {
                    multiEditVideoRecordData.curMultiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                }
                MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData2 != null) {
                    multiEditVideoRecordData2.editSegments = multiEditVideoStatusRecordData.editSegments;
                }
                MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData3 != null) {
                    multiEditVideoRecordData3.editCutSegments = multiEditVideoStatusRecordData.editCutSegments;
                }
            } else {
                videoPublishEditModel.setMultiEditVideoRecordData(multiEditVideoStatusRecordData);
            }
        }
        AudioRecorderParam audioRecorderParam = this.LJIIJ.LIZJ;
        if (audioRecorderParam != null) {
            videoPublishEditModel.setVeAudioRecorderParam(audioRecorderParam);
        }
        if (((Boolean) C284730BDz.LIZ.getValue()).booleanValue() && (list = this.LJIIJ.LIZLLL) != null) {
            videoPublishEditModel.getEditorProModel().setAlbumUploadVideoSegments(list);
        }
    }

    public static final void LJII(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            ArrayList<NLENode> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.AUDIO) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLENode nLENode : arrayList) {
                String extra = nLENode.getExtra("biz_extra_type");
                String extra2 = nLENode.getExtra("AudioTrackType");
                if (u.LJIJI(extra, "bgm", true) && (extra2 == null || extra2.length() == 0)) {
                    nLENode.setExtra("AudioTrackType", "BGM");
                }
            }
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        String musicOrigin = videoPublishEditModel.getMusicOrigin();
        c363500EMy.getClass();
        NLETrack nLETrackLIZ = C348860Dm0.LIZ(nLEModel);
        if (nLETrackLIZ != null) {
            if (musicOrigin == null) {
                musicOrigin = "";
            }
            nLETrackLIZ.setExtra("music_origin_for_mod", musicOrigin);
        }
        C351510DqH c351510DqH = C351510DqH.LIZ;
        NLETrackType nLETrackType = NLETrackType.AUDIO;
        c351510DqH.getClass();
        C351510DqH.LJIIJJI(nLEModel, nLETrackType, "");
    }

    public final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        boolean z;
        if (C301680Bs6.LIZ() && videoPublishEditModel.getVeAudioRecorderParam() == null) {
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                NLETrack next = it2.next();
                NLETrack nLETrack = next;
                if (nLETrack.getMainTrack() || C351220Dpo.LLLIIL(nLETrack)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (C351220Dpo.LLI((NLETrackSlot) it4.next())) {
                        break;
                    }
                }
                videoPublishEditModel.isCurrentAutoCutMode();
                z = false;
            } else {
                videoPublishEditModel.isCurrentAutoCutMode();
                z = false;
            }
            audioRecorderParam.setHasOriginalSound(z);
            audioRecorderParam.setNeedOriginalSound(audioRecorderParam.getHasOriginalSound());
            if (audioRecorderParam.getNeedOriginalSound()) {
                audioRecorderParam.setMuteByAudioCopyright(false);
            }
            audioRecorderParam.setVoiceVolume(videoPublishEditModel.getVoiceVolume());
            this.LJIIJ.LIZJ = audioRecorderParam;
        }
    }
}
