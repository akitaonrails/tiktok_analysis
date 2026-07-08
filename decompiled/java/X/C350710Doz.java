package X;

import android.graphics.PointF;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;

/* JADX INFO: renamed from: X.0Doz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350710Doz extends C350680Dow implements InterfaceC353460DtQ {
    public C350710Doz(C0E48 c0e48) {
        super(c0e48);
    }

    @Override // X.InterfaceC353460DtQ
    public final void LLFFF(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        long duration = nLETrackSlot.getDuration();
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone());
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast != null) {
            nLESegmentAudioDynamicCast.clearSegCurveSpeedPoint();
            nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + (nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart()));
        }
        NLETrack trackBySlot = C350870DpF.LJI(this.LIZ).getTrackBySlot(nLETrackSlot);
        if (trackBySlot != null && trackBySlot.getMainTrack()) {
            TrackLinkageManagerProvider.Companion.getClass();
            AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
            C349510Dn3 c349510Dn3 = new C349510Dn3("speed_video", C1697810uHb.LJ(new C349470Dmz(nLETrackSlotDynamicCast, nLETrackSlot, null, null, 28)), nLEModelDynamicCast);
            if (businessTrackLinkageManager != null) {
                businessTrackLinkageManager.LIZJ(c349510Dn3);
            }
        }
        if (C351230Dpp.LJ(null)) {
            C350690Dox.LJII(duration, nLETrackSlot, this.LIZ);
        }
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC353460DtQ
    public final void LJJJJJ(NLETrackSlot nLETrackSlot, C350740Dp2 c350740Dp2, EnumC356070Dxd enumC356070Dxd) {
        float absSpeed;
        boolean keepTone;
        AbstractC349500Dn2 businessTrackLinkageManager;
        long duration = nLETrackSlot.getDuration();
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            Float f = c350740Dp2.LIZ;
            if (f != null) {
                absSpeed = f.floatValue();
            } else {
                absSpeed = nLESegmentVideoDynamicCast.getAbsSpeed();
            }
            Boolean bool = c350740Dp2.LIZIZ;
            if (bool != null) {
                keepTone = bool.booleanValue();
            } else {
                keepTone = nLESegmentVideoDynamicCast.getKeepTone();
            }
            if (!c350740Dp2.LIZJ) {
                NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
                NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone());
                this.LIZLLL.pause(false);
                nLESegmentVideoDynamicCast.setAbsSpeed(absSpeed);
                long timeClipEnd = (long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / nLESegmentVideoDynamicCast.getAbsSpeed());
                nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + timeClipEnd);
                nLESegmentVideoDynamicCast.setKeepTone(keepTone);
                C350110Do1.LJIILJJIL(C350870DpF.LJI(this.LIZ), nLETrackSlot, c350740Dp2);
                C351510DqH c351510DqH = C351510DqH.LIZ;
                C0E48 c0e48 = this.LIZ;
                long startTime = nLETrackSlot.getStartTime();
                long endTime = nLETrackSlot.getEndTime();
                c351510DqH.getClass();
                NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
                if (nLETrackSlotLLLLLLIL != null) {
                    C351510DqH.LJJIZ(c0e48, nLETrackSlotLLLLLLIL, startTime, endTime, 0);
                }
                this.LIZ.og().LJJIJL(nLETrackSlot, null);
                if (C351220Dpo.LJ(nLETrackSlot)) {
                    nLESegmentVideoDynamicCast.clearSegCurveSpeedPoint();
                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_resource_id");
                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_name");
                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_english_name");
                }
                NLETrack nLETrackLLJJIII = LLJJIII();
                if (nLETrackLLJJIII != null && nLETrackLLJJIII.getMainTrack()) {
                    if (timeClipEnd < 200000) {
                        nLETrackSlot.setEndTransition(null);
                        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(this.LIZ.Rn().getSortedSlots().indexOf(nLETrackSlot) - 1, this.LIZ.Rn().getSortedSlots());
                        if (nLETrackSlot2 != null) {
                            nLETrackSlot2.setEndTransition(null);
                        }
                    }
                    TrackLinkageManagerProvider.Companion.getClass();
                    TrackLinkageManagerProvider trackLinkageManagerProviderLIZ = C356700Dye.LIZ();
                    if (trackLinkageManagerProviderLIZ != null && (businessTrackLinkageManager = trackLinkageManagerProviderLIZ.getBusinessTrackLinkageManager()) != null) {
                        businessTrackLinkageManager.LIZJ(new C349510Dn3("speed_video", C1697810uHb.LJ(new C349470Dmz(nLETrackSlotDynamicCast, nLETrackSlot, null, null, 28)), nLEModelDynamicCast));
                    }
                }
                C350110Do1.LJIILL(LLZ());
                if (C351230Dpp.LJ(null)) {
                    C350690Dox.LJII(duration, nLETrackSlot, this.LIZ);
                }
                LLJJ(null, enumC356070Dxd);
            }
            InterfaceC350750Dp3 interfaceC350750Dp3 = c350740Dp2.LIZLLL;
            if (interfaceC350750Dp3 != null) {
                interfaceC350750Dp3.LIZ(absSpeed, keepTone);
            }
        }
    }

    @Override // X.InterfaceC353460DtQ
    public final void LLIIJLIL(NLETrackSlot nLETrackSlot, C350730Dp1 c350730Dp1, EnumC356070Dxd enumC356070Dxd) {
        int i = C350720Dp0.LIZ[c350730Dp1.LJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    nLESegmentAudioDynamicCast.clearSegCurveSpeedPoint();
                    for (PointF pointF : c350730Dp1.LIZ) {
                        NLEPoint nLEPoint = new NLEPoint();
                        nLEPoint.setX(pointF.x);
                        nLEPoint.setY(pointF.y);
                        nLESegmentAudioDynamicCast.addSegCurveSpeedPoint(nLEPoint);
                    }
                    if (nLESegmentAudioDynamicCast.getAbsSpeed() != 1.0f) {
                        nLESegmentAudioDynamicCast.setAbsSpeed(1.0f);
                    }
                    nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + ((long) ((nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart()) / nLESegmentAudioDynamicCast.getCurveAveSpeed())));
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            long duration = nLETrackSlot.getDuration();
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
            NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone());
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.clearSegCurveSpeedPoint();
                for (PointF pointF2 : c350730Dp1.LIZ) {
                    NLEPoint nLEPoint2 = new NLEPoint();
                    nLEPoint2.setX(pointF2.x);
                    nLEPoint2.setY(pointF2.y);
                    nLESegmentVideoDynamicCast.addSegCurveSpeedPoint(nLEPoint2);
                }
                nLETrackSlot.setExtra("ep_curve_speed_resource_id", c350730Dp1.LIZLLL);
                nLETrackSlot.setExtra("ep_curve_speed_name", c350730Dp1.LIZIZ);
                nLETrackSlot.setExtra("ep_curve_speed_english_name", c350730Dp1.LIZJ);
                if (!nLESegmentVideoDynamicCast.getSegCurveSpeedPoints().isEmpty()) {
                    NLECurveSpeedType curveSpeedType = nLESegmentVideoDynamicCast.getCurveSpeedType();
                    NLECurveSpeedType nLECurveSpeedType = NLECurveSpeedType.Normal;
                    if (curveSpeedType != nLECurveSpeedType) {
                        nLESegmentVideoDynamicCast.setCurveSpeedType(nLECurveSpeedType);
                        nLESegmentVideoDynamicCast.setCurveActionBeam(null);
                    }
                }
                if (nLESegmentVideoDynamicCast.getAbsSpeed() != 1.0f) {
                    nLESegmentVideoDynamicCast.setAbsSpeed(1.0f);
                }
                nLETrackSlot.setEndTime(((long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / nLESegmentVideoDynamicCast.getCurveAveSpeed())) + nLETrackSlot.getStartTime());
                C351510DqH c351510DqH = C351510DqH.LIZ;
                C0E48 c0e48 = this.LIZ;
                long startTime = nLETrackSlot.getStartTime();
                long endTime = nLETrackSlot.getEndTime();
                c351510DqH.getClass();
                NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
                if (nLETrackSlotLLLLLLIL != null) {
                    C351510DqH.LJJIZ(c0e48, nLETrackSlotLLLLLLIL, startTime, endTime, 0);
                }
                if (C351230Dpp.LJ(null)) {
                    C350690Dox.LJII(duration, nLETrackSlot, this.LIZ);
                }
                NLETrack nLETrackLLJJIII = LLJJIII();
                if (nLETrackLLJJIII != null && nLETrackLLJJIII.getMainTrack()) {
                    TrackLinkageManagerProvider.Companion.getClass();
                    AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
                    C349510Dn3 c349510Dn3 = new C349510Dn3("speed_video", C1697810uHb.LJ(new C349470Dmz(nLETrackSlotDynamicCast, nLETrackSlot, null, null, 28)), nLEModelDynamicCast);
                    if (businessTrackLinkageManager != null) {
                        businessTrackLinkageManager.LIZJ(c349510Dn3);
                    }
                }
            }
        }
        this.LIZ.og().LJJIJL(nLETrackSlot, null);
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC353460DtQ
    public final void LLILL(NLETrackSlot nLETrackSlot, C350740Dp2 c350740Dp2, EnumC356070Dxd enumC356070Dxd) {
        NLESegmentAudio nLESegmentAudioDynamicCast;
        long maxEnd;
        float absSpeed;
        boolean zBooleanValue;
        NLETrack nLETrackLLJJIII = LLJJIII();
        if (nLETrackLLJJIII != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
            NLETrack mainTrack = LLZ().getMainTrack();
            if (mainTrack != null) {
                maxEnd = mainTrack.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            Float f = c350740Dp2.LIZ;
            if (f != null) {
                absSpeed = f.floatValue();
            } else {
                absSpeed = nLESegmentAudioDynamicCast.getAbsSpeed();
            }
            if (C351220Dpo.LLILLL(nLETrackLLJJIII)) {
                nLETrackSlot.setEndTime((nLETrackSlot.getStartTime() + nLETrackSlot.getMeasuredEndTime()) - nLETrackSlot.getMeasuredStartTime());
                nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipStart() + ((long) ((nLETrackSlot.getMeasuredEndTime() - nLETrackSlot.getMeasuredStartTime()) * nLESegmentAudioDynamicCast.getAbsSpeed())));
            }
            Boolean bool = c350740Dp2.LIZIZ;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else if (!nLESegmentAudioDynamicCast.getKeepTone()) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
            if (!c350740Dp2.LIZJ) {
                this.LIZLLL.pause(false);
                nLESegmentAudioDynamicCast.setAbsSpeed(0.001f + absSpeed);
                nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + ((long) ((nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart()) / nLESegmentAudioDynamicCast.getAbsSpeed())));
                if (nLETrackSlot.getEndTime() > maxEnd) {
                    long endTime = (long) ((nLETrackSlot.getEndTime() - maxEnd) * absSpeed);
                    if (nLESegmentAudioDynamicCast.getTimeClipEnd() > endTime) {
                        nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipEnd() - endTime);
                    }
                    nLETrackSlot.setEndTime(maxEnd);
                }
                nLESegmentAudioDynamicCast.setKeepTone(!zBooleanValue);
                this.LIZ.og().LJJIJL(nLETrackSlot, null);
                LLJJ(null, enumC356070Dxd);
            }
            InterfaceC350750Dp3 interfaceC350750Dp3 = c350740Dp2.LIZLLL;
            if (interfaceC350750Dp3 != null) {
                interfaceC350750Dp3.LIZ(absSpeed, zBooleanValue);
            }
        }
    }
}
