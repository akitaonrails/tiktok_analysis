package X;

import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00GY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GY implements InterfaceC458490HyR {
    public final IMVoiceTranscribeModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00GY) && Intrinsics.LJFF(this.LIZ, ((C00GY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(transcriptModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00GY(IMVoiceTranscribeModel iMVoiceTranscribeModel) {
        this.LIZ = iMVoiceTranscribeModel;
    }
}
