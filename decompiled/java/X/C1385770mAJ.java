package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0mAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385770mAJ {
    public static final double LIZ(long j) {
        return ((j >>> 11) * ((double) SpeechEngineDefines.ASR_WORK_MODE_OFFLINE)) + (j & 2047);
    }

    public static final String LIZIZ(int i, long j) {
        if (j >= 0) {
            CharsKt__CharJVMKt.checkRadix(i);
            return Long.toString(j, i);
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        CharsKt__CharJVMKt.checkRadix(i);
        sbLIZ.append(Long.toString(j3, i));
        CharsKt__CharJVMKt.checkRadix(i);
        sbLIZ.append(Long.toString(j4, i));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
