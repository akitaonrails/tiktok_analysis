package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0U0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765260U0e {
    public final C097O LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final C0U2Y LIZJ;
    public final KaraokeViewModel LIZLLL;
    public final Function0<Long> LJ;
    public final Function0<Boolean> LJFF;
    public int LJI;
    public long LJII = -1;
    public final Boolean LJIIIIZZ = InterfaceC766480U4w.LJJLL.LIZIZ();
    public final Set<C765300U0i> LJIIIZ = new LinkedHashSet();
    public boolean LJIIJ;

    public final void LIZ(boolean z) {
        this.LJIIJ = z;
        if (z && (!this.LJIIIZ.isEmpty()) && this.LIZJ.LJIILL()) {
            C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZJ, null, new C765120Tzq(this, null), 2);
        }
    }

    public C765260U0e(C097O c097o, InterfaceC497601wk interfaceC497601wk, C0U2Y c0u2y, KaraokeViewModel karaokeViewModel, AwS556S0100000_12 awS556S0100000_12, AwS556S0100000_12 awS556S0100000_122) {
        this.LIZ = c097o;
        this.LIZIZ = interfaceC497601wk;
        this.LIZJ = c0u2y;
        this.LIZLLL = karaokeViewModel;
        this.LJ = awS556S0100000_12;
        this.LJFF = awS556S0100000_122;
    }
}
