package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1BCC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BCC implements Runnable {
    public final Runnable LL;
    public String LLILZLL;
    public String LLIZ;
    public String LLJIJIL;
    public final List<InterfaceC1702080uOU> LLILLJJLI = new ArrayList();
    public final List<Long> LLILLL = new ArrayList();
    public EnumC21352718hJ LLILZ = EnumC21352718hJ.P3;
    public final EnumC1782990wUz LLILZIL = EnumC1782990wUz.CanDelay;
    public EnumC1781560wSg LLIZLLLIL = EnumC1781560wSg.UNKNOWN;
    public final List<C13IQ<?>> LLJ = new ArrayList();
    public long LLJI = 60000;
    public final Set<C1BCL> LLJILJIL = new LinkedHashSet();
    public final Set<String> LLJILJILJ = new LinkedHashSet();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MiloTask@fdf1.run");
        try {
            this.LL.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiloTask@fdf1.run");
    }

    public C1BCC(Runnable runnable) {
        this.LL = runnable;
    }
}
