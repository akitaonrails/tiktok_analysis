package X;

import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JBZ implements InterfaceC0148002o {
    public final AbstractC1623806Xk<TTSVoiceDetailsResponse> LL;

    public C0JBZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JBZ) && Intrinsics.LJFF(this.LL, ((C0JBZ) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTSVoiceState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0JBZ(int i) {
        this(C491101vh.LIZ);
    }

    public C0JBZ(AbstractC1623806Xk<TTSVoiceDetailsResponse> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
