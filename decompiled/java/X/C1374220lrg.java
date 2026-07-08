package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0lrg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374220lrg extends AbstractC736370SuZ {
    public final InterfaceC1370310llN LLILZ;
    public final C1374200lre LLILZIL;
    public final InterfaceC1374230lrh LLILZLL;

    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        Context context;
        InterfaceC1374230lrh interfaceC1374230lrh = this.LLILZLL;
        if (interfaceC1374230lrh != null && (context = interfaceC1374230lrh.getContext()) != null) {
            this.LLILZLL.dismiss();
            C1374200lre c1374200lre = this.LLILZIL;
            c1374200lre.LLILZ = true;
            this.LLILZ.LJIILIIL(context, c1374200lre.LL);
        }
    }

    public C1374220lrg(InterfaceC1374230lrh interfaceC1374230lrh, C1374200lre c1374200lre, InterfaceC1370310llN interfaceC1370310llN) {
        super(c1374200lre, interfaceC1374230lrh);
        this.LLILZ = interfaceC1370310llN;
        this.LLILZIL = c1374200lre;
        this.LLILZLL = interfaceC1374230lrh;
    }
}
