package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioLoudnessBalanceFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioSamiFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Djk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347460Djk extends AbstractC348060Dki {
    public final String LIZIZ;
    public final C347470Djl LIZJ;

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        String uuid;
        NLETrack next;
        NLEFilter nLEFilter;
        String strLIZ;
        float fFloatValue;
        int iNLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get;
        long jLongValue;
        Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
        while (true) {
            uuid = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getUUID(), this.LIZIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 1.find track ");
        if (nLETrack != null) {
            uuid = nLETrack.getUUID();
        }
        sbLIZ.append(uuid);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        if (nLETrack == null) {
            LJFF(" 1.find track null ");
            return;
        }
        C347470Djl c347470Djl = this.LIZJ;
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this, nLETrack, 227);
        String str = c347470Djl.LIZ;
        if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER())) {
            LJFF(" 2.add filter AUDIO_LOUDNESS_BALANCE_FILTER ");
            nLEFilter = new NLEFilter();
            NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter = new NLESegmentAudioLoudnessBalanceFilter();
            nLESegmentAudioLoudnessBalanceFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER());
            nLESegmentAudioLoudnessBalanceFilter.setAvgLoudness(c347470Djl.LJIIIZ.doubleValue());
            nLESegmentAudioLoudnessBalanceFilter.setPeakLoudness(c347470Djl.LJIIJ.doubleValue());
            nLESegmentAudioLoudnessBalanceFilter.setTargetLoudness(c347470Djl.LJIIJJI.doubleValue());
            nLEFilter.setSegment(nLESegmentAudioLoudnessBalanceFilter);
        } else if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER())) {
            LJFF(" 2.add filter AUDIO_SAMI_FILTER ");
            nLEFilter = new NLEFilter();
            NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter();
            nLESegmentAudioSamiFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
            nLESegmentAudioSamiFilter.setSamiParam(c347470Djl.LJIILL);
            Integer num = c347470Djl.LJIILIIL;
            if (num != null) {
                iNLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get = num.intValue();
            } else {
                iNLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get = NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get();
            }
            nLESegmentAudioSamiFilter.setSamiType(iNLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceType(NLEResType.FILTER);
            nLEResourceNode.setResourceFile(c347470Djl.LJIILJJIL);
            nLESegmentAudioSamiFilter.setEffectSDKFilter(nLEResourceNode);
            nLEFilter.setSegment(nLESegmentAudioSamiFilter);
        } else if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER())) {
            LJFF(" 2.add filter AUDIO_DSP_FILTER ");
            nLEFilter = new NLEFilter();
            NLESegmentFilter nLESegmentFilter = new NLESegmentFilter();
            nLESegmentFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER());
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.setResourceType(NLEResType.FILTER);
            nLEResourceNode2.setResourceFile(c347470Djl.LJIIL);
            nLESegmentFilter.setEffectSDKFilter(nLEResourceNode2);
            nLEFilter.setSegment(nLESegmentFilter);
        } else if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER())) {
            nLEFilter = new NLEFilter();
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode3 = new NLEResourceNode();
            nLEResourceNode3.setResourceType(NLEResType.FILTER);
            nLESegmentAudioVolumeFilter.setEffectSDKFilter(nLEResourceNode3);
            Float f = c347470Djl.LJIIIIZZ;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            nLESegmentAudioVolumeFilter.setVolume(fFloatValue);
            nLEFilter.setSegment(nLESegmentAudioVolumeFilter);
        } else {
            LJFF(" 2.add filter AUDIO_COMMON_FILTER ");
            nLEFilter = new NLEFilter();
            NLESegmentFilter nLESegmentFilter2 = new NLESegmentFilter();
            nLESegmentFilter2.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER());
            NLEResourceNode nLEResourceNode4 = new NLEResourceNode();
            if (C1452960nug.LJIIIZ) {
                try {
                    strLIZ = C0FGD.LIZ(c347470Djl.LJI, c347470Djl.LJII);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C2219091BtD.LIZLLL().LIZIZ(th);
                    strLIZ = "";
                }
                nLEResourceNode4.setExtra("biz_res_id", strLIZ);
            }
            nLEResourceNode4.setResourceType(NLEResType.FILTER);
            nLEResourceNode4.setResourceFile(c347470Djl.LIZLLL);
            nLESegmentFilter2.setEffectSDKFilter(nLEResourceNode4);
            nLEFilter.setSegment(nLESegmentFilter2);
        }
        Long l = c347470Djl.LJ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        nLEFilter.setStartTime(jLongValue * 1000);
        Long l2 = c347470Djl.LJFF;
        long jLongValue2 = -2;
        if (l2 != null && l2.longValue() != -2) {
            jLongValue2 = c347470Djl.LJFF.longValue() * 1000;
        }
        nLEFilter.setEndTime(jLongValue2);
        LJFF(" 3.add filter startTime:" + jLongValue + " endTime:" + jLongValue2 + ' ');
        nLETrack.addFilter(nLEFilter);
        awS371S0200000_5.invoke(nLEFilter);
    }

    public C347460Djk(String str, C347470Djl c347470Djl) {
        this.LIZIZ = str;
        this.LIZJ = c347470Djl;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c347470Djl);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }
}
