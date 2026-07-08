package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Y5P, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y5P {
    public final C0YEM LIZ;
    public final InterfaceC869500Y9c LIZIZ;
    public final C869650Y9r LIZJ;
    public final List<C1921507fp> LIZLLL;

    public C0Y5P(C0YEM c0yem, C0YEI c0yei, C869650Y9r c869650Y9r) {
        this.LIZ = c0yem;
        this.LIZIZ = c0yei;
        this.LIZJ = c869650Y9r;
        ArrayList arrayList = new ArrayList();
        this.LIZLLL = arrayList;
        arrayList.add(new C1921507fp("add_msg_conv_id_order_index_create_time_v1", Collections.singletonList(C869580Y9k.LJJIII()), 100));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create index if not exists msg_kv_key_value_index on message_kv(");
        EnumC869730Y9z enumC869730Y9z = EnumC869730Y9z.COLUMN_KEY;
        sbLIZ.append(enumC869730Y9z.getKey());
        sbLIZ.append(", ");
        sbLIZ.append(EnumC869730Y9z.COLUMN_VALUE.getKey());
        sbLIZ.append(')');
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("create index if not exists msg_kv_key_num_value_index on message_kv(");
        sbLIZ2.append(enumC869730Y9z.getKey());
        sbLIZ2.append(", ");
        sbLIZ2.append(EnumC869730Y9z.COLUMN_NUM_VALUE.getKey());
        sbLIZ2.append(')');
        arrayList.add(new C1921507fp("add_msg_kv_num_value_indexes_v1", C13LQ.LJJLL(new String[]{C2188811AlT.LIZIZ(sbLIZ), C2188811AlT.LIZIZ(sbLIZ2)}), 110));
    }

    public final void LIZ(long j, String str, String str2, boolean z) {
        if (!this.LIZ.LJIIZILJ().LJFF().getEventTracker().LIZJ(1.0f)) {
            return;
        }
        C0YJ9 c0yj9 = new C0YJ9(this.LIZ);
        c0yj9.LIZJ("imsdk_deferred_migration");
        c0yj9.LIZ(str, "migration_id");
        c0yj9.LIZ(Long.valueOf(SystemClock.uptimeMillis() - j), "cost_time");
        c0yj9.LIZ(Boolean.valueOf(z), "is_success");
        if (str2 != null) {
            c0yj9.LIZ(str2, "error_msg");
        }
        c0yj9.LIZLLL();
    }
}
