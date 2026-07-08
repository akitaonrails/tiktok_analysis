package X;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.zhihu.matisse.internal.entity.Album;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: X.13sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20148813sc extends C20148013sU {
    public static final Uri LJIJI = MediaStore.Files.getContentUri("external");
    public static final String[] LJIJJ = {"_id", "bucket_id", "bucket_display_name", "mime_type", "uri", "count"};
    public static final String[] LJIJJLI = {"_id", "bucket_id", "bucket_display_name", "mime_type", "COUNT(*) AS count"};
    public static final String[] LJIL = {"_id", "bucket_id", "bucket_display_name", "mime_type"};
    public static final String[] LJJ = {String.valueOf(1), String.valueOf(3)};

    @Override // X.C20147913sT
    public final void LJ() {
    }

    @Override // X.AbstractC20147813sS
    public final Cursor LJIIJ() {
        Uri uriLJIILJJIL;
        int i;
        Uri uriLJIILJJIL2;
        int i2;
        Cursor cursorLJIILIIL = super.LJIILIIL();
        String[] strArr = LJIJJ;
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (Build.VERSION.SDK_INT < 29) {
            MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
            if (cursorLJIILIIL != null) {
                i2 = 0;
                while (cursorLJIILIIL.moveToNext()) {
                    long j = cursorLJIILIIL.getLong(cursorLJIILIIL.getColumnIndex("_id"));
                    long j2 = cursorLJIILIIL.getLong(cursorLJIILIIL.getColumnIndex("bucket_id"));
                    String string = cursorLJIILIIL.getString(cursorLJIILIIL.getColumnIndex("bucket_display_name"));
                    String string2 = cursorLJIILIIL.getString(cursorLJIILIIL.getColumnIndex("mime_type"));
                    Uri uriLJIILJJIL3 = LJIILJJIL(cursorLJIILIIL);
                    int i3 = cursorLJIILIIL.getInt(cursorLJIILIIL.getColumnIndex("count"));
                    matrixCursor2.addRow(new String[]{Long.toString(j), Long.toString(j2), string, string2, uriLJIILJJIL3.toString(), String.valueOf(i3)});
                    i2 += i3;
                }
                uriLJIILJJIL2 = cursorLJIILIIL.moveToFirst() ? LJIILJJIL(cursorLJIILIIL) : null;
            } else {
                uriLJIILJJIL2 = null;
                i2 = 0;
            }
            String[] strArr2 = new String[6];
            String str = Album.ALBUM_ID_ALL;
            strArr2[0] = str;
            strArr2[1] = str;
            strArr2[2] = "All";
            strArr2[3] = null;
            strArr2[4] = uriLJIILJJIL2 != null ? uriLJIILJJIL2.toString() : null;
            strArr2[5] = String.valueOf(i2);
            matrixCursor.addRow(strArr2);
            return new MergeCursor(new Cursor[]{matrixCursor, matrixCursor2});
        }
        HashMap map = new HashMap();
        if (cursorLJIILIIL != null) {
            while (cursorLJIILIIL.moveToNext()) {
                long j3 = cursorLJIILIIL.getLong(cursorLJIILIIL.getColumnIndex("bucket_id"));
                Long l = (Long) map.get(Long.valueOf(j3));
                map.put(Long.valueOf(j3), l == null ? 1L : Long.valueOf(l.longValue() + 1));
            }
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(LJIJJ);
        if (cursorLJIILIIL == null || !cursorLJIILIIL.moveToFirst()) {
            uriLJIILJJIL = null;
            i = 0;
        } else {
            uriLJIILJJIL = LJIILJJIL(cursorLJIILIIL);
            HashSet hashSet = new HashSet();
            i = 0;
            do {
                long j4 = cursorLJIILIIL.getLong(cursorLJIILIIL.getColumnIndex("bucket_id"));
                if (!hashSet.contains(Long.valueOf(j4))) {
                    long j5 = cursorLJIILIIL.getLong(cursorLJIILIIL.getColumnIndex("_id"));
                    String string3 = cursorLJIILIIL.getString(cursorLJIILIIL.getColumnIndex("bucket_display_name"));
                    String string4 = cursorLJIILIIL.getString(cursorLJIILIIL.getColumnIndex("mime_type"));
                    Uri uriLJIILJJIL4 = LJIILJJIL(cursorLJIILIIL);
                    long jLongValue = ((Long) map.get(Long.valueOf(j4))).longValue();
                    matrixCursor3.addRow(new String[]{Long.toString(j5), Long.toString(j4), string3, string4, uriLJIILJJIL4.toString(), String.valueOf(jLongValue)});
                    hashSet.add(Long.valueOf(j4));
                    i = (int) (((long) i) + jLongValue);
                }
            } while (cursorLJIILIIL.moveToNext());
        }
        String[] strArr3 = new String[6];
        String str2 = Album.ALBUM_ID_ALL;
        strArr3[0] = str2;
        strArr3[1] = str2;
        strArr3[2] = "All";
        strArr3[3] = null;
        strArr3[4] = uriLJIILJJIL != null ? uriLJIILJJIL.toString() : null;
        strArr3[5] = String.valueOf(i);
        matrixCursor.addRow(strArr3);
        return new MergeCursor(new Cursor[]{matrixCursor, matrixCursor3});
    }

    public static Uri LJIILJJIL(Cursor cursor) {
        Uri contentUri;
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        String string = cursor.getString(cursor.getColumnIndex("mime_type"));
        if (C140W.isImage(string)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (C140W.isVideo(string)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        return ContentUris.withAppendedId(contentUri, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20148813sc(Context context, String str, String[] strArr) {
        String[] strArr2;
        Uri uri = LJIJI;
        if (Build.VERSION.SDK_INT < 29) {
            strArr2 = LJIJJLI;
        } else {
            strArr2 = LJIL;
        }
        super(context, uri, strArr2, str, strArr);
    }
}
