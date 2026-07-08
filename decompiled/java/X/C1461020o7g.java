package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0o7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461020o7g {
    public static final C1461020o7g LIZ = new C1461020o7g();

    public static NLEError LIZLLL(int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    return NLEError.FAILED;
                }
                return NLEError.SUCCESS;
            }
            return NLEError.FAILED;
        }
        return NLEError.PARAM_INVALID;
    }

    public static NLEError LIZJ(String str, NLETrack nLETrack, int i, int i2, int i3, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j = -1;
        long measuredEndTime = -1;
        for (NLETrackSlot nLETrackSlot : nLETrack.getSortedSlots()) {
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast != null) {
                arrayList.add(nLESegmentAudioDynamicCast.getResource().getResourceFile());
                if (z) {
                    arrayList2.add(-1L);
                    arrayList3.add(-1L);
                    arrayList6.add(Float.valueOf(1.0f));
                    arrayList4.add(-1L);
                    arrayList5.add(-1L);
                } else {
                    long timeClipStart = nLESegmentAudioDynamicCast.getTimeClipStart();
                    long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    arrayList2.add(Long.valueOf(timeClipStart / j2));
                    arrayList3.add(Long.valueOf(nLESegmentAudioDynamicCast.getTimeClipEnd() / j2));
                    arrayList6.add(Float.valueOf(nLETrackSlot.getSpeed()));
                    arrayList4.add(Long.valueOf(nLETrackSlot.getMeasuredStartTime() / j2));
                    arrayList5.add(Long.valueOf(nLETrackSlot.getMeasuredEndTime() / j2));
                    measuredEndTime = nLETrack.getMeasuredEndTime() / j2;
                    j = 0;
                }
            }
        }
        int iDetachAudioFromVideos = VEUtils.detachAudioFromVideos(str, (String[]) arrayList.toArray(new String[0]), C13LP.LLIIIILZ(arrayList2), C13LP.LLIIIILZ(arrayList3), C13LP.LLIIIILZ(arrayList4), C13LP.LLIIIILZ(arrayList5), j, measuredEndTime, C13LP.LLI(arrayList6), i, i2, i3, VEUtils.CompatibleMode.Skip_invalid);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        return LIZLLL(iDetachAudioFromVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.ies.nle.editor_jni.NLEError LIZ(java.lang.String r28, com.bytedance.ies.nle.editor_jni.NLEModel r29, int r30, int r31, int r32, boolean r33, X.C1461120o7q r34) {
        /*
            Method dump skipped, instruction units count: 1691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1461020o7g.LIZ(java.lang.String, com.bytedance.ies.nle.editor_jni.NLEModel, int, int, int, boolean, X.0o7q):com.bytedance.ies.nle.editor_jni.NLEError");
    }

    public static NLEError LIZIZ(C1461020o7g c1461020o7g, String str, NLEModel nLEModel, int i, int i2, int i3, boolean z, boolean z2, int i4) {
        int i5 = i3;
        boolean z3 = z2;
        if ((i4 & 64) != 0) {
            z3 = false;
        }
        c1461020o7g.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i5 == 24000) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("error_type", "detachAudio");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sampleRate=");
            sbLIZ.append(i5);
            sbLIZ.append(",bitRate=");
            sbLIZ.append(i2);
            sbLIZ.append(",channels=");
            sbLIZ.append(i);
            c2344009Gk.LJIIIIZZ("extra", C2188811AlT.LIZIZ(sbLIZ));
            C20684815ws.LJIILLIIL("voice_conversion_extra_error", c2344009Gk.LIZ);
            i5 = 44100;
        }
        ArrayList arrayList = new ArrayList();
        System.currentTimeMillis();
        System.currentTimeMillis();
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO || C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('_');
                sbLIZ2.append(nLETrack.getName());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                NLEError nLEErrorLIZJ = LIZJ(strLIZIZ, nLETrack, i, i2, i5, z3);
                int iLIZ = C2486109oh.LIZ(strLIZIZ);
                if (nLEErrorLIZJ == NLEError.SUCCESS && iLIZ == 0) {
                    arrayList.add(strLIZIZ);
                } else {
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(nLEErrorLIZJ.name());
                    if (numLJIIJJI != null) {
                        numLJIIJJI.intValue();
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("detachAudioStreamFile: detach audio from track FAILED, track id: ");
                    sbLIZ3.append(nLETrack.getUUID());
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
        }
        System.currentTimeMillis();
        NLEError nLEErrorLIZLLL = NLEError.FAILED;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (arrayList.size() > 0 && (z || arrayList.size() > 1)) {
            nLEErrorLIZLLL = LIZLLL(VEUtils.mixAudio(arrayList, str, null));
            C2486109oh.LIZ(str);
            NLEError nLEError = NLEError.SUCCESS;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("detachAudioStreamFile -> mix=true -> cost_time = ");
            sbLIZ4.append(System.currentTimeMillis() - jCurrentTimeMillis2);
            sbLIZ4.append("ms, mixResult=");
            sbLIZ4.append(nLEErrorLIZLLL);
            sbLIZ4.append(", outputAudioFile size=");
            sbLIZ4.append(C2286708xd.LJIIL(str) / ((long) 1024));
            sbLIZ4.append("kb");
            C2188811AlT.LIZIZ(sbLIZ4);
        } else {
            if (arrayList.size() > 0 && C2286708xd.LIZJ((String) ListProtector.get(arrayList, 0)) && C2286708xd.LJIIL((String) ListProtector.get(arrayList, 0)) > 0) {
                C2286708xd.LJFF((String) ListProtector.get(arrayList, 0), str);
                nLEErrorLIZLLL = NLEError.SUCCESS;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("detachAudioStreamFile -> mix=false -> cost_time = ");
            sbLIZ5.append(System.currentTimeMillis() - jCurrentTimeMillis2);
            sbLIZ5.append("ms, mixResult=");
            sbLIZ5.append(nLEErrorLIZLLL);
            sbLIZ5.append(", outputAudioFile size=");
            sbLIZ5.append(C2286708xd.LJIIL(str) / ((long) 1024));
            sbLIZ5.append("kb");
            C2188811AlT.LIZIZ(sbLIZ5);
        }
        if (!C0CHQ.LIZ().LJJIIJZLJL().LIZ()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2286708xd.LJIJ((String) it2.next());
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("music aed cost:");
        sbLIZ6.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C201955140j.LJIILIIL("VCAudioUtils", C2188811AlT.LIZIZ(sbLIZ6));
        return nLEErrorLIZLLL;
    }
}
