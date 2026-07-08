package X;

import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487800JBa implements InterfaceC0148002o {
    public final AbstractC1623806Xk<VoiceConversionDetailsResponse> LL;

    public C487800JBa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C487800JBa) && Intrinsics.LJFF(this.LL, ((C487800JBa) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceConversionState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C487800JBa(int i) {
        this(C491101vh.LIZ);
    }

    public C487800JBa(AbstractC1623806Xk<VoiceConversionDetailsResponse> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
