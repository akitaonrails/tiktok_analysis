package X;

import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0utX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721330utX {
    public final Set<EnumC1721320utW> LIZ;
    public final Map<EnumC1721320utW, Pattern> LIZIZ;

    public C1721330utX() {
        this((Set) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721330utX)) {
            return false;
        }
        C1721330utX c1721330utX = (C1721330utX) obj;
        return Intrinsics.LJFF(this.LIZ, c1721330utX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1721330utX.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarkdownParseConfig(enabledTags=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", matchers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1721330utX(Set set, int i) {
        Map<EnumC1721320utW, Pattern> map;
        set = (i & 1) != 0 ? C13LQ.LJLIIL(new EnumC1721320utW[]{EnumC1721320utW.BOLD, EnumC1721320utW.LINK}) : set;
        if ((i & 2) != 0) {
            map = C1721340utY.LJ;
        } else {
            map = null;
        }
        this((Set<? extends EnumC1721320utW>) set, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1721330utX(Set<? extends EnumC1721320utW> set, Map<EnumC1721320utW, Pattern> map) {
        this.LIZ = set;
        this.LIZIZ = map;
    }
}
