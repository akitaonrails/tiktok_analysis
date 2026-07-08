package X;

import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YIL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIL implements InterfaceC874620YSu {
    public final /* synthetic */ C0YIN LIZ;
    public final /* synthetic */ C0YIS LIZIZ;
    public final /* synthetic */ C0YIM LIZJ;

    @Override // X.InterfaceC874620YSu
    public final void LIZIZ(C0YIX c0yix) {
        if (this.LIZJ.LLIZLLLIL.LJIIIZ().LJJJI) {
            this.LIZJ.LLIZLLLIL.LJIIJJI().LIZIZ(new C914040ZtS(this, c0yix, 13), null);
        } else {
            this.LIZJ.LJIIIZ(this.LIZ, c0yix);
        }
    }

    public C0YIL(C0YIM c0yim, C0YIN c0yin, C0YIS c0yis) {
        this.LIZJ = c0yim;
        this.LIZ = c0yin;
        this.LIZIZ = c0yis;
    }

    @Override // X.InterfaceC874620YSu
    public final void LIZ(Exception exc, String str, int i) {
        int iMax;
        long jMax;
        String strLIZ;
        C0YIN c0yin;
        int i2;
        if (TextUtils.isEmpty(str)) {
            str = exc.getMessage();
        }
        this.LIZ.LJIIL(i, str);
        C0YIY c0yiyLIZ = C0YHP.LIZ(this.LIZJ.LLIZLLLIL.LJIILL(), this.LIZ.LJI());
        if (c0yiyLIZ != null) {
            iMax = Math.max(c0yiyLIZ.LIZJ, 0);
            jMax = Math.max(c0yiyLIZ.LIZLLL, 0L);
        } else {
            iMax = this.LIZJ.LLIZLLLIL.LJIILL().LIZJ.LIZJ;
            jMax = this.LIZJ.LLIZLLLIL.LJIILL().LIZJ.LIZLLL;
        }
        if (iMax > 0 && (i2 = (c0yin = this.LIZ).LLJILJIL) < iMax) {
            c0yin.LLIZ = null;
            c0yin.LLJ = 0;
            c0yin.LLJIJIL = 0;
            c0yin.LLJILJIL = i2 + 1;
            this.LIZJ.LJIILL(103, c0yin, jMax);
        } else {
            C0YIM c0yim = this.LIZJ;
            C0YIN c0yin2 = this.LIZ;
            c0yim.getClass();
            if (c0yin2 != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 102;
                messageObtain.obj = c0yin2;
                messageObtain.arg1 = 2;
                c0yim.LLILLJJLI.sendMessage(messageObtain);
            }
        }
        if (!C870740YDw.LIZJ(this.LIZJ.LLIZLLLIL, Integer.valueOf(this.LIZ.LJI()))) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LLIZLLLIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendByHttp cmd:");
            sbLIZ.append(this.LIZ.LJI());
            sbLIZ.append(" url:");
            sbLIZ.append(this.LIZIZ.LIZ);
            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), exc);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        C0YIN c0yin3 = this.LIZ;
        long j = jUptimeMillis - c0yin3.LLJI;
        C0YEM c0yem = this.LIZJ.LLIZLLLIL;
        try {
            strLIZ = C0YMS.LIZ(c0yin3.LJI());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZ = "";
        }
        C0YJ9 c0yj9 = new C0YJ9(c0yem);
        c0yj9.LIZJ("imsdk_network_request");
        c0yj9.LIZ(Integer.valueOf(c0yin3.LJI()), "imsdk_cmd");
        c0yj9.LIZ(strLIZ, "url_path");
        c0yj9.LIZ(c0yin3.LLILZLL.inbox_type, "inbox_type");
        c0yj9.LIZ(0, "imsdk_result");
        c0yj9.LIZ(Long.valueOf(c0yin3.LL), "seq_id");
        c0yj9.LIZ(Long.valueOf(j), "duration");
        if (str == null) {
            str = "net_request_failed_handler";
        }
        c0yj9.LIZ(str, "error_msg");
        c0yj9.LIZ(Integer.valueOf(i), "error_code");
        c0yem.LJIIZILJ().LJFF().getEventTracker().getClass();
        c0yj9.LIZ(C0YLL.LIZIZ(exc), "error_stack");
        c0yem.LJIIZILJ().LJFF().getEventTracker().getClass();
        c0yj9.LIZ(C0YLL.LIZ(exc), "error_name");
        c0yj9.LIZ("http", "net_type");
        c0yj9.LIZ(c0yin3.LLILZLL.retry_count, "retry_times");
        C864920XwQ.LIZ(c0yj9, c0yin3, c0yem);
        c0yj9.LIZLLL();
    }
}
