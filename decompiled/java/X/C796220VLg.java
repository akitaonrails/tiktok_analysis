package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796220VLg implements InterfaceC625570OgF {
    public final AbstractC796540VMm LIZ;
    public final C796230VLh LIZIZ = new C796230VLh();
    public final C796890VNv LIZJ;
    public final C796900VNw LIZLLL;
    public final C796260VLk LJ;
    public final C796270VLl LJFF;
    public final C796280VLm LJI;
    public final C796290VLn LJII;
    public final C796300VLo LJIIIIZZ;
    public final C796310VLp LJIIIZ;
    public final C796240VLi LJIIJ;
    public final C796250VLj LJIIJJI;

    @Override // X.InterfaceC625570OgF
    public final void LJIILLIIL() {
        this.LIZ.beginTransaction();
        try {
            List<C796910VNx> listLJJJJ = LJJJJ();
            int i = 0;
            for (Object obj : (ArrayList) listLJJJJ) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                ((C796910VNx) obj).LJIIIIZZ = i;
                i = i2;
            }
            LJJJJI(listLJJJJ);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LJJIIJ() {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final void LJJIJIIJIL() {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
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

    public final List<C796910VNx> LJJJJ() {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM offline_mode_feed_pb WHERE has_watched = 1 ORDER BY cached_time DESC");
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string = cursorLIZIZ.isNull(iLIZIZ) ? null : cursorLIZIZ.getString(iLIZIZ);
                long j = cursorLIZIZ.getLong(iLIZIZ2);
                byte[] blob = cursorLIZIZ.isNull(iLIZIZ3) ? null : cursorLIZIZ.getBlob(iLIZIZ3);
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ == null) {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
                arrayList.add(new C796910VNx(string, j, c5186020iLIZ, cursorLIZIZ.isNull(iLIZIZ4) ? null : cursorLIZIZ.getString(iLIZIZ4), cursorLIZIZ.getInt(iLIZIZ5) != 0, cursorLIZIZ.getInt(iLIZIZ6) != 0, cursorLIZIZ.getLong(iLIZIZ7), cursorLIZIZ.isNull(iLIZIZ8) ? null : cursorLIZIZ.getString(iLIZIZ8), cursorLIZIZ.getFloat(iLIZIZ9), cursorLIZIZ.getInt(iLIZIZ10) != 0));
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

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0VLi] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0VLj] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0VNv] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0VNw] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VLk] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0VLl] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0VLm] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0VLn] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0VLo] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0VLp] */
    public C796220VLg(final OfflineModeFeedPBDataBase offlineModeFeedPBDataBase) {
        this.LIZ = offlineModeFeedPBDataBase;
        new AbstractC796330VLr<C796910VNx>(offlineModeFeedPBDataBase) { // from class: X.0VNu
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `offline_mode_feed_pb` (`sec_uid`,`insert_time`,`aweme_struct`,`aid`,`has_cached`,`has_watched`,`cached_time`,`url_key`,`score`,`ug_approved`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC796330VLr
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C796910VNx c796910VNx) {
                byte[] bArrEncode;
                C796910VNx c796910VNx2 = c796910VNx;
                String str = c796910VNx2.LIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(1);
                } else {
                    interfaceC796340VLs.LJIILIIL(1, str);
                }
                interfaceC796340VLs.LJIJ(2, c796910VNx2.LIZIZ);
                C796230VLh c796230VLh = this.LIZ.LIZIZ;
                C5186020i c5186020i = c796910VNx2.LIZJ;
                c796230VLh.getClass();
                try {
                    bArrEncode = c5186020i.encode();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    bArrEncode = new byte[0];
                }
                interfaceC796340VLs.LJJIIJZLJL(3, bArrEncode);
                String str2 = c796910VNx2.LIZLLL;
                if (str2 == null) {
                    interfaceC796340VLs.LLD(4);
                } else {
                    interfaceC796340VLs.LJIILIIL(4, str2);
                }
                interfaceC796340VLs.LJIJ(5, c796910VNx2.LJ ? 1L : 0L);
                interfaceC796340VLs.LJIJ(6, c796910VNx2.LJFF ? 1L : 0L);
                interfaceC796340VLs.LJIJ(7, c796910VNx2.LJI);
                String str3 = c796910VNx2.LJII;
                if (str3 == null) {
                    interfaceC796340VLs.LLD(8);
                } else {
                    interfaceC796340VLs.LJIILIIL(8, str3);
                }
                interfaceC796340VLs.LJJI(c796910VNx2.LJIIIIZZ, 9);
                interfaceC796340VLs.LJIJ(10, c796910VNx2.LJIIIZ ? 1L : 0L);
            }
        };
        this.LIZJ = new AbstractC796330VLr<C796910VNx>(offlineModeFeedPBDataBase) { // from class: X.0VNv
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `offline_mode_feed_pb` (`sec_uid`,`insert_time`,`aweme_struct`,`aid`,`has_cached`,`has_watched`,`cached_time`,`url_key`,`score`,`ug_approved`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC796330VLr
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C796910VNx c796910VNx) {
                byte[] bArrEncode;
                C796910VNx c796910VNx2 = c796910VNx;
                String str = c796910VNx2.LIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(1);
                } else {
                    interfaceC796340VLs.LJIILIIL(1, str);
                }
                interfaceC796340VLs.LJIJ(2, c796910VNx2.LIZIZ);
                C796230VLh c796230VLh = this.LIZ.LIZIZ;
                C5186020i c5186020i = c796910VNx2.LIZJ;
                c796230VLh.getClass();
                try {
                    bArrEncode = c5186020i.encode();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    bArrEncode = new byte[0];
                }
                interfaceC796340VLs.LJJIIJZLJL(3, bArrEncode);
                String str2 = c796910VNx2.LIZLLL;
                if (str2 == null) {
                    interfaceC796340VLs.LLD(4);
                } else {
                    interfaceC796340VLs.LJIILIIL(4, str2);
                }
                interfaceC796340VLs.LJIJ(5, c796910VNx2.LJ ? 1L : 0L);
                interfaceC796340VLs.LJIJ(6, c796910VNx2.LJFF ? 1L : 0L);
                interfaceC796340VLs.LJIJ(7, c796910VNx2.LJI);
                String str3 = c796910VNx2.LJII;
                if (str3 == null) {
                    interfaceC796340VLs.LLD(8);
                } else {
                    interfaceC796340VLs.LJIILIIL(8, str3);
                }
                interfaceC796340VLs.LJJI(c796910VNx2.LJIIIIZZ, 9);
                interfaceC796340VLs.LJIJ(10, c796910VNx2.LJIIIZ ? 1L : 0L);
            }
        };
        this.LIZLLL = new AbstractC796320VLq<C796910VNx>(offlineModeFeedPBDataBase) { // from class: X.0VNw
            @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
            public final String createQuery() {
                return "UPDATE OR ABORT `offline_mode_feed_pb` SET `sec_uid` = ?,`insert_time` = ?,`aweme_struct` = ?,`aid` = ?,`has_cached` = ?,`has_watched` = ?,`cached_time` = ?,`url_key` = ?,`score` = ?,`ug_approved` = ? WHERE `sec_uid` = ? AND `aid` = ?";
            }

            @Override // X.AbstractC796320VLq
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C796910VNx c796910VNx) {
                byte[] bArrEncode;
                C796910VNx c796910VNx2 = c796910VNx;
                String str = c796910VNx2.LIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(1);
                } else {
                    interfaceC796340VLs.LJIILIIL(1, str);
                }
                interfaceC796340VLs.LJIJ(2, c796910VNx2.LIZIZ);
                C796230VLh c796230VLh = this.LIZ.LIZIZ;
                C5186020i c5186020i = c796910VNx2.LIZJ;
                c796230VLh.getClass();
                try {
                    bArrEncode = c5186020i.encode();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    bArrEncode = new byte[0];
                }
                interfaceC796340VLs.LJJIIJZLJL(3, bArrEncode);
                String str2 = c796910VNx2.LIZLLL;
                if (str2 == null) {
                    interfaceC796340VLs.LLD(4);
                } else {
                    interfaceC796340VLs.LJIILIIL(4, str2);
                }
                interfaceC796340VLs.LJIJ(5, c796910VNx2.LJ ? 1L : 0L);
                interfaceC796340VLs.LJIJ(6, c796910VNx2.LJFF ? 1L : 0L);
                interfaceC796340VLs.LJIJ(7, c796910VNx2.LJI);
                String str3 = c796910VNx2.LJII;
                if (str3 == null) {
                    interfaceC796340VLs.LLD(8);
                } else {
                    interfaceC796340VLs.LJIILIIL(8, str3);
                }
                interfaceC796340VLs.LJJI(c796910VNx2.LJIIIIZZ, 9);
                interfaceC796340VLs.LJIJ(10, c796910VNx2.LJIIIZ ? 1L : 0L);
                String str4 = c796910VNx2.LIZ;
                if (str4 == null) {
                    interfaceC796340VLs.LLD(11);
                } else {
                    interfaceC796340VLs.LJIILIIL(11, str4);
                }
                String str5 = c796910VNx2.LIZLLL;
                if (str5 == null) {
                    interfaceC796340VLs.LLD(12);
                } else {
                    interfaceC796340VLs.LJIILIIL(12, str5);
                }
            }
        };
        this.LJ = new AbstractC795470VIj(offlineModeFeedPBDataBase) { // from class: X.0VLk
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "DELETE FROM offline_mode_feed_pb WHERE SEC_UID = ?";
            }
        };
        this.LJFF = new AbstractC795470VIj(offlineModeFeedPBDataBase) { // from class: X.0VLl
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "\n        UPDATE offline_mode_feed_pb\n        SET has_cached = ?, cached_time = ?\n        WHERE sec_uid = ? AND aid = ? AND has_cached != ?\n    ";
            }
        };
        this.LJI = new AbstractC795470VIj(offlineModeFeedPBDataBase) { // from class: X.0VLm
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "\n        UPDATE offline_mode_feed_pb\n        SET url_key = ?\n        WHERE sec_uid = ? AND aid = ?\n    ";
            }
        };
        this.LJII = new AbstractC795470VIj(offlineModeFeedPBDataBase) { // from class: X.0VLn
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "\n        UPDATE offline_mode_feed_pb\n        SET has_watched = ?\n        WHERE sec_uid = ? AND aid = ? AND has_watched != ?\n    ";
            }
        };
        this.LJIIIIZZ = new AbstractC795470VIj(offlineModeFeedPBDataBase) { // from class: X.0VLo
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "\n        DELETE FROM offline_mode_feed_pb\n        WHERE sec_uid = ?\n        And aid = ?\n    ";
            }
        };
        this.LJIIIZ = new AbstractC795470VIj(offlineModeFeedPBDataBase) { // from class: X.0VLp
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "\n        DELETE FROM offline_mode_feed_pb\n    ";
            }
        };
        this.LJIIJ = new AbstractC795470VIj(offlineModeFeedPBDataBase) { // from class: X.0VLi
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "\n        UPDATE offline_mode_feed_pb\n        SET score = ?\n        WHERE sec_uid = ? AND aid = ? \n    ";
            }
        };
        this.LJIIJJI = new AbstractC795470VIj(offlineModeFeedPBDataBase) { // from class: X.0VLj
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "\n        UPDATE offline_mode_feed_pb SET score = 0 , has_watched = 0\n    ";
            }
        };
    }

    @Override // X.InterfaceC625570OgF
    public final int LJIIZILJ(String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        interfaceC796340VLsAcquire.LJIILIIL(1, str);
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final List<Long> LJJIIZ(List<C796910VNx> list) {
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

    @Override // X.InterfaceC625570OgF
    public final List<String> LJJJ(String str) {
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "\n        SELECT url_key\n        FROM offline_mode_feed_pb \n        WHERE sec_uid = ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                arrayList.add(string);
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

    public final void LJJJJI(List<C796910VNx> list) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            handleMultiple(list);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LJI(String str, String str2) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        interfaceC796340VLsAcquire.LJIILIIL(1, str);
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str2);
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LJJI(String str, List<String> list) {
        this.LIZ.assertNotSuspendingTransaction();
        StringBuilder sb = new StringBuilder();
        sb.append("\n        DELETE FROM offline_mode_feed_pb \n        WHERE sec_uid = ?\n        AND aid in (");
        C0VIY.LIZ(sb, list.size());
        sb.append(")\n    ");
        InterfaceC796340VLs interfaceC796340VLsCompileStatement = this.LIZ.compileStatement(sb.toString());
        interfaceC796340VLsCompileStatement.LJIILIIL(1, str);
        int i = 2;
        for (String str2 : list) {
            if (str2 == null) {
                interfaceC796340VLsCompileStatement.LLD(i);
            } else {
                interfaceC796340VLsCompileStatement.LJIILIIL(i, str2);
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

    @Override // X.InterfaceC625570OgF
    public final List<String> LJJIII(String str, List<String> list) {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append("\n        SELECT url_key\n        FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND aid in (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")\n    ");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size + 1, sb.toString());
        c0vn5LIZLLL.LJIILIIL(1, str);
        int i = 2;
        for (String str2 : list) {
            if (str2 == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str2);
            }
            i++;
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                arrayList.add(string);
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

    @Override // X.InterfaceC625570OgF
    public final float LJJIL(String str, String str2) {
        float f;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "\n        SELECT score FROM offline_mode_feed_pb \n        WHERE sec_uid = ?\n        AND aid = ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        if (str2 == null) {
            c0vn5LIZLLL.LLD(2);
        } else {
            c0vn5LIZLLL.LJIILIIL(2, str2);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                f = cursorLIZIZ.getFloat(0);
            } else {
                f = 0.0f;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return f;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LJJJIL(String str, String str2) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        long j = 1;
        interfaceC796340VLsAcquire.LJIJ(1, j);
        interfaceC796340VLsAcquire.LJIILIIL(2, str);
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(3);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(3, str2);
        }
        interfaceC796340VLsAcquire.LJIJ(4, j);
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LIZIZ(long j, long j2, String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT COUNT(aid) FROM offline_mode_feed_pb\n        WHERE sec_uid = ?\n        AND ug_approved = 1\n        AND (insert_time + ?) > ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        int i = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i = cursorLIZIZ.getInt(0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final List LIZLLL(long j, long j2, String str) {
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT aid FROM offline_mode_feed_pb\n        WHERE SEC_UID = ? AND (insert_time + ?) > ? And has_watched = 0\n        ORDER BY INSERT_TIME ASC");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                arrayList.add(string);
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

    @Override // X.InterfaceC625570OgF
    public final List LJ(long j, long j2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM offline_mode_feed_pb \n        WHERE SEC_UID = ? AND aweme_struct IS NOT NULL AND (insert_time + ?) > ? And has_watched = 0\n        ORDER BY INSERT_TIME ASC");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LJFF(long j, long j2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM offline_mode_feed_pb \n        WHERE SEC_UID = ? AND aweme_struct IS NOT NULL AND (insert_time + ?) > ?\n        ORDER BY INSERT_TIME ASC");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC625570OgF
    public final C625850Ogh LJII(long j, long j2, String str) {
        C625850Ogh c625850Ogh;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT aid, cached_time FROM offline_mode_feed_pb\n        WHERE SEC_UID = ? AND aweme_struct IS NOT NULL \n        AND has_watched = 0 AND (insert_time + ?) > ?\n        AND has_cached = 1 \n        ORDER BY ug_approved ASC, score DESC, cached_time ASC\n        LIMIT 1\n    ");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                if (!cursorLIZIZ.isNull(0)) {
                    cursorLIZIZ.getString(0);
                }
                cursorLIZIZ.getLong(1);
                c625850Ogh = new Object() { // from class: X.0Ogh
                };
            } else {
                c625850Ogh = 0;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return c625850Ogh;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final List LJIIIIZZ(long j, long j2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT * FROM offline_mode_feed_pb\n        WHERE SEC_UID = ? And has_cached != 1\n        AND aweme_struct IS NOT NULL AND (insert_time + ?) > ?\n        ORDER BY INSERT_TIME ASC\n        ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final int LJIIIZ(long j, long j2, String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT COUNT(aid) FROM offline_mode_feed_pb\n        WHERE sec_uid = ? AND (insert_time + ?) > ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        int i = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i = cursorLIZIZ.getInt(0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LJIIJJI(long j, long j2, String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT COUNT(aid) FROM offline_mode_feed_pb\n        WHERE sec_uid = ? AND has_watched = 1 AND (insert_time + ?) > ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        int i = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i = cursorLIZIZ.getInt(0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LJIIL(long j, long j2, String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT COUNT(aid) FROM offline_mode_feed_pb \n        WHERE sec_uid = ?\n        AND has_cached = 1 AND (insert_time + ?) > ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        int i = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i = cursorLIZIZ.getInt(0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final List LJIILL(long j, long j2, String str) {
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT aid FROM offline_mode_feed_pb\n        WHERE sec_uid = ? AND has_watched = 1 AND (insert_time + ?) > ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                arrayList.add(string);
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

    @Override // X.InterfaceC625570OgF
    public final List LJIJ(long j, long j2, String str) {
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT aid FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND (insert_time + ?) > ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                arrayList.add(string);
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

    @Override // X.InterfaceC625570OgF
    public final int LJIJI(long j, long j2, String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT COUNT(aid) FROM offline_mode_feed_pb\n        WHERE sec_uid = ?\n        AND has_cached = 1\n        AND ug_approved = 1\n        AND (insert_time + ?) > ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        int i = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i = cursorLIZIZ.getInt(0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final void LJIJJLI(float f, String str, String str2) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        interfaceC796340VLsAcquire.LJJI(f, 1);
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str);
        }
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(3);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(3, str2);
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

    @Override // X.InterfaceC625570OgF
    public final int LJIL(String str, String str2, String str3) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        if (str3 == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str3);
        }
        interfaceC796340VLsAcquire.LJIILIIL(2, str);
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(3);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(3, str2);
        }
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LJJ(long j, long j2, String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT COUNT(aid) FROM offline_mode_feed_pb \n        WHERE sec_uid = ?\n        AND has_cached = 1 AND has_watched = 0 AND (insert_time + ?) > ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        int i = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i = cursorLIZIZ.getInt(0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final List LJJIFFI(long j, long j2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "\n    SELECT * FROM offline_mode_feed_pb\n    WHERE sec_uid = ? \n    AND aweme_struct IS NOT NULL\n    AND has_cached = 1\n    AND has_watched = 0\n    AND (insert_time + ?) > ?\n    ORDER BY ug_approved ASC, score DESC, cached_time ASC\n    LIMIT ?\n");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        c0vn5LIZLLL.LJIJ(4, 20);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LJJIIJZLJL(long j, long j2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "\n        SELECT * FROM offline_mode_feed_pb\n        WHERE SEC_UID = ?\n        AND aweme_struct IS NOT NULL\n        AND has_cached = 1 AND (insert_time + ?) > ?\n        ORDER BY score DESC, cached_time ASC\n        LIMIT ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        c0vn5LIZLLL.LJIJ(4, 3);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final Float LJJIJ(long j, long j2, String str) {
        Float fValueOf;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT score FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND (insert_time + ?) > ? And has_watched = 1 ORDER BY score ASC LIMIT 1\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst() && !cursorLIZIZ.isNull(0)) {
                fValueOf = Float.valueOf(cursorLIZIZ.getFloat(0));
            } else {
                fValueOf = null;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return fValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final String LJJIJIL(long j, long j2, String str) {
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "\n        SELECT aid FROM offline_mode_feed_pb\n        WHERE sec_uid = ?\n        AND aweme_struct IS NOT NULL\n        AND has_cached = 1\n        AND ug_approved = 1\n        AND (insert_time + ?) > ?\n        ORDER BY score DESC, cached_time ASC\n        LIMIT 1\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst() && !cursorLIZIZ.isNull(0)) {
                string = cursorLIZIZ.getString(0);
            } else {
                string = null;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final int LJJIZ(long j, String str, String str2) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        interfaceC796340VLsAcquire.LJIJ(1, 1);
        interfaceC796340VLsAcquire.LJIJ(2, j);
        interfaceC796340VLsAcquire.LJIILIIL(3, str);
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(4);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(4, str2);
        }
        interfaceC796340VLsAcquire.LJIJ(5, 1);
        this.LIZ.beginTransaction();
        try {
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final List LJJJI(long j, long j2, String str) {
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT aid FROM offline_mode_feed_pb WHERE SEC_UID = ? And (insert_time + ?) <= ?");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j2);
        c0vn5LIZLLL.LJIJ(3, j);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                arrayList.add(string);
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

    @Override // X.InterfaceC625570OgF
    public final List LIZJ(long j, long j2, String str, String str2) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(8, "\n        SELECT sec_uid, insert_time, aweme_struct, aid, has_cached, has_watched, cached_time, url_key, score, ug_approved FROM(\n        SELECT * , (cached_time - (SELECT cached_time FROM offline_mode_feed_pb \n            WHERE sec_uid = ?  AND aweme_struct IS NOT NULL  AND has_cached = 1 AND (insert_time + ?) > ? AND aid = ?\n            ORDER BY cached_time ASC LIMIT 1))  as diff\n        FROM offline_mode_feed_pb\n        WHERE sec_uid = ? AND aweme_struct IS NOT NULL \n        AND has_cached = 1 AND (insert_time + ?) > ? AND diff > 0\n        ORDER BY diff ASC LIMIT ?)\n        ORDER BY cached_time ASC\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        if (str2 == null) {
            c0vn5LIZLLL.LLD(4);
        } else {
            c0vn5LIZLLL.LJIILIIL(4, str2);
        }
        c0vn5LIZLLL.LJIILIIL(5, str);
        c0vn5LIZLLL.LJIJ(6, j);
        c0vn5LIZLLL.LJIJ(7, j2);
        c0vn5LIZLLL.LJIJ(8, 20);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                long j3 = cursorLIZIZ.getLong(1);
                if (cursorLIZIZ.isNull(2)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(2);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(3)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(3);
                    }
                    if (cursorLIZIZ.getInt(4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(5) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(6);
                    if (!cursorLIZIZ.isNull(7)) {
                        string3 = cursorLIZIZ.getString(7);
                    }
                    float f = cursorLIZIZ.getFloat(8);
                    if (cursorLIZIZ.getInt(9) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final C796910VNx LJIILJJIL(long j, long j2, String str, String str2) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "\n        SELECT * FROM offline_mode_feed_pb\n        WHERE SEC_UID = ?\n        AND aid = ?\n        AND aweme_struct IS NOT NULL\n        AND (insert_time + ?) > ?\n        ORDER BY INSERT_TIME ASC\n        LIMIT 1\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        if (str2 == null) {
            c0vn5LIZLLL.LLD(2);
        } else {
            c0vn5LIZLLL.LJIILIIL(2, str2);
        }
        c0vn5LIZLLL.LJIJ(3, j);
        c0vn5LIZLLL.LJIJ(4, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            C796910VNx c796910VNx = null;
            String string3 = null;
            if (cursorLIZIZ.moveToFirst()) {
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    String str3 = string3;
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c796910VNx = new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, str3, f, z3);
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return c796910VNx;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC625570OgF
    public final List LJIJJ(int i, long j, long j2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "\n        SELECT * FROM offline_mode_feed_pb\n        WHERE sec_uid = ? AND aweme_struct IS NOT NULL \n        AND has_cached = 1 AND (insert_time + ?) > ?\n        AND has_watched = 0\n        ORDER BY ug_approved ASC, score DESC, cached_time ASC LIMIT ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        c0vn5LIZLLL.LJIJ(4, i);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LJJII(long j, long j2, String str, String str2) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "\n    SELECT * FROM offline_mode_feed_pb\n    WHERE sec_uid = ? \n    AND aweme_struct IS NOT NULL\n    AND has_cached = 1\n    AND has_watched = 1\n    AND (insert_time + ?) > ?\n    AND score <= (SELECT score FROM offline_mode_feed_pb WHERE aid = ? LIMIT 1)\n    ORDER BY score DESC, cached_time ASC\n    LIMIT ?\n");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        if (str2 == null) {
            c0vn5LIZLLL.LLD(4);
        } else {
            c0vn5LIZLLL.LJIILIIL(4, str2);
        }
        c0vn5LIZLLL.LJIJ(5, 20);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LJJIIZI(int i, long j, long j2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "\n        SELECT * FROM offline_mode_feed_pb \n        WHERE SEC_UID = ? \n        AND aweme_struct IS NOT NULL \n        AND has_cached = 1 AND (insert_time + ?) > ?\n        ORDER BY ug_approved ASC, score DESC, cached_time ASC\n        LIMIT ?\n        OFFSET ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        c0vn5LIZLLL.LJIJ(4, i);
        c0vn5LIZLLL.LJIJ(5, 0);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LJJIJL(int i, long j, long j2, String str) {
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(8, "\n        SELECT aid FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND aid IN (\n            SELECT aid\n            FROM offline_mode_feed_pb\n            WHERE sec_uid = ? AND (insert_time + ?) > ?\n            ORDER BY ug_approved ASC, insert_time DESC\n            LIMIT (\n                SELECT COUNT(*)  \n                FROM offline_mode_feed_pb\n                WHERE sec_uid = ? AND (insert_time + ?) > ?\n            ) - ?\n        )\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIILIIL(2, str);
        c0vn5LIZLLL.LJIJ(3, j);
        c0vn5LIZLLL.LJIJ(4, j2);
        c0vn5LIZLLL.LJIILIIL(5, str);
        c0vn5LIZLLL.LJIJ(6, j);
        c0vn5LIZLLL.LJIJ(7, j2);
        c0vn5LIZLLL.LJIJ(8, i);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                arrayList.add(string);
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

    @Override // X.InterfaceC625570OgF
    public final List LJJIJLIJ(long j, long j2, String str, List list) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM offline_mode_feed_pb \n        WHERE SEC_UID = ? AND aid NOT IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(") And has_watched = 0 AND aweme_struct IS NOT NULL AND (insert_time + ?) > ? \n        ORDER BY INSERT_TIME ASC");
        int i = size + 3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(i, sb.toString());
        c0vn5LIZLLL.LJIILIIL(1, str);
        Iterator it2 = list.iterator();
        int i2 = 2;
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (str2 == null) {
                c0vn5LIZLLL.LLD(i2);
            } else {
                c0vn5LIZLLL.LJIILIIL(i2, str2);
            }
            i2++;
        }
        c0vn5LIZLLL.LJIJ(size + 2, j);
        c0vn5LIZLLL.LJIJ(i, j2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LJIIJ(int i, long j, long j2, int i2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "\n        SELECT * FROM offline_mode_feed_pb\n        WHERE SEC_UID = ?\n        AND aweme_struct IS NOT NULL\n        AND (insert_time + ?) > ?\n        ORDER BY INSERT_TIME ASC\n        LIMIT ?\n        OFFSET ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        c0vn5LIZLLL.LJIJ(4, i);
        c0vn5LIZLLL.LJIJ(5, i2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LJIILIIL(int i, long j, long j2, String str, String str2) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(8, "\n        SELECT sec_uid, insert_time, aweme_struct, aid, has_cached, has_watched, cached_time, url_key, score, ug_approved FROM(\n        SELECT * , ((SELECT cached_time FROM offline_mode_feed_pb \n            WHERE sec_uid = ? AND aweme_struct IS NOT NULL  AND has_cached = 1 AND (insert_time + ?) > ? AND aid = ?\n            ORDER BY cached_time ASC LIMIT 1) - cached_time)  as diff\n        FROM offline_mode_feed_pb\n        WHERE sec_uid = ? AND aweme_struct IS NOT NULL \n        AND has_cached = 1 AND (insert_time + ?) > ? AND diff > 0\n        ORDER BY diff ASC LIMIT ?)\n        ORDER BY cached_time ASC\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        if (str2 == null) {
            c0vn5LIZLLL.LLD(4);
        } else {
            c0vn5LIZLLL.LJIILIIL(4, str2);
        }
        c0vn5LIZLLL.LJIILIIL(5, str);
        c0vn5LIZLLL.LJIJ(6, j);
        c0vn5LIZLLL.LJIJ(7, j2);
        c0vn5LIZLLL.LJIJ(8, i);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(0);
                }
                long j3 = cursorLIZIZ.getLong(1);
                if (cursorLIZIZ.isNull(2)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(2);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(3)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(3);
                    }
                    if (cursorLIZIZ.getInt(4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(5) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(6);
                    if (!cursorLIZIZ.isNull(7)) {
                        string3 = cursorLIZIZ.getString(7);
                    }
                    float f = cursorLIZIZ.getFloat(8);
                    if (cursorLIZIZ.getInt(9) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LJJIJIIJI(int i, long j, long j2, int i2, String str) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "\n        SELECT * FROM offline_mode_feed_pb\n        WHERE SEC_UID = ?\n        And has_cached != 1\n        AND aweme_struct IS NOT NULL\n        AND (insert_time + ?) > ?\n        ORDER BY INSERT_TIME ASC\n        LIMIT ?\n        OFFSET ?\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        c0vn5LIZLLL.LJIJ(4, i);
        c0vn5LIZLLL.LJIJ(5, i2);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "sec_uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "insert_time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_struct");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "has_cached");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "has_watched");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "cached_time");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "url_key");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "score");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "ug_approved");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                long j3 = cursorLIZIZ.getLong(iLIZIZ2);
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(iLIZIZ3);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(iLIZIZ4)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(iLIZIZ4);
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(iLIZIZ6) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(iLIZIZ7);
                    if (!cursorLIZIZ.isNull(iLIZIZ8)) {
                        string3 = cursorLIZIZ.getString(iLIZIZ8);
                    }
                    float f = cursorLIZIZ.getFloat(iLIZIZ9);
                    if (cursorLIZIZ.getInt(iLIZIZ10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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

    @Override // X.InterfaceC625570OgF
    public final List LIZ(int i, int i2, String str, String str2, long j, long j2) {
        String string;
        byte[] blob;
        String string2;
        boolean z;
        boolean z2;
        boolean z3;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(9, "\n       SELECT sec_uid, insert_time, aweme_struct, aid, has_cached, has_watched, cached_time, url_key, score, ug_approved FROM(\n        SELECT * , (score - (SELECT score FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND aweme_struct IS NOT NULL  AND has_cached = 1 AND (insert_time + ?) > ? AND aid = ?\n        ORDER BY score ASC LIMIT 1))  as diff\n        FROM offline_mode_feed_pb\n        WHERE sec_uid = ? AND aweme_struct IS NOT NULL \n        AND has_cached = 1 AND has_watched = 1 AND(insert_time + ?) > ? AND diff >= ?\n        ORDER BY diff ASC LIMIT ?)\n        ORDER BY score DESC, cached_time ASC\n    ");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        c0vn5LIZLLL.LJIJ(3, j2);
        if (str2 == null) {
            c0vn5LIZLLL.LLD(4);
        } else {
            c0vn5LIZLLL.LJIILIIL(4, str2);
        }
        c0vn5LIZLLL.LJIILIIL(5, str);
        c0vn5LIZLLL.LJIJ(6, j);
        c0vn5LIZLLL.LJIJ(7, j2);
        c0vn5LIZLLL.LJIJ(8, i2);
        c0vn5LIZLLL.LJIJ(9, i);
        this.LIZ.assertNotSuspendingTransaction();
        int i3 = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(i3)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(i3);
                }
                long j3 = cursorLIZIZ.getLong(1);
                if (cursorLIZIZ.isNull(2)) {
                    blob = null;
                } else {
                    blob = cursorLIZIZ.getBlob(2);
                }
                this.LIZIZ.getClass();
                C5186020i c5186020iLIZ = C796230VLh.LIZ(blob);
                if (c5186020iLIZ != null) {
                    if (cursorLIZIZ.isNull(3)) {
                        string2 = null;
                    } else {
                        string2 = cursorLIZIZ.getString(3);
                    }
                    if (cursorLIZIZ.getInt(4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cursorLIZIZ.getInt(5) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j4 = cursorLIZIZ.getLong(6);
                    if (!cursorLIZIZ.isNull(7)) {
                        string3 = cursorLIZIZ.getString(7);
                    }
                    float f = cursorLIZIZ.getFloat(8);
                    if (cursorLIZIZ.getInt(9) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(new C796910VNx(string, j3, c5186020iLIZ, string2, z, z2, j4, string3, f, z3));
                    i3 = 0;
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.tiktok.proto.AwemeStructV2, but it was null.");
                }
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
}
