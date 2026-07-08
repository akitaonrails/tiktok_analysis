package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.12c5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19791512c5 extends AbstractC19781512aT {
    public final Map<String, C19791612c6> LIZLLL;
    public final C19811012fE LJ;
    public final C19811012fE LJFF;
    public final C19811012fE LJI;
    public final C19811012fE LJII;
    public final C19811012fE LJIIIIZZ;

    @Override // X.AbstractC19781512aT
    public final boolean LJIIJ() {
        return false;
    }

    public C19791512c5(C12Z4 c12z4) {
        super(c12z4);
        this.LIZLLL = new HashMap();
        C19804812eE c19804812eELIZIZ = LIZIZ();
        Objects.requireNonNull(c19804812eELIZIZ);
        this.LJ = new C19811012fE(c19804812eELIZIZ, "last_delete_stale", 0L);
        C19804812eE c19804812eELIZIZ2 = LIZIZ();
        Objects.requireNonNull(c19804812eELIZIZ2);
        this.LJFF = new C19811012fE(c19804812eELIZIZ2, "backoff", 0L);
        C19804812eE c19804812eELIZIZ3 = LIZIZ();
        Objects.requireNonNull(c19804812eELIZIZ3);
        this.LJI = new C19811012fE(c19804812eELIZIZ3, "last_upload", 0L);
        C19804812eE c19804812eELIZIZ4 = LIZIZ();
        Objects.requireNonNull(c19804812eELIZIZ4);
        this.LJII = new C19811012fE(c19804812eELIZIZ4, "last_upload_attempt", 0L);
        C19804812eE c19804812eELIZIZ5 = LIZIZ();
        Objects.requireNonNull(c19804812eELIZIZ5);
        this.LJIIIIZZ = new C19811012fE(c19804812eELIZIZ5, "midnight_offset", 0L);
    }

    public static AdvertisingIdClient.Info LJIIJJI(Context context) {
        if (C10EU.LJIILIIL() && C20123813oa.LIZ()) {
            return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
        }
        return C2204961BRm.LLLLLILLIL(context, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB282f", new String[]{"016a9"}));
    }

    public final Pair<String, Boolean> LJIILIIL(String str) {
        C19791612c6 c19791612c6;
        AdvertisingIdClient.Info infoLJIIJJI;
        LJ();
        this.LIZ.LJIILIIL.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C19791612c6 c19791612c62 = (C19791612c6) ((HashMap) this.LIZLLL).get(str);
        if (c19791612c62 != null && jElapsedRealtime < c19791612c62.LIZJ) {
            return new Pair<>(c19791612c62.LIZ, Boolean.valueOf(c19791612c62.LIZIZ));
        }
        C19791812c8 c19791812c8 = this.LIZ.LJI;
        c19791812c8.getClass();
        long jLJIIJJI = c19791812c8.LJIIJJI(str, C19817012gC.LIZIZ) + jElapsedRealtime;
        try {
            try {
                infoLJIIJJI = LJIIJJI(this.LIZ.LIZ);
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                if (c19791612c62 != null && jElapsedRealtime < c19791612c62.LIZJ + this.LIZ.LJI.LJIIJJI(str, C19817012gC.LIZJ)) {
                    return new Pair<>(c19791612c62.LIZ, Boolean.valueOf(c19791612c62.LIZIZ));
                }
                infoLJIIJJI = null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJIILJJIL().LJIIL.LIZ(e2, "Unable to get advertising id");
            c19791612c6 = new C19791612c6("", false, jLJIIJJI);
        }
        if (infoLJIIJJI == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strLLLLLIL = C2204961BRm.LLLLLIL(infoLJIIJJI, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB282f", new String[]{"016a9"}));
        if (strLLLLLIL != null) {
            c19791612c6 = new C19791612c6(strLLLLLIL, infoLJIIJJI.LIZIZ, jLJIIJJI);
        } else {
            c19791612c6 = new C19791612c6("", infoLJIIJJI.LIZIZ, jLJIIJJI);
        }
        ((HashMap) this.LIZLLL).put(str, c19791612c6);
        return new Pair<>(c19791612c6.LIZ, Boolean.valueOf(c19791612c6.LIZIZ));
    }

    public final String LJIILL(String str, boolean z) {
        String str2;
        LJ();
        if (z) {
            str2 = (String) LJIILIIL(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest messageDigestLJLIIL = C19803112dx.LJLIIL();
        if (messageDigestLJLIIL == null) {
            return null;
        }
        return C786410Ut5.k4(Locale.US, "%032X", new Object[]{new BigInteger(1, messageDigestLJLIIL.digest(str2.getBytes()))});
    }
}
