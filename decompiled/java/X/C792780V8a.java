package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0V8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792780V8a implements InterfaceC2433509gD {
    public static final List LIZ(String str, long j, long j2) {
        final long j3 = j * 1000;
        final long j4 = j2 * 1000;
        if (j3 > j4 || str == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isDirectory()) {
            return null;
        }
        final Pattern patternCompile = PatternProtector.compile("^\\d{4}_\\d{2}_\\d{2}_(\\d+)__\\S+__\\S+\\.alog\\.hot$");
        File[] fileArrListFiles = c0vsj.listFiles(new FilenameFilter() { // from class: X.0V8b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                String strGroup;
                Matcher matcher = patternCompile.matcher(str2);
                if (!matcher.find() || matcher.groupCount() != 1 || (strGroup = matcher.group(1)) == null) {
                    return false;
                }
                long j5 = CastLongProtector.parseLong(strGroup);
                if (j5 <= 0 || j5 > j4) {
                    return false;
                }
                long jLastModified = new C0VSJ(file, str2).lastModified();
                if (jLastModified <= 0 || jLastModified < j3) {
                    return false;
                }
                return true;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file : fileArrListFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }
}
