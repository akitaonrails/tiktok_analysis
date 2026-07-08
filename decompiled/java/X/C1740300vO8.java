package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vO8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740300vO8 {
    public static final C1740300vO8 LIZ = new C1740300vO8();
    public static boolean LIZIZ;
    public static String LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZLLL(android.net.Uri r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1740300vO8.LIZLLL(android.net.Uri, java.lang.String):android.net.Uri");
    }

    public static boolean LJ(String str, boolean z) {
        try {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(AnonymousClass0185.LJ(UriProtector.parse(str), "need_overlay"));
            if (numLJIIJJI != null) {
                if (numLJIIJJI.intValue() != 0) {
                    return true;
                }
            } else if (z) {
                return true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.lang.String] */
    public static boolean LJFF(Context context, String str, boolean z, boolean z2, boolean z3) {
        long jLongValue;
        if (context == null || str == 0 || a0.LJJJIL(str)) {
            return false;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = "";
        C259800zU c259800zU4 = new C259800zU();
        c259800zU4.element = "";
        C259800zU c259800zU5 = new C259800zU();
        c259800zU5.element = "";
        C259800zU c259800zU6 = new C259800zU();
        c259800zU6.element = "";
        C259800zU c259800zU7 = new C259800zU();
        c259800zU7.element = "";
        C238400w2 c238400w2 = new C238400w2();
        C259800zU c259800zU8 = new C259800zU();
        c259800zU8.element = "";
        C1740350vOD c1740350vOD = new C1740350vOD(c259800zU, c259800zU2, c259800zU3, c259800zU4, c259800zU5, c259800zU6, c259800zU7, z, z2, c238400w2, z3, c259800zU8);
        try {
            Uri uri = UriProtector.parse(str);
            C20107213lu.LIZ(uri);
            Long lLJIILIIL = C2095008Iq.LJIILIIL(AnonymousClass0185.LJ(uri, "shop_popup_init_time"));
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            c238400w2.element = System.currentTimeMillis() - jLongValue;
            SmartRouter.buildRoute(context, str).open();
            c259800zU.element = AnonymousClass0185.LJ(uri, "previous_page");
            c259800zU2.element = AnonymousClass0185.LJ(uri, "deeplink_type");
            ?? LJ = AnonymousClass0185.LJ(uri, "top_product_ids");
            c259800zU3.element = LJ;
            if (a0.LJJJIL(LJ)) {
                c259800zU3.element = AnonymousClass0185.LJ(uri, "product_id_list");
            }
            c259800zU4.element = AnonymousClass0185.LJ(uri, "creative_id");
            c259800zU5.element = AnonymousClass0185.LJ(uri, "campaign_id");
            c259800zU6.element = AnonymousClass0185.LJ(uri, "url");
            c259800zU8.element = AnonymousClass0185.LJ(uri, "mall_extra_info");
            c259800zU7.element = str;
        } catch (Throwable th) {
            th = th;
        }
        try {
            c1740350vOD.invoke(Boolean.TRUE, "");
            return true;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            c1740350vOD.invoke(Boolean.FALSE, th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(androidx.fragment.app.Fragment r29, final java.lang.String r30, boolean r31, boolean r32, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> r33, final X.InterfaceC824510WWb r34, boolean r35, X.InterfaceC1364105Vn<? super java.lang.Boolean> r36) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1740300vO8.LIZ(androidx.fragment.app.Fragment, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function2, X.0WWb, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.bytedance.router.SmartRoute r27, android.content.Context r28, java.lang.String r29, boolean r30, boolean r31, int r32, int r33, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> r34, X.C0WWR r35, boolean r36, boolean r37, X.InterfaceC1364105Vn<? super java.lang.Boolean> r38) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1740300vO8.LIZIZ(com.bytedance.router.SmartRoute, android.content.Context, java.lang.String, boolean, boolean, int, int, kotlin.jvm.functions.Function2, X.0WWR, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
