package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0ltb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375410ltb {
    public static C1373910lrB LIZ(final C1379170lzf c1379170lzf, final InterfaceC1374230lrh interfaceC1374230lrh, String str) {
        Activity activityLJII;
        C1375400lta c1375400ltaLJJZZIII;
        Aweme aweme = c1379170lzf.LL;
        if (aweme == null || (activityLJII = C1375500ltk.LJII(c1379170lzf.LLILZIL)) == null) {
            return null;
        }
        final InterfaceC1370310llN interfaceC1370310llNLJJLIIIIJ = C621180OYa.LIZIZ.LJJLIIIIJ(activityLJII, aweme, str, "long_press", c1379170lzf.LLILLJJLI, "long_press");
        if (interfaceC1370310llNLJJLIIIIJ == null || (c1375400ltaLJJZZIII = C621180OYa.LIZIZ.LJJZZIII(str, interfaceC1370310llNLJJLIIIIJ, activityLJII)) == null) {
            return null;
        }
        return new C1373910lrB(new C1374250lrj(c1375400ltaLJJZZIII.LIZ, c1375400ltaLJJZZIII.LIZIZ, c1375400ltaLJJZZIII.LIZJ, 8), new AbstractC736370SuZ(c1379170lzf, interfaceC1370310llNLJJLIIIIJ, interfaceC1374230lrh) { // from class: X.0ltc
            public static final /* synthetic */ int LLILZLL = 0;
            public final C1379170lzf LLILZ;
            public final InterfaceC1370310llN LLILZIL;

            @Override // X.AbstractC1376810lvr
            public final void LIZIZ(View view) {
                Activity activityLJII2 = C1375500ltk.LJII(this.LLILZ.LLILZIL);
                if (activityLJII2 == null) {
                    return;
                }
                this.LLILZIL.LJJLIIIJILLIZJL(activityLJII2, this.LLILZ.LLJILJILJ);
            }

            {
                super(c1379170lzf, interfaceC1374230lrh);
                this.LLILZ = c1379170lzf;
                this.LLILZIL = interfaceC1370310llNLJJLIIIIJ;
            }
        }, true);
    }
}
