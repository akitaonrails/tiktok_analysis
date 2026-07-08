package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.database.ColdCacheDataBase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796070VKr implements C0NDX {
    public final AbstractC796540VMm LIZ;
    public final C590320NDi LIZIZ;
    public final C796080VKs LIZJ = new C796080VKs();
    public final C796100VKu LIZLLL;
    public final C796110VKv LJ;
    public final C854550Xfh LJFF;

    @Override // X.C0NDX
    public final List<C590280NDe> LIZ() throws Throwable {
        C5186020i c5186020iLIZ;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM cold_cache_mode_feed_pb");
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "source_type");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_data");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "fcp_protocol");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "had_cached_video");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "had_loaded_count");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "had_watched_count");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "cache_time");
            int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_time");
            int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "request_id");
            int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "priority");
            try {
                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "incomplete_path");
                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "rec_finish");
                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "file_key");
                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_info");
                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                while (cursorLIZIZ.moveToNext()) {
                    String string = null;
                    String string2 = cursorLIZIZ.isNull(iLIZIZ) ? null : cursorLIZIZ.getString(iLIZIZ);
                    String string3 = cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2);
                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                    byte[] blob = cursorLIZIZ.isNull(iLIZIZ4) ? null : cursorLIZIZ.getBlob(iLIZIZ4);
                    if (blob == null) {
                        c5186020iLIZ = null;
                    } else {
                        this.LIZJ.getClass();
                        c5186020iLIZ = C796080VKs.LIZ(blob);
                    }
                    String string4 = cursorLIZIZ.isNull(iLIZIZ5) ? null : cursorLIZIZ.getString(iLIZIZ5);
                    String string5 = cursorLIZIZ.isNull(iLIZIZ6) ? null : cursorLIZIZ.getString(iLIZIZ6);
                    boolean z = cursorLIZIZ.getInt(iLIZIZ7) != 0;
                    int i2 = cursorLIZIZ.getInt(iLIZIZ8);
                    int i3 = cursorLIZIZ.getInt(iLIZIZ9);
                    long j = cursorLIZIZ.getLong(iLIZIZ10);
                    long j2 = cursorLIZIZ.getLong(iLIZIZ11);
                    String string6 = cursorLIZIZ.isNull(iLIZIZ12) ? null : cursorLIZIZ.getString(iLIZIZ12);
                    int i4 = cursorLIZIZ.getInt(iLIZIZ13);
                    String string7 = cursorLIZIZ.isNull(iLIZIZ14) ? null : cursorLIZIZ.getString(iLIZIZ14);
                    double d = cursorLIZIZ.getDouble(iLIZIZ15);
                    String string8 = cursorLIZIZ.isNull(iLIZIZ16) ? null : cursorLIZIZ.getString(iLIZIZ16);
                    float f = cursorLIZIZ.getFloat(iLIZIZ17);
                    if (!cursorLIZIZ.isNull(iLIZIZ18)) {
                        string = cursorLIZIZ.getString(iLIZIZ18);
                    }
                    arrayList.add(new C590280NDe(string2, string3, i, c5186020iLIZ, string4, string5, z, i2, i3, j, j2, string6, i4, string7, d, string8, f, string));
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // X.C0NDX
    public final List<String> LJFF() {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT aid FROM cold_cache_mode_feed_pb");
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                arrayList.add(cursorLIZIZ.isNull(0) ? null : cursorLIZIZ.getString(0));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0NDi] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0VKu] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VKv] */
    public C796070VKr(final ColdCacheDataBase coldCacheDataBase) {
        this.LIZ = coldCacheDataBase;
        this.LIZIZ = new AbstractC796330VLr<C590280NDe>(coldCacheDataBase) { // from class: X.0NDi
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `cold_cache_mode_feed_pb` (`aid`,`uid`,`source_type`,`aweme_struct`,`aweme_data`,`fcp_protocol`,`had_cached_video`,`had_loaded_count`,`had_watched_count`,`cache_time`,`expire_time`,`request_id`,`priority`,`incomplete_path`,`rec_finish`,`file_key`,`score`,`extra_info`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC796330VLr
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C590280NDe c590280NDe) {
                byte[] bArrEncode;
                C590280NDe c590280NDe2 = c590280NDe;
                String str = c590280NDe2.LIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(1);
                } else {
                    interfaceC796340VLs.LJIILIIL(1, str);
                }
                String str2 = c590280NDe2.LIZIZ;
                if (str2 == null) {
                    interfaceC796340VLs.LLD(2);
                } else {
                    interfaceC796340VLs.LJIILIIL(2, str2);
                }
                interfaceC796340VLs.LJIJ(3, c590280NDe2.LIZJ);
                C5186020i c5186020i = c590280NDe2.LIZLLL;
                if (c5186020i == null) {
                    bArrEncode = null;
                } else {
                    this.LIZ.LIZJ.getClass();
                    try {
                        bArrEncode = c5186020i.encode();
                        if (bArrEncode == null) {
                            bArrEncode = new byte[0];
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        bArrEncode = new byte[0];
                    }
                }
                if (bArrEncode == null) {
                    interfaceC796340VLs.LLD(4);
                } else {
                    interfaceC796340VLs.LJJIIJZLJL(4, bArrEncode);
                }
                String str3 = c590280NDe2.LJ;
                if (str3 == null) {
                    interfaceC796340VLs.LLD(5);
                } else {
                    interfaceC796340VLs.LJIILIIL(5, str3);
                }
                String str4 = c590280NDe2.LJFF;
                if (str4 == null) {
                    interfaceC796340VLs.LLD(6);
                } else {
                    interfaceC796340VLs.LJIILIIL(6, str4);
                }
                interfaceC796340VLs.LJIJ(7, c590280NDe2.LJI ? 1L : 0L);
                interfaceC796340VLs.LJIJ(8, c590280NDe2.LJII);
                interfaceC796340VLs.LJIJ(9, c590280NDe2.LJIIIIZZ);
                interfaceC796340VLs.LJIJ(10, c590280NDe2.LJIIIZ);
                interfaceC796340VLs.LJIJ(11, c590280NDe2.LJIIJ);
                String str5 = c590280NDe2.LJIIJJI;
                if (str5 == null) {
                    interfaceC796340VLs.LLD(12);
                } else {
                    interfaceC796340VLs.LJIILIIL(12, str5);
                }
                interfaceC796340VLs.LJIJ(13, c590280NDe2.LJIIL);
                String str6 = c590280NDe2.LJIILIIL;
                if (str6 == null) {
                    interfaceC796340VLs.LLD(14);
                } else {
                    interfaceC796340VLs.LJIILIIL(14, str6);
                }
                interfaceC796340VLs.LJJI(c590280NDe2.LJIILJJIL, 15);
                String str7 = c590280NDe2.LJIILL;
                if (str7 == null) {
                    interfaceC796340VLs.LLD(16);
                } else {
                    interfaceC796340VLs.LJIILIIL(16, str7);
                }
                interfaceC796340VLs.LJJI(c590280NDe2.LJIILLIIL, 17);
                String str8 = c590280NDe2.LJIIZILJ;
                if (str8 == null) {
                    interfaceC796340VLs.LLD(18);
                } else {
                    interfaceC796340VLs.LJIILIIL(18, str8);
                }
            }
        };
        new AbstractC795470VIj(coldCacheDataBase) { // from class: X.0VKt
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "\n        UPDATE cold_cache_mode_feed_pb \n        SET had_watched_count = had_watched_count +1\n        WHERE aid = ?\n        ";
            }
        };
        this.LIZLLL = new AbstractC795470VIj(coldCacheDataBase) { // from class: X.0VKu
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "UPDATE cold_cache_mode_feed_pb SET score = ? WHERE aid = ?";
            }
        };
        this.LJ = new AbstractC795470VIj(coldCacheDataBase) { // from class: X.0VKv
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "UPDATE cold_cache_mode_feed_pb SET extra_info = ? WHERE aid = ?";
            }
        };
        this.LJFF = new C854550Xfh(coldCacheDataBase, 62);
    }

    @Override // X.C0NDX
    public final C590280NDe LIZIZ(String str) throws Throwable {
        String string;
        String string2;
        C5186020i c5186020iLIZ;
        String string3;
        String string4;
        boolean z;
        String string5;
        String string6;
        String string7;
        byte[] blob;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM cold_cache_mode_feed_pb WHERE aid =?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "source_type");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_data");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "fcp_protocol");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "had_cached_video");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "had_loaded_count");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "had_watched_count");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "cache_time");
            int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_time");
            int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "request_id");
            int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "priority");
            try {
                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "incomplete_path");
                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "rec_finish");
                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "file_key");
                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_info");
                C590280NDe c590280NDe = null;
                String string8 = null;
                if (cursorLIZIZ.moveToFirst()) {
                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                        string = null;
                    } else {
                        string = cursorLIZIZ.getString(iLIZIZ);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                    }
                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                    if (!cursorLIZIZ.isNull(iLIZIZ4) && (blob = cursorLIZIZ.getBlob(iLIZIZ4)) != null) {
                        this.LIZJ.getClass();
                        c5186020iLIZ = C796080VKs.LIZ(blob);
                    } else {
                        c5186020iLIZ = null;
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                        string3 = null;
                    } else {
                        string3 = cursorLIZIZ.getString(iLIZIZ5);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                        string4 = null;
                    } else {
                        string4 = cursorLIZIZ.getString(iLIZIZ6);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i2 = cursorLIZIZ.getInt(iLIZIZ8);
                    int i3 = cursorLIZIZ.getInt(iLIZIZ9);
                    long j = cursorLIZIZ.getLong(iLIZIZ10);
                    long j2 = cursorLIZIZ.getLong(iLIZIZ11);
                    if (cursorLIZIZ.isNull(iLIZIZ12)) {
                        string5 = null;
                    } else {
                        string5 = cursorLIZIZ.getString(iLIZIZ12);
                    }
                    int i4 = cursorLIZIZ.getInt(iLIZIZ13);
                    if (cursorLIZIZ.isNull(iLIZIZ14)) {
                        string6 = null;
                    } else {
                        string6 = cursorLIZIZ.getString(iLIZIZ14);
                    }
                    double d = cursorLIZIZ.getDouble(iLIZIZ15);
                    if (cursorLIZIZ.isNull(iLIZIZ16)) {
                        string7 = null;
                    } else {
                        string7 = cursorLIZIZ.getString(iLIZIZ16);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ17);
                    if (!cursorLIZIZ.isNull(iLIZIZ18)) {
                        string8 = cursorLIZIZ.getString(iLIZIZ18);
                    }
                    c590280NDe = new C590280NDe(string, string2, i, c5186020iLIZ, string3, string4, z, i2, i3, j, j2, string5, i4, string6, d, string7, f, string8);
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                return c590280NDe;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // X.C0NDX
    public final int LIZLLL(List<String> list) {
        this.LIZ.assertNotSuspendingTransaction();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM cold_cache_mode_feed_pb WHERE aid NOT IN (");
        C0VIY.LIZ(sb, list.size());
        sb.append(") ");
        InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                interfaceC796340VLsCompileStatement.LLD(i);
            } else {
                interfaceC796340VLsCompileStatement.LJIILIIL(i, str);
            }
            i++;
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsCompileStatement.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.C0NDX
    public final Map<String, Integer> LJ(List<String> list) {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT aid, had_loaded_count FROM cold_cache_mode_feed_pb WHERE aid IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "had_loaded_count");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    linkedHashMap.put(string, null);
                } else {
                    Integer numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ2));
                    if (!linkedHashMap.containsKey(string)) {
                        linkedHashMap.put(string, numValueOf);
                    }
                }
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.C0NDX
    public final int LJI(List<String> list) {
        this.LIZ.assertNotSuspendingTransaction();
        StringBuilder sb = new StringBuilder();
        sb.append("\n        UPDATE cold_cache_mode_feed_pb \n        SET had_loaded_count = had_loaded_count + 1\n        WHERE aid IN (");
        C0VIY.LIZ(sb, list.size());
        sb.append(")\n    ");
        InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                interfaceC796340VLsCompileStatement.LLD(i);
            } else {
                interfaceC796340VLsCompileStatement.LJIILIIL(i, str);
            }
            i++;
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsCompileStatement.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.C0NDX
    public final List<C590280NDe> LJIIIIZZ(List<String> list) throws Throwable {
        String string;
        String string2;
        byte[] blob;
        C5186020i c5186020iLIZ;
        String string3;
        String string4;
        boolean z;
        String string5;
        String string6;
        String string7;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM cold_cache_mode_feed_pb WHERE aid IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "source_type");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_data");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "fcp_protocol");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "had_cached_video");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "had_loaded_count");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "had_watched_count");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "cache_time");
            int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_time");
            int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "request_id");
            int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "priority");
            try {
                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "incomplete_path");
                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "rec_finish");
                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "file_key");
                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_info");
                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                while (cursorLIZIZ.moveToNext()) {
                    String string8 = null;
                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                        string = null;
                    } else {
                        string = cursorLIZIZ.getString(iLIZIZ);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                    }
                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                        blob = cursorLIZIZ.getBlob(iLIZIZ4);
                    } else {
                        blob = null;
                    }
                    if (blob == null) {
                        c5186020iLIZ = null;
                    } else {
                        this.LIZJ.getClass();
                        c5186020iLIZ = C796080VKs.LIZ(blob);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                        string3 = null;
                    } else {
                        string3 = cursorLIZIZ.getString(iLIZIZ5);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                        string4 = null;
                    } else {
                        string4 = cursorLIZIZ.getString(iLIZIZ6);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = cursorLIZIZ.getInt(iLIZIZ8);
                    int i4 = cursorLIZIZ.getInt(iLIZIZ9);
                    long j = cursorLIZIZ.getLong(iLIZIZ10);
                    long j2 = cursorLIZIZ.getLong(iLIZIZ11);
                    if (cursorLIZIZ.isNull(iLIZIZ12)) {
                        string5 = null;
                    } else {
                        string5 = cursorLIZIZ.getString(iLIZIZ12);
                    }
                    int i5 = cursorLIZIZ.getInt(iLIZIZ13);
                    if (cursorLIZIZ.isNull(iLIZIZ14)) {
                        string6 = null;
                    } else {
                        string6 = cursorLIZIZ.getString(iLIZIZ14);
                    }
                    double d = cursorLIZIZ.getDouble(iLIZIZ15);
                    if (cursorLIZIZ.isNull(iLIZIZ16)) {
                        string7 = null;
                    } else {
                        string7 = cursorLIZIZ.getString(iLIZIZ16);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ17);
                    if (!cursorLIZIZ.isNull(iLIZIZ18)) {
                        string8 = cursorLIZIZ.getString(iLIZIZ18);
                    }
                    arrayList.add(new C590280NDe(string, string2, i2, c5186020iLIZ, string3, string4, z, i3, i4, j, j2, string5, i5, string6, d, string7, f, string8));
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // X.C0NDX
    public final List<Long> LJIIIZ(List<C590280NDe> list) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = insertAndReturnIdsList(list);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            return listInsertAndReturnIdsList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.C0NDX
    public final boolean LJIIJJI(String str) {
        boolean z = true;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT EXISTS(SELECT 1 FROM cold_cache_mode_feed_pb WHERE aid = ?)");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                if (cursorLIZIZ.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return z2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.C0NDX
    public final int LJIILIIL(List<String> list) {
        this.LIZ.assertNotSuspendingTransaction();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM cold_cache_mode_feed_pb WHERE aid IN (");
        C0VIY.LIZ(sb, list.size());
        sb.append(")");
        InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                interfaceC796340VLsCompileStatement.LLD(i);
            } else {
                interfaceC796340VLsCompileStatement.LJIILIIL(i, str);
            }
            i++;
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsCompileStatement.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.C0NDX
    public final int LJIILL(List<String> list) {
        this.LIZ.assertNotSuspendingTransaction();
        StringBuilder sb = new StringBuilder();
        sb.append("\n        UPDATE cold_cache_mode_feed_pb \n        SET had_loaded_count = 0\n        WHERE aid IN (");
        C0VIY.LIZ(sb, list.size());
        sb.append(")\n    ");
        InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                interfaceC796340VLsCompileStatement.LLD(i);
            } else {
                interfaceC796340VLsCompileStatement.LJIILIIL(i, str);
            }
            i++;
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsCompileStatement.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.C0NDX
    public final void LIZJ(String str, String str2) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJFF.acquire();
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str2);
        }
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str);
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LJFF.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LJFF.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.C0NDX
    public final void LJII(float f, String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        interfaceC796340VLsAcquire.LJJI(f, 1);
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str);
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.C0NDX
    public final void LJIIL(String str, String str2) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str2);
        }
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str);
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.C0NDX
    public final boolean LJIIJ(long j, long j2, String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT EXISTS (SELECT 1 FROM cold_cache_mode_feed_pb WHERE ((expire_time <= 0 AND cache_time > 0 AND cache_time < ?)OR (expire_time > 0 AND expire_time < ?))AND aid = ?)");
        boolean z = true;
        c0vn5LIZLLL.LJIJ(1, j);
        c0vn5LIZLLL.LJIJ(2, j2);
        if (str == null) {
            c0vn5LIZLLL.LLD(3);
        } else {
            c0vn5LIZLLL.LJIILIIL(3, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                if (cursorLIZIZ.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return z2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.C0NDX
    public final List<C590280NDe> LJIILJJIL(int i, long j, long j2) throws Throwable {
        String string;
        String string2;
        byte[] blob;
        C5186020i c5186020iLIZ;
        String string3;
        String string4;
        boolean z;
        String string5;
        String string6;
        String string7;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "SELECT * FROM cold_cache_mode_feed_pb WHERE ((expire_time <= 0 AND cache_time > 0 AND cache_time < ?)OR (expire_time > 0 AND expire_time < ?)) AND (source_type = ? OR ? = -1001)");
        c0vn5LIZLLL.LJIJ(1, j);
        c0vn5LIZLLL.LJIJ(2, j2);
        long j3 = i;
        c0vn5LIZLLL.LJIJ(3, j3);
        c0vn5LIZLLL.LJIJ(4, j3);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "source_type");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_data");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "fcp_protocol");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "had_cached_video");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "had_loaded_count");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "had_watched_count");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "cache_time");
            int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "expire_time");
            int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "request_id");
            int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "priority");
            try {
                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "incomplete_path");
                int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "rec_finish");
                int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "file_key");
                int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
                int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "extra_info");
                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                while (cursorLIZIZ.moveToNext()) {
                    String string8 = null;
                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                        string = null;
                    } else {
                        string = cursorLIZIZ.getString(iLIZIZ);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                    }
                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                    if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                        blob = cursorLIZIZ.getBlob(iLIZIZ4);
                    } else {
                        blob = null;
                    }
                    if (blob == null) {
                        c5186020iLIZ = null;
                    } else {
                        this.LIZJ.getClass();
                        c5186020iLIZ = C796080VKs.LIZ(blob);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ5)) {
                        string3 = null;
                    } else {
                        string3 = cursorLIZIZ.getString(iLIZIZ5);
                    }
                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                        string4 = null;
                    } else {
                        string4 = cursorLIZIZ.getString(iLIZIZ6);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = cursorLIZIZ.getInt(iLIZIZ8);
                    int i4 = cursorLIZIZ.getInt(iLIZIZ9);
                    long j4 = cursorLIZIZ.getLong(iLIZIZ10);
                    long j5 = cursorLIZIZ.getLong(iLIZIZ11);
                    if (cursorLIZIZ.isNull(iLIZIZ12)) {
                        string5 = null;
                    } else {
                        string5 = cursorLIZIZ.getString(iLIZIZ12);
                    }
                    int i5 = cursorLIZIZ.getInt(iLIZIZ13);
                    if (cursorLIZIZ.isNull(iLIZIZ14)) {
                        string6 = null;
                    } else {
                        string6 = cursorLIZIZ.getString(iLIZIZ14);
                    }
                    double d = cursorLIZIZ.getDouble(iLIZIZ15);
                    if (cursorLIZIZ.isNull(iLIZIZ16)) {
                        string7 = null;
                    } else {
                        string7 = cursorLIZIZ.getString(iLIZIZ16);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ17);
                    if (!cursorLIZIZ.isNull(iLIZIZ18)) {
                        string8 = cursorLIZIZ.getString(iLIZIZ18);
                    }
                    arrayList.add(new C590280NDe(string, string2, i2, c5186020iLIZ, string3, string4, z, i3, i4, j4, j5, string5, i5, string6, d, string7, f, string8));
                }
                cursorLIZIZ.close();
                c0vn5LIZLLL.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        cursorLIZIZ.close();
                        c0vn5LIZLLL.release();
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
