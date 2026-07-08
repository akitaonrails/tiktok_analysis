package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YE0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YE0 implements C0YK7 {
    public final int LIZ;
    public final C870460YCu LIZIZ;
    public final Function0<Long> LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public long LJJI;
    public long LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;

    public C0YE0() {
        throw null;
    }

    @Override // X.C0YK7
    public final void LJFF() {
        this.LJIILJJIL = true;
        this.LJIILL = false;
        if (this.LJIILIIL <= 1) {
            LJIIZILJ();
        }
    }

    @Override // X.C0YK7
    public final int LIZ() {
        return this.LJ + this.LIZLLL;
    }

    @Override // X.C0YK7
    public final void LJ() {
        this.LJIJJ += this.LIZJ.invoke().longValue() - this.LJIILLIIL;
        this.LJIILLIIL = this.LIZJ.invoke().longValue();
        this.LJIILIIL++;
    }

    @Override // X.C0YK7
    public final void LJII() {
        this.LJJ = this.LIZJ.invoke().longValue();
        this.LJIL = this.LIZJ.invoke().longValue();
    }

    @Override // X.C0YK7
    public final void LJIIJ() {
        this.LJIJJLI += this.LIZJ.invoke().longValue() - this.LJIILLIIL;
        this.LJIJ += this.LIZJ.invoke().longValue() - this.LJIIZILJ;
    }

    @Override // X.C0YK7
    public final void LJIIL() {
        this.LJJII += this.LIZJ.invoke().longValue() - this.LJIL;
        this.LJIL = this.LIZJ.invoke().longValue();
    }

    @Override // X.C0YK7
    public final void LJIILIIL() {
        this.LJIJI += this.LIZJ.invoke().longValue() - this.LJIILLIIL;
        this.LJIILLIIL = this.LIZJ.invoke().longValue();
    }

    @Override // X.C0YK7
    public final void LJIILL() {
        this.LJJIFFI += this.LIZJ.invoke().longValue() - this.LJIL;
        this.LJIL = this.LIZJ.invoke().longValue();
    }

    public final void LJIIZILJ() {
        int i;
        if (this.LJJIIJZLJL > 0) {
            return;
        }
        this.LJJIIJZLJL = this.LIZJ.invoke().longValue() - this.LJJIIJ;
        C870460YCu c870460YCu = this.LIZIZ;
        C0YJ9 c0yj9 = new C0YJ9(c870460YCu.LIZJ);
        c0yj9.LIZJ("puller_wakeup_pull");
        c0yj9.LIZ("old", "type");
        c0yj9.LIZ(this.LJIILL ? CardStruct.IStatusCode.DEFAULT : "1", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZ(Integer.valueOf(this.LIZLLL), "cmd_msg_count");
        c0yj9.LIZ(Integer.valueOf(this.LJ), "normal_msg_count");
        c0yj9.LIZ(Integer.valueOf(this.LJFF), "conv_count");
        c0yj9.LIZ(0, "unread_count");
        c0yj9.LIZ(Integer.valueOf(this.LJ + this.LIZLLL), "total_msg_count");
        c0yj9.LIZ(Integer.valueOf(c870460YCu.LIZJ.LJ().LIZ().LIZIZ() ? 1 : 0), "is_net_available");
        c0yj9.LIZ(Integer.valueOf(c870460YCu.LIZJ.LJ().LIZ().isWsConnected() ? 1 : 0), "is_ws_connected");
        c0yj9.LIZ(Long.valueOf(this.LJJIIJZLJL), "duration");
        c0yj9.LIZ(Long.valueOf(this.LJIJ), "pull_duration");
        c0yj9.LIZ(Long.valueOf(this.LJJI), "process_duration");
        c0yj9.LIZ(Long.valueOf(this.LJIJI), "build_request_time_cost");
        c0yj9.LIZ(Long.valueOf(this.LJIJJ), "response_time_cost");
        c0yj9.LIZ(Long.valueOf(this.LJJIFFI), "save_msg_list_time_cost");
        c0yj9.LIZ(Long.valueOf(this.LJJII), "save_conversation_list_time_cost");
        c0yj9.LIZ(Long.valueOf(this.LJJIII), "local_push_time_cost");
        c0yj9.LIZ(Boolean.valueOf(c870460YCu.LIZ), "is_first_init");
        c0yj9.LIZ(Long.valueOf(this.LJIJJLI), "sp_and_check_wait_time_cost");
        c0yj9.LIZ(C870740YDw.LJI(this.LIZ), "pull_reason");
        c0yj9.LIZ(Boolean.valueOf(this.LJIIIZ), "is_combo_request");
        c0yj9.LIZ(Integer.valueOf(this.LJIIJJI), "inbox_type");
        c0yj9.LIZ(Integer.valueOf(c870460YCu.LIZJ.LJ().LJ().isAppBackground() ? 1 : 0), "is_background");
        c0yj9.LIZ(Integer.valueOf(this.LJIIJ), "combo_request_count");
        if (!this.LJIILL && (i = this.LJI) > 0) {
            c0yj9.LIZ(Integer.valueOf(i), "error_code");
            c0yj9.LIZ(this.LJII, "log_id");
        }
        if (!TextUtils.isEmpty(this.LJIIL)) {
            c0yj9.LIZ(this.LJIIL, "biz_scene");
        }
        Map<String, String> mapLJIIIIZZ = c870460YCu.LIZJ.LJ().getEvent().LJIIIIZZ("puller_wakeup_pull");
        if (mapLJIIIIZZ != null && !mapLJIIIIZZ.isEmpty()) {
            c0yj9.LIZIZ(mapLJIIIIZZ);
        }
        c0yj9.LIZLLL();
        c870460YCu.LIZ = false;
        if (this.LJIILL) {
            ((ConcurrentHashMap) c870460YCu.LIZIZ).put(Integer.valueOf(this.LJIIJJI), Boolean.TRUE);
        }
    }

    @Override // X.C0YK7
    public final int LIZJ() {
        return this.LJFF;
    }

    @Override // X.C0YK7
    public final int LJIIIIZZ() {
        return this.LIZLLL;
    }

    @Override // X.C0YK7
    public final long LJIIIZ() {
        return this.LJJIIJZLJL;
    }

    @Override // X.C0YK7
    public final int LJIILLIIL() {
        return this.LJ;
    }

    @Override // X.C0YK7
    public final int getErrorCode() {
        return this.LJI;
    }

    @Override // X.C0YK7
    public final String getLogId() {
        return this.LJII;
    }

    @Override // X.C0YK7
    public final String getRegion() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0YK7
    public final boolean isSuccess() {
        return this.LJIILL;
    }

    @Override // X.C0YK7
    public final void LIZIZ(int i) {
        this.LIZLLL = i;
    }

    @Override // X.C0YK7
    public final void LIZLLL(int i) {
        this.LJFF = i;
    }

    @Override // X.C0YK7
    public final void LJI(String str) {
        this.LJIIZILJ = this.LIZJ.invoke().longValue();
        this.LJIILLIIL = this.LIZJ.invoke().longValue();
        this.LJIIL = str;
    }

    @Override // X.C0YK7
    public final void LJIILJJIL(int i) {
        this.LJ = i;
    }

    @Override // X.C0YK7
    public final void setErrorCode(int i) {
        this.LJI = i;
    }

    @Override // X.C0YK7
    public final void setLogId(String str) {
        this.LJII = str;
    }

    @Override // X.C0YK7
    public final void setRegion(String str) {
        this.LJIIIIZZ = str;
    }

    public C0YE0(int i, C870460YCu c870460YCu) {
        C1449005lo c1449005lo = C1449005lo.LL;
        this.LIZ = i;
        this.LIZIZ = c870460YCu;
        this.LIZJ = c1449005lo;
        this.LJI = -1;
        this.LJII = "";
        this.LJIIL = "";
        this.LJIILL = true;
    }

    @Override // X.C0YK7
    public final void LJIIJJI(boolean z, boolean z2) {
        boolean z3;
        this.LJJIII += this.LIZJ.invoke().longValue() - this.LJIL;
        this.LJJI += this.LIZJ.invoke().longValue() - this.LJJ;
        if (z && this.LJIILL) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJIILL = z3;
        if (!z2 || this.LJIILJJIL) {
            LJIIZILJ();
        }
    }
}
