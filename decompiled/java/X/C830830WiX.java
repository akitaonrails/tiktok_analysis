package X;

import com.tiktok.ttm.TTMParamData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830830WiX {
    public final AbstractC2213701BkW LIZ;
    public final TTMParamData LIZIZ;
    public final AtomicBoolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C830830WiX)) {
            return false;
        }
        C830830WiX c830830WiX = (C830830WiX) obj;
        return Intrinsics.LJFF(this.LIZ, c830830WiX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c830830WiX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c830830WiX.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTMStrategyTask(ttmStrategy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ttmParamData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isRunning=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C830830WiX(AbstractC2213701BkW abstractC2213701BkW, TTMParamData tTMParamData) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LIZ = abstractC2213701BkW;
        this.LIZIZ = tTMParamData;
        this.LIZJ = atomicBoolean;
    }
}
