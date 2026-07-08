package X;

import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotResultComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901520ZYg implements C0ZQ8 {
    public final List<AIGroupShotResultComponent> LIZ;
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C901520ZYg)) {
            return false;
        }
        C901520ZYg c901520ZYg = (C901520ZYg) obj;
        return Intrinsics.LJFF(this.LIZ, c901520ZYg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c901520ZYg.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FinishStyleData(results=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playPhotoswapConfetti=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C901520ZYg(List list, AwS558S0100000_14 awS558S0100000_14) {
        this.LIZ = list;
        this.LIZIZ = awS558S0100000_14;
    }
}
