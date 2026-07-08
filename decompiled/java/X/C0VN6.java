package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0VN6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VN6 {
    public final String LIZ;
    public final Map<String, C795990VKj> LIZIZ;
    public final Set<C1180804je> LIZJ;
    public final Set<C796450VMd> LIZLLL;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C795990VKj> map = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C1180804je> set = this.LIZJ;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TableInfo{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", columns=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", foreignKeys=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", indices=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List<C0VN7> LIZIZ(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FollowStatusChangeMethod.PARAM_UID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0VN7(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        Set<C796450VMd> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VN6)) {
            return false;
        }
        C0VN6 c0vn6 = (C0VN6) obj;
        String str = this.LIZ;
        if (str != null) {
            if (!str.equals(c0vn6.LIZ)) {
                return false;
            }
        } else if (c0vn6.LIZ != null) {
            return false;
        }
        Map<String, C795990VKj> map = this.LIZIZ;
        if (map != null) {
            if (!map.equals(c0vn6.LIZIZ)) {
                return false;
            }
        } else if (c0vn6.LIZIZ != null) {
            return false;
        }
        Set<C1180804je> set2 = this.LIZJ;
        if (set2 != null) {
            if (!set2.equals(c0vn6.LIZJ)) {
                return false;
            }
        } else if (c0vn6.LIZJ != null) {
            return false;
        }
        Set<C796450VMd> set3 = this.LIZLLL;
        if (set3 == null || (set = c0vn6.LIZLLL) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public static C0VN6 LIZ(C0VLF c0vlf, String str) {
        HashSet hashSet;
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PRAGMA table_info(`");
        sbLIZ.append(str);
        sbLIZ.append("`)");
        Cursor cursorQuery = c0vlf.query(C2188811AlT.LIZIZ(sbLIZ));
        HashMap map = new HashMap();
        try {
            if (cursorQuery.getColumnCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("name");
                int columnIndex2 = cursorQuery.getColumnIndex("type");
                int columnIndex3 = cursorQuery.getColumnIndex("notnull");
                int columnIndex4 = cursorQuery.getColumnIndex("pk");
                int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    String string2 = cursorQuery.getString(columnIndex2);
                    if (cursorQuery.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    map.put(string, new C795990VKj(cursorQuery.getInt(columnIndex4), 2, string, string2, cursorQuery.getString(columnIndex5), z2));
                }
            }
            cursorQuery.close();
            HashSet hashSet2 = new HashSet();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PRAGMA foreign_key_list(`");
            sbLIZ2.append(str);
            sbLIZ2.append("`)");
            Cursor cursorQuery2 = c0vlf.query(C2188811AlT.LIZIZ(sbLIZ2));
            try {
                int columnIndex6 = cursorQuery2.getColumnIndex(FollowStatusChangeMethod.PARAM_UID);
                int columnIndex7 = cursorQuery2.getColumnIndex("seq");
                int columnIndex8 = cursorQuery2.getColumnIndex("table");
                int columnIndex9 = cursorQuery2.getColumnIndex("on_delete");
                int columnIndex10 = cursorQuery2.getColumnIndex("on_update");
                List<C0VN7> listLIZIZ = LIZIZ(cursorQuery2);
                int count = cursorQuery2.getCount();
                for (int i = 0; i < count; i++) {
                    cursorQuery2.moveToPosition(i);
                    if (cursorQuery2.getInt(columnIndex7) == 0) {
                        int i2 = cursorQuery2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (C0VN7 c0vn7 : (ArrayList) listLIZIZ) {
                            if (c0vn7.LL == i2) {
                                arrayList.add(c0vn7.LLILLL);
                                arrayList2.add(c0vn7.LLILZ);
                            }
                        }
                        hashSet2.add(new C1180804je(cursorQuery2.getString(columnIndex8), cursorQuery2.getString(columnIndex9), cursorQuery2.getString(columnIndex10), arrayList, arrayList2));
                    }
                }
                cursorQuery2.close();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("PRAGMA index_list(`");
                sbLIZ3.append(str);
                sbLIZ3.append("`)");
                cursorQuery = c0vlf.query(C2188811AlT.LIZIZ(sbLIZ3));
                try {
                    int columnIndex11 = cursorQuery.getColumnIndex("name");
                    int columnIndex12 = cursorQuery.getColumnIndex("origin");
                    int columnIndex13 = cursorQuery.getColumnIndex("unique");
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        hashSet = new HashSet();
                        while (cursorQuery.moveToNext()) {
                            if ("c".equals(cursorQuery.getString(columnIndex12))) {
                                String string3 = cursorQuery.getString(columnIndex11);
                                if (cursorQuery.getInt(columnIndex13) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C796450VMd c796450VMdLIZJ = LIZJ(c0vlf, string3, z);
                                if (c796450VMdLIZJ != null) {
                                    hashSet.add(c796450VMdLIZJ);
                                } else {
                                    cursorQuery.close();
                                    hashSet = null;
                                    break;
                                }
                            }
                        }
                        cursorQuery.close();
                    } else {
                        cursorQuery.close();
                        hashSet = null;
                        break;
                    }
                    return new C0VN6(str, map, hashSet2, hashSet);
                } finally {
                }
            } finally {
            }
        } finally {
            TryCatchGuardChecker.doCheck(th);
            cursorQuery.close();
        }
    }

    public static C796450VMd LIZJ(C0VLF c0vlf, String str, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PRAGMA index_xinfo(`");
        sbLIZ.append(str);
        sbLIZ.append("`)");
        Cursor cursorQuery = c0vlf.query(C2188811AlT.LIZIZ(sbLIZ));
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int columnIndex2 = cursorQuery.getColumnIndex("cid");
            int columnIndex3 = cursorQuery.getColumnIndex("name");
            int columnIndex4 = cursorQuery.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.getInt(columnIndex2) >= 0) {
                        int i = cursorQuery.getInt(columnIndex);
                        String string = cursorQuery.getString(columnIndex3);
                        if (cursorQuery.getInt(columnIndex4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        treeMap.put(Integer.valueOf(i), string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                C796450VMd c796450VMd = new C796450VMd(arrayList, str, arrayList2, z);
                cursorQuery.close();
                return c796450VMd;
            }
            cursorQuery.close();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorQuery.close();
            throw th;
        }
    }

    public C0VN6(String str, Map<String, C795990VKj> map, Set<C1180804je> set, Set<C796450VMd> set2) {
        Set<C796450VMd> setUnmodifiableSet;
        this.LIZ = str;
        this.LIZIZ = Collections.unmodifiableMap(map);
        this.LIZJ = Collections.unmodifiableSet(set);
        if (set2 == null) {
            setUnmodifiableSet = null;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(set2);
        }
        this.LIZLLL = setUnmodifiableSet;
    }
}
