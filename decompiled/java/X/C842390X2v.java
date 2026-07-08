package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842390X2v implements Cloneable {
    public static final Set<String> LLJILJILJ;
    public static final Pattern LLJILLL;
    public static final Pattern LLJJ;
    public static final C842410X2x LLJJI;
    public static final String[] LLJJIII;
    public String LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public long LLILZIL = -1;
    public final String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final String LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0X2x] */
    static {
        HashSet hashSet = new HashSet();
        LLJILJILJ = hashSet;
        hashSet.add("comment");
        hashSet.add("commenturl");
        hashSet.add("discard");
        hashSet.add("domain");
        hashSet.add("expires");
        hashSet.add("httponly");
        hashSet.add("max-age");
        hashSet.add("path");
        hashSet.add("port");
        hashSet.add("secure");
        hashSet.add("version");
        LLJILLL = null;
        LLJJ = null;
        try {
            LLJILLL = PatternProtector.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            LLJJ = PatternProtector.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LLJJI = new ThreadLocal<DateFormat>() { // from class: X.0X2x
            @Override // java.lang.ThreadLocal
            public final DateFormat initialValue() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            }
        };
        LLJJIII = new String[]{"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    }

    public final int hashCode() {
        String str = this.LLILZLL;
        Locale locale = Locale.US;
        int iHashCode = str.toLowerCase(locale).hashCode();
        String str2 = this.LLILZ;
        int iHashCode2 = iHashCode + (str2 == null ? 0 : str2.toLowerCase(locale).hashCode());
        String str3 = this.LLIZ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append("=");
        sbLIZ.append(this.LLJIJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List<C842390X2v> LIZJ(String str) {
        int i;
        String str2;
        String str3;
        String strSubstring;
        C842400X2w c842400X2w = new C842400X2w(str);
        ArrayList arrayList = new ArrayList(2);
        if (c842400X2w.LIZIZ.startsWith("set-cookie2:")) {
            c842400X2w.LIZJ += 12;
            c842400X2w.LIZLLL = true;
            i = 0;
        } else {
            if (c842400X2w.LIZIZ.startsWith("set-cookie:")) {
                c842400X2w.LIZJ += 11;
            }
            i = 1;
        }
        while (true) {
            String strLIZIZ = c842400X2w.LIZIZ(false);
            if (strLIZIZ == null) {
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No cookies in ");
                sbLIZ.append(c842400X2w.LIZ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (c842400X2w.LIZJ()) {
                if (i != 0) {
                    str2 = ";";
                } else {
                    str2 = ",;";
                }
                c842400X2w.LIZLLL();
                int iLIZ = c842400X2w.LIZ(str2);
                String strSubstring2 = c842400X2w.LIZ.substring(c842400X2w.LIZJ, iLIZ);
                c842400X2w.LIZJ = iLIZ;
                C842390X2v c842390X2v = new C842390X2v(strLIZIZ, strSubstring2);
                c842390X2v.LLJILJIL = i ^ 1;
                arrayList.add(c842390X2v);
                while (true) {
                    c842400X2w.LIZLLL();
                    if (c842400X2w.LIZJ == c842400X2w.LIZ.length()) {
                        break;
                    }
                    if (c842400X2w.LIZ.charAt(c842400X2w.LIZJ) == ',') {
                        c842400X2w.LIZJ++;
                        break;
                    }
                    if (c842400X2w.LIZ.charAt(c842400X2w.LIZJ) == ';') {
                        c842400X2w.LIZJ++;
                    }
                    String strLIZIZ2 = c842400X2w.LIZIZ(true);
                    if (strLIZIZ2 != null) {
                        if (i != 0 || "expires".equals(strLIZIZ2) || "port".equals(strLIZIZ2)) {
                            str3 = ";";
                        } else {
                            str3 = ";,";
                        }
                        Date date = null;
                        if (c842400X2w.LIZJ()) {
                            c842400X2w.LIZLLL();
                            int iLIZ2 = c842400X2w.LIZ(str3);
                            strSubstring = c842400X2w.LIZ.substring(c842400X2w.LIZJ, iLIZ2);
                            c842400X2w.LIZJ = iLIZ2;
                        } else {
                            strSubstring = null;
                        }
                        if (strLIZIZ2.equals("comment") && c842390X2v.LL == null) {
                            c842390X2v.LL = strSubstring;
                        } else if (strLIZIZ2.equals("commenturl") && c842390X2v.LLILLJJLI == null) {
                            c842390X2v.LLILLJJLI = strSubstring;
                        } else if (strLIZIZ2.equals("discard")) {
                            c842390X2v.LLILLL = true;
                        } else if (strLIZIZ2.equals("domain") && c842390X2v.LLILZ == null) {
                            if (!TextUtils.isEmpty(strSubstring) && strSubstring.charAt(0) == '.') {
                                strSubstring = strSubstring.substring(1);
                            }
                            c842390X2v.LLILZ = strSubstring;
                        } else if (strLIZIZ2.equals("expires")) {
                            if (c842390X2v.LLILZIL == -1) {
                                try {
                                    date = LLJJI.get().parse(strSubstring);
                                } catch (ParseException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    for (String str4 : LLJJIII) {
                                        try {
                                            date = new SimpleDateFormat(str4, Locale.US).parse(strSubstring);
                                            break;
                                        } catch (ParseException e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                        }
                                    }
                                }
                                if (date != null) {
                                    c842390X2v.LLILZIL = (date.getTime() - System.currentTimeMillis()) / 1000;
                                } else {
                                    c842390X2v.LLILZIL = 0L;
                                }
                            }
                        } else if (strLIZIZ2.equals("max-age")) {
                            try {
                                c842390X2v.LLILZIL = CastLongProtector.parseLong(strSubstring);
                            } catch (NumberFormatException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Invalid max-age: ");
                                sbLIZ2.append(strSubstring);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        } else if (strLIZIZ2.equals("path") && c842390X2v.LLIZ == null) {
                            c842390X2v.LLIZ = strSubstring;
                        } else if (strLIZIZ2.equals("port") && c842390X2v.LLIZLLLIL == null) {
                            if (strSubstring == null) {
                                strSubstring = "";
                            }
                            c842390X2v.LLIZLLLIL = strSubstring;
                        } else if (strLIZIZ2.equals("secure")) {
                            c842390X2v.LLJ = true;
                        } else if (strLIZIZ2.equals("httponly")) {
                            c842390X2v.LLJI = true;
                        } else if (strLIZIZ2.equals("version") && !c842400X2w.LIZLLL) {
                            c842390X2v.LLJILJIL = CastIntegerProtector.parseInt(strSubstring);
                        }
                    }
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Expected '=' after ");
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" in ");
                sbLIZ3.append(c842400X2w.LIZ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C842390X2v)) {
            return false;
        }
        C842390X2v c842390X2v = (C842390X2v) obj;
        if (this.LLILZLL.equalsIgnoreCase(c842390X2v.LLILZLL)) {
            String str = this.LLILZ;
            if (str != null) {
                if (!str.equalsIgnoreCase(c842390X2v.LLILZ)) {
                    return false;
                }
            } else if (c842390X2v.LLILZ != null) {
                return false;
            }
            String str2 = this.LLIZ;
            String str3 = c842390X2v.LLIZ;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
                return false;
            }
            if (str2.equals(str3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C842390X2v(String str, String str2) {
        String strTrim = str.trim();
        if (strTrim.length() != 0 && !strTrim.startsWith(e3.c)) {
            if (!((HashSet) LLJILJILJ).contains(strTrim.toLowerCase(Locale.US))) {
                for (int i = 0; i < strTrim.length(); i++) {
                    char cCharAt = strTrim.charAt(i);
                    if (cCharAt >= 0 && cCharAt < 127 && cCharAt != ';' && cCharAt != ',' && (!Character.isWhitespace(cCharAt) || cCharAt == ' ')) {
                    }
                }
                this.LLILZLL = strTrim;
                this.LLJIJIL = str2;
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid name: ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (X.C842390X2v.LLJJ.matcher(r7).matches() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r6, java.lang.String r7) {
        /*
            r3 = 0
            if (r6 == 0) goto L8a
            if (r7 == 0) goto L8a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r0)
            java.lang.String r5 = r6.toLowerCase(r0)
            boolean r0 = r7.equals(r5)
            r6 = 1
            if (r0 == 0) goto L39
            boolean r0 = LIZIZ(r3, r7)
            if (r0 != 0) goto L34
            java.util.regex.Pattern r0 = X.C842390X2v.LLJILLL     // Catch: java.lang.Throwable -> L35
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.matches()     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L34
            java.util.regex.Pattern r0 = X.C842390X2v.LLJJ     // Catch: java.lang.Throwable -> L35
            java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.matches()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L39
        L34:
            return r6
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L39:
            boolean r0 = LIZIZ(r3, r7)
            java.lang.String r4 = ".local"
            if (r0 != 0) goto L46
            boolean r0 = r5.equals(r4)
            return r0
        L46:
            int r1 = r5.length()
            int r0 = r7.length()
            int r0 = r0 + 1
            java.lang.String r2 = "."
            if (r1 != r0) goto L67
            boolean r0 = r5.startsWith(r2)
            if (r0 == 0) goto L67
            boolean r0 = r5.endsWith(r7)
            if (r0 == 0) goto L67
            boolean r0 = LIZIZ(r6, r5)
            if (r0 == 0) goto L67
            return r6
        L67:
            int r1 = r7.length()
            int r0 = r5.length()
            if (r1 <= r0) goto L8a
            boolean r0 = r7.endsWith(r5)
            if (r0 == 0) goto L8a
            boolean r0 = r5.startsWith(r2)
            if (r0 == 0) goto L83
            boolean r0 = LIZIZ(r6, r5)
            if (r0 != 0) goto L89
        L83:
            boolean r0 = r5.equals(r4)
            if (r0 == 0) goto L8a
        L89:
            r3 = 1
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C842390X2v.LIZ(java.lang.String, java.lang.String):boolean");
    }

    public static boolean LIZIZ(int i, String str) {
        int iIndexOf = str.indexOf(46, i + 1);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(C842390X2v c842390X2v, URI uri) {
        String str = c842390X2v.LLIZLLLIL;
        if (str == null) {
            return true;
        }
        return Arrays.asList(str.split(",")).contains(Integer.toString(C842380X2u.getEffectivePort(uri.getScheme(), uri.getPort())));
    }
}
