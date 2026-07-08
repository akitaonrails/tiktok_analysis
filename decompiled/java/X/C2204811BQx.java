package X;

import android.os.SystemClock;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.1BQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2204811BQx {
    public String LIZ;
    public String LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public HashMap<String, Object> LJ;
    public final SimpleDateFormat LJFF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    public final TimeLineEvent LIZIZ() {
        return new TimeLineEvent(this);
    }

    public final void LIZLLL() {
        this.LIZIZ = this.LJFF.format(new Date());
        this.LIZLLL = SystemClock.elapsedRealtime();
        this.LIZJ = System.currentTimeMillis();
    }

    public final void LIZ(String str, List list) {
        LIZLLL();
        this.LIZ = str;
        TimeLineEvent timeLineEventLIZIZ = LIZIZ();
        if (list != null) {
            list.add(timeLineEventLIZIZ);
        }
    }

    public final void LIZJ(Object obj, String str) {
        if (this.LJ == null) {
            this.LJ = new HashMap<>();
        }
        this.LJ.put(str, obj);
    }
}
