package X;

import com.bytedance.bddatefmt.BDDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: X.0xBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1809480xBi {
    public static final BDDateFormat LIZJ = new BDDateFormat("LLL");
    public int LIZ = 0;
    public boolean LIZIZ;

    public String LIZ() {
        return "Card";
    }

    public long LIZJ() {
        return 0L;
    }

    public String LIZLLL() {
        return "";
    }

    public final String LIZIZ() {
        long jLIZJ = LIZJ();
        C20441214yg.LIZIZ("LiveCenterProp", String.valueOf(jLIZJ));
        return jLIZJ <= 0 ? "" : LIZJ.LIZIZ(jLIZJ, Locale.getDefault());
    }
}
