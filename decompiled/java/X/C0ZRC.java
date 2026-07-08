package X;

import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRC implements C0ZRE {
    public final IMVoiceTranscribeModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZRC) && Intrinsics.LJFF(this.LIZ, ((C0ZRC) obj).LIZ);
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

    public C0ZRC(IMVoiceTranscribeModel iMVoiceTranscribeModel) {
        this.LIZ = iMVoiceTranscribeModel;
    }
}
