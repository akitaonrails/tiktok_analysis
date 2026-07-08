package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.SoftReference;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.189c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212374189c {
    public static final C212374189c LIZ = new C212374189c();
    public static SoftReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LIZIZ;

    public static void LIZ(Context context, String str) {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        if (C1537060q6K.LJI(C212375189d.LIZ()) != null) {
            if (str != null && str.length() > 0) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2170608eu(str, context, null), 2);
                return;
            }
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C212373189b(context, str, null), 2);
    }

    public static boolean LIZIZ(String str, String str2) {
        try {
            Uri uri = UriProtector.parse(str);
            Uri uri2 = UriProtector.parse(str2);
            String strLIZ = C416901jj.LIZ(uri, "channel");
            String strLIZ2 = C416901jj.LIZ(uri2, "channel");
            if (strLIZ == null || strLIZ2 == null) {
                return false;
            }
            if (!Intrinsics.LJFF(strLIZ, strLIZ2)) {
                return false;
            }
            return true;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, java.lang.Boolean.TRUE) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r9, java.lang.String r10, X.InterfaceC1364105Vn r11) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212374189c.LIZJ(android.content.Context, java.lang.String, X.05Vn):java.lang.Object");
    }
}
