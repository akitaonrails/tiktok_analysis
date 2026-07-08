package X;

import android.os.SystemClock;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0Z4W, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z4W {
    public final SparseIntArray LIZ = new SparseIntArray();
    public final SparseIntArray LIZIZ = new SparseIntArray();
    public final SparseLongArray LIZJ = new SparseLongArray();
    public final /* synthetic */ C0Z4V LIZLLL;

    public C0Z4W(C0Z4V c0z4v) {
        this.LIZLLL = c0z4v;
    }

    public final void LIZ(int i, int i2, String str, Map<String, ? extends Object> map) {
        String strValueOf;
        if (!this.LIZLLL.LIZ.LIZJ()) {
            return;
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("inbox_type", String.valueOf(i));
        c830490Whz.put("trigger", C870770YDz.LIZ(i2));
        c830490Whz.put("logout_flag", String.valueOf(this.LIZLLL.LIZIZ.LIZ));
        c830490Whz.put("boot_finish_flag", String.valueOf(this.LIZLLL.LIZIZ.LIZIZ));
        c830490Whz.put("pull_index", String.valueOf(this.LIZ.get(i, 0)));
        c830490Whz.put("last_pull_reason", C870770YDz.LIZ(this.LIZIZ.get(i, -1)));
        long j = this.LIZJ.get(i, 0L);
        if (j == 0) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(SystemClock.uptimeMillis() - j);
        }
        c830490Whz.put("pull_interval", strValueOf);
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                c830490Whz.put(entry.getKey(), entry.getValue().toString());
            }
        }
        c830490Whz.put("event_type", "skip");
        c830490Whz.put("pull_skip_type", str);
        this.LIZLLL.LIZ.LJ().sendEvent("dm_dev_pull_msg_event", c830490Whz);
    }
}
