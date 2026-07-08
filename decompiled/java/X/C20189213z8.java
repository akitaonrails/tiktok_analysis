package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig;
import com.ss.bduploader.BDImageXUploader;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13z8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20189213z8 implements InterfaceC1856420yPQ {
    public boolean LIZ;
    public final BDImageXUploader LIZIZ;

    @Override // X.InterfaceC1856420yPQ
    public final void close() {
        if (this.LIZ) {
            return;
        }
        this.LIZIZ.close();
        this.LIZ = true;
    }

    public C20189213z8(TakoImageUploadAuthConfig takoImageUploadAuthConfig) {
        String str;
        String str2;
        String str3;
        String str4;
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        if (takoImageUploadAuthConfig != null) {
            str = takoImageUploadAuthConfig.domain;
        } else {
            str = null;
        }
        bDImageXUploader.setUploadDomain(str);
        if (takoImageUploadAuthConfig != null) {
            str2 = takoImageUploadAuthConfig.accessKeyId;
        } else {
            str2 = null;
        }
        bDImageXUploader.setTopAccessKey(str2);
        if (takoImageUploadAuthConfig != null) {
            str3 = takoImageUploadAuthConfig.secretAccessKey;
        } else {
            str3 = null;
        }
        bDImageXUploader.setTopSecretKey(str3);
        if (takoImageUploadAuthConfig != null) {
            str4 = takoImageUploadAuthConfig.sessionToken;
        } else {
            str4 = null;
        }
        bDImageXUploader.setTopSessionToken(str4);
        bDImageXUploader.setServiceID(takoImageUploadAuthConfig != null ? takoImageUploadAuthConfig.serviceId : null);
        bDImageXUploader.setOpenBoe(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe());
        bDImageXUploader.setFileRetryCount(2);
        bDImageXUploader.setRWTimeout(10);
        bDImageXUploader.setEnableHttps(1);
        bDImageXUploader.setMaxFailTime(5);
        this.LIZIZ = bDImageXUploader;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r3) {
        /*
            if (r3 == 0) goto Le
            int r0 = r3.length()
            if (r0 == 0) goto Le
            r0 = 0
        L9:
            java.lang.String r2 = ".bin"
            if (r0 == 0) goto L10
            return r2
        Le:
            r0 = 1
            goto L9
        L10:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r3.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1487394660: goto L1e;
                case -1487018032: goto L29;
                case -879267568: goto L34;
                case -879258763: goto L3f;
                case 1331848029: goto L4a;
                default: goto L1d;
            }
        L1d:
            return r2
        L1e:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.String r2 = ".jpg"
            return r2
        L29:
            java.lang.String r0 = "image/webp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.String r2 = ".webp"
            return r2
        L34:
            java.lang.String r0 = "image/gif"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.String r2 = ".gif"
            return r2
        L3f:
            java.lang.String r0 = "image/png"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.String r2 = ".png"
            return r2
        L4a:
            java.lang.String r0 = "video/mp4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.String r2 = ".mp4"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20189213z8.LIZJ(java.lang.String):java.lang.String");
    }

    public static String LIZLLL(BaseImage baseImage) {
        double dLongValue;
        h hVar = new h();
        try {
            n nVar = new n();
            nVar.LJJIII(Integer.valueOf(baseImage.width), "width");
            nVar.LJJIII(Integer.valueOf(baseImage.height), "height");
            Long l = baseImage.originalFileSize;
            double dLongValue2 = 0.0d;
            if (l != null) {
                dLongValue = l.longValue();
            } else {
                dLongValue = 0.0d;
            }
            nVar.LJJIII(Double.valueOf(dLongValue / 1048576.0d), "size");
            Long l2 = baseImage.compressedFileSize;
            if (l2 != null) {
                dLongValue2 = l2.longValue();
            }
            nVar.LJJIII(Double.valueOf(dLongValue2 / 1048576.0d), "compressed_size");
            hVar.LJJIFFI(nVar);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return hVar.toString();
    }

    public static String LIZIZ(Context context, Uri uri) {
        boolean z;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String strLJ = LJ(contentResolver, uri);
            if (strLJ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("picker_");
                sbLIZ.append(System.currentTimeMillis());
                strLJ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (a0.LJJLJ('.', strLJ, "").length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJ);
                sbLIZ2.append(LIZJ(contentResolver.getType(uri)));
                strLJ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(context), strLJ);
            InputStream inputStreamLJ = C09NT.LJ(contentResolver, uri);
            if (inputStreamLJ == null) {
                return null;
            }
            try {
                C0VSV c0vsv = new C0VSV(c0vsj);
                try {
                    C2106208My.LIZ(inputStreamLJ, c0vsv);
                    C2107108Nh.LIZ(c0vsv, null);
                    C2107108Nh.LIZ(inputStreamLJ, null);
                    return c0vsj.getAbsolutePath();
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                            }
                        }
                    } catch (Throwable th2) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(inputStreamLJ, th);
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LJ(ContentResolver contentResolver, Uri uri) {
        Object c098200Yq;
        Object obj = null;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, new String[]{"_display_name"}, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3z0QFIsnmy9zutlHwjhg8GWzgNEGyy8jC7Rm+93g", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        c098200Yq = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_display_name"));
                    } else {
                        c098200Yq = null;
                    }
                    C2107108Nh.LIZ(cursorLJJJ, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                    }
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(cursorLJJJ, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                }
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static String LJFF(Context context, Uri uri, String str, String[] strArr) {
        Object c098200Yq;
        int columnIndex;
        Object obj = null;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, new String[]{"_data"}, str, strArr, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3z0QFIsnmy9zutlHwjhg8GWzgNEGyy8jC7Rm+93g", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst() && (columnIndex = cursorLJJJ.getColumnIndex("_data")) >= 0) {
                        c098200Yq = cursorLJJJ.getString(columnIndex);
                    } else {
                        c098200Yq = null;
                    }
                    C2107108Nh.LIZ(cursorLJJJ, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(cursorLJJJ, th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = null;
                    }
                }
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    @Override // X.InterfaceC1856420yPQ
    public final void LIZ(String str, List<BaseImage> list, String str2, InterfaceC20189313z9 interfaceC20189313z9) {
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<BaseImage> it2 = list.iterator();
        while (true) {
            String str4 = "";
            if (!it2.hasNext()) {
                break;
            }
            BaseImage next = it2.next();
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            if (str != null) {
                str4 = str;
            }
            int iIndexOf = list.indexOf(next);
            String strLIZLLL = LIZLLL(next);
            c1862330yYx.getClass();
            try {
                C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("image_index", iIndexOf);
                jSONObject.put("message_id", str4);
                jSONObject.put("image_info", strLIZLLL);
                c20235014Fo.LIZIZ("tikbot_image_upload", jSONObject);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (!C0XF5.LIZIZ()) {
            interfaceC20189313z9.LJ();
            for (BaseImage baseImage : list) {
                C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                int iIndexOf2 = list.indexOf(baseImage);
                Long lValueOf = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                String strLIZLLL2 = LIZLLL(baseImage);
                c1862330yYx2.getClass();
                C1862330yYx.LJJJ(iIndexOf2, -10001L, lValueOf, str3, null, "network not available", strLIZLLL2, str2);
            }
            return;
        }
        C1864400ycI.LIZ(C1864400ycI.LIZ, false, null, new C20189013z6(jCurrentTimeMillis, interfaceC20189313z9, this, str, str2, list), 3);
    }
}
