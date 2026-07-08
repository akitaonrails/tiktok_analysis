package X;

import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRD implements InterfaceC899750ZRl {
    public final IMVoiceTranscribeModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZRD) && Intrinsics.LJFF(this.LIZ, ((C0ZRD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Transcribed(transcriptModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZRD(IMVoiceTranscribeModel iMVoiceTranscribeModel) {
        this.LIZ = iMVoiceTranscribeModel;
    }
}
