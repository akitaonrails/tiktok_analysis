package X;

import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C204600qa implements InterfaceC204700qb {
    public final Map<String, n> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C204600qa) && Intrinsics.LJFF(this.LIZ, ((C204600qa) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameTaskRawJsonData(taskRawJson=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C204600qa() {
        this(new LinkedHashMap());
    }

    public C204600qa(Map<String, n> map) {
        this.LIZ = map;
    }
}
