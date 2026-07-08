package X;

import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.CatchBeansDropBeanInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982880bgU extends AbstractC982800bgM {
    public static final /* synthetic */ int LJI = 0;
    public final List<CatchBeansDropBeanInfo> LJFF;

    public C982880bgU() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C982880bgU) && Intrinsics.LJFF(this.LJFF, ((C982880bgU) obj).LJFF);
    }

    public final int hashCode() {
        return this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CatchBeansArtifactMessage(anchorInfos=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982880bgU(C983540bhY c983540bhY) {
        this.LJFF = c983540bhY.LJFF;
    }
}
