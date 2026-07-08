package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1420120n3i {
    public final String LIZ;
    public final List<AbstractC1420120n3i> LIZIZ = new ArrayList();
    public final List<AbstractC1420120n3i> LIZJ = new ArrayList();
    public final long LIZLLL = System.currentTimeMillis();
    public final long LJ = 30000;

    public abstract Object LIZIZ(Map<String, ? extends AbstractC20178613xQ> map, InterfaceC1364105Vn<? super AbstractC20178613xQ> interfaceC1364105Vn);

    public String LIZJ() {
        return "BaseTask";
    }

    static {
        new AtomicLong(0L);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deps=");
        sbLIZ.append(((ArrayList) this.LIZIZ).size());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1420120n3i(String str) {
        this.LIZ = str;
    }

    public final void LIZ(AbstractC1420120n3i abstractC1420120n3i) {
        ((ArrayList) this.LIZIZ).add(abstractC1420120n3i);
        ((ArrayList) abstractC1420120n3i.LIZJ).add(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1420120n3i)) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZ, ((AbstractC1420120n3i) obj).LIZ);
    }
}
