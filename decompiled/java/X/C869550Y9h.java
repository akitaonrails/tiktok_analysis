package X;

/* JADX INFO: renamed from: X.0Y9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869550Y9h {
    public static final /* synthetic */ C869550Y9h LIZ = new C869550Y9h();

    public static String LIZ() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS pending_message_body (");
        for (EnumC869540Y9g enumC869540Y9g : EnumC869540Y9g.values()) {
            sb.append(enumC869540Y9g.key);
            sb.append(" ");
            sb.append(enumC869540Y9g.type);
            sb.append(",");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(sb.substring(0, sb.length() - 1));
        sbLIZ.append(");");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
