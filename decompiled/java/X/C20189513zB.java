package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13zB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20189513zB {
    public static Function1<? super List<C1852750yJV>, Unit> LIZJ;
    public static Uri LJ;
    public static final C20189513zB LIZ = new C20189513zB();
    public static final String[] LIZIZ = {"image/jpg", "image/jpeg", "image/png", "image/webp"};
    public static String LIZLLL = "";

    public static String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        if (u.LJJIIJZLJL(str, "file://", false)) {
            return str.substring(7);
        }
        if (u.LJJIIJZLJL(str, "content://", false)) {
            C844470XAv.LIZ.getClass();
            return C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(str));
        }
        return str;
    }

    public static C1852730yJT LJ(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int iLJFF = new C2259271Dbp(str).LJFF(1);
        if (iLJFF == 6 || iLJFF == 8) {
            i2 = i;
            i = i2;
        }
        return new C1852730yJT(new C0VSJ(str).length(), options.outMimeType, i2, i);
    }

    public static int LJI(String str) {
        if (Intrinsics.LJFF(str, "homework")) {
            return 2;
        }
        C1855940yOe.LIZ.getClass();
        return C1855940yOe.LIZ();
    }

    public static String LIZJ(Context context, String str) {
        Cursor cursorLJJJ;
        C0VSV c0vsv;
        InputStream inputStreamLJ;
        int columnIndexOrThrow;
        String strLJJIFFI;
        boolean z;
        if (str == null) {
            return "";
        }
        boolean z2 = false;
        if (!u.LJJIIJZLJL(str, "content://", false)) {
            return LIZIZ(str);
        }
        String path = C786410Ut5.W3().getPath();
        Cursor cursor = null;
        str = null;
        str = null;
        InputStream inputStream = null;
        String str2 = null;
        try {
            try {
                cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), Uri.parse(str), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6hxTHGwY3EsTE1ymQnkjy8CFhuIfLqntbAV0ilQ==", null));
            } catch (Exception e) {
                e = e;
                cursorLJJJ = null;
            }
            if (cursorLJJJ == null) {
                return "";
            }
            try {
                try {
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
                        String str3 = File.separator;
                        if (!u.LJIIZILJ(strLJJIFFI, str3, false)) {
                            string = str3 + string;
                        }
                        sb.append(string);
                        String string2 = sb.toString();
                        if (string2.length() <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            String strLJ = C09N0.LJ(path + str3 + string2);
                            C2260008tK.LIZ(cursorLJJJ);
                            return strLJ;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
                C2260008tK.LIZ(cursorLJJJ);
                String strLIZIZ = LIZIZ(str);
                if (C123100dR.LIZ(strLIZIZ) && C2137908Zd.LIZJ.LJFF(strLIZIZ)) {
                    return strLIZIZ;
                }
                Uri uri = UriProtector.parse(str);
                C1864400ycI.LIZ.getClass();
                String strLIZIZ2 = C1864400ycI.LIZIZ("");
                if (strLIZIZ2.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    try {
                        inputStreamLJ = C09NT.LJ(context.getContentResolver(), uri);
                        if (inputStreamLJ != null) {
                            try {
                                c0vsv = new C0VSV(new C0VSJ(strLIZIZ2));
                                try {
                                    try {
                                        C2106208My.LIZ(inputStreamLJ, c0vsv);
                                        C2260008tK.LIZ(inputStreamLJ);
                                        C2260008tK.LIZ(c0vsv);
                                        str2 = strLIZIZ2;
                                    } catch (Exception e3) {
                                        e = e3;
                                        TryCatchGuardChecker.doCheck(e);
                                        C2260008tK.LIZ(inputStreamLJ);
                                        C2260008tK.LIZ(c0vsv);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = inputStreamLJ;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            C2260008tK.LIZ(inputStream);
                                            C2260008tK.LIZ(c0vsv);
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                c0vsv = null;
                            } catch (Throwable th3) {
                                th = th3;
                                c0vsv = null;
                                inputStream = inputStreamLJ;
                                while (true) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2260008tK.LIZ(inputStream);
                                    C2260008tK.LIZ(c0vsv);
                                    throw th;
                                }
                            }
                        } else {
                            C2260008tK.LIZ(inputStreamLJ);
                        }
                    } catch (Exception e5) {
                        e = e5;
                        inputStreamLJ = null;
                        c0vsv = null;
                    } catch (Throwable th4) {
                        th = th4;
                        c0vsv = null;
                    }
                }
                if (str2 == null) {
                    return "";
                }
                return str2;
            } catch (Throwable th5) {
                th = th5;
                cursor = cursorLJJJ;
                TryCatchGuardChecker.doCheck(th);
                C2260008tK.LIZ(cursor);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static Uri LIZLLL(Context context, C0VSJ c0vsj) {
        if (Build.VERSION.SDK_INT >= 24 && context.getApplicationInfo().targetSdkVersion >= 24) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append(".fileprovider");
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, C2188811AlT.LIZIZ(sbLIZ), c0vsj);
        }
        return Uri.fromFile(c0vsj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0yJT] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0yJT] */
    public static C1852730yJT LJFF(Context context, String str) {
        C259800zU c259800zU = new C259800zU();
        ?? c1852730yJT = new C1852730yJT(0);
        c259800zU.element = c1852730yJT;
        if (context == null) {
            return c1852730yJT;
        }
        String strLIZJ = LIZJ(context, str);
        if (C123100dR.LIZ(strLIZJ) && C2137908Zd.LIZJ.LJFF(strLIZJ)) {
            c259800zU.element = LJ(strLIZJ);
        }
        return (C1852730yJT) c259800zU.element;
    }

    public static void LJIIIIZZ(int i, Activity activity, Function1 function1) {
        if (activity == null) {
            return;
        }
        C449180HjQ c449180HjQ = C449180HjQ.LIZ;
        C20189813zE c20189813zE = new C20189813zE(i, activity, function1);
        c449180HjQ.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
            TokenCert tokenCertWith = TokenCert.Companion.with("bpea-tako_image_uplad_request_permission_photo_album_read");
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            String str = strArr[0];
            c19741112Lp.getClass();
            if (C19741112Lp.LIZLLL(activity, str)) {
                c20189813zE.invoke(Boolean.TRUE);
                return;
            } else if (C19741112Lp.LJI(activity, strArr[0], false)) {
                C449180HjQ.LIZIZ(activity);
                c20189813zE.invoke(Boolean.FALSE);
                return;
            } else {
                C19514711Wn.LIZIZ.LIZIZ(activity, tokenCertWith).LIZIZ((String[]) Arrays.copyOf(strArr, 1)).LIZJ(new C462970IDn(activity, c20189813zE, 3));
                return;
            }
        }
        c20189813zE.invoke(Boolean.TRUE);
    }

    public final void LJII(int i, int i2, Context context, Intent intent) {
        Uri data;
        switch (i) {
            case 40003:
                if (i2 == -1) {
                    ArrayList arrayList = new ArrayList();
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (intent != null) {
                            ClipData clipData = intent.getClipData();
                            if (clipData != null) {
                                int itemCount = clipData.getItemCount();
                                for (int i3 = 0; i3 < itemCount; i3++) {
                                    arrayList.add(LIZ(this, context, C2204961BRm.LJJIIZ(clipData, i3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6hxTHGwY3EsTE1ymQnkjy8CFhuIfLqntbAV0ilQ==", null)).getUri(), null, "album", 4));
                                }
                            } else if (intent != null && intent.getData() != null) {
                                arrayList.add(LIZ(this, context, intent.getData(), null, "album", 4));
                            }
                        }
                    } else {
                        if (intent != null) {
                            data = intent.getData();
                        } else {
                            data = null;
                        }
                        arrayList.add(LIZ(this, context, data, null, "album", 4));
                    }
                    Function1<? super List<C1852750yJV>, Unit> function1 = LIZJ;
                    if (function1 != null) {
                        function1.invoke(arrayList);
                    }
                } else {
                    Function1<? super List<C1852750yJV>, Unit> function12 = LIZJ;
                    if (function12 != null) {
                        function12.invoke(Collections.singletonList(new C1852750yJV(4, null)));
                    }
                }
                LIZJ = null;
                break;
            case 40004:
                if (i2 == -1) {
                    C1852750yJV c1852750yJVLIZ = LIZ(this, context, null, LIZLLL, "shoot", 2);
                    Function1<? super List<C1852750yJV>, Unit> function13 = LIZJ;
                    if (function13 != null) {
                        function13.invoke(Collections.singletonList(c1852750yJVLIZ));
                    }
                } else {
                    Function1<? super List<C1852750yJV>, Unit> function14 = LIZJ;
                    if (function14 != null) {
                        function14.invoke(Collections.singletonList(new C1852750yJV(4, null)));
                    }
                }
                LIZJ = null;
                break;
        }
        LJ = null;
        LIZLLL = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0175  */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1852750yJV LIZ(X.C20189513zB r24, android.content.Context r25, android.net.Uri r26, java.lang.String r27, java.lang.String r28, int r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20189513zB.LIZ(X.13zB, android.content.Context, android.net.Uri, java.lang.String, java.lang.String, int):X.0yJV");
    }
}
