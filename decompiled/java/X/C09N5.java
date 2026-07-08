package X;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.09N5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09N5 {
    public static final List<String> LIZ = Arrays.asList("com.kuaishou.nebula.fileprovider", "com.kwai.videoeditor.kyfileprovider", "com.lemon.lvoverseas.provider", "com.lwcx.lw121.fileprovider", "com.zivn.cloudbrush3.utilcode.provider", "com.tencent.mtt.fileprovider", "com.campmobile.snowcamera.fileprovider", "com.android.fileexplorer.myprovider", "com.ifeimo.videoeditor.provider", "com.mi.android.globalFileexplorer.myprovider");
    public static final List<String> LIZIZ = Arrays.asList("com.jk.cutout.application", "com.zone2345.fileprovider", "com.mobile.kadian.fileprovider");

    public static String LIZ(Context context, Uri uri) {
        Uri uriWithAppendedId;
        Uri uri2 = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            if ("http".equals(scheme)) {
                return uri.toString();
            }
            if ("content".equals(scheme) && "media".equals(uri.getAuthority())) {
                return LIZIZ(context, uri, null, null);
            }
            if (DocumentsContract.isDocumentUri(context, uri)) {
                if (TextUtils.equals("com.android.externalstorage.documents", uri.getAuthority())) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C786410Ut5.W3());
                        sbLIZ.append("/");
                        sbLIZ.append(strArrSplit[1]);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                } else {
                    if (TextUtils.equals("com.android.providers.downloads.documents", uri.getAuthority())) {
                        String documentId = DocumentsContract.getDocumentId(uri);
                        if (documentId != null && documentId.startsWith("raw:")) {
                            return documentId.substring(4);
                        }
                        if (Build.VERSION.SDK_INT < 26) {
                            uriWithAppendedId = ContentUris.withAppendedId(UriProtector.parse("content://downloads/public_downloads"), CastLongProtector.valueOf(documentId).longValue());
                        } else {
                            uriWithAppendedId = uri;
                        }
                        String strLIZIZ = LIZIZ(context, uriWithAppendedId, null, null);
                        if (strLIZIZ == null) {
                            try {
                                String absolutePath = new C0VSJ(C786410Ut5.w2(context), "uri_tmp").getAbsolutePath();
                                ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(context.getContentResolver(), uri, "r");
                                if (parcelFileDescriptorLIZLLL == null) {
                                    return null;
                                }
                                C0VSP c0vsp = new C0VSP(parcelFileDescriptorLIZLLL.getFileDescriptor());
                                C0VSV c0vsv = new C0VSV(absolutePath);
                                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                                while (true) {
                                    int i = c0vsp.read(bArr);
                                    if (i != -1) {
                                        c0vsv.write(bArr, 0, i);
                                    } else {
                                        c0vsp.close();
                                        c0vsv.close();
                                        return new C0VSJ(absolutePath).getAbsolutePath();
                                    }
                                }
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        return strLIZIZ;
                    }
                    if (TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
                        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                        String str = strArrSplit2[0];
                        if (TextUtils.equals("image", str)) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if (TextUtils.equals("video", str)) {
                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else if (TextUtils.equals("audio", str)) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        return LIZIZ(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                    }
                }
            }
            if ("content".equals(scheme)) {
                context.getContentResolver();
                if ("com.google.android.apps.photos.contentprovider".equals(uri.getAuthority())) {
                    try {
                        String path = uri.getPath();
                        if (path.contains("mediakey")) {
                            return LIZJ(context, uri);
                        }
                        int iLastIndexOf = path.lastIndexOf("/ORIGINAL");
                        if (iLastIndexOf < 0) {
                            iLastIndexOf = path.lastIndexOf("/ACTUAL");
                        }
                        if (iLastIndexOf < 0) {
                            return null;
                        }
                        return LIZIZ(context, UriProtector.parse(path.substring(path.indexOf("content"), path.lastIndexOf("/ORIGINAL"))), null, null);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return null;
                    }
                }
                if (LIZ.contains(uri.getAuthority())) {
                    if (!TextUtils.isEmpty(uri.getPath())) {
                        ArrayList<String> arrayList = new ArrayList(uri.getPathSegments());
                        ListProtector.remove(arrayList, 0);
                        StringBuilder sb = new StringBuilder(C786410Ut5.W3().getAbsolutePath());
                        for (String str2 : arrayList) {
                            sb.append("/");
                            sb.append(str2);
                        }
                        return sb.toString();
                    }
                } else if (LIZIZ.contains(uri.getAuthority())) {
                    String path2 = uri.getPath();
                    if (!TextUtils.isEmpty(path2)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(C786410Ut5.W3().getAbsolutePath());
                        sbLIZ2.append(path2);
                        return C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                String lastPathSegment = uri.getLastPathSegment();
                if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.startsWith("/storage/emulated/")) {
                    return lastPathSegment;
                }
                if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.contains(":")) {
                    lastPathSegment = lastPathSegment.split(":")[1];
                }
                if (TextUtils.isDigitsOnly(lastPathSegment)) {
                    return LIZIZ(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id= ?", new String[]{lastPathSegment});
                }
            }
            return null;
        }
        return uri.getPath();
    }

    public static String LIZJ(Context context, Uri uri) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        C0VSP c0vsp;
        BufferedInputStream bufferedInputStream;
        C0VSJ c0vsj;
        ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(context.getContentResolver(), uri, "r");
        C0VSP c0vsp2 = null;
        if (parcelFileDescriptorLIZLLL == null) {
            return null;
        }
        try {
            c0vsp = new C0VSP(parcelFileDescriptorLIZLLL.getFileDescriptor());
            try {
                bufferedInputStream = new BufferedInputStream(c0vsp);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uri.getPath().substring(uri.getPath().lastIndexOf("/")));
                sbLIZ.append(".jpg");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0VSJ c0vsj2 = new C0VSJ(C786410Ut5.w2(context), "uritemp");
                if (!c0vsj2.exists()) {
                    c0vsj2.mkdirs();
                }
                c0vsj = new C0VSJ(c0vsj2, strLIZIZ);
                bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj));
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    bufferedOutputStream.write(bArr, 0, i);
                } else {
                    c0vsp.close();
                    bufferedOutputStream.close();
                    return c0vsj.getAbsolutePath();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c0vsp2 = c0vsp;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (c0vsp2 != null) {
                c0vsp2.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) throws java.lang.Throwable {
        /*
            java.lang.String r2 = "_data"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            r8 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            X.0WZX r9 = new X.0WZX     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            java.lang.String r0 = "diZqWQY7UcnZG0I1TB7KROR+D2lgyCjgBPk="
            r9.<init>(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            r7 = r12
            r6 = r11
            r4 = r10
            android.database.Cursor r1 = X.C2204961BRm.LJJJ(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.Throwable -> L43
            if (r1 == 0) goto L37
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            if (r0 == 0) goto L37
            int r0 = r1.getColumnIndexOrThrow(r2)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.Throwable -> L3d
            r1.close()
            return r0
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            r1 = r8
        L31:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3c
            goto L39
        L37:
            if (r1 == 0) goto L3c
        L39:
            r1.close()
        L3c:
            return r8
        L3d:
            r0 = move-exception
            r8 = r1
        L3f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r0 = move-exception
            goto L3f
        L45:
            if (r8 == 0) goto L4a
            r8.close()
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09N5.LIZIZ(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
