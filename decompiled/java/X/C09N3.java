package X;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: X.09N3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09N3 {
    public static C0VSJ LIZIZ(Context context, Uri uri) throws Throwable {
        int iLastIndexOf;
        Cursor cursorLJJJ;
        String path = null;
        path = null;
        Uri uri2 = null;
        path = null;
        path = null;
        String path2 = null;
        path = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    path = C786410Ut5.W3() + "/" + strArrSplit[1];
                }
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                path = LIZ(context, ContentUris.withAppendedId(UriProtector.parse("content://downloads/public_downloads"), CastLongProtector.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
            } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = strArrSplit2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                path = LIZ(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
            } else if (uri.getAuthority().equalsIgnoreCase("com.google.android.apps.docs.storage")) {
                DocumentsContract.getDocumentId(uri).split(";");
                InputStream inputStreamLJ = C09NT.LJ(context.getContentResolver(), uri);
                int iAvailable = inputStreamLJ.available();
                if (uri.getScheme().equals("content") && (cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmM0OR9b31HAT/ymTVeFAF0=", null))) != null) {
                    try {
                        if (cursorLJJJ.moveToFirst()) {
                            path2 = cursorLJJJ.getString(cursorLJJJ.getColumnIndex("_display_name"));
                        }
                        cursorLJJJ.close();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLJJJ.close();
                        throw th;
                    }
                }
                if (path2 == null && (iLastIndexOf = (path2 = uri.getPath()).lastIndexOf(47)) != -1) {
                    path2 = path2.substring(iLastIndexOf + 1);
                }
                C0VSJ c0vsj = new C0VSJ(C786410Ut5.W3().getAbsolutePath(), path2);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamLJ);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV((File) c0vsj, false));
                byte[] bArr = new byte[iAvailable];
                bufferedInputStream.read(bArr);
                do {
                    bufferedOutputStream.write(bArr);
                } while (bufferedInputStream.read(bArr) != -1);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return c0vsj;
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            path = LIZ(context, uri, null, null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            path = uri.getPath();
        }
        return new C0VSJ(path);
    }

    public static String LIZ(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, new String[]{"_data"}, str, strArr, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxgZXmM0OR9b31HAT/ymTVeFAF0=", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        String string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_data"));
                        cursorLJJJ.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorLJJJ;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorLJJJ != null) {
                cursorLJJJ.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
