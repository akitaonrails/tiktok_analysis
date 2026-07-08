package X;

import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Vag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800480Vag {
    public static C800490Vah LIZ;
    public static ExecutorService LIZIZ;

    public static void LIZ(final String str, final String str2, final WebView webView, final boolean z, final Throwable th, final String str3) {
        Object c098200Yq;
        final EnumC800520Vak enumC800520Vak;
        C800490Vah c800490Vah = LIZ;
        if (c800490Vah == null || !c800490Vah.LIZ || webView == null) {
            return;
        }
        try {
            Object tag = webView.getTag(R.id.web_client_view_status);
            c098200Yq = null;
            if (tag instanceof EnumC800520Vak) {
                enumC800520Vak = (EnumC800520Vak) tag;
            } else {
                enumC800520Vak = null;
            }
            final C805400Vic c805400VicLIZIZ = C295401Cm.LIZIZ(webView.getUrl());
            final C443120HZe c443120HZeLIZIZ = C2348209Ia.LIZIZ(webView);
            if (LIZIZ == null) {
                C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
                c2123408To.LIZJ = 1;
                c2123408To.LIZIZ = "hybrid_security_monitor_jsGuard";
                LIZIZ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
            }
            ExecutorService executorService = LIZIZ;
            if (executorService != null) {
                executorService.execute(new Runnable() { // from class: X.0Vae
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[PHI: r2
                      0x0064: PHI (r2v7 java.lang.Object) = (r2v1 java.lang.Object), (r2v8 java.lang.Object) binds: [B:13:0x0062, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[PHI: r2
                      0x006a: PHI (r2v6 java.lang.Object) = (r2v1 java.lang.Object), (r2v7 java.lang.Object) binds: [B:13:0x0062, B:15:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() throws org.json.JSONException {
                        /*
                            r12 = this;
                            java.lang.String r11 = r1
                            java.lang.String r10 = r2
                            boolean r1 = r3
                            X.0Vic r9 = r4
                            java.lang.String r2 = r5
                            android.webkit.WebView r6 = r6
                            X.0HZe r7 = r7
                            X.0Vak r5 = r8
                            java.lang.Throwable r4 = r9
                            java.lang.String r8 = "JSInjectionMonitor@1785.reportInjectJs$1L"
                            X.C1C7U.LIZ(r8)
                            org.json.JSONObject r3 = new org.json.JSONObject
                            r3.<init>()
                            java.lang.String r0 = "injectMethod"
                            r3.put(r0, r11)
                            java.lang.String r0 = "injectName"
                            r3.put(r0, r10)
                            java.lang.String r0 = "blocked"
                            r3.put(r0, r1)
                            if (r9 == 0) goto L3c
                            java.lang.String r1 = "url"
                            java.lang.String r0 = r9.LIZIZ
                            r3.put(r1, r0)
                            java.lang.String r1 = "path"
                            java.lang.String r0 = r9.LJFF
                            r3.put(r1, r0)
                        L3c:
                            java.lang.String r0 = "script"
                            r3.put(r0, r2)
                            java.lang.Class r0 = r6.getClass()
                            java.lang.String r1 = r0.getCanonicalName()
                            if (r1 != 0) goto L53
                            java.lang.Class r0 = r6.getClass()
                            java.lang.String r1 = r0.getName()
                        L53:
                            java.lang.String r0 = "relativeView"
                            r3.put(r0, r1)
                            if (r7 == 0) goto L60
                            java.lang.Object r2 = r7.getFirst()
                            if (r2 != 0) goto L64
                        L60:
                            java.lang.String r2 = "Activity"
                            if (r7 == 0) goto L6a
                        L64:
                            java.lang.Object r1 = r7.getSecond()
                            if (r1 != 0) goto L6e
                        L6a:
                            java.lang.String r1 = X.C2348209Ia.LIZ(r6)
                        L6e:
                            java.lang.String r0 = "containerName"
                            r3.put(r0, r1)
                            java.lang.String r0 = "containerType"
                            r3.put(r0, r2)
                            r0 = 2131400635(0x7f0a97bb, float:1.842213E38)
                            java.lang.Object r2 = r6.getTag(r0)
                            boolean r0 = r2 instanceof X.C800470Vaf
                            r1 = 0
                            if (r0 == 0) goto L8a
                            X.0Vaf r2 = (X.C800470Vaf) r2
                            if (r2 == 0) goto L8a
                            java.lang.String r1 = r2.LIZ
                        L8a:
                            r2 = 0
                            if (r1 != 0) goto L91
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                        L91:
                            java.lang.String r0 = "dataflowId"
                            r3.put(r0, r1)
                            if (r5 == 0) goto L9e
                            java.lang.String r1 = r5.getValue()
                            if (r1 != 0) goto La4
                        L9e:
                            X.0Vak r0 = X.EnumC800520Vak.PAGE_INIT
                            java.lang.String r1 = r0.getValue()
                        La4:
                            java.lang.String r0 = "injectTiming"
                            r3.put(r0, r1)
                            X.0VaY r0 = new X.0VaY
                            r0.<init>()
                            X.C800380VaW.LIZ(r0, r3)
                            if (r4 == 0) goto Lbc
                            java.lang.String r1 = X.C2348209Ia.LIZJ(r4, r2)
                            java.lang.String r0 = "callingPoint"
                            r3.put(r0, r1)
                        Lbc:
                            java.lang.String r0 = "hybrid_security_monitor_jsGuard"
                            X.C0VZK.LIZJ(r0, r3)
                            X.C1C7U.LIZIZ(r8)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC800460Vae.run():void");
                    }
                });
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0VZK.LIZ(thM5exceptionOrNullimpl, "reportInjectJs_error", C2097608Jq.LJIIJ(new Pair("message", "reportInjectJs_error")));
        }
    }
}
