package X;

import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.095T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C095T extends C096H {
    public final List<MetaExt> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C095T) && Intrinsics.LJFF(this.LIZ, ((C095T) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnCompressDone(compressList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C095T(List<MetaExt> list) {
        this.LIZ = list;
    }
}
