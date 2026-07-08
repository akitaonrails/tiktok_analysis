package X;

import android.content.Context;
import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;
import java.io.File;
import java.io.IOException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJ0 implements InterfaceC821090WIx {
    @Override // X.InterfaceC821090WIx
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC821090WIx
    public final String LIZJ() {
        return "draft_db.json";
    }

    @Override // X.InterfaceC821090WIx
    public final String LIZ(Context context, C821110WIz c821110WIz) {
        C821050WIt c821050WIt = C821050WIt.LIZ;
        String str = c821110WIz.LIZ;
        c821050WIt.getClass();
        String strLIZ = C821050WIt.LIZ(context, str);
        try {
            C0VSJ c0vsj = new C0VSJ(strLIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return strLIZ + File.separator + "draft_db.json";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // X.InterfaceC821090WIx
    public final Object LIZLLL(Context context, C821110WIz c821110WIz, InterfaceC1364105Vn<? super C821100WIy> interfaceC1364105Vn) {
        Object c098200Yq;
        int i;
        boolean z;
        Long second;
        String strLIZ = LIZ(context, c821110WIz);
        C0WJA c0wja = C0WJA.LIZ;
        String str = c821110WIz.LIZ;
        long j = c821110WIz.LIZIZ;
        String str2 = c821110WIz.LIZJ;
        c0wja.getClass();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!Intrinsics.LJFF(str2, C0CHQ.LIZ().getAccountService().getCurrentUserID())) {
            return new C821100WIy(C0WJ1.FAILED_BY_UID, "uid not match");
        }
        ?? r4 = 0;
        Cursor cursorQuery = SQLiteHelper.getInstance().getReadableDatabase().query("local_draft", null, "video_path = ?", new String[]{str}, null, null, null);
        try {
        } catch (Throwable th2) {
            th = th2;
            r4 = 0;
        }
        if (cursorQuery.moveToFirst()) {
            try {
                C0VSJ c0vsj = new C0VSJ(strLIZ);
                File parentFile = c0vsj.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("can't create: ");
                    sbLIZ.append(parentFile.getAbsolutePath());
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
                C0VSV c0vsv = new C0VSV(c0vsj);
                try {
                    JSONObject jSONObject = new JSONObject();
                    int columnCount = cursorQuery.getColumnCount();
                    int i2 = 0;
                    while (i2 < columnCount) {
                        try {
                            String columnName = cursorQuery.getColumnName(i2);
                            if (Intrinsics.LJFF(columnName, "draft_extras")) {
                                long jOptLong = new JSONObject(cursorQuery.getString(i2)).optLong("save_draft_app_version");
                                C01GW c01gw = C108900b9.LIZ;
                                if (((String) c01gw.getValue()).length() > 0 && a0.LJJIIZI((String) c01gw.getValue(), ",", r4)) {
                                    synchronized (C108900b9.class) {
                                        i = C108900b9.LIZIZ;
                                        C108900b9.LIZIZ = i + 1;
                                    }
                                    if (i % 2 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    Pair<Long, Long> pairLIZ = C108900b9.LIZ();
                                    if (pairLIZ != null) {
                                        if (!z) {
                                            second = pairLIZ.getSecond();
                                        } else {
                                            second = pairLIZ.getFirst();
                                        }
                                        long jLongValue = second.longValue();
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("version mock success, ");
                                        sbLIZ2.append(str);
                                        sbLIZ2.append(" ,writeDBDataToFile mock saveDraftAppVersion ");
                                        sbLIZ2.append(jLongValue);
                                        sbLIZ2.append(", originalVersion ");
                                        sbLIZ2.append(jOptLong);
                                        C0WJO.LIZ("transfer", C2188811AlT.LIZIZ(sbLIZ2));
                                        jOptLong = jLongValue;
                                    }
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(str);
                                sbLIZ3.append(" ,callVersion ");
                                sbLIZ3.append(j);
                                sbLIZ3.append(", saveDraftAppVersion ");
                                sbLIZ3.append(jOptLong);
                                C0WJO.LIZ("transfer", C2188811AlT.LIZIZ(sbLIZ3));
                                if (j < jOptLong) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(str);
                                    sbLIZ4.append(" , FAILED_BY_VERSION");
                                    C0WJO.LIZ("transfer", C2188811AlT.LIZIZ(sbLIZ4));
                                    C0WJ1 c0wj1 = C0WJ1.FAILED_BY_VERSION;
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("saveDraftAppVersion = ");
                                    sbLIZ5.append(jOptLong);
                                    sbLIZ5.append(", callVersion = ");
                                    sbLIZ5.append(j);
                                    C821100WIy c821100WIy = new C821100WIy(c0wj1, C2188811AlT.LIZIZ(sbLIZ5));
                                    C2107108Nh.LIZ(c0vsv, null);
                                    C2107108Nh.LIZ(cursorQuery, null);
                                    return c821100WIy;
                                }
                            }
                            int type = cursorQuery.getType(i2);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                c0vsv.write(cursorQuery.getBlob(i2));
                                                jSONObject.put(columnName, "BLOB data written to file");
                                            }
                                        } else {
                                            jSONObject.put(columnName, cursorQuery.getString(i2));
                                        }
                                    } else {
                                        jSONObject.put(columnName, Float.valueOf(cursorQuery.getFloat(i2)));
                                    }
                                } else {
                                    jSONObject.put(columnName, cursorQuery.getLong(i2));
                                }
                            } else {
                                jSONObject.put(columnName, JSONObject.NULL);
                            }
                            i2++;
                            r4 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    c0vsv.write(C786410Ut5.J3(jSONObject).getBytes(Charsets.UTF_8));
                    C2107108Nh.LIZ(c0vsv, null);
                    c098200Yq = new C821100WIy(C0WJ1.SUCCESS, "");
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c0vsv, th);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsv, th);
                        throw th;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                r4 = 0;
            }
            try {
                TryCatchGuardChecker.doCheck(th);
                try {
                    throw th;
                } catch (Throwable th8) {
                    th = th8;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(cursorQuery, th);
                            throw th;
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                th = r4;
            }
        } else {
            c098200Yq = new C821100WIy(C0WJ1.NOT_EXIST, "draft not exist");
        }
        C2107108Nh.LIZ(cursorQuery, null);
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            return new C821100WIy(C0WJ1.FAILED, String.valueOf(thM5exceptionOrNullimpl.getMessage()));
        }
        return c098200Yq;
    }
}
