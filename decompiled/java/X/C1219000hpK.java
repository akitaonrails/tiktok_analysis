package X;

import com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219000hpK extends C09AY implements Function0<Runnable> {
    public final /* synthetic */ MFFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219000hpK(MFFeedAssem mFFeedAssem) {
        super(0);
        this.LL = mFFeedAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Runnable invoke() {
        final MFFeedAssem mFFeedAssem = this.LL;
        return new Runnable() { // from class: X.0hpJ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MFFeedAssem@a8b8.specBindRunnable$2$1");
                try {
                    mFFeedAssem.Ho();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MFFeedAssem@a8b8.specBindRunnable$2$1");
            }
        };
    }
}
