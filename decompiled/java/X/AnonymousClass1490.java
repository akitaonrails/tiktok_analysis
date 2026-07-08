package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: X.1490, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1490 {
    public static final String LJJIII;
    public static String LJJIIJ;
    public String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public String LJI;
    public final String LJII;
    public String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Context LJIIJJI;
    public final HashMap<Integer, Pair<String, String>> LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public final boolean LJIILL;
    public final AnonymousClass1494 LJIILLIIL;
    public InterfaceC2202808k6 LJIIZILJ;
    public final InterfaceC202161148h LJIJ;
    public final boolean LJIJI;
    public int LJIJJ;
    public String LJIJJLI;
    public boolean LJIL;
    public final InterfaceC1800230wwn LJJ;
    public final InterfaceC1494370ozT LJJI;
    public final AnonymousClass1495 LJJIFFI;
    public String LJJII;

    public final String LIZ() {
        String string = this.LJIILIIL;
        try {
            if (TextUtils.isEmpty(string)) {
                string = Locale.getDefault().toString();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (string == null) {
                return "";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
        return string == null ? "" : string;
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(Build.VERSION.SDK_INT);
        LJJIII = C2188811AlT.LIZIZ(sbLIZ);
        LJJIIJ = "";
    }

    public AnonymousClass1490(AnonymousClass1491 anonymousClass1491) {
        String string;
        String str;
        this.LIZ = "va";
        String str2 = Build.BRAND;
        this.LJIIIZ = str2;
        String str3 = Build.MODEL;
        this.LJIIJ = str3;
        this.LJIIL = new HashMap<>();
        this.LJIILJJIL = null;
        this.LJIL = false;
        this.LJJ = null;
        this.LJJI = null;
        this.LIZ = anonymousClass1491.LIZ;
        this.LIZIZ = anonymousClass1491.LIZIZ;
        this.LIZJ = anonymousClass1491.LIZJ;
        this.LIZLLL = anonymousClass1491.LIZLLL;
        this.LJ = anonymousClass1491.LJ;
        this.LJFF = "";
        this.LJII = anonymousClass1491.LJFF;
        Locale locale = Locale.getDefault();
        if (TextUtils.isEmpty(anonymousClass1491.LJIIL)) {
            string = locale.toString();
        } else {
            string = anonymousClass1491.LJIIL;
        }
        this.LJIILIIL = string;
        this.LJIILLIIL = anonymousClass1491.LJIIJ;
        this.LJIIZILJ = null;
        this.LJIJ = anonymousClass1491.LJIIJJI;
        this.LJJI = anonymousClass1491.LJIILJJIL;
        if (TextUtils.isEmpty(anonymousClass1491.LJIIL) && (str = this.LJIILIIL) != null) {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length > 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strArrSplit[0]);
                sbLIZ.append("_");
                sbLIZ.append(strArrSplit[1]);
                this.LJIILIIL = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        try {
            this.LJIIIZ = URLEncoder.encode(str2, "utf-8");
            this.LJIIJ = URLEncoder.encode(str3, "utf-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LJI = anonymousClass1491.LJII;
        this.LJIIIIZZ = anonymousClass1491.LJIIIIZZ;
        this.LJIJJLI = null;
        this.LJJ = anonymousClass1491.LJIILIIL;
        this.LJIIJJI = anonymousClass1491.LJI;
        this.LJIILL = true;
        this.LJIJI = anonymousClass1491.LJIIIZ;
        this.LJJIFFI = anonymousClass1491.LJIILL;
    }
}
