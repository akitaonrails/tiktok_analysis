package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.AIGCWorkflowNodeConfig;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552810LmB {
    public final Class<? extends Serializable> LIZ;
    public final InterfaceC1631620sYq<String, Serializable, AIGCWorkflowNodeConfig, C552890LmJ<?, ?, ?, ?>> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C552810LmB)) {
            return false;
        }
        C552810LmB c552810LmB = (C552810LmB) obj;
        return Intrinsics.LJFF(this.LIZ, c552810LmB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c552810LmB.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpecProvider(cfgClass=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", createSpec=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C552810LmB(Class<? extends Serializable> cls, InterfaceC1631620sYq<? super String, ? super Serializable, ? super AIGCWorkflowNodeConfig, ? extends C552890LmJ<?, ?, ?, ?>> interfaceC1631620sYq) {
        this.LIZ = cls;
        this.LIZIZ = interfaceC1631620sYq;
    }
}
