package X;

import Y.ARunnableS9S1300000_9;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0OdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623670OdB {
    public UrlModel LIZ;
    public InterfaceC1334290kpH LIZIZ;
    public C1331730kl9 LJ;
    public Bitmap.Config LJFF;
    public boolean LJI;
    public boolean LJII;
    public long LJIIIZ;
    public String LIZJ = "bulletin_default";
    public EnumC1334360kpO LIZLLL = EnumC1334360kpO.MEDIUM;
    public String LJIIIIZZ = "";

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        InterfaceC1334290kpH interfaceC1334290kpH;
        List<String> urlList;
        String str;
        UrlModel urlModel = this.LIZ;
        if (urlModel == null || (interfaceC1334290kpH = this.LIZIZ) == 0 || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
            return;
        }
        C1334040kos c1334040kos = C1334040kos.LIZ;
        c1334040kos.getClass();
        this.LJIIIIZZ = C1334040kos.LIZLLL(str);
        this.LJIIIZ = System.currentTimeMillis();
        if (interfaceC1334290kpH instanceof View) {
            ExecutorService executorService = C623720OdG.LIZ;
            ((View) interfaceC1334290kpH).setTag(1897549899, str);
        }
        if (!this.LJII) {
            C623720OdG.LIZ.execute(new ARunnableS9S1300000_9(new WeakReference(interfaceC1334290kpH), urlModel, this, str, 9));
            return;
        }
        ExecutorService executorService2 = C623720OdG.LIZ;
        EnumC1334360kpO enumC1334360kpO = this.LIZLLL;
        C1331730kl9 c1331730kl9 = this.LJ;
        Bitmap.Config config = this.LJFF;
        boolean z = this.LJI;
        String str2 = this.LIZJ;
        String str3 = this.LJIIIIZZ;
        long j = this.LJIIIZ;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJJ(interfaceC1334290kpH);
        c1331670kl3LJIIIIZZ.LJJIII = enumC1334360kpO;
        c1331670kl3LJIIIIZZ.LJJJIL = C1334040kos.LIZJ(c1334040kos, str2, str3, j, 2);
        if (c1331730kl9 != null) {
            c1331670kl3LJIIIIZZ.LJJI = c1331730kl9;
        }
        if (config != null) {
            c1331670kl3LJIIIIZZ.LJIL = config;
        }
        if (z) {
            c1331670kl3LJIIIIZZ.LIZLLL = true;
        }
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }
}
