package Y;

import X.C09JN;
import X.C0X7W;
import X.C1035880d3y;
import X.C1068720duw;
import X.C1494450ozb;
import X.C1494690ozz;
import X.C1544770qIl;
import X.C1C7U;
import android.webkit.WebView;
import com.bytedance.keva.Keva;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public class AfS0S1201100_16 implements C09JN {
    public final int $t;
    public int i3;
    public long j4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS0S1201100_16 r22, java.lang.Object r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1201100_16.accept$0(Y.AfS0S1201100_16, java.lang.Object):void");
    }

    public static final void accept$1(AfS0S1201100_16 afS0S1201100_16, Object obj) throws JSONException {
        int cronetInternalErrorCode;
        C1C7U.LIZ("AdAutofillPipoManager@24f6.getValidPiList$2$3");
        Throwable th = (Throwable) obj;
        C1068720duw.LIZ.getClass();
        C1068720duw.LJFF = true;
        boolean z = th instanceof C1494690ozz;
        String message = null;
        if (z && ((C1494690ozz) th).getStatusCode() == 400 && !C1068720duw.LJIIJ) {
            C1068720duw.LJIIJ = true;
            C1068720duw.LJIILIIL = "";
            Keva.getRepo("autofill_pipo_cert").storeString(afS0S1201100_16.s0, "");
            C1068720duw.LIZIZ(true, (WebView) afS0S1201100_16.l1, 2, (C1035880d3y) afS0S1201100_16.l2);
        } else {
            int i = C1068720duw.LJ;
            WebView webView = (WebView) afS0S1201100_16.l1;
            if (webView != null) {
                C1544770qIl.LIZ(webView, new C0X7W(i, 0));
            }
            C1068720duw.LJIILJJIL(null);
            if (!z) {
                if (th instanceof C1494450ozb) {
                    C1494450ozb c1494450ozb = (C1494450ozb) th;
                    cronetInternalErrorCode = c1494450ozb.getCronetInternalErrorCode();
                    Throwable cause = c1494450ozb.getCause();
                    if (cause != null) {
                        message = cause.getMessage();
                    }
                } else {
                    cronetInternalErrorCode = -1;
                }
            }
            C1068720duw.LJIIJJI(afS0S1201100_16.j4, afS0S1201100_16.i3, message, String.valueOf(cronetInternalErrorCode), false);
            C1C7U.LIZIZ("AdAutofillPipoManager@24f6.getValidPiList$2$3");
        }
        C1494690ozz c1494690ozz = (C1494690ozz) th;
        cronetInternalErrorCode = c1494690ozz.getStatusCode();
        Throwable cause2 = c1494690ozz.getCause();
        if (cause2 != null) {
            message = cause2.getMessage();
        }
        C1068720duw.LJIIJJI(afS0S1201100_16.j4, afS0S1201100_16.i3, message, String.valueOf(cronetInternalErrorCode), false);
        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.getValidPiList$2$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S1201100_16(int r2, long r3, android.webkit.WebView r5, X.C1035880d3y r6, java.lang.String r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            if (r8 == 0) goto L13
            r0 = r1
            r0.s0 = r7
            r0.l1 = r5
            r0.l2 = r6
            r0.i3 = r2
            r0.j4 = r3
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.s0 = r7
            r0.l1 = r5
            r0.i3 = r2
            r0.j4 = r3
            r0.l2 = r6
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1201100_16.<init>(int, long, android.webkit.WebView, X.0d3y, java.lang.String, int):void");
    }
}
