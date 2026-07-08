package X;

import Y.ACallableS71S1100000_23;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import com.bytedance.bpea.cert.token.TokenCert;

/* JADX INFO: renamed from: X.1470, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1470 implements View.OnClickListener {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (Build.VERSION.SDK_INT < 33 && C838410Wul.LIZ(this.LL, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            C19771812Xk.LIZIZ(C1388190mED.LIZ(this.LL), TokenCert.with("bpea-hybrid_webview_image_longpress_saveimages"), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new InterfaceC19772112Xn() { // from class: X.1471
                @Override // X.InterfaceC19772112Xn
                public final void LIZ(int[] iArr, String[] strArr) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        AnonymousClass1470 anonymousClass1470 = this.LIZ;
                        C15O7.LIZJ(new ACallableS71S1100000_23(anonymousClass1470.LL, anonymousClass1470.LLILLJJLI, 1)).LJ(new C2501509rB(anonymousClass1470.LL, 16), C15O7.LJIIIIZZ, null);
                    } else {
                        C786410Ut5.re(Toast.makeText(this.LIZ.LL, 2131850443, 1));
                    }
                }
            });
        } else {
            C15O7.LIZJ(new ACallableS71S1100000_23(this.LL, this.LLILLJJLI, 1)).LJ(new C2501509rB(this.LL, 16), C15O7.LJIIIIZZ, null);
        }
    }

    public AnonymousClass1470(Context context, String str) {
        this.LL = context;
        this.LLILLJJLI = str;
    }
}
