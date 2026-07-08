package X;

import com.ss.android.ugc.aweme.main.PerformanceOptAssem;
import com.ss.android.ugc.aweme.main.PerformanceOptAssem.IdleTask;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CFX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFX extends C09AY implements Function0<C15O7<Object>> {
    public final /* synthetic */ PerformanceOptAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CFX(PerformanceOptAssem performanceOptAssem) {
        super(0);
        this.LL = performanceOptAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C15O7<Object> invoke() {
        C15O7<Void> c15o7LJIIIIZZ = C15O7.LJIIIIZZ(800L);
        final PerformanceOptAssem performanceOptAssem = this.LL;
        return c15o7LJIIIIZZ.LJII(new InterfaceC2385309Wh() { // from class: X.09SK
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("PerformanceOptAssem@fe29.callLazyDoIt$replace$1$1");
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(performanceOptAssem.new IdleTask());
                c799890VZj.LIZIZ();
                C1C7U.LIZIZ("PerformanceOptAssem@fe29.callLazyDoIt$replace$1$1");
                return null;
            }
        }, C823050WQl.LIZIZ());
    }
}
