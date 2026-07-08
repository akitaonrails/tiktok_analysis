package X;

/* JADX INFO: renamed from: X.0YAU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAU {
    public static String LIZ() {
        String strLIZIZ = "create table if not exists conversation_kv (";
        for (C0YAW c0yaw : C0YAW.values()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(c0yaw.getKey());
            sbLIZ.append(' ');
            sbLIZ.append(c0yaw.getType());
            sbLIZ.append(',');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("primary key(");
        sbLIZ2.append(C0YAW.COLUMN_CONV_ID.getKey());
        sbLIZ2.append(", ");
        sbLIZ2.append(C0YAW.COLUMN_KEY.getKey());
        sbLIZ2.append("));");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
