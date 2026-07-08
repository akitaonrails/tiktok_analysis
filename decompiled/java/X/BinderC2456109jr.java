package X;

import android.os.Binder;
import androidx.browser.trusted.TrustedWebActivityService;

/* JADX INFO: renamed from: X.09jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class BinderC2456109jr extends AbstractBinderC813770Vw7 {
    public final /* synthetic */ TrustedWebActivityService LL;

    public final void LJJJZ() {
        TrustedWebActivityService trustedWebActivityService = this.LL;
        int i = trustedWebActivityService.LLILLJJLI;
        if (i != -1) {
            if (i != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        } else {
            C2204961BRm.LJJJJLL(trustedWebActivityService.getPackageManager(), Binder.getCallingUid(), new C0WZX("dTF6Tg0zW9KSV0UuUgGBdArK4mrUU7p2lQFkJiR43oD+C3Rm9zJmf2txk/RXu1CFVOY=", new String[]{"01789"}));
            this.LL.LIZJ();
            throw null;
        }
    }

    public BinderC2456109jr(TrustedWebActivityService trustedWebActivityService) {
        this.LL = trustedWebActivityService;
    }
}
