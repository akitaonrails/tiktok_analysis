package X;

import Y.ACListenerS134S0200000_32;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18Qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21282618Qm extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final SmartImageView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final C197039127h LLIZLLLIL;
    public final /* synthetic */ C21282518Ql LLJ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String L5(java.lang.String r2) {
        /*
            if (r2 == 0) goto Le
            int r0 = r2.length()
            if (r0 == 0) goto Le
            r1 = 0
        L9:
            java.lang.String r0 = "default"
            if (r1 == 0) goto L10
            return r0
        Le:
            r1 = 1
            goto L9
        L10:
            if (r2 == 0) goto L5b
            int r0 = r2.hashCode()
            switch(r0) {
                case -1935565103: goto L1a;
                case -1553624974: goto L25;
                case -1090743397: goto L30;
                case -799687047: goto L3b;
                case 2012639: goto L46;
                case 1926678836: goto L4f;
                default: goto L19;
            }
        L19:
            return r2
        L1a:
            java.lang.String r0 = "VISACARD"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L19
            java.lang.String r2 = "VISA"
            return r2
        L25:
            java.lang.String r0 = "MASTERCARD"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L19
            java.lang.String r2 = "MASTER"
            return r2
        L30:
            java.lang.String r0 = "JBCCARD"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L19
            java.lang.String r2 = "JBC"
            return r2
        L3b:
            java.lang.String r0 = "DISCOVERCARD"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L19
            java.lang.String r2 = "DISCOVER"
            return r2
        L46:
            java.lang.String r0 = "AMEX"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L58
            return r2
        L4f:
            java.lang.String r0 = "AECARD"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L58
            return r2
        L58:
            java.lang.String r2 = "AE"
            return r2
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21282618Qm.L5(java.lang.String):java.lang.String");
    }

    public final void I5(String str) {
        KeyCharacterMap keyCharacterMapLoad = KeyCharacterMap.load(-1);
        KeyEvent keyEvent = new KeyEvent(0, 67);
        for (int iIntValue = ((Number) C266550AcX.LIZ.getValue()).intValue(); iIntValue > 0; iIntValue--) {
            WebView webView = this.LLJ.LLILLL;
            if (webView != null) {
                webView.dispatchKeyEvent(keyEvent);
            }
        }
        KeyEvent[] events = keyCharacterMapLoad.getEvents(str.toCharArray());
        C21282518Ql c21282518Ql = this.LLJ;
        for (KeyEvent keyEvent2 : events) {
            WebView webView2 = c21282518Ql.LLILLL;
            if (webView2 != null) {
                webView2.dispatchKeyEvent(keyEvent2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21282618Qm(C21282518Ql c21282518Ql, View view) {
        super(view);
        this.LLJ = c21282518Ql;
        this.LL = (SmartImageView) view.findViewById(R.id.jxe);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.q4f);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.q4g);
        C786410Ut5.I7(new ACListenerS134S0200000_32(c21282518Ql, this, 24), view);
        this.LLILZ = (SmartImageView) view.findViewById(R.id.jxy);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.ddz);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.ok_);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.yearInDialog);
        this.LLIZLLLIL = (C197039127h) view.findViewById(R.id.bfe);
    }
}
