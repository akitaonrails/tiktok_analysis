package X;

import Y.ARunnableS4S0600000_14;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZYY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZYY extends AbstractC1335900krs {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ AwemeCardAssem LLILLJJLI;
    public final /* synthetic */ AbstractC1335900krs LLILLL;

    @Override // X.AbstractC1335900krs, X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        C2485509ob.LIZIZ(new ARunnableS4S0600000_14(this.LL, this.LLILLJJLI, this, uri, view, this.LLILLL, 1));
    }

    public C0ZYY(C869590Y9l c869590Y9l, AwemeCardAssem awemeCardAssem, AbstractC1335900krs abstractC1335900krs) {
        this.LL = c869590Y9l;
        this.LLILLJJLI = awemeCardAssem;
        this.LLILLL = abstractC1335900krs;
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        C2485509ob.LIZIZ(new ARunnableS4S0600000_14(this.LL, this.LLILLJJLI, this.LLILLL, uri, view, th, 0));
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(final Uri uri, final View view, final C428600GrK c428600GrK, final Animatable animatable) {
        final C869590Y9l c869590Y9l = this.LL;
        final AwemeCardAssem awemeCardAssem = this.LLILLJJLI;
        final AbstractC1335900krs abstractC1335900krs = this.LLILLL;
        C2485509ob.LIZIZ(new Runnable() { // from class: X.0ZYX
            public final void LIZ() {
                if (Intrinsics.LJFF(c869590Y9l.getUuid(), C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(awemeCardAssem)).getUuid())) {
                    TuxSpinner tuxSpinnerQp = awemeCardAssem.Qp();
                    if (tuxSpinnerQp != null) {
                        C786410Ut5.LLZILL(tuxSpinnerQp, 8);
                    }
                    abstractC1335900krs.Ad(uri, view, c428600GrK, animatable);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AwemeCardAssem@3383.loadThumbnail$2$onComplete$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AwemeCardAssem@3383.loadThumbnail$2$onComplete$1");
            }
        });
    }
}
