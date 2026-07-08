package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0ot1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1490370ot1 {
    public final int LIZ;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZ));
    }

    public C1490370ot1(int i) {
        this.LIZ = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1490370ot1.class == obj.getClass() && this.LIZ == ((C1490370ot1) obj).LIZ) {
            return true;
        }
        return false;
    }
}
