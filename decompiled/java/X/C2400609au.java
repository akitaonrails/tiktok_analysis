package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import bytedance.io.BdMediaItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.BdMediaItemCompat;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2400609au {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();

    public static Pair LIZ(String str) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C2471909mP.LIZLLL(str, options);
        return new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public static List LIZLLL(Context context, String str, String str2, String[] strArr) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Cursor cursorLJJJ = null;
        try {
            cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "date_modified", "mime_type", "_size", "_data", "date_modified", "width", "height"}, str, strArr, str2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetZ5bP3zojwSJvkN9J2pV3h+Wgwn1yzmHvnXEeqQ==", null));
            if (cursorLJJJ == null) {
                return arrayList;
            }
            while (cursorLJJJ.moveToNext()) {
                long j = cursorLJJJ.getLong(0);
                String string = cursorLJJJ.getString(1);
                long j2 = cursorLJJJ.getLong(2);
                String string2 = cursorLJJJ.getString(3);
                long j3 = cursorLJJJ.getLong(4);
                String string3 = cursorLJJJ.getString(5);
                long j4 = cursorLJJJ.getInt(6);
                int i = cursorLJJJ.getInt(7);
                int i2 = cursorLJJJ.getInt(8);
                if (j3 > 0) {
                    MediaModel mediaModel = new MediaModel(j);
                    mediaModel.LJIILL(string);
                    mediaModel.relativePath = string;
                    mediaModel.date = j2;
                    mediaModel.fileSize = j3;
                    mediaModel.thumbnail = string3;
                    mediaModel.modify = j4;
                    if (LIZ) {
                        mediaModel.width = i;
                        mediaModel.height = i2;
                    }
                    String str3 = "";
                    try {
                        List<String> listSplit = new Regex(File.separator).split(string, 0);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str4 : listSplit) {
                            if (str4.length() <= 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                arrayList2.add(str4);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            str3 = (String) arrayList2.get(arrayList2.size() - 1);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    mediaModel.albumClass = str3;
                    if (string2 == null || !a0.LJJIIZI(string2, "gif", false)) {
                        mediaModel.type = 1;
                        if (!LIZ || mediaModel.width <= 0 || mediaModel.height <= 0) {
                            Pair pairLIZ = LIZ(string);
                            mediaModel.width = ((Number) pairLIZ.first).intValue();
                            mediaModel.height = ((Number) pairLIZ.second).intValue();
                        }
                    } else {
                        mediaModel.type = 2;
                    }
                    if (LIZJ) {
                        if (!u.LJJIIJZLJL(mediaModel.LJFF(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString(), false)) {
                            arrayList.add(mediaModel);
                        }
                    } else {
                        arrayList.add(mediaModel);
                    }
                }
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

    public static C2400809aw LJI(int i, int i2, int i3, C2400709av c2400709av) {
        String str;
        String str2;
        String[] strArr;
        String str3;
        long j;
        boolean z;
        String strLIZ;
        List arrayList;
        int i4 = i3;
        if (c2400709av == null || (str = c2400709av.LJ) == null) {
            str = "DESC";
        }
        List<String> list = null;
        if (c2400709av != null) {
            str2 = c2400709av.LJFF;
            strArr = c2400709av.LJI;
            str3 = c2400709av.LIZ;
        } else {
            str2 = null;
            strArr = null;
            str3 = null;
        }
        long j2 = -1;
        if (c2400709av != null) {
            j = c2400709av.LIZJ;
            j2 = c2400709av.LIZLLL;
            list = c2400709av.LIZIZ;
        } else {
            j = -1;
        }
        if (c2400709av != null && c2400709av.LJII) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("date_modified ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (i4 < 0) {
            i4 = i * i2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" LIMIT ");
        sbLIZ2.append(i2);
        sbLIZ2.append(" OFFSET ");
        sbLIZ2.append(i4);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (str2 == null) {
            strLIZ = "";
        } else {
            strLIZ = str2;
        }
        if (strArr != null) {
            arrayList = C13LQ.LJLI(strArr);
        } else {
            arrayList = new ArrayList();
        }
        if (str2 == null || str2.length() == 0 || strArr == null || strArr.length == 0) {
            if (list != null && !list.isEmpty()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("_id IN (");
                sbLIZ3.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS231S0000000_3.get$arr$(115), 30));
                sbLIZ3.append(')');
                strLIZ = C2400909ax.LIZ(strLIZ, C2188811AlT.LIZIZ(sbLIZ3));
                arrayList.addAll(list);
            }
            if (!TextUtils.isEmpty(str3)) {
                strLIZ = C2400909ax.LIZ(strLIZ, "_data like ?");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append('%');
                sbLIZ4.append(str3);
                sbLIZ4.append('%');
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ4));
            }
            if (j > 0 || j2 > 0) {
                if (z) {
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL("datetaken > 0");
                    ArrayList arrayList2 = new ArrayList();
                    List listLJIILJJIL2 = C1697810uHb.LJIILJJIL("(datetaken = 0 OR datetaken IS NULL)");
                    ArrayList arrayList3 = new ArrayList();
                    if (j > 0) {
                        listLJIILJJIL.add("datetaken >= ?");
                        arrayList2.add(String.valueOf(((long) LSPassThroughRecordSizeConfig.DEFAULT) * j));
                        listLJIILJJIL2.add("date_modified >= ?");
                        arrayList3.add(String.valueOf(j));
                    }
                    if (j2 > 0) {
                        listLJIILJJIL.add("datetaken <= ?");
                        arrayList2.add(String.valueOf(((long) LSPassThroughRecordSizeConfig.DEFAULT) * j2));
                        listLJIILJJIL2.add("date_modified <= ?");
                        arrayList3.add(String.valueOf(j2));
                    }
                    arrayList.addAll(arrayList2);
                    arrayList.addAll(arrayList3);
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(listLJIILJJIL, " AND ", null, null, 0, null, null, 62);
                    String strLJJLIIIJ2 = C13LP.LJJLIIIJ(listLJIILJJIL2, " AND ", null, null, 0, null, null, 62);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("((");
                    sbLIZ5.append(strLJJLIIIJ);
                    sbLIZ5.append(") OR (");
                    sbLIZ5.append(strLJJLIIIJ2);
                    sbLIZ5.append("))");
                    strLIZ = C2400909ax.LIZ(strLIZ, C2188811AlT.LIZIZ(sbLIZ5));
                } else {
                    if (j > 0) {
                        strLIZ = C2400909ax.LIZ(strLIZ, "date_modified >= ?");
                        arrayList.add(String.valueOf(j));
                    }
                    if (j2 > 0) {
                        strLIZ = C2400909ax.LIZ(strLIZ, "date_modified <= ?");
                        arrayList.add(String.valueOf(j2));
                    }
                }
            }
        }
        C2400809aw c2400809aw = new C2400809aw();
        c2400809aw.LIZ = strLIZIZ;
        c2400809aw.LIZIZ = strLIZIZ2;
        c2400809aw.LIZJ = strLIZ;
        c2400809aw.LIZLLL = arrayList;
        return c2400809aw;
    }

    public static List LJIIJ(Context context, String str, String str2, String[] strArr) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Cursor cursorLJJJ = null;
        try {
            cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "date_modified", "mime_type", "duration", "_size", "_data", "width", "height"}, str, strArr, str2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetZ5bP3zojwSJvkN9J2pV3h+Wgwn1yzmHvnXEeqQ==", null));
            if (cursorLJJJ == null) {
                return arrayList;
            }
            while (cursorLJJJ.moveToNext()) {
                long j = cursorLJJJ.getLong(0);
                String string = cursorLJJJ.getString(1);
                long j2 = cursorLJJJ.getLong(2);
                String string2 = cursorLJJJ.getString(3);
                long j3 = cursorLJJJ.getLong(4);
                long j4 = cursorLJJJ.getLong(5);
                String string3 = cursorLJJJ.getString(6);
                int i = cursorLJJJ.getInt(7);
                int i2 = cursorLJJJ.getInt(8);
                if (!TextUtils.isEmpty(string) && j3 > 0 && j4 > 0) {
                    MediaModel mediaModel = new MediaModel(j);
                    mediaModel.LJIILL(string);
                    mediaModel.relativePath = string;
                    mediaModel.date = j2;
                    if (string2 != null) {
                        mediaModel.mimeType = string2;
                    }
                    mediaModel.duration = j3;
                    mediaModel.fileSize = j4;
                    mediaModel.type = 4;
                    mediaModel.thumbnail = string3;
                    mediaModel.width = i;
                    mediaModel.height = i2;
                    String str3 = "";
                    try {
                        List<String> listSplit = new Regex(File.separator).split(string, 0);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str4 : listSplit) {
                            if (str4.length() <= 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                arrayList2.add(str4);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            str3 = (String) arrayList2.get(arrayList2.size() - 1);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    mediaModel.albumClass = str3;
                    if (LIZJ) {
                        if (!u.LJJIIJZLJL(mediaModel.LJFF(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString(), false)) {
                            arrayList.add(mediaModel);
                        }
                    } else {
                        arrayList.add(mediaModel);
                    }
                }
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[PHI: r11
      0x00bb: PHI (r11v2 boolean) = (r11v1 boolean), (r11v5 boolean) binds: [B:32:0x00b7, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> LJIIIIZZ(android.content.Context r8, int r9, int r10, X.C2400709av r11, boolean r12, int r13) throws java.lang.Throwable {
        /*
            r2 = r13
            r6 = r11
            r5 = r10
            r4 = r9
            X.09aw r3 = LJI(r5, r4, r2, r6)
            X.C2400609au.LIZJ = r12
            java.util.List<java.lang.String> r0 = r3.LIZLLL
            int r1 = r0.size()
            r0 = 0
            if (r1 <= 0) goto Lbe
            java.util.List<java.lang.String> r1 = r3.LIZLLL
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r7 = r1.toArray(r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
        L1d:
            r1 = 1
            if (r6 == 0) goto Lb6
            boolean r0 = r6.LJIIIIZZ
            if (r0 != r1) goto Lb6
            r11 = 1
        L25:
            boolean r0 = r6.LJIIIZ
            if (r0 != r1) goto Lbb
            r12 = 1
        L2a:
            if (r2 >= 0) goto L2e
            int r2 = r5 * r4
        L2e:
            r9 = -1
            r5 = r8
            if (r4 != r9) goto L88
            boolean r0 = X.C2471909mP.LJJIJ()
            if (r0 == 0) goto L7f
            java.lang.String r6 = r3.LIZJ
            java.lang.String r8 = r3.LIZ
            r10 = r9
            java.util.List r3 = LJII(r5, r6, r7, r8, r9, r10, r11, r12)
        L41:
            boolean r0 = X.C2400609au.LIZIZ
            if (r0 != 0) goto L7e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "FileAdapterAndroidR video media list:"
            r1.append(r0)
            int r0 = r3.size()
            r1.append(r0)
            r0 = 44
            r1.append(r0)
            boolean r0 = X.C2471909mP.LJJIJ()
            r1.append(r0)
            java.lang.String r0 = ", trace:"
            r1.append(r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            X.09b4 r1 = X.C2471909mP.LIZLLL
            if (r1 == 0) goto L7e
            r0 = -2
            r1.LIZ(r0, r2)
        L7e:
            return r3
        L7f:
            java.lang.String r1 = r3.LIZJ
            java.lang.String r0 = r3.LIZ
            java.util.List r3 = LJIIJ(r5, r1, r0, r7)
            goto L41
        L88:
            boolean r0 = X.C2471909mP.LJJIJ()
            if (r0 == 0) goto L9d
            java.lang.String r6 = r3.LIZJ
            java.lang.String r8 = r3.LIZ
            r5 = r5
            r7 = r7
            r9 = r4
            r10 = r2
            r11 = r11
            r12 = r12
            java.util.List r3 = LJII(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L41
        L9d:
            java.lang.String r2 = r3.LIZJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r3.LIZ
            r1.append(r0)
            java.lang.String r0 = r3.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.util.List r3 = LJIIJ(r5, r2, r0, r7)
            goto L41
        Lb6:
            r11 = 0
            if (r6 == 0) goto Lbb
            goto L25
        Lbb:
            r12 = 0
            goto L2a
        Lbe:
            r7 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2400609au.LJIIIIZZ(android.content.Context, int, int, X.09av, boolean, int):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static List LJ(Context context, String str, String[] strArr, String str2, int i, int i2, boolean z, boolean z2) {
        List<BdMediaItem> listLIZ;
        String str3;
        ?? arrayList;
        List<String> listSplit;
        boolean z3;
        ArrayList arrayList2 = new ArrayList();
        try {
            if (!z && !z2) {
                listLIZ = C2400409as.LJI(context, str, strArr, str2, i, i2);
            } else {
                listLIZ = C2400509at.LIZ(context, str, strArr, str2, i, i2, z, z2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            listLIZ = C13BV.INSTANCE;
        }
        if (C2401009ay.LIZ(listLIZ)) {
            return arrayList2;
        }
        for (BdMediaItem bdMediaItem : listLIZ) {
            long jLJII = bdMediaItem.fileSize;
            if (jLJII <= 0) {
                jLJII = C2400409as.LJII(context, bdMediaItem.uri);
            }
            if (jLJII > 0) {
                MediaModel mediaModel = new MediaModel(bdMediaItem.id);
                mediaModel.LJIILL(bdMediaItem.uri.toString());
                mediaModel.relativePath = bdMediaItem.relativePath;
                mediaModel.fileName = bdMediaItem.name;
                mediaModel.date = bdMediaItem.dateAdded;
                mediaModel.fileSize = jLJII;
                mediaModel.modify = bdMediaItem.modify;
                String str4 = bdMediaItem.mimeType;
                if (str4 != null) {
                    mediaModel.mimeType = str4;
                }
                mediaModel.width = bdMediaItem.width;
                mediaModel.height = bdMediaItem.height;
                if (str4 != null && a0.LJJIIZI(str4, "gif", false)) {
                    mediaModel.type = 2;
                } else {
                    mediaModel.type = 1;
                }
                long j = bdMediaItem.dateToken;
                if (j > 0) {
                    mediaModel.dateTaken = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }
                if (bdMediaItem instanceof BdMediaItemCompat) {
                    BdMediaItemCompat bdMediaItemCompat = (BdMediaItemCompat) bdMediaItem;
                    mediaModel.isFavorite = bdMediaItemCompat.isFavorite;
                    mediaModel.ownerPackageName = bdMediaItemCompat.ownerPackageName;
                }
                if (!TextUtils.isEmpty(mediaModel.relativePath)) {
                    try {
                        String str5 = mediaModel.relativePath;
                        if (str5 != null && (listSplit = new Regex(File.separator).split(str5, 0)) != null) {
                            arrayList = new ArrayList();
                            for (String str6 : listSplit) {
                                if (str6.length() <= 0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    arrayList.add(str6);
                                }
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MediaHelper ===> image ablum exception :");
                        sbLIZ.append(C2471909mP.LJJIJ());
                        sbLIZ.append(", trace:");
                        sbLIZ.append(Log.getStackTraceString(e2));
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        InterfaceC2401609b4 interfaceC2401609b4 = C2471909mP.LIZLLL;
                        if (interfaceC2401609b4 != null) {
                            interfaceC2401609b4.LIZ(-2, strLIZIZ);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        str3 = (String) arrayList.get(arrayList.size() - 1);
                    } else {
                        str3 = "";
                    }
                    mediaModel.albumClass = str3;
                }
                if (LIZJ) {
                    if (!u.LJJIIJZLJL(mediaModel.LJFF(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString(), false)) {
                        arrayList2.add(mediaModel);
                    }
                } else {
                    arrayList2.add(mediaModel);
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029d  */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:? -> B:72:0x0299). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJII(android.content.Context r37, java.lang.String r38, java.lang.String[] r39, java.lang.String r40, int r41, int r42, boolean r43, boolean r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2400609au.LJII(android.content.Context, java.lang.String, java.lang.String[], java.lang.String, int, int, boolean, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111 A[PHI: r11
      0x0111: PHI (r11v1 boolean) = (r11v0 boolean), (r11v3 boolean) binds: [B:58:0x010d, B:38:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> LIZIZ(android.content.Context r13, boolean r14, int r15, int r16, X.C2400709av r17, boolean r18, boolean r19, boolean r20, int r21) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2400609au.LIZIZ(android.content.Context, boolean, int, int, X.09av, boolean, boolean, boolean, int):java.util.List");
    }
}
