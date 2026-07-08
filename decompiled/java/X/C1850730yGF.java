package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveGiftDisplayCountFixSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: renamed from: X.0yGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850730yGF {
    public static String LIZ(long j) {
        String strLIZIZ;
        if (j < 10) {
            strLIZIZ = C341701Uh.LIZ("%d", 10L);
        } else if (j < 100) {
            strLIZIZ = C341701Uh.LIZ("%d", Long.valueOf((j / 10) * 10));
        } else if (j < 1000) {
            strLIZIZ = C341701Uh.LIZ("%d", Long.valueOf((j / 100) * 100));
        } else if (j < 1000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000)));
            sbLIZ.append("K+");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (j < 1000000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000000)));
            sbLIZ2.append("M+");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(C341701Uh.LIZ("%d", Long.valueOf(j / 1000000000)));
            sbLIZ3.append("B+");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (j < 1000) {
            if (C497740JfY.LJJ()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("+");
                sbLIZ4.append(strLIZIZ);
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("+");
            return C2188811AlT.LIZIZ(sbLIZ5);
        }
        return strLIZIZ;
    }

    public static String LIZIZ(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ.append("K");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%.0f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ2.append("K");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d)));
        sbLIZ3.append("M");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LIZJ(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%.1f", Float.valueOf(((j * 10) / 1000) * 0.1f)));
            sbLIZ.append("K");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%.1f", Float.valueOf(((j * 10) / 1000000) * 0.1f)));
            sbLIZ2.append("M");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C341701Uh.LIZ("%.1f", Float.valueOf(((j * 10) / 1000000000) * 0.1f)));
        sbLIZ3.append("B");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LJFF(long j) {
        double d = j * 1.0d;
        boolean z = false;
        try {
            if (j < 1000) {
                if (LiveGiftDisplayCountFixSetting.INSTANCE.getValue()) {
                    return String.valueOf(j);
                }
                if (d < 100.0d) {
                    z = true;
                }
                return LJ(z, d);
            }
            if (j < 1000000) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LJ(false, d / 1000.0d));
                sbLIZ.append("K");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            if (j < 1000000000) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LJ(false, d / 1000000.0d));
                sbLIZ2.append("M");
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (j < 999000000000L) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(LJ(false, d / 1.0E9d));
                sbLIZ3.append("B");
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
            return "999+B";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getDisplayCountByNumberOfDigitsForCoin exception: ");
            sbLIZ4.append(th.getMessage());
            C20441214yg.LJ("LiveCountDisplayUtil", C2188811AlT.LIZIZ(sbLIZ4));
            return String.valueOf(j);
        }
    }

    public static String LJI(int i) {
        if (i <= 0) {
            return String.valueOf(i);
        }
        int i2 = i % 100;
        int i3 = i % 10;
        String str = "th";
        if (i2 < 11 || i2 > 13) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        str = "rd";
                    }
                } else {
                    str = "nd";
                }
            } else {
                str = "st";
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJII(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%.1f", Double.valueOf(Math.floor((j * 10.0d) / 1000.0d) / 10.0d)));
            sbLIZ.append("k");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%.1f", Double.valueOf(Math.floor((j * 10.0d) / 1000000.0d) / 10.0d)));
            sbLIZ2.append("m");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C341701Uh.LIZ("%.1f", Double.valueOf(Math.floor((j * 10.0d) / 1.0E9d) / 10.0d)));
        sbLIZ3.append("b");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LJIIIIZZ(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ.append("K");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%.0f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ2.append("K");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d)));
        sbLIZ3.append("M");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LJIIIZ(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ.append("K");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d)));
            sbLIZ2.append("M");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1.0E9d)));
        sbLIZ3.append("B");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LIZLLL(long j, boolean z) {
        if (z) {
            return LJFF(j);
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000.0d)));
            sbLIZ.append("K");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1000000.0d)));
            sbLIZ2.append("M");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C341701Uh.LIZ("%.1f", Double.valueOf((j * 1.0d) / 1.0E9d)));
        sbLIZ3.append("B");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static String LJ(boolean z, double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (z) {
            decimalFormat = new DecimalFormat(CardStruct.IStatusCode.DEFAULT);
        }
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        String str = decimalFormat.format(d);
        if (d >= 100.0d) {
            return str.substring(0, 3);
        }
        return str.substring(0, 4);
    }
}
