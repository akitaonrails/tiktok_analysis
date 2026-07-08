package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906780zie {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw new X.C1954807lC();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0016, B:11:0x001b, B:13:0x0022, B:15:0x0028, B:17:0x0033, B:31:0x0064, B:33:0x0069, B:20:0x003f, B:22:0x0043, B:24:0x0050, B:27:0x0057, B:29:0x005b, B:34:0x006c, B:35:0x0071, B:7:0x0011), top: B:40:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            X.0mCc[] r5 = X.C1906580ziK.LJII()     // Catch: java.lang.Throwable -> L73
            int r2 = r5.length     // Catch: java.lang.Throwable -> L73
            r1 = 0
        L6:
            if (r1 >= r2) goto L72
            r0 = r5[r1]     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.LIZ     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0 instanceof X.InterfaceC1711206n0     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L11
            goto L14
        L11:
            int r1 = r1 + 1
            goto L6
        L14:
            if (r1 < 0) goto L72
            int r0 = r5.length     // Catch: java.lang.Throwable -> L73
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L72
            int r0 = r5.length     // Catch: java.lang.Throwable -> L73
            int r4 = r0 + (-1)
            int r3 = r1 + 1
            if (r3 > r4) goto L77
        L22:
            r2 = r5[r4]     // Catch: java.lang.Throwable -> L73
            boolean r0 = r2 instanceof X.C1397950mTx     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L3f
            r0 = r2
            X.0mTx r0 = (X.C1397950mTx) r0     // Catch: java.lang.Throwable -> L73
            android.app.Activity r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L67
            r0 = r2
            X.0mTx r0 = (X.C1397950mTx) r0     // Catch: java.lang.Throwable -> L73
            android.app.Activity r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isDestroyed()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L64
            goto L67
        L3f:
            boolean r0 = r2 instanceof X.C1844400y62     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L57
            r0 = r2
            X.0y62 r0 = (X.C1844400y62) r0     // Catch: java.lang.Throwable -> L73
            F extends androidx.fragment.app.Fragment & X.198i r1 = r0.LIZLLL     // Catch: java.lang.Throwable -> L73
            X.198i r1 = (X.InterfaceC214902198i) r1     // Catch: java.lang.Throwable -> L73
            boolean r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIZILJ(r1)     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L67
            boolean r0 = r1.SL()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L64
            goto L67
        L57:
            boolean r0 = r2 instanceof X.C198S     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L6c
            r0 = r2
            X.198S r0 = (X.C198S) r0     // Catch: java.lang.Throwable -> L73
            com.bytedance.scene.Scene r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.mViewDestroyed     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L67
        L64:
            r2.LIZ()     // Catch: java.lang.Throwable -> L73
        L67:
            if (r4 == r3) goto L77
            int r4 = r4 + (-1)
            goto L22
        L6c:
            X.07lC r0 = new X.07lC     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L73
        L72:
            return
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1906780zie.LIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.explore.ExploreLynxParams LIZLLL(android.net.Uri r18) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1906780zie.LIZLLL(android.net.Uri):com.ss.android.ugc.aweme.explore.ExploreLynxParams");
    }

    public static Map LJ(String str) {
        String string;
        Object c098200Yq;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null) {
            if (!(!a0.LJJJIL(string))) {
                string = null;
            }
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    C13DA c13da = new C13DA();
                    LJFF(jSONObject, "enter_method", c13da);
                    LJFF(jSONObject, "sub_enter_method", c13da);
                    LJFF(jSONObject, "special_shaped_card_trigger_type", c13da);
                    LJFF(jSONObject, "request_id", c13da);
                    LJFF(jSONObject, "group_id", c13da);
                    c098200Yq = c13da.build();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = C2097608Jq.LJ();
                }
                return (Map) c098200Yq;
            }
        }
        return C2097608Jq.LJ();
    }

    public static boolean LIZJ(Uri uri, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return false;
        }
        if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1") && !u.LJIJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "true", true) && !u.LJIJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "yes", true)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r4
      0x0015: PHI (r4v6 android.content.Context) = (r4v2 android.content.Context), (r4v0 android.content.Context) binds: [B:9:0x0013, B:4:0x0005] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[PHI: r3
      0x001c: PHI (r3v1 android.content.Context) = (r3v0 android.content.Context), (r3v3 android.content.Context) binds: [B:9:0x0013, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r4, com.ss.android.ugc.aweme.explore.ExploreLynxParams r5, java.lang.String r6) {
        /*
            boolean r0 = r4 instanceof android.app.Activity
            r3 = 0
            if (r0 == 0) goto L7
            if (r4 != 0) goto L15
        L7:
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L26
            android.app.Activity r4 = r0.LIZIZ()
        L11:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L1c
        L15:
            r3 = r4
            if (r4 == 0) goto L1c
        L18:
            LIZ()
            goto L28
        L1c:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r4 = X.C844470XAv.LIZ()
            goto L18
        L26:
            r4 = r3
            goto L11
        L28:
            java.lang.String r0 = "//main"
            com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r4, r0)     // Catch: java.lang.Throwable -> L6d
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.addFlags(r0)     // Catch: java.lang.Throwable -> L6d
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "saf_main_intent_target"
            java.lang.String r0 = "saf_home_target"
            r2.withParam(r1, r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
            java.lang.String r0 = "homepage_explore"
            r2.withParam(r1, r0)     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L4d
            java.lang.String r0 = "explore_lynx_params"
            r2.withParam(r0, r5)     // Catch: java.lang.Throwable -> L6d
        L4d:
            r2.open()     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "switch to explore via SmartRouter(//main), schema="
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            r1.append(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = ", ctxIsActivity="
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L65
            r0 = 1
            goto L66
        L65:
            r0 = 0
        L66:
            r1.append(r0)     // Catch: java.lang.Throwable -> L6d
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6d
            return
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1906780zie.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.explore.ExploreLynxParams, java.lang.String):void");
    }

    public static final void LJFF(JSONObject jSONObject, String str, C13DA c13da) {
        String strOptString = jSONObject.optString(str, "");
        if ((!a0.LJJJIL(strOptString)) && strOptString != null) {
            c13da.put(str, strOptString);
        }
    }
}
