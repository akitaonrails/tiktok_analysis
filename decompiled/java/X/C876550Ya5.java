package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ya5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876550Ya5 {
    public static final C876630YaD LJI = new C876630YaD();
    public final EnumC876650YaF LIZ;
    public final EnumC876540Ya4 LIZIZ;
    public final C869590Y9l LIZJ;
    public final C0Y8T LIZLLL;
    public final String LJ;
    public final C0YT8 LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C876550Ya5)) {
            return false;
        }
        C876550Ya5 c876550Ya5 = (C876550Ya5) obj;
        return this.LIZ == c876550Ya5.LIZ && this.LIZIZ == c876550Ya5.LIZIZ && Intrinsics.LJFF(this.LIZJ, c876550Ya5.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c876550Ya5.LIZLLL) && Intrinsics.LJFF(this.LJ, c876550Ya5.LJ) && Intrinsics.LJFF(this.LJFF, c876550Ya5.LJFF) && Intrinsics.LJFF(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMInnerPushUnit(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", conversation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", property=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", tip=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        String conversationId;
        String str = this.LJ;
        if (str != null) {
            return str;
        }
        C0Y8T c0y8t = this.LIZLLL;
        if (c0y8t != null && (conversationId = c0y8t.getConversationId()) != null) {
            return conversationId;
        }
        C869590Y9l c869590Y9l = this.LIZJ;
        if (c869590Y9l != null) {
            return c869590Y9l.getConversationId();
        }
        return null;
    }

    public C876550Ya5(EnumC876650YaF enumC876650YaF, EnumC876540Ya4 enumC876540Ya4, C869590Y9l c869590Y9l, C0Y8T c0y8t, String str, C0YT8 c0yt8, int i) {
        enumC876540Ya4 = (i & 2) != 0 ? EnumC876540Ya4.UNKNOWN : enumC876540Ya4;
        c869590Y9l = (i & 4) != 0 ? null : c869590Y9l;
        c0y8t = (i & 8) != 0 ? null : c0y8t;
        str = (i & 16) != 0 ? null : str;
        c0yt8 = (i & 32) != 0 ? null : c0yt8;
        this.LIZ = enumC876650YaF;
        this.LIZIZ = enumC876540Ya4;
        this.LIZJ = c869590Y9l;
        this.LIZLLL = c0y8t;
        this.LJ = str;
        this.LJFF = c0yt8;
    }
}
