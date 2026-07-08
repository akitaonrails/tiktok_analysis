package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09Mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2359209Mg {
    public static final C2359209Mg LIZ = new C2359209Mg();

    public static C2215208m6 LIZJ() {
        return new C2215208m6(EnumC2358609Ma.CACHE.getToken());
    }

    public static String LIZ(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str2 = options.outMimeType;
        if (str2 != null && str2.length() > 0) {
            return str2;
        }
        return "image";
    }

    public static String LIZIZ(String str) throws Throwable {
        boolean z;
        Object c098200Yq;
        String string;
        Object c098200Yq2;
        Object c098200Yq3;
        String lowerCase;
        boolean z2;
        String mimeTypeFromExtension;
        int columnIndex;
        boolean z3;
        boolean z4;
        boolean z5;
        Cursor cursorLJJJ;
        boolean z6 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "image";
        }
        if (u.LJJIIJZLJL(str, "content://", false)) {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            String str2 = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Uri uri = (Uri) c098200Yq;
            if (uri != null) {
                try {
                    C844470XAv.LIZ.getClass();
                    cursorLJJJ = C2204961BRm.LJJJ(C844470XAv.LIZ().getContentResolver(), UriProtector.parse(str), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAxDAg0EhgGtxkHDIi6XbTnjMSo3n9PfjEtDIfH3w=", null));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    string = null;
                }
                if (cursorLJJJ != null) {
                    if (cursorLJJJ.moveToFirst()) {
                        try {
                            string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_data"));
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            string = null;
                        }
                        cursorLJJJ.close();
                    } else {
                        string = null;
                        cursorLJJJ.close();
                    }
                } else {
                    string = null;
                }
                if (string != null) {
                    if (string.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        string = null;
                    }
                    if (string != null) {
                        LIZ.getClass();
                        String strLIZ = LIZ(string);
                        if (!(!Intrinsics.LJFF(strLIZ, "image"))) {
                            strLIZ = null;
                        }
                        if (strLIZ != null) {
                            return strLIZ;
                        }
                    }
                }
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                String type = contextLIZ.getContentResolver().getType(uri);
                if (type != null) {
                    if (type.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        type = null;
                    }
                    if (type != null) {
                        return type;
                    }
                }
                try {
                    InputStream inputStreamLJ = C09NT.LJ(contextLIZ.getContentResolver(), uri);
                    if (inputStreamLJ != null) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(inputStreamLJ, null, options);
                            c098200Yq2 = options.outMimeType;
                            C2107108Nh.LIZ(inputStreamLJ, null);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = null;
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(inputStreamLJ, th);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    } else {
                        c098200Yq2 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    c098200Yq2 = new C098200Yq(th5);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                String str3 = (String) c098200Yq2;
                if (str3 != null) {
                    if (str3.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        return str3;
                    }
                }
                try {
                    Cursor cursorLJJJ2 = C2204961BRm.LJJJ(contextLIZ.getContentResolver(), uri, new String[]{"_display_name"}, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAxDAg0EhgGtxkHDIi6XbTnjMSo3n9PfjEtDIfH3w=", null));
                    if (cursorLJJJ2 != null) {
                        try {
                            if (cursorLJJJ2.moveToFirst() && (columnIndex = cursorLJJJ2.getColumnIndex("_display_name")) >= 0) {
                                c098200Yq3 = cursorLJJJ2.getString(columnIndex);
                            } else {
                                c098200Yq3 = null;
                            }
                            C2107108Nh.LIZ(cursorLJJJ2, null);
                        } catch (Throwable th6) {
                            th = th6;
                            try {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                } catch (Throwable th7) {
                                    th = th7;
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(cursorLJJJ2, th);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                th = null;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(cursorLJJJ2, th);
                                throw th;
                            }
                        }
                    } else {
                        c098200Yq3 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th9) {
                    TryCatchGuardChecker.doCheck(th9);
                    c098200Yq3 = new C098200Yq(th9);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                    c098200Yq3 = null;
                }
                String str4 = (String) c098200Yq3;
                if (str4 != null) {
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str4);
                    if (fileExtensionFromUrl != null) {
                        lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase != null && lowerCase.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    } else {
                        mimeTypeFromExtension = null;
                    }
                    if (mimeTypeFromExtension != null) {
                        if (mimeTypeFromExtension.length() <= 0) {
                            z6 = false;
                        }
                        if (z6) {
                            str2 = mimeTypeFromExtension;
                        }
                        if (str2 != null) {
                            return str2;
                        }
                    }
                }
            }
            return "image";
        }
        return LIZ(str);
    }
}
