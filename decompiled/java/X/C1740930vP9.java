package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740930vP9 {
    public static boolean LIZ(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!Intrinsics.LJFF("ec", uri.getHost())) {
                return false;
            }
            if (!Intrinsics.LJFF("/pdp", uri.getPath())) {
                return false;
            }
            return true;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    public static boolean LIZIZ(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        try {
            return LIZ(UriProtector.parse(str));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    public static boolean LIZJ(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (Intrinsics.LJFF(EnumC1154430g9B.SHOP_TAB_PDP.getValue(), AnonymousClass0185.LJ(uri, "ec_ug_page"))) {
                return true;
            }
            C1618390sDV.LIZ.getClass();
            if (C1618390sDV.LIZJ(str)) {
                return LIZIZ(AnonymousClass0185.LJ(uri, "landing_deeplink"));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return false;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }
}
