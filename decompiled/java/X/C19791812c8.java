package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.12c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19791812c8 extends C19791712c7 {
    public Boolean LIZIZ;
    public String LIZJ;
    public InterfaceC19786712bJ LIZLLL;
    public Boolean LJ;

    public final Bundle LJJIFFI() {
        try {
            if (this.LIZ.LIZ.getPackageManager() == null) {
                LJIILJJIL().LJFF.LIZJ("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoLIZ = C812450Vtz.LIZ(this.LIZ.LIZ).LIZ(128, this.LIZ.LIZ.getPackageName());
            if (applicationInfoLIZ != null) {
                return applicationInfoLIZ.metaData;
            }
            LJIILJJIL().LJFF.LIZJ("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZ(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public static long LJIJJLI() {
        return C19817012gC.LJJIIZ.LIZ(null).longValue();
    }

    public final boolean LJIL() {
        Boolean boolLJIIZILJ = LJIIZILJ("google_analytics_automatic_screen_reporting_enabled");
        return boolLJIIZILJ == null || boolLJIIZILJ.booleanValue();
    }

    public final boolean LJJ() {
        Boolean boolLJIIZILJ = LJIIZILJ("firebase_analytics_collection_deactivated");
        return boolLJIIZILJ != null && boolLJIIZILJ.booleanValue();
    }

    public final boolean LJJI() {
        if (this.LIZIZ == null) {
            Boolean boolLJIIZILJ = LJIIZILJ("app_measurement_lite");
            this.LIZIZ = boolLJIIZILJ;
            if (boolLJIIZILJ == null) {
                this.LIZIZ = Boolean.FALSE;
            }
        }
        return this.LIZIZ.booleanValue() || !this.LIZ.LJ;
    }

    public C19791812c8(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZLLL = new InterfaceC19786712bJ() { // from class: X.12c9
            @Override // X.InterfaceC19786712bJ
            public final String LJIJ(String str, String str2) {
                return null;
            }
        };
    }

    public final boolean LJIIIIZZ(C19812612fU<Boolean> c19812612fU) {
        return LJIJI(null, c19812612fU);
    }

    public final EnumC19782112aZ LJIILL(String str) {
        C0W3J.LJI(str);
        Bundle bundleLJJIFFI = LJJIFFI();
        if (bundleLJJIFFI == null) {
            LJIILJJIL().LJFF.LIZJ("Failed to load metadata: Metadata bundle is null");
        } else {
            try {
                Object obj = bundleLJJIFFI.get(str);
                if (obj != null) {
                    if (Boolean.TRUE.equals(obj)) {
                        return EnumC19782112aZ.GRANTED;
                    }
                    if (Boolean.FALSE.equals(obj)) {
                        return EnumC19782112aZ.DENIED;
                    }
                    if ("default".equals(obj)) {
                        return EnumC19782112aZ.DEFAULT;
                    }
                    LJIILJJIL().LJIIIIZZ.LIZ(str, "Invalid manifest metadata for");
                    return EnumC19782112aZ.UNINITIALIZED;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return EnumC19782112aZ.UNINITIALIZED;
    }

    public final Boolean LJIIZILJ(String str) {
        C0W3J.LJI(str);
        Bundle bundleLJJIFFI = LJJIFFI();
        if (bundleLJJIFFI == null) {
            LJIILJJIL().LJFF.LIZJ("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!bundleLJJIFFI.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(bundleLJJIFFI.getBoolean(str));
    }

    public final boolean LJIJJ(String str) {
        return "1".equals(this.LIZLLL.LJIJ(str, "measurement.event_sampling_enabled"));
    }

    public final double LJFF(String str, C19812612fU<Double> c19812612fU) {
        if (str == null) {
            return c19812612fU.LIZ(null).doubleValue();
        }
        String strLJIJ = this.LIZLLL.LJIJ(str, c19812612fU.LIZ);
        if (TextUtils.isEmpty(strLJIJ)) {
            return c19812612fU.LIZ(null).doubleValue();
        }
        try {
            return c19812612fU.LIZ(Double.valueOf(CastDoubleProtector.parseDouble(strLJIJ))).doubleValue();
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return c19812612fU.LIZ(null).doubleValue();
        }
    }

    public final int LJII(String str, boolean z) {
        ((InterfaceC19786112bD) C19814812fq.LLILLJJLI.get()).zza();
        if (!this.LIZ.LJI.LJIJI(null, C19817012gC.LJLZ)) {
            return 100;
        }
        if (!z) {
            return 500;
        }
        return LJI(str, C19817012gC.LJJJJI, 100, 500);
    }

    public final int LJIIIZ(String str, C19812612fU<Integer> c19812612fU) {
        if (str == null) {
            return c19812612fU.LIZ(null).intValue();
        }
        String strLJIJ = this.LIZLLL.LJIJ(str, c19812612fU.LIZ);
        if (TextUtils.isEmpty(strLJIJ)) {
            return c19812612fU.LIZ(null).intValue();
        }
        try {
            return c19812612fU.LIZ(Integer.valueOf(CastIntegerProtector.parseInt(strLJIJ))).intValue();
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return c19812612fU.LIZ(null).intValue();
        }
    }

    public final int LJIIJ(String str, boolean z) {
        return Math.max(LJII(str, z), 256);
    }

    public final long LJIIJJI(String str, C19812612fU<Long> c19812612fU) {
        if (str == null) {
            return c19812612fU.LIZ(null).longValue();
        }
        String strLJIJ = this.LIZLLL.LJIJ(str, c19812612fU.LIZ);
        if (TextUtils.isEmpty(strLJIJ)) {
            return c19812612fU.LIZ(null).longValue();
        }
        try {
            return c19812612fU.LIZ(Long.valueOf(CastLongProtector.parseLong(strLJIJ))).longValue();
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return c19812612fU.LIZ(null).longValue();
        }
    }

    public final String LJIILIIL(String str, C19812612fU<String> c19812612fU) {
        if (str == null) {
            return c19812612fU.LIZ(null);
        }
        return c19812612fU.LIZ(this.LIZLLL.LJIJ(str, c19812612fU.LIZ));
    }

    public final boolean LJIILLIIL(String str, C19812612fU<Boolean> c19812612fU) {
        return LJIJI(str, c19812612fU);
    }

    public final String LJIJ(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            C0W3J.LJIIIIZZ(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZ(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LJIILJJIL().LJFF.LIZ(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LJIILJJIL().LJFF.LIZ(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            LJIILJJIL().LJFF.LIZ(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final boolean LJIJI(String str, C19812612fU<Boolean> c19812612fU) {
        if (str == null) {
            return c19812612fU.LIZ(null).booleanValue();
        }
        String strLJIJ = this.LIZLLL.LJIJ(str, c19812612fU.LIZ);
        if (TextUtils.isEmpty(strLJIJ)) {
            return c19812612fU.LIZ(null).booleanValue();
        }
        return c19812612fU.LIZ(Boolean.valueOf("1".equals(strLJIJ))).booleanValue();
    }

    public final int LJI(String str, C19812612fU<Integer> c19812612fU, int i, int i2) {
        return Math.max(Math.min(LJIIIZ(str, c19812612fU), i2), i);
    }
}
