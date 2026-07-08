package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.139l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199643139l {
    public static C199642139k LIZ(Context context, String str, String str2) {
        String strValueOf;
        C199644139m c199644139mLJIJJ = C199642139k.LJIJJ();
        c199644139mLJIJJ.LIZLLL();
        C199642139k.LJJIFFI((C199642139k) c199644139mLJIJJ.LLILLJJLI, str);
        c199644139mLJIJJ.LIZLLL();
        C199642139k.LJJII((C199642139k) c199644139mLJIJJ.LLILLJJLI);
        String packageName = context.getPackageName();
        c199644139mLJIJJ.LIZLLL();
        C199642139k.LJJ((C199642139k) c199644139mLJIJJ.LLILLJJLI, packageName);
        c199644139mLJIJJ.LIZLLL();
        C199642139k.LJJI((C199642139k) c199644139mLJIJJ.LLILLJJLI, str2);
        try {
            strValueOf = String.valueOf(C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            strValueOf = null;
        }
        if (strValueOf != null) {
            c199644139mLJIJJ.LIZLLL();
            C199642139k.LJIL((C199642139k) c199644139mLJIJJ.LLILLJJLI, strValueOf);
        }
        return (C199642139k) c199644139mLJIJJ.LIZIZ();
    }
}
