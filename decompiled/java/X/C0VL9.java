package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tools.infosticker.repository.internal.recent.RecentUsedStickerDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VL9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VL9 implements InterfaceC1634800sdy {
    public final AbstractC796540VMm LIZ;
    public final C1635190seb LIZIZ;
    public final C117400cW LIZJ = new C117400cW();
    public final C1635180sea LIZLLL;
    public final C854550Xfh LJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0seb] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0sea] */
    public C0VL9(final RecentUsedStickerDataBase recentUsedStickerDataBase) {
        this.LIZ = recentUsedStickerDataBase;
        this.LIZIZ = new AbstractC796330VLr<C1635170seZ>(recentUsedStickerDataBase) { // from class: X.0seb
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stickers` (`id`,`tableName`,`lastUsedTime`,`resourceId`,`imageUrl`,`lokiIconUrl`,`isCustomStickerEntrance`,`thirdPartyUrl`,`stickerId`,`customStickerEntranceExtra`,`customStickerEffectId`,`customStickerWidth`,`customStickerHeight`,`tags`,`imageLocalPath`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC796330VLr
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C1635170seZ c1635170seZ) {
                String strLJJLIIIJ;
                C1635170seZ c1635170seZ2 = c1635170seZ;
                interfaceC796340VLs.LJIJ(1, c1635170seZ2.LIZ);
                String str = c1635170seZ2.LIZIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(2);
                } else {
                    interfaceC796340VLs.LJIILIIL(2, str);
                }
                interfaceC796340VLs.LJIJ(3, c1635170seZ2.LIZJ);
                String str2 = c1635170seZ2.LIZLLL;
                if (str2 == null) {
                    interfaceC796340VLs.LLD(4);
                } else {
                    interfaceC796340VLs.LJIILIIL(4, str2);
                }
                String str3 = c1635170seZ2.LJ;
                if (str3 == null) {
                    interfaceC796340VLs.LLD(5);
                } else {
                    interfaceC796340VLs.LJIILIIL(5, str3);
                }
                String str4 = c1635170seZ2.LJFF;
                if (str4 == null) {
                    interfaceC796340VLs.LLD(6);
                } else {
                    interfaceC796340VLs.LJIILIIL(6, str4);
                }
                interfaceC796340VLs.LJIJ(7, c1635170seZ2.LJI ? 1L : 0L);
                String str5 = c1635170seZ2.LJII;
                if (str5 == null) {
                    interfaceC796340VLs.LLD(8);
                } else {
                    interfaceC796340VLs.LJIILIIL(8, str5);
                }
                String str6 = c1635170seZ2.LJIIIIZZ;
                if (str6 == null) {
                    interfaceC796340VLs.LLD(9);
                } else {
                    interfaceC796340VLs.LJIILIIL(9, str6);
                }
                String str7 = c1635170seZ2.LJIIIZ;
                if (str7 == null) {
                    interfaceC796340VLs.LLD(10);
                } else {
                    interfaceC796340VLs.LJIILIIL(10, str7);
                }
                String str8 = c1635170seZ2.LJIIJ;
                if (str8 == null) {
                    interfaceC796340VLs.LLD(11);
                } else {
                    interfaceC796340VLs.LJIILIIL(11, str8);
                }
                String str9 = c1635170seZ2.LJIIJJI;
                if (str9 == null) {
                    interfaceC796340VLs.LLD(12);
                } else {
                    interfaceC796340VLs.LJIILIIL(12, str9);
                }
                String str10 = c1635170seZ2.LJIIL;
                if (str10 == null) {
                    interfaceC796340VLs.LLD(13);
                } else {
                    interfaceC796340VLs.LJIILIIL(13, str10);
                }
                C117400cW c117400cW = this.LIZ.LIZJ;
                List<String> list = c1635170seZ2.LJIILIIL;
                c117400cW.getClass();
                if (list != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
                if (strLJJLIIIJ == null) {
                    interfaceC796340VLs.LLD(14);
                } else {
                    interfaceC796340VLs.LJIILIIL(14, strLJJLIIIJ);
                }
                String str11 = c1635170seZ2.LJIILJJIL;
                if (str11 == null) {
                    interfaceC796340VLs.LLD(15);
                } else {
                    interfaceC796340VLs.LJIILIIL(15, str11);
                }
            }
        };
        this.LIZLLL = new AbstractC796320VLq<C1635170seZ>(recentUsedStickerDataBase) { // from class: X.0sea
            @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
            public final String createQuery() {
                return "UPDATE OR ABORT `stickers` SET `id` = ?,`tableName` = ?,`lastUsedTime` = ?,`resourceId` = ?,`imageUrl` = ?,`lokiIconUrl` = ?,`isCustomStickerEntrance` = ?,`thirdPartyUrl` = ?,`stickerId` = ?,`customStickerEntranceExtra` = ?,`customStickerEffectId` = ?,`customStickerWidth` = ?,`customStickerHeight` = ?,`tags` = ?,`imageLocalPath` = ? WHERE `id` = ?";
            }

            @Override // X.AbstractC796320VLq
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C1635170seZ c1635170seZ) {
                String strLJJLIIIJ;
                C1635170seZ c1635170seZ2 = c1635170seZ;
                interfaceC796340VLs.LJIJ(1, c1635170seZ2.LIZ);
                String str = c1635170seZ2.LIZIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(2);
                } else {
                    interfaceC796340VLs.LJIILIIL(2, str);
                }
                interfaceC796340VLs.LJIJ(3, c1635170seZ2.LIZJ);
                String str2 = c1635170seZ2.LIZLLL;
                if (str2 == null) {
                    interfaceC796340VLs.LLD(4);
                } else {
                    interfaceC796340VLs.LJIILIIL(4, str2);
                }
                String str3 = c1635170seZ2.LJ;
                if (str3 == null) {
                    interfaceC796340VLs.LLD(5);
                } else {
                    interfaceC796340VLs.LJIILIIL(5, str3);
                }
                String str4 = c1635170seZ2.LJFF;
                if (str4 == null) {
                    interfaceC796340VLs.LLD(6);
                } else {
                    interfaceC796340VLs.LJIILIIL(6, str4);
                }
                interfaceC796340VLs.LJIJ(7, c1635170seZ2.LJI ? 1L : 0L);
                String str5 = c1635170seZ2.LJII;
                if (str5 == null) {
                    interfaceC796340VLs.LLD(8);
                } else {
                    interfaceC796340VLs.LJIILIIL(8, str5);
                }
                String str6 = c1635170seZ2.LJIIIIZZ;
                if (str6 == null) {
                    interfaceC796340VLs.LLD(9);
                } else {
                    interfaceC796340VLs.LJIILIIL(9, str6);
                }
                String str7 = c1635170seZ2.LJIIIZ;
                if (str7 == null) {
                    interfaceC796340VLs.LLD(10);
                } else {
                    interfaceC796340VLs.LJIILIIL(10, str7);
                }
                String str8 = c1635170seZ2.LJIIJ;
                if (str8 == null) {
                    interfaceC796340VLs.LLD(11);
                } else {
                    interfaceC796340VLs.LJIILIIL(11, str8);
                }
                String str9 = c1635170seZ2.LJIIJJI;
                if (str9 == null) {
                    interfaceC796340VLs.LLD(12);
                } else {
                    interfaceC796340VLs.LJIILIIL(12, str9);
                }
                String str10 = c1635170seZ2.LJIIL;
                if (str10 == null) {
                    interfaceC796340VLs.LLD(13);
                } else {
                    interfaceC796340VLs.LJIILIIL(13, str10);
                }
                C117400cW c117400cW = this.LIZ.LIZJ;
                List<String> list = c1635170seZ2.LJIILIIL;
                c117400cW.getClass();
                if (list != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
                if (strLJJLIIIJ == null) {
                    interfaceC796340VLs.LLD(14);
                } else {
                    interfaceC796340VLs.LJIILIIL(14, strLJJLIIIJ);
                }
                String str11 = c1635170seZ2.LJIILJJIL;
                if (str11 == null) {
                    interfaceC796340VLs.LLD(15);
                } else {
                    interfaceC796340VLs.LJIILIIL(15, str11);
                }
                interfaceC796340VLs.LJIJ(16, c1635170seZ2.LIZ);
            }
        };
        this.LJ = new C854550Xfh(recentUsedStickerDataBase, 78);
    }

    @Override // X.InterfaceC1634800sdy
    public final void LIZIZ(C1635170seZ c1635170seZ) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            handle(c1635170seZ);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.InterfaceC1634800sdy
    public final List<C1635170seZ> LIZJ(String str) throws Throwable {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLIZIZ7;
        int iLIZIZ8;
        int iLIZIZ9;
        int iLIZIZ10;
        int iLIZIZ11;
        int iLIZIZ12;
        int iLIZIZ13;
        int iLIZIZ14;
        String string;
        String string2;
        String string3;
        String string4;
        boolean z;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM stickers WHERE tableName = ? AND resourceId IS NOT NULL AND isCustomStickerEntrance = 0");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            try {
                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "tableName");
                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "lastUsedTime");
                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "resourceId");
                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "imageUrl");
                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "lokiIconUrl");
                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "isCustomStickerEntrance");
                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "thirdPartyUrl");
                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "stickerId");
                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerEntranceExtra");
                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerEffectId");
                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerWidth");
                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerHeight");
                try {
                    iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "tags");
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "imageLocalPath");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                int i = cursorLIZIZ.getInt(iLIZIZ);
                String string12 = null;
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ2);
                }
                long j = cursorLIZIZ.getLong(iLIZIZ3);
                if (cursorLIZIZ.isNull(iLIZIZ4)) {
                    string2 = null;
                } else {
                    string2 = cursorLIZIZ.getString(iLIZIZ4);
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
                if (cursorLIZIZ.isNull(iLIZIZ8)) {
                    string5 = null;
                } else {
                    string5 = cursorLIZIZ.getString(iLIZIZ8);
                }
                if (cursorLIZIZ.isNull(iLIZIZ9)) {
                    string6 = null;
                } else {
                    string6 = cursorLIZIZ.getString(iLIZIZ9);
                }
                if (cursorLIZIZ.isNull(iLIZIZ10)) {
                    string7 = null;
                } else {
                    string7 = cursorLIZIZ.getString(iLIZIZ10);
                }
                if (cursorLIZIZ.isNull(iLIZIZ11)) {
                    string8 = null;
                } else {
                    string8 = cursorLIZIZ.getString(iLIZIZ11);
                }
                if (cursorLIZIZ.isNull(iLIZIZ12)) {
                    string9 = null;
                } else {
                    string9 = cursorLIZIZ.getString(iLIZIZ12);
                }
                if (cursorLIZIZ.isNull(iLIZIZ13)) {
                    string10 = null;
                } else {
                    string10 = cursorLIZIZ.getString(iLIZIZ13);
                }
                if (cursorLIZIZ.isNull(iLIZIZ14)) {
                    string11 = null;
                } else {
                    string11 = cursorLIZIZ.getString(iLIZIZ14);
                }
                this.LIZJ.getClass();
                List listLIZ = C117400cW.LIZ(string11);
                if (listLIZ != null) {
                    if (!cursorLIZIZ.isNull(iLIZIZ15)) {
                        string12 = cursorLIZIZ.getString(iLIZIZ15);
                    }
                    arrayList.add(new C1635170seZ(i, string, j, string2, string3, string4, z, string5, string6, string7, string8, string9, string10, listLIZ, string12));
                } else {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC1634800sdy
    public final void LJ(C1635170seZ c1635170seZ) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            insert(c1635170seZ);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.InterfaceC1634800sdy
    public final List<C1635170seZ> LJFF(String str) throws Throwable {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLIZIZ7;
        int iLIZIZ8;
        int iLIZIZ9;
        int iLIZIZ10;
        int iLIZIZ11;
        int iLIZIZ12;
        int iLIZIZ13;
        int iLIZIZ14;
        String string;
        String string2;
        String string3;
        String string4;
        boolean z;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM stickers WHERE tableName = ? AND imageUrl IS NOT NULL");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            try {
                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "tableName");
                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "lastUsedTime");
                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "resourceId");
                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "imageUrl");
                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "lokiIconUrl");
                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "isCustomStickerEntrance");
                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "thirdPartyUrl");
                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "stickerId");
                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerEntranceExtra");
                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerEffectId");
                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerWidth");
                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerHeight");
                try {
                    iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "tags");
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "imageLocalPath");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                int i = cursorLIZIZ.getInt(iLIZIZ);
                String string12 = null;
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ2);
                }
                long j = cursorLIZIZ.getLong(iLIZIZ3);
                if (cursorLIZIZ.isNull(iLIZIZ4)) {
                    string2 = null;
                } else {
                    string2 = cursorLIZIZ.getString(iLIZIZ4);
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
                if (cursorLIZIZ.isNull(iLIZIZ8)) {
                    string5 = null;
                } else {
                    string5 = cursorLIZIZ.getString(iLIZIZ8);
                }
                if (cursorLIZIZ.isNull(iLIZIZ9)) {
                    string6 = null;
                } else {
                    string6 = cursorLIZIZ.getString(iLIZIZ9);
                }
                if (cursorLIZIZ.isNull(iLIZIZ10)) {
                    string7 = null;
                } else {
                    string7 = cursorLIZIZ.getString(iLIZIZ10);
                }
                if (cursorLIZIZ.isNull(iLIZIZ11)) {
                    string8 = null;
                } else {
                    string8 = cursorLIZIZ.getString(iLIZIZ11);
                }
                if (cursorLIZIZ.isNull(iLIZIZ12)) {
                    string9 = null;
                } else {
                    string9 = cursorLIZIZ.getString(iLIZIZ12);
                }
                if (cursorLIZIZ.isNull(iLIZIZ13)) {
                    string10 = null;
                } else {
                    string10 = cursorLIZIZ.getString(iLIZIZ13);
                }
                if (cursorLIZIZ.isNull(iLIZIZ14)) {
                    string11 = null;
                } else {
                    string11 = cursorLIZIZ.getString(iLIZIZ14);
                }
                this.LIZJ.getClass();
                List listLIZ = C117400cW.LIZ(string11);
                if (listLIZ != null) {
                    if (!cursorLIZIZ.isNull(iLIZIZ15)) {
                        string12 = cursorLIZIZ.getString(iLIZIZ15);
                    }
                    arrayList.add(new C1635170seZ(i, string, j, string2, string3, string4, z, string5, string6, string7, string8, string9, string10, listLIZ, string12));
                } else {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC1634800sdy
    public final List<C1635170seZ> LJI(String str) throws Throwable {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLIZIZ7;
        int iLIZIZ8;
        int iLIZIZ9;
        int iLIZIZ10;
        int iLIZIZ11;
        int iLIZIZ12;
        int iLIZIZ13;
        int iLIZIZ14;
        String string;
        String string2;
        String string3;
        String string4;
        boolean z;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM stickers WHERE tableName = ? AND isCustomStickerEntrance = 1");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            try {
                iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
                iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "tableName");
                iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "lastUsedTime");
                iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "resourceId");
                iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "imageUrl");
                iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "lokiIconUrl");
                iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "isCustomStickerEntrance");
                iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "thirdPartyUrl");
                iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "stickerId");
                iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerEntranceExtra");
                iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerEffectId");
                iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerWidth");
                iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerHeight");
                try {
                    iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "tags");
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "imageLocalPath");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                int i = cursorLIZIZ.getInt(iLIZIZ);
                String string12 = null;
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ2);
                }
                long j = cursorLIZIZ.getLong(iLIZIZ3);
                if (cursorLIZIZ.isNull(iLIZIZ4)) {
                    string2 = null;
                } else {
                    string2 = cursorLIZIZ.getString(iLIZIZ4);
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
                if (cursorLIZIZ.isNull(iLIZIZ8)) {
                    string5 = null;
                } else {
                    string5 = cursorLIZIZ.getString(iLIZIZ8);
                }
                if (cursorLIZIZ.isNull(iLIZIZ9)) {
                    string6 = null;
                } else {
                    string6 = cursorLIZIZ.getString(iLIZIZ9);
                }
                if (cursorLIZIZ.isNull(iLIZIZ10)) {
                    string7 = null;
                } else {
                    string7 = cursorLIZIZ.getString(iLIZIZ10);
                }
                if (cursorLIZIZ.isNull(iLIZIZ11)) {
                    string8 = null;
                } else {
                    string8 = cursorLIZIZ.getString(iLIZIZ11);
                }
                if (cursorLIZIZ.isNull(iLIZIZ12)) {
                    string9 = null;
                } else {
                    string9 = cursorLIZIZ.getString(iLIZIZ12);
                }
                if (cursorLIZIZ.isNull(iLIZIZ13)) {
                    string10 = null;
                } else {
                    string10 = cursorLIZIZ.getString(iLIZIZ13);
                }
                if (cursorLIZIZ.isNull(iLIZIZ14)) {
                    string11 = null;
                } else {
                    string11 = cursorLIZIZ.getString(iLIZIZ14);
                }
                this.LIZJ.getClass();
                List listLIZ = C117400cW.LIZ(string11);
                if (listLIZ != null) {
                    if (!cursorLIZIZ.isNull(iLIZIZ15)) {
                        string12 = cursorLIZIZ.getString(iLIZIZ15);
                    }
                    arrayList.add(new C1635170seZ(i, string, j, string2, string3, string4, z, string5, string6, string7, string8, string9, string10, listLIZ, string12));
                } else {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC1634800sdy
    public final void LIZ(String str, String str2, String str3) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJ.acquire();
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        if (str2 == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str2);
        }
        if (str3 == null) {
            interfaceC796340VLsAcquire.LLD(3);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(3, str3);
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LJ.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC1634800sdy
    public final List<C1635170seZ> LIZLLL(String str, String str2, String str3) throws Throwable {
        String string;
        String string2;
        String string3;
        String string4;
        boolean z;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM stickers WHERE tableName = ? AND ((resourceId = ? AND resourceId IS NOT NULL) OR (imageUrl = ? AND imageUrl IS NOT NULL))");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        if (str2 == null) {
            c0vn5LIZLLL.LLD(2);
        } else {
            c0vn5LIZLLL.LJIILIIL(2, str2);
        }
        if (str3 == null) {
            c0vn5LIZLLL.LLD(3);
        } else {
            c0vn5LIZLLL.LJIILIIL(3, str3);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "tableName");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "lastUsedTime");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "resourceId");
            int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "imageUrl");
            int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "lokiIconUrl");
            int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "isCustomStickerEntrance");
            int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "thirdPartyUrl");
            int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "stickerId");
            int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerEntranceExtra");
            int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerEffectId");
            int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerWidth");
            int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "customStickerHeight");
            try {
                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "tags");
                try {
                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "imageLocalPath");
                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                    while (cursorLIZIZ.moveToNext()) {
                        int i = cursorLIZIZ.getInt(iLIZIZ);
                        String string12 = null;
                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                            string = null;
                        } else {
                            string = cursorLIZIZ.getString(iLIZIZ2);
                        }
                        long j = cursorLIZIZ.getLong(iLIZIZ3);
                        if (cursorLIZIZ.isNull(iLIZIZ4)) {
                            string2 = null;
                        } else {
                            string2 = cursorLIZIZ.getString(iLIZIZ4);
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
                        if (cursorLIZIZ.isNull(iLIZIZ8)) {
                            string5 = null;
                        } else {
                            string5 = cursorLIZIZ.getString(iLIZIZ8);
                        }
                        if (cursorLIZIZ.isNull(iLIZIZ9)) {
                            string6 = null;
                        } else {
                            string6 = cursorLIZIZ.getString(iLIZIZ9);
                        }
                        if (cursorLIZIZ.isNull(iLIZIZ10)) {
                            string7 = null;
                        } else {
                            string7 = cursorLIZIZ.getString(iLIZIZ10);
                        }
                        if (cursorLIZIZ.isNull(iLIZIZ11)) {
                            string8 = null;
                        } else {
                            string8 = cursorLIZIZ.getString(iLIZIZ11);
                        }
                        if (cursorLIZIZ.isNull(iLIZIZ12)) {
                            string9 = null;
                        } else {
                            string9 = cursorLIZIZ.getString(iLIZIZ12);
                        }
                        if (cursorLIZIZ.isNull(iLIZIZ13)) {
                            string10 = null;
                        } else {
                            string10 = cursorLIZIZ.getString(iLIZIZ13);
                        }
                        if (cursorLIZIZ.isNull(iLIZIZ14)) {
                            string11 = null;
                        } else {
                            string11 = cursorLIZIZ.getString(iLIZIZ14);
                        }
                        try {
                            this.LIZJ.getClass();
                            List listLIZ = C117400cW.LIZ(string11);
                            if (listLIZ != null) {
                                if (!cursorLIZIZ.isNull(iLIZIZ15)) {
                                    string12 = cursorLIZIZ.getString(iLIZIZ15);
                                }
                                arrayList.add(new C1635170seZ(i, string, j, string2, string3, string4, z, string5, string6, string7, string8, string9, string10, listLIZ, string12));
                            } else {
                                throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                            }
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
                    }
                    cursorLIZIZ.close();
                    c0vn5LIZLLL.release();
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
