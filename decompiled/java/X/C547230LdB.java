package X;

import com.bytedance.aigc.proto.Level;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547230LdB {
    public final Level LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547230LdB)) {
            return false;
        }
        C547230LdB c547230LdB = (C547230LdB) obj;
        return this.LIZ == c547230LdB.LIZ && Intrinsics.LJFF(this.LIZIZ, c547230LdB.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AggregatedEvent(level=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", jsonString=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C547230LdB(Level level, String str) {
        this.LIZ = level;
        this.LIZIZ = str;
    }
}
