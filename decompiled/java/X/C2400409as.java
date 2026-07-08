package X;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import bytedance.io.BdMediaItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09as, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2400409as {
    public static final String[] LIZ = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "relative_path", "_data", "datetaken", "orientation"};
    public static final String[] LIZIZ = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "_data", "datetaken", "orientation"};
    public static final String[] LIZJ = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "relative_path", "_data", "datetaken", "resolution", "orientation"};
    public static final String[] LIZLLL = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "_data", "datetaken", "resolution"};

    static {
        String.valueOf(1);
        String.valueOf(3);
    }

    public static Uri LIZ(Context context, String str) {
        return LIZIZ(context, str, "image/jpeg");
    }

    public static Uri LIZLLL(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3().getPath());
        sbLIZ.append("/");
        sbLIZ.append(Environment.DIRECTORY_DCIM);
        sbLIZ.append("/Camera");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(Environment.DIRECTORY_DCIM);
        sbLIZ2.append("/Camera/");
        return LJ(context, str, "video/mp4", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static long LJII(Context context, Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new C0VSJ(uri.getPath()).length();
        }
        if ("content".equals(uri.getScheme())) {
            try {
                return C09NT.LIZLLL(context.getContentResolver(), uri, "r").getStatSize();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:50:0x016f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static android.net.Uri LJIIIIZZ(android.content.Context r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2400409as.LJIIIIZZ(android.content.Context, java.lang.String):android.net.Uri");
    }

    public static boolean LJIIIZ(Context context, Uri uri) {
        if (context != null && uri != null) {
            try {
                AssetFileDescriptor assetFileDescriptorLIZIZ = C09NT.LIZIZ(context.getContentResolver(), uri, "r");
                if (assetFileDescriptorLIZIZ == null) {
                    return false;
                }
                try {
                    assetFileDescriptorLIZIZ.close();
                    return true;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            } catch (FileNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    public static void LJIIJ(Context context, String str) throws Throwable {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new C0VSJ(str)));
        C2204961BRm.LJJJJI(context, intent, new C0WZX("diZqWQY7UcnZG14uCzCAS+5JiCtXksBJC4D4PYtE", null));
        C2204961BRm.LJLJJI(context, new String[]{str}, null, null, new C0WZX("diZqWQY7UcnZG14uCzCAS+5JiCtXksBJC4D4PYtE", null));
    }

    public static Uri LIZIZ(Context context, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3().getPath());
        sbLIZ.append("/");
        sbLIZ.append(Environment.DIRECTORY_DCIM);
        sbLIZ.append("/Camera");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(Environment.DIRECTORY_DCIM);
        sbLIZ2.append("/Camera/");
        return LIZJ(context, str, str2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ac, code lost:
    
        if (r3 != null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LJFF(android.content.Context r16, java.lang.String r17, java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2400409as.LJFF(android.content.Context, java.lang.String, java.lang.String):android.net.Uri");
    }

    public static Uri LIZJ(Context context, String str, String str2, String str3) {
        Uri contentUri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3.concat("/");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (C09N0.LIZLLL()) {
            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", C09N0.LJ(C786410Ut5.W3().getPath() + "/" + str3 + "/" + str));
        }
        return C2204961BRm.LJJIJLIJ(context.getContentResolver(), contentUri, contentValues, new C0WZX("diZqWQY7UcnZG14uCzCAS+5JiCtXksBJC4D4PYtE", null));
    }

    public static Uri LJ(Context context, String str, String str2, String str3) {
        Uri contentUri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3.concat("/");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (C09N0.LIZLLL()) {
            contentUri = MediaStore.Video.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", C09N0.LJ(C786410Ut5.W3().getPath() + "/" + str3 + "/" + str));
        }
        return C2204961BRm.LJJIJLIJ(context.getContentResolver(), contentUri, contentValues, new C0WZX("diZqWQY7UcnZG14uCzCAS+5JiCtXksBJC4D4PYtE", null));
    }

    public static List<BdMediaItem> LJI(Context context, String str, String[] strArr, String str2, int i, int i2) {
        boolean z;
        int columnIndexOrThrow;
        String str3 = str2;
        ArrayList arrayList = new ArrayList();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor cursorLJJJ = null;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                z = true;
            } else {
                z = false;
            }
            String[] strArr2 = LIZ;
            if (z) {
                cursorLJJJ = C2204961BRm.LJJIL(context.getContentResolver(), uri, strArr2, C09N0.LIZJ(i, i2, str, str3, strArr), new C0WZX("diZqWQY7UcnZG14uCzCAS+5JiCtXksBJC4D4PYtE", null));
            } else if (C09N0.LIZLLL()) {
                if (i > 0) {
                    str3 = str3 + (" LIMIT " + i + " OFFSET " + i2);
                }
                cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, strArr2, str, strArr, str3, new C0WZX("diZqWQY7UcnZG14uCzCAS+5JiCtXksBJC4D4PYtE", null));
            } else {
                if (i > 0) {
                    str3 = str3 + (" LIMIT " + i + " OFFSET " + i2);
                }
                cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, LIZIZ, str, strArr, str3, new C0WZX("diZqWQY7UcnZG14uCzCAS+5JiCtXksBJC4D4PYtE", null));
            }
            if (cursorLJJJ == null) {
                return arrayList;
            }
            int columnIndexOrThrow2 = cursorLJJJ.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow3 = cursorLJJJ.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow4 = cursorLJJJ.getColumnIndexOrThrow("date_modified");
            int columnIndexOrThrow5 = cursorLJJJ.getColumnIndexOrThrow("date_added");
            int columnIndexOrThrow6 = cursorLJJJ.getColumnIndexOrThrow("mime_type");
            int columnIndexOrThrow7 = cursorLJJJ.getColumnIndexOrThrow("_size");
            int columnIndexOrThrow8 = cursorLJJJ.getColumnIndexOrThrow("width");
            int columnIndexOrThrow9 = cursorLJJJ.getColumnIndexOrThrow("height");
            int columnIndexOrThrow10 = cursorLJJJ.getColumnIndexOrThrow("datetaken");
            int columnIndexOrThrow11 = cursorLJJJ.getColumnIndexOrThrow("orientation");
            if (C09N0.LIZLLL()) {
                columnIndexOrThrow = cursorLJJJ.getColumnIndexOrThrow("relative_path");
            } else {
                columnIndexOrThrow = -1;
            }
            int columnIndexOrThrow12 = cursorLJJJ.getColumnIndexOrThrow("_data");
            int length = (C786410Ut5.W3().getPath() + "/").length();
            while (cursorLJJJ.moveToNext()) {
                BdMediaItem bdMediaItem = new BdMediaItem();
                long j = cursorLJJJ.getLong(columnIndexOrThrow2);
                bdMediaItem.id = j;
                bdMediaItem.name = cursorLJJJ.getString(columnIndexOrThrow3);
                bdMediaItem.modify = cursorLJJJ.getLong(columnIndexOrThrow4);
                bdMediaItem.dateAdded = cursorLJJJ.getLong(columnIndexOrThrow5);
                bdMediaItem.mimeType = cursorLJJJ.getString(columnIndexOrThrow6);
                bdMediaItem.fileSize = cursorLJJJ.getLong(columnIndexOrThrow7);
                bdMediaItem.width = cursorLJJJ.getInt(columnIndexOrThrow8);
                bdMediaItem.height = cursorLJJJ.getInt(columnIndexOrThrow9);
                bdMediaItem.dateToken = cursorLJJJ.getLong(columnIndexOrThrow10);
                bdMediaItem.orientation = cursorLJJJ.getInt(columnIndexOrThrow11);
                if (C09N0.LIZLLL()) {
                    String string = cursorLJJJ.getString(columnIndexOrThrow);
                    if (string == null) {
                        String string2 = cursorLJJJ.getString(columnIndexOrThrow12);
                        String str4 = File.separator;
                        try {
                            string = string2.substring(length, string2.lastIndexOf(str4)) + str4;
                        } catch (IndexOutOfBoundsException e) {
                            TryCatchGuardChecker.doCheck(e);
                            bdMediaItem.relativePath = "";
                        }
                    }
                    bdMediaItem.relativePath = string;
                } else {
                    String string3 = cursorLJJJ.getString(columnIndexOrThrow12);
                    String str5 = File.separator;
                    try {
                        bdMediaItem.relativePath = string3.substring(length, string3.lastIndexOf(str5)) + str5;
                    } catch (IndexOutOfBoundsException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        bdMediaItem.relativePath = "";
                    }
                }
                bdMediaItem.uri = ContentUris.withAppendedId(uri, j);
                arrayList.add(bdMediaItem);
            }
            cursorLJJJ.close();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorLJJJ != null) {
                cursorLJJJ.close();
            }
            throw th;
        }
    }
}
