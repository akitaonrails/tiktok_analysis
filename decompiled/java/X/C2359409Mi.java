package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09Mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2359409Mi {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str == null) {
            return null;
        }
        if (u.LJJIIJZLJL(str, "file://", false)) {
            return str.substring(7);
        }
        if (u.LJJIIJZLJL(str, "content://", false)) {
            C0I0B.LJFF.LIZJ();
            return C09N5.LIZ(C894660Z7w.LIZ(), UriProtector.parse(str));
        }
        return str;
    }

    public static String LIZJ(String str) {
        if (str != null && str.length() != 0) {
            if (u.LJJIIJZLJL(str, "file:", false)) {
                return a0.LJJJJZ("file:", str);
            }
            return str;
        }
        return null;
    }

    public static boolean LIZLLL(String str) {
        try {
            String strLIZJ = LIZJ(str);
            if (strLIZJ == null) {
                return false;
            }
            if (LJ(strLIZJ)) {
                return new C0VSJ(strLIZJ).exists();
            }
            return C2400409as.LJIIIZ(C894660Z7w.LIZ(), UriProtector.parse(strLIZJ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LJ(String str) {
        if (str != null && str.length() != 0) {
            if (u.LJJIIJZLJL(str, "/", false) || u.LJJIIJZLJL(str, "file:", false)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String LIZIZ(Context context, String str) {
        int columnIndexOrThrow;
        String strLJJIFFI;
        if (str == null) {
            return "";
        }
        boolean z = false;
        if (!u.LJJIIJZLJL(str, "content://", false)) {
            return LIZ(str);
        }
        String path = C786410Ut5.W3().getPath();
        Cursor cursorLJJJ = null;
        try {
            try {
                cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), Uri.parse(str), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhY29BlECbVL/HHV", null));
                if (cursorLJJJ == null) {
                    return "";
                }
                int columnIndexOrThrow2 = cursorLJJJ.getColumnIndexOrThrow("_display_name");
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    columnIndexOrThrow = cursorLJJJ.getColumnIndexOrThrow("relative_path");
                } else {
                    columnIndexOrThrow = cursorLJJJ.getColumnIndexOrThrow("_data");
                }
                if (cursorLJJJ.moveToFirst()) {
                    String string = cursorLJJJ.getString(columnIndexOrThrow2);
                    if (string == null) {
                        string = "";
                    }
                    if (i < 29) {
                        strLJJIFFI = u.LJJIFFI(u.LJJIFFI(cursorLJJJ.getString(columnIndexOrThrow), path + File.separator, "", false), string, "", false);
                    } else {
                        strLJJIFFI = cursorLJJJ.getString(columnIndexOrThrow);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(strLJJIFFI);
                    String str2 = File.separator;
                    if (!u.LJIIZILJ(strLJJIFFI, str2, false)) {
                        string = str2 + string;
                    }
                    sb.append(string);
                    String string2 = sb.toString();
                    if (string2.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        String strLJ = C09N0.LJ(path + str2 + string2);
                        C2260008tK.LIZ(cursorLJJJ);
                        return strLJ;
                    }
                }
                C2260008tK.LIZ(cursorLJJJ);
                return "";
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String strLIZ = LIZ(str);
                C2260008tK.LIZ(cursorLJJJ);
                return strLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2260008tK.LIZ(cursorLJJJ);
            throw th;
        }
        TryCatchGuardChecker.doCheck(th);
        C2260008tK.LIZ(cursorLJJJ);
        throw th;
    }
}
