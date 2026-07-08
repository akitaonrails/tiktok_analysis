package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.Collections;

/* JADX INFO: renamed from: X.0kxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339600kxq implements InterfaceC1345780l7o, Observer<C1339660kxw> {
    public Context LL;
    public InterfaceC1339630kxt LLILLJJLI;
    public Comment LLILLL;
    public InterfaceC1339760ky6 LLILZ;
    public final C1343720l4U LLILZIL = C1343720l4U.LIZ;
    public C1339520kxi LLILZLL;

    @Override // X.InterfaceC1345780l7o
    public final void resetTranslate() {
        Comment comment = this.LLILLL;
        if (comment == null) {
            return;
        }
        this.LLILZIL.getClass();
        C1343720l4U.LIZLLL(comment);
    }

    @Override // X.InterfaceC1345780l7o
    public final void translate() {
        Comment comment = this.LLILLL;
        if (comment == null) {
            return;
        }
        C1343720l4U c1343720l4U = this.LLILZIL;
        C1339520kxi c1339520kxi = this.LLILZLL;
        c1343720l4U.getClass();
        C1343720l4U.LJFF(Collections.singletonList(comment), c1339520kxi, false);
    }

    public C1339600kxq(Context context) {
        this.LL = context;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C1339660kxw c1339660kxw) {
        Activity activityLIZ;
        C1339660kxw c1339660kxw2 = c1339660kxw;
        if (c1339660kxw2 != null && c1339660kxw2.LIZ != null && (activityLIZ = C1388190mED.LIZ(this.LL)) != null && !activityLIZ.isFinishing()) {
            Comment comment = c1339660kxw2.LIZ;
            if (c1339660kxw2.LIZLLL == 1) {
                InterfaceC1339760ky6 interfaceC1339760ky6 = this.LLILZ;
                if (interfaceC1339760ky6 != null) {
                    interfaceC1339760ky6.setLoading(true);
                    return;
                }
                return;
            }
            if (c1339660kxw2.LIZIZ) {
                InterfaceC1339760ky6 interfaceC1339760ky62 = this.LLILZ;
                if (interfaceC1339760ky62 != null) {
                    interfaceC1339760ky62.setLoading(false);
                    this.LLILZ.LIZ();
                }
                C1339520kxi c1339520kxi = this.LLILZLL;
                this.LLILLJJLI.LIZ(comment, C1342220l24.LJI(comment, comment.getText(), comment.getTextExtra(), true, this.LL), C1342220l24.LIZ(comment, null, null, this.LL), Boolean.FALSE, new C1353740lKe(c1339520kxi.LJII, c1339520kxi.LJIIIIZZ, c1339520kxi.LJ, c1339520kxi.LIZ, c1339520kxi.LIZIZ));
                return;
            }
            Exception exc = c1339660kxw2.LIZJ;
            InterfaceC1339760ky6 interfaceC1339760ky63 = this.LLILZ;
            if (interfaceC1339760ky63 != null) {
                interfaceC1339760ky63.setLoading(false);
                this.LLILZ.LIZ();
            }
            if (exc == null) {
                return;
            }
            C1354920lMY.LIZJ(this.LL, exc);
        }
    }
}
