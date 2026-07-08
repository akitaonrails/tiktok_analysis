package X;

import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205004t implements IAudioParams {
    public C0205004t() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0205004t)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTSAudioParams(reservedData=");
        sbLIZ.append((String) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
