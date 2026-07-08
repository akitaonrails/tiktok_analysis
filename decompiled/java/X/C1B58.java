package X;

import Y.ACallableS100S0101000_34;
import Y.ACallableS436S0100000_34;
import Y.ACallableS76S1100000_34;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS38S0201000_34;
import Y.ARunnableS45S0101000_34;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B58, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B58 extends C1B59 implements C1B5Y {
    public static volatile SQLiteDatabase LLILZLL;
    public static final int LLIZ;
    public static volatile HashMap<String, Integer> LLIZLLLIL;
    public static final int LLJ;
    public C2189941AnI LLILLJJLI;
    public C2189941AnI LLILLL;
    public volatile boolean LLILZ;
    public C1B5G LLILZIL;

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final void LJIIIZ(int i) {
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final void LJIJI(DownloadInfo downloadInfo) {
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJL(int i) {
        return null;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final boolean LJL() {
        return false;
    }

    @Override // X.InterfaceC2199141B5c
    public final void LLLIIL() {
    }

    @Override // X.InterfaceC2199141B5c
    public final void clearMemoryCacheData(double d) {
    }

    public static void l1() {
        if (LLILZLL == null) {
            return;
        }
        try {
            LLILZLL.execSQL("DROP TABLE IF EXISTS downloadChunk");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error:");
            sbLIZ.append(th);
            C1490830otl.LIZJ("SqlDownloadCache", "deleteChunkTable", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void n1() {
        if (LLIZLLLIL != null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = C2199751B7l.LIZIZ().optJSONObject("lru_preload_hot_cache_keys");
        String str = C2199661B7c.LIZ;
        HashMap<String, Integer> map = null;
        if (jSONObjectOptJSONObject != null) {
            HashMap<String, Integer> map2 = new HashMap<>();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null) {
                    map2.put(next, Integer.valueOf(jSONObjectOptJSONObject.optInt(next, 0)));
                }
            }
            if (!map2.isEmpty()) {
                map = map2;
            }
        }
        LLIZLLLIL = map;
    }

    public static void r1() {
        try {
            if (LLILZLL == null || !LLILZLL.inTransaction()) {
                return;
            }
            LLILZLL.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final void clearData() {
        C2199681B7e.LJJIIZI(new ARunnableS134S0100000_34(this, 43));
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getAllDownloadInfo() {
        return (List) q1(new ACallableS436S0100000_34(this, 3), new C1B5F<List<DownloadInfo>>() { // from class: X.1B5B
            @Override // X.C1B5F
            public final List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    public final void m1() {
        if (LLILZLL == null) {
            synchronized (C1B58.class) {
                try {
                    if (LLILZLL == null) {
                        try {
                            LLILZLL = C20131013pk.LIZ().getWritableDatabase();
                            this.LLILLJJLI = new C2189941AnI(LLILZLL, "downloader", InterfaceC2199781B7o.LIZ, InterfaceC2199781B7o.LIZIZ);
                            this.LLILLL = new C2189941AnI(LLILZLL, "segments", InterfaceC2199781B7o.LIZJ, InterfaceC2199781B7o.LIZLLL);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    static {
        JSONObject jSONObjectLIZIZ = C2199751B7l.LIZIZ();
        int i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        int iOptInt = jSONObjectLIZIZ.optInt("lru_download_info_capacity_max", DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        if (iOptInt >= 100) {
            i = iOptInt;
        }
        LLIZ = i;
        LLIZLLLIL = null;
        LLJ = C2199751B7l.LJFF.LJIIIIZZ("main_thread_db_op_max_time_ms", 0);
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final boolean isDownloadCacheSyncSuccess() {
        return this.LLILZ;
    }

    public static void k1(List list) {
        try {
            for (DownloadInfo downloadInfo : (ArrayList) list) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    C2199671B7d.LIZJ(downloadInfo);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final boolean LJIIIIZZ(int i) {
        C2199681B7e.LJJIIZI(new ARunnableS45S0101000_34(this, i, 4));
        return true;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final boolean LJIILLIIL(int i) {
        C2199681B7e.LJJIIZI(new ARunnableS45S0101000_34(this, i, 3));
        return true;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJIIJ(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) (-7));
        s1(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJ(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) 1);
        s1(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJJJ(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) 5);
        contentValues.put("isFirstDownload", (Integer) 0);
        s1(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public final void LJJJZ(int i) {
        m1();
        if (LLILZLL == null) {
            return;
        }
        try {
            SQLiteStatement sQLiteStatementLIZ = this.LLILLL.LIZ();
            if (sQLiteStatementLIZ != null) {
                try {
                    synchronized (sQLiteStatementLIZ) {
                        try {
                            sQLiteStatementLIZ.bindLong(1, i);
                            sQLiteStatementLIZ.execute();
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th) {
                }
            }
        } catch (Throwable th2) {
        }
    }

    @Override // X.InterfaceC2199141B5c
    public final List LLILLIZIL(int i) {
        Map<Long, C2199811B7r> mapX = x(i);
        if (mapX != null) {
            HashMap map = (HashMap) mapX;
            if (!map.isEmpty()) {
                return new ArrayList(map.values());
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC2199171B5f
    public final void N(boolean z) {
        if (z) {
            SparseArray sparseArray = new SparseArray();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            Context context = C2199681B7e.LIZ;
            synchronized (C2199681B7e.class) {
            }
            m0(sparseArray, map, arrayList, null, null);
            return;
        }
        m0(new SparseArray(), null, null, null, null);
    }

    @Override // X.InterfaceC2199171B5f
    public final void d1(C1B5G c1b5g) {
        this.LLILZIL = c1b5g;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo getDownloadInfo(int i) {
        return (DownloadInfo) q1(new ACallableS100S0101000_34(i, this, 0), null);
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        return (List) q1(new ACallableS76S1100000_34(this, str, 0), new C1B5F<List<DownloadInfo>>() { // from class: X.1B5C
            @Override // X.C1B5F
            public final List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        return (List) q1(new ACallableS76S1100000_34(this, str, 3), new C1B5F<List<DownloadInfo>>() { // from class: X.1B5A
            @Override // X.C1B5F
            public final List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return (List) q1(new ACallableS76S1100000_34(this, str, 1), new C1B5F<List<DownloadInfo>>() { // from class: X.1B5D
            @Override // X.C1B5F
            public final List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return (List) q1(new ACallableS76S1100000_34(this, str, 2), new C1B5F<List<DownloadInfo>>() { // from class: X.1B5E
            @Override // X.C1B5F
            public final List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    public final void j1(DownloadInfo downloadInfo) {
        C2199681B7e.LJJIIZI(new ARunnableS103S0200000_34(downloadInfo, this, 25));
    }

    public final synchronized void t1(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        try {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (getDownloadInfo(downloadInfo.getId()) != null) {
                C2189941AnI c2189941AnI = this.LLILLJJLI;
                if (c2189941AnI == null) {
                    return;
                }
                try {
                    u1(downloadInfo, c2189941AnI.LIZLLL());
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            } else {
                j1(downloadInfo);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        if (C07OB.LIZ()) {
            C2193971Atn.LIZ = new WeakReference<>(this);
            C2193971Atn.LIZIZ = new WeakReference<>(this.LLILLJJLI);
        }
        if (downloadInfo == null) {
            return false;
        }
        C2199681B7e.LJJIIZI(new ARunnableS103S0200000_34(downloadInfo, this, 26));
        return true;
    }

    @Override // X.InterfaceC2199141B5c
    public final Map<Long, C2199811B7r> x(int i) {
        Cursor cursorRawQuery;
        String string;
        m1();
        if (LLILZLL != null) {
            try {
                cursorRawQuery = LLILZLL.rawQuery(C786410Ut5.j4("SELECT * FROM %s WHERE %s = ?", new Object[]{"segments", "_id"}), new String[]{Integer.toString(i)});
                try {
                    if (cursorRawQuery.moveToNext()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("info");
                        if (columnIndex >= 0) {
                            string = cursorRawQuery.getString(columnIndex);
                        } else {
                            string = null;
                        }
                        HashMap map = new HashMap();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            C2199811B7r c2199811B7r = new C2199811B7r(jSONArray.getJSONObject(i2));
                            map.put(Long.valueOf(c2199811B7r.LIZ), c2199811B7r);
                        }
                        C2199671B7d.LJJIII(cursorRawQuery);
                        return map;
                    }
                    C2199671B7d.LJJIII(cursorRawQuery);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2199671B7d.LJJIII(cursorRawQuery);
                        return null;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C2199671B7d.LJJIII(cursorRawQuery);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = null;
            }
        }
        return null;
    }

    public static Object q1(Callable callable, C1B5F c1b5f) {
        int i = LLJ;
        if (i > 0 && C2199671B7d.LJIJJLI()) {
            try {
                return C2199681B7e.LJII().submit(callable).get(i, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Get Error: ");
                sbLIZ.append(th);
                C1490830otl.LIZJ("SqlDownloadCache", "runImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            try {
                return callable.call();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Call Error: ");
                sbLIZ2.append(th2);
                C1490830otl.LIZJ("SqlDownloadCache", "runImpl", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (c1b5f != null) {
            return c1b5f.getDefaultValue();
        }
        return null;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJIJIIJI(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) (-2));
        contentValues.put("curBytes", Long.valueOf(j));
        s1(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJJ(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) (-1));
        contentValues.put("curBytes", Long.valueOf(j));
        if (j > 0) {
            contentValues.put("isFirstDownload", (Integer) 0);
        }
        s1(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJLIIIJLLLLLLLZ(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) (-3));
        contentValues.put("curBytes", Long.valueOf(j));
        contentValues.put("isFirstDownload", (Integer) 0);
        contentValues.put("isFirstSuccess", (Integer) 0);
        s1(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJZZI(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) 4);
        contentValues.put("curBytes", Long.valueOf(j));
        s1(i, contentValues);
        return null;
    }

    @Override // X.InterfaceC2199141B5c
    public final boolean LLLLII(int i, Map<Long, C2199811B7r> map) {
        m1();
        if (LLILZLL == null) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Long, C2199811B7r> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    C2199811B7r value = entry.getValue();
                    JSONObject jSONObject = value.LJII;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                        value.LJII = jSONObject;
                    }
                    jSONObject.put("st", value.LIZ);
                    jSONObject.put("cu", value.LIZ());
                    jSONObject.put("en", value.LIZLLL);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable th) {
        }
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Json=");
            sbLIZ.append(jSONArray);
            C1490830otl.LIZLLL(i, "SqlDownloadCache", "updateSegments", C2188811AlT.LIZIZ(sbLIZ));
        }
        SQLiteStatement sQLiteStatementLIZIZ = this.LLILLL.LIZIZ();
        if (sQLiteStatementLIZIZ == null) {
            C1490830otl.LJ(i, "SqlDownloadCache", "updateSegments", "UpdateSegments statement is null");
            return false;
        }
        synchronized (sQLiteStatementLIZIZ) {
            try {
                sQLiteStatementLIZIZ.clearBindings();
                sQLiteStatementLIZIZ.bindLong(1, i);
                sQLiteStatementLIZIZ.bindString(2, jSONArray.toString());
                sQLiteStatementLIZIZ.execute();
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public final void s1(int i, ContentValues contentValues) {
        C2199681B7e.LJJIIZI(new ARunnableS38S0201000_34(this, contentValues, i, 3));
    }

    public final void u1(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    try {
                        downloadInfo.bindValue(sQLiteStatement);
                        sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, downloadInfo.getId());
                        sQLiteStatement.execute();
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    public static void o1(List list, List list2, SparseArray sparseArray) {
        int size = sparseArray.size();
        if (size >= 0 && LLILZLL != null) {
            synchronized (LLILZLL) {
                try {
                    try {
                        LLILZLL.beginTransaction();
                        ArrayList arrayList = (ArrayList) list;
                        if (!arrayList.isEmpty()) {
                            if (C2199751B7l.LJFF.LJI("clear_invalid_task_error", false)) {
                                String[] strArr = new String[arrayList.size()];
                                for (int i = 0; i < arrayList.size(); i++) {
                                    strArr[i] = String.valueOf(arrayList.get(i));
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("CAST(_id AS TEXT) IN (");
                                sbLIZ.append(new String(new char[arrayList.size() - 1]).replace("\u0000", "?,"));
                                sbLIZ.append("?)");
                                LLILZLL.delete("downloader", C2188811AlT.LIZIZ(sbLIZ), strArr);
                            } else {
                                LLILZLL.delete("downloader", "_id IN (?)", new String[]{TextUtils.join(", ", list2)});
                            }
                        }
                        for (int i2 = 0; i2 < size; i2++) {
                            int iKeyAt = sparseArray.keyAt(i2);
                            DownloadInfo downloadInfo = (DownloadInfo) sparseArray.get(iKeyAt);
                            LLILZLL.delete("downloader", "_id = ?", new String[]{String.valueOf(iKeyAt)});
                            LLILZLL.insert("downloader", null, C2199661B7c.LJJ(downloadInfo));
                        }
                        LLILZLL.setTransactionSuccessful();
                    } finally {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                    r1();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    public final void p1(SparseArray<DownloadInfo> sparseArray, HashMap<Integer, Integer> map, List<DownloadInfo> list) {
        HashMap map2;
        try {
            String str = C2199661B7c.LIZ;
            HashMap map3 = null;
            if (sparseArray != null) {
                map2 = new HashMap();
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    map2.put(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
                }
            } else {
                map2 = null;
            }
            if (list != null) {
                map3 = new HashMap();
                for (DownloadInfo downloadInfo : list) {
                    if (downloadInfo.getId() != 0) {
                        map3.put(Integer.valueOf(downloadInfo.getId()), downloadInfo);
                    }
                }
            }
            C1B5G c1b5g = this.LLILZIL;
            if (c1b5g != null) {
                c1b5g.LJLLL(map2, map, map3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC2199171B5f, X.InterfaceC2199141B5c
    public final DownloadInfo LJJJI(int i, String str, long j, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) 3);
        contentValues.put("totalBytes", Long.valueOf(j));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("name", str2);
        }
        s1(i, contentValues);
        return null;
    }

    @Override // X.C1B5Y
    public final void m0(final SparseArray sparseArray, final HashMap map, final List list, final List list2, final C2199121B5a c2199121B5a) {
        try {
            Runnable runnable = new Runnable() { // from class: X.1B5U
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:111:0x01eb A[Catch: all -> 0x0219, PHI: r18
                  0x01eb: PHI (r18v4 int) = (r18v2 int), (r18v2 int), (r18v2 int), (r18v5 int) binds: [B:76:0x0158, B:78:0x015c, B:98:0x01b0, B:150:0x01eb] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0219, blocks: (B:37:0x00b1, B:38:0x00b6, B:40:0x00c2, B:42:0x00cc, B:44:0x00d3, B:55:0x00f3, B:57:0x00f9, B:58:0x00fd, B:60:0x010b, B:62:0x0111, B:64:0x0117, B:65:0x0124, B:69:0x012d, B:71:0x0137, B:75:0x0156, B:77:0x015a, B:79:0x015e, B:83:0x016e, B:84:0x0175, B:86:0x0179, B:88:0x017f, B:90:0x018b, B:94:0x01a4, B:97:0x01ab, B:99:0x01b2, B:101:0x01bc, B:104:0x01c6, B:105:0x01d0, B:107:0x01d6, B:109:0x01e4, B:112:0x01f5, B:111:0x01eb, B:72:0x013e, B:74:0x0150, B:47:0x00dd, B:49:0x00e3, B:51:0x00e9, B:53:0x00ef, B:113:0x0208), top: B:140:0x00b1 }] */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0208 A[Catch: all -> 0x0219, TryCatch #2 {all -> 0x0219, blocks: (B:37:0x00b1, B:38:0x00b6, B:40:0x00c2, B:42:0x00cc, B:44:0x00d3, B:55:0x00f3, B:57:0x00f9, B:58:0x00fd, B:60:0x010b, B:62:0x0111, B:64:0x0117, B:65:0x0124, B:69:0x012d, B:71:0x0137, B:75:0x0156, B:77:0x015a, B:79:0x015e, B:83:0x016e, B:84:0x0175, B:86:0x0179, B:88:0x017f, B:90:0x018b, B:94:0x01a4, B:97:0x01ab, B:99:0x01b2, B:101:0x01bc, B:104:0x01c6, B:105:0x01d0, B:107:0x01d6, B:109:0x01e4, B:112:0x01f5, B:111:0x01eb, B:72:0x013e, B:74:0x0150, B:47:0x00dd, B:49:0x00e3, B:51:0x00e9, B:53:0x00ef, B:113:0x0208), top: B:140:0x00b1 }] */
                /* JADX WARN: Removed duplicated region for block: B:126:0x0295 A[PHI: r0
                  0x0295: PHI (r0v6 X.1B5T) = (r0v34 X.1B5T), (r0v50 X.1B5T) binds: [B:125:0x0293, B:118:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[Catch: all -> 0x0254, TryCatch #0 {all -> 0x0254, blocks: (B:11:0x003f, B:13:0x0043, B:15:0x0047, B:17:0x0052, B:22:0x0061, B:24:0x0067, B:25:0x0073, B:26:0x0079, B:28:0x007f, B:30:0x0091, B:32:0x0096, B:34:0x00a0, B:35:0x00a7), top: B:136:0x003f }] */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v4 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 766
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1B5U.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SqlDownloadCache@494c.init$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SqlDownloadCache@494c.init$1");
                }
            };
            ExecutorService executorServiceLJII = C2199681B7e.LJII();
            if (executorServiceLJII != null) {
                executorServiceLJII.execute(runnable);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
