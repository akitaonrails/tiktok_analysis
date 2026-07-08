package X;

/* JADX INFO: renamed from: X.18De, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21248018De {
    public static final void LIZJ(String str, StringBuilder sb) {
        if (sb.length() > 0 && C13LN.LJLLL(sb) != '{') {
            sb.append(',');
        }
        sb.append("\"");
        sb.append(str);
        sb.append("\":");
    }

    public static final void LIZ(StringBuilder sb, String str, Boolean bool) {
        if (bool != null) {
            LIZJ(str, sb);
            sb.append(bool.booleanValue());
        }
    }

    public static final void LIZIZ(StringBuilder sb, String str, Integer num) {
        if (num != null) {
            LIZJ(str, sb);
            sb.append(num.intValue());
        }
    }

    public static final void LIZLLL(StringBuilder sb, String str, Long l) {
        if (l != null) {
            LIZJ(str, sb);
            sb.append(l.longValue());
        }
    }

    public static final void LJ(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            LIZJ(str, sb);
            sb.append('\"');
            sb.append(str2);
            sb.append('\"');
        }
    }
}
