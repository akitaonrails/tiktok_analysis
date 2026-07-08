package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0JLD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLD extends C0JLF {
    public final SMBPreviewResponse.ResponseData LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JLD) && Intrinsics.LJFF(this.LIZ, ((C0JLD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadSuccess(smbPreviewResponse=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JLD(SMBPreviewResponse.ResponseData responseData) {
        this.LIZ = responseData;
    }
}
