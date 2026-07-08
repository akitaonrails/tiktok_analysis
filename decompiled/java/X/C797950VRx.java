package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0VRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797950VRx {
    public static long LIZ;
    public static long LIZIZ;
    public static ArrayList<String> LIZJ;
    public static String LIZLLL;

    public static File[] LIZ(final long j, final long j2, String str, String str2, String str3) {
        String strQuote;
        LIZ = j;
        LIZIZ = j2;
        LIZLLL = null;
        LIZJ = null;
        if (j > j2) {
            LIZLLL = "time interval is invalid";
            return new File[0];
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2.replace(':', '-');
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("^\\d{4}_\\d{2}_\\d{2}_(\\d+)__");
            String strQuote2 = "\\S+";
            if (TextUtils.isEmpty(str2)) {
                strQuote = "\\S+";
            } else {
                strQuote = Pattern.quote(str2);
            }
            sbLIZ.append(strQuote);
            sbLIZ.append("__");
            if (!TextUtils.isEmpty(str3)) {
                strQuote2 = Pattern.quote(str3);
            }
            sbLIZ.append(strQuote2);
            sbLIZ.append("\\.alog\\.hot$");
            final Pattern patternCompile = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ));
            final ArrayList<String> arrayList = new ArrayList<>();
            File[] fileArrListFiles = c0vsj.listFiles(new FilenameFilter() { // from class: X.0V8c
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str4) {
                    String strGroup;
                    arrayList.add(str4);
                    Matcher matcher = patternCompile.matcher(str4);
                    if (!matcher.find() || matcher.groupCount() != 1 || (strGroup = matcher.group(1)) == null) {
                        return false;
                    }
                    long j3 = CastLongProtector.parseLong(strGroup);
                    if (j3 > 0 && j3 <= j2) {
                        long jLastModified = new C0VSJ(file, str4).lastModified();
                        if (jLastModified > 0 && jLastModified >= j) {
                            return true;
                        }
                    }
                    return false;
                }
            });
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                LIZLLL = "log file not found";
                LIZJ = arrayList;
                if (fileArrListFiles == null) {
                    return new File[0];
                }
                return fileArrListFiles;
            }
            return fileArrListFiles;
        }
        LIZLLL = "log dir not exists";
        return new File[0];
    }
}
