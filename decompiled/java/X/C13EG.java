package X;

/* JADX INFO: renamed from: X.13EG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EG {
    public static final C13EG LIZLLL = new C13EG(C13EF.LIZ, C13EE.LIZIZ);
    public final boolean LIZ = false;
    public final C13EF LIZIZ;
    public final C13EE LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.LIZ);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        C13EF.LIZ("        ", sb);
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        C13EE.LIZ("        ", sb);
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }

    public C13EG(C13EF c13ef, C13EE c13ee) {
        this.LIZIZ = c13ef;
        this.LIZJ = c13ee;
    }
}
