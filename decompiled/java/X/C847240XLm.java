package X;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847240XLm {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public int LJII;
    public int LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public EnumC847220XLk LJIIJ = EnumC847220XLk.UNKNOWN;
    public InterfaceC847340XLw LJIIJJI;
    public List<Integer> LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public boolean LJIILL;

    public C847240XLm(int i, String str, int i2, String str2, String str3, int i3, String str4) {
        if (i > 0 && i2 > 0 && i3 > 0) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                this.LIZ = i;
                this.LIZIZ = i2;
                this.LIZLLL = i3;
                this.LIZJ = str;
                this.LJ = str2;
                this.LJFF = str3;
                this.LJI = str4;
                return;
            }
            throw new IllegalArgumentException("Host, appVersion, appKey and deviceId must not be empty.");
        }
        throw new IllegalArgumentException("Appid, fpid and port must be set greater than 0.");
    }
}
