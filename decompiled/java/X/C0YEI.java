package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0YEI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YEI implements InterfaceC869500Y9c {
    public static volatile long LIZLLL;
    public C0YEV LIZ;
    public final C0YEV LIZIZ;
    public final C0YEM LIZJ;

    @Override // X.InterfaceC869500Y9c
    public final String LJIIJ() {
        return this.LIZIZ.getString(LJJLJLI("key_ws_region"), "");
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJIIZILJ() {
        return this.LIZIZ.getString(LJJLJLI("last_reset_cmd_reset_reason"), "");
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJI() {
        return this.LIZIZ.LIZIZ(0L, LJJLJLI("last_reset_version"));
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJJJJJL() {
        return this.LIZIZ.getString(LJJLJLI("key_region"), "");
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJJZ() {
        return this.LIZIZ.LIZIZ(0L, LJJLJLI("last_reset_cmd_msg_id"));
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJLI() {
        return this.LIZIZ.LIZIZ(0L, LJJLJLI("target_reset_version"));
    }

    @Override // X.InterfaceC869500Y9c
    public final int LJJLIIIJ() {
        return this.LIZIZ.getInt(LJJLJLI("last_reset_cmd_reset_type"));
    }

    public final String LJJLIIIJLLLLLLLZ() {
        this.LIZJ.LJ().LJ().LIZIZ();
        if (!this.LIZJ.LJ().LJ().LIZJ()) {
            return "imsdk_0";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("imsdk_0");
        sbLIZ.append("_biz_");
        sbLIZ.append(this.LIZJ.getBizId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0YEV LJJLIIJ() {
        long uid = this.LIZJ.getUid();
        if (this.LIZ == null || uid != LIZLLL) {
            synchronized (this) {
                try {
                    if (this.LIZ == null || uid != LIZLLL) {
                        C0YEV c0yevLIZJ = this.LIZJ.LJ().LIZIZ().LIZJ(LJJLIL());
                        LIZLLL = uid;
                        if (c0yevLIZJ != null) {
                            this.LIZ = c0yevLIZJ;
                        } else {
                            this.LIZ = new C0YZ0(this.LIZJ, LJJLIL());
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }

    public final String LJJLIL() {
        String strLIZIZ;
        if (this.LIZJ.LJ().LJ().LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("imsdk_");
            sbLIZ.append(this.LIZJ.getUid());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("imsdk_sub_");
            sbLIZ2.append(this.LIZJ.getUid());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LIZJ.LJ().LJ().LIZIZ();
        if (!this.LIZJ.LJ().LJ().LIZJ()) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append("_biz_");
        sbLIZ3.append(this.LIZJ.getBizId());
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    @Override // X.InterfaceC869500Y9c
    public final void clearAll() {
        this.LIZJ.LIZLLL().LJIIJJI("SPUtils clear all");
        LJJLIIJ().clearAll();
    }

    @Override // X.InterfaceC869500Y9c
    public final boolean LJ() {
        return LJJLIIJ().getBoolean("key_has_pending_message_body");
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIJJLI() {
        LJJLIIJ().putBoolean(LJJLJLI("allow_conversation_pagination"), true);
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJJIIJ() {
        return LJJLIIJ().getString(LJJLJLI("wait_del_message"), "");
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJIZ() {
        LJJLIIJ().putBoolean(LJJLJLI("msg_flag_bits_updated"), true);
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJJJ() {
        return LJJLIIJ().getString(LJJLJLI("wait_del_conversation"), "");
    }

    @Override // X.InterfaceC869500Y9c
    public final int LJJJJZ() {
        return LJJLIIJ().getInt(LJJLJLI("segment_recovery_version"));
    }

    @Override // X.InterfaceC869500Y9c
    public final boolean LJJJLIIL() {
        return LJJLIIJ().getBoolean(LJJLJLI("allow_conversation_pagination"));
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJJJLL() {
        return LJJLIIJ().getString(LJJLJLI("prefetch_conv_short_ids_cache"), "{ null }");
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJLIIIJILLIZJL() {
        return LJJLIIJ().LIZIZ(0L, LJJLJLI("last_status_message_check_time"));
    }

    @Override // X.InterfaceC869500Y9c
    public final boolean LJJLIIIJLJLI() {
        return LJJLIIJ().getBoolean(LJJLJLI("msg_flag_bits_updated"));
    }

    public C0YEI(C0YEM c0yem) {
        this.LIZJ = c0yem;
        C0YEV c0yevLIZJ = c0yem.LJ().LIZIZ().LIZJ(LJJLIIIJLLLLLLLZ());
        if (c0yevLIZJ != null) {
            this.LIZIZ = c0yevLIZJ;
        } else {
            this.LIZIZ = new C0YZ0(c0yem, LJJLIIIJLLLLLLLZ());
        }
    }

    @Override // X.InterfaceC869500Y9c
    public final int LIZ(String str) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_member_join_state");
        return c0yevLJJLIIJ.getInt(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC869500Y9c
    public final int LIZIZ(String str) {
        C0YEV c0yev = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KEYSTORE_FAILURE_COUNT_");
        sbLIZ.append(str);
        return c0yev.getInt(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LIZLLL(boolean z) {
        LJJLIIJ().putBoolean("key_has_pending_message_body", z);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJI(String str) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deferred_migration_completed_");
        sbLIZ.append(str);
        c0yevLJJLIIJ.putBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIIIIZZ(long j) {
        this.LIZIZ.LIZ(Long.valueOf(j), LJJLJLI("target_reset_version"));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIIIZ(long j) {
        LJJLIIJ().LIZ(Long.valueOf(j), LJJLJLI("last_status_message_check_time"));
    }

    @Override // X.InterfaceC869500Y9c
    public final boolean LJIIJJI(int i) {
        return LJJLIIJ().getBoolean(LJJLJ(i, "im_init"));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIIL(String str) {
        LJJLIIJ().putString(LJJLJLI("wait_del_conversation"), str);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIILJJIL(int i) {
        LJJLIIJ().putBoolean(LJJLJ(i, "im_init"), true);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIILL(String str) {
        LJJLIIJ().putString(LJJLJLI("prefetch_conv_short_ids_cache"), str);
    }

    @Override // X.InterfaceC869500Y9c
    public final boolean LJIILLIIL(String str) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deferred_migration_completed_");
        sbLIZ.append(str);
        return c0yevLJJLIIJ.getBoolean(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIJ(int i) {
        this.LIZIZ.putInt(LJJLJLI("last_reset_cmd_reset_type"), i);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIJJ(int i) {
        LJJLIIJ().putInt(LJJLJLI("segment_recovery_version"), i);
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJIL(int i) {
        return LJJLIIJ().getString(LJJLJ(i, "key_new_msg_notify_snapshot"), "{ null }");
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJJ(int i) {
        return LJJLIIJ().getString(LJJLJ(i, "key_init_handler_snapshot"), "{ null }");
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJII(long j) {
        this.LIZIZ.LIZ(Long.valueOf(j), LJJLJLI("last_reset_cmd_msg_id"));
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJIII(int i) {
        return LJJLIIJ().LIZIZ(0L, LJJLJ(i, "key_next_passive_pull_time"));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJIIZI(String str) {
        this.LIZIZ.putString(LJJLJLI("last_reset_cmd_reset_reason"), str);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJIJ(long j) {
        this.LIZIZ.LIZ(Long.valueOf(j), LJJLJLI("last_reset_version"));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJIJIIJI(String str) {
        this.LIZIZ.putString(LJJLJLI("key_ws_region"), str);
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJIJIIJIL(String str) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append("key_last_message_check_time");
        return c0yevLJJLIIJ.LIZIZ(0L, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJIJIL(String str) {
        LJJLIIJ().putString(LJJLJLI("wait_del_message"), str);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJIJLIJ(String str) {
        C0YEV c0yev = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("encryption_should_force_default_password_");
        sbLIZ.append(str);
        c0yev.putBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJIL(int i) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_fps_tracking_time_");
        sbLIZ.append(i);
        return c0yevLJJLIIJ.LIZIZ(0L, LJJLJLI(C2188811AlT.LIZIZ(sbLIZ)));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJJI(String str) {
        this.LIZIZ.putString(LJJLJLI("key_region"), str);
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJJJJ(String str) {
        C0YEV c0yev = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user_db_key_");
        sbLIZ.append(str);
        return c0yev.getString(C2188811AlT.LIZIZ(sbLIZ), "");
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJJJLL(int i) {
        return LJJLIIJ().LIZIZ(0L, LJJLJ(i, "im_init_page_cursor"));
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJL(int i) {
        return LJJLIIJ().LIZIZ(0L, LJJLJ(i, "key_last_conversation_check_time"));
    }

    @Override // X.InterfaceC869500Y9c
    public final boolean LJJLIIIJJI(String str) {
        C0YEV c0yev = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("encryption_should_force_default_password_");
        sbLIZ.append(str);
        return c0yev.getBoolean(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJLIIIJL(List<Integer> list) {
        long jMin = Long.MAX_VALUE;
        for (Integer num : (ArrayList) list) {
            C0YEV c0yevLJJLIIJ = LJJLIIJ();
            int iIntValue = num.intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_last_pull_time_");
            sbLIZ.append(iIntValue);
            long jLIZIZ = c0yevLJJLIIJ.LIZIZ(0L, LJJLJLI(C2188811AlT.LIZIZ(sbLIZ)));
            if (jLIZIZ > 0) {
                jMin = Math.min(jMin, jLIZIZ);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return 0L;
        }
        return jMin;
    }

    public final String LJJLJLI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ.getUid());
        sbLIZ.append("_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJJZ(boolean z) {
        this.LIZJ.LIZLLL().LJIIJJI("SPUtils reset");
        int i = LJJLIIJ().getInt(LJJLJLI("im_reset_count"));
        if (z || SystemClock.uptimeMillis() - LJJLIIJ().LIZIZ(0L, LJJLJLI("im_reset_time")) > 3600000) {
            clearAll();
            LJJLIIJ().LIZ(Long.valueOf(SystemClock.uptimeMillis()), LJJLJLI("im_reset_time"));
        }
        LJJLIIJ().putInt(LJJLJLI("im_reset_count"), i + 1);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LIZJ(int i, String str) {
        C0YEV c0yev = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KEYSTORE_FAILURE_COUNT_");
        sbLIZ.append(str);
        c0yev.putInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJII(int i, String str) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_member_join_state");
        c0yevLJJLIIJ.putInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIILIIL(String str, String str2) {
        C0YEV c0yev = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user_db_key_");
        sbLIZ.append(str);
        c0yev.putString(C2188811AlT.LIZIZ(sbLIZ), str2);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJIJI(int i, long j) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_last_pull_time_");
        sbLIZ.append(i);
        c0yevLJJLIIJ.LIZ(Long.valueOf(j), LJJLJLI(C2188811AlT.LIZIZ(sbLIZ)));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJIFFI(int i, String str) {
        LJJLIIJ().putString(LJJLJ(i, "key_new_msg_notify_snapshot"), str);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJIIJZLJL(int i, long j) {
        LJJLIIJ().LIZ(Long.valueOf(j), LJJLJ(i, "key_next_passive_pull_time"));
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJIIZ(int i, C0YFV c0yfv) {
        String strLJJLL = LJJLL(i, c0yfv, "status_message_check_cursor");
        long jLIZIZ = LJJLIIJ().LIZIZ(-1L, strLJJLL);
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPUtils getStatusMessageCursor, key:");
        sbLIZ.append(strLJJLL);
        sbLIZ.append(", cursor:");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append(", inbox:");
        sbLIZ.append(i);
        sbLIZ.append(", uid:");
        sbLIZ.append(LIZLLL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        return jLIZIZ;
    }

    @Override // X.InterfaceC869500Y9c
    public final String LJJIJL(int i, C0YFV c0yfv) {
        return LJJLIIJ().getString(LJJLL(i, c0yfv, "key_pull_msg_by_user_snapshot"), "{ null }");
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJJJI(int i, long j) {
        LJJLIIJ().LIZ(Long.valueOf(j), LJJLJ(i, "key_last_conversation_check_time"));
    }

    @Override // X.InterfaceC869500Y9c
    public final Pair<Long, Integer> LJJJJIZL(int i, C0YFV c0yfv) {
        String strLJJLL = LJJLL(i, c0yfv, "error_cursor");
        String string = LJJLIIJ().getString(strLJJLL, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] strArrSplit = string.split(":");
        if (strArrSplit.length != 2) {
            return null;
        }
        int i2 = 0;
        long jLJFF = C870740YDw.LJFF(this.LIZJ.LIZLLL(), strArrSplit[0]);
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        String str = strArrSplit[1];
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = CastIntegerProtector.parseInt(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c868780Y6iLIZLLL.LJIIIZ(C870740YDw.LIZ, e);
            }
        }
        C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPUtils getErrorCursor, key:");
        sbLIZ.append(strLJJLL);
        sbLIZ.append(", cursor:");
        sbLIZ.append(jLJFF);
        sbLIZ.append(", count:");
        sbLIZ.append(i2);
        c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        return new Pair<>(Long.valueOf(jLJFF), Integer.valueOf(i2));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJJJJ(long j, String str) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append("key_last_message_check_time");
        c0yevLJJLIIJ.LIZ(Long.valueOf(j), C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJJJL(int i, String str) {
        LJJLIIJ().putString(LJJLJ(i, "key_init_handler_snapshot"), str);
    }

    @Override // X.InterfaceC869500Y9c
    public final long LJJJJLI(int i, C0YFV c0yfv) {
        String strLJJLL = LJJLL(i, c0yfv, "msg_by_user_cursor");
        long jLIZIZ = LJJLIIJ().LIZIZ(-1L, strLJJLL);
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPUtils getCursor, key:");
        sbLIZ.append(strLJJLL);
        sbLIZ.append(", cursor:");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append(", inbox:");
        sbLIZ.append(i);
        sbLIZ.append(", uid:");
        sbLIZ.append(LIZLLL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        return jLIZIZ;
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJJLZIJ(int i, long j) {
        LJJLIIJ().LIZ(Long.valueOf(j), LJJLJ(i, "im_init_page_cursor"));
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJLIIIJJIZ(int i, long j) {
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_fps_tracking_time_");
        sbLIZ.append(i);
        c0yevLJJLIIJ.LIZ(Long.valueOf(j), LJJLJLI(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public final String LJJLJ(int i, String str) {
        if (i == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZJ.getUid());
            sbLIZ.append("_");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZJ.getUid());
        sbLIZ2.append("_");
        sbLIZ2.append(str);
        sbLIZ2.append("_");
        sbLIZ2.append(i);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJJIL(int i, long j, C0YFV c0yfv) {
        String strLJJLL = LJJLL(i, c0yfv, "msg_by_user_cursor");
        LJJLIIJ().LIZ(Long.valueOf(j), strLJJLL);
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPUtils setCursor, key:");
        sbLIZ.append(strLJJLL);
        sbLIZ.append(", cursor:");
        sbLIZ.append(j);
        sbLIZ.append(", inbox:");
        sbLIZ.append(i);
        sbLIZ.append(", uid:");
        sbLIZ.append(LIZLLL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (j < 0) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SPUtils setCursor=");
            sbLIZ2.append(j);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c868780Y6iLIZLLL2.LIZ.LJ("imsdk", c868780Y6iLIZLLL2.LIZ(strLIZIZ), new Throwable());
        }
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJJJZI(int i, long j, C0YFV c0yfv) {
        String strLJJLL = LJJLL(i, c0yfv, "status_message_check_cursor");
        LJJLIIJ().LIZ(Long.valueOf(j), strLJJLL);
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPUtils setStatusMessageCheckCursor, key:");
        sbLIZ.append(strLJJLL);
        sbLIZ.append(", cursor:");
        sbLIZ.append(j);
        sbLIZ.append(", inbox:");
        sbLIZ.append(i);
        sbLIZ.append(", uid:");
        sbLIZ.append(LIZLLL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (j < 0) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SPUtils setStatusMessageCheckCursor=");
            sbLIZ2.append(j);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c868780Y6iLIZLLL2.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "imsdk", strLIZIZ, 4);
        }
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJJLIIIIJ(int i, C0YFV c0yfv, String str) {
        LJJLIIJ().putString(LJJLL(i, c0yfv, "key_pull_msg_by_user_snapshot"), str);
    }

    public final String LJJLL(int i, C0YFV c0yfv, String str) {
        String strLJJLJ = LJJLJ(i, str);
        if (c0yfv == C0YFV.CURSOR_TYPE_USER_MSG_CHAIN) {
            return strLJJLJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJJLJ);
        sbLIZ.append("_c_");
        sbLIZ.append(c0yfv.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC869500Y9c
    public final void LJFF(int i, C0YFV c0yfv, long j, int i2) {
        String strLJJLL = LJJLL(i, c0yfv, "error_cursor");
        C0YEV c0yevLJJLIIJ = LJJLIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append(":");
        sbLIZ.append(i2);
        c0yevLJJLIIJ.putString(strLJJLL, C2188811AlT.LIZIZ(sbLIZ));
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SPUtils setErrorCursor, key:");
        sbLIZ2.append(strLJJLL);
        sbLIZ2.append(", cursor:");
        sbLIZ2.append(j);
        sbLIZ2.append(", count:");
        sbLIZ2.append(i2);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
