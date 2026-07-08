package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS0S2000100_22;
import kotlin.jvm.internal.AwS106S1000000_22;
import kotlin.jvm.internal.AwS578S0100000_34;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190771Aod {
    public final InterfaceC2190561AoI LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C01GW LJFF;

    public final List<C2190781Aoe> LIZ() {
        Cursor cursorRawQuery;
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase readableDatabase = LIZIZ().getReadableDatabase();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select ");
            sbLIZ.append("session_id");
            sbLIZ.append(", ");
            sbLIZ.append("foreground");
            sbLIZ.append(", ");
            sbLIZ.append("timestamp");
            sbLIZ.append(", ");
            sbLIZ.append("extra_params");
            sbLIZ.append(" from ");
            sbLIZ.append("session_launch");
            sbLIZ.append(" order by id asc");
            cursorRawQuery = readableDatabase.rawQuery(C2188811AlT.LIZIZ(sbLIZ), new String[0]);
        } catch (Throwable th) {
            th = th;
        }
        while (true) {
            Throwable th2 = null;
            try {
                if (!cursorRawQuery.moveToNext()) {
                    C2107108Nh.LIZ(cursorRawQuery, null);
                    return arrayList;
                }
                String string = cursorRawQuery.getString(0);
                boolean z = cursorRawQuery.getInt(1) == 1;
                long j = cursorRawQuery.getLong(2);
                String string2 = cursorRawQuery.getString(3);
                if (string2 != null) {
                    try {
                        jSONObject = new JSONObject(string2);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
                arrayList.add(new C2190781Aoe(string, z, jSONObject, j));
            } catch (Throwable th4) {
                try {
                    TryCatchGuardChecker.doCheck(th4);
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    throw th4;
                } catch (Throwable th6) {
                    th = th6;
                    th2 = th4;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                C2107108Nh.LIZ(cursorRawQuery, th2);
                                throw th;
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                }
            }
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.LIZIZ("SessionDatabase:getAllLaunch", th, AFwS225S0000000_34.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
            return arrayList;
        }
    }

    public final C2190521AoE LIZIZ() {
        return (C2190521AoE) this.LJFF.getValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final List<C2190761Aoc> LIZJ(String str) {
        String str2;
        Cursor cursorRawQuery;
        boolean z;
        SQLiteDatabase readableDatabase = LIZIZ().getReadableDatabase();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select ");
            sbLIZ.append("session_id");
            sbLIZ.append(", ");
            sbLIZ.append("page_name");
            sbLIZ.append(", ");
            sbLIZ.append("duration");
            sbLIZ.append(", ");
            sbLIZ.append("extra_params");
            sbLIZ.append(" from ");
            sbLIZ.append("session_page");
            sbLIZ.append(" where ");
            sbLIZ.append("session_id");
            sbLIZ.append(" <> ? order by id asc");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i = 1;
            String[] strArr = new String[1];
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            strArr[0] = str2;
            cursorRawQuery = readableDatabase.rawQuery(strLIZIZ, strArr);
            while (cursorRawQuery.moveToNext()) {
                try {
                    try {
                        String string = cursorRawQuery.getString(0);
                        String string2 = cursorRawQuery.getString(i);
                        long j = cursorRawQuery.getLong(2);
                        String string3 = cursorRawQuery.getString(3);
                        Object c2190761Aoc = linkedHashMap.get(string);
                        if (c2190761Aoc == null) {
                            c2190761Aoc = new C2190761Aoc(string, new JSONArray(), new JSONObject());
                            linkedHashMap.put(string, c2190761Aoc);
                        }
                        C2190761Aoc c2190761Aoc2 = (C2190761Aoc) c2190761Aoc;
                        JSONArray jSONArray = c2190761Aoc2.LIZJ;
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(string2);
                        try {
                            jSONArray2.put(Math.max(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 1L));
                            jSONArray.put(jSONArray2);
                            c2190761Aoc2.LIZIZ += j;
                            if (string3 == null || string3.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                try {
                                    JSONObject jSONObject = new JSONObject(string3);
                                    if (jSONObject.length() > 0) {
                                        C2191771AqF.LJFF(c2190761Aoc2.LIZLLL, jSONObject);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        this.LIZ.LIZIZ("SessionDatabase:queryTerminates", th, new AwS0S2000100_22(string, string2, j, 0));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                while (true) {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        try {
                                                            C2107108Nh.LIZ(cursorRawQuery, th);
                                                            throw th;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            TryCatchGuardChecker.doCheck(th);
                                                            this.LIZ.LIZIZ("SessionDatabase:queryTerminates", th, new AwS106S1000000_22(str, 8));
                                                            return C13LP.LLIIII(linkedHashMap.values());
                                                        }
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
                                }
                            }
                            i = 1;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            }
        } catch (Throwable th10) {
            th = th10;
        }
        try {
            C2107108Nh.LIZ(cursorRawQuery, null);
        } catch (Throwable th11) {
            th = th11;
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.LIZIZ("SessionDatabase:queryTerminates", th, new AwS106S1000000_22(str, 8));
        }
        return C13LP.LLIIII(linkedHashMap.values());
    }

    public C2190771Aod(InterfaceC2190561AoI interfaceC2190561AoI, Context context, String str) {
        this.LIZ = interfaceC2190561AoI;
        this.LIZIZ = context;
        this.LIZJ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CREATE TABLE IF NOT EXISTS ");
        sbLIZ.append("session_launch");
        sbLIZ.append(" (\n        id integer primary key autoincrement, \n        ");
        sbLIZ.append("session_id");
        sbLIZ.append(" varchar(64) NOT NULL, \n        ");
        sbLIZ.append("foreground");
        sbLIZ.append(" tinyint default 0,\n        ");
        sbLIZ.append("timestamp");
        sbLIZ.append(" integer default 0,\n        ");
        sbLIZ.append("extra_params");
        sbLIZ.append(" TEXT\n        )");
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CREATE TABLE IF NOT EXISTS ");
        sbLIZ2.append("session_page");
        sbLIZ2.append(" (\n        id integer primary key autoincrement, \n        ");
        sbLIZ2.append("session_id");
        sbLIZ2.append(" varchar(64) NOT NULL, \n        ");
        sbLIZ2.append("duration");
        sbLIZ2.append(" integer default 0, \n        ");
        sbLIZ2.append("page_name");
        sbLIZ2.append(" varchar(255) NOT NULL ,\n        ");
        sbLIZ2.append("extra_params");
        sbLIZ2.append(" TEXT\n        )");
        this.LJ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LJFF = C452501pT.LIZIZ(new AwS578S0100000_34(this, 223));
    }
}
