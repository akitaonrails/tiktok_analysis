package Y;

import X.C1B58;
import X.C1C7U;
import X.C2188811AlT;
import X.C2199661B7c;
import X.C2199671B7d;
import X.C2214471Bll;
import X.C786410Ut5;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ACallableS76S1100000_34 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS76S1100000_34 aCallableS76S1100000_34) {
        C1C7U.LIZ("SqlDownloadCache@494c.getDownloadInfoList$1");
        C1B58 c1b58 = (C1B58) aCallableS76S1100000_34.l1;
        String str = aCallableS76S1100000_34.s0;
        c1b58.m1();
        ArrayList arrayList = new ArrayList();
        if (C1B58.LLILZLL != null) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = C1B58.LLILZLL.rawQuery(C786410Ut5.j4("SELECT * FROM %s WHERE %s = ?", new Object[]{"downloader", "url"}), new String[]{str});
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(C2199661B7c.LJIJJ(cursorRawQuery));
                }
                C2199671B7d.LJJIII(cursorRawQuery);
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C2199671B7d.LJJIII(cursorRawQuery);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C2199671B7d.LJJIII(cursorRawQuery);
                    throw th2;
                }
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.getDownloadInfoList$1");
        return arrayList;
    }

    public static final Object call$1(ACallableS76S1100000_34 aCallableS76S1100000_34) {
        C1C7U.LIZ("SqlDownloadCache@494c.getSuccessedDownloadInfosWithMimeType$1");
        C1B58 c1b58 = (C1B58) aCallableS76S1100000_34.l1;
        String str = aCallableS76S1100000_34.s0;
        c1b58.m1();
        ArrayList arrayList = new ArrayList();
        if (C1B58.LLILZLL != null) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = C1B58.LLILZLL.rawQuery(C786410Ut5.j4("SELECT * FROM %s WHERE %s = ? AND %s = ?", new Object[]{"downloader", "mimeType", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS}), new String[]{str, String.valueOf(-3)});
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(C2199661B7c.LJIJJ(cursorRawQuery));
                }
                C2199671B7d.LJJIII(cursorRawQuery);
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C2199671B7d.LJJIII(cursorRawQuery);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C2199671B7d.LJJIII(cursorRawQuery);
                    throw th2;
                }
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.getSuccessedDownloadInfosWithMimeType$1");
        return arrayList;
    }

    public static final Object call$2(ACallableS76S1100000_34 aCallableS76S1100000_34) {
        C1C7U.LIZ("SqlDownloadCache@494c.getUnCompletedDownloadInfosWithMimeType$1");
        C1B58 c1b58 = (C1B58) aCallableS76S1100000_34.l1;
        String str = aCallableS76S1100000_34.s0;
        c1b58.m1();
        ArrayList arrayList = new ArrayList();
        if (C1B58.LLILZLL != null) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = C1B58.LLILZLL.rawQuery(C786410Ut5.j4("SELECT * FROM %s WHERE %s = ? AND %s IN (?,?,?,?,?)", new Object[]{"downloader", "mimeType", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS}), new String[]{str, String.valueOf(-1), String.valueOf(-2), String.valueOf(-7), String.valueOf(-4), String.valueOf(-5)});
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(C2199661B7c.LJIJJ(cursorRawQuery));
                }
                C2199671B7d.LJJIII(cursorRawQuery);
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C2199671B7d.LJJIII(cursorRawQuery);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C2199671B7d.LJJIII(cursorRawQuery);
                    throw th2;
                }
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.getUnCompletedDownloadInfosWithMimeType$1");
        return arrayList;
    }

    public static final Object call$3(ACallableS76S1100000_34 aCallableS76S1100000_34) {
        C1C7U.LIZ("SqlDownloadCache@494c.getDownloadInfosByFileExtension$2");
        C1B58 c1b58 = (C1B58) aCallableS76S1100000_34.l1;
        String str = aCallableS76S1100000_34.s0;
        c1b58.m1();
        ArrayList arrayList = new ArrayList();
        if (C1B58.LLILZLL != null) {
            Cursor cursorRawQuery = null;
            try {
                SQLiteDatabase sQLiteDatabase = C1B58.LLILZLL;
                String strJ4 = C786410Ut5.j4("SELECT * FROM %s WHERE %s LIKE ?", new Object[]{"downloader", "name"});
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("%");
                sbLIZ.append(str);
                cursorRawQuery = sQLiteDatabase.rawQuery(strJ4, new String[]{C2188811AlT.LIZIZ(sbLIZ)});
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(C2199661B7c.LJIJJ(cursorRawQuery));
                }
                C2199671B7d.LJJIII(cursorRawQuery);
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C2199671B7d.LJJIII(cursorRawQuery);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C2199671B7d.LJJIII(cursorRawQuery);
                    throw th2;
                }
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.getDownloadInfosByFileExtension$2");
        return arrayList;
    }

    public static final Object call$4(ACallableS76S1100000_34 aCallableS76S1100000_34) {
        Unit unit;
        C1C7U.LIZ("AdLogHelper@2831.checkAdEventsBySecureSDK$eventSender$1$onEventV3$1");
        IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
        if (iAppLogDependLIZ != null) {
            iAppLogDependLIZ.onEventV3Json(aCallableS76S1100000_34.s0, (JSONObject) aCallableS76S1100000_34.l1);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("AdLogHelper@2831.checkAdEventsBySecureSDK$eventSender$1$onEventV3$1");
        return unit;
    }

    public ACallableS76S1100000_34(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
