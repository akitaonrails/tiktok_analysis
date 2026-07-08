package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349880Dne {
    public static final List<NLETrack> LIZ(NLEModel nLEModel, EnumC1461710o8n enumC1461710o8n) {
        VecNLETrackSPtr tracks;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (EnumC1461710o8n.MUSIC == enumC1461710o8n) {
                    if ((nLETrack2.getEnable() && C351220Dpo.LLILLL(nLETrack2)) || C351220Dpo.LLJILLL(nLETrack2)) {
                        arrayList.add(nLETrack);
                    }
                } else if (EnumC1461710o8n.VIDEO_VOICE == enumC1461710o8n) {
                    if (nLETrack2.getEnable() && nLETrack2.getTrackType() == NLETrackType.VIDEO) {
                        arrayList.add(nLETrack);
                    }
                } else if (EnumC1461710o8n.RECORDING == enumC1461710o8n && nLETrack2.getEnable() && (C351220Dpo.LLILL(nLETrack2) || Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB"))) {
                    arrayList.add(nLETrack);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final long LIZJ(long j, NLETrackSlot nLETrackSlot) {
        long startTime = nLETrackSlot.getStartTime();
        long measuredEndTime = nLETrackSlot.getMeasuredEndTime();
        boolean z = false;
        if (startTime <= j) {
            if (j <= measuredEndTime) {
                z = true;
            }
            if (z) {
                return 0L;
            }
            if (startTime <= j) {
                if (j <= measuredEndTime) {
                    return 0L;
                }
                return j - measuredEndTime;
            }
        }
        return startTime - j;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.lang.Long> LIZIZ(com.bytedance.ies.nle.editor_jni.NLEModel r11, final long r12, X.EnumC1461710o8n r14) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349880Dne.LIZIZ(com.bytedance.ies.nle.editor_jni.NLEModel, long, X.0o8n):kotlin.Pair");
    }
}
