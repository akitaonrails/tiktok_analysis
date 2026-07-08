package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Hic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448680Hic {
    public static final C448680Hic LIZ = new C448680Hic();

    public static IQRCodeServiceForVisualSearch LIZ() {
        return (IQRCodeServiceForVisualSearch) PluggableExtentionKt.pluggableSpi$default(IQRCodeServiceForVisualSearch.class, false, false, false, 14, null);
    }

    public static boolean LJ(Context context, String str) {
        Object c098200Yq;
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                if (C1388190mED.LIZ(context) == null) {
                    intent.addFlags(268435456);
                }
                try {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWlfov1KYs+i4S24fwKqSJYqUXVYIB9CBae6ulQu65Ex2WF5M7ENQjo3+oDQ==", null));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                return C189200o6.m8isSuccessimpl(c098200Yq);
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static C448660Hia LIZLLL(Context context, String str, int i, String str2) {
        Object c098200Yq;
        IQRCodeServiceForVisualSearch iQRCodeServiceForVisualSearchLIZ = LIZ();
        boolean zBooleanValue = false;
        if (iQRCodeServiceForVisualSearchLIZ != null && iQRCodeServiceForVisualSearchLIZ.LJI(context, str, i, str2)) {
            return new C448660Hia();
        }
        if (u.LJJIIJZLJL(str, "aweme://challenge/detail/", true)) {
            if (SmartRouter.canOpen(str)) {
                try {
                    SmartRouter.buildRoute(context, str).open();
                    c098200Yq = Boolean.TRUE;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = bool;
                }
                zBooleanValue = ((Boolean) c098200Yq).booleanValue();
            }
            return new C448660Hia(zBooleanValue, !zBooleanValue);
        }
        IQRCodeServiceForVisualSearch iQRCodeServiceForVisualSearchLIZ2 = LIZ();
        if (iQRCodeServiceForVisualSearchLIZ2 != null && iQRCodeServiceForVisualSearchLIZ2.LJIILIIL(context, str)) {
            zBooleanValue = true;
        }
        return new C448660Hia(zBooleanValue, !zBooleanValue);
    }

    public static C448660Hia LIZJ(Context context, int i, String str, int i2, String str2) {
        IQRCodeServiceForVisualSearch iQRCodeServiceForVisualSearchLIZ = LIZ();
        boolean z = false;
        if (iQRCodeServiceForVisualSearchLIZ != null && iQRCodeServiceForVisualSearchLIZ.LJIIJ(context, str, i, str2)) {
            return new C448660Hia();
        }
        IQRCodeServiceForVisualSearch iQRCodeServiceForVisualSearchLIZ2 = LIZ();
        if (iQRCodeServiceForVisualSearchLIZ2 != null && iQRCodeServiceForVisualSearchLIZ2.LJIIL(str)) {
            if (((Boolean) C137400fk.LIZ.getValue()).booleanValue()) {
                IQRCodeServiceForVisualSearch iQRCodeServiceForVisualSearchLIZ3 = LIZ();
                if (iQRCodeServiceForVisualSearchLIZ3 != null && iQRCodeServiceForVisualSearchLIZ3.LJIILIIL(context, str)) {
                    z = true;
                }
                return new C448660Hia(z, !z);
            }
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131847127);
                c1389890mGx.LJIIJJI();
            }
            return C448670Hib.LIZ(true);
        }
        IQRCodeServiceForVisualSearch iQRCodeServiceForVisualSearchLIZ4 = LIZ();
        if (iQRCodeServiceForVisualSearchLIZ4 != null && iQRCodeServiceForVisualSearchLIZ4.LJ(context, i2, str)) {
            z = true;
        }
        return new C448660Hia(z, !z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r9, java.lang.String r10, int r11, java.lang.String r12, int r13, X.InterfaceC1364105Vn<? super X.C448660Hia> r14) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C448680Hic.LIZIZ(android.content.Context, java.lang.String, int, java.lang.String, int, X.05Vn):java.lang.Object");
    }
}
