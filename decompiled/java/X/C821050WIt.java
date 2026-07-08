package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821050WIt {
    public static final C821050WIt LIZ = new C821050WIt();

    public static String LIZLLL(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("migrate");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return strLIZIZ + File.separator + "migrate_public";
    }

    public static String LIZ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("migrate_db");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return strLIZIZ + File.separator + str;
    }

    public static String LIZIZ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("migrate");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return strLIZIZ + File.separator + str;
    }

    public static String LIZJ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("migrate");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return strLIZIZ + File.separator + str;
    }
}
