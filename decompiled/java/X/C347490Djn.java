package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Djn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347490Djn extends AbstractC348060Dki {
    public final C347500Djo LIZIZ;

    public C347490Djn(C347500Djo c347500Djo) {
        this.LIZIZ = c347500Djo;
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        NLETrack nLETrack;
        NLETrack next;
        long duration;
        NLETrack next2;
        NLETrack next3;
        NLETrack next4;
        long duration2;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSlotSPtr slots2;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEStyCrop crop;
        NLESegmentVideo nLESegmentVideoDynamicCast2;
        int i = C347520Djq.LIZ[this.LIZIZ.LIZ.ordinal()];
        float fFloatValue = 1.0f;
        String uuid = null;
        if (i != 1) {
            if (i == 2) {
                Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next3 = it2.next();
                        if (Intrinsics.LJFF(C348350DlB.LJIIIIZZ(next3), "VIDEO")) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = next3;
                if (nLETrack2 == null) {
                    nLETrack2 = new NLETrack();
                    nLETrack2.setExtra("RewindTrackType", "VIDEO");
                    nLEEditor.getModel().addTrack(nLETrack2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" 1.create new Video ReverseTrack ");
                    sbLIZ.append(nLETrack2.getUUID());
                    LJFF(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    nLETrack2.clearSlot();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" 1.reuse Video ReverseTrack ");
                    sbLIZ2.append(nLETrack2.getUUID());
                    LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                }
                Iterator<NLETrack> it3 = nLEEditor.getModel().getTracks().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next4 = it3.next();
                        if (next4.getMainTrack()) {
                            break;
                        }
                    } else {
                        next4 = null;
                        break;
                    }
                }
                NLETrack nLETrack3 = next4;
                if (nLETrack3 != null) {
                    duration2 = nLETrack3.getMeasuredEndTime();
                } else {
                    duration2 = ((long) LIZLLL().LIZJ().getDuration()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }
                long j = duration2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                Iterator<NLETrackSlot> it4 = nLEEditor.getModel().getMainTrack().getSlots().iterator();
                if (it4.hasNext()) {
                    float volume = NLESegmentVideo.dynamicCast((NLENode) it4.next().getMainSegment()).getVolume();
                    while (it4.hasNext()) {
                        volume = Math.max(volume, NLESegmentVideo.dynamicCast((NLENode) it4.next().getMainSegment()).getVolume());
                    }
                    Float fValueOf = Float.valueOf(volume);
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    }
                }
                nLETrack2.setEnable(false);
                nLETrack2.setMainTrack(true);
                NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                nLEResourceAV.setResourceFile(this.LIZIZ.LIZIZ);
                nLESegmentVideo.setTimeClipStart(0L);
                long j2 = j * 1000;
                nLESegmentVideo.setTimeClipEnd(j2);
                nLESegmentVideo.setVolume(fFloatValue);
                nLESegmentVideo.setAVFile(nLEResourceAV);
                nLETrackSlot2.setMainSegment(nLESegmentVideo);
                nLETrackSlot2.setStartTime(0L);
                nLETrackSlot2.setEndTime(j2);
                nLETrackSlot2.setExtra("RewindVideoRotate", String.valueOf(this.LIZIZ.LIZJ));
                VecNLETrackSPtr tracks = nLEEditor.getModel().getTracks();
                if (tracks != null) {
                    ArrayList arrayList = new ArrayList();
                    for (NLETrack nLETrack4 : tracks) {
                        NLETrack nLETrack5 = nLETrack4;
                        if (nLETrack5.getMainTrack() && !Intrinsics.LJFF(C348350DlB.LJIIIIZZ(nLETrack5), "VIDEO")) {
                            arrayList.add(nLETrack4);
                        }
                    }
                    NLETrack nLETrack6 = (NLETrack) C13LP.LJJJLZIJ(0, arrayList);
                    if (nLETrack6 != null && (slots = nLETrack6.getSlots()) != null && slots.size() == 1 && (slots2 = nLETrack6.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots2)) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && (crop = nLESegmentVideoDynamicCast.getCrop()) != null && (nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment())) != null) {
                        float f = this.LIZIZ.LIZJ;
                        if (f != 0.0f && f % 90 == 0.0f) {
                            Pair pairLJII = LJII(crop.getXLeftUpper(), crop.getYLeftUpper(), f);
                            Pair pairLJII2 = LJII(crop.getXLeftLower(), crop.getYLeftLower(), f);
                            Pair pairLJII3 = LJII(crop.getXRightUpper(), crop.getYRightUpper(), f);
                            Pair pairLJII4 = LJII(crop.getXRightLower(), crop.getYRightLower(), f);
                            crop = new NLEStyCrop();
                            crop.setXLeftUpper(((Number) pairLJII.getFirst()).floatValue());
                            crop.setYLeftUpper(((Number) pairLJII.getSecond()).floatValue());
                            crop.setXLeftLower(((Number) pairLJII2.getFirst()).floatValue());
                            crop.setYLeftLower(((Number) pairLJII2.getSecond()).floatValue());
                            crop.setXRightUpper(((Number) pairLJII3.getFirst()).floatValue());
                            crop.setYRightUpper(((Number) pairLJII3.getSecond()).floatValue());
                            crop.setXRightLower(((Number) pairLJII4.getFirst()).floatValue());
                            crop.setYRightLower(((Number) pairLJII4.getSecond()).floatValue());
                        }
                        nLESegmentVideoDynamicCast2.setCrop(crop);
                    }
                }
                nLETrack2.addSlot(nLETrackSlot2);
                nLETrack2.setStartTime(0L);
                nLETrack2.setEndTime(j2);
                return;
            }
            throw new C1954807lC();
        }
        Iterator<NLETrack> it5 = nLEEditor.getModel().getTracks().iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            nLETrack = it5.next();
            if (Intrinsics.LJFF(C348350DlB.LJIIIIZZ(nLETrack), "AUDIO")) {
                if (nLETrack != null) {
                    NLETrack nLETrack7 = nLETrack;
                    nLETrack7.clearSlot();
                    Iterator<NLEFilter> it6 = nLETrack7.getFilters().iterator();
                    while (it6.hasNext()) {
                        C347470Djl c347470DjlLJIJJ = LIZLLL().LIZIZ().LJIJJ(it6.next().getUUID());
                        if (c347470DjlLJIJJ != null) {
                            LIZLLL().LIZIZ().LJIIIIZZ(c347470DjlLJIJJ);
                        }
                    }
                    nLETrack7.clearFilter();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(" 1.reuse Audio ReverseTrack ");
                    sbLIZ3.append(nLETrack7.getUUID());
                    LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        nLETrack = new NLETrack();
        nLETrack.setExtra("RewindTrackType", "AUDIO");
        nLEEditor.getModel().addTrack(nLETrack);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(" 1.create new Audio ReverseTrack ");
        sbLIZ4.append(nLETrack.getUUID());
        LJFF(C2188811AlT.LIZIZ(sbLIZ4));
        NLETrack nLETrack8 = nLETrack;
        nLETrack8.setEnable(false);
        LJFF(" 2.AudioAddOperation");
        Iterator<NLETrack> it7 = nLEEditor.getModel().getTracks().iterator();
        while (true) {
            if (it7.hasNext()) {
                next = it7.next();
                if (next.getMainTrack()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack9 = next;
        if (nLETrack9 != null) {
            duration = nLETrack9.getMeasuredEndTime();
        } else {
            duration = ((long) LIZLLL().LIZJ().getDuration()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        long j3 = duration / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        Iterator<NLETrackSlot> it8 = nLEEditor.getModel().getMainTrack().getSlots().iterator();
        if (it8.hasNext()) {
            float volume2 = NLESegmentVideo.dynamicCast((NLENode) it8.next().getMainSegment()).getVolume();
            while (it8.hasNext()) {
                volume2 = Math.max(volume2, NLESegmentVideo.dynamicCast((NLENode) it8.next().getMainSegment()).getVolume());
            }
            Float fValueOf2 = Float.valueOf(volume2);
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        }
        C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.REVERSE_AUDIO);
        c347650Dk3.LJFF = 0L;
        c347650Dk3.LJI = j3;
        c347650Dk3.LIZIZ = this.LIZIZ.LIZIZ;
        c347650Dk3.LIZLLL = 0L;
        c347650Dk3.LJ = j3;
        c347650Dk3.LJIIIZ = fFloatValue;
        nLETrack8.setExtra("AudioTrackType", "REVERSE_AUDIO");
        new C347720DkA(c347650Dk3, false);
        C347720DkA.LJII(nLETrack8, c347650Dk3);
        String strLJI = LIZLLL().LIZIZ().LJI(nLEEditor.getModel(), EnumC355960DxS.ORIGIN);
        LJFF(" 3.get original audio filter " + strLJI);
        if (strLJI == null) {
            Iterator<NLETrack> it9 = nLEEditor.getModel().getTracks().iterator();
            while (true) {
                if (it9.hasNext()) {
                    next2 = it9.next();
                    NLETrack nLETrack10 = next2;
                    if (nLETrack10.getMainTrack() && TextUtils.isEmpty(C348350DlB.LJIIIIZZ(nLETrack10))) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            NLETrack nLETrack11 = next2;
            if (nLETrack11 != null) {
                uuid = nLETrack11.getUUID();
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(" 3.find mainTrack ");
            sbLIZ5.append(uuid);
            LJFF(C2188811AlT.LIZIZ(sbLIZ5));
            strLJI = uuid;
            if (uuid == null) {
                LJI(" 4.find track nothing");
                return;
            }
        }
        List<C347470Djl> listLJII = LIZLLL().LIZIZ().LJII();
        ArrayList<C347470Djl> arrayList2 = new ArrayList();
        for (C347470Djl c347470Djl : listLJII) {
            if (Intrinsics.LJFF(c347470Djl.LIZIZ, strLJI)) {
                arrayList2.add(c347470Djl);
            }
        }
        for (C347470Djl c347470Djl2 : arrayList2) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(" 4.clone audioFilter ");
            sbLIZ6.append(c347470Djl2.LIZJ);
            LJFF(C2188811AlT.LIZIZ(sbLIZ6));
            InterfaceC391070FUz interfaceC391070FUzLIZIZ = LIZLLL().LIZIZ();
            String uuid2 = nLETrack8.getUUID();
            C347470Djl c347470Djl3 = new C347470Djl(c347470Djl2.LIZ);
            c347470Djl3.LIZLLL = c347470Djl2.LIZLLL;
            c347470Djl3.LJ = c347470Djl2.LJ;
            c347470Djl3.LJFF = c347470Djl2.LJFF;
            c347470Djl3.LJIIIIZZ = c347470Djl2.LJIIIIZZ;
            c347470Djl3.LJIIIZ = c347470Djl2.LJIIIZ;
            c347470Djl3.LJIIJ = c347470Djl2.LJIIJ;
            c347470Djl3.LJIIJJI = c347470Djl2.LJIIJJI;
            c347470Djl3.LJIIL = c347470Djl2.LJIIL;
            c347470Djl3.LJIILJJIL = c347470Djl2.LJIILJJIL;
            c347470Djl3.LJIILL = c347470Djl2.LJIILL;
            c347470Djl3.LJIILIIL = c347470Djl2.LJIILIIL;
            interfaceC391070FUzLIZIZ.LJIILL(uuid2, c347470Djl3);
        }
    }

    public static Pair LJII(float f, float f2, float f3) {
        double d = (((double) f3) * 3.141592653589793d) / 180.0d;
        double d2 = ((double) f) - 0.5d;
        double d3 = ((double) f2) - 0.5d;
        return new Pair(Float.valueOf((float) (((Math.cos(d) * d2) - (Math.sin(d) * d3)) + 0.5d)), Float.valueOf((float) ((d2 * Math.sin(d)) + (d3 * Math.cos(d)) + 0.5d)));
    }
}
