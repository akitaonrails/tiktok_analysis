package X;

/* JADX INFO: renamed from: X.0YAA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAA {
    public static String[] LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create index if not exists msg_ky_id_index on message_kv(");
        sbLIZ.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
        sbLIZ.append(')');
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("create index if not exists msg_ky_key_index on message_kv(");
        EnumC869730Y9z enumC869730Y9z = EnumC869730Y9z.COLUMN_KEY;
        sbLIZ2.append(enumC869730Y9z.getKey());
        sbLIZ2.append(')');
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("create index if not exists msg_kv_key_value_index on message_kv(");
        sbLIZ3.append(enumC869730Y9z.getKey());
        sbLIZ3.append(", ");
        sbLIZ3.append(EnumC869730Y9z.COLUMN_VALUE.getKey());
        sbLIZ3.append(')');
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("create index if not exists msg_kv_key_num_value_index on message_kv(");
        sbLIZ4.append(enumC869730Y9z.getKey());
        sbLIZ4.append(", ");
        sbLIZ4.append(EnumC869730Y9z.COLUMN_NUM_VALUE.getKey());
        sbLIZ4.append(')');
        return new String[]{C2188811AlT.LIZIZ(sbLIZ), C2188811AlT.LIZIZ(sbLIZ2), C2188811AlT.LIZIZ(sbLIZ3), C2188811AlT.LIZIZ(sbLIZ4)};
    }

    public static String LIZ() {
        StringBuilder sb = new StringBuilder("create table if not exists message_kv(");
        for (EnumC869730Y9z enumC869730Y9z : EnumC869730Y9z.values()) {
            sb.append(enumC869730Y9z.getKey());
            sb.append(" ");
            sb.append(enumC869730Y9z.getType());
            sb.append(",");
        }
        sb.append("primary key(");
        sb.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
        sb.append(",");
        sb.append(EnumC869730Y9z.COLUMN_KEY.getKey());
        sb.append("));");
        return sb.toString();
    }
}
