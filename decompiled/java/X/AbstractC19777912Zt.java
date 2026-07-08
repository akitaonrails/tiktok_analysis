package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: X.12Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19777912Zt {
    public final String LIZ;
    public final int LIZIZ;
    public Boolean LIZJ;
    public Boolean LIZLLL;
    public Long LJ;
    public Long LJFF;

    public abstract int LIZ();

    public abstract boolean LJFF();

    public abstract boolean LJI();

    public AbstractC19777912Zt(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }

    public static Boolean LIZIZ(long j, C19778312Zx c19778312Zx) {
        try {
            return LIZLLL(new BigDecimal(j), c19778312Zx, 0.0d);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Boolean LJ(boolean z, Boolean bool) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public static Boolean LIZJ(String str, C19778512Zz c19778512Zz, C19806212eS c19806212eS) {
        String upperCase;
        List listUnmodifiableList;
        String str2;
        int i;
        C0W3J.LJIIIIZZ(c19778512Zz);
        Boolean boolValueOf = null;
        if (str == null) {
            return null;
        }
        if (c19778512Zz.LJJIIJZLJL() && c19778512Zz.LJJI() != EnumC19788112bX.UNKNOWN_MATCH_TYPE) {
            EnumC19788112bX enumC19788112bXLJJI = c19778512Zz.LJJI();
            EnumC19788112bX enumC19788112bX = EnumC19788112bX.IN_LIST;
            if (enumC19788112bXLJJI == enumC19788112bX) {
                if (c19778512Zz.zzi.size() == 0) {
                    return null;
                }
            } else if (!c19778512Zz.LJJIIJ()) {
                return null;
            }
            EnumC19788112bX enumC19788112bXLJJI2 = c19778512Zz.LJJI();
            boolean z = c19778512Zz.zzh;
            if (!z && enumC19788112bXLJJI2 != EnumC19788112bX.REGEXP && enumC19788112bXLJJI2 != enumC19788112bX) {
                upperCase = c19778512Zz.zzg.toUpperCase(Locale.ENGLISH);
            } else {
                upperCase = c19778512Zz.zzg;
            }
            if (c19778512Zz.zzi.size() == 0) {
                listUnmodifiableList = null;
            } else {
                listUnmodifiableList = c19778512Zz.zzi;
                if (!z) {
                    ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                    Iterator it2 = listUnmodifiableList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((String) it2.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
            }
            EnumC19788112bX enumC19788112bX2 = EnumC19788112bX.REGEXP;
            if (enumC19788112bXLJJI2 == enumC19788112bX2) {
                str2 = upperCase;
            } else {
                str2 = null;
            }
            if (enumC19788112bXLJJI2 == EnumC19788112bX.IN_LIST) {
                if (listUnmodifiableList != null) {
                    if (listUnmodifiableList.isEmpty()) {
                        return null;
                    }
                }
            } else if (upperCase == null) {
                return null;
            }
            if (!z && enumC19788112bXLJJI2 != enumC19788112bX2) {
                str = str.toUpperCase(Locale.ENGLISH);
            }
            switch (C19788012bW.LIZ[enumC19788112bXLJJI2.ordinal()]) {
                case 1:
                    if (str2 != null) {
                        if (z) {
                            i = 0;
                        } else {
                            i = 66;
                        }
                        try {
                            boolValueOf = Boolean.valueOf(PatternProtector.compile(str2, i).matcher(str).matches());
                            return boolValueOf;
                        } catch (PatternSyntaxException e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (c19806212eS != null) {
                                c19806212eS.LJIIIIZZ.LIZ(str2, "Invalid regular expression in REGEXP audience filter. expression");
                            }
                        }
                    }
                    break;
                case 2:
                    return Boolean.valueOf(str.startsWith(upperCase));
                case 3:
                    return Boolean.valueOf(str.endsWith(upperCase));
                case 4:
                    return Boolean.valueOf(str.contains(upperCase));
                case 5:
                    return Boolean.valueOf(str.equals(upperCase));
                case 6:
                    if (listUnmodifiableList != null) {
                        return Boolean.valueOf(listUnmodifiableList.contains(str));
                    }
                    break;
                default:
                    return null;
            }
        }
        return boolValueOf;
    }

    public static Boolean LIZLLL(BigDecimal bigDecimal, C19778312Zx c19778312Zx, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C0W3J.LJIIIIZZ(c19778312Zx);
        if (c19778312Zx.LJJIII() && c19778312Zx.LJJI() != EnumC19788212bY.UNKNOWN_COMPARISON_TYPE) {
            EnumC19788212bY enumC19788212bYLJJI = c19778312Zx.LJJI();
            EnumC19788212bY enumC19788212bY = EnumC19788212bY.BETWEEN;
            if (enumC19788212bYLJJI == enumC19788212bY) {
                if (!c19778312Zx.LJJIIZI() || !c19778312Zx.LJJIIZ()) {
                    return null;
                }
            } else if (!c19778312Zx.LJJIIJ()) {
                return null;
            }
            EnumC19788212bY enumC19788212bYLJJI2 = c19778312Zx.LJJI();
            if (c19778312Zx.LJJI() == enumC19788212bY) {
                if (C19777312Zn.LJJJIL(c19778312Zx.zzi) && C19777312Zn.LJJJIL(c19778312Zx.zzj)) {
                    try {
                        bigDecimal3 = new BigDecimal(c19778312Zx.zzi);
                        bigDecimal4 = new BigDecimal(c19778312Zx.zzj);
                        bigDecimal2 = null;
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return null;
            }
            if (!C19777312Zn.LJJJIL(c19778312Zx.zzh)) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(c19778312Zx.zzh);
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (enumC19788212bYLJJI2 == enumC19788212bY) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else {
                if (bigDecimal2 != null) {
                }
                return null;
            }
            int i = C19788012bW.LIZIZ[enumC19788212bYLJJI2.ordinal()];
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal2 != null) {
                        if (d != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) == 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 != null) {
                    if (bigDecimal.compareTo(bigDecimal2) > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            } else if (bigDecimal2 != null) {
                if (bigDecimal.compareTo(bigDecimal2) < 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            return null;
        }
        return null;
    }
}
