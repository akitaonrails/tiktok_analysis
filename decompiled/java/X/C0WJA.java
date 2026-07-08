package X;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WJA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJA {
    public static final C0WJA LIZ = new C0WJA();

    public static String LIZIZ(String str) {
        return u.LJJIFFI(str, "com.zhiliaoapp.musically", (String) C0A0J.LIZ.getValue(), false);
    }

    public static boolean LIZLLL(File file) {
        try {
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    return false;
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        LIZLLL(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            return file.delete();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:39:0x008b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZJ(X.C0VSJ r11, X.C0VSJ r12) {
        /*
            boolean r0 = r12.exists()
            if (r0 != 0) goto L9
            r12.mkdirs()
        L9:
            java.io.File[] r6 = r11.listFiles()
            if (r6 != 0) goto L10
            return
        L10:
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L13:
            if (r3 >= r5) goto L93
            r1 = r6[r3]
            X.0VSJ r10 = new X.0VSJ
            java.lang.String r0 = r1.getName()
            r10.<init>(r11, r0)
            X.0VSJ r2 = new X.0VSJ
            java.lang.String r0 = r1.getName()
            r2.<init>(r12, r0)
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L35
            LIZJ(r10, r2)
        L32:
            int r3 = r3 + 1
            goto L13
        L35:
            X.0VSP r8 = new X.0VSP
            r8.<init>(r10)
            r7 = 0
            X.0VSV r9 = new X.0VSV     // Catch: java.lang.Throwable -> L83
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L83
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L72
        L44:
            int r0 = r8.read(r1)     // Catch: java.lang.Throwable -> L72
            if (r0 <= 0) goto L4e
            r9.write(r1, r4, r0)     // Catch: java.lang.Throwable -> L72
            goto L44
        L4e:
            X.C2107108Nh.LIZ(r9, r7)     // Catch: java.lang.Throwable -> L83
            X.C2107108Nh.LIZ(r8, r7)
            X.01GW r0 = X.C301830BsL.LIZIZ
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = r10.getName()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L32
            java.lang.String r0 = X.C09BH.LJII(r2)
            java.lang.String r0 = LIZIZ(r0)
            X.C09BH.LJIIJ(r2, r0)
            goto L32
        L72:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L77
            throw r1     // Catch: java.lang.Throwable -> L7d
        L77:
            r0 = move-exception
            r1 = r7
        L79:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r0 = move-exception
            goto L79
        L7f:
            X.C2107108Nh.LIZ(r9, r1)     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        L83:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            r7 = r1
            goto L8c
        L8b:
            r0 = move-exception
        L8c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8b
            X.C2107108Nh.LIZ(r8, r7)
            throw r0
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJA.LIZJ(X.0VSJ, X.0VSJ):void");
    }

    public static boolean LJFF(String str, C0VSJ c0vsj) {
        SQLiteDatabase writableDatabase = SQLiteHelper.getInstance().getWritableDatabase();
        try {
            JSONObject jSONObject = new JSONObject(LIZIZ(new String(C09BH.LJ(c0vsj), Charsets.UTF_8)));
            ContentValues contentValues = new ContentValues();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (Intrinsics.LJFF(next, "user_id")) {
                    contentValues.put(next, str);
                } else {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof Integer) {
                        contentValues.put(next, (Integer) obj);
                    } else if (obj instanceof Long) {
                        contentValues.put(next, (Long) obj);
                    } else if (obj instanceof Float) {
                        contentValues.put(next, (Float) obj);
                    } else if (obj instanceof Double) {
                        contentValues.put(next, (Double) obj);
                    } else if (obj instanceof Boolean) {
                        contentValues.put(next, (Boolean) obj);
                    } else if (obj instanceof String) {
                        if (!Intrinsics.LJFF(obj, "BLOB data written to file")) {
                            contentValues.put(next, (String) obj);
                        }
                    } else if (obj instanceof JSONObject) {
                        contentValues.put(next, C786410Ut5.J3((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        contentValues.put(next, ((JSONArray) obj).toString());
                    } else if (Intrinsics.LJFF(obj, JSONObject.NULL)) {
                        contentValues.putNull(next);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported data type for key: ");
                        sbLIZ.append(next);
                        sbLIZ.append(", value: ");
                        sbLIZ.append(obj);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            writableDatabase.beginTransaction();
            try {
                if (writableDatabase.insert("local_draft", null, contentValues) != -1) {
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return true;
                }
                throw new SQLException("Failed to insert row into database");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static Object LJI(String str, C0VSJ c0vsj) {
        boolean z;
        Object c098200Yq;
        boolean z2 = true;
        if (c0vsj.exists()) {
            String strLIZIZ = LIZIZ(C09BH.LJI(c0vsj, Charsets.UTF_8));
            C1449490np5.LIZ.getClass();
            boolean zBooleanValue = false;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    try {
                        C1449490np5.LIZJ().storeString(str, strLIZIZ);
                        c098200Yq = Boolean.TRUE;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                        c098200Yq = Boolean.FALSE;
                    }
                    zBooleanValue = ((Boolean) c098200Yq).booleanValue();
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.zip.ZipEntry] */
    public static void LJII(C0VSP c0vsp, String str) throws IOException {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can't create: ");
            sbLIZ.append(str);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(c0vsp);
            C259800zU c259800zU = new C259800zU();
            while (true) {
                ?? nextEntry = zipInputStream.getNextEntry();
                c259800zU.element = nextEntry;
                if (nextEntry != 0) {
                    String name = nextEntry.getName();
                    if (name != null) {
                        if (C2114508Qd.LIZIZ(name)) {
                            zipInputStream.closeEntry();
                        } else {
                            File file = new File(c0vsj, name);
                            ZipEntry zipEntry = (ZipEntry) c259800zU.element;
                            if (zipEntry != null && zipEntry.isDirectory()) {
                                file.mkdirs();
                            } else {
                                File parentFile = file.getParentFile();
                                if (parentFile != null && !parentFile.exists()) {
                                    parentFile.mkdirs();
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                C2106208My.LIZ(zipInputStream, fileOutputStream);
                                fileOutputStream.close();
                            }
                            zipInputStream.closeEntry();
                        }
                    }
                } else {
                    zipInputStream.close();
                    return;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public static C821100WIy LJIIIZ(String str, String str2) throws IOException {
        if (str2 != null && str2.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(str);
            File parentFile = c0vsj.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("can't create: ");
                sbLIZ.append(parentFile.getAbsolutePath());
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn(c0vsj));
            Throwable th = null;
            try {
                bufferedWriter.write(str2);
                bufferedWriter.flush();
                C2107108Nh.LIZ(bufferedWriter, null);
                if (c0vsj.exists()) {
                    return new C821100WIy(C0WJ1.SUCCESS, null);
                }
                return new C821100WIy(C0WJ1.FAILED, "unknown error");
            } finally {
                try {
                    try {
                    } catch (Throwable th2) {
                        while (true) {
                        }
                    }
                } catch (Throwable th3) {
                }
            }
        } else {
            return new C821100WIy(C0WJ1.NOT_EXIST, "not exist");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0047
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJIIJ(X.C0VSJ r6, java.util.Map r7) {
        /*
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            X.0VSV r0 = new X.0VSV
            r0.<init>(r6)
            r1.<init>(r0)
            r5.<init>(r1)
            r4 = 0
            java.util.Set r0 = r7.keySet()     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
        L18:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3b
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L3f
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L18
            java.lang.Object r1 = r7.get(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L18
            X.0WJA r0 = X.C0WJA.LIZ     // Catch: java.lang.Throwable -> L3f
            r0.getClass()     // Catch: java.lang.Throwable -> L3f
            LIZ(r2, r1, r5)     // Catch: java.lang.Throwable -> L3f
            goto L18
        L3b:
            X.C2107108Nh.LIZ(r5, r4)
            return
        L3f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L47
            throw r1     // Catch: java.lang.Throwable -> L44
        L44:
            r0 = move-exception
            r4 = r1
            goto L48
        L47:
            r0 = move-exception
        L48:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L47
            X.C2107108Nh.LIZ(r5, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJA.LJIIJ(X.0VSJ, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C0VSJ r12, X.InterfaceC1364105Vn r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C0WJB
            if (r0 == 0) goto L5e
            r4 = r13
            X.0WJB r4 = (X.C0WJB) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L64
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L5c
            r0 = 1
        L2b:
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L32:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r12.exists()
            if (r0 == 0) goto L6c
            java.lang.String r0 = X.C09BH.LJII(r12)
            java.lang.String r1 = LIZIZ(r0)
            java.lang.Class<com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager> r5 = com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = (com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager) r0
            if (r0 == 0) goto L5c
            r4.LLILLL = r2
            java.lang.Object r1 = r0.LJJIIZ(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L5c:
            r0 = 0
            goto L2b
        L5e:
            X.0WJB r4 = new X.0WJB
            r4.<init>(r11, r13)
            goto L12
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJA.LJ(X.0VSJ, X.05Vn):java.lang.Object");
    }

    public static void LIZ(File file, String str, ZipOutputStream zipOutputStream) throws Throwable {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                if (fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        C0WJA c0wja = LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append('/');
                        sbLIZ.append(file2.getName());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c0wja.getClass();
                        LIZ(file2, strLIZIZ, zipOutputStream);
                    }
                    return;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('/');
            zipOutputStream.putNextEntry(new ZipEntry(C2188811AlT.LIZIZ(sbLIZ2)));
            zipOutputStream.closeEntry();
            return;
        }
        C0VSP c0vsp = new C0VSP(file);
        Throwable th = null;
        try {
            zipOutputStream.putNextEntry(new ZipEntry(str));
            C2106208My.LIZ(c0vsp, zipOutputStream);
            zipOutputStream.closeEntry();
            C2107108Nh.LIZ(c0vsp, null);
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                throw th2;
            } catch (Throwable th4) {
                th = th4;
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C2107108Nh.LIZ(c0vsp, th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:47:0x00c8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r11, java.lang.String r12, X.InterfaceC1364105Vn<? super X.C821100WIy> r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJA.LJIIIIZZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
