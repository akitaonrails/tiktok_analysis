package X;

import java.io.File;

/* JADX INFO: renamed from: X.08Oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2109708Oh {
    public static String LIZ(File file) {
        if (file.getName().endsWith(".apk")) {
            String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            if (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) {
                return "";
            }
            if (strReplaceFirst.startsWith("base-")) {
                return strReplaceFirst.replace("base-", "config.");
            }
            return strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }
}
