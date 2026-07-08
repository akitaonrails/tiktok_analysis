package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09N2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09N2 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3 A[Catch: IOException -> 0x00f6, TRY_ENTER, TryCatch #3 {IOException -> 0x00f6, blocks: (B:43:0x00b2, B:44:0x00b5, B:46:0x00ba, B:48:0x00bf, B:66:0x00e3, B:68:0x00e8, B:70:0x00ed, B:72:0x00f2), top: B:98:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8 A[Catch: IOException -> 0x00f6, TryCatch #3 {IOException -> 0x00f6, blocks: (B:43:0x00b2, B:44:0x00b5, B:46:0x00ba, B:48:0x00bf, B:66:0x00e3, B:68:0x00e8, B:70:0x00ed, B:72:0x00f2), top: B:98:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed A[Catch: IOException -> 0x00f6, TryCatch #3 {IOException -> 0x00f6, blocks: (B:43:0x00b2, B:44:0x00b5, B:46:0x00ba, B:48:0x00bf, B:66:0x00e3, B:68:0x00e8, B:70:0x00ed, B:72:0x00f2), top: B:98:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2 A[Catch: IOException -> 0x00f6, TRY_LEAVE, TryCatch #3 {IOException -> 0x00f6, blocks: (B:43:0x00b2, B:44:0x00b5, B:46:0x00ba, B:48:0x00bf, B:66:0x00e3, B:68:0x00e8, B:70:0x00ed, B:72:0x00f2), top: B:98:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d A[Catch: IOException -> 0x011b, TryCatch #10 {IOException -> 0x011b, blocks: (B:83:0x0108, B:85:0x010d, B:87:0x0112, B:89:0x0117), top: B:103:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112 A[Catch: IOException -> 0x011b, TryCatch #10 {IOException -> 0x011b, blocks: (B:83:0x0108, B:85:0x010d, B:87:0x0112, B:89:0x0117), top: B:103:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117 A[Catch: IOException -> 0x011b, TRY_LEAVE, TryCatch #10 {IOException -> 0x011b, blocks: (B:83:0x0108, B:85:0x010d, B:87:0x0112, B:89:0x0117), top: B:103:0x0108 }] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.0VSV, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09N2.LIZIZ(java.lang.String):java.lang.String");
    }

    public static Uri LIZJ(Uri uri) {
        Uri contentUri;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(DocumentsContract.getDocumentId(uri), new String[]{":"}, 0, 6);
        String str = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
        if (TextUtils.equals("image", str)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            if (C09N0.LIZLLL()) {
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
            }
        } else if (TextUtils.equals("video", str)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            if (C09N0.LIZLLL()) {
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
            }
        } else if (TextUtils.equals("audio", str)) {
            contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            if (C09N0.LIZLLL()) {
                contentUri = MediaStore.Audio.Media.getContentUri("external_primary");
            }
        } else {
            contentUri = null;
        }
        if (TextUtils.isEmpty((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1))) {
            return null;
        }
        return ContentUris.withAppendedId(contentUri, CastLongProtector.parseLong((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Long, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static Long LIZ(Context context, Uri uri) throws Throwable {
        ?? LJJJ;
        ParcelFileDescriptor parcelFileDescriptorLIZLLL;
        Uri uriLIZJ = uri;
        ?? ValueOf = 0;
        ValueOf = 0;
        ValueOf = 0;
        ValueOf = 0;
        if (DocumentsContract.isDocumentUri(context, uriLIZJ) && TextUtils.equals("com.android.providers.media.documents", uriLIZJ.getAuthority())) {
            uriLIZJ = LIZJ(uriLIZJ);
            if (uriLIZJ == null) {
                return null;
            }
        } else if (!TextUtils.equals("media", uriLIZJ.getAuthority())) {
            try {
                return Long.valueOf(new C0VSJ(C09N5.LIZ(context, uriLIZJ)).length());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        if (context != null) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver != null && (parcelFileDescriptorLIZLLL = C09NT.LIZLLL(contentResolver, uriLIZJ, "r")) != null) {
                    ValueOf = Long.valueOf(parcelFileDescriptorLIZLLL.getStatSize());
                    return ValueOf;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                try {
                    ContentResolver contentResolver2 = context.getContentResolver();
                    if (contentResolver2 != null) {
                        LJJJ = C2204961BRm.LJJJ(contentResolver2, uriLIZJ, new String[]{"_size"}, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLYra1T6B8EbyXMEdGKNeakT5yA==", ValueOf));
                    } else {
                        LJJJ = ValueOf;
                    }
                    if (LJJJ != 0) {
                        LJJJ.moveToFirst();
                    }
                    if (LJJJ != 0) {
                        ValueOf = Long.valueOf(LJJJ.getColumnIndex("_size"));
                        return ValueOf;
                    }
                    return ValueOf;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
        return ValueOf;
    }
}
