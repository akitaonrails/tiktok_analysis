package X;

import android.os.Handler;
import android.widget.TextSwitcher;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.1177, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1177 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final TextSwitcher LIZ;
    public String LIZIZ;
    public long LIZJ;
    public List<String> LIZLLL;
    public int LJ;
    public final AtomicInteger LJFF = new AtomicInteger(-2);
    public final C01GW LJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(601));
    public final List<AnonymousClass1178> LJII = new ArrayList();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1101));

    public AnonymousClass1177(TextSwitcher textSwitcher) {
        this.LIZ = textSwitcher;
    }

    public static void LIZ(AnonymousClass1177 anonymousClass1177) {
        long j = anonymousClass1177.LIZJ;
        List<String> list = anonymousClass1177.LIZLLL;
        if (list != null && list.size() > 1) {
            ((Handler) anonymousClass1177.LJI.getValue()).removeCallbacks((Runnable) anonymousClass1177.LJIIIIZZ.getValue());
            if (j < 0) {
                j = 0;
            }
            C786410Ut5.LJLIIL(j, (Handler) anonymousClass1177.LJI.getValue(), (Runnable) anonymousClass1177.LJIIIIZZ.getValue());
        }
    }

    public final void LIZIZ(int i, boolean z) {
        List<String> list = this.LIZLLL;
        if (list != null && !list.isEmpty()) {
            this.LJ = i;
            if (i < 0 || i >= list.size()) {
                this.LJ = 0;
            }
            String str = (String) ListProtector.get(list, this.LJ);
            this.LIZIZ = str;
            if (z) {
                this.LIZ.setText(str);
            } else {
                this.LIZ.setCurrentText(str);
            }
            Iterator it2 = ((ArrayList) this.LJII).iterator();
            while (it2.hasNext()) {
                ((AnonymousClass1178) it2.next()).LIZ(this.LJ);
            }
        }
    }
}
