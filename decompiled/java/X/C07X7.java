package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07X7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07X7 extends C07X8 {
    public final List<Aweme> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07X7) && Intrinsics.LJFF(this.LIZ, ((C07X7) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanSpotlightedRespSuccess(awemeList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C07X7(List<? extends Aweme> list) {
        this.LIZ = list;
    }
}
