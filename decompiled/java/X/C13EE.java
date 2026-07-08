package X;

/* JADX INFO: renamed from: X.13EE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EE {
    public static final C13EE LIZIZ = new C13EE();
    public final boolean LIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        LIZ("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }

    public C13EE() {
        boolean z = false;
        if ("".length() == 0 && "".length() == 0) {
            z = true;
        }
        this.LIZ = z;
        if (C13EH.LIZ("")) {
            return;
        }
        C13EH.LIZ("");
    }

    public static final void LIZ(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("prefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }
}
